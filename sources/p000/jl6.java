package p000;

import java.nio.ByteBuffer;

/* renamed from: jl6 */
/* compiled from: Table */
public class jl6 {

    /* renamed from: a */
    public int f13692a;

    /* renamed from: b */
    public ByteBuffer f13693b;

    /* renamed from: c */
    public int f13694c;

    /* renamed from: d */
    public int f13695d;

    /* renamed from: e */
    public h67 f13696e = h67.m18627a();

    /* renamed from: a */
    public int mo21959a(int i) {
        return i + this.f13693b.getInt(i);
    }

    /* renamed from: b */
    public int mo21960b(int i) {
        if (i < this.f13695d) {
            return this.f13693b.getShort(this.f13694c + i);
        }
        return 0;
    }

    /* renamed from: c */
    public void mo21961c(int i, ByteBuffer byteBuffer) {
        this.f13693b = byteBuffer;
        if (byteBuffer != null) {
            this.f13692a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f13694c = i2;
            this.f13695d = this.f13693b.getShort(i2);
            return;
        }
        this.f13692a = 0;
        this.f13694c = 0;
        this.f13695d = 0;
    }

    /* renamed from: d */
    public int mo21962d(int i) {
        int i2 = i + this.f13692a;
        return i2 + this.f13693b.getInt(i2) + 4;
    }

    /* renamed from: e */
    public int mo21963e(int i) {
        int i2 = i + this.f13692a;
        return this.f13693b.getInt(i2 + this.f13693b.getInt(i2));
    }
}
