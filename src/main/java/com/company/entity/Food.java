package com.company.entity;

import java.util.Date;

public class Food extends Goods implements IFood {

    private Date expirationDate;

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}



