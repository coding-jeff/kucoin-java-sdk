package com.kucoin.sdk.rest.interfaces;

import java.io.IOException;
import com.kucoin.sdk.rest.request.BorrowLoanApiReq;
import com.kucoin.sdk.rest.request.QueryBorrowRecordApiReq;
import com.kucoin.sdk.rest.request.RepayAllApiReq;
import com.kucoin.sdk.rest.request.RepaySingleApiReq;
import com.kucoin.sdk.rest.response.BorrowApiResp;
import com.kucoin.sdk.rest.response.BorrowOutstandingApiResp;
import com.kucoin.sdk.rest.response.BorrowRepaidApiResp;
import com.kucoin.sdk.rest.response.Pagination;
import com.kucoin.sdk.rest.response.SinglePositionApiResp;
import com.kucoin.sdk.rest.response.UserAssetApiResp;

/**
 * @author liliang
 */
public interface IsolatedAPI {

    Object getIsolatedSymbols() throws IOException;

    UserAssetApiResp getIsolatedAccounts(String balanceCurrency) throws IOException;

    SinglePositionApiResp getSingleIsolatedAccount(String symbol) throws IOException;

    BorrowApiResp borrowLoan(BorrowLoanApiReq req) throws IOException;

    Pagination<BorrowOutstandingApiResp> queryBorrowOutstanding(QueryBorrowRecordApiReq req) throws IOException;

    Pagination<BorrowRepaidApiResp> queryBorrowRepaid(QueryBorrowRecordApiReq req) throws IOException;

    Void repayAll(RepayAllApiReq req) throws IOException;

    Void repaySingle(RepaySingleApiReq req) throws IOException;
}
