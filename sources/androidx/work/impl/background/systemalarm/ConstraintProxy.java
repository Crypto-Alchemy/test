package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.NetworkType;
import java.util.List;

public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f7558a = qk3.m25728f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    /* renamed from: a */
    public static void m10550a(Context context, List<an7> list) {
        boolean z;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (an7 an7 : list) {
            nq0 nq0 = an7.f213j;
            z2 |= nq0.mo23764f();
            z3 |= nq0.mo23765g();
            z4 |= nq0.mo23768i();
            if (nq0.mo23759b() != NetworkType.NOT_REQUIRED) {
                z = true;
            } else {
                z = false;
            }
            z5 |= z;
            if (z2 && z3 && z4 && z5) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m10551a(context, z2, z3, z4, z5));
    }

    public void onReceive(Context context, Intent intent) {
        qk3.m25726c().mo25135a(f7558a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(C1539a.m10554a(context));
    }
}
