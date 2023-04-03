package p000;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1710a;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.Coin;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lsx1;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "Lqx1;", "extendCoin", "Lr37;", "b", "Lyy2;", "a", "Lyy2;", "getBinding", "()Lyy2;", "binding", "Lpn2;", "Lpn2;", "iCallBack", "<init>", "(Lyy2;Lpn2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sx1 */
/* compiled from: CMCListCheckable.kt */
public final class sx1 extends RecyclerView.C1231a0 {

    /* renamed from: a */
    public final yy2 f44620a;

    /* renamed from: b */
    public final pn2 f44621b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sx1(yy2 yy2, pn2 pn2) {
        super(yy2.mo49753b());
        vx2.m53591g(yy2, "binding");
        this.f44620a = yy2;
        this.f44621b = pn2;
    }

    /* renamed from: c */
    public static final void m72122c(qx1 qx1, sx1 sx1, Coin coin, View view) {
        vx2.m53591g(qx1, "$extendCoin");
        vx2.m53591g(sx1, "this$0");
        vx2.m53591g(coin, "$item");
        if (qx1.mo65539d()) {
            pn2 pn2 = sx1.f44621b;
            if (pn2 != null) {
                pn2.mo57527b(coin);
                return;
            }
            return;
        }
        pn2 pn22 = sx1.f44621b;
        if (pn22 != null) {
            pn22.mo57526a(coin);
        }
    }

    /* renamed from: b */
    public final void mo65947b(qx1 qx1) {
        vx2.m53591g(qx1, "extendCoin");
        yy2 yy2 = this.f44620a;
        Coin c = qx1.mo65538c();
        Integer id = c.getId();
        vx2.m53590f(id, "item.id");
        Object h = C9384u3.m72567h(id.intValue(), c.getSymbol());
        TextView textView = yy2.f35948h;
        String name = c.getName();
        String symbol = c.getSymbol();
        textView.setText(name + " (" + symbol + ")");
        C1710a.m12225u(yy2.f35944d).mo23163x(h).mo11553K0(yy2.f35944d);
        MaterialCheckBox materialCheckBox = yy2.f35943c;
        vx2.m53590f(materialCheckBox, "checkableIcon");
        int i = 0;
        materialCheckBox.setVisibility(0);
        yy2.f35943c.setChecked(qx1.mo65539d());
        MaterialCardView materialCardView = yy2.f35945e;
        if (!qx1.mo65539d()) {
            i = 8;
        }
        materialCardView.setVisibility(i);
        yy2.f35946f.setOnClickListener(new rx1(qx1, this, c));
    }
}
