package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: fa6 */
/* compiled from: StorageNotLowTracker */
public class fa6 extends h40<Boolean> {

    /* renamed from: i */
    public static final String f11688i = qk3.m25728f("StorageNotLowTracker");

    public fa6(Context context, bm6 bm6) {
        super(context, bm6);
    }

    /* renamed from: g */
    public IntentFilter mo19844g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: h */
    public void mo19845h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            qk3.m25726c().mo25135a(f11688i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                mo22923d(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                mo22923d(Boolean.TRUE);
            }
        }
    }

    /* renamed from: i */
    public Boolean mo19843b() {
        Intent registerReceiver = this.f14632b.registerReceiver((BroadcastReceiver) null, mo19844g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }
}
