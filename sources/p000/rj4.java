package p000;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1330o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.priceAlert.PAToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000eB\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lrj4;", "Landroidx/recyclerview/widget/o;", "Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "Lrj4$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "c", "holder", "position", "Lr37;", "b", "Lkotlin/Function1;", "a", "Lrc2;", "()Lrc2;", "callback", "<init>", "(Lrc2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rj4 */
/* compiled from: PATokenAdapter.kt */
public final class rj4 extends C1330o<PAToken, C9256a> {

    /* renamed from: a */
    public final rc2<PAToken, r37> f44381a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lrj4$a;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "item", "Lr37;", "b", "Lyy2;", "a", "Lyy2;", "getBinding", "()Lyy2;", "binding", "<init>", "(Lrj4;Lyy2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: rj4$a */
    /* compiled from: PATokenAdapter.kt */
    public final class C9256a extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final yy2 f44382a;

        /* renamed from: b */
        public final /* synthetic */ rj4 f44383b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9256a(rj4 rj4, yy2 yy2) {
            super(yy2.mo49753b());
            vx2.m53591g(yy2, "binding");
            this.f44383b = rj4;
            this.f44382a = yy2;
        }

        /* renamed from: c */
        public static final void m71558c(rj4 rj4, PAToken pAToken, View view) {
            vx2.m53591g(rj4, "this$0");
            vx2.m53591g(pAToken, "$item");
            rj4.mo65661a().invoke(pAToken);
        }

        /* renamed from: b */
        public final void mo65664b(PAToken pAToken) {
            int i;
            vx2.m53591g(pAToken, "item");
            yy2 yy2 = this.f44382a;
            rj4 rj4 = this.f44383b;
            TextView textView = yy2.f35948h;
            String name = pAToken.getName();
            String symbol = pAToken.getSymbol();
            textView.setText(name + " (" + symbol + ")");
            C1710a.m12225u(yy2.f35944d).mo23163x(pAToken.getIcon()).mo11567a(qe5.m25623x0()).mo11553K0(yy2.f35944d);
            ShapeableImageView shapeableImageView = yy2.f35947g;
            vx2.m53590f(shapeableImageView, "statusForCheck");
            if (!pAToken.getHasPriceAlert()) {
                i = 4;
            } else {
                i = 0;
            }
            shapeableImageView.setVisibility(i);
            yy2.f35946f.setOnClickListener(new qj4(rj4, pAToken));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rj4(rc2<? super PAToken, r37> rc2) {
        super(vn2.f45332a);
        vx2.m53591g(rc2, "callback");
        this.f44381a = rc2;
    }

    /* renamed from: a */
    public final rc2<PAToken, r37> mo65661a() {
        return this.f44381a;
    }

    /* renamed from: b */
    public void onBindViewHolder(C9256a aVar, int i) {
        vx2.m53591g(aVar, "holder");
        Object item = getItem(i);
        vx2.m53590f(item, "getItem(position)");
        aVar.mo65664b((PAToken) item);
        Log.println(7, "position", String.valueOf(i));
    }

    /* renamed from: c */
    public C9256a onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        yy2 c = yy2.m54894c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        vx2.m53590f(c, "inflate(LayoutInflater.f…t.context),parent, false)");
        return new C9256a(this, c);
    }
}
