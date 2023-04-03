package p000;

import androidx.media3.common.ParserException;
import java.io.IOException;

/* renamed from: ag4 */
/* compiled from: OggPageHeader */
public final class ag4 {

    /* renamed from: a */
    public int f128a;

    /* renamed from: b */
    public int f129b;

    /* renamed from: c */
    public long f130c;

    /* renamed from: d */
    public long f131d;

    /* renamed from: e */
    public long f132e;

    /* renamed from: f */
    public long f133f;

    /* renamed from: g */
    public int f134g;

    /* renamed from: h */
    public int f135h;

    /* renamed from: i */
    public int f136i;

    /* renamed from: j */
    public final int[] f137j = new int[255];

    /* renamed from: k */
    public final gm4 f138k = new gm4(255);

    /* renamed from: a */
    public boolean mo304a(iy1 iy1, boolean z) throws IOException {
        mo305b();
        this.f138k.mo20670L(27);
        if (!ky1.m21100b(iy1, this.f138k.mo20679d(), 0, 27, z) || this.f138k.mo20664F() != 1332176723) {
            return false;
        }
        int D = this.f138k.mo20662D();
        this.f128a = D;
        if (D == 0) {
            this.f129b = this.f138k.mo20662D();
            this.f130c = this.f138k.mo20693r();
            this.f131d = this.f138k.mo20695t();
            this.f132e = this.f138k.mo20695t();
            this.f133f = this.f138k.mo20695t();
            int D2 = this.f138k.mo20662D();
            this.f134g = D2;
            this.f135h = D2 + 27;
            this.f138k.mo20670L(D2);
            if (!ky1.m21100b(iy1, this.f138k.mo20679d(), 0, this.f134g, z)) {
                return false;
            }
            for (int i = 0; i < this.f134g; i++) {
                this.f137j[i] = this.f138k.mo20662D();
                this.f136i += this.f137j[i];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
    }

    /* renamed from: b */
    public void mo305b() {
        this.f128a = 0;
        this.f129b = 0;
        this.f130c = 0;
        this.f131d = 0;
        this.f132e = 0;
        this.f133f = 0;
        this.f134g = 0;
        this.f135h = 0;
        this.f136i = 0;
    }

    /* renamed from: c */
    public boolean mo306c(iy1 iy1) throws IOException {
        return mo307d(iy1, -1);
    }

    /* renamed from: d */
    public boolean mo307d(iy1 iy1, long j) throws IOException {
        boolean z;
        int i;
        if (iy1.getPosition() == iy1.mo89h()) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f138k.mo20670L(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if ((i == 0 || iy1.getPosition() + 4 < j) && ky1.m21100b(iy1, this.f138k.mo20679d(), 0, 4, true)) {
                this.f138k.mo20674P(0);
                if (this.f138k.mo20664F() == 1332176723) {
                    iy1.mo85e();
                    return true;
                }
                iy1.mo92k(1);
            }
        }
        do {
            if ((i != 0 && iy1.getPosition() >= j) || iy1.mo83a(1) == -1) {
                return false;
            }
            break;
        } while (iy1.mo83a(1) == -1);
        return false;
    }
}
