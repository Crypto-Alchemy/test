package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p000.hx6;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: b */
    public static /* synthetic */ void m33179b() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        ox6.m49601f(context);
        hx6.C5942a d = hx6.m45404a().mo43422b(queryParameter).mo43424d(fv4.m44433b(intValue));
        if (queryParameter2 != null) {
            d.mo43423c(Base64.decode(queryParameter2, 0));
        }
        ox6.m49599c().mo46562e().mo41851k(d.mo43421a(), i, new C6699xe());
    }
}
