package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.LanguageItem;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\bB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\b\u001a\u00020\u0006J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H&R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001b"}, mo44877d2 = {"Lxd3;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lxd3$b;", "", "Lnet/safemoon/androidwallet/model/common/LanguageItem;", "items", "Lr37;", "f", "b", "Landroid/view/ViewGroup;", "parent", "", "viewType", "d", "holder", "position", "c", "getItemCount", "", "e", "Lxd3$a;", "a", "Lxd3$a;", "onDefaultLanguageSelectedListener", "Ljava/util/List;", "<init>", "(Lxd3$a;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xd3 */
/* compiled from: LanguageListAdapter.kt */
public abstract class xd3 extends RecyclerView.Adapter<C9596b> {

    /* renamed from: a */
    public final C9595a f45876a;

    /* renamed from: d */
    public final List<LanguageItem> f45877d = new ArrayList();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Lxd3$a;", "", "Lnet/safemoon/androidwallet/model/common/LanguageItem;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: xd3$a */
    /* compiled from: LanguageListAdapter.kt */
    public interface C9595a {
        /* renamed from: a */
        void mo58134a(LanguageItem languageItem);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lxd3$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/common/LanguageItem;", "item", "", "lastItem", "firstItem", "Lr37;", "b", "Ldz2;", "a", "Ldz2;", "getBinding", "()Ldz2;", "binding", "<init>", "(Lxd3;Ldz2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: xd3$b */
    /* compiled from: LanguageListAdapter.kt */
    public final class C9596b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final dz2 f45878a;

        /* renamed from: b */
        public final /* synthetic */ xd3 f45879b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9596b(xd3 xd3, dz2 dz2) {
            super(dz2.mo42096b());
            vx2.m53591g(dz2, "binding");
            this.f45879b = xd3;
            this.f45878a = dz2;
        }

        /* renamed from: c */
        public static final void m73947c(xd3 xd3, LanguageItem languageItem, View view) {
            vx2.m53591g(xd3, "this$0");
            vx2.m53591g(languageItem, "$item");
            xd3.f45876a.mo58134a(languageItem);
            xd3.mo66854b();
        }

        /* renamed from: b */
        public final void mo66858b(LanguageItem languageItem, boolean z, boolean z2) {
            vx2.m53591g(languageItem, "item");
            dz2 dz2 = this.f45878a;
            xd3 xd3 = this.f45879b;
            dz2.f28353c.setText(languageItem.getTitleResId());
            dz2.f28354d.setText(languageItem.getRegionResId());
            dz2.f28352b.setChecked(vx2.m53586b(xd3.mo58135e(), languageItem.getLanguageCode()));
            dz2.f28355e.setVisibility(ol0.m70368k0(z));
            this.itemView.setOnClickListener(new zd3(xd3, languageItem));
            if (z) {
                this.f45878a.mo42096b().setBackgroundResource(R.drawable.history_item_footer);
                this.f45878a.mo42096b().setBackgroundTintList(dz2.mo42096b().getContext().getColorStateList(R.color.card_bg_1));
            }
            if (z2) {
                this.f45878a.mo42096b().setBackgroundResource(R.drawable.history_item_header);
                this.f45878a.mo42096b().setBackgroundTintList(dz2.mo42096b().getContext().getColorStateList(R.color.card_bg_1));
            }
        }
    }

    public xd3(C9595a aVar) {
        vx2.m53591g(aVar, "onDefaultLanguageSelectedListener");
        this.f45876a = aVar;
    }

    /* renamed from: b */
    public final void mo66854b() {
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public void onBindViewHolder(C9596b bVar, int i) {
        boolean z;
        vx2.m53591g(bVar, "holder");
        LanguageItem languageItem = this.f45877d.get(i);
        boolean z2 = false;
        if (i + 1 == this.f45877d.size()) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        bVar.mo66858b(languageItem, z, z2);
    }

    /* renamed from: d */
    public C9596b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        dz2 a = dz2.m43745a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_language, viewGroup, false));
        vx2.m53590f(a, "bind(\n            Layout… parent, false)\n        )");
        return new C9596b(this, a);
    }

    /* renamed from: e */
    public abstract String mo58135e();

    /* renamed from: f */
    public final void mo66857f(List<LanguageItem> list) {
        vx2.m53591g(list, "items");
        this.f45877d.clear();
        this.f45877d.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f45877d.size();
    }
}
