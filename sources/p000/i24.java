package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.nft.NFTData;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Li24;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Li24$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "b", "holder", "position", "Lr37;", "a", "getItemCount", "", "Lnet/safemoon/androidwallet/model/nft/NFTData$Property;", "Ljava/util/List;", "mList", "<init>", "(Ljava/util/List;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: i24 */
/* compiled from: NFTPropertyAdapter.kt */
public final class i24 extends RecyclerView.Adapter<C7202a> {

    /* renamed from: a */
    public final List<NFTData.Property> f38322a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u0012"}, mo44877d2 = {"Li24$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "name", "c", "value", "ItemView", "<init>", "(Landroid/view/View;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: i24$a */
    /* compiled from: NFTPropertyAdapter.kt */
    public static final class C7202a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final View f38323a;

        /* renamed from: b */
        public final TextView f38324b;

        /* renamed from: c */
        public final TextView f38325c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7202a(View view) {
            super(view);
            vx2.m53591g(view, "ItemView");
            View view2 = this.itemView;
            vx2.m53590f(view2, "itemView");
            this.f38323a = view2;
            View findViewById = this.itemView.findViewById(R.id.nftPropertyName);
            vx2.m53590f(findViewById, "itemView.findViewById(R.id.nftPropertyName)");
            this.f38324b = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.nftPropertyValue);
            vx2.m53590f(findViewById2, "itemView.findViewById(R.id.nftPropertyValue)");
            this.f38325c = (TextView) findViewById2;
        }

        /* renamed from: a */
        public final TextView mo52374a() {
            return this.f38324b;
        }

        /* renamed from: b */
        public final TextView mo52375b() {
            return this.f38325c;
        }
    }

    public i24(List<NFTData.Property> list) {
        vx2.m53591g(list, "mList");
        this.f38322a = list;
    }

    /* renamed from: a */
    public void onBindViewHolder(C7202a aVar, int i) {
        vx2.m53591g(aVar, "holder");
        NFTData.Property property = this.f38322a.get(i);
        aVar.mo52374a().setText(property.getName());
        aVar.mo52375b().setText(property.getValue());
    }

    /* renamed from: b */
    public C7202a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_collectible_property, viewGroup, false);
        vx2.m53590f(inflate, "view");
        return new C7202a(inflate);
    }

    public int getItemCount() {
        return this.f38322a.size();
    }
}
