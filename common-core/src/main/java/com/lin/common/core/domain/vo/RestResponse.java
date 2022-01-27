package com.lin.common.core.domain.vo;

import com.lin.common.core.constants.ResponseCodeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Rest响应
 * @version 1.0
 * @author: chenzhilin
 * @date: 2022/1/8
 */
@Data
public class RestResponse<T> implements Serializable {

    @ApiModelProperty(value = "状态码", required = true)
    private String code;

    @ApiModelProperty(value = "信息描述", required = true)
    private String message;

    @ApiModelProperty(value = "数据", required = true)
    private T data;

    public RestResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public RestResponse(T data) {
        this(ResponseCodeEnum.OK.getCode(), ResponseCodeEnum.OK.getMsg(), data);
    }

    public RestResponse(String code, String msg) {
        this(code, msg, null);
    }

}
