package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1272c;
import androidx.recyclerview.widget.C1274d;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1231a0;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.o */
/* compiled from: ListAdapter */
public abstract class C1330o<T, VH extends RecyclerView.C1231a0> extends RecyclerView.Adapter<VH> {
    public final C1274d<T> mDiffer;
    private final C1274d.C1278b<T> mListener;

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* compiled from: ListAdapter */
    public class C1331a implements C1274d.C1278b<T> {
        public C1331a() {
        }

        /* renamed from: a */
        public void mo9707a(List<T> list, List<T> list2) {
            C1330o.this.onCurrentListChanged(list, list2);
        }
    }

    public C1330o(C1294g.C1300f<T> fVar) {
        C1331a aVar = new C1331a();
        this.mListener = aVar;
        C1274d<T> dVar = new C1274d<>((di3) new C1271b(this), new C1272c.C1273a(fVar).mo9693a());
        this.mDiffer = dVar;
        dVar.mo9694a(aVar);
    }

    public List<T> getCurrentList() {
        return this.mDiffer.mo9695b();
    }

    public T getItem(int i) {
        return this.mDiffer.mo9695b().get(i);
    }

    public int getItemCount() {
        return this.mDiffer.mo9695b().size();
    }

    public void onCurrentListChanged(List<T> list, List<T> list2) {
    }

    public void submitList(List<T> list) {
        this.mDiffer.mo9698e(list);
    }

    public void submitList(List<T> list, Runnable runnable) {
        this.mDiffer.mo9699f(list, runnable);
    }
}
