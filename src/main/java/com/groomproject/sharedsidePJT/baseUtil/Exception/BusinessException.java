package com.groomproject.sharedsidePJT.baseUtil.Exception;

/**
 * @Author : Jeeseob
 * @CreateAt : 2022/10/04
 */

public class BusinessException extends RuntimeException{
    public BusinessException() {
        super();
    }
    public BusinessException(String exMessage) {
        super(exMessage.getMessage());
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }
}