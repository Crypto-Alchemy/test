package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.C1330o;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000f\bB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, mo44877d2 = {"Lbb5;", "Landroidx/recyclerview/widget/o;", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsDataAndToken;", "Lbb5$b;", "holder", "", "position", "Lr37;", "b", "Landroid/view/ViewGroup;", "parent", "viewType", "c", "<init>", "()V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bb5 */
/* compiled from: ReflectionTokenDataAdapter.kt */
public final class bb5 extends C1330o<RoomReflectionsDataAndToken, C6857b> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lbb5$a;", "Landroidx/recyclerview/widget/g$f;", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsDataAndToken;", "oldItem", "newItem", "", "b", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bb5$a */
    /* compiled from: ReflectionTokenDataAdapter.kt */
    public static final class C6856a extends C1294g.C1300f<RoomReflectionsDataAndToken> {

        /* renamed from: a */
        public static final C6856a f36795a = new C6856a();

        /* renamed from: a */
        public boolean areContentsTheSame(RoomReflectionsDataAndToken roomReflectionsDataAndToken, RoomReflectionsDataAndToken roomReflectionsDataAndToken2) {
            vx2.m53591g(roomReflectionsDataAndToken, "oldItem");
            vx2.m53591g(roomReflectionsDataAndToken2, "newItem");
            if (roomReflectionsDataAndToken.getData().getTimeStamp() == roomReflectionsDataAndToken2.getData().getTimeStamp()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean areItemsTheSame(RoomReflectionsDataAndToken roomReflectionsDataAndToken, RoomReflectionsDataAndToken roomReflectionsDataAndToken2) {
            vx2.m53591g(roomReflectionsDataAndToken, "oldItem");
            vx2.m53591g(roomReflectionsDataAndToken2, "newItem");
            return vx2.m53586b(roomReflectionsDataAndToken.getData().getId(), roomReflectionsDataAndToken2.getData().getId());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Lbb5$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "", "position", "Lr37;", "a", "Lpm2;", "Lpm2;", "getBinding", "()Lpm2;", "binding", "<init>", "(Lbb5;Lpm2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bb5$b */
    /* compiled from: ReflectionTokenDataAdapter.kt */
    public final class C6857b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final pm2 f36796a;

        /* renamed from: b */
        public final /* synthetic */ bb5 f36797b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6857b(bb5 bb5, pm2 pm2) {
            super(pm2.mo46779b());
            vx2.m53591g(pm2, "binding");
            this.f36797b = bb5;
            this.f36796a = pm2;
        }

        /* renamed from: a */
        public final void mo50554a(int i) {
            double d;
            Double d2;
            RoomReflectionsDataAndToken a = bb5.m55837a(this.f36797b, i);
            if (a != null) {
                pm2 pm2 = this.f36796a;
                pm2.f32735b.setText(a.getDisplayDate());
                Double priceUsd = a.getToken().getPriceUsd();
                if (priceUsd != null) {
                    d = priceUsd.doubleValue();
                } else {
                    d = 0.0d;
                }
                Float diffBalance = a.getDiffBalance();
                Double d3 = null;
                if (diffBalance != null) {
                    d2 = Double.valueOf((double) diffBalance.floatValue());
                } else {
                    d2 = null;
                }
                if (d2 != null) {
                    d3 = Double.valueOf(d2.doubleValue() * d);
                }
                if (d2 != null) {
                    TextView textView = pm2.f32737d;
                    vx2.m53590f(textView, "tvTokenNativeBalance");
                    ol0.m70337Q(textView, d2.doubleValue());
                }
                if (d <= Utils.DOUBLE_EPSILON || d3 == null) {
                    pm2.f32736c.setText("");
                    return;
                }
                TextView textView2 = pm2.f32736c;
                vx2.m53590f(textView2, "tvTokenBalance");
                ol0.m70333M(textView2, d3.doubleValue(), true);
            }
        }
    }

    public bb5() {
        super(C6856a.f36795a);
    }

    /* renamed from: a */
    public static final /* synthetic */ RoomReflectionsDataAndToken m55837a(bb5 bb5, int i) {
        return (RoomReflectionsDataAndToken) bb5.getItem(i);
    }

    /* renamed from: b */
    public void onBindViewHolder(C6857b bVar, int i) {
        vx2.m53591g(bVar, "holder");
        bVar.mo50554a(i);
    }

    /* renamed from: c */
    public C6857b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        pm2 a = pm2.m49996a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_reflection, viewGroup, false));
        vx2.m53590f(a, "bind(\n                La…ent, false)\n            )");
        return new C6857b(this, a);
    }
}
