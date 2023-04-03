package p000;

/* renamed from: yp6 */
/* compiled from: ThumbnailSizeChecker */
public final class yp6 {
    /* renamed from: a */
    public static int m30727a(int i) {
        return (int) (((float) i) * 1.3333334f);
    }

    /* renamed from: b */
    public static boolean m30728b(int i, int i2, te5 te5) {
        if (((float) m30727a(i)) < 2048.0f || m30727a(i2) < 2048) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m30729c(gp1 gp1, te5 te5) {
        if (gp1 == null) {
            return false;
        }
        int n = gp1.mo20754n();
        if (n == 90 || n == 270) {
            return m30728b(gp1.mo20750j(), gp1.mo20757s(), te5);
        }
        return m30728b(gp1.mo20757s(), gp1.mo20750j(), te5);
    }
}
