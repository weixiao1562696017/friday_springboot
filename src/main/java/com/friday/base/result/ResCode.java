package com.friday.base.result;

/**
 * 响应信息封装
 */
public enum ResCode {
    // 公共请求信息
    SUCCESS(0, "请求成功"),
    TABLE_SUCCESS(0, "请求成功"),
    FAIL(500, "请求失败"),
    PARAMETER_MISSING(600,"参数缺失"),
    UNAUTHORIZED(401,"未授权"),
    // ..一直往后面加

    //用户信息
    //5000100 - 5000200
    USERNAME_REPEAT(5000100,"用户名已存在"),
    PHONE_REPEAT(5000101,"手机号已存在"),
    EMAIL_REPEAT(5000102,"邮箱已存在"),
    //用户-角色
    //5000201 - 5000300
    USER_ROLE_NO_CLEAR(5000201,"该角色存在用户关联，无法删除");

    private Integer code;
    private String msg;

    ResCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // 获取code
    public static Integer getCode(String name){
        for (ResCode item: ResCode.values()){
            if (item.equals(name)){
                return item.code;
            }
        }
        return null;
    }

    // 获取Msg
    public static String getMsg(String name){
        for (ResCode item: ResCode.values()){
            if (item.equals(name)){
                return item.msg;
            }
        }
        return null;
    }
}
