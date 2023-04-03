package org.bouncycastle.pqc.jcajce.provider.sphincs;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;

public class BCSphincs256PublicKey implements PublicKey, SPHINCSKey {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public transient C9156p4 f43868a;

    /* renamed from: d */
    public transient oj5 f43869d;

    public BCSphincs256PublicKey(ic6 ic6) throws IOException {
        mo64827a(ic6);
    }

    public BCSphincs256PublicKey(C9156p4 p4Var, oj5 oj5) {
        this.f43868a = p4Var;
        this.f43869d = oj5;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64827a(ic6.m58895s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64827a(ic6 ic6) throws IOException {
        this.f43868a = lj5.m63846r(ic6.mo52430r().mo50160t()).mo55912s().mo50159r();
        this.f43869d = (oj5) uy4.m72994a(ic6);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PublicKey)) {
            return false;
        }
        BCSphincs256PublicKey bCSphincs256PublicKey = (BCSphincs256PublicKey) obj;
        return this.f43868a.mo65963B(bCSphincs256PublicKey.f43868a) && C9367tq.m72417a(this.f43869d.mo62933b(), bCSphincs256PublicKey.f43869d.mo62933b());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public byte[] getEncoded() {
        try {
            return (this.f43869d.mo56259a() != null ? jc6.m59342a(this.f43869d) : new ic6(new C6825af(bk4.f36885r, new lj5(new C6825af(this.f43868a))), this.f43869d.mo62933b())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public byte[] getKeyData() {
        return this.f43869d.mo62933b();
    }

    public we0 getKeyParams() {
        return this.f43869d;
    }

    public C9156p4 getTreeDigest() {
        return this.f43868a;
    }

    public int hashCode() {
        return this.f43868a.hashCode() + (C9367tq.m72437u(this.f43869d.mo62933b()) * 37);
    }
}
