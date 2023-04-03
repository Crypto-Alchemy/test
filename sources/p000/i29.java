package p000;

import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import p000.C5889hd;

/* renamed from: i29 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class i29 extends t49 {

    /* renamed from: d */
    public String f29789d;

    /* renamed from: e */
    public boolean f29790e;

    /* renamed from: f */
    public long f29791f;

    /* renamed from: g */
    public final io8 f29792g;

    /* renamed from: h */
    public final io8 f29793h;

    /* renamed from: i */
    public final io8 f29794i;

    /* renamed from: j */
    public final io8 f29795j;

    /* renamed from: k */
    public final io8 f29796k;

    public i29(s59 s59) {
        super(s59);
        lp8 z = this.f34342a.mo45275z();
        z.getClass();
        this.f29792g = new io8(z, "last_delete_stale", 0);
        lp8 z2 = this.f34342a.mo45275z();
        z2.getClass();
        this.f29793h = new io8(z2, "backoff", 0);
        lp8 z3 = this.f34342a.mo45275z();
        z3.getClass();
        this.f29794i = new io8(z3, "last_upload", 0);
        lp8 z4 = this.f34342a.mo45275z();
        z4.getClass();
        this.f29795j = new io8(z4, "last_upload_attempt", 0);
        lp8 z5 = this.f34342a.mo45275z();
        z5.getClass();
        this.f29796k = new io8(z5, "midnight_offset", 0);
    }

    /* renamed from: h */
    public final boolean mo43450h() {
        return false;
    }

    /* renamed from: j */
    public final Pair<String, Boolean> mo43451j(String str, u68 u68) {
        if (u68.mo48329f()) {
            return mo43452k(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    /* renamed from: k */
    public final Pair<String, Boolean> mo43452k(String str) {
        mo29006e();
        long b = this.f34342a.mo45256a().mo29581b();
        String str2 = this.f29789d;
        if (str2 != null && b < this.f29791f) {
            return new Pair<>(str2, Boolean.valueOf(this.f29790e));
        }
        this.f29791f = b + this.f34342a.mo45274y().mo45993p(str, rl8.f33488c);
        C5889hd.m45128d(true);
        try {
            C5889hd.C5890a b2 = C5889hd.m45127b(this.f34342a.mo45271q());
            this.f29789d = "";
            String a = b2.mo43135a();
            if (a != null) {
                this.f29789d = a;
            }
            this.f29790e = b2.mo43136b();
        } catch (Exception e) {
            this.f34342a.mo45237A().mo29677u().mo48770b("Unable to get advertising id", e);
            this.f29789d = "";
        }
        C5889hd.m45128d(false);
        return new Pair<>(this.f29789d, Boolean.valueOf(this.f29790e));
    }

    @Deprecated
    /* renamed from: l */
    public final String mo43453l(String str) {
        mo29006e();
        String str2 = (String) mo43452k(str).first;
        MessageDigest B = g69.m44574B();
        if (B == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, B.digest(str2.getBytes()))});
    }
}
