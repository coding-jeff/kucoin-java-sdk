package com.kucoin.sdk.rest.request;

import lombok.Data;

@Data
public class QueryBorrowRecordApiReq {

    private String symbol;

    private String currency;

    private Integer pageSize = 10;

    private Integer currentPage = 1;

}
