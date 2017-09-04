package com.ginkgocap.ywxt.track.web.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ginkgocap.ywxt.track.web.util.TimestampJsonDeserializer;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="tb_business_track")
public class TbBusinessTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 服务端类型，1-web,2-ios,3-android,4-后端接口
     */
    private Integer serverType;

    /**
     * 业务模块，1-人脉，2-客户，3-需求，4-知识，5-动态，6-社群，7-畅聊，8-事务，9-组织，10-视频，11-问答，12-热门，13-头条，14-搜索
     */
    private Integer businessModel;

    @Column(name = "business_model_id")
    private Long businessModelId;

    /**
     * 操作类型，1-新增，2-浏览，3-收藏，4-分享，5-回答
     */
    private Integer optType;

    /**
     * opt_type为分享时，11-动态，12-畅聊，13-社群，14-事务，21-朋友圈，22-QQ，23-微信，24-微博，25-其它方式
     */
    private Integer shareType;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 备注
     */
    private String remarks;

    /**
     * ip
     */
    private String clientIp;

    /**
     * 请求方法，1-get，2-post，3-put，4-delete
     */
    private Integer methodType;

    /**
     * 请求url
     */
    private String url;

    /**
     * 请求参数，json
     */
    private String parameter;

    /**
     * 浏览器userAgent
     */
    private String useragent;

    /**
     * 创建时间
     */
    @JsonDeserialize(using = TimestampJsonDeserializer.class)
    private Timestamp gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Integer getMethodType() {
        return methodType;
    }

    public void setMethodType(Integer methodType) {
        this.methodType = methodType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}