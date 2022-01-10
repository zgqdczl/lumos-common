package com.lin.common.core.exception;

import com.lin.common.core.domain.vo.RestResponse;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * 基础错误类
 * @version 1.0
 * @author: chenzhilin
 * @date: 2022/1/9
 */
@Data
public class BaseException extends Exception {

    private HttpStatus status;

    private RestResponse restResponse;

    public BaseException(String message, String code, HttpStatus status) {
        super(message);
        this.restResponse = new RestResponse(code, message);
        this.status = status;
    }

}
