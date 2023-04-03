package org.bouncycastle.jcajce.provider.asymmetric.p024ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey */
public class BCECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey {
    public static final long serialVersionUID = 994553197664784084L;

    /* renamed from: a */
    public transient BigInteger f43758a;
    private String algorithm = "EC";

    /* renamed from: d */
    public transient ECParameterSpec f43759d;

    /* renamed from: e */
    public transient my4 f43760e;

    /* renamed from: g */
    public transient C9584x3 f43761g;

    /* renamed from: k */
    public transient uj4 f43762k = new uj4();
    private boolean withCompression;

    public BCECPrivateKey() {
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, my4 my4) {
        this.algorithm = str;
        this.f43758a = eCPrivateKeySpec.getS();
        this.f43759d = eCPrivateKeySpec.getParams();
        this.f43760e = my4;
    }

    public BCECPrivateKey(String str, lv4 lv4, my4 my4) throws IOException {
        this.algorithm = str;
        this.f43760e = my4;
        mo64535b(lv4);
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) {
        this.algorithm = str;
        this.f43758a = bCECPrivateKey.f43758a;
        this.f43759d = bCECPrivateKey.f43759d;
        this.withCompression = bCECPrivateKey.withCompression;
        this.f43762k = bCECPrivateKey.f43762k;
        this.f43761g = bCECPrivateKey.f43761g;
        this.f43760e = bCECPrivateKey.f43760e;
    }

    public BCECPrivateKey(String str, qm1 qm1, my4 my4) {
        this.algorithm = str;
        this.f43758a = qm1.mo65486b();
        this.f43759d = null;
        this.f43760e = my4;
    }

    public BCECPrivateKey(String str, qm1 qm1, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, my4 my4) {
        this.algorithm = str;
        this.f43758a = qm1.mo65486b();
        this.f43760e = my4;
        if (eCParameterSpec == null) {
            xl1 a = qm1.mo51233a();
            eCParameterSpec = new ECParameterSpec(rl1.m71561b(a.mo66881a(), a.mo66885e()), rl1.m71565f(a.mo66882b()), a.mo66884d(), a.mo66883c().intValue());
        }
        this.f43759d = eCParameterSpec;
        this.f43761g = mo64534a(bCECPublicKey);
    }

    public BCECPrivateKey(String str, qm1 qm1, BCECPublicKey bCECPublicKey, mm1 mm1, my4 my4) {
        this.algorithm = str;
        this.f43758a = qm1.mo65486b();
        this.f43760e = my4;
        if (mm1 == null) {
            xl1 a = qm1.mo51233a();
            this.f43759d = new ECParameterSpec(rl1.m71561b(a.mo66881a(), a.mo66885e()), rl1.m71565f(a.mo66882b()), a.mo66884d(), a.mo66883c().intValue());
        } else {
            this.f43759d = rl1.m71567h(rl1.m71561b(mm1.mo56270a(), mm1.mo56274e()), mm1);
        }
        try {
            this.f43761g = mo64534a(bCECPublicKey);
        } catch (Exception unused) {
            this.f43761g = null;
        }
    }

    public BCECPrivateKey(String str, rm1 rm1, my4 my4) {
        this.algorithm = str;
        throw null;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, my4 my4) {
        this.f43758a = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.f43759d = eCPrivateKey.getParams();
        this.f43760e = my4;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f43760e = BouncyCastleProvider.CONFIGURATION;
        mo64535b(lv4.m64012s(C9326t4.m72150D((byte[]) objectInputStream.readObject())));
        this.f43762k = new uj4();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final C9584x3 mo64534a(BCECPublicKey bCECPublicKey) {
        try {
            return ic6.m58895s(C9326t4.m72150D(bCECPublicKey.getEncoded())).mo52431t();
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo64535b(lv4 lv4) throws IOException {
        ao7 r = ao7.m55608r(lv4.mo55985t().mo50160t());
        this.f43759d = rl1.m71568i(r, rl1.m71569j(this.f43760e, r));
        C6843b4 A = lv4.mo55983A();
        if (A instanceof C7333k4) {
            this.f43758a = C7333k4.m59688L(A).mo52858M();
            return;
        }
        pm1 r2 = pm1.m71016r(A);
        this.f43758a = r2.mo65316s();
        this.f43761g = r2.mo65318u();
    }

    public mm1 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.f43759d;
        return eCParameterSpec != null ? rl1.m71566g(eCParameterSpec) : this.f43760e.mo56335b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return getD().equals(bCECPrivateKey.getD()) && engineGetSpec().equals(bCECPrivateKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public C6843b4 getBagAttribute(C9156p4 p4Var) {
        return this.f43762k.mo66290a(p4Var);
    }

    public Enumeration getBagAttributeKeys() {
        return this.f43762k.mo66291b();
    }

    public BigInteger getD() {
        return this.f43758a;
    }

    public byte[] getEncoded() {
        ao7 a = vm1.m73290a(this.f43759d, this.withCompression);
        ECParameterSpec eCParameterSpec = this.f43759d;
        int i = eCParameterSpec == null ? um1.m72917i(this.f43760e, (BigInteger) null, getS()) : um1.m72917i(this.f43760e, eCParameterSpec.getOrder(), getS());
        try {
            return new lv4(new C6825af(io7.f38452O, a), this.f43761g != null ? new pm1(i, getS(), this.f43761g, a) : new pm1(i, getS(), a)).mo56353q("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public mm1 getParameters() {
        ECParameterSpec eCParameterSpec = this.f43759d;
        if (eCParameterSpec == null) {
            return null;
        }
        return rl1.m71566g(eCParameterSpec);
    }

    public ECParameterSpec getParams() {
        return this.f43759d;
    }

    public BigInteger getS() {
        return this.f43758a;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setBagAttribute(C9156p4 p4Var, C6843b4 b4Var) {
        this.f43762k.mo66292c(p4Var, b4Var);
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return um1.m72918j("EC", this.f43758a, engineGetSpec());
    }
}
