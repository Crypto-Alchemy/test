package net.safemoon.androidwallet.activity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "kotlin.jvm.PlatformType", "listFiats", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTSelectCurrencyActivity.kt */
public final class AKTSelectCurrencyActivity$onPostCreate$2 extends Lambda implements rc2<List<? extends RoomFiat>, r37> {
    public final /* synthetic */ AKTSelectCurrencyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTSelectCurrencyActivity$onPostCreate$2(AKTSelectCurrencyActivity aKTSelectCurrencyActivity) {
        super(1);
        this.this$0 = aKTSelectCurrencyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<RoomFiat>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<net.safemoon.androidwallet.model.fiat.room.RoomFiat> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "listFiats"
            p000.vx2.m53590f(r4, r0)
            boolean r0 = r4.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0055
            boolean r0 = r4 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r1 = r2
            goto L_0x0035
        L_0x001a:
            java.util.Iterator r4 = r4.iterator()
        L_0x001e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r4.next()
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r0 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r0
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x0032
            r0 = r1
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            if (r0 == 0) goto L_0x001e
        L_0x0035:
            if (r1 != 0) goto L_0x0055
            net.safemoon.androidwallet.activity.AKTSelectCurrencyActivity r4 = r3.this$0
            net.safemoon.androidwallet.dialogs.ProgressLoading r4 = r4.mo56781b0()
            r4.mo22266k()
            net.safemoon.androidwallet.activity.AKTSelectCurrencyActivity r4 = r3.this$0
            net.safemoon.androidwallet.activity.AKTSelectCurrencyActivity$defaultCurrencyAdapter$2$a r0 = r4.mo56780a0()
            net.safemoon.androidwallet.viewmodels.SelectFiatViewModel r1 = r4.mo56782c0()
            java.lang.String r4 = r4.f41368y
            java.util.List r4 = r1.mo61377l(r4)
            r0.mo66796d(r4)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTSelectCurrencyActivity$onPostCreate$2.invoke(java.util.List):void");
    }
}
