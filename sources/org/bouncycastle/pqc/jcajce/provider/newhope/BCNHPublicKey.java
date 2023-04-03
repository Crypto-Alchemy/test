package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey;

public class BCNHPublicKey implements NHPublicKey {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public transient l24 f43858a;

    public BCNHPublicKey(ic6 ic6) throws IOException {
        mo64776a(ic6);
    }

    public BCNHPublicKey(l24 l24) {
        this.f43858a = l24;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64776a(ic6.m58895s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64776a(ic6 ic6) throws IOException {
        this.f43858a = (l24) uy4.m72994a(ic6);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPublicKey)) {
            return false;
        }
        return C9367tq.m72417a(this.f43858a.mo55808a(), ((BCNHPublicKey) obj).f43858a.mo55808a());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            return jc6.m59342a(this.f43858a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public we0 getKeyParams() {
        return this.f43858a;
    }

    public byte[] getPublicData() {
        return this.f43858a.mo55808a();
    }

    public int hashCode() {
        return C9367tq.m72437u(this.f43858a.mo55808a());
    }
}
