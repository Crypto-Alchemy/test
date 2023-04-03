package net.safemoon.androidwallet.fragments;

import android.widget.ImageView;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionsAdvanceFragment.kt */
public final class ReflectionsAdvanceFragment$onViewCreated$1$5 extends Lambda implements rc2<RoomReflectionsToken, r37> {
    public final /* synthetic */ ka2 $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionsAdvanceFragment$onViewCreated$1$5(ka2 ka2) {
        super(1);
        this.$this_apply = ka2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RoomReflectionsToken) obj);
        return r37.f33317a;
    }

    public final void invoke(RoomReflectionsToken roomReflectionsToken) {
        if (roomReflectionsToken != null) {
            qm2 qm2 = this.$this_apply.f30762e;
            ImageView imageView = qm2.f33161d;
            vx2.m53590f(imageView, "ivTokenIcon");
            Integer iconResId = roomReflectionsToken.getIconResId();
            ol0.m70336P(imageView, iconResId != null ? iconResId.intValue() : 0, roomReflectionsToken.getIconResName(), roomReflectionsToken.getSymbol());
            qm2.f33166i.setText(roomReflectionsToken.getName());
            qm2.f33169l.setText(roomReflectionsToken.getSymbol());
            double doubleValue = roomReflectionsToken.getDifferenceBalance().doubleValue();
            TextView textView = qm2.f33167j;
            vx2.m53590f(textView, "tvTokenNativeBalance");
            ol0.m70337Q(textView, doubleValue);
            Double priceUsd = roomReflectionsToken.getPriceUsd();
            double doubleValue2 = priceUsd != null ? priceUsd.doubleValue() : 0.0d;
            double d = doubleValue * doubleValue2;
            if (doubleValue2 > Utils.DOUBLE_EPSILON) {
                TextView textView2 = qm2.f33168k;
                vx2.m53590f(textView2, "tvTokenNativeBalanceInFiat");
                ol0.m70333M(textView2, d, true);
            } else {
                TextView textView3 = qm2.f33168k;
                vx2.m53590f(textView3, "tvTokenNativeBalanceInFiat");
                ol0.m70337Q(textView3, doubleValue);
            }
            String displayDate = roomReflectionsToken.getDisplayDate();
            if (displayDate != null) {
                qm2.f33165h.setText(displayDate);
            }
            qm2.f33160c.setIconResource(!roomReflectionsToken.getEnableAdvanceMode() ? R.drawable.ic_baseline_add_24 : R.drawable.ic_baseline_remove_24);
            qm2.f33160c.setVisibility(8);
        }
    }
}
