package com.groomproject.sharedsidePJT.baseUtil.Exception;

/**
 * @Author : Jeeseob
 * @CreateAt : 2022/10/04
 */

public class BussinessException extends RuntimeException{
    public BussinessException(String exMessage) {
        super(exMessage.getMessage());
    }
}