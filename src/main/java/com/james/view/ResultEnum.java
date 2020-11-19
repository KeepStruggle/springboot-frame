package com.james.view;

/**
 * @version 1.8
 * @ClassName ResultView
 * @Description 使用枚举类，对返回状态码和提示信息进行封装，以后只需要维护这个枚举类型中的数据即可
 * @Author James
 * @date 2020/10/25 18:44
 */
public enum ResultEnum {
    SUCCESS("0", "success"),

    FAILURE("1", "failure"),

    PARAM_ERROR("2", "incorrect parameter"),

    NONE("3", "none"),

    LOGIN_FAIL("4", "login failed, username or password is incorrect"),

    CUSTOMER_NOT_EXIST("2", "Customer does not exist"),

    CUSTOMER_NOT_FOUND_BY_NAME("21", "Customer can not find by name");

    private String code;
    private String message;

    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
