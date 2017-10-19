package com.ginkgocap.ywxt.track.entity.constant;

/**
 * 请求方法 枚举.
 * @author
 */
public enum MethodTypeEnum {

    REQUEST_METHOD_GET(1, "GET"),
    REQUEST_METHOD_POST(2, "POST"),
    REQUEST_METHOD_PUT(3, "PUT"),
    REQUEST_METHOD_DELETE(4, "DELETE");

    private int key;
    private String value;

    MethodTypeEnum(int key, String value) {
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
