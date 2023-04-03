package p000;

/* renamed from: ki1 */
/* compiled from: DolbyVisionConfig */
public final class ki1 {

    /* renamed from: a */
    public final int f14091a;

    /* renamed from: b */
    public final int f14092b;

    /* renamed from: c */
    public final String f14093c;

    public ki1(int i, int i2, String str) {
        this.f14091a = i;
        this.f14092b = i2;
        this.f14093c = str;
    }

    /* renamed from: a */
    public static ki1 m20745a(gm4 gm4) {
        String str;
        gm4.mo20675Q(2);
        int D = gm4.mo20662D();
        int i = D >> 1;
        int D2 = ((gm4.mo20662D() >> 3) & 31) | ((D & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        if (D2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(D2);
        return new ki1(i, D2, sb.toString());
    }
}
