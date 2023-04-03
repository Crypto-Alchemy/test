package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: zl8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class zl8 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ cm8 f36184a;

    public zl8(cm8 cm8) {
        this.f36184a = cm8;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f36184a.mo30047n(new lk8(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f36184a.mo30047n(new wl8(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f36184a.mo30047n(new tk8(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f36184a.mo30047n(new qk8(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ud8 ud8 = new ud8();
        this.f36184a.mo30047n(new tl8(this, activity, ud8));
        Bundle r1 = ud8.mo48388r1(50);
        if (r1 != null) {
            bundle.putAll(r1);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f36184a.mo30047n(new pk8(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f36184a.mo30047n(new ql8(this, activity));
    }
}
