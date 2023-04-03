package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.HeaderItemHistory;
import net.safemoon.androidwallet.model.common.HistoryListItem;
import net.safemoon.androidwallet.model.fiat.ResultItemFiat;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0015\u0017\u0013\u0007B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\u0012H&R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, mo44877d2 = {"Lwz1;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "items", "Lr37;", "d", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemViewType", "getItemCount", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "c", "Landroid/content/Context;", "a", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "context", "Lwz1$a;", "Lwz1$a;", "onDefaultCurrencySelectedListener", "e", "Ljava/util/List;", "<init>", "(Landroid/content/Context;Lwz1$a;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wz1 */
/* compiled from: FiatListAdapter.kt */
public abstract class wz1 extends RecyclerView.Adapter<RecyclerView.C1231a0> {

    /* renamed from: a */
    public final Context f45799a;

    /* renamed from: d */
    public final C9572a f45800d;

    /* renamed from: e */
    public final List<HistoryListItem> f45801e = new ArrayList();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Lwz1$a;", "", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: wz1$a */
    /* compiled from: FiatListAdapter.kt */
    public interface C9572a {
        /* renamed from: a */
        void mo56788a(Fiat fiat);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lwz1$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "item", "Lr37;", "b", "Lty2;", "a", "Lty2;", "getBinding", "()Lty2;", "binding", "<init>", "(Lwz1;Lty2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: wz1$b */
    /* compiled from: FiatListAdapter.kt */
    public final class C9573b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final ty2 f45802a;

        /* renamed from: b */
        public final /* synthetic */ wz1 f45803b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9573b(wz1 wz1, ty2 ty2) {
            super(ty2.mo48274b());
            vx2.m53591g(ty2, "binding");
            this.f45803b = wz1;
            this.f45802a = ty2;
        }

        /* renamed from: c */
        public static final void m73784c(wz1 wz1, RoomFiat roomFiat, View view) {
            vx2.m53591g(wz1, "this$0");
            wz1.f45800d.mo56788a(new Fiat(roomFiat.getSymbol(), roomFiat.getName(), roomFiat.getRate()));
        }

        /* renamed from: b */
        public final void mo66797b(HistoryListItem historyListItem) {
            vx2.m53591g(historyListItem, "item");
            RoomFiat result = ((ResultItemFiat) historyListItem).getResult();
            ty2 ty2 = this.f45802a;
            wz1 wz1 = this.f45803b;
            if (result != null) {
                TextView textView = ty2.f34419c;
                String symbol = result.getSymbol();
                String name = result.getName();
                textView.setText(symbol + " - " + name);
                ty2.f34418b.setChecked(vx2.m53586b(wz1.mo56787c().getSymbol(), result.getSymbol()));
                if (vx2.m53586b(wz1.mo56787c().getSymbol(), result.getSymbol())) {
                    ty2.f34419c.setTextColor(zr0.m31440c(wz1.mo66795b(), R.color.akt_register_guide_title));
                } else {
                    ty2.f34419c.setTextColor(zr0.m31440c(wz1.mo66795b(), R.color.white));
                }
            }
            if (result != null) {
                this.itemView.setOnClickListener(new uz1(wz1, result));
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"Lwz1$c;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: wz1$c */
    /* compiled from: FiatListAdapter.kt */
    public static final class C9574c extends RecyclerView.C1231a0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9574c(View view) {
            super(view);
            vx2.m53591g(view, "itemView");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Lwz1$d;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "item", "Lr37;", "a", "Luy2;", "Luy2;", "getBinding", "()Luy2;", "binding", "<init>", "(Luy2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: wz1$d */
    /* compiled from: FiatListAdapter.kt */
    public static final class C9575d extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final uy2 f45804a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9575d(uy2 uy2) {
            super(uy2.mo48550b());
            vx2.m53591g(uy2, "binding");
            this.f45804a = uy2;
        }

        /* renamed from: a */
        public final void mo66798a(HistoryListItem historyListItem) {
            vx2.m53591g(historyListItem, "item");
            this.f45804a.f34755b.setText(((HeaderItemHistory) historyListItem).getTitle());
        }
    }

    public wz1(Context context, C9572a aVar) {
        vx2.m53591g(context, "context");
        vx2.m53591g(aVar, "onDefaultCurrencySelectedListener");
        this.f45799a = context;
        this.f45800d = aVar;
    }

    /* renamed from: b */
    public final Context mo66795b() {
        return this.f45799a;
    }

    /* renamed from: c */
    public abstract Fiat mo56787c();

    /* renamed from: d */
    public final void mo66796d(List<HistoryListItem> list) {
        vx2.m53591g(list, "items");
        this.f45801e.clear();
        this.f45801e.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f45801e.size();
    }

    public int getItemViewType(int i) {
        return this.f45801e.get(i).getType();
    }

    public void onBindViewHolder(RecyclerView.C1231a0 a0Var, int i) {
        vx2.m53591g(a0Var, "holder");
        HistoryListItem historyListItem = this.f45801e.get(i);
        if (getItemViewType(i) == 0) {
            if (a0Var instanceof C9575d) {
                ((C9575d) a0Var).mo66798a(historyListItem);
            }
        } else if (getItemViewType(i) != 1 && (a0Var instanceof C9573b)) {
            ((C9573b) a0Var).mo66797b(historyListItem);
        }
    }

    public RecyclerView.C1231a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        if (i == 0) {
            uy2 a = uy2.m53070a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_akt_fiat_list_header, viewGroup, false));
            vx2.m53590f(a, "bind(\n                  … false)\n                )");
            return new C9575d(a);
        } else if (i != 1) {
            ty2 a2 = ty2.m52566a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_akt_fiat, viewGroup, false));
            vx2.m53590f(a2, "bind(\n                  … false)\n                )");
            return new C9573b(this, a2);
        } else {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_akt_fiat_list_footer, viewGroup, false);
            vx2.m53590f(inflate, "from(parent.context)\n   …st_footer, parent, false)");
            return new C9574c(inflate);
        }
    }
}
