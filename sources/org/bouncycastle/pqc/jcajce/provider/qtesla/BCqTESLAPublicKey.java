package org.bouncycastle.pqc.jcajce.provider.qtesla;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class BCqTESLAPublicKey implements PublicKey {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public transient jz4 f43861a;

    public BCqTESLAPublicKey(ic6 ic6) throws IOException {
        mo64791a(ic6);
    }

    public BCqTESLAPublicKey(jz4 jz4) {
        this.f43861a = jz4;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64791a(ic6.m58895s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64791a(ic6 ic6) throws IOException {
        this.f43861a = (jz4) uy4.m72994a(ic6);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCqTESLAPublicKey)) {
            return false;
        }
        BCqTESLAPublicKey bCqTESLAPublicKey = (BCqTESLAPublicKey) obj;
        return this.f43861a.mo52823b() == bCqTESLAPublicKey.f43861a.mo52823b() && C9367tq.m72417a(this.f43861a.mo52822a(), bCqTESLAPublicKey.f43861a.mo52822a());
    }

    public final String getAlgorithm() {
        return kz4.m63638a(this.f43861a.mo52823b());
    }

    public byte[] getEncoded() {
        try {
            return jc6.m59342a(this.f43861a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public we0 getKeyParams() {
        return this.f43861a;
    }

    public hz4 getParams() {
        return new hz4(getAlgorithm());
    }

    public int hashCode() {
        return this.f43861a.mo52823b() + (C9367tq.m72437u(this.f43861a.mo52822a()) * 37);
    }
}
