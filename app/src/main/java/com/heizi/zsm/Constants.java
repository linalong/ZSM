package com.heizi.zsm;

import android.os.Environment;

/**
 * 常量、接口等存放
 *
 * @author admin
 */
public interface Constants extends com.heizi.mycommon.Constants {
    public static final String weixinAppId = "wx4473f497e964795c";
    /**
     * 正式环境接口
     */

    String SERVER_URL = "http://lvyou.heizitech.com/";
    String SERVER_URL2 = "http://101.200.123.90:8880/";

    String SERVER_URL_NEW = "http://zsm.qingcangshu.cn/";
    //注册协议
    String registrationProtocol = "/api.php/v1.Publics/registrationProtocol/";
    String LOGIN = "/api/user/login.jspx/";

    String HOME = "http://zsm.qingcangshu.cn/";



    String REGIST = "/api.php/v1.Publics/register/";
    String RETRIEVIEPWD = "/api.php/v1.Publics/retrievePassword/";
    //修改密码
    String CHANGEPWD = "/api.php/v1.User/changeInfo/";
    String SENDSMS = "/api.php/v1.Publics/sendSms/";
    //获取城市列表
    String CITYS = "/api.php/v1.Index/citys/";
    //首页广告
    String HOME_ADS = "/api.php/v1.Index/ads/";
    //首页分类
    String HOME_CATEGORY = "/api.php/v1.Index/category/";
    //店铺列表
    String STORE_LIST = "/api.php/v1.Index/sellers/";
    //店铺详情
    String STORE_DETAIL = "/api.php/v1.Index/sellerDetail/";
    //店铺是否被收藏
    String STORE_ISCOLLECTED = "/api.php/v1.User/isCollection/";
    //收藏店铺
    String STORE_COLLECT = "/api.php/v1.User/addCollection/";
    //取消收藏店铺
    String STORE_UNCOLLECT = "/api.php/v1.User/removeCollection/";

    /**
     * 检查更新
     */
    String checkVersion = "/api.php/v1.Publics/checkVersion/";

    //获取邀请统计数据
    String inviteStatistics = "/api.php/v1.User/inviteStatistics/";
    //获取邀请列表
    String inviteList = "/api.php/v1.User/inviteList/";
    //买单
    String MAIDAN = "/api.php/v1.User/pay/";
    //积分说明
    String integralExplain = "/api.php/v1.Publics/integralExplain/";
    //收藏店铺
    String MY_COLLECT = "/api.php/v1.User/collections/";

    //消息列表
    String messages = "/api.php/v1.User/messages/";
    //读取消息
    String readMessage = "/api.php/v1.User/readMessage/";
    //是否有未读消息
    String unreadMessages = "/api.php/v1.User/unreadMessages/";
    //签到
    String signIn = "/api.php/v1.User/signIn/";

    //修改用户信息
    String MY_INFO = "/api.php/v1.User/changeInfo/";
    //上传图片
    String UOLOAD_IMG = "/api.php/v1.User/upload/";
    //评价
    String ADDCOMMENT = "/api.php/v1.User/addComment/";

    //常见问题
    String FAQs = "/api.php/v1.User/FAQs/";
    //意见反馈
    String feedback = "api.php/v1.User/feedback/";

    //评价列表
    String COMMITLIST = "/api.php/v1.Index/Comments/";
    //商家评分
    String average = "/api.php/v1.Index/average/";
    //积分记录
    String MY_POINTS = "/api.php/v1.User/statement/";

    //订单记录
    String orders = "/api.php/v1.User/orders/";

    //申请退款
    String refund = "/api.php/v1.User/refund/";

    //获取用户账户信息
    String MY_ACCOUNT = "/api.php/v1.User/account/";

    //积分转赠
    String GIVE_POINT = "/api.php/v1.User/invitationWithdraw/";


    String WEXIN_APP_ID = "wx63702455168f2773";
    String WEXIN_APP_SECRET = "7e4225e8614de193dafc231c7eb6c40b";
    String TEST_TOKEN = "f5a019b9b3654b99de454115798a2cc7";
    String RONGYUN_TOKEN = "FuyVCGl0tdOjJNdEkyBRt6uqBzQumgjv1IhkQzJcCWeQkzEhvPZBNC3lerwPLqfGUnUTnNgTbR1e";
    //添加模版成功
    String BROADCAST_MOBAN_ADD = "Broadcast_moban_add";

    // 需显示引导页版本(引导页更新版本)
    String SHOWUPDATEVERSION = "2.0.3";
    String PACKAGE_NAME = "com.zdt.stu";

    String SD_PATH = Environment.getExternalStorageDirectory().toString();

    String FILE_PATH = SD_PATH + "/" + PACKAGE_NAME;

    String FILE_CACHE = FILE_PATH + "/dataCache";// 数据

    String IMAGE_CACHE = FILE_PATH + "/imgCache/";// 图片

    String ALITAIL_FOLDER = "Stu";// 本地文件目录

    String uploadImage = "/service/remoting/checkrecord/addCheckRecordImage/";


    String TEST_CONTENT = "<!DOCTYPE html>\r\n<html>\r\n<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"><title>他们是草丛中的王者！新英雄艾翁与这些草丛王者搭配有奇效</title>\r\n<meta name=\"viewport\" content=\"width=device-width,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\r\n<meta content=\"telephone=no\" name=\"format-detection\" />\r\n<link href=\"http://zs.ledianduo.com/lddzs/css/new_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<script src=\"http://zs.ledianduo.com/lddzs/js/jquery-1.9.1.js\" type=\"text/javascript\"></script>\r\n</head>\r\n<body>\r\n<div class=\"wz_main\">\r\n    <ul class=\"wz_tit\">他们是草丛中的王者！新英雄艾翁与这些草丛王者搭配有奇效</ul>\r\n    <ul class=\"wz_meta\"><em>2016-09-26</em><em></em><em class=\"zuoze\"><a href=\"${{SourceUrl}}\">Miss</a></em></ul>\r\n    <div class=\"wz_content\">\r\n      \r\n                        \r\n\r\n                        \r\n                        \r\n                        <p style=\"white-space: normal; max-width: 100%; min-height: 1em; color: rgb(62, 62, 62); line-height: 23px; box-sizing: border-box !important; word-wrap: break-word !important; background-color: rgb(255, 255, 255);\"><img data-type=\"png\" data-ratio=\"0.1890625\" data-w=\"640\" width=\"auto\" style=\"font-size: 1em; line-height: 25px; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important; visibility: visible !important; width: auto !important;\" src=\"http://zs.ledianduo.cn/file/source?sourceid=1379859&qrcode=${{AgencyQRCode}}\"></p><p style=\"white-space: normal; max-width: 100%; min-height: 1em; color: rgb(62, 62, 62); line-height: 23px; box-sizing: border-box !important; word-wrap: break-word !important; background-color: rgb(255, 255, 255);\"><span style=\"max-width: 100%; color: rgb(255, 255, 255); font-family: 微软雅黑; line-height: 25px; white-space: pre-wrap; box-sizing: border-box !important; word-wrap: break-word !important; background-color: rgb(235, 103, 148);\">微信号：Miss_game</span></p><p><br></p><p><br></p><section class=\"wx96Diy\" data-source=\"bj.96weixin.com\" style=\"padding-right: 5px; padding-left: 5px; border: 1px dashed transparent; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><blockquote class=\"96wx-bdc\" style=\"padding: 15px; border-width: 1px; border-top-style: solid; border-right-style: solid; border-bottom-style: solid; border-color: rgb(0, 187, 236);\"><p style=\"margin-top: 5px; margin-bottom: 5px; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">英雄联盟里第133位英雄已经曝光，相信各位小伙伴对他已经有了一个大概的了解了。艾翁跟其他英雄比起来最特别的地方就在于他能够随时随地制造草丛，虽然这个技能没有直接伤害提升，但草丛对其他的某些英雄来说却有如神助，有草丛的地方，这些英雄特别强悍。艾翁配这些英雄，战斗力瞬间飙升。</span></p><p class=\"96wxDiy\" style=\"margin-top: 5px; margin-bottom: 5px;\"><span style=\"font-size: 16px; font-family: 宋体, SimSun;\"></span><br></p></blockquote></section><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><br></p><p><br></p><section class=\"wx96Diy\" data-source=\"bj.96weixin.com\" style=\"padding-right: 5px; padding-left: 5px; border: 1px dashed transparent; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><section class=\"96wx-bdc\" style=\"text-align: inherit; border: 1px solid rgb(0, 187, 236); font-size: 1em; font-family: inherit; font-weight: inherit; text-decoration: inherit; color: rgb(51, 51, 51); box-sizing: border-box;\"><section class=\"96wx-bdtc\" style=\"margin-top: -1em; margin-right: 16px; margin-left: 16px; border: none; line-height: 1.4; box-sizing: border-box;\"><span class=\"96wx-bgc\" style=\"display: inline-block; padding: 3px 8px; border-radius: 4px; color: rgb(255, 255, 255); font-size: 1em; text-align: center; font-family: inherit; font-weight: inherit; text-decoration: inherit; border-color: rgb(0, 187, 236); box-sizing: border-box; background-color: rgb(0, 187, 236);\"><section class=\"96wx-bdtc\" style=\"box-sizing: border-box;\">狮子狗</section></span></section><section class=\"96wx-bdtc\" style=\"padding: 16px; font-size: 1em; line-height: 1.4; font-family: inherit; box-sizing: border-box;\"><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><img data-s=\"300,640\" data-type=\"png\" data-ratio=\"0.579454253611557\" data-w=\"623\" src=\"http://zs.ledianduo.cn/file/source?sourceid=2965862&qrcode=${{AgencyQRCode}}\"><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">说到草丛，怎能不提狮子狗？在有草丛的地方，狮子狗能够无限使用被动技能，也就是说，能够无限指向性突进敌方目标。大部分ADC在同等级发育的情况下，由于身板脆弱站撸通常都是打不过近战英雄的。当艾翁遇到狮子狗之后，制造多个草丛并配合地图上原本就有的草丛任谁都会虚的，无限突进加高伤害，想秀都秀不起来，并且在劣势时还很难跑掉。</span></p><p style=\"margin-top: 5px; margin-bottom: 5px; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">狮子狗在草丛多的地方能够秀得飞起，借助被动技能无限跳。敌方脆皮英雄跑不掉还能戏耍敌方坦克英雄，草丛跳跳虎的称号可不是白来的。</span></p><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><br></p></section></section></section><p><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><br></p><p><br></p><section class=\"wx96Diy\" data-source=\"bj.96weixin.com\" style=\"padding-right: 5px; padding-left: 5px; border: 1px dashed transparent; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><section class=\"96wx-bdc\" style=\"text-align: inherit; border: 1px solid rgb(0, 187, 236); font-size: 1em; font-family: inherit; font-weight: inherit; text-decoration: inherit; color: rgb(51, 51, 51); box-sizing: border-box;\"><section class=\"96wx-bdtc\" style=\"margin-top: -1em; margin-right: 16px; margin-left: 16px; border: none; line-height: 1.4; box-sizing: border-box;\"><span class=\"96wx-bgc\" style=\"display: inline-block; padding: 3px 8px; border-radius: 4px; color: rgb(255, 255, 255); font-size: 1em; text-align: center; font-family: inherit; font-weight: inherit; text-decoration: inherit; border-color: rgb(0, 187, 236); box-sizing: border-box; background-color: rgb(0, 187, 236);\"><section class=\"96wx-bdtc\" style=\"box-sizing: border-box;\">提莫</section></span></section><section class=\"96wx-bdtc\" style=\"padding: 16px; font-size: 1em; line-height: 1.4; font-family: inherit; box-sizing: border-box;\"><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><img data-s=\"300,640\" data-type=\"png\" data-ratio=\"0.5171065493646139\" data-w=\"1023\" src=\"http://zs.ledianduo.cn/file/source?sourceid=2965863&qrcode=${{AgencyQRCode}}\"><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">相信各位小伙伴也多次在英雄联盟搞笑视频中看到过提莫在草丛中惊险逃生的短片，在经过多次改版之后当前版本的提莫在草丛中即使移动也依然能够保持隐身状态，并且在隐身被打破之后还会有高额攻速提升。</span></p><p style=\"margin-top: 5px; margin-bottom: 5px; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">想想吧，如果是提莫打下路，只要草丛在，先上去QAA打一套然后马上进草丛隐身，等待Q技能冷却之后再QAAA打一套，是不是很无赖。艾翁配提莫可以让提莫的隐身战术更加适用，试想，假如是打薇恩，不管多残，只要进入草丛触发隐身薇恩除了用真眼之外是没有任何办法的。</span></p><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><br></p></section></section></section><p><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><br></p><p><br></p><section class=\"wx96Diy\" data-source=\"bj.96weixin.com\" style=\"padding-right: 5px; padding-left: 5px; border: 1px dashed transparent; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><section class=\"96wx-bdc\" style=\"text-align: inherit; border: 1px solid rgb(0, 187, 236); font-weight: inherit; text-decoration: inherit; color: rgb(51, 51, 51); box-sizing: border-box;\"><section class=\"96wx-bdtc\" style=\"font-family: inherit; font-size: 1em; margin-top: -1em; margin-right: 16px; margin-left: 16px; border: none; line-height: 1.4; box-sizing: border-box;\"><span class=\"96wx-bgc\" style=\"display: inline-block; padding: 3px 8px; border-radius: 4px; color: rgb(255, 255, 255); font-size: 1em; text-align: center; font-family: inherit; font-weight: inherit; text-decoration: inherit; border-color: rgb(0, 187, 236); box-sizing: border-box; background-color: rgb(0, 187, 236);\"><section class=\"96wx-bdtc\" style=\"box-sizing: border-box;\">努努</section></span></section><section class=\"96wx-bdtc\" style=\"padding: 16px; box-sizing: border-box;\"><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: inherit; font-size: 1em; line-height: 1.4; box-sizing: border-box;\"><img data-s=\"300,640\" data-type=\"png\" data-ratio=\"0.5905797101449275\" data-w=\"552\" src=\"http://zs.ledianduo.cn/file/source?sourceid=2965864&qrcode=${{AgencyQRCode}}\"><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><span style=\"text-indent: 32px; font-weight: inherit; text-align: inherit; text-decoration: inherit; line-height: 19.6px;\">&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</span><span style=\"font-family: 新宋体; font-size: 16px; line-height: 1.4; text-indent: 32px; font-weight: inherit; text-align: inherit; text-decoration: inherit;\">一直以来，努努都有一个称号便是：草丛原子弹。努努的大招拥有超高的</span><span style=\"font-family: 新宋体; font-size: 16px; line-height: 1.4; text-indent: 32px; font-weight: inherit; text-align: inherit; text-decoration: inherit;\">AOE魔法伤害，三级时有1125+2.5ap加成的魔法伤害，如果是全输出的努努甚至能够靠一个技能秒杀敌方所有英雄。但由于大招的引导时间较长，并且会被打断，敌方英雄也不会傻乎乎的吃这么一个高伤害的大招，所以，努努想要放出满大并且打到人就需要借助草丛。</span></p><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: inherit; font-size: 1em; line-height: 1.4; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">努努在草丛中放大招的时候大招的暴风雪敌方是看不见的，只能感受到减速，敌人稍不注意便会吃下这一个满大。努努配艾翁，随时都可能躲进草丛放原子弹。</span></p><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: inherit; font-size: 1em; line-height: 1.4; box-sizing: border-box;\"><br></p></section></section></section><p><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><br></p><p><br></p><section class=\"wx96Diy\" data-source=\"bj.96weixin.com\" style=\"padding-right: 5px; padding-left: 5px; border: 1px dashed transparent; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><section class=\"96wx-bdc\" style=\"text-align: inherit; border: 1px solid rgb(0, 187, 236); font-size: 1em; font-family: inherit; font-weight: inherit; text-decoration: inherit; color: rgb(51, 51, 51); box-sizing: border-box;\"><section class=\"96wx-bdtc\" style=\"margin-top: -1em; margin-right: 16px; margin-left: 16px; border: none; line-height: 1.4; box-sizing: border-box;\"><span class=\"96wx-bgc\" style=\"display: inline-block; padding: 3px 8px; border-radius: 4px; color: rgb(255, 255, 255); font-size: 1em; text-align: center; font-family: inherit; font-weight: inherit; text-decoration: inherit; border-color: rgb(0, 187, 236); box-sizing: border-box; background-color: rgb(0, 187, 236);\"><section class=\"96wx-bdtc\" style=\"box-sizing: border-box;\">塞恩</section></span></section><section class=\"96wx-bdtc\" style=\"padding: 16px; font-size: 1em; line-height: 1.4; font-family: inherit; box-sizing: border-box;\"><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><img data-s=\"300,640\" data-type=\"png\" data-ratio=\"0.625\" data-w=\"1280\" src=\"http://zs.ledianduo.cn/file/source?sourceid=2965865&qrcode=${{AgencyQRCode}}\"><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">塞恩跟努努一样，可以借助草丛让敌方英雄吃一个满Q。塞恩的Q技能拥有1.9AD加成的物理伤害，并且最高的眩晕时间可以达到2.25秒，要知道塞恩的Q技能不管是伤害还是控制都是有AOE效果的哦。</span></p><p style=\"margin-top: 5px; margin-bottom: 5px; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">塞恩的Q技能其实只能算是一个很普通的技能，但如果配草丛的话便是一个神技，高伤害，长控制，并且都是AOE效果。比什么风墙厉害多了。</span></p><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><br></p></section></section></section><p><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><br></p><p><br></p><section class=\"wx96Diy\" data-source=\"bj.96weixin.com\" style=\"padding-right: 5px; padding-left: 5px; border: 1px dashed transparent; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><section class=\"96wx-bdc\" style=\"text-align: inherit; border: 1px solid rgb(0, 187, 236); font-size: 1em; font-family: inherit; font-weight: inherit; text-decoration: inherit; color: rgb(51, 51, 51); box-sizing: border-box;\"><section class=\"96wx-bdtc\" style=\"margin-top: -1em; margin-right: 16px; margin-left: 16px; border: none; line-height: 1.4; box-sizing: border-box;\"><span class=\"96wx-bgc\" style=\"display: inline-block; padding: 3px 8px; border-radius: 4px; color: rgb(255, 255, 255); font-size: 1em; text-align: center; font-family: inherit; font-weight: inherit; text-decoration: inherit; border-color: rgb(0, 187, 236); box-sizing: border-box; background-color: rgb(0, 187, 236);\"><section class=\"96wx-bdtc\" style=\"box-sizing: border-box;\">船长</section></span></section><section class=\"96wx-bdtc\" style=\"padding: 16px; font-size: 1em; line-height: 1.4; font-family: inherit; box-sizing: border-box;\"><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><img data-s=\"300,640\" data-type=\"png\" data-ratio=\"0.5901234567901235\" data-w=\"1215\" src=\"http://zs.ledianduo.cn/file/source?sourceid=2965866&qrcode=${{AgencyQRCode}}\"><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">都知道船长能连桶，借助炸药桶能够打出大量AOE物理伤害，全家桶的威力小编可是深有体会。在线上的时候船长明着放捅任谁都有一定的心理准备，会下意识地躲一下。但如果船长是事先在草丛中放置一个炸药桶，然后用Q技能引爆草丛中的炸药桶然后立马接一个桶，敌人就很难躲避了。猝不及防的一个炸药桶不仅伤害高，并且还有减速效果，炸到人之后船长便能顺势上去直接打一套。</span></p><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><br></p></section></section></section><p><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><br></p><p><br></p><section class=\"wx96Diy\" data-source=\"bj.96weixin.com\" style=\"padding-right: 5px; padding-left: 5px; border: 1px dashed transparent; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><section class=\"96wx-bdc\" style=\"text-align: inherit; border: 1px solid rgb(0, 187, 236); font-size: 1em; font-family: inherit; font-weight: inherit; text-decoration: inherit; color: rgb(51, 51, 51); box-sizing: border-box;\"><section class=\"96wx-bdtc\" style=\"margin-top: -1em; margin-right: 16px; margin-left: 16px; border: none; line-height: 1.4; box-sizing: border-box;\"><span class=\"96wx-bgc\" style=\"display: inline-block; padding: 3px 8px; border-radius: 4px; color: rgb(255, 255, 255); font-size: 1em; text-align: center; font-family: inherit; font-weight: inherit; text-decoration: inherit; border-color: rgb(0, 187, 236); box-sizing: border-box; background-color: rgb(0, 187, 236);\"><section class=\"96wx-bdtc\" style=\"box-sizing: border-box;\">女警</section></span></section><section class=\"96wx-bdtc\" style=\"padding: 16px; font-size: 1em; line-height: 1.4; font-family: inherit; box-sizing: border-box;\"><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><img data-s=\"300,640\" data-type=\"png\" data-ratio=\"0.5625\" data-w=\"1280\" src=\"http://zs.ledianduo.cn/file/source?sourceid=2965867&qrcode=${{AgencyQRCode}}\"><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">如果艾翁是走辅助位，一定要试试女警配艾翁的组合。艾翁W技能的被动便是在草丛中每发普攻会有额外魔法伤害，站在草丛中A人伤害肯定是会高一些的。而女警在草丛中的时候被动的叠加速度直接提升一倍，站在草丛中A人的女警伤害会高于在草丛外A人。</span></p><p style=\"margin-top: 5px; margin-bottom: 5px; box-sizing: border-box;\"><br></p></section></section></section><p><br></p><p style=\"margin-top: 5px; margin-bottom: 5px; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><br></p><p><br></p><section class=\"wx96Diy\" data-source=\"bj.96weixin.com\" style=\"padding-right: 5px; padding-left: 5px; border: 1px dashed transparent; font-family: &#39;MicroSoft YaHei&#39;; font-size: 14px; line-height: normal; white-space: normal;\"><blockquote class=\"96wx-bdc 96wx-bgpic\" data-wxsrc=\"http://mmbiz.qpic.cn/mmbiz/iaGswicCbWm6ib4sQwRuoty4m9wFibZ7KDaXy793TRJ0ic6jbkPGRheJMdAdXWjwnAicRj0mW9ukYgNl2zhQ4G6EOVIA/0?wx_fmt=gif\" style=\"padding: 20px 15px 15px 48px; border-radius: 5px; border-width: 1px; border-top-style: solid; border-right-style: solid; border-bottom-style: solid; border-color: rgb(0, 187, 236); line-height: 1.5; background-image: url(&quot;http://zs.ledianduo.cn/file/source?sourceid=2965868&qrcode=${{AgencyQRCode}}); background-position: 10px 11px; background-repeat: no-repeat;\"><p style=\"margin-top: 5px; margin-bottom: 5px; text-indent: 32px;\"><span style=\"font-family: 新宋体; font-size: 16px;\">即将到来的新英雄艾翁可以说是设计较为新颖的一个英雄，而他独有的制造草丛的能力则给英雄联盟中一些在草丛中战斗力提升的英雄带来福音。使用艾翁搭配这些英雄会产生化学反应哦。</span></p><p class=\"96wxDiy\" style=\"margin-top: 5px; margin-bottom: 5px;\"><br></p></blockquote></section><p><br></p><p style=\"max-width: 100%; min-height: 1em; color: rgb(62, 62, 62); text-align: justify; line-height: 26px; box-sizing: border-box !important; word-wrap: break-word !important; background: rgb(255, 255, 255);\"><span style=\"max-width: 100%; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">眼镜：glassesmiss.taobao.com</span></p><p style=\"max-width: 100%; min-height: 1em; color: rgb(62, 62, 62); text-align: justify; line-height: 26px; box-sizing: border-box !important; word-wrap: break-word !important; background: rgb(255, 255, 255);\"><span style=\"max-width: 100%; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">零食：missfood.taobao.com</span></p><p style=\"max-width: 100%; min-height: 1em; color: rgb(62, 62, 62); text-align: justify; line-height: 26px; box-sizing: border-box !important; word-wrap: break-word !important; background: rgb(255, 255, 255);\"><span style=\"max-width: 100%; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">外设：missgame.taobao.com</span></p><p style=\"max-width: 100%; min-height: 1em; color: rgb(62, 62, 62); text-align: justify; line-height: 26px; box-sizing: border-box !important; word-wrap: break-word !important; background: rgb(255, 255, 255);\"><span style=\"max-width: 100%; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">服装：chuanmiss.taobao.com</span></p><p style=\"max-width: 100%; min-height: 1em; color: rgb(62, 62, 62); text-align: justify; line-height: 26px; box-sizing: border-box !important; word-wrap: break-word !important; background: rgb(255, 255, 255);\"><span style=\"max-width: 100%; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">鞋子：maimiss.taobao.com</span></p><p style=\"max-width: 100%; min-height: 1em; color: rgb(62, 62, 62); text-align: justify; line-height: 26px; box-sizing: border-box !important; word-wrap: break-word !important; background: rgb(255, 255, 255);\"><span style=\"max-width: 100%; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">周边：missriot.taobao.com</span></p><p style=\"max-width: 100%; min-height: 1em; color: rgb(62, 62, 62); text-align: justify; line-height: 26px; box-sizing: border-box !important; word-wrap: break-word !important; background: rgb(255, 255, 255);\"><span style=\"max-width: 100%; font-family: 微软雅黑; box-sizing: border-box !important; word-wrap: break-word !important;\">Miss猫舍微信：missdbge</span></p><p style=\"margin-top: 10px; margin-bottom: 10px; max-width: 100%; box-sizing: border-box; min-height: 1em; color: rgb(62, 62, 62); text-align: center; line-height: 25px; word-wrap: break-word !important; background-color: rgb(255, 255, 255);\"><img width=\"auto\" data-type=\"png\" data-ratio=\"1.0666666666666667\" data-w=\"180\" style=\"line-height: 21px; font-family: 宋体; font-size: 14px; box-sizing: border-box !important; word-wrap: break-word !important; width: auto !important; visibility: visible !important;\" src=\"http://zs.ledianduo.cn/file/source?sourceid=1379874&qrcode=${{AgencyQRCode}}\"><img width=\"auto\" data-type=\"png\" data-ratio=\"0.1890625\" data-w=\"640\" style=\"line-height: 21px; font-family: 宋体; font-size: 14px; box-sizing: border-box !important; word-wrap: break-word !important; width: auto !important; visibility: visible !important;\" src=\"http://zs.ledianduo.cn/file/source?sourceid=1379875&qrcode=${{AgencyQRCode}}\"><strong style=\"line-height: 25.6px;\"><span style=\"color: rgb(0, 82, 255); background-color: rgb(2, 30, 170);\"></span><span style=\"color: rgb(0, 82, 255);\">Miss大小姐/合作邮箱：</span><span style=\"color: rgb(0, 82, 255);\"><a style=\"color: rgb(255, 41, 65); line-height: 25.6px; font-family: 宋体;\"><span style=\"font-family: Calibri;\">miss<strong style=\"color: rgb(62, 62, 62); line-height: 25.6px;\"><span style=\"color: rgb(0, 82, 255);\"></span></strong></span></a><strong style=\"color: rgb(62, 62, 62); line-height: 25.6px;\"><a style=\"color: rgb(255, 41, 65); line-height: 25.6px; font-family: 宋体;\"><span style=\"font-family: Calibri;\">@missstudio.cn</span></a></strong></span></strong></p><p style=\"line-height: 25.6px;\"><strong style=\"line-height: 25.6px;\"><span style=\"color: rgb(0, 82, 255);\"><strong style=\"color: rgb(62, 62, 62); line-height: 25.6px;\"><a style=\"color: rgb(255, 41, 65); line-height: 25.6px; font-family: 宋体;\"><span style=\"font-family: Calibri;\"><br></span></a></strong></span></strong></p><p><br></p>\r\n                    \r\n    </div>\r\n    <ul class=\"wz_meta\"><em>阅读<i>81394</i></em><em><span class=\"zan\"></span>1652</em><em class=\"jubao\">举报</em></ul>\r\n</div>\r\n</body>\r\n</html>";
}
