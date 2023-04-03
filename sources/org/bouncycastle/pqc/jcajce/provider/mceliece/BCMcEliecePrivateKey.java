package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.PrivateKey;

public class BCMcEliecePrivateKey implements we0, PrivateKey {
    private static final long serialVersionUID = 1;
    private fq3 params;

    public BCMcEliecePrivateKey(fq3 fq3) {
        this.params = fq3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) obj;
        return getN() == bCMcEliecePrivateKey.getN() && getK() == bCMcEliecePrivateKey.getK() && getField().equals(bCMcEliecePrivateKey.getField()) && getGoppaPoly().equals(bCMcEliecePrivateKey.getGoppaPoly()) && getSInv().equals(bCMcEliecePrivateKey.getSInv()) && getP1().equals(bCMcEliecePrivateKey.getP1()) && getP2().equals(bCMcEliecePrivateKey.getP2());
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r9 = this;
            eq3 r8 = new eq3
            fq3 r0 = r9.params
            int r1 = r0.mo51746e()
            fq3 r0 = r9.params
            int r2 = r0.mo51745d()
            fq3 r0 = r9.params
            oe2 r3 = r0.mo51742a()
            fq3 r0 = r9.params
            fs4 r4 = r0.mo51743b()
            fq3 r0 = r9.params
            mn4 r5 = r0.mo51747f()
            fq3 r0 = r9.params
            mn4 r6 = r0.mo51748g()
            fq3 r0 = r9.params
            me2 r7 = r0.mo51750i()
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            af r1 = new af     // Catch:{ IOException -> 0x0041 }
            p4 r2 = p000.bk4.f36880m     // Catch:{ IOException -> 0x0041 }
            r1.<init>((p000.C9156p4) r2)     // Catch:{ IOException -> 0x0041 }
            lv4 r2 = new lv4     // Catch:{ IOException -> 0x0041 }
            r2.<init>(r1, r8)     // Catch:{ IOException -> 0x0041 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey.getEncoded():byte[]");
    }

    public oe2 getField() {
        return this.params.mo51742a();
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public fs4 getGoppaPoly() {
        return this.params.mo51743b();
    }

    public me2 getH() {
        return this.params.mo51744c();
    }

    public int getK() {
        return this.params.mo51745d();
    }

    public C9414ur getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.mo51746e();
    }

    public mn4 getP1() {
        return this.params.mo51747f();
    }

    public mn4 getP2() {
        return this.params.mo51748g();
    }

    public fs4[] getQInv() {
        return this.params.mo51749h();
    }

    public me2 getSInv() {
        return this.params.mo51750i();
    }

    public int hashCode() {
        return (((((((((((this.params.mo51745d() * 37) + this.params.mo51746e()) * 37) + this.params.mo51742a().hashCode()) * 37) + this.params.mo51743b().hashCode()) * 37) + this.params.mo51747f().hashCode()) * 37) + this.params.mo51748g().hashCode()) * 37) + this.params.mo51750i().hashCode();
    }
}
