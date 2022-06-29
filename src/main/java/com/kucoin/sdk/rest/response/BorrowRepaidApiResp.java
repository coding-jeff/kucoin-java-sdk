package com.kucoin.sdk.rest.response;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class BorrowRepaidApiResp {

    private String loanId;

    private String symbol;

    private String currency;

    private BigDecimal principalTotal;

    private BigDecimal interestBalance;

    private BigDecimal repaidSize;

    private Date createdAt;

    private Integer period;

    private BigDecimal dailyInterestRate;

    private Date repayFinishAt;
}
