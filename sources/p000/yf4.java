package p000;

import androidx.media3.common.ParserException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: yf4 */
/* compiled from: OggExtractor */
public class yf4 implements hy1 {

    /* renamed from: d */
    public static final ny1 f20195d = new xf4();

    /* renamed from: a */
    public jy1 f20196a;

    /* renamed from: b */
    public sa6 f20197b;

    /* renamed from: c */
    public boolean f20198c;

    /* renamed from: f */
    public static /* synthetic */ hy1[] m30560f() {
        return new hy1[]{new yf4()};
    }

    /* renamed from: g */
    public static gm4 m30561g(gm4 gm4) {
        gm4.mo20674P(0);
        return gm4;
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        sa6 sa6 = this.f20197b;
        if (sa6 != null) {
            sa6.mo25708m(j, j2);
        }
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        C2725kr.m20989i(this.f20196a);
        if (this.f20197b == null) {
            if (mo28055h(iy1)) {
                iy1.mo85e();
            } else {
                throw ParserException.createForMalformedContainer("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f20198c) {
            zs6 f = this.f20196a.mo7713f(0, 1);
            this.f20196a.mo7722p();
            this.f20197b.mo25703d(this.f20196a, f);
            this.f20198c = true;
        }
        return this.f20197b.mo25704g(iy1, mt4);
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        try {
            return mo28055h(iy1);
        } catch (ParserException unused) {
            return false;
        }
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: h */
    public final boolean mo28055h(iy1 iy1) throws IOException {
        ag4 ag4 = new ag4();
        if (ag4.mo304a(iy1, true) && (ag4.f129b & 2) == 2) {
            int min = Math.min(ag4.f136i, 8);
            gm4 gm4 = new gm4(min);
            iy1.mo94n(gm4.mo20679d(), 0, min);
            if (v32.m28586p(m30561g(gm4))) {
                this.f20197b = new v32();
            } else if (of7.m23804r(m30561g(gm4))) {
                this.f20197b = new of7();
            } else if (yi4.m30616p(m30561g(gm4))) {
                this.f20197b = new yi4();
            }
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f20196a = jy1;
    }
}
