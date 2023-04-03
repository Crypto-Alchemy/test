package net.safemoon.androidwallet.fragments.walletconnect;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.ChooseNetworkActivity;
import net.safemoon.androidwallet.activity.ScannedCodeActivity;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.WalletConnectInterfaceFragment;
import net.safemoon.androidwallet.dialogs.WalletConnectInterfaceV2Fragment;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.fragments.walletconnect.WalletConnectFragment$walletConnect$2;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet;
import net.safemoon.androidwallet.viewmodels.HomeViewModel;
import net.safemoon.androidwallet.viewmodels.WalletConnectViewModel;
import net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel;
import net.safemoon.androidwallet.viewmodels.wcv2.connection.ConnectionsViewModel;
import net.safemoon.androidwallet.viewmodels.wcv2.sessionproposal.SessionProposalViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001Q\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bY\u0010ZJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0002¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b;\u0010#\u001a\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0J8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010OR\u001b\u0010T\u001a\u00020Q8BX\u0002¢\u0006\f\n\u0004\b<\u0010#\u001a\u0004\bR\u0010SR\u001b\u0010X\u001a\u00020U8BX\u0002¢\u0006\f\n\u0004\bR\u0010#\u001a\u0004\bV\u0010W¨\u0006["}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/walletconnect/WalletConnectFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment$b;", "Lr37;", "T", "", "L", "", "topic", "Y", "packageName", "X", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "e", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment$WalletConnectVersion;", "version", "c", "Lhu0;", "k", "Lhu0;", "ui", "Lnet/safemoon/androidwallet/viewmodels/WalletConnectViewModel;", "r", "Lef3;", "R", "()Lnet/safemoon/androidwallet/viewmodels/WalletConnectViewModel;", "walletConnectVM", "Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "s", "O", "()Lnet/safemoon/androidwallet/viewmodels/HomeViewModel;", "homeViewModel", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "x", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "recyclerTouchListener", "Lnet/safemoon/androidwallet/viewmodels/wcv2/Web3WalletViewModel;", "y", "S", "()Lnet/safemoon/androidwallet/viewmodels/wcv2/Web3WalletViewModel;", "web3walletViewModel", "Lnet/safemoon/androidwallet/viewmodels/wcv2/connection/ConnectionsViewModel;", "A", "M", "()Lnet/safemoon/androidwallet/viewmodels/wcv2/connection/ConnectionsViewModel;", "connectionsViewModel", "Lnet/safemoon/androidwallet/viewmodels/wcv2/sessionproposal/SessionProposalViewModel;", "B", "P", "()Lnet/safemoon/androidwallet/viewmodels/wcv2/sessionproposal/SessionProposalViewModel;", "sessionProposalViewModel", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceV2Fragment;", "C", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceV2Fragment;", "wcInterfaceV2Fragment", "H", "Z", "isListenerEvent", "Llb2;", "I", "Llb2;", "binding", "Lk04;", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "Lk04;", "peerLiveData", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment;", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment;", "wcInterfaceFragment", "net/safemoon/androidwallet/fragments/walletconnect/WalletConnectFragment$walletConnect$2$1", "Q", "()Lnet/safemoon/androidwallet/fragments/walletconnect/WalletConnectFragment$walletConnect$2$1;", "walletConnect", "Lgz0;", "N", "()Lgz0;", "dAppAdapter", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectFragment.kt */
public final class WalletConnectFragment extends BaseMainFragment implements WalletConnectInterfaceFragment.C8323b {

    /* renamed from: A */
    public final ef3 f42424A;

    /* renamed from: B */
    public final ef3 f42425B;

    /* renamed from: C */
    public WalletConnectInterfaceV2Fragment f42426C;

    /* renamed from: H */
    public boolean f42427H;

    /* renamed from: I */
    public lb2 f42428I;

    /* renamed from: L */
    public final k04<WCPeerMeta> f42429L;

    /* renamed from: M */
    public WalletConnectInterfaceFragment f42430M;

    /* renamed from: P */
    public final ef3 f42431P;

    /* renamed from: Q */
    public final ef3 f42432Q;

    /* renamed from: k */
    public final hu0 f42433k = iu0.m59111a(qh1.m71266c());

    /* renamed from: r */
    public final ef3 f42434r;

    /* renamed from: s */
    public final ef3 f42435s;

    /* renamed from: x */
    public RecyclerTouchListener f42436x;

    /* renamed from: y */
    public final ef3 f42437y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.walletconnect.WalletConnectFragment$a */
    /* compiled from: LiveData.kt */
    public static final class C8588a<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ WalletConnectFragment f42438a;

        public C8588a(WalletConnectFragment walletConnectFragment) {
            this.f42438a = walletConnectFragment;
        }

        public final void onChanged(T t) {
            this.f42438a.mo58161N().mo52076e(CollectionsKt___CollectionsKt.m47326W((List) t));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.walletconnect.WalletConnectFragment$b */
    /* compiled from: LiveData.kt */
    public static final class C8589b<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ WalletConnectFragment f42439a;

        public C8589b(WalletConnectFragment walletConnectFragment) {
            this.f42439a = walletConnectFragment;
        }

        public final void onChanged(T t) {
            String str = (String) t;
            if (str != null) {
                vx2.m53590f(str, "it");
                try {
                    this.f42439a.mo58162O().mo61234p().postValue(null);
                    if (StringsKt__StringsKt.m63081R(str, "relay-protocol", false, 2, (Object) null)) {
                        this.f42439a.mo58166S().mo62039c(str);
                    } else {
                        this.f42439a.mo58164Q().mo61995e(str);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "t", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.walletconnect.WalletConnectFragment$c */
    /* compiled from: LiveData.kt */
    public static final class C8590c<T> implements pf4 {

        /* renamed from: a */
        public final /* synthetic */ WalletConnectFragment f42440a;

        public C8590c(WalletConnectFragment walletConnectFragment) {
            this.f42440a = walletConnectFragment;
        }

        public final void onChanged(T t) {
            WCPeerMeta wCPeerMeta = (WCPeerMeta) t;
            WalletConnectFragment$walletConnect$2.C86011 B = this.f42440a.mo58164Q();
            if (wCPeerMeta != null) {
                MaterialButton materialButton = null;
                this.f42440a.f42429L.postValue(null);
                if (B.mo62003n().getRemotePeerId() == null) {
                    System.out.println("remotePeerId can't be null");
                    return;
                }
                String chainId = B.mo62003n().getChainId();
                if (chainId != null) {
                    this.f42440a.mo58165R().mo61794f().postValue(TokenType.Companion.mo57099b((int) ol0.m70330J(chainId)));
                }
                this.f42440a.f42430M = WalletConnectInterfaceFragment.f41811k0.mo57327a(wCPeerMeta, B.mo62003n().getChainId());
                WalletConnectInterfaceFragment D = this.f42440a.f42430M;
                if (D != null) {
                    FragmentManager childFragmentManager = this.f42440a.getChildFragmentManager();
                    vx2.m53590f(childFragmentManager, "childFragmentManager");
                    D.mo57326X(childFragmentManager);
                }
                lb2 v = this.f42440a.f42428I;
                if (v != null) {
                    materialButton = v.f31274b;
                }
                if (materialButton != null) {
                    materialButton.setEnabled(true);
                }
            }
        }
    }

    public WalletConnectFragment() {
        WalletConnectFragment$special$$inlined$viewModels$default$1 walletConnectFragment$special$$inlined$viewModels$default$1 = new WalletConnectFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ef3 b = C6169a.m47233b(lazyThreadSafetyMode, new WalletConnectFragment$special$$inlined$viewModels$default$2(walletConnectFragment$special$$inlined$viewModels$default$1));
        this.f42434r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(WalletConnectViewModel.class), new WalletConnectFragment$special$$inlined$viewModels$default$3(b), new WalletConnectFragment$special$$inlined$viewModels$default$4((pc2) null, b), new WalletConnectFragment$special$$inlined$viewModels$default$5(this, b));
        this.f42435s = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(HomeViewModel.class), new C8591x74b9db77(this), new C8592x74b9db78((pc2) null, this), new C8593x74b9db79(this));
        this.f42437y = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(Web3WalletViewModel.class), new C8594x74b9db7a(this), new C8595x74b9db7b((pc2) null, this), new C8596x74b9db7c(this));
        this.f42424A = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(ConnectionsViewModel.class), new C8597x74b9db7d(this), new C8598x74b9db7e((pc2) null, this), new C8599x74b9db7f(this));
        ef3 b2 = C6169a.m47233b(lazyThreadSafetyMode, new WalletConnectFragment$special$$inlined$viewModels$default$7(new WalletConnectFragment$special$$inlined$viewModels$default$6(this)));
        this.f42425B = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SessionProposalViewModel.class), new WalletConnectFragment$special$$inlined$viewModels$default$8(b2), new WalletConnectFragment$special$$inlined$viewModels$default$9((pc2) null, b2), new WalletConnectFragment$special$$inlined$viewModels$default$10(this, b2));
        this.f42429L = new k04<>();
        this.f42431P = C6169a.m47232a(new WalletConnectFragment$walletConnect$2(this));
        this.f42432Q = C6169a.m47232a(new WalletConnectFragment$dAppAdapter$2(this));
    }

    /* renamed from: U */
    public static final void m68101U(WalletConnectFragment walletConnectFragment, View view) {
        vx2.m53591g(walletConnectFragment, "this$0");
        walletConnectFragment.mo50752i();
    }

    /* renamed from: V */
    public static final void m68102V(WalletConnectFragment walletConnectFragment, lb2 lb2, View view) {
        ji4 m;
        C3529wa<Intent> b;
        vx2.m53591g(walletConnectFragment, "this$0");
        vx2.m53591g(lb2, "$this_apply");
        walletConnectFragment.mo58162O().mo61237s((String) null);
        ho2 m2 = walletConnectFragment.mo58053m();
        if (m2 != null && (m = m2.mo52268m()) != null && (b = m.mo52724b(new WalletConnectFragment$initView$2$1$1(lb2, walletConnectFragment))) != null) {
            b.mo27473a(new Intent(walletConnectFragment.requireActivity(), ScannedCodeActivity.class));
        }
    }

    /* renamed from: W */
    public static final void m68103W(WalletConnectFragment walletConnectFragment, int i, int i2) {
        RoomConnectedInfo dApp;
        vx2.m53591g(walletConnectFragment, "this$0");
        RoomConnectedInfoAndWallet c = walletConnectFragment.mo58161N().mo52074c(i2);
        if (c != null && (dApp = c.getDApp()) != null && i == R.id.btnDelete) {
            C9001np.m69927L(new WeakReference(walletConnectFragment.requireActivity()), (Integer) null, R.string.connection_message_disconnect, R.string.action_yes, R.string.action_no, new WalletConnectFragment$initView$2$2$1$1$1(walletConnectFragment, dApp), WalletConnectFragment$initView$2$2$1$1$2.INSTANCE, 2, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo58159L() {
        /*
            r13 = this;
            net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate r0 = net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate.f43174a
            hg7$i r0 = r0.mo62019m()
            r1 = 0
            if (r0 == 0) goto L_0x01b5
            java.util.Map r2 = r0.mo43262f()
            java.util.Collection r2 = r2.values()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x001a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x002e
            java.lang.Object r4 = r2.next()
            hg7$e$a r4 = (p000.hg7.C5904e.C5905a) r4
            java.util.List r4 = r4.mo43206a()
            p000.hk0.m45275z(r3, r4)
            goto L_0x001a
        L_0x002e:
            java.util.List r2 = p000.rx5.m71718a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x003b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r2.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L_0x003b
            r4.add(r5)
            goto L_0x003b
        L_0x0052:
            int r2 = r4.size()
            int r4 = r3.size()
            r5 = 2131952779(0x7f13048b, float:1.954201E38)
            if (r2 >= r4) goto L_0x0076
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            androidx.fragment.app.FragmentActivity r0 = r13.getActivity()
            r6.<init>(r0)
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r9 = 0
            r10 = 0
            r11 = 26
            r12 = 0
            p000.C9001np.m69943a0(r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x0076:
            androidx.fragment.app.FragmentActivity r2 = r13.getActivity()
            r4 = 1
            if (r2 == 0) goto L_0x009b
            java.lang.String r6 = "activity"
            p000.vx2.m53590f(r2, r6)
            net.safemoon.androidwallet.model.wallets.Wallet r2 = p000.ol0.m70351c(r2)
            if (r2 == 0) goto L_0x009b
            java.lang.String r2 = r2.getKA()
            if (r2 == 0) goto L_0x009b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0096
            r2 = r4
            goto L_0x0097
        L_0x0096:
            r2 = r1
        L_0x0097:
            if (r2 != r4) goto L_0x009b
            r2 = r4
            goto L_0x009c
        L_0x009b:
            r2 = r1
        L_0x009c:
            if (r2 == 0) goto L_0x00c1
            net.safemoon.androidwallet.viewmodels.wcv2.common.Chains r2 = net.safemoon.androidwallet.viewmodels.wcv2.common.Chains.SOLANA
            java.lang.String r2 = r2.getChainWcId()
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x00c1
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            androidx.fragment.app.FragmentActivity r0 = r13.getActivity()
            r6.<init>(r0)
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r9 = 0
            r10 = 0
            r11 = 26
            r12 = 0
            p000.C9001np.m69943a0(r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x00c1:
            java.util.List r2 = p000.rx5.m71718a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = p000.dk0.m43495u(r2, r5)
            r3.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x00d4:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0113
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.List r6 = p000.C9670z8.m74815a()
            java.util.Iterator r6 = r6.iterator()
        L_0x00e8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x010c
            java.lang.Object r7 = r6.next()
            r8 = r7
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r9 = r8.component1()
            net.safemoon.androidwallet.viewmodels.wcv2.common.Chains r9 = (net.safemoon.androidwallet.viewmodels.wcv2.common.Chains) r9
            java.lang.Object r8 = r8.component2()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r9.getChainWcId()
            boolean r8 = p000.vx2.m53586b(r8, r5)
            if (r8 == 0) goto L_0x00e8
            goto L_0x010d
        L_0x010c:
            r7 = 0
        L_0x010d:
            kotlin.Pair r7 = (kotlin.Pair) r7
            r3.add(r7)
            goto L_0x00d4
        L_0x0113:
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m47326W(r3)
            java.util.Map r2 = kotlin.collections.C6177b.m47369q(r2)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0128:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x018d
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            net.safemoon.androidwallet.viewmodels.wcv2.common.Chains r6 = (net.safemoon.androidwallet.viewmodels.wcv2.common.Chains) r6
            java.util.Map r7 = r0.mo43262f()
            java.util.Collection r7 = r7.values()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x014b:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x015f
            java.lang.Object r9 = r7.next()
            hg7$e$a r9 = (p000.hg7.C5904e.C5905a) r9
            java.util.List r9 = r9.mo43206a()
            p000.hk0.m45275z(r8, r9)
            goto L_0x014b
        L_0x015f:
            java.lang.String r7 = r6.getChainNamespace()
            java.lang.String r6 = r6.getChainReference()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = ":"
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            boolean r6 = r8.contains(r6)
            if (r6 == 0) goto L_0x0128
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            r3.put(r6, r5)
            goto L_0x0128
        L_0x018d:
            java.util.List r0 = p000.co3.m33134w(r3)
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r0)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto L_0x01b5
            net.safemoon.androidwallet.viewmodels.WalletConnectViewModel r1 = r13.mo58165R()
            k04 r1 = r1.mo61794f()
            net.safemoon.androidwallet.common.TokenType$a r2 = net.safemoon.androidwallet.common.TokenType.Companion
            java.lang.Object r0 = r0.getFirst()
            net.safemoon.androidwallet.viewmodels.wcv2.common.Chains r0 = (net.safemoon.androidwallet.viewmodels.wcv2.common.Chains) r0
            int r0 = r0.getChainId()
            net.safemoon.androidwallet.common.TokenType r0 = r2.mo57099b(r0)
            r1.postValue(r0)
            return r4
        L_0x01b5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.walletconnect.WalletConnectFragment.mo58159L():boolean");
    }

    /* renamed from: M */
    public final ConnectionsViewModel mo58160M() {
        return (ConnectionsViewModel) this.f42424A.getValue();
    }

    /* renamed from: N */
    public final gz0 mo58161N() {
        return (gz0) this.f42432Q.getValue();
    }

    /* renamed from: O */
    public final HomeViewModel mo58162O() {
        return (HomeViewModel) this.f42435s.getValue();
    }

    /* renamed from: P */
    public final SessionProposalViewModel mo58163P() {
        return (SessionProposalViewModel) this.f42425B.getValue();
    }

    /* renamed from: Q */
    public final WalletConnectFragment$walletConnect$2.C86011 mo58164Q() {
        return (WalletConnectFragment$walletConnect$2.C86011) this.f42431P.getValue();
    }

    /* renamed from: R */
    public final WalletConnectViewModel mo58165R() {
        return (WalletConnectViewModel) this.f42434r.getValue();
    }

    /* renamed from: S */
    public final Web3WalletViewModel mo58166S() {
        return (Web3WalletViewModel) this.f42437y.getValue();
    }

    /* renamed from: T */
    public final void mo58167T() {
        RecyclerView recyclerView;
        b36 b36;
        lb2 lb2 = this.f42428I;
        if (!(lb2 == null || (b36 = lb2.f31278f) == null)) {
            b36.f21125c.setOnClickListener(new mg7(this));
            b36.f21127e.setText(getText(R.string.wc_screen_title));
        }
        lb2 lb22 = this.f42428I;
        if (lb22 != null) {
            lb22.f31274b.setOnClickListener(new ng7(this, lb22));
            lb22.f31277e.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            lb22.f31277e.setAdapter(mo58161N());
            FragmentActivity requireActivity = requireActivity();
            lb2 lb23 = this.f42428I;
            if (lb23 != null) {
                recyclerView = lb23.f31277e;
            } else {
                recyclerView = null;
            }
            RecyclerTouchListener recyclerTouchListener = new RecyclerTouchListener(requireActivity, recyclerView);
            recyclerTouchListener.mo57036x(Integer.valueOf(R.id.btnDelete));
            recyclerTouchListener.mo57037y(R.id.rowFG, R.id.rowBG, new og7(this));
            this.f42436x = recyclerTouchListener;
            RecyclerView recyclerView2 = lb22.f31277e;
            vx2.m53588d(recyclerTouchListener);
            recyclerView2.mo9079k(recyclerTouchListener);
        }
        LiveData<List<RoomConnectedInfoAndWallet>> d = mo58165R().mo61792d();
        ug3 viewLifecycleOwner = getViewLifecycleOwner();
        vx2.m53590f(viewLifecycleOwner, "viewLifecycleOwner");
        d.observe(viewLifecycleOwner, new C8588a(this));
        k04<String> p = mo58162O().mo61234p();
        ug3 viewLifecycleOwner2 = getViewLifecycleOwner();
        vx2.m53590f(viewLifecycleOwner2, "viewLifecycleOwner");
        p.observe(viewLifecycleOwner2, new C8589b(this));
        k04<WCPeerMeta> k04 = this.f42429L;
        ug3 viewLifecycleOwner3 = getViewLifecycleOwner();
        vx2.m53590f(viewLifecycleOwner3, "viewLifecycleOwner");
        k04.observe(viewLifecycleOwner3, new C8590c(this));
        if (!this.f42427H) {
            this.f42427H = true;
            xz5<tj7> b = mo58166S().mo62038b();
            Lifecycle lifecycle = getLifecycle();
            vx2.m53590f(lifecycle, "lifecycle");
            e52.m57232x(e52.m57202C(FlowExtKt.m5022a(b, lifecycle, Lifecycle.State.STARTED), new WalletConnectFragment$initView$6(this, (ns0<? super WalletConnectFragment$initView$6>) null)), vg3.m28804a(this));
        }
        mo58160M().mo62065g();
    }

    /* renamed from: X */
    public final void mo58168X(String str) {
        Intent intent;
        PackageManager packageManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (packageManager = activity.getPackageManager()) == null) {
            intent = null;
        } else {
            intent = packageManager.getLaunchIntentForPackage(str);
        }
        startActivity(intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58169Y(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            net.safemoon.androidwallet.dialogs.WalletConnectInterfaceV2Fragment r1 = r0.f42426C
            if (r1 == 0) goto L_0x0009
            r1.mo22267l()
        L_0x0009:
            net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate r1 = net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate.f43174a
            hg7$i r2 = r1.mo62019m()
            if (r2 == 0) goto L_0x0097
            androidx.fragment.app.FragmentActivity r3 = r17.getActivity()
            if (r3 == 0) goto L_0x002d
            java.lang.String r4 = "activity"
            p000.vx2.m53590f(r3, r4)
            net.safemoon.androidwallet.model.wallets.Wallet r3 = p000.ol0.m70351c(r3)
            if (r3 == 0) goto L_0x002d
            java.lang.Long r3 = r3.getId()
            if (r3 == 0) goto L_0x002d
            long r3 = r3.longValue()
            goto L_0x002f
        L_0x002d:
            r3 = 0
        L_0x002f:
            r14 = r3
            net.safemoon.androidwallet.viewmodels.wcv2.sessionproposal.SessionProposalViewModel r3 = r17.mo58163P()
            qx5 r3 = r3.mo62068d()
            java.lang.String r6 = r2.mo43259d()
            java.lang.String r7 = r2.mo43260e()
            net.safemoon.androidwallet.viewmodels.WalletConnectViewModel r2 = r17.mo58165R()
            k04 r2 = r2.mo61794f()
            java.lang.Object r2 = r2.getValue()
            p000.vx2.m53588d(r2)
            net.safemoon.androidwallet.common.TokenType r2 = (net.safemoon.androidwallet.common.TokenType) r2
            int r9 = r2.getChainId()
            net.safemoon.androidwallet.utils.Common r2 = net.safemoon.androidwallet.utils.Common.f42577a
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            long r11 = r2.mo60893C(r4)
            net.safemoon.androidwallet.viewmodels.WalletConnectViewModel r2 = r17.mo58165R()
            k04 r2 = r2.mo61796h()
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto L_0x0072
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L_0x0072:
            p000.vx2.m53588d(r3)
            dn4 r3 = r3.mo65544a()
            java.lang.String r10 = p000.en4.m57409a(r3)
            net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo r3 = new net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo
            java.lang.String r4 = "walletConnectVM.isAutoDisconnect.value ?: false"
            p000.vx2.m53590f(r2, r4)
            boolean r13 = r2.booleanValue()
            r16 = 2
            r5 = r3
            r8 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r16)
            net.safemoon.androidwallet.viewmodels.WalletConnectViewModel r2 = r17.mo58165R()
            r2.mo61797i(r3)
        L_0x0097:
            r1.mo62022p()
            net.safemoon.androidwallet.viewmodels.HomeViewModel r1 = r17.mo58162O()
            java.lang.String r1 = r1.mo61227i()
            if (r1 == 0) goto L_0x00af
            r0.mo58168X(r1)
            net.safemoon.androidwallet.viewmodels.HomeViewModel r1 = r17.mo58162O()
            r2 = 0
            r1.mo61237s(r2)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.walletconnect.WalletConnectFragment.mo58169Y(java.lang.String):void");
    }

    /* renamed from: c */
    public void mo57328c(WalletConnectInterfaceFragment.WalletConnectVersion walletConnectVersion) {
        vx2.m53591g(walletConnectVersion, "version");
        if (walletConnectVersion == WalletConnectInterfaceFragment.WalletConnectVersion.V1) {
            WalletConnectFragment$walletConnect$2.C86011 Q = mo58164Q();
            TokenType value = mo58165R().mo61794f().getValue();
            Boolean value2 = mo58165R().mo61796h().getValue();
            if (value2 == null) {
                value2 = Boolean.FALSE;
            }
            RoomConnectedInfo d = Q.mo61994d(value, value2.booleanValue());
            if (d != null) {
                mo58164Q().mo61997g();
                mo58165R().mo61797i(d);
                WalletConnectInterfaceFragment walletConnectInterfaceFragment = this.f42430M;
                if (walletConnectInterfaceFragment != null) {
                    walletConnectInterfaceFragment.mo22267l();
                }
                String i = mo58162O().mo61227i();
                if (i != null) {
                    mo58168X(i);
                    mo58162O().mo61237s((String) null);
                    return;
                }
                return;
            }
            return;
        }
        mo58163P().mo62066b();
    }

    /* renamed from: e */
    public void mo57329e(TokenType tokenType) {
        ji4 m;
        C3529wa<Intent> b;
        vx2.m53591g(tokenType, "tokenType");
        ho2 m2 = mo58053m();
        if (m2 != null && (m = m2.mo52268m()) != null && (b = m.mo52724b(new WalletConnectFragment$onSelectNetwork$1(this))) != null) {
            ChooseNetworkActivity.C8180a aVar = ChooseNetworkActivity.f41399x;
            Context requireContext = requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            b.mo27473a(aVar.mo56828a(requireContext, tokenType));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_wallet_connect, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        this.f42428I = lb2.m47753a(view);
        mo58167T();
    }
}
