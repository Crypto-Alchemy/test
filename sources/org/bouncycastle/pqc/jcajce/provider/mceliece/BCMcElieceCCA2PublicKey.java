package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.security.PublicKey;

public class BCMcElieceCCA2PublicKey implements we0, PublicKey {
    private static final long serialVersionUID = 1;
    private aq3 params;

    public BCMcElieceCCA2PublicKey(aq3 aq3) {
        this.params = aq3;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PublicKey)) {
            return false;
        }
        BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey = (BCMcElieceCCA2PublicKey) obj;
        return this.params.mo50307d() == bCMcElieceCCA2PublicKey.getN() && this.params.mo50308e() == bCMcElieceCCA2PublicKey.getT() && this.params.mo50305b().equals(bCMcElieceCCA2PublicKey.getG());
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            return new ic6(new C6825af(bk4.f36881n), (C6843b4) new zp3(this.params.mo50307d(), this.params.mo50308e(), this.params.mo50305b(), s77.m71890a(this.params.mo66759a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public me2 getG() {
        return this.params.mo50305b();
    }

    public int getK() {
        return this.params.mo50306c();
    }

    public C9414ur getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.mo50307d();
    }

    public int getT() {
        return this.params.mo50308e();
    }

    public int hashCode() {
        return ((this.params.mo50307d() + (this.params.mo50308e() * 37)) * 37) + this.params.mo50305b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n" + " length of the code         : " + this.params.mo50307d() + "\n") + " error correction capability: " + this.params.mo50308e() + "\n") + " generator matrix           : " + this.params.mo50305b().toString();
    }
}
