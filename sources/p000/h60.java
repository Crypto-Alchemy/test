package p000;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.mw3;
import p000.r11;

/* renamed from: h60 */
/* compiled from: ByteArrayLoader */
public class h60<Data> implements mw3<byte[], Data> {

    /* renamed from: a */
    public final C2450b<Data> f12748a;

    /* renamed from: h60$a */
    /* compiled from: ByteArrayLoader */
    public static class C2448a implements nw3<byte[], ByteBuffer> {

        /* renamed from: h60$a$a */
        /* compiled from: ByteArrayLoader */
        public class C2449a implements C2450b<ByteBuffer> {
            public C2449a() {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo20959a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo20960b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<byte[], ByteBuffer> mo11938c(vz3 vz3) {
            return new h60(new C2449a());
        }
    }

    /* renamed from: h60$b */
    /* compiled from: ByteArrayLoader */
    public interface C2450b<Data> {
        /* renamed from: a */
        Class<Data> mo20959a();

        /* renamed from: b */
        Data mo20960b(byte[] bArr);
    }

    /* renamed from: h60$c */
    /* compiled from: ByteArrayLoader */
    public static class C2451c<Data> implements r11<Data> {

        /* renamed from: a */
        public final byte[] f12750a;

        /* renamed from: d */
        public final C2450b<Data> f12751d;

        public C2451c(byte[] bArr, C2450b<Data> bVar) {
            this.f12750a = bArr;
            this.f12751d = bVar;
        }

        /* renamed from: a */
        public Class<Data> mo11939a() {
            return this.f12751d.mo20959a();
        }

        /* renamed from: b */
        public void mo11940b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public void mo11943d(Priority priority, r11.C3179a<? super Data> aVar) {
            aVar.mo12487f(this.f12751d.mo20960b(this.f12750a));
        }

        /* renamed from: e */
        public DataSource mo11944e() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: h60$d */
    /* compiled from: ByteArrayLoader */
    public static class C2452d implements nw3<byte[], InputStream> {

        /* renamed from: h60$d$a */
        /* compiled from: ByteArrayLoader */
        public class C2453a implements C2450b<InputStream> {
            public C2453a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo20959a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo20960b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<byte[], InputStream> mo11938c(vz3 vz3) {
            return new h60(new C2453a());
        }
    }

    public h60(C2450b<Data> bVar) {
        this.f12748a = bVar;
    }

    /* renamed from: c */
    public mw3.C2853a<Data> mo11934b(byte[] bArr, int i, int i2, xi4 xi4) {
        return new mw3.C2853a<>(new df4(bArr), new C2451c(bArr, this.f12748a));
    }

    /* renamed from: d */
    public boolean mo11933a(byte[] bArr) {
        return true;
    }
}
