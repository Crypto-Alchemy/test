package p000;

import androidx.media3.common.C0792h;

/* renamed from: p31 */
/* compiled from: DecoderReuseEvaluation */
public final class p31 {

    /* renamed from: a */
    public final String f16267a;

    /* renamed from: b */
    public final C0792h f16268b;

    /* renamed from: c */
    public final C0792h f16269c;

    /* renamed from: d */
    public final int f16270d;

    /* renamed from: e */
    public final int f16271e;

    public p31(String str, C0792h hVar, C0792h hVar2, int i, int i2) {
        boolean z;
        if (i == 0 || i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f16267a = C2725kr.m20984d(str);
        this.f16268b = (C0792h) C2725kr.m20985e(hVar);
        this.f16269c = (C0792h) C2725kr.m20985e(hVar2);
        this.f16270d = i;
        this.f16271e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p31.class != obj.getClass()) {
            return false;
        }
        p31 p31 = (p31) obj;
        if (this.f16270d != p31.f16270d || this.f16271e != p31.f16271e || !this.f16267a.equals(p31.f16267a) || !this.f16268b.equals(p31.f16268b) || !this.f16269c.equals(p31.f16269c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.f16270d) * 31) + this.f16271e) * 31) + this.f16267a.hashCode()) * 31) + this.f16268b.hashCode()) * 31) + this.f16269c.hashCode();
    }
}
