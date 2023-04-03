package p000;

import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;

/* renamed from: sd3 */
public class sd3 {
    /* renamed from: a */
    public static int m71905a(byte[] bArr, int i, LMOtsParameters lMOtsParameters) {
        int h = (1 << lMOtsParameters.mo64587h()) - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < (i * 8) / lMOtsParameters.mo64587h(); i3++) {
            i2 = (i2 + h) - m71906b(bArr, i3, lMOtsParameters.mo64587h());
        }
        return i2 << lMOtsParameters.mo64583c();
    }

    /* renamed from: b */
    public static int m71906b(byte[] bArr, int i, int i2) {
        return (bArr[(i * i2) / 8] >>> (((~i) & ((8 / i2) - 1)) * i2)) & ((1 << i2) - 1);
    }

    /* renamed from: c */
    public static kd3 m71907c(jd3 jd3, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        LMOtsParameters c = jd3.mo52670c();
        int d = c.mo64584d();
        int e = c.mo64585e();
        int h = c.mo64587h();
        byte[] bArr4 = new byte[(e * d)];
        ig1 a = mg1.m64327a(c.mo64582b());
        ws5 a2 = jd3.mo52668a();
        int a3 = m71905a(bArr3, d, c);
        bArr3[d] = (byte) ((a3 >>> 8) & 255);
        bArr3[d + 1] = (byte) a3;
        int i = d + 23;
        byte[] b = on0.m70404f().mo64500d(jd3.mo52669b()).mo64504i(jd3.mo52671d()).mo64502g(0, i).mo64498b();
        a2.mo66768d(0);
        int i2 = 0;
        while (i2 < e) {
            ek4.m57396p((short) i2, b, 20);
            int i3 = 23;
            a2.mo66766b(b, i2 < e + -1, 23);
            int b2 = m71906b(bArr3, i2, h);
            for (int i4 = 0; i4 < b2; i4++) {
                b[22] = (byte) i4;
                a.update(b, 0, i);
                i3 = 23;
                a.mo50198a(b, 23);
            }
            System.arraycopy(b, i3, bArr4, d * i2, d);
            i2++;
        }
        return new kd3(c, bArr2, bArr4);
    }

    /* renamed from: d */
    public static byte[] m71908d(LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        ig1 a = mg1.m64327a(lMOtsParameters.mo64582b());
        byte[] b = on0.m70404f().mo64500d(bArr).mo64504i(i).mo64503h(-32640).mo64502g(0, 22).mo64498b();
        a.update(b, 0, b.length);
        ig1 a2 = mg1.m64327a(lMOtsParameters.mo64582b());
        byte[] b2 = on0.m70404f().mo64500d(bArr).mo64504i(i).mo64502g(0, a2.mo50202e() + 23).mo64498b();
        ws5 ws5 = new ws5(bArr, bArr2, mg1.m64327a(lMOtsParameters.mo64582b()));
        ws5.mo66769e(i);
        ws5.mo66768d(0);
        int e = lMOtsParameters.mo64585e();
        int d = lMOtsParameters.mo64584d();
        int h = (1 << lMOtsParameters.mo64587h()) - 1;
        int i2 = 0;
        while (i2 < e) {
            ws5.mo66766b(b2, i2 < e + -1, 23);
            ek4.m57396p((short) i2, b2, 20);
            for (int i3 = 0; i3 < h; i3++) {
                b2[22] = (byte) i3;
                a2.update(b2, 0, b2.length);
                a2.mo50198a(b2, 23);
            }
            a.update(b2, 23, d);
            i2++;
        }
        byte[] bArr3 = new byte[a.mo50202e()];
        a.mo50198a(bArr3, 0);
        return bArr3;
    }
}
