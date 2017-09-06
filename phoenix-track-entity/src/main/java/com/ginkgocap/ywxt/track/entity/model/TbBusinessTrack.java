package com.ginkgocap.ywxt.track.entity.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.sql.Timestamp;

public class TbBusinessTrack implements Serializable{

    private static final long serialVersionUID = 4143630236504645038L;

    /**
     * 服务端类型，1-web,2-ios,3-android,4-后端接口
     */
    private Integer serverType;

    /**
     * 业务模块，1-人脉，2-客户，3-需求，4-知识，5-动态，6-社群，7-畅聊，8-事务，9-组织，10-视频，11-问答，12-热门，13-头条，14-搜索
     */
    private Integer businessModel;

    /**
     * 业务模块 对应的id eg:businessModel=1,businessModelId表示人脉的id
     */
    private Long businessModelId;

    /**
     * 业务模块下的功能，1--新增消息，2--新增动态，3--新增文件，4--新增成员，5--新增回答，6--新增视频
     */
    private Integer modelFunction;

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
     * 用户 昵称
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
    private String userAgent;

    /**
     * 创建时间
     */
    private Timestamp gmtCreate;

    public TbBusinessTrack() {
    }

    /**
     * 获取服务端类型，1-web,2-ios,3-android,4-后端接口
     *
     * @return server_type - 服务端类型，1-web,2-ios,3-android,4-后端接口
     */
    public Integer getServerType() {
        return serverType;
    }

    /**
     * 设置服务端类型，1-web,2-ios,3-android,4-后端接口
     *
     * @param serverType 服务端类型，1-web,2-ios,3-android,4-后端接口
     */
    public void setServerType(Integer serverType) {
        this.serverType = serverType;
    }

    /**
     * 获取业务模块，1-人脉，2-客户，3-需求，4-知识，5-动态，6-社群，7-畅聊，8-事务，9-组织，10-视频，11-问答，12-热门，13-头条，14-搜索
     *
     * @return business_model - 业务模块，1-人脉，2-客户，3-需求，4-知识，5-动态，6-社群，7-畅聊，8-事务，9-组织，10-视频，11-问答，12-热门，13-头条，14-搜索
     */
    public Integer getBusinessModel() {
        return businessModel;
    }

    /**
     * 设置业务模块，1-人脉，2-客户，3-需求，4-知识，5-动态，6-社群，7-畅聊，8-事务，9-组织，10-视频，11-问答，12-热门，13-头条，14-搜索
     *
     * @param businessModel 业务模块，1-人脉，2-客户，3-需求，4-知识，5-动态，6-社群，7-畅聊，8-事务，9-组织，10-视频，11-问答，12-热门，13-头条，14-搜索
     */
    public void setBusinessModel(Integer businessModel) {
        this.businessModel = businessModel;
    }

    public Integer getModelFunction() {
        return modelFunction;
    }

    public void setModelFunction(Integer modelFunction) {
        this.modelFunction = modelFunction;
    }

    public Long getBusinessModelId() {
        return businessModelId;
    }

    public void setBusinessModelId(Long businessModelId) {
        this.businessModelId = businessModelId;
    }

    /**
     * 获取操作类型，1-新增，2-浏览，3-收藏，4-分享，5-回答
     *
     * @return opt_type - 操作类型，1-新增，2-浏览，3-收藏，4-分享，5-回答
     */
    public Integer getOptType() {
        return optType;
    }

    /**
     * 设置操作类型，1-新增，2-浏览，3-收藏，4-分享，5-回答
     *
     * @param optType 操作类型，1-新增，2-浏览，3-收藏，4-分享，5-回答
     */
    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    /**
     * 获取opt_type为分享时，11-动态，12-畅聊，13-社群，14-事务，21-朋友圈，22-QQ，23-微信，24-微博，25-其它方式
     *
     * @return share_type - opt_type为分享时，11-动态，12-畅聊，13-社群，14-事务，21-朋友圈，22-QQ，23-微信，24-微博，25-其它方式
     */
    public Integer getShareType() {
        return shareType;
    }

    /**
     * 设置opt_type为分享时，11-动态，12-畅聊，13-社群，14-事务，21-朋友圈，22-QQ，23-微信，24-微博，25-其它方式
     *
     * @param shareType opt_type为分享时，11-动态，12-畅聊，13-社群，14-事务，21-朋友圈，22-QQ，23-微信，24-微博，25-其它方式
     */
    public void setShareType(Integer shareType) {
        this.shareType = shareType;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 获取ip
     *
     * @return client_ip - ip
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * 设置ip
     *
     * @param clientIp ip
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    /**
     * 获取请求方法，1-get，2-post，3-put，4-delete
     *
     * @return method_type - 请求方法，1-get，2-post，3-put，4-delete
     */
    public Integer getMethodType() {
        return methodType;
    }

    /**
     * 设置请求方法，1-get，2-post，3-put，4-delete
     *
     * @param methodType 请求方法，1-get，2-post，3-put，4-delete
     */
    public void setMethodType(Integer methodType) {
        this.methodType = methodType;
    }

    /**
     * 获取请求url
     *
     * @return url - 请求url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置请求url
     *
     * @param url 请求url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取请求参数，json
     *
     * @return parameter - 请求参数，json
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * 设置请求参数，json
     *
     * @param parameter 请求参数，json
     */
    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    /**
     * 获取浏览器userAgent
     *
     * @return userAgent - 浏览器userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * 设置浏览器userAgent
     *
     * @param userAgent 浏览器userAgent
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}