package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: gx8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class gx8 {

    /* renamed from: a */
    public final String f29388a = null;

    /* renamed from: b */
    public final Uri f29389b;

    /* renamed from: c */
    public final String f29390c;

    /* renamed from: d */
    public final String f29391d;

    /* renamed from: e */
    public final boolean f29392e;

    /* renamed from: f */
    public final boolean f29393f;

    /* renamed from: g */
    public final boolean f29394g;

    /* renamed from: h */
    public final boolean f29395h;

    /* renamed from: i */
    public final yx8<Context, Boolean> f29396i;

    public gx8(Uri uri) {
        this.f29389b = uri;
        this.f29390c = "";
        this.f29391d = "";
        this.f29392e = false;
        this.f29393f = false;
        this.f29394g = false;
        this.f29395h = false;
        this.f29396i = null;
    }

    /* renamed from: a */
    public final lx8<Long> mo43038a(String str, long j) {
        return new ww8(this, str, Long.valueOf(j), true);
    }

    /* renamed from: b */
    public final lx8<Boolean> mo43039b(String str, boolean z) {
        return new yw8(this, str, Boolean.valueOf(z), true);
    }

    /* renamed from: c */
    public final lx8<Double> mo43040c(String str, double d) {
        return new ax8(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final lx8<String> mo43041d(String str, String str2) {
        return new dx8(this, str, str2, true);
    }
}
