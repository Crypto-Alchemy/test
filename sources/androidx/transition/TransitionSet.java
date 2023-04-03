package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {

    /* renamed from: A1 */
    public boolean f7214A1 = false;

    /* renamed from: B1 */
    public int f7215B1 = 0;

    /* renamed from: x1 */
    public ArrayList<Transition> f7216x1 = new ArrayList<>();

    /* renamed from: y1 */
    public boolean f7217y1 = true;

    /* renamed from: z1 */
    public int f7218z1;

    /* renamed from: androidx.transition.TransitionSet$a */
    public class C1447a extends C1459b {

        /* renamed from: a */
        public final /* synthetic */ Transition f7219a;

        public C1447a(Transition transition) {
            this.f7219a = transition;
        }

        public void onTransitionEnd(Transition transition) {
            this.f7219a.mo10522i0();
            transition.mo10517e0(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    public static class C1448b extends C1459b {

        /* renamed from: a */
        public TransitionSet f7221a;

        public C1448b(TransitionSet transitionSet) {
            this.f7221a = transitionSet;
        }

        public void onTransitionEnd(Transition transition) {
            TransitionSet transitionSet = this.f7221a;
            int i = transitionSet.f7218z1 - 1;
            transitionSet.f7218z1 = i;
            if (i == 0) {
                transitionSet.f7214A1 = false;
                transitionSet.mo10541v();
            }
            transition.mo10517e0(this);
        }

        public void onTransitionStart(Transition transition) {
            TransitionSet transitionSet = this.f7221a;
            if (!transitionSet.f7214A1) {
                transitionSet.mo10537s0();
                this.f7221a.f7214A1 = true;
            }
        }
    }

    public TransitionSet() {
    }

    /* renamed from: A0 */
    public int mo10551A0() {
        return this.f7216x1.size();
    }

    /* renamed from: B0 */
    public TransitionSet mo10517e0(Transition.C1446f fVar) {
        return (TransitionSet) super.mo10517e0(fVar);
    }

    /* renamed from: C0 */
    public TransitionSet mo10518f0(View view) {
        for (int i = 0; i < this.f7216x1.size(); i++) {
            this.f7216x1.get(i).mo10518f0(view);
        }
        return (TransitionSet) super.mo10518f0(view);
    }

    /* renamed from: F0 */
    public TransitionSet mo10525k0(long j) {
        ArrayList<Transition> arrayList;
        super.mo10525k0(j);
        if (this.f7189e >= 0 && (arrayList = this.f7216x1) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f7216x1.get(i).mo10525k0(j);
            }
        }
        return this;
    }

    /* renamed from: G0 */
    public TransitionSet mo10528m0(TimeInterpolator timeInterpolator) {
        this.f7215B1 |= 1;
        ArrayList<Transition> arrayList = this.f7216x1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f7216x1.get(i).mo10528m0(timeInterpolator);
            }
        }
        return (TransitionSet) super.mo10528m0(timeInterpolator);
    }

    /* renamed from: H0 */
    public TransitionSet mo10556H0(int i) {
        if (i == 0) {
            this.f7217y1 = true;
        } else if (i == 1) {
            this.f7217y1 = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: I0 */
    public TransitionSet mo10534q0(ViewGroup viewGroup) {
        super.mo10534q0(viewGroup);
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            this.f7216x1.get(i).mo10534q0(viewGroup);
        }
        return this;
    }

    /* renamed from: J0 */
    public TransitionSet mo10536r0(long j) {
        return (TransitionSet) super.mo10536r0(j);
    }

    /* renamed from: K0 */
    public final void mo10559K0() {
        C1448b bVar = new C1448b(this);
        Iterator<Transition> it = this.f7216x1.iterator();
        while (it.hasNext()) {
            it.next().mo10510a(bVar);
        }
        this.f7218z1 = this.f7216x1.size();
    }

    /* renamed from: c0 */
    public void mo10512c0(View view) {
        super.mo10512c0(view);
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            this.f7216x1.get(i).mo10512c0(view);
        }
    }

    public void cancel() {
        super.cancel();
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            this.f7216x1.get(i).cancel();
        }
    }

    /* renamed from: g0 */
    public void mo10519g0(View view) {
        super.mo10519g0(view);
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            this.f7216x1.get(i).mo10519g0(view);
        }
    }

    /* renamed from: i */
    public void mo10405i(bx6 bx6) {
        if (mo10504R(bx6.f8292b)) {
            Iterator<Transition> it = this.f7216x1.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo10504R(bx6.f8292b)) {
                    next.mo10405i(bx6);
                    bx6.f8293c.add(next);
                }
            }
        }
    }

    /* renamed from: i0 */
    public void mo10522i0() {
        if (this.f7216x1.isEmpty()) {
            mo10537s0();
            mo10541v();
            return;
        }
        mo10559K0();
        if (!this.f7217y1) {
            for (int i = 1; i < this.f7216x1.size(); i++) {
                this.f7216x1.get(i - 1).mo10510a(new C1447a(this.f7216x1.get(i)));
            }
            Transition transition = this.f7216x1.get(0);
            if (transition != null) {
                transition.mo10522i0();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.f7216x1.iterator();
        while (it.hasNext()) {
            it.next().mo10522i0();
        }
    }

    /* renamed from: j0 */
    public void mo10524j0(boolean z) {
        super.mo10524j0(z);
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            this.f7216x1.get(i).mo10524j0(z);
        }
    }

    /* renamed from: l */
    public void mo10526l(bx6 bx6) {
        super.mo10526l(bx6);
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            this.f7216x1.get(i).mo10526l(bx6);
        }
    }

    /* renamed from: l0 */
    public void mo10527l0(Transition.C1445e eVar) {
        super.mo10527l0(eVar);
        this.f7215B1 |= 8;
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            this.f7216x1.get(i).mo10527l0(eVar);
        }
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        if (mo10504R(bx6.f8292b)) {
            Iterator<Transition> it = this.f7216x1.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo10504R(bx6.f8292b)) {
                    next.mo10406m(bx6);
                    bx6.f8293c.add(next);
                }
            }
        }
    }

    /* renamed from: o0 */
    public void mo10531o0(PathMotion pathMotion) {
        super.mo10531o0(pathMotion);
        this.f7215B1 |= 4;
        if (this.f7216x1 != null) {
            for (int i = 0; i < this.f7216x1.size(); i++) {
                this.f7216x1.get(i).mo10531o0(pathMotion);
            }
        }
    }

    /* renamed from: p0 */
    public void mo10533p0(zw6 zw6) {
        super.mo10533p0(zw6);
        this.f7215B1 |= 2;
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            this.f7216x1.get(i).mo10533p0(zw6);
        }
    }

    /* renamed from: r */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f7216x1 = new ArrayList<>();
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            transitionSet.mo10563x0(this.f7216x1.get(i).clone());
        }
        return transitionSet;
    }

    /* renamed from: t0 */
    public String mo10538t0(String str) {
        String t0 = super.mo10538t0(str);
        for (int i = 0; i < this.f7216x1.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(t0);
            sb.append("\n");
            sb.append(this.f7216x1.get(i).mo10538t0(str + "  "));
            t0 = sb.toString();
        }
        return t0;
    }

    /* renamed from: u */
    public void mo10540u(ViewGroup viewGroup, cx6 cx6, cx6 cx62, ArrayList<bx6> arrayList, ArrayList<bx6> arrayList2) {
        long H = mo10497H();
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f7216x1.get(i);
            if (H > 0 && (this.f7217y1 || i == 0)) {
                long H2 = transition.mo10497H();
                if (H2 > 0) {
                    transition.mo10536r0(H2 + H);
                } else {
                    transition.mo10536r0(H);
                }
            }
            transition.mo10540u(viewGroup, cx6, cx62, arrayList, arrayList2);
        }
    }

    /* renamed from: u0 */
    public TransitionSet mo10510a(Transition.C1446f fVar) {
        return (TransitionSet) super.mo10510a(fVar);
    }

    /* renamed from: v0 */
    public TransitionSet mo10511b(View view) {
        for (int i = 0; i < this.f7216x1.size(); i++) {
            this.f7216x1.get(i).mo10511b(view);
        }
        return (TransitionSet) super.mo10511b(view);
    }

    /* renamed from: w */
    public void mo10542w(ViewGroup viewGroup) {
        super.mo10542w(viewGroup);
        int size = this.f7216x1.size();
        for (int i = 0; i < size; i++) {
            this.f7216x1.get(i).mo10542w(viewGroup);
        }
    }

    /* renamed from: w0 */
    public TransitionSet mo10562w0(Transition transition) {
        mo10563x0(transition);
        long j = this.f7189e;
        if (j >= 0) {
            transition.mo10525k0(j);
        }
        if ((this.f7215B1 & 1) != 0) {
            transition.mo10528m0(mo10492B());
        }
        if ((this.f7215B1 & 2) != 0) {
            transition.mo10533p0(mo10496F());
        }
        if ((this.f7215B1 & 4) != 0) {
            transition.mo10531o0(mo10495E());
        }
        if ((this.f7215B1 & 8) != 0) {
            transition.mo10527l0(mo10545z());
        }
        return this;
    }

    /* renamed from: x0 */
    public final void mo10563x0(Transition transition) {
        this.f7216x1.add(transition);
        transition.f7181Q = this;
    }

    /* renamed from: z0 */
    public Transition mo10564z0(int i) {
        if (i < 0 || i >= this.f7216x1.size()) {
            return null;
        }
        return this.f7216x1.get(i);
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fc6.f11772i);
        mo10556H0(e27.m15648g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
