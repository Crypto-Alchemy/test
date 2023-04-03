package p000;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gb2 */
/* compiled from: FragmentTransitionCompat21 */
public class gb2 extends hb2 {

    /* renamed from: gb2$a */
    /* compiled from: FragmentTransitionCompat21 */
    public class C2376a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f12261a;

        public C2376a(Rect rect) {
            this.f12261a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f12261a;
        }
    }

    /* renamed from: gb2$b */
    /* compiled from: FragmentTransitionCompat21 */
    public class C2377b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f12263a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f12264b;

        public C2377b(View view, ArrayList arrayList) {
            this.f12263a = view;
            this.f12264b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            C2381f.m17983b(transition, this);
            this.f12263a.setVisibility(8);
            int size = this.f12264b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f12264b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            C2381f.m17983b(transition, this);
            C2381f.m17982a(transition, this);
        }
    }

    /* renamed from: gb2$c */
    /* compiled from: FragmentTransitionCompat21 */
    public class C2378c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f12266a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f12267b;

        /* renamed from: c */
        public final /* synthetic */ Object f12268c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f12269d;

        /* renamed from: e */
        public final /* synthetic */ Object f12270e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f12271f;

        public C2378c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f12266a = obj;
            this.f12267b = arrayList;
            this.f12268c = obj2;
            this.f12269d = arrayList2;
            this.f12270e = obj3;
            this.f12271f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            C2381f.m17983b(transition, this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f12266a;
            if (obj != null) {
                gb2.this.mo20493w(obj, this.f12267b, (ArrayList<View>) null);
            }
            Object obj2 = this.f12268c;
            if (obj2 != null) {
                gb2.this.mo20493w(obj2, this.f12269d, (ArrayList<View>) null);
            }
            Object obj3 = this.f12270e;
            if (obj3 != null) {
                gb2.this.mo20493w(obj3, this.f12271f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: gb2$d */
    /* compiled from: FragmentTransitionCompat21 */
    public class C2379d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f12273a;

        public C2379d(Runnable runnable) {
            this.f12273a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f12273a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: gb2$e */
    /* compiled from: FragmentTransitionCompat21 */
    public class C2380e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f12275a;

        public C2380e(Rect rect) {
            this.f12275a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f12275a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f12275a;
        }
    }

    /* renamed from: gb2$f */
    /* compiled from: FragmentTransitionCompat21 */
    public static class C2381f {
        /* renamed from: a */
        public static void m17982a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        /* renamed from: b */
        public static void m17983b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    /* renamed from: v */
    public static boolean m17965v(Transition transition) {
        if (!hb2.m18743i(transition.getTargetIds()) || !hb2.m18743i(transition.getTargetNames()) || !hb2.m18743i(transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo10579a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo10580b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo10580b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m17965v(transition) && hb2.m18743i(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo10581c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
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
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
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
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: k */
    public Object mo10585k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: m */
    public void mo10586m(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C2377b(view, arrayList));
    }

    /* renamed from: n */
    public void mo10587n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C2378c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: o */
    public void mo10588o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C2380e(rect));
        }
    }

    /* renamed from: p */
    public void mo10589p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo21078h(view, rect);
            ((Transition) obj).setEpicenterCallback(new C2376a(rect));
        }
    }

    /* renamed from: q */
    public void mo10590q(Fragment fragment, Object obj, sa0 sa0, Runnable runnable) {
        ((Transition) obj).addListener(new C2379d(runnable));
    }

    /* renamed from: s */
    public void mo10591s(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hb2.m18741d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo10580b(transitionSet, arrayList);
    }

    /* renamed from: t */
    public void mo10592t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo20493w(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: u */
    public Object mo10593u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: w */
    public void mo20493w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo20493w(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m17965v(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }
}
