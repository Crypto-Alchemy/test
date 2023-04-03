package p000;

import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

/* renamed from: md3 */
public class md3 implements ig1 {

    /* renamed from: a */
    public final byte[] f40895a;

    /* renamed from: b */
    public final jd3 f40896b;

    /* renamed from: c */
    public final LMSigParameters f40897c;

    /* renamed from: d */
    public final byte[][] f40898d;

    /* renamed from: e */
    public final Object f40899e = null;

    /* renamed from: f */
    public volatile ig1 f40900f;

    public md3(jd3 jd3, LMSigParameters lMSigParameters, ig1 ig1, byte[] bArr, byte[][] bArr2) {
        this.f40896b = jd3;
        this.f40897c = lMSigParameters;
        this.f40900f = ig1;
        this.f40895a = bArr;
        this.f40898d = bArr2;
    }

    /* renamed from: a */
    public int mo50198a(byte[] bArr, int i) {
        return this.f40900f.mo50198a(bArr, i);
    }

    /* renamed from: b */
    public void mo51713b(byte b) {
        this.f40900f.mo51713b(b);
    }

    /* renamed from: c */
    public byte[] mo56235c() {
        return this.f40895a;
    }

    /* renamed from: d */
    public String mo50201d() {
        return this.f40900f.mo50201d();
    }

    /* renamed from: e */
    public int mo50202e() {
        return this.f40900f.mo50202e();
    }

    /* renamed from: h */
    public byte[][] mo56236h() {
        return this.f40898d;
    }

    /* renamed from: i */
    public jd3 mo56237i() {
        return this.f40896b;
    }

    /* renamed from: j */
    public byte[] mo56238j() {
        byte[] bArr = new byte[34];
        this.f40900f.mo50198a(bArr, 0);
        this.f40900f = null;
        return bArr;
    }

    /* renamed from: k */
    public LMSigParameters mo56239k() {
        return this.f40897c;
    }

    public void reset() {
        this.f40900f.reset();
    }

    public void update(byte[] bArr, int i, int i2) {
        this.f40900f.update(bArr, i, i2);
    }
}
