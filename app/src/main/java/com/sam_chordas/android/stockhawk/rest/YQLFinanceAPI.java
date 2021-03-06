package com.sam_chordas.android.stockhawk.rest;

import com.sam_chordas.android.stockhawk.model.StockDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface YQLFinanceAPI {

    @GET
    Call<StockDetails> getStockData(@Url String query,
                                    @Query("format") String format,
                                    @Query(value = "env", encoded = true) String env,
                                    @Query("callback") String callback);
}
