package org.bouncycastle.jcajce.provider.asymmetric.p024ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey */
public class BCECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {
    public static final long serialVersionUID = 2422789860422731812L;

    /* renamed from: a */
    public transient sm1 f43763a;
    private String algorithm;

    /* renamed from: d */
    public transient ECParameterSpec f43764d;

    /* renamed from: e */
    public transient my4 f43765e;
    private boolean withCompression;

    public BCECPublicKey(String str, ic6 ic6, my4 my4) {
        this.algorithm = str;
        this.f43765e = my4;
        mo64552b(ic6);
    }

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, my4 my4) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f43764d = params;
        this.f43763a = new sm1(rl1.m71564e(params, eCPublicKeySpec.getW()), rl1.m71570k(my4, eCPublicKeySpec.getParams()));
        this.f43765e = my4;
    }

    public BCECPublicKey(String str, BCECPublicKey bCECPublicKey) {
        this.algorithm = str;
        this.f43763a = bCECPublicKey.f43763a;
        this.f43764d = bCECPublicKey.f43764d;
        this.withCompression = bCECPublicKey.withCompression;
        this.f43765e = bCECPublicKey.f43765e;
    }

    public BCECPublicKey(String str, sm1 sm1, ECParameterSpec eCParameterSpec, my4 my4) {
        this.algorithm = "EC";
        xl1 a = sm1.mo51233a();
        this.algorithm = str;
        this.f43763a = sm1;
        if (eCParameterSpec == null) {
            this.f43764d = mo64551a(rl1.m71561b(a.mo66881a(), a.mo66885e()), a);
        } else {
            this.f43764d = eCParameterSpec;
        }
        this.f43765e = my4;
    }

    public BCECPublicKey(String str, sm1 sm1, mm1 mm1, my4 my4) {
        this.algorithm = "EC";
        xl1 a = sm1.mo51233a();
        this.algorithm = str;
        this.f43764d = mm1 == null ? mo64551a(rl1.m71561b(a.mo66881a(), a.mo66885e()), a) : rl1.m71567h(rl1.m71561b(mm1.mo56270a(), mm1.mo56274e()), mm1);
        this.f43763a = sm1;
        this.f43765e = my4;
    }

    public BCECPublicKey(String str, sm1 sm1, my4 my4) {
        this.algorithm = str;
        this.f43763a = sm1;
        this.f43764d = null;
        this.f43765e = my4;
    }

    public BCECPublicKey(String str, tm1 tm1, my4 my4) {
        this.algorithm = str;
        throw null;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, my4 my4) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.f43764d = params;
        this.f43763a = new sm1(rl1.m71564e(params, eCPublicKey.getW()), rl1.m71570k(my4, eCPublicKey.getParams()));
        this.f43765e = my4;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f43765e = BouncyCastleProvider.CONFIGURATION;
        mo64552b(ic6.m58895s(C9326t4.m72150D((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final ECParameterSpec mo64551a(EllipticCurve ellipticCurve, xl1 xl1) {
        return new ECParameterSpec(ellipticCurve, rl1.m71565f(xl1.mo66882b()), xl1.mo66884d(), xl1.mo66883c().intValue());
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [t4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64552b(p000.ic6 r7) {
        /*
            r6 = this;
            af r0 = r7.mo52430r()
            b4 r0 = r0.mo50160t()
            ao7 r0 = p000.ao7.m55608r(r0)
            my4 r1 = r6.f43765e
            ul1 r1 = p000.rl1.m71569j(r1, r0)
            java.security.spec.ECParameterSpec r2 = p000.rl1.m71568i(r0, r1)
            r6.f43764d = r2
            x3 r7 = r7.mo52431t()
            byte[] r7 = r7.mo66824J()
            yz0 r2 = new yz0
            r2.<init>((byte[]) r7)
            r3 = 0
            byte r3 = r7[r3]
            r4 = 4
            if (r3 != r4) goto L_0x0057
            r3 = 1
            byte r3 = r7[r3]
            int r4 = r7.length
            r5 = 2
            int r4 = r4 - r5
            if (r3 != r4) goto L_0x0057
            byte r3 = r7[r5]
            r4 = 3
            if (r3 == r5) goto L_0x003a
            if (r3 != r4) goto L_0x0057
        L_0x003a:
            ho7 r3 = new ho7
            r3.<init>()
            int r3 = r3.mo52293a(r1)
            int r5 = r7.length
            int r5 = r5 - r4
            if (r3 < r5) goto L_0x0057
            t4 r7 = p000.C9326t4.m72150D(r7)     // Catch:{ IOException -> 0x004f }
            r2 = r7
            q4 r2 = (p000.C9203q4) r2     // Catch:{ IOException -> 0x004f }
            goto L_0x0057
        L_0x004f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error recovering public key"
            r7.<init>(r0)
            throw r7
        L_0x0057:
            eo7 r7 = new eo7
            r7.<init>((p000.ul1) r1, (p000.C9203q4) r2)
            sm1 r1 = new sm1
            nm1 r7 = r7.mo51515r()
            my4 r2 = r6.f43765e
            xl1 r0 = p000.um1.m72913e(r2, r0)
            r1.<init>(r7, r0)
            r6.f43763a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.p024ec.BCECPublicKey.mo64552b(ic6):void");
    }

    public sm1 engineGetKeyParameters() {
        return this.f43763a;
    }

    public mm1 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.f43764d;
        return eCParameterSpec != null ? rl1.m71566g(eCParameterSpec) : this.f43765e.mo56335b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        return this.f43763a.mo65871b().mo62735e(bCECPublicKey.f43763a.mo65871b()) && engineGetSpec().equals(bCECPublicKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        boolean z = this.withCompression || bx4.m56192b("org.bouncycastle.ec.enable_pc");
        return jb3.m59338a(new C6825af(io7.f38452O, vm1.m73290a(this.f43764d, z)), this.f43763a.mo65871b().mo62743l(z));
    }

    public String getFormat() {
        return "X.509";
    }

    public mm1 getParameters() {
        ECParameterSpec eCParameterSpec = this.f43764d;
        if (eCParameterSpec == null) {
            return null;
        }
        return rl1.m71566g(eCParameterSpec);
    }

    public ECParameterSpec getParams() {
        return this.f43764d;
    }

    public nm1 getQ() {
        nm1 b = this.f43763a.mo65871b();
        return this.f43764d == null ? b.mo62742k() : b;
    }

    public ECPoint getW() {
        return rl1.m71565f(this.f43763a.mo65871b());
    }

    public int hashCode() {
        return this.f43763a.mo65871b().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return um1.m72919k("EC", this.f43763a.mo65871b(), engineGetSpec());
    }
}
