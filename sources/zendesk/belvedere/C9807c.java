package zendesk.belvedere;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import zendesk.belvedere.C9810d;

/* renamed from: zendesk.belvedere.c */
/* compiled from: ImageStreamAdapter */
public class C9807c extends RecyclerView.Adapter<RecyclerView.C1231a0> {

    /* renamed from: a */
    public List<C9810d.C9812b> f46700a = new ArrayList();

    /* renamed from: d */
    public List<C9810d.C9812b> f46701d = new ArrayList();

    /* renamed from: e */
    public List<C9810d.C9812b> f46702e = new ArrayList();

    /* renamed from: zendesk.belvedere.c$a */
    /* compiled from: ImageStreamAdapter */
    public class C9808a extends RecyclerView.C1231a0 {
        public C9808a(View view) {
            super(view);
        }
    }

    /* renamed from: zendesk.belvedere.c$b */
    /* compiled from: ImageStreamAdapter */
    public interface C9809b {
        /* renamed from: a */
        boolean mo73757a(C9810d.C9812b bVar);

        /* renamed from: b */
        void mo73758b();
    }

    /* renamed from: a */
    public void mo73753a(C9810d.C9812b bVar) {
        mo73756d(Collections.singletonList(bVar), this.f46701d);
    }

    /* renamed from: b */
    public void mo73754b(List<C9810d.C9812b> list) {
        mo73756d(this.f46700a, list);
    }

    /* renamed from: c */
    public void mo73755c(List<MediaResult> list) {
        ArrayList<C9810d.C9812b> arrayList = new ArrayList<>(this.f46701d);
        HashSet hashSet = new HashSet();
        for (MediaResult i : list) {
            hashSet.add(i.mo73702i());
        }
        for (C9810d.C9812b bVar : arrayList) {
            bVar.mo73765f(hashSet.contains(bVar.mo73763d().mo73702i()));
        }
        mo73756d(this.f46700a, arrayList);
    }

    /* renamed from: d */
    public final void mo73756d(List<C9810d.C9812b> list, List<C9810d.C9812b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f46700a = list;
        this.f46701d = list2;
        this.f46702e = arrayList;
    }

    public int getItemCount() {
        return this.f46702e.size();
    }

    public long getItemId(int i) {
        return this.f46702e.get(i).mo73761b();
    }

    public int getItemViewType(int i) {
        return this.f46702e.get(i).mo73762c();
    }

    public void onBindViewHolder(RecyclerView.C1231a0 a0Var, int i) {
        this.f46702e.get(i).mo73760a(a0Var.itemView);
    }

    public RecyclerView.C1231a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C9808a(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
