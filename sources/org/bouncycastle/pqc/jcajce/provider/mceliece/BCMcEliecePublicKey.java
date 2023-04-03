package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.security.PublicKey;

public class BCMcEliecePublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private hq3 params;

    public BCMcEliecePublicKey(hq3 hq3) {
        this.params = hq3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePublicKey)) {
            return false;
        }
        BCMcEliecePublicKey bCMcEliecePublicKey = (BCMcEliecePublicKey) obj;
        return this.params.mo52303c() == bCMcEliecePublicKey.getN() && this.params.mo52304d() == bCMcEliecePublicKey.getT() && this.params.mo52301a().equals(bCMcEliecePublicKey.getG());
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    public byte[] getEncoded() {
        try {
            return new ic6(new C6825af(bk4.f36880m), (C6843b4) new gq3(this.params.mo52303c(), this.params.mo52304d(), this.params.mo52301a())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public me2 getG() {
        return this.params.mo52301a();
    }

    public int getK() {
        return this.params.mo52302b();
    }

    public C9414ur getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.mo52303c();
    }

    public int getT() {
        return this.params.mo52304d();
    }

    public int hashCode() {
        return ((this.params.mo52303c() + (this.params.mo52304d() * 37)) * 37) + this.params.mo52301a().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n" + " length of the code         : " + this.params.mo52303c() + "\n") + " error correction capability: " + this.params.mo52304d() + "\n") + " generator matrix           : " + this.params.mo52301a();
    }
}
