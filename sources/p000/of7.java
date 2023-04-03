package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p000.pf7;
import p000.sa6;

/* renamed from: of7 */
/* compiled from: VorbisReader */
public final class of7 extends sa6 {

    /* renamed from: n */
    public C2953a f15866n;

    /* renamed from: o */
    public int f15867o;

    /* renamed from: p */
    public boolean f15868p;

    /* renamed from: q */
    public pf7.C3064d f15869q;

    /* renamed from: r */
    public pf7.C3062b f15870r;

    /* renamed from: of7$a */
    /* compiled from: VorbisReader */
    public static final class C2953a {

        /* renamed from: a */
        public final pf7.C3064d f15871a;

        /* renamed from: b */
        public final pf7.C3062b f15872b;

        /* renamed from: c */
        public final byte[] f15873c;

        /* renamed from: d */
        public final pf7.C3063c[] f15874d;

        /* renamed from: e */
        public final int f15875e;

        public C2953a(pf7.C3064d dVar, pf7.C3062b bVar, byte[] bArr, pf7.C3063c[] cVarArr, int i) {
            this.f15871a = dVar;
            this.f15872b = bVar;
            this.f15873c = bArr;
            this.f15874d = cVarArr;
            this.f15875e = i;
        }
    }

    /* renamed from: n */
    public static void m23801n(gm4 gm4, long j) {
        if (gm4.mo20677b() < gm4.mo20681f() + 4) {
            gm4.mo20671M(Arrays.copyOf(gm4.mo20679d(), gm4.mo20681f() + 4));
        } else {
            gm4.mo20673O(gm4.mo20681f() + 4);
        }
        byte[] d = gm4.mo20679d();
        d[gm4.mo20681f() - 4] = (byte) ((int) (j & 255));
        d[gm4.mo20681f() - 3] = (byte) ((int) ((j >>> 8) & 255));
        d[gm4.mo20681f() - 2] = (byte) ((int) ((j >>> 16) & 255));
        d[gm4.mo20681f() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    /* renamed from: o */
    public static int m23802o(byte b, C2953a aVar) {
        if (!aVar.f15874d[m23803p(b, aVar.f15875e, 1)].f16447a) {
            return aVar.f15871a.f16457g;
        }
        return aVar.f15871a.f16458h;
    }

    /* renamed from: p */
    public static int m23803p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: r */
    public static boolean m23804r(gm4 gm4) {
        try {
            return pf7.m24914m(1, gm4, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public void mo23943e(long j) {
        boolean z;
        super.mo23943e(j);
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f15868p = z;
        pf7.C3064d dVar = this.f15869q;
        if (dVar != null) {
            i = dVar.f16457g;
        }
        this.f15867o = i;
    }

    /* renamed from: f */
    public long mo23944f(gm4 gm4) {
        int i = 0;
        if ((gm4.mo20679d()[0] & 1) == 1) {
            return -1;
        }
        int o = m23802o(gm4.mo20679d()[0], (C2953a) C2725kr.m20989i(this.f15866n));
        if (this.f15868p) {
            i = (this.f15867o + o) / 4;
        }
        long j = (long) i;
        m23801n(gm4, j);
        this.f15868p = true;
        this.f15867o = o;
        return j;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public boolean mo23945i(gm4 gm4, long j, sa6.C3258b bVar) throws IOException {
        if (this.f15866n != null) {
            C2725kr.m20985e(bVar.f17552a);
            return false;
        }
        C2953a q = mo23947q(gm4);
        this.f15866n = q;
        if (q == null) {
            return true;
        }
        pf7.C3064d dVar = q.f15871a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f16460j);
        arrayList.add(q.f15873c);
        bVar.f17552a = new C0792h.C0794b().mo6670e0("audio/vorbis").mo6646G(dVar.f16455e).mo6665Z(dVar.f16454d).mo6647H(dVar.f16452b).mo6671f0(dVar.f16453c).mo6659T(arrayList).mo6663X(pf7.m24904c(ImmutableList.copyOf((E[]) q.f15872b.f16445b))).mo6644E();
        return true;
    }

    /* renamed from: l */
    public void mo23946l(boolean z) {
        super.mo23946l(z);
        if (z) {
            this.f15866n = null;
            this.f15869q = null;
            this.f15870r = null;
        }
        this.f15867o = 0;
        this.f15868p = false;
    }

    /* renamed from: q */
    public C2953a mo23947q(gm4 gm4) throws IOException {
        pf7.C3064d dVar = this.f15869q;
        if (dVar == null) {
            this.f15869q = pf7.m24912k(gm4);
            return null;
        }
        pf7.C3062b bVar = this.f15870r;
        if (bVar == null) {
            this.f15870r = pf7.m24910i(gm4);
            return null;
        }
        byte[] bArr = new byte[gm4.mo20681f()];
        System.arraycopy(gm4.mo20679d(), 0, bArr, 0, gm4.mo20681f());
        pf7.C3063c[] l = pf7.m24913l(gm4, dVar.f16452b);
        return new C2953a(dVar, bVar, bArr, l, pf7.m24902a(l.length - 1));
    }
}
