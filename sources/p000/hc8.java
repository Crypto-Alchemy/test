package p000;

import com.google.android.gms.internal.clearcut.zzco;

/* renamed from: hc8 */
public abstract class hc8 {

    /* renamed from: a */
    public int f29520a;

    /* renamed from: b */
    public int f29521b;

    /* renamed from: c */
    public boolean f29522c;

    public hc8() {
        this.f29520a = 100;
        this.f29521b = Integer.MAX_VALUE;
        this.f29522c = false;
    }

    /* renamed from: a */
    public static long m45122a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: b */
    public static hc8 m45123b(byte[] bArr, int i, int i2, boolean z) {
        mc8 mc8 = new mc8(bArr, 0, i2, false);
        try {
            mc8.mo43128d(i2);
            return mc8;
        } catch (zzco e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m45124e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public abstract int mo43127c();

    /* renamed from: d */
    public abstract int mo43128d(int i) throws zzco;
}
