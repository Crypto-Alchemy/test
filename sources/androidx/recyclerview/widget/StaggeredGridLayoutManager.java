package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.C1257w.C1259b {

    /* renamed from: A1 */
    public boolean f6536A1 = true;

    /* renamed from: B1 */
    public int[] f6537B1;

    /* renamed from: C1 */
    public final Runnable f6538C1 = new C1265a();

    /* renamed from: U */
    public int f6539U = -1;

    /* renamed from: X */
    public C1267c[] f6540X;

    /* renamed from: Y */
    public C1334q f6541Y;

    /* renamed from: Z */
    public C1334q f6542Z;

    /* renamed from: b1 */
    public boolean f6543b1 = false;

    /* renamed from: e0 */
    public int f6544e0;

    /* renamed from: e1 */
    public boolean f6545e1 = false;

    /* renamed from: k0 */
    public int f6546k0;

    /* renamed from: o1 */
    public BitSet f6547o1;

    /* renamed from: p1 */
    public int f6548p1 = -1;

    /* renamed from: q1 */
    public int f6549q1 = Integer.MIN_VALUE;

    /* renamed from: r1 */
    public LazySpanLookup f6550r1 = new LazySpanLookup();

    /* renamed from: s1 */
    public int f6551s1 = 2;

    /* renamed from: t1 */
    public boolean f6552t1;

    /* renamed from: u1 */
    public boolean f6553u1;

    /* renamed from: v0 */
    public final C1327l f6554v0;

    /* renamed from: v1 */
    public SavedState f6555v1;

    /* renamed from: w1 */
    public int f6556w1;

    /* renamed from: x1 */
    public final Rect f6557x1 = new Rect();

    /* renamed from: y1 */
    public final C1266b f6558y1 = new C1266b();

    /* renamed from: z1 */
    public boolean f6559z1 = false;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: k */
        public C1267c f6560k;

        /* renamed from: r */
        public boolean f6561r;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public boolean mo9597e() {
            return this.f6561r;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1264a();

        /* renamed from: A */
        public boolean f6568A;

        /* renamed from: a */
        public int f6569a;

        /* renamed from: d */
        public int f6570d;

        /* renamed from: e */
        public int f6571e;

        /* renamed from: g */
        public int[] f6572g;

        /* renamed from: k */
        public int f6573k;

        /* renamed from: r */
        public int[] f6574r;

        /* renamed from: s */
        public List<LazySpanLookup.FullSpanItem> f6575s;

        /* renamed from: x */
        public boolean f6576x;

        /* renamed from: y */
        public boolean f6577y;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        public class C1264a implements Parcelable.Creator<SavedState> {
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
        public void mo9621a() {
            this.f6572g = null;
            this.f6571e = 0;
            this.f6569a = -1;
            this.f6570d = -1;
        }

        /* renamed from: b */
        public void mo9622b() {
            this.f6572g = null;
            this.f6571e = 0;
            this.f6573k = 0;
            this.f6574r = null;
            this.f6575s = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6569a);
            parcel.writeInt(this.f6570d);
            parcel.writeInt(this.f6571e);
            if (this.f6571e > 0) {
                parcel.writeIntArray(this.f6572g);
            }
            parcel.writeInt(this.f6573k);
            if (this.f6573k > 0) {
                parcel.writeIntArray(this.f6574r);
            }
            parcel.writeInt(this.f6576x ? 1 : 0);
            parcel.writeInt(this.f6577y ? 1 : 0);
            parcel.writeInt(this.f6568A ? 1 : 0);
            parcel.writeList(this.f6575s);
        }

        public SavedState(Parcel parcel) {
            this.f6569a = parcel.readInt();
            this.f6570d = parcel.readInt();
            int readInt = parcel.readInt();
            this.f6571e = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f6572g = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f6573k = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f6574r = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f6576x = parcel.readInt() == 1;
            this.f6577y = parcel.readInt() == 1;
            this.f6568A = parcel.readInt() == 1 ? true : z;
            this.f6575s = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f6571e = savedState.f6571e;
            this.f6569a = savedState.f6569a;
            this.f6570d = savedState.f6570d;
            this.f6572g = savedState.f6572g;
            this.f6573k = savedState.f6573k;
            this.f6574r = savedState.f6574r;
            this.f6576x = savedState.f6576x;
            this.f6577y = savedState.f6577y;
            this.f6568A = savedState.f6568A;
            this.f6575s = savedState.f6575s;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C1265a implements Runnable {
        public C1265a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo9572b2();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C1266b {

        /* renamed from: a */
        public int f6579a;

        /* renamed from: b */
        public int f6580b;

        /* renamed from: c */
        public boolean f6581c;

        /* renamed from: d */
        public boolean f6582d;

        /* renamed from: e */
        public boolean f6583e;

        /* renamed from: f */
        public int[] f6584f;

        public C1266b() {
            mo9632c();
        }

        /* renamed from: a */
        public void mo9630a() {
            int i;
            if (this.f6581c) {
                i = StaggeredGridLayoutManager.this.f6541Y.mo9936i();
            } else {
                i = StaggeredGridLayoutManager.this.f6541Y.mo9940m();
            }
            this.f6580b = i;
        }

        /* renamed from: b */
        public void mo9631b(int i) {
            if (this.f6581c) {
                this.f6580b = StaggeredGridLayoutManager.this.f6541Y.mo9936i() - i;
            } else {
                this.f6580b = StaggeredGridLayoutManager.this.f6541Y.mo9940m() + i;
            }
        }

        /* renamed from: c */
        public void mo9632c() {
            this.f6579a = -1;
            this.f6580b = Integer.MIN_VALUE;
            this.f6581c = false;
            this.f6582d = false;
            this.f6583e = false;
            int[] iArr = this.f6584f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        public void mo9633d(C1267c[] cVarArr) {
            int length = cVarArr.length;
            int[] iArr = this.f6584f;
            if (iArr == null || iArr.length < length) {
                this.f6584f = new int[StaggeredGridLayoutManager.this.f6540X.length];
            }
            for (int i = 0; i < length; i++) {
                this.f6584f[i] = cVarArr[i].mo9649p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public class C1267c {

        /* renamed from: a */
        public ArrayList<View> f6586a = new ArrayList<>();

        /* renamed from: b */
        public int f6587b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f6588c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f6589d = 0;

        /* renamed from: e */
        public final int f6590e;

        public C1267c(int i) {
            this.f6590e = i;
        }

        /* renamed from: a */
        public void mo9634a(View view) {
            LayoutParams n = mo9647n(view);
            n.f6560k = this;
            this.f6586a.add(view);
            this.f6588c = Integer.MIN_VALUE;
            if (this.f6586a.size() == 1) {
                this.f6587b = Integer.MIN_VALUE;
            }
            if (n.mo9305c() || n.mo9304b()) {
                this.f6589d += StaggeredGridLayoutManager.this.f6541Y.mo9932e(view);
            }
        }

        /* renamed from: b */
        public void mo9635b(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo9645l(Integer.MIN_VALUE);
            } else {
                i2 = mo9649p(Integer.MIN_VALUE);
            }
            mo9638e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f6541Y.mo9936i()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f6541Y.mo9940m()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f6588c = i2;
                    this.f6587b = i2;
                }
            }
        }

        /* renamed from: c */
        public void mo9636c() {
            LazySpanLookup.FullSpanItem f;
            ArrayList<View> arrayList = this.f6586a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams n = mo9647n(view);
            this.f6588c = StaggeredGridLayoutManager.this.f6541Y.mo9931d(view);
            if (n.f6561r && (f = StaggeredGridLayoutManager.this.f6550r1.mo9603f(n.mo9303a())) != null && f.f6565d == 1) {
                this.f6588c += f.mo9613a(this.f6590e);
            }
        }

        /* renamed from: d */
        public void mo9637d() {
            LazySpanLookup.FullSpanItem f;
            View view = this.f6586a.get(0);
            LayoutParams n = mo9647n(view);
            this.f6587b = StaggeredGridLayoutManager.this.f6541Y.mo9934g(view);
            if (n.f6561r && (f = StaggeredGridLayoutManager.this.f6550r1.mo9603f(n.mo9303a())) != null && f.f6565d == -1) {
                this.f6587b -= f.mo9613a(this.f6590e);
            }
        }

        /* renamed from: e */
        public void mo9638e() {
            this.f6586a.clear();
            mo9650q();
            this.f6589d = 0;
        }

        /* renamed from: f */
        public int mo9639f() {
            if (StaggeredGridLayoutManager.this.f6543b1) {
                return mo9642i(this.f6586a.size() - 1, -1, true);
            }
            return mo9642i(0, this.f6586a.size(), true);
        }

        /* renamed from: g */
        public int mo9640g() {
            if (StaggeredGridLayoutManager.this.f6543b1) {
                return mo9642i(0, this.f6586a.size(), true);
            }
            return mo9642i(this.f6586a.size() - 1, -1, true);
        }

        /* renamed from: h */
        public int mo9641h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int m = StaggeredGridLayoutManager.this.f6541Y.mo9940m();
            int i4 = StaggeredGridLayoutManager.this.f6541Y.mo9936i();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = this.f6586a.get(i);
                int g = StaggeredGridLayoutManager.this.f6541Y.mo9934g(view);
                int d = StaggeredGridLayoutManager.this.f6541Y.mo9931d(view);
                boolean z5 = false;
                if (!z3 ? g >= i4 : g > i4) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 ? d > m : d >= m) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo9271o0(view);
                        }
                        if (g < m || d > i4) {
                            return StaggeredGridLayoutManager.this.mo9271o0(view);
                        }
                    } else if (g >= m && d <= i4) {
                        return StaggeredGridLayoutManager.this.mo9271o0(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: i */
        public int mo9642i(int i, int i2, boolean z) {
            return mo9641h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int mo9643j() {
            return this.f6589d;
        }

        /* renamed from: k */
        public int mo9644k() {
            int i = this.f6588c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo9636c();
            return this.f6588c;
        }

        /* renamed from: l */
        public int mo9645l(int i) {
            int i2 = this.f6588c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f6586a.size() == 0) {
                return i;
            }
            mo9636c();
            return this.f6588c;
        }

        /* renamed from: m */
        public View mo9646m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f6586a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f6586a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f6543b1 && staggeredGridLayoutManager.mo9271o0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f6543b1 && staggeredGridLayoutManager2.mo9271o0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f6586a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f6586a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f6543b1 && staggeredGridLayoutManager3.mo9271o0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f6543b1 && staggeredGridLayoutManager4.mo9271o0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        public LayoutParams mo9647n(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: o */
        public int mo9648o() {
            int i = this.f6587b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo9637d();
            return this.f6587b;
        }

        /* renamed from: p */
        public int mo9649p(int i) {
            int i2 = this.f6587b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f6586a.size() == 0) {
                return i;
            }
            mo9637d();
            return this.f6587b;
        }

        /* renamed from: q */
        public void mo9650q() {
            this.f6587b = Integer.MIN_VALUE;
            this.f6588c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        public void mo9651r(int i) {
            int i2 = this.f6587b;
            if (i2 != Integer.MIN_VALUE) {
                this.f6587b = i2 + i;
            }
            int i3 = this.f6588c;
            if (i3 != Integer.MIN_VALUE) {
                this.f6588c = i3 + i;
            }
        }

        /* renamed from: s */
        public void mo9652s() {
            int size = this.f6586a.size();
            View remove = this.f6586a.remove(size - 1);
            LayoutParams n = mo9647n(remove);
            n.f6560k = null;
            if (n.mo9305c() || n.mo9304b()) {
                this.f6589d -= StaggeredGridLayoutManager.this.f6541Y.mo9932e(remove);
            }
            if (size == 1) {
                this.f6587b = Integer.MIN_VALUE;
            }
            this.f6588c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        public void mo9653t() {
            View remove = this.f6586a.remove(0);
            LayoutParams n = mo9647n(remove);
            n.f6560k = null;
            if (this.f6586a.size() == 0) {
                this.f6588c = Integer.MIN_VALUE;
            }
            if (n.mo9305c() || n.mo9304b()) {
                this.f6589d -= StaggeredGridLayoutManager.this.f6541Y.mo9932e(remove);
            }
            this.f6587b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        public void mo9654u(View view) {
            LayoutParams n = mo9647n(view);
            n.f6560k = this;
            this.f6586a.add(0, view);
            this.f6587b = Integer.MIN_VALUE;
            if (this.f6586a.size() == 1) {
                this.f6588c = Integer.MIN_VALUE;
            }
            if (n.mo9305c() || n.mo9304b()) {
                this.f6589d += StaggeredGridLayoutManager.this.f6541Y.mo9932e(view);
            }
        }

        /* renamed from: v */
        public void mo9655v(int i) {
            this.f6587b = i;
            this.f6588c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.Properties p0 = RecyclerView.LayoutManager.m8982p0(context, attributeSet, i, i2);
        mo9555Q2(p0.f6468a);
        mo9557S2(p0.f6469b);
        mo9556R2(p0.f6470c);
        this.f6554v0 = new C1327l();
        mo9580j2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: A2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo9539A2() {
        /*
            r12 = this;
            int r0 = r12.mo9234U()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f6539U
            r2.<init>(r3)
            int r3 = r12.f6539U
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f6544e0
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo9541C2()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.f6545e1
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo9231T(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f6560k
            int r9 = r9.f6590e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f6560k
            boolean r9 = r12.mo9573c2(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f6560k
            int r9 = r9.f6590e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f6561r
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo9231T(r9)
            boolean r10 = r12.f6545e1
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.q r10 = r12.f6541Y
            int r10 = r10.mo9931d(r7)
            androidx.recyclerview.widget.q r11 = r12.f6541Y
            int r11 = r11.mo9931d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.q r10 = r12.f6541Y
            int r10 = r10.mo9934g(r7)
            androidx.recyclerview.widget.q r11 = r12.f6541Y
            int r11 = r11.mo9934g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = r1
            goto L_0x008b
        L_0x008a:
            r10 = r4
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = r8.f6560k
            int r8 = r8.f6590e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f6560k
            int r9 = r9.f6590e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = r1
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = r1
            goto L_0x00a6
        L_0x00a5:
            r9 = r4
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo9539A2():android.view.View");
    }

    /* renamed from: B */
    public int mo8874B(RecyclerView.C1260x xVar) {
        return mo9574d2(xVar);
    }

    /* renamed from: B2 */
    public void mo9540B2() {
        this.f6550r1.mo9599b();
        mo9200C1();
    }

    /* renamed from: C */
    public int mo8819C(RecyclerView.C1260x xVar) {
        return mo9575e2(xVar);
    }

    /* renamed from: C2 */
    public boolean mo9541C2() {
        if (mo9262k0() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public int mo8820D(RecyclerView.C1260x xVar) {
        return mo9576f2(xVar);
    }

    /* renamed from: D2 */
    public final void mo9542D2(View view, int i, int i2, boolean z) {
        boolean z2;
        mo9285u(view, this.f6557x1);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        Rect rect = this.f6557x1;
        int a3 = mo9571a3(i, i3 + rect.left, layoutParams.rightMargin + rect.right);
        int i4 = layoutParams.topMargin;
        Rect rect2 = this.f6557x1;
        int a32 = mo9571a3(i2, i4 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (z) {
            z2 = mo9227Q1(view, a3, a32, layoutParams);
        } else {
            z2 = mo9225O1(view, a3, a32, layoutParams);
        }
        if (z2) {
            view.measure(a3, a32);
        }
    }

    /* renamed from: E */
    public int mo8878E(RecyclerView.C1260x xVar) {
        return mo9574d2(xVar);
    }

    /* renamed from: E2 */
    public final void mo9543E2(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f6561r) {
            if (this.f6544e0 == 1) {
                mo9542D2(view, this.f6556w1, RecyclerView.LayoutManager.m8981V(mo9256h0(), mo9258i0(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
            } else {
                mo9542D2(view, RecyclerView.LayoutManager.m8981V(mo9288v0(), mo9290w0(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), this.f6556w1, z);
            }
        } else if (this.f6544e0 == 1) {
            mo9542D2(view, RecyclerView.LayoutManager.m8981V(this.f6546k0, mo9290w0(), 0, layoutParams.width, false), RecyclerView.LayoutManager.m8981V(mo9256h0(), mo9258i0(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
        } else {
            mo9542D2(view, RecyclerView.LayoutManager.m8981V(mo9288v0(), mo9290w0(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), RecyclerView.LayoutManager.m8981V(this.f6546k0, mo9258i0(), 0, layoutParams.height, false), z);
        }
    }

    /* renamed from: F */
    public int mo8821F(RecyclerView.C1260x xVar) {
        return mo9575e2(xVar);
    }

    /* renamed from: F1 */
    public int mo8822F1(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        return mo9553O2(i, tVar, xVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo9572b2() != false) goto L_0x015b;
     */
    /* renamed from: F2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9544F2(androidx.recyclerview.widget.RecyclerView.C1254t r9, androidx.recyclerview.widget.RecyclerView.C1260x r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f6558y1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f6555v1
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f6548p1
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo9525b()
            if (r1 != 0) goto L_0x0018
            r8.mo9284t1(r9)
            r0.mo9632c()
            return
        L_0x0018:
            boolean r1 = r0.f6583e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f6548p1
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f6555v1
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo9632c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f6555v1
            if (r5 == 0) goto L_0x0037
            r8.mo9562W1(r0)
            goto L_0x003e
        L_0x0037:
            r8.mo9552N2()
            boolean r5 = r8.f6545e1
            r0.f6581c = r5
        L_0x003e:
            r8.mo9563W2(r10, r0)
            r0.f6583e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f6555v1
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f6548p1
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f6581c
            boolean r6 = r8.f6552t1
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo9541C2()
            boolean r6 = r8.f6553u1
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f6550r1
            r5.mo9599b()
            r0.f6582d = r4
        L_0x0060:
            int r5 = r8.mo9234U()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f6555v1
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f6571e
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f6582d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f6539U
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f6540X
            r5 = r5[r1]
            r5.mo9638e()
            int r5 = r0.f6580b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r8.f6540X
            r6 = r6[r1]
            r6.mo9655v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f6558y1
            int[] r1 = r1.f6584f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f6539U
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f6540X
            r5 = r5[r1]
            r5.mo9638e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f6558y1
            int[] r6 = r6.f6584f
            r6 = r6[r1]
            r5.mo9655v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f6539U
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f6540X
            r5 = r5[r1]
            boolean r6 = r8.f6545e1
            int r7 = r0.f6580b
            r5.mo9635b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f6558y1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f6540X
            r1.mo9633d(r5)
        L_0x00c9:
            r8.mo9206H(r9)
            androidx.recyclerview.widget.l r1 = r8.f6554v0
            r1.f6814a = r3
            r8.f6559z1 = r3
            androidx.recyclerview.widget.q r1 = r8.f6542Z
            int r1 = r1.mo9941n()
            r8.mo9567Y2(r1)
            int r1 = r0.f6579a
            r8.mo9565X2(r1, r10)
            boolean r1 = r0.f6581c
            if (r1 == 0) goto L_0x00fc
            r8.mo9554P2(r2)
            androidx.recyclerview.widget.l r1 = r8.f6554v0
            r8.mo9581k2(r9, r1, r10)
            r8.mo9554P2(r4)
            androidx.recyclerview.widget.l r1 = r8.f6554v0
            int r2 = r0.f6579a
            int r5 = r1.f6817d
            int r2 = r2 + r5
            r1.f6816c = r2
            r8.mo9581k2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.mo9554P2(r4)
            androidx.recyclerview.widget.l r1 = r8.f6554v0
            r8.mo9581k2(r9, r1, r10)
            r8.mo9554P2(r2)
            androidx.recyclerview.widget.l r1 = r8.f6554v0
            int r2 = r0.f6579a
            int r5 = r1.f6817d
            int r2 = r2 + r5
            r1.f6816c = r2
            r8.mo9581k2(r9, r1, r10)
        L_0x0113:
            r8.mo9551M2()
            int r1 = r8.mo9234U()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f6545e1
            if (r1 == 0) goto L_0x0127
            r8.mo9587q2(r9, r10, r4)
            r8.mo9588r2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.mo9588r2(r9, r10, r4)
            r8.mo9587q2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.mo9528e()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f6551s1
            if (r11 == 0) goto L_0x014b
            int r11 = r8.mo9234U()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f6559z1
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo9539A2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = r4
            goto L_0x014c
        L_0x014b:
            r11 = r3
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f6538C1
            r8.mo9293x1(r11)
            boolean r11 = r8.mo9572b2()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = r3
        L_0x015b:
            boolean r11 = r10.mo9528e()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f6558y1
            r11.mo9632c()
        L_0x0166:
            boolean r11 = r0.f6581c
            r8.f6552t1 = r11
            boolean r11 = r8.mo9541C2()
            r8.f6553u1 = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f6558y1
            r11.mo9632c()
            r8.mo9544F2(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo9544F2(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    /* renamed from: G */
    public int mo8823G(RecyclerView.C1260x xVar) {
        return mo9576f2(xVar);
    }

    /* renamed from: G1 */
    public void mo8881G1(int i) {
        SavedState savedState = this.f6555v1;
        if (!(savedState == null || savedState.f6569a == i)) {
            savedState.mo9621a();
        }
        this.f6548p1 = i;
        this.f6549q1 = Integer.MIN_VALUE;
        mo9200C1();
    }

    /* renamed from: G2 */
    public final boolean mo9545G2(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f6544e0 == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f6545e1) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f6545e1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == mo9541C2()) {
            return true;
        }
        return false;
    }

    /* renamed from: H1 */
    public int mo8824H1(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        return mo9553O2(i, tVar, xVar);
    }

    /* renamed from: H2 */
    public void mo9546H2(int i, RecyclerView.C1260x xVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo9590t2();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = mo9589s2();
        }
        this.f6554v0.f6814a = true;
        mo9565X2(i3, xVar);
        mo9554P2(i2);
        C1327l lVar = this.f6554v0;
        lVar.f6816c = i3 + lVar.f6817d;
        lVar.f6815b = Math.abs(i);
    }

    /* renamed from: I2 */
    public final void mo9547I2(View view) {
        for (int i = this.f6539U - 1; i >= 0; i--) {
            this.f6540X[i].mo9654u(view);
        }
    }

    /* renamed from: J2 */
    public final void mo9548J2(RecyclerView.C1254t tVar, C1327l lVar) {
        int i;
        int i2;
        if (lVar.f6814a && !lVar.f6822i) {
            if (lVar.f6815b == 0) {
                if (lVar.f6818e == -1) {
                    mo9549K2(tVar, lVar.f6820g);
                } else {
                    mo9550L2(tVar, lVar.f6819f);
                }
            } else if (lVar.f6818e == -1) {
                int i3 = lVar.f6819f;
                int v2 = i3 - mo9592v2(i3);
                if (v2 < 0) {
                    i2 = lVar.f6820g;
                } else {
                    i2 = lVar.f6820g - Math.min(v2, lVar.f6815b);
                }
                mo9549K2(tVar, i2);
            } else {
                int w2 = mo9593w2(lVar.f6820g) - lVar.f6820g;
                if (w2 < 0) {
                    i = lVar.f6819f;
                } else {
                    i = Math.min(w2, lVar.f6815b) + lVar.f6819f;
                }
                mo9550L2(tVar, i);
            }
        }
    }

    /* renamed from: K0 */
    public void mo9215K0(int i) {
        super.mo9215K0(i);
        for (int i2 = 0; i2 < this.f6539U; i2++) {
            this.f6540X[i2].mo9651r(i);
        }
    }

    /* renamed from: K2 */
    public final void mo9549K2(RecyclerView.C1254t tVar, int i) {
        int U = mo9234U() - 1;
        while (U >= 0) {
            View T = mo9231T(U);
            if (this.f6541Y.mo9934g(T) >= i && this.f6541Y.mo9944q(T) >= i) {
                LayoutParams layoutParams = (LayoutParams) T.getLayoutParams();
                if (layoutParams.f6561r) {
                    int i2 = 0;
                    while (i2 < this.f6539U) {
                        if (this.f6540X[i2].f6586a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f6539U; i3++) {
                        this.f6540X[i3].mo9652s();
                    }
                } else if (layoutParams.f6560k.f6586a.size() != 1) {
                    layoutParams.f6560k.mo9652s();
                } else {
                    return;
                }
                mo9289v1(T, tVar);
                U--;
            } else {
                return;
            }
        }
    }

    /* renamed from: L0 */
    public void mo9218L0(int i) {
        super.mo9218L0(i);
        for (int i2 = 0; i2 < this.f6539U; i2++) {
            this.f6540X[i2].mo9651r(i);
        }
    }

    /* renamed from: L1 */
    public void mo8825L1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f6544e0 == 1) {
            i4 = RecyclerView.LayoutManager.m8983y(i2, rect.height() + paddingTop, mo9265m0());
            i3 = RecyclerView.LayoutManager.m8983y(i, (this.f6546k0 * this.f6539U) + paddingLeft, mo9268n0());
        } else {
            i3 = RecyclerView.LayoutManager.m8983y(i, rect.width() + paddingLeft, mo9268n0());
            i4 = RecyclerView.LayoutManager.m8983y(i2, (this.f6546k0 * this.f6539U) + paddingTop, mo9265m0());
        }
        mo9216K1(i3, i4);
    }

    /* renamed from: L2 */
    public final void mo9550L2(RecyclerView.C1254t tVar, int i) {
        while (mo9234U() > 0) {
            View T = mo9231T(0);
            if (this.f6541Y.mo9931d(T) <= i && this.f6541Y.mo9943p(T) <= i) {
                LayoutParams layoutParams = (LayoutParams) T.getLayoutParams();
                if (layoutParams.f6561r) {
                    int i2 = 0;
                    while (i2 < this.f6539U) {
                        if (this.f6540X[i2].f6586a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f6539U; i3++) {
                        this.f6540X[i3].mo9653t();
                    }
                } else if (layoutParams.f6560k.f6586a.size() != 1) {
                    layoutParams.f6560k.mo9653t();
                } else {
                    return;
                }
                mo9289v1(T, tVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: M0 */
    public void mo9220M0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.f6550r1.mo9599b();
        for (int i = 0; i < this.f6539U; i++) {
            this.f6540X[i].mo9638e();
        }
    }

    /* renamed from: M2 */
    public final void mo9551M2() {
        if (this.f6542Z.mo9938k() != 1073741824) {
            float f = Utils.FLOAT_EPSILON;
            int U = mo9234U();
            for (int i = 0; i < U; i++) {
                View T = mo9231T(i);
                float e = (float) this.f6542Z.mo9932e(T);
                if (e >= f) {
                    if (((LayoutParams) T.getLayoutParams()).mo9597e()) {
                        e = (e * 1.0f) / ((float) this.f6539U);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f6546k0;
            int round = Math.round(f * ((float) this.f6539U));
            if (this.f6542Z.mo9938k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f6542Z.mo9941n());
            }
            mo9567Y2(round);
            if (this.f6546k0 != i2) {
                for (int i3 = 0; i3 < U; i3++) {
                    View T2 = mo9231T(i3);
                    LayoutParams layoutParams = (LayoutParams) T2.getLayoutParams();
                    if (!layoutParams.f6561r) {
                        if (!mo9541C2() || this.f6544e0 != 1) {
                            int i4 = layoutParams.f6560k.f6590e;
                            int i5 = this.f6546k0 * i4;
                            int i6 = i4 * i2;
                            if (this.f6544e0 == 1) {
                                T2.offsetLeftAndRight(i5 - i6);
                            } else {
                                T2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f6539U;
                            int i8 = layoutParams.f6560k.f6590e;
                            T2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f6546k0) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: N2 */
    public final void mo9552N2() {
        if (this.f6544e0 == 1 || !mo9541C2()) {
            this.f6545e1 = this.f6543b1;
        } else {
            this.f6545e1 = !this.f6543b1;
        }
    }

    /* renamed from: O */
    public RecyclerView.LayoutParams mo8827O() {
        if (this.f6544e0 == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: O2 */
    public int mo9553O2(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        if (mo9234U() == 0 || i == 0) {
            return 0;
        }
        mo9546H2(i, xVar);
        int k2 = mo9581k2(tVar, this.f6554v0, xVar);
        if (this.f6554v0.f6815b >= k2) {
            if (i < 0) {
                i = -k2;
            } else {
                i = k2;
            }
        }
        this.f6541Y.mo9945r(-i);
        this.f6552t1 = this.f6545e1;
        C1327l lVar = this.f6554v0;
        lVar.f6815b = 0;
        mo9548J2(tVar, lVar);
        return i;
    }

    /* renamed from: P */
    public RecyclerView.LayoutParams mo8828P(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: P2 */
    public final void mo9554P2(int i) {
        boolean z;
        C1327l lVar = this.f6554v0;
        lVar.f6818e = i;
        boolean z2 = this.f6545e1;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        lVar.f6817d = i2;
    }

    /* renamed from: Q */
    public RecyclerView.LayoutParams mo8829Q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: Q0 */
    public void mo8893Q0(RecyclerView recyclerView, RecyclerView.C1254t tVar) {
        super.mo8893Q0(recyclerView, tVar);
        mo9293x1(this.f6538C1);
        for (int i = 0; i < this.f6539U; i++) {
            this.f6540X[i].mo9638e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: Q2 */
    public void mo9555Q2(int i) {
        if (i == 0 || i == 1) {
            mo8924r((String) null);
            if (i != this.f6544e0) {
                this.f6544e0 = i;
                C1334q qVar = this.f6541Y;
                this.f6541Y = this.f6542Z;
                this.f6542Z = qVar;
                mo9200C1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: R0 */
    public View mo8830R0(View view, int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        View M;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        View m;
        if (mo9234U() == 0 || (M = mo9219M(view)) == null) {
            return null;
        }
        mo9552N2();
        int g2 = mo9577g2(i);
        if (g2 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) M.getLayoutParams();
        boolean z3 = layoutParams.f6561r;
        C1267c cVar = layoutParams.f6560k;
        if (g2 == 1) {
            i2 = mo9590t2();
        } else {
            i2 = mo9589s2();
        }
        mo9565X2(i2, xVar);
        mo9554P2(g2);
        C1327l lVar = this.f6554v0;
        lVar.f6816c = lVar.f6817d + i2;
        lVar.f6815b = (int) (((float) this.f6541Y.mo9941n()) * 0.33333334f);
        C1327l lVar2 = this.f6554v0;
        lVar2.f6821h = true;
        lVar2.f6814a = false;
        mo9581k2(tVar, lVar2, xVar);
        this.f6552t1 = this.f6545e1;
        if (!z3 && (m = cVar.mo9646m(i2, g2)) != null && m != M) {
            return m;
        }
        if (mo9545G2(g2)) {
            for (int i6 = this.f6539U - 1; i6 >= 0; i6--) {
                View m2 = this.f6540X[i6].mo9646m(i2, g2);
                if (m2 != null && m2 != M) {
                    return m2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f6539U; i7++) {
                View m3 = this.f6540X[i7].mo9646m(i2, g2);
                if (m3 != null && m3 != M) {
                    return m3;
                }
            }
        }
        boolean z4 = !this.f6543b1;
        if (g2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                i5 = cVar.mo9639f();
            } else {
                i5 = cVar.mo9640g();
            }
            View N = mo8888N(i5);
            if (!(N == null || N == M)) {
                return N;
            }
        }
        if (mo9545G2(g2)) {
            for (int i8 = this.f6539U - 1; i8 >= 0; i8--) {
                if (i8 != cVar.f6590e) {
                    if (z2) {
                        i4 = this.f6540X[i8].mo9639f();
                    } else {
                        i4 = this.f6540X[i8].mo9640g();
                    }
                    View N2 = mo8888N(i4);
                    if (!(N2 == null || N2 == M)) {
                        return N2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f6539U; i9++) {
                if (z2) {
                    i3 = this.f6540X[i9].mo9639f();
                } else {
                    i3 = this.f6540X[i9].mo9640g();
                }
                View N3 = mo8888N(i3);
                if (N3 != null && N3 != M) {
                    return N3;
                }
            }
        }
        return null;
    }

    /* renamed from: R1 */
    public void mo8895R1(RecyclerView recyclerView, RecyclerView.C1260x xVar, int i) {
        C1328m mVar = new C1328m(recyclerView.getContext());
        mVar.setTargetPosition(i);
        mo9230S1(mVar);
    }

    /* renamed from: R2 */
    public void mo9556R2(boolean z) {
        mo8924r((String) null);
        SavedState savedState = this.f6555v1;
        if (!(savedState == null || savedState.f6576x == z)) {
            savedState.f6576x = z;
        }
        this.f6543b1 = z;
        mo9200C1();
    }

    /* renamed from: S0 */
    public void mo8897S0(AccessibilityEvent accessibilityEvent) {
        super.mo8897S0(accessibilityEvent);
        if (mo9234U() > 0) {
            View n2 = mo9584n2(false);
            View m2 = mo9583m2(false);
            if (n2 != null && m2 != null) {
                int o0 = mo9271o0(n2);
                int o02 = mo9271o0(m2);
                if (o0 < o02) {
                    accessibilityEvent.setFromIndex(o0);
                    accessibilityEvent.setToIndex(o02);
                    return;
                }
                accessibilityEvent.setFromIndex(o02);
                accessibilityEvent.setToIndex(o0);
            }
        }
    }

    /* renamed from: S2 */
    public void mo9557S2(int i) {
        mo8924r((String) null);
        if (i != this.f6539U) {
            mo9540B2();
            this.f6539U = i;
            this.f6547o1 = new BitSet(this.f6539U);
            this.f6540X = new C1267c[this.f6539U];
            for (int i2 = 0; i2 < this.f6539U; i2++) {
                this.f6540X[i2] = new C1267c(i2);
            }
            mo9200C1();
        }
    }

    /* renamed from: T2 */
    public final void mo9558T2(int i, int i2) {
        for (int i3 = 0; i3 < this.f6539U; i3++) {
            if (!this.f6540X[i3].f6586a.isEmpty()) {
                mo9569Z2(this.f6540X[i3], i, i2);
            }
        }
    }

    /* renamed from: U1 */
    public boolean mo8831U1() {
        if (this.f6555v1 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: U2 */
    public final boolean mo9559U2(RecyclerView.C1260x xVar, C1266b bVar) {
        int i;
        if (this.f6552t1) {
            i = mo9586p2(xVar.mo9525b());
        } else {
            i = mo9582l2(xVar.mo9525b());
        }
        bVar.f6579a = i;
        bVar.f6580b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: V1 */
    public final void mo9560V1(View view) {
        for (int i = this.f6539U - 1; i >= 0; i--) {
            this.f6540X[i].mo9634a(view);
        }
    }

    /* renamed from: V2 */
    public boolean mo9561V2(RecyclerView.C1260x xVar, C1266b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!xVar.mo9528e() && (i = this.f6548p1) != -1) {
            if (i < 0 || i >= xVar.mo9525b()) {
                this.f6548p1 = -1;
                this.f6549q1 = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.f6555v1;
                if (savedState == null || savedState.f6569a == -1 || savedState.f6571e < 1) {
                    View N = mo8888N(this.f6548p1);
                    if (N != null) {
                        if (this.f6545e1) {
                            i2 = mo9590t2();
                        } else {
                            i2 = mo9589s2();
                        }
                        bVar.f6579a = i2;
                        if (this.f6549q1 != Integer.MIN_VALUE) {
                            if (bVar.f6581c) {
                                bVar.f6580b = (this.f6541Y.mo9936i() - this.f6549q1) - this.f6541Y.mo9931d(N);
                            } else {
                                bVar.f6580b = (this.f6541Y.mo9940m() + this.f6549q1) - this.f6541Y.mo9934g(N);
                            }
                            return true;
                        } else if (this.f6541Y.mo9932e(N) > this.f6541Y.mo9941n()) {
                            if (bVar.f6581c) {
                                i3 = this.f6541Y.mo9936i();
                            } else {
                                i3 = this.f6541Y.mo9940m();
                            }
                            bVar.f6580b = i3;
                            return true;
                        } else {
                            int g = this.f6541Y.mo9934g(N) - this.f6541Y.mo9940m();
                            if (g < 0) {
                                bVar.f6580b = -g;
                                return true;
                            }
                            int i4 = this.f6541Y.mo9936i() - this.f6541Y.mo9931d(N);
                            if (i4 < 0) {
                                bVar.f6580b = i4;
                                return true;
                            }
                            bVar.f6580b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f6548p1;
                        bVar.f6579a = i5;
                        int i6 = this.f6549q1;
                        if (i6 == Integer.MIN_VALUE) {
                            if (mo9570a2(i5) == 1) {
                                z = true;
                            }
                            bVar.f6581c = z;
                            bVar.mo9630a();
                        } else {
                            bVar.mo9631b(i6);
                        }
                        bVar.f6582d = true;
                    }
                } else {
                    bVar.f6580b = Integer.MIN_VALUE;
                    bVar.f6579a = this.f6548p1;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: W1 */
    public final void mo9562W1(C1266b bVar) {
        int i;
        SavedState savedState = this.f6555v1;
        int i2 = savedState.f6571e;
        if (i2 > 0) {
            if (i2 == this.f6539U) {
                for (int i3 = 0; i3 < this.f6539U; i3++) {
                    this.f6540X[i3].mo9638e();
                    SavedState savedState2 = this.f6555v1;
                    int i4 = savedState2.f6572g[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.f6577y) {
                            i = this.f6541Y.mo9936i();
                        } else {
                            i = this.f6541Y.mo9940m();
                        }
                        i4 += i;
                    }
                    this.f6540X[i3].mo9655v(i4);
                }
            } else {
                savedState.mo9622b();
                SavedState savedState3 = this.f6555v1;
                savedState3.f6569a = savedState3.f6570d;
            }
        }
        SavedState savedState4 = this.f6555v1;
        this.f6553u1 = savedState4.f6568A;
        mo9556R2(savedState4.f6576x);
        mo9552N2();
        SavedState savedState5 = this.f6555v1;
        int i5 = savedState5.f6569a;
        if (i5 != -1) {
            this.f6548p1 = i5;
            bVar.f6581c = savedState5.f6577y;
        } else {
            bVar.f6581c = this.f6545e1;
        }
        if (savedState5.f6573k > 1) {
            LazySpanLookup lazySpanLookup = this.f6550r1;
            lazySpanLookup.f6562a = savedState5.f6574r;
            lazySpanLookup.f6563b = savedState5.f6575s;
        }
    }

    /* renamed from: W2 */
    public void mo9563W2(RecyclerView.C1260x xVar, C1266b bVar) {
        if (!mo9561V2(xVar, bVar) && !mo9559U2(xVar, bVar)) {
            bVar.mo9630a();
            bVar.f6579a = 0;
        }
    }

    /* renamed from: X1 */
    public boolean mo9564X1() {
        int l = this.f6540X[0].mo9645l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f6539U; i++) {
            if (this.f6540X[i].mo9645l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: X2 */
    public final void mo9565X2(int i, RecyclerView.C1260x xVar) {
        int i2;
        int i3;
        int c;
        boolean z;
        C1327l lVar = this.f6554v0;
        boolean z2 = false;
        lVar.f6815b = 0;
        lVar.f6816c = i;
        if (!mo9204F0() || (c = xVar.mo9526c()) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            boolean z3 = this.f6545e1;
            if (c < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i3 = this.f6541Y.mo9941n();
                i2 = 0;
            } else {
                i2 = this.f6541Y.mo9941n();
                i3 = 0;
            }
        }
        if (mo9239X()) {
            this.f6554v0.f6819f = this.f6541Y.mo9940m() - i2;
            this.f6554v0.f6820g = this.f6541Y.mo9936i() + i3;
        } else {
            this.f6554v0.f6820g = this.f6541Y.mo9935h() + i3;
            this.f6554v0.f6819f = -i2;
        }
        C1327l lVar2 = this.f6554v0;
        lVar2.f6821h = false;
        lVar2.f6814a = true;
        if (this.f6541Y.mo9938k() == 0 && this.f6541Y.mo9935h() == 0) {
            z2 = true;
        }
        lVar2.f6822i = z2;
    }

    /* renamed from: Y1 */
    public boolean mo9566Y1() {
        int p = this.f6540X[0].mo9649p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f6539U; i++) {
            if (this.f6540X[i].mo9649p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y2 */
    public void mo9567Y2(int i) {
        this.f6546k0 = i / this.f6539U;
        this.f6556w1 = View.MeasureSpec.makeMeasureSpec(i, this.f6542Z.mo9938k());
    }

    /* renamed from: Z0 */
    public void mo8839Z0(RecyclerView recyclerView, int i, int i2) {
        mo9596z2(i, i2, 1);
    }

    /* renamed from: Z1 */
    public final void mo9568Z1(View view, LayoutParams layoutParams, C1327l lVar) {
        if (lVar.f6818e == 1) {
            if (layoutParams.f6561r) {
                mo9560V1(view);
            } else {
                layoutParams.f6560k.mo9634a(view);
            }
        } else if (layoutParams.f6561r) {
            mo9547I2(view);
        } else {
            layoutParams.f6560k.mo9654u(view);
        }
    }

    /* renamed from: Z2 */
    public final void mo9569Z2(C1267c cVar, int i, int i2) {
        int j = cVar.mo9643j();
        if (i == -1) {
            if (cVar.mo9648o() + j <= i2) {
                this.f6547o1.set(cVar.f6590e, false);
            }
        } else if (cVar.mo9644k() - j >= i2) {
            this.f6547o1.set(cVar.f6590e, false);
        }
    }

    /* renamed from: a */
    public PointF mo8904a(int i) {
        int a2 = mo9570a2(i);
        PointF pointF = new PointF();
        if (a2 == 0) {
            return null;
        }
        if (this.f6544e0 == 0) {
            pointF.x = (float) a2;
            pointF.y = Utils.FLOAT_EPSILON;
        } else {
            pointF.x = Utils.FLOAT_EPSILON;
            pointF.y = (float) a2;
        }
        return pointF;
    }

    /* renamed from: a1 */
    public void mo8841a1(RecyclerView recyclerView) {
        this.f6550r1.mo9599b();
        mo9200C1();
    }

    /* renamed from: a2 */
    public final int mo9570a2(int i) {
        boolean z;
        if (mo9234U() != 0) {
            if (i < mo9589s2()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f6545e1) {
                return -1;
            }
            return 1;
        } else if (this.f6545e1) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: a3 */
    public final int mo9571a3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: b1 */
    public void mo8843b1(RecyclerView recyclerView, int i, int i2, int i3) {
        mo9596z2(i, i2, 8);
    }

    /* renamed from: b2 */
    public boolean mo9572b2() {
        int i;
        int i2;
        int i3;
        if (mo9234U() == 0 || this.f6551s1 == 0 || !mo9294y0()) {
            return false;
        }
        if (this.f6545e1) {
            i2 = mo9590t2();
            i = mo9589s2();
        } else {
            i2 = mo9589s2();
            i = mo9590t2();
        }
        if (i2 == 0 && mo9539A2() != null) {
            this.f6550r1.mo9599b();
            mo9202D1();
            mo9200C1();
            return true;
        } else if (!this.f6559z1) {
            return false;
        } else {
            if (this.f6545e1) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem e = this.f6550r1.mo9602e(i2, i4, i3, true);
            if (e == null) {
                this.f6559z1 = false;
                this.f6550r1.mo9601d(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem e2 = this.f6550r1.mo9602e(i2, e.f6564a, i3 * -1, true);
            if (e2 == null) {
                this.f6550r1.mo9601d(e.f6564a);
            } else {
                this.f6550r1.mo9601d(e2.f6564a + 1);
            }
            mo9202D1();
            mo9200C1();
            return true;
        }
    }

    /* renamed from: c1 */
    public void mo8845c1(RecyclerView recyclerView, int i, int i2) {
        mo9596z2(i, i2, 2);
    }

    /* renamed from: c2 */
    public final boolean mo9573c2(C1267c cVar) {
        if (this.f6545e1) {
            if (cVar.mo9644k() < this.f6541Y.mo9936i()) {
                ArrayList<View> arrayList = cVar.f6586a;
                return !cVar.mo9647n(arrayList.get(arrayList.size() - 1)).f6561r;
            }
        } else if (cVar.mo9648o() > this.f6541Y.mo9940m()) {
            return !cVar.mo9647n(cVar.f6586a.get(0)).f6561r;
        }
        return false;
    }

    /* renamed from: d2 */
    public final int mo9574d2(RecyclerView.C1260x xVar) {
        if (mo9234U() == 0) {
            return 0;
        }
        return C1341t.m9716a(xVar, this.f6541Y, mo9584n2(!this.f6536A1), mo9583m2(!this.f6536A1), this, this.f6536A1);
    }

    /* renamed from: e1 */
    public void mo8848e1(RecyclerView recyclerView, int i, int i2, Object obj) {
        mo9596z2(i, i2, 4);
    }

    /* renamed from: e2 */
    public final int mo9575e2(RecyclerView.C1260x xVar) {
        if (mo9234U() == 0) {
            return 0;
        }
        return C1341t.m9717b(xVar, this.f6541Y, mo9584n2(!this.f6536A1), mo9583m2(!this.f6536A1), this, this.f6536A1, this.f6545e1);
    }

    /* renamed from: f1 */
    public void mo8850f1(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        mo9544F2(tVar, xVar, true);
    }

    /* renamed from: f2 */
    public final int mo9576f2(RecyclerView.C1260x xVar) {
        if (mo9234U() == 0) {
            return 0;
        }
        return C1341t.m9718c(xVar, this.f6541Y, mo9584n2(!this.f6536A1), mo9583m2(!this.f6536A1), this, this.f6536A1);
    }

    /* renamed from: g1 */
    public void mo8852g1(RecyclerView.C1260x xVar) {
        super.mo8852g1(xVar);
        this.f6548p1 = -1;
        this.f6549q1 = Integer.MIN_VALUE;
        this.f6555v1 = null;
        this.f6558y1.mo9632c();
    }

    /* renamed from: g2 */
    public final int mo9577g2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f6544e0 == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f6544e0 == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f6544e0 == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f6544e0 == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f6544e0 != 1 && mo9541C2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f6544e0 != 1 && mo9541C2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: h2 */
    public final LazySpanLookup.FullSpanItem mo9578h2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f6566e = new int[this.f6539U];
        for (int i2 = 0; i2 < this.f6539U; i2++) {
            fullSpanItem.f6566e[i2] = i - this.f6540X[i2].mo9645l(i);
        }
        return fullSpanItem;
    }

    /* renamed from: i2 */
    public final LazySpanLookup.FullSpanItem mo9579i2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f6566e = new int[this.f6539U];
        for (int i2 = 0; i2 < this.f6539U; i2++) {
            fullSpanItem.f6566e[i2] = this.f6540X[i2].mo9649p(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: j2 */
    public final void mo9580j2() {
        this.f6541Y = C1334q.m9643b(this, this.f6544e0);
        this.f6542Z = C1334q.m9643b(this, 1 - this.f6544e0);
    }

    /* renamed from: k1 */
    public void mo8916k1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f6555v1 = savedState;
            if (this.f6548p1 != -1) {
                savedState.mo9621a();
                this.f6555v1.mo9622b();
            }
            mo9200C1();
        }
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: k2 */
    public final int mo9581k2(RecyclerView.C1254t tVar, C1327l lVar, RecyclerView.C1260x xVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        C1267c cVar;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        RecyclerView.C1254t tVar2 = tVar;
        C1327l lVar2 = lVar;
        ? r9 = 0;
        this.f6547o1.set(0, this.f6539U, true);
        if (this.f6554v0.f6822i) {
            if (lVar2.f6818e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (lVar2.f6818e == 1) {
            i = lVar2.f6820g + lVar2.f6815b;
        } else {
            i = lVar2.f6819f - lVar2.f6815b;
        }
        int i12 = i;
        mo9558T2(lVar2.f6818e, i12);
        if (this.f6545e1) {
            i2 = this.f6541Y.mo9936i();
        } else {
            i2 = this.f6541Y.mo9940m();
        }
        int i13 = i2;
        boolean z4 = false;
        while (lVar.mo9899a(xVar) && (this.f6554v0.f6822i || !this.f6547o1.isEmpty())) {
            View b = lVar2.mo9900b(tVar2);
            LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
            int a = layoutParams.mo9303a();
            int g = this.f6550r1.mo9604g(a);
            if (g == -1) {
                z = true;
            } else {
                z = r9;
            }
            if (z) {
                if (layoutParams.f6561r) {
                    cVar = this.f6540X[r9];
                } else {
                    cVar = mo9595y2(lVar2);
                }
                this.f6550r1.mo9611n(a, cVar);
            } else {
                cVar = this.f6540X[g];
            }
            C1267c cVar2 = cVar;
            layoutParams.f6560k = cVar2;
            if (lVar2.f6818e == 1) {
                mo9270o(b);
            } else {
                mo9273p(b, r9);
            }
            mo9543E2(b, layoutParams, r9);
            if (lVar2.f6818e == 1) {
                if (layoutParams.f6561r) {
                    i11 = mo9591u2(i13);
                } else {
                    i11 = cVar2.mo9645l(i13);
                }
                int e = this.f6541Y.mo9932e(b) + i11;
                if (z && layoutParams.f6561r) {
                    LazySpanLookup.FullSpanItem h2 = mo9578h2(i11);
                    h2.f6565d = -1;
                    h2.f6564a = a;
                    this.f6550r1.mo9598a(h2);
                }
                i4 = e;
                i5 = i11;
            } else {
                if (layoutParams.f6561r) {
                    i10 = mo9594x2(i13);
                } else {
                    i10 = cVar2.mo9649p(i13);
                }
                i5 = i10 - this.f6541Y.mo9932e(b);
                if (z && layoutParams.f6561r) {
                    LazySpanLookup.FullSpanItem i22 = mo9579i2(i10);
                    i22.f6565d = 1;
                    i22.f6564a = a;
                    this.f6550r1.mo9598a(i22);
                }
                i4 = i10;
            }
            if (layoutParams.f6561r && lVar2.f6817d == -1) {
                if (z) {
                    this.f6559z1 = true;
                } else {
                    if (lVar2.f6818e == 1) {
                        z3 = mo9564X1();
                    } else {
                        z3 = mo9566Y1();
                    }
                    if (!z3) {
                        LazySpanLookup.FullSpanItem f = this.f6550r1.mo9603f(a);
                        if (f != null) {
                            f.f6567g = true;
                        }
                        this.f6559z1 = true;
                    }
                }
            }
            mo9568Z1(b, layoutParams, lVar2);
            if (!mo9541C2() || this.f6544e0 != 1) {
                if (layoutParams.f6561r) {
                    i8 = this.f6542Z.mo9940m();
                } else {
                    i8 = (cVar2.f6590e * this.f6546k0) + this.f6542Z.mo9940m();
                }
                i7 = i8;
                i6 = this.f6542Z.mo9932e(b) + i8;
            } else {
                if (layoutParams.f6561r) {
                    i9 = this.f6542Z.mo9936i();
                } else {
                    i9 = this.f6542Z.mo9936i() - (((this.f6539U - 1) - cVar2.f6590e) * this.f6546k0);
                }
                i6 = i9;
                i7 = i9 - this.f6542Z.mo9932e(b);
            }
            if (this.f6544e0 == 1) {
                mo9207H0(b, i7, i5, i6, i4);
            } else {
                mo9207H0(b, i5, i7, i4, i6);
            }
            if (layoutParams.f6561r) {
                mo9558T2(this.f6554v0.f6818e, i12);
            } else {
                mo9569Z2(cVar2, this.f6554v0.f6818e, i12);
            }
            mo9548J2(tVar2, this.f6554v0);
            if (this.f6554v0.f6821h && b.hasFocusable()) {
                if (layoutParams.f6561r) {
                    this.f6547o1.clear();
                } else {
                    z2 = false;
                    this.f6547o1.set(cVar2.f6590e, false);
                    r9 = z2;
                    z4 = true;
                }
            }
            z2 = false;
            r9 = z2;
            z4 = true;
        }
        int i14 = r9;
        if (!z4) {
            mo9548J2(tVar2, this.f6554v0);
        }
        if (this.f6554v0.f6818e == -1) {
            i3 = this.f6541Y.mo9940m() - mo9594x2(this.f6541Y.mo9940m());
        } else {
            i3 = mo9591u2(this.f6541Y.mo9936i()) - this.f6541Y.mo9936i();
        }
        if (i3 > 0) {
            return Math.min(lVar2.f6815b, i3);
        }
        return i14;
    }

    /* renamed from: l1 */
    public Parcelable mo8918l1() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.f6555v1 != null) {
            return new SavedState(this.f6555v1);
        }
        SavedState savedState = new SavedState();
        savedState.f6576x = this.f6543b1;
        savedState.f6577y = this.f6552t1;
        savedState.f6568A = this.f6553u1;
        LazySpanLookup lazySpanLookup = this.f6550r1;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f6562a) == null) {
            savedState.f6573k = 0;
        } else {
            savedState.f6574r = iArr;
            savedState.f6573k = iArr.length;
            savedState.f6575s = lazySpanLookup.f6563b;
        }
        if (mo9234U() > 0) {
            if (this.f6552t1) {
                i = mo9590t2();
            } else {
                i = mo9589s2();
            }
            savedState.f6569a = i;
            savedState.f6570d = mo9585o2();
            int i4 = this.f6539U;
            savedState.f6571e = i4;
            savedState.f6572g = new int[i4];
            for (int i5 = 0; i5 < this.f6539U; i5++) {
                if (this.f6552t1) {
                    i2 = this.f6540X[i5].mo9645l(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f6541Y.mo9936i();
                    } else {
                        savedState.f6572g[i5] = i2;
                    }
                } else {
                    i2 = this.f6540X[i5].mo9649p(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f6541Y.mo9940m();
                    } else {
                        savedState.f6572g[i5] = i2;
                    }
                }
                i2 -= i3;
                savedState.f6572g[i5] = i2;
            }
        } else {
            savedState.f6569a = -1;
            savedState.f6570d = -1;
            savedState.f6571e = 0;
        }
        return savedState;
    }

    /* renamed from: l2 */
    public final int mo9582l2(int i) {
        int U = mo9234U();
        for (int i2 = 0; i2 < U; i2++) {
            int o0 = mo9271o0(mo9231T(i2));
            if (o0 >= 0 && o0 < i) {
                return o0;
            }
        }
        return 0;
    }

    /* renamed from: m1 */
    public void mo9266m1(int i) {
        if (i == 0) {
            mo9572b2();
        }
    }

    /* renamed from: m2 */
    public View mo9583m2(boolean z) {
        int m = this.f6541Y.mo9940m();
        int i = this.f6541Y.mo9936i();
        View view = null;
        for (int U = mo9234U() - 1; U >= 0; U--) {
            View T = mo9231T(U);
            int g = this.f6541Y.mo9934g(T);
            int d = this.f6541Y.mo9931d(T);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return T;
                }
                if (view == null) {
                    view = T;
                }
            }
        }
        return view;
    }

    /* renamed from: n2 */
    public View mo9584n2(boolean z) {
        int m = this.f6541Y.mo9940m();
        int i = this.f6541Y.mo9936i();
        int U = mo9234U();
        View view = null;
        for (int i2 = 0; i2 < U; i2++) {
            View T = mo9231T(i2);
            int g = this.f6541Y.mo9934g(T);
            if (this.f6541Y.mo9931d(T) > m && g < i) {
                if (g >= m || !z) {
                    return T;
                }
                if (view == null) {
                    view = T;
                }
            }
        }
        return view;
    }

    /* renamed from: o2 */
    public int mo9585o2() {
        View view;
        if (this.f6545e1) {
            view = mo9583m2(true);
        } else {
            view = mo9584n2(true);
        }
        if (view == null) {
            return -1;
        }
        return mo9271o0(view);
    }

    /* renamed from: p2 */
    public final int mo9586p2(int i) {
        for (int U = mo9234U() - 1; U >= 0; U--) {
            int o0 = mo9271o0(mo9231T(U));
            if (o0 >= 0 && o0 < i) {
                return o0;
            }
        }
        return 0;
    }

    /* renamed from: q2 */
    public final void mo9587q2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, boolean z) {
        int i;
        int u2 = mo9591u2(Integer.MIN_VALUE);
        if (u2 != Integer.MIN_VALUE && (i = this.f6541Y.mo9936i() - u2) > 0) {
            int i2 = i - (-mo9553O2(-i, tVar, xVar));
            if (z && i2 > 0) {
                this.f6541Y.mo9945r(i2);
            }
        }
    }

    /* renamed from: r */
    public void mo8924r(String str) {
        if (this.f6555v1 == null) {
            super.mo8924r(str);
        }
    }

    /* renamed from: r2 */
    public final void mo9588r2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, boolean z) {
        int m;
        int x2 = mo9594x2(Integer.MAX_VALUE);
        if (x2 != Integer.MAX_VALUE && (m = x2 - this.f6541Y.mo9940m()) > 0) {
            int O2 = m - mo9553O2(m, tVar, xVar);
            if (z && O2 > 0) {
                this.f6541Y.mo9945r(-O2);
            }
        }
    }

    /* renamed from: s2 */
    public int mo9589s2() {
        if (mo9234U() == 0) {
            return 0;
        }
        return mo9271o0(mo9231T(0));
    }

    /* renamed from: t2 */
    public int mo9590t2() {
        int U = mo9234U();
        if (U == 0) {
            return 0;
        }
        return mo9271o0(mo9231T(U - 1));
    }

    /* renamed from: u2 */
    public final int mo9591u2(int i) {
        int l = this.f6540X[0].mo9645l(i);
        for (int i2 = 1; i2 < this.f6539U; i2++) {
            int l2 = this.f6540X[i2].mo9645l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: v */
    public boolean mo8929v() {
        if (this.f6544e0 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v2 */
    public final int mo9592v2(int i) {
        int p = this.f6540X[0].mo9649p(i);
        for (int i2 = 1; i2 < this.f6539U; i2++) {
            int p2 = this.f6540X[i2].mo9649p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: w */
    public boolean mo8931w() {
        if (this.f6544e0 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: w2 */
    public final int mo9593w2(int i) {
        int l = this.f6540X[0].mo9645l(i);
        for (int i2 = 1; i2 < this.f6539U; i2++) {
            int l2 = this.f6540X[i2].mo9645l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: x */
    public boolean mo8862x(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: x2 */
    public final int mo9594x2(int i) {
        int p = this.f6540X[0].mo9649p(i);
        for (int i2 = 1; i2 < this.f6539U; i2++) {
            int p2 = this.f6540X[i2].mo9649p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: y2 */
    public final C1267c mo9595y2(C1327l lVar) {
        int i;
        int i2;
        int i3 = -1;
        if (mo9545G2(lVar.f6818e)) {
            i2 = this.f6539U - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f6539U;
            i = 1;
        }
        C1267c cVar = null;
        if (lVar.f6818e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.f6541Y.mo9940m();
            while (i2 != i3) {
                C1267c cVar2 = this.f6540X[i2];
                int l = cVar2.mo9645l(m);
                if (l < i4) {
                    cVar = cVar2;
                    i4 = l;
                }
                i2 += i;
            }
            return cVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.f6541Y.mo9936i();
        while (i2 != i3) {
            C1267c cVar3 = this.f6540X[i2];
            int p = cVar3.mo9649p(i6);
            if (p > i5) {
                cVar = cVar3;
                i5 = p;
            }
            i2 += i;
        }
        return cVar;
    }

    /* renamed from: z */
    public void mo8934z(int i, int i2, RecyclerView.C1260x xVar, RecyclerView.LayoutManager.C1228c cVar) {
        int i3;
        int i4;
        if (this.f6544e0 != 0) {
            i = i2;
        }
        if (mo9234U() != 0 && i != 0) {
            mo9546H2(i, xVar);
            int[] iArr = this.f6537B1;
            if (iArr == null || iArr.length < this.f6539U) {
                this.f6537B1 = new int[this.f6539U];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f6539U; i6++) {
                C1327l lVar = this.f6554v0;
                if (lVar.f6817d == -1) {
                    i4 = lVar.f6819f;
                    i3 = this.f6540X[i6].mo9649p(i4);
                } else {
                    i4 = this.f6540X[i6].mo9645l(lVar.f6820g);
                    i3 = this.f6554v0.f6820g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f6537B1[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f6537B1, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f6554v0.mo9899a(xVar); i8++) {
                cVar.mo9302a(this.f6554v0.f6816c, this.f6537B1[i8]);
                C1327l lVar2 = this.f6554v0;
                lVar2.f6816c += lVar2.f6817d;
            }
        }
    }

    /* renamed from: z0 */
    public boolean mo8935z0() {
        if (this.f6551s1 != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: z2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9596z2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f6545e1
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo9590t2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo9589s2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f6550r1
            r4.mo9605h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f6550r1
            r9.mo9608k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f6550r1
            r7.mo9607j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f6550r1
            r9.mo9608k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f6550r1
            r9.mo9607j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f6545e1
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo9589s2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo9590t2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo9200C1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo9596z2(int, int, int):void");
    }

    public static class LazySpanLookup {

        /* renamed from: a */
        public int[] f6562a;

        /* renamed from: b */
        public List<FullSpanItem> f6563b;

        /* renamed from: a */
        public void mo9598a(FullSpanItem fullSpanItem) {
            if (this.f6563b == null) {
                this.f6563b = new ArrayList();
            }
            int size = this.f6563b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f6563b.get(i);
                if (fullSpanItem2.f6564a == fullSpanItem.f6564a) {
                    this.f6563b.remove(i);
                }
                if (fullSpanItem2.f6564a >= fullSpanItem.f6564a) {
                    this.f6563b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f6563b.add(fullSpanItem);
        }

        /* renamed from: b */
        public void mo9599b() {
            int[] iArr = this.f6562a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f6563b = null;
        }

        /* renamed from: c */
        public void mo9600c(int i) {
            int[] iArr = this.f6562a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f6562a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo9612o(i)];
                this.f6562a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f6562a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public int mo9601d(int i) {
            List<FullSpanItem> list = this.f6563b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f6563b.get(size).f6564a >= i) {
                        this.f6563b.remove(size);
                    }
                }
            }
            return mo9605h(i);
        }

        /* renamed from: e */
        public FullSpanItem mo9602e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f6563b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f6563b.get(i4);
                int i5 = fullSpanItem.f6564a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f6565d == i3 || (z && fullSpanItem.f6567g))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem mo9603f(int i) {
            List<FullSpanItem> list = this.f6563b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f6563b.get(size);
                if (fullSpanItem.f6564a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        public int mo9604g(int i) {
            int[] iArr = this.f6562a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: h */
        public int mo9605h(int i) {
            int[] iArr = this.f6562a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = mo9606i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f6562a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f6562a.length;
            }
            int min = Math.min(i2 + 1, this.f6562a.length);
            Arrays.fill(this.f6562a, i, min, -1);
            return min;
        }

        /* renamed from: i */
        public final int mo9606i(int i) {
            if (this.f6563b == null) {
                return -1;
            }
            FullSpanItem f = mo9603f(i);
            if (f != null) {
                this.f6563b.remove(f);
            }
            int size = this.f6563b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f6563b.get(i2).f6564a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f6563b.remove(i2);
            return this.f6563b.get(i2).f6564a;
        }

        /* renamed from: j */
        public void mo9607j(int i, int i2) {
            int[] iArr = this.f6562a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo9600c(i3);
                int[] iArr2 = this.f6562a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f6562a, i, i3, -1);
                mo9609l(i, i2);
            }
        }

        /* renamed from: k */
        public void mo9608k(int i, int i2) {
            int[] iArr = this.f6562a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo9600c(i3);
                int[] iArr2 = this.f6562a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f6562a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                mo9610m(i, i2);
            }
        }

        /* renamed from: l */
        public final void mo9609l(int i, int i2) {
            List<FullSpanItem> list = this.f6563b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f6563b.get(size);
                    int i3 = fullSpanItem.f6564a;
                    if (i3 >= i) {
                        fullSpanItem.f6564a = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        public final void mo9610m(int i, int i2) {
            List<FullSpanItem> list = this.f6563b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f6563b.get(size);
                    int i4 = fullSpanItem.f6564a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f6563b.remove(size);
                        } else {
                            fullSpanItem.f6564a = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: n */
        public void mo9611n(int i, C1267c cVar) {
            mo9600c(i);
            this.f6562a[i] = cVar.f6590e;
        }

        /* renamed from: o */
        public int mo9612o(int i) {
            int length = this.f6562a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C1263a();

            /* renamed from: a */
            public int f6564a;

            /* renamed from: d */
            public int f6565d;

            /* renamed from: e */
            public int[] f6566e;

            /* renamed from: g */
            public boolean f6567g;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            public class C1263a implements Parcelable.Creator<FullSpanItem> {
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f6564a = parcel.readInt();
                this.f6565d = parcel.readInt();
                this.f6567g = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f6566e = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            public int mo9613a(int i) {
                int[] iArr = this.f6566e;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f6564a + ", mGapDir=" + this.f6565d + ", mHasUnwantedGapAfter=" + this.f6567g + ", mGapPerSpan=" + Arrays.toString(this.f6566e) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f6564a);
                parcel.writeInt(this.f6565d);
                parcel.writeInt(this.f6567g ? 1 : 0);
                int[] iArr = this.f6566e;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f6566e);
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f6544e0 = i2;
        mo9557S2(i);
        this.f6554v0 = new C1327l();
        mo9580j2();
    }
}
