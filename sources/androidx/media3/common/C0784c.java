package androidx.media3.common;

import androidx.media3.common.C0831s;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.common.c */
/* compiled from: BasePlayer */
public abstract class C0784c implements C0821o {

    /* renamed from: a */
    public final C0831s.C0835d f4156a = new C0831s.C0835d();

    /* renamed from: A */
    public final void mo6595A() {
        if (!mo6712x().mo6883u() && !mo6701g()) {
            if (mo6617p()) {
                mo6612l0();
            } else if (mo6602d0() && mo6619u()) {
                mo6609j0();
            }
        }
    }

    /* renamed from: K */
    public final boolean mo6596K() {
        if (mo6606g0() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final boolean mo6597O() {
        C0831s x = mo6712x();
        if (x.mo6883u() || !x.mo6880r(mo6687R(), this.f4156a).f4466x) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public final boolean mo6598Q() {
        if (mo6686P() == 3 && mo6678E() && mo6711w() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public final void mo6599Y() {
        mo6613m0(mo6684M());
    }

    /* renamed from: Z */
    public final void mo6600Z() {
        mo6613m0(-mo6697c0());
    }

    /* renamed from: c */
    public final void mo6601c() {
        mo6846m(false);
    }

    /* renamed from: d0 */
    public final boolean mo6602d0() {
        C0831s x = mo6712x();
        if (x.mo6883u() || !x.mo6880r(mo6687R(), this.f4156a).mo6914i()) {
            return false;
        }
        return true;
    }

    /* renamed from: e0 */
    public final long mo6603e0() {
        C0831s x = mo6712x();
        if (x.mo6883u()) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return x.mo6880r(mo6687R(), this.f4156a).mo6911g();
    }

    /* renamed from: f */
    public final void mo6604f() {
        mo6846m(true);
    }

    /* renamed from: f0 */
    public final int mo6605f0() {
        C0831s x = mo6712x();
        if (x.mo6883u()) {
            return -1;
        }
        return x.mo6871i(mo6687R(), mo6607h0(), mo6692W());
    }

    /* renamed from: g0 */
    public final int mo6606g0() {
        C0831s x = mo6712x();
        if (x.mo6883u()) {
            return -1;
        }
        return x.mo6878p(mo6687R(), mo6607h0(), mo6692W());
    }

    /* renamed from: h0 */
    public final int mo6607h0() {
        int V = mo6691V();
        if (V == 1) {
            return 0;
        }
        return V;
    }

    /* renamed from: i0 */
    public final void mo6608i0(long j) {
        mo6677C(mo6687R(), j);
    }

    /* renamed from: j0 */
    public final void mo6609j0() {
        mo6611k0(mo6687R());
    }

    /* renamed from: k */
    public final void mo6610k() {
        if (!mo6712x().mo6883u() && !mo6701g()) {
            boolean K = mo6596K();
            if (!mo6602d0() || mo6597O()) {
                if (!K || mo6696b0() > mo6843G()) {
                    mo6608i0(0);
                } else {
                    mo6615n0();
                }
            } else if (K) {
                mo6615n0();
            }
        }
    }

    /* renamed from: k0 */
    public final void mo6611k0(int i) {
        mo6677C(i, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
    }

    /* renamed from: l0 */
    public final void mo6612l0() {
        int f0 = mo6605f0();
        if (f0 != -1) {
            mo6611k0(f0);
        }
    }

    /* renamed from: m0 */
    public final void mo6613m0(long j) {
        long b0 = mo6696b0() + j;
        long duration = getDuration();
        if (duration != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            b0 = Math.min(b0, duration);
        }
        mo6608i0(Math.max(b0, 0));
    }

    /* renamed from: n */
    public final void mo6614n(C0798k kVar) {
        mo6616o0(Collections.singletonList(kVar));
    }

    /* renamed from: n0 */
    public final void mo6615n0() {
        int g0 = mo6606g0();
        if (g0 != -1) {
            mo6611k0(g0);
        }
    }

    /* renamed from: o0 */
    public final void mo6616o0(List<C0798k> list) {
        mo6845i(list, true);
    }

    /* renamed from: p */
    public final boolean mo6617p() {
        if (mo6605f0() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo6618t(int i) {
        return mo6842D().mo6847c(i);
    }

    /* renamed from: u */
    public final boolean mo6619u() {
        C0831s x = mo6712x();
        if (x.mo6883u() || !x.mo6880r(mo6687R(), this.f4156a).f4467y) {
            return false;
        }
        return true;
    }
}
