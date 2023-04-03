package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b */
/* compiled from: AdapterListUpdateCallback */
public final class C1271b implements di3 {

    /* renamed from: a */
    public final RecyclerView.Adapter f6604a;

    public C1271b(RecyclerView.Adapter adapter) {
        this.f6604a = adapter;
    }

    public void onChanged(int i, int i2, Object obj) {
        this.f6604a.notifyItemRangeChanged(i, i2, obj);
    }

    public void onInserted(int i, int i2) {
        this.f6604a.notifyItemRangeInserted(i, i2);
    }

    public void onMoved(int i, int i2) {
        this.f6604a.notifyItemMoved(i, i2);
    }

    public void onRemoved(int i, int i2) {
        this.f6604a.notifyItemRangeRemoved(i, i2);
    }
}
