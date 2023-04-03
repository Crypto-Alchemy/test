package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1515a;
import androidx.work.C1521c;
import androidx.work.C1523d;
import androidx.work.ExistingWorkPolicy;
import java.util.Collections;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
/* renamed from: mm7 */
/* compiled from: WorkManager */
public abstract class mm7 {
    /* renamed from: f */
    public static mm7 m22389f(Context context) {
        return nm7.m23322m(context);
    }

    /* renamed from: g */
    public static void m22390g(Context context, C1515a aVar) {
        nm7.m23320g(context, aVar);
    }

    /* renamed from: a */
    public abstract mi4 mo23235a(String str);

    /* renamed from: b */
    public final mi4 mo23236b(C1523d dVar) {
        return mo23237c(Collections.singletonList(dVar));
    }

    /* renamed from: c */
    public abstract mi4 mo23237c(List<? extends C1523d> list);

    /* renamed from: d */
    public mi4 mo23238d(String str, ExistingWorkPolicy existingWorkPolicy, C1521c cVar) {
        return mo23239e(str, existingWorkPolicy, Collections.singletonList(cVar));
    }

    /* renamed from: e */
    public abstract mi4 mo23239e(String str, ExistingWorkPolicy existingWorkPolicy, List<C1521c> list);
}
