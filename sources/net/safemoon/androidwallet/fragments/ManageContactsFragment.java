package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/ManageContactsFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "F", "C", "Ly92;", "k", "Ly92;", "binding", "Lnet/safemoon/androidwallet/viewmodels/ContactViewModel;", "r", "Lef3;", "A", "()Lnet/safemoon/androidwallet/viewmodels/ContactViewModel;", "contactViewModel", "Lan3;", "s", "z", "()Lan3;", "adapter", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ManageContactsFragment.kt */
public final class ManageContactsFragment extends BaseMainFragment {

    /* renamed from: k */
    public y92 f41970k;

    /* renamed from: r */
    public final ef3 f41971r;

    /* renamed from: s */
    public final ef3 f41972s = C6169a.m47232a(new ManageContactsFragment$adapter$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ManageContactsFragment$a", "Lbp1;", "Landroid/text/Editable;", "p0", "Lr37;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ManageContactsFragment$a */
    /* compiled from: ManageContactsFragment.kt */
    public static final class C8391a extends bp1 {

        /* renamed from: a */
        public final /* synthetic */ ManageContactsFragment f41973a;

        public C8391a(ManageContactsFragment manageContactsFragment) {
            this.f41973a = manageContactsFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f41973a.mo57498z().mo50262g(String.valueOf(editable));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ManageContactsFragment$b", "Landroidx/recyclerview/widget/RecyclerView$i;", "Lr37;", "onChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ManageContactsFragment$b */
    /* compiled from: ManageContactsFragment.kt */
    public static final class C8392b extends RecyclerView.C1239i {

        /* renamed from: a */
        public final /* synthetic */ ManageContactsFragment f41974a;

        public C8392b(ManageContactsFragment manageContactsFragment) {
            this.f41974a = manageContactsFragment;
        }

        public void onChanged() {
            super.onChanged();
            y92 y92 = null;
            if (this.f41974a.mo57498z().getItemCount() == 0) {
                y92 w = this.f41974a.f41970k;
                if (w == null) {
                    vx2.m53605u("binding");
                    w = null;
                }
                TextView textView = w.f35806e;
                vx2.m53590f(textView, "binding.tvNoItemsMsg");
                boolean z = false;
                textView.setVisibility(0);
                y92 w2 = this.f41974a.f41970k;
                if (w2 == null) {
                    vx2.m53605u("binding");
                    w2 = null;
                }
                if (String.valueOf(w2.f35804c.f34980b.getText()).length() == 0) {
                    z = true;
                }
                if (z) {
                    y92 w3 = this.f41974a.f41970k;
                    if (w3 == null) {
                        vx2.m53605u("binding");
                    } else {
                        y92 = w3;
                    }
                    y92.f35806e.setText(this.f41974a.getText(R.string.contact_list_no_data));
                    return;
                }
                y92 w4 = this.f41974a.f41970k;
                if (w4 == null) {
                    vx2.m53605u("binding");
                } else {
                    y92 = w4;
                }
                y92.f35806e.setText(this.f41974a.getText(R.string.list_no_data));
                return;
            }
            y92 w5 = this.f41974a.f41970k;
            if (w5 == null) {
                vx2.m53605u("binding");
            } else {
                y92 = w5;
            }
            TextView textView2 = y92.f35806e;
            vx2.m53590f(textView2, "binding.tvNoItemsMsg");
            textView2.setVisibility(8);
        }
    }

    public ManageContactsFragment() {
        ManageContactsFragment$contactViewModel$2 manageContactsFragment$contactViewModel$2 = new ManageContactsFragment$contactViewModel$2(this);
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new ManageContactsFragment$special$$inlined$viewModels$default$2(new ManageContactsFragment$special$$inlined$viewModels$default$1(this)));
        this.f41971r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(ContactViewModel.class), new ManageContactsFragment$special$$inlined$viewModels$default$3(b), new ManageContactsFragment$special$$inlined$viewModels$default$4((pc2) null, b), manageContactsFragment$contactViewModel$2);
    }

    /* renamed from: B */
    public static final void m66592B(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: D */
    public static final void m66593D(ManageContactsFragment manageContactsFragment, View view) {
        vx2.m53591g(manageContactsFragment, "this$0");
        manageContactsFragment.mo50752i();
    }

    /* renamed from: E */
    public static final void m66594E(ManageContactsFragment manageContactsFragment, View view) {
        vx2.m53591g(manageContactsFragment, "this$0");
        j44 a = gn3.m58157a();
        vx2.m53590f(a, "actionManageContactsFragmentToAddContactFragment()");
        manageContactsFragment.mo50753j(a);
    }

    /* renamed from: G */
    public static final boolean m66595G(ManageContactsFragment manageContactsFragment, TextView textView, int i, KeyEvent keyEvent) {
        vx2.m53591g(manageContactsFragment, "this$0");
        if (i != 6) {
            return false;
        }
        a77.m55427e(manageContactsFragment.requireActivity());
        return true;
    }

    /* renamed from: A */
    public final ContactViewModel mo57495A() {
        return (ContactViewModel) this.f41971r.getValue();
    }

    /* renamed from: C */
    public final void mo57496C() {
        y92 y92 = this.f41970k;
        y92 y922 = null;
        if (y92 == null) {
            vx2.m53605u("binding");
            y92 = null;
        }
        y92.f35805d.f34318d.setOnClickListener(new dn3(this));
        y92 y923 = this.f41970k;
        if (y923 == null) {
            vx2.m53605u("binding");
            y923 = null;
        }
        y923.f35805d.f34320f.setText(getText(R.string.manage_contacts_title));
        y92 y924 = this.f41970k;
        if (y924 == null) {
            vx2.m53605u("binding");
        } else {
            y922 = y924;
        }
        y922.f35805d.f34317c.setOnClickListener(new en3(this));
    }

    /* renamed from: F */
    public final void mo57497F() {
        y92 y92 = this.f41970k;
        y92 y922 = null;
        if (y92 == null) {
            vx2.m53605u("binding");
            y92 = null;
        }
        y92.f35804c.f34980b.setOnEditorActionListener(new cn3(this));
        y92 y923 = this.f41970k;
        if (y923 == null) {
            vx2.m53605u("binding");
            y923 = null;
        }
        y923.f35804c.f34980b.addTextChangedListener(new vo6(new C8391a(this), 0, 2, (DefaultConstructorMarker) null));
        y92 y924 = this.f41970k;
        if (y924 == null) {
            vx2.m53605u("binding");
        } else {
            y922 = y924;
        }
        y922.f35803b.setAdapter(mo57498z());
        mo57498z().registerAdapterDataObserver(new C8392b(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        y92 a = y92.m54658a(layoutInflater.inflate(R.layout.fragment_manage_contacts, viewGroup, false));
        vx2.m53590f(a, "bind(\n            inflat…e\n            )\n        )");
        this.f41970k = a;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        ConstraintLayout b = a.mo49617b();
        vx2.m53590f(b, "binding.root");
        return b;
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        mo57496C();
        mo57497F();
        mo57495A().mo61100j().observe(getViewLifecycleOwner(), new bn3(new ManageContactsFragment$onViewCreated$1(this)));
    }

    /* renamed from: z */
    public final an3 mo57498z() {
        return (an3) this.f41972s.getValue();
    }
}
