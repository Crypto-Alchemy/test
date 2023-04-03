package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zabx extends BroadcastReceiver {

    /* renamed from: a */
    public Context f22235a;

    /* renamed from: b */
    public final a08 f22236b;

    public zabx(a08 a08) {
        this.f22236b = a08;
    }

    /* renamed from: a */
    public final void mo30604a(Context context) {
        this.f22235a = context;
    }

    /* renamed from: b */
    public final synchronized void mo30605b() {
        Context context = this.f22235a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f22235a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f22236b.mo28688a();
            mo30605b();
        }
    }
}
