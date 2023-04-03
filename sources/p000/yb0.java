package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: yb0 */
/* compiled from: CarouselViewAdapter */
public class yb0 extends RecyclerView.Adapter<C6729a> {

    /* renamed from: a */
    public zb0 f35837a;

    /* renamed from: d */
    public int f35838d;

    /* renamed from: e */
    public int f35839e;

    /* renamed from: g */
    public RecyclerView f35840g;

    /* renamed from: k */
    public ub0 f35841k = new ub0();

    /* renamed from: r */
    public boolean f35842r;

    /* renamed from: s */
    public int f35843s;

    /* renamed from: yb0$a */
    /* compiled from: CarouselViewAdapter */
    public static class C6729a extends RecyclerView.C1231a0 {
        public C6729a(View view) {
            super(view);
        }
    }

    public yb0(zb0 zb0, int i, int i2, RecyclerView recyclerView, int i3, boolean z) {
        this.f35837a = zb0;
        this.f35838d = i;
        this.f35839e = i2;
        this.f35840g = recyclerView;
        this.f35842r = z;
        this.f35843s = i3;
    }

    /* renamed from: a */
    public void onBindViewHolder(C6729a aVar, int i) {
        zb0 zb0 = this.f35837a;
        if (zb0 != null) {
            zb0.mo49816a(aVar.itemView, i);
        }
        this.f35841k.mo48382a(this.f35840g, aVar.itemView, this.f35843s, this.f35842r);
    }

    /* renamed from: b */
    public C6729a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6729a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f35838d, viewGroup, false));
    }

    public int getItemCount() {
        return this.f35839e;
    }
}
