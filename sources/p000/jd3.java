package p000;

import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

/* renamed from: jd3 */
public class jd3 {

    /* renamed from: a */
    public final LMOtsParameters f38648a;

    /* renamed from: b */
    public final byte[] f38649b;

    /* renamed from: c */
    public final int f38650c;

    /* renamed from: d */
    public final byte[] f38651d;

    public jd3(LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        this.f38648a = lMOtsParameters;
        this.f38649b = bArr;
        this.f38650c = i;
        this.f38651d = bArr2;
    }

    /* renamed from: a */
    public ws5 mo52668a() {
        ws5 ws5 = new ws5(this.f38649b, this.f38651d, mg1.m64327a(this.f38648a.mo64582b()));
        ws5.mo66769e(this.f38650c);
        return ws5;
    }

    /* renamed from: b */
    public byte[] mo52669b() {
        return this.f38649b;
    }

    /* renamed from: c */
    public LMOtsParameters mo52670c() {
        return this.f38648a;
    }

    /* renamed from: d */
    public int mo52671d() {
        return this.f38650c;
    }

    /* renamed from: e */
    public md3 mo52672e(LMSigParameters lMSigParameters, byte[][] bArr) {
        byte[] bArr2 = new byte[32];
        ws5 a = mo52668a();
        a.mo66768d(-3);
        a.mo66765a(bArr2, false);
        ig1 a2 = mg1.m64327a(this.f38648a.mo64582b());
        si3.m71950a(mo52669b(), a2);
        si3.m71952c(mo52671d(), a2);
        si3.m71951b(-32383, a2);
        si3.m71950a(bArr2, a2);
        return new md3(this, lMSigParameters, a2, bArr2, bArr);
    }
}
