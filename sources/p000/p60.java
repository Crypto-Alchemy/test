package p000;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.mw3;
import p000.r11;

/* renamed from: p60 */
/* compiled from: ByteBufferFileLoader */
public class p60 implements mw3<File, ByteBuffer> {

    /* renamed from: p60$a */
    /* compiled from: ByteBufferFileLoader */
    public static final class C3039a implements r11<ByteBuffer> {

        /* renamed from: a */
        public final File f16322a;

        public C3039a(File file) {
            this.f16322a = file;
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo11939a() {
            return ByteBuffer.class;
        }

        /* renamed from: b */
        public void mo11940b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public void mo11943d(Priority priority, r11.C3179a<? super ByteBuffer> aVar) {
            try {
                aVar.mo12487f(s60.m26653a(this.f16322a));
            } catch (IOException e) {
                aVar.mo12485c(e);
            }
        }

        /* renamed from: e */
        public DataSource mo11944e() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: p60$b */
    /* compiled from: ByteBufferFileLoader */
    public static class C3040b implements nw3<File, ByteBuffer> {
        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<File, ByteBuffer> mo11938c(vz3 vz3) {
            return new p60();
        }
    }

    /* renamed from: c */
    public mw3.C2853a<ByteBuffer> mo11934b(File file, int i, int i2, xi4 xi4) {
        return new mw3.C2853a<>(new df4(file), new C3039a(file));
    }

    /* renamed from: d */
    public boolean mo11933a(File file) {
        return true;
    }
}
