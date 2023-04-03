package androidx.media3.p005ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.C0788f;
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
import androidx.media3.p005ui.C1103b;
import com.github.mikephil.charting.utils.Utils;
import com.google.mlkit.common.MlKitException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.ui.LegacyPlayerControlView */
public class LegacyPlayerControlView extends FrameLayout {

    /* renamed from: A */
    public final ImageView f5731A;

    /* renamed from: A1 */
    public boolean f5732A1;

    /* renamed from: B */
    public final View f5733B;

    /* renamed from: B1 */
    public boolean f5734B1;

    /* renamed from: C */
    public final TextView f5735C;

    /* renamed from: C1 */
    public int f5736C1;

    /* renamed from: D1 */
    public int f5737D1;

    /* renamed from: E1 */
    public int f5738E1;

    /* renamed from: F1 */
    public boolean f5739F1;

    /* renamed from: G1 */
    public boolean f5740G1;

    /* renamed from: H */
    public final TextView f5741H;

    /* renamed from: H1 */
    public boolean f5742H1;

    /* renamed from: I */
    public final C1103b f5743I;

    /* renamed from: I1 */
    public boolean f5744I1;

    /* renamed from: J1 */
    public boolean f5745J1;

    /* renamed from: K1 */
    public long f5746K1;

    /* renamed from: L */
    public final StringBuilder f5747L;

    /* renamed from: L1 */
    public long[] f5748L1;

    /* renamed from: M */
    public final Formatter f5749M;

    /* renamed from: M1 */
    public boolean[] f5750M1;

    /* renamed from: N1 */
    public long[] f5751N1;

    /* renamed from: O1 */
    public boolean[] f5752O1;

    /* renamed from: P */
    public final C0831s.C0833b f5753P;

    /* renamed from: P1 */
    public long f5754P1;

    /* renamed from: Q */
    public final C0831s.C0835d f5755Q;

    /* renamed from: Q1 */
    public long f5756Q1;

    /* renamed from: R1 */
    public long f5757R1;

    /* renamed from: U */
    public final Runnable f5758U;

    /* renamed from: a */
    public final C1072c f5759a;

    /* renamed from: b1 */
    public final Drawable f5760b1;

    /* renamed from: d */
    public final CopyOnWriteArrayList<C1074e> f5761d;

    /* renamed from: e */
    public final View f5762e;

    /* renamed from: e0 */
    public final Runnable f5763e0;

    /* renamed from: e1 */
    public final String f5764e1;

    /* renamed from: g */
    public final View f5765g;

    /* renamed from: k */
    public final View f5766k;

    /* renamed from: k0 */
    public final Drawable f5767k0;

    /* renamed from: o1 */
    public final String f5768o1;

    /* renamed from: p1 */
    public final String f5769p1;

    /* renamed from: q1 */
    public final Drawable f5770q1;

    /* renamed from: r */
    public final View f5771r;

    /* renamed from: r1 */
    public final Drawable f5772r1;

    /* renamed from: s */
    public final View f5773s;

    /* renamed from: s1 */
    public final float f5774s1;

    /* renamed from: t1 */
    public final float f5775t1;

    /* renamed from: u1 */
    public final String f5776u1;

    /* renamed from: v0 */
    public final Drawable f5777v0;

    /* renamed from: v1 */
    public final String f5778v1;

    /* renamed from: w1 */
    public C0821o f5779w1;

    /* renamed from: x */
    public final View f5780x;

    /* renamed from: x1 */
    public C1073d f5781x1;

    /* renamed from: y */
    public final ImageView f5782y;

    /* renamed from: y1 */
    public boolean f5783y1;

    /* renamed from: z1 */
    public boolean f5784z1;

    /* renamed from: androidx.media3.ui.LegacyPlayerControlView$b */
    public static final class C1071b {
        /* renamed from: a */
        public static boolean m7806a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* renamed from: androidx.media3.ui.LegacyPlayerControlView$c */
    public final class C1072c implements C0821o.C0826d, C1103b.C1104a, View.OnClickListener {
        public C1072c() {
        }

        /* renamed from: D */
        public /* synthetic */ void mo6715D(int i) {
            dq4.m15305p(this, i);
        }

        /* renamed from: E */
        public /* synthetic */ void mo6716E(boolean z) {
            dq4.m15298i(this, z);
        }

        /* renamed from: H */
        public /* synthetic */ void mo6717H(boolean z) {
            dq4.m15314y(this, z);
        }

        /* renamed from: I */
        public void mo8189I(C1103b bVar, long j) {
            if (LegacyPlayerControlView.this.f5741H != null) {
                LegacyPlayerControlView.this.f5741H.setText(w67.m29349d0(LegacyPlayerControlView.this.f5747L, LegacyPlayerControlView.this.f5749M, j));
            }
        }

        /* renamed from: J */
        public /* synthetic */ void mo6718J(int i, boolean z) {
            dq4.m15294e(this, i, z);
        }

        /* renamed from: K */
        public void mo8190K(C1103b bVar, long j, boolean z) {
            boolean unused = LegacyPlayerControlView.this.f5734B1 = false;
            if (!z && LegacyPlayerControlView.this.f5779w1 != null) {
                LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
                legacyPlayerControlView.mo8155L(legacyPlayerControlView.f5779w1, j);
            }
        }

        /* renamed from: L */
        public /* synthetic */ void mo6719L(C0816l lVar) {
            dq4.m15300k(this, lVar);
        }

        /* renamed from: N */
        public /* synthetic */ void mo6720N(C0840v vVar) {
            dq4.m15287C(this, vVar);
        }

        /* renamed from: P */
        public /* synthetic */ void mo6721P() {
            dq4.m15311v(this);
        }

        /* renamed from: Q */
        public /* synthetic */ void mo6722Q(C0798k kVar, int i) {
            dq4.m15299j(this, kVar, i);
        }

        /* renamed from: T */
        public /* synthetic */ void mo6723T(PlaybackException playbackException) {
            dq4.m15306q(this, playbackException);
        }

        /* renamed from: V */
        public /* synthetic */ void mo6724V(int i, int i2) {
            dq4.m15285A(this, i, i2);
        }

        /* renamed from: W */
        public /* synthetic */ void mo6725W(C0821o.C0823b bVar) {
            dq4.m15290a(this, bVar);
        }

        /* renamed from: Z */
        public /* synthetic */ void mo6726Z(int i) {
            dq4.m15309t(this, i);
        }

        /* renamed from: a0 */
        public /* synthetic */ void mo6727a0(boolean z) {
            dq4.m15296g(this, z);
        }

        /* renamed from: b */
        public /* synthetic */ void mo6728b(boolean z) {
            dq4.m15315z(this, z);
        }

        /* renamed from: b0 */
        public /* synthetic */ void mo6729b0() {
            dq4.m15313x(this);
        }

        /* renamed from: c0 */
        public void mo6730c0(C0821o oVar, C0821o.C0825c cVar) {
            if (cVar.mo6856b(4, 5)) {
                LegacyPlayerControlView.this.mo8160Q();
            }
            if (cVar.mo6856b(4, 5, 7)) {
                LegacyPlayerControlView.this.mo8161R();
            }
            if (cVar.mo6855a(8)) {
                LegacyPlayerControlView.this.mo8162S();
            }
            if (cVar.mo6855a(9)) {
                LegacyPlayerControlView.this.mo8163T();
            }
            if (cVar.mo6856b(8, 9, 11, 0, 13)) {
                LegacyPlayerControlView.this.mo8159P();
            }
            if (cVar.mo6856b(11, 0)) {
                LegacyPlayerControlView.this.mo8164U();
            }
        }

        /* renamed from: e0 */
        public /* synthetic */ void mo6731e0(C0831s sVar, int i) {
            dq4.m15286B(this, sVar, i);
        }

        /* renamed from: g */
        public /* synthetic */ void mo6733g(int i) {
            dq4.m15304o(this, i);
        }

        /* renamed from: g0 */
        public /* synthetic */ void mo6734g0(boolean z, int i) {
            dq4.m15308s(this, z, i);
        }

        /* renamed from: h */
        public /* synthetic */ void mo6735h(C0844x xVar) {
            dq4.m15289E(this, xVar);
        }

        /* renamed from: h0 */
        public /* synthetic */ void mo6736h0(C0842w wVar) {
            dq4.m15288D(this, wVar);
        }

        /* renamed from: i0 */
        public /* synthetic */ void mo6738i0(C0788f fVar) {
            dq4.m15293d(this, fVar);
        }

        /* renamed from: k */
        public /* synthetic */ void mo6739k(C0820n nVar) {
            dq4.m15303n(this, nVar);
        }

        /* renamed from: k0 */
        public /* synthetic */ void mo6740k0(PlaybackException playbackException) {
            dq4.m15307r(this, playbackException);
        }

        /* renamed from: m */
        public /* synthetic */ void mo6741m(List list) {
            dq4.m15292c(this, list);
        }

        /* renamed from: o0 */
        public /* synthetic */ void mo6742o0(C0821o.C0827e eVar, C0821o.C0827e eVar2, int i) {
            dq4.m15310u(this, eVar, eVar2, i);
        }

        public void onClick(View view) {
            C0821o d = LegacyPlayerControlView.this.f5779w1;
            if (d != null) {
                if (LegacyPlayerControlView.this.f5765g == view) {
                    d.mo6595A();
                } else if (LegacyPlayerControlView.this.f5762e == view) {
                    d.mo6610k();
                } else if (LegacyPlayerControlView.this.f5773s == view) {
                    if (d.mo6686P() != 4) {
                        d.mo6599Y();
                    }
                } else if (LegacyPlayerControlView.this.f5780x == view) {
                    d.mo6600Z();
                } else if (LegacyPlayerControlView.this.f5766k == view) {
                    LegacyPlayerControlView.this.mo8147B(d);
                } else if (LegacyPlayerControlView.this.f5771r == view) {
                    LegacyPlayerControlView.this.mo8146A(d);
                } else if (LegacyPlayerControlView.this.f5782y == view) {
                    d.mo6688S(td5.m27677a(d.mo6691V(), LegacyPlayerControlView.this.f5738E1));
                } else if (LegacyPlayerControlView.this.f5731A == view) {
                    d.mo6679F(!d.mo6692W());
                }
            }
        }

        /* renamed from: p */
        public void mo8192p(C1103b bVar, long j) {
            boolean unused = LegacyPlayerControlView.this.f5734B1 = true;
            if (LegacyPlayerControlView.this.f5741H != null) {
                LegacyPlayerControlView.this.f5741H.setText(w67.m29349d0(LegacyPlayerControlView.this.f5747L, LegacyPlayerControlView.this.f5749M, j));
            }
        }

        /* renamed from: p0 */
        public /* synthetic */ void mo6743p0(boolean z) {
            dq4.m15297h(this, z);
        }

        /* renamed from: t */
        public /* synthetic */ void mo6744t(hx0 hx0) {
            dq4.m15291b(this, hx0);
        }

        /* renamed from: w */
        public /* synthetic */ void mo6745w(int i) {
            dq4.m15312w(this, i);
        }

        /* renamed from: x */
        public /* synthetic */ void mo6746x(Metadata metadata) {
            dq4.m15301l(this, metadata);
        }

        /* renamed from: z */
        public /* synthetic */ void mo6747z(boolean z, int i) {
            dq4.m15302m(this, z, i);
        }
    }

    /* renamed from: androidx.media3.ui.LegacyPlayerControlView$d */
    public interface C1073d {
        /* renamed from: a */
        void mo8193a(long j, long j2);
    }

    /* renamed from: androidx.media3.ui.LegacyPlayerControlView$e */
    public interface C1074e {
        /* renamed from: p */
        void mo8194p(int i);
    }

    static {
        ir3.m19787a("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: D */
    public static int m7759D(TypedArray typedArray, int i) {
        return typedArray.getInt(h65.LegacyPlayerControlView_repeat_toggle_modes, i);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: G */
    public static boolean m7760G(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* renamed from: y */
    public static boolean m7785y(C0831s sVar, C0831s.C0835d dVar) {
        if (sVar.mo6882t() > 100) {
            return false;
        }
        int t = sVar.mo6882t();
        for (int i = 0; i < t; i++) {
            if (sVar.mo6880r(i, dVar).f4455I == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public final void mo8146A(C0821o oVar) {
        oVar.mo6601c();
    }

    /* renamed from: B */
    public final void mo8147B(C0821o oVar) {
        int P = oVar.mo6686P();
        if (P == 1) {
            oVar.mo6699e();
        } else if (P == 4) {
            mo8154K(oVar, oVar.mo6687R(), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        }
        oVar.mo6604f();
    }

    /* renamed from: C */
    public final void mo8148C(C0821o oVar) {
        int P = oVar.mo6686P();
        if (P == 1 || P == 4 || !oVar.mo6678E()) {
            mo8147B(oVar);
        } else {
            mo8146A(oVar);
        }
    }

    /* renamed from: E */
    public void mo8149E() {
        if (mo8151H()) {
            setVisibility(8);
            Iterator<C1074e> it = this.f5761d.iterator();
            while (it.hasNext()) {
                it.next().mo8194p(getVisibility());
            }
            removeCallbacks(this.f5758U);
            removeCallbacks(this.f5763e0);
            this.f5746K1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
    }

    /* renamed from: F */
    public final void mo8150F() {
        removeCallbacks(this.f5763e0);
        if (this.f5736C1 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.f5736C1;
            this.f5746K1 = uptimeMillis + ((long) i);
            if (this.f5783y1) {
                postDelayed(this.f5763e0, (long) i);
                return;
            }
            return;
        }
        this.f5746K1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: H */
    public boolean mo8151H() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final void mo8152I() {
        View view;
        View view2;
        boolean M = mo8156M();
        if (!M && (view2 = this.f5766k) != null) {
            view2.sendAccessibilityEvent(8);
        } else if (M && (view = this.f5771r) != null) {
            view.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: J */
    public final void mo8153J() {
        View view;
        View view2;
        boolean M = mo8156M();
        if (!M && (view2 = this.f5766k) != null) {
            view2.requestFocus();
        } else if (M && (view = this.f5771r) != null) {
            view.requestFocus();
        }
    }

    /* renamed from: K */
    public final void mo8154K(C0821o oVar, int i, long j) {
        oVar.mo6677C(i, j);
    }

    /* renamed from: L */
    public final void mo8155L(C0821o oVar, long j) {
        int i;
        C0831s x = oVar.mo6712x();
        if (this.f5732A1 && !x.mo6883u()) {
            int t = x.mo6882t();
            i = 0;
            while (true) {
                long g = x.mo6880r(i, this.f5755Q).mo6911g();
                if (j < g) {
                    break;
                } else if (i == t - 1) {
                    j = g;
                    break;
                } else {
                    j -= g;
                    i++;
                }
            }
        } else {
            i = oVar.mo6687R();
        }
        mo8154K(oVar, i, j);
        mo8161R();
    }

    /* renamed from: M */
    public final boolean mo8156M() {
        C0821o oVar = this.f5779w1;
        if (oVar == null || oVar.mo6686P() == 4 || this.f5779w1.mo6686P() == 1 || !this.f5779w1.mo6678E()) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public final void mo8157N() {
        mo8160Q();
        mo8159P();
        mo8162S();
        mo8163T();
        mo8164U();
    }

    /* renamed from: O */
    public final void mo8158O(boolean z, boolean z2, View view) {
        float f;
        int i;
        if (view != null) {
            view.setEnabled(z2);
            if (z2) {
                f = this.f5774s1;
            } else {
                f = this.f5775t1;
            }
            view.setAlpha(f);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: P */
    public final void mo8159P() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (mo8151H() && this.f5783y1) {
            C0821o oVar = this.f5779w1;
            boolean z5 = false;
            if (oVar != null) {
                boolean t = oVar.mo6618t(5);
                boolean t2 = oVar.mo6618t(7);
                z2 = oVar.mo6618t(11);
                z = oVar.mo6618t(12);
                z4 = oVar.mo6618t(9);
                boolean z6 = t2;
                z3 = t;
                z5 = z6;
            } else {
                z4 = false;
                z3 = false;
                z2 = false;
                z = false;
            }
            mo8158O(this.f5742H1, z5, this.f5762e);
            mo8158O(this.f5739F1, z2, this.f5780x);
            mo8158O(this.f5740G1, z, this.f5773s);
            mo8158O(this.f5744I1, z4, this.f5765g);
            C1103b bVar = this.f5743I;
            if (bVar != null) {
                bVar.setEnabled(z3);
            }
        }
    }

    /* renamed from: Q */
    public final void mo8160Q() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        if (mo8151H() && this.f5783y1) {
            boolean M = mo8156M();
            View view = this.f5766k;
            int i2 = 8;
            boolean z6 = true;
            if (view != null) {
                if (!M || !view.isFocused()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                z2 = z4 | false;
                if (w67.f19021a < 21) {
                    z5 = z2;
                } else if (!M || !C1071b.m7806a(this.f5766k)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                z = z5 | false;
                View view2 = this.f5766k;
                if (M) {
                    i = 8;
                } else {
                    i = 0;
                }
                view2.setVisibility(i);
            } else {
                z2 = false;
                z = false;
            }
            View view3 = this.f5771r;
            if (view3 != null) {
                if (M || !view3.isFocused()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                z2 |= z3;
                if (w67.f19021a < 21) {
                    z6 = z2;
                } else if (M || !C1071b.m7806a(this.f5771r)) {
                    z6 = false;
                }
                z |= z6;
                View view4 = this.f5771r;
                if (M) {
                    i2 = 0;
                }
                view4.setVisibility(i2);
            }
            if (z2) {
                mo8153J();
            }
            if (z) {
                mo8152I();
            }
        }
    }

    /* renamed from: R */
    public final void mo8161R() {
        long j;
        boolean z;
        int i;
        long j2;
        if (mo8151H() && this.f5783y1) {
            C0821o oVar = this.f5779w1;
            long j3 = 0;
            if (oVar != null) {
                j3 = this.f5754P1 + oVar.mo6685N();
                j = this.f5754P1 + oVar.mo6693X();
            } else {
                j = 0;
            }
            boolean z2 = false;
            if (j3 != this.f5756Q1) {
                z = true;
            } else {
                z = false;
            }
            if (j != this.f5757R1) {
                z2 = true;
            }
            this.f5756Q1 = j3;
            this.f5757R1 = j;
            TextView textView = this.f5741H;
            if (textView != null && !this.f5734B1 && z) {
                textView.setText(w67.m29349d0(this.f5747L, this.f5749M, j3));
            }
            C1103b bVar = this.f5743I;
            if (bVar != null) {
                bVar.setPosition(j3);
                this.f5743I.setBufferedPosition(j);
            }
            C1073d dVar = this.f5781x1;
            if (dVar != null && (z || z2)) {
                dVar.mo8193a(j3, j);
            }
            removeCallbacks(this.f5758U);
            if (oVar == null) {
                i = 1;
            } else {
                i = oVar.mo6686P();
            }
            long j4 = 1000;
            if (oVar != null && oVar.mo6598Q()) {
                C1103b bVar2 = this.f5743I;
                if (bVar2 != null) {
                    j2 = bVar2.getPreferredUpdateDelay();
                } else {
                    j2 = 1000;
                }
                long min = Math.min(j2, 1000 - (j3 % 1000));
                float f = oVar.mo6698d().f4406a;
                if (f > Utils.FLOAT_EPSILON) {
                    j4 = (long) (((float) min) / f);
                }
                postDelayed(this.f5758U, w67.m29376r(j4, (long) this.f5737D1, 1000));
            } else if (i != 4 && i != 1) {
                postDelayed(this.f5758U, 1000);
            }
        }
    }

    /* renamed from: S */
    public final void mo8162S() {
        ImageView imageView;
        if (mo8151H() && this.f5783y1 && (imageView = this.f5782y) != null) {
            if (this.f5738E1 == 0) {
                mo8158O(false, false, imageView);
                return;
            }
            C0821o oVar = this.f5779w1;
            if (oVar == null) {
                mo8158O(true, false, imageView);
                this.f5782y.setImageDrawable(this.f5767k0);
                this.f5782y.setContentDescription(this.f5764e1);
                return;
            }
            mo8158O(true, true, imageView);
            int V = oVar.mo6691V();
            if (V == 0) {
                this.f5782y.setImageDrawable(this.f5767k0);
                this.f5782y.setContentDescription(this.f5764e1);
            } else if (V == 1) {
                this.f5782y.setImageDrawable(this.f5777v0);
                this.f5782y.setContentDescription(this.f5768o1);
            } else if (V == 2) {
                this.f5782y.setImageDrawable(this.f5760b1);
                this.f5782y.setContentDescription(this.f5769p1);
            }
            this.f5782y.setVisibility(0);
        }
    }

    /* renamed from: T */
    public final void mo8163T() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (mo8151H() && this.f5783y1 && (imageView = this.f5731A) != null) {
            C0821o oVar = this.f5779w1;
            if (!this.f5745J1) {
                mo8158O(false, false, imageView);
            } else if (oVar == null) {
                mo8158O(true, false, imageView);
                this.f5731A.setImageDrawable(this.f5772r1);
                this.f5731A.setContentDescription(this.f5778v1);
            } else {
                mo8158O(true, true, imageView);
                ImageView imageView2 = this.f5731A;
                if (oVar.mo6692W()) {
                    drawable = this.f5770q1;
                } else {
                    drawable = this.f5772r1;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f5731A;
                if (oVar.mo6692W()) {
                    str = this.f5776u1;
                } else {
                    str = this.f5778v1;
                }
                imageView3.setContentDescription(str);
            }
        }
    }

    /* renamed from: U */
    public final void mo8164U() {
        boolean z;
        int i;
        int i2;
        int i3;
        C0831s.C0835d dVar;
        int i4;
        C0821o oVar = this.f5779w1;
        if (oVar != null) {
            boolean z2 = true;
            if (!this.f5784z1 || !m7785y(oVar.mo6712x(), this.f5755Q)) {
                z = false;
            } else {
                z = true;
            }
            this.f5732A1 = z;
            long j = 0;
            this.f5754P1 = 0;
            C0831s x = oVar.mo6712x();
            if (!x.mo6883u()) {
                int R = oVar.mo6687R();
                boolean z3 = this.f5732A1;
                if (z3) {
                    i2 = 0;
                } else {
                    i2 = R;
                }
                if (z3) {
                    i3 = x.mo6882t() - 1;
                } else {
                    i3 = R;
                }
                long j2 = 0;
                i = 0;
                while (true) {
                    if (i2 > i3) {
                        break;
                    }
                    if (i2 == R) {
                        this.f5754P1 = w67.m29335U0(j2);
                    }
                    x.mo6880r(i2, this.f5755Q);
                    C0831s.C0835d dVar2 = this.f5755Q;
                    if (dVar2.f4455I == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                        C2725kr.m20987g(this.f5732A1 ^ z2);
                        break;
                    }
                    int i5 = dVar2.f4456L;
                    while (true) {
                        dVar = this.f5755Q;
                        if (i5 > dVar.f4457M) {
                            break;
                        }
                        x.mo6872j(i5, this.f5753P);
                        int f = this.f5753P.mo6889f();
                        for (int r = this.f5753P.mo6902r(); r < f; r++) {
                            long i6 = this.f5753P.mo6893i(r);
                            if (i6 == Long.MIN_VALUE) {
                                long j3 = this.f5753P.f4439g;
                                if (j3 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                                } else {
                                    i6 = j3;
                                }
                            }
                            long q = i6 + this.f5753P.mo6901q();
                            if (q >= 0) {
                                long[] jArr = this.f5748L1;
                                if (i == jArr.length) {
                                    if (jArr.length == 0) {
                                        i4 = 1;
                                    } else {
                                        i4 = jArr.length * 2;
                                    }
                                    this.f5748L1 = Arrays.copyOf(jArr, i4);
                                    this.f5750M1 = Arrays.copyOf(this.f5750M1, i4);
                                }
                                this.f5748L1[i] = w67.m29335U0(j2 + q);
                                this.f5750M1[i] = this.f5753P.mo6903s(r);
                                i++;
                            }
                        }
                        i5++;
                    }
                    j2 += dVar.f4455I;
                    i2++;
                    z2 = true;
                }
                j = j2;
            } else {
                i = 0;
            }
            long U0 = w67.m29335U0(j);
            TextView textView = this.f5735C;
            if (textView != null) {
                textView.setText(w67.m29349d0(this.f5747L, this.f5749M, U0));
            }
            C1103b bVar = this.f5743I;
            if (bVar != null) {
                bVar.setDuration(U0);
                int length = this.f5751N1.length;
                int i7 = i + length;
                long[] jArr2 = this.f5748L1;
                if (i7 > jArr2.length) {
                    this.f5748L1 = Arrays.copyOf(jArr2, i7);
                    this.f5750M1 = Arrays.copyOf(this.f5750M1, i7);
                }
                System.arraycopy(this.f5751N1, 0, this.f5748L1, i, length);
                System.arraycopy(this.f5752O1, 0, this.f5750M1, i, length);
                this.f5743I.setAdGroupTimesMs(this.f5748L1, this.f5750M1, i7);
            }
            mo8161R();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (mo8188z(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f5763e0);
        } else if (motionEvent.getAction() == 1) {
            mo8150F();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0821o getPlayer() {
        return this.f5779w1;
    }

    public int getRepeatToggleModes() {
        return this.f5738E1;
    }

    public boolean getShowShuffleButton() {
        return this.f5745J1;
    }

    public int getShowTimeoutMs() {
        return this.f5736C1;
    }

    public boolean getShowVrButton() {
        View view = this.f5733B;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5783y1 = true;
        long j = this.f5746K1;
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                mo8149E();
            } else {
                postDelayed(this.f5763e0, uptimeMillis);
            }
        } else if (mo8151H()) {
            mo8150F();
        }
        mo8157N();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5783y1 = false;
        removeCallbacks(this.f5758U);
        removeCallbacks(this.f5763e0);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        boolean z = false;
        if (jArr == null) {
            this.f5751N1 = new long[0];
            this.f5752O1 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) C2725kr.m20985e(zArr);
            if (jArr.length == zArr2.length) {
                z = true;
            }
            C2725kr.m20981a(z);
            this.f5751N1 = jArr;
            this.f5752O1 = zArr2;
        }
        mo8164U();
    }

    public void setPlayer(C0821o oVar) {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        if (!(oVar == null || oVar.mo6713y() == Looper.getMainLooper())) {
            z2 = false;
        }
        C2725kr.m20981a(z2);
        C0821o oVar2 = this.f5779w1;
        if (oVar2 != oVar) {
            if (oVar2 != null) {
                oVar2.mo6708r(this.f5759a);
            }
            this.f5779w1 = oVar;
            if (oVar != null) {
                oVar.mo6710v(this.f5759a);
            }
            mo8157N();
        }
    }

    public void setProgressUpdateListener(C1073d dVar) {
        this.f5781x1 = dVar;
    }

    public void setRepeatToggleModes(int i) {
        this.f5738E1 = i;
        C0821o oVar = this.f5779w1;
        if (oVar != null) {
            int V = oVar.mo6691V();
            if (i == 0 && V != 0) {
                this.f5779w1.mo6688S(0);
            } else if (i == 1 && V == 2) {
                this.f5779w1.mo6688S(1);
            } else if (i == 2 && V == 1) {
                this.f5779w1.mo6688S(2);
            }
        }
        mo8162S();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f5740G1 = z;
        mo8159P();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f5784z1 = z;
        mo8164U();
    }

    public void setShowNextButton(boolean z) {
        this.f5744I1 = z;
        mo8159P();
    }

    public void setShowPreviousButton(boolean z) {
        this.f5742H1 = z;
        mo8159P();
    }

    public void setShowRewindButton(boolean z) {
        this.f5739F1 = z;
        mo8159P();
    }

    public void setShowShuffleButton(boolean z) {
        this.f5745J1 = z;
        mo8163T();
    }

    public void setShowTimeoutMs(int i) {
        this.f5736C1 = i;
        if (mo8151H()) {
            mo8150F();
        }
    }

    public void setShowVrButton(boolean z) {
        int i;
        View view = this.f5733B;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f5737D1 = w67.m29374q(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z;
        View view = this.f5733B;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            mo8158O(showVrButton, z, this.f5733B);
        }
    }

    /* renamed from: z */
    public boolean mo8188z(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0821o oVar = this.f5779w1;
        if (oVar == null || !m7760G(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (oVar.mo6686P() == 4) {
                return true;
            }
            oVar.mo6599Y();
            return true;
        } else if (keyCode == 89) {
            oVar.mo6600Z();
            return true;
        } else if (keyEvent.getRepeatCount() != 0) {
            return true;
        } else {
            if (keyCode == 79 || keyCode == 85) {
                mo8148C(oVar);
                return true;
            } else if (keyCode == 87) {
                oVar.mo6595A();
                return true;
            } else if (keyCode == 88) {
                oVar.mo6610k();
                return true;
            } else if (keyCode == 126) {
                mo8147B(oVar);
                return true;
            } else if (keyCode != 127) {
                return true;
            } else {
                mo8146A(oVar);
                return true;
            }
        }
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = b45.exo_legacy_player_control_view;
        this.f5736C1 = 5000;
        this.f5738E1 = 0;
        this.f5737D1 = MlKitException.CODE_SCANNER_UNAVAILABLE;
        this.f5746K1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5739F1 = true;
        this.f5740G1 = true;
        this.f5742H1 = true;
        this.f5744I1 = true;
        this.f5745J1 = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, h65.LegacyPlayerControlView, i, 0);
            try {
                this.f5736C1 = obtainStyledAttributes.getInt(h65.LegacyPlayerControlView_show_timeout, this.f5736C1);
                i2 = obtainStyledAttributes.getResourceId(h65.LegacyPlayerControlView_controller_layout_id, i2);
                this.f5738E1 = m7759D(obtainStyledAttributes, this.f5738E1);
                this.f5739F1 = obtainStyledAttributes.getBoolean(h65.LegacyPlayerControlView_show_rewind_button, this.f5739F1);
                this.f5740G1 = obtainStyledAttributes.getBoolean(h65.LegacyPlayerControlView_show_fastforward_button, this.f5740G1);
                this.f5742H1 = obtainStyledAttributes.getBoolean(h65.LegacyPlayerControlView_show_previous_button, this.f5742H1);
                this.f5744I1 = obtainStyledAttributes.getBoolean(h65.LegacyPlayerControlView_show_next_button, this.f5744I1);
                this.f5745J1 = obtainStyledAttributes.getBoolean(h65.LegacyPlayerControlView_show_shuffle_button, this.f5745J1);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(h65.LegacyPlayerControlView_time_bar_min_update_interval, this.f5737D1));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f5761d = new CopyOnWriteArrayList<>();
        this.f5753P = new C0831s.C0833b();
        this.f5755Q = new C0831s.C0835d();
        StringBuilder sb = new StringBuilder();
        this.f5747L = sb;
        this.f5749M = new Formatter(sb, Locale.getDefault());
        this.f5748L1 = new long[0];
        this.f5750M1 = new boolean[0];
        this.f5751N1 = new long[0];
        this.f5752O1 = new boolean[0];
        C1072c cVar = new C1072c();
        this.f5759a = cVar;
        this.f5758U = new bg3(this);
        this.f5763e0 = new cg3(this);
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        int i3 = z25.exo_progress;
        C1103b bVar = (C1103b) findViewById(i3);
        View findViewById = findViewById(z25.exo_progress_placeholder);
        if (bVar != null) {
            this.f5743I = bVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, (AttributeSet) null, 0, attributeSet2);
            defaultTimeBar.setId(i3);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f5743I = defaultTimeBar;
        } else {
            this.f5743I = null;
        }
        this.f5735C = (TextView) findViewById(z25.exo_duration);
        this.f5741H = (TextView) findViewById(z25.exo_position);
        C1103b bVar2 = this.f5743I;
        if (bVar2 != null) {
            bVar2.mo8102a(cVar);
        }
        View findViewById2 = findViewById(z25.exo_play);
        this.f5766k = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar);
        }
        View findViewById3 = findViewById(z25.exo_pause);
        this.f5771r = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar);
        }
        View findViewById4 = findViewById(z25.exo_prev);
        this.f5762e = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(cVar);
        }
        View findViewById5 = findViewById(z25.exo_next);
        this.f5765g = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(cVar);
        }
        View findViewById6 = findViewById(z25.exo_rew);
        this.f5780x = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(cVar);
        }
        View findViewById7 = findViewById(z25.exo_ffwd);
        this.f5773s = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(z25.exo_repeat_toggle);
        this.f5782y = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(z25.exo_shuffle);
        this.f5731A = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        View findViewById8 = findViewById(z25.exo_vr);
        this.f5733B = findViewById8;
        setShowVrButton(false);
        mo8158O(false, false, findViewById8);
        Resources resources = context.getResources();
        this.f5774s1 = ((float) resources.getInteger(z35.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.f5775t1 = ((float) resources.getInteger(z35.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        this.f5767k0 = resources.getDrawable(q25.exo_legacy_controls_repeat_off);
        this.f5777v0 = resources.getDrawable(q25.exo_legacy_controls_repeat_one);
        this.f5760b1 = resources.getDrawable(q25.exo_legacy_controls_repeat_all);
        this.f5770q1 = resources.getDrawable(q25.exo_legacy_controls_shuffle_on);
        this.f5772r1 = resources.getDrawable(q25.exo_legacy_controls_shuffle_off);
        this.f5764e1 = resources.getString(t45.exo_controls_repeat_off_description);
        this.f5768o1 = resources.getString(t45.exo_controls_repeat_one_description);
        this.f5769p1 = resources.getString(t45.exo_controls_repeat_all_description);
        this.f5776u1 = resources.getString(t45.exo_controls_shuffle_on_description);
        this.f5778v1 = resources.getString(t45.exo_controls_shuffle_off_description);
        this.f5756Q1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5757R1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }
}
