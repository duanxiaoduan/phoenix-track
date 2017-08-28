package com.ginkgocap.ywxt.track.entity.constant;

/**
 * 操作类型 枚举.
 */
public enum OptTypeEnum {

    OPT_ADD(1,"新增"),
    OPT_VIEW(2,"浏览"),
    OPT_COLLECT(3,"收藏"),
    OPT_SHARE(4,"分享"),
    OPT_ANSWERS(5,"回答");

    private int key;
    private String value;

    OptTypeEnum(int key, String value) {
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
