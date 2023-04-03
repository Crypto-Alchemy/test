package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000.sa0;

public abstract class SpecialEffectsController {

    /* renamed from: a */
    public final ViewGroup f3752a;

    /* renamed from: b */
    public final ArrayList<Operation> f3753b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<Operation> f3754c = new ArrayList<>();

    /* renamed from: d */
    public boolean f3755d = false;

    /* renamed from: e */
    public boolean f3756e = false;

    /* renamed from: androidx.fragment.app.SpecialEffectsController$a */
    public class C0651a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0654d f3767a;

        public C0651a(C0654d dVar) {
            this.f3767a = dVar;
        }

        public void run() {
            if (SpecialEffectsController.this.f3753b.contains(this.f3767a)) {
                this.f3767a.mo6118e().applyState(this.f3767a.mo6119f().mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$b */
    public class C0652b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C0654d f3769a;

        public C0652b(C0654d dVar) {
            this.f3769a = dVar;
        }

        public void run() {
            SpecialEffectsController.this.f3753b.remove(this.f3769a);
            SpecialEffectsController.this.f3754c.remove(this.f3769a);
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$c */
    public static /* synthetic */ class C0653c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3771a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3772b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3772b = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3772b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3772b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3771a = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f3771a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f3771a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f3771a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.C0653c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$d */
    public static class C0654d extends Operation {

        /* renamed from: h */
        public final C0680h f3773h;

        public C0654d(Operation.State state, Operation.LifecycleImpact lifecycleImpact, C0680h hVar, sa0 sa0) {
            super(state, lifecycleImpact, hVar.mo6219k(), sa0);
            this.f3773h = hVar;
        }

        /* renamed from: c */
        public void mo6116c() {
            super.mo6116c();
            this.f3773h.mo6221m();
        }

        /* renamed from: l */
        public void mo6125l() {
            if (mo6120g() == Operation.LifecycleImpact.ADDING) {
                Fragment k = this.f3773h.mo6219k();
                View findFocus = k.mView.findFocus();
                if (findFocus != null) {
                    k.setFocusedView(findFocus);
                    if (FragmentManager.m4630K0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(k);
                    }
                }
                View requireView = mo6119f().requireView();
                if (requireView.getParent() == null) {
                    this.f3773h.mo6210b();
                    requireView.setAlpha(Utils.FLOAT_EPSILON);
                }
                if (requireView.getAlpha() == Utils.FLOAT_EPSILON && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k.getPostOnViewCreatedAlpha());
            } else if (mo6120g() == Operation.LifecycleImpact.REMOVING) {
                Fragment k2 = this.f3773h.mo6219k();
                View requireView2 = k2.requireView();
                if (FragmentManager.m4630K0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Clearing focus ");
                    sb2.append(requireView2.findFocus());
                    sb2.append(" on view ");
                    sb2.append(requireView2);
                    sb2.append(" for Fragment ");
                    sb2.append(k2);
                }
                requireView2.clearFocus();
            }
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.f3752a = viewGroup;
    }

    /* renamed from: n */
    public static SpecialEffectsController m4814n(ViewGroup viewGroup, l66 l66) {
        int i = s35.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController a = l66.mo6040a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* renamed from: o */
    public static SpecialEffectsController m4815o(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m4814n(viewGroup, fragmentManager.mo5919C0());
    }

    /* renamed from: a */
    public final void mo6098a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, C0680h hVar) {
        synchronized (this.f3753b) {
            sa0 sa0 = new sa0();
            Operation h = mo6105h(hVar.mo6219k());
            if (h != null) {
                h.mo6124k(state, lifecycleImpact);
                return;
            }
            C0654d dVar = new C0654d(state, lifecycleImpact, hVar, sa0);
            this.f3753b.add(dVar);
            dVar.mo6114a(new C0651a(dVar));
            dVar.mo6114a(new C0652b(dVar));
        }
    }

    /* renamed from: b */
    public void mo6099b(Operation.State state, C0680h hVar) {
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(hVar.mo6219k());
        }
        mo6098a(state, Operation.LifecycleImpact.ADDING, hVar);
    }

    /* renamed from: c */
    public void mo6100c(C0680h hVar) {
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(hVar.mo6219k());
        }
        mo6098a(Operation.State.GONE, Operation.LifecycleImpact.NONE, hVar);
    }

    /* renamed from: d */
    public void mo6101d(C0680h hVar) {
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(hVar.mo6219k());
        }
        mo6098a(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, hVar);
    }

    /* renamed from: e */
    public void mo6102e(C0680h hVar) {
        if (FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(hVar.mo6219k());
        }
        mo6098a(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, hVar);
    }

    /* renamed from: f */
    public abstract void mo6103f(List<Operation> list, boolean z);

    /* renamed from: g */
    public void mo6104g() {
        if (!this.f3756e) {
            if (!ga7.m17746S(this.f3752a)) {
                mo6107j();
                this.f3755d = false;
                return;
            }
            synchronized (this.f3753b) {
                if (!this.f3753b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f3754c);
                    this.f3754c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Operation operation = (Operation) it.next();
                        if (FragmentManager.m4630K0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Cancelling operation ");
                            sb.append(operation);
                        }
                        operation.mo6115b();
                        if (!operation.mo6122i()) {
                            this.f3754c.add(operation);
                        }
                    }
                    mo6112q();
                    ArrayList arrayList2 = new ArrayList(this.f3753b);
                    this.f3753b.clear();
                    this.f3754c.addAll(arrayList2);
                    boolean K0 = FragmentManager.m4630K0(2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((Operation) it2.next()).mo6125l();
                    }
                    mo6103f(arrayList2, this.f3755d);
                    this.f3755d = false;
                    boolean K02 = FragmentManager.m4630K0(2);
                }
            }
        }
    }

    /* renamed from: h */
    public final Operation mo6105h(Fragment fragment) {
        Iterator<Operation> it = this.f3753b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.mo6119f().equals(fragment) && !next.mo6121h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final Operation mo6106i(Fragment fragment) {
        Iterator<Operation> it = this.f3754c.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.mo6119f().equals(fragment) && !next.mo6121h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void mo6107j() {
        String str;
        String str2;
        FragmentManager.m4630K0(2);
        boolean S = ga7.m17746S(this.f3752a);
        synchronized (this.f3753b) {
            mo6112q();
            Iterator<Operation> it = this.f3753b.iterator();
            while (it.hasNext()) {
                it.next().mo6125l();
            }
            Iterator it2 = new ArrayList(this.f3754c).iterator();
            while (it2.hasNext()) {
                Operation operation = (Operation) it2.next();
                if (FragmentManager.m4630K0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (S) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f3752a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(operation);
                }
                operation.mo6115b();
            }
            Iterator it3 = new ArrayList(this.f3753b).iterator();
            while (it3.hasNext()) {
                Operation operation2 = (Operation) it3.next();
                if (FragmentManager.m4630K0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (S) {
                        str = "";
                    } else {
                        str = "Container " + this.f3752a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(operation2);
                }
                operation2.mo6115b();
            }
        }
    }

    /* renamed from: k */
    public void mo6108k() {
        if (this.f3756e) {
            FragmentManager.m4630K0(2);
            this.f3756e = false;
            mo6104g();
        }
    }

    /* renamed from: l */
    public Operation.LifecycleImpact mo6109l(C0680h hVar) {
        Operation.LifecycleImpact lifecycleImpact;
        Operation h = mo6105h(hVar.mo6219k());
        if (h != null) {
            lifecycleImpact = h.mo6120g();
        } else {
            lifecycleImpact = null;
        }
        Operation i = mo6106i(hVar.mo6219k());
        if (i == null || (lifecycleImpact != null && lifecycleImpact != Operation.LifecycleImpact.NONE)) {
            return lifecycleImpact;
        }
        return i.mo6120g();
    }

    /* renamed from: m */
    public ViewGroup mo6110m() {
        return this.f3752a;
    }

    /* renamed from: p */
    public void mo6111p() {
        synchronized (this.f3753b) {
            mo6112q();
            this.f3756e = false;
            int size = this.f3753b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Operation operation = this.f3753b.get(size);
                Operation.State from = Operation.State.from(operation.mo6119f().mView);
                Operation.State e = operation.mo6118e();
                Operation.State state = Operation.State.VISIBLE;
                if (e == state && from != state) {
                    this.f3756e = operation.mo6119f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: q */
    public final void mo6112q() {
        Iterator<Operation> it = this.f3753b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.mo6120g() == Operation.LifecycleImpact.ADDING) {
                next.mo6124k(Operation.State.from(next.mo6119f().requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    /* renamed from: r */
    public void mo6113r(boolean z) {
        this.f3755d = z;
    }

    public static class Operation {

        /* renamed from: a */
        public State f3757a;

        /* renamed from: b */
        public LifecycleImpact f3758b;

        /* renamed from: c */
        public final Fragment f3759c;

        /* renamed from: d */
        public final List<Runnable> f3760d = new ArrayList();

        /* renamed from: e */
        public final HashSet<sa0> f3761e = new HashSet<>();

        /* renamed from: f */
        public boolean f3762f = false;

        /* renamed from: g */
        public boolean f3763g = false;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.SpecialEffectsController$Operation$a */
        public class C0650a implements sa0.C3256b {
            public C0650a() {
            }

            public void onCancel() {
                Operation.this.mo6115b();
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, sa0 sa0) {
            this.f3757a = state;
            this.f3758b = lifecycleImpact;
            this.f3759c = fragment;
            sa0.mo25694c(new C0650a());
        }

        /* renamed from: a */
        public final void mo6114a(Runnable runnable) {
            this.f3760d.add(runnable);
        }

        /* renamed from: b */
        public final void mo6115b() {
            if (!mo6121h()) {
                this.f3762f = true;
                if (this.f3761e.isEmpty()) {
                    mo6116c();
                    return;
                }
                Iterator it = new ArrayList(this.f3761e).iterator();
                while (it.hasNext()) {
                    ((sa0) it.next()).mo25692a();
                }
            }
        }

        /* renamed from: c */
        public void mo6116c() {
            if (!this.f3763g) {
                if (FragmentManager.m4630K0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(this);
                    sb.append(" has called complete.");
                }
                this.f3763g = true;
                for (Runnable run : this.f3760d) {
                    run.run();
                }
            }
        }

        /* renamed from: d */
        public final void mo6117d(sa0 sa0) {
            if (this.f3761e.remove(sa0) && this.f3761e.isEmpty()) {
                mo6116c();
            }
        }

        /* renamed from: e */
        public State mo6118e() {
            return this.f3757a;
        }

        /* renamed from: f */
        public final Fragment mo6119f() {
            return this.f3759c;
        }

        /* renamed from: g */
        public LifecycleImpact mo6120g() {
            return this.f3758b;
        }

        /* renamed from: h */
        public final boolean mo6121h() {
            return this.f3762f;
        }

        /* renamed from: i */
        public final boolean mo6122i() {
            return this.f3763g;
        }

        /* renamed from: j */
        public final void mo6123j(sa0 sa0) {
            mo6125l();
            this.f3761e.add(sa0);
        }

        /* renamed from: k */
        public final void mo6124k(State state, LifecycleImpact lifecycleImpact) {
            int i = C0653c.f3772b[lifecycleImpact.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (FragmentManager.m4630K0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.f3759c);
                        sb.append(" mFinalState = ");
                        sb.append(this.f3757a);
                        sb.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb.append(this.f3758b);
                        sb.append(" to REMOVING.");
                    }
                    this.f3757a = State.REMOVED;
                    this.f3758b = LifecycleImpact.REMOVING;
                } else if (i == 3 && this.f3757a != State.REMOVED) {
                    if (FragmentManager.m4630K0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: For fragment ");
                        sb2.append(this.f3759c);
                        sb2.append(" mFinalState = ");
                        sb2.append(this.f3757a);
                        sb2.append(" -> ");
                        sb2.append(state);
                        sb2.append(". ");
                    }
                    this.f3757a = state;
                }
            } else if (this.f3757a == State.REMOVED) {
                if (FragmentManager.m4630K0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.f3759c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.f3758b);
                    sb3.append(" to ADDING.");
                }
                this.f3757a = State.VISIBLE;
                this.f3758b = LifecycleImpact.ADDING;
            }
        }

        /* renamed from: l */
        public void mo6125l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f3757a + "} " + "{" + "mLifecycleImpact = " + this.f3758b + "} " + "{" + "mFragment = " + this.f3759c + "}";
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static State from(View view) {
                if (view.getAlpha() == Utils.FLOAT_EPSILON && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            public void applyState(View view) {
                int i = C0653c.f3771a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m4630K0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (FragmentManager.m4630K0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.m4630K0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to GONE");
                    }
                    view.setVisibility(8);
                } else if (i == 4) {
                    if (FragmentManager.m4630K0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Setting view ");
                        sb4.append(view);
                        sb4.append(" to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }

            public static State from(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }
        }
    }
}
