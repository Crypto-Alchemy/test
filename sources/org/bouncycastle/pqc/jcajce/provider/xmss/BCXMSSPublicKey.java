package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class BCXMSSPublicKey implements PublicKey {
    private static final long serialVersionUID = -5617456225328969766L;

    /* renamed from: a */
    public transient cp7 f43878a;

    /* renamed from: d */
    public transient C9156p4 f43879d;

    public BCXMSSPublicKey(ic6 ic6) throws IOException {
        mo64861a(ic6);
    }

    public BCXMSSPublicKey(C9156p4 p4Var, cp7 cp7) {
        this.f43879d = p4Var;
        this.f43878a = cp7;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64861a(ic6.m58895s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64861a(ic6 ic6) throws IOException {
        cp7 cp7 = (cp7) uy4.m72994a(ic6);
        this.f43878a = cp7;
        this.f43879d = lg1.m63830a(cp7.mo64524a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCXMSSPublicKey) {
            BCXMSSPublicKey bCXMSSPublicKey = (BCXMSSPublicKey) obj;
            try {
                return this.f43879d.mo65963B(bCXMSSPublicKey.f43879d) && C9367tq.m72417a(this.f43878a.getEncoded(), bCXMSSPublicKey.f43878a.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return jc6.m59342a(this.f43878a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int getHeight() {
        return this.f43878a.mo50937b().mo67366b();
    }

    public we0 getKeyParams() {
        return this.f43878a;
    }

    public String getTreeDigest() {
        return lg1.m63831b(this.f43879d);
    }

    public int hashCode() {
        try {
            return this.f43879d.hashCode() + (C9367tq.m72437u(this.f43878a.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.f43879d.hashCode();
        }
    }
}
