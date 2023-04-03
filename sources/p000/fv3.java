package p000;

import java.nio.ByteBuffer;

/* renamed from: fv3 */
/* compiled from: MetadataItem */
public final class fv3 extends jl6 {
    /* renamed from: f */
    public fv3 mo20235f(int i, ByteBuffer byteBuffer) {
        mo20236g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void mo20236g(int i, ByteBuffer byteBuffer) {
        mo21961c(i, byteBuffer);
    }

    /* renamed from: h */
    public int mo20237h(int i) {
        int b = mo21960b(16);
        if (b != 0) {
            return this.f13693b.getInt(mo21962d(b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int mo20238i() {
        int b = mo21960b(16);
        if (b != 0) {
            return mo21963e(b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean mo20239j() {
        int b = mo21960b(6);
        if (b == 0 || this.f13693b.get(b + this.f13692a) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public short mo20240k() {
        int b = mo21960b(14);
        if (b != 0) {
            return this.f13693b.getShort(b + this.f13692a);
        }
        return 0;
    }

    /* renamed from: l */
    public int mo20241l() {
        int b = mo21960b(4);
        if (b != 0) {
            return this.f13693b.getInt(b + this.f13692a);
        }
        return 0;
    }

    /* renamed from: m */
    public short mo20242m() {
        int b = mo21960b(8);
        if (b != 0) {
            return this.f13693b.getShort(b + this.f13692a);
        }
        return 0;
    }

    /* renamed from: n */
    public short mo20243n() {
        int b = mo21960b(12);
        if (b != 0) {
            return this.f13693b.getShort(b + this.f13692a);
        }
        return 0;
    }
}
