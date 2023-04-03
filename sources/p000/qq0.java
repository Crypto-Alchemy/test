package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: qq0 */
public class qq0 extends InputStream {

    /* renamed from: a */
    public final C9626y4 f44224a;

    /* renamed from: d */
    public final boolean f44225d;

    /* renamed from: e */
    public boolean f44226e = true;

    /* renamed from: g */
    public int f44227g = 0;

    /* renamed from: k */
    public C9623y3 f44228k;

    /* renamed from: r */
    public InputStream f44229r;

    public qq0(C9626y4 y4Var, boolean z) {
        this.f44224a = y4Var;
        this.f44225d = z;
    }

    /* renamed from: a */
    public final C9623y3 mo65495a() throws IOException {
        C6843b4 g = this.f44224a.mo67033g();
        if (g == null) {
            if (!this.f44225d || this.f44227g == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f44227g);
        } else if (!(g instanceof C9623y3)) {
            throw new IOException("unknown object encountered: " + g.getClass());
        } else if (this.f44227g == 0) {
            return (C9623y3) g;
        } else {
            throw new IOException("only the last nested bitstring can have padding");
        }
    }

    /* renamed from: b */
    public int mo65496b() {
        return this.f44227g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() throws java.io.IOException {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.f44229r
            r1 = -1
            if (r0 != 0) goto L_0x0017
            boolean r0 = r3.f44226e
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            y3 r0 = r3.mo65495a()
            r3.f44228k = r0
            if (r0 != 0) goto L_0x0013
            return r1
        L_0x0013:
            r2 = 0
            r3.f44226e = r2
            goto L_0x0034
        L_0x0017:
            java.io.InputStream r0 = r3.f44229r
            int r0 = r0.read()
            if (r0 < 0) goto L_0x0020
            return r0
        L_0x0020:
            y3 r0 = r3.f44228k
            int r0 = r0.mo52539j()
            r3.f44227g = r0
            y3 r0 = r3.mo65495a()
            r3.f44228k = r0
            if (r0 != 0) goto L_0x0034
            r0 = 0
            r3.f44229r = r0
            return r1
        L_0x0034:
            java.io.InputStream r0 = r0.mo52540o()
            r3.f44229r = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qq0.read():int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c A[EDGE_INSN: B:20:0x002c->B:15:0x002c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A[SYNTHETIC] */
    public int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.f44229r
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x001c
            boolean r0 = r5.f44226e
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            y3 r0 = r5.mo65495a()
            r5.f44228k = r0
            if (r0 != 0) goto L_0x0014
            return r2
        L_0x0014:
            r5.f44226e = r1
        L_0x0016:
            java.io.InputStream r0 = r0.mo52540o()
            r5.f44229r = r0
        L_0x001c:
            java.io.InputStream r0 = r5.f44229r
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L_0x002c
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x001c
            return r1
        L_0x002c:
            y3 r0 = r5.f44228k
            int r0 = r0.mo52539j()
            r5.f44227g = r0
            y3 r0 = r5.mo65495a()
            r5.f44228k = r0
            if (r0 != 0) goto L_0x0016
            r6 = 0
            r5.f44229r = r6
            r6 = 1
            if (r1 >= r6) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qq0.read(byte[], int, int):int");
    }
}
