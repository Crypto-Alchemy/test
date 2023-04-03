package net.safemoon.androidwallet.fragments.preference;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import kotlin.Metadata;
import kotlin.Pair;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTHomeActivity;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/preference/DefaultScreenFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "onResume", "u", "Lp92;", "k", "Lp92;", "binding", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: DefaultScreenFragment.kt */
public final class DefaultScreenFragment extends BaseMainFragment {

    /* renamed from: k */
    public p92 f42408k;

    /* renamed from: t */
    public static final void m68057t(DefaultScreenFragment defaultScreenFragment, View view) {
        vx2.m53591g(defaultScreenFragment, "this$0");
        defaultScreenFragment.mo50752i();
    }

    /* renamed from: v */
    public static final void m68058v(LinearLayout linearLayout, jz2 jz2, Pair pair, View view) {
        vx2.m53591g(linearLayout, "$this_with");
        vx2.m53591g(jz2, "$this_run");
        vx2.m53591g(pair, "$pair");
        for (View findViewById : dc7.m14987a(linearLayout)) {
            ((MaterialCheckBox) findViewById.findViewById(R.id.cbSelect)).setChecked(false);
        }
        jz2.f30670b.setChecked(true);
        g06 g06 = g06.f37938a;
        Context context = linearLayout.getContext();
        vx2.m53590f(context, "context");
        g06.mo51837f(context, ((Number) pair.getFirst()).intValue());
        MyApplicationClass.m64669c().f41188g = true;
        AKTHomeActivity.m64859h1(linearLayout.getContext(), (Integer) pair.getFirst());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        p92 a = p92.m49831a(layoutInflater.inflate(R.layout.fragment_default_screen, viewGroup, false));
        vx2.m53590f(a, "bind(inflater.inflate(R.…creen, container, false))");
        this.f42408k = a;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        return a.mo46669b();
    }

    public void onResume() {
        super.onResume();
        mo58137u();
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        p92 p92 = this.f42408k;
        if (p92 == null) {
            vx2.m53605u("binding");
            p92 = null;
        }
        p92.f32611c.f21127e.setText(R.string.screen_title_default_screen);
        p92.f32611c.f21125c.setOnClickListener(new u91(this));
        mo58137u();
    }

    /* renamed from: u */
    public final void mo58137u() {
        p92 p92 = this.f42408k;
        if (p92 == null) {
            vx2.m53605u("binding");
            p92 = null;
        }
        LinearLayout linearLayout = p92.f32612d;
        linearLayout.removeAllViews();
        for (Pair pair : lz0.f40718a.mo55991c()) {
            boolean z = false;
            jz2 c = jz2.m46812c(getLayoutInflater(), linearLayout, false);
            c.f30671c.setText(((Number) pair.getSecond()).intValue());
            linearLayout.addView(c.mo44631b());
            MaterialCheckBox materialCheckBox = c.f30670b;
            int intValue = ((Number) pair.getFirst()).intValue();
            g06 g06 = g06.f37938a;
            Context context = linearLayout.getContext();
            vx2.m53590f(context, "context");
            if (intValue == g06.mo51833b(context)) {
                z = true;
            }
            materialCheckBox.setChecked(z);
            c.mo44631b().setOnClickListener(new t91(linearLayout, c, pair));
        }
    }
}
