/*
 * Copyright (c) 2021 Mek Global Limited
 */

package com.kucoin.sdk.rest.response;

import java.math.BigDecimal;
import lombok.Data;

/**
 * api-单个逐仓账户信息响应对象
 *
 * @author liliang
 */
@Data
public class SinglePositionApiResp {

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
