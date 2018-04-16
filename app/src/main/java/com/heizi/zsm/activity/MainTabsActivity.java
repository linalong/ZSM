package com.heizi.zsm.activity;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;

import com.heizi.mycommon.utils.Utils;
import com.heizi.mycommon.utils.WebViewUtil;
import com.heizi.zsm.Constants;
import com.heizi.zsm.MyApplication;
import com.heizi.zsm.R;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.InjectView;


public class MainTabsActivity extends BaseActivity implements
        Constants {

    private static MainTabsActivity instance;
    private long time;

    @InjectView(R.id.webview)
    WebView webView;

    WebViewUtil webViewUtil;
    IWXAPI msgApi = null;


    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        msgApi = WXAPIFactory.createWXAPI(this, null);
    }

    public static MainTabsActivity getInstance() {
        return instance;
    }

    @Override
    protected void initView() {
        super.initView();

        webViewUtil = new WebViewUtil(this);
        webViewUtil.setView(webView, new WebAppInterface());
        webView.loadUrl(HOME);

        registerBoradcastReceiver();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void changeToMain() {

    }

    public void changeToMy() {

    }


    // 得到广播
    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(MyApplication.action_token_error)) {
                Utils.toastShow(MainTabsActivity.this, "登录过期，请重新登录!");
                MyApplication.getInstance().logout();
                Intent intent1 = new Intent();
                intent1.setClass(MainTabsActivity.this, MainTabsActivity.class);
                startActivity(intent1);
                MainTabsActivity.getInstance().changeToMain();
            }
            // 刷新底部五个按钮的显示数量
            else if (action.equals(MyApplication.action_refresh_login)) {
            }
        }
    };

    // 注册广播 接收未登录状态 底部按钮刷新
    private void registerBoradcastReceiver() {
        IntentFilter myIntentFilter = new IntentFilter();
        myIntentFilter.addAction(MyApplication.action_token_error);
        myIntentFilter.addAction(MyApplication.action_refresh_login);
        registerReceiver(mBroadcastReceiver, myIntentFilter);
    }

    @Override
    public void onBackPressed() {
        // 是WebViewFragment有回退功能
        if (System.currentTimeMillis() - time > 2500) {
            Toast.makeText(this, getString(R.string.string_exit),
                    Toast.LENGTH_SHORT).show();
            time = System.currentTimeMillis();
        } else {
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mBroadcastReceiver);
        UMShareAPI.get(this).release();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }

    /**
     * 自定义的Android代码和JavaScript代码之间的桥梁类
     */
    public class WebAppInterface {
        Context mContext;

        /**
         * Instantiate the interface and set the context
         */
        WebAppInterface() {
        }

        /**
         * 注销登陆
         */
        @JavascriptInterface
        public void logOut() {
            application.logout();
        }

        /**
         * 支付宝支付
         *
         * @param orderStr
         */
        @JavascriptInterface
        public void jumpToAliPay(String orderStr) {

        }

        /**
         * 微信支付
         *
         * @param appid
         * @param partnerid
         * @param prepayid
         * @param nonceStrtimeStamp
         * @param sign
         */
        @JavascriptInterface
        public void jumpToWechatPay(String appid, String partnerid,
                                    String prepayid, String nonceStrtimeStamp,
                                    String sign) {

        }

        /**
         * 分享
         */
        @JavascriptInterface
        public void share() {
            new ShareAction(MainTabsActivity.this)
                    .withText("hello")
                    .withMedia(new UMImage(MainTabsActivity.this, BitmapFactory.decodeResource(getResources(), R.mipmap.app_logo)))
                    .setDisplayList(SHARE_MEDIA.WEIXIN, SHARE_MEDIA.WEIXIN_CIRCLE)
                    .setCallback(new UMShareListener() {
                        @Override
                        public void onStart(SHARE_MEDIA share_media) {

                        }

                        @Override
                        public void onResult(SHARE_MEDIA share_media) {
                            Toast.makeText(MainTabsActivity.this, "成功了", Toast.LENGTH_LONG).show();
                        }

                        @Override
                        public void onError(SHARE_MEDIA share_media, Throwable throwable) {
                            Toast.makeText(MainTabsActivity.this, "失败" + throwable.getMessage(), Toast.LENGTH_LONG).show();
                        }

                        @Override
                        public void onCancel(SHARE_MEDIA share_media) {
                            Toast.makeText(MainTabsActivity.this, "取消了", Toast.LENGTH_LONG).show();
                        }
                    })
                    .open();
        }


        @JavascriptInterface
        public void phone(String phone) {

            if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phone));
                mContext.startActivity(intent);
                return;
            }
        }


    }


    /**
     * 调用微信支付
     *
     * @param payInfo
     */
    public void payWeixin(final String payInfo) {
        try {
            JSONObject jsonObject = new JSONObject(payInfo);
            PayReq request = new PayReq();
            request.appId = jsonObject.getString("appid");
            request.partnerId = jsonObject.getString("partnerid");
            request.prepayId = jsonObject.getString("prepayid");
            request.packageValue = jsonObject.getString("package");
            request.nonceStr = jsonObject.getString("noncestr");
            request.timeStamp = jsonObject.getString("timestamp");
            request.sign = jsonObject.getString("sign");
            if (msgApi != null)
                msgApi.registerApp(request.appId);
            msgApi.sendReq(request);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}
