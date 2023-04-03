package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: k */
    public final ListPopupWindow f24437k;

    /* renamed from: r */
    public final AccessibilityManager f24438r;

    /* renamed from: s */
    public final Rect f24439s;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    public class C4403a implements AdapterView.OnItemClickListener {
        public C4403a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object obj;
            if (i < 0) {
                obj = MaterialAutoCompleteTextView.this.f24437k.mo2204v();
            } else {
                obj = MaterialAutoCompleteTextView.this.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.this.mo33744f(obj);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = MaterialAutoCompleteTextView.this.f24437k.mo2207y();
                    i = MaterialAutoCompleteTextView.this.f24437k.mo2206x();
                    j = MaterialAutoCompleteTextView.this.f24437k.mo2205w();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f24437k.mo1338p(), view, i, j);
            }
            MaterialAutoCompleteTextView.this.f24437k.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    public final TextInputLayout mo33742d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final int mo33743e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout d = mo33742d();
        int i = 0;
        if (adapter == null || d == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f24437k.mo2206x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, d);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable h = this.f24437k.mo2196h();
        if (h != null) {
            h.getPadding(this.f24439s);
            Rect rect = this.f24439s;
            i2 += rect.left + rect.right;
        }
        return i2 + d.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: f */
    public final <T extends ListAdapter & Filterable> void mo33744f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public CharSequence getHint() {
        TextInputLayout d = mo33742d();
        if (d == null || !d.mo33778O()) {
            return super.getHint();
        }
        return d.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d = mo33742d();
        if (d != null && d.mo33778O() && super.getHint() == null && ln3.m47863c()) {
            setHint("");
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo33743e()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f24437k.mo2033n(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f24438r;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f24437k.mo1329c();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(xo3.m54461c(context, attributeSet, i, 0), attributeSet, i);
        this.f24439s = new Rect();
        Context context2 = getContext();
        TypedArray h = wo6.m54004h(context2, attributeSet, u55.MaterialAutoCompleteTextView, i, e55.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = u55.MaterialAutoCompleteTextView_android_inputType;
        if (h.hasValue(i2) && h.getInt(i2, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f24438r = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f24437k = listPopupWindow;
        listPopupWindow.mo2185J(true);
        listPopupWindow.mo2179D(this);
        listPopupWindow.mo2184I(2);
        listPopupWindow.mo2033n(getAdapter());
        listPopupWindow.mo2187L(new C4403a());
        h.recycle();
    }
}
