/*
 * Copyright (c) 2021 Mek Global Limited
 */

package com.kucoin.sdk.rest.response;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class BorrowApiResp {

    private String orderId;
    private String currency;
    private BigDecimal actualSize;
}
