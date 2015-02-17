package com.example.carina.intenttest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class BuckysIntentService extends IntentService{

    public static final String TAG ="com.example.carina.intenttest";

    public BuckysIntentService() {
        super("BuckysIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //This is what the service does}
        Log.i(TAG,"The server has started");
    }
}
