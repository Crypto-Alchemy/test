package p000;

import java.io.InputStream;

/* renamed from: fh3 */
public abstract class fh3 extends InputStream {

    /* renamed from: a */
    public final InputStream f37795a;

    /* renamed from: d */
    public int f37796d;

    public fh3(InputStream inputStream, int i) {
        this.f37795a = inputStream;
        this.f37796d = i;
    }

    /* renamed from: a */
    public int mo51671a() {
        return this.f37796d;
    }

    /* renamed from: b */
    public void mo51672b(boolean z) {
        InputStream inputStream = this.f37795a;
        if (inputStream instanceof qt2) {
            ((qt2) inputStream).mo65517d(z);
        }
    }
}
