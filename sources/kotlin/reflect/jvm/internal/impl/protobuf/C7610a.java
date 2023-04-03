package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* compiled from: AbstractMessageLite */
public abstract class C7610a implements C7628h {
    public int memoizedHashCode = 0;

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream J = CodedOutputStream.m61851J(outputStream, CodedOutputStream.m61872u(CodedOutputStream.m61873v(serializedSize) + serializedSize));
        J.mo54628o0(serializedSize);
        writeTo(J);
        J.mo54597I();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class C7611a<BuilderType extends C7611a> implements C7628h.C7629a {
        /* renamed from: b */
        public static UninitializedMessageException m61947b(C7628h hVar) {
            return new UninitializedMessageException(hVar);
        }

        /* renamed from: a */
        public abstract BuilderType mo53900n(C7614c cVar, C7616d dVar) throws IOException;

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a */
        /* compiled from: AbstractMessageLite */
        public static final class C7612a extends FilterInputStream {

            /* renamed from: a */
            public int f39939a;

            public C7612a(InputStream inputStream, int i) {
                super(inputStream);
                this.f39939a = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.f39939a);
            }

            public int read() throws IOException {
                if (this.f39939a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f39939a--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f39939a));
                if (skip >= 0) {
                    this.f39939a = (int) (((long) this.f39939a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f39939a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f39939a -= read;
                }
                return read;
            }
        }
    }
}
