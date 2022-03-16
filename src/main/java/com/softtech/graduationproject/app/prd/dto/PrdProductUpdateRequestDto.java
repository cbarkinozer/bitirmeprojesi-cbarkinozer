package com.softtech.graduationproject.app.prd.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PrdProductUpdateRequestDto {

    private Long id;
    private Long usrUserId;
    private Long vrtVatRateId;
    private String name;
    private BigDecimal vatFreePrice;
}
