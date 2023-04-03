package p000;

import java.io.IOException;
import p000.iy6;
import p000.xs5;

/* renamed from: p7 */
/* compiled from: Ac3Extractor */
public final class C3042p7 implements hy1 {

    /* renamed from: d */
    public static final ny1 f16329d = new C2942o7();

    /* renamed from: a */
    public final C3131q7 f16330a = new C3131q7();

    /* renamed from: b */
    public final gm4 f16331b = new gm4(2786);

    /* renamed from: c */
    public boolean f16332c;

    /* renamed from: f */
    public static /* synthetic */ hy1[] m24697f() {
        return new hy1[]{new C3042p7()};
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        this.f16332c = false;
        this.f16330a.mo18799c();
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        int read = iy1.read(this.f16331b.mo20679d(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f16331b.mo20674P(0);
        this.f16331b.mo20673O(read);
        if (!this.f16332c) {
            this.f16330a.mo18802f(0, 4);
            this.f16332c = true;
        }
        this.f16330a.mo18798a(this.f16331b);
        return 0;
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        gm4 gm4 = new gm4(10);
        int i = 0;
        while (true) {
            iy1.mo94n(gm4.mo20679d(), 0, 10);
            gm4.mo20674P(0);
            if (gm4.mo20665G() != 4801587) {
                break;
            }
            gm4.mo20675Q(3);
            int C = gm4.mo20661C();
            i += C + 10;
            iy1.mo90i(C);
        }
        iy1.mo85e();
        iy1.mo90i(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            iy1.mo94n(gm4.mo20679d(), 0, 6);
            gm4.mo20674P(0);
            if (gm4.mo20668J() != 2935) {
                iy1.mo85e();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                iy1.mo90i(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int f = C3182r7.m26084f(gm4.mo20679d());
                if (f == -1) {
                    return false;
                }
                iy1.mo90i(f - 6);
            }
        }
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f16330a.mo18800d(jy1, new iy6.C2579d(0, 1));
        jy1.mo7722p();
        jy1.mo7715g(new xs5.C3642b(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED));
    }
}
