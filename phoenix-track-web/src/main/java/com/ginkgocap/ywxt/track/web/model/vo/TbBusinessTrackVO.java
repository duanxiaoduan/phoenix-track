package com.ginkgocap.ywxt.track.web.model.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by gintong on 2017/8/23.
 */
public class TbBusinessTrackVO {

    /**
     * 服务端类型，1-web,2-ios,3-android,4-后端接口
     */
    private Integer serverType;

    /**
     * 业务模块，1-人脉，2-客户，3-需求，4-知识，5-动态，6-社群，7-畅聊，8-事务，9-组织，10-视频，11-问答，12-热门，13-头条，14-搜索
     */
    private Integer businessModel;

    private Long businessModelId;

    /**
     * 操作类型，1-新增，2-浏览，3-收藏，4-分享，5-回答
     */
    private Integer optType;

    /**
     * opt_type为分享时，11-动态，12-畅聊，13-社群，14-事务，21-朋友圈，22-QQ，23-微信，24-微博，25-其它方式
     */
    private Integer shareType;

    public Integer getServerType() {
        return serverType;
    }

    public void setServerType(Integer serverType) {
        this.serverType = serverType;
    }

    public Integer getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(Integer businessModel) {
        this.businessModel = businessModel;
    }

    public Long getBusinessModelId() {
        return businessModelId;
    }

    public void setBusinessModelId(Long businessModelId) {
        this.businessModelId = businessModelId;
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public Integer getShareType() {
        return shareType;
    }

    public void setShareType(Integer shareType) {
        this.shareType = shareType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
