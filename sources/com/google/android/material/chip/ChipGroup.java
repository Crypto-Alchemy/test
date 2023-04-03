package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import p000.C3335t8;

public class ChipGroup extends FlowLayout {

    /* renamed from: I */
    public static final int f23609I = e55.Widget_MaterialComponents_ChipGroup;

    /* renamed from: A */
    public final C4238b f23610A;

    /* renamed from: B */
    public C4240d f23611B;

    /* renamed from: C */
    public int f23612C;

    /* renamed from: H */
    public boolean f23613H;

    /* renamed from: k */
    public int f23614k;

    /* renamed from: r */
    public int f23615r;

    /* renamed from: s */
    public boolean f23616s;

    /* renamed from: x */
    public boolean f23617x;

    /* renamed from: y */
    public C4239c f23618y;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C4238b implements CompoundButton.OnCheckedChangeListener {
        public C4238b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f23613H) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f23617x) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f23612C == -1 || ChipGroup.this.f23612C == id || !ChipGroup.this.f23616s)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.mo32252r(chipGroup.f23612C, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f23612C == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.mo32252r(compoundButton.getId(), true);
                    ChipGroup.this.mo32251q(compoundButton.getId(), false);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public interface C4239c {
        /* renamed from: a */
        void mo32272a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public class C4240d implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f23620a;

        public C4240d() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ga7.m17774k());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).mo32245m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f23610A);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f23620a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f23620a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        mo32251q(i, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f23612C;
                if (i2 != -1 && this.f23616s) {
                    mo32252r(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public boolean mo32236c() {
        return super.mo32236c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return true;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f23616s) {
            return this.f23612C;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f23616s) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f23614k;
    }

    public int getChipSpacingVertical() {
        return this.f23615r;
    }

    /* renamed from: m */
    public void mo32245m(int i) {
        int i2 = this.f23612C;
        if (i != i2) {
            if (i2 != -1 && this.f23616s) {
                mo32252r(i2, false);
            }
            if (i != -1) {
                mo32252r(i, true);
            }
            setCheckedId(i);
        }
    }

    /* renamed from: n */
    public void mo32246n() {
        this.f23613H = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f23613H = false;
        setCheckedId(-1);
    }

    /* renamed from: o */
    public int mo32247o(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f23612C;
        if (i != -1) {
            mo32252r(i, true);
            setCheckedId(this.f23612C);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3335t8 S0 = C3335t8.m27495S0(accessibilityNodeInfo);
        if (mo32236c()) {
            i = getChipCount();
        } else {
            i = -1;
        }
        int rowCount = getRowCount();
        if (mo32250p()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        S0.mo26243h0(C3335t8.C3337b.m27595b(rowCount, i, false, i2));
    }

    /* renamed from: p */
    public boolean mo32250p() {
        return this.f23616s;
    }

    /* renamed from: q */
    public final void mo32251q(int i, boolean z) {
        this.f23612C = i;
        C4239c cVar = this.f23618y;
        if (cVar != null && this.f23616s && z) {
            cVar.mo32272a(this, i);
        }
    }

    /* renamed from: r */
    public final void mo32252r(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f23613H = true;
            ((Chip) findViewById).setChecked(z);
            this.f23613H = false;
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f23614k != i) {
            this.f23614k = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f23615r != i) {
            this.f23615r = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C4239c cVar) {
        this.f23618y = cVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f23611B.f23620a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f23617x = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f23616s != z) {
            this.f23616s = z;
            mo32246n();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.chipGroupStyle);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f23609I
            android.content.Context r8 = p000.xo3.m54461c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>()
            r7.f23610A = r8
            com.google.android.material.chip.ChipGroup$d r8 = new com.google.android.material.chip.ChipGroup$d
            r8.<init>()
            r7.f23611B = r8
            r8 = -1
            r7.f23612C = r8
            r6 = 0
            r7.f23613H = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = p000.u55.ChipGroup
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r10 = p000.u55.ChipGroup_chipSpacing
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = p000.u55.ChipGroup_chipSpacingHorizontal
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = p000.u55.ChipGroup_chipSpacingVertical
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = p000.u55.ChipGroup_singleLine
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine((boolean) r10)
            int r10 = p000.u55.ChipGroup_singleSelection
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection((boolean) r10)
            int r10 = p000.u55.ChipGroup_selectionRequired
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = p000.u55.ChipGroup_checkedChip
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L_0x0069
            r7.f23612C = r10
        L_0x0069:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$d r8 = r7.f23611B
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            p000.ga7.m17714A0(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
