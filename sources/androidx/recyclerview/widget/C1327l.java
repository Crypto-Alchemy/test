package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
/* compiled from: LayoutState */
public class C1327l {

    /* renamed from: a */
    public boolean f6814a = true;

    /* renamed from: b */
    public int f6815b;

    /* renamed from: c */
    public int f6816c;

    /* renamed from: d */
    public int f6817d;

    /* renamed from: e */
    public int f6818e;

    /* renamed from: f */
    public int f6819f = 0;

    /* renamed from: g */
    public int f6820g = 0;

    /* renamed from: h */
    public boolean f6821h;

    /* renamed from: i */
    public boolean f6822i;

    /* renamed from: a */
    public boolean mo9899a(RecyclerView.C1260x xVar) {
        int i = this.f6816c;
        if (i < 0 || i >= xVar.mo9525b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public View mo9900b(RecyclerView.C1254t tVar) {
        View o = tVar.mo9486o(this.f6816c);
        this.f6816c += this.f6817d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f6815b + ", mCurrentPosition=" + this.f6816c + ", mItemDirection=" + this.f6817d + ", mLayoutDirection=" + this.f6818e + ", mStartLine=" + this.f6819f + ", mEndLine=" + this.f6820g + '}';
    }
}
