package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: k00 */
/* compiled from: BatteryNotLowTracker */
public class k00 extends h40<Boolean> {

    /* renamed from: i */
    public static final String f13955i = qk3.m25728f("BatteryNotLowTracker");

    public k00(Context context, bm6 bm6) {
        super(context, bm6);
    }

    /* renamed from: g */
    public IntentFilter mo19844g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: h */
    public void mo19845h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            qk3.m25726c().mo25135a(f13955i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                mo22923d(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                mo22923d(Boolean.FALSE);
            }
        }
    }

    /* renamed from: i */
    public Boolean mo19843b() {
        Intent registerReceiver = this.f14632b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            qk3.m25726c().mo25136b(f13955i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
