package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class BCXMSSMTPublicKey implements PublicKey {
    private static final long serialVersionUID = 3230324130542413475L;

    /* renamed from: a */
    public transient C9156p4 f43873a;

    /* renamed from: d */
    public transient xo7 f43874d;

    public BCXMSSMTPublicKey(ic6 ic6) throws IOException {
        mo64843a(ic6);
    }

    public BCXMSSMTPublicKey(C9156p4 p4Var, xo7 xo7) {
        this.f43873a = p4Var;
        this.f43874d = xo7;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64843a(ic6.m58895s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64843a(ic6 ic6) throws IOException {
        xo7 xo7 = (xo7) uy4.m72994a(ic6);
        this.f43874d = xo7;
        this.f43873a = lg1.m63830a(xo7.mo65683a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPublicKey)) {
            return false;
        }
        BCXMSSMTPublicKey bCXMSSMTPublicKey = (BCXMSSMTPublicKey) obj;
        return this.f43873a.mo65963B(bCXMSSMTPublicKey.f43873a) && C9367tq.m72417a(this.f43874d.mo66911e(), bCXMSSMTPublicKey.f43874d.mo66911e());
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return jc6.m59342a(this.f43874d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int getHeight() {
        return this.f43874d.mo66908b().mo66102a();
    }

    public we0 getKeyParams() {
        return this.f43874d;
    }

    public int getLayers() {
        return this.f43874d.mo66908b().mo66103b();
    }

    public String getTreeDigest() {
        return lg1.m63831b(this.f43873a);
    }

    public int hashCode() {
        return this.f43873a.hashCode() + (C9367tq.m72437u(this.f43874d.mo66911e()) * 37);
    }
}
