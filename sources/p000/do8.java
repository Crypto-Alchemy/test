package p000;

import android.content.SharedPreferences;

/* renamed from: do8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class do8 {

    /* renamed from: a */
    public final String f28267a;

    /* renamed from: b */
    public final boolean f28268b;

    /* renamed from: c */
    public boolean f28269c;

    /* renamed from: d */
    public boolean f28270d;

    /* renamed from: e */
    public final /* synthetic */ lp8 f28271e;

    public do8(lp8 lp8, String str, boolean z) {
        this.f28271e = lp8;
        cu4.m43217g(str);
        this.f28267a = str;
        this.f28268b = z;
    }

    /* renamed from: a */
    public final boolean mo41988a() {
        if (!this.f28269c) {
            this.f28269c = true;
            this.f28270d = this.f28271e.mo45479m().getBoolean(this.f28267a, this.f28268b);
        }
        return this.f28270d;
    }

    /* renamed from: b */
    public final void mo41989b(boolean z) {
        SharedPreferences.Editor edit = this.f28271e.mo45479m().edit();
        edit.putBoolean(this.f28267a, z);
        edit.apply();
        this.f28270d = z;
    }
}
