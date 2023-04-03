package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

public class ReportFragment extends Fragment {

    /* renamed from: a */
    public C0703a f3927a;

    /* renamed from: androidx.lifecycle.ReportFragment$a */
    public interface C0703a {
        /* renamed from: a */
        void mo6347a();

        /* renamed from: b */
        void mo6348b();

        /* renamed from: c */
        void mo6349c();
    }

    /* renamed from: androidx.lifecycle.ReportFragment$b */
    public static class C0704b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C0704b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            ReportFragment.m5057a(activity, Lifecycle.Event.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            ReportFragment.m5057a(activity, Lifecycle.Event.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            ReportFragment.m5057a(activity, Lifecycle.Event.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            ReportFragment.m5057a(activity, Lifecycle.Event.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            ReportFragment.m5057a(activity, Lifecycle.Event.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            ReportFragment.m5057a(activity, Lifecycle.Event.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m5057a(Activity activity, Lifecycle.Event event) {
        if (activity instanceof zg3) {
            ((zg3) activity).getLifecycle().mo6389h(event);
        } else if (activity instanceof ug3) {
            Lifecycle lifecycle = ((ug3) activity).getLifecycle();
            if (lifecycle instanceof C0716f) {
                ((C0716f) lifecycle).mo6389h(event);
            }
        }
    }

    /* renamed from: f */
    public static ReportFragment m5058f(Activity activity) {
        return (ReportFragment) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m5059g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0704b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void mo6336b(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            m5057a(getActivity(), event);
        }
    }

    /* renamed from: c */
    public final void mo6337c(C0703a aVar) {
        if (aVar != null) {
            aVar.mo6347a();
        }
    }

    /* renamed from: d */
    public final void mo6338d(C0703a aVar) {
        if (aVar != null) {
            aVar.mo6349c();
        }
    }

    /* renamed from: e */
    public final void mo6339e(C0703a aVar) {
        if (aVar != null) {
            aVar.mo6348b();
        }
    }

    /* renamed from: h */
    public void mo6340h(C0703a aVar) {
        this.f3927a = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo6337c(this.f3927a);
        mo6336b(Lifecycle.Event.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        mo6336b(Lifecycle.Event.ON_DESTROY);
        this.f3927a = null;
    }

    public void onPause() {
        super.onPause();
        mo6336b(Lifecycle.Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        mo6338d(this.f3927a);
        mo6336b(Lifecycle.Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        mo6339e(this.f3927a);
        mo6336b(Lifecycle.Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        mo6336b(Lifecycle.Event.ON_STOP);
    }
}
