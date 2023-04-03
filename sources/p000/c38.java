package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: c38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class c38 extends zr0 {
    @Deprecated
    /* renamed from: m */
    public static Intent m32849m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i;
        if (!x28.m54170a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        if (true != x28.m54170a()) {
            i = 0;
        } else {
            i = 2;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, i);
    }
}
