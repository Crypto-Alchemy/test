package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.util.Log;

/* renamed from: oi */
/* compiled from: AndroidInjection */
public final class C6316oi {
    /* renamed from: a */
    public static gl2 m49328a(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 == null) {
                Activity activity = fragment.getActivity();
                if (activity instanceof gl2) {
                    return (gl2) activity;
                }
                if (activity.getApplication() instanceof gl2) {
                    return (gl2) activity.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
            }
        } while (!(fragment2 instanceof gl2));
        return (gl2) fragment2;
    }

    /* renamed from: b */
    public static void m49329b(Activity activity) {
        fu4.m44412c(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof gl2) {
            m49334g(activity, (gl2) application);
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), gl2.class.getCanonicalName()}));
        }
    }

    /* renamed from: c */
    public static void m49330c(Fragment fragment) {
        fu4.m44412c(fragment, "fragment");
        gl2 a = m49328a(fragment);
        if (Log.isLoggable("dagger.android", 3)) {
            String.format("An injector for %s was found in %s", new Object[]{fragment.getClass().getCanonicalName(), a.getClass().getCanonicalName()});
        }
        m49334g(fragment, a);
    }

    /* renamed from: d */
    public static void m49331d(Service service) {
        fu4.m44412c(service, "service");
        Application application = service.getApplication();
        if (application instanceof gl2) {
            m49334g(service, (gl2) application);
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), gl2.class.getCanonicalName()}));
        }
    }

    /* renamed from: e */
    public static void m49332e(BroadcastReceiver broadcastReceiver, Context context) {
        fu4.m44412c(broadcastReceiver, "broadcastReceiver");
        fu4.m44412c(context, "context");
        Application application = (Application) context.getApplicationContext();
        if (application instanceof gl2) {
            m49334g(broadcastReceiver, (gl2) application);
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), gl2.class.getCanonicalName()}));
        }
    }

    /* renamed from: f */
    public static void m49333f(ContentProvider contentProvider) {
        fu4.m44412c(contentProvider, "contentProvider");
        Application application = (Application) contentProvider.getContext().getApplicationContext();
        if (application instanceof gl2) {
            m49334g(contentProvider, (gl2) application);
        } else {
            throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), gl2.class.getCanonicalName()}));
        }
    }

    /* renamed from: g */
    public static void m49334g(Object obj, gl2 gl2) {
        C6359pi<Object> a = gl2.mo41874a();
        fu4.m44413d(a, "%s.androidInjector() returned null", gl2.getClass());
        a.mo46743a(obj);
    }
}
