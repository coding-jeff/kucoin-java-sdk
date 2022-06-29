package com.kucoin.sdk.rest.interfaces.retrofit;

import java.io.IOException;
import java.util.List;
import com.kucoin.sdk.rest.request.BorrowLoanApiReq;
import com.kucoin.sdk.rest.request.QueryBorrowRecordApiReq;
import com.kucoin.sdk.rest.request.RepayAllApiReq;
import com.kucoin.sdk.rest.request.RepaySingleApiReq;
import com.kucoin.sdk.rest.response.BorrowApiResp;
import com.kucoin.sdk.rest.response.BorrowOutstandingApiResp;
import com.kucoin.sdk.rest.response.BorrowRepaidApiResp;
import com.kucoin.sdk.rest.response.IsolatedSymbolApiResp;
import com.kucoin.sdk.rest.response.KucoinResponse;
import com.kucoin.sdk.rest.response.Pagination;
import com.kucoin.sdk.rest.response.SinglePositionApiResp;
import com.kucoin.sdk.rest.response.UserAssetApiResp;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
/**
 * @author liliang
 */
public interface IsolatedAPIRetrofit {

    @GET("api/v1/isolated/symbols")
    Call<KucoinResponse<List<IsolatedSymbolApiResp>>> getIsolatedSymbols() throws IOException;

    @GET("api/v1/isolated/accounts")
    Call<KucoinResponse<UserAssetApiResp>> getIsolatedAccounts(@Query("orderId") String balanceCurrency) throws IOException;

    @GET("api/v1/isolated/account/{symbol}")
    Call<KucoinResponse<SinglePositionApiResp>> getSingleIsolatedAccount(@Path("symbol") String symbol) throws IOException;

    @POST("api/v1/isolated/borrow")
    Call<KucoinResponse<BorrowApiResp>> borrowLoan(@Body BorrowLoanApiReq req) throws IOException;

    @GET("api/v1/isolated/borrow/outstanding")
    Call<KucoinResponse<Pagination<BorrowOutstandingApiResp>>> queryBorrowOutstanding(@Body QueryBorrowRecordApiReq req) throws IOException;

    @GET("api/v1/isolated/borrow/repaid")
    Call<KucoinResponse<Pagination<BorrowRepaidApiResp>>> queryBorrowRepaid(@Body QueryBorrowRecordApiReq req) throws IOException;

    @POST("api/v1/isolated/repay/all")
    Call<KucoinResponse<Void>>  repayAll(@Body RepayAllApiReq req) throws IOException;

    @POST("api/v1/isolated/repay/single")
    Call<KucoinResponse<Void>>  repaySingle(@Body RepaySingleApiReq req) throws IOException;
}
