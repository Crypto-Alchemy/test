package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.PublicKey;

public class BCRainbowPublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private short[][] coeffquadratic;
    private short[] coeffscalar;
    private short[][] coeffsingular;
    private int docLength;
    private q65 rainbowParams;

    public BCRainbowPublicKey(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.docLength = i;
        this.coeffquadratic = sArr;
        this.coeffsingular = sArr2;
        this.coeffscalar = sArr3;
    }

    public BCRainbowPublicKey(v65 v65) {
        throw null;
    }

    public BCRainbowPublicKey(w65 w65) {
        this(w65.mo66641d(), w65.mo66638a(), w65.mo66640c(), w65.mo66639b());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPublicKey)) {
            return false;
        }
        BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) obj;
        return this.docLength == bCRainbowPublicKey.getDocLength() && x65.m73884j(this.coeffquadratic, bCRainbowPublicKey.getCoeffQuadratic()) && x65.m73884j(this.coeffsingular, bCRainbowPublicKey.getCoeffSingular()) && x65.m73883i(this.coeffscalar, bCRainbowPublicKey.getCoeffScalar());
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[][] getCoeffQuadratic() {
        return this.coeffquadratic;
    }

    public short[] getCoeffScalar() {
        return C9367tq.m72425i(this.coeffscalar);
    }

    public short[][] getCoeffSingular() {
        short[][] sArr = new short[this.coeffsingular.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.coeffsingular;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = C9367tq.m72425i(sArr2[i]);
            i++;
        }
    }

    public int getDocLength() {
        return this.docLength;
    }

    public byte[] getEncoded() {
        return ib3.m58892a(new C6825af(bk4.f36868a, wz0.f45797d), new u65(this.docLength, this.coeffquadratic, this.coeffsingular, this.coeffscalar));
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.docLength * 37) + C9367tq.m72413B(this.coeffquadratic)) * 37) + C9367tq.m72413B(this.coeffsingular)) * 37) + C9367tq.m72412A(this.coeffscalar);
    }
}
