package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB)\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Llr6;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Llr6$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "d", "holder", "position", "Lr37;", "b", "getItemCount", "", "Lvc;", "a", "Ljava/util/List;", "items", "Lkotlin/Function1;", "Lrc2;", "callBack", "<init>", "(Ljava/util/List;Lrc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lr6 */
/* compiled from: TokenListAdapter.kt */
public final class lr6 extends RecyclerView.Adapter<C7849a> {

    /* renamed from: a */
    public final List<C9449vc> f40692a;

    /* renamed from: d */
    public final rc2<C9449vc, r37> f40693d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Llr6$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lvc;", "model", "Lr37;", "a", "Lrm2;", "Lrm2;", "b", "()Lrm2;", "binding", "<init>", "(Lrm2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: lr6$a */
    /* compiled from: TokenListAdapter.kt */
    public static final class C7849a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final rm2 f40694a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7849a(rm2 rm2) {
            super(rm2.mo47434b());
            vx2.m53591g(rm2, "binding");
            this.f40694a = rm2;
        }

        /* renamed from: a */
        public final void mo55973a(C9449vc vcVar) {
            vx2.m53591g(vcVar, "model");
            rm2 rm2 = this.f40694a;
            ImageView imageView = rm2.f33540d;
            vx2.m53590f(imageView, "ivTokenIcon");
            ol0.m70336P(imageView, vcVar.mo66472e(), vcVar.mo66471d(), vcVar.mo66475g());
            if (ol0.m70328H(vcVar.mo66475g())) {
                String c = q70.m71187c(vcVar.mo66468a(), vcVar.mo66475g(), (Integer) null, 2, (Object) null);
                ImageView imageView2 = rm2.f33540d;
                vx2.m53590f(imageView2, "ivTokenIcon");
                ol0.m70335O(imageView2, c, vcVar.mo66475g());
            }
            rm2.f33544h.setText(vcVar.mo66474f());
            rm2.f33547k.setText(vcVar.mo66475g());
        }

        /* renamed from: b */
        public final rm2 mo55974b() {
            return this.f40694a;
        }
    }

    public lr6(List<C9449vc> list, rc2<? super C9449vc, r37> rc2) {
        vx2.m53591g(list, "items");
        vx2.m53591g(rc2, "callBack");
        this.f40692a = list;
        this.f40693d = rc2;
    }

    /* renamed from: c */
    public static final void m64000c(lr6 lr6, C9449vc vcVar, View view) {
        vx2.m53591g(lr6, "this$0");
        vx2.m53591g(vcVar, "$item");
        lr6.f40693d.invoke(vcVar);
    }

    /* renamed from: b */
    public void onBindViewHolder(C7849a aVar, int i) {
        vx2.m53591g(aVar, "holder");
        C9449vc vcVar = this.f40692a.get(i);
        aVar.mo55973a(vcVar);
        rm2 b = aVar.mo55974b();
        View view = b.f33548l;
        boolean z = true;
        if (i >= this.f40692a.size() - 1) {
            z = false;
        }
        view.setVisibility(ol0.m70370l0(z));
        b.mo47434b().setOnClickListener(new kr6(this, vcVar));
    }

    /* renamed from: d */
    public C7849a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        rm2 a = rm2.m51158a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_token_list, viewGroup, false));
        vx2.m53590f(a, "bind(LayoutInflater.from…ken_list, parent, false))");
        return new C7849a(a);
    }

    public int getItemCount() {
        return this.f40692a.size();
    }
}
