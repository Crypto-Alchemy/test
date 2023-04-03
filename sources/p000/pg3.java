package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ReportFragment;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pg3 */
/* compiled from: LifecycleDispatcher */
public class pg3 {

    /* renamed from: a */
    public static AtomicBoolean f16488a = new AtomicBoolean(false);

    /* renamed from: pg3$a */
    /* compiled from: LifecycleDispatcher */
    public static class C3069a extends oo1 {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ReportFragment.m5059g(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m24949a(Context context) {
        if (!f16488a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C3069a());
        }
    }
}
