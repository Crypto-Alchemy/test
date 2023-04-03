package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.LanguageItem;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0017B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\b\u001a\u00020\u0006J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H&R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006 "}, mo44877d2 = {"Lae3;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lae3$b;", "", "Lnet/safemoon/androidwallet/model/common/LanguageItem;", "items", "Lr37;", "g", "c", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "holder", "position", "d", "getItemCount", "", "f", "Landroid/content/Context;", "a", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "context", "Lae3$a;", "Lae3$a;", "onDefaultLanguageSelectedListener", "Ljava/util/List;", "<init>", "(Landroid/content/Context;Lae3$a;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ae3 */
/* compiled from: LanguageListAdapter.kt */
public abstract class ae3 extends RecyclerView.Adapter<C6824b> {

    /* renamed from: a */
    public final Context f36444a;

    /* renamed from: d */
    public final C6823a f36445d;

    /* renamed from: e */
    public final List<LanguageItem> f36446e = new ArrayList();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Lae3$a;", "", "Lnet/safemoon/androidwallet/model/common/LanguageItem;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ae3$a */
    /* compiled from: LanguageListAdapter.kt */
    public interface C6823a {
        /* renamed from: a */
        void mo50156a(LanguageItem languageItem);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lae3$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/common/LanguageItem;", "item", "Lr37;", "b", "Lvy2;", "a", "Lvy2;", "getBinding", "()Lvy2;", "binding", "<init>", "(Lae3;Lvy2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ae3$b */
    /* compiled from: LanguageListAdapter.kt */
    public final class C6824b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final vy2 f36447a;

        /* renamed from: b */
        public final /* synthetic */ ae3 f36448b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6824b(ae3 ae3, vy2 vy2) {
            super(vy2.mo48847b());
            vx2.m53591g(vy2, "binding");
            this.f36448b = ae3;
            this.f36447a = vy2;
        }

        /* renamed from: c */
        public static final void m55481c(ae3 ae3, LanguageItem languageItem, View view) {
            vx2.m53591g(ae3, "this$0");
            vx2.m53591g(languageItem, "$item");
            ae3.f36445d.mo50156a(languageItem);
            ae3.mo50151c();
        }

        /* renamed from: b */
        public final void mo50157b(LanguageItem languageItem) {
            vx2.m53591g(languageItem, "item");
            vy2 vy2 = this.f36447a;
            ae3 ae3 = this.f36448b;
            vy2.f35188c.setText(languageItem.getTitleResId());
            vy2.f35189d.setText(languageItem.getRegionResId());
            vy2.f35187b.setChecked(vx2.m53586b(ae3.mo50154f(), languageItem.getLanguageCode()));
            this.itemView.setOnClickListener(new yd3(ae3, languageItem));
            if (vx2.m53586b(ae3.mo50154f(), languageItem.getLanguageCode())) {
                vy2.f35188c.setTextColor(zr0.m31440c(ae3.mo50150b(), R.color.akt_register_guide_title));
                vy2.f35189d.setTextColor(zr0.m31440c(ae3.mo50150b(), R.color.akt_register_guide_title));
                return;
            }
            vy2.f35188c.setTextColor(zr0.m31440c(ae3.mo50150b(), R.color.white));
            vy2.f35189d.setTextColor(zr0.m31440c(ae3.mo50150b(), R.color.white));
        }
    }

    public ae3(Context context, C6823a aVar) {
        vx2.m53591g(context, "context");
        vx2.m53591g(aVar, "onDefaultLanguageSelectedListener");
        this.f36444a = context;
        this.f36445d = aVar;
    }

    /* renamed from: b */
    public final Context mo50150b() {
        return this.f36444a;
    }

    /* renamed from: c */
    public final void mo50151c() {
        notifyDataSetChanged();
    }

    /* renamed from: d */
    public void onBindViewHolder(C6824b bVar, int i) {
        vx2.m53591g(bVar, "holder");
        bVar.mo50157b(this.f36446e.get(i));
    }

    /* renamed from: e */
    public C6824b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        vy2 a = vy2.m53607a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_akt_language, viewGroup, false));
        vx2.m53590f(a, "bind(\n            Layout… parent, false)\n        )");
        return new C6824b(this, a);
    }

    /* renamed from: f */
    public abstract String mo50154f();

    /* renamed from: g */
    public final void mo50155g(List<LanguageItem> list) {
        vx2.m53591g(list, "items");
        this.f36446e.clear();
        this.f36446e.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f36446e.size();
    }
}
