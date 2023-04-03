package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: gv3 */
/* compiled from: MetadataList */
public final class gv3 extends jl6 {
    /* renamed from: h */
    public static gv3 m18431h(ByteBuffer byteBuffer) {
        return m18432i(byteBuffer, new gv3());
    }

    /* renamed from: i */
    public static gv3 m18432i(ByteBuffer byteBuffer, gv3 gv3) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return gv3.mo20848f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public gv3 mo20848f(int i, ByteBuffer byteBuffer) {
        mo20849g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void mo20849g(int i, ByteBuffer byteBuffer) {
        mo21961c(i, byteBuffer);
    }

    /* renamed from: j */
    public fv3 mo20850j(fv3 fv3, int i) {
        int b = mo21960b(6);
        if (b != 0) {
            return fv3.mo20235f(mo21959a(mo21962d(b) + (i * 4)), this.f13693b);
        }
        return null;
    }

    /* renamed from: k */
    public int mo20851k() {
        int b = mo21960b(6);
        if (b != 0) {
            return mo21963e(b);
        }
        return 0;
    }

    /* renamed from: l */
    public int mo20852l() {
        int b = mo21960b(4);
        if (b != 0) {
            return this.f13693b.getInt(b + this.f13692a);
        }
        return 0;
    }
}
