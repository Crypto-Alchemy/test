package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.recyclerview.widget.n */
/* compiled from: LinearSnapHelper */
public class C1329n extends C1343v {

    /* renamed from: d */
    public C1334q f6823d;

    /* renamed from: e */
    public C1334q f6824e;

    /* renamed from: c */
    public int[] mo9911c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.mo8929v()) {
            iArr[0] = mo9915n(view, mo9918q(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.mo8931w()) {
            iArr[1] = mo9915n(view, mo9919r(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: h */
    public View mo9912h(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.mo8931w()) {
            return mo9917p(layoutManager, mo9919r(layoutManager));
        }
        if (layoutManager.mo8929v()) {
            return mo9917p(layoutManager, mo9918q(layoutManager));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r4 = r0 - 1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo9913i(androidx.recyclerview.widget.RecyclerView.LayoutManager r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.recyclerview.widget.RecyclerView.C1257w.C1259b
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.mo9260j0()
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            android.view.View r2 = r8.mo9912h(r9)
            if (r2 != 0) goto L_0x0014
            return r1
        L_0x0014:
            int r2 = r9.mo9271o0(r2)
            if (r2 != r1) goto L_0x001b
            return r1
        L_0x001b:
            r3 = r9
            androidx.recyclerview.widget.RecyclerView$w$b r3 = (androidx.recyclerview.widget.RecyclerView.C1257w.C1259b) r3
            int r4 = r0 + -1
            android.graphics.PointF r3 = r3.mo8904a(r4)
            if (r3 != 0) goto L_0x0027
            return r1
        L_0x0027:
            boolean r5 = r9.mo8929v()
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x003f
            androidx.recyclerview.widget.q r5 = r8.mo9918q(r9)
            int r10 = r8.mo9916o(r9, r5, r10, r7)
            float r5 = r3.x
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
            int r10 = -r10
            goto L_0x0040
        L_0x003f:
            r10 = r7
        L_0x0040:
            boolean r5 = r9.mo8931w()
            if (r5 == 0) goto L_0x0056
            androidx.recyclerview.widget.q r5 = r8.mo9919r(r9)
            int r11 = r8.mo9916o(r9, r5, r7, r11)
            float r3 = r3.y
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0057
            int r11 = -r11
            goto L_0x0057
        L_0x0056:
            r11 = r7
        L_0x0057:
            boolean r9 = r9.mo8931w()
            if (r9 == 0) goto L_0x005e
            r10 = r11
        L_0x005e:
            if (r10 != 0) goto L_0x0061
            return r1
        L_0x0061:
            int r2 = r2 + r10
            if (r2 >= 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r7 = r2
        L_0x0066:
            if (r7 < r0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r4 = r7
        L_0x006a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1329n.mo9913i(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
    }

    /* renamed from: m */
    public final float mo9914m(RecyclerView.LayoutManager layoutManager, C1334q qVar) {
        int max;
        int U = layoutManager.mo9234U();
        if (U == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < U; i3++) {
            View T = layoutManager.mo9231T(i3);
            int o0 = layoutManager.mo9271o0(T);
            if (o0 != -1) {
                if (o0 < i2) {
                    view = T;
                    i2 = o0;
                }
                if (o0 > i) {
                    view2 = T;
                    i = o0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(qVar.mo9931d(view), qVar.mo9931d(view2)) - Math.min(qVar.mo9934g(view), qVar.mo9934g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i - i2) + 1));
    }

    /* renamed from: n */
    public final int mo9915n(View view, C1334q qVar) {
        return (qVar.mo9934g(view) + (qVar.mo9932e(view) / 2)) - (qVar.mo9940m() + (qVar.mo9941n() / 2));
    }

    /* renamed from: o */
    public final int mo9916o(RecyclerView.LayoutManager layoutManager, C1334q qVar, int i, int i2) {
        int i3;
        int[] d = mo9981d(i, i2);
        float m = mo9914m(layoutManager, qVar);
        if (m <= Utils.FLOAT_EPSILON) {
            return 0;
        }
        if (Math.abs(d[0]) > Math.abs(d[1])) {
            i3 = d[0];
        } else {
            i3 = d[1];
        }
        return Math.round(((float) i3) / m);
    }

    /* renamed from: p */
    public final View mo9917p(RecyclerView.LayoutManager layoutManager, C1334q qVar) {
        int U = layoutManager.mo9234U();
        View view = null;
        if (U == 0) {
            return null;
        }
        int m = qVar.mo9940m() + (qVar.mo9941n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < U; i2++) {
            View T = layoutManager.mo9231T(i2);
            int abs = Math.abs((qVar.mo9934g(T) + (qVar.mo9932e(T) / 2)) - m);
            if (abs < i) {
                view = T;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: q */
    public final C1334q mo9918q(RecyclerView.LayoutManager layoutManager) {
        C1334q qVar = this.f6824e;
        if (qVar == null || qVar.f6827a != layoutManager) {
            this.f6824e = C1334q.m9642a(layoutManager);
        }
        return this.f6824e;
    }

    /* renamed from: r */
    public final C1334q mo9919r(RecyclerView.LayoutManager layoutManager) {
        C1334q qVar = this.f6823d;
        if (qVar == null || qVar.f6827a != layoutManager) {
            this.f6823d = C1334q.m9644c(layoutManager);
        }
        return this.f6823d;
    }
}
