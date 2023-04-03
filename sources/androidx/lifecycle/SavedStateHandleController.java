package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

final class SavedStateHandleController implements C0715e {

    /* renamed from: a */
    public final String f3929a;

    /* renamed from: d */
    public boolean f3930d = false;

    /* renamed from: e */
    public final dl5 f3931e;

    public SavedStateHandleController(String str, dl5 dl5) {
        this.f3929a = str;
        this.f3931e = dl5;
    }

    /* renamed from: a */
    public void mo6363a(gl5 gl5, Lifecycle lifecycle) {
        if (!this.f3930d) {
            this.f3930d = true;
            lifecycle.mo6295a(this);
            gl5.mo20648h(this.f3929a, this.f3931e.mo18832h());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* renamed from: b */
    public dl5 mo6364b() {
        return this.f3931e;
    }

    /* renamed from: c */
    public boolean mo6365c() {
        return this.f3930d;
    }

    /* renamed from: f */
    public void mo907f(ug3 ug3, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f3930d = false;
            ug3.getLifecycle().mo6297c(this);
        }
    }
}
