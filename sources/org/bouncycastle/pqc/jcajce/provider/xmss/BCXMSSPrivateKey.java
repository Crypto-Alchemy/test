package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.pqc.crypto.xmss.C9053g;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey;

public class BCXMSSPrivateKey implements PrivateKey, XMSSPrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;

    /* renamed from: a */
    public transient C9053g f43875a;

    /* renamed from: d */
    public transient C9156p4 f43876d;

    /* renamed from: e */
    public transient C9586x4 f43877e;

    public BCXMSSPrivateKey(lv4 lv4) throws IOException {
        mo64853a(lv4);
    }

    public BCXMSSPrivateKey(C9156p4 p4Var, C9053g gVar) {
        this.f43876d = p4Var;
        this.f43875a = gVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64853a(lv4.m64012s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64853a(lv4 lv4) throws IOException {
        this.f43877e = lv4.mo55984r();
        this.f43876d = po7.m71049s(lv4.mo55985t().mo50160t()).mo65330t().mo50159r();
        this.f43875a = (C9053g) kv4.m63625b(lv4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSPrivateKey)) {
            return false;
        }
        BCXMSSPrivateKey bCXMSSPrivateKey = (BCXMSSPrivateKey) obj;
        return this.f43876d.mo65963B(bCXMSSPrivateKey.f43876d) && C9367tq.m72417a(this.f43875a.mo64666f(), bCXMSSPrivateKey.f43875a.mo64666f());
    }

    public XMSSPrivateKey extractKeyShard(int i) {
        return new BCXMSSPrivateKey(this.f43876d, this.f43875a.mo64662b(i));
    }

    public String getAlgorithm() {
        return "XMSS";
    }

    public byte[] getEncoded() {
        try {
            return mv4.m64459a(this.f43875a, this.f43877e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int getHeight() {
        return this.f43875a.mo64664d().mo67366b();
    }

    public long getIndex() {
        if (getUsagesRemaining() != 0) {
            return (long) this.f43875a.mo64663c();
        }
        throw new IllegalStateException("key exhausted");
    }

    public we0 getKeyParams() {
        return this.f43875a;
    }

    public String getTreeDigest() {
        return lg1.m63831b(this.f43876d);
    }

    public C9156p4 getTreeDigestOID() {
        return this.f43876d;
    }

    public long getUsagesRemaining() {
        return this.f43875a.mo64665e();
    }

    public int hashCode() {
        return this.f43876d.hashCode() + (C9367tq.m72437u(this.f43875a.mo64666f()) * 37);
    }
}
