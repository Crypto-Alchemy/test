package p000;

import com.facebook.imagepipeline.memory.C1946a;

/* renamed from: f42 */
/* compiled from: FlexByteArrayPool */
public class f42 {

    /* renamed from: a */
    public final rf5<byte[]> f11530a;

    /* renamed from: b */
    public final C2263b f11531b;

    /* renamed from: f42$a */
    /* compiled from: FlexByteArrayPool */
    public class C2262a implements rf5<byte[]> {
        public C2262a() {
        }

        /* renamed from: b */
        public void mo360a(byte[] bArr) {
            f42.this.mo19686b(bArr);
        }
    }

    /* renamed from: f42$b */
    /* compiled from: FlexByteArrayPool */
    public static class C2263b extends C1946a {
        public C2263b(ht3 ht3, ms4 ms4, ns4 ns4) {
            super(ht3, ms4, ns4);
        }

        /* renamed from: w */
        public j40<byte[]> mo13348w(int i) {
            return new tc4(mo13340o(i), this.f9618c.f15247g, 0);
        }
    }

    public f42(ht3 ht3, ms4 ms4) {
        boolean z;
        if (ms4.f15247g > 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        this.f11531b = new C2263b(ht3, ms4, w74.m29399h());
        this.f11530a = new C2262a();
    }

    /* renamed from: a */
    public nh0<byte[]> mo19685a(int i) {
        return nh0.m23183y(this.f11531b.get(i), this.f11530a);
    }

    /* renamed from: b */
    public void mo19686b(byte[] bArr) {
        this.f11531b.mo360a(bArr);
    }
}
