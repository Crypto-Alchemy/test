package p000;

import java.math.BigInteger;
import p000.nm1;
import p000.ul1;

/* renamed from: zf7 */
public class zf7 extends C6965d6 {

    /* renamed from: zf7$a */
    public static class C9676a implements ut4 {

        /* renamed from: a */
        public final /* synthetic */ nm1.C8993b f46378a;

        /* renamed from: b */
        public final /* synthetic */ byte f46379b;

        public C9676a(nm1.C8993b bVar, byte b) {
            this.f46378a = bVar;
            this.f46379b = b;
        }

        /* renamed from: a */
        public vt4 mo56012a(vt4 vt4) {
            if (vt4 instanceof ag7) {
                return vt4;
            }
            ag7 ag7 = new ag7();
            ag7.mo50182b(ar6.m55658d(this.f46378a, this.f46379b));
            return ag7;
        }
    }

    /* renamed from: d */
    public static nm1.C8993b m74914d(nm1.C8993b bVar, byte[] bArr) {
        ul1.C9406b bVar2 = (ul1.C9406b) bVar.mo62740i();
        nm1.C8993b[] a = ((ag7) bVar2.mo66305A(bVar, "bc_wtnaf", new C9676a(bVar, bVar2.mo66316n().mo50994t().byteValue()))).mo50181a();
        nm1.C8993b[] bVarArr = new nm1.C8993b[a.length];
        for (int i = 0; i < a.length; i++) {
            bVarArr[i] = (nm1.C8993b) a[i].mo50278z();
        }
        nm1.C8993b bVar3 = (nm1.C8993b) bVar.mo62740i().mo50668u();
        int i2 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i2++;
            byte b = bArr[length];
            if (b != 0) {
                bVar3 = (nm1.C8993b) bVar3.mo62756L(i2).mo50276a(b > 0 ? a[b >>> 1] : bVarArr[(-b) >>> 1]);
                i2 = 0;
            }
        }
        return i2 > 0 ? bVar3.mo62756L(i2) : bVar3;
    }

    /* renamed from: c */
    public nm1 mo51131c(nm1 nm1, BigInteger bigInteger) {
        if (nm1 instanceof nm1.C8993b) {
            nm1.C8993b bVar = (nm1.C8993b) nm1;
            ul1.C9406b bVar2 = (ul1.C9406b) bVar.mo62740i();
            int t = bVar2.mo50667t();
            byte byteValue = bVar2.mo66316n().mo50994t().byteValue();
            byte c = ar6.m55657c(byteValue);
            return mo67268e(bVar, ar6.m55664j(bigInteger, t, byteValue, bVar2.mo66328F(), c, (byte) 10), byteValue, c);
        }
        throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
    }

    /* renamed from: e */
    public final nm1.C8993b mo67268e(nm1.C8993b bVar, np7 np7, byte b, byte b2) {
        np7[] np7Arr = b == 0 ? ar6.f36549d : ar6.f36551f;
        return m74914d(bVar, ar6.m55666l(b2, np7, (byte) 4, BigInteger.valueOf(16), ar6.m55661g(b2, 4), np7Arr));
    }
}
