package p000;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: e32 */
/* compiled from: FirstFrameAndAfterTrimMemoryWaiter */
public final class e32 implements wb2, ComponentCallbacks2 {
    /* renamed from: a */
    public void mo19080a(Activity activity) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        onTrimMemory(20);
    }

    public void onTrimMemory(int i) {
    }
}
