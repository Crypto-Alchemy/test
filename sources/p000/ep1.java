package p000;

import com.facebook.common.memory.PooledByteBuffer;
import p000.nu0;

/* renamed from: ep1 */
/* compiled from: EncodedCountingMemoryCacheFactory */
public class ep1 {

    /* renamed from: ep1$a */
    /* compiled from: EncodedCountingMemoryCacheFactory */
    public static class C2243a implements g87<PooledByteBuffer> {
        /* renamed from: b */
        public int mo19448a(PooledByteBuffer pooledByteBuffer) {
            return pooledByteBuffer.size();
        }
    }

    /* renamed from: a */
    public static nu0<f80, PooledByteBuffer> m16269a(td6<zs3> td6, ht3 ht3) {
        fm3 fm3 = new fm3(new C2243a(), new x34(), td6, (nu0.C2921b) null, false, false);
        ht3.mo21382a(fm3);
        return fm3;
    }
}
