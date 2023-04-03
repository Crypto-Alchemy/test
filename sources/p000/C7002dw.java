package p000;

import java.security.DigestException;
import java.security.MessageDigest;

/* renamed from: dw */
public class C7002dw extends MessageDigest {

    /* renamed from: a */
    public ig1 f37405a;

    /* renamed from: d */
    public int f37406d;

    public C7002dw(ig1 ig1) {
        super(ig1.mo50201d());
        this.f37405a = ig1;
        this.f37406d = ig1.mo50202e();
    }

    public int engineDigest(byte[] bArr, int i, int i2) throws DigestException {
        int i3 = this.f37406d;
        if (i2 < i3) {
            throw new DigestException("partial digests not returned");
        } else if (bArr.length - i >= i3) {
            this.f37405a.mo50198a(bArr, i);
            return this.f37406d;
        } else {
            throw new DigestException("insufficient space in the output buffer to store the digest");
        }
    }

    public byte[] engineDigest() {
        byte[] bArr = new byte[this.f37406d];
        this.f37405a.mo50198a(bArr, 0);
        return bArr;
    }

    public int engineGetDigestLength() {
        return this.f37406d;
    }

    public void engineReset() {
        this.f37405a.reset();
    }

    public void engineUpdate(byte b) {
        this.f37405a.mo51713b(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.f37405a.update(bArr, i, i2);
    }
}
