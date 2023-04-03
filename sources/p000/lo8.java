package p000;

import android.content.SharedPreferences;
import android.util.Pair;

/* renamed from: lo8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class lo8 {

    /* renamed from: a */
    public final String f31348a;

    /* renamed from: b */
    public final String f31349b;

    /* renamed from: c */
    public final String f31350c;

    /* renamed from: d */
    public final long f31351d;

    /* renamed from: e */
    public final /* synthetic */ lp8 f31352e;

    public /* synthetic */ lo8(lp8 lp8, String str, long j, bo8 bo8) {
        boolean z;
        this.f31352e = lp8;
        cu4.m43217g("health_monitor");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43211a(z);
        this.f31348a = "health_monitor:start";
        this.f31349b = "health_monitor:count";
        this.f31350c = "health_monitor:value";
        this.f31351d = j;
    }

    /* renamed from: a */
    public final void mo45474a(String str, long j) {
        this.f31352e.mo29006e();
        if (mo45477d() == 0) {
            mo45476c();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f31352e.mo45479m().getLong(this.f31349b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f31352e.mo45479m().edit();
            edit.putString(this.f31350c, str);
            edit.putLong(this.f31349b, 1);
            edit.apply();
            return;
        }
        long nextLong = this.f31352e.f34342a.mo45243G().mo42813i0().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f31352e.mo45479m().edit();
        if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f31350c, str);
        }
        edit2.putLong(this.f31349b, j3);
        edit2.apply();
    }

    /* renamed from: b */
    public final Pair<String, Long> mo45475b() {
        long j;
        this.f31352e.mo29006e();
        this.f31352e.mo29006e();
        long d = mo45477d();
        if (d == 0) {
            mo45476c();
            j = 0;
        } else {
            j = Math.abs(d - this.f31352e.f34342a.mo45256a().mo29580a());
        }
        long j2 = this.f31351d;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            mo45476c();
            return null;
        }
        String string = this.f31352e.mo45479m().getString(this.f31350c, (String) null);
        long j3 = this.f31352e.mo45479m().getLong(this.f31349b, 0);
        mo45476c();
        if (string == null || j3 <= 0) {
            return lp8.f31353x;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }

    /* renamed from: c */
    public final void mo45476c() {
        this.f31352e.mo29006e();
        long a = this.f31352e.f34342a.mo45256a().mo29580a();
        SharedPreferences.Editor edit = this.f31352e.mo45479m().edit();
        edit.remove(this.f31349b);
        edit.remove(this.f31350c);
        edit.putLong(this.f31348a, a);
        edit.apply();
    }

    /* renamed from: d */
    public final long mo45477d() {
        return this.f31352e.mo45479m().getLong(this.f31348a, 0);
    }
}
