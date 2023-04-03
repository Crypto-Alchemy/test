package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.FooterHistoryItem;
import net.safemoon.androidwallet.model.common.HeaderItemHistory;
import net.safemoon.androidwallet.model.common.HistoryListItem;
import net.safemoon.androidwallet.model.fiat.ResultItemFiat;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0016\b\u0014\u0007B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u0013H&R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001c"}, mo44877d2 = {"Ltz1;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "items", "Lr37;", "d", "b", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemViewType", "getItemCount", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "c", "Ltz1$a;", "a", "Ltz1$a;", "onDefaultCurrencySelectedListener", "Ljava/util/List;", "<init>", "(Ltz1$a;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tz1 */
/* compiled from: FiatListAdapter.kt */
public abstract class tz1 extends RecyclerView.Adapter<RecyclerView.C1231a0> {

    /* renamed from: a */
    public final C9373a f44830a;

    /* renamed from: d */
    public final List<HistoryListItem> f44831d = new ArrayList();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Ltz1$a;", "", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tz1$a */
    /* compiled from: FiatListAdapter.kt */
    public interface C9373a {
        /* renamed from: a */
        void mo57147a(Fiat fiat);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Ltz1$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "item", "", "lastItem", "Lr37;", "b", "Lbz2;", "a", "Lbz2;", "getBinding", "()Lbz2;", "binding", "<init>", "(Ltz1;Lbz2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tz1$b */
    /* compiled from: FiatListAdapter.kt */
    public final class C9374b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final bz2 f44832a;

        /* renamed from: b */
        public final /* synthetic */ tz1 f44833b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9374b(tz1 tz1, bz2 bz2) {
            super(bz2.mo29812b());
            vx2.m53591g(bz2, "binding");
            this.f44833b = tz1;
            this.f44832a = bz2;
        }

        /* renamed from: c */
        public static final void m72491c(tz1 tz1, RoomFiat roomFiat, View view) {
            vx2.m53591g(tz1, "this$0");
            tz1.f44830a.mo57147a(new Fiat(roomFiat.getSymbol(), roomFiat.getName(), roomFiat.getRate()));
        }

        /* renamed from: b */
        public final void mo66153b(HistoryListItem historyListItem, boolean z) {
            vx2.m53591g(historyListItem, "item");
            RoomFiat result = ((ResultItemFiat) historyListItem).getResult();
            bz2 bz2 = this.f44832a;
            tz1 tz1 = this.f44833b;
            if (result != null) {
                TextView textView = bz2.f21524c;
                String symbol = result.getSymbol();
                String name = result.getName();
                textView.setText(symbol + " - " + name);
                bz2.f21523b.setChecked(vx2.m53586b(tz1.mo57146c().getSymbol(), result.getSymbol()));
            }
            bz2.f21525d.setVisibility(ol0.m70368k0(z));
            if (result != null) {
                this.itemView.setOnClickListener(new vz1(tz1, result));
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"Ltz1$c;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tz1$c */
    /* compiled from: FiatListAdapter.kt */
    public static final class C9375c extends RecyclerView.C1231a0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9375c(View view) {
            super(view);
            vx2.m53591g(view, "itemView");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Ltz1$d;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "item", "Lr37;", "a", "Lcz2;", "Lcz2;", "getBinding", "()Lcz2;", "binding", "<init>", "(Lcz2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tz1$d */
    /* compiled from: FiatListAdapter.kt */
    public static final class C9376d extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final cz2 f44834a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9376d(cz2 cz2) {
            super(cz2.mo41790b());
            vx2.m53591g(cz2, "binding");
            this.f44834a = cz2;
        }

        /* renamed from: a */
        public final void mo66154a(HistoryListItem historyListItem) {
            vx2.m53591g(historyListItem, "item");
            this.f44834a.f28002b.setText(((HeaderItemHistory) historyListItem).getTitle());
        }
    }

    public tz1(C9373a aVar) {
        vx2.m53591g(aVar, "onDefaultCurrencySelectedListener");
        this.f44830a = aVar;
    }

    /* renamed from: b */
    public final void mo66151b() {
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public abstract Fiat mo57146c();

    /* renamed from: d */
    public final void mo66152d(List<HistoryListItem> list) {
        vx2.m53591g(list, "items");
        this.f44831d.clear();
        this.f44831d.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f44831d.size();
    }

    public int getItemViewType(int i) {
        return this.f44831d.get(i).getType();
    }

    public void onBindViewHolder(RecyclerView.C1231a0 a0Var, int i) {
        boolean z;
        vx2.m53591g(a0Var, "holder");
        HistoryListItem historyListItem = this.f44831d.get(i);
        int i2 = i + 1;
        if (i2 < this.f44831d.size()) {
            z = this.f44831d.get(i2) instanceof FooterHistoryItem;
        } else {
            z = false;
        }
        if (getItemViewType(i) == 0) {
            if (a0Var instanceof C9376d) {
                ((C9376d) a0Var).mo66154a(historyListItem);
            }
        } else if (getItemViewType(i) != 1 && (a0Var instanceof C9374b)) {
            ((C9374b) a0Var).mo66153b(historyListItem, z);
        }
    }

    public RecyclerView.C1231a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        if (i == 0) {
            cz2 a = cz2.m43310a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fiat_list_header, viewGroup, false));
            vx2.m53590f(a, "bind(\n                  … false)\n                )");
            return new C9376d(a);
        } else if (i != 1) {
            bz2 a2 = bz2.m32804a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fiat, viewGroup, false));
            vx2.m53590f(a2, "bind(\n                  … false)\n                )");
            return new C9374b(this, a2);
        } else {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fiat_list_footer, viewGroup, false);
            vx2.m53590f(inflate, "from(parent.context)\n   …st_footer, parent, false)");
            return new C9375c(inflate);
        }
    }
}
