package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.flexbox.b */
/* compiled from: FlexboxHelper */
public class C3998b {

    /* renamed from: a */
    public final g42 f22033a;

    /* renamed from: b */
    public boolean[] f22034b;

    /* renamed from: c */
    public int[] f22035c;

    /* renamed from: d */
    public long[] f22036d;

    /* renamed from: e */
    public long[] f22037e;

    /* renamed from: com.google.android.flexbox.b$b */
    /* compiled from: FlexboxHelper */
    public static class C4000b {

        /* renamed from: a */
        public List<C3997a> f22038a;

        /* renamed from: b */
        public int f22039b;

        /* renamed from: a */
        public void mo30385a() {
            this.f22038a = null;
            this.f22039b = 0;
        }
    }

    /* renamed from: com.google.android.flexbox.b$c */
    /* compiled from: FlexboxHelper */
    public static class C4001c implements Comparable<C4001c> {

        /* renamed from: a */
        public int f22040a;

        /* renamed from: d */
        public int f22041d;

        public C4001c() {
        }

        /* renamed from: a */
        public int compareTo(C4001c cVar) {
            int i = this.f22041d;
            int i2 = cVar.f22041d;
            if (i != i2) {
                return i - i2;
            }
            return this.f22040a - cVar.f22040a;
        }

        public String toString() {
            return "Order{order=" + this.f22041d + ", index=" + this.f22040a + '}';
        }
    }

    public C3998b(g42 g42) {
        this.f22033a = g42;
    }

    /* renamed from: A */
    public final int mo30333A(int i, FlexItem flexItem, int i2) {
        g42 g42 = this.f22033a;
        int c = g42.mo30194c(i, g42.getPaddingLeft() + this.f22033a.getPaddingRight() + flexItem.mo30176Q0() + flexItem.mo30179d1() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(c);
        if (size > flexItem.mo30189x0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo30189x0(), View.MeasureSpec.getMode(c));
        }
        if (size < flexItem.mo30177S()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo30177S(), View.MeasureSpec.getMode(c));
        }
        return c;
    }

    /* renamed from: B */
    public final int mo30334B(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo30175P0();
        }
        return flexItem.mo30179d1();
    }

    /* renamed from: C */
    public final int mo30335C(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo30179d1();
        }
        return flexItem.mo30175P0();
    }

    /* renamed from: D */
    public final int mo30336D(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo30178c0();
        }
        return flexItem.mo30176Q0();
    }

    /* renamed from: E */
    public final int mo30337E(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo30176Q0();
        }
        return flexItem.mo30178c0();
    }

    /* renamed from: F */
    public final int mo30338F(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getHeight();
        }
        return flexItem.getWidth();
    }

    /* renamed from: G */
    public final int mo30339G(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getWidth();
        }
        return flexItem.getHeight();
    }

    /* renamed from: H */
    public final int mo30340H(boolean z) {
        if (z) {
            return this.f22033a.getPaddingBottom();
        }
        return this.f22033a.getPaddingEnd();
    }

    /* renamed from: I */
    public final int mo30341I(boolean z) {
        if (z) {
            return this.f22033a.getPaddingEnd();
        }
        return this.f22033a.getPaddingBottom();
    }

    /* renamed from: J */
    public final int mo30342J(boolean z) {
        if (z) {
            return this.f22033a.getPaddingTop();
        }
        return this.f22033a.getPaddingStart();
    }

    /* renamed from: K */
    public final int mo30343K(boolean z) {
        if (z) {
            return this.f22033a.getPaddingStart();
        }
        return this.f22033a.getPaddingTop();
    }

    /* renamed from: L */
    public final int mo30344L(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: M */
    public final int mo30345M(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: N */
    public final boolean mo30346N(int i, int i2, C3997a aVar) {
        if (i != i2 - 1 || aVar.mo30331c() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public boolean mo30347O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f22033a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View e = this.f22033a.mo30197e(i);
            if (e != null && ((FlexItem) e.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo30348P(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.f22033a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.mo30188q0()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f22033a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int k = this.f22033a.mo30220k(view, i5, i6);
        if (k > 0) {
            i4 += k;
        }
        if (i2 < i3 + i4) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void mo30349Q(View view, C3997a aVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f22033a.getAlignItems();
        if (flexItem.mo30172L() != -1) {
            alignItems = flexItem.mo30172L();
        }
        int i5 = aVar.f22021g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo30178c0()) - flexItem.mo30175P0()) / 2;
                    if (this.f22033a.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (this.f22033a.getFlexWrap() != 2) {
                    int max = Math.max(aVar.f22026l - view.getBaseline(), flexItem.mo30178c0());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((aVar.f22026l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo30175P0());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.f22033a.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.mo30175P0(), i3, i8 - flexItem.mo30175P0());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.mo30178c0(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.mo30178c0());
                return;
            }
        }
        if (this.f22033a.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.mo30178c0(), i3, i4 + flexItem.mo30178c0());
        } else {
            view.layout(i, i2 - flexItem.mo30175P0(), i3, i4 - flexItem.mo30175P0());
        }
    }

    /* renamed from: R */
    public void mo30350R(View view, C3997a aVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f22033a.getAlignItems();
        if (flexItem.mo30172L() != -1) {
            alignItems = flexItem.mo30172L();
        }
        int i5 = aVar.f22021g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + do3.m15248b(marginLayoutParams)) - do3.m15247a(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo30179d1(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo30179d1(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.mo30176Q0(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.mo30176Q0(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.mo30176Q0(), i2, i3 + flexItem.mo30176Q0(), i4);
        } else {
            view.layout(i - flexItem.mo30179d1(), i2, i3 - flexItem.mo30179d1(), i4);
        }
    }

    /* renamed from: S */
    public long mo30351S(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* renamed from: T */
    public final void mo30352T(int i, int i2, C3997a aVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        C3997a aVar2 = aVar;
        int i9 = i3;
        int i10 = aVar2.f22019e;
        float f = aVar2.f22025k;
        float f2 = Utils.FLOAT_EPSILON;
        if (f > Utils.FLOAT_EPSILON && i9 <= i10) {
            float f3 = ((float) (i10 - i9)) / f;
            aVar2.f22019e = i4 + aVar2.f22020f;
            if (!z) {
                aVar2.f22021g = Integer.MIN_VALUE;
            }
            int i11 = 0;
            boolean z2 = false;
            int i12 = 0;
            float f4 = 0.0f;
            while (i11 < aVar2.f22022h) {
                int i13 = aVar2.f22029o + i11;
                View i14 = this.f22033a.mo30218i(i13);
                if (i14 == null || i14.getVisibility() == 8) {
                    int i15 = i2;
                    i6 = i10;
                    i5 = i11;
                } else {
                    FlexItem flexItem = (FlexItem) i14.getLayoutParams();
                    int flexDirection = this.f22033a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i6 = i10;
                        int i16 = i11;
                        int i17 = i;
                        int measuredWidth = i14.getMeasuredWidth();
                        long[] jArr = this.f22037e;
                        if (jArr != null) {
                            measuredWidth = mo30383y(jArr[i13]);
                        }
                        int measuredHeight = i14.getMeasuredHeight();
                        long[] jArr2 = this.f22037e;
                        int i18 = i16;
                        if (jArr2 != null) {
                            measuredHeight = mo30382x(jArr2[i13]);
                        }
                        if (this.f22034b[i13] || flexItem.mo30173N() <= Utils.FLOAT_EPSILON) {
                            int i19 = i2;
                            i8 = i18;
                        } else {
                            float N = ((float) measuredWidth) - (flexItem.mo30173N() * f3);
                            i8 = i18;
                            if (i8 == aVar2.f22022h - 1) {
                                N += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(N);
                            if (round < flexItem.mo30177S()) {
                                round = flexItem.mo30177S();
                                this.f22034b[i13] = true;
                                aVar2.f22025k -= flexItem.mo30173N();
                                z2 = true;
                            } else {
                                f4 += N - ((float) round);
                                double d = (double) f4;
                                if (d > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int z3 = mo30384z(i2, flexItem, aVar2.f22027m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            i14.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = i14.getMeasuredWidth();
                            int measuredHeight2 = i14.getMeasuredHeight();
                            mo30358Z(i13, makeMeasureSpec, z3, i14);
                            this.f22033a.mo30219j(i13, i14);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i12, measuredHeight + flexItem.mo30178c0() + flexItem.mo30175P0() + this.f22033a.mo30199g(i14));
                        aVar2.f22019e += measuredWidth + flexItem.mo30176Q0() + flexItem.mo30179d1();
                        i7 = max;
                    } else {
                        int measuredHeight3 = i14.getMeasuredHeight();
                        long[] jArr3 = this.f22037e;
                        if (jArr3 != null) {
                            measuredHeight3 = mo30382x(jArr3[i13]);
                        }
                        int measuredWidth3 = i14.getMeasuredWidth();
                        long[] jArr4 = this.f22037e;
                        if (jArr4 != null) {
                            measuredWidth3 = mo30383y(jArr4[i13]);
                        }
                        if (this.f22034b[i13] || flexItem.mo30173N() <= f2) {
                            i6 = i10;
                            i5 = i11;
                            int i20 = i;
                        } else {
                            float N2 = ((float) measuredHeight3) - (flexItem.mo30173N() * f3);
                            if (i11 == aVar2.f22022h - 1) {
                                N2 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(N2);
                            if (round2 < flexItem.mo30182g1()) {
                                round2 = flexItem.mo30182g1();
                                this.f22034b[i13] = true;
                                aVar2.f22025k -= flexItem.mo30173N();
                                i6 = i10;
                                i5 = i11;
                                z2 = true;
                            } else {
                                f4 += N2 - ((float) round2);
                                i6 = i10;
                                i5 = i11;
                                double d2 = (double) f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int A = mo30333A(i, flexItem, aVar2.f22027m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            i14.measure(A, makeMeasureSpec2);
                            measuredWidth3 = i14.getMeasuredWidth();
                            int measuredHeight4 = i14.getMeasuredHeight();
                            mo30358Z(i13, A, makeMeasureSpec2, i14);
                            this.f22033a.mo30219j(i13, i14);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i12, measuredWidth3 + flexItem.mo30176Q0() + flexItem.mo30179d1() + this.f22033a.mo30199g(i14));
                        aVar2.f22019e += measuredHeight3 + flexItem.mo30178c0() + flexItem.mo30175P0();
                        int i21 = i2;
                    }
                    aVar2.f22021g = Math.max(aVar2.f22021g, i7);
                    i12 = i7;
                }
                i11 = i5 + 1;
                i10 = i6;
                f2 = Utils.FLOAT_EPSILON;
            }
            int i22 = i2;
            int i23 = i10;
            if (z2 && i23 != aVar2.f22019e) {
                mo30352T(i, i2, aVar, i3, i4, true);
            }
        }
    }

    /* renamed from: U */
    public final int[] mo30353U(int i, List<C4001c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C4001c next : list) {
            int i3 = next.f22040a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, next.f22041d);
            i2++;
        }
        return iArr;
    }

    /* renamed from: V */
    public final void mo30354V(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo30176Q0()) - flexItem.mo30179d1()) - this.f22033a.mo30199g(view), flexItem.mo30177S()), flexItem.mo30189x0());
        long[] jArr = this.f22037e;
        if (jArr != null) {
            i3 = mo30382x(jArr[i2]);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        mo30358Z(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f22033a.mo30219j(i2, view);
    }

    /* renamed from: W */
    public final void mo30355W(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo30178c0()) - flexItem.mo30175P0()) - this.f22033a.mo30199g(view), flexItem.mo30182g1()), flexItem.mo30186j1());
        long[] jArr = this.f22037e;
        if (jArr != null) {
            i3 = mo30383y(jArr[i2]);
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        mo30358Z(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f22033a.mo30219j(i2, view);
    }

    /* renamed from: X */
    public void mo30356X() {
        mo30357Y(0);
    }

    /* renamed from: Y */
    public void mo30357Y(int i) {
        int i2;
        View i3;
        int i4 = i;
        if (i4 < this.f22033a.getFlexItemCount()) {
            int flexDirection = this.f22033a.getFlexDirection();
            if (this.f22033a.getAlignItems() == 4) {
                int[] iArr = this.f22035c;
                if (iArr != null) {
                    i2 = iArr[i4];
                } else {
                    i2 = 0;
                }
                List<C3997a> flexLinesInternal = this.f22033a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i2 < size) {
                    C3997a aVar = flexLinesInternal.get(i2);
                    int i5 = aVar.f22022h;
                    for (int i6 = 0; i6 < i5; i6++) {
                        int i7 = aVar.f22029o + i6;
                        if (!(i6 >= this.f22033a.getFlexItemCount() || (i3 = this.f22033a.mo30218i(i7)) == null || i3.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) i3.getLayoutParams();
                            if (flexItem.mo30172L() == -1 || flexItem.mo30172L() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    mo30355W(i3, aVar.f22021g, i7);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    mo30354V(i3, aVar.f22021g, i7);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                            }
                        }
                    }
                    i2++;
                }
                return;
            }
            for (C3997a next : this.f22033a.getFlexLinesInternal()) {
                Iterator<Integer> it = next.f22028n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next2 = it.next();
                        View i8 = this.f22033a.mo30218i(next2.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            mo30355W(i8, next.f22021g, next2.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            mo30354V(i8, next.f22021g, next2.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Z */
    public final void mo30358Z(int i, int i2, int i3, View view) {
        long[] jArr = this.f22036d;
        if (jArr != null) {
            jArr[i] = mo30351S(i2, i3);
        }
        long[] jArr2 = this.f22037e;
        if (jArr2 != null) {
            jArr2[i] = mo30351S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    public final void mo30359a(List<C3997a> list, C3997a aVar, int i, int i2) {
        aVar.f22027m = i2;
        this.f22033a.mo30217h(aVar);
        aVar.f22030p = i;
        list.add(aVar);
    }

    /* renamed from: b */
    public void mo30360b(C4000b bVar, int i, int i2, int i3, int i4, int i5, List<C3997a> list) {
        ArrayList arrayList;
        boolean z;
        int i6;
        int i7;
        C4000b bVar2;
        int i8;
        int i9;
        List<C3997a> list2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        int i16;
        boolean z2;
        boolean z3;
        int i17;
        int i18;
        C4000b bVar3 = bVar;
        int i19 = i;
        int i20 = i2;
        int i21 = i5;
        boolean l = this.f22033a.mo30221l();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        bVar3.f22038a = arrayList;
        if (i21 == -1) {
            z = true;
        } else {
            z = false;
        }
        int K = mo30343K(l);
        int I = mo30341I(l);
        int J = mo30342J(l);
        int H = mo30340H(l);
        C3997a aVar = new C3997a();
        int i22 = i4;
        aVar.f22029o = i22;
        int i23 = I + K;
        aVar.f22019e = i23;
        int flexItemCount = this.f22033a.getFlexItemCount();
        boolean z4 = z;
        int i24 = Integer.MIN_VALUE;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (true) {
            if (i6 >= flexItemCount) {
                i7 = i26;
                bVar2 = bVar;
                break;
            }
            View i28 = this.f22033a.mo30218i(i6);
            if (i28 == null) {
                if (mo30346N(i6, flexItemCount, aVar)) {
                    mo30359a(arrayList, aVar, i6, i25);
                }
            } else if (i28.getVisibility() == 8) {
                aVar.f22023i++;
                aVar.f22022h++;
                if (mo30346N(i6, flexItemCount, aVar)) {
                    mo30359a(arrayList, aVar, i6, i25);
                }
            } else {
                if (i28 instanceof CompoundButton) {
                    mo30380v((CompoundButton) i28);
                }
                FlexItem flexItem = (FlexItem) i28.getLayoutParams();
                int i29 = flexItemCount;
                if (flexItem.mo30172L() == 4) {
                    aVar.f22028n.add(Integer.valueOf(i6));
                }
                int G = mo30339G(flexItem, l);
                if (flexItem.mo30187l0() != -1.0f && mode == 1073741824) {
                    G = Math.round(((float) size) * flexItem.mo30187l0());
                }
                if (l) {
                    int c = this.f22033a.mo30194c(i19, i23 + mo30337E(flexItem, true) + mo30335C(flexItem, true), G);
                    i9 = size;
                    i8 = mode;
                    int f = this.f22033a.mo30198f(i20, J + H + mo30336D(flexItem, true) + mo30334B(flexItem, true) + i25, mo30338F(flexItem, true));
                    i28.measure(c, f);
                    mo30358Z(i6, c, f, i28);
                    i14 = c;
                } else {
                    i9 = size;
                    i8 = mode;
                    int c2 = this.f22033a.mo30194c(i20, J + H + mo30336D(flexItem, false) + mo30334B(flexItem, false) + i25, mo30338F(flexItem, false));
                    int f2 = this.f22033a.mo30198f(i19, mo30337E(flexItem, false) + i23 + mo30335C(flexItem, false), G);
                    i28.measure(c2, f2);
                    mo30358Z(i6, c2, f2, i28);
                    i14 = f2;
                }
                this.f22033a.mo30219j(i6, i28);
                mo30367i(i28, i6);
                i26 = View.combineMeasuredStates(i26, i28.getMeasuredState());
                int i30 = i25;
                int i31 = i29;
                C3997a aVar2 = aVar;
                int i32 = i23;
                View view2 = i28;
                int i33 = i6;
                View view3 = view2;
                list2 = arrayList;
                int i34 = i33;
                int i35 = i14;
                if (mo30348P(i28, i8, i9, aVar.f22019e, mo30335C(flexItem, l) + mo30345M(i28, l) + mo30337E(flexItem, l), flexItem, i33, i27, arrayList.size())) {
                    if (aVar2.mo30331c() > 0) {
                        if (i34 > 0) {
                            i18 = i34 - 1;
                        } else {
                            i18 = 0;
                        }
                        C3997a aVar3 = aVar2;
                        mo30359a(list2, aVar3, i18, i30);
                        i25 = aVar3.f22021g + i30;
                    } else {
                        i25 = i30;
                    }
                    if (!l) {
                        i12 = i2;
                        view = view3;
                        i6 = i34;
                        int i36 = i35;
                        if (flexItem.getWidth() == -1) {
                            g42 g42 = this.f22033a;
                            view.measure(g42.mo30194c(i12, g42.getPaddingLeft() + this.f22033a.getPaddingRight() + flexItem.mo30176Q0() + flexItem.mo30179d1() + i25, flexItem.getWidth()), i36);
                            mo30367i(view, i6);
                        }
                    } else if (flexItem.getHeight() == -1) {
                        g42 g422 = this.f22033a;
                        i12 = i2;
                        i6 = i34;
                        view = view3;
                        view.measure(i35, g422.mo30198f(i12, g422.getPaddingTop() + this.f22033a.getPaddingBottom() + flexItem.mo30178c0() + flexItem.mo30175P0() + i25, flexItem.getHeight()));
                        mo30367i(view, i6);
                    } else {
                        i12 = i2;
                        view = view3;
                        i6 = i34;
                    }
                    aVar = new C3997a();
                    aVar.f22022h = 1;
                    i11 = i32;
                    aVar.f22019e = i11;
                    aVar.f22029o = i6;
                    i15 = Integer.MIN_VALUE;
                    i16 = 0;
                } else {
                    i12 = i2;
                    view = view3;
                    i6 = i34;
                    aVar = aVar2;
                    i11 = i32;
                    aVar.f22022h++;
                    i16 = i27 + 1;
                    i25 = i30;
                    i15 = i24;
                }
                boolean z5 = aVar.f22031q;
                if (flexItem.mo30181g0() != Utils.FLOAT_EPSILON) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                aVar.f22031q = z5 | z2;
                boolean z6 = aVar.f22032r;
                if (flexItem.mo30173N() != Utils.FLOAT_EPSILON) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                aVar.f22032r = z6 | z3;
                int[] iArr = this.f22035c;
                if (iArr != null) {
                    iArr[i6] = list2.size();
                }
                aVar.f22019e += mo30345M(view, l) + mo30337E(flexItem, l) + mo30335C(flexItem, l);
                aVar.f22024j += flexItem.mo30181g0();
                aVar.f22025k += flexItem.mo30173N();
                this.f22033a.mo30193b(view, i6, i16, aVar);
                int max = Math.max(i15, mo30344L(view, l) + mo30336D(flexItem, l) + mo30334B(flexItem, l) + this.f22033a.mo30199g(view));
                aVar.f22021g = Math.max(aVar.f22021g, max);
                if (l) {
                    if (this.f22033a.getFlexWrap() != 2) {
                        aVar.f22026l = Math.max(aVar.f22026l, view.getBaseline() + flexItem.mo30178c0());
                    } else {
                        aVar.f22026l = Math.max(aVar.f22026l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.mo30175P0());
                    }
                }
                i13 = i29;
                if (mo30346N(i6, i13, aVar)) {
                    mo30359a(list2, aVar, i6, i25);
                    i25 += aVar.f22021g;
                }
                i10 = i5;
                if (i10 != -1 && list2.size() > 0) {
                    if (list2.get(list2.size() - 1).f22030p >= i10 && i6 >= i10 && !z4) {
                        i25 = -aVar.mo30329a();
                        i17 = i3;
                        z4 = true;
                        if (i25 <= i17 && z4) {
                            bVar2 = bVar;
                            i7 = i26;
                            break;
                        }
                        i27 = i16;
                        i24 = max;
                        i22 = i6 + 1;
                        C4000b bVar4 = bVar;
                        i19 = i;
                        flexItemCount = i13;
                        i20 = i12;
                        i23 = i11;
                        arrayList = list2;
                        mode = i8;
                        i21 = i10;
                        size = i9;
                    }
                }
                i17 = i3;
                if (i25 <= i17) {
                }
                i27 = i16;
                i24 = max;
                i22 = i6 + 1;
                C4000b bVar42 = bVar;
                i19 = i;
                flexItemCount = i13;
                i20 = i12;
                i23 = i11;
                arrayList = list2;
                mode = i8;
                i21 = i10;
                size = i9;
            }
            int i37 = i3;
            i9 = size;
            i8 = mode;
            i12 = i20;
            i10 = i21;
            list2 = arrayList;
            i11 = i23;
            i13 = flexItemCount;
            i22 = i6 + 1;
            C4000b bVar422 = bVar;
            i19 = i;
            flexItemCount = i13;
            i20 = i12;
            i23 = i11;
            arrayList = list2;
            mode = i8;
            i21 = i10;
            size = i9;
        }
        bVar2.f22039b = i7;
    }

    /* renamed from: c */
    public void mo30361c(C4000b bVar, int i, int i2) {
        mo30360b(bVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<C3997a>) null);
    }

    /* renamed from: d */
    public void mo30362d(C4000b bVar, int i, int i2, int i3, int i4, List<C3997a> list) {
        mo30360b(bVar, i, i2, i3, i4, -1, list);
    }

    /* renamed from: e */
    public void mo30363e(C4000b bVar, int i, int i2, int i3, int i4, List<C3997a> list) {
        mo30360b(bVar, i, i2, i3, 0, i4, list);
    }

    /* renamed from: f */
    public void mo30364f(C4000b bVar, int i, int i2) {
        mo30360b(bVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<C3997a>) null);
    }

    /* renamed from: g */
    public void mo30365g(C4000b bVar, int i, int i2, int i3, int i4, List<C3997a> list) {
        mo30360b(bVar, i2, i, i3, i4, -1, list);
    }

    /* renamed from: h */
    public void mo30366h(C4000b bVar, int i, int i2, int i3, int i4, List<C3997a> list) {
        mo30360b(bVar, i2, i, i3, 0, i4, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30367i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo30177S()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.mo30177S()
        L_0x0019:
            r3 = r4
            goto L_0x0027
        L_0x001b:
            int r3 = r0.mo30189x0()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.mo30189x0()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo30182g1()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo30182g1()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.mo30186j1()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.mo30186j1()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.mo30358Z(r8, r1, r0, r7)
            g42 r0 = r6.f22033a
            r0.mo30219j(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C3998b.mo30367i(android.view.View, int):void");
    }

    /* renamed from: j */
    public void mo30368j(List<C3997a> list, int i) {
        int i2 = this.f22035c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f22035c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f22036d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    /* renamed from: k */
    public final List<C3997a> mo30369k(List<C3997a> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C3997a aVar = new C3997a();
        aVar.f22021g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(aVar);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public final List<C4001c> mo30370l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C4001c cVar = new C4001c();
            cVar.f22041d = ((FlexItem) this.f22033a.mo30197e(i2).getLayoutParams()).getOrder();
            cVar.f22040a = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: m */
    public int[] mo30371m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f22033a.getFlexItemCount();
        return mo30353U(flexItemCount, mo30370l(flexItemCount), sparseIntArray);
    }

    /* renamed from: n */
    public int[] mo30372n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f22033a.getFlexItemCount();
        List<C4001c> l = mo30370l(flexItemCount);
        C4001c cVar = new C4001c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            cVar.f22041d = 1;
        } else {
            cVar.f22041d = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount) {
            cVar.f22040a = flexItemCount;
        } else if (i < this.f22033a.getFlexItemCount()) {
            cVar.f22040a = i;
            while (i < flexItemCount) {
                l.get(i).f22040a++;
                i++;
            }
        } else {
            cVar.f22040a = flexItemCount;
        }
        l.add(cVar);
        return mo30353U(flexItemCount + 1, l, sparseIntArray);
    }

    /* renamed from: o */
    public void mo30373o(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f22033a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        List<C3997a> flexLinesInternal = this.f22033a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.f22033a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f22021g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f22033a.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    C3997a aVar = new C3997a();
                    aVar.f22021g = i7;
                    flexLinesInternal.add(0, aVar);
                } else if (alignContent == 2) {
                    this.f22033a.setFlexLines(mo30369k(flexLinesInternal, i5, sumOfCrossSize));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i5) {
                            float size2 = ((float) (i5 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                            int size3 = flexLinesInternal.size();
                            float f = 0.0f;
                            while (i6 < size3) {
                                C3997a aVar2 = flexLinesInternal.get(i6);
                                float f2 = ((float) aVar2.f22021g) + size2;
                                if (i6 == flexLinesInternal.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int round = Math.round(f2);
                                f += f2 - ((float) round);
                                if (f > 1.0f) {
                                    round++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    round--;
                                    f += 1.0f;
                                }
                                aVar2.f22021g = round;
                                i6++;
                            }
                        }
                    } else if (sumOfCrossSize >= i5) {
                        this.f22033a.setFlexLines(mo30369k(flexLinesInternal, i5, sumOfCrossSize));
                    } else {
                        int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        C3997a aVar3 = new C3997a();
                        aVar3.f22021g = size4;
                        for (C3997a add : flexLinesInternal) {
                            arrayList.add(aVar3);
                            arrayList.add(add);
                            arrayList.add(aVar3);
                        }
                        this.f22033a.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i5) {
                    float size5 = ((float) (i5 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i6 < size6) {
                        arrayList2.add(flexLinesInternal.get(i6));
                        if (i6 != flexLinesInternal.size() - 1) {
                            C3997a aVar4 = new C3997a();
                            if (i6 == flexLinesInternal.size() - 2) {
                                aVar4.f22021g = Math.round(f3 + size5);
                                f3 = 0.0f;
                            } else {
                                aVar4.f22021g = Math.round(size5);
                            }
                            int i8 = aVar4.f22021g;
                            f3 += size5 - ((float) i8);
                            if (f3 > 1.0f) {
                                aVar4.f22021g = i8 + 1;
                                f3 -= 1.0f;
                            } else if (f3 < -1.0f) {
                                aVar4.f22021g = i8 - 1;
                                f3 += 1.0f;
                            }
                            arrayList2.add(aVar4);
                        }
                        i6++;
                    }
                    this.f22033a.setFlexLines(arrayList2);
                }
            }
        }
    }

    /* renamed from: p */
    public void mo30374p(int i, int i2) {
        mo30375q(i, i2, 0);
    }

    /* renamed from: q */
    public void mo30375q(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        mo30376r(this.f22033a.getFlexItemCount());
        if (i3 < this.f22033a.getFlexItemCount()) {
            int flexDirection = this.f22033a.getFlexDirection();
            int flexDirection2 = this.f22033a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int largestMainSize = this.f22033a.getLargestMainSize();
                if (mode != 1073741824) {
                    size = Math.min(largestMainSize, size);
                }
                i6 = this.f22033a.getPaddingLeft();
                i4 = this.f22033a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.f22033a.getLargestMainSize();
                }
                i6 = this.f22033a.getPaddingTop();
                i4 = this.f22033a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int i7 = i6 + i4;
            int i8 = 0;
            int[] iArr = this.f22035c;
            if (iArr != null) {
                i8 = iArr[i3];
            }
            List<C3997a> flexLinesInternal = this.f22033a.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            for (int i9 = i8; i9 < size2; i9++) {
                C3997a aVar = flexLinesInternal.get(i9);
                int i10 = aVar.f22019e;
                if (i10 < i5 && aVar.f22031q) {
                    mo30381w(i, i2, aVar, i5, i7, false);
                } else if (i10 > i5 && aVar.f22032r) {
                    mo30352T(i, i2, aVar, i5, i7, false);
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo30376r(int i) {
        boolean[] zArr = this.f22034b;
        if (zArr == null) {
            this.f22034b = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.f22034b = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* renamed from: s */
    public void mo30377s(int i) {
        int[] iArr = this.f22035c;
        if (iArr == null) {
            this.f22035c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f22035c = Arrays.copyOf(this.f22035c, Math.max(iArr.length * 2, i));
        }
    }

    /* renamed from: t */
    public void mo30378t(int i) {
        long[] jArr = this.f22036d;
        if (jArr == null) {
            this.f22036d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f22036d = Arrays.copyOf(this.f22036d, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: u */
    public void mo30379u(int i) {
        long[] jArr = this.f22037e;
        if (jArr == null) {
            this.f22037e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f22037e = Arrays.copyOf(this.f22037e, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: v */
    public final void mo30380v(CompoundButton compoundButton) {
        int i;
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int S = flexItem.mo30177S();
        int g1 = flexItem.mo30182g1();
        Drawable a = fo0.m17152a(compoundButton);
        int i2 = 0;
        if (a == null) {
            i = 0;
        } else {
            i = a.getMinimumWidth();
        }
        if (a != null) {
            i2 = a.getMinimumHeight();
        }
        if (S == -1) {
            S = i;
        }
        flexItem.mo30174O0(S);
        if (g1 == -1) {
            g1 = i2;
        }
        flexItem.mo30180e0(g1);
    }

    /* renamed from: w */
    public final void mo30381w(int i, int i2, C3997a aVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        C3997a aVar2 = aVar;
        int i9 = i3;
        float f = aVar2.f22024j;
        float f2 = Utils.FLOAT_EPSILON;
        if (f > Utils.FLOAT_EPSILON && i9 >= (i5 = aVar2.f22019e)) {
            float f3 = ((float) (i9 - i5)) / f;
            aVar2.f22019e = i4 + aVar2.f22020f;
            if (!z) {
                aVar2.f22021g = Integer.MIN_VALUE;
            }
            int i10 = 0;
            boolean z2 = false;
            int i11 = 0;
            float f4 = 0.0f;
            while (i10 < aVar2.f22022h) {
                int i12 = aVar2.f22029o + i10;
                View i13 = this.f22033a.mo30218i(i12);
                if (i13 == null || i13.getVisibility() == 8) {
                    int i14 = i2;
                    i6 = i5;
                } else {
                    FlexItem flexItem = (FlexItem) i13.getLayoutParams();
                    int flexDirection = this.f22033a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i15 = i5;
                        int i16 = i;
                        int measuredWidth = i13.getMeasuredWidth();
                        long[] jArr = this.f22037e;
                        if (jArr != null) {
                            measuredWidth = mo30383y(jArr[i12]);
                        }
                        int measuredHeight = i13.getMeasuredHeight();
                        long[] jArr2 = this.f22037e;
                        i6 = i15;
                        if (jArr2 != null) {
                            measuredHeight = mo30382x(jArr2[i12]);
                        }
                        if (this.f22034b[i12] || flexItem.mo30181g0() <= Utils.FLOAT_EPSILON) {
                            int i17 = i2;
                        } else {
                            float g0 = ((float) measuredWidth) + (flexItem.mo30181g0() * f3);
                            if (i10 == aVar2.f22022h - 1) {
                                g0 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(g0);
                            if (round > flexItem.mo30189x0()) {
                                round = flexItem.mo30189x0();
                                this.f22034b[i12] = true;
                                aVar2.f22024j -= flexItem.mo30181g0();
                                z2 = true;
                            } else {
                                f4 += g0 - ((float) round);
                                double d3 = (double) f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int z3 = mo30384z(i2, flexItem, aVar2.f22027m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            i13.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = i13.getMeasuredWidth();
                            int measuredHeight2 = i13.getMeasuredHeight();
                            mo30358Z(i12, makeMeasureSpec, z3, i13);
                            this.f22033a.mo30219j(i12, i13);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i11, measuredHeight + flexItem.mo30178c0() + flexItem.mo30175P0() + this.f22033a.mo30199g(i13));
                        aVar2.f22019e += measuredWidth + flexItem.mo30176Q0() + flexItem.mo30179d1();
                        i7 = max;
                    } else {
                        int measuredHeight3 = i13.getMeasuredHeight();
                        long[] jArr3 = this.f22037e;
                        if (jArr3 != null) {
                            measuredHeight3 = mo30382x(jArr3[i12]);
                        }
                        int measuredWidth3 = i13.getMeasuredWidth();
                        long[] jArr4 = this.f22037e;
                        if (jArr4 != null) {
                            measuredWidth3 = mo30383y(jArr4[i12]);
                        }
                        if (this.f22034b[i12] || flexItem.mo30181g0() <= f2) {
                            i8 = i5;
                            int i18 = i;
                        } else {
                            float g02 = ((float) measuredHeight3) + (flexItem.mo30181g0() * f3);
                            if (i10 == aVar2.f22022h - 1) {
                                g02 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(g02);
                            if (round2 > flexItem.mo30186j1()) {
                                round2 = flexItem.mo30186j1();
                                this.f22034b[i12] = true;
                                aVar2.f22024j -= flexItem.mo30181g0();
                                i8 = i5;
                                z2 = true;
                            } else {
                                f4 += g02 - ((float) round2);
                                i8 = i5;
                                double d4 = (double) f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int A = mo30333A(i, flexItem, aVar2.f22027m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            i13.measure(A, makeMeasureSpec2);
                            measuredWidth3 = i13.getMeasuredWidth();
                            int measuredHeight4 = i13.getMeasuredHeight();
                            mo30358Z(i12, A, makeMeasureSpec2, i13);
                            this.f22033a.mo30219j(i12, i13);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i11, measuredWidth3 + flexItem.mo30176Q0() + flexItem.mo30179d1() + this.f22033a.mo30199g(i13));
                        aVar2.f22019e += measuredHeight3 + flexItem.mo30178c0() + flexItem.mo30175P0();
                        int i19 = i2;
                        i6 = i8;
                    }
                    aVar2.f22021g = Math.max(aVar2.f22021g, i7);
                    i11 = i7;
                }
                i10++;
                i5 = i6;
                f2 = Utils.FLOAT_EPSILON;
            }
            int i20 = i2;
            int i21 = i5;
            if (z2 && i21 != aVar2.f22019e) {
                mo30381w(i, i2, aVar, i3, i4, true);
            }
        }
    }

    /* renamed from: x */
    public int mo30382x(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: y */
    public int mo30383y(long j) {
        return (int) j;
    }

    /* renamed from: z */
    public final int mo30384z(int i, FlexItem flexItem, int i2) {
        g42 g42 = this.f22033a;
        int f = g42.mo30198f(i, g42.getPaddingTop() + this.f22033a.getPaddingBottom() + flexItem.mo30178c0() + flexItem.mo30175P0() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(f);
        if (size > flexItem.mo30186j1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo30186j1(), View.MeasureSpec.getMode(f));
        }
        if (size < flexItem.mo30182g1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo30182g1(), View.MeasureSpec.getMode(f));
        }
        return f;
    }
}
