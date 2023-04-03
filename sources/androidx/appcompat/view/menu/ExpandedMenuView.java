package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0173e;

public final class ExpandedMenuView extends ListView implements C0173e.C0175b, C0184j, AdapterView.OnItemClickListener {

    /* renamed from: e */
    public static final int[] f681e = {16842964, 16843049};

    /* renamed from: a */
    public C0173e f682a;

    /* renamed from: d */
    public int f683d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public void mo1284a(C0173e eVar) {
        this.f682a = eVar;
    }

    /* renamed from: b */
    public boolean mo1285b(C0177g gVar) {
        return this.f682a.mo1386N(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.f683d;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1285b((C0177g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        yq6 v = yq6.m30733v(context, attributeSet, f681e, i, 0);
        if (v.mo28193s(0)) {
            setBackgroundDrawable(v.mo28181g(0));
        }
        if (v.mo28193s(1)) {
            setDivider(v.mo28181g(1));
        }
        v.mo28194w();
    }
}
