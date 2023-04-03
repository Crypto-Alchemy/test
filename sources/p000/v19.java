package p000;

import com.google.android.gms.internal.measurement.zzkn;

/* renamed from: v19 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class v19 extends y19 {

    /* renamed from: a */
    public final byte[] f34813a;

    /* renamed from: b */
    public int f34814b;

    /* renamed from: c */
    public int f34815c;

    /* renamed from: d */
    public int f34816d = Integer.MAX_VALUE;

    public /* synthetic */ v19(byte[] bArr, int i, int i2, boolean z, s19 s19) {
        super((s19) null);
        this.f34813a = bArr;
        this.f34814b = 0;
    }

    /* renamed from: c */
    public final int mo48630c(int i) throws zzkn {
        int i2 = this.f34816d;
        this.f34816d = 0;
        int i3 = this.f34814b + this.f34815c;
        this.f34814b = i3;
        if (i3 > 0) {
            this.f34815c = i3;
            this.f34814b = 0;
        } else {
            this.f34815c = 0;
        }
        return i2;
    }
}
