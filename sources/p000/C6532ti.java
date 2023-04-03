package p000;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, mo44877d2 = {"Lti;", "", "Landroid/app/Application;", "application", "", "throttleTimeoutMillis", "Lkg3;", "a", "<init>", "()V", "scarlet-lifecycle-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: ti */
/* compiled from: AndroidLifecycle.kt */
public final class C6532ti {

    /* renamed from: a */
    public static final C6532ti f34269a = new C6532ti();

    /* renamed from: a */
    public static final kg3 m52298a(Application application, long j) {
        vx2.m53591g(application, "application");
        return new C6368pp(application, new yg3(j)).mo46830c(new xp0(application, (yg3) null, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: b */
    public static /* synthetic */ kg3 m52299b(Application application, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        return m52298a(application, j);
    }
}
