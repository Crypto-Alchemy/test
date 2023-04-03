package p000;

import androidx.media3.common.Metadata;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p000.sa6;
import p000.x32;

/* renamed from: v32 */
/* compiled from: FlacReader */
public final class v32 extends sa6 {

    /* renamed from: n */
    public x32 f18643n;

    /* renamed from: o */
    public C3453a f18644o;

    /* renamed from: v32$a */
    /* compiled from: FlacReader */
    public static final class C3453a implements bg4 {

        /* renamed from: a */
        public x32 f18645a;

        /* renamed from: b */
        public x32.C3567a f18646b;

        /* renamed from: c */
        public long f18647c = -1;

        /* renamed from: d */
        public long f18648d = -1;

        public C3453a(x32 x32, x32.C3567a aVar) {
            this.f18645a = x32;
            this.f18646b = aVar;
        }

        /* renamed from: a */
        public xs5 mo11645a() {
            boolean z;
            if (this.f18647c != -1) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            return new w32(this.f18645a, this.f18647c);
        }

        /* renamed from: b */
        public long mo11646b(iy1 iy1) {
            long j = this.f18648d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f18648d = -1;
            return j2;
        }

        /* renamed from: c */
        public void mo11647c(long j) {
            long[] jArr = this.f18646b.f19309a;
            this.f18648d = jArr[w67.m29358i(jArr, j, true, true)];
        }

        /* renamed from: d */
        public void mo27037d(long j) {
            this.f18647c = j;
        }
    }

    /* renamed from: o */
    public static boolean m28585o(byte[] bArr) {
        if (bArr[0] == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m28586p(gm4 gm4) {
        if (gm4.mo20676a() >= 5 && gm4.mo20662D() == 127 && gm4.mo20664F() == 1179402563) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long mo23944f(gm4 gm4) {
        if (!m28585o(gm4.mo20679d())) {
            return -1;
        }
        return (long) mo27036n(gm4);
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public boolean mo23945i(gm4 gm4, long j, sa6.C3258b bVar) {
        byte[] d = gm4.mo20679d();
        x32 x32 = this.f18643n;
        if (x32 == null) {
            x32 x322 = new x32(d, 17);
            this.f18643n = x322;
            bVar.f17552a = x322.mo27667g(Arrays.copyOfRange(d, 9, gm4.mo20681f()), (Metadata) null);
            return true;
        } else if ((d[0] & Byte.MAX_VALUE) == 3) {
            x32.C3567a g = u32.m28051g(gm4);
            x32 b = x32.mo27663b(g);
            this.f18643n = b;
            this.f18644o = new C3453a(b, g);
            return true;
        } else if (!m28585o(d)) {
            return true;
        } else {
            C3453a aVar = this.f18644o;
            if (aVar != null) {
                aVar.mo27037d(j);
                bVar.f17553b = this.f18644o;
            }
            C2725kr.m20985e(bVar.f17552a);
            return false;
        }
    }

    /* renamed from: l */
    public void mo23946l(boolean z) {
        super.mo23946l(z);
        if (z) {
            this.f18643n = null;
            this.f18644o = null;
        }
    }

    /* renamed from: n */
    public final int mo27036n(gm4 gm4) {
        int i = (gm4.mo20679d()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            gm4.mo20675Q(4);
            gm4.mo20669K();
        }
        int j = t32.m27265j(gm4, i);
        gm4.mo20674P(0);
        return j;
    }
}
