package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey;

public class BCNHPrivateKey implements NHPrivateKey {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public transient k24 f43856a;

    /* renamed from: d */
    public transient C9586x4 f43857d;

    public BCNHPrivateKey(k24 k24) {
        this.f43856a = k24;
    }

    public BCNHPrivateKey(lv4 lv4) throws IOException {
        mo64769a(lv4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64769a(lv4.m64012s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64769a(lv4 lv4) throws IOException {
        this.f43857d = lv4.mo55984r();
        this.f43856a = (k24) kv4.m63625b(lv4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCNHPrivateKey)) {
            return false;
        }
        return C9367tq.m72420d(this.f43856a.mo52852a(), ((BCNHPrivateKey) obj).f43856a.mo52852a());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            return mv4.m64459a(this.f43856a, this.f43857d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public we0 getKeyParams() {
        return this.f43856a;
    }

    public short[] getSecretData() {
        return this.f43856a.mo52852a();
    }

    public int hashCode() {
        return C9367tq.m72412A(this.f43856a.mo52852a());
    }
}
