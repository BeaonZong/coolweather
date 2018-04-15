package com.example.tianx.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by tianx on 2018/4/7.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request;
        request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
