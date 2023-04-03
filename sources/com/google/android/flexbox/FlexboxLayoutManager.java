package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.C1328m;
import androidx.recyclerview.widget.C1334q;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.flexbox.C3998b;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements g42, RecyclerView.C1257w.C1259b {

    /* renamed from: F1 */
    public static final Rect f21959F1 = new Rect();

    /* renamed from: A1 */
    public SparseArray<View> f21960A1;

    /* renamed from: B1 */
    public final Context f21961B1;

    /* renamed from: C1 */
    public View f21962C1;

    /* renamed from: D1 */
    public int f21963D1;

    /* renamed from: E1 */
    public C3998b.C4000b f21964E1;

    /* renamed from: U */
    public int f21965U;

    /* renamed from: X */
    public int f21966X;

    /* renamed from: Y */
    public int f21967Y;

    /* renamed from: Z */
    public int f21968Z;

    /* renamed from: b1 */
    public List<C3997a> f21969b1;

    /* renamed from: e0 */
    public int f21970e0;

    /* renamed from: e1 */
    public final C3998b f21971e1;

    /* renamed from: k0 */
    public boolean f21972k0;

    /* renamed from: o1 */
    public RecyclerView.C1254t f21973o1;

    /* renamed from: p1 */
    public RecyclerView.C1260x f21974p1;

    /* renamed from: q1 */
    public C3996c f21975q1;

    /* renamed from: r1 */
    public C3995b f21976r1;

    /* renamed from: s1 */
    public C1334q f21977s1;

    /* renamed from: t1 */
    public C1334q f21978t1;

    /* renamed from: u1 */
    public SavedState f21979u1;

    /* renamed from: v0 */
    public boolean f21980v0;

    /* renamed from: v1 */
    public int f21981v1;

    /* renamed from: w1 */
    public int f21982w1;

    /* renamed from: x1 */
    public int f21983x1;

    /* renamed from: y1 */
    public int f21984y1;

    /* renamed from: z1 */
    public boolean f21985z1;

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    public class C3995b {

        /* renamed from: a */
        public int f21997a;

        /* renamed from: b */
        public int f21998b;

        /* renamed from: c */
        public int f21999c;

        /* renamed from: d */
        public int f22000d;

        /* renamed from: e */
        public boolean f22001e;

        /* renamed from: f */
        public boolean f22002f;

        /* renamed from: g */
        public boolean f22003g;

        public C3995b() {
            this.f22000d = 0;
        }

        /* renamed from: l */
        public static /* synthetic */ int m33407l(C3995b bVar, int i) {
            int i2 = bVar.f22000d + i;
            bVar.f22000d = i2;
            return i2;
        }

        /* renamed from: r */
        public final void mo30323r() {
            int i;
            int i2;
            if (FlexboxLayoutManager.this.mo30221l() || !FlexboxLayoutManager.this.f21972k0) {
                if (this.f22001e) {
                    i = FlexboxLayoutManager.this.f21977s1.mo9936i();
                } else {
                    i = FlexboxLayoutManager.this.f21977s1.mo9940m();
                }
                this.f21999c = i;
                return;
            }
            if (this.f22001e) {
                i2 = FlexboxLayoutManager.this.f21977s1.mo9936i();
            } else {
                i2 = FlexboxLayoutManager.this.mo9288v0() - FlexboxLayoutManager.this.f21977s1.mo9940m();
            }
            this.f21999c = i2;
        }

        /* renamed from: s */
        public final void mo30324s(View view) {
            C1334q qVar;
            if (FlexboxLayoutManager.this.f21966X == 0) {
                qVar = FlexboxLayoutManager.this.f21978t1;
            } else {
                qVar = FlexboxLayoutManager.this.f21977s1;
            }
            if (FlexboxLayoutManager.this.mo30221l() || !FlexboxLayoutManager.this.f21972k0) {
                if (this.f22001e) {
                    this.f21999c = qVar.mo9931d(view) + qVar.mo9942o();
                } else {
                    this.f21999c = qVar.mo9934g(view);
                }
            } else if (this.f22001e) {
                this.f21999c = qVar.mo9934g(view) + qVar.mo9942o();
            } else {
                this.f21999c = qVar.mo9931d(view);
            }
            this.f21997a = FlexboxLayoutManager.this.mo9271o0(view);
            int i = 0;
            this.f22003g = false;
            int[] iArr = FlexboxLayoutManager.this.f21971e1.f22035c;
            int i2 = this.f21997a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            if (i3 != -1) {
                i = i3;
            }
            this.f21998b = i;
            if (FlexboxLayoutManager.this.f21969b1.size() > this.f21998b) {
                this.f21997a = ((C3997a) FlexboxLayoutManager.this.f21969b1.get(this.f21998b)).f22029o;
            }
        }

        /* renamed from: t */
        public final void mo30325t() {
            this.f21997a = -1;
            this.f21998b = -1;
            this.f21999c = Integer.MIN_VALUE;
            boolean z = false;
            this.f22002f = false;
            this.f22003g = false;
            if (FlexboxLayoutManager.this.mo30221l()) {
                if (FlexboxLayoutManager.this.f21966X == 0) {
                    if (FlexboxLayoutManager.this.f21965U == 1) {
                        z = true;
                    }
                    this.f22001e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f21966X == 2) {
                    z = true;
                }
                this.f22001e = z;
            } else if (FlexboxLayoutManager.this.f21966X == 0) {
                if (FlexboxLayoutManager.this.f21965U == 3) {
                    z = true;
                }
                this.f22001e = z;
            } else {
                if (FlexboxLayoutManager.this.f21966X == 2) {
                    z = true;
                }
                this.f22001e = z;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f21997a + ", mFlexLinePosition=" + this.f21998b + ", mCoordinate=" + this.f21999c + ", mPerpendicularCoordinate=" + this.f22000d + ", mLayoutFromEnd=" + this.f22001e + ", mValid=" + this.f22002f + ", mAssignedFromSavedState=" + this.f22003g + '}';
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    public static class C3996c {

        /* renamed from: a */
        public int f22005a;

        /* renamed from: b */
        public boolean f22006b;

        /* renamed from: c */
        public int f22007c;

        /* renamed from: d */
        public int f22008d;

        /* renamed from: e */
        public int f22009e;

        /* renamed from: f */
        public int f22010f;

        /* renamed from: g */
        public int f22011g;

        /* renamed from: h */
        public int f22012h;

        /* renamed from: i */
        public int f22013i;

        /* renamed from: j */
        public boolean f22014j;

        public C3996c() {
            this.f22012h = 1;
            this.f22013i = 1;
        }

        /* renamed from: c */
        public static /* synthetic */ int m33421c(C3996c cVar, int i) {
            int i2 = cVar.f22009e + i;
            cVar.f22009e = i2;
            return i2;
        }

        /* renamed from: d */
        public static /* synthetic */ int m33422d(C3996c cVar, int i) {
            int i2 = cVar.f22009e - i;
            cVar.f22009e = i2;
            return i2;
        }

        /* renamed from: i */
        public static /* synthetic */ int m33427i(C3996c cVar, int i) {
            int i2 = cVar.f22005a - i;
            cVar.f22005a = i2;
            return i2;
        }

        /* renamed from: l */
        public static /* synthetic */ int m33430l(C3996c cVar) {
            int i = cVar.f22007c;
            cVar.f22007c = i + 1;
            return i;
        }

        /* renamed from: m */
        public static /* synthetic */ int m33431m(C3996c cVar) {
            int i = cVar.f22007c;
            cVar.f22007c = i - 1;
            return i;
        }

        /* renamed from: n */
        public static /* synthetic */ int m33432n(C3996c cVar, int i) {
            int i2 = cVar.f22007c + i;
            cVar.f22007c = i2;
            return i2;
        }

        /* renamed from: q */
        public static /* synthetic */ int m33435q(C3996c cVar, int i) {
            int i2 = cVar.f22010f + i;
            cVar.f22010f = i2;
            return i2;
        }

        /* renamed from: u */
        public static /* synthetic */ int m33439u(C3996c cVar, int i) {
            int i2 = cVar.f22008d + i;
            cVar.f22008d = i2;
            return i2;
        }

        /* renamed from: v */
        public static /* synthetic */ int m33440v(C3996c cVar, int i) {
            int i2 = cVar.f22008d - i;
            cVar.f22008d = i2;
            return i2;
        }

        /* renamed from: D */
        public final boolean mo30327D(RecyclerView.C1260x xVar, List<C3997a> list) {
            int i;
            int i2 = this.f22008d;
            if (i2 < 0 || i2 >= xVar.mo9525b() || (i = this.f22007c) < 0 || i >= list.size()) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f22005a + ", mFlexLinePosition=" + this.f22007c + ", mPosition=" + this.f22008d + ", mOffset=" + this.f22009e + ", mScrollingOffset=" + this.f22010f + ", mLastScrollDelta=" + this.f22011g + ", mItemDirection=" + this.f22012h + ", mLayoutDirection=" + this.f22013i + '}';
        }
    }

    public FlexboxLayoutManager(Context context, int i) {
        this(context, i, 1);
    }

    /* renamed from: E0 */
    public static boolean m33271E0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i) {
                return true;
            }
            return false;
        } else if (size >= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: O1 */
    private boolean m33272O1(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        if (view.isLayoutRequested() || !mo9201D0() || !m33271E0(view.getWidth(), i, layoutParams.width) || !m33271E0(view.getHeight(), i2, layoutParams.height)) {
            return true;
        }
        return false;
    }

    /* renamed from: A2 */
    public List<C3997a> mo30258A2() {
        ArrayList arrayList = new ArrayList(this.f21969b1.size());
        int size = this.f21969b1.size();
        for (int i = 0; i < size; i++) {
            C3997a aVar = this.f21969b1.get(i);
            if (aVar.mo30330b() != 0) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    public int mo8874B(RecyclerView.C1260x xVar) {
        return mo30287f2(xVar);
    }

    /* renamed from: B2 */
    public int mo30259B2(int i) {
        return this.f21971e1.f22035c[i];
    }

    /* renamed from: C */
    public int mo8819C(RecyclerView.C1260x xVar) {
        return mo30288g2(xVar);
    }

    /* renamed from: C2 */
    public final int mo30260C2(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        boolean z;
        if (mo9234U() == 0 || i == 0) {
            return 0;
        }
        mo30291j2();
        int i2 = 1;
        boolean unused = this.f21975q1.f22014j = true;
        if (mo30221l() || !this.f21972k0) {
            z = false;
        } else {
            z = true;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        mo30281X2(i2, abs);
        int o = this.f21975q1.f22010f + mo30292k2(tVar, xVar, this.f21975q1);
        if (o < 0) {
            return 0;
        }
        if (z) {
            if (abs > o) {
                i = (-i2) * o;
            }
        } else if (abs > o) {
            i = i2 * o;
        }
        this.f21977s1.mo9945r(-i);
        int unused2 = this.f21975q1.f22011g = i;
        return i;
    }

    /* renamed from: D */
    public int mo8820D(RecyclerView.C1260x xVar) {
        return mo30289h2(xVar);
    }

    /* renamed from: D2 */
    public final int mo30261D2(int i) {
        int i2;
        int i3;
        int j;
        boolean z = false;
        if (mo9234U() == 0 || i == 0) {
            return 0;
        }
        mo30291j2();
        boolean l = mo30221l();
        View view = this.f21962C1;
        if (l) {
            i2 = view.getWidth();
        } else {
            i2 = view.getHeight();
        }
        if (l) {
            i3 = mo9288v0();
        } else {
            i3 = mo9256h0();
        }
        if (mo9262k0() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                j = Math.min((i3 + this.f21976r1.f22000d) - i2, abs);
            } else if (this.f21976r1.f22000d + i <= 0) {
                return i;
            } else {
                j = this.f21976r1.f22000d;
            }
        } else if (i > 0) {
            return Math.min((i3 - this.f21976r1.f22000d) - i2, i);
        } else {
            if (this.f21976r1.f22000d + i >= 0) {
                return i;
            }
            j = this.f21976r1.f22000d;
        }
        return -j;
    }

    /* renamed from: E */
    public int mo8878E(RecyclerView.C1260x xVar) {
        return mo30287f2(xVar);
    }

    /* renamed from: E2 */
    public boolean mo30262E2() {
        return this.f21972k0;
    }

    /* renamed from: F */
    public int mo8821F(RecyclerView.C1260x xVar) {
        return mo30288g2(xVar);
    }

    /* renamed from: F1 */
    public int mo8822F1(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        if (!mo30221l() || this.f21966X == 0) {
            int C2 = mo30260C2(i, tVar, xVar);
            this.f21960A1.clear();
            return C2;
        }
        int D2 = mo30261D2(i);
        C3995b.m33407l(this.f21976r1, D2);
        this.f21978t1.mo9945r(-D2);
        return D2;
    }

    /* renamed from: F2 */
    public final boolean mo30263F2(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int v0 = mo9288v0() - getPaddingRight();
        int h0 = mo9256h0() - getPaddingBottom();
        int x2 = mo30305x2(view);
        int z22 = mo30307z2(view);
        int y2 = mo30306y2(view);
        int v2 = mo30303v2(view);
        if (paddingLeft > x2 || v0 < y2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (x2 >= v0 || y2 >= paddingLeft) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (paddingTop > z22 || h0 < v2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z22 >= h0 || v2 >= paddingTop) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z) {
            if (!z2 || !z4) {
                return false;
            }
            return true;
        } else if (!z3 || !z5) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: G */
    public int mo8823G(RecyclerView.C1260x xVar) {
        return mo30289h2(xVar);
    }

    /* renamed from: G1 */
    public void mo8881G1(int i) {
        this.f21981v1 = i;
        this.f21982w1 = Integer.MIN_VALUE;
        SavedState savedState = this.f21979u1;
        if (savedState != null) {
            savedState.mo30316h();
        }
        mo9200C1();
    }

    /* renamed from: G2 */
    public final int mo30264G2(C3997a aVar, C3996c cVar) {
        if (mo30221l()) {
            return mo30265H2(aVar, cVar);
        }
        return mo30266I2(aVar, cVar);
    }

    /* renamed from: H1 */
    public int mo8824H1(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        if (mo30221l() || (this.f21966X == 0 && !mo30221l())) {
            int C2 = mo30260C2(i, tVar, xVar);
            this.f21960A1.clear();
            return C2;
        }
        int D2 = mo30261D2(i);
        C3995b.m33407l(this.f21976r1, D2);
        this.f21978t1.mo9945r(-D2);
        return D2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* renamed from: H2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30265H2(com.google.android.flexbox.C3997a r22, com.google.android.flexbox.FlexboxLayoutManager.C3996c r23) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            int r1 = r21.getPaddingLeft()
            int r2 = r21.getPaddingRight()
            int r3 = r21.mo9288v0()
            int r4 = r23.f22009e
            int r5 = r23.f22013i
            r6 = -1
            if (r5 != r6) goto L_0x001e
            int r5 = r8.f22021g
            int r4 = r4 - r5
        L_0x001e:
            r9 = r4
            int r10 = r23.f22008d
            int r4 = r0.f21967Y
            r5 = 0
            r11 = 1
            if (r4 == 0) goto L_0x00ac
            if (r4 == r11) goto L_0x009e
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x008e
            r6 = 3
            if (r4 == r6) goto L_0x007b
            r6 = 4
            if (r4 == r6) goto L_0x0066
            r6 = 5
            if (r4 != r6) goto L_0x004d
            int r4 = r8.f22022h
            if (r4 == 0) goto L_0x0046
            int r6 = r8.f22019e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r11
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0047
        L_0x0046:
            r6 = r5
        L_0x0047:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b0
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f21967Y
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0066:
            int r4 = r8.f22022h
            if (r4 == 0) goto L_0x0072
            int r6 = r8.f22019e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0073
        L_0x0072:
            r6 = r5
        L_0x0073:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b0
        L_0x007b:
            float r1 = (float) r1
            int r4 = r8.f22022h
            if (r4 == r11) goto L_0x0083
            int r4 = r4 - r11
            float r4 = (float) r4
            goto L_0x0085
        L_0x0083:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0085:
            int r6 = r8.f22019e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b0
        L_0x008e:
            float r1 = (float) r1
            int r4 = r8.f22019e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00af
        L_0x009e:
            int r4 = r8.f22019e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = r5
            r20 = r2
            r2 = r1
            r1 = r20
            goto L_0x00b0
        L_0x00ac:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00af:
            r6 = r5
        L_0x00b0:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f21976r1
            int r3 = r3.f22000d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f21976r1
            int r3 = r3.f22000d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r12 = java.lang.Math.max(r6, r5)
            r3 = 0
            int r13 = r22.mo30330b()
            r14 = r10
        L_0x00ca:
            int r4 = r10 + r13
            if (r14 >= r4) goto L_0x0197
            android.view.View r15 = r0.mo30197e(r14)
            if (r15 != 0) goto L_0x00d6
            goto L_0x0192
        L_0x00d6:
            int r4 = r23.f22013i
            if (r4 != r11) goto L_0x00e5
            android.graphics.Rect r4 = f21959F1
            r0.mo9285u(r15, r4)
            r0.mo9270o(r15)
            goto L_0x00ef
        L_0x00e5:
            android.graphics.Rect r4 = f21959F1
            r0.mo9285u(r15, r4)
            r0.mo9273p(r15, r3)
            int r3 = r3 + 1
        L_0x00ef:
            r16 = r3
            com.google.android.flexbox.b r3 = r0.f21971e1
            long[] r4 = r3.f22036d
            r5 = r4[r14]
            int r3 = r3.mo30383y(r5)
            com.google.android.flexbox.b r4 = r0.f21971e1
            int r4 = r4.mo30382x(r5)
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            r7 = r5
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r7 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r7
            boolean r5 = r0.m33272O1(r15, r3, r4, r7)
            if (r5 == 0) goto L_0x0111
            r15.measure(r3, r4)
        L_0x0111:
            int r3 = r7.leftMargin
            int r4 = r0.mo9263l0(r15)
            int r3 = r3 + r4
            float r3 = (float) r3
            float r17 = r1 + r3
            int r1 = r7.rightMargin
            int r3 = r0.mo9276q0(r15)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r0.mo9283t0(r15)
            int r5 = r9 + r1
            boolean r1 = r0.f21972k0
            if (r1 == 0) goto L_0x014f
            com.google.android.flexbox.b r1 = r0.f21971e1
            int r2 = java.lang.Math.round(r18)
            int r3 = r15.getMeasuredWidth()
            int r4 = r2 - r3
            int r6 = java.lang.Math.round(r18)
            int r2 = r15.getMeasuredHeight()
            int r19 = r5 + r2
            r2 = r15
            r3 = r22
            r11 = r7
            r7 = r19
            r1.mo30349Q(r2, r3, r4, r5, r6, r7)
            goto L_0x016c
        L_0x014f:
            r11 = r7
            com.google.android.flexbox.b r1 = r0.f21971e1
            int r4 = java.lang.Math.round(r17)
            int r2 = java.lang.Math.round(r17)
            int r3 = r15.getMeasuredWidth()
            int r6 = r2 + r3
            int r2 = r15.getMeasuredHeight()
            int r7 = r5 + r2
            r2 = r15
            r3 = r22
            r1.mo30349Q(r2, r3, r4, r5, r6, r7)
        L_0x016c:
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r2 = r0.mo9276q0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r17 = r17 + r1
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.leftMargin
            int r1 = r1 + r2
            int r2 = r0.mo9263l0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r18 = r18 - r1
            r3 = r16
            r1 = r17
            r2 = r18
        L_0x0192:
            int r14 = r14 + 1
            r11 = 1
            goto L_0x00ca
        L_0x0197:
            com.google.android.flexbox.FlexboxLayoutManager$c r1 = r0.f21975q1
            int r1 = r1.f22013i
            r2 = r23
            com.google.android.flexbox.FlexboxLayoutManager.C3996c.m33432n(r2, r1)
            int r1 = r22.mo30329a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo30265H2(com.google.android.flexbox.a, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4  */
    /* renamed from: I2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30266I2(com.google.android.flexbox.C3997a r26, com.google.android.flexbox.FlexboxLayoutManager.C3996c r27) {
        /*
            r25 = this;
            r0 = r25
            r9 = r26
            int r1 = r25.getPaddingTop()
            int r2 = r25.getPaddingBottom()
            int r3 = r25.mo9256h0()
            int r4 = r27.f22009e
            int r5 = r27.f22009e
            int r6 = r27.f22013i
            r7 = -1
            if (r6 != r7) goto L_0x0023
            int r6 = r9.f22021g
            int r4 = r4 - r6
            int r5 = r5 + r6
        L_0x0023:
            r10 = r4
            r11 = r5
            int r12 = r27.f22008d
            int r4 = r0.f21967Y
            r5 = 0
            r13 = 1
            if (r4 == 0) goto L_0x00b2
            if (r4 == r13) goto L_0x00a4
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x0094
            r6 = 3
            if (r4 == r6) goto L_0x0081
            r6 = 4
            if (r4 == r6) goto L_0x006c
            r6 = 5
            if (r4 != r6) goto L_0x0053
            int r4 = r9.f22022h
            if (r4 == 0) goto L_0x004c
            int r6 = r9.f22019e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r13
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x004d
        L_0x004c:
            r6 = r5
        L_0x004d:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b6
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f21967Y
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006c:
            int r4 = r9.f22022h
            if (r4 == 0) goto L_0x0078
            int r6 = r9.f22019e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0079
        L_0x0078:
            r6 = r5
        L_0x0079:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b6
        L_0x0081:
            float r1 = (float) r1
            int r4 = r9.f22022h
            if (r4 == r13) goto L_0x0089
            int r4 = r4 - r13
            float r4 = (float) r4
            goto L_0x008b
        L_0x0089:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x008b:
            int r6 = r9.f22019e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b6
        L_0x0094:
            float r1 = (float) r1
            int r4 = r9.f22019e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00b5
        L_0x00a4:
            int r4 = r9.f22019e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = r5
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x00b6
        L_0x00b2:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00b5:
            r6 = r5
        L_0x00b6:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f21976r1
            int r3 = r3.f22000d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f21976r1
            int r3 = r3.f22000d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r14 = java.lang.Math.max(r6, r5)
            r3 = 0
            int r15 = r26.mo30330b()
            r8 = r12
        L_0x00d0:
            int r4 = r12 + r15
            if (r8 >= r4) goto L_0x020d
            android.view.View r7 = r0.mo30197e(r8)
            if (r7 != 0) goto L_0x00e2
            r23 = r8
            r22 = r13
            r17 = r14
            goto L_0x0205
        L_0x00e2:
            com.google.android.flexbox.b r4 = r0.f21971e1
            long[] r5 = r4.f22036d
            r17 = r14
            r13 = r5[r8]
            int r4 = r4.mo30383y(r13)
            com.google.android.flexbox.b r5 = r0.f21971e1
            int r5 = r5.mo30382x(r13)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            r13 = r6
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r13 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r13
            boolean r6 = r0.m33272O1(r7, r4, r5, r13)
            if (r6 == 0) goto L_0x0104
            r7.measure(r4, r5)
        L_0x0104:
            int r4 = r13.topMargin
            int r5 = r0.mo9283t0(r7)
            int r4 = r4 + r5
            float r4 = (float) r4
            float r14 = r1 + r4
            int r1 = r13.rightMargin
            int r4 = r0.mo9229S(r7)
            int r1 = r1 + r4
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r27.f22013i
            r6 = 1
            if (r1 != r6) goto L_0x0128
            android.graphics.Rect r1 = f21959F1
            r0.mo9285u(r7, r1)
            r0.mo9270o(r7)
            goto L_0x0132
        L_0x0128:
            android.graphics.Rect r1 = f21959F1
            r0.mo9285u(r7, r1)
            r0.mo9273p(r7, r3)
            int r3 = r3 + 1
        L_0x0132:
            r16 = r3
            int r1 = r0.mo9263l0(r7)
            int r5 = r10 + r1
            int r1 = r0.mo9276q0(r7)
            int r19 = r11 - r1
            boolean r4 = r0.f21972k0
            if (r4 == 0) goto L_0x0198
            boolean r1 = r0.f21980v0
            if (r1 == 0) goto L_0x0172
            com.google.android.flexbox.b r1 = r0.f21971e1
            int r2 = r7.getMeasuredWidth()
            int r5 = r19 - r2
            int r2 = java.lang.Math.round(r18)
            int r3 = r7.getMeasuredHeight()
            int r20 = r2 - r3
            int r21 = java.lang.Math.round(r18)
            r2 = r7
            r3 = r26
            r22 = r6
            r6 = r20
            r20 = r7
            r7 = r19
            r23 = r8
            r8 = r21
            r1.mo30350R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01dd
        L_0x0172:
            r22 = r6
            r20 = r7
            r23 = r8
            com.google.android.flexbox.b r1 = r0.f21971e1
            int r2 = r20.getMeasuredWidth()
            int r5 = r19 - r2
            int r6 = java.lang.Math.round(r14)
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r7 = r19
            r1.mo30350R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01dd
        L_0x0198:
            r22 = r6
            r20 = r7
            r23 = r8
            boolean r1 = r0.f21980v0
            if (r1 == 0) goto L_0x01c0
            com.google.android.flexbox.b r1 = r0.f21971e1
            int r2 = java.lang.Math.round(r18)
            int r3 = r20.getMeasuredHeight()
            int r6 = r2 - r3
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r8 = java.lang.Math.round(r18)
            r2 = r20
            r3 = r26
            r1.mo30350R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01dd
        L_0x01c0:
            com.google.android.flexbox.b r1 = r0.f21971e1
            int r6 = java.lang.Math.round(r14)
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r1.mo30350R(r2, r3, r4, r5, r6, r7, r8)
        L_0x01dd:
            int r1 = r20.getMeasuredHeight()
            int r2 = r13.topMargin
            int r1 = r1 + r2
            r2 = r20
            int r3 = r0.mo9229S(r2)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r17
            float r14 = r14 + r1
            int r1 = r2.getMeasuredHeight()
            int r3 = r13.bottomMargin
            int r1 = r1 + r3
            int r2 = r0.mo9283t0(r2)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r17
            float r18 = r18 - r1
            r1 = r14
            r3 = r16
            r2 = r18
        L_0x0205:
            int r8 = r23 + 1
            r14 = r17
            r13 = r22
            goto L_0x00d0
        L_0x020d:
            com.google.android.flexbox.FlexboxLayoutManager$c r1 = r0.f21975q1
            int r1 = r1.f22013i
            r2 = r27
            com.google.android.flexbox.FlexboxLayoutManager.C3996c.m33432n(r2, r1)
            int r1 = r26.mo30329a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo30266I2(com.google.android.flexbox.a, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* renamed from: J2 */
    public final void mo30267J2(RecyclerView.C1254t tVar, C3996c cVar) {
        if (cVar.f22014j) {
            if (cVar.f22013i == -1) {
                mo30269L2(tVar, cVar);
            } else {
                mo30270M2(tVar, cVar);
            }
        }
    }

    /* renamed from: K2 */
    public final void mo30268K2(RecyclerView.C1254t tVar, int i, int i2) {
        while (i2 >= i) {
            mo9291w1(i2, tVar);
            i2--;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1 = r0 - 1;
     */
    /* renamed from: L2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30269L2(androidx.recyclerview.widget.RecyclerView.C1254t r8, com.google.android.flexbox.FlexboxLayoutManager.C3996c r9) {
        /*
            r7 = this;
            int r0 = r9.f22010f
            if (r0 >= 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r7.mo9234U()
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            int r1 = r0 + -1
            android.view.View r2 = r7.mo9231T(r1)
            if (r2 != 0) goto L_0x0017
            return
        L_0x0017:
            com.google.android.flexbox.b r3 = r7.f21971e1
            int[] r3 = r3.f22035c
            int r2 = r7.mo9271o0(r2)
            r2 = r3[r2]
            r3 = -1
            if (r2 != r3) goto L_0x0025
            return
        L_0x0025:
            java.util.List<com.google.android.flexbox.a> r3 = r7.f21969b1
            java.lang.Object r3 = r3.get(r2)
            com.google.android.flexbox.a r3 = (com.google.android.flexbox.C3997a) r3
            r4 = r1
        L_0x002e:
            if (r4 < 0) goto L_0x005f
            android.view.View r5 = r7.mo9231T(r4)
            if (r5 != 0) goto L_0x0037
            goto L_0x005c
        L_0x0037:
            int r6 = r9.f22010f
            boolean r6 = r7.mo30284c2(r5, r6)
            if (r6 == 0) goto L_0x005f
            int r6 = r3.f22029o
            int r5 = r7.mo9271o0(r5)
            if (r6 != r5) goto L_0x005c
            if (r2 > 0) goto L_0x004d
            r0 = r4
            goto L_0x005f
        L_0x004d:
            int r0 = r9.f22013i
            int r2 = r2 + r0
            java.util.List<com.google.android.flexbox.a> r0 = r7.f21969b1
            java.lang.Object r0 = r0.get(r2)
            com.google.android.flexbox.a r0 = (com.google.android.flexbox.C3997a) r0
            r3 = r0
            r0 = r4
        L_0x005c:
            int r4 = r4 + -1
            goto L_0x002e
        L_0x005f:
            r7.mo30268K2(r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo30269L2(androidx.recyclerview.widget.RecyclerView$t, com.google.android.flexbox.FlexboxLayoutManager$c):void");
    }

    /* renamed from: M0 */
    public void mo9220M0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        mo9281s1();
    }

    /* renamed from: M2 */
    public final void mo30270M2(RecyclerView.C1254t tVar, C3996c cVar) {
        int U;
        View T;
        if (cVar.f22010f >= 0 && (U = mo9234U()) != 0 && (T = mo9231T(0)) != null) {
            int i = this.f21971e1.f22035c[mo9271o0(T)];
            int i2 = -1;
            if (i != -1) {
                C3997a aVar = this.f21969b1.get(i);
                int i3 = 0;
                while (true) {
                    if (i3 >= U) {
                        break;
                    }
                    View T2 = mo9231T(i3);
                    if (T2 != null) {
                        if (!mo30285d2(T2, cVar.f22010f)) {
                            break;
                        } else if (aVar.f22030p != mo9271o0(T2)) {
                            continue;
                        } else if (i >= this.f21969b1.size() - 1) {
                            i2 = i3;
                            break;
                        } else {
                            i += cVar.f22013i;
                            aVar = this.f21969b1.get(i);
                            i2 = i3;
                        }
                    }
                    i3++;
                }
                mo30268K2(tVar, 0, i2);
            }
        }
    }

    /* renamed from: N2 */
    public final void mo30271N2() {
        int i;
        boolean z;
        if (mo30221l()) {
            i = mo9258i0();
        } else {
            i = mo9290w0();
        }
        C3996c cVar = this.f21975q1;
        if (i == 0 || i == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        boolean unused = cVar.f22006b = z;
    }

    /* renamed from: O */
    public RecyclerView.LayoutParams mo8827O() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: O0 */
    public void mo9224O0(RecyclerView recyclerView) {
        super.mo9224O0(recyclerView);
        this.f21962C1 = (View) recyclerView.getParent();
    }

    /* renamed from: O2 */
    public final void mo30272O2() {
        boolean z;
        boolean z2;
        boolean z3;
        int k0 = mo9262k0();
        int i = this.f21965U;
        boolean z4 = false;
        if (i == 0) {
            if (k0 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f21972k0 = z;
            if (this.f21966X == 2) {
                z4 = true;
            }
            this.f21980v0 = z4;
        } else if (i == 1) {
            if (k0 != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f21972k0 = z2;
            if (this.f21966X == 2) {
                z4 = true;
            }
            this.f21980v0 = z4;
        } else if (i == 2) {
            if (k0 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f21972k0 = z3;
            if (this.f21966X == 2) {
                this.f21972k0 = !z3;
            }
            this.f21980v0 = false;
        } else if (i != 3) {
            this.f21972k0 = false;
            this.f21980v0 = false;
        } else {
            if (k0 == 1) {
                z4 = true;
            }
            this.f21972k0 = z4;
            if (this.f21966X == 2) {
                this.f21972k0 = !z4;
            }
            this.f21980v0 = true;
        }
    }

    /* renamed from: P */
    public RecyclerView.LayoutParams mo8828P(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: P2 */
    public void mo30273P2(int i) {
        int i2 = this.f21968Z;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                mo9281s1();
                mo30286e2();
            }
            this.f21968Z = i;
            mo9200C1();
        }
    }

    /* renamed from: Q0 */
    public void mo8893Q0(RecyclerView recyclerView, RecyclerView.C1254t tVar) {
        super.mo8893Q0(recyclerView, tVar);
        if (this.f21985z1) {
            mo9284t1(tVar);
            tVar.mo9474c();
        }
    }

    /* renamed from: Q2 */
    public void mo30274Q2(int i) {
        if (this.f21965U != i) {
            mo9281s1();
            this.f21965U = i;
            this.f21977s1 = null;
            this.f21978t1 = null;
            mo30286e2();
            mo9200C1();
        }
    }

    /* renamed from: R1 */
    public void mo8895R1(RecyclerView recyclerView, RecyclerView.C1260x xVar, int i) {
        C1328m mVar = new C1328m(recyclerView.getContext());
        mVar.setTargetPosition(i);
        mo9230S1(mVar);
    }

    /* renamed from: R2 */
    public void mo30275R2(int i) {
        if (i != 2) {
            int i2 = this.f21966X;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    mo9281s1();
                    mo30286e2();
                }
                this.f21966X = i;
                this.f21977s1 = null;
                this.f21978t1 = null;
                mo9200C1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    /* renamed from: S2 */
    public final boolean mo30276S2(RecyclerView.C1260x xVar, C3995b bVar) {
        View view;
        int i;
        boolean z = false;
        if (mo9234U() == 0) {
            return false;
        }
        if (bVar.f22001e) {
            view = mo30296o2(xVar.mo9525b());
        } else {
            view = mo30293l2(xVar.mo9525b());
        }
        if (view == null) {
            return false;
        }
        bVar.mo30324s(view);
        if (!xVar.mo9528e() && mo8831U1()) {
            if (this.f21977s1.mo9934g(view) >= this.f21977s1.mo9936i() || this.f21977s1.mo9931d(view) < this.f21977s1.mo9940m()) {
                z = true;
            }
            if (z) {
                if (bVar.f22001e) {
                    i = this.f21977s1.mo9936i();
                } else {
                    i = this.f21977s1.mo9940m();
                }
                int unused = bVar.f21999c = i;
            }
        }
        return true;
    }

    /* renamed from: T2 */
    public final boolean mo30277T2(RecyclerView.C1260x xVar, C3995b bVar, SavedState savedState) {
        int i;
        View T;
        int i2;
        boolean z = false;
        if (!xVar.mo9528e() && (i = this.f21981v1) != -1) {
            if (i < 0 || i >= xVar.mo9525b()) {
                this.f21981v1 = -1;
                this.f21982w1 = Integer.MIN_VALUE;
            } else {
                int unused = bVar.f21997a = this.f21981v1;
                int unused2 = bVar.f21998b = this.f21971e1.f22035c[bVar.f21997a];
                SavedState savedState2 = this.f21979u1;
                if (savedState2 != null && savedState2.mo30315g(xVar.mo9525b())) {
                    int unused3 = bVar.f21999c = this.f21977s1.mo9940m() + savedState.f21996d;
                    boolean unused4 = bVar.f22003g = true;
                    int unused5 = bVar.f21998b = -1;
                    return true;
                } else if (this.f21982w1 == Integer.MIN_VALUE) {
                    View N = mo8888N(this.f21981v1);
                    if (N == null) {
                        if (mo9234U() > 0 && (T = mo9231T(0)) != null) {
                            if (this.f21981v1 < mo9271o0(T)) {
                                z = true;
                            }
                            boolean unused6 = bVar.f22001e = z;
                        }
                        bVar.mo30323r();
                    } else if (this.f21977s1.mo9932e(N) > this.f21977s1.mo9941n()) {
                        bVar.mo30323r();
                        return true;
                    } else if (this.f21977s1.mo9934g(N) - this.f21977s1.mo9940m() < 0) {
                        int unused7 = bVar.f21999c = this.f21977s1.mo9940m();
                        boolean unused8 = bVar.f22001e = false;
                        return true;
                    } else if (this.f21977s1.mo9936i() - this.f21977s1.mo9931d(N) < 0) {
                        int unused9 = bVar.f21999c = this.f21977s1.mo9936i();
                        boolean unused10 = bVar.f22001e = true;
                        return true;
                    } else {
                        if (bVar.f22001e) {
                            i2 = this.f21977s1.mo9931d(N) + this.f21977s1.mo9942o();
                        } else {
                            i2 = this.f21977s1.mo9934g(N);
                        }
                        int unused11 = bVar.f21999c = i2;
                    }
                    return true;
                } else {
                    if (mo30221l() || !this.f21972k0) {
                        int unused12 = bVar.f21999c = this.f21977s1.mo9940m() + this.f21982w1;
                    } else {
                        int unused13 = bVar.f21999c = this.f21982w1 - this.f21977s1.mo9937j();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: U2 */
    public final void mo30278U2(RecyclerView.C1260x xVar, C3995b bVar) {
        if (!mo30277T2(xVar, bVar, this.f21979u1) && !mo30276S2(xVar, bVar)) {
            bVar.mo30323r();
            int unused = bVar.f21997a = 0;
            int unused2 = bVar.f21998b = 0;
        }
    }

    /* renamed from: V2 */
    public final void mo30279V2(int i) {
        if (i < mo30298q2()) {
            int U = mo9234U();
            this.f21971e1.mo30378t(U);
            this.f21971e1.mo30379u(U);
            this.f21971e1.mo30377s(U);
            if (i < this.f21971e1.f22035c.length) {
                this.f21963D1 = i;
                View w2 = mo30304w2();
                if (w2 != null) {
                    this.f21981v1 = mo9271o0(w2);
                    if (mo30221l() || !this.f21972k0) {
                        this.f21982w1 = this.f21977s1.mo9934g(w2) - this.f21977s1.mo9940m();
                    } else {
                        this.f21982w1 = this.f21977s1.mo9931d(w2) + this.f21977s1.mo9937j();
                    }
                }
            }
        }
    }

    /* renamed from: W2 */
    public final void mo30280W2(int i) {
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mo9288v0(), mo9290w0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(mo9256h0(), mo9258i0());
        int v0 = mo9288v0();
        int h0 = mo9256h0();
        boolean z = true;
        if (mo30221l()) {
            int i4 = this.f21983x1;
            if (i4 == Integer.MIN_VALUE || i4 == v0) {
                z = false;
            }
            if (this.f21975q1.f22006b) {
                i2 = this.f21961B1.getResources().getDisplayMetrics().heightPixels;
            } else {
                i2 = this.f21975q1.f22005a;
            }
        } else {
            int i5 = this.f21984y1;
            if (i5 == Integer.MIN_VALUE || i5 == h0) {
                z = false;
            }
            if (this.f21975q1.f22006b) {
                i2 = this.f21961B1.getResources().getDisplayMetrics().widthPixels;
            } else {
                i2 = this.f21975q1.f22005a;
            }
        }
        int i6 = i2;
        this.f21983x1 = v0;
        this.f21984y1 = h0;
        int i7 = this.f21963D1;
        if (i7 != -1 || (this.f21981v1 == -1 && !z)) {
            if (i7 != -1) {
                i3 = Math.min(i7, this.f21976r1.f21997a);
            } else {
                i3 = this.f21976r1.f21997a;
            }
            int i8 = i3;
            this.f21964E1.mo30385a();
            if (mo30221l()) {
                if (this.f21969b1.size() > 0) {
                    this.f21971e1.mo30368j(this.f21969b1, i8);
                    this.f21971e1.mo30360b(this.f21964E1, makeMeasureSpec, makeMeasureSpec2, i6, i8, this.f21976r1.f21997a, this.f21969b1);
                } else {
                    this.f21971e1.mo30377s(i);
                    this.f21971e1.mo30362d(this.f21964E1, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f21969b1);
                }
            } else if (this.f21969b1.size() > 0) {
                this.f21971e1.mo30368j(this.f21969b1, i8);
                this.f21971e1.mo30360b(this.f21964E1, makeMeasureSpec2, makeMeasureSpec, i6, i8, this.f21976r1.f21997a, this.f21969b1);
            } else {
                this.f21971e1.mo30377s(i);
                this.f21971e1.mo30365g(this.f21964E1, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f21969b1);
            }
            this.f21969b1 = this.f21964E1.f22038a;
            this.f21971e1.mo30375q(makeMeasureSpec, makeMeasureSpec2, i8);
            this.f21971e1.mo30357Y(i8);
        } else if (!this.f21976r1.f22001e) {
            this.f21969b1.clear();
            this.f21964E1.mo30385a();
            if (mo30221l()) {
                this.f21971e1.mo30363e(this.f21964E1, makeMeasureSpec, makeMeasureSpec2, i6, this.f21976r1.f21997a, this.f21969b1);
            } else {
                this.f21971e1.mo30366h(this.f21964E1, makeMeasureSpec, makeMeasureSpec2, i6, this.f21976r1.f21997a, this.f21969b1);
            }
            this.f21969b1 = this.f21964E1.f22038a;
            this.f21971e1.mo30374p(makeMeasureSpec, makeMeasureSpec2);
            this.f21971e1.mo30356X();
            C3995b bVar = this.f21976r1;
            int unused = bVar.f21998b = this.f21971e1.f22035c[bVar.f21997a];
            int unused2 = this.f21975q1.f22007c = this.f21976r1.f21998b;
        }
    }

    /* renamed from: X2 */
    public final void mo30281X2(int i, int i2) {
        boolean z;
        int i3;
        int unused = this.f21975q1.f22013i = i;
        boolean l = mo30221l();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mo9288v0(), mo9290w0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(mo9256h0(), mo9258i0());
        if (l || !this.f21972k0) {
            z = false;
        } else {
            z = true;
        }
        if (i == 1) {
            View T = mo9231T(mo9234U() - 1);
            if (T != null) {
                int unused2 = this.f21975q1.f22009e = this.f21977s1.mo9931d(T);
                int o0 = mo9271o0(T);
                View p2 = mo30297p2(T, this.f21969b1.get(this.f21971e1.f22035c[o0]));
                int unused3 = this.f21975q1.f22012h = 1;
                C3996c cVar = this.f21975q1;
                int unused4 = cVar.f22008d = o0 + cVar.f22012h;
                if (this.f21971e1.f22035c.length <= this.f21975q1.f22008d) {
                    int unused5 = this.f21975q1.f22007c = -1;
                } else {
                    C3996c cVar2 = this.f21975q1;
                    int unused6 = cVar2.f22007c = this.f21971e1.f22035c[cVar2.f22008d];
                }
                if (z) {
                    int unused7 = this.f21975q1.f22009e = this.f21977s1.mo9934g(p2);
                    int unused8 = this.f21975q1.f22010f = (-this.f21977s1.mo9934g(p2)) + this.f21977s1.mo9940m();
                    C3996c cVar3 = this.f21975q1;
                    int unused9 = cVar3.f22010f = Math.max(cVar3.f22010f, 0);
                } else {
                    int unused10 = this.f21975q1.f22009e = this.f21977s1.mo9931d(p2);
                    int unused11 = this.f21975q1.f22010f = this.f21977s1.mo9931d(p2) - this.f21977s1.mo9936i();
                }
                if ((this.f21975q1.f22007c == -1 || this.f21975q1.f22007c > this.f21969b1.size() - 1) && this.f21975q1.f22008d <= getFlexItemCount()) {
                    int o = i2 - this.f21975q1.f22010f;
                    this.f21964E1.mo30385a();
                    if (o > 0) {
                        if (l) {
                            this.f21971e1.mo30362d(this.f21964E1, makeMeasureSpec, makeMeasureSpec2, o, this.f21975q1.f22008d, this.f21969b1);
                        } else {
                            this.f21971e1.mo30365g(this.f21964E1, makeMeasureSpec, makeMeasureSpec2, o, this.f21975q1.f22008d, this.f21969b1);
                        }
                        this.f21971e1.mo30375q(makeMeasureSpec, makeMeasureSpec2, this.f21975q1.f22008d);
                        this.f21971e1.mo30357Y(this.f21975q1.f22008d);
                    }
                }
            } else {
                return;
            }
        } else {
            View T2 = mo9231T(0);
            if (T2 != null) {
                int unused12 = this.f21975q1.f22009e = this.f21977s1.mo9934g(T2);
                int o02 = mo9271o0(T2);
                View m2 = mo30294m2(T2, this.f21969b1.get(this.f21971e1.f22035c[o02]));
                int unused13 = this.f21975q1.f22012h = 1;
                int i4 = this.f21971e1.f22035c[o02];
                if (i4 == -1) {
                    i4 = 0;
                }
                if (i4 > 0) {
                    int unused14 = this.f21975q1.f22008d = o02 - this.f21969b1.get(i4 - 1).mo30330b();
                } else {
                    int unused15 = this.f21975q1.f22008d = -1;
                }
                C3996c cVar4 = this.f21975q1;
                if (i4 > 0) {
                    i3 = i4 - 1;
                } else {
                    i3 = 0;
                }
                int unused16 = cVar4.f22007c = i3;
                if (z) {
                    int unused17 = this.f21975q1.f22009e = this.f21977s1.mo9931d(m2);
                    int unused18 = this.f21975q1.f22010f = this.f21977s1.mo9931d(m2) - this.f21977s1.mo9936i();
                    C3996c cVar5 = this.f21975q1;
                    int unused19 = cVar5.f22010f = Math.max(cVar5.f22010f, 0);
                } else {
                    int unused20 = this.f21975q1.f22009e = this.f21977s1.mo9934g(m2);
                    int unused21 = this.f21975q1.f22010f = (-this.f21977s1.mo9934g(m2)) + this.f21977s1.mo9940m();
                }
            } else {
                return;
            }
        }
        C3996c cVar6 = this.f21975q1;
        int unused22 = cVar6.f22005a = i2 - cVar6.f22010f;
    }

    /* renamed from: Y2 */
    public final void mo30282Y2(C3995b bVar, boolean z, boolean z2) {
        if (z2) {
            mo30271N2();
        } else {
            boolean unused = this.f21975q1.f22006b = false;
        }
        if (mo30221l() || !this.f21972k0) {
            int unused2 = this.f21975q1.f22005a = this.f21977s1.mo9936i() - bVar.f21999c;
        } else {
            int unused3 = this.f21975q1.f22005a = bVar.f21999c - getPaddingRight();
        }
        int unused4 = this.f21975q1.f22008d = bVar.f21997a;
        int unused5 = this.f21975q1.f22012h = 1;
        int unused6 = this.f21975q1.f22013i = 1;
        int unused7 = this.f21975q1.f22009e = bVar.f21999c;
        int unused8 = this.f21975q1.f22010f = Integer.MIN_VALUE;
        int unused9 = this.f21975q1.f22007c = bVar.f21998b;
        if (z && this.f21969b1.size() > 1 && bVar.f21998b >= 0 && bVar.f21998b < this.f21969b1.size() - 1) {
            C3996c.m33430l(this.f21975q1);
            C3996c.m33439u(this.f21975q1, this.f21969b1.get(bVar.f21998b).mo30330b());
        }
    }

    /* renamed from: Z0 */
    public void mo8839Z0(RecyclerView recyclerView, int i, int i2) {
        super.mo8839Z0(recyclerView, i, i2);
        mo30279V2(i);
    }

    /* renamed from: Z2 */
    public final void mo30283Z2(C3995b bVar, boolean z, boolean z2) {
        if (z2) {
            mo30271N2();
        } else {
            boolean unused = this.f21975q1.f22006b = false;
        }
        if (mo30221l() || !this.f21972k0) {
            int unused2 = this.f21975q1.f22005a = bVar.f21999c - this.f21977s1.mo9940m();
        } else {
            int unused3 = this.f21975q1.f22005a = (this.f21962C1.getWidth() - bVar.f21999c) - this.f21977s1.mo9940m();
        }
        int unused4 = this.f21975q1.f22008d = bVar.f21997a;
        int unused5 = this.f21975q1.f22012h = 1;
        int unused6 = this.f21975q1.f22013i = -1;
        int unused7 = this.f21975q1.f22009e = bVar.f21999c;
        int unused8 = this.f21975q1.f22010f = Integer.MIN_VALUE;
        int unused9 = this.f21975q1.f22007c = bVar.f21998b;
        if (z && bVar.f21998b > 0 && this.f21969b1.size() > bVar.f21998b) {
            C3996c.m33431m(this.f21975q1);
            C3996c.m33440v(this.f21975q1, this.f21969b1.get(bVar.f21998b).mo30330b());
        }
    }

    /* renamed from: a */
    public PointF mo8904a(int i) {
        View T;
        int i2;
        if (mo9234U() == 0 || (T = mo9231T(0)) == null) {
            return null;
        }
        if (i < mo9271o0(T)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo30221l()) {
            return new PointF(Utils.FLOAT_EPSILON, (float) i2);
        }
        return new PointF((float) i2, Utils.FLOAT_EPSILON);
    }

    /* renamed from: b */
    public void mo30193b(View view, int i, int i2, C3997a aVar) {
        mo9285u(view, f21959F1);
        if (mo30221l()) {
            int l0 = mo9263l0(view) + mo9276q0(view);
            aVar.f22019e += l0;
            aVar.f22020f += l0;
            return;
        }
        int t0 = mo9283t0(view) + mo9229S(view);
        aVar.f22019e += t0;
        aVar.f22020f += t0;
    }

    /* renamed from: b1 */
    public void mo8843b1(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo8843b1(recyclerView, i, i2, i3);
        mo30279V2(Math.min(i, i2));
    }

    /* renamed from: c */
    public int mo30194c(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.m8981V(mo9288v0(), mo9290w0(), i2, i3, mo8929v());
    }

    /* renamed from: c1 */
    public void mo8845c1(RecyclerView recyclerView, int i, int i2) {
        super.mo8845c1(recyclerView, i, i2);
        mo30279V2(i);
    }

    /* renamed from: c2 */
    public final boolean mo30284c2(View view, int i) {
        if (mo30221l() || !this.f21972k0) {
            if (this.f21977s1.mo9934g(view) >= this.f21977s1.mo9935h() - i) {
                return true;
            }
            return false;
        } else if (this.f21977s1.mo9931d(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d1 */
    public void mo9246d1(RecyclerView recyclerView, int i, int i2) {
        super.mo9246d1(recyclerView, i, i2);
        mo30279V2(i);
    }

    /* renamed from: d2 */
    public final boolean mo30285d2(View view, int i) {
        if (mo30221l() || !this.f21972k0) {
            if (this.f21977s1.mo9931d(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f21977s1.mo9935h() - this.f21977s1.mo9934g(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    public View mo30197e(int i) {
        View view = this.f21960A1.get(i);
        if (view != null) {
            return view;
        }
        return this.f21973o1.mo9486o(i);
    }

    /* renamed from: e1 */
    public void mo8848e1(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo8848e1(recyclerView, i, i2, obj);
        mo30279V2(i);
    }

    /* renamed from: e2 */
    public final void mo30286e2() {
        this.f21969b1.clear();
        this.f21976r1.mo30325t();
        int unused = this.f21976r1.f22000d = 0;
    }

    /* renamed from: f */
    public int mo30198f(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.m8981V(mo9256h0(), mo9258i0(), i2, i3, mo8931w());
    }

    /* renamed from: f1 */
    public void mo8850f1(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        int i;
        int i2;
        this.f21973o1 = tVar;
        this.f21974p1 = xVar;
        int b = xVar.mo9525b();
        if (b != 0 || !xVar.mo9528e()) {
            mo30272O2();
            mo30291j2();
            mo30290i2();
            this.f21971e1.mo30378t(b);
            this.f21971e1.mo30379u(b);
            this.f21971e1.mo30377s(b);
            boolean unused = this.f21975q1.f22014j = false;
            SavedState savedState = this.f21979u1;
            if (savedState != null && savedState.mo30315g(b)) {
                this.f21981v1 = this.f21979u1.f21995a;
            }
            if (!(this.f21976r1.f22002f && this.f21981v1 == -1 && this.f21979u1 == null)) {
                this.f21976r1.mo30325t();
                mo30278U2(xVar, this.f21976r1);
                boolean unused2 = this.f21976r1.f22002f = true;
            }
            mo9206H(tVar);
            if (this.f21976r1.f22001e) {
                mo30283Z2(this.f21976r1, false, true);
            } else {
                mo30282Y2(this.f21976r1, false, true);
            }
            mo30280W2(b);
            mo30292k2(tVar, xVar, this.f21975q1);
            if (this.f21976r1.f22001e) {
                i2 = this.f21975q1.f22009e;
                mo30282Y2(this.f21976r1, true, false);
                mo30292k2(tVar, xVar, this.f21975q1);
                i = this.f21975q1.f22009e;
            } else {
                i = this.f21975q1.f22009e;
                mo30283Z2(this.f21976r1, true, false);
                mo30292k2(tVar, xVar, this.f21975q1);
                i2 = this.f21975q1.f22009e;
            }
            if (mo9234U() <= 0) {
                return;
            }
            if (this.f21976r1.f22001e) {
                mo30302u2(i2 + mo30301t2(i, tVar, xVar, true), tVar, xVar, false);
            } else {
                mo30301t2(i + mo30302u2(i2, tVar, xVar, true), tVar, xVar, false);
            }
        }
    }

    /* renamed from: f2 */
    public final int mo30287f2(RecyclerView.C1260x xVar) {
        if (mo9234U() == 0) {
            return 0;
        }
        int b = xVar.mo9525b();
        mo30291j2();
        View l2 = mo30293l2(b);
        View o2 = mo30296o2(b);
        if (xVar.mo9525b() == 0 || l2 == null || o2 == null) {
            return 0;
        }
        return Math.min(this.f21977s1.mo9941n(), this.f21977s1.mo9931d(o2) - this.f21977s1.mo9934g(l2));
    }

    /* renamed from: g */
    public int mo30199g(View view) {
        int l0;
        int q0;
        if (mo30221l()) {
            l0 = mo9283t0(view);
            q0 = mo9229S(view);
        } else {
            l0 = mo9263l0(view);
            q0 = mo9276q0(view);
        }
        return l0 + q0;
    }

    /* renamed from: g1 */
    public void mo8852g1(RecyclerView.C1260x xVar) {
        super.mo8852g1(xVar);
        this.f21979u1 = null;
        this.f21981v1 = -1;
        this.f21982w1 = Integer.MIN_VALUE;
        this.f21963D1 = -1;
        this.f21976r1.mo30325t();
        this.f21960A1.clear();
    }

    /* renamed from: g2 */
    public final int mo30288g2(RecyclerView.C1260x xVar) {
        if (mo9234U() == 0) {
            return 0;
        }
        int b = xVar.mo9525b();
        View l2 = mo30293l2(b);
        View o2 = mo30296o2(b);
        if (!(xVar.mo9525b() == 0 || l2 == null || o2 == null)) {
            int o0 = mo9271o0(l2);
            int o02 = mo9271o0(o2);
            int abs = Math.abs(this.f21977s1.mo9931d(o2) - this.f21977s1.mo9934g(l2));
            int[] iArr = this.f21971e1.f22035c;
            int i = iArr[o0];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[o02] - i) + 1)))) + ((float) (this.f21977s1.mo9940m() - this.f21977s1.mo9934g(l2))));
            }
        }
        return 0;
    }

    public int getAlignContent() {
        return 5;
    }

    public int getAlignItems() {
        return this.f21968Z;
    }

    public int getFlexDirection() {
        return this.f21965U;
    }

    public int getFlexItemCount() {
        return this.f21974p1.mo9525b();
    }

    public List<C3997a> getFlexLinesInternal() {
        return this.f21969b1;
    }

    public int getFlexWrap() {
        return this.f21966X;
    }

    public int getLargestMainSize() {
        if (this.f21969b1.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.f21969b1.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f21969b1.get(i2).f22019e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f21970e0;
    }

    public int getSumOfCrossSize() {
        int size = this.f21969b1.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f21969b1.get(i2).f22021g;
        }
        return i;
    }

    /* renamed from: h */
    public void mo30217h(C3997a aVar) {
    }

    /* renamed from: h2 */
    public final int mo30289h2(RecyclerView.C1260x xVar) {
        if (mo9234U() == 0) {
            return 0;
        }
        int b = xVar.mo9525b();
        View l2 = mo30293l2(b);
        View o2 = mo30296o2(b);
        if (xVar.mo9525b() == 0 || l2 == null || o2 == null) {
            return 0;
        }
        int n2 = mo30295n2();
        return (int) ((((float) Math.abs(this.f21977s1.mo9931d(o2) - this.f21977s1.mo9934g(l2))) / ((float) ((mo30298q2() - n2) + 1))) * ((float) xVar.mo9525b()));
    }

    /* renamed from: i */
    public View mo30218i(int i) {
        return mo30197e(i);
    }

    /* renamed from: i2 */
    public final void mo30290i2() {
        if (this.f21975q1 == null) {
            this.f21975q1 = new C3996c();
        }
    }

    /* renamed from: j */
    public void mo30219j(int i, View view) {
        this.f21960A1.put(i, view);
    }

    /* renamed from: j2 */
    public final void mo30291j2() {
        if (this.f21977s1 == null) {
            if (mo30221l()) {
                if (this.f21966X == 0) {
                    this.f21977s1 = C1334q.m9642a(this);
                    this.f21978t1 = C1334q.m9644c(this);
                    return;
                }
                this.f21977s1 = C1334q.m9644c(this);
                this.f21978t1 = C1334q.m9642a(this);
            } else if (this.f21966X == 0) {
                this.f21977s1 = C1334q.m9644c(this);
                this.f21978t1 = C1334q.m9642a(this);
            } else {
                this.f21977s1 = C1334q.m9642a(this);
                this.f21978t1 = C1334q.m9644c(this);
            }
        }
    }

    /* renamed from: k */
    public int mo30220k(View view, int i, int i2) {
        int t0;
        int S;
        if (mo30221l()) {
            t0 = mo9263l0(view);
            S = mo9276q0(view);
        } else {
            t0 = mo9283t0(view);
            S = mo9229S(view);
        }
        return t0 + S;
    }

    /* renamed from: k1 */
    public void mo8916k1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f21979u1 = (SavedState) parcelable;
            mo9200C1();
        }
    }

    /* renamed from: k2 */
    public final int mo30292k2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, C3996c cVar) {
        if (cVar.f22010f != Integer.MIN_VALUE) {
            if (cVar.f22005a < 0) {
                C3996c.m33435q(cVar, cVar.f22005a);
            }
            mo30267J2(tVar, cVar);
        }
        int g = cVar.f22005a;
        int g2 = cVar.f22005a;
        int i = 0;
        boolean l = mo30221l();
        while (true) {
            if ((g2 > 0 || this.f21975q1.f22006b) && cVar.mo30327D(xVar, this.f21969b1)) {
                C3997a aVar = this.f21969b1.get(cVar.f22007c);
                int unused = cVar.f22008d = aVar.f22029o;
                i += mo30264G2(aVar, cVar);
                if (l || !this.f21972k0) {
                    C3996c.m33421c(cVar, aVar.mo30329a() * cVar.f22013i);
                } else {
                    C3996c.m33422d(cVar, aVar.mo30329a() * cVar.f22013i);
                }
                g2 -= aVar.mo30329a();
            }
        }
        C3996c.m33427i(cVar, i);
        if (cVar.f22010f != Integer.MIN_VALUE) {
            C3996c.m33435q(cVar, i);
            if (cVar.f22005a < 0) {
                C3996c.m33435q(cVar, cVar.f22005a);
            }
            mo30267J2(tVar, cVar);
        }
        return g - cVar.f22005a;
    }

    /* renamed from: l */
    public boolean mo30221l() {
        int i = this.f21965U;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l1 */
    public Parcelable mo8918l1() {
        if (this.f21979u1 != null) {
            return new SavedState(this.f21979u1);
        }
        SavedState savedState = new SavedState();
        if (mo9234U() > 0) {
            View w2 = mo30304w2();
            int unused = savedState.f21995a = mo9271o0(w2);
            int unused2 = savedState.f21996d = this.f21977s1.mo9934g(w2) - this.f21977s1.mo9940m();
        } else {
            savedState.mo30316h();
        }
        return savedState;
    }

    /* renamed from: l2 */
    public final View mo30293l2(int i) {
        int i2;
        View s2 = mo30300s2(0, mo9234U(), i);
        if (s2 == null || (i2 = this.f21971e1.f22035c[mo9271o0(s2)]) == -1) {
            return null;
        }
        return mo30294m2(s2, this.f21969b1.get(i2));
    }

    /* renamed from: m2 */
    public final View mo30294m2(View view, C3997a aVar) {
        boolean l = mo30221l();
        int i = aVar.f22022h;
        for (int i2 = 1; i2 < i; i2++) {
            View T = mo9231T(i2);
            if (!(T == null || T.getVisibility() == 8)) {
                if (!this.f21972k0 || l) {
                    if (this.f21977s1.mo9934g(view) <= this.f21977s1.mo9934g(T)) {
                    }
                } else if (this.f21977s1.mo9931d(view) >= this.f21977s1.mo9931d(T)) {
                }
                view = T;
            }
        }
        return view;
    }

    /* renamed from: n2 */
    public int mo30295n2() {
        View r2 = mo30299r2(0, mo9234U(), false);
        if (r2 == null) {
            return -1;
        }
        return mo9271o0(r2);
    }

    /* renamed from: o2 */
    public final View mo30296o2(int i) {
        View s2 = mo30300s2(mo9234U() - 1, -1, i);
        if (s2 == null) {
            return null;
        }
        return mo30297p2(s2, this.f21969b1.get(this.f21971e1.f22035c[mo9271o0(s2)]));
    }

    /* renamed from: p2 */
    public final View mo30297p2(View view, C3997a aVar) {
        boolean l = mo30221l();
        int U = (mo9234U() - aVar.f22022h) - 1;
        for (int U2 = mo9234U() - 2; U2 > U; U2--) {
            View T = mo9231T(U2);
            if (!(T == null || T.getVisibility() == 8)) {
                if (!this.f21972k0 || l) {
                    if (this.f21977s1.mo9931d(view) >= this.f21977s1.mo9931d(T)) {
                    }
                } else if (this.f21977s1.mo9934g(view) <= this.f21977s1.mo9934g(T)) {
                }
                view = T;
            }
        }
        return view;
    }

    /* renamed from: q2 */
    public int mo30298q2() {
        View r2 = mo30299r2(mo9234U() - 1, -1, false);
        if (r2 == null) {
            return -1;
        }
        return mo9271o0(r2);
    }

    /* renamed from: r2 */
    public final View mo30299r2(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View T = mo9231T(i);
            if (mo30263F2(T, z)) {
                return T;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: s2 */
    public final View mo30300s2(int i, int i2, int i3) {
        int i4;
        int o0;
        mo30291j2();
        mo30290i2();
        int m = this.f21977s1.mo9940m();
        int i5 = this.f21977s1.mo9936i();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View T = mo9231T(i);
            if (T != null && (o0 = mo9271o0(T)) >= 0 && o0 < i3) {
                if (((RecyclerView.LayoutParams) T.getLayoutParams()).mo9305c()) {
                    if (view2 == null) {
                        view2 = T;
                    }
                } else if (this.f21977s1.mo9934g(T) >= m && this.f21977s1.mo9931d(T) <= i5) {
                    return T;
                } else {
                    if (view == null) {
                        view = T;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public void setFlexLines(List<C3997a> list) {
        this.f21969b1 = list;
    }

    /* renamed from: t2 */
    public final int mo30301t2(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, boolean z) {
        boolean z2;
        int i2;
        int i3;
        if (mo30221l() || !this.f21972k0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int m = i - this.f21977s1.mo9940m();
            if (m <= 0) {
                return 0;
            }
            i2 = mo30260C2(m, tVar, xVar);
        } else {
            int i4 = this.f21977s1.mo9936i() - i;
            if (i4 <= 0) {
                return 0;
            }
            i2 = -mo30260C2(-i4, tVar, xVar);
        }
        int i5 = i + i2;
        if (!z || (i3 = this.f21977s1.mo9936i() - i5) <= 0) {
            return i2;
        }
        this.f21977s1.mo9945r(i3);
        return i3 + i2;
    }

    /* renamed from: u2 */
    public final int mo30302u2(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, boolean z) {
        int i2;
        int m;
        if (mo30221l() || !this.f21972k0) {
            int m2 = i - this.f21977s1.mo9940m();
            if (m2 <= 0) {
                return 0;
            }
            i2 = -mo30260C2(m2, tVar, xVar);
        } else {
            int i3 = this.f21977s1.mo9936i() - i;
            if (i3 <= 0) {
                return 0;
            }
            i2 = mo30260C2(-i3, tVar, xVar);
        }
        int i4 = i + i2;
        if (!z || (m = i4 - this.f21977s1.mo9940m()) <= 0) {
            return i2;
        }
        this.f21977s1.mo9945r(-m);
        return i2 - m;
    }

    /* renamed from: v */
    public boolean mo8929v() {
        int i;
        if (this.f21966X == 0) {
            return mo30221l();
        }
        if (mo30221l()) {
            int v0 = mo9288v0();
            View view = this.f21962C1;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (v0 > i) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: v2 */
    public final int mo30303v2(View view) {
        return mo9241Z(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: w */
    public boolean mo8931w() {
        int i;
        if (this.f21966X == 0) {
            return !mo30221l();
        }
        if (mo30221l()) {
            return true;
        }
        int h0 = mo9256h0();
        View view = this.f21962C1;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (h0 > i) {
            return true;
        }
        return false;
    }

    /* renamed from: w2 */
    public final View mo30304w2() {
        return mo9231T(0);
    }

    /* renamed from: x */
    public boolean mo8862x(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: x2 */
    public final int mo30305x2(View view) {
        return mo9243b0(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: y2 */
    public final int mo30306y2(View view) {
        return mo9247e0(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: z0 */
    public boolean mo8935z0() {
        return true;
    }

    /* renamed from: z2 */
    public final int mo30307z2(View view) {
        return mo9248f0(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3993a();

        /* renamed from: a */
        public int f21995a;

        /* renamed from: d */
        public int f21996d;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState$a */
        public class C3993a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public final boolean mo30315g(int i) {
            int i2 = this.f21995a;
            if (i2 < 0 || i2 >= i) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public final void mo30316h() {
            this.f21995a = -1;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f21995a + ", mAnchorOffset=" + this.f21996d + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f21995a);
            parcel.writeInt(this.f21996d);
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f21995a = parcel.readInt();
            this.f21996d = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f21995a = savedState.f21995a;
            this.f21996d = savedState.f21996d;
        }
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.f21970e0 = -1;
        this.f21969b1 = new ArrayList();
        this.f21971e1 = new C3998b(this);
        this.f21976r1 = new C3995b();
        this.f21981v1 = -1;
        this.f21982w1 = Integer.MIN_VALUE;
        this.f21983x1 = Integer.MIN_VALUE;
        this.f21984y1 = Integer.MIN_VALUE;
        this.f21960A1 = new SparseArray<>();
        this.f21963D1 = -1;
        this.f21964E1 = new C3998b.C4000b();
        mo30274Q2(i);
        mo30275R2(i2);
        mo30273P2(4);
        this.f21961B1 = context;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3992a();

        /* renamed from: A */
        public int f21986A;

        /* renamed from: B */
        public int f21987B = 16777215;

        /* renamed from: C */
        public int f21988C = 16777215;

        /* renamed from: H */
        public boolean f21989H;

        /* renamed from: k */
        public float f21990k = Utils.FLOAT_EPSILON;

        /* renamed from: r */
        public float f21991r = 1.0f;

        /* renamed from: s */
        public int f21992s = -1;

        /* renamed from: x */
        public float f21993x = -1.0f;

        /* renamed from: y */
        public int f21994y;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a */
        public class C3992a implements Parcelable.Creator<LayoutParams> {
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: L */
        public int mo30172L() {
            return this.f21992s;
        }

        /* renamed from: N */
        public float mo30173N() {
            return this.f21991r;
        }

        /* renamed from: O0 */
        public void mo30174O0(int i) {
            this.f21994y = i;
        }

        /* renamed from: P0 */
        public int mo30175P0() {
            return this.bottomMargin;
        }

        /* renamed from: Q0 */
        public int mo30176Q0() {
            return this.leftMargin;
        }

        /* renamed from: S */
        public int mo30177S() {
            return this.f21994y;
        }

        /* renamed from: c0 */
        public int mo30178c0() {
            return this.topMargin;
        }

        /* renamed from: d1 */
        public int mo30179d1() {
            return this.rightMargin;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e0 */
        public void mo30180e0(int i) {
            this.f21986A = i;
        }

        /* renamed from: g0 */
        public float mo30181g0() {
            return this.f21990k;
        }

        /* renamed from: g1 */
        public int mo30182g1() {
            return this.f21986A;
        }

        public int getHeight() {
            return this.height;
        }

        public int getOrder() {
            return 1;
        }

        public int getWidth() {
            return this.width;
        }

        /* renamed from: j1 */
        public int mo30186j1() {
            return this.f21988C;
        }

        /* renamed from: l0 */
        public float mo30187l0() {
            return this.f21993x;
        }

        /* renamed from: q0 */
        public boolean mo30188q0() {
            return this.f21989H;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f21990k);
            parcel.writeFloat(this.f21991r);
            parcel.writeInt(this.f21992s);
            parcel.writeFloat(this.f21993x);
            parcel.writeInt(this.f21994y);
            parcel.writeInt(this.f21986A);
            parcel.writeInt(this.f21987B);
            parcel.writeInt(this.f21988C);
            parcel.writeByte(this.f21989H ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        /* renamed from: x0 */
        public int mo30189x0() {
            return this.f21987B;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f21990k = parcel.readFloat();
            this.f21991r = parcel.readFloat();
            this.f21992s = parcel.readInt();
            this.f21993x = parcel.readFloat();
            this.f21994y = parcel.readInt();
            this.f21986A = parcel.readInt();
            this.f21987B = parcel.readInt();
            this.f21988C = parcel.readInt();
            this.f21989H = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f21970e0 = -1;
        this.f21969b1 = new ArrayList();
        this.f21971e1 = new C3998b(this);
        this.f21976r1 = new C3995b();
        this.f21981v1 = -1;
        this.f21982w1 = Integer.MIN_VALUE;
        this.f21983x1 = Integer.MIN_VALUE;
        this.f21984y1 = Integer.MIN_VALUE;
        this.f21960A1 = new SparseArray<>();
        this.f21963D1 = -1;
        this.f21964E1 = new C3998b.C4000b();
        RecyclerView.LayoutManager.Properties p0 = RecyclerView.LayoutManager.m8982p0(context, attributeSet, i, i2);
        int i3 = p0.f6468a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (p0.f6470c) {
                    mo30274Q2(3);
                } else {
                    mo30274Q2(2);
                }
            }
        } else if (p0.f6470c) {
            mo30274Q2(1);
        } else {
            mo30274Q2(0);
        }
        mo30275R2(1);
        mo30273P2(4);
        this.f21961B1 = context;
    }
}
