package p000;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;

/* renamed from: bw3 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class bw3 {

    /* renamed from: b */
    public static final Object f21506b = new Object();

    /* renamed from: c */
    public static bw3 f21507c;

    /* renamed from: a */
    public jn0 f21508a;

    /* renamed from: c */
    public static bw3 m32784c() {
        boolean z;
        bw3 bw3;
        synchronized (f21506b) {
            if (f21507c != null) {
                z = true;
            } else {
                z = false;
            }
            cu4.m43226p(z, "MlKitContext has not been initialized");
            bw3 = (bw3) cu4.m43221k(f21507c);
        }
        return bw3;
    }

    /* renamed from: d */
    public static bw3 m32785d(Context context) {
        boolean z;
        bw3 bw3;
        synchronized (f21506b) {
            if (f21507c == null) {
                z = true;
            } else {
                z = false;
            }
            cu4.m43226p(z, "MlKitContext is already initialized");
            bw3 bw32 = new bw3();
            f21507c = bw32;
            Context e = m32786e(context);
            jn0 e2 = jn0.m46638h(em6.f28634a).mo44533d(bn0.m32633c(e, MlKitComponentDiscoveryService.class).mo29653b()).mo44531b(sm0.m51841p(e, Context.class, new Class[0])).mo44531b(sm0.m51841p(bw32, bw3.class, new Class[0])).mo44534e();
            bw32.f21508a = e2;
            e2.mo44526k(true);
            bw3 = f21507c;
        }
        return bw3;
    }

    /* renamed from: e */
    public static Context m32786e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }

    /* renamed from: a */
    public <T> T mo29796a(Class<T> cls) {
        boolean z;
        if (f21507c == this) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43226p(z, "MlKitContext has been deleted");
        cu4.m43221k(this.f21508a);
        return this.f21508a.get(cls);
    }

    /* renamed from: b */
    public Context mo29797b() {
        return (Context) mo29796a(Context.class);
    }
}
