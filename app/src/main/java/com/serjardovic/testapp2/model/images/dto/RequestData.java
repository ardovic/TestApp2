package com.serjardovic.testapp2.model.images.dto;

import java.io.Serializable;

public class RequestData implements Serializable{

    public int page;

    public RequestData(int page) {
        this.page = page;
    }
}
