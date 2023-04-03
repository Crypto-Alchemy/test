package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.security.PrivateKey;

public class BCMcElieceCCA2PrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private yp3 params;

    public BCMcElieceCCA2PrivateKey(yp3 yp3) {
        this.params = yp3;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PrivateKey)) {
            return false;
        }
        BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey = (BCMcElieceCCA2PrivateKey) obj;
        return getN() == bCMcElieceCCA2PrivateKey.getN() && getK() == bCMcElieceCCA2PrivateKey.getK() && getField().equals(bCMcElieceCCA2PrivateKey.getField()) && getGoppaPoly().equals(bCMcElieceCCA2PrivateKey.getGoppaPoly()) && getP().equals(bCMcElieceCCA2PrivateKey.getP()) && getH().equals(bCMcElieceCCA2PrivateKey.getH());
    }

    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public byte[] getEncoded() {
        try {
            return new lv4(new C6825af(bk4.f36881n), new xp3(getN(), getK(), getField(), getGoppaPoly(), getP(), s77.m71890a(this.params.mo66759a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public oe2 getField() {
        return this.params.mo67140b();
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public fs4 getGoppaPoly() {
        return this.params.mo67141c();
    }

    public me2 getH() {
        return this.params.mo67142d();
    }

    public int getK() {
        return this.params.mo67143e();
    }

    public C9414ur getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.mo67144f();
    }

    public mn4 getP() {
        return this.params.mo67145g();
    }

    public fs4[] getQInv() {
        return this.params.mo67146h();
    }

    public int getT() {
        return this.params.mo67141c().mo51784g();
    }

    public int hashCode() {
        return (((((((((this.params.mo67143e() * 37) + this.params.mo67144f()) * 37) + this.params.mo67140b().hashCode()) * 37) + this.params.mo67141c().hashCode()) * 37) + this.params.mo67145g().hashCode()) * 37) + this.params.mo67142d().hashCode();
    }
}
