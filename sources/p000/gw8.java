package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: gw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class gw8 implements yv8 {

    /* renamed from: c */
    public static gw8 f29379c;

    /* renamed from: a */
    public final Context f29380a;

    /* renamed from: b */
    public final ContentObserver f29381b;

    public gw8() {
        this.f29380a = null;
        this.f29381b = null;
    }

    public gw8(Context context) {
        this.f29380a = context;
        dw8 dw8 = new dw8(this, (Handler) null);
        this.f29381b = dw8;
        context.getContentResolver().registerContentObserver(ku8.f31083a, true, dw8);
    }

    /* renamed from: b */
    public static gw8 m44959b(Context context) {
        gw8 gw8;
        gw8 gw82;
        synchronized (gw8.class) {
            if (f29379c == null) {
                if (kn4.m20930c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    gw82 = new gw8(context);
                } else {
                    gw82 = new gw8();
                }
                f29379c = gw82;
            }
            gw8 = f29379c;
        }
        return gw8;
    }

    /* renamed from: d */
    public static synchronized void m44960d() {
        Context context;
        synchronized (gw8.class) {
            gw8 gw8 = f29379c;
            if (!(gw8 == null || (context = gw8.f29380a) == null || gw8.f29381b == null)) {
                context.getContentResolver().unregisterContentObserver(f29379c.f29381b);
            }
            f29379c = null;
        }
    }

    /* renamed from: c */
    public final String mo43014a(String str) {
        if (this.f29380a == null) {
            return null;
        }
        try {
            return (String) tv8.m52529a(new aw8(this, str));
        } catch (IllegalStateException | SecurityException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Unable to read GServices for: ".concat(valueOf);
            }
            return null;
        }
    }

    /* renamed from: e */
    public final /* synthetic */ String mo43016e(String str) {
        return ku8.m47538a(this.f29380a.getContentResolver(), str, (String) null);
    }
}
