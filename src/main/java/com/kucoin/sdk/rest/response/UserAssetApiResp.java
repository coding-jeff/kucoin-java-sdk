package com.kucoin.sdk.rest.response;

import java.math.BigDecimal;
import java.util.List;
import lombok.Data;

@Data
public class UserAssetApiResp {

    private BigDecimal totalConversionBalance;

    private BigDecimal liabilityConversionBalance;

    private List<PositionApiResp> assets;
}
