package com.ginkgocap.ywxt.track.entity.constant;
/**
 * 服务端类型 枚举.
 */
public enum ServerTypeEnum{

    SERVICE_WEB(1,"web端"),
    SERVICE_IOS(2,"ios端"),
    SERVICE_ANDROID(3,"android端"),
    SERVICE_INTERFACE(4,"后端接口");

    private int key;
    private String value;

    ServerTypeEnum(int key, String value) {
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
