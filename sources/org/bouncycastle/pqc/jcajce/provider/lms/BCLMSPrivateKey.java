package org.bouncycastle.pqc.jcajce.provider.lms;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey;

public class BCLMSPrivateKey implements PrivateKey, LMSPrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;

    /* renamed from: a */
    public transient od3 f43853a;

    /* renamed from: d */
    public transient C9586x4 f43854d;

    public BCLMSPrivateKey(lv4 lv4) throws IOException {
        mo64704a(lv4);
    }

    public BCLMSPrivateKey(od3 od3) {
        this.f43853a = od3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo64704a(lv4.m64012s((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void mo64704a(lv4 lv4) throws IOException {
        this.f43854d = lv4.mo55984r();
        this.f43853a = (od3) kv4.m63625b(lv4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCLMSPrivateKey)) {
            return false;
        }
        try {
            return C9367tq.m72417a(this.f43853a.getEncoded(), ((BCLMSPrivateKey) obj).f43853a.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    public LMSPrivateKey extractKeyShard(int i) {
        od3 od3 = this.f43853a;
        return od3 instanceof pd3 ? new BCLMSPrivateKey((od3) ((pd3) od3).mo65278b(i)) : new BCLMSPrivateKey((od3) ((nk2) od3).mo62702a(i));
    }

    public String getAlgorithm() {
        return "LMS";
    }

    public byte[] getEncoded() {
        try {
            return mv4.m64459a(this.f43853a, this.f43854d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public long getIndex() {
        if (getUsagesRemaining() != 0) {
            od3 od3 = this.f43853a;
            return od3 instanceof pd3 ? (long) ((pd3) od3).mo65284g() : ((nk2) od3).mo62703b();
        }
        throw new IllegalStateException("key exhausted");
    }

    public we0 getKeyParams() {
        return this.f43853a;
    }

    public int getLevels() {
        od3 od3 = this.f43853a;
        if (od3 instanceof pd3) {
            return 1;
        }
        return ((nk2) od3).mo62707f();
    }

    public long getUsagesRemaining() {
        od3 od3 = this.f43853a;
        return od3 instanceof pd3 ? ((pd3) od3).mo65291o() : ((nk2) od3).mo62712j();
    }

    public int hashCode() {
        try {
            return C9367tq.m72437u(this.f43853a.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
