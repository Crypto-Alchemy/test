package p000;

import android.net.Uri;

/* renamed from: n88 */
public final class n88 {

    /* renamed from: a */
    public final String f31995a;

    /* renamed from: b */
    public final Uri f31996b;

    /* renamed from: c */
    public final String f31997c;

    /* renamed from: d */
    public final String f31998d;

    /* renamed from: e */
    public final boolean f31999e;

    /* renamed from: f */
    public final boolean f32000f;

    public n88(Uri uri) {
        this((String) null, uri, "", "", false, false);
    }

    public n88(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.f31995a = str;
        this.f31996b = uri;
        this.f31997c = str2;
        this.f31998d = str3;
        this.f31999e = z;
        this.f32000f = z2;
    }

    /* renamed from: b */
    public final <T> i68<T> mo46029b(String str, T t, k88<T> k88) {
        return i68.m45486e(this, str, t, k88);
    }

    /* renamed from: c */
    public final i68<String> mo46030c(String str, String str2) {
        return i68.m45487f(this, str, (String) null);
    }

    /* renamed from: f */
    public final i68<Boolean> mo46031f(String str, boolean z) {
        return i68.m45488g(this, str, false);
    }

    /* renamed from: g */
    public final n88 mo46032g(String str) {
        boolean z = this.f31999e;
        if (!z) {
            return new n88(this.f31995a, this.f31996b, str, this.f31998d, z, this.f32000f);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: i */
    public final n88 mo46033i(String str) {
        return new n88(this.f31995a, this.f31996b, this.f31997c, str, this.f31999e, this.f32000f);
    }
}
