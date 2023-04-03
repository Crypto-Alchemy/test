package p000;

import java.io.IOException;

/* renamed from: ok2 */
public class ok2 extends od3 {

    /* renamed from: d */
    public final int f43721d;

    /* renamed from: e */
    public final qd3 f43722e;

    public ok2(int i, qd3 qd3) {
        super(false);
        this.f43721d = i;
        this.f43722e = qd3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.ok2 m70298a(java.lang.Object r3) throws java.io.IOException {
        /*
            boolean r0 = r3 instanceof p000.ok2
            if (r0 == 0) goto L_0x0007
            ok2 r3 = (p000.ok2) r3
            return r3
        L_0x0007:
            boolean r0 = r3 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x001c
            r0 = r3
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r0 = r0.readInt()
            qd3 r3 = p000.qd3.m71247a(r3)
            ok2 r1 = new ok2
            r1.<init>(r0, r3)
            return r1
        L_0x001c:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L_0x003f
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0038 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0038 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0038 }
            r2.<init>(r3)     // Catch:{ all -> 0x0038 }
            r1.<init>(r2)     // Catch:{ all -> 0x0038 }
            ok2 r3 = m70298a(r1)     // Catch:{ all -> 0x0035 }
            r1.close()
            return r3
        L_0x0035:
            r3 = move-exception
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r3 = move-exception
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()
        L_0x003e:
            throw r3
        L_0x003f:
            boolean r0 = r3 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x004e
            java.io.InputStream r3 = (java.io.InputStream) r3
            byte[] r3 = p000.ya6.m74322c(r3)
            ok2 r3 = m70298a(r3)
            return r3
        L_0x004e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ok2.m70298a(java.lang.Object):ok2");
    }

    /* renamed from: b */
    public int mo62934b() {
        return this.f43721d;
    }

    /* renamed from: c */
    public qd3 mo62935c() {
        return this.f43722e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ok2 ok2 = (ok2) obj;
        if (this.f43721d != ok2.f43721d) {
            return false;
        }
        return this.f43722e.equals(ok2.f43722e);
    }

    public byte[] getEncoded() throws IOException {
        return on0.m70404f().mo64504i(this.f43721d).mo64500d(this.f43722e.getEncoded()).mo64498b();
    }

    public int hashCode() {
        return (this.f43721d * 31) + this.f43722e.hashCode();
    }
}
