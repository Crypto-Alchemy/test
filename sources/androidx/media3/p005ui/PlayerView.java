package androidx.media3.p005ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
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
import androidx.media3.p005ui.AspectRatioFrameLayout;
import androidx.media3.p005ui.PlayerControlView;
import com.github.mikephil.charting.utils.Utils;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: androidx.media3.ui.PlayerView */
public class PlayerView extends FrameLayout {

    /* renamed from: A */
    public final PlayerControlView f5882A;

    /* renamed from: B */
    public final FrameLayout f5883B;

    /* renamed from: C */
    public final FrameLayout f5884C;

    /* renamed from: H */
    public C0821o f5885H;

    /* renamed from: I */
    public boolean f5886I;

    /* renamed from: L */
    public C1089b f5887L;

    /* renamed from: M */
    public PlayerControlView.C1087m f5888M;

    /* renamed from: P */
    public C1090c f5889P;

    /* renamed from: Q */
    public boolean f5890Q;

    /* renamed from: U */
    public Drawable f5891U;

    /* renamed from: a */
    public final C1088a f5892a;

    /* renamed from: b1 */
    public CharSequence f5893b1;

    /* renamed from: d */
    public final AspectRatioFrameLayout f5894d;

    /* renamed from: e */
    public final View f5895e;

    /* renamed from: e0 */
    public int f5896e0;

    /* renamed from: e1 */
    public int f5897e1;

    /* renamed from: g */
    public final View f5898g;

    /* renamed from: k */
    public final boolean f5899k;

    /* renamed from: k0 */
    public boolean f5900k0;

    /* renamed from: o1 */
    public boolean f5901o1;

    /* renamed from: p1 */
    public boolean f5902p1;

    /* renamed from: q1 */
    public boolean f5903q1;

    /* renamed from: r */
    public final ImageView f5904r;

    /* renamed from: r1 */
    public int f5905r1;

    /* renamed from: s */
    public final SubtitleView f5906s;

    /* renamed from: v0 */
    public dr1<? super PlaybackException> f5907v0;

    /* renamed from: x */
    public final View f5908x;

    /* renamed from: y */
    public final TextView f5909y;

    /* renamed from: androidx.media3.ui.PlayerView$a */
    public final class C1088a implements C0821o.C0826d, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.C1087m, PlayerControlView.C1078d {

        /* renamed from: a */
        public final C0831s.C0833b f5910a = new C0831s.C0833b();

        /* renamed from: d */
        public Object f5911d;

        public C1088a() {
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
        public void mo8264I(boolean z) {
            if (PlayerView.this.f5889P != null) {
                PlayerView.this.f5889P.mo8354a(z);
            }
        }

        /* renamed from: J */
        public /* synthetic */ void mo6718J(int i, boolean z) {
            dq4.m15294e(this, i, z);
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
        public void mo6721P() {
            if (PlayerView.this.f5895e != null) {
                PlayerView.this.f5895e.setVisibility(4);
            }
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
        public /* synthetic */ void mo6730c0(C0821o oVar, C0821o.C0825c cVar) {
            dq4.m15295f(this, oVar, cVar);
        }

        /* renamed from: e0 */
        public /* synthetic */ void mo6731e0(C0831s sVar, int i) {
            dq4.m15286B(this, sVar, i);
        }

        /* renamed from: g */
        public void mo6733g(int i) {
            PlayerView.this.mo8293L0();
            PlayerView.this.mo8296O0();
            PlayerView.this.mo8295N0();
        }

        /* renamed from: g0 */
        public /* synthetic */ void mo6734g0(boolean z, int i) {
            dq4.m15308s(this, z, i);
        }

        /* renamed from: h */
        public void mo6735h(C0844x xVar) {
            PlayerView.this.mo8292K0();
        }

        /* renamed from: h0 */
        public void mo6736h0(C0842w wVar) {
            C0821o oVar = (C0821o) C2725kr.m20985e(PlayerView.this.f5885H);
            C0831s x = oVar.mo6712x();
            if (x.mo6883u()) {
                this.f5911d = null;
            } else if (!oVar.mo6706o().mo6948c()) {
                this.f5911d = x.mo6873k(oVar.mo6680H(), this.f5910a, true).f4437d;
            } else {
                Object obj = this.f5911d;
                if (obj != null) {
                    int f = x.mo6867f(obj);
                    if (f == -1 || oVar.mo6687R() != x.mo6872j(f, this.f5910a).f4438e) {
                        this.f5911d = null;
                    } else {
                        return;
                    }
                }
            }
            PlayerView.this.mo8297P0(false);
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
        public void mo6742o0(C0821o.C0827e eVar, C0821o.C0827e eVar2, int i) {
            if (PlayerView.this.mo8283A0() && PlayerView.this.f5902p1) {
                PlayerView.this.mo8349y0();
            }
        }

        public void onClick(View view) {
            PlayerView.this.mo8291J0();
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m8016s0((TextureView) view, PlayerView.this.f5905r1);
        }

        /* renamed from: p */
        public void mo8282p(int i) {
            PlayerView.this.mo8294M0();
            if (PlayerView.this.f5887L != null) {
                PlayerView.this.f5887L.mo8353a(i);
            }
        }

        /* renamed from: p0 */
        public /* synthetic */ void mo6743p0(boolean z) {
            dq4.m15297h(this, z);
        }

        /* renamed from: t */
        public void mo6744t(hx0 hx0) {
            if (PlayerView.this.f5906s != null) {
                PlayerView.this.f5906s.setCues(hx0.f13088a);
            }
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
        public void mo6747z(boolean z, int i) {
            PlayerView.this.mo8293L0();
            PlayerView.this.mo8295N0();
        }
    }

    /* renamed from: androidx.media3.ui.PlayerView$b */
    public interface C1089b {
        /* renamed from: a */
        void mo8353a(int i);
    }

    /* renamed from: androidx.media3.ui.PlayerView$c */
    public interface C1090c {
        /* renamed from: a */
        void mo8354a(boolean z);
    }

    public PlayerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: F0 */
    public static void m7999F0(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* renamed from: s0 */
    public static void m8016s0(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == Utils.FLOAT_EPSILON || height == Utils.FLOAT_EPSILON || i == 0)) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate((float) i, f, f2);
            RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: u0 */
    public static void m8017u0(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(q25.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(t15.exo_edit_mode_background_color));
    }

    /* renamed from: v0 */
    public static void m8018v0(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(q25.exo_edit_mode_logo, (Resources.Theme) null));
        imageView.setBackgroundColor(resources.getColor(t15.exo_edit_mode_background_color, (Resources.Theme) null));
    }

    /* renamed from: A0 */
    public final boolean mo8283A0() {
        C0821o oVar = this.f5885H;
        if (oVar == null || !oVar.mo6701g() || !this.f5885H.mo6678E()) {
            return false;
        }
        return true;
    }

    /* renamed from: B0 */
    public final void mo8284B0(boolean z) {
        boolean z2;
        if ((!mo8283A0() || !this.f5902p1) && mo8299R0()) {
            if (!this.f5882A.mo8213f0() || this.f5882A.getShowTimeoutMs() > 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean G0 = mo8288G0();
            if (z || z2 || G0) {
                mo8290I0(G0);
            }
        }
    }

    /* renamed from: C0 */
    public void mo8285C0(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    @RequiresNonNull({"artworkView"})
    /* renamed from: D0 */
    public final boolean mo8286D0(C0816l lVar) {
        byte[] bArr = lVar.f4339A;
        if (bArr == null) {
            return false;
        }
        return mo8287E0(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    @RequiresNonNull({"artworkView"})
    /* renamed from: E0 */
    public final boolean mo8287E0(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                mo8285C0(this.f5894d, ((float) intrinsicWidth) / ((float) intrinsicHeight));
                this.f5904r.setImageDrawable(drawable);
                this.f5904r.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: G0 */
    public final boolean mo8288G0() {
        C0821o oVar = this.f5885H;
        if (oVar == null) {
            return true;
        }
        int P = oVar.mo6686P();
        if (!this.f5901o1 || this.f5885H.mo6712x().mo6883u() || (P != 1 && P != 4 && ((C0821o) C2725kr.m20985e(this.f5885H)).mo6678E())) {
            return false;
        }
        return true;
    }

    /* renamed from: H0 */
    public void mo8289H0() {
        mo8290I0(mo8288G0());
    }

    /* renamed from: I0 */
    public final void mo8290I0(boolean z) {
        int i;
        if (mo8299R0()) {
            PlayerControlView playerControlView = this.f5882A;
            if (z) {
                i = 0;
            } else {
                i = this.f5897e1;
            }
            playerControlView.setShowTimeoutMs(i);
            this.f5882A.mo8233r0();
        }
    }

    /* renamed from: J0 */
    public final void mo8291J0() {
        if (mo8299R0() && this.f5885H != null) {
            if (!this.f5882A.mo8213f0()) {
                mo8284B0(true);
            } else if (this.f5903q1) {
                this.f5882A.mo8209b0();
            }
        }
    }

    /* renamed from: K0 */
    public final void mo8292K0() {
        C0844x xVar;
        float f;
        C0821o oVar = this.f5885H;
        if (oVar != null) {
            xVar = oVar.mo6682J();
        } else {
            xVar = C0844x.f4554k;
        }
        int i = xVar.f4556a;
        int i2 = xVar.f4557d;
        int i3 = xVar.f4558e;
        float f2 = Utils.FLOAT_EPSILON;
        if (i2 == 0 || i == 0) {
            f = 0.0f;
        } else {
            f = (((float) i) * xVar.f4559g) / ((float) i2);
        }
        View view = this.f5898g;
        if (view instanceof TextureView) {
            if (f > Utils.FLOAT_EPSILON && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.f5905r1 != 0) {
                view.removeOnLayoutChangeListener(this.f5892a);
            }
            this.f5905r1 = i3;
            if (i3 != 0) {
                this.f5898g.addOnLayoutChangeListener(this.f5892a);
            }
            m8016s0((TextureView) this.f5898g, this.f5905r1);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f5894d;
        if (!this.f5899k) {
            f2 = f;
        }
        mo8285C0(aspectRatioFrameLayout, f2);
    }

    /* renamed from: L0 */
    public final void mo8293L0() {
        int i;
        if (this.f5908x != null) {
            C0821o oVar = this.f5885H;
            boolean z = true;
            int i2 = 0;
            if (oVar == null || oVar.mo6686P() != 2 || ((i = this.f5896e0) != 2 && (i != 1 || !this.f5885H.mo6678E()))) {
                z = false;
            }
            View view = this.f5908x;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    /* renamed from: M0 */
    public final void mo8294M0() {
        PlayerControlView playerControlView = this.f5882A;
        String str = null;
        if (playerControlView == null || !this.f5886I) {
            setContentDescription((CharSequence) null);
        } else if (playerControlView.mo8213f0()) {
            if (this.f5903q1) {
                str = getResources().getString(t45.exo_controls_hide);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(t45.exo_controls_show));
        }
    }

    /* renamed from: N0 */
    public final void mo8295N0() {
        if (!mo8283A0() || !this.f5902p1) {
            mo8284B0(false);
        } else {
            mo8349y0();
        }
    }

    /* renamed from: O0 */
    public final void mo8296O0() {
        PlaybackException playbackException;
        dr1<? super PlaybackException> dr1;
        TextView textView = this.f5909y;
        if (textView != null) {
            CharSequence charSequence = this.f5893b1;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f5909y.setVisibility(0);
                return;
            }
            C0821o oVar = this.f5885H;
            if (oVar != null) {
                playbackException = oVar.mo6705l();
            } else {
                playbackException = null;
            }
            if (playbackException == null || (dr1 = this.f5907v0) == null) {
                this.f5909y.setVisibility(8);
                return;
            }
            this.f5909y.setText((CharSequence) dr1.mo18884a(playbackException).second);
            this.f5909y.setVisibility(0);
        }
    }

    /* renamed from: P0 */
    public final void mo8297P0(boolean z) {
        C0821o oVar = this.f5885H;
        if (oVar != null && !oVar.mo6706o().mo6948c()) {
            if (z && !this.f5900k0) {
                mo8346t0();
            }
            if (oVar.mo6706o().mo6949d(2)) {
                mo8348x0();
                return;
            }
            mo8346t0();
            if (!mo8298Q0() || (!mo8286D0(oVar.mo6694a0()) && !mo8287E0(this.f5891U))) {
                mo8348x0();
            }
        } else if (!this.f5900k0) {
            mo8348x0();
            mo8346t0();
        }
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    /* renamed from: Q0 */
    public final boolean mo8298Q0() {
        if (!this.f5890Q) {
            return false;
        }
        C2725kr.m20989i(this.f5904r);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* renamed from: R0 */
    public final boolean mo8299R0() {
        if (!this.f5886I) {
            return false;
        }
        C2725kr.m20989i(this.f5882A);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0821o oVar = this.f5885H;
        if (oVar != null && oVar.mo6701g()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean z0 = mo8350z0(keyEvent.getKeyCode());
        if (z0 && mo8299R0() && !this.f5882A.mo8213f0()) {
            mo8284B0(true);
        } else if (mo8347w0(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            mo8284B0(true);
        } else if (!z0 || !mo8299R0()) {
            return false;
        } else {
            mo8284B0(true);
            return false;
        }
        return true;
    }

    public List<C2460hb> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f5884C;
        if (frameLayout != null) {
            arrayList.add(new C2460hb(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f5882A;
        if (playerControlView != null) {
            arrayList.add(new C2460hb(playerControlView, 1));
        }
        return ImmutableList.copyOf(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C2725kr.m20990j(this.f5883B, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f5901o1;
    }

    public boolean getControllerHideOnTouch() {
        return this.f5903q1;
    }

    public int getControllerShowTimeoutMs() {
        return this.f5897e1;
    }

    public Drawable getDefaultArtwork() {
        return this.f5891U;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f5884C;
    }

    public C0821o getPlayer() {
        return this.f5885H;
    }

    public int getResizeMode() {
        C2725kr.m20989i(this.f5894d);
        return this.f5894d.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f5906s;
    }

    public boolean getUseArtwork() {
        return this.f5890Q;
    }

    public boolean getUseController() {
        return this.f5886I;
    }

    public View getVideoSurfaceView() {
        return this.f5898g;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!mo8299R0() || this.f5885H == null) {
            return false;
        }
        mo8284B0(true);
        return true;
    }

    public boolean performClick() {
        mo8291J0();
        return super.performClick();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.C1068b bVar) {
        C2725kr.m20989i(this.f5894d);
        this.f5894d.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.f5901o1 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f5902p1 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C2725kr.m20989i(this.f5882A);
        this.f5903q1 = z;
        mo8294M0();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(PlayerControlView.C1078d dVar) {
        C2725kr.m20989i(this.f5882A);
        this.f5889P = null;
        this.f5882A.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        C2725kr.m20989i(this.f5882A);
        this.f5897e1 = i;
        if (this.f5882A.mo8213f0()) {
            mo8289H0();
        }
    }

    public void setControllerVisibilityListener(C1089b bVar) {
        this.f5887L = bVar;
        setControllerVisibilityListener((PlayerControlView.C1087m) null);
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z;
        if (this.f5909y != null) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f5893b1 = charSequence;
        mo8296O0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f5891U != drawable) {
            this.f5891U = drawable;
            mo8297P0(false);
        }
    }

    public void setErrorMessageProvider(dr1<? super PlaybackException> dr1) {
        if (this.f5907v0 != dr1) {
            this.f5907v0 = dr1;
            mo8296O0();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        C2725kr.m20989i(this.f5882A);
        this.f5882A.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(C1090c cVar) {
        C2725kr.m20989i(this.f5882A);
        this.f5889P = cVar;
        this.f5882A.setOnFullScreenModeChangedListener(this.f5892a);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f5900k0 != z) {
            this.f5900k0 = z;
            mo8297P0(false);
        }
    }

    public void setPlayer(C0821o oVar) {
        boolean z;
        boolean z2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        if (oVar == null || oVar.mo6713y() == Looper.getMainLooper()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2725kr.m20981a(z2);
        C0821o oVar2 = this.f5885H;
        if (oVar2 != oVar) {
            if (oVar2 != null) {
                oVar2.mo6708r(this.f5892a);
                View view = this.f5898g;
                if (view instanceof TextureView) {
                    oVar2.mo6681I((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    oVar2.mo6690U((SurfaceView) view);
                }
            }
            SubtitleView subtitleView = this.f5906s;
            if (subtitleView != null) {
                subtitleView.setCues((List<dx0>) null);
            }
            this.f5885H = oVar;
            if (mo8299R0()) {
                this.f5882A.setPlayer(oVar);
            }
            mo8293L0();
            mo8296O0();
            mo8297P0(true);
            if (oVar != null) {
                if (oVar.mo6618t(27)) {
                    View view2 = this.f5898g;
                    if (view2 instanceof TextureView) {
                        oVar.mo6676B((TextureView) view2);
                    } else if (view2 instanceof SurfaceView) {
                        oVar.mo6704j((SurfaceView) view2);
                    }
                    mo8292K0();
                }
                if (this.f5906s != null && oVar.mo6618t(28)) {
                    this.f5906s.setCues(oVar.mo6707q().f13088a);
                }
                oVar.mo6710v(this.f5892a);
                mo8284B0(false);
                return;
            }
            mo8349y0();
        }
    }

    public void setRepeatToggleModes(int i) {
        C2725kr.m20989i(this.f5882A);
        this.f5882A.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        C2725kr.m20989i(this.f5894d);
        this.f5894d.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f5896e0 != i) {
            this.f5896e0 = i;
            mo8293L0();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C2725kr.m20989i(this.f5882A);
        this.f5882A.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C2725kr.m20989i(this.f5882A);
        this.f5882A.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C2725kr.m20989i(this.f5882A);
        this.f5882A.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        C2725kr.m20989i(this.f5882A);
        this.f5882A.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C2725kr.m20989i(this.f5882A);
        this.f5882A.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C2725kr.m20989i(this.f5882A);
        this.f5882A.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        C2725kr.m20989i(this.f5882A);
        this.f5882A.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        C2725kr.m20989i(this.f5882A);
        this.f5882A.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f5895e;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        boolean z2;
        if (!z || this.f5904r != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2725kr.m20987g(z2);
        if (this.f5890Q != z) {
            this.f5890Q = z;
            mo8297P0(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (!z || this.f5882A != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2725kr.m20987g(z2);
        if (z || hasOnClickListeners()) {
            z3 = true;
        }
        setClickable(z3);
        if (this.f5886I != z) {
            this.f5886I = z;
            if (mo8299R0()) {
                this.f5882A.setPlayer(this.f5885H);
            } else {
                PlayerControlView playerControlView = this.f5882A;
                if (playerControlView != null) {
                    playerControlView.mo8209b0();
                    this.f5882A.setPlayer((C0821o) null);
                }
            }
            mo8294M0();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f5898g;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* renamed from: t0 */
    public final void mo8346t0() {
        View view = this.f5895e;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: w0 */
    public boolean mo8347w0(KeyEvent keyEvent) {
        if (!mo8299R0() || !this.f5882A.mo8203U(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: x0 */
    public final void mo8348x0() {
        ImageView imageView = this.f5904r;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f5904r.setVisibility(4);
        }
    }

    /* renamed from: y0 */
    public void mo8349y0() {
        PlayerControlView playerControlView = this.f5882A;
        if (playerControlView != null) {
            playerControlView.mo8209b0();
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: z0 */
    public final boolean mo8350z0(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        C1088a aVar = new C1088a();
        this.f5892a = aVar;
        if (isInEditMode()) {
            this.f5894d = null;
            this.f5895e = null;
            this.f5898g = null;
            this.f5899k = false;
            this.f5904r = null;
            this.f5906s = null;
            this.f5908x = null;
            this.f5909y = null;
            this.f5882A = null;
            this.f5883B = null;
            this.f5884C = null;
            ImageView imageView = new ImageView(context2);
            if (w67.f19021a >= 23) {
                m8018v0(getResources(), imageView);
            } else {
                m8017u0(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i7 = b45.exo_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, h65.PlayerView, i, 0);
            try {
                int i8 = h65.PlayerView_shutter_background_color;
                boolean hasValue = obtainStyledAttributes.hasValue(i8);
                int color = obtainStyledAttributes.getColor(i8, 0);
                int resourceId = obtainStyledAttributes.getResourceId(h65.PlayerView_player_layout_id, i7);
                boolean z11 = obtainStyledAttributes.getBoolean(h65.PlayerView_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(h65.PlayerView_default_artwork, 0);
                boolean z12 = obtainStyledAttributes.getBoolean(h65.PlayerView_use_controller, true);
                int i9 = obtainStyledAttributes.getInt(h65.PlayerView_surface_type, 1);
                int i10 = obtainStyledAttributes.getInt(h65.PlayerView_resize_mode, 0);
                int i11 = obtainStyledAttributes.getInt(h65.PlayerView_show_timeout, 5000);
                boolean z13 = obtainStyledAttributes.getBoolean(h65.PlayerView_hide_on_touch, true);
                int i12 = resourceId;
                boolean z14 = obtainStyledAttributes.getBoolean(h65.PlayerView_auto_show, true);
                i5 = obtainStyledAttributes.getInteger(h65.PlayerView_show_buffering, 0);
                int i13 = i10;
                this.f5900k0 = obtainStyledAttributes.getBoolean(h65.PlayerView_keep_content_on_player_reset, this.f5900k0);
                boolean z15 = obtainStyledAttributes.getBoolean(h65.PlayerView_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z5 = z13;
                z7 = z14;
                i6 = i13;
                z2 = z12;
                i2 = resourceId2;
                z3 = z11;
                z4 = hasValue;
                i3 = color;
                i4 = i9;
                boolean z16 = z15;
                i7 = i12;
                z = i11;
                z6 = z16;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = true;
            z7 = true;
            i6 = 0;
            z6 = true;
            i5 = 0;
            z5 = true;
            i4 = 1;
            i3 = 0;
            z4 = false;
            z3 = true;
            i2 = 0;
            z2 = true;
        }
        LayoutInflater.from(context).inflate(i7, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(z25.exo_content_frame);
        this.f5894d = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            m7999F0(aspectRatioFrameLayout, i6);
        }
        View findViewById = findViewById(z25.exo_shutter);
        this.f5895e = findViewById;
        if (findViewById != null && z4) {
            findViewById.setBackgroundColor(i3);
        }
        if (aspectRatioFrameLayout == null || i4 == 0) {
            this.f5898g = null;
            z8 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 == 2) {
                this.f5898g = new TextureView(context2);
            } else if (i4 == 3) {
                try {
                    this.f5898g = (View) Class.forName("androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context2});
                    z10 = true;
                    this.f5898g.setLayoutParams(layoutParams);
                    this.f5898g.setOnClickListener(aVar);
                    this.f5898g.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f5898g, 0);
                    z8 = z10;
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i4 != 4) {
                this.f5898g = new SurfaceView(context2);
            } else {
                try {
                    this.f5898g = (View) Class.forName("androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context2});
                } catch (Exception e2) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            }
            z10 = false;
            this.f5898g.setLayoutParams(layoutParams);
            this.f5898g.setOnClickListener(aVar);
            this.f5898g.setClickable(false);
            aspectRatioFrameLayout.addView(this.f5898g, 0);
            z8 = z10;
        }
        this.f5899k = z8;
        this.f5883B = (FrameLayout) findViewById(z25.exo_ad_overlay);
        this.f5884C = (FrameLayout) findViewById(z25.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(z25.exo_artwork);
        this.f5904r = imageView2;
        this.f5890Q = z3 && imageView2 != null;
        if (i2 != 0) {
            this.f5891U = zr0.m31442e(getContext(), i2);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(z25.exo_subtitles);
        this.f5906s = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View findViewById2 = findViewById(z25.exo_buffering);
        this.f5908x = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f5896e0 = i5;
        TextView textView = (TextView) findViewById(z25.exo_error_message);
        this.f5909y = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i14 = z25.exo_controller;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i14);
        View findViewById3 = findViewById(z25.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f5882A = playerControlView;
            z9 = false;
        } else if (findViewById3 != null) {
            z9 = false;
            PlayerControlView playerControlView2 = new PlayerControlView(context2, (AttributeSet) null, 0, attributeSet2);
            this.f5882A = playerControlView2;
            playerControlView2.setId(i14);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            z9 = false;
            this.f5882A = null;
        }
        PlayerControlView playerControlView3 = this.f5882A;
        this.f5897e1 = playerControlView3 != null ? z : z9 ? 1 : 0;
        this.f5903q1 = z5;
        this.f5901o1 = z7;
        this.f5902p1 = z6;
        this.f5886I = (!z2 || playerControlView3 == null) ? z9 : true;
        if (playerControlView3 != null) {
            playerControlView3.mo8210c0();
            this.f5882A.mo8202S(aVar);
        }
        if (z2) {
            setClickable(true);
        }
        mo8294M0();
    }

    @Deprecated
    public void setControllerVisibilityListener(PlayerControlView.C1087m mVar) {
        C2725kr.m20989i(this.f5882A);
        PlayerControlView.C1087m mVar2 = this.f5888M;
        if (mVar2 != mVar) {
            if (mVar2 != null) {
                this.f5882A.mo8225m0(mVar2);
            }
            this.f5888M = mVar;
            if (mVar != null) {
                this.f5882A.mo8202S(mVar);
            }
            setControllerVisibilityListener((C1089b) null);
        }
    }
}
