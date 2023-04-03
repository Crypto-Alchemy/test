package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey;

public class BCXMSSMTPrivateKey implements PrivateKey, XMSSMTPrivateKey {
    private static final long serialVersionUID = 7682140473044521395L;

    /* renamed from: a */
    public transient C9156p4 f43870a;

    /* renamed from: d */
    public transient vo7 f43871d;

    /* renamed from: e */
    public transient C9586x4 f43872e;

    public BCXMSSMTPrivateKey(lv4 lv4) throws IOException {
        mo64835a(lv4);
    }

    public BCXMSSMTPrivateKey(C9156p4 p4Var, vo7 vo7) {
        this.f43870a = p4Var;
        this.f43871d = vo7;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64835a(lv4.m64012s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64835a(lv4 lv4) throws IOException {
        this.f43872e = lv4.mo55984r();
        this.f43870a = so7.m71990s(lv4.mo55985t().mo50160t()).mo65882u().mo50159r();
        this.f43871d = (vo7) kv4.m63625b(lv4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPrivateKey)) {
            return false;
        }
        BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (BCXMSSMTPrivateKey) obj;
        return this.f43870a.mo65963B(bCXMSSMTPrivateKey.f43870a) && C9367tq.m72417a(this.f43871d.mo66553g(), bCXMSSMTPrivateKey.f43871d.mo66553g());
    }

    public XMSSMTPrivateKey extractKeyShard(int i) {
        return new BCXMSSMTPrivateKey(this.f43870a, this.f43871d.mo66548b(i));
    }

    public String getAlgorithm() {
        return "XMSSMT";
    }

    public byte[] getEncoded() {
        try {
            return mv4.m64459a(this.f43871d, this.f43872e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int getHeight() {
        return this.f43871d.mo66550d().mo66102a();
    }

    public long getIndex() {
        if (getUsagesRemaining() != 0) {
            return this.f43871d.mo66549c();
        }
        throw new IllegalStateException("key exhausted");
    }

    public we0 getKeyParams() {
        return this.f43871d;
    }

    public int getLayers() {
        return this.f43871d.mo66550d().mo66103b();
    }

    public String getTreeDigest() {
        return lg1.m63831b(this.f43870a);
    }

    public C9156p4 getTreeDigestOID() {
        return this.f43870a;
    }

    public long getUsagesRemaining() {
        return this.f43871d.mo66551e();
    }

    public int hashCode() {
        return this.f43870a.hashCode() + (C9367tq.m72437u(this.f43871d.mo66553g()) * 37);
    }
}
