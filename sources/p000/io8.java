package p000;

import android.content.SharedPreferences;

/* renamed from: io8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class io8 {

    /* renamed from: a */
    public final String f30087a;

    /* renamed from: b */
    public final long f30088b;

    /* renamed from: c */
    public boolean f30089c;

    /* renamed from: d */
    public long f30090d;

    /* renamed from: e */
    public final /* synthetic */ lp8 f30091e;

    public io8(lp8 lp8, String str, long j) {
        this.f30091e = lp8;
        cu4.m43217g(str);
        this.f30087a = str;
        this.f30088b = j;
    }

    /* renamed from: a */
    public final long mo43882a() {
        if (!this.f30089c) {
            this.f30089c = true;
            this.f30090d = this.f30091e.mo45479m().getLong(this.f30087a, this.f30088b);
        }
        return this.f30090d;
    }

    /* renamed from: b */
    public final void mo43883b(long j) {
        SharedPreferences.Editor edit = this.f30091e.mo45479m().edit();
        edit.putLong(this.f30087a, j);
        edit.apply();
        this.f30090d = j;
    }
}
