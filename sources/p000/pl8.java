package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pl8 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class pl8 {

    /* renamed from: e */
    public static pl8 f32729e;

    /* renamed from: a */
    public final Context f32730a;

    /* renamed from: b */
    public final ScheduledExecutorService f32731b;

    /* renamed from: c */
    public xo8 f32732c = new xo8(this);

    /* renamed from: d */
    public int f32733d = 1;

    public pl8(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f32731b = scheduledExecutorService;
        this.f32730a = context.getApplicationContext();
    }

    /* renamed from: e */
    public static synchronized pl8 m49990e(Context context) {
        pl8 pl8;
        synchronized (pl8.class) {
            if (f32729e == null) {
                f32729e = new pl8(context, f48.m44202a().mo28901b(1, new z24("MessengerIpcClient"), dp8.f28273b));
            }
            pl8 = f32729e;
        }
        return pl8;
    }

    /* renamed from: a */
    public final synchronized int mo46775a() {
        int i;
        i = this.f32733d;
        this.f32733d = i + 1;
        return i;
    }

    /* renamed from: b */
    public final tl6<Void> mo46776b(int i, Bundle bundle) {
        return mo46777c(new qb9(mo46775a(), 2, bundle));
    }

    /* renamed from: c */
    public final synchronized <T> tl6<T> mo46777c(tg9<T> tg9) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(tg9);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
        }
        if (!this.f32732c.mo49525e(tg9)) {
            xo8 xo8 = new xo8(this);
            this.f32732c = xo8;
            xo8.mo49525e(tg9);
        }
        return tg9.f34262b.mo49503a();
    }

    /* renamed from: f */
    public final tl6<Bundle> mo46778f(int i, Bundle bundle) {
        return mo46777c(new mi9(mo46775a(), 1, bundle));
    }
}
