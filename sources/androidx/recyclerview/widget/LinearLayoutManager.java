package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C1314k;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.LayoutManager implements C1314k.C1326i, RecyclerView.C1257w.C1259b {

    /* renamed from: U */
    public int f6322U;

    /* renamed from: X */
    public C1225c f6323X;

    /* renamed from: Y */
    public C1334q f6324Y;

    /* renamed from: Z */
    public boolean f6325Z;

    /* renamed from: b1 */
    public boolean f6326b1;

    /* renamed from: e0 */
    public boolean f6327e0;

    /* renamed from: e1 */
    public int f6328e1;

    /* renamed from: k0 */
    public boolean f6329k0;

    /* renamed from: o1 */
    public int f6330o1;

    /* renamed from: p1 */
    public boolean f6331p1;

    /* renamed from: q1 */
    public SavedState f6332q1;

    /* renamed from: r1 */
    public final C1223a f6333r1;

    /* renamed from: s1 */
    public final C1224b f6334s1;

    /* renamed from: t1 */
    public int f6335t1;

    /* renamed from: u1 */
    public int[] f6336u1;

    /* renamed from: v0 */
    public boolean f6337v0;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1222a();

        /* renamed from: a */
        public int f6338a;

        /* renamed from: d */
        public int f6339d;

        /* renamed from: e */
        public boolean f6340e;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        public class C1222a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* renamed from: a */
        public boolean mo8937a() {
            if (this.f6338a >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public void mo8938b() {
            this.f6338a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6338a);
            parcel.writeInt(this.f6339d);
            parcel.writeInt(this.f6340e ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f6338a = parcel.readInt();
            this.f6339d = parcel.readInt();
            this.f6340e = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f6338a = savedState.f6338a;
            this.f6339d = savedState.f6339d;
            this.f6340e = savedState.f6340e;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C1223a {

        /* renamed from: a */
        public C1334q f6341a;

        /* renamed from: b */
        public int f6342b;

        /* renamed from: c */
        public int f6343c;

        /* renamed from: d */
        public boolean f6344d;

        /* renamed from: e */
        public boolean f6345e;

        public C1223a() {
            mo8949e();
        }

        /* renamed from: a */
        public void mo8945a() {
            int i;
            if (this.f6344d) {
                i = this.f6341a.mo9936i();
            } else {
                i = this.f6341a.mo9940m();
            }
            this.f6343c = i;
        }

        /* renamed from: b */
        public void mo8946b(View view, int i) {
            if (this.f6344d) {
                this.f6343c = this.f6341a.mo9931d(view) + this.f6341a.mo9942o();
            } else {
                this.f6343c = this.f6341a.mo9934g(view);
            }
            this.f6342b = i;
        }

        /* renamed from: c */
        public void mo8947c(View view, int i) {
            int o = this.f6341a.mo9942o();
            if (o >= 0) {
                mo8946b(view, i);
                return;
            }
            this.f6342b = i;
            if (this.f6344d) {
                int i2 = (this.f6341a.mo9936i() - o) - this.f6341a.mo9931d(view);
                this.f6343c = this.f6341a.mo9936i() - i2;
                if (i2 > 0) {
                    int e = this.f6343c - this.f6341a.mo9932e(view);
                    int m = this.f6341a.mo9940m();
                    int min = e - (m + Math.min(this.f6341a.mo9934g(view) - m, 0));
                    if (min < 0) {
                        this.f6343c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f6341a.mo9934g(view);
            int m2 = g - this.f6341a.mo9940m();
            this.f6343c = g;
            if (m2 > 0) {
                int i3 = (this.f6341a.mo9936i() - Math.min(0, (this.f6341a.mo9936i() - o) - this.f6341a.mo9931d(view))) - (g + this.f6341a.mo9932e(view));
                if (i3 < 0) {
                    this.f6343c -= Math.min(m2, -i3);
                }
            }
        }

        /* renamed from: d */
        public boolean mo8948d(View view, RecyclerView.C1260x xVar) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.mo9305c() || layoutParams.mo9303a() < 0 || layoutParams.mo9303a() >= xVar.mo9525b()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public void mo8949e() {
            this.f6342b = -1;
            this.f6343c = Integer.MIN_VALUE;
            this.f6344d = false;
            this.f6345e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f6342b + ", mCoordinate=" + this.f6343c + ", mLayoutFromEnd=" + this.f6344d + ", mValid=" + this.f6345e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C1224b {

        /* renamed from: a */
        public int f6346a;

        /* renamed from: b */
        public boolean f6347b;

        /* renamed from: c */
        public boolean f6348c;

        /* renamed from: d */
        public boolean f6349d;

        /* renamed from: a */
        public void mo8951a() {
            this.f6346a = 0;
            this.f6347b = false;
            this.f6348c = false;
            this.f6349d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C1225c {

        /* renamed from: a */
        public boolean f6350a = true;

        /* renamed from: b */
        public int f6351b;

        /* renamed from: c */
        public int f6352c;

        /* renamed from: d */
        public int f6353d;

        /* renamed from: e */
        public int f6354e;

        /* renamed from: f */
        public int f6355f;

        /* renamed from: g */
        public int f6356g;

        /* renamed from: h */
        public int f6357h = 0;

        /* renamed from: i */
        public int f6358i = 0;

        /* renamed from: j */
        public boolean f6359j = false;

        /* renamed from: k */
        public int f6360k;

        /* renamed from: l */
        public List<RecyclerView.C1231a0> f6361l = null;

        /* renamed from: m */
        public boolean f6362m;

        /* renamed from: a */
        public void mo8952a() {
            mo8953b((View) null);
        }

        /* renamed from: b */
        public void mo8953b(View view) {
            View f = mo8957f(view);
            if (f == null) {
                this.f6353d = -1;
            } else {
                this.f6353d = ((RecyclerView.LayoutParams) f.getLayoutParams()).mo9303a();
            }
        }

        /* renamed from: c */
        public boolean mo8954c(RecyclerView.C1260x xVar) {
            int i = this.f6353d;
            if (i < 0 || i >= xVar.mo9525b()) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public View mo8955d(RecyclerView.C1254t tVar) {
            if (this.f6361l != null) {
                return mo8956e();
            }
            View o = tVar.mo9486o(this.f6353d);
            this.f6353d += this.f6354e;
            return o;
        }

        /* renamed from: e */
        public final View mo8956e() {
            int size = this.f6361l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f6361l.get(i).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.mo9305c() && this.f6353d == layoutParams.mo9303a()) {
                    mo8953b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: f */
        public View mo8957f(View view) {
            int a;
            int size = this.f6361l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f6361l.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.mo9305c() && (a = (layoutParams.mo9303a() - this.f6353d) * this.f6354e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: A */
    public void mo8873A(int i, RecyclerView.LayoutManager.C1228c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.f6332q1;
        int i3 = -1;
        if (savedState == null || !savedState.mo8937a()) {
            mo8882G2();
            z = this.f6329k0;
            i2 = this.f6328e1;
            if (i2 == -1) {
                if (z) {
                    i2 = i - 1;
                } else {
                    i2 = 0;
                }
            }
        } else {
            SavedState savedState2 = this.f6332q1;
            z = savedState2.f6340e;
            i2 = savedState2.f6338a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f6335t1 && i2 >= 0 && i2 < i; i4++) {
            cVar.mo9302a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: A2 */
    public void mo8818A2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, C1223a aVar, int i) {
    }

    /* renamed from: B */
    public int mo8874B(RecyclerView.C1260x xVar) {
        return mo8901X1(xVar);
    }

    /* renamed from: B2 */
    public final void mo8875B2(RecyclerView.C1254t tVar, C1225c cVar) {
        if (cVar.f6350a && !cVar.f6362m) {
            int i = cVar.f6356g;
            int i2 = cVar.f6358i;
            if (cVar.f6355f == -1) {
                mo8877D2(tVar, i, i2);
            } else {
                mo8879E2(tVar, i, i2);
            }
        }
    }

    /* renamed from: C */
    public int mo8819C(RecyclerView.C1260x xVar) {
        return mo8902Y1(xVar);
    }

    /* renamed from: C2 */
    public final void mo8876C2(RecyclerView.C1254t tVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo9291w1(i3, tVar);
                }
                return;
            }
            while (i > i2) {
                mo9291w1(i, tVar);
                i--;
            }
        }
    }

    /* renamed from: D */
    public int mo8820D(RecyclerView.C1260x xVar) {
        return mo8903Z1(xVar);
    }

    /* renamed from: D2 */
    public final void mo8877D2(RecyclerView.C1254t tVar, int i, int i2) {
        int U = mo9234U();
        if (i >= 0) {
            int h = (this.f6324Y.mo9935h() - i) + i2;
            if (this.f6329k0) {
                for (int i3 = 0; i3 < U; i3++) {
                    View T = mo9231T(i3);
                    if (this.f6324Y.mo9934g(T) < h || this.f6324Y.mo9944q(T) < h) {
                        mo8876C2(tVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = U - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View T2 = mo9231T(i5);
                if (this.f6324Y.mo9934g(T2) < h || this.f6324Y.mo9944q(T2) < h) {
                    mo8876C2(tVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: E */
    public int mo8878E(RecyclerView.C1260x xVar) {
        return mo8901X1(xVar);
    }

    /* renamed from: E2 */
    public final void mo8879E2(RecyclerView.C1254t tVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int U = mo9234U();
            if (this.f6329k0) {
                int i4 = U - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View T = mo9231T(i5);
                    if (this.f6324Y.mo9931d(T) > i3 || this.f6324Y.mo9943p(T) > i3) {
                        mo8876C2(tVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < U; i6++) {
                View T2 = mo9231T(i6);
                if (this.f6324Y.mo9931d(T2) > i3 || this.f6324Y.mo9943p(T2) > i3) {
                    mo8876C2(tVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: F */
    public int mo8821F(RecyclerView.C1260x xVar) {
        return mo8902Y1(xVar);
    }

    /* renamed from: F1 */
    public int mo8822F1(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        if (this.f6322U == 1) {
            return 0;
        }
        return mo8883H2(i, tVar, xVar);
    }

    /* renamed from: F2 */
    public boolean mo8880F2() {
        if (this.f6324Y.mo9938k() == 0 && this.f6324Y.mo9935h() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public int mo8823G(RecyclerView.C1260x xVar) {
        return mo8903Z1(xVar);
    }

    /* renamed from: G1 */
    public void mo8881G1(int i) {
        this.f6328e1 = i;
        this.f6330o1 = Integer.MIN_VALUE;
        SavedState savedState = this.f6332q1;
        if (savedState != null) {
            savedState.mo8938b();
        }
        mo9200C1();
    }

    /* renamed from: G2 */
    public final void mo8882G2() {
        if (this.f6322U == 1 || !mo8932w2()) {
            this.f6329k0 = this.f6327e0;
        } else {
            this.f6329k0 = !this.f6327e0;
        }
    }

    /* renamed from: H1 */
    public int mo8824H1(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        if (this.f6322U == 0) {
            return 0;
        }
        return mo8883H2(i, tVar, xVar);
    }

    /* renamed from: H2 */
    public int mo8883H2(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        int i2;
        if (mo9234U() == 0 || i == 0) {
            return 0;
        }
        mo8907c2();
        this.f6323X.f6350a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        mo8892P2(i2, abs, true, xVar);
        C1225c cVar = this.f6323X;
        int d2 = cVar.f6356g + mo8909d2(tVar, cVar, xVar, false);
        if (d2 < 0) {
            return 0;
        }
        if (abs > d2) {
            i = i2 * d2;
        }
        this.f6324Y.mo9945r(-i);
        this.f6323X.f6360k = i;
        return i;
    }

    /* renamed from: I2 */
    public void mo8884I2(int i, int i2) {
        this.f6328e1 = i;
        this.f6330o1 = i2;
        SavedState savedState = this.f6332q1;
        if (savedState != null) {
            savedState.mo8938b();
        }
        mo9200C1();
    }

    /* renamed from: J2 */
    public void mo8885J2(int i) {
        if (i == 0 || i == 1) {
            mo8924r((String) null);
            if (i != this.f6322U || this.f6324Y == null) {
                C1334q b = C1334q.m9643b(this, i);
                this.f6324Y = b;
                this.f6333r1.f6341a = b;
                this.f6322U = i;
                mo9200C1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: K2 */
    public void mo8886K2(boolean z) {
        mo8924r((String) null);
        if (z != this.f6327e0) {
            this.f6327e0 = z;
            mo9200C1();
        }
    }

    /* renamed from: L2 */
    public void mo8826L2(boolean z) {
        mo8924r((String) null);
        if (this.f6337v0 != z) {
            this.f6337v0 = z;
            mo9200C1();
        }
    }

    /* renamed from: M2 */
    public final boolean mo8887M2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, C1223a aVar) {
        View p2;
        boolean z;
        boolean z2 = false;
        if (mo9234U() == 0) {
            return false;
        }
        View g0 = mo9249g0();
        if (g0 == null || !aVar.mo8948d(g0, xVar)) {
            boolean z3 = this.f6325Z;
            boolean z4 = this.f6337v0;
            if (z3 != z4 || (p2 = mo8860p2(tVar, xVar, aVar.f6344d, z4)) == null) {
                return false;
            }
            aVar.mo8946b(p2, mo9271o0(p2));
            if (!xVar.mo9528e() && mo8831U1()) {
                int g = this.f6324Y.mo9934g(p2);
                int d = this.f6324Y.mo9931d(p2);
                int m = this.f6324Y.mo9940m();
                int i = this.f6324Y.mo9936i();
                if (d > m || g >= m) {
                    z = false;
                } else {
                    z = true;
                }
                if (g >= i && d > i) {
                    z2 = true;
                }
                if (z || z2) {
                    if (aVar.f6344d) {
                        m = i;
                    }
                    aVar.f6343c = m;
                }
            }
            return true;
        }
        aVar.mo8947c(g0, mo9271o0(g0));
        return true;
    }

    /* renamed from: N */
    public View mo8888N(int i) {
        int U = mo9234U();
        if (U == 0) {
            return null;
        }
        int o0 = i - mo9271o0(mo9231T(0));
        if (o0 >= 0 && o0 < U) {
            View T = mo9231T(o0);
            if (mo9271o0(T) == i) {
                return T;
            }
        }
        return super.mo8888N(i);
    }

    /* renamed from: N2 */
    public final boolean mo8889N2(RecyclerView.C1260x xVar, C1223a aVar) {
        int i;
        boolean z;
        int i2;
        boolean z2 = false;
        if (!xVar.mo9528e() && (i = this.f6328e1) != -1) {
            if (i < 0 || i >= xVar.mo9525b()) {
                this.f6328e1 = -1;
                this.f6330o1 = Integer.MIN_VALUE;
            } else {
                aVar.f6342b = this.f6328e1;
                SavedState savedState = this.f6332q1;
                if (savedState != null && savedState.mo8937a()) {
                    boolean z3 = this.f6332q1.f6340e;
                    aVar.f6344d = z3;
                    if (z3) {
                        aVar.f6343c = this.f6324Y.mo9936i() - this.f6332q1.f6339d;
                    } else {
                        aVar.f6343c = this.f6324Y.mo9940m() + this.f6332q1.f6339d;
                    }
                    return true;
                } else if (this.f6330o1 == Integer.MIN_VALUE) {
                    View N = mo8888N(this.f6328e1);
                    if (N == null) {
                        if (mo9234U() > 0) {
                            if (this.f6328e1 < mo9271o0(mo9231T(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.f6329k0) {
                                z2 = true;
                            }
                            aVar.f6344d = z2;
                        }
                        aVar.mo8945a();
                    } else if (this.f6324Y.mo9932e(N) > this.f6324Y.mo9941n()) {
                        aVar.mo8945a();
                        return true;
                    } else if (this.f6324Y.mo9934g(N) - this.f6324Y.mo9940m() < 0) {
                        aVar.f6343c = this.f6324Y.mo9940m();
                        aVar.f6344d = false;
                        return true;
                    } else if (this.f6324Y.mo9936i() - this.f6324Y.mo9931d(N) < 0) {
                        aVar.f6343c = this.f6324Y.mo9936i();
                        aVar.f6344d = true;
                        return true;
                    } else {
                        if (aVar.f6344d) {
                            i2 = this.f6324Y.mo9931d(N) + this.f6324Y.mo9942o();
                        } else {
                            i2 = this.f6324Y.mo9934g(N);
                        }
                        aVar.f6343c = i2;
                    }
                    return true;
                } else {
                    boolean z4 = this.f6329k0;
                    aVar.f6344d = z4;
                    if (z4) {
                        aVar.f6343c = this.f6324Y.mo9936i() - this.f6330o1;
                    } else {
                        aVar.f6343c = this.f6324Y.mo9940m() + this.f6330o1;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: O */
    public RecyclerView.LayoutParams mo8827O() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* renamed from: O2 */
    public final void mo8890O2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, C1223a aVar) {
        int i;
        if (!mo8889N2(xVar, aVar) && !mo8887M2(tVar, xVar, aVar)) {
            aVar.mo8945a();
            if (this.f6337v0) {
                i = xVar.mo9525b() - 1;
            } else {
                i = 0;
            }
            aVar.f6342b = i;
        }
    }

    /* renamed from: P1 */
    public boolean mo8891P1() {
        if (mo9258i0() == 1073741824 || mo9290w0() == 1073741824 || !mo9292x0()) {
            return false;
        }
        return true;
    }

    /* renamed from: P2 */
    public final void mo8892P2(int i, int i2, boolean z, RecyclerView.C1260x xVar) {
        int i3;
        int i4;
        this.f6323X.f6362m = mo8880F2();
        this.f6323X.f6355f = i;
        int[] iArr = this.f6336u1;
        boolean z2 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        mo8900V1(xVar, iArr);
        int max = Math.max(0, this.f6336u1[0]);
        int max2 = Math.max(0, this.f6336u1[1]);
        if (i == 1) {
            z2 = true;
        }
        C1225c cVar = this.f6323X;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        cVar.f6357h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.f6358i = max;
        if (z2) {
            cVar.f6357h = i3 + this.f6324Y.mo9937j();
            View s2 = mo8926s2();
            C1225c cVar2 = this.f6323X;
            if (this.f6329k0) {
                i5 = -1;
            }
            cVar2.f6354e = i5;
            int o0 = mo9271o0(s2);
            C1225c cVar3 = this.f6323X;
            cVar2.f6353d = o0 + cVar3.f6354e;
            cVar3.f6351b = this.f6324Y.mo9931d(s2);
            i4 = this.f6324Y.mo9931d(s2) - this.f6324Y.mo9936i();
        } else {
            View t2 = mo8927t2();
            this.f6323X.f6357h += this.f6324Y.mo9940m();
            C1225c cVar4 = this.f6323X;
            if (!this.f6329k0) {
                i5 = -1;
            }
            cVar4.f6354e = i5;
            int o02 = mo9271o0(t2);
            C1225c cVar5 = this.f6323X;
            cVar4.f6353d = o02 + cVar5.f6354e;
            cVar5.f6351b = this.f6324Y.mo9934g(t2);
            i4 = (-this.f6324Y.mo9934g(t2)) + this.f6324Y.mo9940m();
        }
        C1225c cVar6 = this.f6323X;
        cVar6.f6352c = i2;
        if (z) {
            cVar6.f6352c = i2 - i4;
        }
        cVar6.f6356g = i4;
    }

    /* renamed from: Q0 */
    public void mo8893Q0(RecyclerView recyclerView, RecyclerView.C1254t tVar) {
        super.mo8893Q0(recyclerView, tVar);
        if (this.f6331p1) {
            mo9284t1(tVar);
            tVar.mo9474c();
        }
    }

    /* renamed from: Q2 */
    public final void mo8894Q2(int i, int i2) {
        int i3;
        this.f6323X.f6352c = this.f6324Y.mo9936i() - i2;
        C1225c cVar = this.f6323X;
        if (this.f6329k0) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.f6354e = i3;
        cVar.f6353d = i;
        cVar.f6355f = 1;
        cVar.f6351b = i2;
        cVar.f6356g = Integer.MIN_VALUE;
    }

    /* renamed from: R0 */
    public View mo8830R0(View view, int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        int a2;
        View view2;
        View view3;
        mo8882G2();
        if (mo9234U() == 0 || (a2 = mo8905a2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo8907c2();
        mo8892P2(a2, (int) (((float) this.f6324Y.mo9941n()) * 0.33333334f), false, xVar);
        C1225c cVar = this.f6323X;
        cVar.f6356g = Integer.MIN_VALUE;
        cVar.f6350a = false;
        mo8909d2(tVar, cVar, xVar, true);
        if (a2 == -1) {
            view2 = mo8922o2();
        } else {
            view2 = mo8921n2();
        }
        if (a2 == -1) {
            view3 = mo8927t2();
        } else {
            view3 = mo8926s2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: R1 */
    public void mo8895R1(RecyclerView recyclerView, RecyclerView.C1260x xVar, int i) {
        C1328m mVar = new C1328m(recyclerView.getContext());
        mVar.setTargetPosition(i);
        mo9230S1(mVar);
    }

    /* renamed from: R2 */
    public final void mo8896R2(C1223a aVar) {
        mo8894Q2(aVar.f6342b, aVar.f6343c);
    }

    /* renamed from: S0 */
    public void mo8897S0(AccessibilityEvent accessibilityEvent) {
        super.mo8897S0(accessibilityEvent);
        if (mo9234U() > 0) {
            accessibilityEvent.setFromIndex(mo8913h2());
            accessibilityEvent.setToIndex(mo8917k2());
        }
    }

    /* renamed from: S2 */
    public final void mo8898S2(int i, int i2) {
        int i3;
        this.f6323X.f6352c = i2 - this.f6324Y.mo9940m();
        C1225c cVar = this.f6323X;
        cVar.f6353d = i;
        if (this.f6329k0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.f6354e = i3;
        cVar.f6355f = -1;
        cVar.f6351b = i2;
        cVar.f6356g = Integer.MIN_VALUE;
    }

    /* renamed from: T2 */
    public final void mo8899T2(C1223a aVar) {
        mo8898S2(aVar.f6342b, aVar.f6343c);
    }

    /* renamed from: U1 */
    public boolean mo8831U1() {
        if (this.f6332q1 == null && this.f6325Z == this.f6337v0) {
            return true;
        }
        return false;
    }

    /* renamed from: V1 */
    public void mo8900V1(RecyclerView.C1260x xVar, int[] iArr) {
        int i;
        int u2 = mo8928u2(xVar);
        if (this.f6323X.f6355f == -1) {
            i = 0;
        } else {
            i = u2;
            u2 = 0;
        }
        iArr[0] = u2;
        iArr[1] = i;
    }

    /* renamed from: W1 */
    public void mo8834W1(RecyclerView.C1260x xVar, C1225c cVar, RecyclerView.LayoutManager.C1228c cVar2) {
        int i = cVar.f6353d;
        if (i >= 0 && i < xVar.mo9525b()) {
            cVar2.mo9302a(i, Math.max(0, cVar.f6356g));
        }
    }

    /* renamed from: X1 */
    public final int mo8901X1(RecyclerView.C1260x xVar) {
        if (mo9234U() == 0) {
            return 0;
        }
        mo8907c2();
        C1334q qVar = this.f6324Y;
        View g2 = mo8912g2(!this.f6326b1, true);
        return C1341t.m9716a(xVar, qVar, g2, mo8911f2(!this.f6326b1, true), this, this.f6326b1);
    }

    /* renamed from: Y1 */
    public final int mo8902Y1(RecyclerView.C1260x xVar) {
        if (mo9234U() == 0) {
            return 0;
        }
        mo8907c2();
        C1334q qVar = this.f6324Y;
        View g2 = mo8912g2(!this.f6326b1, true);
        return C1341t.m9717b(xVar, qVar, g2, mo8911f2(!this.f6326b1, true), this, this.f6326b1, this.f6329k0);
    }

    /* renamed from: Z1 */
    public final int mo8903Z1(RecyclerView.C1260x xVar) {
        if (mo9234U() == 0) {
            return 0;
        }
        mo8907c2();
        C1334q qVar = this.f6324Y;
        View g2 = mo8912g2(!this.f6326b1, true);
        return C1341t.m9718c(xVar, qVar, g2, mo8911f2(!this.f6326b1, true), this, this.f6326b1);
    }

    /* renamed from: a */
    public PointF mo8904a(int i) {
        if (mo9234U() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo9271o0(mo9231T(0))) {
            z = true;
        }
        if (z != this.f6329k0) {
            i2 = -1;
        }
        if (this.f6322U == 0) {
            return new PointF((float) i2, Utils.FLOAT_EPSILON);
        }
        return new PointF(Utils.FLOAT_EPSILON, (float) i2);
    }

    /* renamed from: a2 */
    public int mo8905a2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f6322U == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f6322U == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f6322U == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f6322U == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f6322U != 1 && mo8932w2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f6322U != 1 && mo8932w2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: b2 */
    public C1225c mo8906b2() {
        return new C1225c();
    }

    /* renamed from: c2 */
    public void mo8907c2() {
        if (this.f6323X == null) {
            this.f6323X = mo8906b2();
        }
    }

    /* renamed from: d */
    public void mo8908d(View view, View view2, int i, int i2) {
        boolean z;
        mo8924r("Cannot drop a view during a scroll or layout calculation");
        mo8907c2();
        mo8882G2();
        int o0 = mo9271o0(view);
        int o02 = mo9271o0(view2);
        if (o0 < o02) {
            z = true;
        } else {
            z = true;
        }
        if (this.f6329k0) {
            if (z) {
                mo8884I2(o02, this.f6324Y.mo9936i() - (this.f6324Y.mo9934g(view2) + this.f6324Y.mo9932e(view)));
            } else {
                mo8884I2(o02, this.f6324Y.mo9936i() - this.f6324Y.mo9931d(view2));
            }
        } else if (z) {
            mo8884I2(o02, this.f6324Y.mo9934g(view2));
        } else {
            mo8884I2(o02, this.f6324Y.mo9931d(view2) - this.f6324Y.mo9932e(view));
        }
    }

    /* renamed from: d2 */
    public int mo8909d2(RecyclerView.C1254t tVar, C1225c cVar, RecyclerView.C1260x xVar, boolean z) {
        int i = cVar.f6352c;
        int i2 = cVar.f6356g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f6356g = i2 + i;
            }
            mo8875B2(tVar, cVar);
        }
        int i3 = cVar.f6352c + cVar.f6357h;
        C1224b bVar = this.f6334s1;
        while (true) {
            if ((!cVar.f6362m && i3 <= 0) || !cVar.mo8954c(xVar)) {
                break;
            }
            bVar.mo8951a();
            mo8863y2(tVar, xVar, cVar, bVar);
            if (!bVar.f6347b) {
                cVar.f6351b += bVar.f6346a * cVar.f6355f;
                if (!bVar.f6348c || cVar.f6361l != null || !xVar.mo9528e()) {
                    int i4 = cVar.f6352c;
                    int i5 = bVar.f6346a;
                    cVar.f6352c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f6356g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f6346a;
                    cVar.f6356g = i7;
                    int i8 = cVar.f6352c;
                    if (i8 < 0) {
                        cVar.f6356g = i7 + i8;
                    }
                    mo8875B2(tVar, cVar);
                }
                if (z && bVar.f6349d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f6352c;
    }

    /* renamed from: e2 */
    public final View mo8910e2() {
        return mo8919l2(0, mo9234U());
    }

    /* renamed from: f1 */
    public void mo8850f1(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View N;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.f6332q1 == null && this.f6328e1 == -1) && xVar.mo9525b() == 0) {
            mo9284t1(tVar);
            return;
        }
        SavedState savedState = this.f6332q1;
        if (savedState != null && savedState.mo8937a()) {
            this.f6328e1 = this.f6332q1.f6338a;
        }
        mo8907c2();
        this.f6323X.f6350a = false;
        mo8882G2();
        View g0 = mo9249g0();
        C1223a aVar = this.f6333r1;
        if (!aVar.f6345e || this.f6328e1 != -1 || this.f6332q1 != null) {
            aVar.mo8949e();
            C1223a aVar2 = this.f6333r1;
            aVar2.f6344d = this.f6329k0 ^ this.f6337v0;
            mo8890O2(tVar, xVar, aVar2);
            this.f6333r1.f6345e = true;
        } else if (g0 != null && (this.f6324Y.mo9934g(g0) >= this.f6324Y.mo9936i() || this.f6324Y.mo9931d(g0) <= this.f6324Y.mo9940m())) {
            this.f6333r1.mo8947c(g0, mo9271o0(g0));
        }
        C1225c cVar = this.f6323X;
        if (cVar.f6360k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        cVar.f6355f = i;
        int[] iArr = this.f6336u1;
        iArr[0] = 0;
        iArr[1] = 0;
        mo8900V1(xVar, iArr);
        int max = Math.max(0, this.f6336u1[0]) + this.f6324Y.mo9940m();
        int max2 = Math.max(0, this.f6336u1[1]) + this.f6324Y.mo9937j();
        if (!(!xVar.mo9528e() || (i7 = this.f6328e1) == -1 || this.f6330o1 == Integer.MIN_VALUE || (N = mo8888N(i7)) == null)) {
            if (this.f6329k0) {
                i8 = this.f6324Y.mo9936i() - this.f6324Y.mo9931d(N);
                i9 = this.f6330o1;
            } else {
                i9 = this.f6324Y.mo9934g(N) - this.f6324Y.mo9940m();
                i8 = this.f6330o1;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        C1223a aVar3 = this.f6333r1;
        if (!aVar3.f6344d ? !this.f6329k0 : this.f6329k0) {
            i10 = 1;
        }
        mo8818A2(tVar, xVar, aVar3, i10);
        mo9206H(tVar);
        this.f6323X.f6362m = mo8880F2();
        this.f6323X.f6359j = xVar.mo9528e();
        this.f6323X.f6358i = 0;
        C1223a aVar4 = this.f6333r1;
        if (aVar4.f6344d) {
            mo8899T2(aVar4);
            C1225c cVar2 = this.f6323X;
            cVar2.f6357h = max;
            mo8909d2(tVar, cVar2, xVar, false);
            C1225c cVar3 = this.f6323X;
            i3 = cVar3.f6351b;
            int i12 = cVar3.f6353d;
            int i13 = cVar3.f6352c;
            if (i13 > 0) {
                max2 += i13;
            }
            mo8896R2(this.f6333r1);
            C1225c cVar4 = this.f6323X;
            cVar4.f6357h = max2;
            cVar4.f6353d += cVar4.f6354e;
            mo8909d2(tVar, cVar4, xVar, false);
            C1225c cVar5 = this.f6323X;
            i2 = cVar5.f6351b;
            int i14 = cVar5.f6352c;
            if (i14 > 0) {
                mo8898S2(i12, i3);
                C1225c cVar6 = this.f6323X;
                cVar6.f6357h = i14;
                mo8909d2(tVar, cVar6, xVar, false);
                i3 = this.f6323X.f6351b;
            }
        } else {
            mo8896R2(aVar4);
            C1225c cVar7 = this.f6323X;
            cVar7.f6357h = max2;
            mo8909d2(tVar, cVar7, xVar, false);
            C1225c cVar8 = this.f6323X;
            i2 = cVar8.f6351b;
            int i15 = cVar8.f6353d;
            int i16 = cVar8.f6352c;
            if (i16 > 0) {
                max += i16;
            }
            mo8899T2(this.f6333r1);
            C1225c cVar9 = this.f6323X;
            cVar9.f6357h = max;
            cVar9.f6353d += cVar9.f6354e;
            mo8909d2(tVar, cVar9, xVar, false);
            C1225c cVar10 = this.f6323X;
            i3 = cVar10.f6351b;
            int i17 = cVar10.f6352c;
            if (i17 > 0) {
                mo8894Q2(i15, i2);
                C1225c cVar11 = this.f6323X;
                cVar11.f6357h = i17;
                mo8909d2(tVar, cVar11, xVar, false);
                i2 = this.f6323X.f6351b;
            }
        }
        if (mo9234U() > 0) {
            if (this.f6329k0 ^ this.f6337v0) {
                int q2 = mo8923q2(i2, tVar, xVar, true);
                i5 = i3 + q2;
                i4 = i2 + q2;
                i6 = mo8925r2(i5, tVar, xVar, false);
            } else {
                int r2 = mo8925r2(i3, tVar, xVar, true);
                i5 = i3 + r2;
                i4 = i2 + r2;
                i6 = mo8923q2(i4, tVar, xVar, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        mo8936z2(tVar, xVar, i3, i2);
        if (!xVar.mo9528e()) {
            this.f6324Y.mo9946s();
        } else {
            this.f6333r1.mo8949e();
        }
        this.f6325Z = this.f6337v0;
    }

    /* renamed from: f2 */
    public View mo8911f2(boolean z, boolean z2) {
        if (this.f6329k0) {
            return mo8920m2(0, mo9234U(), z, z2);
        }
        return mo8920m2(mo9234U() - 1, -1, z, z2);
    }

    /* renamed from: g1 */
    public void mo8852g1(RecyclerView.C1260x xVar) {
        super.mo8852g1(xVar);
        this.f6332q1 = null;
        this.f6328e1 = -1;
        this.f6330o1 = Integer.MIN_VALUE;
        this.f6333r1.mo8949e();
    }

    /* renamed from: g2 */
    public View mo8912g2(boolean z, boolean z2) {
        if (this.f6329k0) {
            return mo8920m2(mo9234U() - 1, -1, z, z2);
        }
        return mo8920m2(0, mo9234U(), z, z2);
    }

    /* renamed from: h2 */
    public int mo8913h2() {
        View m2 = mo8920m2(0, mo9234U(), false, true);
        if (m2 == null) {
            return -1;
        }
        return mo9271o0(m2);
    }

    /* renamed from: i2 */
    public int mo8914i2() {
        View m2 = mo8920m2(mo9234U() - 1, -1, true, false);
        if (m2 == null) {
            return -1;
        }
        return mo9271o0(m2);
    }

    /* renamed from: j2 */
    public final View mo8915j2() {
        return mo8919l2(mo9234U() - 1, -1);
    }

    /* renamed from: k1 */
    public void mo8916k1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f6332q1 = savedState;
            if (this.f6328e1 != -1) {
                savedState.mo8938b();
            }
            mo9200C1();
        }
    }

    /* renamed from: k2 */
    public int mo8917k2() {
        View m2 = mo8920m2(mo9234U() - 1, -1, false, true);
        if (m2 == null) {
            return -1;
        }
        return mo9271o0(m2);
    }

    /* renamed from: l1 */
    public Parcelable mo8918l1() {
        if (this.f6332q1 != null) {
            return new SavedState(this.f6332q1);
        }
        SavedState savedState = new SavedState();
        if (mo9234U() > 0) {
            mo8907c2();
            boolean z = this.f6325Z ^ this.f6329k0;
            savedState.f6340e = z;
            if (z) {
                View s2 = mo8926s2();
                savedState.f6339d = this.f6324Y.mo9936i() - this.f6324Y.mo9931d(s2);
                savedState.f6338a = mo9271o0(s2);
            } else {
                View t2 = mo8927t2();
                savedState.f6338a = mo9271o0(t2);
                savedState.f6339d = this.f6324Y.mo9934g(t2) - this.f6324Y.mo9940m();
            }
        } else {
            savedState.mo8938b();
        }
        return savedState;
    }

    /* renamed from: l2 */
    public View mo8919l2(int i, int i2) {
        char c;
        int i3;
        int i4;
        mo8907c2();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return mo9231T(i);
        }
        if (this.f6324Y.mo9934g(mo9231T(i)) < this.f6324Y.mo9940m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f6322U == 0) {
            return this.f6463k.mo9987a(i, i2, i4, i3);
        }
        return this.f6464r.mo9987a(i, i2, i4, i3);
    }

    /* renamed from: m2 */
    public View mo8920m2(int i, int i2, boolean z, boolean z2) {
        int i3;
        mo8907c2();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f6322U == 0) {
            return this.f6463k.mo9987a(i, i2, i3, i4);
        }
        return this.f6464r.mo9987a(i, i2, i3, i4);
    }

    /* renamed from: n2 */
    public final View mo8921n2() {
        if (this.f6329k0) {
            return mo8910e2();
        }
        return mo8915j2();
    }

    /* renamed from: o2 */
    public final View mo8922o2() {
        if (this.f6329k0) {
            return mo8915j2();
        }
        return mo8910e2();
    }

    /* renamed from: p2 */
    public View mo8860p2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, boolean z, boolean z2) {
        int i;
        int i2;
        boolean z3;
        boolean z4;
        mo8907c2();
        int U = mo9234U();
        int i3 = -1;
        if (z2) {
            i2 = mo9234U() - 1;
            i = -1;
        } else {
            i3 = U;
            i2 = 0;
            i = 1;
        }
        int b = xVar.mo9525b();
        int m = this.f6324Y.mo9940m();
        int i4 = this.f6324Y.mo9936i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i3) {
            View T = mo9231T(i2);
            int o0 = mo9271o0(T);
            int g = this.f6324Y.mo9934g(T);
            int d = this.f6324Y.mo9931d(T);
            if (o0 >= 0 && o0 < b) {
                if (!((RecyclerView.LayoutParams) T.getLayoutParams()).mo9305c()) {
                    if (d > m || g >= m) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (g < i4 || d <= i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z3 && !z4) {
                        return T;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = T;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = T;
                    }
                    view2 = T;
                } else if (view3 == null) {
                    view3 = T;
                }
            }
            i2 += i;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    /* renamed from: q2 */
    public final int mo8923q2(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, boolean z) {
        int i2;
        int i3 = this.f6324Y.mo9936i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo8883H2(-i3, tVar, xVar);
        int i5 = i + i4;
        if (!z || (i2 = this.f6324Y.mo9936i() - i5) <= 0) {
            return i4;
        }
        this.f6324Y.mo9945r(i2);
        return i2 + i4;
    }

    /* renamed from: r */
    public void mo8924r(String str) {
        if (this.f6332q1 == null) {
            super.mo8924r(str);
        }
    }

    /* renamed from: r2 */
    public final int mo8925r2(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, boolean z) {
        int m;
        int m2 = i - this.f6324Y.mo9940m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -mo8883H2(m2, tVar, xVar);
        int i3 = i + i2;
        if (!z || (m = i3 - this.f6324Y.mo9940m()) <= 0) {
            return i2;
        }
        this.f6324Y.mo9945r(-m);
        return i2 - m;
    }

    /* renamed from: s2 */
    public final View mo8926s2() {
        int i;
        if (this.f6329k0) {
            i = 0;
        } else {
            i = mo9234U() - 1;
        }
        return mo9231T(i);
    }

    /* renamed from: t2 */
    public final View mo8927t2() {
        int i;
        if (this.f6329k0) {
            i = mo9234U() - 1;
        } else {
            i = 0;
        }
        return mo9231T(i);
    }

    @Deprecated
    /* renamed from: u2 */
    public int mo8928u2(RecyclerView.C1260x xVar) {
        if (xVar.mo9527d()) {
            return this.f6324Y.mo9941n();
        }
        return 0;
    }

    /* renamed from: v */
    public boolean mo8929v() {
        if (this.f6322U == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v2 */
    public int mo8930v2() {
        return this.f6322U;
    }

    /* renamed from: w */
    public boolean mo8931w() {
        if (this.f6322U == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: w2 */
    public boolean mo8932w2() {
        if (mo9262k0() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: x2 */
    public boolean mo8933x2() {
        return this.f6326b1;
    }

    /* renamed from: y2 */
    public void mo8863y2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, C1225c cVar, C1224b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        View d = cVar.mo8955d(tVar);
        if (d == null) {
            bVar.f6347b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) d.getLayoutParams();
        if (cVar.f6361l == null) {
            boolean z3 = this.f6329k0;
            if (cVar.f6355f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                mo9270o(d);
            } else {
                mo9273p(d, 0);
            }
        } else {
            boolean z4 = this.f6329k0;
            if (cVar.f6355f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                mo9264m(d);
            } else {
                mo9267n(d, 0);
            }
        }
        mo9209I0(d, 0, 0);
        bVar.f6346a = this.f6324Y.mo9932e(d);
        if (this.f6322U == 1) {
            if (mo8932w2()) {
                i5 = mo9288v0() - getPaddingRight();
                i4 = i5 - this.f6324Y.mo9933f(d);
            } else {
                i4 = getPaddingLeft();
                i5 = this.f6324Y.mo9933f(d) + i4;
            }
            if (cVar.f6355f == -1) {
                int i6 = cVar.f6351b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f6346a;
            } else {
                int i7 = cVar.f6351b;
                i3 = i7;
                i2 = i5;
                i = bVar.f6346a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f = this.f6324Y.mo9933f(d) + paddingTop;
            if (cVar.f6355f == -1) {
                int i8 = cVar.f6351b;
                i2 = i8;
                i3 = paddingTop;
                i = f;
                i4 = i8 - bVar.f6346a;
            } else {
                int i9 = cVar.f6351b;
                i3 = paddingTop;
                i2 = bVar.f6346a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo9207H0(d, i4, i3, i2, i);
        if (layoutParams.mo9305c() || layoutParams.mo9304b()) {
            bVar.f6348c = true;
        }
        bVar.f6349d = d.hasFocusable();
    }

    /* renamed from: z */
    public void mo8934z(int i, int i2, RecyclerView.C1260x xVar, RecyclerView.LayoutManager.C1228c cVar) {
        int i3;
        if (this.f6322U != 0) {
            i = i2;
        }
        if (mo9234U() != 0 && i != 0) {
            mo8907c2();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            mo8892P2(i3, Math.abs(i), true, xVar);
            mo8834W1(xVar, this.f6323X, cVar);
        }
    }

    /* renamed from: z0 */
    public boolean mo8935z0() {
        return true;
    }

    /* renamed from: z2 */
    public final void mo8936z2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, int i, int i2) {
        boolean z;
        RecyclerView.C1254t tVar2 = tVar;
        RecyclerView.C1260x xVar2 = xVar;
        if (xVar.mo9530g() && mo9234U() != 0 && !xVar.mo9528e() && mo8831U1()) {
            List<RecyclerView.C1231a0> k = tVar.mo9482k();
            int size = k.size();
            int o0 = mo9271o0(mo9231T(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C1231a0 a0Var = k.get(i5);
                if (!a0Var.isRemoved()) {
                    boolean z2 = true;
                    if (a0Var.getLayoutPosition() < o0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.f6329k0) {
                        z2 = true;
                    }
                    if (z2) {
                        i3 += this.f6324Y.mo9932e(a0Var.itemView);
                    } else {
                        i4 += this.f6324Y.mo9932e(a0Var.itemView);
                    }
                }
            }
            this.f6323X.f6361l = k;
            if (i3 > 0) {
                mo8898S2(mo9271o0(mo8927t2()), i);
                C1225c cVar = this.f6323X;
                cVar.f6357h = i3;
                cVar.f6352c = 0;
                cVar.mo8952a();
                mo8909d2(tVar2, this.f6323X, xVar2, false);
            }
            if (i4 > 0) {
                mo8894Q2(mo9271o0(mo8926s2()), i2);
                C1225c cVar2 = this.f6323X;
                cVar2.f6357h = i4;
                cVar2.f6352c = 0;
                cVar2.mo8952a();
                mo8909d2(tVar2, this.f6323X, xVar2, false);
            }
            this.f6323X.f6361l = null;
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f6322U = 1;
        this.f6327e0 = false;
        this.f6329k0 = false;
        this.f6337v0 = false;
        this.f6326b1 = true;
        this.f6328e1 = -1;
        this.f6330o1 = Integer.MIN_VALUE;
        this.f6332q1 = null;
        this.f6333r1 = new C1223a();
        this.f6334s1 = new C1224b();
        this.f6335t1 = 2;
        this.f6336u1 = new int[2];
        mo8885J2(i);
        mo8886K2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f6322U = 1;
        this.f6327e0 = false;
        this.f6329k0 = false;
        this.f6337v0 = false;
        this.f6326b1 = true;
        this.f6328e1 = -1;
        this.f6330o1 = Integer.MIN_VALUE;
        this.f6332q1 = null;
        this.f6333r1 = new C1223a();
        this.f6334s1 = new C1224b();
        this.f6335t1 = 2;
        this.f6336u1 = new int[2];
        RecyclerView.LayoutManager.Properties p0 = RecyclerView.LayoutManager.m8982p0(context, attributeSet, i, i2);
        mo8885J2(p0.f6468a);
        mo8886K2(p0.f6470c);
        mo8826L2(p0.f6471d);
    }
}
