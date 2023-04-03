package com.onesignal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.github.mikephil.charting.utils.Utils;
import com.onesignal.C5179a;
import java.lang.ref.WeakReference;

/* renamed from: com.onesignal.v0 */
/* compiled from: OSViewUtils */
public class C5336v0 {

    /* renamed from: a */
    public static final int f26554a = m41348b(24);

    /* renamed from: com.onesignal.v0$a */
    /* compiled from: OSViewUtils */
    public class C5337a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f26555a;

        /* renamed from: d */
        public final /* synthetic */ Runnable f26556d;

        /* renamed from: com.onesignal.v0$a$a */
        /* compiled from: OSViewUtils */
        public class C5338a extends C5179a.C5181b {

            /* renamed from: a */
            public final /* synthetic */ C5179a f26557a;

            public C5338a(C5179a aVar) {
                this.f26557a = aVar;
            }

            /* renamed from: a */
            public void mo38609a(Activity activity) {
                this.f26557a.mo38666q(C5337a.this.f26555a);
                if (C5336v0.m41355i(activity)) {
                    C5337a.this.f26556d.run();
                } else {
                    C5336v0.m41347a(activity, C5337a.this.f26556d);
                }
            }
        }

        public C5337a(String str, Runnable runnable) {
            this.f26555a = str;
            this.f26556d = runnable;
        }

        public void run() {
            C5179a b = C6139ka.m46938b();
            if (b != null) {
                b.mo38651b(this.f26555a, new C5338a(b));
            }
        }
    }

    /* renamed from: a */
    public static void m41347a(Activity activity, Runnable runnable) {
        activity.getWindow().getDecorView().post(new C5337a("decorViewReady:" + runnable, runnable));
    }

    /* renamed from: b */
    public static int m41348b(int i) {
        return (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
    }

    /* renamed from: c */
    public static int[] m41349c(Activity activity) {
        float f;
        DisplayCutout a;
        Rect g = m41353g(activity);
        View findViewById = activity.getWindow().findViewById(16908290);
        float top = ((float) (g.top - findViewById.getTop())) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = ((float) (findViewById.getBottom() - g.bottom)) / Resources.getSystem().getDisplayMetrics().density;
        int i = Build.VERSION.SDK_INT;
        float f2 = Utils.FLOAT_EPSILON;
        if (i != 29 || (a = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            f = 0.0f;
        } else {
            f2 = ((float) a.getSafeInsetRight()) / Resources.getSystem().getDisplayMetrics().density;
            f = ((float) a.getSafeInsetLeft()) / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{Math.round(top), Math.round(bottom), Math.round(f2), Math.round(f)};
    }

    /* renamed from: d */
    public static int m41350d(Activity activity) {
        return activity.getWindow().getDecorView().getWidth();
    }

    /* renamed from: e */
    public static int m41351e(Activity activity) {
        return m41352f(activity);
    }

    @TargetApi(23)
    /* renamed from: f */
    public static int m41352f(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return decorView.getHeight();
        }
        return (decorView.getHeight() - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    /* renamed from: g */
    public static Rect m41353g(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* renamed from: h */
    public static int m41354h(Activity activity) {
        return m41353g(activity).width();
    }

    /* renamed from: i */
    public static boolean m41355i(Activity activity) {
        boolean z;
        boolean z2;
        if (activity.getWindow().getDecorView().getApplicationWindowToken() != null) {
            z = true;
        } else {
            z = false;
        }
        if (activity.getWindow().getDecorView().getRootWindowInsets() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m41356j(WeakReference<Activity> weakReference) {
        View view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = weakReference.get().getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        if (view == null || displayMetrics.heightPixels - rect.bottom <= f26554a) {
            return false;
        }
        return true;
    }
}
