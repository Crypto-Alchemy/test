package p000;

import android.content.SharedPreferences;

/* renamed from: ip8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class ip8 {

    /* renamed from: a */
    public final String f30096a;

    /* renamed from: b */
    public boolean f30097b;

    /* renamed from: c */
    public String f30098c;

    /* renamed from: d */
    public final /* synthetic */ lp8 f30099d;

    public ip8(lp8 lp8, String str, String str2) {
        this.f30099d = lp8;
        cu4.m43217g(str);
        this.f30096a = str;
    }

    /* renamed from: a */
    public final String mo43884a() {
        if (!this.f30097b) {
            this.f30097b = true;
            this.f30098c = this.f30099d.mo45479m().getString(this.f30096a, (String) null);
        }
        return this.f30098c;
    }

    /* renamed from: b */
    public final void mo43885b(String str) {
        SharedPreferences.Editor edit = this.f30099d.mo45479m().edit();
        edit.putString(this.f30096a, str);
        edit.apply();
        this.f30098c = str;
    }
}
