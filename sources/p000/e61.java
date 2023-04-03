package p000;

import android.os.Handler;
import android.os.Looper;
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
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.C0973i;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.p023ws.WebSocketProtocol;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.C0020ag;
import p000.mi3;

/* renamed from: e61 */
/* compiled from: DefaultAnalyticsCollector */
public class e61 implements C3142qf {

    /* renamed from: a */
    public final dh0 f11062a;

    /* renamed from: d */
    public final C0831s.C0833b f11063d;

    /* renamed from: e */
    public final C0831s.C0835d f11064e = new C0831s.C0835d();

    /* renamed from: g */
    public final C2211a f11065g;

    /* renamed from: k */
    public final SparseArray<C0020ag.C0021a> f11066k;

    /* renamed from: r */
    public mi3<C0020ag> f11067r;

    /* renamed from: s */
    public C0821o f11068s;

    /* renamed from: x */
    public xk2 f11069x;

    /* renamed from: y */
    public boolean f11070y;

    /* renamed from: e61$a */
    /* compiled from: DefaultAnalyticsCollector */
    public static final class C2211a {

        /* renamed from: a */
        public final C0831s.C0833b f11071a;

        /* renamed from: b */
        public ImmutableList<C0973i.C0975b> f11072b = ImmutableList.m36627of();

        /* renamed from: c */
        public ImmutableMap<C0973i.C0975b, C0831s> f11073c = ImmutableMap.m36661of();

        /* renamed from: d */
        public C0973i.C0975b f11074d;

        /* renamed from: e */
        public C0973i.C0975b f11075e;

        /* renamed from: f */
        public C0973i.C0975b f11076f;

        public C2211a(C0831s.C0833b bVar) {
            this.f11071a = bVar;
        }

        /* renamed from: c */
        public static C0973i.C0975b m15940c(C0821o oVar, ImmutableList<C0973i.C0975b> immutableList, C0973i.C0975b bVar, C0831s.C0833b bVar2) {
            Object obj;
            int i;
            C0831s x = oVar.mo6712x();
            int H = oVar.mo6680H();
            if (x.mo6883u()) {
                obj = null;
            } else {
                obj = x.mo6879q(H);
            }
            if (oVar.mo6701g() || x.mo6883u()) {
                i = -1;
            } else {
                i = x.mo6872j(H, bVar2).mo6890g(w67.m29391y0(oVar.mo6696b0()) - bVar2.mo6901q());
            }
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                C0973i.C0975b bVar3 = immutableList.get(i2);
                if (m15941i(bVar3, obj, oVar.mo6701g(), oVar.mo6709s(), oVar.mo6683L(), i)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null) {
                if (m15941i(bVar, obj, oVar.mo6701g(), oVar.mo6709s(), oVar.mo6683L(), i)) {
                    return bVar;
                }
            }
            return null;
        }

        /* renamed from: i */
        public static boolean m15941i(C0973i.C0975b bVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!bVar.f15659a.equals(obj)) {
                return false;
            }
            if ((z && bVar.f15660b == i && bVar.f15661c == i2) || (!z && bVar.f15660b == -1 && bVar.f15663e == i3)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo19159b(ImmutableMap.C4540b<C0973i.C0975b, C0831s> bVar, C0973i.C0975b bVar2, C0831s sVar) {
            if (bVar2 != null) {
                if (sVar.mo6867f(bVar2.f15659a) != -1) {
                    bVar.mo34740d(bVar2, sVar);
                    return;
                }
                C0831s sVar2 = this.f11073c.get(bVar2);
                if (sVar2 != null) {
                    bVar.mo34740d(bVar2, sVar2);
                }
            }
        }

        /* renamed from: d */
        public C0973i.C0975b mo19160d() {
            return this.f11074d;
        }

        /* renamed from: e */
        public C0973i.C0975b mo19161e() {
            if (this.f11072b.isEmpty()) {
                return null;
            }
            return (C0973i.C0975b) qz2.m50913d(this.f11072b);
        }

        /* renamed from: f */
        public C0831s mo19162f(C0973i.C0975b bVar) {
            return this.f11073c.get(bVar);
        }

        /* renamed from: g */
        public C0973i.C0975b mo19163g() {
            return this.f11075e;
        }

        /* renamed from: h */
        public C0973i.C0975b mo19164h() {
            return this.f11076f;
        }

        /* renamed from: j */
        public void mo19165j(C0821o oVar) {
            this.f11074d = m15940c(oVar, this.f11072b, this.f11075e, this.f11071a);
        }

        /* renamed from: k */
        public void mo19166k(List<C0973i.C0975b> list, C0973i.C0975b bVar, C0821o oVar) {
            this.f11072b = ImmutableList.copyOf(list);
            if (!list.isEmpty()) {
                this.f11075e = list.get(0);
                this.f11076f = (C0973i.C0975b) C2725kr.m20985e(bVar);
            }
            if (this.f11074d == null) {
                this.f11074d = m15940c(oVar, this.f11072b, this.f11075e, this.f11071a);
            }
            mo19168m(oVar.mo6712x());
        }

        /* renamed from: l */
        public void mo19167l(C0821o oVar) {
            this.f11074d = m15940c(oVar, this.f11072b, this.f11075e, this.f11071a);
            mo19168m(oVar.mo6712x());
        }

        /* renamed from: m */
        public final void mo19168m(C0831s sVar) {
            ImmutableMap.C4540b builder = ImmutableMap.builder();
            if (this.f11072b.isEmpty()) {
                mo19159b(builder, this.f11075e, sVar);
                if (!jf4.m46496a(this.f11076f, this.f11075e)) {
                    mo19159b(builder, this.f11076f, sVar);
                }
                if (!jf4.m46496a(this.f11074d, this.f11075e) && !jf4.m46496a(this.f11074d, this.f11076f)) {
                    mo19159b(builder, this.f11074d, sVar);
                }
            } else {
                for (int i = 0; i < this.f11072b.size(); i++) {
                    mo19159b(builder, this.f11072b.get(i), sVar);
                }
                if (!this.f11072b.contains(this.f11074d)) {
                    mo19159b(builder, this.f11074d, sVar);
                }
            }
            this.f11073c = builder.mo34738b();
        }
    }

    public e61(dh0 dh0) {
        this.f11062a = (dh0) C2725kr.m20985e(dh0);
        this.f11067r = new mi3<>(w67.m29318M(), dh0, new x31());
        C0831s.C0833b bVar = new C0831s.C0833b();
        this.f11063d = bVar;
        this.f11065g = new C2211a(bVar);
        this.f11066k = new SparseArray<>();
    }

    /* renamed from: J1 */
    public static /* synthetic */ void m15756J1(C0020ag agVar, C0789g gVar) {
    }

    /* renamed from: K2 */
    public static /* synthetic */ void m15760K2(C0020ag.C0021a aVar, String str, long j, long j2, C0020ag agVar) {
        agVar.mo227E(aVar, str, j);
        long j3 = j;
        agVar.mo246Z(aVar, str, j2, j3);
        agVar.mo284t(aVar, 2, str, j3);
    }

    /* renamed from: M1 */
    public static /* synthetic */ void m15765M1(C0020ag.C0021a aVar, String str, long j, long j2, C0020ag agVar) {
        agVar.mo258f0(aVar, str, j);
        long j3 = j;
        agVar.mo239S(aVar, str, j2, j3);
        agVar.mo284t(aVar, 1, str, j3);
    }

    /* renamed from: M2 */
    public static /* synthetic */ void m15766M2(C0020ag.C0021a aVar, n31 n31, C0020ag agVar) {
        agVar.mo295z(aVar, n31);
        agVar.mo259g(aVar, 2, n31);
    }

    /* renamed from: N2 */
    public static /* synthetic */ void m15769N2(C0020ag.C0021a aVar, n31 n31, C0020ag agVar) {
        agVar.mo260g0(aVar, n31);
        agVar.mo223A(aVar, 2, n31);
    }

    /* renamed from: O1 */
    public static /* synthetic */ void m15771O1(C0020ag.C0021a aVar, n31 n31, C0020ag agVar) {
        agVar.mo285t0(aVar, n31);
        agVar.mo259g(aVar, 1, n31);
    }

    /* renamed from: P1 */
    public static /* synthetic */ void m15774P1(C0020ag.C0021a aVar, n31 n31, C0020ag agVar) {
        agVar.mo248a0(aVar, n31);
        agVar.mo223A(aVar, 1, n31);
    }

    /* renamed from: P2 */
    public static /* synthetic */ void m15775P2(C0020ag.C0021a aVar, C0792h hVar, p31 p31, C0020ag agVar) {
        agVar.mo289w(aVar, hVar);
        agVar.mo237Q(aVar, hVar, p31);
        agVar.mo291x(aVar, 2, hVar);
    }

    /* renamed from: Q1 */
    public static /* synthetic */ void m15777Q1(C0020ag.C0021a aVar, C0792h hVar, p31 p31, C0020ag agVar) {
        agVar.mo283s0(aVar, hVar);
        agVar.mo234N(aVar, hVar, p31);
        agVar.mo291x(aVar, 1, hVar);
    }

    /* renamed from: Q2 */
    public static /* synthetic */ void m15778Q2(C0020ag.C0021a aVar, C0844x xVar, C0020ag agVar) {
        agVar.mo228F(aVar, xVar);
        agVar.mo282s(aVar, xVar.f4556a, xVar.f4557d, xVar.f4558e, xVar.f4559g);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public /* synthetic */ void m15784S2(C0821o oVar, C0020ag agVar, C0789g gVar) {
        agVar.mo254d0(oVar, new C0020ag.C0022b(gVar, this.f11066k));
    }

    /* renamed from: e2 */
    public static /* synthetic */ void m15808e2(C0020ag.C0021a aVar, int i, C0020ag agVar) {
        agVar.mo235O(aVar);
        agVar.mo262h0(aVar, i);
    }

    /* renamed from: i2 */
    public static /* synthetic */ void m15816i2(C0020ag.C0021a aVar, boolean z, C0020ag agVar) {
        agVar.mo288v0(aVar, z);
        agVar.mo279q0(aVar, z);
    }

    /* renamed from: y2 */
    public static /* synthetic */ void m15857y2(C0020ag.C0021a aVar, int i, C0821o.C0827e eVar, C0821o.C0827e eVar2, C0020ag agVar) {
        agVar.mo226D(aVar, i);
        agVar.mo290w0(aVar, eVar, eVar2, i);
    }

    /* renamed from: A */
    public final void mo19125A(int i, long j, long j2) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1011, new q51(H1, i, j, j2));
    }

    /* renamed from: B */
    public final void mo19126B(n31 n31) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1007, new w41(H1, n31));
    }

    /* renamed from: B1 */
    public final C0020ag.C0021a mo19127B1() {
        return mo19130D1(this.f11065g.mo19160d());
    }

    /* renamed from: C */
    public final void mo19128C(long j, int i) {
        C0020ag.C0021a G1 = mo19135G1();
        mo19139U2(G1, 1021, new t31(G1, j, i));
    }

    @RequiresNonNull({"player"})
    /* renamed from: C1 */
    public final C0020ag.C0021a mo19129C1(C0831s sVar, int i, C0973i.C0975b bVar) {
        C0973i.C0975b bVar2;
        boolean z;
        long j;
        C0831s sVar2 = sVar;
        int i2 = i;
        if (sVar.mo6883u()) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        long b = this.f11062a.mo18770b();
        boolean z2 = true;
        if (!sVar2.equals(this.f11068s.mo6712x()) || i2 != this.f11068s.mo6687R()) {
            z = false;
        } else {
            z = true;
        }
        long j2 = 0;
        if (bVar2 != null && bVar2.mo23781b()) {
            if (!(z && this.f11068s.mo6709s() == bVar2.f15660b && this.f11068s.mo6683L() == bVar2.f15661c)) {
                z2 = false;
            }
            if (z2) {
                j2 = this.f11068s.mo6696b0();
            }
        } else if (z) {
            j = this.f11068s.mo6685N();
            return new C0020ag.C0021a(b, sVar, i, bVar2, j, this.f11068s.mo6712x(), this.f11068s.mo6687R(), this.f11065g.mo19160d(), this.f11068s.mo6696b0(), this.f11068s.mo6703h());
        } else if (!sVar.mo6883u()) {
            j2 = sVar2.mo6880r(i2, this.f11064e).mo6908e();
        }
        j = j2;
        return new C0020ag.C0021a(b, sVar, i, bVar2, j, this.f11068s.mo6712x(), this.f11068s.mo6687R(), this.f11065g.mo19160d(), this.f11068s.mo6696b0(), this.f11068s.mo6703h());
    }

    /* renamed from: D */
    public final void mo6715D(int i) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 6, new a51(B1, i));
    }

    /* renamed from: D1 */
    public final C0020ag.C0021a mo19130D1(C0973i.C0975b bVar) {
        C0831s sVar;
        boolean z;
        C2725kr.m20985e(this.f11068s);
        if (bVar == null) {
            sVar = null;
        } else {
            sVar = this.f11065g.mo19162f(bVar);
        }
        if (bVar != null && sVar != null) {
            return mo19129C1(sVar, sVar.mo6874l(bVar.f15659a, this.f11063d).f4438e, bVar);
        }
        int R = this.f11068s.mo6687R();
        C0831s x = this.f11068s.mo6712x();
        if (R < x.mo6882t()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            x = C0831s.f4433a;
        }
        return mo19129C1(x, R, (C0973i.C0975b) null);
    }

    /* renamed from: E */
    public void mo6716E(boolean z) {
    }

    /* renamed from: E1 */
    public final C0020ag.C0021a mo19131E1() {
        return mo19130D1(this.f11065g.mo19161e());
    }

    /* renamed from: F */
    public final void mo19132F(List<C0973i.C0975b> list, C0973i.C0975b bVar) {
        this.f11065g.mo19166k(list, bVar, (C0821o) C2725kr.m20985e(this.f11068s));
    }

    /* renamed from: F1 */
    public final C0020ag.C0021a mo19133F1(int i, C0973i.C0975b bVar) {
        C2725kr.m20985e(this.f11068s);
        boolean z = true;
        if (bVar != null) {
            if (this.f11065g.mo19162f(bVar) == null) {
                z = false;
            }
            if (z) {
                return mo19130D1(bVar);
            }
            return mo19129C1(C0831s.f4433a, i, bVar);
        }
        C0831s x = this.f11068s.mo6712x();
        if (i >= x.mo6882t()) {
            z = false;
        }
        if (!z) {
            x = C0831s.f4433a;
        }
        return mo19129C1(x, i, (C0973i.C0975b) null);
    }

    /* renamed from: G */
    public final void mo19134G() {
        if (!this.f11070y) {
            C0020ag.C0021a B1 = mo19127B1();
            this.f11070y = true;
            mo19139U2(B1, -1, new m51(B1));
        }
    }

    /* renamed from: G1 */
    public final C0020ag.C0021a mo19135G1() {
        return mo19130D1(this.f11065g.mo19163g());
    }

    /* renamed from: H */
    public final void mo6717H(boolean z) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 9, new b51(B1, z));
    }

    /* renamed from: H1 */
    public final C0020ag.C0021a mo19136H1() {
        return mo19130D1(this.f11065g.mo19164h());
    }

    /* renamed from: I */
    public final void mo7600I(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, new s41(F1, vi3, jr3));
    }

    /* renamed from: I1 */
    public final C0020ag.C0021a mo19137I1(PlaybackException playbackException) {
        nr3 nr3;
        if (!(playbackException instanceof ExoPlaybackException) || (nr3 = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) {
            return mo19127B1();
        }
        return mo19130D1(new C0973i.C0975b(nr3));
    }

    /* renamed from: J */
    public void mo6718J(int i, boolean z) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 30, new k41(B1, i, z));
    }

    /* renamed from: K */
    public final void mo7601K(int i, C0973i.C0975b bVar, jr3 jr3) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK, new a41(F1, jr3));
    }

    /* renamed from: L */
    public void mo6719L(C0816l lVar) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 14, new g51(B1, lVar));
    }

    /* renamed from: M */
    public final void mo7380M(int i, C0973i.C0975b bVar) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, 1023, new r51(F1));
    }

    /* renamed from: N */
    public void mo6720N(C0840v vVar) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 19, new s51(B1, vVar));
    }

    /* renamed from: O */
    public final void mo7602O(int i, C0973i.C0975b bVar, jr3 jr3) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, WebSocketProtocol.CLOSE_NO_STATUS_CODE, new b61(F1, jr3));
    }

    /* renamed from: P */
    public void mo6721P() {
    }

    /* renamed from: Q */
    public final void mo6722Q(C0798k kVar, int i) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 1, new d51(B1, kVar, i));
    }

    /* renamed from: R */
    public final void mo7603R(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, 1000, new p41(F1, vi3, jr3));
    }

    /* renamed from: S */
    public final void mo7381S(int i, C0973i.C0975b bVar, int i2) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, 1022, new z31(F1, i2));
    }

    /* renamed from: T */
    public final void mo6723T(PlaybackException playbackException) {
        C0020ag.C0021a I1 = mo19137I1(playbackException);
        mo19139U2(I1, 10, new t41(I1, playbackException));
    }

    /* renamed from: T2 */
    public final void mo19138T2() {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 1028, new t51(B1));
        this.f11067r.mo23192j();
    }

    /* renamed from: U */
    public /* synthetic */ void mo7382U(int i, C0973i.C0975b bVar) {
        hk1.m18918a(this, i, bVar);
    }

    /* renamed from: U2 */
    public final void mo19139U2(C0020ag.C0021a aVar, int i, mi3.C2831a<C0020ag> aVar2) {
        this.f11066k.put(i, aVar);
        this.f11067r.mo23194l(i, aVar2);
    }

    /* renamed from: V */
    public final void mo6724V(int i, int i2) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 24, new o51(H1, i, i2));
    }

    /* renamed from: W */
    public void mo6725W(C0821o.C0823b bVar) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 13, new g41(B1, bVar));
    }

    /* renamed from: X */
    public final void mo7383X(int i, C0973i.C0975b bVar) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, 1026, new u51(F1));
    }

    /* renamed from: Y */
    public final void mo7384Y(int i, C0973i.C0975b bVar, Exception exc) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE, new w51(F1, exc));
    }

    /* renamed from: Z */
    public void mo6726Z(int i) {
    }

    /* renamed from: a */
    public void mo19140a() {
        ((xk2) C2725kr.m20989i(this.f11069x)).mo22780h(new j51(this));
    }

    /* renamed from: a0 */
    public final void mo6727a0(boolean z) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 3, new l51(B1, z));
    }

    /* renamed from: b */
    public final void mo6728b(boolean z) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 23, new z51(H1, z));
    }

    /* renamed from: b0 */
    public final void mo6729b0() {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, -1, new y31(B1));
    }

    /* renamed from: c */
    public final void mo19141c(Exception exc) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1014, new d41(H1, exc));
    }

    /* renamed from: c0 */
    public void mo6730c0(C0821o oVar, C0821o.C0825c cVar) {
    }

    /* renamed from: d */
    public final void mo19142d(C0792h hVar, p31 p31) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1017, new d61(H1, hVar, p31));
    }

    /* renamed from: d0 */
    public final void mo7385d0(int i, C0973i.C0975b bVar) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, 1025, new p51(F1));
    }

    /* renamed from: e */
    public final void mo19143e(String str) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1019, new u31(H1, str));
    }

    /* renamed from: e0 */
    public final void mo6731e0(C0831s sVar, int i) {
        this.f11065g.mo19167l((C0821o) C2725kr.m20985e(this.f11068s));
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 0, new o41(B1, i));
    }

    /* renamed from: f */
    public final void mo19144f(String str, long j, long j2) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1016, new n41(H1, str, j2, j));
    }

    /* renamed from: f0 */
    public void mo19145f0(C0020ag agVar) {
        C2725kr.m20985e(agVar);
        this.f11067r.mo23186c(agVar);
    }

    /* renamed from: g */
    public final void mo6733g(int i) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 4, new c51(B1, i));
    }

    /* renamed from: g0 */
    public final void mo6734g0(boolean z, int i) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, -1, new c61(B1, z, i));
    }

    /* renamed from: h */
    public final void mo6735h(C0844x xVar) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 25, new v51(H1, xVar));
    }

    /* renamed from: h0 */
    public void mo6736h0(C0842w wVar) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 2, new i41(B1, wVar));
    }

    /* renamed from: i */
    public final void mo19146i(String str) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1012, new a61(H1, str));
    }

    /* renamed from: i0 */
    public void mo6738i0(C0788f fVar) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 29, new h41(B1, fVar));
    }

    /* renamed from: j */
    public final void mo19147j(String str, long j, long j2) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1008, new v41(H1, str, j2, j));
    }

    /* renamed from: j0 */
    public final void mo7606j0(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3, IOException iOException, boolean z) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, PlaybackException.ERROR_CODE_TIMEOUT, new e41(F1, vi3, jr3, iOException, z));
    }

    /* renamed from: k */
    public final void mo6739k(C0820n nVar) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 12, new w31(B1, nVar));
    }

    /* renamed from: k0 */
    public void mo6740k0(PlaybackException playbackException) {
        C0020ag.C0021a I1 = mo19137I1(playbackException);
        mo19139U2(I1, 10, new f51(I1, playbackException));
    }

    /* renamed from: l */
    public final void mo19148l(C0792h hVar, p31 p31) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1009, new h51(H1, hVar, p31));
    }

    /* renamed from: l0 */
    public final void mo7386l0(int i, C0973i.C0975b bVar) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, 1027, new v31(F1));
    }

    /* renamed from: m */
    public void mo6741m(List<dx0> list) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 27, new m41(B1, list));
    }

    /* renamed from: m0 */
    public void mo19149m0(C0821o oVar, Looper looper) {
        boolean z;
        if (this.f11068s == null || this.f11065g.f11072b.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f11068s = (C0821o) C2725kr.m20985e(oVar);
        this.f11069x = this.f11062a.mo18771c(looper, (Handler.Callback) null);
        this.f11067r = this.f11067r.mo23188e(looper, new l41(this, oVar));
    }

    /* renamed from: n */
    public final void mo19150n(long j) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1010, new k51(H1, j));
    }

    /* renamed from: n0 */
    public final void mo7607n0(int i, C0973i.C0975b bVar, vi3 vi3, jr3 jr3) {
        C0020ag.C0021a F1 = mo19133F1(i, bVar);
        mo19139U2(F1, 1001, new e51(F1, vi3, jr3));
    }

    /* renamed from: o */
    public final void mo19151o(Exception exc) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1030, new c41(H1, exc));
    }

    /* renamed from: o0 */
    public final void mo6742o0(C0821o.C0827e eVar, C0821o.C0827e eVar2, int i) {
        if (i == 1) {
            this.f11070y = false;
        }
        this.f11065g.mo19165j((C0821o) C2725kr.m20985e(this.f11068s));
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 11, new f41(B1, i, eVar, eVar2));
    }

    /* renamed from: p */
    public final void mo19152p(int i, long j, long j2) {
        C0020ag.C0021a E1 = mo19131E1();
        mo19139U2(E1, 1006, new y51(E1, i, j, j2));
    }

    /* renamed from: p0 */
    public void mo6743p0(boolean z) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 7, new z41(B1, z));
    }

    /* renamed from: q */
    public final void mo19153q(n31 n31) {
        C0020ag.C0021a G1 = mo19135G1();
        mo19139U2(G1, 1020, new n51(G1, n31));
    }

    /* renamed from: r */
    public final void mo19154r(n31 n31) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1015, new r41(H1, n31));
    }

    /* renamed from: s */
    public final void mo19155s(n31 n31) {
        C0020ag.C0021a G1 = mo19135G1();
        mo19139U2(G1, 1013, new i51(G1, n31));
    }

    /* renamed from: t */
    public void mo6744t(hx0 hx0) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 27, new x41(B1, hx0));
    }

    /* renamed from: u */
    public final void mo19156u(int i, long j) {
        C0020ag.C0021a G1 = mo19135G1();
        mo19139U2(G1, 1018, new q41(G1, i, j));
    }

    /* renamed from: v */
    public final void mo19157v(Object obj, long j) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 26, new x51(H1, obj, j));
    }

    /* renamed from: w */
    public final void mo6745w(int i) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 8, new b41(B1, i));
    }

    /* renamed from: x */
    public final void mo6746x(Metadata metadata) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 28, new u41(B1, metadata));
    }

    /* renamed from: y */
    public final void mo19158y(Exception exc) {
        C0020ag.C0021a H1 = mo19136H1();
        mo19139U2(H1, 1029, new j41(H1, exc));
    }

    /* renamed from: z */
    public final void mo6747z(boolean z, int i) {
        C0020ag.C0021a B1 = mo19127B1();
        mo19139U2(B1, 5, new y41(B1, z, i));
    }
}
