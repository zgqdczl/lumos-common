package com.lin.common.core.constants;

/**
 * 状态码
 * @version 1.0
 * @author: chenzhilin
 * @date: 2022/1/8
 */
public enum ResponseCodeEnum {
    OK("200", "成功"),
    INTERNAL("500", "服务器内部错误"),
    BAD_REQUEST("400", "客户端错误"),
    UNAUTHORIZED("401", "未授权"),
    NOT_FOUND("404", "网页或文件未找到"),
    FAILED("FAILED", "失败"),
    PARAMS_ERROR("PARAMS_ERROR", "参数校验失败"),
    DATA_IO_ERROR("DATA_IO_ERROR", "请求data-io失败"),
    REPETITION_PARAMS("REPETITION_PARAMS_ERROR", "不能有相同数据");

    private final String code;

    private final String msg;

    public boolean isOK() {
        return OK.getCode().equals(this.code);
    }

    public boolean isFail() {
        return !this.isOK();
    }

    private ResponseCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    @Override
    public String toString() {
        return "ResponseCodeEnum{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
