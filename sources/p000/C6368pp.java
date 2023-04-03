package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import p000.kg3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002\"\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000b\u001a\u00020\n2.\u0010\t\u001a*\u0012\u000e\b\u0000\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0014\u0012\u000e\b\u0000\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006H\u0001R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0013"}, mo44877d2 = {"Lpp;", "Lkg3;", "", "others", "c", "([Lkg3;)Lkg3;", "Lnc6;", "Lkg3$a;", "kotlin.jvm.PlatformType", "p0", "Lr37;", "a", "Lyg3;", "Lyg3;", "lifecycleRegistry", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Lyg3;)V", "scarlet-lifecycle-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: pp */
/* compiled from: ApplicationResumedLifecycle.kt */
public final class C6368pp implements kg3 {

    /* renamed from: a */
    public final yg3 f32776a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0011"}, mo44877d2 = {"Lpp$a;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Lr37;", "onActivityPaused", "onActivityResumed", "onActivityStarted", "onActivityDestroyed", "Landroid/os/Bundle;", "outState", "onActivitySaveInstanceState", "onActivityStopped", "savedInstanceState", "onActivityCreated", "<init>", "(Lpp;)V", "scarlet-lifecycle-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: pp$a */
    /* compiled from: ApplicationResumedLifecycle.kt */
    public final class C6369a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public final /* synthetic */ C6368pp f32777a;

        public C6369a(C6368pp ppVar) {
            vx2.m53591g(ppVar, "this$0");
            this.f32777a = ppVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            vx2.m53591g(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            vx2.m53591g(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            vx2.m53591g(activity, "activity");
            this.f32777a.f32776a.onNext(new kg3.C6147a.C6150c.C6152b(new y06(1000, "App is paused")));
        }

        public void onActivityResumed(Activity activity) {
            vx2.m53591g(activity, "activity");
            this.f32777a.f32776a.onNext(kg3.C6147a.C6149b.f30871a);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            vx2.m53591g(activity, "activity");
            vx2.m53591g(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            vx2.m53591g(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            vx2.m53591g(activity, "activity");
        }
    }

    public C6368pp(Application application, yg3 yg3) {
        vx2.m53591g(application, "application");
        vx2.m53591g(yg3, "lifecycleRegistry");
        this.f32776a = yg3;
        application.registerActivityLifecycleCallbacks(new C6369a(this));
    }

    /* renamed from: a */
    public void mo40232a(nc6<? super kg3.C6147a> nc6) {
        this.f32776a.mo40232a(nc6);
    }

    /* renamed from: c */
    public kg3 mo46830c(kg3... kg3Arr) {
        vx2.m53591g(kg3Arr, "others");
        return this.f32776a.mo49646f(kg3Arr);
    }
}
