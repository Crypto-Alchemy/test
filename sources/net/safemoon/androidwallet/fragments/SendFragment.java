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

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b \u0010!J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SendFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "v", "onClick", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "k", "Lnet/safemoon/androidwallet/viewmodels/MyTokensListViewModel;", "myTokenListViewModel", "Lqa2;", "r", "Lqa2;", "binding", "Lf14;", "s", "Lf14;", "myTokensAdapter", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "x", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SendFragment.kt */
public final class SendFragment extends BaseMainFragment implements View.OnClickListener {

    /* renamed from: k */
    public MyTokensListViewModel f42089k;

    /* renamed from: r */
    public qa2 f42090r;

    /* renamed from: s */
    public final f14 f42091s = new f14();

    /* renamed from: x */
    public MultiWalletViewModel f42092x;

    /* renamed from: A */
    public static final void m66990A(SendFragment sendFragment, View view) {
        vx2.m53591g(sendFragment, "this$0");
        MultiWalletViewModel multiWalletViewModel = sendFragment.f42092x;
        vx2.m53588d(multiWalletViewModel);
        AnchorSwitchWallet anchorSwitchWallet = new AnchorSwitchWallet(multiWalletViewModel, R.id.sendFragment);
        Context requireContext = sendFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53588d(view);
        qa2 qa2 = sendFragment.f42090r;
        vx2.m53588d(qa2);
        anchorSwitchWallet.mo57160h(requireContext, view, qa2.f33031e);
    }

    /* renamed from: B */
    public static final void m66991B(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: C */
    public static final void m66992C(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: z */
    public static final boolean m67001z(SendFragment sendFragment, View view) {
        vx2.m53591g(sendFragment, "this$0");
        MyTokensListViewModel myTokensListViewModel = sendFragment.f42089k;
        vx2.m53588d(myTokensListViewModel);
        C7047eg egVar = new C7047eg(myTokensListViewModel);
        Context requireContext = sendFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        vx2.m53588d(view);
        qa2 qa2 = sendFragment.f42090r;
        vx2.m53588d(qa2);
        egVar.mo51463f(requireContext, view, qa2.f33028b);
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
        View inflate = layoutInflater.inflate(R.layout.fragment_send, viewGroup, false);
        FragmentActivity requireActivity = requireActivity();
        vx2.m53590f(requireActivity, "requireActivity()");
        this.f42089k = (MyTokensListViewModel) new C0729l((hd7) requireActivity, (C0729l.C0733b) new MyViewModelFactory(new WeakReference(requireActivity()))).mo6421a(MyTokensListViewModel.class);
        this.f42092x = (MultiWalletViewModel) new C0729l(this).mo6421a(MultiWalletViewModel.class);
        qa2 a = qa2.m50489a(inflate);
        this.f42090r = a;
        vx2.m53588d(a);
        a.f33030d.setOnClickListener(this);
        qa2 qa2 = this.f42090r;
        vx2.m53588d(qa2);
        TextView textView = qa2.f33036j;
        vx2.m53590f(textView, "binding!!.tvWalletBlnc");
        ol0.m70343W(textView, new SendFragment$onCreateView$1(this));
        qa2 qa22 = this.f42090r;
        vx2.m53588d(qa22);
        qa22.f33036j.setOnLongClickListener(new lu5(this));
        qa2 qa23 = this.f42090r;
        vx2.m53588d(qa23);
        qa23.f33034h.setOnClickListener(new mu5(this));
        MyTokensListViewModel myTokensListViewModel = this.f42089k;
        vx2.m53588d(myTokensListViewModel);
        myTokensListViewModel.mo61298J().observe(getViewLifecycleOwner(), new nu5(new SendFragment$onCreateView$4(this)));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        qa2 qa2 = this.f42090r;
        vx2.m53588d(qa2);
        qa2.f33032f.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        qa2 qa22 = this.f42090r;
        vx2.m53588d(qa22);
        qa22.f33032f.setAdapter(this.f42091s);
        MyTokensListViewModel myTokensListViewModel = this.f42089k;
        vx2.m53588d(myTokensListViewModel);
        myTokensListViewModel.mo61297I().observe(getViewLifecycleOwner(), new ou5(new SendFragment$onViewCreated$1(this)));
        this.f42091s.mo51568k(new SendFragment$onViewCreated$2(this));
        Wallet.Companion companion = Wallet.Companion;
        String j = f06.m57519j(getContext(), "SAFEMOON_ACTIVE_WALLET", "");
        vx2.m53590f(j, "getString(\n            c…FEMOON_ACTIVE_WALLET, \"\")");
        Wallet wallet2 = companion.toWallet(j);
        if (wallet2 != null) {
            str = wallet2.displayName();
        } else {
            str = null;
        }
        qa2 qa23 = this.f42090r;
        vx2.m53588d(qa23);
        qa23.f33034h.setText(str);
    }
}
