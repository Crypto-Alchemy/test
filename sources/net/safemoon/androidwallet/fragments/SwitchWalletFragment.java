package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.MainActivity;
import net.safemoon.androidwallet.dialogs.G2FAVerfication;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import net.safemoon.androidwallet.views.gesture.WalletRecyclerItemSwipeHelper;
import p000.wo2;
import wallet.core.jni.CoinType;
import wallet.core.jni.HDWallet;
import wallet.core.jni.Mnemonic;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bj\u0010kJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\u0012\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010#\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010$\u001a\u00020\u0002H\u0002J\b\u0010%\u001a\u00020\u0002H\u0002J\b\u0010&\u001a\u00020\u0002H\u0002J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0002H\u0002J\b\u0010+\u001a\u00020\u0002H\u0002J\u0012\u0010.\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010,H\u0016J&\u00104\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001012\b\u0010-\u001a\u0004\u0018\u00010,H\u0016J\b\u00105\u001a\u00020\u0002H\u0016J\u001a\u00107\u001a\u00020\u00022\u0006\u00106\u001a\u0002032\b\u0010-\u001a\u0004\u0018\u00010,H\u0016R\u001b\u0010=\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010@\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00190I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00190I8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010KR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020Z8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bO\u0010[R\u001b\u0010a\u001a\u00020]8BX\u0002¢\u0006\f\n\u0004\b^\u0010:\u001a\u0004\b_\u0010`R\u001b\u0010e\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\bb\u0010:\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006l"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SwitchWalletFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lr37;", "J0", "K0", "L0", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "e0", "O0", "P0", "N0", "G0", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "k0", "m0", "l0", "Lwo2$a;", "Q0", "p0", "h0", "g0", "M0", "selected", "w0", "", "blob", "f0", "toSend", "I0", "s0", "d0", "message", "", "v0", "F0", "R0", "c0", "j0", "r0", "walletStr", "b0", "i0", "H0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", "view", "onViewCreated", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "k", "Lef3;", "n0", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "r", "o0", "walletViewModel", "Lya2;", "s", "Lya2;", "binding", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "x", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "loading", "", "y", "Ljava/util/List;", "listWalletStr", "", "A", "I", "importedCount", "B", "listBlobAddress", "", "C", "Ljava/util/Map;", "mapBlobAddressName", "H", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "currentSelectWallet", "Ld24;", "Ld24;", "myAdapter", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "L", "q0", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "M", "u0", "()Z", "isBioAuth", "Ly12;", "P", "Ly12;", "requestBiometricAuthUseCase", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwitchWalletFragment.kt */
public final class SwitchWalletFragment extends BaseMainFragment {

    /* renamed from: A */
    public int f42199A;

    /* renamed from: B */
    public final List<String> f42200B = new ArrayList();

    /* renamed from: C */
    public final Map<String, String> f42201C = new LinkedHashMap();

    /* renamed from: H */
    public Wallet f42202H;

    /* renamed from: I */
    public d24 f42203I;

    /* renamed from: L */
    public final ef3 f42204L;

    /* renamed from: M */
    public final ef3 f42205M;

    /* renamed from: P */
    public final y12 f42206P;

    /* renamed from: k */
    public final ef3 f42207k;

    /* renamed from: r */
    public final ef3 f42208r;

    /* renamed from: s */
    public ya2 f42209s;

    /* renamed from: x */
    public ProgressLoading f42210x;

    /* renamed from: y */
    public final List<String> f42211y = new ArrayList();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwitchWalletFragment$a", "Lwo2$a;", "Lr37;", "b", "", "errorCode", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwitchWalletFragment$a */
    /* compiled from: SwitchWalletFragment.kt */
    public static final class C8475a implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ SwitchWalletFragment f42212a;

        /* renamed from: b */
        public final /* synthetic */ Wallet f42213b;

        public C8475a(SwitchWalletFragment switchWalletFragment, Wallet wallet2) {
            this.f42212a = switchWalletFragment;
            this.f42213b = wallet2;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            this.f42212a.mo57814g0(this.f42213b);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwitchWalletFragment$b", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "Lr37;", "onSuccess", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwitchWalletFragment$b */
    /* compiled from: SwitchWalletFragment.kt */
    public static final class C8476b implements G2FAVerfication.C8290b {

        /* renamed from: a */
        public final /* synthetic */ SwitchWalletFragment f42214a;

        /* renamed from: b */
        public final /* synthetic */ Wallet f42215b;

        public C8476b(SwitchWalletFragment switchWalletFragment, Wallet wallet2) {
            this.f42214a = switchWalletFragment;
            this.f42215b = wallet2;
        }

        /* renamed from: a */
        public void mo56967a() {
            dq6.f37375a.mo51267e("Khang").mo51264a("G2FAVerificationCallback onError() called", new Object[0]);
        }

        public void onSuccess() {
            if (this.f42214a.mo57827u0()) {
                y12 O = this.f42214a.f42206P;
                SwitchWalletFragment switchWalletFragment = this.f42214a;
                O.mo66749a(switchWalletFragment, switchWalletFragment.mo57807Q0(this.f42215b));
                return;
            }
            this.f42214a.mo57797G0(this.f42215b);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwitchWalletFragment$c", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "Lr37;", "onSuccess", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwitchWalletFragment$c */
    /* compiled from: SwitchWalletFragment.kt */
    public static final class C8477c implements G2FAVerfication.C8290b {

        /* renamed from: a */
        public final /* synthetic */ SwitchWalletFragment f42216a;

        /* renamed from: b */
        public final /* synthetic */ Wallet f42217b;

        public C8477c(SwitchWalletFragment switchWalletFragment, Wallet wallet2) {
            this.f42216a = switchWalletFragment;
            this.f42217b = wallet2;
        }

        /* renamed from: a */
        public void mo56967a() {
            dq6.f37375a.mo51267e("Khang").mo51264a("G2FAVerificationCallback onError() called", new Object[0]);
        }

        public void onSuccess() {
            if (this.f42216a.mo57827u0()) {
                y12 O = this.f42216a.f42206P;
                SwitchWalletFragment switchWalletFragment = this.f42216a;
                O.mo66749a(switchWalletFragment, switchWalletFragment.mo57815h0(this.f42217b));
                return;
            }
            this.f42216a.mo57814g0(this.f42217b);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwitchWalletFragment$d", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "Lr37;", "onSuccess", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwitchWalletFragment$d */
    /* compiled from: SwitchWalletFragment.kt */
    public static final class C8478d implements G2FAVerfication.C8290b {

        /* renamed from: a */
        public final /* synthetic */ SwitchWalletFragment f42218a;

        public C8478d(SwitchWalletFragment switchWalletFragment) {
            this.f42218a = switchWalletFragment;
        }

        /* renamed from: a */
        public void mo56967a() {
            dq6.f37375a.mo51267e("Khang").mo51264a("G2FAVerificationCallback onError() called", new Object[0]);
        }

        public void onSuccess() {
            if (this.f42218a.mo57827u0()) {
                y12 O = this.f42218a.f42206P;
                SwitchWalletFragment switchWalletFragment = this.f42218a;
                O.mo66749a(switchWalletFragment, switchWalletFragment.mo57823p0());
                return;
            }
            this.f42218a.mo57817j0();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwitchWalletFragment$e", "Lwo2$a;", "Lr37;", "b", "", "errorCode", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwitchWalletFragment$e */
    /* compiled from: SwitchWalletFragment.kt */
    public static final class C8479e implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ SwitchWalletFragment f42219a;

        public C8479e(SwitchWalletFragment switchWalletFragment) {
            this.f42219a = switchWalletFragment;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            this.f42219a.mo57817j0();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0001\u0018\u00010\u0004H\u0016¨\u0006\t"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwitchWalletFragment$f", "Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "viewHolder", "", "Lnet/safemoon/androidwallet/views/gesture/WalletRecyclerItemSwipeHelper$c;", "itemActionButtons", "Lr37;", "n", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwitchWalletFragment$f */
    /* compiled from: SwitchWalletFragment.kt */
    public static final class C8480f extends WalletRecyclerItemSwipeHelper {

        /* renamed from: k */
        public final /* synthetic */ SwitchWalletFragment f42220k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8480f(SwitchWalletFragment switchWalletFragment, Context context, RecyclerView recyclerView, d24 d24, SwitchWalletFragment$setupItemActions$2 switchWalletFragment$setupItemActions$2) {
            super(context, switchWalletFragment$setupItemActions$2, recyclerView, d24);
            this.f42220k = switchWalletFragment;
            vx2.m53590f(context, "requireContext()");
        }

        /* renamed from: n */
        public void mo57830n(RecyclerView.C1231a0 a0Var, List<WalletRecyclerItemSwipeHelper.C8963c> list) {
            vx2.m53588d(list);
            list.add(new WalletRecyclerItemSwipeHelper.C8963c(uf5.m28223f(this.f42220k.getResources(), R.drawable.ic_baseline_delete_24, (Resources.Theme) null), new ColorDrawable(uf5.m28221d(this.f42220k.getResources(), R.color.red, (Resources.Theme) null))));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwitchWalletFragment$g", "Lwo2$a;", "Lr37;", "b", "", "errorCode", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SwitchWalletFragment$g */
    /* compiled from: SwitchWalletFragment.kt */
    public static final class C8481g implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ SwitchWalletFragment f42221a;

        /* renamed from: b */
        public final /* synthetic */ Wallet f42222b;

        public C8481g(SwitchWalletFragment switchWalletFragment, Wallet wallet2) {
            this.f42221a = switchWalletFragment;
            this.f42222b = wallet2;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            this.f42221a.mo57797G0(this.f42222b);
        }
    }

    public SwitchWalletFragment() {
        Class<MultiWalletViewModel> cls = MultiWalletViewModel.class;
        SwitchWalletFragment$special$$inlined$viewModels$default$1 switchWalletFragment$special$$inlined$viewModels$default$1 = new SwitchWalletFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ef3 b = C6169a.m47233b(lazyThreadSafetyMode, new SwitchWalletFragment$special$$inlined$viewModels$default$2(switchWalletFragment$special$$inlined$viewModels$default$1));
        this.f42207k = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(cls), new SwitchWalletFragment$special$$inlined$viewModels$default$3(b), new SwitchWalletFragment$special$$inlined$viewModels$default$4((pc2) null, b), new SwitchWalletFragment$special$$inlined$viewModels$default$5(this, b));
        ef3 b2 = C6169a.m47233b(lazyThreadSafetyMode, new SwitchWalletFragment$special$$inlined$viewModels$default$7(new SwitchWalletFragment$special$$inlined$viewModels$default$6(this)));
        this.f42208r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(cls), new SwitchWalletFragment$special$$inlined$viewModels$default$8(b2), new SwitchWalletFragment$special$$inlined$viewModels$default$9((pc2) null, b2), new SwitchWalletFragment$special$$inlined$viewModels$default$10(this, b2));
        ef3 b3 = C6169a.m47233b(lazyThreadSafetyMode, new SwitchWalletFragment$special$$inlined$viewModels$default$12(new SwitchWalletFragment$special$$inlined$viewModels$default$11(this)));
        this.f42204L = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(AKTWebSocketHandlingViewModel.class), new SwitchWalletFragment$special$$inlined$viewModels$default$13(b3), new SwitchWalletFragment$special$$inlined$viewModels$default$14((pc2) null, b3), new SwitchWalletFragment$special$$inlined$viewModels$default$15(this, b3));
        this.f42205M = C6169a.m47232a(new SwitchWalletFragment$isBioAuth$2(this));
        this.f42206P = new y12();
    }

    /* renamed from: A0 */
    public static final void m67382A0(SwitchWalletFragment switchWalletFragment, View view) {
        vx2.m53591g(switchWalletFragment, "this$0");
        switchWalletFragment.requireActivity().onBackPressed();
    }

    /* renamed from: B0 */
    public static final void m67384B0(SwitchWalletFragment switchWalletFragment, View view) {
        vx2.m53591g(switchWalletFragment, "this$0");
        switchWalletFragment.startActivity(new Intent(switchWalletFragment.requireActivity(), MainActivity.class));
    }

    /* renamed from: C0 */
    public static final void m67386C0(SwitchWalletFragment switchWalletFragment, View view) {
        vx2.m53591g(switchWalletFragment, "this$0");
        switchWalletFragment.mo57803M0();
    }

    /* renamed from: D0 */
    public static final void m67388D0(SwitchWalletFragment switchWalletFragment, View view) {
        vx2.m53591g(switchWalletFragment, "this$0");
        switchWalletFragment.mo57802L0();
    }

    /* renamed from: E0 */
    public static final void m67390E0(ya2 ya2, SwitchWalletFragment switchWalletFragment) {
        vx2.m53591g(ya2, "$this_apply");
        vx2.m53591g(switchWalletFragment, "this$0");
        ya2.f35831e.setRefreshing(false);
        switchWalletFragment.mo57802L0();
    }

    /* renamed from: t0 */
    public static final void m67416t0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m67421x0(SwitchWalletFragment switchWalletFragment, List list) {
        vx2.m53591g(switchWalletFragment, "this$0");
        FragmentActivity activity = switchWalletFragment.getActivity();
        if (activity != null) {
            d24 d24 = null;
            if (g06.f37938a.mo51834c(activity) || list.size() == 1) {
                d24 d242 = switchWalletFragment.f42203I;
                if (d242 == null) {
                    vx2.m53605u("myAdapter");
                } else {
                    d24 = d242;
                }
                vx2.m53590f(list, "it");
                d24.mo51040g(list);
            } else {
                d24 d243 = switchWalletFragment.f42203I;
                if (d243 == null) {
                    vx2.m53605u("myAdapter");
                } else {
                    d24 = d243;
                }
                vx2.m53590f(list, "it");
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    if (!((Wallet) next).isPrimaryWallet()) {
                        arrayList.add(next);
                    }
                }
                d24.mo51040g(arrayList);
            }
            ya2 ya2 = switchWalletFragment.f42209s;
            if (ya2 != null) {
                g06 g06 = g06.f37938a;
                if (g06.mo51834c(activity) || list.size() <= 1) {
                    ya2.f35829c.setVisibility(8);
                    return;
                }
                ya2.f35829c.setVisibility(0);
                if (g06.mo51835d(activity)) {
                    ya2.f35828b.setImageResource(R.drawable.ic_wallets_link_all);
                    ya2.f35833g.setText(switchWalletFragment.getString(R.string.akt_switch_wallet_unlink_all_wallets));
                } else {
                    ya2.f35828b.setImageResource(R.drawable.ic_wallets_unlink_all);
                    ya2.f35833g.setText(switchWalletFragment.getString(R.string.akt_switch_wallet_link_all_wallets));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Wallet wallet2 = (Wallet) it.next();
                    if (wallet2.isPrimaryWallet()) {
                        ya2.f35828b.setOnClickListener(new vj6(switchWalletFragment, wallet2));
                        ya2.f35833g.setOnClickListener(new wj6(switchWalletFragment, wallet2));
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    /* renamed from: y0 */
    public static final void m67423y0(SwitchWalletFragment switchWalletFragment, Wallet wallet2, View view) {
        vx2.m53591g(switchWalletFragment, "this$0");
        vx2.m53591g(wallet2, "$masterWallet");
        switchWalletFragment.mo57806P0(wallet2);
    }

    /* renamed from: z0 */
    public static final void m67425z0(SwitchWalletFragment switchWalletFragment, Wallet wallet2, View view) {
        vx2.m53591g(switchWalletFragment, "this$0");
        vx2.m53591g(wallet2, "$masterWallet");
        switchWalletFragment.mo57806P0(wallet2);
    }

    /* renamed from: F0 */
    public final void mo57796F0(String str) {
        boolean z;
        if (!mo57828v0(str)) {
            Common common = Common.f42577a;
            Context requireContext = requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            String[] w = C2127d2.m14658w(common.mo60918y(requireContext, str), "|");
            vx2.m53590f(w, "parts");
            if (w.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str2 = w[0];
                vx2.m53590f(str2, "parts[0]");
                if (StringsKt__StringsKt.m63061B0(str2, new String[]{"="}, false, 0, 6, (Object) null).size() >= 2) {
                    String str3 = w[0];
                    vx2.m53590f(str3, "parts[0]");
                    String upperCase = ((String) StringsKt__StringsKt.m63061B0(str3, new String[]{"="}, false, 0, 6, (Object) null).get(1)).toUpperCase(Locale.ROOT);
                    vx2.m53590f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    mo57811d0();
                    if (vx2.m53586b(upperCase, "PUTBLOB02")) {
                        ProgressLoading progressLoading = this.f42210x;
                        if (progressLoading != null) {
                            progressLoading.mo22266k();
                        }
                        Wallet wallet2 = this.f42202H;
                        if (wallet2 == null) {
                            return;
                        }
                        if (wallet2.isPrimaryWallet()) {
                            g06 g06 = g06.f37938a;
                            Context requireContext2 = requireContext();
                            vx2.m53590f(requireContext2, "requireContext()");
                            Context requireContext3 = requireContext();
                            vx2.m53590f(requireContext3, "requireContext()");
                            g06.mo51839h(requireContext2, !g06.mo51835d(requireContext3));
                            mo57808R0();
                            return;
                        }
                        wallet2.updateLinkedState(!wallet2.isLinked());
                        mo57821n0().mo61247F(wallet2, wallet2.getLinkedState(), new SwitchWalletFragment$parseMessage$1$1(this));
                    } else if (vx2.m53586b(upperCase, "GETBLOB02")) {
                        mo57811d0();
                        if (w.length > 2) {
                            String str4 = w[1];
                            vx2.m53590f(str4, "u5EncryptBlob");
                            if (!StringsKt__StringsKt.m63081R(str4, "BLOB=", false, 2, (Object) null) || !StringsKt__StringsKt.m63081R(str4, ">", false, 2, (Object) null)) {
                                ProgressLoading progressLoading2 = this.f42210x;
                                if (progressLoading2 != null) {
                                    progressLoading2.mo22266k();
                                    return;
                                }
                                return;
                            }
                            String a = C9377u.m72496a(getActivity(), ((String[]) StringsKt__StringsKt.m63061B0(str4, new String[]{">"}, false, 0, 6, (Object) null).toArray(new String[0]))[1]);
                            vx2.m53590f(a, "decryptedBlob");
                            mo57825r0(a);
                            return;
                        }
                        ProgressLoading progressLoading3 = this.f42210x;
                        if (progressLoading3 != null) {
                            progressLoading3.mo22266k();
                        }
                    } else {
                        mo57798H0();
                    }
                }
            }
        }
    }

    /* renamed from: G0 */
    public final void mo57797G0(Wallet wallet2) {
        g06 g06 = g06.f37938a;
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        if (!g06.mo51835d(requireContext) || !wallet2.isPrimaryWallet()) {
            mo57829w0(wallet2);
        } else {
            mo57812e0(wallet2);
        }
    }

    /* renamed from: H0 */
    public final void mo57798H0() {
        ProgressLoading progressLoading = this.f42210x;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
        C9001np.m69943a0(new WeakReference(getActivity()), (Integer) null, Integer.valueOf(R.string.akt_manage_wallets_link_wallet_error_message), 0, (pc2) null, 24, (Object) null);
    }

    /* renamed from: I0 */
    public final void mo57799I0(String str) {
        if (str != null) {
            mo57824q0().mo60956l(str);
        }
    }

    /* renamed from: J0 */
    public final void mo57800J0() {
        RecyclerView recyclerView;
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        FragmentActivity requireActivity = requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        d24 d24 = new d24(requireContext, ol0.m70351c(requireActivity), new SwitchWalletFragment$setupAdapter$1(this), new SwitchWalletFragment$setupAdapter$2(this), new SwitchWalletFragment$setupAdapter$3(this));
        this.f42203I = d24;
        ya2 ya2 = this.f42209s;
        if (ya2 != null) {
            recyclerView = ya2.f35830d;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(d24);
        }
        mo57801K0();
    }

    /* renamed from: K0 */
    public final void mo57801K0() {
        RecyclerView recyclerView;
        d24 d24;
        Context requireContext = requireContext();
        ya2 ya2 = this.f42209s;
        if (ya2 != null) {
            recyclerView = ya2.f35830d;
        } else {
            recyclerView = null;
        }
        vx2.m53588d(recyclerView);
        d24 d242 = this.f42203I;
        if (d242 == null) {
            vx2.m53605u("myAdapter");
            d24 = null;
        } else {
            d24 = d242;
        }
        new C8480f(this, requireContext, recyclerView, d24, new SwitchWalletFragment$setupItemActions$2(this));
    }

    /* renamed from: L0 */
    public final void mo57802L0() {
        C9001np.m69926K(new WeakReference(requireActivity()), Integer.valueOf(R.string.akt_switch_wallet_get_wallets_notice_title), R.string.akt_switch_wallet_get_wallets_notice_content, R.string.confirm, R.string.cancel, new SwitchWalletFragment$showGetWalletsNoticeDialog$1(this), SwitchWalletFragment$showGetWalletsNoticeDialog$2.INSTANCE);
    }

    /* renamed from: M0 */
    public final void mo57803M0() {
        C9001np.m69941Z(new WeakReference(getActivity()), Integer.valueOf(R.string.akt_manage_wallets_link_wallet_as_companions_dialog_header), Integer.valueOf(R.string.akt_manage_wallets_link_wallet_as_companions_dialog_content), R.string.acknowledgment_confirm_button_text, SwitchWalletFragment$showSafeMoonCompanionsInfoDialog$1.INSTANCE);
    }

    /* renamed from: N0 */
    public final void mo57804N0(Wallet wallet2) {
        if (f06.m57513d(requireContext(), "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication a = G2FAVerfication.f41732v0.mo57216a(mo57819l0(wallet2), mo57827u0());
            FragmentManager childFragmentManager = getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            a.mo57214K(childFragmentManager);
        } else if (mo57827u0()) {
            this.f42206P.mo66749a(this, mo57815h0(wallet2));
        } else {
            mo57814g0(wallet2);
        }
    }

    /* renamed from: O0 */
    public final void mo57805O0() {
        if (f06.m57513d(requireContext(), "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication a = G2FAVerfication.f41732v0.mo57216a(mo57820m0(), mo57827u0());
            FragmentManager childFragmentManager = getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            a.mo57214K(childFragmentManager);
        } else if (mo57827u0()) {
            this.f42206P.mo66749a(this, mo57823p0());
        } else {
            mo57817j0();
        }
    }

    /* renamed from: P0 */
    public final void mo57806P0(Wallet wallet2) {
        if (f06.m57513d(requireContext(), "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication a = G2FAVerfication.f41732v0.mo57216a(mo57818k0(wallet2), mo57827u0());
            FragmentManager childFragmentManager = getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            a.mo57214K(childFragmentManager);
        } else if (mo57827u0()) {
            this.f42206P.mo66749a(this, mo57807Q0(wallet2));
        } else {
            mo57797G0(wallet2);
        }
    }

    /* renamed from: Q0 */
    public final wo2.C9557a mo57807Q0(Wallet wallet2) {
        return new C8481g(this, wallet2);
    }

    /* renamed from: R0 */
    public final void mo57808R0() {
        g06 g06 = g06.f37938a;
        Context requireContext = requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        mo57822o0().mo61256r(new SwitchWalletFragment$updateAllWalletsLinkedStatus$1(this, g06.mo51835d(requireContext) ? 1 : 0));
    }

    /* renamed from: b0 */
    public final void mo57809b0(String str) {
        String str2;
        boolean z;
        boolean z2;
        String I;
        List B0 = StringsKt__StringsKt.m63061B0(str, new String[]{","}, false, 0, 6, (Object) null);
        if (B0.size() >= 3) {
            String e = C9377u.m72500e(getActivity(), (String) B0.get(2));
            if (e == null || (I = yb6.m74332I(e, "|", " ", false, 4, (Object) null)) == null) {
                str2 = null;
            } else {
                str2 = StringsKt__StringsKt.m63090V0(I).toString();
            }
            if (str2 != null) {
                if (str2.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    if (z && Mnemonic.isValid(str2)) {
                        HDWallet hDWallet = new HDWallet(str2, "");
                        CoinType coinType = CoinType.ETHEREUM;
                        String addressForCoin = hDWallet.getAddressForCoin(coinType);
                        byte[] data = hDWallet.getKeyForCoin(coinType).data();
                        vx2.m53590f(data, "secretPrivateKey.data()");
                        String e0 = ol0.m70356e0(data, false);
                        List<String> list = this.f42200B;
                        vx2.m53590f(addressForCoin, "addressEth");
                        list.add(addressForCoin);
                        this.f42201C.put(addressForCoin, B0.get(0));
                        MultiWalletViewModel o0 = mo57822o0();
                        vx2.m53590f(e, "mnemonic");
                        MultiWalletViewModel.m68673p(o0, e0, addressForCoin, e, (String) B0.get(0), false, false, new SwitchWalletFragment$addWalletToDatabase$1(this), 32, (Object) null);
                        return;
                    }
                }
            }
            z = false;
            HDWallet hDWallet2 = new HDWallet(str2, "");
            CoinType coinType2 = CoinType.ETHEREUM;
            String addressForCoin2 = hDWallet2.getAddressForCoin(coinType2);
            byte[] data2 = hDWallet2.getKeyForCoin(coinType2).data();
            vx2.m53590f(data2, "secretPrivateKey.data()");
            String e02 = ol0.m70356e0(data2, false);
            List<String> list2 = this.f42200B;
            vx2.m53590f(addressForCoin2, "addressEth");
            list2.add(addressForCoin2);
            this.f42201C.put(addressForCoin2, B0.get(0));
            MultiWalletViewModel o02 = mo57822o0();
            vx2.m53590f(e, "mnemonic");
            MultiWalletViewModel.m68673p(o02, e02, addressForCoin2, e, (String) B0.get(0), false, false, new SwitchWalletFragment$addWalletToDatabase$1(this), 32, (Object) null);
            return;
        }
        if (B0.size() >= 2) {
            String str3 = (String) B0.get(1);
            cw0 create = cw0.create(str3);
            List<String> list3 = this.f42200B;
            String address = create.getAddress();
            vx2.m53590f(address, "credential.address");
            list3.add(address);
            Map<String, String> map = this.f42201C;
            String address2 = create.getAddress();
            vx2.m53590f(address2, "credential.address");
            map.put(address2, B0.get(0));
            MultiWalletViewModel o03 = mo57822o0();
            String address3 = create.getAddress();
            vx2.m53590f(address3, "credential.address");
            MultiWalletViewModel.m68673p(o03, str3, address3, "", (String) B0.get(0), false, false, new SwitchWalletFragment$addWalletToDatabase$2(this), 32, (Object) null);
            return;
        }
        int i = this.f42199A + 1;
        this.f42199A = i;
        if (i >= this.f42211y.size()) {
            mo57816i0();
        } else {
            mo57809b0(this.f42211y.get(this.f42199A));
        }
    }

    /* renamed from: c0 */
    public final void mo57810c0() {
        mo57822o0().mo61256r(new SwitchWalletFragment$checkLinkedAllStatus$1(this));
    }

    /* renamed from: d0 */
    public final void mo57811d0() {
        mo57824q0().mo60951g();
    }

    /* renamed from: e0 */
    public final void mo57812e0(Wallet wallet2) {
        C9001np.m69926K(new WeakReference(requireActivity()), Integer.valueOf(R.string.akt_switch_wallet_unlink_all_wallets), R.string.akt_manage_wallets_unlink_all_wallets_content, R.string.confirm, R.string.cancel, new SwitchWalletFragment$confirmUnlinkAllWallets$1(this, wallet2), SwitchWalletFragment$confirmUnlinkAllWallets$2.INSTANCE);
    }

    /* renamed from: f0 */
    public final String mo57813f0(String str) {
        String i = f06.m57518i(getActivity(), "U5");
        String g0 = AKTServerFunctions.m12039g0(getActivity(), i + ">" + str);
        vx2.m53590f(g0, "putBlob(activity, newBlob)");
        return g0;
    }

    /* renamed from: g0 */
    public final void mo57814g0(Wallet wallet2) {
        mo57821n0().mo61255q(wallet2);
        if (wallet2.isLinked()) {
            mo57829w0(wallet2);
        } else {
            mo57810c0();
        }
    }

    /* renamed from: h0 */
    public final wo2.C9557a mo57815h0(Wallet wallet2) {
        return new C8475a(this, wallet2);
    }

    /* renamed from: i0 */
    public final void mo57816i0() {
        mo57822o0().mo61256r(new SwitchWalletFragment$finishHandleBlob$1(this));
        ProgressLoading progressLoading = this.f42210x;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
    }

    /* renamed from: j0 */
    public final void mo57817j0() {
        boolean z;
        ProgressLoading progressLoading = this.f42210x;
        if (progressLoading == null || progressLoading.isResumed()) {
            z = false;
        } else {
            z = true;
        }
        if (z || this.f42210x == null) {
            ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
            String string = getString(R.string.loading);
            vx2.m53590f(string, "getString(R.string.loading)");
            ProgressLoading a = aVar.mo57297a(false, string, "");
            this.f42210x = a;
            if (a != null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                vx2.m53590f(childFragmentManager, "childFragmentManager");
                a.mo57295D(childFragmentManager);
            }
        }
        mo57799I0(AKTServerFunctions.m12038a0(getActivity()));
    }

    /* renamed from: k0 */
    public final G2FAVerfication.C8290b mo57818k0(Wallet wallet2) {
        return new C8476b(this, wallet2);
    }

    /* renamed from: l0 */
    public final G2FAVerfication.C8290b mo57819l0(Wallet wallet2) {
        return new C8477c(this, wallet2);
    }

    /* renamed from: m0 */
    public final G2FAVerfication.C8290b mo57820m0() {
        return new C8478d(this);
    }

    /* renamed from: n0 */
    public final MultiWalletViewModel mo57821n0() {
        return (MultiWalletViewModel) this.f42207k.getValue();
    }

    /* renamed from: o0 */
    public final MultiWalletViewModel mo57822o0() {
        return (MultiWalletViewModel) this.f42208r.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
        FragmentActivity requireActivity = requireActivity();
        vx2.m53589e(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) requireActivity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        mo57824q0().mo60957m();
        mo57826s0();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        ya2 a = ya2.m54668a(layoutInflater.inflate(R.layout.fragment_switch_wallet, viewGroup, false));
        this.f42209s = a;
        if (a != null) {
            return a.mo49619b();
        }
        return null;
    }

    public void onResume() {
        super.onResume();
        mo57810c0();
    }

    public void onViewCreated(View view, Bundle bundle) {
        ConstraintLayout constraintLayout;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        ya2 ya2 = this.f42209s;
        if (ya2 != null) {
            ya2.f35830d.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
            ur6 ur6 = ya2.f35832f;
            ur6.f34686d.setOnClickListener(new pj6(this));
            ur6.f34688f.setText(R.string.switch_wallet_screen_title);
            ur6.f34685c.setOnClickListener(new qj6(this));
            ur6.f34684b.setOnClickListener(new rj6(this));
            ur6.f34687e.setOnClickListener(new sj6(this));
            ya2.f35831e.setOnRefreshListener(new tj6(ya2, this));
        }
        mo57800J0();
        ya2 ya22 = this.f42209s;
        if (ya22 != null) {
            constraintLayout = ya22.f35829c;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        mo57821n0().mo61261w().observe(requireActivity(), new t05(new uj6(this)));
    }

    /* renamed from: p0 */
    public final wo2.C9557a mo57823p0() {
        return new C8479e(this);
    }

    /* renamed from: q0 */
    public final AKTWebSocketHandlingViewModel mo57824q0() {
        return (AKTWebSocketHandlingViewModel) this.f42204L.getValue();
    }

    /* renamed from: r0 */
    public final void mo57825r0(String str) {
        this.f42211y.clear();
        this.f42200B.clear();
        this.f42201C.clear();
        this.f42211y.addAll(StringsKt__StringsKt.m63061B0(str, new String[]{"|"}, false, 0, 6, (Object) null));
        this.f42199A = 0;
        if (!this.f42211y.isEmpty()) {
            mo57809b0(this.f42211y.get(this.f42199A));
        }
    }

    /* renamed from: s0 */
    public final void mo57826s0() {
        mo57824q0().mo60953i().observe(this, new oj6(new SwitchWalletFragment$initReceiveResponse$1(this)));
    }

    /* renamed from: u0 */
    public final boolean mo57827u0() {
        return ((Boolean) this.f42205M.getValue()).booleanValue();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo57828v0(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0014
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = "ROOT"
            p000.vx2.m53590f(r1, r2)
            java.lang.String r4 = r4.toUpperCase(r1)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(locale)"
            p000.vx2.m53590f(r4, r1)
            goto L_0x0015
        L_0x0014:
            r4 = r0
        L_0x0015:
            java.lang.String r1 = "CONNECTION_REFUSED"
            boolean r4 = p000.vx2.m53586b(r4, r1)
            if (r4 == 0) goto L_0x0038
            net.safemoon.androidwallet.dialogs.ProgressLoading r1 = r3.f42210x
            if (r1 == 0) goto L_0x0024
            r1.mo22266k()
        L_0x0024:
            r3.mo57811d0()
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            boolean r2 = r1 instanceof net.safemoon.androidwallet.activity.common.BasicActivity
            if (r2 == 0) goto L_0x0032
            r0 = r1
            net.safemoon.androidwallet.activity.common.BasicActivity r0 = (net.safemoon.androidwallet.activity.common.BasicActivity) r0
        L_0x0032:
            if (r0 == 0) goto L_0x0038
            r1 = 0
            r0.mo57001Q(r1)
        L_0x0038:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.SwitchWalletFragment.mo57828v0(java.lang.String):boolean");
    }

    /* renamed from: w0 */
    public final void mo57829w0(Wallet wallet2) {
        this.f42202H = wallet2;
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        this.f42210x = a;
        if (a != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            a.mo57295D(childFragmentManager);
        }
        mo57822o0().mo61256r(new SwitchWalletFragment$makeBlobFromWallets$1(wallet2, this, new StringBuilder()));
    }
}
