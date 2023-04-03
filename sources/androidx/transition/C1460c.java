package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.c */
/* compiled from: TransitionManager */
public class C1460c {

    /* renamed from: a */
    public static Transition f7258a = new AutoTransition();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C2781lq<ViewGroup, ArrayList<Transition>>>> f7259b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f7260c = new ArrayList<>();

    /* renamed from: androidx.transition.c$a */
    /* compiled from: TransitionManager */
    public static class C1461a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public Transition f7261a;

        /* renamed from: d */
        public ViewGroup f7262d;

        /* renamed from: androidx.transition.c$a$a */
        /* compiled from: TransitionManager */
        public class C1462a extends C1459b {

            /* renamed from: a */
            public final /* synthetic */ C2781lq f7263a;

            public C1462a(C2781lq lqVar) {
                this.f7263a = lqVar;
            }

            public void onTransitionEnd(Transition transition) {
                ((ArrayList) this.f7263a.get(C1461a.this.f7262d)).remove(transition);
                transition.mo10517e0(this);
            }
        }

        public C1461a(Transition transition, ViewGroup viewGroup) {
            this.f7261a = transition;
            this.f7262d = viewGroup;
        }

        /* renamed from: a */
        public final void mo10595a() {
            this.f7262d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f7262d.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            mo10595a();
            if (!C1460c.f7260c.remove(this.f7262d)) {
                return true;
            }
            C2781lq<ViewGroup, ArrayList<Transition>> d = C1460c.m10214d();
            ArrayList arrayList = d.get(this.f7262d);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                d.put(this.f7262d, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f7261a);
            this.f7261a.mo10510a(new C1462a(d));
            this.f7261a.mo10530o(this.f7262d, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo10519g0(this.f7262d);
                }
            }
            this.f7261a.mo10516d0(this.f7262d);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            mo10595a();
            C1460c.f7260c.remove(this.f7262d);
            ArrayList arrayList = C1460c.m10214d().get(this.f7262d);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo10519g0(this.f7262d);
                }
            }
            this.f7261a.mo10532p(true);
        }
    }

    /* renamed from: a */
    public static void m10211a(ViewGroup viewGroup, Transition transition) {
        if (!f7260c.contains(viewGroup) && ga7.m17747T(viewGroup)) {
            f7260c.add(viewGroup);
            if (transition == null) {
                transition = f7258a;
            }
            Transition r = transition.clone();
            m10217g(viewGroup, r);
            im5.m19708f(viewGroup, (im5) null);
            m10216f(viewGroup, r);
        }
    }

    /* renamed from: b */
    public static void m10212b(im5 im5, Transition transition) {
        ViewGroup d = im5.mo21573d();
        if (!f7260c.contains(d)) {
            im5 c = im5.m19707c(d);
            if (transition == null) {
                if (c != null) {
                    c.mo21572b();
                }
                im5.mo21571a();
                return;
            }
            f7260c.add(d);
            Transition r = transition.clone();
            r.mo10534q0(d);
            if (c != null && c.mo21574e()) {
                r.mo10524j0(true);
            }
            m10217g(d, r);
            im5.mo21571a();
            m10216f(d, r);
        }
    }

    /* renamed from: c */
    public static void m10213c(ViewGroup viewGroup) {
        f7260c.remove(viewGroup);
        ArrayList arrayList = m10214d().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((Transition) arrayList2.get(size)).mo10542w(viewGroup);
            }
        }
    }

    /* renamed from: d */
    public static C2781lq<ViewGroup, ArrayList<Transition>> m10214d() {
        C2781lq<ViewGroup, ArrayList<Transition>> lqVar;
        WeakReference weakReference = f7259b.get();
        if (weakReference != null && (lqVar = (C2781lq) weakReference.get()) != null) {
            return lqVar;
        }
        C2781lq<ViewGroup, ArrayList<Transition>> lqVar2 = new C2781lq<>();
        f7259b.set(new WeakReference(lqVar2));
        return lqVar2;
    }

    /* renamed from: e */
    public static void m10215e(im5 im5, Transition transition) {
        m10212b(im5, transition);
    }

    /* renamed from: f */
    public static void m10216f(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            C1461a aVar = new C1461a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: g */
    public static void m10217g(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = m10214d().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo10512c0(viewGroup);
            }
        }
        if (transition != null) {
            transition.mo10530o(viewGroup, true);
        }
        im5 c = im5.m19707c(viewGroup);
        if (c != null) {
            c.mo21572b();
        }
    }
}
