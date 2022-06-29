package com.kucoin.sdk.rest.response;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BorrowOutstandingApiResp {

    private String loanId;

    private String symbol;

    private String currency;

    private BigDecimal liabilityBalance;

    private BigDecimal principalTotal;

    private BigDecimal interestBalance;

    private Date createdAt;

    private Date maturityTime;

    private Integer period;

    private BigDecimal repaidSize;

    private BigDecimal dailyInterestRate;
}
