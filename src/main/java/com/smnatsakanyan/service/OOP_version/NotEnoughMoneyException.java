package com.smnatsakanyan.service.OOP_version;

public class NotEnoughMoneyException extends  RuntimeException{
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
