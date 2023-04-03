package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    public int[] f3070a = new int[32];

    /* renamed from: d */
    public int f3071d;

    /* renamed from: e */
    public Context f3072e;

    /* renamed from: g */
    public vl2 f3073g;

    /* renamed from: k */
    public boolean f3074k = false;

    /* renamed from: r */
    public String f3075r;

    /* renamed from: s */
    public String f3076s;

    /* renamed from: x */
    public View[] f3077x = null;

    /* renamed from: y */
    public HashMap<Integer, String> f3078y = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.f3072e = context;
        mo4593o((AttributeSet) null);
    }

    /* renamed from: e */
    public final void mo5045e(String str) {
        if (str != null && str.length() != 0 && this.f3072e != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int m = mo5053m(trim);
            if (m != 0) {
                this.f3078y.put(Integer.valueOf(m), trim);
                mo5046f(m);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
        }
    }

    /* renamed from: f */
    public final void mo5046f(int i) {
        if (i != getId()) {
            int i2 = this.f3071d + 1;
            int[] iArr = this.f3070a;
            if (i2 > iArr.length) {
                this.f3070a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f3070a;
            int i3 = this.f3071d;
            iArr2[i3] = i;
            this.f3071d = i3 + 1;
        }
    }

    /* renamed from: g */
    public final void mo5047g(String str) {
        if (str != null && str.length() != 0 && this.f3072e != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout != null) {
                int childCount = constraintLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = constraintLayout.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).f3132b0)) {
                        if (childAt.getId() == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("to use ConstraintTag view ");
                            sb.append(childAt.getClass().getSimpleName());
                            sb.append(" must have an ID");
                        } else {
                            mo5046f(childAt.getId());
                        }
                    }
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3070a, this.f3071d);
    }

    /* renamed from: h */
    public void mo5049h() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo5050i((ConstraintLayout) parent);
        }
    }

    /* renamed from: i */
    public void mo5050i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f3071d; i++) {
            View i2 = constraintLayout.mo5078i(this.f3070a[i]);
            if (i2 != null) {
                i2.setVisibility(visibility);
                if (elevation > Utils.FLOAT_EPSILON) {
                    i2.setTranslationZ(i2.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo4626j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public final int[] mo5051k(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String trim : split) {
            int m = mo5053m(trim.trim());
            if (m != 0) {
                iArr[i] = m;
                i++;
            }
        }
        if (i != split.length) {
            return Arrays.copyOf(iArr, i);
        }
        return iArr;
    }

    /* renamed from: l */
    public final int mo5052l(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f3072e.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: m */
    public final int mo5053m(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object g = constraintLayout.mo5068g(0, str);
            if (g instanceof Integer) {
                i = ((Integer) g).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = mo5052l(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = p35.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.f3072e.getResources().getIdentifier(str, "id", this.f3072e.getPackageName());
        }
        return i;
    }

    /* renamed from: n */
    public View[] mo5054n(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f3077x;
        if (viewArr == null || viewArr.length != this.f3071d) {
            this.f3077x = new View[this.f3071d];
        }
        for (int i = 0; i < this.f3071d; i++) {
            this.f3077x[i] = constraintLayout.mo5078i(this.f3070a[i]);
        }
        return this.f3077x;
    }

    /* renamed from: o */
    public void mo4593o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3075r = string;
                    setIds(string);
                } else if (index == c65.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f3076s = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3075r;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f3076s;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        if (this.f3074k) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public void mo4599p(C0532a.C0533a aVar, wl2 wl2, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        C0532a.C0535b bVar = aVar.f3224e;
        int[] iArr = bVar.f3286j0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f3288k0;
            if (str != null) {
                if (str.length() > 0) {
                    C0532a.C0535b bVar2 = aVar.f3224e;
                    bVar2.f3286j0 = mo5051k(this, bVar2.f3288k0);
                } else {
                    aVar.f3224e.f3286j0 = null;
                }
            }
        }
        if (wl2 != null) {
            wl2.mo27210b();
            if (aVar.f3224e.f3286j0 != null) {
                int i = 0;
                while (true) {
                    int[] iArr2 = aVar.f3224e.f3286j0;
                    if (i < iArr2.length) {
                        ConstraintWidget constraintWidget = sparseArray.get(iArr2[i]);
                        if (constraintWidget != null) {
                            wl2.mo27209a(constraintWidget);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void mo4600q(ConstraintWidget constraintWidget, boolean z) {
    }

    /* renamed from: r */
    public void mo4627r(ConstraintLayout constraintLayout) {
    }

    /* renamed from: s */
    public void mo5056s(ConstraintLayout constraintLayout) {
    }

    public void setIds(String str) {
        this.f3075r = str;
        if (str != null) {
            int i = 0;
            this.f3071d = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo5045e(str.substring(i));
                    return;
                } else {
                    mo5045e(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f3076s = str;
        if (str != null) {
            int i = 0;
            this.f3071d = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo5047g(str.substring(i));
                    return;
                } else {
                    mo5047g(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3075r = null;
        this.f3071d = 0;
        for (int f : iArr) {
            mo5046f(f);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f3075r == null) {
            mo5046f(i);
        }
    }

    /* renamed from: t */
    public void mo4637t(ConstraintLayout constraintLayout) {
    }

    /* renamed from: u */
    public void mo4644u(C0486d dVar, vl2 vl2, SparseArray<ConstraintWidget> sparseArray) {
        vl2.mo27210b();
        for (int i = 0; i < this.f3071d; i++) {
            vl2.mo27209a(sparseArray.get(this.f3070a[i]));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f3078y.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5061v(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f3075r
            r5.setIds(r0)
        L_0x000b:
            vl2 r0 = r5.f3073g
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo27210b()
            r0 = 0
        L_0x0014:
            int r1 = r5.f3071d
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f3070a
            r1 = r1[r0]
            android.view.View r2 = r6.mo5078i(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f3078y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.mo5052l(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f3070a
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f3078y
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.mo5078i(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            vl2 r1 = r5.f3073g
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.mo5079j(r2)
            r1.mo27209a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            vl2 r0 = r5.f3073g
            androidx.constraintlayout.core.widgets.d r6 = r6.f3093e
            r0.mo4564c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.mo5061v(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* renamed from: w */
    public void mo5062w() {
        if (this.f3073g != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f3170u0 = (ConstraintWidget) this.f3073g;
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3072e = context;
        mo4593o(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3072e = context;
        mo4593o(attributeSet);
    }
}
