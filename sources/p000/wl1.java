package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: wl1 */
public class wl1 implements tl1 {

    /* renamed from: g */
    public final z01 f45734g;

    /* renamed from: h */
    public dm1 f45735h;

    /* renamed from: i */
    public SecureRandom f45736i;

    public wl1(z01 z01) {
        this.f45734g = z01;
    }

    /* renamed from: a */
    public BigInteger mo66729a(BigInteger bigInteger, byte[] bArr) {
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return bitLength < length ? bigInteger2.shiftRight(length - bitLength) : bigInteger2;
    }

    /* renamed from: b */
    public gm1 mo66730b() {
        return new k32();
    }

    /* renamed from: c */
    public BigInteger[] mo66731c(byte[] bArr) {
        xl1 a = this.f45735h.mo51233a();
        BigInteger d = a.mo66884d();
        BigInteger a2 = mo66729a(d, bArr);
        BigInteger b = ((qm1) this.f45735h).mo65486b();
        if (this.f45734g.mo56263c()) {
            this.f45734g.mo56264d(d, b, bArr);
        } else {
            this.f45734g.mo56261a(d, this.f45736i);
        }
        gm1 b2 = mo66730b();
        while (true) {
            BigInteger b3 = this.f45734g.mo56262b();
            BigInteger mod = b2.mo51129a(a.mo66882b(), b3).mo62725A().mo62737f().mo50994t().mod(d);
            BigInteger bigInteger = tl1.f44771a;
            if (!mod.equals(bigInteger)) {
                BigInteger mod2 = i10.m58767g(d, b3).multiply(a2.add(b.multiply(mod))).mod(d);
                if (!mod2.equals(bigInteger)) {
                    return new BigInteger[]{mod, mod2};
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66732d(boolean r2, p000.we0 r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0018
            boolean r0 = r3 instanceof p000.zl4
            if (r0 == 0) goto L_0x0015
            zl4 r3 = (p000.zl4) r3
            we0 r0 = r3.mo67346a()
            qm1 r0 = (p000.qm1) r0
            r1.f45735h = r0
            java.security.SecureRandom r3 = r3.mo67347b()
            goto L_0x001d
        L_0x0015:
            qm1 r3 = (p000.qm1) r3
            goto L_0x001a
        L_0x0018:
            sm1 r3 = (p000.sm1) r3
        L_0x001a:
            r1.f45735h = r3
            r3 = 0
        L_0x001d:
            if (r2 == 0) goto L_0x0029
            z01 r2 = r1.f45734g
            boolean r2 = r2.mo56263c()
            if (r2 != 0) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            java.security.SecureRandom r2 = r1.mo66733e(r2, r3)
            r1.f45736i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wl1.mo66732d(boolean, we0):void");
    }

    /* renamed from: e */
    public SecureRandom mo66733e(boolean z, SecureRandom secureRandom) {
        if (z) {
            return bx0.m56185c(secureRandom);
        }
        return null;
    }
}
