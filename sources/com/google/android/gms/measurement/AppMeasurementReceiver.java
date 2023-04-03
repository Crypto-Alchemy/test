package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements yp8 {

    /* renamed from: e */
    public aq8 f23058e;

    /* renamed from: a */
    public void mo31356a(Context context, Intent intent) {
        WakefulBroadcastReceiver.m5019c(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f23058e == null) {
            this.f23058e = new aq8(this);
        }
        this.f23058e.mo29040a(context, intent);
    }
}
