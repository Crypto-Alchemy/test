package org.bouncycastle.pqc.jcajce.provider.qtesla;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class BCqTESLAPrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public transient iz4 f43859a;

    /* renamed from: d */
    public transient C9586x4 f43860d;

    public BCqTESLAPrivateKey(iz4 iz4) {
        this.f43859a = iz4;
    }

    public BCqTESLAPrivateKey(lv4 lv4) throws IOException {
        mo64783a(lv4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64783a(lv4.m64012s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64783a(lv4 lv4) throws IOException {
        this.f43860d = lv4.mo55984r();
        this.f43859a = (iz4) kv4.m63625b(lv4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCqTESLAPrivateKey)) {
            return false;
        }
        BCqTESLAPrivateKey bCqTESLAPrivateKey = (BCqTESLAPrivateKey) obj;
        return this.f43859a.mo52556b() == bCqTESLAPrivateKey.f43859a.mo52556b() && C9367tq.m72417a(this.f43859a.mo52555a(), bCqTESLAPrivateKey.f43859a.mo52555a());
    }

    public final String getAlgorithm() {
        return kz4.m63638a(this.f43859a.mo52556b());
    }

    public byte[] getEncoded() {
        try {
            return mv4.m64459a(this.f43859a, this.f43860d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public we0 getKeyParams() {
        return this.f43859a;
    }

    public hz4 getParams() {
        return new hz4(getAlgorithm());
    }

    public int hashCode() {
        return this.f43859a.mo52556b() + (C9367tq.m72437u(this.f43859a.mo52555a()) * 37);
    }
}
