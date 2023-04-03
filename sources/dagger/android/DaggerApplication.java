package dagger.android;

import android.app.Application;
import com.google.errorprone.annotations.ForOverride;

public abstract class DaggerApplication extends Application implements gl2 {
    /* renamed from: a */
    public C6359pi<Object> mo41874a() {
        mo41877c();
        return null;
    }

    @ForOverride
    /* renamed from: b */
    public abstract C6359pi<? extends DaggerApplication> mo41876b();

    /* renamed from: c */
    public final void mo41877c() {
        synchronized (this) {
            mo41876b().mo46743a(this);
            throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
        }
    }

    public void onCreate() {
        super.onCreate();
        mo41877c();
    }
}
