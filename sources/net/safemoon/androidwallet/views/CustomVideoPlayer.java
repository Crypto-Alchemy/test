package net.safemoon.androidwallet.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.common.C0788f;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0816l;
import androidx.media3.common.C0820n;
import androidx.media3.common.C0821o;
import androidx.media3.common.C0831s;
import androidx.media3.common.C0840v;
import androidx.media3.common.C0842w;
import androidx.media3.common.C0844x;
import androidx.media3.common.PlaybackException;
import androidx.media3.p005ui.PlayerControlView;
import androidx.media3.p005ui.PlayerView;
import java.util.List;
import kotlin.Metadata;
import p000.jv1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002EFB\u0011\b\u0016\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?B\u001b\b\u0016\u0012\u0006\u0010=\u001a\u00020<\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\b>\u0010BB#\b\u0016\u0012\u0006\u0010=\u001a\u00020<\u0012\b\u0010A\u001a\u0004\u0018\u00010@\u0012\u0006\u0010C\u001a\u00020\b¢\u0006\u0004\b>\u0010DJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\b\u0010\u001a\u001a\u00020\u0003H\u0002R.\u0010#\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010+\u001a\u0004\u0018\u00010$2\b\u0010\u001c\u001a\u0004\u0018\u00010$8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010\u0017\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006G"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/CustomVideoPlayer;", "Landroidx/media3/ui/PlayerView;", "Landroidx/media3/common/o$d;", "Lr37;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/View;", "changedView", "", "visibility", "onVisibilityChanged", "", "isVisible", "onVisibilityAggregated", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "playWhenReady", "reason", "z", "playbackState", "g", "Lnet/safemoon/androidwallet/views/CustomVideoPlayer$b;", "iPlayerListener", "setIPlayerListener", "S0", "T0", "", "value", "s1", "Ljava/lang/String;", "getPlayURL", "()Ljava/lang/String;", "setPlayURL", "(Ljava/lang/String;)V", "playURL", "Landroidx/media3/ui/PlayerControlView;", "t1", "Landroidx/media3/ui/PlayerControlView;", "getVideoController", "()Landroidx/media3/ui/PlayerControlView;", "setVideoController", "(Landroidx/media3/ui/PlayerControlView;)V", "videoController", "Lnet/safemoon/androidwallet/views/CustomVideoPlayer$a;", "u1", "Lnet/safemoon/androidwallet/views/CustomVideoPlayer$a;", "v1", "Z", "w1", "I", "currentItem", "", "x1", "J", "playbackPosition", "Ljv1;", "y1", "Ljv1;", "player", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CustomVideoPlayer.kt */
public final class CustomVideoPlayer extends PlayerView implements C0821o.C0826d {

    /* renamed from: s1 */
    public String f43244s1;

    /* renamed from: t1 */
    public PlayerControlView f43245t1;

    /* renamed from: u1 */
    public C8942a f43246u1;

    /* renamed from: v1 */
    public boolean f43247v1;

    /* renamed from: w1 */
    public int f43248w1;

    /* renamed from: x1 */
    public long f43249x1;

    /* renamed from: y1 */
    public jv1 f43250y1;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/CustomVideoPlayer$a;", "", "", "playWhenReady", "", "reason", "Lr37;", "z", "playbackState", "g", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.CustomVideoPlayer$a */
    /* compiled from: CustomVideoPlayer.kt */
    public interface C8942a {
        /* renamed from: g */
        void mo58004g(int i);

        /* renamed from: z */
        void mo62127z(boolean z, int i);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/CustomVideoPlayer$b;", "Lnet/safemoon/androidwallet/views/CustomVideoPlayer$a;", "", "playWhenReady", "", "reason", "Lr37;", "z", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.CustomVideoPlayer$b */
    /* compiled from: CustomVideoPlayer.kt */
    public static abstract class C8943b implements C8942a {
        /* renamed from: z */
        public void mo62127z(boolean z, int i) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomVideoPlayer(Context context) {
        this(context, (AttributeSet) null);
        vx2.m53591g(context, "context");
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
    public /* synthetic */ void mo6721P() {
        dq4.m15311v(this);
    }

    /* renamed from: Q */
    public /* synthetic */ void mo6722Q(C0798k kVar, int i) {
        dq4.m15299j(this, kVar, i);
    }

    /* renamed from: S0 */
    public final void mo62115S0() {
        if (this.f43244s1 != null && this.f43250y1 == null) {
            jv1 e = new jv1.C2635b(getContext()).mo22089e();
            try {
                setPlayer(e);
                PlayerControlView playerControlView = this.f43245t1;
                if (playerControlView != null) {
                    playerControlView.setPlayer(e);
                }
                String str = this.f43244s1;
                vx2.m53588d(str);
                C0798k d = C0798k.m5505d(Uri.parse(str));
                vx2.m53590f(d, "fromUri(Uri.parse(playURL!!))");
                e.mo6614n(d);
                e.mo6688S(1);
                e.mo6846m(this.f43247v1);
                e.mo6677C(this.f43248w1, this.f43249x1);
                e.mo6710v(this);
                e.mo6699e();
            } catch (Exception unused) {
            }
            this.f43250y1 = e;
        }
    }

    /* renamed from: T */
    public /* synthetic */ void mo6723T(PlaybackException playbackException) {
        dq4.m15306q(this, playbackException);
    }

    /* renamed from: T0 */
    public final void mo62116T0() {
        jv1 jv1 = this.f43250y1;
        if (jv1 != null) {
            this.f43249x1 = jv1.mo6696b0();
            this.f43248w1 = jv1.mo6687R();
            this.f43247v1 = jv1.mo6678E();
            jv1.mo6844a();
        }
        this.f43250y1 = null;
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
        dq4.m15304o(this, i);
        C8942a aVar = this.f43246u1;
        if (aVar != null) {
            aVar.mo58004g(i);
        }
    }

    /* renamed from: g0 */
    public /* synthetic */ void mo6734g0(boolean z, int i) {
        dq4.m15308s(this, z, i);
    }

    public final String getPlayURL() {
        return this.f43244s1;
    }

    public final PlayerControlView getVideoController() {
        return this.f43245t1;
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

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f43244s1 != null && this.f43250y1 == null) {
            mo62115S0();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        if (getContext() instanceof Activity) {
            Context context = getContext();
            vx2.m53589e(context, "null cannot be cast to non-null type android.app.Activity");
            int c = C7258ja.m59317c((Activity) context);
            Context context2 = getContext();
            vx2.m53589e(context2, "null cannot be cast to non-null type android.app.Activity");
            int b = C7258ja.m59316b((Activity) context2);
            int i = 1;
            if (c < b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = 2;
            }
            setResizeMode(i);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo62116T0();
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        if (z) {
            mo62115S0();
        } else {
            mo62116T0();
        }
    }

    public void onVisibilityChanged(View view, int i) {
        vx2.m53591g(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        if (i == 0) {
            mo62115S0();
        } else {
            mo62116T0();
        }
    }

    /* renamed from: p0 */
    public /* synthetic */ void mo6743p0(boolean z) {
        dq4.m15297h(this, z);
    }

    public final void setIPlayerListener(C8943b bVar) {
        vx2.m53591g(bVar, "iPlayerListener");
        this.f43246u1 = bVar;
    }

    public final void setPlayURL(String str) {
        this.f43244s1 = str;
        mo62116T0();
        mo62115S0();
    }

    public final void setVideoController(PlayerControlView playerControlView) {
        this.f43245t1 = playerControlView;
        mo62116T0();
        mo62115S0();
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
    public /* synthetic */ void mo6746x(androidx.media3.common.Metadata metadata) {
        dq4.m15301l(this, metadata);
    }

    /* renamed from: z */
    public void mo6747z(boolean z, int i) {
        dq4.m15302m(this, z, i);
        C8942a aVar = this.f43246u1;
        if (aVar != null) {
            aVar.mo62127z(z, i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomVideoPlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomVideoPlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
        this.f43247v1 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y55.CustomVideoPlayer, i, 0);
        this.f43247v1 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
