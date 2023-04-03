package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.C1330o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.google.android.material.checkbox.MaterialCheckBox;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.MyTokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\fB\u0019\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lht5;", "Landroidx/recyclerview/widget/o;", "Lnet/safemoon/androidwallet/model/MyTokenType;", "Lht5$b;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "c", "holder", "position", "Lr37;", "b", "Lkotlin/Function0;", "a", "Lpc2;", "()Lpc2;", "onUpdate", "<init>", "(Lpc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ht5 */
/* compiled from: SelectChainAdapter.kt */
public final class ht5 extends C1330o<MyTokenType, C7193b> {

    /* renamed from: a */
    public final pc2<r37> f38271a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lht5$a;", "Landroidx/recyclerview/widget/g$f;", "Lnet/safemoon/androidwallet/model/MyTokenType;", "oldItem", "newItem", "", "b", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ht5$a */
    /* compiled from: SelectChainAdapter.kt */
    public static final class C7192a extends C1294g.C1300f<MyTokenType> {

        /* renamed from: a */
        public static final C7192a f38272a = new C7192a();

        /* renamed from: a */
        public boolean areContentsTheSame(MyTokenType myTokenType, MyTokenType myTokenType2) {
            vx2.m53591g(myTokenType, "oldItem");
            vx2.m53591g(myTokenType2, "newItem");
            if (myTokenType.getTokenType() == myTokenType2.getTokenType() && myTokenType.isSelect() == myTokenType2.isSelect()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean areItemsTheSame(MyTokenType myTokenType, MyTokenType myTokenType2) {
            vx2.m53591g(myTokenType, "oldItem");
            vx2.m53591g(myTokenType2, "newItem");
            return vx2.m53586b(myTokenType, myTokenType2);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, mo44877d2 = {"Lht5$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/MyTokenType;", "myTokenType", "Lr37;", "b", "Landroid/view/View;", "itemView", "<init>", "(Lht5;Landroid/view/View;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ht5$b */
    /* compiled from: SelectChainAdapter.kt */
    public final class C7193b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final /* synthetic */ ht5 f38273a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7193b(ht5 ht5, View view) {
            super(view);
            vx2.m53591g(view, "itemView");
            this.f38273a = ht5;
        }

        /* renamed from: c */
        public static final void m58698c(MyTokenType myTokenType, ht5 ht5, C7193b bVar, View view) {
            vx2.m53591g(myTokenType, "$myTokenType");
            vx2.m53591g(ht5, "this$0");
            vx2.m53591g(bVar, "this$1");
            myTokenType.setSelect(!myTokenType.isSelect());
            ht5.notifyItemChanged(bVar.getAbsoluteAdapterPosition());
            pc2<r37> a = ht5.mo52314a();
            if (a != null) {
                a.invoke();
            }
        }

        /* renamed from: b */
        public final void mo52319b(MyTokenType myTokenType) {
            vx2.m53591g(myTokenType, "myTokenType");
            yy2 a = yy2.m54893a(this.itemView);
            ht5 ht5 = this.f38273a;
            TokenType tokenType = myTokenType.getTokenType();
            TextView textView = a.f35948h;
            String chainTitle = tokenType.getChainTitle();
            String displayName = tokenType.getDisplayName();
            textView.setText(chainTitle + " (" + displayName + ")");
            C1710a.m12225u(a.f35944d).mo23162w(Integer.valueOf(tokenType.getIcon())).mo11553K0(a.f35944d);
            MaterialCheckBox materialCheckBox = a.f35943c;
            vx2.m53590f(materialCheckBox, "checkableIcon");
            materialCheckBox.setVisibility(0);
            a.f35943c.setChecked(myTokenType.isSelect());
            a.f35946f.setOnClickListener(new it5(myTokenType, ht5, this));
        }
    }

    public ht5(pc2<r37> pc2) {
        super(C7192a.f38272a);
        this.f38271a = pc2;
    }

    /* renamed from: a */
    public final pc2<r37> mo52314a() {
        return this.f38271a;
    }

    /* renamed from: b */
    public void onBindViewHolder(C7193b bVar, int i) {
        vx2.m53591g(bVar, "holder");
        Object item = getItem(i);
        vx2.m53590f(item, "getItem(position)");
        bVar.mo52319b((MyTokenType) item);
    }

    /* renamed from: c */
    public C7193b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_check_token, viewGroup, false);
        vx2.m53590f(inflate, "from(parent.context).inf…heck_token, parent,false)");
        return new C7193b(this, inflate);
    }
}
