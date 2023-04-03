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
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.WalletConnectInterfaceFragment;
import net.safemoon.androidwallet.dialogs.common.BaseBottomSheetDialogFragment;
import net.safemoon.androidwallet.viewmodels.WalletConnectViewModel;
import net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate;
import net.safemoon.androidwallet.viewmodels.wcv2.sessionproposal.SessionProposalViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceV2Fragment;", "Lnet/safemoon/androidwallet/dialogs/common/BaseBottomSheetDialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Landroid/content/Context;", "context", "onAttach", "onDetach", "onStart", "Landroidx/fragment/app/FragmentManager;", "manager", "W", "Lnet/safemoon/androidwallet/viewmodels/WalletConnectViewModel;", "U", "Lef3;", "Q", "()Lnet/safemoon/androidwallet/viewmodels/WalletConnectViewModel;", "walletConnectVM", "Lnet/safemoon/androidwallet/viewmodels/wcv2/sessionproposal/SessionProposalViewModel;", "X", "P", "()Lnet/safemoon/androidwallet/viewmodels/wcv2/sessionproposal/SessionProposalViewModel;", "sessionProposalViewModel", "", "Y", "Z", "isApproved", "Lnb2;", "O", "()Lnb2;", "binding", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment$b;", "e0", "Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceFragment$b;", "iInterface", "<init>", "()V", "k0", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectInterfaceV2Fragment.kt */
public final class WalletConnectInterfaceV2Fragment extends BaseBottomSheetDialogFragment {

    /* renamed from: k0 */
    public static final C8328a f41820k0 = new C8328a((DefaultConstructorMarker) null);

    /* renamed from: U */
    public final ef3 f41821U;

    /* renamed from: X */
    public final ef3 f41822X;

    /* renamed from: Y */
    public boolean f41823Y;

    /* renamed from: Z */
    public final ef3 f41824Z = C6169a.m47232a(new WalletConnectInterfaceV2Fragment$binding$2(this));

    /* renamed from: e0 */
    public WalletConnectInterfaceFragment.C8323b f41825e0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/WalletConnectInterfaceV2Fragment$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.WalletConnectInterfaceV2Fragment$a */
    /* compiled from: WalletConnectInterfaceV2Fragment.kt */
    public static final class C8328a {
        public C8328a() {
        }

        public /* synthetic */ C8328a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WalletConnectInterfaceV2Fragment() {
        WalletConnectInterfaceV2Fragment$walletConnectVM$2 walletConnectInterfaceV2Fragment$walletConnectVM$2 = new WalletConnectInterfaceV2Fragment$walletConnectVM$2(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ef3 b = C6169a.m47233b(lazyThreadSafetyMode, new C8329x7e17ab3b(walletConnectInterfaceV2Fragment$walletConnectVM$2));
        this.f41821U = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(WalletConnectViewModel.class), new C8330x7e17ab3c(b), new C8331x7e17ab3d((pc2) null, b), new C8332x7e17ab3e(this, b));
        ef3 b2 = C6169a.m47233b(lazyThreadSafetyMode, new C8333x7e17ab3f(new WalletConnectInterfaceV2Fragment$sessionProposalViewModel$2(this)));
        this.f41822X = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SessionProposalViewModel.class), new C8334x7e17ab40(b2), new C8335x7e17ab41((pc2) null, b2), new C8336x7e17ab42(this, b2));
    }

    /* renamed from: R */
    public static final void m66286R(WalletConnectInterfaceV2Fragment walletConnectInterfaceV2Fragment, View view) {
        vx2.m53591g(walletConnectInterfaceV2Fragment, "this$0");
        walletConnectInterfaceV2Fragment.mo22266k();
    }

    /* renamed from: S */
    public static final void m66287S(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: T */
    public static final void m66288T(View view) {
    }

    /* renamed from: U */
    public static final void m66289U(WalletConnectInterfaceV2Fragment walletConnectInterfaceV2Fragment, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(walletConnectInterfaceV2Fragment, "this$0");
        walletConnectInterfaceV2Fragment.mo57335Q().mo61796h().postValue(Boolean.valueOf(z));
    }

    /* renamed from: V */
    public static final void m66290V(WalletConnectInterfaceV2Fragment walletConnectInterfaceV2Fragment, View view) {
        vx2.m53591g(walletConnectInterfaceV2Fragment, "this$0");
        WalletConnectInterfaceFragment.C8323b bVar = walletConnectInterfaceV2Fragment.f41825e0;
        if (bVar != null) {
            walletConnectInterfaceV2Fragment.f41823Y = true;
            bVar.mo57328c(WalletConnectInterfaceFragment.WalletConnectVersion.V2);
        }
    }

    /* renamed from: O */
    public final nb2 mo57333O() {
        return (nb2) this.f41824Z.getValue();
    }

    /* renamed from: P */
    public final SessionProposalViewModel mo57334P() {
        return (SessionProposalViewModel) this.f41822X.getValue();
    }

    /* renamed from: Q */
    public final WalletConnectViewModel mo57335Q() {
        return (WalletConnectViewModel) this.f41821U.getValue();
    }

    /* renamed from: W */
    public final void mo57336W(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, WalletConnectInterfaceFragment.class.getCanonicalName());
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
        if (requireParentFragment() instanceof WalletConnectInterfaceFragment.C8323b) {
            Fragment requireParentFragment = requireParentFragment();
            vx2.m53589e(requireParentFragment, "null cannot be cast to non-null type net.safemoon.androidwallet.dialogs.WalletConnectInterfaceFragment.IInterface");
            this.f41825e0 = (WalletConnectInterfaceFragment.C8323b) requireParentFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_wallet_connect_interface, viewGroup, false);
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f41823Y) {
            WCDelegate.f43174a.mo62022p();
        }
        this.f41825e0 = null;
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
        boolean z;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        nb2 O = mo57333O();
        O.f32073m.f21127e.setText(getString(R.string.screen_title_wallet_connect));
        O.f32073m.f21125c.setOnClickListener(new wg7(this));
        nb2 O2 = mo57333O();
        qx5 d = mo57334P().mo62068d();
        if (d != null) {
            dn4 a = d.mo65544a();
            O2.f32072l.setText(getString(R.string.wc_title_interface, a.mo51236b()));
            O2.f32069i.setText(a.mo51237c());
            if (a.mo51235a().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String a2 = a.mo51235a();
                int f = f06.m57515f(requireActivity().getApplicationContext(), "MODE_NIGHT", 1);
                if (StringsKt__StringsKt.m63081R(a2, "swap.safemoon.com", false, 2, (Object) null) && f == 1) {
                    a2 = "https://safemoon.com/img/logo_dark.png";
                }
                C1710a.m12225u(mo57333O().f32068h).mo23164y(a2).mo11567a(qe5.m25623x0()).mo11553K0(mo57333O().f32068h);
            }
        }
        mo57335Q().mo61794f().observe(getViewLifecycleOwner(), new xg7(new WalletConnectInterfaceV2Fragment$onViewCreated$2$2(this, O2)));
        O2.f32062b.setOnClickListener(new yg7());
        O2.f32071k.setOnCheckedChangeListener(new zg7(this));
        O2.f32070j.setOnClickListener(new ah7(this));
    }
}
