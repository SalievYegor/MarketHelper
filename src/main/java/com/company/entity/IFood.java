package com.company.entity;

import java.util.Date;

public interface IFood extends IGoods{
    void setExpirationDate(Date expirationDate);
    Date getExpirationDate();
}
