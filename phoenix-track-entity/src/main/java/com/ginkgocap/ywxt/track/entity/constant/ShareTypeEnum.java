package com.ginkgocap.ywxt.track.entity.constant;

/**
 * 分享类型 枚举.
 */
public enum ShareTypeEnum {

    SHARE_DYNAMIC(11,"动态"),
    SHARE_CHET(12,"畅聊"),
    SHARE_ASSOCIATION(13,"社群"),
    SHARE_AFFAIR(14,"事务"),
    SHARE_FRIEND_CIRCLE(21,"朋友圈"),
    SHARE_QQ(22,"QQ"),
    SHARE_WECHAT(23,"微信"),
    SHARE_MICROBLOG(24,"微博"),
    SHARE_OTHER(25,"其它方式");

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
