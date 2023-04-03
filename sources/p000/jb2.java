package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0714d;
import androidx.lifecycle.C0716f;
import androidx.lifecycle.C0726j;
import androidx.lifecycle.C0729l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;

/* renamed from: jb2 */
/* compiled from: FragmentViewLifecycleOwner */
public class jb2 implements C0714d, il5, hd7 {

    /* renamed from: a */
    public final Fragment f13568a;

    /* renamed from: d */
    public final gd7 f13569d;

    /* renamed from: e */
    public C0729l.C0733b f13570e;

    /* renamed from: g */
    public C0716f f13571g = null;

    /* renamed from: k */
    public hl5 f13572k = null;

    public jb2(Fragment fragment, gd7 gd7) {
        this.f13568a = fragment;
        this.f13569d = gd7;
    }

    /* renamed from: a */
    public void mo21800a(Lifecycle.Event event) {
        this.f13571g.mo6389h(event);
    }

    /* renamed from: b */
    public void mo21801b() {
        if (this.f13571g == null) {
            this.f13571g = new C0716f(this);
            hl5 a = hl5.m18968a(this);
            this.f13572k = a;
            a.mo21222c();
            SavedStateHandleSupport.m5075c(this);
        }
    }

    /* renamed from: c */
    public boolean mo21802c() {
        if (this.f13571g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo21803d(Bundle bundle) {
        this.f13572k.mo21223d(bundle);
    }

    /* renamed from: e */
    public void mo21804e(Bundle bundle) {
        this.f13572k.mo21224e(bundle);
    }

    /* renamed from: f */
    public void mo21805f(Lifecycle.State state) {
        this.f13571g.mo6395o(state);
    }

    public zv0 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f13568a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        j04 j04 = new j04();
        if (application != null) {
            j04.mo21704c(C0729l.C0730a.f3993g, application);
        }
        j04.mo21704c(SavedStateHandleSupport.f3932a, this);
        j04.mo21704c(SavedStateHandleSupport.f3933b, this);
        if (this.f13568a.getArguments() != null) {
            j04.mo21704c(SavedStateHandleSupport.f3934c, this.f13568a.getArguments());
        }
        return j04;
    }

    public C0729l.C0733b getDefaultViewModelProviderFactory() {
        C0729l.C0733b defaultViewModelProviderFactory = this.f13568a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f13568a.mDefaultFactory)) {
            this.f13570e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f13570e == null) {
            Application application = null;
            Context context = this.f13568a.requireContext().getApplicationContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Application) {
                    application = (Application) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            this.f13570e = new C0726j(application, this, this.f13568a.getArguments());
        }
        return this.f13570e;
    }

    public Lifecycle getLifecycle() {
        mo21801b();
        return this.f13571g;
    }

    public gl5 getSavedStateRegistry() {
        mo21801b();
        return this.f13572k.mo21221b();
    }

    public gd7 getViewModelStore() {
        mo21801b();
        return this.f13569d;
    }
}
