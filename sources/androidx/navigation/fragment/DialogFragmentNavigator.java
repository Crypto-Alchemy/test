package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0715e;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.HashSet;

@Navigator.C1127b("dialog")
public final class DialogFragmentNavigator extends Navigator<C1130a> {

    /* renamed from: c */
    public final Context f6079c;

    /* renamed from: d */
    public final FragmentManager f6080d;

    /* renamed from: e */
    public int f6081e = 0;

    /* renamed from: f */
    public final HashSet<String> f6082f = new HashSet<>();

    /* renamed from: g */
    public C0715e f6083g = new C0715e() {
        /* renamed from: f */
        public void mo907f(ug3 ug3, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                kf1 kf1 = (kf1) ug3;
                if (!kf1.mo22277t().isShowing()) {
                    NavHostFragment.m8359i(kf1).mo8466W();
                }
            }
        }
    };

    /* renamed from: androidx.navigation.fragment.DialogFragmentNavigator$a */
    public static class C1130a extends NavDestination implements w42 {

        /* renamed from: C */
        public String f6085C;

        public C1130a(Navigator<? extends C1130a> navigator) {
            super((Navigator<? extends NavDestination>) navigator);
        }

        /* renamed from: H */
        public void mo8404H(Context context, AttributeSet attributeSet) {
            super.mo8404H(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, j55.DialogFragmentNavigator);
            String string = obtainAttributes.getString(j55.DialogFragmentNavigator_android_name);
            if (string != null) {
                mo8613R(string);
            }
            obtainAttributes.recycle();
        }

        /* renamed from: Q */
        public final String mo8612Q() {
            String str = this.f6085C;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        /* renamed from: R */
        public final C1130a mo8613R(String str) {
            this.f6085C = str;
            return this;
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        this.f6079c = context;
        this.f6080d = fragmentManager;
    }

    /* renamed from: h */
    public void mo8601h(Bundle bundle) {
        if (bundle != null) {
            this.f6081e = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            for (int i = 0; i < this.f6081e; i++) {
                FragmentManager fragmentManager = this.f6080d;
                kf1 kf1 = (kf1) fragmentManager.mo5984l0("androidx-nav-fragment:navigator:dialog:" + i);
                if (kf1 != null) {
                    kf1.getLifecycle().mo6295a(this.f6083g);
                } else {
                    HashSet<String> hashSet = this.f6082f;
                    hashSet.add("androidx-nav-fragment:navigator:dialog:" + i);
                }
            }
        }
    }

    /* renamed from: i */
    public Bundle mo8602i() {
        if (this.f6081e == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f6081e);
        return bundle;
    }

    /* renamed from: k */
    public boolean mo8401k() {
        if (this.f6081e == 0 || this.f6080d.mo5947R0()) {
            return false;
        }
        FragmentManager fragmentManager = this.f6080d;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i = this.f6081e - 1;
        this.f6081e = i;
        sb.append(i);
        Fragment l0 = fragmentManager.mo5984l0(sb.toString());
        if (l0 != null) {
            l0.getLifecycle().mo6297c(this.f6083g);
            ((kf1) l0).mo22266k();
        }
        return true;
    }

    /* renamed from: l */
    public C1130a mo8399a() {
        return new C1130a(this);
    }

    /* renamed from: m */
    public NavDestination mo8400d(C1130a aVar, Bundle bundle, m44 m44, Navigator.C1126a aVar2) {
        if (this.f6080d.mo5947R0()) {
            return null;
        }
        String Q = aVar.mo8612Q();
        if (Q.charAt(0) == '.') {
            Q = this.f6079c.getPackageName() + Q;
        }
        Fragment a = this.f6080d.mo6012v0().mo6039a(this.f6079c.getClassLoader(), Q);
        if (kf1.class.isAssignableFrom(a.getClass())) {
            kf1 kf1 = (kf1) a;
            kf1.setArguments(bundle);
            kf1.getLifecycle().mo6295a(this.f6083g);
            FragmentManager fragmentManager = this.f6080d;
            StringBuilder sb = new StringBuilder();
            sb.append("androidx-nav-fragment:navigator:dialog:");
            int i = this.f6081e;
            this.f6081e = i + 1;
            sb.append(i);
            kf1.mo22281x(fragmentManager, sb.toString());
            return aVar;
        }
        throw new IllegalArgumentException("Dialog destination " + aVar.mo8612Q() + " is not an instance of DialogFragment");
    }

    /* renamed from: n */
    public void mo8611n(Fragment fragment) {
        if (this.f6082f.remove(fragment.getTag())) {
            fragment.getLifecycle().mo6295a(this.f6083g);
        }
    }
}
