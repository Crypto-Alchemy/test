package p000;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* renamed from: lu3 */
/* compiled from: MessageDigest */
public abstract class lu3 {

    /* renamed from: a */
    public byte[] f14732a;

    /* renamed from: b */
    public boolean f14733b;

    /* renamed from: a */
    public final void mo22978a(PrintStream printStream, byte b) {
        int i;
        int i2;
        char c = (char) ((b >> 4) & 15);
        if (c > 9) {
            i = (c - 10) + 65;
        } else {
            i = c + '0';
        }
        printStream.write((char) i);
        char c2 = (char) (b & 15);
        if (c2 > 9) {
            i2 = (c2 - 10) + 65;
        } else {
            i2 = c2 + '0';
        }
        printStream.write((char) i2);
    }

    /* renamed from: b */
    public abstract void mo22979b(byte b);

    /* renamed from: c */
    public synchronized void mo22980c(byte[] bArr) {
        mo22981d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public synchronized void mo22981d(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            mo22979b(bArr[i3 + i]);
        }
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        if (this.f14733b) {
            int i = 0;
            while (true) {
                byte[] bArr = this.f14732a;
                if (i >= bArr.length) {
                    break;
                }
                mo22978a(printStream, bArr[i]);
                i++;
            }
        } else {
            printStream.print("<incomplete>");
        }
        return byteArrayOutputStream.toString();
    }
}
