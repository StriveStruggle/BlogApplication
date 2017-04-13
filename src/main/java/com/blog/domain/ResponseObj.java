package com.blog.domain;

/**
 * Created by lenovo on 2017/4/13.
 */
public class ResponseObj<T> {
    public final static int OK = 0, FAILED = -1, EMPTY = -1;
    public final static String OK_STR = "成功", FAILED_STR = "失败", EMPTY_STR = "数据为空";
    private int code;//状态码，0成功；-1请求失败；1空数据
    private String msg;
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
