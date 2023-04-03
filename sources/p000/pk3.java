package p000;

import java.io.Writer;

/* renamed from: pk3 */
/* compiled from: LogWriter */
public final class pk3 extends Writer {

    /* renamed from: a */
    public final String f16523a;

    /* renamed from: d */
    public StringBuilder f16524d = new StringBuilder(128);

    public pk3(String str) {
        this.f16523a = str;
    }

    /* renamed from: a */
    public final void mo24626a() {
        if (this.f16524d.length() > 0) {
            this.f16524d.toString();
            StringBuilder sb = this.f16524d;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        mo24626a();
    }

    public void flush() {
        mo24626a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo24626a();
            } else {
                this.f16524d.append(c);
            }
        }
    }
}
