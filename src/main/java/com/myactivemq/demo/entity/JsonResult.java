package com.myactivemq.demo.entity;

/**
 * @Author:hepo
 * @Version:v1.0
 * @Description:
 * @Date:2018/12/11
 * @Time:22:47
 */

public class JsonResult {

    private String status = null;

    private Object result = null;

    // Getter Setter

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}

