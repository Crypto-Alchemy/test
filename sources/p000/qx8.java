package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

@TargetApi(14)
/* renamed from: qx8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class qx8 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ sx8 f33296a;

    public /* synthetic */ qx8(sx8 sx8, iw8 iw8) {
        this.f33296a = sx8;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kr8 kr8;
        boolean z;
        String str;
        try {
            this.f33296a.f34342a.mo45237A().mo29678v().mo48769a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                kr8 = this.f33296a.f34342a;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f33296a.f34342a.mo45243G();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z2 = true;
                        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (true != z) {
                            str = "auto";
                        } else {
                            str = "gs";
                        }
                        String str2 = str;
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z2 = false;
                        }
                        this.f33296a.f34342a.mo45272s().mo41640o(new nx8(this, z2, data, str2, queryParameter));
                        kr8 = this.f33296a.f34342a;
                    }
                }
                kr8 = this.f33296a.f34342a;
            }
        } catch (RuntimeException e) {
            this.f33296a.f34342a.mo45237A().mo29670l().mo48770b("Throwable caught in onActivityCreated", e);
            kr8 = this.f33296a.f34342a;
        } catch (Throwable th) {
            this.f33296a.f34342a.mo45253Q().mo44646y(activity, bundle);
            throw th;
        }
        kr8.mo45253Q().mo44646y(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f33296a.f34342a.mo45253Q().mo44635D(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f33296a.f34342a.mo45253Q().mo44633B(activity);
        v39 C = this.f33296a.f34342a.mo45239C();
        C.f34342a.mo45272s().mo41640o(new b39(C, C.f34342a.mo45256a().mo29581b()));
    }

    public final void onActivityResumed(Activity activity) {
        v39 C = this.f33296a.f34342a.mo45239C();
        C.f34342a.mo45272s().mo41640o(new y29(C, C.f34342a.mo45256a().mo29581b()));
        this.f33296a.f34342a.mo45253Q().mo44647z(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f33296a.f34342a.mo45253Q().mo44634C(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
