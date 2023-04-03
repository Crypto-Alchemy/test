package net.safemoon.androidwallet.dialogs;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertFragment.kt */
public final class CryptoPriceAlertFragment$onViewCreated$1$4 extends Lambda implements rc2<Integer, r37> {
    public final /* synthetic */ m92 $this_with;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertFragment$onViewCreated$1$4(m92 m92) {
        super(1);
        this.$this_with = m92;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Integer) obj);
        return r37.f33317a;
    }

    public final void invoke(Integer num) {
        if (num != null) {
            m92 m92 = this.$this_with;
            int intValue = num.intValue();
            LinearLayoutCompat linearLayoutCompat = m92.f31578k;
            vx2.m53590f(linearLayoutCompat, "parentOfNavigator");
            int childCount = linearLayoutCompat.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = linearLayoutCompat.getChildAt(i);
                vx2.m53590f(childAt, "getChildAt(index)");
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setSelected(i == intValue);
                }
                i++;
            }
        }
    }
}
