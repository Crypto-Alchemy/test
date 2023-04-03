package net.safemoon.androidwallet.dialogs;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.Coin;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lqx1;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CMCListCheckable.kt */
public final class CMCListCheckable$onViewCreated$2 extends Lambda implements rc2<List<? extends qx1>, r37> {
    public final /* synthetic */ CMCListCheckable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CMCListCheckable$onViewCreated$2(CMCListCheckable cMCListCheckable) {
        super(1);
        this.this$0 = cMCListCheckable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<qx1>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<qx1> list) {
        wh0 K = this.this$0.f41715X;
        if (K != null) {
            ArrayList arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(dk0.m43495u(list, 10));
                for (qx1 b : list) {
                    arrayList2.add(qx1.m71381b(b, (Coin) null, false, 3, (Object) null));
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            K.submitList(arrayList);
        }
    }
}
