package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import p000.fl2;
import p007co.nimblehq.recentapps.thumbnailhiding.RecentAppsThumbnailHidingActivity;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\u0014\u0010\u0013\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo44877d2 = {"Lm85;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "c", "d", "", "inRecentAppsMode", "f", "Lfl2;", "a", "Lfl2;", "hardwareKeyWatcher", "Lv44;", "Lv44;", "navigationBarObserver", "Llh4;", "e", "Llh4;", "navigationBarListener", "<init>", "()V", "library-recent-hide_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: m85 */
/* compiled from: RecentAppsThumbnailHidingLifecycleTracker.kt */
public final class m85 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public fl2 f14884a;

    /* renamed from: d */
    public v44 f14885d;

    /* renamed from: e */
    public lh4 f14886e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"m85$a", "Lfl2$b;", "Lr37;", "a", "b", "library-recent-hide_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: m85$a */
    /* compiled from: RecentAppsThumbnailHidingLifecycleTracker.kt */
    public static final class C2816a implements fl2.C2304b {

        /* renamed from: a */
        public final /* synthetic */ m85 f14887a;

        /* renamed from: b */
        public final /* synthetic */ Activity f14888b;

        public C2816a(m85 m85, Activity activity) {
            this.f14887a = m85;
            this.f14888b = activity;
        }

        /* renamed from: a */
        public void mo19966a() {
            this.f14887a.mo23094f(this.f14888b, true);
        }

        /* renamed from: b */
        public void mo19967b() {
            this.f14887a.mo23094f(this.f14888b, true);
        }
    }

    /* renamed from: e */
    public static final void m22096e(Activity activity, boolean z) {
        vx2.m53591g(activity, "$activity");
        if ((activity instanceof RecentAppsThumbnailHidingActivity) && ((RecentAppsThumbnailHidingActivity) activity).mo12132A()) {
            k85.m20571a(activity, z);
        }
    }

    /* renamed from: c */
    public final void mo23092c() {
        fl2 fl2 = this.f14884a;
        if (fl2 != null) {
            fl2.mo19964i();
        }
        this.f14884a = null;
    }

    /* renamed from: d */
    public final void mo23093d() {
        v44 v44 = this.f14885d;
        if (v44 != null) {
            v44.mo27057h();
            v44.mo27056g(this.f14886e);
        }
        this.f14885d = null;
        this.f14886e = null;
    }

    /* renamed from: f */
    public final void mo23094f(Activity activity, boolean z) {
        if (activity instanceof RecentAppsThumbnailHidingActivity) {
            if (!k85.m20572b(activity)) {
                ((RecentAppsThumbnailHidingActivity) activity).mo12136j(activity, z);
            }
        } else if (activity instanceof n85) {
            ((n85) activity).mo12136j(activity, z);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Context context;
        vx2.m53591g(activity, "activity");
        if (v44.m28615d()) {
            v44 v44 = this.f14885d;
            if (v44 != null) {
                context = v44.mo27054b();
            } else {
                context = null;
            }
            if (!vx2.m53586b(context, activity)) {
                mo23093d();
            }
            this.f14886e = new l85(activity);
            v44 c = v44.m28614c();
            c.mo27055f(activity);
            c.mo27053a(this.f14886e);
            this.f14885d = c;
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Context context;
        vx2.m53591g(activity, "activity");
        if (v44.m28615d()) {
            v44 v44 = this.f14885d;
            if (v44 != null) {
                context = v44.mo27054b();
            } else {
                context = null;
            }
            if (vx2.m53586b(context, activity)) {
                mo23093d();
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        vx2.m53591g(activity, "activity");
        mo23094f(activity, true);
    }

    public void onActivityResumed(Activity activity) {
        vx2.m53591g(activity, "activity");
        mo23094f(activity, false);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        vx2.m53591g(activity, "activity");
        vx2.m53591g(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        Context context;
        vx2.m53591g(activity, "activity");
        fl2 fl2 = this.f14884a;
        if (fl2 != null) {
            context = fl2.mo19959d();
        } else {
            context = null;
        }
        if (!vx2.m53586b(context, activity)) {
            mo23092c();
        }
        fl2 fl22 = new fl2(activity);
        fl22.mo19962g(new C2816a(this, activity));
        fl22.mo19963h();
        this.f14884a = fl22;
    }

    public void onActivityStopped(Activity activity) {
        Context context;
        vx2.m53591g(activity, "activity");
        fl2 fl2 = this.f14884a;
        if (fl2 != null) {
            context = fl2.mo19959d();
        } else {
            context = null;
        }
        if (vx2.m53586b(context, activity)) {
            mo23092c();
        }
    }
}
