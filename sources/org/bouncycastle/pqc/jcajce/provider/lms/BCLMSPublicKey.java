package org.bouncycastle.pqc.jcajce.provider.lms;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.pqc.jcajce.interfaces.LMSKey;

public class BCLMSPublicKey implements PublicKey, LMSKey {
    private static final long serialVersionUID = -5617456225328969766L;

    /* renamed from: a */
    public transient od3 f43855a;

    public BCLMSPublicKey(ic6 ic6) throws IOException {
        mo64711a(ic6);
    }

    public BCLMSPublicKey(od3 od3) {
        this.f43855a = od3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64711a(ic6.m58895s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64711a(ic6 ic6) throws IOException {
        this.f43855a = (od3) uy4.m72994a(ic6);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCLMSPublicKey) {
            try {
                return C9367tq.m72417a(this.f43855a.getEncoded(), ((BCLMSPublicKey) obj).f43855a.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "LMS";
    }

    public byte[] getEncoded() {
        try {
            return jc6.m59342a(this.f43855a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public we0 getKeyParams() {
        return this.f43855a;
    }

    public int getLevels() {
        od3 od3 = this.f43855a;
        if (od3 instanceof qd3) {
            return 1;
        }
        return ((ok2) od3).mo62934b();
    }

    public int hashCode() {
        try {
            return C9367tq.m72437u(this.f43855a.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
