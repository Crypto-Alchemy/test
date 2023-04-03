package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f7559a = qk3.m25728f("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    public class C1538a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Intent f7560a;

        /* renamed from: d */
        public final /* synthetic */ Context f7561d;

        /* renamed from: e */
        public final /* synthetic */ BroadcastReceiver.PendingResult f7562e;

        public C1538a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f7560a = intent;
            this.f7561d = context;
            this.f7562e = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f7560a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f7560a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f7560a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f7560a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                qk3.m25726c().mo25135a(ConstraintProxyUpdateReceiver.f7559a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                kk4.m20801a(this.f7561d, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                kk4.m20801a(this.f7561d, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                kk4.m20801a(this.f7561d, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                kk4.m20801a(this.f7561d, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f7562e.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m10551a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            qk3.m25726c().mo25135a(f7559a, String.format("Ignoring unknown action %s", new Object[]{str}), new Throwable[0]);
            return;
        }
        nm7.m23322m(context).mo23744r().mo11700b(new C1538a(intent, context, goAsync()));
    }
}
