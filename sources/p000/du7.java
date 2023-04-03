package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* renamed from: du7 */
public final class du7 extends InputStream {

    /* renamed from: a */
    public final Enumeration<File> f28314a;

    /* renamed from: d */
    public InputStream f28315d;

    public du7(Enumeration<File> enumeration) throws IOException {
        this.f28314a = enumeration;
        mo42061a();
    }

    /* renamed from: a */
    public final void mo42061a() throws IOException {
        InputStream inputStream = this.f28315d;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f28315d = this.f28314a.hasMoreElements() ? new FileInputStream(this.f28314a.nextElement()) : null;
    }

    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f28315d;
        if (inputStream != null) {
            inputStream.close();
            this.f28315d = null;
        }
    }

    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f28315d;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            mo42061a();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f28315d == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f28315d.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo42061a();
            } while (this.f28315d != null);
            return -1;
        }
    }
}
