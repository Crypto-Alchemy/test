package p000;

import java.io.OutputStream;

/* renamed from: pj9 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class pj9 extends OutputStream {

    /* renamed from: a */
    public long f32719a = 0;

    /* renamed from: a */
    public final long mo46762a() {
        return this.f32719a;
    }

    public final void write(int i) {
        this.f32719a++;
    }

    public final void write(byte[] bArr) {
        this.f32719a += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f32719a += (long) i2;
    }
}
