package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.s */
/* compiled from: RecyclerViewAccessibilityDelegate */
public class C1339s extends C3715z7 {

    /* renamed from: d */
    public final RecyclerView f6833d;

    /* renamed from: e */
    public final C1340a f6834e;

    /* renamed from: androidx.recyclerview.widget.s$a */
    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class C1340a extends C3715z7 {

        /* renamed from: d */
        public final C1339s f6835d;

        /* renamed from: e */
        public Map<View, C3715z7> f6836e = new WeakHashMap();

        public C1340a(C1339s sVar) {
            this.f6835d = sVar;
        }

        /* renamed from: a */
        public boolean mo5574a(View view, AccessibilityEvent accessibilityEvent) {
            C3715z7 z7Var = this.f6836e.get(view);
            if (z7Var != null) {
                return z7Var.mo5574a(view, accessibilityEvent);
            }
            return super.mo5574a(view, accessibilityEvent);
        }

        /* renamed from: b */
        public C3523w8 mo3837b(View view) {
            C3715z7 z7Var = this.f6836e.get(view);
            if (z7Var != null) {
                return z7Var.mo3837b(view);
            }
            return super.mo3837b(view);
        }

        /* renamed from: f */
        public void mo5478f(View view, AccessibilityEvent accessibilityEvent) {
            C3715z7 z7Var = this.f6836e.get(view);
            if (z7Var != null) {
                z7Var.mo5478f(view, accessibilityEvent);
            } else {
                super.mo5478f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            if (this.f6835d.mo9956o() || this.f6835d.f6833d.getLayoutManager() == null) {
                super.mo5479g(view, t8Var);
                return;
            }
            this.f6835d.f6833d.getLayoutManager().mo9238W0(view, t8Var);
            C3715z7 z7Var = this.f6836e.get(view);
            if (z7Var != null) {
                z7Var.mo5479g(view, t8Var);
            } else {
                super.mo5479g(view, t8Var);
            }
        }

        /* renamed from: h */
        public void mo9957h(View view, AccessibilityEvent accessibilityEvent) {
            C3715z7 z7Var = this.f6836e.get(view);
            if (z7Var != null) {
                z7Var.mo9957h(view, accessibilityEvent);
            } else {
                super.mo9957h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo5575i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C3715z7 z7Var = this.f6836e.get(viewGroup);
            if (z7Var != null) {
                return z7Var.mo5575i(viewGroup, view, accessibilityEvent);
            }
            return super.mo5575i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo5480j(View view, int i, Bundle bundle) {
            if (this.f6835d.mo9956o() || this.f6835d.f6833d.getLayoutManager() == null) {
                return super.mo5480j(view, i, bundle);
            }
            C3715z7 z7Var = this.f6836e.get(view);
            if (z7Var != null) {
                if (z7Var.mo5480j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo5480j(view, i, bundle)) {
                return true;
            }
            return this.f6835d.f6833d.getLayoutManager().mo9277q1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo9958l(View view, int i) {
            C3715z7 z7Var = this.f6836e.get(view);
            if (z7Var != null) {
                z7Var.mo9958l(view, i);
            } else {
                super.mo9958l(view, i);
            }
        }

        /* renamed from: m */
        public void mo9959m(View view, AccessibilityEvent accessibilityEvent) {
            C3715z7 z7Var = this.f6836e.get(view);
            if (z7Var != null) {
                z7Var.mo9959m(view, accessibilityEvent);
            } else {
                super.mo9959m(view, accessibilityEvent);
            }
        }

        /* renamed from: n */
        public C3715z7 mo9960n(View view) {
            return this.f6836e.remove(view);
        }

        /* renamed from: o */
        public void mo9961o(View view) {
            C3715z7 l = ga7.m17776l(view);
            if (l != null && l != this) {
                this.f6836e.put(view, l);
            }
        }
    }

    public C1339s(RecyclerView recyclerView) {
        this.f6833d = recyclerView;
        C3715z7 n = mo9955n();
        if (n == null || !(n instanceof C1340a)) {
            this.f6834e = new C1340a(this);
        } else {
            this.f6834e = (C1340a) n;
        }
    }

    /* renamed from: f */
    public void mo5478f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo5478f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo9956o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo8897S0(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo5479g(View view, C3335t8 t8Var) {
        super.mo5479g(view, t8Var);
        if (!mo9956o() && this.f6833d.getLayoutManager() != null) {
            this.f6833d.getLayoutManager().mo9235U0(t8Var);
        }
    }

    /* renamed from: j */
    public boolean mo5480j(View view, int i, Bundle bundle) {
        if (super.mo5480j(view, i, bundle)) {
            return true;
        }
        if (mo9956o() || this.f6833d.getLayoutManager() == null) {
            return false;
        }
        return this.f6833d.getLayoutManager().mo9272o1(i, bundle);
    }

    /* renamed from: n */
    public C3715z7 mo9955n() {
        return this.f6834e;
    }

    /* renamed from: o */
    public boolean mo9956o() {
        return this.f6833d.mo9109q0();
    }
}
