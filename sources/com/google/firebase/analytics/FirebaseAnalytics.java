package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.installations.C4782a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@19.0.0 */
public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile FirebaseAnalytics f25314b;

    /* renamed from: a */
    public final cm8 f25315a;

    public FirebaseAnalytics(cm8 cm8) {
        cu4.m43221k(cm8);
        this.f25315a = cm8;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f25314b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f25314b == null) {
                    f25314b = new FirebaseAnalytics(cm8.m33094r(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f25314b;
    }

    @Keep
    public static ux8 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        cm8 r = cm8.m33094r(context, (String) null, (String) null, (String) null, bundle);
        if (r == null) {
            return null;
        }
        return new je8(r);
    }

    /* renamed from: a */
    public void mo36096a(String str, Bundle bundle) {
        this.f25315a.mo30053v(str, bundle);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) jm6.m46616b(C4782a.m38440n().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f25315a.mo30035B(activity, str, str2);
    }
}
