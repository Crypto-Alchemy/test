package com.onesignal;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.onesignal.C5179a;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.onesignal.r0 */
/* compiled from: OSSystemConditionController */
public class C5318r0 {

    /* renamed from: b */
    public static final String f26516b = "com.onesignal.r0";

    /* renamed from: a */
    public final C5321c f26517a;

    /* renamed from: com.onesignal.r0$a */
    /* compiled from: OSSystemConditionController */
    public class C5319a extends FragmentManager.C0642k {

        /* renamed from: a */
        public final /* synthetic */ FragmentManager f26518a;

        public C5319a(FragmentManager fragmentManager) {
            this.f26518a = fragmentManager;
        }

        /* renamed from: e */
        public void mo6052e(FragmentManager fragmentManager, Fragment fragment) {
            super.mo6052e(fragmentManager, fragment);
            if (fragment instanceof kf1) {
                this.f26518a.mo5914A1(this);
                C5318r0.this.f26517a.mo38498a();
            }
        }
    }

    /* renamed from: com.onesignal.r0$b */
    /* compiled from: OSSystemConditionController */
    public interface C5320b {
        /* renamed from: a */
        void mo38650a(String str, C5179a.C5182c cVar);
    }

    /* renamed from: com.onesignal.r0$c */
    /* compiled from: OSSystemConditionController */
    public interface C5321c {
        /* renamed from: a */
        void mo38498a();
    }

    public C5318r0(C5321c cVar) {
        this.f26517a = cVar;
    }

    /* renamed from: b */
    public boolean mo39087b(Context context) throws NoClassDefFoundError {
        if (!(context instanceof AppCompatActivity)) {
            return false;
        }
        FragmentManager supportFragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        supportFragmentManager.mo5985l1(new C5319a(supportFragmentManager), true);
        List<Fragment> w0 = supportFragmentManager.mo6015w0();
        int size = w0.size();
        if (size <= 0) {
            return false;
        }
        Fragment fragment = w0.get(size - 1);
        if (!fragment.isVisible() || !(fragment instanceof kf1)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo39088c() {
        if (OneSignal.m40352Q() == null) {
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver curActivity null");
            return false;
        }
        try {
            if (mo39087b(OneSignal.m40352Q())) {
                OneSignal.m40387d1(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver dialog fragment detected");
                return false;
            }
        } catch (NoClassDefFoundError e) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
            OneSignal.m40387d1(log_level, "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e);
        }
        C5179a b = C6139ka.m46938b();
        boolean j = C5336v0.m41356j(new WeakReference(OneSignal.m40352Q()));
        if (j && b != null) {
            b.mo38652c(f26516b, this.f26517a);
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver keyboard up detected");
        }
        return !j;
    }
}
