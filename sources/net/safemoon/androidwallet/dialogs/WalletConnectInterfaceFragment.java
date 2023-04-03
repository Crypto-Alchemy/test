package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.bumptech.glide.C1710a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.Gson;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import java.lang.ref.WeakReference;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.common.BaseBottomSheetDialogFragment;
import net.safemoon.androidwallet.viewmodels.WalletConnectViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 12\u00020\u0001:\u0003234B\u0007¢\u0006\u0004\b/\u00100J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010 \u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR#\u0010%\u001a\n \u001d*\u0004\u0018\u00010!0!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00065"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment;", "Lnet/safemoon/androidwallet/dialogs/common/BaseBottomSheetDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/content/Context;", "context", "onAttach", "onDetach", "onStart", "Landroidx/fragment/app/FragmentManager;", "manager", "X", "Lnet/safemoon/androidwallet/viewmodels/WalletConnectViewModel;", "U", "Lef3;", "R", "()Lnet/safemoon/androidwallet/viewmodels/WalletConnectViewModel;", "walletConnectVM", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "kotlin.jvm.PlatformType", "Q", "()Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "peer", "", "Y", "getDefaultChainId", "()Ljava/lang/String;", "defaultChainId", "Lnb2;", "Z", "P", "()Lnb2;", "binding", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment$b;", "e0", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment$b;", "iInterface", "<init>", "()V", "k0", "a", "b", "WalletConnectVersion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectInterfaceFragment.kt */
public final class WalletConnectInterfaceFragment extends BaseBottomSheetDialogFragment {

    /* renamed from: k0 */
    public static final C8322a f41811k0 = new C8322a((DefaultConstructorMarker) null);

    /* renamed from: U */
    public final ef3 f41812U;

    /* renamed from: X */
    public final ef3 f41813X = C6169a.m47232a(new WalletConnectInterfaceFragment$peer$2(this));

    /* renamed from: Y */
    public final ef3 f41814Y = C6169a.m47232a(new WalletConnectInterfaceFragment$defaultChainId$2(this));

    /* renamed from: Z */
    public final ef3 f41815Z = C6169a.m47232a(new WalletConnectInterfaceFragment$binding$2(this));

    /* renamed from: e0 */
    public C8323b f41816e0;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment$WalletConnectVersion;", "", "(Ljava/lang/String;I)V", "V1", "V2", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WalletConnectInterfaceFragment.kt */
    public enum WalletConnectVersion {
        V1,
        V2
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment$a;", "", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "peer", "", "chainId", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.WalletConnectInterfaceFragment$a */
    /* compiled from: WalletConnectInterfaceFragment.kt */
    public static final class C8322a {
        public C8322a() {
        }

        public /* synthetic */ C8322a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final WalletConnectInterfaceFragment mo57327a(WCPeerMeta wCPeerMeta, String str) {
            vx2.m53591g(wCPeerMeta, "peer");
            WalletConnectInterfaceFragment walletConnectInterfaceFragment = new WalletConnectInterfaceFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_PEER", new Gson().toJson((Object) wCPeerMeta));
            bundle.putString("ARG_DEFAULT_CHAIN_ID", str);
            walletConnectInterfaceFragment.setArguments(bundle);
            return walletConnectInterfaceFragment;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment$b;", "", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment$WalletConnectVersion;", "version", "Lr37;", "c", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "e", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.WalletConnectInterfaceFragment$b */
    /* compiled from: WalletConnectInterfaceFragment.kt */
    public interface C8323b {
        /* renamed from: c */
        void mo57328c(WalletConnectVersion walletConnectVersion);

        /* renamed from: e */
        void mo57329e(TokenType tokenType);
    }

    public WalletConnectInterfaceFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new C8324x600d1b9f(new WalletConnectInterfaceFragment$walletConnectVM$2(this)));
        this.f41812U = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(WalletConnectViewModel.class), new C8325x600d1ba0(b), new C8326x600d1ba1((pc2) null, b), new C8327x600d1ba2(this, b));
    }

    /* renamed from: S */
    public static final void m66267S(WalletConnectInterfaceFragment walletConnectInterfaceFragment, View view) {
        vx2.m53591g(walletConnectInterfaceFragment, "this$0");
        walletConnectInterfaceFragment.mo22266k();
    }

    /* renamed from: T */
    public static final void m66268T(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: U */
    public static final void m66269U(WalletConnectInterfaceFragment walletConnectInterfaceFragment, View view) {
        C8323b bVar;
        vx2.m53591g(walletConnectInterfaceFragment, "this$0");
        TokenType value = walletConnectInterfaceFragment.mo57325R().mo61794f().getValue();
        if (value != null && (bVar = walletConnectInterfaceFragment.f41816e0) != null) {
            bVar.mo57329e(value);
        }
    }

    /* renamed from: V */
    public static final void m66270V(WalletConnectInterfaceFragment walletConnectInterfaceFragment, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(walletConnectInterfaceFragment, "this$0");
        walletConnectInterfaceFragment.mo57325R().mo61796h().postValue(Boolean.valueOf(z));
    }

    /* renamed from: W */
    public static final void m66271W(WalletConnectInterfaceFragment walletConnectInterfaceFragment, View view) {
        vx2.m53591g(walletConnectInterfaceFragment, "this$0");
        C9001np.m69926K(new WeakReference(walletConnectInterfaceFragment.requireActivity()), Integer.valueOf(R.string.wallet_connect_warning_dialog_title), R.string.wallet_connect_warning_dialog_content, R.string.change_app_icon_dialog_action, R.string.cancel, new WalletConnectInterfaceFragment$onViewCreated$2$4$1(walletConnectInterfaceFragment), WalletConnectInterfaceFragment$onViewCreated$2$4$2.INSTANCE);
    }

    /* renamed from: P */
    public final nb2 mo57323P() {
        return (nb2) this.f41815Z.getValue();
    }

    /* renamed from: Q */
    public final WCPeerMeta mo57324Q() {
        return (WCPeerMeta) this.f41813X.getValue();
    }

    /* renamed from: R */
    public final WalletConnectViewModel mo57325R() {
        return (WalletConnectViewModel) this.f41812U.getValue();
    }

    /* renamed from: X */
    public final void mo57326X(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, WalletConnectInterfaceFragment.class.getCanonicalName());
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
        if (requireParentFragment() instanceof C8323b) {
            Fragment requireParentFragment = requireParentFragment();
            vx2.m53589e(requireParentFragment, "null cannot be cast to non-null type net.safemoon.androidwallet.dialogs.WalletConnectInterfaceFragment.IInterface");
            this.f41816e0 = (C8323b) requireParentFragment;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_wallet_connect_interface, viewGroup, false);
    }

    public void onDetach() {
        super.onDetach();
        this.f41816e0 = null;
    }

    public void onStart() {
        super.onStart();
        ViewParent parent = requireView().getParent();
        vx2.m53589e(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior y = BottomSheetBehavior.m34816y((View) parent);
        vx2.m53590f(y, "from(requireView().parent as View)");
        y.mo31876V(3);
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        nb2 P = mo57323P();
        P.f32073m.f21127e.setText(getString(R.string.screen_title_wallet_connect));
        P.f32073m.f21125c.setOnClickListener(new rg7(this));
        nb2 P2 = mo57323P();
        P2.f32072l.setText(getString(R.string.wc_title_interface, mo57324Q().getName()));
        P2.f32069i.setText(mo57324Q().getUrl());
        if (!mo57324Q().getIcons().isEmpty()) {
            String str = mo57324Q().getIcons().get(0);
            int f = f06.m57515f(requireActivity().getApplicationContext(), "MODE_NIGHT", 1);
            if (StringsKt__StringsKt.m63081R(str, "swap.safemoon.com", false, 2, (Object) null) && f == 1) {
                str = "https://safemoon.com/img/logo_dark.png";
            }
            C1710a.m12225u(mo57323P().f32068h).mo23164y(str).mo11567a(qe5.m25623x0()).mo11553K0(mo57323P().f32068h);
        }
        mo57325R().mo61794f().observe(getViewLifecycleOwner(), new sg7(new WalletConnectInterfaceFragment$onViewCreated$2$1(this, P2)));
        P2.f32062b.setOnClickListener(new tg7(this));
        P2.f32071k.setOnCheckedChangeListener(new ug7(this));
        P2.f32070j.setOnClickListener(new vg7(this));
    }
}
