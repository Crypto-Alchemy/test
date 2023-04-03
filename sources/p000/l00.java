package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: l00 */
/* compiled from: BatteryState */
public class l00 {

    /* renamed from: a */
    public final Float f31141a;

    /* renamed from: b */
    public final boolean f31142b;

    public l00(Float f, boolean z) {
        this.f31142b = z;
        this.f31141a = f;
    }

    /* renamed from: a */
    public static l00 m47582a(Context context) {
        Float f = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m47584e(registerReceiver);
                f = m47583d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            rk3.m51112f().mo47426e("An error occurred getting battery state.", e);
        }
        return new l00(f, z);
    }

    /* renamed from: d */
    public static Float m47583d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    /* renamed from: e */
    public static boolean m47584e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Float mo45317b() {
        return this.f31141a;
    }

    /* renamed from: c */
    public int mo45318c() {
        Float f;
        if (!this.f31142b || (f = this.f31141a) == null) {
            return 1;
        }
        if (((double) f.floatValue()) < 0.99d) {
            return 2;
        }
        return 3;
    }
}
