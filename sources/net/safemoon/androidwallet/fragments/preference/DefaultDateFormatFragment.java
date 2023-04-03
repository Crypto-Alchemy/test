package net.safemoon.androidwallet.fragments.preference;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import p000.l21;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/preference/DefaultDateFormatFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "onResume", "u", "Ln92;", "k", "Ln92;", "binding", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: DefaultDateFormatFragment.kt */
public final class DefaultDateFormatFragment extends BaseMainFragment {

    /* renamed from: k */
    public n92 f42398k;

    /* renamed from: t */
    public static final void m68037t(DefaultDateFormatFragment defaultDateFormatFragment, View view) {
        vx2.m53591g(defaultDateFormatFragment, "this$0");
        defaultDateFormatFragment.mo50752i();
    }

    /* renamed from: v */
    public static final void m68038v(LinearLayout linearLayout, jz2 jz2, DefaultDateFormatFragment defaultDateFormatFragment, String str, View view) {
        vx2.m53591g(linearLayout, "$this_with");
        vx2.m53591g(jz2, "$this_run");
        vx2.m53591g(defaultDateFormatFragment, "this$0");
        vx2.m53591g(str, "$dateFormat");
        for (View findViewById : dc7.m14987a(linearLayout)) {
            ((MaterialCheckBox) findViewById.findViewById(R.id.cbSelect)).setChecked(false);
        }
        jz2.f30670b.setChecked(true);
        l21.C7817a aVar = l21.f40561a;
        Context requireContext = defaultDateFormatFragment.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        aVar.mo55807d(requireContext, str);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        n92 a = n92.m48701a(layoutInflater.inflate(R.layout.fragment_default_date_format, viewGroup, false));
        vx2.m53590f(a, "bind(inflater.inflate(R.…ormat, container, false))");
        this.f42398k = a;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        return a.mo46044b();
    }

    public void onResume() {
        super.onResume();
        mo58124u();
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        n92 n92 = this.f42398k;
        if (n92 == null) {
            vx2.m53605u("binding");
            n92 = null;
        }
        n92.f32012c.f21127e.setText(R.string.screen_title_default_date_format);
        n92.f32012c.f21125c.setOnClickListener(new l71(this));
        mo58124u();
    }

    /* renamed from: u */
    public final void mo58124u() {
        n92 n92 = this.f42398k;
        if (n92 == null) {
            vx2.m53605u("binding");
            n92 = null;
        }
        LinearLayout linearLayout = n92.f32013d;
        linearLayout.removeAllViews();
        for (String str : ck0.m33058f(l21.f40561a.mo55804a(), "MM/dd/yyyy", "dd/MM/yyyy", "yyyy/MM/dd")) {
            jz2 c = jz2.m46812c(getLayoutInflater(), linearLayout, false);
            c.f30671c.setText(str);
            linearLayout.addView(c.mo44631b());
            MaterialCheckBox materialCheckBox = c.f30670b;
            l21.C7817a aVar = l21.f40561a;
            Context requireContext = requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            materialCheckBox.setChecked(vx2.m53586b(str, aVar.mo55806c(requireContext)));
            c.mo44631b().setOnClickListener(new k71(linearLayout, c, this, str));
        }
    }
}
