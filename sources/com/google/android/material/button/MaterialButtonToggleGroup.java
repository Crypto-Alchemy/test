package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import p000.C3335t8;
import p000.rz5;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: B */
    public static final String f23552B = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: C */
    public static final int f23553C = e55.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: A */
    public int f23554A;

    /* renamed from: a */
    public final List<C4230d> f23555a;

    /* renamed from: d */
    public final C4229c f23556d;

    /* renamed from: e */
    public final C4232f f23557e;

    /* renamed from: g */
    public final LinkedHashSet<C4231e> f23558g;

    /* renamed from: k */
    public final Comparator<MaterialButton> f23559k;

    /* renamed from: r */
    public Integer[] f23560r;

    /* renamed from: s */
    public boolean f23561s;

    /* renamed from: x */
    public boolean f23562x;

    /* renamed from: y */
    public boolean f23563y;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C4227a implements Comparator<MaterialButton> {
        public C4227a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C4228b extends C3715z7 {
        public C4228b() {
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            t8Var.mo26246i0(C3335t8.C3338c.m27596a(0, 1, MaterialButtonToggleGroup.this.mo32013n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public class C4229c implements MaterialButton.C4225a {
        public C4229c() {
        }

        /* renamed from: a */
        public void mo31998a(MaterialButton materialButton, boolean z) {
            int i;
            if (!MaterialButtonToggleGroup.this.f23561s) {
                if (MaterialButtonToggleGroup.this.f23562x) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    if (z) {
                        i = materialButton.getId();
                    } else {
                        i = -1;
                    }
                    int unused = materialButtonToggleGroup.f23554A = i;
                }
                if (MaterialButtonToggleGroup.this.mo32026u(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.mo32011l(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }

        public /* synthetic */ C4229c(MaterialButtonToggleGroup materialButtonToggleGroup, C4227a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public static class C4230d {

        /* renamed from: e */
        public static final du0 f23567e = new C6340p5(Utils.FLOAT_EPSILON);

        /* renamed from: a */
        public du0 f23568a;

        /* renamed from: b */
        public du0 f23569b;

        /* renamed from: c */
        public du0 f23570c;

        /* renamed from: d */
        public du0 f23571d;

        public C4230d(du0 du0, du0 du02, du0 du03, du0 du04) {
            this.f23568a = du0;
            this.f23569b = du03;
            this.f23570c = du04;
            this.f23571d = du02;
        }

        /* renamed from: a */
        public static C4230d m34938a(C4230d dVar) {
            du0 du0 = f23567e;
            return new C4230d(du0, dVar.f23571d, du0, dVar.f23570c);
        }

        /* renamed from: b */
        public static C4230d m34939b(C4230d dVar, View view) {
            if (pe7.m49902h(view)) {
                return m34940c(dVar);
            }
            return m34941d(dVar);
        }

        /* renamed from: c */
        public static C4230d m34940c(C4230d dVar) {
            du0 du0 = dVar.f23568a;
            du0 du02 = dVar.f23571d;
            du0 du03 = f23567e;
            return new C4230d(du0, du02, du03, du03);
        }

        /* renamed from: d */
        public static C4230d m34941d(C4230d dVar) {
            du0 du0 = f23567e;
            return new C4230d(du0, du0, dVar.f23569b, dVar.f23570c);
        }

        /* renamed from: e */
        public static C4230d m34942e(C4230d dVar, View view) {
            if (pe7.m49902h(view)) {
                return m34941d(dVar);
            }
            return m34940c(dVar);
        }

        /* renamed from: f */
        public static C4230d m34943f(C4230d dVar) {
            du0 du0 = dVar.f23568a;
            du0 du02 = f23567e;
            return new C4230d(du0, du02, dVar.f23569b, du02);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public interface C4231e {
        /* renamed from: a */
        void mo32031a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    public class C4232f implements MaterialButton.C4226b {
        public C4232f() {
        }

        /* renamed from: a */
        public void mo31999a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ C4232f(MaterialButtonToggleGroup materialButtonToggleGroup, C4227a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (mo32019p(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (mo32019p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && mo32019p(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.f23554A = i;
        mo32011l(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ga7.m17774k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.mo31928a(this.f23556d);
        materialButton.setOnPressedChangeListenerInternal(this.f23557e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: t */
    public static void m34918t(rz5.C6470b bVar, C4230d dVar) {
        if (dVar == null) {
            bVar.mo47600o(Utils.FLOAT_EPSILON);
        } else {
            bVar.mo47594F(dVar.f23568a).mo47608w(dVar.f23571d).mo47598J(dVar.f23569b).mo47589A(dVar.f23570c);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.isChecked()) {
                mo32026u(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            rz5 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f23555a.add(new C4230d(shapeAppearanceModel.mo47581r(), shapeAppearanceModel.mo47574j(), shapeAppearanceModel.mo47583t(), shapeAppearanceModel.mo47576l()));
            ga7.m17785p0(materialButton, new C4228b());
        }
    }

    public void dispatchDraw(Canvas canvas) {
        mo32027v();
        super.dispatchDraw(canvas);
    }

    /* renamed from: g */
    public void mo32002g(C4231e eVar) {
        this.f23558g.add(eVar);
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f23562x) {
            return this.f23554A;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m = mo32012m(i);
            if (m.isChecked()) {
                arrayList.add(Integer.valueOf(m.getId()));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f23560r;
        if (numArr == null || i2 >= numArr.length) {
            return i2;
        }
        return numArr[i2].intValue();
    }

    /* renamed from: h */
    public final void mo32007h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton m = mo32012m(i);
                int min = Math.min(m.getStrokeWidth(), mo32012m(i - 1).getStrokeWidth());
                LinearLayout.LayoutParams i2 = mo32008i(m);
                if (getOrientation() == 0) {
                    do3.m15249c(i2, 0);
                    do3.m15250d(i2, -min);
                    i2.topMargin = 0;
                } else {
                    i2.bottomMargin = 0;
                    i2.topMargin = -min;
                    do3.m15250d(i2, 0);
                }
                m.setLayoutParams(i2);
            }
            mo32021r(firstVisibleChildIndex);
        }
    }

    /* renamed from: i */
    public final LinearLayout.LayoutParams mo32008i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: j */
    public final void mo32009j(int i, boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(i);
        if (materialButton != null) {
            materialButton.setChecked(z);
        }
    }

    /* renamed from: k */
    public void mo32010k() {
        this.f23561s = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m = mo32012m(i);
            m.setChecked(false);
            mo32011l(m.getId(), false);
        }
        this.f23561s = false;
        setCheckedId(-1);
    }

    /* renamed from: l */
    public final void mo32011l(int i, boolean z) {
        Iterator<C4231e> it = this.f23558g.iterator();
        while (it.hasNext()) {
            it.next().mo32031a(this, i, z);
        }
    }

    /* renamed from: m */
    public final MaterialButton mo32012m(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: n */
    public final int mo32013n(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && mo32019p(i2)) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public final C4230d mo32014o(int i, int i2, int i3) {
        boolean z;
        C4230d dVar = this.f23555a.get(i);
        if (i2 == i3) {
            return dVar;
        }
        if (getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == i2) {
            if (z) {
                return C4230d.m34942e(dVar, this);
            }
            return C4230d.m34943f(dVar);
        } else if (i != i3) {
            return null;
        } else {
            if (z) {
                return C4230d.m34939b(dVar, this);
            }
            return C4230d.m34938a(dVar);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f23554A;
        if (i != -1) {
            mo32009j(i, true);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3335t8 S0 = C3335t8.m27495S0(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (mo32020q()) {
            i = 1;
        } else {
            i = 2;
        }
        S0.mo26243h0(C3335t8.C3337b.m27595b(1, visibleButtonCount, false, i));
    }

    public void onMeasure(int i, int i2) {
        mo32028w();
        mo32007h();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.mo31949h(this.f23556d);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.C4226b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f23555a.remove(indexOfChild);
        }
        mo32028w();
        mo32007h();
    }

    /* renamed from: p */
    public final boolean mo32019p(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo32020q() {
        return this.f23562x;
    }

    /* renamed from: r */
    public final void mo32021r(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mo32012m(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            do3.m15249c(layoutParams, 0);
            do3.m15250d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: s */
    public final void mo32022s(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f23561s = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f23561s = false;
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f23563y = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f23562x != z) {
            this.f23562x = z;
            mo32010k();
        }
    }

    /* renamed from: u */
    public final boolean mo32026u(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f23563y || !checkedButtonIds.isEmpty()) {
            if (z && this.f23562x) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    mo32022s(intValue2, false);
                    mo32011l(intValue2, false);
                }
            }
            return true;
        }
        mo32022s(i, true);
        this.f23554A = i;
        return false;
    }

    /* renamed from: v */
    public final void mo32027v() {
        TreeMap treeMap = new TreeMap(this.f23559k);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(mo32012m(i), Integer.valueOf(i));
        }
        this.f23560r = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    /* renamed from: w */
    public void mo32028w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m = mo32012m(i);
            if (m.getVisibility() != 8) {
                rz5.C6470b v = m.getShapeAppearanceModel().mo47585v();
                m34918t(v, mo32014o(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m.setShapeAppearanceModel(v.mo47599m());
            }
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.materialButtonToggleGroupStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f23553C
            android.content.Context r7 = p000.xo3.m54461c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f23555a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.f23556d = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.f23557e = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f23558g = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f23559k = r7
            r7 = 0
            r6.f23561s = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = p000.u55.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r9 = p000.u55.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = p000.u55.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f23554A = r9
            int r9 = p000.u55.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f23563y = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            p000.ga7.m17714A0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
