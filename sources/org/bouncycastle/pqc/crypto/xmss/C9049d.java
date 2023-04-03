package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.C9046c;

/* renamed from: org.bouncycastle.pqc.crypto.xmss.d */
public final class C9049d {

    /* renamed from: a */
    public final xf7 f43821a;

    /* renamed from: b */
    public final ob3 f43822b;

    /* renamed from: c */
    public byte[] f43823c;

    /* renamed from: d */
    public byte[] f43824d;

    public C9049d(xf7 xf7) {
        if (xf7 != null) {
            this.f43821a = xf7;
            int c = xf7.mo66864c();
            this.f43822b = new ob3(xf7.mo66863b(), c);
            this.f43823c = new byte[c];
            this.f43824d = new byte[c];
            return;
        }
        throw new NullPointerException("params == null");
    }

    /* renamed from: a */
    public final byte[] mo64648a(byte[] bArr, int i, int i2, C9046c cVar) {
        int c = this.f43821a.mo66864c();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        } else if (bArr.length != c) {
            throw new IllegalArgumentException("startHash needs to be " + c + "bytes");
        } else if (cVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (cVar.mo64624d() != null) {
            int i3 = i + i2;
            if (i3 > this.f43821a.mo66865d() - 1) {
                throw new IllegalArgumentException("max chain length must not be greater than w");
            } else if (i2 == 0) {
                return bArr;
            } else {
                byte[] a = mo64648a(bArr, i, i2 - 1, cVar);
                C9046c cVar2 = (C9046c) ((C9046c.C9048b) ((C9046c.C9048b) ((C9046c.C9048b) new C9046c.C9048b().mo64660g(cVar.mo64657b())).mo64661h(cVar.mo64658c())).mo64647p(cVar.mo64642g()).mo64645n(cVar.mo64640e()).mo64646o(i3 - 1).mo64659f(0)).mo64643l();
                byte[] c2 = this.f43822b.mo62861c(this.f43824d, cVar2.mo64624d());
                byte[] c3 = this.f43822b.mo62861c(this.f43824d, ((C9046c) ((C9046c.C9048b) ((C9046c.C9048b) ((C9046c.C9048b) new C9046c.C9048b().mo64660g(cVar2.mo64657b())).mo64661h(cVar2.mo64658c())).mo64647p(cVar2.mo64642g()).mo64645n(cVar2.mo64640e()).mo64646o(cVar2.mo64641f()).mo64659f(1)).mo64643l()).mo64624d());
                byte[] bArr2 = new byte[c];
                for (int i4 = 0; i4 < c; i4++) {
                    bArr2[i4] = (byte) (a[i4] ^ c3[i4]);
                }
                return this.f43822b.mo62859a(c2, bArr2);
            }
        } else {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
    }

    /* renamed from: b */
    public final byte[] mo64649b(int i) {
        if (i >= 0 && i < this.f43821a.mo66862a()) {
            return this.f43822b.mo62861c(this.f43823c, dp7.m57007q((long) i, 32));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    /* renamed from: c */
    public ob3 mo64650c() {
        return this.f43822b;
    }

    /* renamed from: d */
    public xf7 mo64651d() {
        return this.f43821a;
    }

    /* renamed from: e */
    public yf7 mo64652e(C9046c cVar) {
        if (cVar != null) {
            byte[][] bArr = new byte[this.f43821a.mo66862a()][];
            for (int i = 0; i < this.f43821a.mo66862a(); i++) {
                cVar = (C9046c) ((C9046c.C9048b) ((C9046c.C9048b) ((C9046c.C9048b) new C9046c.C9048b().mo64660g(cVar.mo64657b())).mo64661h(cVar.mo64658c())).mo64647p(cVar.mo64642g()).mo64645n(i).mo64646o(cVar.mo64641f()).mo64659f(cVar.mo64656a())).mo64643l();
                bArr[i] = mo64648a(mo64649b(i), 0, this.f43821a.mo66865d() - 1, cVar);
            }
            return new yf7(this.f43821a, bArr);
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* renamed from: f */
    public byte[] mo64653f() {
        return C9367tq.m72422f(this.f43824d);
    }

    /* renamed from: g */
    public byte[] mo64654g(byte[] bArr, C9046c cVar) {
        return this.f43822b.mo62861c(bArr, ((C9046c) ((C9046c.C9048b) ((C9046c.C9048b) new C9046c.C9048b().mo64660g(cVar.mo64657b())).mo64661h(cVar.mo64658c())).mo64647p(cVar.mo64642g()).mo64643l()).mo64624d());
    }

    /* renamed from: h */
    public void mo64655h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        } else if (bArr.length != this.f43821a.mo66864c()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        } else if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        } else if (bArr2.length == this.f43821a.mo66864c()) {
            this.f43823c = bArr;
            this.f43824d = bArr2;
        } else {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
    }
}
