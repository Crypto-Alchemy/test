package net.safemoon.androidwallet.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0729l;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.AnchorSwitchWallet;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;
import net.safemoon.androidwallet.viewmodels.factory.MyViewModelFactory;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b \u0010!J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/ReceiveFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "v", "onClick", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "k", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "myTokenListViewModel", "Lja2;", "r", "Lja2;", "binding", "Lf14;", "s", "Lf14;", "myTokensAdapter", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "x", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ReceiveFragment.kt */
public final class ReceiveFragment extends BaseMainFragment implements View.OnClickListener {

    /* renamed from: k */
    public MyTokensListViewModel f42018k;

    /* renamed from: r */
    public ja2 f42019r;

    /* renamed from: s */
    public final f14 f42020s = new f14();

    /* renamed from: x */
    public MultiWalletViewModel f42021x;

    /* renamed from: A */
    public static final void m66777A(ReceiveFragment receiveFragment, View view) {
        vx2.m53591g(receiveFragment, "this$0");
        MultiWalletViewModel multiWalletViewModel = receiveFragment.f42021x;
        vx2.m53588d(multiWalletViewModel);
        AnchorSwitchWallet anchorSwitchWallet = new AnchorSwitchWallet(multiWalletViewModel, R.id.ReceiveFragment);
        Context requireContext = receiveFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53588d(view);
        ja2 ja2 = receiveFragment.f42019r;
        vx2.m53588d(ja2);
        anchorSwitchWallet.mo57160h(requireContext, view, ja2.f30279e);
    }

    /* renamed from: B */
    public static final void m66778B(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: C */
    public static final void m66779C(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: z */
    public static final boolean m66788z(ReceiveFragment receiveFragment, View view) {
        vx2.m53591g(receiveFragment, "this$0");
        MyTokensListViewModel myTokensListViewModel = receiveFragment.f42018k;
        vx2.m53588d(myTokensListViewModel);
        C7047eg egVar = new C7047eg(myTokensListViewModel);
        Context requireContext = receiveFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53588d(view);
        ja2 ja2 = receiveFragment.f42019r;
        vx2.m53588d(ja2);
        egVar.mo51463f(requireContext, view, ja2.f30276b);
        return true;
    }

    public void onClick(View view) {
        vx2.m53591g(view, "v");
        if (view.getId() == R.id.iv_back) {
            mo50752i();
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_receive, viewGroup, false);
        FragmentActivity requireActivity = requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        this.f42018k = (MyTokensListViewModel) new C0729l((hd7) requireActivity, (C0729l.C0733b) new MyViewModelFactory(new WeakReference(requireActivity()))).mo6421a(MyTokensListViewModel.class);
        this.f42021x = (MultiWalletViewModel) new C0729l(this).mo6421a(MultiWalletViewModel.class);
        ja2 a = ja2.m46186a(inflate);
        this.f42019r = a;
        vx2.m53588d(a);
        a.f30278d.setOnClickListener(this);
        ja2 ja2 = this.f42019r;
        vx2.m53588d(ja2);
        TextView textView = ja2.f30284j;
        vx2.m53590f(textView, "binding!!.tvWalletBlnc");
        ol0.m70343W(textView, new ReceiveFragment$onCreateView$1(this));
        ja2 ja22 = this.f42019r;
        vx2.m53588d(ja22);
        ja22.f30284j.setOnLongClickListener(new a85(this));
        ja2 ja23 = this.f42019r;
        vx2.m53588d(ja23);
        ja23.f30282h.setOnClickListener(new b85(this));
        MyTokensListViewModel myTokensListViewModel = this.f42018k;
        vx2.m53588d(myTokensListViewModel);
        myTokensListViewModel.mo61298J().observe(getViewLifecycleOwner(), new c85(new ReceiveFragment$onCreateView$4(this)));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        ja2 ja2 = this.f42019r;
        vx2.m53588d(ja2);
        ja2.f30280f.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        ja2 ja22 = this.f42019r;
        vx2.m53588d(ja22);
        ja22.f30280f.setAdapter(this.f42020s);
        MyTokensListViewModel myTokensListViewModel = this.f42018k;
        vx2.m53588d(myTokensListViewModel);
        myTokensListViewModel.mo61297I().observe(getViewLifecycleOwner(), new d85(new ReceiveFragment$onViewCreated$1(this)));
        this.f42020s.mo51568k(new ReceiveFragment$onViewCreated$2(this));
        Wallet.Companion companion = Wallet.Companion;
        String j = f06.m57519j(getContext(), "SAFEMOON_ACTIVE_WALLET", "");
        vx2.m53590f(j, "getString(\n            c…FEMOON_ACTIVE_WALLET, \"\")");
        Wallet wallet2 = companion.toWallet(j);
        if (wallet2 != null) {
            str = wallet2.displayName();
        } else {
            str = null;
        }
        ja2 ja23 = this.f42019r;
        vx2.m53588d(ja23);
        ja23.f30282h.setText(str);
    }
}
