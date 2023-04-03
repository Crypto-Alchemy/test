package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/ChainNetworkReflectionFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Lnet/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel;", "k", "Lef3;", "v", "()Lnet/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel;", "customReflectionContractTokenViewModel", "Lf92;", "r", "Lf92;", "binding", "Lwc0;", "s", "u", "()Lwc0;", "chainNetworkAdapter", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ChainNetworkReflectionFragment.kt */
public final class ChainNetworkReflectionFragment extends BaseMainFragment {

    /* renamed from: k */
    public final ef3 f41933k;

    /* renamed from: r */
    public f92 f41934r;

    /* renamed from: s */
    public final ef3 f41935s = C6169a.m47232a(new ChainNetworkReflectionFragment$chainNetworkAdapter$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ChainNetworkReflectionFragment$a", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ChainNetworkReflectionFragment$a */
    /* compiled from: ChainNetworkReflectionFragment.kt */
    public static final class C8378a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ ChainNetworkReflectionFragment f41936a;

        public C8378a(ChainNetworkReflectionFragment chainNetworkReflectionFragment) {
            this.f41936a = chainNetworkReflectionFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f41936a.mo57475u().getFilter().filter(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public ChainNetworkReflectionFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new C8379x21344a4f(new C8384xb322b583(this)));
        this.f41933k = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CustomReflectionContractTokenViewModel.class), new C8380x21344a50(b), new C8381x21344a51((pc2) null, b), new C8382x21344a52(this, b));
    }

    /* renamed from: w */
    public static final void m66544w(ChainNetworkReflectionFragment chainNetworkReflectionFragment, View view) {
        vx2.m53591g(chainNetworkReflectionFragment, "this$0");
        chainNetworkReflectionFragment.requireActivity().onBackPressed();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_chain_network, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        f92 a = f92.m44232a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41934r = a;
        f92 f92 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        a.f28792d.f21125c.setOnClickListener(new zc0(this));
        a.f28792d.f21127e.setText(R.string.screen_title_cc_network);
        RecyclerView recyclerView = a.f28790b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(mo57475u());
        f92 f922 = this.f41934r;
        if (f922 == null) {
            vx2.m53605u("binding");
        } else {
            f92 = f922;
        }
        f92.f28791c.f34980b.addTextChangedListener(new C8378a(this));
    }

    /* renamed from: u */
    public final wc0 mo57475u() {
        return (wc0) this.f41935s.getValue();
    }

    /* renamed from: v */
    public final CustomReflectionContractTokenViewModel mo57476v() {
        return (CustomReflectionContractTokenViewModel) this.f41933k.getValue();
    }
}
