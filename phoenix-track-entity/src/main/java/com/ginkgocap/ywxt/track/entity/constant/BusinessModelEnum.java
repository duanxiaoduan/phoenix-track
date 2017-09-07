package com.ginkgocap.ywxt.track.entity.constant;

/**
 * 业务模块 枚举.
 */
public enum BusinessModelEnum {

    BUSINESS_PERSON(1,"人脉"),
    BUSINESS_CUSTOMER(2,"客户"),
    BUSINESS_DEMAND(3,"需求"),
    BUSINESS_KNOWLEDGE(4,"知识"),
    BUSINESS_DYNAMIC(5,"动态"),
    BUSINESS_ASSOCIATION(6,"社群"),
    BUSINESS_CHET(7,"畅聊"),
    BUSINESS_AFFAIR(8,"事务"),
    BUSINESS_ORGANIZATION(9,"组织"),
    BUSINESS_VIDEO(10,"视频"),
    BUSINESS_QUESTIONS_ANSWERS(11,"问答"),
    BUSINESS_HOT(12,"热门"),
    BUSINESS_HEADLINE(13,"头条"),
    BUSINESS_SEARCH(14,"搜索"),
    BUSINESS_USER(15,"用户");

    private int key;
    private String value;

    BusinessModelEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
            this.value = value;
        }

}
