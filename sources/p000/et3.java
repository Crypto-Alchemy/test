package p000;

import com.facebook.imagepipeline.memory.C1947b;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: et3 */
/* compiled from: MemoryPooledByteBufferFactory */
public class et3 implements qs4 {

    /* renamed from: a */
    public final ts4 f11360a;

    /* renamed from: b */
    public final C1947b f11361b;

    public et3(C1947b bVar, ts4 ts4) {
        this.f11361b = bVar;
        this.f11360a = ts4;
    }

    /* renamed from: f */
    public dt3 mo19484f(InputStream inputStream, MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream) throws IOException {
        this.f11360a.mo26535a(inputStream, memoryPooledByteBufferOutputStream);
        return memoryPooledByteBufferOutputStream.mo13354a();
    }

    /* renamed from: g */
    public dt3 mo19479a(InputStream inputStream) throws IOException {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f11361b);
        try {
            return mo19484f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    /* renamed from: h */
    public dt3 mo19480b(InputStream inputStream, int i) throws IOException {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f11361b, i);
        try {
            return mo19484f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    /* renamed from: i */
    public dt3 mo19482d(byte[] bArr) {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f11361b, bArr.length);
        try {
            memoryPooledByteBufferOutputStream.write(bArr, 0, bArr.length);
            dt3 d = memoryPooledByteBufferOutputStream.mo13354a();
            memoryPooledByteBufferOutputStream.close();
            return d;
        } catch (IOException e) {
            throw pp6.m25127a(e);
        } catch (Throwable th) {
            memoryPooledByteBufferOutputStream.close();
            throw th;
        }
    }

    /* renamed from: j */
    public MemoryPooledByteBufferOutputStream mo19481c() {
        return new MemoryPooledByteBufferOutputStream(this.f11361b);
    }

    /* renamed from: k */
    public MemoryPooledByteBufferOutputStream mo19483e(int i) {
        return new MemoryPooledByteBufferOutputStream(this.f11361b, i);
    }
}
