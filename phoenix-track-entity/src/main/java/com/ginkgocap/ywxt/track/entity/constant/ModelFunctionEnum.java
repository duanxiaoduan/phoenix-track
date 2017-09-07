package com.ginkgocap.ywxt.track.entity.constant;

/**
 * 业务模块下的功能 枚举.
 */
public enum ModelFunctionEnum {

    MODEL_FUNCTION_ADD_MESSAGE(1,"新增消息"),
    MODEL_FUNCTION_ADD_DYNAMIC(2,"新增动态"),
    MODEL_FUNCTION_ADD_FILE(3,"新增文件"),
    MODEL_FUNCTION_ADD_MEMBER(4,"新增成员"),
    MODEL_FUNCTION_ADD_ANSWER(5,"新增回答"),
    MODEL_FUNCTION_ADD_VIDEO(6,"新增视频"),
    MODEL_FUNCTION_VIEW_MEMBER(7,"进入'会员中心'"),
    MODEL_FUNCTION_BUY_MEMBER(8,"购买会员");

    private int key;
    private String value;

    ModelFunctionEnum(int key, String value) {
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
