package net.safemoon.androidwallet.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.creageek.segmentedbutton.SegmentedButton;
import com.google.android.material.button.MaterialButton;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.AnchorSwitchWallet;
import net.safemoon.androidwallet.domain.listener.dalog.OnSelectTokenTypeClickListener;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;
import net.safemoon.androidwallet.viewmodels.SelectFiatViewModel;
import p000.ft4;
import p000.xi7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bP\u0010QJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103R\u001d\u00109\u001a\u0004\u0018\u0001058BX\u0002¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0002¢\u0006\f\n\u0004\bL\u0010'\u001a\u0004\bM\u0010N\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/WalletFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "root", "Lr37;", "J", "K", "S", "c0", "(Lns0;)Ljava/lang/Object;", "view", "d0", "", "R", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "onResume", "v", "onClick", "Landroid/content/Context;", "context", "onAttach", "onPause", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Lkb2;", "k", "Lkb2;", "binding", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "r", "Lef3;", "L", "()Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "homeViewModel", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "s", "O", "()Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "myTokenListViewModel", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "x", "N", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "Lho2;", "y", "M", "()Lho2;", "iHomeActivity", "Lob4;", "A", "P", "()Lob4;", "notificationHistoryViewModel", "Lbi0;", "B", "Lbi0;", "coinPagingAdapter", "Lxi7;", "C", "Lxi7;", "myTokenListAdapter", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "H", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "onSelectTokenTypeClickListener", "Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "I", "Q", "()Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "selectFiatViewModel", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletFragment.kt */
public final class WalletFragment extends BaseMainFragment implements View.OnClickListener {

    /* renamed from: A */
    public final ef3 f42275A;

    /* renamed from: B */
    public bi0 f42276B;

    /* renamed from: C */
    public xi7 f42277C;

    /* renamed from: H */
    public OnSelectTokenTypeClickListener f42278H;

    /* renamed from: I */
    public final ef3 f42279I;

    /* renamed from: k */
    public kb2 f42280k;

    /* renamed from: r */
    public final ef3 f42281r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(HomeViewModel.class), new WalletFragment$special$$inlined$activityViewModels$default$1(this), new WalletFragment$special$$inlined$activityViewModels$default$2((pc2) null, this), new WalletFragment$special$$inlined$activityViewModels$default$3(this));

    /* renamed from: s */
    public final ef3 f42282s = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MyTokensListViewModel.class), new WalletFragment$special$$inlined$activityViewModels$default$4(this), new WalletFragment$special$$inlined$activityViewModels$default$5((pc2) null, this), new WalletFragment$myTokenListViewModel$2(this));

    /* renamed from: x */
    public final ef3 f42283x;

    /* renamed from: y */
    public final ef3 f42284y;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.fragments.WalletFragment$a */
    /* compiled from: WalletFragment.kt */
    public /* synthetic */ class C8511a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42285a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                net.safemoon.androidwallet.common.TokenType[] r0 = net.safemoon.androidwallet.common.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.ERC_20     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.BEP_20     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.POLYGON     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f42285a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.WalletFragment.C8511a.<clinit>():void");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/WalletFragment$b", "Lxi7$a;", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.WalletFragment$b */
    /* compiled from: WalletFragment.kt */
    public static final class C8512b implements xi7.C9598a {

        /* renamed from: a */
        public final /* synthetic */ WalletFragment f42286a;

        public C8512b(WalletFragment walletFragment) {
            this.f42286a = walletFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[EDGE_INSN: B:18:0x005f->B:13:0x005f ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo57942a(net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel r9) {
            /*
                r8 = this;
                java.lang.String r0 = "item"
                p000.vx2.m53591g(r9, r0)
                net.safemoon.androidwallet.fragments.WalletFragment r0 = r8.f42286a
                net.safemoon.androidwallet.viewmodels.MyTokensListViewModel r0 = r0.mo57934O()
                java.util.ArrayList r0 = r0.mo61294F()
                int r1 = r0.size()
                java.util.ListIterator r0 = r0.listIterator(r1)
            L_0x0017:
                boolean r1 = r0.hasPrevious()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x005e
                java.lang.Object r1 = r0.previous()
                r4 = r1
                net.safemoon.androidwallet.model.swap.Swap r4 = (net.safemoon.androidwallet.model.swap.Swap) r4
                java.lang.Integer r5 = r4.chainId
                int r6 = r9.getChainId()
                if (r5 != 0) goto L_0x002f
                goto L_0x005a
            L_0x002f:
                int r5 = r5.intValue()
                if (r5 != r6) goto L_0x005a
                java.lang.String r4 = r4.address
                java.lang.String r5 = "swap.address"
                p000.vx2.m53590f(r4, r5)
                java.util.Locale r5 = java.util.Locale.ROOT
                java.lang.String r4 = r4.toLowerCase(r5)
                java.lang.String r6 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                p000.vx2.m53590f(r4, r6)
                java.lang.String r7 = r9.getContractAddress()
                java.lang.String r5 = r7.toLowerCase(r5)
                p000.vx2.m53590f(r5, r6)
                boolean r4 = p000.vx2.m53586b(r4, r5)
                if (r4 == 0) goto L_0x005a
                r4 = r2
                goto L_0x005b
            L_0x005a:
                r4 = r3
            L_0x005b:
                if (r4 == 0) goto L_0x0017
                goto L_0x005f
            L_0x005e:
                r1 = 0
            L_0x005f:
                net.safemoon.androidwallet.model.swap.Swap r1 = (net.safemoon.androidwallet.model.swap.Swap) r1
                if (r1 == 0) goto L_0x0064
                goto L_0x0065
            L_0x0064:
                r2 = r3
            L_0x0065:
                r9.setAllowSwap(r2)
                net.safemoon.androidwallet.fragments.WalletFragment r0 = r8.f42286a
                vh7$b r9 = p000.vh7.m73247h(r9)
                java.lang.String r1 = "actionNavigationWalletTo…sferHistoryFragment(item)"
                p000.vx2.m53590f(r9, r1)
                r0.mo50753j(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.WalletFragment.C8512b.mo57942a(net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel):void");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/WalletFragment$c", "Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "Lnet/safemoon/androidwallet/common/TokenType;", "c", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.WalletFragment$c */
    /* compiled from: WalletFragment.kt */
    public static final class C8513c extends OnSelectTokenTypeClickListener {

        /* renamed from: r */
        public final /* synthetic */ WalletFragment f42287r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8513c(WalletFragment walletFragment, C8514d dVar, WeakReference<Activity> weakReference, Map<String, ? extends TokenType> map) {
            super(dVar, weakReference, map);
            this.f42287r = walletFragment;
        }

        /* renamed from: c */
        public TokenType mo57366c() {
            Context requireContext = this.f42287r.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            return ol0.m70355e(requireContext);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/WalletFragment$d", "Lft4$a;", "Lnet/safemoon/androidwallet/common/TokenType;", "token", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.WalletFragment$d */
    /* compiled from: WalletFragment.kt */
    public static final class C8514d implements ft4.C7102a {

        /* renamed from: a */
        public final /* synthetic */ kb2 f42288a;

        /* renamed from: b */
        public final /* synthetic */ WalletFragment f42289b;

        public C8514d(kb2 kb2, WalletFragment walletFragment) {
            this.f42288a = kb2;
            this.f42289b = walletFragment;
        }

        /* renamed from: a */
        public void mo51798a(TokenType tokenType) {
            int i;
            vx2.m53591g(tokenType, "token");
            TextView textView = this.f42288a.f30794o;
            if (tokenType == TokenType.MULTI_COIN) {
                i = R.string.your_coins;
            } else {
                i = R.string.your_token;
            }
            textView.setText(i);
            this.f42289b.mo57934O().mo61306T(tokenType);
            this.f42289b.mo57931L().mo61236r(tokenType);
            this.f42289b.mo57935P().mo62868h();
        }
    }

    public WalletFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new WalletFragment$special$$inlined$viewModels$default$2(new WalletFragment$special$$inlined$viewModels$default$1(this)));
        this.f42283x = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MultiWalletViewModel.class), new WalletFragment$special$$inlined$viewModels$default$3(b), new WalletFragment$special$$inlined$viewModels$default$4((pc2) null, b), new WalletFragment$special$$inlined$viewModels$default$5(this, b));
        this.f42284y = C6169a.m47232a(new WalletFragment$iHomeActivity$2(this));
        this.f42275A = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(ob4.class), new WalletFragment$special$$inlined$activityViewModels$default$7(this), new WalletFragment$special$$inlined$activityViewModels$default$8((pc2) null, this), new WalletFragment$special$$inlined$activityViewModels$default$9(this));
        this.f42279I = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SelectFiatViewModel.class), new WalletFragment$special$$inlined$activityViewModels$default$10(this), new WalletFragment$special$$inlined$activityViewModels$default$11((pc2) null, this), new WalletFragment$selectFiatViewModel$2(this));
    }

    /* renamed from: T */
    public static final void m67648T(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: U */
    public static final void m67649U(WalletFragment walletFragment, View view) {
        SwipeRefreshLayout swipeRefreshLayout;
        vx2.m53591g(walletFragment, "this$0");
        AnchorSwitchWallet anchorSwitchWallet = new AnchorSwitchWallet(walletFragment.mo57933N(), 0);
        Context requireContext = walletFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "it");
        kb2 kb2 = walletFragment.f42280k;
        if (kb2 != null) {
            swipeRefreshLayout = kb2.f30789j;
        } else {
            swipeRefreshLayout = null;
        }
        anchorSwitchWallet.mo57160h(requireContext, view, swipeRefreshLayout);
    }

    /* renamed from: V */
    public static final boolean m67650V(WalletFragment walletFragment, View view) {
        SwipeRefreshLayout swipeRefreshLayout;
        vx2.m53591g(walletFragment, "this$0");
        C7047eg egVar = new C7047eg(walletFragment.mo57934O());
        Context requireContext = walletFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53590f(view, "it");
        kb2 kb2 = walletFragment.f42280k;
        if (kb2 != null) {
            swipeRefreshLayout = kb2.f30789j;
        } else {
            swipeRefreshLayout = null;
        }
        egVar.mo51463f(requireContext, view, swipeRefreshLayout);
        return true;
    }

    /* renamed from: W */
    public static final void m67651W(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: X */
    public static final void m67652X(kb2 kb2, WalletFragment walletFragment) {
        vx2.m53591g(kb2, "$this_apply");
        vx2.m53591g(walletFragment, "this$0");
        kb2.f30789j.setRefreshing(false);
        TokenType value = walletFragment.mo57931L().mo61232n().getValue();
        if (value != null) {
            walletFragment.mo57934O().mo61307U();
            walletFragment.mo57934O().mo61306T(value);
            bi0 bi0 = walletFragment.f42276B;
            if (bi0 != null) {
                bi0.mo8737c();
            }
        }
    }

    /* renamed from: Y */
    public static final void m67653Y(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m67654Z(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m67655a0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m67656b0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: J */
    public final void mo57929J(View view) {
        RadioButton radioButton;
        TextView textView;
        TextView textView2;
        C5872go goVar;
        ImageView imageView;
        C5872go goVar2;
        ImageView imageView2;
        dj7 dj7;
        MaterialButton materialButton;
        dj7 dj72;
        MaterialButton materialButton2;
        dj7 dj73;
        MaterialButton materialButton3;
        C5872go goVar3;
        kb2 a = kb2.m46947a(view);
        this.f42280k = a;
        if (a == null || (goVar3 = a.f30783d) == null) {
            radioButton = null;
        } else {
            radioButton = goVar3.f29305i;
        }
        if (radioButton != null) {
            radioButton.setChecked(true);
        }
        kb2 kb2 = this.f42280k;
        if (!(kb2 == null || (dj73 = kb2.f30784e) == null || (materialButton3 = dj73.f28201d) == null)) {
            materialButton3.setOnClickListener(this);
        }
        kb2 kb22 = this.f42280k;
        if (!(kb22 == null || (dj72 = kb22.f30784e) == null || (materialButton2 = dj72.f28200c) == null)) {
            materialButton2.setOnClickListener(this);
        }
        kb2 kb23 = this.f42280k;
        if (!(kb23 == null || (dj7 = kb23.f30784e) == null || (materialButton = dj7.f28199b) == null)) {
            materialButton.setOnClickListener(this);
        }
        kb2 kb24 = this.f42280k;
        if (!(kb24 == null || (goVar2 = kb24.f30783d) == null || (imageView2 = goVar2.f29298b) == null)) {
            imageView2.setOnClickListener(this);
        }
        kb2 kb25 = this.f42280k;
        if (!(kb25 == null || (goVar = kb25.f30783d) == null || (imageView = goVar.f29299c) == null)) {
            imageView.setOnClickListener(this);
        }
        kb2 kb26 = this.f42280k;
        if (!(kb26 == null || (textView2 = kb26.f30792m) == null)) {
            textView2.setOnClickListener(this);
        }
        kb2 kb27 = this.f42280k;
        if (kb27 != null && (textView = kb27.f30793n) != null) {
            textView.setOnClickListener(this);
        }
    }

    /* renamed from: K */
    public final void mo57930K() {
        Float f;
        SegmentedButton segmentedButton;
        C5872go goVar;
        Resources resources;
        DisplayMetrics displayMetrics;
        boolean z = true;
        if (jo6.m20327a(Locale.getDefault()) != 1) {
            z = false;
        }
        if (z) {
            int i = Resources.getSystem().getDisplayMetrics().widthPixels;
            FragmentActivity activity = getActivity();
            ViewGroup.LayoutParams layoutParams = null;
            if (activity == null || (resources = activity.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                f = null;
            } else {
                f = Float.valueOf(displayMetrics.density);
            }
            vx2.m53588d(f);
            int b = i - ap3.m31899b(((float) 85) * f.floatValue());
            kb2 kb2 = this.f42280k;
            if (kb2 == null || (goVar = kb2.f30783d) == null) {
                segmentedButton = null;
            } else {
                segmentedButton = goVar.f29306j;
            }
            if (segmentedButton != null) {
                layoutParams = segmentedButton.getLayoutParams();
            }
            if (layoutParams != null) {
                layoutParams.width = b;
            }
            if (segmentedButton != null) {
                segmentedButton.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: L */
    public final HomeViewModel mo57931L() {
        return (HomeViewModel) this.f42281r.getValue();
    }

    /* renamed from: M */
    public final ho2 mo57932M() {
        return (ho2) this.f42284y.getValue();
    }

    /* renamed from: N */
    public final MultiWalletViewModel mo57933N() {
        return (MultiWalletViewModel) this.f42283x.getValue();
    }

    /* renamed from: O */
    public final MyTokensListViewModel mo57934O() {
        return (MyTokensListViewModel) this.f42282s.getValue();
    }

    /* renamed from: P */
    public final ob4 mo57935P() {
        return (ob4) this.f42275A.getValue();
    }

    /* renamed from: Q */
    public final SelectFiatViewModel mo57936Q() {
        return (SelectFiatViewModel) this.f42279I.getValue();
    }

    /* renamed from: R */
    public final boolean mo57937R() {
        int i;
        TokenType value = mo57931L().mo61232n().getValue();
        if (value == null) {
            i = -1;
        } else {
            i = C8511a.f42285a[value.ordinal()];
        }
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public final void mo57938S() {
        dj7 dj7;
        TextView textView;
        dj7 dj72;
        TextView textView2;
        dj7 dj73;
        TextView textView3;
        kb2 kb2 = this.f42280k;
        if (!(kb2 == null || (dj73 = kb2.f30784e) == null || (textView3 = dj73.f28204g) == null)) {
            ol0.m70343W(textView3, new WalletFragment$observeViewModel$1(this));
        }
        kb2 kb22 = this.f42280k;
        if (!(kb22 == null || (dj72 = kb22.f30784e) == null || (textView2 = dj72.f28203f) == null)) {
            textView2.setOnClickListener(new rh7(this));
        }
        kb2 kb23 = this.f42280k;
        if (!(kb23 == null || (dj7 = kb23.f30784e) == null || (textView = dj7.f28204g) == null)) {
            textView.setOnLongClickListener(new sh7(this));
        }
        mo57934O().mo61298J().observe(getViewLifecycleOwner(), new th7(new WalletFragment$observeViewModel$4(this)));
    }

    /* renamed from: c0 */
    public final Object mo57939c0(ns0<? super r37> ns0) {
        Object i = e52.m57217i(mo57931L().mo61229k(), new WalletFragment$updateLatestCoinList$2(this, (ns0<? super WalletFragment$updateLatestCoinList$2>) null), ns0);
        if (i == wx2.m54101d()) {
            return i;
        }
        return r37.f33317a;
    }

    /* renamed from: d0 */
    public final void mo57940d0(View view) {
        String str;
        Wallet.Companion companion = Wallet.Companion;
        String j = f06.m57519j(getContext(), "SAFEMOON_ACTIVE_WALLET", "");
        vx2.m53590f(j, "getString(context, Share…FEMOON_ACTIVE_WALLET, \"\")");
        Wallet wallet2 = companion.toWallet(j);
        if (wallet2 != null) {
            str = wallet2.displayName();
        } else {
            str = null;
        }
        TextView textView = (TextView) view.findViewById(R.id.tvMainWallet);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
        ho2 M = mo57932M();
        if (M != null) {
            M.mo52262a();
        }
    }

    public void onClick(View view) {
        vx2.m53591g(view, "v");
        switch (view.getId()) {
            case R.id.btnBuy:
                az4.f36617a.mo50426e(new WeakReference(requireActivity()), mo57937R(), new WalletFragment$onClick$1(this), new WalletFragment$onClick$2(this), WalletFragment$onClick$3.INSTANCE);
                return;
            case R.id.btnReceive:
                j44 d = vh7.m73243d();
                vx2.m53590f(d, "actionNavigationWalletToReceiveFragment()");
                mo50753j(d);
                return;
            case R.id.btnSend:
                j44 e = vh7.m73244e();
                vx2.m53590f(e, "actionNavigationWalletToSendFragment()");
                mo50753j(e);
                return;
            case R.id.ivNotification:
                j44 c = vh7.m73242c();
                vx2.m53590f(c, "actionNavigationWalletTo…ficationHistoryFragment()");
                mo50753j(c);
                return;
            case R.id.ivTokenList:
            case R.id.tvSeeAll:
                j44 b = vh7.m73241b();
                vx2.m53590f(b, "actionNavigationWalletToMyTokensListFragment()");
                mo50753j(b);
                return;
            case R.id.tvSeeAllTokens:
                j44 a = vh7.m73240a();
                vx2.m53590f(a, "actionNavigationWalletToAllTokensListFragment()");
                mo50753j(a);
                return;
            default:
                return;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        vx2.m53591g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_wallet, viewGroup, false);
        vx2.m53590f(inflate, "root");
        mo57929J(inflate);
        return inflate;
    }

    public void onPause() {
        super.onPause();
        OnSelectTokenTypeClickListener onSelectTokenTypeClickListener = this.f42278H;
        if (onSelectTokenTypeClickListener != null) {
            onSelectTokenTypeClickListener.mo57365b();
        }
    }

    public void onResume() {
        super.onResume();
        requireActivity().getWindow().addFlags(Integer.MIN_VALUE);
        requireActivity().getWindow().setStatusBarColor(zr0.m31440c(requireActivity(), R.color.p1));
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        kb2 kb2 = this.f42280k;
        vx2.m53588d(kb2);
        SegmentedButton segmentedButton = kb2.f30783d.f29306j;
        vx2.m53590f(segmentedButton, "binding!!.lHeader.segmentedGroup");
        mo58057q(segmentedButton);
        mo57935P().mo62867g().observe(getViewLifecycleOwner(), new lh7(new WalletFragment$onViewCreated$1(this)));
        mo57935P().mo62868h();
        kb2 kb22 = this.f42280k;
        if (kb22 != null) {
            this.f42277C = new xi7(new C8512b(this));
            bi0 bi0 = new bi0(new WalletFragment$onViewCreated$2$2(this));
            this.f42276B = bi0;
            kb22.f30787h.setAdapter(bi0);
            kb22.f30787h.setHasFixedSize(true);
            kb22.f30787h.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
            kb22.f30788i.setAdapter(this.f42277C);
            TextView textView = kb22.f30794o;
            Context requireContext = requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            if (ol0.m70355e(requireContext) == TokenType.MULTI_COIN) {
                i = R.string.your_coins;
            } else {
                i = R.string.your_token;
            }
            textView.setText(i);
            C8513c cVar = new C8513c(this, new C8514d(kb22, this), new WeakReference(requireActivity()), mo57931L().mo61233o());
            this.f42278H = cVar;
            kb22.f30784e.f28202e.f21727b.setOnClickListener(cVar);
            kb22.f30789j.setOnRefreshListener(new mh7(kb22, this));
        }
        mo57938S();
        mo57930K();
        ug3 viewLifecycleOwner = getViewLifecycleOwner();
        vx2.m53590f(viewLifecycleOwner, "viewLifecycleOwner");
        vg3.m28804a(viewLifecycleOwner).mo6301b(new WalletFragment$onViewCreated$3(this, (ns0<? super WalletFragment$onViewCreated$3>) null));
        mo57931L().mo61232n().observe(getViewLifecycleOwner(), new nh7(new WalletFragment$onViewCreated$4(this)));
        mo57934O().mo61297I().observe(getViewLifecycleOwner(), new oh7(new WalletFragment$onViewCreated$5(this)));
        mo57931L().mo61232n().observe(getViewLifecycleOwner(), new ph7(new WalletFragment$onViewCreated$6(this)));
        mo57931L().mo61231m().observe(getViewLifecycleOwner(), new qh7(new WalletFragment$onViewCreated$7(this)));
        mo57940d0(view);
        Fiat.Companion companion = Fiat.Companion;
        String j = f06.m57519j(requireContext(), "DEFAULT_FIAT", companion.getDEFAULT_CURRENCY_STRING());
        vx2.m53590f(j, "getString(\n            r…CURRENCY_STRING\n        )");
        SelectFiatViewModel.m68799o(mo57936Q(), companion.mo58938to(j), false, (pc2) null, 6, (Object) null);
    }
}
