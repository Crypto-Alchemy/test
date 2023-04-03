package p000;

import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;

/* renamed from: kd3 */
public class kd3 implements cp1 {

    /* renamed from: a */
    public final LMOtsParameters f38882a;

    /* renamed from: d */
    public final byte[] f38883d;

    /* renamed from: e */
    public final byte[] f38884e;

    public kd3(LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        this.f38882a = lMOtsParameters;
        this.f38883d = bArr;
        this.f38884e = bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.kd3 m59747a(java.lang.Object r4) throws java.io.IOException {
        /*
            boolean r0 = r4 instanceof p000.kd3
            if (r0 == 0) goto L_0x0007
            kd3 r4 = (p000.kd3) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0032
            java.io.DataInputStream r4 = (java.io.DataInputStream) r4
            int r0 = r4.readInt()
            org.bouncycastle.pqc.crypto.lms.LMOtsParameters r0 = org.bouncycastle.pqc.crypto.lms.LMOtsParameters.m70489f(r0)
            int r1 = r0.mo64584d()
            byte[] r1 = new byte[r1]
            r4.readFully(r1)
            int r2 = r0.mo64585e()
            int r3 = r0.mo64584d()
            int r2 = r2 * r3
            byte[] r2 = new byte[r2]
            r4.readFully(r2)
            kd3 r4 = new kd3
            r4.<init>(r0, r1, r2)
            return r4
        L_0x0032:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0055
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x004e }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x004e }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x004e }
            r2.<init>(r4)     // Catch:{ all -> 0x004e }
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            kd3 r4 = m59747a(r1)     // Catch:{ all -> 0x004b }
            r1.close()
            return r4
        L_0x004b:
            r4 = move-exception
            r0 = r1
            goto L_0x004f
        L_0x004e:
            r4 = move-exception
        L_0x004f:
            if (r0 == 0) goto L_0x0054
            r0.close()
        L_0x0054:
            throw r4
        L_0x0055:
            boolean r0 = r4 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x0064
            java.io.InputStream r4 = (java.io.InputStream) r4
            byte[] r4 = p000.ya6.m74322c(r4)
            kd3 r4 = m59747a(r4)
            return r4
        L_0x0064:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kd3.m59747a(java.lang.Object):kd3");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kd3 kd3 = (kd3) obj;
        LMOtsParameters lMOtsParameters = this.f38882a;
        if (lMOtsParameters == null ? kd3.f38882a != null : !lMOtsParameters.equals(kd3.f38882a)) {
            return false;
        }
        if (!Arrays.equals(this.f38883d, kd3.f38883d)) {
            return false;
        }
        return Arrays.equals(this.f38884e, kd3.f38884e);
    }

    public byte[] getEncoded() throws IOException {
        return on0.m70404f().mo64504i(this.f38882a.mo64586g()).mo64500d(this.f38883d).mo64500d(this.f38884e).mo64498b();
    }

    public int hashCode() {
        LMOtsParameters lMOtsParameters = this.f38882a;
        return ((((lMOtsParameters != null ? lMOtsParameters.hashCode() : 0) * 31) + Arrays.hashCode(this.f38883d)) * 31) + Arrays.hashCode(this.f38884e);
    }
}
