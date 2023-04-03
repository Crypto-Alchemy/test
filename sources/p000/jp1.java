package p000;

import java.util.Arrays;

/* renamed from: jp1 */
/* compiled from: EncodedPayload */
public final class jp1 {

    /* renamed from: a */
    public final qp1 f30557a;

    /* renamed from: b */
    public final byte[] f30558b;

    public jp1(qp1 qp1, byte[] bArr) {
        if (qp1 == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f30557a = qp1;
            this.f30558b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    /* renamed from: a */
    public byte[] mo44554a() {
        return this.f30558b;
    }

    /* renamed from: b */
    public qp1 mo44555b() {
        return this.f30557a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp1)) {
            return false;
        }
        jp1 jp1 = (jp1) obj;
        if (!this.f30557a.equals(jp1.f30557a)) {
            return false;
        }
        return Arrays.equals(this.f30558b, jp1.f30558b);
    }

    public int hashCode() {
        return ((this.f30557a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f30558b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f30557a + ", bytes=[...]}";
    }
}
