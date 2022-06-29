/*
 * Copyright (c) 2021 Mek Global Limited
 */

package com.kucoin.sdk.rest.response;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class PositionApiResp {

    private String symbol;

    private String status;

    private BigDecimal debtRatio;

    private AssetResp baseAsset;

    private AssetResp quoteAsset;

    @Data
    public static class AssetResp {

        private String currency;

        private BigDecimal totalBalance;

        private BigDecimal holdBalance;

        private BigDecimal availableBalance;

        private BigDecimal liability;

        private BigDecimal interest;

        private BigDecimal borrowableAmount;
    }

}
