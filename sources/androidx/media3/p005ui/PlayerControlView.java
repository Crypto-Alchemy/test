package androidx.media3.p005ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.C0788f;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0795i;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0816l;
import androidx.media3.common.C0820n;
import androidx.media3.common.C0821o;
import androidx.media3.common.C0831s;
import androidx.media3.common.C0836t;
import androidx.media3.common.C0837u;
import androidx.media3.common.C0840v;
import androidx.media3.common.C0842w;
import androidx.media3.common.C0844x;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.p005ui.C1103b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.google.common.collect.ImmutableList;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.ui.PlayerControlView */
public class PlayerControlView extends FrameLayout {

    /* renamed from: l2 */
    public static final float[] f5786l2 = {0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};

    /* renamed from: A */
    public final ImageView f5787A;

    /* renamed from: A1 */
    public final Drawable f5788A1;

    /* renamed from: B */
    public final ImageView f5789B;

    /* renamed from: B1 */
    public final Drawable f5790B1;

    /* renamed from: C */
    public final View f5791C;

    /* renamed from: C1 */
    public final String f5792C1;

    /* renamed from: D1 */
    public final String f5793D1;

    /* renamed from: E1 */
    public C0821o f5794E1;

    /* renamed from: F1 */
    public C1080f f5795F1;

    /* renamed from: G1 */
    public C1078d f5796G1;

    /* renamed from: H */
    public final TextView f5797H;

    /* renamed from: H1 */
    public boolean f5798H1;

    /* renamed from: I */
    public final TextView f5799I;

    /* renamed from: I1 */
    public boolean f5800I1;

    /* renamed from: J1 */
    public boolean f5801J1;

    /* renamed from: K1 */
    public boolean f5802K1;

    /* renamed from: L */
    public final C1103b f5803L;

    /* renamed from: L1 */
    public boolean f5804L1;

    /* renamed from: M */
    public final StringBuilder f5805M;

    /* renamed from: M1 */
    public int f5806M1;

    /* renamed from: N1 */
    public int f5807N1;

    /* renamed from: O1 */
    public int f5808O1;

    /* renamed from: P */
    public final Formatter f5809P;

    /* renamed from: P1 */
    public long[] f5810P1;

    /* renamed from: Q */
    public final C0831s.C0833b f5811Q;

    /* renamed from: Q1 */
    public boolean[] f5812Q1;

    /* renamed from: R1 */
    public long[] f5813R1;

    /* renamed from: S1 */
    public boolean[] f5814S1;

    /* renamed from: T1 */
    public long f5815T1;

    /* renamed from: U */
    public final C0831s.C0835d f5816U;

    /* renamed from: U1 */
    public ar4 f5817U1;

    /* renamed from: V1 */
    public Resources f5818V1;

    /* renamed from: W1 */
    public RecyclerView f5819W1;

    /* renamed from: X1 */
    public C1082h f5820X1;

    /* renamed from: Y1 */
    public C1079e f5821Y1;

    /* renamed from: Z1 */
    public PopupWindow f5822Z1;

    /* renamed from: a */
    public final C1077c f5823a;

    /* renamed from: a2 */
    public boolean f5824a2;

    /* renamed from: b1 */
    public final Drawable f5825b1;

    /* renamed from: b2 */
    public int f5826b2;

    /* renamed from: c2 */
    public C1084j f5827c2;

    /* renamed from: d */
    public final CopyOnWriteArrayList<C1087m> f5828d;

    /* renamed from: d2 */
    public C1076b f5829d2;

    /* renamed from: e */
    public final View f5830e;

    /* renamed from: e0 */
    public final Runnable f5831e0;

    /* renamed from: e1 */
    public final String f5832e1;

    /* renamed from: e2 */
    public xs6 f5833e2;

    /* renamed from: f2 */
    public ImageView f5834f2;

    /* renamed from: g */
    public final View f5835g;

    /* renamed from: g2 */
    public ImageView f5836g2;

    /* renamed from: h2 */
    public ImageView f5837h2;

    /* renamed from: i2 */
    public View f5838i2;

    /* renamed from: j2 */
    public View f5839j2;

    /* renamed from: k */
    public final View f5840k;

    /* renamed from: k0 */
    public final Drawable f5841k0;

    /* renamed from: k2 */
    public View f5842k2;

    /* renamed from: o1 */
    public final String f5843o1;

    /* renamed from: p1 */
    public final String f5844p1;

    /* renamed from: q1 */
    public final Drawable f5845q1;

    /* renamed from: r */
    public final View f5846r;

    /* renamed from: r1 */
    public final Drawable f5847r1;

    /* renamed from: s */
    public final View f5848s;

    /* renamed from: s1 */
    public final float f5849s1;

    /* renamed from: t1 */
    public final float f5850t1;

    /* renamed from: u1 */
    public final String f5851u1;

    /* renamed from: v0 */
    public final Drawable f5852v0;

    /* renamed from: v1 */
    public final String f5853v1;

    /* renamed from: w1 */
    public final Drawable f5854w1;

    /* renamed from: x */
    public final TextView f5855x;

    /* renamed from: x1 */
    public final Drawable f5856x1;

    /* renamed from: y */
    public final TextView f5857y;

    /* renamed from: y1 */
    public final String f5858y1;

    /* renamed from: z1 */
    public final String f5859z1;

    /* renamed from: androidx.media3.ui.PlayerControlView$b */
    public final class C1076b extends C1086l {
        public C1076b() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m7929k(View view) {
            if (PlayerControlView.this.f5794E1 != null) {
                ((C0821o) w67.m29360j(PlayerControlView.this.f5794E1)).mo6689T(PlayerControlView.this.f5794E1.mo6714z().mo6933a().mo6937B(1).mo6944J(1, false).mo6936A());
                PlayerControlView.this.f5820X1.mo8275c(1, PlayerControlView.this.getResources().getString(t45.exo_track_selection_auto));
                PlayerControlView.this.f5822Z1.dismiss();
            }
        }

        /* renamed from: e */
        public void mo8258e(C1083i iVar) {
            int i;
            iVar.f5874a.setText(t45.exo_track_selection_auto);
            boolean i2 = mo8260i(((C0821o) C2725kr.m20985e(PlayerControlView.this.f5794E1)).mo6714z());
            View view = iVar.f5875b;
            if (i2) {
                i = 4;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            iVar.itemView.setOnClickListener(new iq4(this));
        }

        /* renamed from: g */
        public void mo8259g(String str) {
            PlayerControlView.this.f5820X1.mo8275c(1, str);
        }

        /* renamed from: i */
        public final boolean mo8260i(C0840v vVar) {
            for (int i = 0; i < this.f5880a.size(); i++) {
                if (vVar.f4516v0.containsKey(this.f5880a.get(i).f5877a.mo6952b())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: j */
        public void mo8261j(List<C1085k> list) {
            this.f5880a = list;
            C0840v z = ((C0821o) C2725kr.m20985e(PlayerControlView.this.f5794E1)).mo6714z();
            if (list.isEmpty()) {
                PlayerControlView.this.f5820X1.mo8275c(1, PlayerControlView.this.getResources().getString(t45.exo_track_selection_none));
            } else if (!mo8260i(z)) {
                PlayerControlView.this.f5820X1.mo8275c(1, PlayerControlView.this.getResources().getString(t45.exo_track_selection_auto));
            } else {
                for (int i = 0; i < list.size(); i++) {
                    C1085k kVar = list.get(i);
                    if (kVar.mo8279a()) {
                        PlayerControlView.this.f5820X1.mo8275c(1, kVar.f5879c);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$c */
    public final class C1077c implements C0821o.C0826d, C1103b.C1104a, View.OnClickListener, PopupWindow.OnDismissListener {
        public C1077c() {
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
            if (PlayerControlView.this.f5799I != null) {
                PlayerControlView.this.f5799I.setText(w67.m29349d0(PlayerControlView.this.f5805M, PlayerControlView.this.f5809P, j));
            }
        }

        /* renamed from: J */
        public /* synthetic */ void mo6718J(int i, boolean z) {
            dq4.m15294e(this, i, z);
        }

        /* renamed from: K */
        public void mo8190K(C1103b bVar, long j, boolean z) {
            boolean unused = PlayerControlView.this.f5804L1 = false;
            if (!z && PlayerControlView.this.f5794E1 != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.mo8231p0(playerControlView.f5794E1, j);
            }
            PlayerControlView.this.f5817U1.mo11095W();
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
                PlayerControlView.this.mo8256y0();
            }
            if (cVar.mo6856b(4, 5, 7)) {
                PlayerControlView.this.mo8195A0();
            }
            if (cVar.mo6855a(8)) {
                PlayerControlView.this.mo8196B0();
            }
            if (cVar.mo6855a(9)) {
                PlayerControlView.this.mo8199E0();
            }
            if (cVar.mo6856b(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.mo8255x0();
            }
            if (cVar.mo6856b(11, 0)) {
                PlayerControlView.this.mo8200F0();
            }
            if (cVar.mo6855a(12)) {
                PlayerControlView.this.mo8257z0();
            }
            if (cVar.mo6855a(2)) {
                PlayerControlView.this.mo8201G0();
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
            C0821o j = PlayerControlView.this.f5794E1;
            if (j != null) {
                PlayerControlView.this.f5817U1.mo11095W();
                if (PlayerControlView.this.f5835g == view) {
                    j.mo6595A();
                } else if (PlayerControlView.this.f5830e == view) {
                    j.mo6610k();
                } else if (PlayerControlView.this.f5846r == view) {
                    if (j.mo6686P() != 4) {
                        j.mo6599Y();
                    }
                } else if (PlayerControlView.this.f5848s == view) {
                    j.mo6600Z();
                } else if (PlayerControlView.this.f5840k == view) {
                    PlayerControlView.this.mo8206X(j);
                } else if (PlayerControlView.this.f5787A == view) {
                    j.mo6688S(td5.m27677a(j.mo6691V(), PlayerControlView.this.f5808O1));
                } else if (PlayerControlView.this.f5789B == view) {
                    j.mo6679F(!j.mo6692W());
                } else if (PlayerControlView.this.f5838i2 == view) {
                    PlayerControlView.this.f5817U1.mo11094V();
                    PlayerControlView playerControlView = PlayerControlView.this;
                    playerControlView.mo8207Y(playerControlView.f5820X1);
                } else if (PlayerControlView.this.f5839j2 == view) {
                    PlayerControlView.this.f5817U1.mo11094V();
                    PlayerControlView playerControlView2 = PlayerControlView.this;
                    playerControlView2.mo8207Y(playerControlView2.f5821Y1);
                } else if (PlayerControlView.this.f5842k2 == view) {
                    PlayerControlView.this.f5817U1.mo11094V();
                    PlayerControlView playerControlView3 = PlayerControlView.this;
                    playerControlView3.mo8207Y(playerControlView3.f5829d2);
                } else if (PlayerControlView.this.f5834f2 == view) {
                    PlayerControlView.this.f5817U1.mo11094V();
                    PlayerControlView playerControlView4 = PlayerControlView.this;
                    playerControlView4.mo8207Y(playerControlView4.f5827c2);
                }
            }
        }

        public void onDismiss() {
            if (PlayerControlView.this.f5824a2) {
                PlayerControlView.this.f5817U1.mo11095W();
            }
        }

        /* renamed from: p */
        public void mo8192p(C1103b bVar, long j) {
            boolean unused = PlayerControlView.this.f5804L1 = true;
            if (PlayerControlView.this.f5799I != null) {
                PlayerControlView.this.f5799I.setText(w67.m29349d0(PlayerControlView.this.f5805M, PlayerControlView.this.f5809P, j));
            }
            PlayerControlView.this.f5817U1.mo11094V();
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

    @Deprecated
    /* renamed from: androidx.media3.ui.PlayerControlView$d */
    public interface C1078d {
        /* renamed from: I */
        void mo8264I(boolean z);
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$e */
    public final class C1079e extends RecyclerView.Adapter<C1083i> {

        /* renamed from: a */
        public final String[] f5862a;

        /* renamed from: d */
        public final float[] f5863d;

        /* renamed from: e */
        public int f5864e;

        public C1079e(String[] strArr, float[] fArr) {
            this.f5862a = strArr;
            this.f5863d = fArr;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m7970c(int i, View view) {
            if (i != this.f5864e) {
                PlayerControlView.this.setPlaybackSpeed(this.f5863d[i]);
            }
            PlayerControlView.this.f5822Z1.dismiss();
        }

        /* renamed from: b */
        public String mo8265b() {
            return this.f5862a[this.f5864e];
        }

        /* renamed from: d */
        public void onBindViewHolder(C1083i iVar, int i) {
            String[] strArr = this.f5862a;
            if (i < strArr.length) {
                iVar.f5874a.setText(strArr[i]);
            }
            if (i == this.f5864e) {
                iVar.itemView.setSelected(true);
                iVar.f5875b.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f5875b.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new jq4(this, i));
        }

        /* renamed from: e */
        public C1083i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C1083i(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(b45.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        /* renamed from: f */
        public void mo8268f(float f) {
            int i = 0;
            float f2 = Float.MAX_VALUE;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f5863d;
                if (i < fArr.length) {
                    float abs = Math.abs(f - fArr[i]);
                    if (abs < f2) {
                        i2 = i;
                        f2 = abs;
                    }
                    i++;
                } else {
                    this.f5864e = i2;
                    return;
                }
            }
        }

        public int getItemCount() {
            return this.f5862a.length;
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$f */
    public interface C1080f {
        /* renamed from: a */
        void mo8272a(long j, long j2);
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$g */
    public final class C1081g extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final TextView f5866a;

        /* renamed from: b */
        public final TextView f5867b;

        /* renamed from: c */
        public final ImageView f5868c;

        public C1081g(View view) {
            super(view);
            if (w67.f19021a < 26) {
                view.setFocusable(true);
            }
            this.f5866a = (TextView) view.findViewById(z25.exo_main_text);
            this.f5867b = (TextView) view.findViewById(z25.exo_sub_text);
            this.f5868c = (ImageView) view.findViewById(z25.exo_icon);
            view.setOnClickListener(new kq4(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m7980e(View view) {
            PlayerControlView.this.mo8224l0(getAdapterPosition());
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$h */
    public class C1082h extends RecyclerView.Adapter<C1081g> {

        /* renamed from: a */
        public final String[] f5870a;

        /* renamed from: d */
        public final String[] f5871d;

        /* renamed from: e */
        public final Drawable[] f5872e;

        public C1082h(String[] strArr, Drawable[] drawableArr) {
            this.f5870a = strArr;
            this.f5871d = new String[strArr.length];
            this.f5872e = drawableArr;
        }

        /* renamed from: a */
        public void onBindViewHolder(C1081g gVar, int i) {
            gVar.f5866a.setText(this.f5870a[i]);
            if (this.f5871d[i] == null) {
                gVar.f5867b.setVisibility(8);
            } else {
                gVar.f5867b.setText(this.f5871d[i]);
            }
            if (this.f5872e[i] == null) {
                gVar.f5868c.setVisibility(8);
            } else {
                gVar.f5868c.setImageDrawable(this.f5872e[i]);
            }
        }

        /* renamed from: b */
        public C1081g onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C1081g(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(b45.exo_styled_settings_list_item, viewGroup, false));
        }

        /* renamed from: c */
        public void mo8275c(int i, String str) {
            this.f5871d[i] = str;
        }

        public int getItemCount() {
            return this.f5870a.length;
        }

        public long getItemId(int i) {
            return (long) i;
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$i */
    public static class C1083i extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final TextView f5874a;

        /* renamed from: b */
        public final View f5875b;

        public C1083i(View view) {
            super(view);
            if (w67.f19021a < 26) {
                view.setFocusable(true);
            }
            this.f5874a = (TextView) view.findViewById(z25.exo_text);
            this.f5875b = view.findViewById(z25.exo_check);
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$j */
    public final class C1084j extends C1086l {
        public C1084j() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m7985j(View view) {
            if (PlayerControlView.this.f5794E1 != null) {
                PlayerControlView.this.f5794E1.mo6689T(PlayerControlView.this.f5794E1.mo6714z().mo6933a().mo6937B(3).mo6940F(-3).mo6936A());
                PlayerControlView.this.f5822Z1.dismiss();
            }
        }

        /* renamed from: d */
        public void onBindViewHolder(C1083i iVar, int i) {
            int i2;
            super.onBindViewHolder(iVar, i);
            if (i > 0) {
                View view = iVar.f5875b;
                if (this.f5880a.get(i - 1).mo8279a()) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                view.setVisibility(i2);
            }
        }

        /* renamed from: e */
        public void mo8258e(C1083i iVar) {
            boolean z;
            iVar.f5874a.setText(t45.exo_track_selection_none);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f5880a.size()) {
                    z = true;
                    break;
                } else if (this.f5880a.get(i2).mo8279a()) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            View view = iVar.f5875b;
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
            iVar.itemView.setOnClickListener(new lq4(this));
        }

        /* renamed from: g */
        public void mo8259g(String str) {
        }

        /* renamed from: i */
        public void mo8278i(List<C1085k> list) {
            Drawable drawable;
            String str;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (list.get(i).mo8279a()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (PlayerControlView.this.f5834f2 != null) {
                ImageView D = PlayerControlView.this.f5834f2;
                PlayerControlView playerControlView = PlayerControlView.this;
                if (z) {
                    drawable = playerControlView.f5854w1;
                } else {
                    drawable = playerControlView.f5856x1;
                }
                D.setImageDrawable(drawable);
                ImageView D2 = PlayerControlView.this.f5834f2;
                if (z) {
                    str = PlayerControlView.this.f5858y1;
                } else {
                    str = PlayerControlView.this.f5859z1;
                }
                D2.setContentDescription(str);
            }
            this.f5880a = list;
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$k */
    public static final class C1085k {

        /* renamed from: a */
        public final C0842w.C0843a f5877a;

        /* renamed from: b */
        public final int f5878b;

        /* renamed from: c */
        public final String f5879c;

        public C1085k(C0842w wVar, int i, int i2, String str) {
            this.f5877a = wVar.mo6947b().get(i);
            this.f5878b = i2;
            this.f5879c = str;
        }

        /* renamed from: a */
        public boolean mo8279a() {
            return this.f5877a.mo6958g(this.f5878b);
        }
    }

    /* renamed from: androidx.media3.ui.PlayerControlView$l */
    public abstract class C1086l extends RecyclerView.Adapter<C1083i> {

        /* renamed from: a */
        public List<C1085k> f5880a = new ArrayList();

        public C1086l() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m7992c(C0821o oVar, C0836t tVar, C1085k kVar, View view) {
            oVar.mo6689T(oVar.mo6714z().mo6933a().mo6941G(new C0837u(tVar, ImmutableList.m36628of(Integer.valueOf(kVar.f5878b)))).mo6944J(kVar.f5877a.mo6954d(), false).mo6936A());
            mo8259g(kVar.f5879c);
            PlayerControlView.this.f5822Z1.dismiss();
        }

        /* renamed from: b */
        public void mo8280b() {
            this.f5880a = Collections.emptyList();
        }

        /* renamed from: d */
        public void onBindViewHolder(C1083i iVar, int i) {
            C0821o j = PlayerControlView.this.f5794E1;
            if (j != null) {
                if (i == 0) {
                    mo8258e(iVar);
                    return;
                }
                boolean z = true;
                C1085k kVar = this.f5880a.get(i - 1);
                C0836t b = kVar.f5877a.mo6952b();
                int i2 = 0;
                if (j.mo6714z().f4516v0.get(b) == null || !kVar.mo8279a()) {
                    z = false;
                }
                iVar.f5874a.setText(kVar.f5879c);
                View view = iVar.f5875b;
                if (!z) {
                    i2 = 4;
                }
                view.setVisibility(i2);
                iVar.itemView.setOnClickListener(new mq4(this, j, b, kVar));
            }
        }

        /* renamed from: e */
        public abstract void mo8258e(C1083i iVar);

        /* renamed from: f */
        public C1083i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C1083i(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(b45.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        /* renamed from: g */
        public abstract void mo8259g(String str);

        public int getItemCount() {
            if (this.f5880a.isEmpty()) {
                return 0;
            }
            return this.f5880a.size() + 1;
        }
    }

    @Deprecated
    /* renamed from: androidx.media3.ui.PlayerControlView$m */
    public interface C1087m {
        /* renamed from: p */
        void mo8282p(int i);
    }

    static {
        ir3.m19787a("media3.ui");
    }

    public PlayerControlView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: T */
    public static boolean m7861T(C0831s sVar, C0831s.C0835d dVar) {
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

    /* renamed from: a0 */
    public static int m7863a0(TypedArray typedArray, int i) {
        return typedArray.getInt(h65.PlayerControlView_repeat_toggle_modes, i);
    }

    /* renamed from: e0 */
    public static void m7868e0(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setVisibility(8);
            view.setOnClickListener(onClickListener);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: g0 */
    public static boolean m7871g0(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        C0821o oVar = this.f5794E1;
        if (oVar != null) {
            oVar.mo6695b(oVar.mo6698d().mo6838e(f));
        }
    }

    /* renamed from: w0 */
    public static void m7888w0(View view, boolean z) {
        if (view != null) {
            if (z) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: A0 */
    public final void mo8195A0() {
        long j;
        int i;
        long j2;
        if (mo8220h0() && this.f5800I1) {
            C0821o oVar = this.f5794E1;
            long j3 = 0;
            if (oVar != null) {
                j3 = this.f5815T1 + oVar.mo6685N();
                j = this.f5815T1 + oVar.mo6693X();
            } else {
                j = 0;
            }
            TextView textView = this.f5799I;
            if (textView != null && !this.f5804L1) {
                textView.setText(w67.m29349d0(this.f5805M, this.f5809P, j3));
            }
            C1103b bVar = this.f5803L;
            if (bVar != null) {
                bVar.setPosition(j3);
                this.f5803L.setBufferedPosition(j);
            }
            C1080f fVar = this.f5795F1;
            if (fVar != null) {
                fVar.mo8272a(j3, j);
            }
            removeCallbacks(this.f5831e0);
            if (oVar == null) {
                i = 1;
            } else {
                i = oVar.mo6686P();
            }
            long j4 = 1000;
            if (oVar != null && oVar.mo6598Q()) {
                C1103b bVar2 = this.f5803L;
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
                postDelayed(this.f5831e0, w67.m29376r(j4, (long) this.f5807N1, 1000));
            } else if (i != 4 && i != 1) {
                postDelayed(this.f5831e0, 1000);
            }
        }
    }

    /* renamed from: B0 */
    public final void mo8196B0() {
        ImageView imageView;
        if (mo8220h0() && this.f5800I1 && (imageView = this.f5787A) != null) {
            if (this.f5808O1 == 0) {
                mo8252t0(false, imageView);
                return;
            }
            C0821o oVar = this.f5794E1;
            if (oVar == null) {
                mo8252t0(false, imageView);
                this.f5787A.setImageDrawable(this.f5841k0);
                this.f5787A.setContentDescription(this.f5832e1);
                return;
            }
            mo8252t0(true, imageView);
            int V = oVar.mo6691V();
            if (V == 0) {
                this.f5787A.setImageDrawable(this.f5841k0);
                this.f5787A.setContentDescription(this.f5832e1);
            } else if (V == 1) {
                this.f5787A.setImageDrawable(this.f5852v0);
                this.f5787A.setContentDescription(this.f5843o1);
            } else if (V == 2) {
                this.f5787A.setImageDrawable(this.f5825b1);
                this.f5787A.setContentDescription(this.f5844p1);
            }
        }
    }

    /* renamed from: C0 */
    public final void mo8197C0() {
        long j;
        C0821o oVar = this.f5794E1;
        if (oVar != null) {
            j = oVar.mo6697c0();
        } else {
            j = 5000;
        }
        int i = (int) (j / 1000);
        TextView textView = this.f5857y;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        View view = this.f5848s;
        if (view != null) {
            view.setContentDescription(this.f5818V1.getQuantityString(m45.exo_controls_rewind_by_amount_description, i, new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: D0 */
    public final void mo8198D0() {
        this.f5819W1.measure(0, 0);
        this.f5822Z1.setWidth(Math.min(this.f5819W1.getMeasuredWidth(), getWidth() - (this.f5826b2 * 2)));
        this.f5822Z1.setHeight(Math.min(getHeight() - (this.f5826b2 * 2), this.f5819W1.getMeasuredHeight()));
    }

    /* renamed from: E0 */
    public final void mo8199E0() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (mo8220h0() && this.f5800I1 && (imageView = this.f5789B) != null) {
            C0821o oVar = this.f5794E1;
            if (!this.f5817U1.mo11079A(imageView)) {
                mo8252t0(false, this.f5789B);
            } else if (oVar == null) {
                mo8252t0(false, this.f5789B);
                this.f5789B.setImageDrawable(this.f5847r1);
                this.f5789B.setContentDescription(this.f5853v1);
            } else {
                mo8252t0(true, this.f5789B);
                ImageView imageView2 = this.f5789B;
                if (oVar.mo6692W()) {
                    drawable = this.f5845q1;
                } else {
                    drawable = this.f5847r1;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f5789B;
                if (oVar.mo6692W()) {
                    str = this.f5851u1;
                } else {
                    str = this.f5853v1;
                }
                imageView3.setContentDescription(str);
            }
        }
    }

    /* renamed from: F0 */
    public final void mo8200F0() {
        boolean z;
        int i;
        int i2;
        int i3;
        C0831s.C0835d dVar;
        int i4;
        C0821o oVar = this.f5794E1;
        if (oVar != null) {
            boolean z2 = true;
            if (!this.f5801J1 || !m7861T(oVar.mo6712x(), this.f5816U)) {
                z = false;
            } else {
                z = true;
            }
            this.f5802K1 = z;
            long j = 0;
            this.f5815T1 = 0;
            C0831s x = oVar.mo6712x();
            if (!x.mo6883u()) {
                int R = oVar.mo6687R();
                boolean z3 = this.f5802K1;
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
                        this.f5815T1 = w67.m29335U0(j2);
                    }
                    x.mo6880r(i2, this.f5816U);
                    C0831s.C0835d dVar2 = this.f5816U;
                    if (dVar2.f4455I == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                        C2725kr.m20987g(this.f5802K1 ^ z2);
                        break;
                    }
                    int i5 = dVar2.f4456L;
                    while (true) {
                        dVar = this.f5816U;
                        if (i5 > dVar.f4457M) {
                            break;
                        }
                        x.mo6872j(i5, this.f5811Q);
                        int f = this.f5811Q.mo6889f();
                        for (int r = this.f5811Q.mo6902r(); r < f; r++) {
                            long i6 = this.f5811Q.mo6893i(r);
                            if (i6 == Long.MIN_VALUE) {
                                long j3 = this.f5811Q.f4439g;
                                if (j3 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                                } else {
                                    i6 = j3;
                                }
                            }
                            long q = i6 + this.f5811Q.mo6901q();
                            if (q >= 0) {
                                long[] jArr = this.f5810P1;
                                if (i == jArr.length) {
                                    if (jArr.length == 0) {
                                        i4 = 1;
                                    } else {
                                        i4 = jArr.length * 2;
                                    }
                                    this.f5810P1 = Arrays.copyOf(jArr, i4);
                                    this.f5812Q1 = Arrays.copyOf(this.f5812Q1, i4);
                                }
                                this.f5810P1[i] = w67.m29335U0(j2 + q);
                                this.f5812Q1[i] = this.f5811Q.mo6903s(r);
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
            TextView textView = this.f5797H;
            if (textView != null) {
                textView.setText(w67.m29349d0(this.f5805M, this.f5809P, U0));
            }
            C1103b bVar = this.f5803L;
            if (bVar != null) {
                bVar.setDuration(U0);
                int length = this.f5813R1.length;
                int i7 = i + length;
                long[] jArr2 = this.f5810P1;
                if (i7 > jArr2.length) {
                    this.f5810P1 = Arrays.copyOf(jArr2, i7);
                    this.f5812Q1 = Arrays.copyOf(this.f5812Q1, i7);
                }
                System.arraycopy(this.f5813R1, 0, this.f5810P1, i, length);
                System.arraycopy(this.f5814S1, 0, this.f5812Q1, i, length);
                this.f5803L.setAdGroupTimesMs(this.f5810P1, this.f5812Q1, i7);
            }
            mo8195A0();
        }
    }

    /* renamed from: G0 */
    public final void mo8201G0() {
        boolean z;
        mo8211d0();
        if (this.f5827c2.getItemCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        mo8252t0(z, this.f5834f2);
    }

    @Deprecated
    /* renamed from: S */
    public void mo8202S(C1087m mVar) {
        C2725kr.m20985e(mVar);
        this.f5828d.add(mVar);
    }

    /* renamed from: U */
    public boolean mo8203U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0821o oVar = this.f5794E1;
        if (oVar == null || !m7871g0(keyCode)) {
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
                mo8206X(oVar);
                return true;
            } else if (keyCode == 87) {
                oVar.mo6595A();
                return true;
            } else if (keyCode == 88) {
                oVar.mo6610k();
                return true;
            } else if (keyCode == 126) {
                mo8205W(oVar);
                return true;
            } else if (keyCode != 127) {
                return true;
            } else {
                mo8204V(oVar);
                return true;
            }
        }
    }

    /* renamed from: V */
    public final void mo8204V(C0821o oVar) {
        oVar.mo6601c();
    }

    /* renamed from: W */
    public final void mo8205W(C0821o oVar) {
        int P = oVar.mo6686P();
        if (P == 1) {
            oVar.mo6699e();
        } else if (P == 4) {
            mo8227o0(oVar, oVar.mo6687R(), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        }
        oVar.mo6604f();
    }

    /* renamed from: X */
    public final void mo8206X(C0821o oVar) {
        int P = oVar.mo6686P();
        if (P == 1 || P == 4 || !oVar.mo6678E()) {
            mo8205W(oVar);
        } else {
            mo8204V(oVar);
        }
    }

    /* renamed from: Y */
    public final void mo8207Y(RecyclerView.Adapter<?> adapter) {
        this.f5819W1.setAdapter(adapter);
        mo8198D0();
        this.f5824a2 = false;
        this.f5822Z1.dismiss();
        this.f5824a2 = true;
        this.f5822Z1.showAsDropDown(this, (getWidth() - this.f5822Z1.getWidth()) - this.f5826b2, (-this.f5822Z1.getHeight()) - this.f5826b2);
    }

    /* renamed from: Z */
    public final ImmutableList<C1085k> mo8208Z(C0842w wVar, int i) {
        ImmutableList.C4534a aVar = new ImmutableList.C4534a();
        ImmutableList<C0842w.C0843a> b = wVar.mo6947b();
        for (int i2 = 0; i2 < b.size(); i2++) {
            C0842w.C0843a aVar2 = b.get(i2);
            if (aVar2.mo6954d() == i) {
                for (int i3 = 0; i3 < aVar2.f4549a; i3++) {
                    if (aVar2.mo6959h(i3)) {
                        C0792h c = aVar2.mo6953c(i3);
                        if ((c.f4192g & 2) == 0) {
                            aVar.mo34667a(new C1085k(wVar, i2, i3, this.f5833e2.mo18635a(c)));
                        }
                    }
                }
            }
        }
        return aVar.mo34692l();
    }

    /* renamed from: b0 */
    public void mo8209b0() {
        this.f5817U1.mo11080C();
    }

    /* renamed from: c0 */
    public void mo8210c0() {
        this.f5817U1.mo11083F();
    }

    /* renamed from: d0 */
    public final void mo8211d0() {
        this.f5827c2.mo8280b();
        this.f5829d2.mo8280b();
        C0821o oVar = this.f5794E1;
        if (oVar != null && oVar.mo6618t(30) && this.f5794E1.mo6618t(29)) {
            C0842w o = this.f5794E1.mo6706o();
            this.f5829d2.mo8261j(mo8208Z(o, 1));
            if (this.f5817U1.mo11079A(this.f5834f2)) {
                this.f5827c2.mo8278i(mo8208Z(o, 3));
            } else {
                this.f5827c2.mo8278i(ImmutableList.m36627of());
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (mo8203U(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public boolean mo8213f0() {
        return this.f5817U1.mo11086I();
    }

    public C0821o getPlayer() {
        return this.f5794E1;
    }

    public int getRepeatToggleModes() {
        return this.f5808O1;
    }

    public boolean getShowShuffleButton() {
        return this.f5817U1.mo11079A(this.f5789B);
    }

    public boolean getShowSubtitleButton() {
        return this.f5817U1.mo11079A(this.f5834f2);
    }

    public int getShowTimeoutMs() {
        return this.f5806M1;
    }

    public boolean getShowVrButton() {
        return this.f5817U1.mo11079A(this.f5791C);
    }

    /* renamed from: h0 */
    public boolean mo8220h0() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public void mo8221i0() {
        Iterator<C1087m> it = this.f5828d.iterator();
        while (it.hasNext()) {
            it.next().mo8282p(getVisibility());
        }
    }

    /* renamed from: j0 */
    public final void mo8222j0(View view) {
        if (this.f5796G1 != null) {
            boolean z = !this.f5798H1;
            this.f5798H1 = z;
            mo8254v0(this.f5836g2, z);
            mo8254v0(this.f5837h2, this.f5798H1);
            C1078d dVar = this.f5796G1;
            if (dVar != null) {
                dVar.mo8264I(this.f5798H1);
            }
        }
    }

    /* renamed from: k0 */
    public final void mo8223k0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.f5822Z1.isShowing()) {
            mo8198D0();
            this.f5822Z1.update(view, (getWidth() - this.f5822Z1.getWidth()) - this.f5826b2, (-this.f5822Z1.getHeight()) - this.f5826b2, -1, -1);
        }
    }

    /* renamed from: l0 */
    public final void mo8224l0(int i) {
        if (i == 0) {
            mo8207Y(this.f5821Y1);
        } else if (i == 1) {
            mo8207Y(this.f5829d2);
        } else {
            this.f5822Z1.dismiss();
        }
    }

    @Deprecated
    /* renamed from: m0 */
    public void mo8225m0(C1087m mVar) {
        this.f5828d.remove(mVar);
    }

    /* renamed from: n0 */
    public void mo8226n0() {
        View view = this.f5840k;
        if (view != null) {
            view.requestFocus();
        }
    }

    /* renamed from: o0 */
    public final void mo8227o0(C0821o oVar, int i, long j) {
        oVar.mo6677C(i, j);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5817U1.mo11087O();
        this.f5800I1 = true;
        if (mo8213f0()) {
            this.f5817U1.mo11095W();
        }
        mo8234s0();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5817U1.mo11088P();
        this.f5800I1 = false;
        removeCallbacks(this.f5831e0);
        this.f5817U1.mo11094V();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f5817U1.mo11089Q(z, i, i2, i3, i4);
    }

    /* renamed from: p0 */
    public final void mo8231p0(C0821o oVar, long j) {
        int i;
        C0831s x = oVar.mo6712x();
        if (this.f5802K1 && !x.mo6883u()) {
            int t = x.mo6882t();
            i = 0;
            while (true) {
                long g = x.mo6880r(i, this.f5816U).mo6911g();
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
        mo8227o0(oVar, i, j);
        mo8195A0();
    }

    /* renamed from: q0 */
    public final boolean mo8232q0() {
        C0821o oVar = this.f5794E1;
        if (oVar == null || oVar.mo6686P() == 4 || this.f5794E1.mo6686P() == 1 || !this.f5794E1.mo6678E()) {
            return false;
        }
        return true;
    }

    /* renamed from: r0 */
    public void mo8233r0() {
        this.f5817U1.mo11100b0();
    }

    /* renamed from: s0 */
    public void mo8234s0() {
        mo8256y0();
        mo8255x0();
        mo8196B0();
        mo8199E0();
        mo8201G0();
        mo8257z0();
        mo8200F0();
    }

    public void setAnimationEnabled(boolean z) {
        this.f5817U1.mo11096X(z);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        boolean z = false;
        if (jArr == null) {
            this.f5813R1 = new long[0];
            this.f5814S1 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) C2725kr.m20985e(zArr);
            if (jArr.length == zArr2.length) {
                z = true;
            }
            C2725kr.m20981a(z);
            this.f5813R1 = jArr;
            this.f5814S1 = zArr2;
        }
        mo8200F0();
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(C1078d dVar) {
        boolean z;
        this.f5796G1 = dVar;
        ImageView imageView = this.f5836g2;
        boolean z2 = true;
        if (dVar != null) {
            z = true;
        } else {
            z = false;
        }
        m7888w0(imageView, z);
        ImageView imageView2 = this.f5837h2;
        if (dVar == null) {
            z2 = false;
        }
        m7888w0(imageView2, z2);
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
        C0821o oVar2 = this.f5794E1;
        if (oVar2 != oVar) {
            if (oVar2 != null) {
                oVar2.mo6708r(this.f5823a);
            }
            this.f5794E1 = oVar;
            if (oVar != null) {
                oVar.mo6710v(this.f5823a);
            }
            if (oVar instanceof C0795i) {
                ((C0795i) oVar).mo6700e0();
            }
            mo8234s0();
        }
    }

    public void setProgressUpdateListener(C1080f fVar) {
        this.f5795F1 = fVar;
    }

    public void setRepeatToggleModes(int i) {
        this.f5808O1 = i;
        C0821o oVar = this.f5794E1;
        boolean z = false;
        if (oVar != null) {
            int V = oVar.mo6691V();
            if (i == 0 && V != 0) {
                this.f5794E1.mo6688S(0);
            } else if (i == 1 && V == 2) {
                this.f5794E1.mo6688S(1);
            } else if (i == 2 && V == 1) {
                this.f5794E1.mo6688S(2);
            }
        }
        ar4 ar4 = this.f5817U1;
        ImageView imageView = this.f5787A;
        if (i != 0) {
            z = true;
        }
        ar4.mo11097Y(imageView, z);
        mo8196B0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f5817U1.mo11097Y(this.f5846r, z);
        mo8255x0();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f5801J1 = z;
        mo8200F0();
    }

    public void setShowNextButton(boolean z) {
        this.f5817U1.mo11097Y(this.f5835g, z);
        mo8255x0();
    }

    public void setShowPreviousButton(boolean z) {
        this.f5817U1.mo11097Y(this.f5830e, z);
        mo8255x0();
    }

    public void setShowRewindButton(boolean z) {
        this.f5817U1.mo11097Y(this.f5848s, z);
        mo8255x0();
    }

    public void setShowShuffleButton(boolean z) {
        this.f5817U1.mo11097Y(this.f5789B, z);
        mo8199E0();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f5817U1.mo11097Y(this.f5834f2, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f5806M1 = i;
        if (mo8213f0()) {
            this.f5817U1.mo11095W();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f5817U1.mo11097Y(this.f5791C, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f5807N1 = w67.m29374q(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z;
        View view = this.f5791C;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            mo8252t0(z, this.f5791C);
        }
    }

    /* renamed from: t0 */
    public final void mo8252t0(boolean z, View view) {
        float f;
        if (view != null) {
            view.setEnabled(z);
            if (z) {
                f = this.f5849s1;
            } else {
                f = this.f5850t1;
            }
            view.setAlpha(f);
        }
    }

    /* renamed from: u0 */
    public final void mo8253u0() {
        long j;
        C0821o oVar = this.f5794E1;
        if (oVar != null) {
            j = oVar.mo6684M();
        } else {
            j = yt6.DEFAULT_POLLING_FREQUENCY;
        }
        int i = (int) (j / 1000);
        TextView textView = this.f5855x;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        View view = this.f5846r;
        if (view != null) {
            view.setContentDescription(this.f5818V1.getQuantityString(m45.exo_controls_fastforward_by_amount_description, i, new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: v0 */
    public final void mo8254v0(ImageView imageView, boolean z) {
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(this.f5788A1);
                imageView.setContentDescription(this.f5792C1);
                return;
            }
            imageView.setImageDrawable(this.f5790B1);
            imageView.setContentDescription(this.f5793D1);
        }
    }

    /* renamed from: x0 */
    public final void mo8255x0() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (mo8220h0() && this.f5800I1) {
            C0821o oVar = this.f5794E1;
            boolean z5 = false;
            if (oVar != null) {
                boolean t = oVar.mo6618t(5);
                z3 = oVar.mo6618t(7);
                boolean t2 = oVar.mo6618t(11);
                z = oVar.mo6618t(12);
                z4 = oVar.mo6618t(9);
                boolean z6 = t2;
                z2 = t;
                z5 = z6;
            } else {
                z4 = false;
                z3 = false;
                z2 = false;
                z = false;
            }
            if (z5) {
                mo8197C0();
            }
            if (z) {
                mo8253u0();
            }
            mo8252t0(z3, this.f5830e);
            mo8252t0(z5, this.f5848s);
            mo8252t0(z, this.f5846r);
            mo8252t0(z4, this.f5835g);
            C1103b bVar = this.f5803L;
            if (bVar != null) {
                bVar.setEnabled(z2);
            }
        }
    }

    /* renamed from: y0 */
    public final void mo8256y0() {
        if (mo8220h0() && this.f5800I1 && this.f5840k != null) {
            if (mo8232q0()) {
                ((ImageView) this.f5840k).setImageDrawable(this.f5818V1.getDrawable(q25.exo_styled_controls_pause));
                this.f5840k.setContentDescription(this.f5818V1.getString(t45.exo_controls_pause_description));
                return;
            }
            ((ImageView) this.f5840k).setImageDrawable(this.f5818V1.getDrawable(q25.exo_styled_controls_play));
            this.f5840k.setContentDescription(this.f5818V1.getString(t45.exo_controls_play_description));
        }
    }

    /* renamed from: z0 */
    public final void mo8257z0() {
        C0821o oVar = this.f5794E1;
        if (oVar != null) {
            this.f5821Y1.mo8268f(oVar.mo6698d().f4406a);
            this.f5820X1.mo8275c(0, this.f5821Y1.mo8265b());
        }
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.view.ViewGroup, androidx.media3.ui.PlayerControlView$a] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C1077c cVar;
        ? r9;
        boolean z10;
        boolean z11;
        AttributeSet attributeSet3 = attributeSet2;
        int i2 = b45.exo_player_control_view;
        this.f5806M1 = 5000;
        this.f5808O1 = 0;
        this.f5807N1 = MlKitException.CODE_SCANNER_UNAVAILABLE;
        if (attributeSet3 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, h65.PlayerControlView, i, 0);
            try {
                i2 = obtainStyledAttributes.getResourceId(h65.PlayerControlView_controller_layout_id, i2);
                this.f5806M1 = obtainStyledAttributes.getInt(h65.PlayerControlView_show_timeout, this.f5806M1);
                this.f5808O1 = m7863a0(obtainStyledAttributes, this.f5808O1);
                boolean z12 = obtainStyledAttributes.getBoolean(h65.PlayerControlView_show_rewind_button, true);
                boolean z13 = obtainStyledAttributes.getBoolean(h65.PlayerControlView_show_fastforward_button, true);
                boolean z14 = obtainStyledAttributes.getBoolean(h65.PlayerControlView_show_previous_button, true);
                boolean z15 = obtainStyledAttributes.getBoolean(h65.PlayerControlView_show_next_button, true);
                boolean z16 = obtainStyledAttributes.getBoolean(h65.PlayerControlView_show_shuffle_button, false);
                boolean z17 = obtainStyledAttributes.getBoolean(h65.PlayerControlView_show_subtitle_button, false);
                boolean z18 = obtainStyledAttributes.getBoolean(h65.PlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(h65.PlayerControlView_time_bar_min_update_interval, this.f5807N1));
                boolean z19 = obtainStyledAttributes.getBoolean(h65.PlayerControlView_animation_enabled, true);
                obtainStyledAttributes.recycle();
                z2 = z16;
                z = z17;
                z6 = z12;
                z5 = z13;
                boolean z20 = z18;
                z4 = z14;
                z8 = z19;
                z3 = z15;
                z7 = z20;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z7 = false;
            z2 = false;
            z = false;
            z8 = true;
            z6 = true;
            z5 = true;
            z4 = true;
            z3 = true;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        C1077c cVar2 = new C1077c();
        this.f5823a = cVar2;
        this.f5828d = new CopyOnWriteArrayList<>();
        this.f5811Q = new C0831s.C0833b();
        this.f5816U = new C0831s.C0835d();
        StringBuilder sb = new StringBuilder();
        this.f5805M = sb;
        this.f5809P = new Formatter(sb, Locale.getDefault());
        this.f5810P1 = new long[0];
        this.f5812Q1 = new boolean[0];
        this.f5813R1 = new long[0];
        this.f5814S1 = new boolean[0];
        this.f5831e0 = new fq4(this);
        this.f5797H = (TextView) findViewById(z25.exo_duration);
        this.f5799I = (TextView) findViewById(z25.exo_position);
        ImageView imageView = (ImageView) findViewById(z25.exo_subtitle);
        this.f5834f2 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar2);
        }
        ImageView imageView2 = (ImageView) findViewById(z25.exo_fullscreen);
        this.f5836g2 = imageView2;
        m7868e0(imageView2, new gq4(this));
        ImageView imageView3 = (ImageView) findViewById(z25.exo_minimal_fullscreen);
        this.f5837h2 = imageView3;
        m7868e0(imageView3, new gq4(this));
        View findViewById = findViewById(z25.exo_settings);
        this.f5838i2 = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(cVar2);
        }
        View findViewById2 = findViewById(z25.exo_playback_speed);
        this.f5839j2 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar2);
        }
        View findViewById3 = findViewById(z25.exo_audio_track);
        this.f5842k2 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar2);
        }
        int i3 = z25.exo_progress;
        C1103b bVar = (C1103b) findViewById(i3);
        View findViewById4 = findViewById(z25.exo_progress_placeholder);
        if (bVar != null) {
            this.f5803L = bVar;
            cVar = cVar2;
            z9 = z8;
            z10 = z7;
            r9 = 0;
        } else if (findViewById4 != null) {
            DefaultTimeBar defaultTimeBar = r2;
            View view = findViewById4;
            r9 = 0;
            cVar = cVar2;
            z9 = z8;
            z10 = z7;
            DefaultTimeBar defaultTimeBar2 = new DefaultTimeBar(context, (AttributeSet) null, 0, attributeSet2, d55.ExoStyledControls_TimeBar);
            defaultTimeBar2.setId(i3);
            defaultTimeBar2.setLayoutParams(view.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            View view2 = view;
            int indexOfChild = viewGroup.indexOfChild(view2);
            viewGroup.removeView(view2);
            viewGroup.addView(defaultTimeBar2, indexOfChild);
            this.f5803L = defaultTimeBar2;
        } else {
            cVar = cVar2;
            z9 = z8;
            z10 = z7;
            r9 = 0;
            this.f5803L = null;
        }
        C1103b bVar2 = this.f5803L;
        C1077c cVar3 = cVar;
        if (bVar2 != null) {
            bVar2.mo8102a(cVar3);
        }
        View findViewById5 = findViewById(z25.exo_play_pause);
        this.f5840k = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(cVar3);
        }
        View findViewById6 = findViewById(z25.exo_prev);
        this.f5830e = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(cVar3);
        }
        View findViewById7 = findViewById(z25.exo_next);
        this.f5835g = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(cVar3);
        }
        Typeface h = uf5.m28225h(context, y25.roboto_medium_numbers);
        View findViewById8 = findViewById(z25.exo_rew);
        TextView textView = findViewById8 == null ? (TextView) findViewById(z25.exo_rew_with_amount) : r9;
        this.f5857y = textView;
        if (textView != null) {
            textView.setTypeface(h);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.f5848s = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(cVar3);
        }
        View findViewById9 = findViewById(z25.exo_ffwd);
        TextView textView2 = findViewById9 == null ? (TextView) findViewById(z25.exo_ffwd_with_amount) : r9;
        this.f5855x = textView2;
        if (textView2 != null) {
            textView2.setTypeface(h);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.f5846r = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(cVar3);
        }
        ImageView imageView4 = (ImageView) findViewById(z25.exo_repeat_toggle);
        this.f5787A = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar3);
        }
        ImageView imageView5 = (ImageView) findViewById(z25.exo_shuffle);
        this.f5789B = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar3);
        }
        Resources resources = context.getResources();
        this.f5818V1 = resources;
        this.f5849s1 = ((float) resources.getInteger(z35.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.f5850t1 = ((float) this.f5818V1.getInteger(z35.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        View findViewById10 = findViewById(z25.exo_vr);
        this.f5791C = findViewById10;
        if (findViewById10 != null) {
            mo8252t0(false, findViewById10);
        }
        ar4 ar4 = new ar4(this);
        this.f5817U1 = ar4;
        ar4.mo11096X(z9);
        this.f5820X1 = new C1082h(new String[]{this.f5818V1.getString(t45.exo_controls_playback_speed), this.f5818V1.getString(t45.exo_track_selection_title_audio)}, new Drawable[]{this.f5818V1.getDrawable(q25.exo_styled_controls_speed), this.f5818V1.getDrawable(q25.exo_styled_controls_audiotrack)});
        this.f5826b2 = this.f5818V1.getDimensionPixelSize(h25.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(b45.exo_styled_settings_list, r9);
        this.f5819W1 = recyclerView;
        recyclerView.setAdapter(this.f5820X1);
        this.f5819W1.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow(this.f5819W1, -2, -2, true);
        this.f5822Z1 = popupWindow;
        if (w67.f19021a < 23) {
            z11 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z11 = false;
        }
        this.f5822Z1.setOnDismissListener(cVar3);
        this.f5824a2 = true;
        this.f5833e2 = new da1(getResources());
        this.f5854w1 = this.f5818V1.getDrawable(q25.exo_styled_controls_subtitle_on);
        this.f5856x1 = this.f5818V1.getDrawable(q25.exo_styled_controls_subtitle_off);
        this.f5858y1 = this.f5818V1.getString(t45.exo_controls_cc_enabled_description);
        this.f5859z1 = this.f5818V1.getString(t45.exo_controls_cc_disabled_description);
        this.f5827c2 = new C1084j();
        this.f5829d2 = new C1076b();
        this.f5821Y1 = new C1079e(this.f5818V1.getStringArray(a15.exo_controls_playback_speeds), f5786l2);
        this.f5788A1 = this.f5818V1.getDrawable(q25.exo_styled_controls_fullscreen_exit);
        this.f5790B1 = this.f5818V1.getDrawable(q25.exo_styled_controls_fullscreen_enter);
        this.f5841k0 = this.f5818V1.getDrawable(q25.exo_styled_controls_repeat_off);
        this.f5852v0 = this.f5818V1.getDrawable(q25.exo_styled_controls_repeat_one);
        this.f5825b1 = this.f5818V1.getDrawable(q25.exo_styled_controls_repeat_all);
        this.f5845q1 = this.f5818V1.getDrawable(q25.exo_styled_controls_shuffle_on);
        this.f5847r1 = this.f5818V1.getDrawable(q25.exo_styled_controls_shuffle_off);
        this.f5792C1 = this.f5818V1.getString(t45.exo_controls_fullscreen_exit_description);
        this.f5793D1 = this.f5818V1.getString(t45.exo_controls_fullscreen_enter_description);
        this.f5832e1 = this.f5818V1.getString(t45.exo_controls_repeat_off_description);
        this.f5843o1 = this.f5818V1.getString(t45.exo_controls_repeat_one_description);
        this.f5844p1 = this.f5818V1.getString(t45.exo_controls_repeat_all_description);
        this.f5851u1 = this.f5818V1.getString(t45.exo_controls_shuffle_on_description);
        this.f5853v1 = this.f5818V1.getString(t45.exo_controls_shuffle_off_description);
        this.f5817U1.mo11097Y((ViewGroup) findViewById(z25.exo_bottom_bar), true);
        this.f5817U1.mo11097Y(this.f5846r, z5);
        this.f5817U1.mo11097Y(this.f5848s, z6);
        this.f5817U1.mo11097Y(this.f5830e, z4);
        this.f5817U1.mo11097Y(this.f5835g, z3);
        this.f5817U1.mo11097Y(this.f5789B, z2);
        this.f5817U1.mo11097Y(this.f5834f2, z);
        this.f5817U1.mo11097Y(this.f5791C, z10);
        this.f5817U1.mo11097Y(this.f5787A, this.f5808O1 != 0 ? true : z11);
        addOnLayoutChangeListener(new hq4(this));
    }
}
