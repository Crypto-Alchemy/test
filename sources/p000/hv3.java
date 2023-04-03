package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: hv3 */
/* compiled from: MetadataListReader */
public class hv3 {

    /* renamed from: hv3$a */
    /* compiled from: MetadataListReader */
    public static class C2513a implements C2515c {

        /* renamed from: a */
        public final ByteBuffer f13073a;

        public C2513a(ByteBuffer byteBuffer) {
            this.f13073a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public void mo21400a(int i) throws IOException {
            ByteBuffer byteBuffer = this.f13073a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        /* renamed from: b */
        public int mo21401b() throws IOException {
            return this.f13073a.getInt();
        }

        /* renamed from: c */
        public long mo21402c() throws IOException {
            return hv3.m19271c(this.f13073a.getInt());
        }

        public long getPosition() {
            return (long) this.f13073a.position();
        }

        public int readUnsignedShort() throws IOException {
            return hv3.m19272d(this.f13073a.getShort());
        }
    }

    /* renamed from: hv3$b */
    /* compiled from: MetadataListReader */
    public static class C2514b {

        /* renamed from: a */
        public final long f13074a;

        /* renamed from: b */
        public final long f13075b;

        public C2514b(long j, long j2) {
            this.f13074a = j;
            this.f13075b = j2;
        }

        /* renamed from: a */
        public long mo21405a() {
            return this.f13074a;
        }
    }

    /* renamed from: hv3$c */
    /* compiled from: MetadataListReader */
    public interface C2515c {
        /* renamed from: a */
        void mo21400a(int i) throws IOException;

        /* renamed from: b */
        int mo21401b() throws IOException;

        /* renamed from: c */
        long mo21402c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    /* renamed from: a */
    public static C2514b m19269a(C2515c cVar) throws IOException {
        long j;
        cVar.mo21400a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.mo21400a(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int b = cVar.mo21401b();
                cVar.mo21400a(4);
                j = cVar.mo21402c();
                cVar.mo21400a(4);
                if (1835365473 == b) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.mo21400a((int) (j - cVar.getPosition()));
                cVar.mo21400a(12);
                long c = cVar.mo21402c();
                for (int i2 = 0; ((long) i2) < c; i2++) {
                    int b2 = cVar.mo21401b();
                    long c2 = cVar.mo21402c();
                    long c3 = cVar.mo21402c();
                    if (1164798569 == b2 || 1701669481 == b2) {
                        return new C2514b(c2 + j, c3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    public static gv3 m19270b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m19269a(new C2513a(duplicate)).mo21405a());
        return gv3.m18431h(duplicate);
    }

    /* renamed from: c */
    public static long m19271c(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: d */
    public static int m19272d(short s) {
        return s & 65535;
    }
}
