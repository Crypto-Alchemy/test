package net.safemoon.androidwallet.fragments.collectibles;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.textview.MaterialTextView;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.collectible.AssetContract;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.model.nft.NFTData;
import net.safemoon.androidwallet.model.nft.NFTTransferResponse;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.CollectibleViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bC\u0010DJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0002R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u0004\u0018\u00010 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R,\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8\u0002XD¢\u0006\u0006\n\u0004\b<\u0010\"R\"\u0010?\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010;0;0.8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u00101R\u0018\u0010B\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010A¨\u0006E"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/collectibles/TransferNftFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onDetach", "W", "Lnet/safemoon/androidwallet/model/nft/NFTData;", "k", "Lef3;", "K", "()Lnet/safemoon/androidwallet/model/nft/NFTData;", "nftData", "", "r", "M", "()Ljava/lang/String;", "toAddress", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "s", "N", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "x", "J", "()Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "iContact", "Lnet/safemoon/androidwallet/viewmodels/CollectibleViewModel;", "y", "I", "()Lnet/safemoon/androidwallet/viewmodels/CollectibleViewModel;", "collectibleViewModel", "Leb2;", "A", "Leb2;", "binding", "Lk04;", "Lnet/safemoon/androidwallet/model/nft/NFTTransferResponse;", "B", "Lk04;", "L", "()Lk04;", "setNftTransfer", "(Lk04;)V", "nftTransfer", "Lno2;", "C", "Lno2;", "iNFTWeb", "", "H", "TOTAL_TIME", "kotlin.jvm.PlatformType", "timerProgress", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "countDownTimer", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TransferNftFragment.kt */
public final class TransferNftFragment extends BaseMainFragment {

    /* renamed from: A */
    public eb2 f42351A;

    /* renamed from: B */
    public k04<NFTTransferResponse> f42352B;

    /* renamed from: C */
    public no2 f42353C;

    /* renamed from: H */
    public final long f42354H;

    /* renamed from: I */
    public final k04<Long> f42355I;

    /* renamed from: L */
    public CountDownTimer f42356L;

    /* renamed from: k */
    public final ef3 f42357k = C6169a.m47232a(new TransferNftFragment$nftData$2(this));

    /* renamed from: r */
    public final ef3 f42358r = C6169a.m47232a(new TransferNftFragment$toAddress$2(this));

    /* renamed from: s */
    public final ef3 f42359s = C6169a.m47232a(new TransferNftFragment$wallet$2(this));

    /* renamed from: x */
    public final ef3 f42360x = C6169a.m47232a(new TransferNftFragment$iContact$2(this));

    /* renamed from: y */
    public final ef3 f42361y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/TransferNftFragment$a", "Lle5;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", "model", "Lpl6;", "target", "", "isFirstResource", "d", "resource", "Lcom/bumptech/glide/load/DataSource;", "dataSource", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.TransferNftFragment$a */
    /* compiled from: TransferNftFragment.kt */
    public static final class C8554a implements le5<Drawable> {

        /* renamed from: a */
        public final /* synthetic */ TransferNftFragment f42362a;

        /* renamed from: d */
        public final /* synthetic */ eb2 f42363d;

        public C8554a(TransferNftFragment transferNftFragment, eb2 eb2) {
            this.f42362a = transferNftFragment;
            this.f42363d = eb2;
        }

        /* renamed from: b */
        public static final void m67902b(TransferNftFragment transferNftFragment, eb2 eb2) {
            byte[] bArr;
            vx2.m53591g(transferNftFragment, "this$0");
            vx2.m53591g(eb2, "$this_run");
            if (transferNftFragment.isVisible()) {
                me5 u = C1710a.m12225u(eb2.f28535f);
                String imageData = transferNftFragment.mo58037K().getImageData();
                if (imageData != null) {
                    bArr = db6.m56792a(imageData);
                } else {
                    bArr = null;
                }
                u.mo23165z(bArr).mo11553K0(eb2.f28535f);
            }
        }

        /* renamed from: c */
        public boolean mo21096i(Drawable drawable, Object obj, pl6<Drawable> pl6, DataSource dataSource, boolean z) {
            return false;
        }

        /* renamed from: d */
        public boolean mo21092d(GlideException glideException, Object obj, pl6<Drawable> pl6, boolean z) {
            new Handler(Looper.getMainLooper()).post(new xv6(this.f42362a, this.f42363d));
            return true;
        }
    }

    public TransferNftFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new TransferNftFragment$special$$inlined$viewModels$default$2(new TransferNftFragment$special$$inlined$viewModels$default$1(this)));
        this.f42361y = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CollectibleViewModel.class), new TransferNftFragment$special$$inlined$viewModels$default$3(b), new TransferNftFragment$special$$inlined$viewModels$default$4((pc2) null, b), new TransferNftFragment$special$$inlined$viewModels$default$5(this, b));
        this.f42354H = 5000;
        this.f42355I = new k04<>(0L);
    }

    /* renamed from: O */
    public static final void m67877O(TransferNftFragment transferNftFragment, View view) {
        vx2.m53591g(transferNftFragment, "this$0");
        transferNftFragment.mo50752i();
    }

    /* renamed from: P */
    public static final void m67878P(TransferNftFragment transferNftFragment, View view) {
        vx2.m53591g(transferNftFragment, "this$0");
        h24 h24 = new h24();
        FragmentManager parentFragmentManager = transferNftFragment.getParentFragmentManager();
        vx2.m53590f(parentFragmentManager, "parentFragmentManager");
        h24.mo52097A(parentFragmentManager);
    }

    /* renamed from: Q */
    public static final void m67879Q(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: R */
    public static final void m67880R(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: S */
    public static final boolean m67881S(TransferNftFragment transferNftFragment, eb2 eb2, View view, MotionEvent motionEvent) {
        vx2.m53591g(transferNftFragment, "this$0");
        vx2.m53591g(eb2, "$this_run");
        if (motionEvent.getAction() == 0) {
            Context requireContext = transferNftFragment.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            ol0.m70325E(requireContext);
            Context requireContext2 = transferNftFragment.requireContext();
            vx2.m53590f(requireContext2, "requireContext()");
            ol0.m70345Y(requireContext2, R.string.alert_hold_to_send);
            eb2.f28533d.requestDisallowInterceptTouchEvent(true);
            transferNftFragment.mo58041W();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            eb2.f28533d.requestDisallowInterceptTouchEvent(false);
            if (transferNftFragment.f42356L != null) {
                transferNftFragment.f42355I.setValue(0L);
                CountDownTimer countDownTimer = transferNftFragment.f42356L;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
            }
        }
        return false;
    }

    /* renamed from: T */
    public static final void m67882T(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: U */
    public static final void m67883U(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: V */
    public static final void m67884V(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: I */
    public final CollectibleViewModel mo58035I() {
        return (CollectibleViewModel) this.f42361y.getValue();
    }

    /* renamed from: J */
    public final IContact mo58036J() {
        return (IContact) this.f42360x.getValue();
    }

    /* renamed from: K */
    public final NFTData mo58037K() {
        return (NFTData) this.f42357k.getValue();
    }

    /* renamed from: L */
    public final k04<NFTTransferResponse> mo58038L() {
        return this.f42352B;
    }

    /* renamed from: M */
    public final String mo58039M() {
        return (String) this.f42358r.getValue();
    }

    /* renamed from: N */
    public final Wallet mo58040N() {
        return (Wallet) this.f42359s.getValue();
    }

    /* renamed from: W */
    public final void mo58041W() {
        CountDownTimer countDownTimer = this.f42356L;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        long j = this.f42354H;
        TransferNftFragment$startTimer$1 transferNftFragment$startTimer$1 = new TransferNftFragment$startTimer$1(this, j, j / 100);
        this.f42356L = transferNftFragment$startTimer$1;
        transferNftFragment$startTimer$1.start();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        eb2 c = eb2.m43887c(layoutInflater, viewGroup, false);
        this.f42351A = c;
        if (c != null) {
            return c.mo42201b();
        }
        return null;
    }

    public void onDetach() {
        super.onDetach();
        this.f42351A = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        MaterialTextView materialTextView;
        String str3;
        String str4;
        b36 b36;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        CollectibleViewModel I = mo58035I();
        Wallet N = mo58040N();
        AssetContract assetContract = mo58037K().getAssetContract();
        String str5 = null;
        if (assetContract != null) {
            str = assetContract.getAddress();
        } else {
            str = null;
        }
        AssetContract assetContract2 = mo58037K().getAssetContract();
        if (assetContract2 != null) {
            str2 = assetContract2.getSchema_name();
        } else {
            str2 = null;
        }
        this.f42353C = I.mo61052U(N, str, str2, mo58037K().getChainID());
        eb2 eb2 = this.f42351A;
        if (!(eb2 == null || (b36 = eb2.f28537h) == null)) {
            b36.f21125c.setOnClickListener(new pv6(this));
            b36.f21127e.setText(getString(R.string.collectible_screen_transfer));
        }
        k04<NFTTransferResponse> k04 = new k04<>();
        this.f42352B = k04;
        k04.observe(getViewLifecycleOwner(), new qv6(new TransferNftFragment$onViewCreated$2(this)));
        this.f42355I.observe(getViewLifecycleOwner(), new rv6(new TransferNftFragment$onViewCreated$3(this)));
        eb2 eb22 = this.f42351A;
        if (eb22 != null) {
            eb22.f28540k.setText(mo58037K().getName());
            Wallet N2 = mo58040N();
            if (N2 != null) {
                TokenType.C8246a aVar = TokenType.Companion;
                Integer chainID = mo58037K().getChainID();
                vx2.m53588d(chainID);
                String address = N2.getAddress(aVar.mo57099b(chainID.intValue()).getCoinType().getValue());
                MaterialTextView materialTextView2 = eb22.f28543n;
                String displayName = N2.displayName();
                if (address != null) {
                    str3 = ol0.m70353d(address);
                } else {
                    str3 = null;
                }
                materialTextView2.setText(displayName + "\n(" + str3 + ")");
                MaterialTextView materialTextView3 = eb22.f28544o;
                IContact J = mo58036J();
                if (J == null || (str4 = J.getName()) == null) {
                    str4 = mo58039M();
                }
                if (str4 != null) {
                    str5 = ol0.m70353d(str4);
                }
                materialTextView3.setText(str5);
                eb22.f28531b.setOnTouchListener(new sv6(this, eb22));
            }
            mo58035I().mo61036E().observe(getViewLifecycleOwner(), new tv6(new TransferNftFragment$onViewCreated$4$2(eb22)));
            mo58035I().mo61043L().observe(getViewLifecycleOwner(), new uv6(new TransferNftFragment$onViewCreated$4$3(eb22)));
            C1710a.m12225u(eb22.f28535f).mo23164y(mo58037K().getImageUrl()).mo11555M0(new C8554a(this, eb22)).mo11553K0(eb22.f28535f);
            ProgressLoading.C8308a aVar2 = ProgressLoading.f41785Y;
            String string = getString(R.string.loading);
            vx2.m53590f(string, "getString(R.string.loading)");
            mo58035I().mo61037F().observe(getViewLifecycleOwner(), new vv6(new TransferNftFragment$onViewCreated$4$5(this, aVar2.mo57297a(false, string, ""))));
        }
        try {
            CollectibleViewModel I2 = mo58035I();
            String M = mo58039M();
            vx2.m53588d(M);
            String tokenId = mo58037K().getTokenId();
            vx2.m53588d(tokenId);
            I2.mo61066t(M, tokenId, this.f42353C);
        } catch (Exception unused) {
        }
        eb2 eb23 = this.f42351A;
        if (eb23 != null && (materialTextView = eb23.f28534e) != null) {
            materialTextView.setOnClickListener(new wv6(this));
        }
    }
}
