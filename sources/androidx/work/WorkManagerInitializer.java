package androidx.work;

import android.content.Context;
import androidx.work.C1515a;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements fu2<mm7> {

    /* renamed from: a */
    public static final String f7485a = qk3.m25728f("WrkMgrInitializer");

    /* renamed from: a */
    public List<Class<? extends fu2<?>>> mo5598a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public mm7 mo5599b(Context context) {
        qk3.m25726c().mo25135a(f7485a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        mm7.m22390g(context, new C1515a.C1517b().mo10919a());
        return mm7.m22389f(context);
    }
}
