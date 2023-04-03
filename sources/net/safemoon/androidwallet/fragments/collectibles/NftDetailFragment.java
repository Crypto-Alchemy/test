package net.safemoon.androidwallet.fragments.collectibles;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.media3.common.C0821o;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.github.mikephil.charting.utils.Utils;
import java.io.File;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.collectible.RoomCollection;
import net.safemoon.androidwallet.model.collectible.RoomNFT;
import net.safemoon.androidwallet.model.nft.NFTData;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.CollectibleViewModel;
import net.safemoon.androidwallet.views.CustomVideoPlayer;
import net.safemoon.androidwallet.views.zoomImage.ZoomageView;
import p000.f74;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bD\u0010EJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0003J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002R\u0014\u0010\u0017\u001a\u00020\u00128\u0002XD¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00128\u0002XD¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u001d\u00102\u001a\u0004\u0018\u00010.8BX\u0002¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010:\u001a\u0002078BX\u0002¢\u0006\f\n\u0004\b8\u0010 \u001a\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010B¨\u0006F"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/collectibles/NftDetailFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "onDetach", "M", "X", "G", "W", "", "url", "Y", "k", "Ljava/lang/String;", "EthereumSCH", "r", "EthereumSCHSplited", "", "s", "Z", "isFullscreen", "Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "x", "Lef3;", "I", "()Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "collection", "Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "y", "K", "()Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "roomNFT", "Lnet/safemoon/androidwallet/model/nft/NFTData;", "A", "J", "()Lnet/safemoon/androidwallet/model/nft/NFTData;", "nftData", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "B", "L", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lna;", "C", "Lna;", "binding", "Lnet/safemoon/androidwallet/viewmodels/CollectibleViewModel;", "H", "()Lnet/safemoon/androidwallet/viewmodels/CollectibleViewModel;", "collectibleViewModel", "Lnet/safemoon/androidwallet/views/CustomVideoPlayer;", "Lnet/safemoon/androidwallet/views/CustomVideoPlayer;", "playerView", "Landroid/app/Dialog;", "Landroid/app/Dialog;", "fullscreenDialog", "Lno2;", "Lno2;", "iNFTWeb", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: NftDetailFragment.kt */
public final class NftDetailFragment extends BaseMainFragment {

    /* renamed from: A */
    public final ef3 f42317A = C6169a.m47232a(new NftDetailFragment$nftData$2(this));

    /* renamed from: B */
    public final ef3 f42318B = C6169a.m47232a(new NftDetailFragment$wallet$2(this));

    /* renamed from: C */
    public C6277na f42319C;

    /* renamed from: H */
    public final ef3 f42320H;

    /* renamed from: I */
    public CustomVideoPlayer f42321I;

    /* renamed from: L */
    public Dialog f42322L;

    /* renamed from: M */
    public no2 f42323M;

    /* renamed from: k */
    public final String f42324k = "ERC";

    /* renamed from: r */
    public final String f42325r = "ERC-";

    /* renamed from: s */
    public boolean f42326s;

    /* renamed from: x */
    public final ef3 f42327x = C6169a.m47232a(new NftDetailFragment$collection$2(this));

    /* renamed from: y */
    public final ef3 f42328y = C6169a.m47232a(new NftDetailFragment$roomNFT$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/NftDetailFragment$a", "Landroid/app/Dialog;", "Lr37;", "onBackPressed", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$a */
    /* compiled from: NftDetailFragment.kt */
    public static final class C8539a extends Dialog {

        /* renamed from: a */
        public final /* synthetic */ NftDetailFragment f42329a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8539a(NftDetailFragment nftDetailFragment, Context context) {
            super(context, 16973834);
            this.f42329a = nftDetailFragment;
        }

        public void onBackPressed() {
            if (this.f42329a.f42326s) {
                this.f42329a.mo57993G();
            }
            super.onBackPressed();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/NftDetailFragment$b", "Lnet/safemoon/androidwallet/views/CustomVideoPlayer$b;", "", "playbackState", "Lr37;", "g", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$b */
    /* compiled from: NftDetailFragment.kt */
    public static final class C8540b extends CustomVideoPlayer.C8943b {

        /* renamed from: a */
        public final /* synthetic */ CustomVideoPlayer f42330a;

        /* renamed from: b */
        public final /* synthetic */ NftDetailFragment f42331b;

        public C8540b(CustomVideoPlayer customVideoPlayer, NftDetailFragment nftDetailFragment) {
            this.f42330a = customVideoPlayer;
            this.f42331b = nftDetailFragment;
        }

        /* renamed from: g */
        public void mo58004g(int i) {
            long j;
            C6277na B;
            ac7 ac7;
            if (i == 3) {
                C0821o player = this.f42330a.getPlayer();
                if (player != null) {
                    j = player.getDuration();
                } else {
                    j = 0;
                }
                if (j > 0 && (B = this.f42331b.f42319C) != null && (ac7 = B.f32025f) != null) {
                    ZoomageView zoomageView = ac7.f20912p;
                    vx2.m53590f(zoomageView, "it.zoomImage");
                    zoomageView.setVisibility(8);
                    CustomVideoPlayer customVideoPlayer = ac7.f20911o;
                    vx2.m53590f(customVideoPlayer, "it.videoView");
                    customVideoPlayer.setVisibility(0);
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/NftDetailFragment$c", "Lle5;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", "model", "Lpl6;", "target", "", "isFirstResource", "d", "resource", "Lcom/bumptech/glide/load/DataSource;", "dataSource", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$c */
    /* compiled from: NftDetailFragment.kt */
    public static final class C8541c implements le5<Drawable> {

        /* renamed from: a */
        public final /* synthetic */ ZoomageView f42332a;

        /* renamed from: d */
        public final /* synthetic */ NftDetailFragment f42333d;

        public C8541c(ZoomageView zoomageView, NftDetailFragment nftDetailFragment) {
            this.f42332a = zoomageView;
            this.f42333d = nftDetailFragment;
        }

        /* renamed from: c */
        public static final void m67799c(NftDetailFragment nftDetailFragment, ZoomageView zoomageView, Drawable drawable) {
            float f;
            float f2;
            vx2.m53591g(nftDetailFragment, "this$0");
            if (nftDetailFragment.isVisible()) {
                zoomageView.setScaleType(ImageView.ScaleType.MATRIX);
                Matrix matrix = new Matrix();
                if (drawable != null) {
                    f = (float) drawable.getIntrinsicWidth();
                } else {
                    f = 0.0f;
                }
                if (drawable != null) {
                    f2 = (float) drawable.getIntrinsicHeight();
                } else {
                    f2 = 0.0f;
                }
                matrix.setRectToRect(new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f, f2), new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) zoomageView.getWidth(), (float) zoomageView.getHeight()), Matrix.ScaleToFit.CENTER);
                zoomageView.setImageMatrix(matrix);
            }
        }

        /* renamed from: b */
        public boolean mo21096i(Drawable drawable, Object obj, pl6<Drawable> pl6, DataSource dataSource, boolean z) {
            ZoomageView zoomageView = this.f42332a;
            zoomageView.postDelayed(new d74(this.f42333d, zoomageView, drawable), 100);
            return false;
        }

        /* renamed from: d */
        public boolean mo21092d(GlideException glideException, Object obj, pl6<Drawable> pl6, boolean z) {
            return false;
        }
    }

    public NftDetailFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new NftDetailFragment$special$$inlined$viewModels$default$2(new NftDetailFragment$special$$inlined$viewModels$default$1(this)));
        this.f42320H = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CollectibleViewModel.class), new NftDetailFragment$special$$inlined$viewModels$default$3(b), new NftDetailFragment$special$$inlined$viewModels$default$4((pc2) null, b), new NftDetailFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: N */
    public static final void m67769N(NftDetailFragment nftDetailFragment, DialogInterface dialogInterface) {
        vx2.m53591g(nftDetailFragment, "this$0");
        FragmentActivity activity = nftDetailFragment.getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(2);
        }
    }

    /* renamed from: O */
    public static final void m67770O(NftDetailFragment nftDetailFragment, DialogInterface dialogInterface) {
        vx2.m53591g(nftDetailFragment, "this$0");
        FragmentActivity activity = nftDetailFragment.getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
    }

    /* renamed from: P */
    public static final void m67771P(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m67772Q(NftDetailFragment nftDetailFragment, TextView textView, View view) {
        vx2.m53591g(nftDetailFragment, "this$0");
        nftDetailFragment.mo58002Y(textView.getText().toString());
    }

    /* renamed from: R */
    public static final void m67773R(NftDetailFragment nftDetailFragment, boolean z) {
        vx2.m53591g(nftDetailFragment, "this$0");
        if (z) {
            nftDetailFragment.mo58001X();
        } else {
            nftDetailFragment.mo57993G();
        }
    }

    /* renamed from: S */
    public static final void m67774S(NftDetailFragment nftDetailFragment, View view) {
        vx2.m53591g(nftDetailFragment, "this$0");
        FragmentActivity activity = nftDetailFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: T */
    public static final void m67775T(NftDetailFragment nftDetailFragment, View view) {
        vx2.m53591g(nftDetailFragment, "this$0");
        nftDetailFragment.mo58000W();
    }

    /* renamed from: U */
    public static final void m67776U(NftDetailFragment nftDetailFragment, View view) {
        vx2.m53591g(nftDetailFragment, "this$0");
        FragmentActivity requireActivity = nftDetailFragment.requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        String imageUrl = nftDetailFragment.mo57996J().getImageUrl();
        String name = nftDetailFragment.mo57996J().getName();
        C7258ja.m59319e(requireActivity, (File) null, imageUrl + "\n" + name, (String) null);
    }

    /* renamed from: V */
    public static final void m67777V(NftDetailFragment nftDetailFragment, View view) {
        vx2.m53591g(nftDetailFragment, "this$0");
        f74.C7070a a = f74.m57631a(nftDetailFragment.mo57996J());
        vx2.m53590f(a, "actionNftDetailToSendto(nftData)");
        nftDetailFragment.mo50753j(a);
    }

    /* renamed from: G */
    public final void mo57993G() {
        ViewParent viewParent;
        ac7 ac7;
        FrameLayout frameLayout;
        if (this.f42321I != null) {
            Dialog dialog = this.f42322L;
            boolean z = true;
            if (dialog == null || !dialog.isShowing()) {
                z = false;
            }
            if (z) {
                CustomVideoPlayer customVideoPlayer = this.f42321I;
                ViewGroup viewGroup = null;
                if (customVideoPlayer != null) {
                    viewParent = customVideoPlayer.getParent();
                } else {
                    viewParent = null;
                }
                if (viewParent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewParent;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(this.f42321I);
                }
                C6277na naVar = this.f42319C;
                if (!(naVar == null || (ac7 = naVar.f32025f) == null || (frameLayout = ac7.f20900d) == null)) {
                    frameLayout.addView(this.f42321I);
                }
                this.f42326s = false;
                Dialog dialog2 = this.f42322L;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
            }
        }
    }

    /* renamed from: H */
    public final CollectibleViewModel mo57994H() {
        return (CollectibleViewModel) this.f42320H.getValue();
    }

    /* renamed from: I */
    public final RoomCollection mo57995I() {
        return (RoomCollection) this.f42327x.getValue();
    }

    /* renamed from: J */
    public final NFTData mo57996J() {
        return (NFTData) this.f42317A.getValue();
    }

    /* renamed from: K */
    public final RoomNFT mo57997K() {
        return (RoomNFT) this.f42328y.getValue();
    }

    /* renamed from: L */
    public final Wallet mo57998L() {
        return (Wallet) this.f42318B.getValue();
    }

    /* renamed from: M */
    public final void mo57999M() {
        WindowManager.LayoutParams layoutParams;
        C8539a aVar = new C8539a(this, requireContext());
        aVar.requestWindowFeature(1);
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = aVar.getWindow();
            if (window != null) {
                window.setFlags(256, 256);
            }
            Window window2 = aVar.getWindow();
            if (window2 != null) {
                layoutParams = window2.getAttributes();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.layoutInDisplayCutoutMode = 1;
            }
        } else {
            Window window3 = aVar.getWindow();
            if (window3 != null) {
                window3.setLayout(-1, -1);
            }
        }
        aVar.setOnShowListener(new z64(this));
        aVar.setOnDismissListener(new a74(this));
        this.f42322L = aVar;
    }

    /* renamed from: W */
    public final void mo58000W() {
        String openSeaUrl = mo57996J().getOpenSeaUrl();
        if (openSeaUrl != null) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(openSeaUrl)));
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    /* renamed from: X */
    public final void mo58001X() {
        ViewParent viewParent;
        CustomVideoPlayer customVideoPlayer = this.f42321I;
        if (customVideoPlayer != null) {
            ViewGroup viewGroup = null;
            if (customVideoPlayer != null) {
                viewParent = customVideoPlayer.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewParent;
            }
            if (viewGroup != null) {
                viewGroup.removeView(this.f42321I);
            }
            Dialog dialog = this.f42322L;
            if (dialog != null) {
                CustomVideoPlayer customVideoPlayer2 = this.f42321I;
                vx2.m53588d(customVideoPlayer2);
                dialog.addContentView(customVideoPlayer2, new ViewGroup.LayoutParams(-1, -1));
            }
            this.f42326s = true;
            Dialog dialog2 = this.f42322L;
            if (dialog2 != null) {
                dialog2.show();
            }
        }
    }

    /* renamed from: Y */
    public final void mo58002Y(String str) {
        if (str != null) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        C6277na c = C6277na.m48712c(layoutInflater, viewGroup, false);
        this.f42319C = c;
        if (c != null) {
            return c.mo46047b();
        }
        return null;
    }

    public void onDetach() {
        super.onDetach();
        this.f42319C = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0210  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            java.lang.String r0 = "view"
            p000.vx2.m53591g(r11, r0)
            super.onViewCreated(r11, r12)
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r12 = r10.mo57994H()
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r10.mo57998L()
            net.safemoon.androidwallet.model.nft.NFTData r1 = r10.mo57996J()
            net.safemoon.androidwallet.model.collectible.AssetContract r1 = r1.getAssetContract()
            r2 = 0
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r1.getAddress()
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            net.safemoon.androidwallet.model.nft.NFTData r3 = r10.mo57996J()
            net.safemoon.androidwallet.model.collectible.AssetContract r3 = r3.getAssetContract()
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = r3.getSchema_name()
            goto L_0x0031
        L_0x0030:
            r3 = r2
        L_0x0031:
            net.safemoon.androidwallet.model.nft.NFTData r4 = r10.mo57996J()
            java.lang.Integer r4 = r4.getChainID()
            no2 r12 = r12.mo61052U(r0, r1, r3, r4)
            r10.f42323M = r12
            r10.mo57999M()
            r12 = 2131362993(0x7f0a04b1, float:1.8345782E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r1 = r10.getContext()
            r3 = 3
            r0.<init>(r1, r3)
            r12.setLayoutManager(r0)
            net.safemoon.androidwallet.model.nft.NFTData r0 = r10.mo57996J()
            java.util.ArrayList r0 = r0.getProperties()
            if (r0 == 0) goto L_0x0075
            i24 r0 = new i24
            net.safemoon.androidwallet.model.nft.NFTData r1 = r10.mo57996J()
            java.util.ArrayList r1 = r1.getProperties()
            p000.vx2.m53588d(r1)
            r0.<init>(r1)
            r12.setAdapter(r0)
        L_0x0075:
            r12 = 2131363816(0x7f0a07e8, float:1.8347452E38)
            android.view.View r12 = r11.findViewById(r12)
            net.safemoon.androidwallet.views.zoomImage.ZoomageView r12 = (net.safemoon.androidwallet.views.zoomImage.ZoomageView) r12
            r0 = 2131363571(0x7f0a06f3, float:1.8346955E38)
            android.view.View r0 = r11.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131362923(0x7f0a046b, float:1.834564E38)
            android.view.View r1 = r11.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 2131363335(0x7f0a0607, float:1.8346476E38)
            android.view.View r3 = r11.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            net.safemoon.androidwallet.model.nft.NFTData r4 = r10.mo57996J()
            java.lang.String r4 = r4.getImageUrl()
            r5 = 2131231313(0x7f080251, float:1.8078703E38)
            if (r4 == 0) goto L_0x00e1
            net.safemoon.androidwallet.model.nft.NFTData r4 = r10.mo57996J()
            java.lang.Integer r4 = r4.getChainID()
            if (r4 == 0) goto L_0x00be
            int r4 = r4.intValue()
            net.safemoon.androidwallet.common.TokenType$a r5 = net.safemoon.androidwallet.common.TokenType.Companion
            net.safemoon.androidwallet.common.TokenType r4 = r5.mo57099b(r4)
            int r5 = r4.getIcon()
        L_0x00be:
            me5 r4 = com.bumptech.glide.C1710a.m12225u(r12)
            net.safemoon.androidwallet.model.nft.NFTData r6 = r10.mo57996J()
            java.lang.String r6 = r6.getImageUrl()
            be5 r4 = r4.mo23164y(r6)
            kz r4 = r4.mo22582h0(r5)
            be5 r4 = (p000.be5) r4
            net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$1 r5 = new net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$1
            r5.<init>(r12, r10)
            be5 r4 = r4.mo11570w0(r5)
            r4.mo11553K0(r12)
            goto L_0x012c
        L_0x00e1:
            net.safemoon.androidwallet.model.nft.NFTData r4 = r10.mo57996J()
            java.lang.String r4 = r4.getImageData()
            if (r4 == 0) goto L_0x012c
            net.safemoon.androidwallet.model.nft.NFTData r4 = r10.mo57996J()
            java.lang.Integer r4 = r4.getChainID()
            if (r4 == 0) goto L_0x0103
            int r4 = r4.intValue()
            net.safemoon.androidwallet.common.TokenType$a r5 = net.safemoon.androidwallet.common.TokenType.Companion
            net.safemoon.androidwallet.common.TokenType r4 = r5.mo57099b(r4)
            int r5 = r4.getIcon()
        L_0x0103:
            me5 r4 = com.bumptech.glide.C1710a.m12225u(r12)
            net.safemoon.androidwallet.model.nft.NFTData r6 = r10.mo57996J()
            java.lang.String r6 = r6.getImageData()
            p000.vx2.m53588d(r6)
            byte[] r6 = p000.db6.m56792a(r6)
            be5 r4 = r4.mo23165z(r6)
            kz r4 = r4.mo22582h0(r5)
            be5 r4 = (p000.be5) r4
            net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$c r5 = new net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$c
            r5.<init>(r12, r10)
            be5 r4 = r4.mo11570w0(r5)
            r4.mo11553K0(r12)
        L_0x012c:
            r12 = 2131362038(0x7f0a00f6, float:1.8343845E38)
            android.view.View r12 = r11.findViewById(r12)
            s64 r4 = new s64
            r4.<init>(r10)
            r12.setOnClickListener(r4)
            net.safemoon.androidwallet.model.nft.NFTData r12 = r10.mo57996J()
            java.lang.String r12 = r12.getOpenSeaUrl()
            boolean r12 = android.webkit.URLUtil.isValidUrl(r12)
            r4 = 8
            r5 = 0
            if (r12 == 0) goto L_0x016a
            na r12 = r10.f42319C
            if (r12 == 0) goto L_0x0153
            androidx.appcompat.widget.AppCompatImageView r12 = r12.f32022c
            goto L_0x0154
        L_0x0153:
            r12 = r2
        L_0x0154:
            if (r12 != 0) goto L_0x0157
            goto L_0x015a
        L_0x0157:
            r12.setVisibility(r5)
        L_0x015a:
            r12 = 2131362079(0x7f0a011f, float:1.8343928E38)
            android.view.View r12 = r11.findViewById(r12)
            t64 r6 = new t64
            r6.<init>(r10)
            r12.setOnClickListener(r6)
            goto L_0x0178
        L_0x016a:
            na r12 = r10.f42319C
            if (r12 == 0) goto L_0x0171
            androidx.appcompat.widget.AppCompatImageView r12 = r12.f32022c
            goto L_0x0172
        L_0x0171:
            r12 = r2
        L_0x0172:
            if (r12 != 0) goto L_0x0175
            goto L_0x0178
        L_0x0175:
            r12.setVisibility(r4)
        L_0x0178:
            na r12 = r10.f42319C
            if (r12 == 0) goto L_0x0188
            androidx.appcompat.widget.AppCompatImageView r12 = r12.f32023d
            if (r12 == 0) goto L_0x0188
            u64 r6 = new u64
            r6.<init>(r10)
            r12.setOnClickListener(r6)
        L_0x0188:
            na r12 = r10.f42319C
            if (r12 == 0) goto L_0x019c
            ac7 r12 = r12.f32025f
            if (r12 == 0) goto L_0x019c
            com.google.android.material.button.MaterialButton r12 = r12.f20898b
            if (r12 == 0) goto L_0x019c
            v64 r6 = new v64
            r6.<init>(r10)
            r12.setOnClickListener(r6)
        L_0x019c:
            r12 = 2131362260(0x7f0a01d4, float:1.8344296E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            net.safemoon.androidwallet.model.nft.NFTData r6 = r10.mo57996J()
            net.safemoon.androidwallet.model.collectible.AssetContract r6 = r6.getAssetContract()
            if (r6 == 0) goto L_0x01b4
            java.lang.String r6 = r6.getAddress()
            goto L_0x01b5
        L_0x01b4:
            r6 = r2
        L_0x01b5:
            r12.setText(r6)
            r12 = 2131363352(0x7f0a0618, float:1.834651E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            net.safemoon.androidwallet.model.nft.NFTData r6 = r10.mo57996J()
            java.lang.String r6 = r6.getTokenId()
            r12.setText(r6)
            na r12 = r10.f42319C
            if (r12 == 0) goto L_0x01d7
            ac7 r12 = r12.f32025f
            if (r12 == 0) goto L_0x01d7
            android.widget.RelativeLayout r12 = r12.f20905i
            goto L_0x01d8
        L_0x01d7:
            r12 = r2
        L_0x01d8:
            if (r12 != 0) goto L_0x01db
            goto L_0x0214
        L_0x01db:
            net.safemoon.androidwallet.model.nft.NFTData r6 = r10.mo57996J()
            java.lang.String r6 = r6.getTokenId()
            r7 = 1
            if (r6 == 0) goto L_0x01ef
            int r6 = r6.length()
            if (r6 != 0) goto L_0x01ed
            goto L_0x01ef
        L_0x01ed:
            r6 = r5
            goto L_0x01f0
        L_0x01ef:
            r6 = r7
        L_0x01f0:
            if (r6 != 0) goto L_0x020c
            net.safemoon.androidwallet.model.nft.NFTData r6 = r10.mo57996J()
            java.lang.Integer r6 = r6.getChainID()
            net.safemoon.androidwallet.common.TokenType r8 = net.safemoon.androidwallet.common.TokenType.SOLANA
            int r8 = r8.getChainId()
            if (r6 != 0) goto L_0x0203
            goto L_0x020a
        L_0x0203:
            int r6 = r6.intValue()
            if (r6 != r8) goto L_0x020a
            goto L_0x020c
        L_0x020a:
            r6 = r5
            goto L_0x020d
        L_0x020c:
            r6 = r7
        L_0x020d:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0211
            r4 = r5
        L_0x0211:
            r12.setVisibility(r4)
        L_0x0214:
            net.safemoon.androidwallet.model.nft.NFTData r12 = r10.mo57996J()
            net.safemoon.androidwallet.model.collectible.AssetContract r12 = r12.getAssetContract()
            if (r12 == 0) goto L_0x0224
            java.lang.String r12 = r12.getSchema_name()
            r4 = r12
            goto L_0x0225
        L_0x0224:
            r4 = r2
        L_0x0225:
            if (r4 == 0) goto L_0x0233
            java.lang.String r5 = r10.f42324k
            java.lang.String r6 = r10.f42325r
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r12 = p000.yb6.m74332I(r4, r5, r6, r7, r8, r9)
            goto L_0x0234
        L_0x0233:
            r12 = r2
        L_0x0234:
            r4 = 2131363353(0x7f0a0619, float:1.8346512E38)
            android.view.View r4 = r11.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r12)
            net.safemoon.androidwallet.model.nft.NFTData r12 = r10.mo57996J()
            java.lang.Integer r12 = r12.getChainID()
            if (r12 == 0) goto L_0x0258
            int r12 = r12.intValue()
            net.safemoon.androidwallet.common.TokenType$a r2 = net.safemoon.androidwallet.common.TokenType.Companion
            net.safemoon.androidwallet.common.TokenType r12 = r2.mo57099b(r12)
            java.lang.String r2 = r12.getTitle()
        L_0x0258:
            r12 = 2131362908(0x7f0a045c, float:1.834561E38)
            android.view.View r11 = r11.findViewById(r12)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11.setText(r2)
            k04 r11 = new k04
            r11.<init>()
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r12 = r10.mo57994H()
            net.safemoon.androidwallet.model.nft.NFTData r2 = r10.mo57996J()
            java.lang.String r2 = r2.getTokenId()
            no2 r4 = r10.f42323M
            r12.mo61065s(r2, r4, r11)
            ug3 r12 = r10.getViewLifecycleOwner()
            net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$8 r2 = new net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$8
            r2.<init>(r10)
            w64 r4 = new w64
            r4.<init>(r2)
            r11.observe(r12, r4)
            if (r0 != 0) goto L_0x028e
            goto L_0x0299
        L_0x028e:
            net.safemoon.androidwallet.model.nft.NFTData r11 = r10.mo57996J()
            java.lang.String r11 = r11.getDescription()
            r0.setText(r11)
        L_0x0299:
            if (r1 != 0) goto L_0x029c
            goto L_0x02a7
        L_0x029c:
            net.safemoon.androidwallet.model.nft.NFTData r11 = r10.mo57996J()
            java.lang.String r11 = r11.getOpenSeaUrl()
            r1.setText(r11)
        L_0x02a7:
            if (r3 != 0) goto L_0x02aa
            goto L_0x02b5
        L_0x02aa:
            net.safemoon.androidwallet.model.nft.NFTData r11 = r10.mo57996J()
            java.lang.String r11 = r11.getName()
            r3.setText(r11)
        L_0x02b5:
            if (r1 == 0) goto L_0x02bf
            x64 r11 = new x64
            r11.<init>(r10, r1)
            r1.setOnClickListener(r11)
        L_0x02bf:
            na r11 = r10.f42319C
            if (r11 == 0) goto L_0x02e8
            ac7 r11 = r11.f32025f
            if (r11 == 0) goto L_0x02e8
            net.safemoon.androidwallet.views.CustomVideoPlayer r11 = r11.f20911o
            if (r11 == 0) goto L_0x02e8
            r10.f42321I = r11
            y64 r12 = new y64
            r12.<init>(r10)
            r11.setFullscreenButtonClickListener(r12)
            net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$b r12 = new net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$b
            r12.<init>(r11, r10)
            r11.setIPlayerListener(r12)
            net.safemoon.androidwallet.model.nft.NFTData r12 = r10.mo57996J()
            java.lang.String r12 = r12.getAnimationUrl()
            r11.setPlayURL(r12)
        L_0x02e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
