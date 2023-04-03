package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AssetPackExtractionService extends Service {

    /* renamed from: a */
    public cs7 f24696a;

    public final IBinder onBind(Intent intent) {
        return this.f24696a;
    }

    public final void onCreate() {
        super.onCreate();
        cu7.m43236h(getApplicationContext()).mo29039b(this);
    }
}
