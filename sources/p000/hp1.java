package p000;

import com.facebook.common.memory.PooledByteBuffer;

/* renamed from: hp1 */
/* compiled from: EncodedMemoryCacheFactory */
public class hp1 {

    /* renamed from: hp1$a */
    /* compiled from: EncodedMemoryCacheFactory */
    public static class C2499a implements at3<f80> {

        /* renamed from: a */
        public final /* synthetic */ kq2 f12986a;

        public C2499a(kq2 kq2) {
            this.f12986a = kq2;
        }

        /* renamed from: d */
        public void mo11135a(f80 f80) {
            this.f12986a.mo22476d(f80);
        }

        /* renamed from: e */
        public void mo11136b(f80 f80) {
            this.f12986a.mo22474b(f80);
        }

        /* renamed from: f */
        public void mo11137c(f80 f80) {
            this.f12986a.mo22485m(f80);
        }
    }

    /* renamed from: a */
    public static fw2<f80, PooledByteBuffer> m19133a(ys3<f80, PooledByteBuffer> ys3, kq2 kq2) {
        kq2.mo22478f(ys3);
        return new fw2<>(ys3, new C2499a(kq2));
    }
}
