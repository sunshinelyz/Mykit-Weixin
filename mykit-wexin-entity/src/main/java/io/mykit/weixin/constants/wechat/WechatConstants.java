/**
 * Copyright 2018-2118 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.weixin.constants.wechat;

import io.mykit.weixin.vo.WechatQrcodeSubscribeInfo;

/**
 * @author liuyazhuang
 * @date 2018/10/29 18:23
 * @description 微信常量信息
 * @version 1.0.0
 */
public class WechatConstants {

    /**
     * 联系我们
     */
    public static String getCallUs(){
        StringBuilder sb = new StringBuilder();
        sb.append("如有任何疑问可联系关心堂健康管家！\n");
        sb.append("周一至周五请拨打028-66333314；\n");
        sb.append("周六至周日请拨打13088021189；\n");
        sb.append("或加管家微信：13088075887\n");
        sb.append("（服务时间：9：00-18：00）\n");
        return sb.toString();
    }

    /**
     * 关注后默认返回的消息
     */
    public static String getSubscribeResponseMessage(){
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hi，自今后，让我为您的健康护航！\n");
//        sb.append("点此<a href=\"http://wx.cdmn.com/medcare/dest/client/fdSignWX/index.html?hospitalId=8a8383af60747eb8016096fdb3dd0144\">立即签约</a>享免费咨询\n");
//        sb.append("会员中心领<a href=\"https://mp.weixin.qq.com/s?__biz=MzI3Nzc5ODU0MQ==&mid=2247486015&idx=1&sn=cce86eeb08bd8f1cca1c51b973959519&chksm=eb6181dddc1608cb6c59bf0544a940d74011540fc2dace7a11cf2df1c345407928de7faa3720&token=1548696&lang=zh_CN#rd\">健康工具</a>，<a href=\"http://wx.cdmn.com/fdConsultWX/minHtml/index.html?hospitalId=8a8383a458dd38d40158ddd759a10004\">咨询专家</a>\n");
//        sb.append("如有疑问请咨询健康管家。\n");
//        sb.append("管家微信号：cmd13088075887\n");
//        return sb.toString();



        StringBuilder sb = new StringBuilder();
        sb.append("Hi，自今后，让我为您的健康护航！\n");
        sb.append("针对疫情，即日起您可点此<a href=\"http://wx.cdmn.com/fdConsultWX/minHtml/teamDetail.html?teamId=8a8383a761413afa0161417ac7d7000b&isSign=&askBodyType=type_team&askBodyId=8a8383a761413afa0161417ac7d7000b&askBodyName=6218201C75AB201D514D8D394E498BCA670D52A156E2961F&askType=type_charge&hospitalId=8a8383af60747eb8016096fdb3dd0144\">立即免费咨询</a>\n");
        sb.append("慢性疾病、普通感冒、发热等非紧急病情，以及处于隔离期的朋友、均可微信在线咨询医生，不需要冒着被交叉感染的风险去医院了\n");
        return sb.toString();
    }

    /**
     * 扫码关注正常情况返回的信息
     */
    public static String getQrcodeSubscribeResponseMessage(WechatQrcodeSubscribeInfo wechatQrcodeSubscribeInfo, String url, String openId){
        StringBuilder sb = new StringBuilder();
        sb.append(QRCODE_SUBSCRIBE_RESPONSE_MESSAGE);
        sb.append("<a href=\"");
        sb.append(url);
        sb.append("?teamId=" + wechatQrcodeSubscribeInfo.getTeamId());
        sb.append("&isSign=noSign");
        sb.append("&askBodyType=type_team");
        sb.append("&askBodyId=" + wechatQrcodeSubscribeInfo.getTeamId());
        sb.append("&askNum=0");
        sb.append("&askBodyName=" + wechatQrcodeSubscribeInfo.getTeamName());
        sb.append("&askType=type_charge");
        sb.append("&hospitalId=" + wechatQrcodeSubscribeInfo.getHospId());
        sb.append("&docId=" + wechatQrcodeSubscribeInfo.getDocId());
        sb.append("&docName=" + wechatQrcodeSubscribeInfo.getDocName());
        sb.append("&openId=" + openId);
        sb.append("\">");
        sb.append("→点击立即签约" + wechatQrcodeSubscribeInfo.getDocName());
        sb.append("</a>");
        return sb.toString();
    }

    /**
     * 点击微信菜单联系我们
     */
    public static final String WECHAT_MENU_CLICK_CALL_US = "menu_click_call_us";
    /**
     * 扫描关注微信公众号返回消息
     */
    public static String QRCODE_SUBSCRIBE_RESPONSE_MESSAGE = "第一步：扫二维码（✓已完成）\n" + "第二步：向医生报道（签约医生获取关注）\n\n";

    /**
     * 业务系统返回的消息key
     */
    public static final String MESSAGE = "message";
    /**
     * 业务系统返回的状态码key
     */
    public static final String CODE = "code";

    /**
     * 成功状态码
     */
    public static final Integer CODE_SUCCESS = 1001;

    /**
     * 扫码关注的前缀
     */
    public static final String QRSCENE_PREFIX = "qrscene_";

    /**
     * null字符串
     */
    public static final String NULL_STRING = "null";

    /**
     * 微信配置的Token
     */
    public static final String TOKEN = "medcare";

    /**
     * 关注事件
     */
    public static final String WEHCAT_SUBSCRIBE = "subscribe";
    /**
     * 取消关注事件
     */
    public static final String WEHCAT_UNSUBSCRIBE = "unsubscribe";

    /**
     * 微信上配置的加解密消息key
     */
    public static final String ENCODING_AES_KEY = "4972756F3AAD02FA69C0F2D27BF3A0DC02FA69C756F";


    /**
     * 微信授权获取code state参数分隔标识
     */
    public static final String WECHAT_OAUTH2_STATE_SPLIT = "AAABBBCCCDDDEEE";

    /**
     * 微信信息
     */
    public static final String WECHAT_INFO = "wechat_info";
    /**
     * 微信openid
     */
    public static final String WECHAT_OPENID = "wechat_openid";

    /**
     * 缓存时间
     */
    public static final int WECHAT_CACHE_TIME = 1800;

    /**
     * 发送消息
     */
    public static final String SEND_YES = "send_yes";


    /**
     * 不发送消息
     */
    public static final String SEND_NO = "send_no";

    /**
     * 重试的结果
     */
    public static final String RETRY_TRUE = "retry_true";
    /**
     * 不是重试的结果
     */
    public static final String RETRY_FALSE = "retry_false";
    /**
     * 不显示
     */
    public static final String TYPE_NOTSHOW = "type_notshow";
    /**
     * 显示
     */
    public static final String TYPE_SHOW = "type_show";

    /**
     * 微信状态码
     */
    public static final String WEHCAT_ERROR_CODE = "errcode";

    /**
     * 微信正常状态码
     */
    public static final int WECHAT_CODE_NORMAL = 0;

    /**
     * 默认最大重试5次
     */
    public static final int MAX_RETRY_COUNT = 5;
    /**
     * 最小重试次数，不重试
     */
    public static final int MIN_RETRY_COUNT = 0;
    /**
     * 默认的初始化重试次数0
     */
    public static final int CURRENT_RETRY_INIT_COUNT = 0;

    /**
     * 默认获取昨天和今天的数据
     */
    public static final int BEFORE_DAY = 1;

    /**
     * 发送给单个人
     */
    public static final String SEND_SINGLE = "send_single";
    /**
     * 发送给多个人
     */
    public static final String SEND_MULTI = "send_multi";
    /**
     * 全员发送
     */
    public static final String SEND_ALL = "send_all";

}
