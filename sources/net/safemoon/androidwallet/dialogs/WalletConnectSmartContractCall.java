package net.safemoon.androidwallet.dialogs;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.textview.MaterialTextView;
import com.google.gson.Gson;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.dialogs.common.BaseBottomSheetDialogFragment;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.walletConnect.RoomExtensionKt;
import net.safemoon.androidwallet.model.walletConnect.WCSolanaSignMessage;
import net.safemoon.androidwallet.model.walletConnect.WCSolanaSignTransaction;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.provider.AskAuthorizeProvider;
import wallet.core.jni.Base58;
import wallet.core.jni.CoinType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 P2\u00020\u0001:\u0004QRSTB\u0007¢\u0006\u0004\bN\u0010OJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016JJ\u0010$\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"J\b\u0010%\u001a\u00020\u0002H\u0016J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u00103R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010!\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b1\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010J\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall;", "Lnet/safemoon/androidwallet/dialogs/common/BaseBottomSheetDialogFragment;", "Lr37;", "g0", "W", "", "walletId", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Y", "(JLns0;)Ljava/lang/Object;", "Z", "(Lns0;)Ljava/lang/Object;", "a0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "rc", "id", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "message", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction;", "solSignTransaction", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignMessage;", "solSignMessage", "wallet", "Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall$c;", "iWalletConnectSmartContract", "d0", "onDestroy", "Landroidx/fragment/app/FragmentManager;", "manager", "f0", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "U", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "V", "()Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "setLoader", "(Lnet/safemoon/androidwallet/dialogs/ProgressLoading;)V", "loader", "X", "Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall$c;", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "roomConnectedInfo", "Ljava/lang/Long;", "e0", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "transaction", "k0", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignTransaction;", "v0", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignMessage;", "b1", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Lpb2;", "e1", "Lpb2;", "binding", "Lz57;", "o1", "Lef3;", "()Lz57;", "userTokenListDao", "", "p1", "Ljava/lang/String;", "partialSignFromWebSupportedSdk", "q1", "messageFromWebSupportedSdk", "<init>", "()V", "r1", "a", "b", "c", "WebAppInterface", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectSmartContractCall.kt */
public final class WalletConnectSmartContractCall extends BaseBottomSheetDialogFragment {

    /* renamed from: r1 */
    public static final C8337a f41826r1 = new C8337a((DefaultConstructorMarker) null);

    /* renamed from: U */
    public ProgressLoading f41827U;

    /* renamed from: X */
    public C8339c f41828X;

    /* renamed from: Y */
    public RoomConnectedInfo f41829Y;

    /* renamed from: Z */
    public Long f41830Z;

    /* renamed from: b1 */
    public Wallet f41831b1;

    /* renamed from: e0 */
    public WCEthereumTransaction f41832e0;

    /* renamed from: e1 */
    public pb2 f41833e1;

    /* renamed from: k0 */
    public WCSolanaSignTransaction f41834k0;

    /* renamed from: o1 */
    public final ef3 f41835o1 = C6169a.m47232a(new WalletConnectSmartContractCall$userTokenListDao$2(this));

    /* renamed from: p1 */
    public String f41836p1;

    /* renamed from: q1 */
    public String f41837q1;

    /* renamed from: v0 */
    public WCSolanaSignMessage f41838v0;

    @Keep
    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall$WebAppInterface;", "", "", "partialSign", "Lr37;", "signPartialByBrijeshTransaction", "encoded", "serializedMessageByBrijeshTransaction", "<init>", "(Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: WalletConnectSmartContractCall.kt */
    public final class WebAppInterface {
        public WebAppInterface() {
        }

        @JavascriptInterface
        public final void serializedMessageByBrijeshTransaction(String str) {
            WalletConnectSmartContractCall.this.f41837q1 = str;
            WalletConnectSmartContractCall.this.mo57339W();
        }

        @JavascriptInterface
        public final void signPartialByBrijeshTransaction(String str) {
            WalletConnectSmartContractCall.this.f41836p1 = str;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall$a;", "", "Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$a */
    /* compiled from: WalletConnectSmartContractCall.kt */
    public static final class C8337a {
        public C8337a() {
        }

        public /* synthetic */ C8337a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final WalletConnectSmartContractCall mo57349a() {
            WalletConnectSmartContractCall walletConnectSmartContractCall = new WalletConnectSmartContractCall();
            walletConnectSmartContractCall.setArguments(new Bundle());
            return walletConnectSmartContractCall;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall$b;", "", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$b */
    /* compiled from: WalletConnectSmartContractCall.kt */
    public interface C8338b {
        /* renamed from: a */
        void mo57350a();

        /* renamed from: b */
        void mo57351b();
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall$c;", "Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall$b;", "", "sign", "Lr37;", "c", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$c */
    /* compiled from: WalletConnectSmartContractCall.kt */
    public static abstract class C8339c implements C8338b {
        /* renamed from: c */
        public void mo57352c(String str) {
            vx2.m53591g(str, "sign");
        }
    }

    /* renamed from: b0 */
    public static final void m66308b0(WalletConnectSmartContractCall walletConnectSmartContractCall, View view) {
        vx2.m53591g(walletConnectSmartContractCall, "this$0");
        walletConnectSmartContractCall.mo22266k();
    }

    /* renamed from: c0 */
    public static final void m66309c0(WalletConnectSmartContractCall walletConnectSmartContractCall, pb2 pb2, View view) {
        vx2.m53591g(walletConnectSmartContractCall, "this$0");
        vx2.m53591g(pb2, "$this_run");
        Context requireContext = walletConnectSmartContractCall.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        new AskAuthorizeProvider(requireContext, walletConnectSmartContractCall.mo57361D()).mo60705a(new WalletConnectSmartContractCall$onViewCreated$2$1$1(pb2, walletConnectSmartContractCall), WalletConnectSmartContractCall$onViewCreated$2$1$2.INSTANCE);
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m66310e0(WalletConnectSmartContractCall walletConnectSmartContractCall, RoomConnectedInfo roomConnectedInfo, long j, WCEthereumTransaction wCEthereumTransaction, WCSolanaSignTransaction wCSolanaSignTransaction, WCSolanaSignMessage wCSolanaSignMessage, Wallet wallet2, C8339c cVar, int i, Object obj) {
        WCEthereumTransaction wCEthereumTransaction2;
        WCSolanaSignTransaction wCSolanaSignTransaction2;
        WCSolanaSignMessage wCSolanaSignMessage2;
        if ((i & 4) != 0) {
            wCEthereumTransaction2 = null;
        } else {
            wCEthereumTransaction2 = wCEthereumTransaction;
        }
        if ((i & 8) != 0) {
            wCSolanaSignTransaction2 = null;
        } else {
            wCSolanaSignTransaction2 = wCSolanaSignTransaction;
        }
        if ((i & 16) != 0) {
            wCSolanaSignMessage2 = null;
        } else {
            wCSolanaSignMessage2 = wCSolanaSignMessage;
        }
        walletConnectSmartContractCall.mo57344d0(roomConnectedInfo, j, wCEthereumTransaction2, wCSolanaSignTransaction2, wCSolanaSignMessage2, wallet2, cVar);
    }

    /* renamed from: V */
    public final ProgressLoading mo57338V() {
        return this.f41827U;
    }

    /* renamed from: W */
    public final void mo57339W() {
        if (this.f41837q1 != null) {
            mo57346g0();
        }
        if (this.f41834k0 != null) {
            y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new WalletConnectSmartContractCall$getSolPrice$2$1(this, (ns0<? super WalletConnectSmartContractCall$getSolPrice$2$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: X */
    public final z57 mo57340X() {
        return (z57) this.f41835o1.getValue();
    }

    /* renamed from: Y */
    public final Object mo57341Y(long j, ns0<? super Wallet> ns0) {
        Application application;
        FragmentActivity activity = getActivity();
        if (activity == null || (application = activity.getApplication()) == null) {
            return null;
        }
        Object f = MainRoomDatabase.f41647p.mo57110b(application).mo57108Q().mo52479f(j, ns0);
        if (f == wx2.m54101d()) {
            return f;
        }
        return (Wallet) f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4 A[Catch:{ Exception -> 0x012c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e5 A[Catch:{ Exception -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0106 A[Catch:{ Exception -> 0x012c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0107 A[Catch:{ Exception -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo57342Z(p000.ns0<? super p000.r37> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingPrice$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingPrice$1 r2 = (net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingPrice$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingPrice$1 r2 = new net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingPrice$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x007c
            if (r4 == r8) goto L_0x006a
            if (r4 == r7) goto L_0x0059
            if (r4 == r6) goto L_0x0040
            if (r4 != r5) goto L_0x0038
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x012c }
            goto L_0x012c
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            java.lang.Object r4 = r2.L$3
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.lang.Object r6 = r2.L$2
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            java.lang.Object r7 = r2.L$1
            net.safemoon.androidwallet.common.TokenType r7 = (net.safemoon.androidwallet.common.TokenType) r7
            java.lang.Object r8 = r2.L$0
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall r8 = (net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall) r8
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x012c }
            r14 = r4
            r13 = r6
        L_0x0055:
            r15 = r7
            r11 = r8
            goto L_0x010c
        L_0x0059:
            java.lang.Object r4 = r2.L$2
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.lang.Object r7 = r2.L$1
            net.safemoon.androidwallet.common.TokenType r7 = (net.safemoon.androidwallet.common.TokenType) r7
            java.lang.Object r8 = r2.L$0
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall r8 = (net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall) r8
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x012c }
            goto L_0x00ec
        L_0x006a:
            int r4 = r2.I$0
            java.lang.Object r8 = r2.L$2
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.Object r10 = r2.L$1
            net.safemoon.androidwallet.common.TokenType r10 = (net.safemoon.androidwallet.common.TokenType) r10
            java.lang.Object r11 = r2.L$0
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall r11 = (net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall) r11
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x012c }
            goto L_0x00be
        L_0x007c:
            p000.hg5.m45199b(r1)
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo r1 = r0.f41829Y
            if (r1 == 0) goto L_0x012c
            net.safemoon.androidwallet.common.TokenType$a r4 = net.safemoon.androidwallet.common.TokenType.Companion
            int r10 = r1.getChainId()
            net.safemoon.androidwallet.common.TokenType r10 = r4.mo57099b(r10)
            com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction r4 = r0.f41832e0
            if (r4 == 0) goto L_0x0096
            java.lang.String r4 = r4.getTo()
            goto L_0x0097
        L_0x0096:
            r4 = r9
        L_0x0097:
            if (r4 == 0) goto L_0x012c
            androidx.fragment.app.FragmentActivity r4 = r18.requireActivity()     // Catch:{ Exception -> 0x012c }
            java.lang.String r11 = "requireActivity()"
            p000.vx2.m53590f(r4, r11)     // Catch:{ Exception -> 0x012c }
            int r11 = r1.getChainId()     // Catch:{ Exception -> 0x012c }
            long r12 = r1.getWalletId()     // Catch:{ Exception -> 0x012c }
            r2.L$0 = r0     // Catch:{ Exception -> 0x012c }
            r2.L$1 = r10     // Catch:{ Exception -> 0x012c }
            r2.L$2 = r4     // Catch:{ Exception -> 0x012c }
            r2.I$0 = r11     // Catch:{ Exception -> 0x012c }
            r2.label = r8     // Catch:{ Exception -> 0x012c }
            java.lang.Object r1 = r0.mo57341Y(r12, r2)     // Catch:{ Exception -> 0x012c }
            if (r1 != r3) goto L_0x00bb
            return r3
        L_0x00bb:
            r8 = r4
            r4 = r11
            r11 = r0
        L_0x00be:
            p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x012c }
            net.safemoon.androidwallet.model.wallets.Wallet r1 = (net.safemoon.androidwallet.model.wallets.Wallet) r1     // Catch:{ Exception -> 0x012c }
            net.safemoon.androidwallet.viewmodels.wc.WcWeb3 r12 = new net.safemoon.androidwallet.viewmodels.wc.WcWeb3     // Catch:{ Exception -> 0x012c }
            r12.<init>(r8, r4, r1)     // Catch:{ Exception -> 0x012c }
            com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction r1 = r11.f41832e0     // Catch:{ Exception -> 0x012c }
            p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x012c }
            java.math.BigInteger r1 = r12.mo62015x(r1)     // Catch:{ Exception -> 0x012c }
            com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction r4 = r11.f41832e0     // Catch:{ Exception -> 0x012c }
            p000.vx2.m53588d(r4)     // Catch:{ Exception -> 0x012c }
            r2.L$0 = r11     // Catch:{ Exception -> 0x012c }
            r2.L$1 = r10     // Catch:{ Exception -> 0x012c }
            r2.L$2 = r1     // Catch:{ Exception -> 0x012c }
            r2.label = r7     // Catch:{ Exception -> 0x012c }
            java.lang.Object r4 = r12.mo62016y(r4, r2)     // Catch:{ Exception -> 0x012c }
            if (r4 != r3) goto L_0x00e5
            return r3
        L_0x00e5:
            r7 = r10
            r8 = r11
            r17 = r4
            r4 = r1
            r1 = r17
        L_0x00ec:
            java.math.BigInteger r1 = (java.math.BigInteger) r1     // Catch:{ Exception -> 0x012c }
            z57 r10 = r8.mo57340X()     // Catch:{ Exception -> 0x012c }
            java.lang.String r11 = r7.getSymbolWithType()     // Catch:{ Exception -> 0x012c }
            r2.L$0 = r8     // Catch:{ Exception -> 0x012c }
            r2.L$1 = r7     // Catch:{ Exception -> 0x012c }
            r2.L$2 = r4     // Catch:{ Exception -> 0x012c }
            r2.L$3 = r1     // Catch:{ Exception -> 0x012c }
            r2.label = r6     // Catch:{ Exception -> 0x012c }
            java.lang.Object r6 = r10.mo50079f(r11, r2)     // Catch:{ Exception -> 0x012c }
            if (r6 != r3) goto L_0x0107
            return r3
        L_0x0107:
            r14 = r1
            r13 = r4
            r1 = r6
            goto L_0x0055
        L_0x010c:
            r12 = r1
            net.safemoon.androidwallet.model.token.room.RoomToken r12 = (net.safemoon.androidwallet.model.token.room.RoomToken) r12     // Catch:{ Exception -> 0x012c }
            vm3 r1 = p000.qh1.m71266c()     // Catch:{ Exception -> 0x012c }
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingPrice$2$1 r4 = new net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingPrice$2$1     // Catch:{ Exception -> 0x012c }
            r16 = 0
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x012c }
            r2.L$0 = r9     // Catch:{ Exception -> 0x012c }
            r2.L$1 = r9     // Catch:{ Exception -> 0x012c }
            r2.L$2 = r9     // Catch:{ Exception -> 0x012c }
            r2.L$3 = r9     // Catch:{ Exception -> 0x012c }
            r2.label = r5     // Catch:{ Exception -> 0x012c }
            java.lang.Object r1 = p000.b50.m55768e(r1, r4, r2)     // Catch:{ Exception -> 0x012c }
            if (r1 != r3) goto L_0x012c
            return r3
        L_0x012c:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall.mo57342Z(ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo57343a0(p000.ns0<? super p000.r37> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingSolPrice$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingSolPrice$1 r2 = (net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingSolPrice$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingSolPrice$1 r2 = new net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingSolPrice$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0064
            if (r4 == r7) goto L_0x0056
            if (r4 == r6) goto L_0x003d
            if (r4 != r5) goto L_0x0035
            p000.hg5.m45199b(r1)
            goto L_0x00ff
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            java.lang.Object r4 = r2.L$4
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r6 = r2.L$3
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r7 = r2.L$2
            net.safemoon.androidwallet.model.token.room.RoomToken r7 = (net.safemoon.androidwallet.model.token.room.RoomToken) r7
            java.lang.Object r9 = r2.L$1
            net.safemoon.androidwallet.common.TokenType r9 = (net.safemoon.androidwallet.common.TokenType) r9
            java.lang.Object r10 = r2.L$0
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall r10 = (net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall) r10
            p000.hg5.m45199b(r1)
            goto L_0x00d7
        L_0x0056:
            java.lang.Object r4 = r2.L$1
            net.safemoon.androidwallet.common.TokenType r4 = (net.safemoon.androidwallet.common.TokenType) r4
            java.lang.Object r7 = r2.L$0
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall r7 = (net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall) r7
            p000.hg5.m45199b(r1)
            r9 = r4
            r10 = r7
            goto L_0x00ab
        L_0x0064:
            p000.hg5.m45199b(r1)
            pb2 r1 = r0.f41833e1
            if (r1 == 0) goto L_0x006e
            androidx.appcompat.widget.LinearLayoutCompat r1 = r1.f32640d
            goto L_0x006f
        L_0x006e:
            r1 = r8
        L_0x006f:
            r4 = 8
            if (r1 != 0) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            r1.setVisibility(r4)
        L_0x0077:
            pb2 r1 = r0.f41833e1
            if (r1 == 0) goto L_0x007e
            android.view.View r1 = r1.f32649m
            goto L_0x007f
        L_0x007e:
            r1 = r8
        L_0x007f:
            if (r1 != 0) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            r1.setVisibility(r4)
        L_0x0085:
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo r1 = r0.f41829Y
            if (r1 == 0) goto L_0x0101
            net.safemoon.androidwallet.common.TokenType$a r4 = net.safemoon.androidwallet.common.TokenType.Companion
            int r1 = r1.getChainId()
            net.safemoon.androidwallet.common.TokenType r1 = r4.mo57099b(r1)
            z57 r4 = r17.mo57340X()
            java.lang.String r9 = r1.getSymbolWithType()
            r2.L$0 = r0
            r2.L$1 = r1
            r2.label = r7
            java.lang.Object r4 = r4.mo50079f(r9, r2)
            if (r4 != r3) goto L_0x00a8
            return r3
        L_0x00a8:
            r10 = r0
            r9 = r1
            r1 = r4
        L_0x00ab:
            r7 = r1
            net.safemoon.androidwallet.model.token.room.RoomToken r7 = (net.safemoon.androidwallet.model.token.room.RoomToken) r7
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r1 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana
            net.safemoon.androidwallet.common.TokenType r4 = net.safemoon.androidwallet.common.TokenType.SOLANA
            net.safemoon.androidwallet.model.wallets.Wallet r11 = r10.f41831b1
            p000.vx2.m53588d(r11)
            r1.<init>(r4, r11)
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            java.lang.String r11 = r10.f41837q1
            if (r11 == 0) goto L_0x00de
            r2.L$0 = r10
            r2.L$1 = r9
            r2.L$2 = r7
            r2.L$3 = r4
            r2.L$4 = r4
            r2.label = r6
            java.lang.Object r1 = r1.mo61906s(r11, r2)
            if (r1 != r3) goto L_0x00d6
            return r3
        L_0x00d6:
            r6 = r4
        L_0x00d7:
            r4.element = r1
            r14 = r6
        L_0x00da:
            r13 = r7
            r15 = r9
            r12 = r10
            goto L_0x00e0
        L_0x00de:
            r14 = r4
            goto L_0x00da
        L_0x00e0:
            vm3 r1 = p000.qh1.m71266c()
            net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingSolPrice$2$2 r4 = new net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$loadingSolPrice$2$2
            r16 = 0
            r11 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r2.L$0 = r8
            r2.L$1 = r8
            r2.L$2 = r8
            r2.L$3 = r8
            r2.L$4 = r8
            r2.label = r5
            java.lang.Object r1 = p000.b50.m55768e(r1, r4, r2)
            if (r1 != r3) goto L_0x00ff
            return r3
        L_0x00ff:
            r37 r1 = (p000.r37) r1
        L_0x0101:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall.mo57343a0(ns0):java.lang.Object");
    }

    /* renamed from: d0 */
    public final void mo57344d0(RoomConnectedInfo roomConnectedInfo, long j, WCEthereumTransaction wCEthereumTransaction, WCSolanaSignTransaction wCSolanaSignTransaction, WCSolanaSignMessage wCSolanaSignMessage, Wallet wallet2, C8339c cVar) {
        vx2.m53591g(roomConnectedInfo, "rc");
        vx2.m53591g(wallet2, "wallet");
        vx2.m53591g(cVar, "iWalletConnectSmartContract");
        this.f41829Y = roomConnectedInfo;
        this.f41830Z = Long.valueOf(j);
        this.f41832e0 = wCEthereumTransaction;
        this.f41834k0 = wCSolanaSignTransaction;
        this.f41838v0 = wCSolanaSignMessage;
        this.f41831b1 = wallet2;
        this.f41828X = cVar;
    }

    /* renamed from: f0 */
    public final void mo57345f0(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, WalletConnectSmartContractCall.class.getCanonicalName());
    }

    /* renamed from: g0 */
    public final void mo57346g0() {
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        this.f41827U = a;
        if (a != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            vx2.m53590f(childFragmentManager, "childFragmentManager");
            a.mo57295D(childFragmentManager);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_wallet_connect_smart_contract_call, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        C8339c cVar = this.f41828X;
        if (cVar != null) {
            cVar.mo57351b();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String peerMeta;
        dn4 b;
        String peerMeta2;
        WCPeerMeta peerMeta3;
        String str;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        pb2 a = pb2.m49838a(view);
        this.f41833e1 = a;
        if (a != null) {
            a.f32641e.f21127e.setText(getString(R.string.smart_contract_screen_title));
            a.f32641e.f21125c.setOnClickListener(new fh7(this));
        }
        pb2 pb2 = this.f41833e1;
        if (pb2 != null) {
            pb2.f32638b.setOnClickListener(new gh7(this, pb2));
            Wallet wallet2 = this.f41831b1;
            if (wallet2 != null) {
                TokenType.C8246a aVar = TokenType.Companion;
                RoomConnectedInfo roomConnectedInfo = this.f41829Y;
                vx2.m53588d(roomConnectedInfo);
                String address = wallet2.getAddress(aVar.mo57099b(roomConnectedInfo.getChainId()).getCoinType().getValue());
                MaterialTextView materialTextView = pb2.f32648l;
                String displayName = wallet2.displayName();
                if (address != null) {
                    str = ol0.m70353d(address);
                } else {
                    str = null;
                }
                materialTextView.setText(displayName + "\n(" + str + ")");
            }
            RoomConnectedInfo roomConnectedInfo2 = this.f41829Y;
            if (!(roomConnectedInfo2 == null || (peerMeta2 = roomConnectedInfo2.getPeerMeta()) == null || (peerMeta3 = RoomExtensionKt.toPeerMeta(peerMeta2)) == null)) {
                vx2.m53590f(peerMeta3, "toPeerMeta()");
                pb2.f32645i.setText(peerMeta3.getUrl());
            }
            RoomConnectedInfo roomConnectedInfo3 = this.f41829Y;
            if (!(roomConnectedInfo3 == null || (peerMeta = roomConnectedInfo3.getPeerMeta()) == null || (b = en4.m57410b(peerMeta)) == null)) {
                pb2.f32645i.setText(b.mo51237c());
            }
            if (this.f41834k0 != null) {
                WebView webView = pb2.f32650n;
                vx2.m53590f(webView, "webViewForSimulateTransaction");
                webView.setVisibility(0);
                String json = new Gson().toJson((Object) this.f41834k0);
                Wallet wallet3 = this.f41831b1;
                vx2.m53588d(wallet3);
                pb2.f32650n.loadUrl(Uri.parse("file:///android_asset/web-solana/index.html?signTransactionPayload=" + json + "&secreatKeyinBase58=" + Base58.encodeNoCheck(new u56(wallet3.getPrivateKeyAsBytes(CoinType.SOLANA.value())).mo66180a())).toString());
                pb2.f32650n.getSettings().setJavaScriptEnabled(true);
                pb2.f32650n.addJavascriptInterface(new WebAppInterface(), "SafeMoon");
            } else {
                WebView webView2 = pb2.f32650n;
                vx2.m53590f(webView2, "webViewForSimulateTransaction");
                webView2.setVisibility(8);
            }
        }
        if (this.f41832e0 != null) {
            y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new WalletConnectSmartContractCall$onViewCreated$3$1(this, (ns0<? super WalletConnectSmartContractCall$onViewCreated$3$1>) null), 3, (Object) null);
        }
        mo57339W();
    }
}
