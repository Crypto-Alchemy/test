package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0514c;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.C0539b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.d */
/* compiled from: ViewTransitionController */
public class C0517d {

    /* renamed from: a */
    public final MotionLayout f2929a;

    /* renamed from: b */
    public ArrayList<C0514c> f2930b = new ArrayList<>();

    /* renamed from: c */
    public HashSet<View> f2931c;

    /* renamed from: d */
    public String f2932d = "ViewTransitionController";

    /* renamed from: e */
    public ArrayList<C0514c.C0516b> f2933e;

    /* renamed from: f */
    public ArrayList<C0514c.C0516b> f2934f = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.d$a */
    /* compiled from: ViewTransitionController */
    public class C0518a implements C0539b.C0540a {

        /* renamed from: a */
        public final /* synthetic */ C0514c f2935a;

        /* renamed from: d */
        public final /* synthetic */ int f2936d;

        /* renamed from: e */
        public final /* synthetic */ boolean f2937e;

        /* renamed from: g */
        public final /* synthetic */ int f2938g;

        public C0518a(C0514c cVar, int i, boolean z, int i2) {
            this.f2935a = cVar;
            this.f2936d = i;
            this.f2937e = z;
            this.f2938g = i2;
        }
    }

    public C0517d(MotionLayout motionLayout) {
        this.f2929a = motionLayout;
    }

    /* renamed from: a */
    public void mo4897a(C0514c cVar) {
        this.f2930b.add(cVar);
        this.f2931c = null;
        if (cVar.mo4885i() == 4) {
            mo4902f(cVar, true);
        } else if (cVar.mo4885i() == 5) {
            mo4902f(cVar, false);
        }
    }

    /* renamed from: b */
    public void mo4898b(C0514c.C0516b bVar) {
        if (this.f2933e == null) {
            this.f2933e = new ArrayList<>();
        }
        this.f2933e.add(bVar);
    }

    /* renamed from: c */
    public void mo4899c() {
        ArrayList<C0514c.C0516b> arrayList = this.f2933e;
        if (arrayList != null) {
            Iterator<C0514c.C0516b> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo4892a();
            }
            this.f2933e.removeAll(this.f2934f);
            this.f2934f.clear();
            if (this.f2933e.isEmpty()) {
                this.f2933e = null;
            }
        }
    }

    /* renamed from: d */
    public boolean mo4900d(int i, jy3 jy3) {
        Iterator<C0514c> it = this.f2930b.iterator();
        while (it.hasNext()) {
            C0514c next = it.next();
            if (next.mo4881e() == i) {
                next.f2895f.mo23634a(jy3);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo4901e() {
        this.f2929a.invalidate();
    }

    /* renamed from: f */
    public final void mo4902f(C0514c cVar, boolean z) {
        ConstraintLayout.getSharedValues().mo5192a(cVar.mo4884h(), new C0518a(cVar, cVar.mo4884h(), z, cVar.mo4883g()));
    }

    /* renamed from: g */
    public void mo4903g(C0514c.C0516b bVar) {
        this.f2934f.add(bVar);
    }

    /* renamed from: h */
    public void mo4904h(MotionEvent motionEvent) {
        C0514c cVar;
        int currentState = this.f2929a.getCurrentState();
        if (currentState != -1) {
            if (this.f2931c == null) {
                this.f2931c = new HashSet<>();
                Iterator<C0514c> it = this.f2930b.iterator();
                while (it.hasNext()) {
                    C0514c next = it.next();
                    int childCount = this.f2929a.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.f2929a.getChildAt(i);
                        if (next.mo4886k(childAt)) {
                            childAt.getId();
                            this.f2931c.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<C0514c.C0516b> arrayList = this.f2933e;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C0514c.C0516b> it2 = this.f2933e.iterator();
                while (it2.hasNext()) {
                    it2.next().mo4895d(action, x, y);
                }
            }
            if (action == 0 || action == 1) {
                C0532a f0 = this.f2929a.mo4673f0(currentState);
                Iterator<C0514c> it3 = this.f2930b.iterator();
                while (it3.hasNext()) {
                    C0514c next2 = it3.next();
                    if (next2.mo4888m(action)) {
                        Iterator<View> it4 = this.f2931c.iterator();
                        while (it4.hasNext()) {
                            View next3 = it4.next();
                            if (next2.mo4886k(next3)) {
                                next3.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    cVar = next2;
                                    next2.mo4879c(this, this.f2929a, currentState, f0, next3);
                                } else {
                                    cVar = next2;
                                }
                                next2 = cVar;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void mo4905i(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0514c> it = this.f2930b.iterator();
        while (it.hasNext()) {
            C0514c next = it.next();
            if (next.mo4881e() == i) {
                for (View view : viewArr) {
                    if (next.mo4880d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    mo4906j(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo4906j(C0514c cVar, View... viewArr) {
        int currentState = this.f2929a.getCurrentState();
        if (cVar.f2894e == 2) {
            cVar.mo4879c(this, this.f2929a, currentState, (C0532a) null, viewArr);
        } else if (currentState == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("No support for ViewTransition within transition yet. Currently: ");
            sb.append(this.f2929a.toString());
        } else {
            C0532a f0 = this.f2929a.mo4673f0(currentState);
            if (f0 != null) {
                cVar.mo4879c(this, this.f2929a, currentState, f0, viewArr);
            }
        }
    }
}
