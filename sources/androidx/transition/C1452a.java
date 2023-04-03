package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;
import p000.sa0;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.transition.a */
/* compiled from: FragmentTransitionSupport */
public class C1452a extends hb2 {

    /* renamed from: androidx.transition.a$a */
    /* compiled from: FragmentTransitionSupport */
    public class C1453a extends Transition.C1445e {

        /* renamed from: a */
        public final /* synthetic */ Rect f7240a;

        public C1453a(Rect rect) {
            this.f7240a = rect;
        }

        /* renamed from: a */
        public Rect mo10549a(Transition transition) {
            return this.f7240a;
        }
    }

    /* renamed from: androidx.transition.a$b */
    /* compiled from: FragmentTransitionSupport */
    public class C1454b implements Transition.C1446f {

        /* renamed from: a */
        public final /* synthetic */ View f7242a;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f7243d;

        public C1454b(View view, ArrayList arrayList) {
            this.f7242a = view;
            this.f7243d = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.mo10517e0(this);
            this.f7242a.setVisibility(8);
            int size = this.f7243d.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f7243d.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.mo10517e0(this);
            transition.mo10510a(this);
        }
    }

    /* renamed from: androidx.transition.a$c */
    /* compiled from: FragmentTransitionSupport */
    public class C1455c extends C1459b {

        /* renamed from: a */
        public final /* synthetic */ Object f7245a;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f7246d;

        /* renamed from: e */
        public final /* synthetic */ Object f7247e;

        /* renamed from: g */
        public final /* synthetic */ ArrayList f7248g;

        /* renamed from: k */
        public final /* synthetic */ Object f7249k;

        /* renamed from: r */
        public final /* synthetic */ ArrayList f7250r;

        public C1455c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f7245a = obj;
            this.f7246d = arrayList;
            this.f7247e = obj2;
            this.f7248g = arrayList2;
            this.f7249k = obj3;
            this.f7250r = arrayList3;
        }

        public void onTransitionEnd(Transition transition) {
            transition.mo10517e0(this);
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f7245a;
            if (obj != null) {
                C1452a.this.mo10594w(obj, this.f7246d, (ArrayList<View>) null);
            }
            Object obj2 = this.f7247e;
            if (obj2 != null) {
                C1452a.this.mo10594w(obj2, this.f7248g, (ArrayList<View>) null);
            }
            Object obj3 = this.f7249k;
            if (obj3 != null) {
                C1452a.this.mo10594w(obj3, this.f7250r, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.transition.a$d */
    /* compiled from: FragmentTransitionSupport */
    public class C1456d implements sa0.C3256b {

        /* renamed from: a */
        public final /* synthetic */ Transition f7252a;

        public C1456d(Transition transition) {
            this.f7252a = transition;
        }

        public void onCancel() {
            this.f7252a.cancel();
        }
    }

    /* renamed from: androidx.transition.a$e */
    /* compiled from: FragmentTransitionSupport */
    public class C1457e implements Transition.C1446f {

        /* renamed from: a */
        public final /* synthetic */ Runnable f7254a;

        public C1457e(Runnable runnable) {
            this.f7254a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f7254a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.a$f */
    /* compiled from: FragmentTransitionSupport */
    public class C1458f extends Transition.C1445e {

        /* renamed from: a */
        public final /* synthetic */ Rect f7256a;

        public C1458f(Rect rect) {
            this.f7256a = rect;
        }

        /* renamed from: a */
        public Rect mo10549a(Transition transition) {
            Rect rect = this.f7256a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f7256a;
        }
    }

    /* renamed from: v */
    public static boolean m10192v(Transition transition) {
        if (!hb2.m18743i(transition.mo10498I()) || !hb2.m18743i(transition.mo10499J()) || !hb2.m18743i(transition.mo10500K())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo10579a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo10511b(view);
        }
    }

    /* renamed from: b */
    public void mo10580b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int A0 = transitionSet.mo10551A0();
                while (i < A0) {
                    mo10580b(transitionSet.mo10564z0(i), arrayList);
                    i++;
                }
            } else if (!m10192v(transition) && hb2.m18743i(transition.mo10501L())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.mo10511b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo10581c(ViewGroup viewGroup, Object obj) {
        C1460c.m10211a(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo10582e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: f */
    public Object mo10583f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: j */
    public Object mo10584j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().mo10562w0(transition).mo10562w0(transition2).mo10556H0(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.mo10562w0(transition);
        }
        transitionSet.mo10562w0(transition3);
        return transitionSet;
    }

    /* renamed from: k */
    public Object mo10585k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.mo10562w0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.mo10562w0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.mo10562w0((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: m */
    public void mo10586m(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo10510a(new C1454b(view, arrayList));
    }

    /* renamed from: n */
    public void mo10587n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).mo10510a(new C1455c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: o */
    public void mo10588o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo10527l0(new C1458f(rect));
        }
    }

    /* renamed from: p */
    public void mo10589p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo21078h(view, rect);
            ((Transition) obj).mo10527l0(new C1453a(rect));
        }
    }

    /* renamed from: q */
    public void mo10590q(Fragment fragment, Object obj, sa0 sa0, Runnable runnable) {
        Transition transition = (Transition) obj;
        sa0.mo25694c(new C1456d(transition));
        transition.mo10510a(new C1457e(runnable));
    }

    /* renamed from: s */
    public void mo10591s(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> L = transitionSet.mo10501L();
        L.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hb2.m18741d(L, arrayList.get(i));
        }
        L.add(view);
        arrayList.add(view);
        mo10580b(transitionSet, arrayList);
    }

    /* renamed from: t */
    public void mo10592t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.mo10501L().clear();
            transitionSet.mo10501L().addAll(arrayList2);
            mo10594w(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: u */
    public Object mo10593u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo10562w0((Transition) obj);
        return transitionSet;
    }

    /* renamed from: w */
    public void mo10594w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int A0 = transitionSet.mo10551A0();
            while (i2 < A0) {
                mo10594w(transitionSet.mo10564z0(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m10192v(transition)) {
            List<View> L = transition.mo10501L();
            if (L.size() == arrayList.size() && L.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.mo10511b(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.mo10518f0(arrayList.get(size));
                }
            }
        }
    }
}
