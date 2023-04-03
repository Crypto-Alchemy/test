package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class NotificationOpenedActivityHMS extends Activity {
    /* renamed from: a */
    public final void mo38442a() {
        mo38443b(getIntent());
        finish();
    }

    /* renamed from: b */
    public final void mo38443b(Intent intent) {
        C5304o.m41182b(this, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo38442a();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mo38442a();
    }
}
