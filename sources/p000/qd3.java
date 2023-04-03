package p000;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

/* renamed from: qd3 */
public class qd3 extends od3 {

    /* renamed from: d */
    public final LMSigParameters f44181d;

    /* renamed from: e */
    public final LMOtsParameters f44182e;

    /* renamed from: g */
    public final byte[] f44183g;

    /* renamed from: k */
    public final byte[] f44184k;

    public qd3(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f44181d = lMSigParameters;
        this.f44182e = lMOtsParameters;
        this.f44183g = C9367tq.m72422f(bArr2);
        this.f44184k = C9367tq.m72422f(bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.qd3 m71247a(java.lang.Object r4) throws java.io.IOException {
        /*
            boolean r0 = r4 instanceof p000.qd3
            if (r0 == 0) goto L_0x0007
            qd3 r4 = (p000.qd3) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0033
            java.io.DataInputStream r4 = (java.io.DataInputStream) r4
            int r0 = r4.readInt()
            org.bouncycastle.pqc.crypto.lms.LMSigParameters r0 = org.bouncycastle.pqc.crypto.lms.LMSigParameters.m70497e(r0)
            int r1 = r4.readInt()
            org.bouncycastle.pqc.crypto.lms.LMOtsParameters r1 = org.bouncycastle.pqc.crypto.lms.LMOtsParameters.m70489f(r1)
            r2 = 16
            byte[] r2 = new byte[r2]
            r4.readFully(r2)
            int r3 = r0.mo64590d()
            byte[] r3 = new byte[r3]
            r4.readFully(r3)
            qd3 r4 = new qd3
            r4.<init>(r0, r1, r3, r2)
            return r4
        L_0x0033:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0056
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x004f }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x004f }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x004f }
            r2.<init>(r4)     // Catch:{ all -> 0x004f }
            r1.<init>(r2)     // Catch:{ all -> 0x004f }
            qd3 r4 = m71247a(r1)     // Catch:{ all -> 0x004c }
            r1.close()
            return r4
        L_0x004c:
            r4 = move-exception
            r0 = r1
            goto L_0x0050
        L_0x004f:
            r4 = move-exception
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.close()
        L_0x0055:
            throw r4
        L_0x0056:
            boolean r0 = r4 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x0065
            java.io.InputStream r4 = (java.io.InputStream) r4
            byte[] r4 = p000.ya6.m74322c(r4)
            qd3 r4 = m71247a(r4)
            return r4
        L_0x0065:
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
        throw new UnsupportedOperationException("Method not decompiled: p000.qd3.m71247a(java.lang.Object):qd3");
    }

    /* renamed from: b */
    public byte[] mo65460b() {
        return on0.m70404f().mo64504i(this.f44181d.mo64591f()).mo64504i(this.f44182e.mo64586g()).mo64500d(this.f44183g).mo64500d(this.f44184k).mo64498b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qd3 qd3 = (qd3) obj;
        if (this.f44181d.equals(qd3.f44181d) && this.f44182e.equals(qd3.f44182e) && C9367tq.m72417a(this.f44183g, qd3.f44183g)) {
            return C9367tq.m72417a(this.f44184k, qd3.f44184k);
        }
        return false;
    }

    public byte[] getEncoded() throws IOException {
        return mo65460b();
    }

    public int hashCode() {
        return (((((this.f44181d.hashCode() * 31) + this.f44182e.hashCode()) * 31) + C9367tq.m72437u(this.f44183g)) * 31) + C9367tq.m72437u(this.f44184k);
    }
}
