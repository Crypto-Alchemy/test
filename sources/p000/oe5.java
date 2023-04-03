package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0684j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.C1712b;
import com.bumptech.glide.C1719d;
import com.bumptech.glide.manager.RequestManagerFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: oe5 */
/* compiled from: RequestManagerRetriever */
public class oe5 implements Handler.Callback {

    /* renamed from: A */
    public static final C2947b f15847A = new C2946a();

    /* renamed from: a */
    public volatile me5 f15848a;

    /* renamed from: d */
    public final Map<FragmentManager, RequestManagerFragment> f15849d = new HashMap();

    /* renamed from: e */
    public final Map<androidx.fragment.app.FragmentManager, ae6> f15850e = new HashMap();

    /* renamed from: g */
    public final Handler f15851g;

    /* renamed from: k */
    public final C2947b f15852k;

    /* renamed from: r */
    public final C2781lq<View, Fragment> f15853r = new C2781lq<>();

    /* renamed from: s */
    public final C2781lq<View, android.app.Fragment> f15854s = new C2781lq<>();

    /* renamed from: x */
    public final Bundle f15855x = new Bundle();

    /* renamed from: y */
    public final wb2 f15856y;

    /* renamed from: oe5$a */
    /* compiled from: RequestManagerRetriever */
    public class C2946a implements C2947b {
        /* renamed from: a */
        public me5 mo199a(C1710a aVar, lg3 lg3, pe5 pe5, Context context) {
            return new me5(aVar, lg3, pe5, context);
        }
    }

    /* renamed from: oe5$b */
    /* compiled from: RequestManagerRetriever */
    public interface C2947b {
        /* renamed from: a */
        me5 mo199a(C1710a aVar, lg3 lg3, pe5 pe5, Context context);
    }

    public oe5(C2947b bVar, C1719d dVar) {
        this.f15852k = bVar == null ? f15847A : bVar;
        this.f15851g = new Handler(Looper.getMainLooper(), this);
        this.f15856y = m23757b(dVar);
    }

    @TargetApi(17)
    /* renamed from: a */
    public static void m23756a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static wb2 m23757b(C1719d dVar) {
        if (!el2.f11241h || !el2.f11240g) {
            return new ji1();
        }
        if (dVar.mo12384a(C1712b.C1717e.class)) {
            return new e32();
        }
        return new f32();
    }

    /* renamed from: c */
    public static Activity m23758c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m23758c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: f */
    public static void m23759f(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment next : collection) {
                if (!(next == null || next.getView() == null)) {
                    map.put(next.getView(), next);
                    m23759f(next.getChildFragmentManager().mo6015w0(), map);
                }
            }
        }
    }

    /* renamed from: u */
    public static boolean m23760u(Context context) {
        Activity c = m23758c(context);
        if (c == null || !c.isFinishing()) {
            return true;
        }
        return false;
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: d */
    public final void mo23920d(FragmentManager fragmentManager, C2781lq<View, android.app.Fragment> lqVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    lqVar.put(fragment.getView(), fragment);
                    mo23920d(fragment.getChildFragmentManager(), lqVar);
                }
            }
            return;
        }
        mo23921e(fragmentManager, lqVar);
    }

    @Deprecated
    /* renamed from: e */
    public final void mo23921e(FragmentManager fragmentManager, C2781lq<View, android.app.Fragment> lqVar) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f15855x.putInt("key", i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f15855x, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    lqVar.put(fragment.getView(), fragment);
                    mo23920d(fragment.getChildFragmentManager(), lqVar);
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    @Deprecated
    /* renamed from: g */
    public final android.app.Fragment mo23922g(View view, Activity activity) {
        this.f15854s.clear();
        mo23920d(activity.getFragmentManager(), this.f15854s);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f15854s.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f15854s.clear();
        return fragment;
    }

    /* renamed from: h */
    public final Fragment mo23923h(View view, FragmentActivity fragmentActivity) {
        this.f15853r.clear();
        m23759f(fragmentActivity.getSupportFragmentManager().mo6015w0(), this.f15853r);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f15853r.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f15853r.clear();
        return fragment;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: androidx.fragment.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: android.app.FragmentManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            int r0 = r7.arg1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0008
            r0 = r2
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            int r3 = r7.what
            r4 = 0
            if (r3 == r2) goto L_0x0024
            r5 = 2
            if (r3 == r5) goto L_0x0013
            r2 = r1
            goto L_0x0036
        L_0x0013:
            java.lang.Object r7 = r7.obj
            androidx.fragment.app.FragmentManager r7 = (androidx.fragment.app.FragmentManager) r7
            boolean r0 = r6.mo23939x(r7, r0)
            if (r0 == 0) goto L_0x0036
            java.util.Map<androidx.fragment.app.FragmentManager, ae6> r0 = r6.f15850e
            java.lang.Object r4 = r0.remove(r7)
            goto L_0x0034
        L_0x0024:
            java.lang.Object r7 = r7.obj
            android.app.FragmentManager r7 = (android.app.FragmentManager) r7
            boolean r0 = r6.mo23938w(r7, r0)
            if (r0 == 0) goto L_0x0036
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.RequestManagerFragment> r0 = r6.f15849d
            java.lang.Object r4 = r0.remove(r7)
        L_0x0034:
            r1 = r2
            goto L_0x0037
        L_0x0036:
            r7 = r4
        L_0x0037:
            r0 = 5
            java.lang.String r3 = "RMRetriever"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x0051
            if (r1 == 0) goto L_0x0051
            if (r4 != 0) goto L_0x0051
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to remove expected request manager fragment, manager: "
            r0.append(r1)
            r0.append(r7)
        L_0x0051:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oe5.handleMessage(android.os.Message):boolean");
    }

    @Deprecated
    /* renamed from: i */
    public final me5 mo23925i(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        RequestManagerFragment r = mo23934r(fragmentManager, fragment);
        me5 e = r.mo12639e();
        if (e == null) {
            e = this.f15852k.mo199a(C1710a.m12218c(context), r.mo12637c(), r.mo12640f(), context);
            if (z) {
                e.mo19468b();
            }
            r.mo12645k(e);
        }
        return e;
    }

    /* renamed from: j */
    public me5 mo23926j(Activity activity) {
        if (p67.m24689q()) {
            return mo23928l(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return mo23931o((FragmentActivity) activity);
        }
        m23756a(activity);
        this.f15856y.mo19080a(activity);
        return mo23925i(activity, activity.getFragmentManager(), (android.app.Fragment) null, m23760u(activity));
    }

    @TargetApi(17)
    @Deprecated
    /* renamed from: k */
    public me5 mo23927k(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (p67.m24689q()) {
            return mo23928l(fragment.getActivity().getApplicationContext());
        } else {
            if (fragment.getActivity() != null) {
                this.f15856y.mo19080a(fragment.getActivity());
            }
            return mo23925i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    /* renamed from: l */
    public me5 mo23928l(Context context) {
        if (context != null) {
            if (p67.m24690r() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return mo23931o((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return mo23926j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo23928l(contextWrapper.getBaseContext());
                    }
                }
            }
            return mo23932p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: m */
    public me5 mo23929m(View view) {
        if (p67.m24689q()) {
            return mo23928l(view.getContext().getApplicationContext());
        }
        zt4.m31500d(view);
        zt4.m31501e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c = m23758c(view.getContext());
        if (c == null) {
            return mo23928l(view.getContext().getApplicationContext());
        }
        if (c instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) c;
            Fragment h = mo23923h(view, fragmentActivity);
            if (h != null) {
                return mo23930n(h);
            }
            return mo23931o(fragmentActivity);
        }
        android.app.Fragment g = mo23922g(view, c);
        if (g == null) {
            return mo23926j(c);
        }
        return mo23927k(g);
    }

    /* renamed from: n */
    public me5 mo23930n(Fragment fragment) {
        zt4.m31501e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (p67.m24689q()) {
            return mo23928l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f15856y.mo19080a(fragment.getActivity());
        }
        return mo23937v(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: o */
    public me5 mo23931o(FragmentActivity fragmentActivity) {
        if (p67.m24689q()) {
            return mo23928l(fragmentActivity.getApplicationContext());
        }
        m23756a(fragmentActivity);
        this.f15856y.mo19080a(fragmentActivity);
        return mo23937v(fragmentActivity, fragmentActivity.getSupportFragmentManager(), (Fragment) null, m23760u(fragmentActivity));
    }

    /* renamed from: p */
    public final me5 mo23932p(Context context) {
        if (this.f15848a == null) {
            synchronized (this) {
                if (this.f15848a == null) {
                    this.f15848a = this.f15852k.mo199a(C1710a.m12218c(context.getApplicationContext()), new C2978op(), new wo1(), context.getApplicationContext());
                }
            }
        }
        return this.f15848a;
    }

    @Deprecated
    /* renamed from: q */
    public RequestManagerFragment mo23933q(Activity activity) {
        return mo23934r(activity.getFragmentManager(), (android.app.Fragment) null);
    }

    /* renamed from: r */
    public final RequestManagerFragment mo23934r(FragmentManager fragmentManager, android.app.Fragment fragment) {
        RequestManagerFragment requestManagerFragment = this.f15849d.get(fragmentManager);
        if (requestManagerFragment != null) {
            return requestManagerFragment;
        }
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment2 == null) {
            requestManagerFragment2 = new RequestManagerFragment();
            requestManagerFragment2.mo12644j(fragment);
            this.f15849d.put(fragmentManager, requestManagerFragment2);
            fragmentManager.beginTransaction().add(requestManagerFragment2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f15851g.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment2;
    }

    /* renamed from: s */
    public ae6 mo23935s(androidx.fragment.app.FragmentManager fragmentManager) {
        return mo23936t(fragmentManager, (Fragment) null);
    }

    /* renamed from: t */
    public final ae6 mo23936t(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
        ae6 ae6 = this.f15850e.get(fragmentManager);
        if (ae6 != null) {
            return ae6;
        }
        ae6 ae62 = (ae6) fragmentManager.mo5984l0("com.bumptech.glide.manager");
        if (ae62 == null) {
            ae62 = new ae6();
            ae62.mo193r(fragment);
            this.f15850e.put(fragmentManager, ae62);
            fragmentManager.mo5996q().mo6264e(ae62, "com.bumptech.glide.manager").mo6140k();
            this.f15851g.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return ae62;
    }

    /* renamed from: v */
    public final me5 mo23937v(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        ae6 t = mo23936t(fragmentManager, fragment);
        me5 l = t.mo183l();
        if (l == null) {
            l = this.f15852k.mo199a(C1710a.m12218c(context), t.mo181j(), t.mo184m(), context);
            if (z) {
                l.mo19468b();
            }
            t.mo194s(l);
        }
        return l;
    }

    /* renamed from: w */
    public final boolean mo23938w(FragmentManager fragmentManager, boolean z) {
        RequestManagerFragment requestManagerFragment = this.f15849d.get(fragmentManager);
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment2 == requestManagerFragment) {
            return true;
        }
        if (requestManagerFragment2 != null && requestManagerFragment2.mo12639e() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + requestManagerFragment2 + " New: " + requestManagerFragment);
        } else if (z || fragmentManager.isDestroyed()) {
            if (Log.isLoggable("RMRetriever", 5)) {
                fragmentManager.isDestroyed();
            }
            requestManagerFragment.mo12637c().mo12021c();
            return true;
        } else {
            FragmentTransaction add = fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager");
            if (requestManagerFragment2 != null) {
                add.remove(requestManagerFragment2);
            }
            add.commitAllowingStateLoss();
            this.f15851g.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
            return false;
        }
    }

    /* renamed from: x */
    public final boolean mo23939x(androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        ae6 ae6 = this.f15850e.get(fragmentManager);
        ae6 ae62 = (ae6) fragmentManager.mo5984l0("com.bumptech.glide.manager");
        if (ae62 == ae6) {
            return true;
        }
        if (ae62 != null && ae62.mo183l() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + ae62 + " New: " + ae6);
        } else if (z || fragmentManager.mo5932J0()) {
            fragmentManager.mo5932J0();
            ae6.mo181j().mo12021c();
            return true;
        } else {
            C0684j e = fragmentManager.mo5996q().mo6264e(ae6, "com.bumptech.glide.manager");
            if (ae62 != null) {
                e.mo6146r(ae62);
            }
            e.mo6142m();
            this.f15851g.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
            return false;
        }
    }
}
