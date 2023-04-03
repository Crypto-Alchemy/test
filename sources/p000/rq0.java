package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: rq0 */
public class rq0 extends InputStream {

    /* renamed from: a */
    public final C9626y4 f44441a;

    /* renamed from: d */
    public boolean f44442d = true;

    /* renamed from: e */
    public InputStream f44443e;

    public rq0(C9626y4 y4Var) {
        this.f44441a = y4Var;
    }

    /* renamed from: a */
    public final C9233r4 mo65684a() throws IOException {
        C6843b4 g = this.f44441a.mo67033g();
        if (g == null) {
            return null;
        }
        if (g instanceof C9233r4) {
            return (C9233r4) g;
        }
        throw new IOException("unknown object encountered: " + g.getClass());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() throws java.io.IOException {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.f44443e
            r1 = -1
            if (r0 != 0) goto L_0x0015
            boolean r0 = r3.f44442d
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            r4 r0 = r3.mo65684a()
            if (r0 != 0) goto L_0x0011
            return r1
        L_0x0011:
            r2 = 0
            r3.f44442d = r2
            goto L_0x0028
        L_0x0015:
            java.io.InputStream r0 = r3.f44443e
            int r0 = r0.read()
            if (r0 < 0) goto L_0x001e
            return r0
        L_0x001e:
            r4 r0 = r3.mo65684a()
            if (r0 != 0) goto L_0x0028
            r0 = 0
            r3.f44443e = r0
            return r1
        L_0x0028:
            java.io.InputStream r0 = r0.mo55987e()
            r3.f44443e = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rq0.read():int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002a A[EDGE_INSN: B:20:0x002a->B:15:0x002a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0029 A[SYNTHETIC] */
    public int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.f44443e
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x001a
            boolean r0 = r5.f44442d
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            r4 r0 = r5.mo65684a()
            if (r0 != 0) goto L_0x0012
            return r2
        L_0x0012:
            r5.f44442d = r1
        L_0x0014:
            java.io.InputStream r0 = r0.mo55987e()
            r5.f44443e = r0
        L_0x001a:
            java.io.InputStream r0 = r5.f44443e
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L_0x002a
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x001a
            return r1
        L_0x002a:
            r4 r0 = r5.mo65684a()
            if (r0 != 0) goto L_0x0014
            r6 = 0
            r5.f44443e = r6
            r6 = 1
            if (r1 >= r6) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = r1
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rq0.read(byte[], int, int):int");
    }
}
