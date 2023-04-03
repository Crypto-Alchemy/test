package p000;

import com.google.android.gms.internal.vision.zzjk;

/* renamed from: yy8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class yy8 {

    /* renamed from: a */
    public int f35960a;

    /* renamed from: b */
    public int f35961b;

    /* renamed from: c */
    public boolean f35962c;

    public yy8() {
        this.f35960a = 100;
        this.f35961b = Integer.MAX_VALUE;
        this.f35962c = false;
    }

    /* renamed from: a */
    public static long m54916a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: b */
    public static yy8 m54917b(byte[] bArr, int i, int i2, boolean z) {
        bz8 bz8 = new bz8(bArr, i2);
        try {
            bz8.mo29815c(i2);
            return bz8;
        } catch (zzjk e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static int m54918d(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public abstract int mo29815c(int i) throws zzjk;

    /* renamed from: e */
    public abstract int mo29816e();
}
