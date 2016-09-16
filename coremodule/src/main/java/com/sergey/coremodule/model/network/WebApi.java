package com.sergey.coremodule.model.network;

import com.sergey.coremodule.model.pojo.FeatureCollection;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sergey on 05.08.16.
 */
public interface WebApi {

    String API_SEARCH_EARTHQUKE = "query";
    String FORMAT = "geojson";
    //String API_

    @GET(API_SEARCH_EARTHQUKE)
     Call <FeatureCollection> getSerarchResult (@Query("format") String format,
                                                @Query("starttime") String starTime,
                                                @Query("endtime") String endTime,
                                                @Query("minmagnitude") String minMagnitude);

    @GET(API_SEARCH_EARTHQUKE)
     Call <FeatureCollection> getLastTen();


}
