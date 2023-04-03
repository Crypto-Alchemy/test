package p000;

import androidx.media3.common.C0842w;

/* renamed from: gt6 */
/* compiled from: TrackSelectorResult */
public final class gt6 {

    /* renamed from: a */
    public final int f12609a;

    /* renamed from: b */
    public final pd5[] f12610b;

    /* renamed from: c */
    public final dx1[] f12611c;

    /* renamed from: d */
    public final C0842w f12612d;

    /* renamed from: e */
    public final Object f12613e;

    public gt6(pd5[] pd5Arr, dx1[] dx1Arr, C0842w wVar, Object obj) {
        this.f12610b = pd5Arr;
        this.f12611c = (dx1[]) dx1Arr.clone();
        this.f12612d = wVar;
        this.f12613e = obj;
        this.f12609a = pd5Arr.length;
    }

    /* renamed from: a */
    public boolean mo20845a(gt6 gt6) {
        if (gt6 == null || gt6.f12611c.length != this.f12611c.length) {
            return false;
        }
        for (int i = 0; i < this.f12611c.length; i++) {
            if (!mo20846b(gt6, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo20846b(gt6 gt6, int i) {
        if (gt6 != null && w67.m29346c(this.f12610b[i], gt6.f12610b[i]) && w67.m29346c(this.f12611c[i], gt6.f12611c[i])) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo20847c(int i) {
        if (this.f12610b[i] != null) {
            return true;
        }
        return false;
    }
}
