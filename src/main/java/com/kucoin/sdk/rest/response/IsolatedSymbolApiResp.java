package com.kucoin.sdk.rest.response;

import java.math.BigDecimal;
import lombok.Data;


@Data
public class IsolatedSymbolApiResp {

    private String symbol;

    private String symbolName;

    private String baseCurrency;

    private String quoteCurrency;

    private Integer maxLeverage;

    private BigDecimal flDebtRatio;

    private Boolean tradeEnable;

    private BigDecimal autoRenewMaxDebtRatio;

    private Boolean baseBorrowEnable;

    private Boolean quoteBorrowEnable;

    private Boolean baseTransferInEnable;

    private Boolean quoteTransferInEnable;
}
