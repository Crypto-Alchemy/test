package p000;

import java.io.IOException;
import okhttp3.internal.http2.Http2;
import p000.iy6;
import p000.xs5;

/* renamed from: t7 */
/* compiled from: Ac4Extractor */
public final class C3334t7 implements hy1 {

    /* renamed from: d */
    public static final ny1 f17971d = new C3248s7();

    /* renamed from: a */
    public final C3396u7 f17972a = new C3396u7();

    /* renamed from: b */
    public final gm4 f17973b = new gm4((int) Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: c */
    public boolean f17974c;

    /* renamed from: f */
    public static /* synthetic */ hy1[] m27475f() {
        return new hy1[]{new C3334t7()};
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        this.f17974c = false;
        this.f17972a.mo18799c();
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        int read = iy1.read(this.f17973b.mo20679d(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (read == -1) {
            return -1;
        }
        this.f17973b.mo20674P(0);
        this.f17973b.mo20673O(read);
        if (!this.f17974c) {
            this.f17972a.mo18802f(0, 4);
            this.f17974c = true;
        }
        this.f17972a.mo18798a(this.f17973b);
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
            iy1.mo94n(gm4.mo20679d(), 0, 7);
            gm4.mo20674P(0);
            int J = gm4.mo20668J();
            if (J == 44096 || J == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int e = C3467v7.m28679e(gm4.mo20679d(), J);
                if (e == -1) {
                    return false;
                }
                iy1.mo90i(e - 7);
            } else {
                iy1.mo85e();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                iy1.mo90i(i3);
                i2 = 0;
            }
        }
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f17972a.mo18800d(jy1, new iy6.C2579d(0, 1));
        jy1.mo7722p();
        jy1.mo7715g(new xs5.C3642b(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED));
    }
}
