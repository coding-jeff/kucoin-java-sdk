package com.kucoin.sdk.rest.adapter;

import java.io.IOException;
import java.util.List;
import com.kucoin.sdk.rest.impl.retrofit.AuthRetrofitAPIImpl;
import com.kucoin.sdk.rest.interfaces.IsolatedAPI;
import com.kucoin.sdk.rest.interfaces.retrofit.IsolatedAPIRetrofit;
import com.kucoin.sdk.rest.request.BorrowLoanApiReq;
import com.kucoin.sdk.rest.request.QueryBorrowRecordApiReq;
import com.kucoin.sdk.rest.request.RepayAllApiReq;
import com.kucoin.sdk.rest.request.RepaySingleApiReq;
import com.kucoin.sdk.rest.response.BorrowApiResp;
import com.kucoin.sdk.rest.response.BorrowOutstandingApiResp;
import com.kucoin.sdk.rest.response.BorrowRepaidApiResp;
import com.kucoin.sdk.rest.response.IsolatedSymbolApiResp;
import com.kucoin.sdk.rest.response.Pagination;
import com.kucoin.sdk.rest.response.SinglePositionApiResp;
import com.kucoin.sdk.rest.response.UserAssetApiResp;

/**
 * @author liliang
 */
public class IsolatedAPIAdapter extends AuthRetrofitAPIImpl<IsolatedAPIRetrofit> implements IsolatedAPI {

    public IsolatedAPIAdapter(String baseUrl, String apiKey, String secret, String passPhrase, Integer apiKeyVersion) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
        this.secret = secret;
        this.passPhrase = passPhrase;
        this.apiKeyVersion = apiKeyVersion;
    }

    @Override
    public List<IsolatedSymbolApiResp> getIsolatedSymbols() throws IOException {
        return executeSync(getAPIImpl().getIsolatedSymbols());
    }

    @Override
    public UserAssetApiResp getIsolatedAccounts(String balanceCurrency) throws IOException {
        return executeSync(getAPIImpl().getIsolatedAccounts(balanceCurrency));
    }

    @Override
    public SinglePositionApiResp getSingleIsolatedAccount(String symbol) throws IOException {
        return executeSync(getAPIImpl().getSingleIsolatedAccount(symbol));
    }

    @Override
    public BorrowApiResp borrowLoan(BorrowLoanApiReq req) throws IOException {
        return executeSync(getAPIImpl().borrowLoan(req));
    }

    @Override
    public Pagination<BorrowOutstandingApiResp> queryBorrowOutstanding(QueryBorrowRecordApiReq req) throws IOException {
        return executeSync(getAPIImpl().queryBorrowOutstanding(req));
    }

    @Override
    public Pagination<BorrowRepaidApiResp> queryBorrowRepaid(QueryBorrowRecordApiReq req) throws IOException {
        return executeSync(getAPIImpl().queryBorrowRepaid(req));
    }

    @Override
    public Void repayAll(RepayAllApiReq req) throws IOException {
        return executeSync(getAPIImpl().repayAll(req));
    }

    @Override
    public Void repaySingle(RepaySingleApiReq req) throws IOException {
        return executeSync(getAPIImpl().repaySingle(req));
    }
}
