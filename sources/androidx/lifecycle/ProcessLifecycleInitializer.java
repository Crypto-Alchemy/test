package androidx.lifecycle;

import android.content.Context;
import java.util.Collections;
import java.util.List;

public final class ProcessLifecycleInitializer implements fu2<ug3> {
    /* renamed from: a */
    public List<Class<? extends fu2<?>>> mo5598a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public ug3 mo5599b(Context context) {
        if (C1641bo.m11483e(context).mo11735g(ProcessLifecycleInitializer.class)) {
            pg3.m24949a(context);
            C0720i.m5124i(context);
            return C0720i.m5123h();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
