package p000;

import com.google.android.gms.internal.vision.zzjk;

/* renamed from: bz8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class bz8 extends yy8 {

    /* renamed from: d */
    public final byte[] f21526d;

    /* renamed from: e */
    public final boolean f21527e;

    /* renamed from: f */
    public int f21528f;

    /* renamed from: g */
    public int f21529g;

    /* renamed from: h */
    public int f21530h;

    /* renamed from: i */
    public int f21531i;

    /* renamed from: j */
    public int f21532j;

    public bz8(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f21532j = Integer.MAX_VALUE;
        this.f21526d = bArr;
        this.f21528f = i2 + i;
        this.f21530h = i;
        this.f21531i = i;
        this.f21527e = z;
    }

    /* renamed from: c */
    public final int mo29815c(int i) throws zzjk {
        if (i >= 0) {
            int e = i + mo29816e();
            int i2 = this.f21532j;
            if (e <= i2) {
                this.f21532j = e;
                mo29817f();
                return i2;
            }
            throw zzjk.zza();
        }
        throw zzjk.zzb();
    }

    /* renamed from: e */
    public final int mo29816e() {
        return this.f21530h - this.f21531i;
    }

    /* renamed from: f */
    public final void mo29817f() {
        int i = this.f21528f + this.f21529g;
        this.f21528f = i;
        int i2 = i - this.f21531i;
        int i3 = this.f21532j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f21529g = i4;
            this.f21528f = i - i4;
            return;
        }
        this.f21529g = 0;
    }
}
