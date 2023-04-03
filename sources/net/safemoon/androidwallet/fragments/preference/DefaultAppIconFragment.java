package net.safemoon.androidwallet.fragments.preference;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/preference/DefaultAppIconFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "onResume", "x", "Lyn;", "v", "appIconInfo", "u", "Lp92;", "k", "Lp92;", "binding", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: DefaultAppIconFragment.kt */
public final class DefaultAppIconFragment extends BaseMainFragment {

    /* renamed from: k */
    public p92 f42397k;

    /* renamed from: w */
    public static final void m68030w(DefaultAppIconFragment defaultAppIconFragment, View view) {
        vx2.m53591g(defaultAppIconFragment, "this$0");
        defaultAppIconFragment.mo50752i();
    }

    /* renamed from: y */
    public static final void m68031y(DefaultAppIconFragment defaultAppIconFragment, C9642yn ynVar, View view) {
        vx2.m53591g(defaultAppIconFragment, "this$0");
        vx2.m53591g(ynVar, "$appIconInfo");
        if (!vx2.m53586b(defaultAppIconFragment.mo58120v().mo67130a(), ynVar.mo67130a())) {
            C9001np.m69926K(new WeakReference(defaultAppIconFragment.requireActivity()), Integer.valueOf(R.string.change_app_icon_dialog_title), R.string.change_app_icon_dialog_content, R.string.change_app_icon_dialog_action, R.string.cancel, new DefaultAppIconFragment$setScreenWrapper$1$1$1$1$1(defaultAppIconFragment, ynVar), DefaultAppIconFragment$setScreenWrapper$1$1$1$1$2.INSTANCE);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        p92 a = p92.m49831a(layoutInflater.inflate(R.layout.fragment_default_screen, viewGroup, false));
        vx2.m53590f(a, "bind(inflater.inflate(R.…creen, container, false))");
        this.f42397k = a;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        return a.mo46669b();
    }

    public void onResume() {
        super.onResume();
        mo58121x();
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        p92 p92 = this.f42397k;
        if (p92 == null) {
            vx2.m53605u("binding");
            p92 = null;
        }
        p92.f32611c.f21127e.setText(R.string.default_app_icon);
        p92.f32611c.f21125c.setOnClickListener(new f61(this));
        mo58121x();
    }

    /* renamed from: u */
    public final void mo58119u(C9642yn ynVar) {
        PackageManager packageManager;
        C9642yn v = mo58120v();
        if (!vx2.m53586b(v.mo67130a(), ynVar.mo67130a())) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                packageManager = activity.getPackageManager();
            } else {
                packageManager = null;
            }
            if (packageManager != null) {
                FragmentActivity activity2 = getActivity();
                vx2.m53588d(activity2);
                packageManager.setComponentEnabledSetting(new ComponentName(activity2, ynVar.mo67130a()), 1, 1);
            }
            if (packageManager != null) {
                FragmentActivity activity3 = getActivity();
                vx2.m53588d(activity3);
                packageManager.setComponentEnabledSetting(new ComponentName(activity3, v.mo67130a()), 2, 1);
            }
        }
    }

    /* renamed from: v */
    public final C9642yn mo58120v() {
        PackageManager packageManager;
        lz0 lz0 = lz0.f40718a;
        String a = lz0.mo55989a();
        FragmentActivity activity = getActivity();
        T t = null;
        if (activity != null) {
            packageManager = activity.getPackageManager();
        } else {
            packageManager = null;
        }
        if (packageManager != null) {
            for (C9642yn ynVar : lz0.mo55990b()) {
                if (packageManager.getComponentEnabledSetting(new ComponentName(MyApplicationClass.m64669c(), ynVar.mo67130a())) == 1) {
                    a = ynVar.mo67130a();
                }
            }
        }
        Iterator<T> it = lz0.f40718a.mo55990b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (vx2.m53586b(((C9642yn) next).mo67130a(), a)) {
                t = next;
                break;
            }
        }
        C9642yn ynVar2 = (C9642yn) t;
        if (ynVar2 == null) {
            return (C9642yn) CollectionsKt___CollectionsKt.m47329Z(lz0.f40718a.mo55990b());
        }
        return ynVar2;
    }

    /* renamed from: x */
    public final void mo58121x() {
        p92 p92 = this.f42397k;
        if (p92 == null) {
            vx2.m53605u("binding");
            p92 = null;
        }
        LinearLayout linearLayout = p92.f32612d;
        linearLayout.removeAllViews();
        C9642yn v = mo58120v();
        for (C9642yn ynVar : lz0.f40718a.mo55990b()) {
            xy2 c = xy2.m54588c(getLayoutInflater(), linearLayout, false);
            c.f35728e.setText(ynVar.mo67132c());
            c.f35727d.setImageResource(ynVar.mo67131b());
            c.f35726c.setChecked(vx2.m53586b(v.mo67130a(), ynVar.mo67130a()));
            linearLayout.addView(c.mo49569b());
            c.mo49569b().setOnClickListener(new g61(this, ynVar));
        }
    }
}
