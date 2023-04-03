package net.safemoon.androidwallet.views;

import android.view.View;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CurrencyConverterLayout.kt */
public final class CurrencyConverterLayout$attachView$1$3 extends Lambda implements rc2<List<? extends RoomFiat>, r37> {
    public final /* synthetic */ ft2 $this_with;
    public final /* synthetic */ CurrencyConverterLayout this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.CurrencyConverterLayout$attachView$1$3$a */
    /* compiled from: Comparisons.kt */
    public static final class C8937a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(((RoomFiat) t).getSymbol(), ((RoomFiat) t2).getSymbol());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CurrencyConverterLayout$attachView$1$3(CurrencyConverterLayout currencyConverterLayout, ft2 ft2) {
        super(1);
        this.this$0 = currencyConverterLayout;
        this.$this_with = ft2;
    }

    /* renamed from: b */
    public static final void m69487b(List list, RoomFiat roomFiat, CurrencyConverterLayout currencyConverterLayout, View view) {
        vx2.m53591g(roomFiat, "$fiat");
        vx2.m53591g(currencyConverterLayout, "this$0");
        if (list.indexOf(roomFiat) >= 0) {
            currencyConverterLayout.f43218g = roomFiat;
            rc2 e = currencyConverterLayout.f43221s;
            boolean z = true;
            if (e == null || !((Boolean) e.invoke(roomFiat)).booleanValue()) {
                z = false;
            }
            if (z) {
                currencyConverterLayout.setItem(roomFiat);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<RoomFiat>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (p000.yb6.m74344y(r4, r5.getSymbol(), true) == false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<net.safemoon.androidwallet.model.fiat.room.RoomFiat> r12) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x00b2
            net.safemoon.androidwallet.views.CurrencyConverterLayout r0 = r11.this$0
            r0.f43219k = r12
            net.safemoon.androidwallet.views.CurrencyConverterLayout$attachView$1$3$a r0 = new net.safemoon.androidwallet.views.CurrencyConverterLayout$attachView$1$3$a
            r0.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47304D0(r12, r0)
            net.safemoon.androidwallet.views.CurrencyConverterLayout r1 = r11.this$0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r0.next()
            r5 = r3
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r5 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r5
            net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$a r6 = net.safemoon.androidwallet.viewmodels.SelectFiatViewModel.f42813e
            java.util.List r6 = r6.mo61382a()
            java.util.Iterator r6 = r6.iterator()
        L_0x0033:
            boolean r7 = r6.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x004c
            java.lang.Object r7 = r6.next()
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r5.getSymbol()
            boolean r9 = p000.yb6.m74344y(r9, r10, r8)
            if (r9 == 0) goto L_0x0033
            goto L_0x004d
        L_0x004c:
            r7 = r4
        L_0x004d:
            if (r7 == 0) goto L_0x0064
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r6 = r1.f43220r
            if (r6 == 0) goto L_0x0059
            java.lang.String r4 = r6.getSymbol()
        L_0x0059:
            java.lang.String r5 = r5.getSymbol()
            boolean r4 = p000.yb6.m74344y(r4, r5, r8)
            if (r4 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r8 = 0
        L_0x0065:
            if (r8 == 0) goto L_0x001b
            r2.add(r3)
            goto L_0x001b
        L_0x006b:
            ft2 r0 = r11.$this_with
            android.widget.LinearLayout r0 = r0.f28958b
            r0.removeAllViews()
            net.safemoon.androidwallet.views.CurrencyConverterLayout r0 = r11.this$0
            ft2 r1 = r11.$this_with
            java.util.Iterator r2 = r2.iterator()
        L_0x007a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r2.next()
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r3 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r3
            android.content.Context r5 = r0.getContext()
            r6 = 2131558726(0x7f0d0146, float:1.8742776E38)
            android.view.View r5 = android.view.View.inflate(r5, r6, r4)
            a36 r5 = p000.a36.m31661a(r5)
            com.google.android.material.button.MaterialButton r6 = r5.f20799b
            net.safemoon.androidwallet.views.a r7 = new net.safemoon.androidwallet.views.a
            r7.<init>(r12, r3, r0)
            r6.setOnClickListener(r7)
            com.google.android.material.button.MaterialButton r6 = r5.f20799b
            java.lang.String r3 = r3.getSymbol()
            r6.setText(r3)
            android.widget.LinearLayout r3 = r1.f28958b
            com.google.android.material.button.MaterialButton r5 = r5.mo28803b()
            r3.addView(r5)
            goto L_0x007a
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.views.CurrencyConverterLayout$attachView$1$3.invoke(java.util.List):void");
    }
}
