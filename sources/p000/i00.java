package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: i00 */
/* compiled from: BatteryChargingTracker */
public class i00 extends h40<Boolean> {

    /* renamed from: i */
    public static final String f13122i = qk3.m25728f("BatteryChrgTracker");

    public i00(Context context, bm6 bm6) {
        super(context, bm6);
    }

    /* renamed from: g */
    public IntentFilter mo19844g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r6.equals("android.os.action.DISCHARGING") == false) goto L_0x0026;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19845h(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            qk3 r7 = p000.qk3.m25726c()
            java.lang.String r0 = f13122i
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.mo25135a(r0, r2, r4)
            r7 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1886648615: goto L_0x0047;
                case -54942926: goto L_0x003e;
                case 948344062: goto L_0x0033;
                case 1019184907: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r1 = r7
            goto L_0x0051
        L_0x0028:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r1 = 3
            goto L_0x0051
        L_0x0033:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003c
            goto L_0x0026
        L_0x003c:
            r1 = 2
            goto L_0x0051
        L_0x003e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0047:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0050
            goto L_0x0026
        L_0x0050:
            r1 = r3
        L_0x0051:
            switch(r1) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0061;
                case 2: goto L_0x005b;
                case 3: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x006c
        L_0x0055:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo22923d(r6)
            goto L_0x006c
        L_0x005b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo22923d(r6)
            goto L_0x006c
        L_0x0061:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.mo22923d(r6)
            goto L_0x006c
        L_0x0067:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.mo22923d(r6)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i00.mo19845h(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: i */
    public Boolean mo19843b() {
        Intent registerReceiver = this.f14632b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(mo21428j(registerReceiver));
        }
        qk3.m25726c().mo25136b(f13122i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    /* renamed from: j */
    public final boolean mo21428j(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }
}
