package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.C1330o;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0014\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004J \u0010\u000b\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bJ\u001c\u0010\u000f\u001a\u00020\u00052\n\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0016R$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R*\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lya5;", "Landroidx/recyclerview/widget/o;", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "Lya5$b;", "Lkotlin/Function1;", "Lr37;", "clickListener", "e", "Lkotlin/Function2;", "Landroid/widget/Button;", "enableListener", "g", "holder", "", "position", "d", "Landroid/view/ViewGroup;", "parent", "viewType", "f", "a", "Lrc2;", "Lfd2;", "<init>", "()V", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ya5 */
/* compiled from: ReflectionTokenAdapter.kt */
public final class ya5 extends C1330o<RoomReflectionsToken, C9631b> {

    /* renamed from: a */
    public rc2<? super RoomReflectionsToken, r37> f46142a;

    /* renamed from: d */
    public fd2<? super RoomReflectionsToken, ? super Button, r37> f46143d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lya5$a;", "Landroidx/recyclerview/widget/g$f;", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "oldItem", "newItem", "", "b", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ya5$a */
    /* compiled from: ReflectionTokenAdapter.kt */
    public static final class C9630a extends C1294g.C1300f<RoomReflectionsToken> {

        /* renamed from: a */
        public static final C9630a f46144a = new C9630a();

        /* renamed from: a */
        public boolean areContentsTheSame(RoomReflectionsToken roomReflectionsToken, RoomReflectionsToken roomReflectionsToken2) {
            vx2.m53591g(roomReflectionsToken, "oldItem");
            vx2.m53591g(roomReflectionsToken2, "newItem");
            if (roomReflectionsToken.getEnableAdvanceMode() != roomReflectionsToken2.getEnableAdvanceMode() || !vx2.m53586b(roomReflectionsToken.getDifferenceBalance(), roomReflectionsToken2.getDifferenceBalance())) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public boolean areItemsTheSame(RoomReflectionsToken roomReflectionsToken, RoomReflectionsToken roomReflectionsToken2) {
            vx2.m53591g(roomReflectionsToken, "oldItem");
            vx2.m53591g(roomReflectionsToken2, "newItem");
            return vx2.m53586b(roomReflectionsToken.getId(), roomReflectionsToken2.getId());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lya5$b;", "Landroidx/recyclerview/widget/RecyclerView$a0;", "", "position", "Lr37;", "c", "Lqm2;", "a", "Lqm2;", "getBinding", "()Lqm2;", "binding", "<init>", "(Lya5;Lqm2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ya5$b */
    /* compiled from: ReflectionTokenAdapter.kt */
    public final class C9631b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final qm2 f46145a;

        /* renamed from: b */
        public final /* synthetic */ ya5 f46146b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9631b(ya5 ya5, qm2 qm2) {
            super(qm2.mo47129b());
            vx2.m53591g(qm2, "binding");
            this.f46146b = ya5;
            this.f46145a = qm2;
        }

        /* renamed from: d */
        public static final void m74317d(ya5 ya5, RoomReflectionsToken roomReflectionsToken, qm2 qm2, View view) {
            vx2.m53591g(ya5, "this$0");
            vx2.m53591g(roomReflectionsToken, "$it");
            vx2.m53591g(qm2, "$this_apply");
            fd2 b = ya5.f46143d;
            if (b != null) {
                MaterialButton materialButton = qm2.f33160c;
                vx2.m53590f(materialButton, "btnEnableAdvancedDataMode");
                b.invoke(roomReflectionsToken, materialButton);
            }
        }

        /* renamed from: e */
        public static final void m74318e(ya5 ya5, RoomReflectionsToken roomReflectionsToken, View view) {
            vx2.m53591g(ya5, "this$0");
            vx2.m53591g(roomReflectionsToken, "$it");
            rc2 a = ya5.f46142a;
            if (a != null) {
                a.invoke(roomReflectionsToken);
            }
        }

        /* renamed from: c */
        public final void mo67055c(int i) {
            int i2;
            double d;
            int i3;
            int i4;
            RoomReflectionsToken c = ya5.m74308c(this.f46146b, i);
            if (c != null) {
                ya5 ya5 = this.f46146b;
                qm2 qm2 = this.f46145a;
                ImageView imageView = qm2.f33161d;
                vx2.m53590f(imageView, "ivTokenIcon");
                Integer iconResId = c.getIconResId();
                if (iconResId != null) {
                    i2 = iconResId.intValue();
                } else {
                    i2 = 0;
                }
                ol0.m70336P(imageView, i2, c.getIconResName(), c.getSymbol());
                if (ol0.m70328H(c.getSymbol())) {
                    ImageView imageView2 = qm2.f33161d;
                    vx2.m53590f(imageView2, "ivTokenIcon");
                    ol0.m70335O(imageView2, String.valueOf(c.getCmcId()), c.getSymbol());
                }
                qm2.f33166i.setText(c.getName());
                qm2.f33169l.setText(c.getSymbol());
                double doubleValue = c.getDifferenceBalance().doubleValue();
                TextView textView = qm2.f33167j;
                vx2.m53590f(textView, "tvTokenNativeBalance");
                ol0.m70337Q(textView, doubleValue);
                Double priceUsd = c.getPriceUsd();
                if (priceUsd != null) {
                    d = priceUsd.doubleValue();
                } else {
                    d = 0.0d;
                }
                double d2 = doubleValue * d;
                if (d > Utils.DOUBLE_EPSILON) {
                    TextView textView2 = qm2.f33168k;
                    vx2.m53590f(textView2, "tvTokenNativeBalanceInFiat");
                    ol0.m70333M(textView2, d2, true);
                } else {
                    TextView textView3 = qm2.f33168k;
                    vx2.m53590f(textView3, "tvTokenNativeBalanceInFiat");
                    ol0.m70337Q(textView3, doubleValue);
                }
                String displayDate = c.getDisplayDate();
                if (displayDate != null) {
                    qm2.f33165h.setText(displayDate);
                }
                boolean enableAdvanceMode = c.getEnableAdvanceMode();
                MaterialButton materialButton = qm2.f33160c;
                if (!enableAdvanceMode) {
                    i3 = R.drawable.ic_baseline_add_24;
                } else {
                    i3 = R.drawable.ic_baseline_remove_24;
                }
                materialButton.setIconResource(i3);
                MaterialButton materialButton2 = qm2.f33160c;
                if (!enableAdvanceMode) {
                    i4 = R.string.mr_enable_advanced_data_mode;
                } else {
                    i4 = R.string.mr_disable_advanced_data_mode;
                }
                materialButton2.setText(i4);
                qm2.f33160c.setOnClickListener(new za5(ya5, c, qm2));
                qm2.mo47129b().setOnClickListener(new ab5(ya5, c));
            }
        }
    }

    public ya5() {
        super(C9630a.f46144a);
    }

    /* renamed from: c */
    public static final /* synthetic */ RoomReflectionsToken m74308c(ya5 ya5, int i) {
        return (RoomReflectionsToken) ya5.getItem(i);
    }

    /* renamed from: d */
    public void onBindViewHolder(C9631b bVar, int i) {
        vx2.m53591g(bVar, "holder");
        bVar.mo67055c(i);
    }

    /* renamed from: e */
    public final void mo67050e(rc2<? super RoomReflectionsToken, r37> rc2) {
        vx2.m53591g(rc2, "clickListener");
        this.f46142a = rc2;
    }

    /* renamed from: f */
    public C9631b onCreateViewHolder(ViewGroup viewGroup, int i) {
        vx2.m53591g(viewGroup, "parent");
        qm2 a = qm2.m50637a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_reflection_token, viewGroup, false));
        vx2.m53590f(a, "bind(\n            Layout…on_token, parent, false))");
        return new C9631b(this, a);
    }

    /* renamed from: g */
    public final void mo67052g(fd2<? super RoomReflectionsToken, ? super Button, r37> fd2) {
        vx2.m53591g(fd2, "enableListener");
        this.f46143d = fd2;
    }
}
