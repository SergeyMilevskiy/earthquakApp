package com.sergey.coremodule.model.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.util.Log;

import com.sergey.coremodule.model.pojo.FeatureCollection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sergey on 06.08.16.
 */
public class NetworkManager {

    private static final String BASE_URL = "http://earthquake.usgs.gov/fdsnws/event/1/";
    private static NetworkManager instance;
    private WebApi webApi;
    private ConnectivityManager cm;
    private static final String FORMAT = "geojson";

    private Calling calling;
    private FeatureCollection featureCollection;


    private NetworkManager(Context ctx , Calling calling ) {

        Retrofit retrofit = getRetrofit();
        webApi = retrofit.create(WebApi.class);
        cm = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        this.calling = calling;

    }

    public static NetworkManager getInstance(Context context, Calling calling) {

        if (instance == null) {
            instance = new NetworkManager(context, calling);
        }
        return instance;

    }

    private Retrofit getRetrofit() {

        /**
         * Interceptor for debug purpose.
         * Of course we doesn't have to use on production it.
         */
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public void getLastTenEarthQuke(String startDate, String endDate) {

        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        boolean isConnected = networkInfo != null && networkInfo.isConnectedOrConnecting();
        if (isConnected) {
            Call<FeatureCollection> call = webApi.getSerarchResult(FORMAT, startDate, endDate, "5");

            call.enqueue(new Callback<FeatureCollection>() {
                @Override
                public void onResponse(Call<FeatureCollection> call, Response<FeatureCollection> response) {
                    if (response.isSuccessful()) {
                        Log.d("Sergey", "OK");

                        featureCollection = response.body();
                        calling.ready();

                    }
                }

                @Override
                public void onFailure(Call<FeatureCollection> call, Throwable t) {
                    Log.d("Sergey", "Not Ok");
                    t.printStackTrace();
                }
            });
        }

    }

    public FeatureCollection getFeatureCollection(){
        return featureCollection;
    }
}
