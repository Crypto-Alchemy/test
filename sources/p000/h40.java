package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: h40 */
/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class h40<T> extends lq0<T> {

    /* renamed from: h */
    public static final String f12727h = qk3.m25728f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    public final BroadcastReceiver f12728g = new C2442a();

    /* renamed from: h40$a */
    /* compiled from: BroadcastReceiverConstraintTracker */
    public class C2442a extends BroadcastReceiver {
        public C2442a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                h40.this.mo19845h(context, intent);
            }
        }
    }

    public h40(Context context, bm6 bm6) {
        super(context, bm6);
    }

    /* renamed from: e */
    public void mo20940e() {
        qk3.m25726c().mo25135a(f12727h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f14632b.registerReceiver(this.f12728g, mo19844g());
    }

    /* renamed from: f */
    public void mo20941f() {
        qk3.m25726c().mo25135a(f12727h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f14632b.unregisterReceiver(this.f12728g);
    }

    /* renamed from: g */
    public abstract IntentFilter mo19844g();

    /* renamed from: h */
    public abstract void mo19845h(Context context, Intent intent);
}
