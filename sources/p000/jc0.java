package p000;

import p000.zs6;

/* renamed from: jc0 */
/* compiled from: CeaUtil */
public final class jc0 {
    /* renamed from: a */
    public static void m20068a(long j, gm4 gm4, zs6[] zs6Arr) {
        int i;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (gm4.mo20676a() > 1) {
                int c = m20070c(gm4);
                int c2 = m20070c(gm4);
                int e = gm4.mo20680e() + c2;
                if (c2 == -1 || c2 > gm4.mo20676a()) {
                    gk3.m18132i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    e = gm4.mo20681f();
                } else if (c == 4 && c2 >= 8) {
                    int D = gm4.mo20662D();
                    int J = gm4.mo20668J();
                    if (J == 49) {
                        i = gm4.mo20689n();
                    } else {
                        i = 0;
                    }
                    int D2 = gm4.mo20662D();
                    if (J == 47) {
                        gm4.mo20675Q(1);
                    }
                    if (D == 181 && ((J == 49 || J == 47) && D2 == 3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (J == 49) {
                        if (i != 1195456820) {
                            z2 = false;
                        }
                        z &= z2;
                    }
                    if (z) {
                        m20069b(j, gm4, zs6Arr);
                    }
                }
                gm4.mo20674P(e);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m20069b(long j, gm4 gm4, zs6[] zs6Arr) {
        boolean z;
        int D = gm4.mo20662D();
        if ((D & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            gm4.mo20675Q(1);
            int i = (D & 31) * 3;
            int e = gm4.mo20680e();
            for (zs6 zs6 : zs6Arr) {
                gm4.mo20674P(e);
                zs6.mo7300a(gm4, i);
                if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    zs6.mo7301b(j, 1, i, 0, (zs6.C3758a) null);
                }
            }
        }
    }

    /* renamed from: c */
    public static int m20070c(gm4 gm4) {
        int i = 0;
        while (gm4.mo20676a() != 0) {
            int D = gm4.mo20662D();
            i += D;
            if (D != 255) {
                return i;
            }
        }
        return -1;
    }
}
