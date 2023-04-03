package net.safemoon.androidwallet.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.textview.MaterialTextView;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.GraphFragment;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment$transactionAdapter$2;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.model.common.PaymentMethod;
import net.safemoon.androidwallet.model.priceAlert.PAToken;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;
import net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel;
import p000.jv6;
import p000.rz1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\n*\u0001h\u0018\u0000 o2\u00020\u0001:\u0001pB\u0007¢\u0006\u0004\bm\u0010nJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003J\u001e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u001e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0003J\b\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J$\u0010&\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\b\u0010)\u001a\u00020\nH\u0016R\u0014\u0010,\u001a\u00020\u00068\u0002XD¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002XD¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058BX\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010AR'\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0C8BX\u0002¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0002¢\u0006\f\n\u0004\bK\u00107\u001a\u0004\bL\u0010MR\u001d\u0010R\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\bO\u00107\u001a\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020S8BX\u0002¢\u0006\f\n\u0004\b+\u00107\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0002¢\u0006\f\n\u0004\bX\u00107\u001a\u0004\bY\u0010ZR\u0016\u0010^\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010]R\u001f\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010b0a8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0002¢\u0006\f\n\u0004\bi\u00107\u001a\u0004\bj\u0010k¨\u0006q"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/TransferHistoryFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lnet/safemoon/androidwallet/model/common/PaymentMethod;", "paymentMethod", "", "currencyCode", "", "coinTypeValue", "", "isBuy", "Lr37;", "i0", "r0", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "token", "g0", "Landroid/view/View;", "anchor", "V0", "N0", "Q0", "selectedIndex", "", "Landroidx/appcompat/widget/AppCompatTextView;", "listHeader", "Z0", "listValueTxt", "Y0", "M0", "t0", "L0", "x0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "view", "onViewCreated", "onResume", "k", "I", "ZERO_COUNT", "", "r", "J", "DELAY", "Ldb2;", "s", "Ldb2;", "binding", "Lnet/safemoon/androidwallet/viewmodels/TransactionHistoryViewModel;", "x", "Lef3;", "o0", "()Lnet/safemoon/androidwallet/viewmodels/TransactionHistoryViewModel;", "transactionViewModel", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "y", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "currencyTokenInfo", "A", "q0", "()Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "userTokenItemDisplayModel", "Lz42;", "Lcl4;", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "B", "p0", "()Lz42;", "transferList", "Lnet/safemoon/androidwallet/common/TokenType;", "C", "m0", "()Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "H", "h0", "()Ljava/lang/String;", "address", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "l0", "()Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "myTokenListViewModel", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "L", "k0", "()Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "homeViewModel", "M", "Z", "isProceedingMoonPay", "P", "isGettingCheckoutUrl", "Lk04;", "Lnet/safemoon/androidwallet/model/Coin;", "Q", "Lk04;", "j0", "()Lk04;", "coinLiveData", "net/safemoon/androidwallet/fragments/TransferHistoryFragment$transactionAdapter$2$a", "U", "n0", "()Lnet/safemoon/androidwallet/fragments/TransferHistoryFragment$transactionAdapter$2$a;", "transactionAdapter", "<init>", "()V", "X", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment extends BaseMainFragment {

    /* renamed from: X */
    public static final C8498a f42249X = new C8498a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f42250A;

    /* renamed from: B */
    public final ef3 f42251B;

    /* renamed from: C */
    public final ef3 f42252C;

    /* renamed from: H */
    public final ef3 f42253H;

    /* renamed from: I */
    public final ef3 f42254I;

    /* renamed from: L */
    public final ef3 f42255L;

    /* renamed from: M */
    public boolean f42256M;

    /* renamed from: P */
    public boolean f42257P;

    /* renamed from: Q */
    public final k04<Coin> f42258Q;

    /* renamed from: U */
    public final ef3 f42259U;

    /* renamed from: k */
    public final int f42260k;

    /* renamed from: r */
    public final long f42261r = 100;

    /* renamed from: s */
    public db2 f42262s;

    /* renamed from: x */
    public final ef3 f42263x;

    /* renamed from: y */
    public CurrencyTokenInfo f42264y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/TransferHistoryFragment$a;", "", "", "ARG_USER_TOKEN_DISPLAY", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TransferHistoryFragment$a */
    /* compiled from: TransferHistoryFragment.kt */
    public static final class C8498a {
        public C8498a() {
        }

        public /* synthetic */ C8498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TransferHistoryFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new TransferHistoryFragment$special$$inlined$viewModels$default$2(new TransferHistoryFragment$special$$inlined$viewModels$default$1(this)));
        this.f42263x = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(TransactionHistoryViewModel.class), new TransferHistoryFragment$special$$inlined$viewModels$default$3(b), new TransferHistoryFragment$special$$inlined$viewModels$default$4((pc2) null, b), new TransferHistoryFragment$special$$inlined$viewModels$default$5(this, b));
        this.f42250A = C6169a.m47232a(new TransferHistoryFragment$userTokenItemDisplayModel$2(this));
        this.f42251B = C6169a.m47232a(new TransferHistoryFragment$transferList$2(this));
        this.f42252C = C6169a.m47232a(new TransferHistoryFragment$tokenType$2(this));
        this.f42253H = C6169a.m47232a(new TransferHistoryFragment$address$2(this));
        this.f42254I = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MyTokensListViewModel.class), new C8499xc1d72cef(this), new C8500xc1d72cf0((pc2) null, this), new TransferHistoryFragment$myTokenListViewModel$2(this));
        this.f42255L = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(HomeViewModel.class), new C8501xc1d72cf2(this), new C8502xc1d72cf3((pc2) null, this), new C8503xc1d72cf4(this));
        this.f42258Q = new k04<>(null);
        this.f42259U = C6169a.m47232a(new TransferHistoryFragment$transactionAdapter$2(this));
    }

    /* renamed from: A0 */
    public static final void m67527A0(TransferHistoryFragment transferHistoryFragment, View view) {
        String str;
        int i;
        TransferHistoryFragment transferHistoryFragment2 = transferHistoryFragment;
        vx2.m53591g(transferHistoryFragment2, "this$0");
        UserTokenItemDisplayModel q0 = transferHistoryFragment.mo57901q0();
        boolean z = false;
        String str2 = null;
        if (yb6.m74336M(q0.getSymbolWithType(), "CUSTOM_", false, 2, (Object) null)) {
            Integer n = xb6.m73916n(q0.getIconFile());
            if (n != null) {
                i = n.intValue();
            } else {
                i = transferHistoryFragment2.f42260k;
            }
            str = String.valueOf(i);
        } else if (vx2.m53586b(q0.getSymbol(), "SAFEMOON")) {
            str = "8757";
        } else {
            str = q0.getCmcId();
        }
        String str3 = str;
        w70 a = q70.m71185a(q0.getContractAddress(), q0.getSymbol());
        if (a != null) {
            str2 = a.mo66645d();
        }
        String str4 = str2;
        if (str3 != null) {
            if (str3.length() > 0) {
                z = true;
            }
            if (z && transferHistoryFragment2.f42258Q.getValue() != null) {
                GraphFragment d = GraphFragment.C8304b.m66165d(GraphFragment.f41756u1, q0.getName(), q0.getSymbol(), q0.getNativeBalance(), str3, str4, q0.getContractAddress(), 0, q0.getIconFile(), q0.getIconResId(), false, (String) null, 1600, (Object) null);
                FragmentManager childFragmentManager = transferHistoryFragment.getChildFragmentManager();
                vx2.m53590f(childFragmentManager, "childFragmentManager");
                d.mo57247M0(childFragmentManager);
                return;
            }
        }
        C9001np.m69943a0(new WeakReference(transferHistoryFragment.requireActivity()), (Integer) null, Integer.valueOf(R.string.token_not_listed_on_cmc), R.string.action_ok, (pc2) null, 16, (Object) null);
    }

    /* renamed from: B0 */
    public static final void m67529B0(TransferHistoryFragment transferHistoryFragment, View view) {
        String str;
        TransferHistoryFragment transferHistoryFragment2 = transferHistoryFragment;
        vx2.m53591g(transferHistoryFragment2, "this$0");
        UserTokenItemDisplayModel q0 = transferHistoryFragment.mo57901q0();
        w70 a = q70.m71185a(q0.getContractAddress(), q0.getSymbol());
        String str2 = null;
        if (a != null) {
            str = a.mo66645d();
        } else {
            str = null;
        }
        GraphFragment.C8304b bVar = GraphFragment.f41756u1;
        String name = q0.getName();
        String symbol = q0.getSymbol();
        double nativeBalance = q0.getNativeBalance();
        String contractAddress = q0.getContractAddress();
        String iconFile = q0.getIconFile();
        int iconResId = q0.getIconResId();
        CurrencyTokenInfo currencyTokenInfo = transferHistoryFragment2.f42264y;
        if (currencyTokenInfo != null) {
            str2 = currencyTokenInfo.getUrl();
        }
        GraphFragment d = GraphFragment.C8304b.m66165d(bVar, name, symbol, nativeBalance, (String) null, str, contractAddress, 0, iconFile, iconResId, true, str2, 64, (Object) null);
        FragmentManager childFragmentManager = transferHistoryFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        d.mo57247M0(childFragmentManager);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m67531C0(net.safemoon.androidwallet.fragments.TransferHistoryFragment r22, android.view.View r23) {
        /*
            r0 = r22
            java.lang.String r1 = "this$0"
            p000.vx2.m53591g(r0, r1)
            net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel r1 = r22.mo57901q0()
            java.lang.String r2 = r1.getSymbolWithType()
            java.lang.String r3 = "CUSTOM_"
            r4 = 0
            r5 = 2
            r6 = 0
            boolean r2 = p000.yb6.m74336M(r2, r3, r4, r5, r6)
            if (r2 == 0) goto L_0x0030
            java.lang.String r2 = r1.getIconFile()
            java.lang.Integer r2 = p000.xb6.m73916n(r2)
            if (r2 == 0) goto L_0x0029
            int r2 = r2.intValue()
            goto L_0x002b
        L_0x0029:
            int r2 = r0.f42260k
        L_0x002b:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L_0x003e
        L_0x0030:
            java.lang.String r2 = r1.getSymbol()
            java.lang.String r3 = "SAFEMOON"
            boolean r2 = p000.vx2.m53586b(r2, r3)
            if (r2 == 0) goto L_0x0040
            java.lang.String r2 = "8757"
        L_0x003e:
            r12 = r2
            goto L_0x0041
        L_0x0040:
            r12 = r6
        L_0x0041:
            java.lang.String r2 = r1.getContractAddress()
            java.lang.String r3 = r1.getSymbol()
            w70 r2 = p000.q70.m71185a(r2, r3)
            if (r2 == 0) goto L_0x0053
            java.lang.String r6 = r2.mo66645d()
        L_0x0053:
            r13 = r6
            net.safemoon.androidwallet.dialogs.GraphFragment$b r7 = net.safemoon.androidwallet.dialogs.GraphFragment.f41756u1
            java.lang.String r8 = r1.getName()
            java.lang.String r9 = r1.getSymbol()
            double r10 = r1.getNativeBalance()
            java.lang.String r14 = r1.getContractAddress()
            r15 = 0
            java.lang.String r16 = r1.getIconFile()
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 1856(0x740, float:2.601E-42)
            r21 = 0
            net.safemoon.androidwallet.dialogs.GraphFragment r1 = net.safemoon.androidwallet.dialogs.GraphFragment.C8304b.m66165d(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            androidx.fragment.app.FragmentManager r0 = r22.getChildFragmentManager()
            java.lang.String r2 = "childFragmentManager"
            p000.vx2.m53590f(r0, r2)
            r1.mo57247M0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.TransferHistoryFragment.m67531C0(net.safemoon.androidwallet.fragments.TransferHistoryFragment, android.view.View):void");
    }

    /* renamed from: D0 */
    public static final void m67533D0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m67535E0(TransferHistoryFragment transferHistoryFragment, UserTokenItemDisplayModel userTokenItemDisplayModel, View view) {
        vx2.m53591g(transferHistoryFragment, "this$0");
        vx2.m53591g(userTokenItemDisplayModel, "$it");
        az4.f36617a.mo50426e(new WeakReference(transferHistoryFragment.requireActivity()), ap2.m55613a(userTokenItemDisplayModel.getSymbolWithType()).mo67357e(), new TransferHistoryFragment$onViewCreated$1$1$2$1(transferHistoryFragment, userTokenItemDisplayModel), new TransferHistoryFragment$onViewCreated$1$1$2$2(transferHistoryFragment, userTokenItemDisplayModel), TransferHistoryFragment$onViewCreated$1$1$2$3.INSTANCE);
    }

    /* renamed from: F0 */
    public static final void m67537F0(TransferHistoryFragment transferHistoryFragment, View view) {
        vx2.m53591g(transferHistoryFragment, "this$0");
        if (transferHistoryFragment.f42264y != null) {
            transferHistoryFragment.mo57884L0();
            vx2.m53590f(view, "it");
            transferHistoryFragment.mo57886N0(view);
            return;
        }
        vx2.m53590f(view, "it");
        transferHistoryFragment.mo57888V0(view);
    }

    /* renamed from: G0 */
    public static final void m67539G0(TransferHistoryFragment transferHistoryFragment, UserTokenItemDisplayModel userTokenItemDisplayModel, View view) {
        Integer num;
        vx2.m53591g(transferHistoryFragment, "this$0");
        vx2.m53591g(userTokenItemDisplayModel, "$it");
        int chainId = userTokenItemDisplayModel.getChainId();
        String name = userTokenItemDisplayModel.getName();
        Context requireContext = transferHistoryFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        Object w = ol0.m70381w(requireContext, userTokenItemDisplayModel.getIconResId(), userTokenItemDisplayModel.getIconFile(), userTokenItemDisplayModel.getSymbol(), userTokenItemDisplayModel.getCmcId());
        String cmcId = userTokenItemDisplayModel.getCmcId();
        if (cmcId != null) {
            num = xb6.m73916n(cmcId);
        } else {
            num = null;
        }
        jv6.C7313a a = jv6.m59575a(new PAToken(chainId, name, userTokenItemDisplayModel.getSymbol(), userTokenItemDisplayModel.getContractAddress(), num, w, false, 64, (DefaultConstructorMarker) null));
        vx2.m53590f(a, "actionTransferHistoryFra…ss)\n                    )");
        transferHistoryFragment.mo50753j(a);
    }

    /* renamed from: H0 */
    public static final void m67541H0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: I0 */
    public static final void m67543I0(TransferHistoryFragment transferHistoryFragment, View view) {
        vx2.m53591g(transferHistoryFragment, "this$0");
        jv6.C7316d d = jv6.m59578d(transferHistoryFragment.mo57901q0());
        vx2.m53590f(d, "actionTransferHistoryFra…serTokenItemDisplayModel)");
        transferHistoryFragment.mo50753j(d);
    }

    /* renamed from: J0 */
    public static final void m67545J0(TransferHistoryFragment transferHistoryFragment, View view) {
        vx2.m53591g(transferHistoryFragment, "this$0");
        int chainId = transferHistoryFragment.mo57901q0().getChainId();
        String h0 = transferHistoryFragment.mo57892h0();
        vx2.m53588d(h0);
        jv6.C7315c c = jv6.m59577c(chainId, h0);
        vx2.m53590f(c, "actionTransferHistoryFra…s!!\n                    )");
        transferHistoryFragment.mo50753j(c);
    }

    /* renamed from: K0 */
    public static final void m67547K0(TransferHistoryFragment transferHistoryFragment, View view) {
        vx2.m53591g(transferHistoryFragment, "this$0");
        jv6.C7314b b = jv6.m59576b(transferHistoryFragment.mo57901q0());
        vx2.m53590f(b, "actionTransferHistoryFra…serTokenItemDisplayModel)");
        transferHistoryFragment.mo50753j(b);
    }

    /* renamed from: O0 */
    public static final void m67552O0(PopupWindow popupWindow, TransferHistoryFragment transferHistoryFragment, View view, View view2) {
        vx2.m53591g(popupWindow, "$popupWindow");
        vx2.m53591g(transferHistoryFragment, "this$0");
        vx2.m53591g(view, "$anchor");
        popupWindow.dismiss();
        transferHistoryFragment.mo57888V0(view);
    }

    /* renamed from: P0 */
    public static final void m67554P0(PopupWindow popupWindow, TransferHistoryFragment transferHistoryFragment, View view, View view2) {
        vx2.m53591g(popupWindow, "$popupWindow");
        vx2.m53591g(transferHistoryFragment, "this$0");
        vx2.m53591g(view, "$anchor");
        popupWindow.dismiss();
        transferHistoryFragment.mo57887Q0(view);
    }

    /* renamed from: R0 */
    public static final void m67557R0(Ref$IntRef ref$IntRef, TransferHistoryFragment transferHistoryFragment, List list, List list2, View view) {
        vx2.m53591g(ref$IntRef, "$selectedIndex");
        vx2.m53591g(transferHistoryFragment, "this$0");
        vx2.m53591g(list, "$listHeader");
        vx2.m53591g(list2, "$listValueTxt");
        ref$IntRef.element = 0;
        transferHistoryFragment.mo57890Z0(0, list);
        transferHistoryFragment.mo57889Y0(0, list2);
    }

    /* renamed from: S0 */
    public static final void m67559S0(Ref$IntRef ref$IntRef, TransferHistoryFragment transferHistoryFragment, List list, List list2, View view) {
        vx2.m53591g(ref$IntRef, "$selectedIndex");
        vx2.m53591g(transferHistoryFragment, "this$0");
        vx2.m53591g(list, "$listHeader");
        vx2.m53591g(list2, "$listValueTxt");
        ref$IntRef.element = 1;
        transferHistoryFragment.mo57890Z0(1, list);
        transferHistoryFragment.mo57889Y0(1, list2);
    }

    /* renamed from: T0 */
    public static final void m67561T0(Ref$IntRef ref$IntRef, TransferHistoryFragment transferHistoryFragment, List list, List list2, View view) {
        vx2.m53591g(ref$IntRef, "$selectedIndex");
        vx2.m53591g(transferHistoryFragment, "this$0");
        vx2.m53591g(list, "$listHeader");
        vx2.m53591g(list2, "$listValueTxt");
        ref$IntRef.element = 2;
        transferHistoryFragment.mo57890Z0(2, list);
        transferHistoryFragment.mo57889Y0(2, list2);
    }

    /* renamed from: U0 */
    public static final void m67563U0(Ref$IntRef ref$IntRef, TransferHistoryFragment transferHistoryFragment, List list, List list2, View view) {
        vx2.m53591g(ref$IntRef, "$selectedIndex");
        vx2.m53591g(transferHistoryFragment, "this$0");
        vx2.m53591g(list, "$listHeader");
        vx2.m53591g(list2, "$listValueTxt");
        ref$IntRef.element = 3;
        transferHistoryFragment.mo57890Z0(3, list);
        transferHistoryFragment.mo57889Y0(3, list2);
    }

    /* renamed from: W0 */
    public static final void m67566W0(TransferHistoryFragment transferHistoryFragment, String str, View view) {
        vx2.m53591g(transferHistoryFragment, "this$0");
        vx2.m53591g(str, "$contractAddress");
        Context requireContext = transferHistoryFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        ol0.m70361h(requireContext, str);
    }

    /* renamed from: X0 */
    public static final boolean m67568X0(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        vx2.m53591g(popupWindow, "$popupWindow");
        popupWindow.dismiss();
        return true;
    }

    /* renamed from: a1 */
    public static final void m67572a1(List list, int i, TransferHistoryFragment transferHistoryFragment) {
        vx2.m53591g(list, "$listHeader");
        vx2.m53591g(transferHistoryFragment, "this$0");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == i) {
                ((AppCompatTextView) list.get(i2)).setTextColor(zr0.m31440c(transferHistoryFragment.requireContext(), R.color.curve_green));
                ((AppCompatTextView) list.get(i2)).setBackgroundColor(zr0.m31440c(transferHistoryFragment.requireContext(), R.color.light_green_wrapper));
            } else {
                ((AppCompatTextView) list.get(i2)).setTextColor(zr0.m31440c(transferHistoryFragment.requireContext(), R.color.white));
                ((AppCompatTextView) list.get(i2)).setBackgroundColor(zr0.m31440c(transferHistoryFragment.requireContext(), R.color.p1));
            }
        }
    }

    /* renamed from: s0 */
    public static final void m67580s0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: u0 */
    public static final void m67583u0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m67585v0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m67587w0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m67590y0(TransferHistoryFragment transferHistoryFragment, View view) {
        vx2.m53591g(transferHistoryFragment, "this$0");
        transferHistoryFragment.mo50752i();
    }

    /* renamed from: z0 */
    public static final void m67592z0(TransferHistoryFragment transferHistoryFragment) {
        vx2.m53591g(transferHistoryFragment, "this$0");
        transferHistoryFragment.mo57898n0().mo8737c();
    }

    /* renamed from: L0 */
    public final void mo57884L0() {
        boolean z;
        UserTokenItemDisplayModel q0 = mo57901q0();
        String contractAddress = q0.getContractAddress();
        if (q0.getContractAddress().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            contractAddress = TokenType.Companion.mo57099b(q0.getChainId()).getWrapAddress();
        }
        mo57899o0().mo61742h(contractAddress);
    }

    /* renamed from: M0 */
    public final void mo57885M0() {
        db2 db2 = this.f42262s;
        if (db2 != null) {
            UserTokenItemDisplayModel q0 = mo57901q0();
            TextView textView = db2.f28138t;
            vx2.m53590f(textView, "tvFiatBalance");
            ol0.m70333M(textView, q0.getBalanceInUSDT(), true);
        }
    }

    /* renamed from: N0 */
    public final void mo57886N0(View view) {
        LayoutInflater layoutInflater;
        FragmentActivity activity = getActivity();
        View view2 = null;
        if (!(activity == null || (layoutInflater = activity.getLayoutInflater()) == null)) {
            view2 = layoutInflater.inflate(R.layout.view_choose_stats, (ViewGroup) null);
        }
        PopupWindow popupWindow = new PopupWindow(view2, (int) (((double) requireView().getWidth()) * 0.8d), -2, true);
        popupWindow.showAsDropDown(view);
        vx2.m53588d(view2);
        ea7 a = ea7.m43872a(view2);
        a.f28518b.setOnClickListener(new ru6(popupWindow, this, view));
        a.f28519c.setOnClickListener(new su6(popupWindow, this, view));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.getLayoutInflater();
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0372  */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57887Q0(android.view.View r15) {
        /*
            r14 = this;
            androidx.fragment.app.FragmentActivity r0 = r14.getActivity()
            r1 = 0
            if (r0 == 0) goto L_0x0015
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            if (r0 == 0) goto L_0x0015
            r2 = 2131558761(0x7f0d0169, float:1.8742847E38)
            android.view.View r0 = r0.inflate(r2, r1)
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            android.view.View r2 = r14.requireView()
            int r2 = r2.getWidth()
            double r2 = (double) r2
            r4 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = r2 * r4
            int r2 = (int) r2
            r3 = -2
            android.widget.PopupWindow r4 = new android.widget.PopupWindow
            r5 = 1
            r4.<init>(r0, r2, r3, r5)
            r4.showAsDropDown(r15)
            p000.vx2.m53588d(r0)
            ge7 r15 = p000.ge7.m44710a(r0)
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r0 = r14.f42264y
            if (r0 == 0) goto L_0x03e2
            java.lang.Integer r2 = r0.getVersion()
            if (r2 == 0) goto L_0x005b
            int r2 = r2.intValue()
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29213m
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "V"
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.setText(r2)
        L_0x005b:
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            net.safemoon.androidwallet.common.TokenType$a r3 = net.safemoon.androidwallet.common.TokenType.Companion
            androidx.fragment.app.FragmentActivity r4 = r14.requireActivity()
            net.safemoon.androidwallet.common.TokenType r6 = net.safemoon.androidwallet.common.TokenType.BEP_20
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "DEFAULT_GATEWAY"
            java.lang.String r4 = p000.f06.m57519j(r4, r8, r7)
            java.lang.String r7 = "getString(requireActivit…kenType.BEP_20.getName())"
            p000.vx2.m53590f(r4, r7)
            net.safemoon.androidwallet.common.TokenType r3 = r3.mo57100c(r4)
            java.lang.String r4 = "wrapped_bnb_2"
            java.lang.String r7 = "ethereum"
            java.lang.String r8 = "drawable"
            if (r3 != r6) goto L_0x00a0
            android.content.Context r9 = r14.getContext()
            if (r9 == 0) goto L_0x00bd
            android.content.res.Resources r9 = r9.getResources()
            if (r9 == 0) goto L_0x00bd
            android.content.Context r10 = r14.requireContext()
            java.lang.String r10 = r10.getPackageName()
            int r9 = r9.getIdentifier(r4, r8, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00be
        L_0x00a0:
            android.content.Context r9 = r14.getContext()
            if (r9 == 0) goto L_0x00bd
            android.content.res.Resources r9 = r9.getResources()
            if (r9 == 0) goto L_0x00bd
            android.content.Context r10 = r14.requireContext()
            java.lang.String r10 = r10.getPackageName()
            int r9 = r9.getIdentifier(r7, r8, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00be
        L_0x00bd:
            r9 = r1
        L_0x00be:
            r10 = 0
            if (r9 != 0) goto L_0x00c5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
        L_0x00c5:
            android.content.Context r11 = r14.getContext()
            java.lang.String r12 = "safemoon"
            if (r11 == 0) goto L_0x00e4
            android.content.res.Resources r11 = r11.getResources()
            if (r11 == 0) goto L_0x00e4
            android.content.Context r13 = r14.requireContext()
            java.lang.String r13 = r13.getPackageName()
            int r8 = r11.getIdentifier(r12, r8, r13)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x00e5
        L_0x00e4:
            r8 = r1
        L_0x00e5:
            if (r8 != 0) goto L_0x00eb
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
        L_0x00eb:
            java.lang.String r11 = "fromPairTokenIcon"
            if (r3 != r6) goto L_0x0108
            androidx.appcompat.widget.AppCompatImageView r3 = r15.f29202b
            p000.vx2.m53590f(r3, r11)
            int r6 = r9.intValue()
            p000.ol0.m70336P(r3, r6, r4, r1)
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29220t
            r4 = 2131952639(0x7f1303ff, float:1.9541726E38)
            java.lang.String r4 = r14.getString(r4)
            r3.setText(r4)
            goto L_0x0120
        L_0x0108:
            androidx.appcompat.widget.AppCompatImageView r3 = r15.f29202b
            p000.vx2.m53590f(r3, r11)
            int r4 = r9.intValue()
            p000.ol0.m70336P(r3, r4, r7, r1)
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29220t
            r4 = 2131952640(0x7f130400, float:1.9541728E38)
            java.lang.String r4 = r14.getString(r4)
            r3.setText(r4)
        L_0x0120:
            androidx.appcompat.widget.AppCompatImageView r3 = r15.f29204d
            java.lang.String r4 = "toPairTokenIcon"
            p000.vx2.m53590f(r3, r4)
            int r4 = r8.intValue()
            p000.ol0.m70336P(r3, r4, r12, r1)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29196I
            r3 = 2131952641(0x7f130401, float:1.954173E38)
            java.lang.String r3 = r14.getString(r3)
            r1.setText(r3)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29214n
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$BaseToken r3 = r0.getBaseToken()
            java.lang.String r3 = r3.getSymbol()
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$QuoteToken r4 = r0.getQuoteToken()
            java.lang.String r4 = r4.getSymbol()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = "/"
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            r1.setText(r3)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29215o
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$BaseToken r3 = r0.getBaseToken()
            java.lang.String r3 = r3.getName()
            r1.setText(r3)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29190C
            java.lang.String r3 = r0.getPriceUsd()
            r1.setText(r3)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29191D
            java.lang.String r3 = r0.getPriceNative()
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$QuoteToken r4 = r0.getQuoteToken()
            java.lang.String r4 = r4.getSymbol()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = " "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            r1.setText(r3)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29222v
            java.lang.String r3 = "$0"
            r1.setText(r3)
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$Liquidity r1 = r0.getLiquidity()
            java.lang.String r4 = "$"
            if (r1 == 0) goto L_0x01e7
            java.lang.Double r1 = r1.getUsd()
            if (r1 == 0) goto L_0x01e7
            double r6 = r1.doubleValue()
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29222v
            java.lang.String r8 = p000.ol0.m70332L(r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r1.setText(r8)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29224x
            java.lang.String r6 = p000.ol0.m70332L(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r1.setText(r6)
        L_0x01e7:
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29217q
            r1.setText(r3)
            java.lang.Double r1 = r0.getFdv()
            if (r1 == 0) goto L_0x0226
            double r6 = r1.doubleValue()
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29217q
            java.lang.String r3 = p000.ol0.m70332L(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            r1.setText(r3)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29224x
            java.lang.String r3 = p000.ol0.m70332L(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r1.setText(r3)
        L_0x0226:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$PriceChange r1 = r0.getPriceChange()
            r3 = 2131099726(0x7f06004e, float:1.7811813E38)
            r4 = 2131099752(0x7f060068, float:1.7811866E38)
            r6 = 2131099986(0x7f060152, float:1.781234E38)
            java.lang.String r7 = "%"
            r8 = 0
            if (r1 == 0) goto L_0x0287
            java.lang.Double r1 = r1.getM5()
            if (r1 == 0) goto L_0x0287
            double r11 = r1.doubleValue()
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29219s
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            r1.setText(r13)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29219s
            android.content.Context r13 = r14.requireContext()
            int r13 = p000.zr0.m31440c(r13, r6)
            r1.setTextColor(r13)
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0276
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29219s
            android.content.Context r11 = r14.requireContext()
            int r11 = p000.zr0.m31440c(r11, r4)
            r1.setTextColor(r11)
            goto L_0x0287
        L_0x0276:
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0287
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29219s
            android.content.Context r11 = r14.requireContext()
            int r11 = p000.zr0.m31440c(r11, r3)
            r1.setTextColor(r11)
        L_0x0287:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$PriceChange r1 = r0.getPriceChange()
            if (r1 == 0) goto L_0x02db
            java.lang.Double r1 = r1.getH1()
            if (r1 == 0) goto L_0x02db
            double r11 = r1.doubleValue()
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29226z
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            r1.setText(r13)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29226z
            android.content.Context r13 = r14.requireContext()
            int r13 = p000.zr0.m31440c(r13, r6)
            r1.setTextColor(r13)
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ca
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29226z
            android.content.Context r11 = r14.requireContext()
            int r11 = p000.zr0.m31440c(r11, r4)
            r1.setTextColor(r11)
            goto L_0x02db
        L_0x02ca:
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x02db
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29226z
            android.content.Context r11 = r14.requireContext()
            int r11 = p000.zr0.m31440c(r11, r3)
            r1.setTextColor(r11)
        L_0x02db:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$PriceChange r1 = r0.getPriceChange()
            if (r1 == 0) goto L_0x032f
            java.lang.Double r1 = r1.getH6()
            if (r1 == 0) goto L_0x032f
            double r11 = r1.doubleValue()
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29195H
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            r1.setText(r13)
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29195H
            android.content.Context r13 = r14.requireContext()
            int r13 = p000.zr0.m31440c(r13, r6)
            r1.setTextColor(r13)
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x031e
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29195H
            android.content.Context r11 = r14.requireContext()
            int r11 = p000.zr0.m31440c(r11, r4)
            r1.setTextColor(r11)
            goto L_0x032f
        L_0x031e:
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x032f
            androidx.appcompat.widget.AppCompatTextView r1 = r15.f29195H
            android.content.Context r11 = r14.requireContext()
            int r11 = p000.zr0.m31440c(r11, r3)
            r1.setTextColor(r11)
        L_0x032f:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$PriceChange r0 = r0.getPriceChange()
            if (r0 == 0) goto L_0x0383
            java.lang.Double r0 = r0.getH24()
            if (r0 == 0) goto L_0x0383
            double r0 = r0.doubleValue()
            androidx.appcompat.widget.AppCompatTextView r11 = r15.f29207g
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            r11.setText(r7)
            androidx.appcompat.widget.AppCompatTextView r7 = r15.f29207g
            android.content.Context r11 = r14.requireContext()
            int r6 = p000.zr0.m31440c(r11, r6)
            r7.setTextColor(r6)
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0372
            androidx.appcompat.widget.AppCompatTextView r0 = r15.f29207g
            android.content.Context r1 = r14.requireContext()
            int r1 = p000.zr0.m31440c(r1, r4)
            r0.setTextColor(r1)
            goto L_0x0383
        L_0x0372:
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0383
            androidx.appcompat.widget.AppCompatTextView r0 = r15.f29207g
            android.content.Context r1 = r14.requireContext()
            int r1 = p000.zr0.m31440c(r1, r3)
            r0.setTextColor(r1)
        L_0x0383:
            r0 = 4
            androidx.appcompat.widget.AppCompatTextView[] r1 = new androidx.appcompat.widget.AppCompatTextView[r0]
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29209i
            r1[r10] = r3
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29205e
            r1[r5] = r3
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29210j
            r4 = 2
            r1[r4] = r3
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29208h
            r6 = 3
            r1[r6] = r3
            java.util.List r1 = p000.ck0.m33068p(r1)
            androidx.appcompat.widget.AppCompatTextView[] r0 = new androidx.appcompat.widget.AppCompatTextView[r0]
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29198K
            r0[r10] = r3
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29212l
            r0[r5] = r3
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29193F
            r0[r4] = r3
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29200M
            r0[r6] = r3
            java.util.List r0 = p000.ck0.m33068p(r0)
            int r3 = r2.element
            r14.mo57890Z0(r3, r1)
            r14.mo57889Y0(r10, r0)
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29209i
            vu6 r4 = new vu6
            r4.<init>(r2, r14, r1, r0)
            r3.setOnClickListener(r4)
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29205e
            wu6 r4 = new wu6
            r4.<init>(r2, r14, r1, r0)
            r3.setOnClickListener(r4)
            androidx.appcompat.widget.AppCompatTextView r3 = r15.f29210j
            xu6 r4 = new xu6
            r4.<init>(r2, r14, r1, r0)
            r3.setOnClickListener(r4)
            androidx.appcompat.widget.AppCompatTextView r15 = r15.f29208h
            yu6 r3 = new yu6
            r3.<init>(r2, r14, r1, r0)
            r15.setOnClickListener(r3)
        L_0x03e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.TransferHistoryFragment.mo57887Q0(android.view.View):void");
    }

    /* renamed from: V0 */
    public final void mo57888V0(View view) {
        View view2;
        int i;
        Double d;
        Double d2;
        double d3;
        String str;
        char c;
        double d4;
        double d5;
        LayoutInflater layoutInflater;
        Coin value = this.f42258Q.getValue();
        FragmentActivity activity = getActivity();
        if (activity == null || (layoutInflater = activity.getLayoutInflater()) == null) {
            view2 = null;
        } else {
            view2 = layoutInflater.inflate(R.layout.view_token_details, (ViewGroup) null);
        }
        int width = (int) (((double) requireView().getWidth()) * 0.8d);
        vx2.m53588d(view2);
        ke7 a = ke7.m47045a(view2);
        rz1.C9291a aVar = rz1.f44501a;
        String t = ol0.m70378t(aVar.mo65772b());
        if (value == null) {
            AppCompatTextView appCompatTextView = a.f30857d;
            cb6 cb6 = cb6.f21669a;
            String format = String.format(Locale.getDefault(), t, Arrays.copyOf(new Object[]{aVar.mo65772b(), "0.00"}, 2));
            vx2.m53590f(format, "format(locale, format, *args)");
            appCompatTextView.setText(format);
            AppCompatTextView appCompatTextView2 = a.f30859f;
            String format2 = String.format(Locale.getDefault(), t, Arrays.copyOf(new Object[]{aVar.mo65772b(), "0.00"}, 2));
            vx2.m53590f(format2, "format(locale, format, *args)");
            appCompatTextView2.setText(format2);
            a.f30855b.setText("0");
            a.f30858e.setText("0");
            MaterialTextView materialTextView = a.f30856c;
            vx2.m53590f(materialTextView, "txtContractAddress");
            materialTextView.setVisibility(8);
            i = width;
        } else {
            i = width;
            if (value.getQuote().getUSD().getMarketCap() == null || vx2.m53585a(value.getQuote().getUSD().getMarketCap(), Utils.DOUBLE_EPSILON)) {
                d = value.getSelfReportedMarketCap();
            } else {
                d = value.getQuote().getUSD().getMarketCap();
            }
            if (value.getCirculatingSupply() == null || vx2.m53585a(value.getCirculatingSupply(), Utils.DOUBLE_EPSILON)) {
                d2 = value.getSelfReportedCirculatingSupply();
            } else {
                d2 = value.getCirculatingSupply();
            }
            AppCompatTextView appCompatTextView3 = a.f30857d;
            cb6 cb62 = cb6.f21669a;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[2];
            objArr[0] = aVar.mo65772b();
            if (d == null) {
                d3 = Utils.DOUBLE_EPSILON;
            } else {
                vx2.m53590f(d, "marketCap?:0.0");
                d3 = d.doubleValue();
            }
            objArr[1] = ol0.m70374p(d3, 0, (RoundingMode) null, false, 7, (Object) null);
            String format3 = String.format(locale, t, Arrays.copyOf(objArr, 2));
            vx2.m53590f(format3, "format(locale, format, *args)");
            appCompatTextView3.setText(format3);
            AppCompatTextView appCompatTextView4 = a.f30859f;
            Locale locale2 = Locale.getDefault();
            Object[] objArr2 = new Object[2];
            objArr2[0] = aVar.mo65772b();
            Double volume24h = value.getQuote().getUSD().getVolume24h();
            if (volume24h != null) {
                vx2.m53590f(volume24h, "volume24h");
                str = ol0.m70374p(volume24h.doubleValue(), 0, (RoundingMode) null, false, 7, (Object) null);
                c = 1;
            } else {
                c = 1;
                str = null;
            }
            objArr2[c] = str;
            String format4 = String.format(locale2, t, Arrays.copyOf(objArr2, 2));
            vx2.m53590f(format4, "format(locale, format, *args)");
            appCompatTextView4.setText(format4);
            AppCompatTextView appCompatTextView5 = a.f30855b;
            if (d2 == null) {
                d4 = Utils.DOUBLE_EPSILON;
            } else {
                vx2.m53590f(d2, "circulatingSupply?:0.0");
                d4 = d2.doubleValue();
            }
            appCompatTextView5.setText(ol0.m70374p(d4, 0, (RoundingMode) null, false, 7, (Object) null) + " " + value.getSymbol());
            AppCompatTextView appCompatTextView6 = a.f30858e;
            Double totalSupply = value.getTotalSupply();
            if (totalSupply == null) {
                d5 = Utils.DOUBLE_EPSILON;
            } else {
                vx2.m53590f(totalSupply, "coinData.totalSupply?:0.0");
                d5 = totalSupply.doubleValue();
            }
            appCompatTextView6.setText(ol0.m70374p(d5, 0, (RoundingMode) null, false, 7, (Object) null) + " " + value.getSymbol());
            String contractAddress = mo57901q0().getContractAddress();
            a.f30856c.setText(ol0.m70353d(contractAddress));
            MaterialTextView materialTextView2 = a.f30856c;
            vx2.m53590f(materialTextView2, "txtContractAddress");
            materialTextView2.setVisibility(0);
            a.f30856c.setOnClickListener(new pu6(this, contractAddress));
        }
        PopupWindow popupWindow = new PopupWindow(view2, i, -2, true);
        popupWindow.showAsDropDown(view);
        view2.setOnTouchListener(new qu6(popupWindow));
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Double] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.Double] */
    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.Double] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.Double] */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007c A[LOOP:0: B:39:0x0076->B:41:0x007c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57889Y0(int r9, java.util.List<androidx.appcompat.widget.AppCompatTextView> r10) {
        /*
            r8 = this;
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r0 = r8.f42264y
            if (r0 == 0) goto L_0x0107
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r9 == 0) goto L_0x0058
            if (r9 == r3) goto L_0x0041
            if (r9 == r2) goto L_0x002a
            if (r9 == r1) goto L_0x0013
            r9 = r4
            goto L_0x0072
        L_0x0013:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$Txns r9 = r0.getTxns()
            if (r9 == 0) goto L_0x001e
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$TxnsUnit r9 = r9.getH24()
            goto L_0x001f
        L_0x001e:
            r9 = r4
        L_0x001f:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$Volume r0 = r0.getVolume()
            if (r0 == 0) goto L_0x006f
            java.lang.Double r0 = r0.getH24()
            goto L_0x006e
        L_0x002a:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$Txns r9 = r0.getTxns()
            if (r9 == 0) goto L_0x0035
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$TxnsUnit r9 = r9.getH6()
            goto L_0x0036
        L_0x0035:
            r9 = r4
        L_0x0036:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$Volume r0 = r0.getVolume()
            if (r0 == 0) goto L_0x006f
            java.lang.Double r0 = r0.getH6()
            goto L_0x006e
        L_0x0041:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$Txns r9 = r0.getTxns()
            if (r9 == 0) goto L_0x004c
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$TxnsUnit r9 = r9.getH1()
            goto L_0x004d
        L_0x004c:
            r9 = r4
        L_0x004d:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$Volume r0 = r0.getVolume()
            if (r0 == 0) goto L_0x006f
            java.lang.Double r0 = r0.getH1()
            goto L_0x006e
        L_0x0058:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$Txns r9 = r0.getTxns()
            if (r9 == 0) goto L_0x0063
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$TxnsUnit r9 = r9.getM5()
            goto L_0x0064
        L_0x0063:
            r9 = r4
        L_0x0064:
            net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo$Volume r0 = r0.getVolume()
            if (r0 == 0) goto L_0x006f
            java.lang.Double r0 = r0.getM5()
        L_0x006e:
            r4 = r0
        L_0x006f:
            r7 = r4
            r4 = r9
            r9 = r7
        L_0x0072:
            java.util.Iterator r0 = r10.iterator()
        L_0x0076:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r0.next()
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            java.lang.String r6 = "N/A"
            r5.setText(r6)
            goto L_0x0076
        L_0x0088:
            if (r4 == 0) goto L_0x00e3
            java.lang.Integer r0 = r4.getBuys()
            if (r0 == 0) goto L_0x00a1
            int r0 = r0.intValue()
            java.lang.Object r3 = r10.get(r3)
            androidx.appcompat.widget.AppCompatTextView r3 = (androidx.appcompat.widget.AppCompatTextView) r3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.setText(r0)
        L_0x00a1:
            java.lang.Integer r0 = r4.getSells()
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.intValue()
            java.lang.Object r2 = r10.get(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.setText(r0)
        L_0x00b8:
            java.lang.Integer r0 = r4.getSells()
            if (r0 == 0) goto L_0x00e3
            java.lang.Integer r0 = r4.getBuys()
            if (r0 == 0) goto L_0x00e3
            r0 = 0
            java.lang.Object r0 = r10.get(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.Integer r2 = r4.getSells()
            int r2 = r2.intValue()
            java.lang.Integer r3 = r4.getBuys()
            int r3 = r3.intValue()
            int r2 = r2 + r3
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.setText(r2)
        L_0x00e3:
            if (r9 == 0) goto L_0x0107
            double r2 = r9.doubleValue()
            java.lang.Object r9 = r10.get(r1)
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            java.lang.String r10 = p000.ol0.m70332L(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "$"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.setText(r10)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.TransferHistoryFragment.mo57889Y0(int, java.util.List):void");
    }

    /* renamed from: Z0 */
    public final void mo57890Z0(int i, List<AppCompatTextView> list) {
        requireActivity().runOnUiThread(new zu6(list, i, this));
    }

    /* renamed from: g0 */
    public final void mo57891g0(UserTokenItemDisplayModel userTokenItemDisplayModel) {
        ug3 viewLifecycleOwner = getViewLifecycleOwner();
        vx2.m53590f(viewLifecycleOwner, "viewLifecycleOwner");
        y23 unused = d50.m56748b(vg3.m28804a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new TransferHistoryFragment$fetchTokenInfo$1(userTokenItemDisplayModel, this, (ns0<? super TransferHistoryFragment$fetchTokenInfo$1>) null), 3, (Object) null);
    }

    /* renamed from: h0 */
    public final String mo57892h0() {
        return (String) this.f42253H.getValue();
    }

    /* renamed from: i0 */
    public final void mo57893i0(PaymentMethod paymentMethod, String str, int i, boolean z) {
        if (!this.f42257P) {
            this.f42257P = true;
            mo57895k0().mo61228j(paymentMethod, str, i, z, new TransferHistoryFragment$getCheckoutUrl$1(this), new TransferHistoryFragment$getCheckoutUrl$2(this));
        }
    }

    /* renamed from: j0 */
    public final k04<Coin> mo57894j0() {
        return this.f42258Q;
    }

    /* renamed from: k0 */
    public final HomeViewModel mo57895k0() {
        return (HomeViewModel) this.f42255L.getValue();
    }

    /* renamed from: l0 */
    public final MyTokensListViewModel mo57896l0() {
        return (MyTokensListViewModel) this.f42254I.getValue();
    }

    /* renamed from: m0 */
    public final TokenType mo57897m0() {
        return (TokenType) this.f42252C.getValue();
    }

    /* renamed from: n0 */
    public final TransferHistoryFragment$transactionAdapter$2.C8506a mo57898n0() {
        return (TransferHistoryFragment$transactionAdapter$2.C8506a) this.f42259U.getValue();
    }

    /* renamed from: o0 */
    public final TransactionHistoryViewModel mo57899o0() {
        return (TransactionHistoryViewModel) this.f42263x.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        this.f42262s = db2.m43435a(layoutInflater.inflate(R.layout.fragment_transfer_history, viewGroup, false));
        mo57904x0();
        mo57903t0();
        db2 db2 = this.f42262s;
        vx2.m53588d(db2);
        ConstraintLayout b = db2.mo41886b();
        vx2.m53590f(b, "binding!!.root");
        return b;
    }

    public void onResume() {
        super.onResume();
        if (this.f42256M) {
            this.f42256M = false;
            a77.m55424b(requireActivity(), Boolean.FALSE);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        AppCompatTextView appCompatTextView;
        boolean z;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        db2 db2 = this.f42262s;
        if (db2 != null) {
            UserTokenItemDisplayModel q0 = mo57901q0();
            TransactionHistoryViewModel o0 = mo57899o0();
            String contractAddress = q0.getContractAddress();
            if (contractAddress.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                contractAddress = null;
            }
            o0.mo61745k(contractAddress, q0.getSymbol());
            db2.f28137s.setText(mo57897m0().getDisplayName());
            AppCompatImageView appCompatImageView = db2.f28131m;
            vx2.m53590f(appCompatImageView, "imgSymbol");
            ol0.m70336P(appCompatImageView, q0.getIconResId(), q0.getIconFile(), q0.getSymbol());
            if (ol0.m70328H(q0.getSymbol())) {
                AppCompatImageView appCompatImageView2 = db2.f28131m;
                vx2.m53590f(appCompatImageView2, "imgSymbol");
                ol0.m70335O(appCompatImageView2, q0.getCmcId(), q0.getSymbol());
            }
            mo57885M0();
            db2.f28124f.setVisibility(ol0.m70370l0(q0.getAllowSwap()));
            db2.f28121c.setVisibility(ol0.m70370l0(ap2.m55613a(q0.getSymbolWithType()).mo67356d()));
            if (!ap2.m55613a(q0.getSymbolWithType()).mo67356d() || !ap2.m55613a(q0.getSymbolWithType()).mo67357e()) {
                db2.f28121c.setIconResource(R.drawable.ic_buy);
                db2.f28121c.setText(R.string.buy);
            } else {
                db2.f28121c.setIconResource(R.drawable.ic_buy_sell);
                db2.f28121c.setText(R.string.buy_and_sell);
            }
            db2.f28121c.setOnClickListener(new iu6(this, q0));
            db2.f28123e.setVisibility(ol0.m70370l0(ap2.m55613a(q0.getSymbolWithType()).mo67354b()));
            db2.f28122d.setVisibility(ol0.m70370l0(ap2.m55613a(q0.getSymbolWithType()).mo67353a()));
            db2.f28132n.setOnClickListener(new tu6(this));
            db2.f28130l.setOnClickListener(new av6(this, q0));
            mo57899o0().mo61746l().observe(getViewLifecycleOwner(), new bv6(new TransferHistoryFragment$onViewCreated$1$1$5(db2, this)));
            mo57891g0(q0);
            db2.f28123e.setOnClickListener(new cv6(this));
            db2.f28122d.setOnClickListener(new dv6(this));
            db2.f28124f.setOnClickListener(new ev6(this));
        }
        db2 db22 = this.f42262s;
        if (!(db22 == null || (appCompatTextView = db22.f28140v) == null)) {
            ol0.m70343W(appCompatTextView, new TransferHistoryFragment$onViewCreated$2(this));
        }
        mo57896l0().mo61298J().observe(getViewLifecycleOwner(), new fv6(new TransferHistoryFragment$onViewCreated$3(this)));
        mo57902r0();
    }

    /* renamed from: p0 */
    public final z42<cl4<Result>> mo57900p0() {
        return (z42) this.f42251B.getValue();
    }

    /* renamed from: q0 */
    public final UserTokenItemDisplayModel mo57901q0() {
        return (UserTokenItemDisplayModel) this.f42250A.getValue();
    }

    /* renamed from: r0 */
    public final void mo57902r0() {
        dl5 dl5;
        k04 f;
        NavBackStackEntry A = x92.m29982a(this).mo8445A();
        if (A != null) {
            dl5 = A.mo8428i();
        } else {
            dl5 = null;
        }
        if (dl5 != null && (f = dl5.mo18830f("RESULT_FROM_CRYPTO_PRICE_ALERT")) != null) {
            f.observe(A, new uu6(new TransferHistoryFragment$initPriceAlertFragmentState$1(this)));
        }
    }

    /* renamed from: t0 */
    public final void mo57903t0() {
        db2 db2 = this.f42262s;
        if (db2 != null) {
            db2.f28134p.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
            db2.f28134p.setAdapter(mo57898n0());
            db2.f28134p.setItemAnimator((RecyclerView.C1242l) null);
        }
        vg3.m28804a(this).mo6301b(new TransferHistoryFragment$initRecyclerView$2(this, (ns0<? super TransferHistoryFragment$initRecyclerView$2>) null));
        mo57899o0().mo61747m().observe(getViewLifecycleOwner(), new mu6(new TransferHistoryFragment$initRecyclerView$3(this)));
        mo57899o0().mo61740f().observe(getViewLifecycleOwner(), new nu6(new TransferHistoryFragment$initRecyclerView$4(this)));
        mo57899o0().mo61741g().observe(getViewLifecycleOwner(), new ou6(new TransferHistoryFragment$initRecyclerView$5(this)));
        mo57884L0();
    }

    /* renamed from: x0 */
    public final void mo57904x0() {
        db2 db2 = this.f42262s;
        if (db2 != null) {
            db2.f28136r.f34318d.setOnClickListener(new gv6(this));
            db2.f28136r.f34320f.setText(getText(R.string.transaction_history));
            db2.f28136r.f34317c.setVisibility(4);
            db2.f28135q.setOnRefreshListener(new hv6(this));
            db2.f28128j.setOnClickListener(new ju6(this));
            db2.f28129k.setOnClickListener(new ku6(this));
            db2.f28129k.setVisibility(8);
            db2.f28136r.f34317c.setImageResource(R.drawable.ic_top_nav_chart);
            db2.f28136r.f34317c.setOnClickListener(new lu6(this));
        }
    }
}
