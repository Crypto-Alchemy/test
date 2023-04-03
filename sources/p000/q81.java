package p000;

import p000.rq2;

/* renamed from: q81 */
/* compiled from: DefaultImageFormatChecker */
public class q81 implements rq2.C3214a {

    /* renamed from: c */
    public static final byte[] f16857c;

    /* renamed from: d */
    public static final int f16858d;

    /* renamed from: e */
    public static final byte[] f16859e;

    /* renamed from: f */
    public static final int f16860f;

    /* renamed from: g */
    public static final byte[] f16861g = tq2.m27882a("GIF87a");

    /* renamed from: h */
    public static final byte[] f16862h = tq2.m27882a("GIF89a");

    /* renamed from: i */
    public static final byte[] f16863i;

    /* renamed from: j */
    public static final int f16864j;

    /* renamed from: k */
    public static final byte[] f16865k;

    /* renamed from: l */
    public static final int f16866l;

    /* renamed from: m */
    public static final byte[] f16867m = tq2.m27882a("ftyp");

    /* renamed from: n */
    public static final byte[][] f16868n = {tq2.m27882a("heic"), tq2.m27882a("heix"), tq2.m27882a("hevc"), tq2.m27882a("hevx"), tq2.m27882a("mif1"), tq2.m27882a("msf1")};

    /* renamed from: o */
    public static final byte[] f16869o;

    /* renamed from: p */
    public static final byte[] f16870p = {77, 77, 0, 42};

    /* renamed from: q */
    public static final int f16871q;

    /* renamed from: a */
    public final int f16872a = yx2.m30850a(21, 20, f16858d, f16860f, 6, f16864j, f16866l, 12);

    /* renamed from: b */
    public boolean f16873b = false;

    static {
        byte[] bArr = {-1, -40, -1};
        f16857c = bArr;
        f16858d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f16859e = bArr2;
        f16860f = bArr2.length;
        byte[] a = tq2.m27882a("BM");
        f16863i = a;
        f16864j = a.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f16865k = bArr3;
        f16866l = bArr3.length;
        byte[] bArr4 = {73, 73, 42, 0};
        f16869o = bArr4;
        f16871q = bArr4.length;
    }

    /* renamed from: c */
    public static rq2 m25536c(byte[] bArr, int i) {
        au4.m10787b(Boolean.valueOf(fk7.m17058h(bArr, 0, i)));
        if (fk7.m17057g(bArr, 0)) {
            return r81.f17202f;
        }
        if (fk7.m17056f(bArr, 0)) {
            return r81.f17203g;
        }
        if (!fk7.m17053c(bArr, 0, i)) {
            return rq2.f17332c;
        }
        if (fk7.m17052b(bArr, 0)) {
            return r81.f17206j;
        }
        if (fk7.m17054d(bArr, 0)) {
            return r81.f17205i;
        }
        return r81.f17204h;
    }

    /* renamed from: d */
    public static boolean m25537d(byte[] bArr, int i) {
        byte[] bArr2 = f16863i;
        if (i < bArr2.length) {
            return false;
        }
        return tq2.m27884c(bArr, bArr2);
    }

    /* renamed from: e */
    public static boolean m25538e(byte[] bArr, int i) {
        if (i < f16871q || (!tq2.m27884c(bArr, f16869o) && !tq2.m27884c(bArr, f16870p))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m25539f(byte[] bArr, int i) {
        if (i < 6) {
            return false;
        }
        if (tq2.m27884c(bArr, f16861g) || tq2.m27884c(bArr, f16862h)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m25540g(byte[] bArr, int i) {
        if (i < 12 || bArr[3] < 8 || !tq2.m27883b(bArr, f16867m, 4)) {
            return false;
        }
        for (byte[] b : f16868n) {
            if (tq2.m27883b(bArr, b, 8)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m25541h(byte[] bArr, int i) {
        byte[] bArr2 = f16865k;
        if (i < bArr2.length) {
            return false;
        }
        return tq2.m27884c(bArr, bArr2);
    }

    /* renamed from: i */
    public static boolean m25542i(byte[] bArr, int i) {
        byte[] bArr2 = f16857c;
        if (i < bArr2.length || !tq2.m27884c(bArr, bArr2)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m25543j(byte[] bArr, int i) {
        byte[] bArr2 = f16859e;
        if (i < bArr2.length || !tq2.m27884c(bArr, bArr2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final rq2 mo25006a(byte[] bArr, int i) {
        au4.m10792g(bArr);
        if (!this.f16873b && fk7.m17058h(bArr, 0, i)) {
            return m25536c(bArr, i);
        }
        if (m25542i(bArr, i)) {
            return r81.f17197a;
        }
        if (m25543j(bArr, i)) {
            return r81.f17198b;
        }
        if (this.f16873b && fk7.m17058h(bArr, 0, i)) {
            return m25536c(bArr, i);
        }
        if (m25539f(bArr, i)) {
            return r81.f17199c;
        }
        if (m25537d(bArr, i)) {
            return r81.f17200d;
        }
        if (m25541h(bArr, i)) {
            return r81.f17201e;
        }
        if (m25540g(bArr, i)) {
            return r81.f17207k;
        }
        if (m25538e(bArr, i)) {
            return r81.f17208l;
        }
        return rq2.f17332c;
    }

    /* renamed from: b */
    public int mo25007b() {
        return this.f16872a;
    }
}
