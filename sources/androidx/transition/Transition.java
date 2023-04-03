package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.web3j.ens.contracts.generated.PublicResolver;

public abstract class Transition implements Cloneable {

    /* renamed from: u1 */
    public static final int[] f7170u1 = {2, 1, 3, 4};

    /* renamed from: v1 */
    public static final PathMotion f7171v1 = new C1441a();

    /* renamed from: w1 */
    public static ThreadLocal<C2781lq<Animator, C1444d>> f7172w1 = new ThreadLocal<>();

    /* renamed from: A */
    public ArrayList<View> f7173A = null;

    /* renamed from: B */
    public ArrayList<Class<?>> f7174B = null;

    /* renamed from: C */
    public ArrayList<String> f7175C = null;

    /* renamed from: H */
    public ArrayList<Integer> f7176H = null;

    /* renamed from: I */
    public ArrayList<View> f7177I = null;

    /* renamed from: L */
    public ArrayList<Class<?>> f7178L = null;

    /* renamed from: M */
    public cx6 f7179M = new cx6();

    /* renamed from: P */
    public cx6 f7180P = new cx6();

    /* renamed from: Q */
    public TransitionSet f7181Q = null;

    /* renamed from: U */
    public int[] f7182U = f7170u1;

    /* renamed from: X */
    public ArrayList<bx6> f7183X;

    /* renamed from: Y */
    public ArrayList<bx6> f7184Y;

    /* renamed from: Z */
    public ViewGroup f7185Z = null;

    /* renamed from: a */
    public String f7186a = getClass().getName();

    /* renamed from: b1 */
    public boolean f7187b1 = false;

    /* renamed from: d */
    public long f7188d = -1;

    /* renamed from: e */
    public long f7189e = -1;

    /* renamed from: e0 */
    public boolean f7190e0 = false;

    /* renamed from: e1 */
    public boolean f7191e1 = false;

    /* renamed from: g */
    public TimeInterpolator f7192g = null;

    /* renamed from: k */
    public ArrayList<Integer> f7193k = new ArrayList<>();

    /* renamed from: k0 */
    public ArrayList<Animator> f7194k0 = new ArrayList<>();

    /* renamed from: o1 */
    public ArrayList<C1446f> f7195o1 = null;

    /* renamed from: p1 */
    public ArrayList<Animator> f7196p1 = new ArrayList<>();

    /* renamed from: q1 */
    public zw6 f7197q1;

    /* renamed from: r */
    public ArrayList<View> f7198r = new ArrayList<>();

    /* renamed from: r1 */
    public C1445e f7199r1;

    /* renamed from: s */
    public ArrayList<String> f7200s = null;

    /* renamed from: s1 */
    public C2781lq<String, String> f7201s1;

    /* renamed from: t1 */
    public PathMotion f7202t1 = f7171v1;

    /* renamed from: v0 */
    public int f7203v0 = 0;

    /* renamed from: x */
    public ArrayList<Class<?>> f7204x = null;

    /* renamed from: y */
    public ArrayList<Integer> f7205y = null;

    /* renamed from: androidx.transition.Transition$a */
    public static class C1441a extends PathMotion {
        /* renamed from: a */
        public Path mo10399a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    public class C1442b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C2781lq f7206a;

        public C1442b(C2781lq lqVar) {
            this.f7206a = lqVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f7206a.remove(animator);
            Transition.this.f7194k0.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            Transition.this.f7194k0.add(animator);
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    public class C1443c extends AnimatorListenerAdapter {
        public C1443c() {
        }

        public void onAnimationEnd(Animator animator) {
            Transition.this.mo10541v();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    public static class C1444d {

        /* renamed from: a */
        public View f7209a;

        /* renamed from: b */
        public String f7210b;

        /* renamed from: c */
        public bx6 f7211c;

        /* renamed from: d */
        public el7 f7212d;

        /* renamed from: e */
        public Transition f7213e;

        public C1444d(View view, String str, Transition transition, el7 el7, bx6 bx6) {
            this.f7209a = view;
            this.f7210b = str;
            this.f7211c = bx6;
            this.f7212d = el7;
            this.f7213e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    public static abstract class C1445e {
        /* renamed from: a */
        public abstract Rect mo10549a(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$f */
    public interface C1446f {
        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        void onTransitionPause(Transition transition);

        void onTransitionResume(Transition transition);

        void onTransitionStart(Transition transition);
    }

    public Transition() {
    }

    /* renamed from: G */
    public static C2781lq<Animator, C1444d> m10078G() {
        C2781lq<Animator, C1444d> lqVar = f7172w1.get();
        if (lqVar != null) {
            return lqVar;
        }
        C2781lq<Animator, C1444d> lqVar2 = new C2781lq<>();
        f7172w1.set(lqVar2);
        return lqVar2;
    }

    /* renamed from: P */
    public static boolean m10079P(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: S */
    public static boolean m10080S(bx6 bx6, bx6 bx62, String str) {
        Object obj = bx6.f8291a.get(str);
        Object obj2 = bx62.f8291a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: a0 */
    public static int[] m10081a0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if (PublicResolver.FUNC_NAME.equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: f */
    public static void m10082f(cx6 cx6, View view, bx6 bx6) {
        cx6.f10399a.put(view, bx6);
        int id = view.getId();
        if (id >= 0) {
            if (cx6.f10400b.indexOfKey(id) >= 0) {
                cx6.f10400b.put(id, (Object) null);
            } else {
                cx6.f10400b.put(id, view);
            }
        }
        String K = ga7.m17733K(view);
        if (K != null) {
            if (cx6.f10402d.containsKey(K)) {
                cx6.f10402d.put(K, null);
            } else {
                cx6.f10402d.put(K, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (cx6.f10401c.mo21211j(itemIdAtPosition) >= 0) {
                    View h = cx6.f10401c.mo21209h(itemIdAtPosition);
                    if (h != null) {
                        ga7.m17805z0(h, false);
                        cx6.f10401c.mo21214o(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ga7.m17805z0(view, true);
                cx6.f10401c.mo21214o(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: g */
    public static boolean m10083g(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public TimeInterpolator mo10492B() {
        return this.f7192g;
    }

    /* renamed from: C */
    public bx6 mo10493C(View view, boolean z) {
        ArrayList<bx6> arrayList;
        ArrayList<bx6> arrayList2;
        TransitionSet transitionSet = this.f7181Q;
        if (transitionSet != null) {
            return transitionSet.mo10493C(view, z);
        }
        if (z) {
            arrayList = this.f7183X;
        } else {
            arrayList = this.f7184Y;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            bx6 bx6 = arrayList.get(i2);
            if (bx6 == null) {
                return null;
            }
            if (bx6.f8292b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.f7184Y;
        } else {
            arrayList2 = this.f7183X;
        }
        return arrayList2.get(i);
    }

    /* renamed from: D */
    public String mo10494D() {
        return this.f7186a;
    }

    /* renamed from: E */
    public PathMotion mo10495E() {
        return this.f7202t1;
    }

    /* renamed from: F */
    public zw6 mo10496F() {
        return this.f7197q1;
    }

    /* renamed from: H */
    public long mo10497H() {
        return this.f7188d;
    }

    /* renamed from: I */
    public List<Integer> mo10498I() {
        return this.f7193k;
    }

    /* renamed from: J */
    public List<String> mo10499J() {
        return this.f7200s;
    }

    /* renamed from: K */
    public List<Class<?>> mo10500K() {
        return this.f7204x;
    }

    /* renamed from: L */
    public List<View> mo10501L() {
        return this.f7198r;
    }

    /* renamed from: M */
    public String[] mo10404M() {
        return null;
    }

    /* renamed from: N */
    public bx6 mo10502N(View view, boolean z) {
        cx6 cx6;
        TransitionSet transitionSet = this.f7181Q;
        if (transitionSet != null) {
            return transitionSet.mo10502N(view, z);
        }
        if (z) {
            cx6 = this.f7179M;
        } else {
            cx6 = this.f7180P;
        }
        return cx6.f10399a.get(view);
    }

    /* renamed from: O */
    public boolean mo10503O(bx6 bx6, bx6 bx62) {
        if (bx6 == null || bx62 == null) {
            return false;
        }
        String[] M = mo10404M();
        if (M != null) {
            int length = M.length;
            int i = 0;
            while (i < length) {
                if (!m10080S(bx6, bx62, M[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String S : bx6.f8291a.keySet()) {
            if (m10080S(bx6, bx62, S)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: R */
    public boolean mo10504R(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f7205y;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f7173A;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f7174B;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f7174B.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f7175C != null && ga7.m17733K(view) != null && this.f7175C.contains(ga7.m17733K(view))) {
            return false;
        }
        if ((this.f7193k.size() == 0 && this.f7198r.size() == 0 && (((arrayList = this.f7204x) == null || arrayList.isEmpty()) && ((arrayList2 = this.f7200s) == null || arrayList2.isEmpty()))) || this.f7193k.contains(Integer.valueOf(id)) || this.f7198r.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f7200s;
        if (arrayList6 != null && arrayList6.contains(ga7.m17733K(view))) {
            return true;
        }
        if (this.f7204x != null) {
            for (int i2 = 0; i2 < this.f7204x.size(); i2++) {
                if (this.f7204x.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: T */
    public final void mo10505T(C2781lq<View, bx6> lqVar, C2781lq<View, bx6> lqVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo10504R(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo10504R(view)) {
                bx6 bx6 = lqVar.get(valueAt);
                bx6 bx62 = lqVar2.get(view);
                if (!(bx6 == null || bx62 == null)) {
                    this.f7183X.add(bx6);
                    this.f7184Y.add(bx62);
                    lqVar.remove(valueAt);
                    lqVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: U */
    public final void mo10506U(C2781lq<View, bx6> lqVar, C2781lq<View, bx6> lqVar2) {
        bx6 remove;
        for (int size = lqVar.size() - 1; size >= 0; size--) {
            View i = lqVar.mo27919i(size);
            if (i != null && mo10504R(i) && (remove = lqVar2.remove(i)) != null && mo10504R(remove.f8292b)) {
                this.f7183X.add(lqVar.mo22211k(size));
                this.f7184Y.add(remove);
            }
        }
    }

    /* renamed from: V */
    public final void mo10507V(C2781lq<View, bx6> lqVar, C2781lq<View, bx6> lqVar2, hl3<View> hl3, hl3<View> hl32) {
        View h;
        int u = hl3.mo21219u();
        for (int i = 0; i < u; i++) {
            View v = hl3.mo21220v(i);
            if (v != null && mo10504R(v) && (h = hl32.mo21209h(hl3.mo21213m(i))) != null && mo10504R(h)) {
                bx6 bx6 = lqVar.get(v);
                bx6 bx62 = lqVar2.get(h);
                if (!(bx6 == null || bx62 == null)) {
                    this.f7183X.add(bx6);
                    this.f7184Y.add(bx62);
                    lqVar.remove(v);
                    lqVar2.remove(h);
                }
            }
        }
    }

    /* renamed from: Y */
    public final void mo10508Y(C2781lq<View, bx6> lqVar, C2781lq<View, bx6> lqVar2, C2781lq<String, View> lqVar3, C2781lq<String, View> lqVar4) {
        View view;
        int size = lqVar3.size();
        for (int i = 0; i < size; i++) {
            View m = lqVar3.mo27921m(i);
            if (m != null && mo10504R(m) && (view = lqVar4.get(lqVar3.mo27919i(i))) != null && mo10504R(view)) {
                bx6 bx6 = lqVar.get(m);
                bx6 bx62 = lqVar2.get(view);
                if (!(bx6 == null || bx62 == null)) {
                    this.f7183X.add(bx6);
                    this.f7184Y.add(bx62);
                    lqVar.remove(m);
                    lqVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: Z */
    public final void mo10509Z(cx6 cx6, cx6 cx62) {
        C2781lq lqVar = new C2781lq((y16) cx6.f10399a);
        C2781lq lqVar2 = new C2781lq((y16) cx62.f10399a);
        int i = 0;
        while (true) {
            int[] iArr = this.f7182U;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    mo10506U(lqVar, lqVar2);
                } else if (i2 == 2) {
                    mo10508Y(lqVar, lqVar2, cx6.f10402d, cx62.f10402d);
                } else if (i2 == 3) {
                    mo10505T(lqVar, lqVar2, cx6.f10400b, cx62.f10400b);
                } else if (i2 == 4) {
                    mo10507V(lqVar, lqVar2, cx6.f10401c, cx62.f10401c);
                }
                i++;
            } else {
                mo10515d(lqVar, lqVar2);
                return;
            }
        }
    }

    /* renamed from: a */
    public Transition mo10510a(C1446f fVar) {
        if (this.f7195o1 == null) {
            this.f7195o1 = new ArrayList<>();
        }
        this.f7195o1.add(fVar);
        return this;
    }

    /* renamed from: b */
    public Transition mo10511b(View view) {
        this.f7198r.add(view);
        return this;
    }

    /* renamed from: c0 */
    public void mo10512c0(View view) {
        if (!this.f7191e1) {
            C2781lq<Animator, C1444d> G = m10078G();
            int size = G.size();
            el7 d = qe7.m25628d(view);
            for (int i = size - 1; i >= 0; i--) {
                C1444d m = G.mo27921m(i);
                if (m.f7209a != null && d.equals(m.f7212d)) {
                    C2688kl.m20817b(G.mo27919i(i));
                }
            }
            ArrayList<C1446f> arrayList = this.f7195o1;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7195o1.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C1446f) arrayList2.get(i2)).onTransitionPause(this);
                }
            }
            this.f7187b1 = true;
        }
    }

    public void cancel() {
        for (int size = this.f7194k0.size() - 1; size >= 0; size--) {
            this.f7194k0.get(size).cancel();
        }
        ArrayList<C1446f> arrayList = this.f7195o1;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f7195o1.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C1446f) arrayList2.get(i)).onTransitionCancel(this);
            }
        }
    }

    /* renamed from: d */
    public final void mo10515d(C2781lq<View, bx6> lqVar, C2781lq<View, bx6> lqVar2) {
        for (int i = 0; i < lqVar.size(); i++) {
            bx6 m = lqVar.mo27921m(i);
            if (mo10504R(m.f8292b)) {
                this.f7183X.add(m);
                this.f7184Y.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < lqVar2.size(); i2++) {
            bx6 m2 = lqVar2.mo27921m(i2);
            if (mo10504R(m2.f8292b)) {
                this.f7184Y.add(m2);
                this.f7183X.add((Object) null);
            }
        }
    }

    /* renamed from: d0 */
    public void mo10516d0(ViewGroup viewGroup) {
        C1444d dVar;
        boolean z;
        this.f7183X = new ArrayList<>();
        this.f7184Y = new ArrayList<>();
        mo10509Z(this.f7179M, this.f7180P);
        C2781lq<Animator, C1444d> G = m10078G();
        int size = G.size();
        el7 d = qe7.m25628d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator i2 = G.mo27919i(i);
            if (!(i2 == null || (dVar = G.get(i2)) == null || dVar.f7209a == null || !d.equals(dVar.f7212d))) {
                bx6 bx6 = dVar.f7211c;
                View view = dVar.f7209a;
                bx6 N = mo10502N(view, true);
                bx6 C = mo10493C(view, true);
                if (N == null && C == null) {
                    C = this.f7180P.f10399a.get(view);
                }
                if (!(N == null && C == null) && dVar.f7213e.mo10503O(bx6, C)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (i2.isRunning() || i2.isStarted()) {
                        i2.cancel();
                    } else {
                        G.remove(i2);
                    }
                }
            }
        }
        mo10540u(viewGroup, this.f7179M, this.f7180P, this.f7183X, this.f7184Y);
        mo10522i0();
    }

    /* renamed from: e0 */
    public Transition mo10517e0(C1446f fVar) {
        ArrayList<C1446f> arrayList = this.f7195o1;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f7195o1.size() == 0) {
            this.f7195o1 = null;
        }
        return this;
    }

    /* renamed from: f0 */
    public Transition mo10518f0(View view) {
        this.f7198r.remove(view);
        return this;
    }

    /* renamed from: g0 */
    public void mo10519g0(View view) {
        if (this.f7187b1) {
            if (!this.f7191e1) {
                C2781lq<Animator, C1444d> G = m10078G();
                int size = G.size();
                el7 d = qe7.m25628d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1444d m = G.mo27921m(i);
                    if (m.f7209a != null && d.equals(m.f7212d)) {
                        C2688kl.m20818c(G.mo27919i(i));
                    }
                }
                ArrayList<C1446f> arrayList = this.f7195o1;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f7195o1.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1446f) arrayList2.get(i2)).onTransitionResume(this);
                    }
                }
            }
            this.f7187b1 = false;
        }
    }

    /* renamed from: h */
    public void mo10520h(Animator animator) {
        if (animator == null) {
            mo10541v();
            return;
        }
        if (mo10543x() >= 0) {
            animator.setDuration(mo10543x());
        }
        if (mo10497H() >= 0) {
            animator.setStartDelay(mo10497H() + animator.getStartDelay());
        }
        if (mo10492B() != null) {
            animator.setInterpolator(mo10492B());
        }
        animator.addListener(new C1443c());
        animator.start();
    }

    /* renamed from: h0 */
    public final void mo10521h0(Animator animator, C2781lq<Animator, C1444d> lqVar) {
        if (animator != null) {
            animator.addListener(new C1442b(lqVar));
            mo10520h(animator);
        }
    }

    /* renamed from: i */
    public abstract void mo10405i(bx6 bx6);

    /* renamed from: i0 */
    public void mo10522i0() {
        mo10537s0();
        C2781lq<Animator, C1444d> G = m10078G();
        Iterator<Animator> it = this.f7196p1.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (G.containsKey(next)) {
                mo10537s0();
                mo10521h0(next, G);
            }
        }
        this.f7196p1.clear();
        mo10541v();
    }

    /* renamed from: j */
    public final void mo10523j(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f7205y;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f7173A;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f7174B;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f7174B.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        bx6 bx6 = new bx6(view);
                        if (z) {
                            mo10406m(bx6);
                        } else {
                            mo10405i(bx6);
                        }
                        bx6.f8293c.add(this);
                        mo10526l(bx6);
                        if (z) {
                            m10082f(this.f7179M, view, bx6);
                        } else {
                            m10082f(this.f7180P, view, bx6);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f7176H;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f7177I;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f7178L;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f7178L.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    mo10523j(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: j0 */
    public void mo10524j0(boolean z) {
        this.f7190e0 = z;
    }

    /* renamed from: k0 */
    public Transition mo10525k0(long j) {
        this.f7189e = j;
        return this;
    }

    /* renamed from: l */
    public void mo10526l(bx6 bx6) {
        String[] b;
        if (this.f7197q1 != null && !bx6.f8291a.isEmpty() && (b = this.f7197q1.mo22757b()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= b.length) {
                    z = true;
                    break;
                } else if (!bx6.f8291a.containsKey(b[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f7197q1.mo22756a(bx6);
            }
        }
    }

    /* renamed from: l0 */
    public void mo10527l0(C1445e eVar) {
        this.f7199r1 = eVar;
    }

    /* renamed from: m */
    public abstract void mo10406m(bx6 bx6);

    /* renamed from: m0 */
    public Transition mo10528m0(TimeInterpolator timeInterpolator) {
        this.f7192g = timeInterpolator;
        return this;
    }

    /* renamed from: n0 */
    public void mo10529n0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f7182U = f7170u1;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            if (!m10079P(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!m10083g(iArr, i)) {
                i++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f7182U = (int[]) iArr.clone();
    }

    /* renamed from: o */
    public void mo10530o(ViewGroup viewGroup, boolean z) {
        C2781lq<String, String> lqVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo10532p(z);
        if ((this.f7193k.size() > 0 || this.f7198r.size() > 0) && (((arrayList = this.f7200s) == null || arrayList.isEmpty()) && ((arrayList2 = this.f7204x) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f7193k.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f7193k.get(i).intValue());
                if (findViewById != null) {
                    bx6 bx6 = new bx6(findViewById);
                    if (z) {
                        mo10406m(bx6);
                    } else {
                        mo10405i(bx6);
                    }
                    bx6.f8293c.add(this);
                    mo10526l(bx6);
                    if (z) {
                        m10082f(this.f7179M, findViewById, bx6);
                    } else {
                        m10082f(this.f7180P, findViewById, bx6);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f7198r.size(); i2++) {
                View view = this.f7198r.get(i2);
                bx6 bx62 = new bx6(view);
                if (z) {
                    mo10406m(bx62);
                } else {
                    mo10405i(bx62);
                }
                bx62.f8293c.add(this);
                mo10526l(bx62);
                if (z) {
                    m10082f(this.f7179M, view, bx62);
                } else {
                    m10082f(this.f7180P, view, bx62);
                }
            }
        } else {
            mo10523j(viewGroup, z);
        }
        if (!z && (lqVar = this.f7201s1) != null) {
            int size = lqVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f7179M.f10402d.remove(this.f7201s1.mo27919i(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f7179M.f10402d.put(this.f7201s1.mo27921m(i4), view2);
                }
            }
        }
    }

    /* renamed from: o0 */
    public void mo10531o0(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f7202t1 = f7171v1;
        } else {
            this.f7202t1 = pathMotion;
        }
    }

    /* renamed from: p */
    public void mo10532p(boolean z) {
        if (z) {
            this.f7179M.f10399a.clear();
            this.f7179M.f10400b.clear();
            this.f7179M.f10401c.mo21204b();
            return;
        }
        this.f7180P.f10399a.clear();
        this.f7180P.f10400b.clear();
        this.f7180P.f10401c.mo21204b();
    }

    /* renamed from: p0 */
    public void mo10533p0(zw6 zw6) {
        this.f7197q1 = zw6;
    }

    /* renamed from: q0 */
    public Transition mo10534q0(ViewGroup viewGroup) {
        this.f7185Z = viewGroup;
        return this;
    }

    /* renamed from: r */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f7196p1 = new ArrayList<>();
            transition.f7179M = new cx6();
            transition.f7180P = new cx6();
            transition.f7183X = null;
            transition.f7184Y = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: r0 */
    public Transition mo10536r0(long j) {
        this.f7188d = j;
        return this;
    }

    /* renamed from: s0 */
    public void mo10537s0() {
        if (this.f7203v0 == 0) {
            ArrayList<C1446f> arrayList = this.f7195o1;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7195o1.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C1446f) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.f7191e1 = false;
        }
        this.f7203v0++;
    }

    /* renamed from: t */
    public Animator mo10407t(ViewGroup viewGroup, bx6 bx6, bx6 bx62) {
        return null;
    }

    /* renamed from: t0 */
    public String mo10538t0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f7189e != -1) {
            str2 = str2 + "dur(" + this.f7189e + ") ";
        }
        if (this.f7188d != -1) {
            str2 = str2 + "dly(" + this.f7188d + ") ";
        }
        if (this.f7192g != null) {
            str2 = str2 + "interp(" + this.f7192g + ") ";
        }
        if (this.f7193k.size() <= 0 && this.f7198r.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f7193k.size() > 0) {
            for (int i = 0; i < this.f7193k.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f7193k.get(i);
            }
        }
        if (this.f7198r.size() > 0) {
            for (int i2 = 0; i2 < this.f7198r.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f7198r.get(i2);
            }
        }
        return str3 + ")";
    }

    public String toString() {
        return mo10538t0("");
    }

    /* renamed from: u */
    public void mo10540u(ViewGroup viewGroup, cx6 cx6, cx6 cx62, ArrayList<bx6> arrayList, ArrayList<bx6> arrayList2) {
        int i;
        boolean z;
        Animator t;
        View view;
        Animator animator;
        bx6 bx6;
        bx6 bx62;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C2781lq<Animator, C1444d> G = m10078G();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            bx6 bx63 = arrayList.get(i2);
            bx6 bx64 = arrayList2.get(i2);
            if (bx63 != null && !bx63.f8293c.contains(this)) {
                bx63 = null;
            }
            if (bx64 != null && !bx64.f8293c.contains(this)) {
                bx64 = null;
            }
            if (!(bx63 == null && bx64 == null)) {
                if (bx63 == null || bx64 == null || mo10503O(bx63, bx64)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (t = mo10407t(viewGroup2, bx63, bx64)) != null) {
                    if (bx64 != null) {
                        view = bx64.f8292b;
                        String[] M = mo10404M();
                        if (M != null && M.length > 0) {
                            bx62 = new bx6(view);
                            Animator animator3 = t;
                            i = size;
                            bx6 bx65 = cx62.f10399a.get(view);
                            if (bx65 != null) {
                                int i3 = 0;
                                while (i3 < M.length) {
                                    Map<String, Object> map = bx62.f8291a;
                                    String str = M[i3];
                                    map.put(str, bx65.f8291a.get(str));
                                    i3++;
                                    ArrayList<bx6> arrayList3 = arrayList2;
                                    M = M;
                                }
                            }
                            int size2 = G.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C1444d dVar = G.get(G.mo27919i(i4));
                                if (dVar.f7211c != null && dVar.f7209a == view && dVar.f7210b.equals(mo10494D()) && dVar.f7211c.equals(bx62)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            i = size;
                            animator2 = t;
                            bx62 = null;
                        }
                        animator = animator2;
                        bx6 = bx62;
                    } else {
                        i = size;
                        view = bx63.f8292b;
                        animator = t;
                        bx6 = null;
                    }
                    if (animator != null) {
                        zw6 zw6 = this.f7197q1;
                        if (zw6 != null) {
                            long c = zw6.mo12042c(viewGroup2, this, bx63, bx64);
                            sparseIntArray.put(this.f7196p1.size(), (int) c);
                            j = Math.min(c, j);
                        }
                        G.put(animator, new C1444d(view, mo10494D(), this, qe7.m25628d(viewGroup), bx6));
                        this.f7196p1.add(animator);
                        j = j;
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator4 = this.f7196p1.get(sparseIntArray.keyAt(i5));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i5)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* renamed from: v */
    public void mo10541v() {
        int i = this.f7203v0 - 1;
        this.f7203v0 = i;
        if (i == 0) {
            ArrayList<C1446f> arrayList = this.f7195o1;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7195o1.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C1446f) arrayList2.get(i2)).onTransitionEnd(this);
                }
            }
            for (int i3 = 0; i3 < this.f7179M.f10401c.mo21219u(); i3++) {
                View v = this.f7179M.f10401c.mo21220v(i3);
                if (v != null) {
                    ga7.m17805z0(v, false);
                }
            }
            for (int i4 = 0; i4 < this.f7180P.f10401c.mo21219u(); i4++) {
                View v2 = this.f7180P.f10401c.mo21220v(i4);
                if (v2 != null) {
                    ga7.m17805z0(v2, false);
                }
            }
            this.f7191e1 = true;
        }
    }

    /* renamed from: w */
    public void mo10542w(ViewGroup viewGroup) {
        C2781lq<Animator, C1444d> G = m10078G();
        int size = G.size();
        if (viewGroup != null && size != 0) {
            el7 d = qe7.m25628d(viewGroup);
            C2781lq lqVar = new C2781lq((y16) G);
            G.clear();
            for (int i = size - 1; i >= 0; i--) {
                C1444d dVar = (C1444d) lqVar.mo27921m(i);
                if (!(dVar.f7209a == null || d == null || !d.equals(dVar.f7212d))) {
                    ((Animator) lqVar.mo27919i(i)).end();
                }
            }
        }
    }

    /* renamed from: x */
    public long mo10543x() {
        return this.f7189e;
    }

    /* renamed from: y */
    public Rect mo10544y() {
        C1445e eVar = this.f7199r1;
        if (eVar == null) {
            return null;
        }
        return eVar.mo10549a(this);
    }

    /* renamed from: z */
    public C1445e mo10545z() {
        return this.f7199r1;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fc6.f11766c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long g = (long) e27.m15648g(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (g >= 0) {
            mo10525k0(g);
        }
        long g2 = (long) e27.m15648g(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (g2 > 0) {
            mo10536r0(g2);
        }
        int h = e27.m15649h(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (h > 0) {
            mo10528m0(AnimationUtils.loadInterpolator(context, h));
        }
        String i = e27.m15650i(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (i != null) {
            mo10529n0(m10081a0(i));
        }
        obtainStyledAttributes.recycle();
    }
}
