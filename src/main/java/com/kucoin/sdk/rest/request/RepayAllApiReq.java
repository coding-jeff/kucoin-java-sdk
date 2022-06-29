package com.kucoin.sdk.rest.request;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class RepayAllApiReq {

    private String symbol;

    private String currency;

    private BigDecimal size;

    private String seqStrategy;
}
