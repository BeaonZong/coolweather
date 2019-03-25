package com.example.tianx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tianx on 2018/5/25.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public  More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
