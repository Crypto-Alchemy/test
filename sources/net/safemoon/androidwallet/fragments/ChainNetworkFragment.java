package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/ChainNetworkFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Lf92;", "k", "Lf92;", "binding", "Lwc0;", "r", "Lef3;", "v", "()Lwc0;", "chainNetworkAdapter", "<init>", "()V", "s", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ChainNetworkFragment.kt */
public final class ChainNetworkFragment extends BaseMainFragment {

    /* renamed from: s */
    public static final C8375a f41929s = new C8375a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public f92 f41930k;

    /* renamed from: r */
    public final ef3 f41931r = C6169a.m47232a(new ChainNetworkFragment$chainNetworkAdapter$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/ChainNetworkFragment$a;", "", "", "BUNDLE_TOKEN_CHAIN_KEY", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ChainNetworkFragment$a */
    /* compiled from: ChainNetworkFragment.kt */
    public static final class C8375a {
        public C8375a() {
        }

        public /* synthetic */ C8375a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ChainNetworkFragment$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ChainNetworkFragment$b */
    /* compiled from: ChainNetworkFragment.kt */
    public static final class C8376b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ ChainNetworkFragment f41932a;

        public C8376b(ChainNetworkFragment chainNetworkFragment) {
            this.f41932a = chainNetworkFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f41932a.mo57470v().getFilter().filter(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: w */
    public static final void m66539w(ChainNetworkFragment chainNetworkFragment, View view) {
        vx2.m53591g(chainNetworkFragment, "this$0");
        chainNetworkFragment.mo50752i();
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
        this.f41930k = a;
        f92 f92 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        a.f28792d.f21125c.setOnClickListener(new yc0(this));
        a.f28792d.f21127e.setText(R.string.screen_title_cc_network);
        RecyclerView recyclerView = a.f28790b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(mo57470v());
        f92 f922 = this.f41930k;
        if (f922 == null) {
            vx2.m53605u("binding");
        } else {
            f92 = f922;
        }
        f92.f28791c.f34980b.addTextChangedListener(new C8376b(this));
    }

    /* renamed from: v */
    public final wc0 mo57470v() {
        return (wc0) this.f41931r.getValue();
    }
}
