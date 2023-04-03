package p000;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: t11 */
/* compiled from: DataOutputAsStream */
public class t11 extends OutputStream {

    /* renamed from: a */
    public final DataOutput f17873a;

    public t11(DataOutput dataOutput) {
        this.f17873a = dataOutput;
    }

    public void write(int i) throws IOException {
        this.f17873a.write(i);
    }

    public void write(byte[] bArr) throws IOException {
        this.f17873a.write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f17873a.write(bArr, i, i2);
    }
}
