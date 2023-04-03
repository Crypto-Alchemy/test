package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p000.rq2;

/* renamed from: sq2 */
/* compiled from: ImageFormatChecker */
public class sq2 {

    /* renamed from: d */
    public static sq2 f17770d;

    /* renamed from: a */
    public int f17771a;

    /* renamed from: b */
    public List<rq2.C3214a> f17772b;

    /* renamed from: c */
    public final q81 f17773c = new q81();

    public sq2() {
        mo25930f();
    }

    /* renamed from: b */
    public static rq2 m27064b(InputStream inputStream) throws IOException {
        return m27066d().mo25929a(inputStream);
    }

    /* renamed from: c */
    public static rq2 m27065c(InputStream inputStream) {
        try {
            return m27064b(inputStream);
        } catch (IOException e) {
            throw pp6.m25127a(e);
        }
    }

    /* renamed from: d */
    public static synchronized sq2 m27066d() {
        sq2 sq2;
        synchronized (sq2.class) {
            if (f17770d == null) {
                f17770d = new sq2();
            }
            sq2 = f17770d;
        }
        return sq2;
    }

    /* renamed from: e */
    public static int m27067e(int i, InputStream inputStream, byte[] bArr) throws IOException {
        boolean z;
        au4.m10792g(inputStream);
        au4.m10792g(bArr);
        if (bArr.length >= i) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        if (!inputStream.markSupported()) {
            return a70.m86b(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return a70.m86b(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }

    /* renamed from: a */
    public rq2 mo25929a(InputStream inputStream) throws IOException {
        au4.m10792g(inputStream);
        int i = this.f17771a;
        byte[] bArr = new byte[i];
        int e = m27067e(i, inputStream, bArr);
        rq2 a = this.f17773c.mo25006a(bArr, e);
        if (a != null && a != rq2.f17332c) {
            return a;
        }
        List<rq2.C3214a> list = this.f17772b;
        if (list != null) {
            for (rq2.C3214a a2 : list) {
                rq2 a3 = a2.mo25006a(bArr, e);
                if (a3 != null && a3 != rq2.f17332c) {
                    return a3;
                }
            }
        }
        return rq2.f17332c;
    }

    /* renamed from: f */
    public final void mo25930f() {
        this.f17771a = this.f17773c.mo25007b();
        List<rq2.C3214a> list = this.f17772b;
        if (list != null) {
            for (rq2.C3214a b : list) {
                this.f17771a = Math.max(this.f17771a, b.mo25007b());
            }
        }
    }
}
