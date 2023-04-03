package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: gs6 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class gs6 {

    /* renamed from: d */
    public static WeakReference<gs6> f29340d;

    /* renamed from: a */
    public final SharedPreferences f29341a;

    /* renamed from: b */
    public e06 f29342b;

    /* renamed from: c */
    public final Executor f29343c;

    public gs6(SharedPreferences sharedPreferences, Executor executor) {
        this.f29343c = executor;
        this.f29341a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized gs6 m44888a(Context context, Executor executor) {
        gs6 gs6;
        synchronized (gs6.class) {
            WeakReference<gs6> weakReference = f29340d;
            if (weakReference != null) {
                gs6 = weakReference.get();
            } else {
                gs6 = null;
            }
            if (gs6 != null) {
                return gs6;
            }
            gs6 gs62 = new gs6(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            gs62.mo42970c();
            f29340d = new WeakReference<>(gs62);
            return gs62;
        }
    }

    /* renamed from: b */
    public synchronized fs6 mo42969b() {
        return fs6.m44382a(this.f29342b.mo42102e());
    }

    /* renamed from: c */
    public final synchronized void mo42970c() {
        this.f29342b = e06.m43751c(this.f29341a, "topic_operation_queue", ",", this.f29343c);
    }

    /* renamed from: d */
    public synchronized boolean mo42971d(fs6 fs6) {
        return this.f29342b.mo42103f(fs6.mo42654e());
    }
}
