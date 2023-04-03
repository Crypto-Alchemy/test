package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C0671c;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.sa0;

/* renamed from: androidx.fragment.app.b */
/* compiled from: DefaultSpecialEffectsController */
public class C0656b extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.b$a */
    /* compiled from: DefaultSpecialEffectsController */
    public static /* synthetic */ class C0657a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3778a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3778a = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3778a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3778a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3778a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0656b.C0657a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    /* compiled from: DefaultSpecialEffectsController */
    public class C0658b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f3779a;

        /* renamed from: d */
        public final /* synthetic */ SpecialEffectsController.Operation f3780d;

        public C0658b(List list, SpecialEffectsController.Operation operation) {
            this.f3779a = list;
            this.f3780d = operation;
        }

        public void run() {
            if (this.f3779a.contains(this.f3780d)) {
                this.f3779a.remove(this.f3780d);
                C0656b.this.mo6152s(this.f3780d);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    /* compiled from: DefaultSpecialEffectsController */
    public class C0659c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f3782a;

        /* renamed from: d */
        public final /* synthetic */ View f3783d;

        /* renamed from: e */
        public final /* synthetic */ boolean f3784e;

        /* renamed from: g */
        public final /* synthetic */ SpecialEffectsController.Operation f3785g;

        /* renamed from: k */
        public final /* synthetic */ C0668k f3786k;

        public C0659c(ViewGroup viewGroup, View view, boolean z, SpecialEffectsController.Operation operation, C0668k kVar) {
            this.f3782a = viewGroup;
            this.f3783d = view;
            this.f3784e = z;
            this.f3785g = operation;
            this.f3786k = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3782a.endViewTransition(this.f3783d);
            if (this.f3784e) {
                this.f3785g.mo6118e().applyState(this.f3783d);
            }
            this.f3786k.mo6170a();
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(this.f3785g);
                sb.append(" has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    /* compiled from: DefaultSpecialEffectsController */
    public class C0660d implements sa0.C3256b {

        /* renamed from: a */
        public final /* synthetic */ Animator f3788a;

        /* renamed from: b */
        public final /* synthetic */ SpecialEffectsController.Operation f3789b;

        public C0660d(Animator animator, SpecialEffectsController.Operation operation) {
            this.f3788a = animator;
            this.f3789b = operation;
        }

        public void onCancel() {
            this.f3788a.end();
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(this.f3789b);
                sb.append(" has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$e */
    /* compiled from: DefaultSpecialEffectsController */
    public class C0661e implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ SpecialEffectsController.Operation f3791a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f3792b;

        /* renamed from: c */
        public final /* synthetic */ View f3793c;

        /* renamed from: d */
        public final /* synthetic */ C0668k f3794d;

        /* renamed from: androidx.fragment.app.b$e$a */
        /* compiled from: DefaultSpecialEffectsController */
        public class C0662a implements Runnable {
            public C0662a() {
            }

            public void run() {
                C0661e eVar = C0661e.this;
                eVar.f3792b.endViewTransition(eVar.f3793c);
                C0661e.this.f3794d.mo6170a();
            }
        }

        public C0661e(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, C0668k kVar) {
            this.f3791a = operation;
            this.f3792b = viewGroup;
            this.f3793c = view;
            this.f3794d = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3792b.post(new C0662a());
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f3791a);
                sb.append(" has ended.");
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f3791a);
                sb.append(" has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$f */
    /* compiled from: DefaultSpecialEffectsController */
    public class C0663f implements sa0.C3256b {

        /* renamed from: a */
        public final /* synthetic */ View f3797a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f3798b;

        /* renamed from: c */
        public final /* synthetic */ C0668k f3799c;

        /* renamed from: d */
        public final /* synthetic */ SpecialEffectsController.Operation f3800d;

        public C0663f(View view, ViewGroup viewGroup, C0668k kVar, SpecialEffectsController.Operation operation) {
            this.f3797a = view;
            this.f3798b = viewGroup;
            this.f3799c = kVar;
            this.f3800d = operation;
        }

        public void onCancel() {
            this.f3797a.clearAnimation();
            this.f3798b.endViewTransition(this.f3797a);
            this.f3799c.mo6170a();
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f3800d);
                sb.append(" has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$g */
    /* compiled from: DefaultSpecialEffectsController */
    public class C0664g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SpecialEffectsController.Operation f3802a;

        /* renamed from: d */
        public final /* synthetic */ SpecialEffectsController.Operation f3803d;

        /* renamed from: e */
        public final /* synthetic */ boolean f3804e;

        /* renamed from: g */
        public final /* synthetic */ C2781lq f3805g;

        public C0664g(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, C2781lq lqVar) {
            this.f3802a = operation;
            this.f3803d = operation2;
            this.f3804e = z;
            this.f3805g = lqVar;
        }

        public void run() {
            fb2.m16823a(this.f3802a.mo6119f(), this.f3803d.mo6119f(), this.f3804e, this.f3805g, false);
        }
    }

    /* renamed from: androidx.fragment.app.b$h */
    /* compiled from: DefaultSpecialEffectsController */
    public class C0665h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ hb2 f3807a;

        /* renamed from: d */
        public final /* synthetic */ View f3808d;

        /* renamed from: e */
        public final /* synthetic */ Rect f3809e;

        public C0665h(hb2 hb2, View view, Rect rect) {
            this.f3807a = hb2;
            this.f3808d = view;
            this.f3809e = rect;
        }

        public void run() {
            this.f3807a.mo21078h(this.f3808d, this.f3809e);
        }
    }

    /* renamed from: androidx.fragment.app.b$i */
    /* compiled from: DefaultSpecialEffectsController */
    public class C0666i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f3811a;

        public C0666i(ArrayList arrayList) {
            this.f3811a = arrayList;
        }

        public void run() {
            fb2.m16826d(this.f3811a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.b$j */
    /* compiled from: DefaultSpecialEffectsController */
    public class C0667j implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0670m f3813a;

        /* renamed from: d */
        public final /* synthetic */ SpecialEffectsController.Operation f3814d;

        public C0667j(C0670m mVar, SpecialEffectsController.Operation operation) {
            this.f3813a = mVar;
            this.f3814d = operation;
        }

        public void run() {
            this.f3813a.mo6170a();
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Transition for operation ");
                sb.append(this.f3814d);
                sb.append("has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$k */
    /* compiled from: DefaultSpecialEffectsController */
    public static class C0668k extends C0669l {

        /* renamed from: c */
        public boolean f3816c;

        /* renamed from: d */
        public boolean f3817d = false;

        /* renamed from: e */
        public C0671c.C0672a f3818e;

        public C0668k(SpecialEffectsController.Operation operation, sa0 sa0, boolean z) {
            super(operation, sa0);
            this.f3816c = z;
        }

        /* renamed from: e */
        public C0671c.C0672a mo6169e(Context context) {
            boolean z;
            if (this.f3817d) {
                return this.f3818e;
            }
            Fragment f = mo6171b().mo6119f();
            if (mo6171b().mo6118e() == SpecialEffectsController.Operation.State.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            C0671c.C0672a b = C0671c.m4887b(context, f, z, this.f3816c);
            this.f3818e = b;
            this.f3817d = true;
            return b;
        }
    }

    /* renamed from: androidx.fragment.app.b$l */
    /* compiled from: DefaultSpecialEffectsController */
    public static class C0669l {

        /* renamed from: a */
        public final SpecialEffectsController.Operation f3819a;

        /* renamed from: b */
        public final sa0 f3820b;

        public C0669l(SpecialEffectsController.Operation operation, sa0 sa0) {
            this.f3819a = operation;
            this.f3820b = sa0;
        }

        /* renamed from: a */
        public void mo6170a() {
            this.f3819a.mo6117d(this.f3820b);
        }

        /* renamed from: b */
        public SpecialEffectsController.Operation mo6171b() {
            return this.f3819a;
        }

        /* renamed from: c */
        public sa0 mo6172c() {
            return this.f3820b;
        }

        /* renamed from: d */
        public boolean mo6173d() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.f3819a.mo6119f().mView);
            SpecialEffectsController.Operation.State e = this.f3819a.mo6118e();
            if (from == e || (from != (state = SpecialEffectsController.Operation.State.VISIBLE) && e != state)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.b$m */
    /* compiled from: DefaultSpecialEffectsController */
    public static class C0670m extends C0669l {

        /* renamed from: c */
        public final Object f3821c;

        /* renamed from: d */
        public final boolean f3822d;

        /* renamed from: e */
        public final Object f3823e;

        public C0670m(SpecialEffectsController.Operation operation, sa0 sa0, boolean z, boolean z2) {
            super(operation, sa0);
            Object obj;
            Object obj2;
            boolean z3;
            if (operation.mo6118e() == SpecialEffectsController.Operation.State.VISIBLE) {
                if (z) {
                    obj2 = operation.mo6119f().getReenterTransition();
                } else {
                    obj2 = operation.mo6119f().getEnterTransition();
                }
                this.f3821c = obj2;
                if (z) {
                    z3 = operation.mo6119f().getAllowReturnTransitionOverlap();
                } else {
                    z3 = operation.mo6119f().getAllowEnterTransitionOverlap();
                }
                this.f3822d = z3;
            } else {
                if (z) {
                    obj = operation.mo6119f().getReturnTransition();
                } else {
                    obj = operation.mo6119f().getExitTransition();
                }
                this.f3821c = obj;
                this.f3822d = true;
            }
            if (!z2) {
                this.f3823e = null;
            } else if (z) {
                this.f3823e = operation.mo6119f().getSharedElementReturnTransition();
            } else {
                this.f3823e = operation.mo6119f().getSharedElementEnterTransition();
            }
        }

        /* renamed from: e */
        public hb2 mo6174e() {
            hb2 f = mo6175f(this.f3821c);
            hb2 f2 = mo6175f(this.f3823e);
            if (f != null && f2 != null && f != f2) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mo6171b().mo6119f() + " returned Transition " + this.f3821c + " which uses a different Transition  type than its shared element transition " + this.f3823e);
            } else if (f != null) {
                return f;
            } else {
                return f2;
            }
        }

        /* renamed from: f */
        public final hb2 mo6175f(Object obj) {
            if (obj == null) {
                return null;
            }
            hb2 hb2 = fb2.f11689a;
            if (hb2 != null && hb2.mo10582e(obj)) {
                return hb2;
            }
            hb2 hb22 = fb2.f11690b;
            if (hb22 != null && hb22.mo10582e(obj)) {
                return hb22;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + mo6171b().mo6119f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: g */
        public Object mo6176g() {
            return this.f3823e;
        }

        /* renamed from: h */
        public Object mo6177h() {
            return this.f3821c;
        }

        /* renamed from: i */
        public boolean mo6178i() {
            if (this.f3823e != null) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public boolean mo6179j() {
            return this.f3822d;
        }
    }

    public C0656b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: f */
    public void mo6103f(List<SpecialEffectsController.Operation> list, boolean z) {
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation next : list) {
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(next.mo6119f().mView);
            int i = C0657a.f3778a[next.mo6118e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (from == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = next;
                }
            } else if (i == 4 && from != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = next;
            }
        }
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(operation);
            sb.append(" to ");
            sb.append(operation2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<SpecialEffectsController.Operation> arrayList3 = new ArrayList<>(list);
        mo6158y(list);
        for (SpecialEffectsController.Operation next2 : list) {
            sa0 sa0 = new sa0();
            next2.mo6123j(sa0);
            arrayList.add(new C0668k(next2, sa0, z));
            sa0 sa02 = new sa0();
            next2.mo6123j(sa02);
            boolean z2 = false;
            if (z) {
                if (next2 != operation) {
                    arrayList2.add(new C0670m(next2, sa02, z, z2));
                    next2.mo6114a(new C0658b(arrayList3, next2));
                }
            } else if (next2 != operation2) {
                arrayList2.add(new C0670m(next2, sa02, z, z2));
                next2.mo6114a(new C0658b(arrayList3, next2));
            }
            z2 = true;
            arrayList2.add(new C0670m(next2, sa02, z, z2));
            next2.mo6114a(new C0658b(arrayList3, next2));
        }
        Map<SpecialEffectsController.Operation, Boolean> x = mo6157x(arrayList2, arrayList3, z, operation, operation2);
        mo6156w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (SpecialEffectsController.Operation s : arrayList3) {
            mo6152s(s);
        }
        arrayList3.clear();
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Completed executing operations from ");
            sb2.append(operation);
            sb2.append(" to ");
            sb2.append(operation2);
        }
    }

    /* renamed from: s */
    public void mo6152s(SpecialEffectsController.Operation operation) {
        operation.mo6118e().applyState(operation.mo6119f().mView);
    }

    /* renamed from: t */
    public void mo6153t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!cc7.m11825a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        mo6153t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: u */
    public void mo6154u(Map<String, View> map, View view) {
        String K = ga7.m17733K(view);
        if (K != null) {
            map.put(K, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo6154u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    public void mo6155v(C2781lq<String, View> lqVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = lqVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ga7.m17733K((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* renamed from: w */
    public final void mo6156w(List<C0668k> list, List<SpecialEffectsController.Operation> list2, boolean z, Map<SpecialEffectsController.Operation, Boolean> map) {
        int i;
        boolean z2;
        int i2;
        boolean z3;
        SpecialEffectsController.Operation operation;
        ViewGroup m = mo6110m();
        Context context = m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<C0668k> it = list.iterator();
        boolean z4 = false;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            C0668k next = it.next();
            if (next.mo6173d()) {
                next.mo6170a();
            } else {
                C0671c.C0672a e = next.mo6169e(context);
                if (e == null) {
                    next.mo6170a();
                } else {
                    Animator animator = e.f3825b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        SpecialEffectsController.Operation b = next.mo6171b();
                        Fragment f = b.mo6119f();
                        if (Boolean.TRUE.equals(map.get(b))) {
                            if (FragmentManager.m4630K0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Ignoring Animator set on ");
                                sb.append(f);
                                sb.append(" as this Fragment was involved in a Transition.");
                            }
                            next.mo6170a();
                        } else {
                            if (b.mo6118e() == SpecialEffectsController.Operation.State.GONE) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            List<SpecialEffectsController.Operation> list3 = list2;
                            if (z3) {
                                list3.remove(b);
                            }
                            View view = f.mView;
                            m.startViewTransition(view);
                            C0659c cVar = r0;
                            View view2 = view;
                            SpecialEffectsController.Operation operation2 = b;
                            Animator animator2 = animator;
                            C0659c cVar2 = new C0659c(m, view2, z3, operation2, next);
                            animator2.addListener(cVar2);
                            animator2.setTarget(view2);
                            animator2.start();
                            if (FragmentManager.m4630K0(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Animator from operation ");
                                operation = operation2;
                                sb2.append(operation);
                                sb2.append(" has started.");
                            } else {
                                operation = operation2;
                            }
                            next.mo6172c().mo25694c(new C0660d(animator2, operation));
                            z4 = true;
                        }
                    }
                }
            }
            Map<SpecialEffectsController.Operation, Boolean> map2 = map;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0668k kVar = (C0668k) it2.next();
            SpecialEffectsController.Operation b2 = kVar.mo6171b();
            Fragment f2 = b2.mo6119f();
            if (z) {
                if (FragmentManager.m4630K0(i)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Ignoring Animation set on ");
                    sb3.append(f2);
                    sb3.append(" as Animations cannot run alongside Transitions.");
                }
                kVar.mo6170a();
            } else if (z4) {
                if (FragmentManager.m4630K0(i)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Ignoring Animation set on ");
                    sb4.append(f2);
                    sb4.append(" as Animations cannot run alongside Animators.");
                }
                kVar.mo6170a();
            } else {
                View view3 = f2.mView;
                Animation animation = (Animation) gu4.m18428f(((C0671c.C0672a) gu4.m18428f(kVar.mo6169e(context))).f3824a);
                if (b2.mo6118e() != SpecialEffectsController.Operation.State.REMOVED) {
                    view3.startAnimation(animation);
                    kVar.mo6170a();
                    z2 = z4;
                    i2 = i;
                } else {
                    m.startViewTransition(view3);
                    C0661e eVar = r0;
                    z2 = z4;
                    C0671c.C0673b bVar = new C0671c.C0673b(animation, m, view3);
                    C0661e eVar2 = new C0661e(b2, m, view3, kVar);
                    bVar.setAnimationListener(eVar);
                    view3.startAnimation(bVar);
                    i2 = 2;
                    if (FragmentManager.m4630K0(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Animation from operation ");
                        sb5.append(b2);
                        sb5.append(" has started.");
                    }
                }
                sa0 c = kVar.mo6172c();
                C0668k kVar2 = kVar;
                C0663f fVar = r0;
                C0663f fVar2 = new C0663f(view3, m, kVar2, b2);
                c.mo25694c(fVar);
                i = i2;
                z4 = z2;
            }
        }
    }

    /* renamed from: x */
    public final Map<SpecialEffectsController.Operation, Boolean> mo6157x(List<C0670m> list, List<SpecialEffectsController.Operation> list2, boolean z, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        View view2;
        Object obj;
        SpecialEffectsController.Operation operation3;
        SpecialEffectsController.Operation operation4;
        Object obj2;
        Object obj3;
        C2781lq lqVar;
        SpecialEffectsController.Operation operation5;
        hb2 hb2;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        SpecialEffectsController.Operation operation6;
        ArrayList arrayList4;
        boolean z2 = z;
        SpecialEffectsController.Operation operation7 = operation;
        SpecialEffectsController.Operation operation8 = operation2;
        HashMap hashMap = new HashMap();
        hb2 hb22 = null;
        for (C0670m next : list) {
            if (!next.mo6173d()) {
                hb2 e = next.mo6174e();
                if (hb22 == null) {
                    hb22 = e;
                } else if (!(e == null || hb22 == e)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.mo6171b().mo6119f() + " returned Transition " + next.mo6177h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (hb22 == null) {
            for (C0670m next2 : list) {
                hashMap.put(next2.mo6171b(), Boolean.FALSE);
                next2.mo6170a();
            }
            return hashMap;
        }
        View view4 = new View(mo6110m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C2781lq lqVar2 = new C2781lq();
        Object obj4 = null;
        View view5 = null;
        boolean z3 = false;
        for (C0670m next3 : list) {
            if (!next3.mo6178i() || operation7 == null || operation8 == null) {
                lqVar = lqVar2;
                arrayList4 = arrayList6;
                operation6 = operation7;
                arrayList3 = arrayList5;
                rect = rect2;
                view3 = view4;
                hb2 = hb22;
                operation5 = operation8;
                view5 = view5;
            } else {
                Object u = hb22.mo10593u(hb22.mo10583f(next3.mo6176g()));
                ArrayList<String> sharedElementSourceNames = operation2.mo6119f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = operation.mo6119f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = operation.mo6119f().getSharedElementTargetNames();
                Object obj5 = u;
                View view6 = view5;
                int i = 0;
                while (i < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.mo6119f().getSharedElementTargetNames();
                if (!z2) {
                    operation.mo6119f().getExitTransitionCallback();
                    operation2.mo6119f().getEnterTransitionCallback();
                } else {
                    operation.mo6119f().getEnterTransitionCallback();
                    operation2.mo6119f().getExitTransitionCallback();
                }
                int i2 = 0;
                for (int size = sharedElementSourceNames.size(); i2 < size; size = size) {
                    lqVar2.put(sharedElementSourceNames.get(i2), sharedElementTargetNames2.get(i2));
                    i2++;
                }
                if (FragmentManager.m4630K0(2)) {
                    Iterator<String> it = sharedElementTargetNames2.iterator();
                    while (it.hasNext()) {
                        Iterator<String> it2 = it;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Name: ");
                        sb.append(it.next());
                        it = it2;
                    }
                    Iterator<String> it3 = sharedElementSourceNames.iterator();
                    while (it3.hasNext()) {
                        Iterator<String> it4 = it3;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Name: ");
                        sb2.append(it3.next());
                        it3 = it4;
                    }
                }
                C2781lq lqVar3 = new C2781lq();
                mo6154u(lqVar3, operation.mo6119f().mView);
                lqVar3.mo22909p(sharedElementSourceNames);
                lqVar2.mo22909p(lqVar3.keySet());
                C2781lq lqVar4 = new C2781lq();
                mo6154u(lqVar4, operation2.mo6119f().mView);
                lqVar4.mo22909p(sharedElementTargetNames2);
                lqVar4.mo22909p(lqVar2.values());
                fb2.m16825c(lqVar2, lqVar4);
                mo6155v(lqVar3, lqVar2.keySet());
                mo6155v(lqVar4, lqVar2.values());
                if (lqVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    lqVar = lqVar2;
                    arrayList4 = arrayList6;
                    operation6 = operation7;
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    hb2 = hb22;
                    view5 = view6;
                    obj4 = null;
                    operation5 = operation8;
                } else {
                    fb2.m16823a(operation2.mo6119f(), operation.mo6119f(), z2, lqVar3, true);
                    ArrayList<String> arrayList8 = sharedElementSourceNames;
                    C0664g gVar = r0;
                    ViewGroup m = mo6110m();
                    Object obj6 = obj5;
                    C2781lq lqVar5 = lqVar4;
                    View view7 = view6;
                    C2781lq lqVar6 = lqVar3;
                    lqVar = lqVar2;
                    ArrayList arrayList9 = arrayList6;
                    C0664g gVar2 = new C0664g(operation2, operation, z, lqVar5);
                    xh4.m30102a(m, gVar2);
                    arrayList5.addAll(lqVar6.values());
                    if (!arrayList8.isEmpty()) {
                        View view8 = (View) lqVar6.get(arrayList8.get(0));
                        hb22.mo10589p(obj6, view8);
                        view5 = view8;
                    } else {
                        view5 = view7;
                    }
                    arrayList4 = arrayList9;
                    arrayList4.addAll(lqVar5.values());
                    if (!sharedElementTargetNames2.isEmpty()) {
                        View view9 = (View) lqVar5.get(sharedElementTargetNames2.get(0));
                        if (view9 != null) {
                            xh4.m30102a(mo6110m(), new C0665h(hb22, view9, rect2));
                            z3 = true;
                        }
                    }
                    hb22.mo10591s(obj6, view4, arrayList5);
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    hb2 = hb22;
                    hb22.mo10587n(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    operation6 = operation;
                    hashMap.put(operation6, bool);
                    operation5 = operation2;
                    hashMap.put(operation5, bool);
                    obj4 = obj6;
                }
            }
            operation7 = operation6;
            arrayList5 = arrayList3;
            rect2 = rect;
            view4 = view3;
            operation8 = operation5;
            lqVar2 = lqVar;
            z2 = z;
            arrayList6 = arrayList4;
            hb22 = hb2;
        }
        View view10 = view5;
        C2781lq lqVar7 = lqVar2;
        ArrayList arrayList10 = arrayList6;
        SpecialEffectsController.Operation operation9 = operation7;
        ArrayList arrayList11 = arrayList5;
        Rect rect3 = rect2;
        View view11 = view4;
        hb2 hb23 = hb22;
        boolean z4 = false;
        SpecialEffectsController.Operation operation10 = operation8;
        ArrayList arrayList12 = new ArrayList();
        Object obj7 = null;
        Object obj8 = null;
        for (C0670m next4 : list) {
            if (next4.mo6173d()) {
                hashMap.put(next4.mo6171b(), Boolean.FALSE);
                next4.mo6170a();
            } else {
                Object f = hb23.mo10583f(next4.mo6177h());
                SpecialEffectsController.Operation b = next4.mo6171b();
                boolean z5 = (obj4 == null || !(b == operation9 || b == operation10)) ? z4 : true;
                if (f == null) {
                    if (!z5) {
                        hashMap.put(b, Boolean.FALSE);
                        next4.mo6170a();
                    }
                    List<SpecialEffectsController.Operation> list3 = list2;
                    arrayList = arrayList10;
                    arrayList2 = arrayList11;
                    view = view11;
                    obj = obj7;
                    operation3 = operation10;
                    view2 = view10;
                } else {
                    ArrayList arrayList13 = new ArrayList();
                    Object obj9 = obj7;
                    mo6153t(arrayList13, b.mo6119f().mView);
                    if (z5) {
                        if (b == operation9) {
                            arrayList13.removeAll(arrayList11);
                        } else {
                            arrayList13.removeAll(arrayList10);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        hb23.mo10579a(f, view11);
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        view = view11;
                        operation4 = b;
                        obj3 = obj8;
                        operation3 = operation10;
                        List<SpecialEffectsController.Operation> list4 = list2;
                        obj2 = obj9;
                    } else {
                        hb23.mo10580b(f, arrayList13);
                        view = view11;
                        obj2 = obj9;
                        SpecialEffectsController.Operation operation11 = b;
                        arrayList2 = arrayList11;
                        obj3 = obj8;
                        arrayList = arrayList10;
                        operation3 = operation10;
                        hb23.mo10587n(f, f, arrayList13, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (operation11.mo6118e() == SpecialEffectsController.Operation.State.GONE) {
                            operation4 = operation11;
                            list2.remove(operation4);
                            ArrayList arrayList14 = new ArrayList(arrayList13);
                            arrayList14.remove(operation4.mo6119f().mView);
                            hb23.mo10586m(f, operation4.mo6119f().mView, arrayList14);
                            xh4.m30102a(mo6110m(), new C0666i(arrayList13));
                        } else {
                            List<SpecialEffectsController.Operation> list5 = list2;
                            operation4 = operation11;
                        }
                    }
                    if (operation4.mo6118e() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList12.addAll(arrayList13);
                        if (z3) {
                            hb23.mo10588o(f, rect3);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        hb23.mo10589p(f, view2);
                    }
                    hashMap.put(operation4, Boolean.TRUE);
                    if (next4.mo6179j()) {
                        obj8 = hb23.mo10585k(obj3, f, (Object) null);
                        obj = obj2;
                    } else {
                        obj = hb23.mo10585k(obj2, f, (Object) null);
                        obj8 = obj3;
                    }
                }
                operation10 = operation3;
                obj7 = obj;
                view10 = view2;
                view11 = view;
                arrayList11 = arrayList2;
                arrayList10 = arrayList;
                z4 = false;
            }
        }
        ArrayList arrayList15 = arrayList10;
        ArrayList arrayList16 = arrayList11;
        SpecialEffectsController.Operation operation12 = operation10;
        Object j = hb23.mo10584j(obj8, obj7, obj4);
        if (j == null) {
            return hashMap;
        }
        for (C0670m next5 : list) {
            if (!next5.mo6173d()) {
                Object h = next5.mo6177h();
                SpecialEffectsController.Operation b2 = next5.mo6171b();
                boolean z6 = obj4 != null && (b2 == operation9 || b2 == operation12);
                if (h != null || z6) {
                    if (!ga7.m17747T(mo6110m())) {
                        if (FragmentManager.m4630K0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("SpecialEffectsController: Container ");
                            sb3.append(mo6110m());
                            sb3.append(" has not been laid out. Completing operation ");
                            sb3.append(b2);
                        }
                        next5.mo6170a();
                    } else {
                        hb23.mo10590q(next5.mo6171b().mo6119f(), j, next5.mo6172c(), new C0667j(next5, b2));
                    }
                }
            }
        }
        if (!ga7.m17747T(mo6110m())) {
            return hashMap;
        }
        fb2.m16826d(arrayList12, 4);
        ArrayList arrayList17 = arrayList15;
        ArrayList<String> l = hb23.mo21079l(arrayList17);
        if (FragmentManager.m4630K0(2)) {
            Iterator it5 = arrayList16.iterator();
            while (it5.hasNext()) {
                View view12 = (View) it5.next();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("View: ");
                sb4.append(view12);
                sb4.append(" Name: ");
                sb4.append(ga7.m17733K(view12));
            }
            Iterator it6 = arrayList17.iterator();
            while (it6.hasNext()) {
                View view13 = (View) it6.next();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("View: ");
                sb5.append(view13);
                sb5.append(" Name: ");
                sb5.append(ga7.m17733K(view13));
            }
        }
        hb23.mo10581c(mo6110m(), j);
        hb23.mo21080r(mo6110m(), arrayList16, arrayList17, l, lqVar7);
        fb2.m16826d(arrayList12, 0);
        hb23.mo10592t(obj4, arrayList16, arrayList17);
        return hashMap;
    }

    /* renamed from: y */
    public final void mo6158y(List<SpecialEffectsController.Operation> list) {
        Fragment f = list.get(list.size() - 1).mo6119f();
        for (SpecialEffectsController.Operation next : list) {
            next.mo6119f().mAnimationInfo.f3629c = f.mAnimationInfo.f3629c;
            next.mo6119f().mAnimationInfo.f3630d = f.mAnimationInfo.f3630d;
            next.mo6119f().mAnimationInfo.f3631e = f.mAnimationInfo.f3631e;
            next.mo6119f().mAnimationInfo.f3632f = f.mAnimationInfo.f3632f;
        }
    }
}
