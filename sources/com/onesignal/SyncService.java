package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.onesignal.C5312q0;

public class SyncService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C5312q0.m41240q().mo39090b(this, new C5312q0.C5313a(this));
        return 1;
    }
}
