package com.heizi.zsm.block.my;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.heizi.mycommon.adapter.CommonAdapter;
import com.heizi.mycommon.adapter.ViewHolderHelper;
import com.heizi.mylibrary.callback.IResponseCallback;
import com.heizi.mylibrary.model.DataSourceModel;
import com.heizi.mylibrary.model.ErrorModel;
import com.heizi.mylibrary.retrofit2.ParseListProtocol;
import com.heizi.zsm.R;
import com.heizi.zsm.activity.BaseListActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by leo on 17/9/26.
 */

public class ActivityGivePointList extends BaseListActivity {

    CommonAdapter adapter;
    List<ModelRecord> listData = new ArrayList<>();
    LinearLayout ll_notice;
    ParseListProtocol<ModelRecord> parseListProtocol;
    IResponseCallback<DataSourceModel<ModelRecord>> callback;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_list;
    }

    @Override
    protected void initView() {
        super.initView();
        tv_title.setText("转赠记录");
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ll_notice = (LinearLayout) findViewById(R.id.ll_notice);
        //listview
        adapter = new CommonAdapter(this, listData, R.layout.item_point) {
            @Override
            public void getView(int position, ViewHolderHelper holder) {
                TextView tv_name = holder.findViewById(R.id.tv_name);
                TextView tv_time = holder.findViewById(R.id.tv_time);
                TextView tv_type = holder.findViewById(R.id.tv_type);
                TextView tv_point = holder.findViewById(R.id.tv_point);

                tv_name.setText(listData.get(position).getTransaction_name());
                tv_time.setText(listData.get(position).getCreate_time());
                tv_point.setText(listData.get(position).getNum());
                if (listData.get(position).getNum().contains("+")) {
                    tv_point.setTextColor(getResources().getColor(R.color.red));
                } else {
                    tv_point.setTextColor(getResources().getColor(R.color.green1));
                }

                tv_type.setText(listData.get(position).getType());
            }
        };
        mListView.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        super.initData();
        parseListProtocol = new ParseListProtocol<>(this, SERVER_URL_NEW + MY_POINTS, ModelRecord.class);
        callback = new IResponseCallback<DataSourceModel<ModelRecord>>() {
            @Override
            public void onSuccess(DataSourceModel<ModelRecord> data) {
                if (!isFinishing()) {
                    isBusy = false;
                    mDialog.hideDialog();
                    //先判断是否是刷新,刷新成功则清除数据
                    if (isRefresh) {
                        pageIndex = 1;
                        listData.removeAll(listData);
                    }
                    if (data.list.size() > 0) {
                        listData.addAll(data.list);
                        adapter.notifyDataSetChanged();
                        //数据小于请求的每页数据
                        if (data.list.size() < pageSize) {
                            mListView.setPullLoadEnable(false);
                        }
                    } else {
                        mListView.setPullLoadEnable(false);
                    }

                    if (listData.size() == 0) {
                        ll_notice.setVisibility(View.VISIBLE);
                    } else {
                        ll_notice.setVisibility(View.GONE);
                    }
                    isRefresh = false;
                    onLoad();
                }

            }

            @Override
            public void onFailure(ErrorModel errorModel) {
                if (!isFinishing()) {
                    isBusy = false;
                    isRefresh = false;
                    onLoad();
                    mDialog.hideDialog();
                }
            }

            @Override
            public void onStart() {
                isBusy = true;
                mDialog.showDialog();
            }
        };

        if (listData.size() == 0)
            getData();
    }

    @Override
    protected void getData() {
        super.getData();
        Map<String, String> map = new HashMap<>();
        map.put("token", userModel.getToken());
        map.put("p", pageIndex + "");
        map.put("pagesize", pageSize + "");
        map.put("type", 1 + "");
        parseListProtocol.postData(map, callback);
    }


}
