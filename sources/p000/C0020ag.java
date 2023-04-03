package p000;

import android.util.SparseArray;
import androidx.media3.common.C0788f;
import androidx.media3.common.C0789g;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0816l;
import androidx.media3.common.C0820n;
import androidx.media3.common.C0821o;
import androidx.media3.common.C0831s;
import androidx.media3.common.C0840v;
import androidx.media3.common.C0842w;
import androidx.media3.common.C0844x;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.source.C0973i;
import java.io.IOException;
import java.util.List;

/* renamed from: ag */
/* compiled from: AnalyticsListener */
public interface C0020ag {

    /* renamed from: ag$a */
    /* compiled from: AnalyticsListener */
    public static final class C0021a {

        /* renamed from: a */
        public final long f115a;

        /* renamed from: b */
        public final C0831s f116b;

        /* renamed from: c */
        public final int f117c;

        /* renamed from: d */
        public final C0973i.C0975b f118d;

        /* renamed from: e */
        public final long f119e;

        /* renamed from: f */
        public final C0831s f120f;

        /* renamed from: g */
        public final int f121g;

        /* renamed from: h */
        public final C0973i.C0975b f122h;

        /* renamed from: i */
        public final long f123i;

        /* renamed from: j */
        public final long f124j;

        public C0021a(long j, C0831s sVar, int i, C0973i.C0975b bVar, long j2, C0831s sVar2, int i2, C0973i.C0975b bVar2, long j3, long j4) {
            this.f115a = j;
            this.f116b = sVar;
            this.f117c = i;
            this.f118d = bVar;
            this.f119e = j2;
            this.f120f = sVar2;
            this.f121g = i2;
            this.f122h = bVar2;
            this.f123i = j3;
            this.f124j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0021a.class != obj.getClass()) {
                return false;
            }
            C0021a aVar = (C0021a) obj;
            if (this.f115a == aVar.f115a && this.f117c == aVar.f117c && this.f119e == aVar.f119e && this.f121g == aVar.f121g && this.f123i == aVar.f123i && this.f124j == aVar.f124j && jf4.m46496a(this.f116b, aVar.f116b) && jf4.m46496a(this.f118d, aVar.f118d) && jf4.m46496a(this.f120f, aVar.f120f) && jf4.m46496a(this.f122h, aVar.f122h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return jf4.m46497b(Long.valueOf(this.f115a), this.f116b, Integer.valueOf(this.f117c), this.f118d, Long.valueOf(this.f119e), this.f120f, Integer.valueOf(this.f121g), this.f122h, Long.valueOf(this.f123i), Long.valueOf(this.f124j));
        }
    }

    /* renamed from: ag$b */
    /* compiled from: AnalyticsListener */
    public static final class C0022b {

        /* renamed from: a */
        public final C0789g f125a;

        /* renamed from: b */
        public final SparseArray<C0021a> f126b;

        public C0022b(C0789g gVar, SparseArray<C0021a> sparseArray) {
            this.f125a = gVar;
            SparseArray<C0021a> sparseArray2 = new SparseArray<>(gVar.mo6628d());
            for (int i = 0; i < gVar.mo6628d(); i++) {
                int c = gVar.mo6627c(i);
                sparseArray2.append(c, (C0021a) C2725kr.m20985e(sparseArray.get(c)));
            }
            this.f126b = sparseArray2;
        }

        /* renamed from: a */
        public boolean mo298a(int i) {
            return this.f125a.mo6625a(i);
        }

        /* renamed from: b */
        public int mo299b(int i) {
            return this.f125a.mo6627c(i);
        }

        /* renamed from: c */
        public C0021a mo300c(int i) {
            return (C0021a) C2725kr.m20985e(this.f126b.get(i));
        }

        /* renamed from: d */
        public int mo301d() {
            return this.f125a.mo6628d();
        }
    }

    @Deprecated
    /* renamed from: A */
    void mo223A(C0021a aVar, int i, n31 n31);

    /* renamed from: B */
    void mo224B(C0021a aVar, hx0 hx0);

    /* renamed from: C */
    void mo225C(C0021a aVar, vi3 vi3, jr3 jr3);

    @Deprecated
    /* renamed from: D */
    void mo226D(C0021a aVar, int i);

    @Deprecated
    /* renamed from: E */
    void mo227E(C0021a aVar, String str, long j);

    /* renamed from: F */
    void mo228F(C0021a aVar, C0844x xVar);

    /* renamed from: G */
    void mo229G(C0021a aVar, boolean z);

    /* renamed from: I */
    void mo230I(C0021a aVar);

    /* renamed from: J */
    void mo231J(C0021a aVar, String str);

    /* renamed from: L */
    void mo232L(C0021a aVar, int i);

    /* renamed from: M */
    void mo233M(C0021a aVar, C0820n nVar);

    /* renamed from: N */
    void mo234N(C0021a aVar, C0792h hVar, p31 p31);

    @Deprecated
    /* renamed from: O */
    void mo235O(C0021a aVar);

    @Deprecated
    /* renamed from: P */
    void mo236P(C0021a aVar);

    /* renamed from: Q */
    void mo237Q(C0021a aVar, C0792h hVar, p31 p31);

    /* renamed from: R */
    void mo238R(C0021a aVar, C0788f fVar);

    /* renamed from: S */
    void mo239S(C0021a aVar, String str, long j, long j2);

    /* renamed from: T */
    void mo240T(C0021a aVar, int i);

    /* renamed from: U */
    void mo241U(C0021a aVar, C0798k kVar, int i);

    /* renamed from: V */
    void mo242V(C0021a aVar, C0840v vVar);

    /* renamed from: W */
    void mo243W(C0021a aVar, Exception exc);

    /* renamed from: X */
    void mo244X(C0021a aVar, C0816l lVar);

    /* renamed from: Y */
    void mo245Y(C0021a aVar, int i);

    /* renamed from: Z */
    void mo246Z(C0021a aVar, String str, long j, long j2);

    /* renamed from: a */
    void mo247a(C0021a aVar, Metadata metadata);

    /* renamed from: a0 */
    void mo248a0(C0021a aVar, n31 n31);

    /* renamed from: b */
    void mo249b(C0021a aVar);

    @Deprecated
    /* renamed from: b0 */
    void mo250b0(C0021a aVar, boolean z, int i);

    /* renamed from: c */
    void mo251c(C0021a aVar, boolean z);

    @Deprecated
    /* renamed from: c0 */
    void mo252c0(C0021a aVar);

    /* renamed from: d */
    void mo253d(C0021a aVar, Exception exc);

    /* renamed from: d0 */
    void mo254d0(C0821o oVar, C0022b bVar);

    /* renamed from: e */
    void mo255e(C0021a aVar, C0821o.C0823b bVar);

    /* renamed from: e0 */
    void mo256e0(C0021a aVar, String str);

    /* renamed from: f */
    void mo257f(C0021a aVar, Exception exc);

    @Deprecated
    /* renamed from: f0 */
    void mo258f0(C0021a aVar, String str, long j);

    @Deprecated
    /* renamed from: g */
    void mo259g(C0021a aVar, int i, n31 n31);

    /* renamed from: g0 */
    void mo260g0(C0021a aVar, n31 n31);

    @Deprecated
    /* renamed from: h */
    void mo261h(C0021a aVar, List<dx0> list);

    /* renamed from: h0 */
    void mo262h0(C0021a aVar, int i);

    /* renamed from: i */
    void mo263i(C0021a aVar, boolean z);

    /* renamed from: i0 */
    void mo264i0(C0021a aVar, vi3 vi3, jr3 jr3);

    /* renamed from: j */
    void mo265j(C0021a aVar, vi3 vi3, jr3 jr3, IOException iOException, boolean z);

    /* renamed from: j0 */
    void mo266j0(C0021a aVar, int i, long j, long j2);

    /* renamed from: k */
    void mo267k(C0021a aVar, long j, int i);

    /* renamed from: k0 */
    void mo268k0(C0021a aVar, int i, long j, long j2);

    /* renamed from: l */
    void mo269l(C0021a aVar, long j);

    /* renamed from: l0 */
    void mo270l0(C0021a aVar, jr3 jr3);

    /* renamed from: m */
    void mo271m(C0021a aVar, vi3 vi3, jr3 jr3);

    /* renamed from: m0 */
    void mo272m0(C0021a aVar, int i, boolean z);

    /* renamed from: n */
    void mo273n(C0021a aVar);

    /* renamed from: n0 */
    void mo274n0(C0021a aVar, PlaybackException playbackException);

    /* renamed from: o */
    void mo275o(C0021a aVar, jr3 jr3);

    /* renamed from: o0 */
    void mo276o0(C0021a aVar);

    /* renamed from: p */
    void mo277p(C0021a aVar, int i, int i2);

    /* renamed from: p0 */
    void mo278p0(C0021a aVar, int i, long j);

    /* renamed from: q0 */
    void mo279q0(C0021a aVar, boolean z);

    /* renamed from: r */
    void mo280r(C0021a aVar, C0842w wVar);

    /* renamed from: r0 */
    void mo281r0(C0021a aVar, boolean z, int i);

    @Deprecated
    /* renamed from: s */
    void mo282s(C0021a aVar, int i, int i2, int i3, float f);

    @Deprecated
    /* renamed from: s0 */
    void mo283s0(C0021a aVar, C0792h hVar);

    @Deprecated
    /* renamed from: t */
    void mo284t(C0021a aVar, int i, String str, long j);

    /* renamed from: t0 */
    void mo285t0(C0021a aVar, n31 n31);

    /* renamed from: u */
    void mo286u(C0021a aVar, Object obj, long j);

    /* renamed from: u0 */
    void mo287u0(C0021a aVar, Exception exc);

    @Deprecated
    /* renamed from: v0 */
    void mo288v0(C0021a aVar, boolean z);

    @Deprecated
    /* renamed from: w */
    void mo289w(C0021a aVar, C0792h hVar);

    /* renamed from: w0 */
    void mo290w0(C0021a aVar, C0821o.C0827e eVar, C0821o.C0827e eVar2, int i);

    @Deprecated
    /* renamed from: x */
    void mo291x(C0021a aVar, int i, C0792h hVar);

    /* renamed from: x0 */
    void mo292x0(C0021a aVar, int i);

    /* renamed from: y */
    void mo293y(C0021a aVar, PlaybackException playbackException);

    /* renamed from: y0 */
    void mo294y0(C0021a aVar);

    /* renamed from: z */
    void mo295z(C0021a aVar, n31 n31);
}
