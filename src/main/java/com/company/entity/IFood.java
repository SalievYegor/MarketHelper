package com.company.entity;

import java.time.LocalDate;
import java.util.Date;

public interface IFood extends IGoods{
    void setExpirationDate(LocalDate expirationDate);
    LocalDate getExpirationDate();
}
