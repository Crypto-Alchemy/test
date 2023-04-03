package p000;

import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

/* renamed from: rd3 */
public class rd3 implements cp1 {

    /* renamed from: a */
    public final int f44349a;

    /* renamed from: d */
    public final kd3 f44350d;

    /* renamed from: e */
    public final LMSigParameters f44351e;

    /* renamed from: g */
    public final byte[][] f44352g;

    public rd3(int i, kd3 kd3, LMSigParameters lMSigParameters, byte[][] bArr) {
        this.f44349a = i;
        this.f44350d = kd3;
        this.f44351e = lMSigParameters;
        this.f44352g = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.rd3 m71510a(java.lang.Object r7) throws java.io.IOException {
        /*
            boolean r0 = r7 instanceof p000.rd3
            if (r0 == 0) goto L_0x0007
            rd3 r7 = (p000.rd3) r7
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x003b
            r0 = r7
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r1 = r0.readInt()
            kd3 r7 = p000.kd3.m59747a(r7)
            int r2 = r0.readInt()
            org.bouncycastle.pqc.crypto.lms.LMSigParameters r2 = org.bouncycastle.pqc.crypto.lms.LMSigParameters.m70497e(r2)
            int r3 = r2.mo64589c()
            byte[][] r4 = new byte[r3][]
            r5 = 0
        L_0x0025:
            if (r5 >= r3) goto L_0x0035
            int r6 = r2.mo64590d()
            byte[] r6 = new byte[r6]
            r4[r5] = r6
            r0.readFully(r6)
            int r5 = r5 + 1
            goto L_0x0025
        L_0x0035:
            rd3 r0 = new rd3
            r0.<init>(r1, r7, r2, r4)
            return r0
        L_0x003b:
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x005e
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0057 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0057 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0057 }
            r2.<init>(r7)     // Catch:{ all -> 0x0057 }
            r1.<init>(r2)     // Catch:{ all -> 0x0057 }
            rd3 r7 = m71510a(r1)     // Catch:{ all -> 0x0054 }
            r1.close()
            return r7
        L_0x0054:
            r7 = move-exception
            r0 = r1
            goto L_0x0058
        L_0x0057:
            r7 = move-exception
        L_0x0058:
            if (r0 == 0) goto L_0x005d
            r0.close()
        L_0x005d:
            throw r7
        L_0x005e:
            boolean r0 = r7 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x006d
            java.io.InputStream r7 = (java.io.InputStream) r7
            byte[] r7 = p000.ya6.m74322c(r7)
            rd3 r7 = m71510a(r7)
            return r7
        L_0x006d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rd3.m71510a(java.lang.Object):rd3");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rd3 rd3 = (rd3) obj;
        if (this.f44349a != rd3.f44349a) {
            return false;
        }
        kd3 kd3 = this.f44350d;
        if (kd3 == null ? rd3.f44350d != null : !kd3.equals(rd3.f44350d)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.f44351e;
        if (lMSigParameters == null ? rd3.f44351e == null : lMSigParameters.equals(rd3.f44351e)) {
            return Arrays.deepEquals(this.f44352g, rd3.f44352g);
        }
        return false;
    }

    public byte[] getEncoded() throws IOException {
        return on0.m70404f().mo64504i(this.f44349a).mo64500d(this.f44350d.getEncoded()).mo64504i(this.f44351e.mo64591f()).mo64501e(this.f44352g).mo64498b();
    }

    public int hashCode() {
        int i = this.f44349a * 31;
        kd3 kd3 = this.f44350d;
        int i2 = 0;
        int hashCode = (i + (kd3 != null ? kd3.hashCode() : 0)) * 31;
        LMSigParameters lMSigParameters = this.f44351e;
        if (lMSigParameters != null) {
            i2 = lMSigParameters.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.deepHashCode(this.f44352g);
    }
}
