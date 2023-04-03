package org.bouncycastle.pqc.jcajce.provider.sphincs;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;

public class BCSphincs256PrivateKey implements PrivateKey, SPHINCSKey {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public transient C9156p4 f43865a;

    /* renamed from: d */
    public transient nj5 f43866d;

    /* renamed from: e */
    public transient C9586x4 f43867e;

    public BCSphincs256PrivateKey(lv4 lv4) throws IOException {
        mo64819a(lv4);
    }

    public BCSphincs256PrivateKey(C9156p4 p4Var, nj5 nj5) {
        this.f43865a = p4Var;
        this.f43866d = nj5;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64819a(lv4.m64012s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64819a(lv4 lv4) throws IOException {
        this.f43867e = lv4.mo55984r();
        this.f43865a = lj5.m63846r(lv4.mo55985t().mo50160t()).mo55912s().mo50159r();
        this.f43866d = (nj5) kv4.m63625b(lv4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PrivateKey)) {
            return false;
        }
        BCSphincs256PrivateKey bCSphincs256PrivateKey = (BCSphincs256PrivateKey) obj;
        return this.f43865a.mo65963B(bCSphincs256PrivateKey.f43865a) && C9367tq.m72417a(this.f43866d.mo62701b(), bCSphincs256PrivateKey.f43866d.mo62701b());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            return (this.f43866d.mo56259a() != null ? mv4.m64459a(this.f43866d, this.f43867e) : new lv4(new C6825af(bk4.f36885r, new lj5(new C6825af(this.f43865a))), new yz0(this.f43866d.mo62701b()), this.f43867e)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public byte[] getKeyData() {
        return this.f43866d.mo62701b();
    }

    public we0 getKeyParams() {
        return this.f43866d;
    }

    public C9156p4 getTreeDigest() {
        return this.f43865a;
    }

    public int hashCode() {
        return this.f43865a.hashCode() + (C9367tq.m72437u(this.f43866d.mo62701b()) * 37);
    }
}
