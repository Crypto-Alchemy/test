package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.C4805b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: oz1 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class oz1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Set<Intent> f32502a = Collections.newSetFromMap(new WeakHashMap());

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        Intent intent = activity.getIntent();
        if (intent != null && this.f32502a.add(intent) && (extras = intent.getExtras()) != null) {
            Bundle bundle2 = extras.getBundle("gcm.n.analytics_data");
            if (C4805b.m38631B(bundle2)) {
                C4805b.m38652u(bundle2);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f32502a.remove(activity.getIntent());
        }
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
