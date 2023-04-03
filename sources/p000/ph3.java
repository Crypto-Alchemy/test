package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lph3;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Lkotlin/Function1;", "a", "Lrc2;", "callback", "<init>", "(Lrc2;)V", "com.yariksoffice.lingver.library"}, mo44878k = 1, mo44879mv = {1, 4, 0})
/* renamed from: ph3 */
/* compiled from: LingverActivityLifecycleCallbacks.kt */
public final class ph3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final rc2<Activity, r37> f32706a;

    public ph3(rc2<? super Activity, r37> rc2) {
        vx2.m53592h(rc2, "callback");
        this.f32706a = rc2;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        vx2.m53592h(activity, "activity");
        this.f32706a.invoke(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        vx2.m53592h(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        vx2.m53592h(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        vx2.m53592h(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        vx2.m53592h(activity, "activity");
        vx2.m53592h(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        vx2.m53592h(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        vx2.m53592h(activity, "activity");
    }
}
