package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import p000.C3335t8;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: A1 */
    public final SparseIntArray f6307A1 = new SparseIntArray();

    /* renamed from: B1 */
    public C1221b f6308B1 = new C1220a();

    /* renamed from: C1 */
    public final Rect f6309C1 = new Rect();

    /* renamed from: D1 */
    public boolean f6310D1;

    /* renamed from: v1 */
    public boolean f6311v1 = false;

    /* renamed from: w1 */
    public int f6312w1 = -1;

    /* renamed from: x1 */
    public int[] f6313x1;

    /* renamed from: y1 */
    public View[] f6314y1;

    /* renamed from: z1 */
    public final SparseIntArray f6315z1 = new SparseIntArray();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1220a extends C1221b {
        /* renamed from: e */
        public int mo8866e(int i, int i2) {
            return i % i2;
        }

        /* renamed from: f */
        public int mo8867f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class C1221b {

        /* renamed from: a */
        public final SparseIntArray f6318a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f6319b = new SparseIntArray();

        /* renamed from: c */
        public boolean f6320c = false;

        /* renamed from: d */
        public boolean f6321d = false;

        /* renamed from: a */
        public static int m8743a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* renamed from: b */
        public int mo8868b(int i, int i2) {
            if (!this.f6321d) {
                return mo8870d(i, i2);
            }
            int i3 = this.f6319b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo8870d(i, i2);
            this.f6319b.put(i, d);
            return d;
        }

        /* renamed from: c */
        public int mo8869c(int i, int i2) {
            if (!this.f6320c) {
                return mo8866e(i, i2);
            }
            int i3 = this.f6318a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo8866e(i, i2);
            this.f6318a.put(i, e);
            return e;
        }

        /* renamed from: d */
        public int mo8870d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int a;
            if (!this.f6321d || (a = m8743a(this.f6319b, i)) == -1) {
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                i5 = this.f6319b.get(a);
                i4 = a + 1;
                i3 = mo8869c(a, i2) + mo8867f(a);
                if (i3 == i2) {
                    i5++;
                    i3 = 0;
                }
            }
            int f = mo8867f(i);
            while (i4 < i) {
                int f2 = mo8867f(i4);
                int i6 = i3 + f2;
                if (i6 == i2) {
                    i5++;
                    i6 = 0;
                } else if (i6 > i2) {
                    i5++;
                    i6 = f2;
                }
                i4++;
            }
            if (i3 + f > i2) {
                return i5 + 1;
            }
            return i5;
        }

        /* renamed from: e */
        public abstract int mo8866e(int i, int i2);

        /* renamed from: f */
        public abstract int mo8867f(int i);

        /* renamed from: g */
        public void mo8871g() {
            this.f6319b.clear();
        }

        /* renamed from: h */
        public void mo8872h() {
            this.f6318a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo8858l3(RecyclerView.LayoutManager.m8982p0(context, attributeSet, i, i2).f6469b);
    }

    /* renamed from: X2 */
    public static int[] m8692X2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: A2 */
    public void mo8818A2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, LinearLayoutManager.C1223a aVar, int i) {
        super.mo8818A2(tVar, xVar, aVar, i);
        mo8859m3();
        if (xVar.mo9525b() > 0 && !xVar.mo9528e()) {
            mo8844b3(tVar, xVar, aVar, i);
        }
        mo8846c3();
    }

    /* renamed from: C */
    public int mo8819C(RecyclerView.C1260x xVar) {
        if (this.f6310D1) {
            return mo8840Z2(xVar);
        }
        return super.mo8819C(xVar);
    }

    /* renamed from: D */
    public int mo8820D(RecyclerView.C1260x xVar) {
        if (this.f6310D1) {
            return mo8842a3(xVar);
        }
        return super.mo8820D(xVar);
    }

    /* renamed from: F */
    public int mo8821F(RecyclerView.C1260x xVar) {
        if (this.f6310D1) {
            return mo8840Z2(xVar);
        }
        return super.mo8821F(xVar);
    }

    /* renamed from: F1 */
    public int mo8822F1(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        mo8859m3();
        mo8846c3();
        return super.mo8822F1(i, tVar, xVar);
    }

    /* renamed from: G */
    public int mo8823G(RecyclerView.C1260x xVar) {
        if (this.f6310D1) {
            return mo8842a3(xVar);
        }
        return super.mo8823G(xVar);
    }

    /* renamed from: H1 */
    public int mo8824H1(int i, RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        mo8859m3();
        mo8846c3();
        return super.mo8824H1(i, tVar, xVar);
    }

    /* renamed from: L1 */
    public void mo8825L1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f6313x1 == null) {
            super.mo8825L1(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f6322U == 1) {
            i4 = RecyclerView.LayoutManager.m8983y(i2, rect.height() + paddingTop, mo9265m0());
            int[] iArr = this.f6313x1;
            i3 = RecyclerView.LayoutManager.m8983y(i, iArr[iArr.length - 1] + paddingLeft, mo9268n0());
        } else {
            i3 = RecyclerView.LayoutManager.m8983y(i, rect.width() + paddingLeft, mo9268n0());
            int[] iArr2 = this.f6313x1;
            i4 = RecyclerView.LayoutManager.m8983y(i2, iArr2[iArr2.length - 1] + paddingTop, mo9265m0());
        }
        mo9216K1(i3, i4);
    }

    /* renamed from: L2 */
    public void mo8826L2(boolean z) {
        if (!z) {
            super.mo8826L2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: O */
    public RecyclerView.LayoutParams mo8827O() {
        if (this.f6322U == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: P */
    public RecyclerView.LayoutParams mo8828P(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: Q */
    public RecyclerView.LayoutParams mo8829Q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == r7) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo8830R0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1254t r26, androidx.recyclerview.widget.RecyclerView.C1260x r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo9219M(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.f6316k
            int r5 = r5.f6317r
            int r5 = r5 + r6
            android.view.View r7 = super.mo8830R0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo8905a2(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f6329k0
            if (r7 == r10) goto L_0x0032
            r7 = r9
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo9234U()
            int r7 = r7 - r9
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo9234U()
            r11 = r7
            r12 = r9
            r7 = 0
        L_0x0045:
            int r13 = r0.f6322U
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo8932w2()
            if (r13 == 0) goto L_0x0051
            r13 = r9
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.mo8851f3(r1, r2, r7)
            r15 = r10
            r16 = r15
            r8 = 0
            r17 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.mo8851f3(r1, r2, r10)
            android.view.View r1 = r0.mo9231T(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.f6316k
            r18 = r3
            int r3 = r9.f6317r
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo9205G0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f6316k
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f6316k
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo8830R0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    /* renamed from: U1 */
    public boolean mo8831U1() {
        if (this.f6332q1 != null || this.f6311v1) {
            return false;
        }
        return true;
    }

    /* renamed from: U2 */
    public final void mo8832U2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i2 = 1;
            i5 = i;
            i3 = 0;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f6314y1[i3];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int h3 = mo8854h3(tVar, xVar, mo9271o0(view));
            layoutParams.f6317r = h3;
            layoutParams.f6316k = i4;
            i4 += h3;
            i3 += i2;
        }
    }

    /* renamed from: V2 */
    public final void mo8833V2() {
        int U = mo9234U();
        for (int i = 0; i < U; i++) {
            LayoutParams layoutParams = (LayoutParams) mo9231T(i).getLayoutParams();
            int a = layoutParams.mo9303a();
            this.f6315z1.put(a, layoutParams.mo8865f());
            this.f6307A1.put(a, layoutParams.mo8864e());
        }
    }

    /* renamed from: W1 */
    public void mo8834W1(RecyclerView.C1260x xVar, LinearLayoutManager.C1225c cVar, RecyclerView.LayoutManager.C1228c cVar2) {
        int i = this.f6312w1;
        for (int i2 = 0; i2 < this.f6312w1 && cVar.mo8954c(xVar) && i > 0; i2++) {
            int i3 = cVar.f6353d;
            cVar2.mo9302a(i3, Math.max(0, cVar.f6356g));
            i -= this.f6308B1.mo8867f(i3);
            cVar.f6353d += cVar.f6354e;
        }
    }

    /* renamed from: W2 */
    public final void mo8835W2(int i) {
        this.f6313x1 = m8692X2(this.f6313x1, this.f6312w1, i);
    }

    /* renamed from: X0 */
    public void mo8836X0(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, View view, C3335t8 t8Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.mo9238W0(view, t8Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int f3 = mo8851f3(tVar, xVar, layoutParams2.mo9303a());
        if (this.f6322U == 0) {
            t8Var.mo26246i0(C3335t8.C3338c.m27596a(layoutParams2.mo8864e(), layoutParams2.mo8865f(), f3, 1, false, false));
            return;
        }
        t8Var.mo26246i0(C3335t8.C3338c.m27596a(f3, 1, layoutParams2.mo8864e(), layoutParams2.mo8865f(), false, false));
    }

    /* renamed from: Y */
    public int mo8837Y(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        if (this.f6322U == 1) {
            return this.f6312w1;
        }
        if (xVar.mo9525b() < 1) {
            return 0;
        }
        return mo8851f3(tVar, xVar, xVar.mo9525b() - 1) + 1;
    }

    /* renamed from: Y2 */
    public final void mo8838Y2() {
        this.f6315z1.clear();
        this.f6307A1.clear();
    }

    /* renamed from: Z0 */
    public void mo8839Z0(RecyclerView recyclerView, int i, int i2) {
        this.f6308B1.mo8872h();
        this.f6308B1.mo8871g();
    }

    /* renamed from: Z2 */
    public final int mo8840Z2(RecyclerView.C1260x xVar) {
        int i;
        if (!(mo9234U() == 0 || xVar.mo9525b() == 0)) {
            mo8907c2();
            boolean x2 = mo8933x2();
            View g2 = mo8912g2(!x2, true);
            View f2 = mo8911f2(!x2, true);
            if (!(g2 == null || f2 == null)) {
                int b = this.f6308B1.mo8868b(mo9271o0(g2), this.f6312w1);
                int b2 = this.f6308B1.mo8868b(mo9271o0(f2), this.f6312w1);
                int min = Math.min(b, b2);
                int max = Math.max(b, b2);
                int b3 = this.f6308B1.mo8868b(xVar.mo9525b() - 1, this.f6312w1) + 1;
                if (this.f6329k0) {
                    i = Math.max(0, (b3 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!x2) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.f6324Y.mo9931d(f2) - this.f6324Y.mo9934g(g2))) / ((float) ((this.f6308B1.mo8868b(mo9271o0(f2), this.f6312w1) - this.f6308B1.mo8868b(mo9271o0(g2), this.f6312w1)) + 1)))) + ((float) (this.f6324Y.mo9940m() - this.f6324Y.mo9934g(g2))));
            }
        }
        return 0;
    }

    /* renamed from: a1 */
    public void mo8841a1(RecyclerView recyclerView) {
        this.f6308B1.mo8872h();
        this.f6308B1.mo8871g();
    }

    /* renamed from: a3 */
    public final int mo8842a3(RecyclerView.C1260x xVar) {
        if (!(mo9234U() == 0 || xVar.mo9525b() == 0)) {
            mo8907c2();
            View g2 = mo8912g2(!mo8933x2(), true);
            View f2 = mo8911f2(!mo8933x2(), true);
            if (!(g2 == null || f2 == null)) {
                if (!mo8933x2()) {
                    return this.f6308B1.mo8868b(xVar.mo9525b() - 1, this.f6312w1) + 1;
                }
                int d = this.f6324Y.mo9931d(f2) - this.f6324Y.mo9934g(g2);
                int b = this.f6308B1.mo8868b(mo9271o0(g2), this.f6312w1);
                return (int) ((((float) d) / ((float) ((this.f6308B1.mo8868b(mo9271o0(f2), this.f6312w1) - b) + 1))) * ((float) (this.f6308B1.mo8868b(xVar.mo9525b() - 1, this.f6312w1) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: b1 */
    public void mo8843b1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f6308B1.mo8872h();
        this.f6308B1.mo8871g();
    }

    /* renamed from: b3 */
    public final void mo8844b3(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, LinearLayoutManager.C1223a aVar, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int g3 = mo8853g3(tVar, xVar, aVar.f6342b);
        if (z) {
            while (g3 > 0) {
                int i2 = aVar.f6342b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f6342b = i3;
                    g3 = mo8853g3(tVar, xVar, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b = xVar.mo9525b() - 1;
        int i4 = aVar.f6342b;
        while (i4 < b) {
            int i5 = i4 + 1;
            int g32 = mo8853g3(tVar, xVar, i5);
            if (g32 <= g3) {
                break;
            }
            i4 = i5;
            g3 = g32;
        }
        aVar.f6342b = i4;
    }

    /* renamed from: c1 */
    public void mo8845c1(RecyclerView recyclerView, int i, int i2) {
        this.f6308B1.mo8872h();
        this.f6308B1.mo8871g();
    }

    /* renamed from: c3 */
    public final void mo8846c3() {
        View[] viewArr = this.f6314y1;
        if (viewArr == null || viewArr.length != this.f6312w1) {
            this.f6314y1 = new View[this.f6312w1];
        }
    }

    /* renamed from: d3 */
    public int mo8847d3(int i, int i2) {
        if (this.f6322U != 1 || !mo8932w2()) {
            int[] iArr = this.f6313x1;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f6313x1;
        int i3 = this.f6312w1;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: e1 */
    public void mo8848e1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f6308B1.mo8872h();
        this.f6308B1.mo8871g();
    }

    /* renamed from: e3 */
    public int mo8849e3() {
        return this.f6312w1;
    }

    /* renamed from: f1 */
    public void mo8850f1(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        if (xVar.mo9528e()) {
            mo8833V2();
        }
        super.mo8850f1(tVar, xVar);
        mo8838Y2();
    }

    /* renamed from: f3 */
    public final int mo8851f3(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, int i) {
        if (!xVar.mo9528e()) {
            return this.f6308B1.mo8868b(i, this.f6312w1);
        }
        int f = tVar.mo9477f(i);
        if (f != -1) {
            return this.f6308B1.mo8868b(f, this.f6312w1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        return 0;
    }

    /* renamed from: g1 */
    public void mo8852g1(RecyclerView.C1260x xVar) {
        super.mo8852g1(xVar);
        this.f6311v1 = false;
    }

    /* renamed from: g3 */
    public final int mo8853g3(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, int i) {
        if (!xVar.mo9528e()) {
            return this.f6308B1.mo8869c(i, this.f6312w1);
        }
        int i2 = this.f6307A1.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = tVar.mo9477f(i);
        if (f != -1) {
            return this.f6308B1.mo8869c(f, this.f6312w1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        return 0;
    }

    /* renamed from: h3 */
    public final int mo8854h3(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, int i) {
        if (!xVar.mo9528e()) {
            return this.f6308B1.mo8867f(i);
        }
        int i2 = this.f6315z1.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = tVar.mo9477f(i);
        if (f != -1) {
            return this.f6308B1.mo8867f(f);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        return 1;
    }

    /* renamed from: i3 */
    public final void mo8855i3(float f, int i) {
        mo8835W2(Math.max(Math.round(f * ((float) this.f6312w1)), i));
    }

    /* renamed from: j3 */
    public final void mo8856j3(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f6475d;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int d3 = mo8847d3(layoutParams.f6316k, layoutParams.f6317r);
        if (this.f6322U == 1) {
            i2 = RecyclerView.LayoutManager.m8981V(d3, i, i5, layoutParams.width, false);
            i3 = RecyclerView.LayoutManager.m8981V(this.f6324Y.mo9941n(), mo9258i0(), i4, layoutParams.height, true);
        } else {
            int V = RecyclerView.LayoutManager.m8981V(d3, i, i4, layoutParams.height, false);
            int V2 = RecyclerView.LayoutManager.m8981V(this.f6324Y.mo9941n(), mo9290w0(), i5, layoutParams.width, true);
            i3 = V;
            i2 = V2;
        }
        mo8857k3(view, i2, i3, z);
    }

    /* renamed from: k3 */
    public final void mo8857k3(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = mo9227Q1(view, i, i2, layoutParams);
        } else {
            z2 = mo9225O1(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: l3 */
    public void mo8858l3(int i) {
        if (i != this.f6312w1) {
            this.f6311v1 = true;
            if (i >= 1) {
                this.f6312w1 = i;
                this.f6308B1.mo8872h();
                mo9200C1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: m3 */
    public final void mo8859m3() {
        int i;
        int i2;
        if (mo8930v2() == 1) {
            i2 = mo9288v0() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = mo9256h0() - getPaddingBottom();
            i = getPaddingTop();
        }
        mo8835W2(i2 - i);
    }

    /* renamed from: p2 */
    public View mo8860p2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, boolean z, boolean z2) {
        int i;
        int U = mo9234U();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = mo9234U() - 1;
            i3 = -1;
        } else {
            i2 = U;
            i = 0;
        }
        int b = xVar.mo9525b();
        mo8907c2();
        int m = this.f6324Y.mo9940m();
        int i4 = this.f6324Y.mo9936i();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View T = mo9231T(i);
            int o0 = mo9271o0(T);
            if (o0 >= 0 && o0 < b && mo8853g3(tVar, xVar, o0) == 0) {
                if (((RecyclerView.LayoutParams) T.getLayoutParams()).mo9305c()) {
                    if (view2 == null) {
                        view2 = T;
                    }
                } else if (this.f6324Y.mo9934g(T) < i4 && this.f6324Y.mo9931d(T) >= m) {
                    return T;
                } else {
                    if (view == null) {
                        view = T;
                    }
                }
            }
            i += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* renamed from: r0 */
    public int mo8861r0(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar) {
        if (this.f6322U == 0) {
            return this.f6312w1;
        }
        if (xVar.mo9525b() < 1) {
            return 0;
        }
        return mo8851f3(tVar, xVar, xVar.mo9525b() - 1) + 1;
    }

    /* renamed from: x */
    public boolean mo8862x(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: y2 */
    public void mo8863y2(RecyclerView.C1254t tVar, RecyclerView.C1260x xVar, LinearLayoutManager.C1225c cVar, LinearLayoutManager.C1224b bVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        View d;
        RecyclerView.C1254t tVar2 = tVar;
        RecyclerView.C1260x xVar2 = xVar;
        LinearLayoutManager.C1225c cVar2 = cVar;
        LinearLayoutManager.C1224b bVar2 = bVar;
        int l = this.f6324Y.mo9939l();
        boolean z3 = false;
        if (l != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (mo9234U() > 0) {
            i = this.f6313x1[this.f6312w1];
        } else {
            i = 0;
        }
        if (z) {
            mo8859m3();
        }
        if (cVar2.f6354e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i12 = this.f6312w1;
        if (!z2) {
            i12 = mo8853g3(tVar2, xVar2, cVar2.f6353d) + mo8854h3(tVar2, xVar2, cVar2.f6353d);
        }
        int i13 = 0;
        while (i13 < this.f6312w1 && cVar2.mo8954c(xVar2) && i12 > 0) {
            int i14 = cVar2.f6353d;
            int h3 = mo8854h3(tVar2, xVar2, i14);
            if (h3 <= this.f6312w1) {
                i12 -= h3;
                if (i12 < 0 || (d = cVar2.mo8955d(tVar2)) == null) {
                    break;
                }
                this.f6314y1[i13] = d;
                i13++;
            } else {
                throw new IllegalArgumentException("Item at position " + i14 + " requires " + h3 + " spans but GridLayoutManager has only " + this.f6312w1 + " spans.");
            }
        }
        if (i13 == 0) {
            bVar2.f6347b = true;
            return;
        }
        float f = Utils.FLOAT_EPSILON;
        mo8832U2(tVar2, xVar2, i13, z2);
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            View view = this.f6314y1[i15];
            if (cVar2.f6361l == null) {
                if (z2) {
                    mo9270o(view);
                } else {
                    mo9273p(view, z3);
                }
            } else if (z2) {
                mo9264m(view);
            } else {
                mo9267n(view, z3 ? 1 : 0);
            }
            mo9285u(view, this.f6309C1);
            mo8856j3(view, l, z3);
            int e = this.f6324Y.mo9932e(view);
            if (e > i16) {
                i16 = e;
            }
            float f2 = (((float) this.f6324Y.mo9933f(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).f6317r);
            if (f2 > f) {
                f = f2;
            }
            i15++;
            z3 = false;
        }
        if (z) {
            mo8855i3(f, i);
            i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                View view2 = this.f6314y1[i17];
                mo8856j3(view2, 1073741824, true);
                int e2 = this.f6324Y.mo9932e(view2);
                if (e2 > i16) {
                    i16 = e2;
                }
            }
        }
        for (int i18 = 0; i18 < i13; i18++) {
            View view3 = this.f6314y1[i18];
            if (this.f6324Y.mo9932e(view3) != i16) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f6475d;
                int i19 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i20 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int d3 = mo8847d3(layoutParams.f6316k, layoutParams.f6317r);
                if (this.f6322U == 1) {
                    i11 = RecyclerView.LayoutManager.m8981V(d3, 1073741824, i20, layoutParams.width, false);
                    i10 = View.MeasureSpec.makeMeasureSpec(i16 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                    i10 = RecyclerView.LayoutManager.m8981V(d3, 1073741824, i19, layoutParams.height, false);
                    i11 = makeMeasureSpec;
                }
                mo8857k3(view3, i11, i10, true);
            }
        }
        int i21 = 0;
        bVar2.f6346a = i16;
        if (this.f6322U == 1) {
            if (cVar2.f6355f == -1) {
                i5 = cVar2.f6351b;
                i2 = i5 - i16;
            } else {
                int i22 = cVar2.f6351b;
                i2 = i22;
                i5 = i16 + i22;
            }
            i4 = 0;
            i3 = 0;
        } else if (cVar2.f6355f == -1) {
            int i23 = cVar2.f6351b;
            i3 = i23 - i16;
            i2 = 0;
            i4 = i23;
            i5 = 0;
        } else {
            int i24 = cVar2.f6351b;
            i4 = i16 + i24;
            i3 = i24;
            i5 = 0;
            i2 = 0;
        }
        while (i21 < i13) {
            View view4 = this.f6314y1[i21];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f6322U == 1) {
                if (mo8932w2()) {
                    int paddingLeft = getPaddingLeft() + this.f6313x1[this.f6312w1 - layoutParams2.f6316k];
                    i9 = i5;
                    i8 = paddingLeft;
                    i7 = paddingLeft - this.f6324Y.mo9933f(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f6313x1[layoutParams2.f6316k];
                    i9 = i5;
                    i7 = paddingLeft2;
                    i8 = this.f6324Y.mo9933f(view4) + paddingLeft2;
                }
                i6 = i2;
            } else {
                int paddingTop = getPaddingTop() + this.f6313x1[layoutParams2.f6316k];
                i6 = paddingTop;
                i8 = i4;
                i7 = i3;
                i9 = this.f6324Y.mo9933f(view4) + paddingTop;
            }
            mo9207H0(view4, i7, i6, i8, i9);
            if (layoutParams2.mo9305c() || layoutParams2.mo9304b()) {
                bVar2.f6348c = true;
            }
            bVar2.f6349d |= view4.hasFocusable();
            i21++;
            i5 = i9;
            i4 = i8;
            i3 = i7;
            i2 = i6;
        }
        Arrays.fill(this.f6314y1, (Object) null);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: k */
        public int f6316k = -1;

        /* renamed from: r */
        public int f6317r = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public int mo8864e() {
            return this.f6316k;
        }

        /* renamed from: f */
        public int mo8865f() {
            return this.f6317r;
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

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo8858l3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo8858l3(i);
    }
}
