package com.onesignal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import com.onesignal.C5318r0;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.onesignal.a */
/* compiled from: ActivityLifecycleHandler */
public class C5179a implements C5318r0.C5320b {

    /* renamed from: d */
    public static final Map<String, C5181b> f26145d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final Map<String, C5318r0.C5321c> f26146e = new ConcurrentHashMap();

    /* renamed from: f */
    public static final Map<String, C5182c> f26147f = new ConcurrentHashMap();

    /* renamed from: a */
    public final OSFocusHandler f26148a;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    public Activity f26149b = null;

    /* renamed from: c */
    public boolean f26150c = false;

    /* renamed from: com.onesignal.a$b */
    /* compiled from: ActivityLifecycleHandler */
    public static abstract class C5181b {
        /* renamed from: a */
        public void mo38609a(Activity activity) {
        }

        /* renamed from: b */
        public void mo38625b(Activity activity) {
        }
    }

    /* renamed from: com.onesignal.a$c */
    /* compiled from: ActivityLifecycleHandler */
    public static class C5182c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final C5318r0.C5321c f26151a;

        /* renamed from: d */
        public final C5318r0.C5320b f26152d;

        /* renamed from: e */
        public final String f26153e;

        public void onGlobalLayout() {
            if (!C5336v0.m41356j(new WeakReference(OneSignal.m40352Q()))) {
                this.f26152d.mo38650a(this.f26153e, this);
                this.f26151a.mo38498a();
            }
        }

        public C5182c(C5318r0.C5320b bVar, C5318r0.C5321c cVar, String str) {
            this.f26152d = bVar;
            this.f26151a = cVar;
            this.f26153e = str;
        }
    }

    public C5179a(OSFocusHandler oSFocusHandler) {
        this.f26148a = oSFocusHandler;
    }

    /* renamed from: a */
    public void mo38650a(String str, C5182c cVar) {
        Activity activity = this.f26149b;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(cVar);
        }
        f26147f.remove(str);
        f26146e.remove(str);
    }

    /* renamed from: b */
    public void mo38651b(String str, C5181b bVar) {
        f26145d.put(str, bVar);
        Activity activity = this.f26149b;
        if (activity != null) {
            bVar.mo38609a(activity);
        }
    }

    /* renamed from: c */
    public void mo38652c(String str, C5318r0.C5321c cVar) {
        Activity activity = this.f26149b;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            C5182c cVar2 = new C5182c(this, cVar, str);
            viewTreeObserver.addOnGlobalLayoutListener(cVar2);
            f26147f.put(str, cVar2);
        }
        f26146e.put(str, cVar);
    }

    /* renamed from: d */
    public Activity mo38653d() {
        return this.f26149b;
    }

    /* renamed from: e */
    public final void mo38654e() {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40387d1(log_level, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.f26150c);
        if (this.f26148a.mo38451f() || this.f26150c) {
            OneSignal.m40387d1(log_level, "ActivityLifecycleHandler reset background state, call app focus");
            this.f26150c = false;
            this.f26148a.mo38455j();
            return;
        }
        OneSignal.m40387d1(log_level, "ActivityLifecycleHandler cancel background lost focus worker");
        this.f26148a.mo38450e("FOCUS_LOST_WORKER_TAG", OneSignal.f26030e);
    }

    /* renamed from: f */
    public final void mo38655f() {
        OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "ActivityLifecycleHandler Handling lost focus");
        OSFocusHandler oSFocusHandler = this.f26148a;
        if (oSFocusHandler == null) {
            return;
        }
        if (!oSFocusHandler.mo38451f() || this.f26148a.mo38452g()) {
            OneSignal.m40380b0().mo38392c();
            this.f26148a.mo38456k("FOCUS_LOST_WORKER_TAG", 2000, OneSignal.f26030e);
        }
    }

    /* renamed from: g */
    public final void mo38656g() {
        String str;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder sb = new StringBuilder();
        sb.append("curActivity is NOW: ");
        if (this.f26149b != null) {
            str = "" + this.f26149b.getClass().getName() + ":" + this.f26149b;
        } else {
            str = "null";
        }
        sb.append(str);
        OneSignal.m40376a(log_level, sb.toString());
    }

    /* renamed from: h */
    public final void mo38657h(int i, Activity activity) {
        if (i == 2) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40387d1(log_level, "Configuration Orientation Change: LANDSCAPE (" + i + ") on activity: " + activity);
        } else if (i == 1) {
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40387d1(log_level2, "Configuration Orientation Change: PORTRAIT (" + i + ") on activity: " + activity);
        }
    }

    /* renamed from: i */
    public void mo38658i(Activity activity) {
    }

    /* renamed from: j */
    public void mo38659j(Activity activity) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "onActivityDestroyed: " + activity);
        f26147f.clear();
        if (activity == this.f26149b) {
            this.f26149b = null;
            mo38655f();
        }
        mo38656g();
    }

    /* renamed from: k */
    public void mo38660k(Activity activity) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "onActivityPaused: " + activity);
        if (activity == this.f26149b) {
            this.f26149b = null;
            mo38655f();
        }
        mo38656g();
    }

    /* renamed from: l */
    public void mo38661l(Activity activity) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "onActivityResumed: " + activity);
        mo38667r(activity);
        mo38656g();
        mo38654e();
    }

    /* renamed from: m */
    public void mo38662m(Activity activity) {
        this.f26148a.mo38457l();
    }

    /* renamed from: n */
    public void mo38663n(Activity activity) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "onActivityStopped: " + activity);
        if (activity == this.f26149b) {
            this.f26149b = null;
            mo38655f();
        }
        for (Map.Entry<String, C5181b> value : f26145d.entrySet()) {
            ((C5181b) value.getValue()).mo38625b(activity);
        }
        mo38656g();
        if (this.f26149b == null) {
            this.f26148a.mo38458m();
        }
    }

    /* renamed from: o */
    public void mo38664o(Configuration configuration, Activity activity) {
        Activity activity2 = this.f26149b;
        if (activity2 != null && OSUtils.m40285q(activity2, 128)) {
            mo38657h(configuration.orientation, activity);
            mo38665p(activity);
        }
    }

    /* renamed from: p */
    public final void mo38665p(Activity activity) {
        mo38655f();
        for (Map.Entry<String, C5181b> value : f26145d.entrySet()) {
            ((C5181b) value.getValue()).mo38625b(activity);
        }
        for (Map.Entry<String, C5181b> value2 : f26145d.entrySet()) {
            ((C5181b) value2.getValue()).mo38609a(this.f26149b);
        }
        ViewTreeObserver viewTreeObserver = this.f26149b.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry next : f26146e.entrySet()) {
            C5182c cVar = new C5182c(this, (C5318r0.C5321c) next.getValue(), (String) next.getKey());
            viewTreeObserver.addOnGlobalLayoutListener(cVar);
            f26147f.put((String) next.getKey(), cVar);
        }
        mo38654e();
    }

    /* renamed from: q */
    public void mo38666q(String str) {
        f26145d.remove(str);
    }

    /* renamed from: r */
    public void mo38667r(Activity activity) {
        this.f26149b = activity;
        for (Map.Entry<String, C5181b> value : f26145d.entrySet()) {
            ((C5181b) value.getValue()).mo38609a(this.f26149b);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.f26149b.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry next : f26146e.entrySet()) {
                C5182c cVar = new C5182c(this, (C5318r0.C5321c) next.getValue(), (String) next.getKey());
                viewTreeObserver.addOnGlobalLayoutListener(cVar);
                f26147f.put((String) next.getKey(), cVar);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: s */
    public void mo38668s(boolean z) {
        this.f26150c = z;
    }
}
