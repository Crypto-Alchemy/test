package p000;

import android.content.Context;

/* renamed from: ht6 */
/* compiled from: Trackers */
public class ht6 {

    /* renamed from: e */
    public static ht6 f13062e;

    /* renamed from: a */
    public i00 f13063a;

    /* renamed from: b */
    public k00 f13064b;

    /* renamed from: c */
    public v54 f13065c;

    /* renamed from: d */
    public fa6 f13066d;

    public ht6(Context context, bm6 bm6) {
        Context applicationContext = context.getApplicationContext();
        this.f13063a = new i00(applicationContext, bm6);
        this.f13064b = new k00(applicationContext, bm6);
        this.f13065c = new v54(applicationContext, bm6);
        this.f13066d = new fa6(applicationContext, bm6);
    }

    /* renamed from: c */
    public static synchronized ht6 m19260c(Context context, bm6 bm6) {
        ht6 ht6;
        synchronized (ht6.class) {
            if (f13062e == null) {
                f13062e = new ht6(context, bm6);
            }
            ht6 = f13062e;
        }
        return ht6;
    }

    /* renamed from: a */
    public i00 mo21384a() {
        return this.f13063a;
    }

    /* renamed from: b */
    public k00 mo21385b() {
        return this.f13064b;
    }

    /* renamed from: d */
    public v54 mo21386d() {
        return this.f13065c;
    }

    /* renamed from: e */
    public fa6 mo21387e() {
        return this.f13066d;
    }
}
