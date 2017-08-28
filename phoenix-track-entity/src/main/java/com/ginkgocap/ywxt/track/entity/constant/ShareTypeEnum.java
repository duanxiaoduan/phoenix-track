package com.ginkgocap.ywxt.track.entity.constant;

/**
 * 分享类型 枚举.
 */
public enum ShareTypeEnum {

    SHARE_DYNAMIC(1,"动态"),
    SHARE_CHET(2,"畅聊"),
    SHARE_ASSOCIATION(3,"社群"),
    SHARE_AFFAIR(4,"事务"),
    SHARE_FRIEND_CIRCLE(4,"朋友圈"),
    SHARE_QQ(4,"QQ"),
    SHARE_WECHAT(4,"微信"),
    SHARE_MICROBLOG(4,"微博"),
    SHARE_OTHER(5,"其它方式");

    private int key;
    private String value;

    ShareTypeEnum(int key, String value) {
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
