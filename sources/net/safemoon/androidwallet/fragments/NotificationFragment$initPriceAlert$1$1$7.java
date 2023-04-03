package net.safemoon.androidwallet.fragments;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.priceAlert.PAToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: NotificationFragment.kt */
public final class NotificationFragment$initPriceAlert$1$1$7 extends Lambda implements rc2<List<? extends PAToken>, r37> {
    public final /* synthetic */ NotificationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationFragment$initPriceAlert$1$1$7(NotificationFragment notificationFragment) {
        super(1);
        this.this$0 = notificationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<PAToken>) (List) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r7.isEmpty() != false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0042 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<net.safemoon.androidwallet.model.priceAlert.PAToken> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 10
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x009b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = p000.dk0.m43495u(r1, r2)
            r5.<init>(r6)
            java.util.Iterator r6 = r19.iterator()
        L_0x0017:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0037
            java.lang.Object r7 = r6.next()
            r8 = r7
            net.safemoon.androidwallet.model.priceAlert.PAToken r8 = (net.safemoon.androidwallet.model.priceAlert.PAToken) r8
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 127(0x7f, float:1.78E-43)
            r17 = 0
            net.safemoon.androidwallet.model.priceAlert.PAToken r7 = net.safemoon.androidwallet.model.priceAlert.PAToken.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5.add(r7)
            goto L_0x0017
        L_0x0037:
            net.safemoon.androidwallet.fragments.NotificationFragment r6 = r0.this$0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0042:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0095
            java.lang.Object r8 = r5.next()
            r9 = r8
            net.safemoon.androidwallet.model.priceAlert.PAToken r9 = (net.safemoon.androidwallet.model.priceAlert.PAToken) r9
            int r10 = r9.getChainId()
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r11 = r6.mo57518M()
            java.lang.Integer r11 = r11.mo61421y()
            if (r11 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            int r11 = r11.intValue()
            if (r10 == r11) goto L_0x008e
        L_0x0064:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r10 = r6.mo57518M()
            java.lang.Integer r10 = r10.mo61421y()
            net.safemoon.androidwallet.common.TokenType r11 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN
            int r11 = r11.getChainId()
            if (r10 != 0) goto L_0x0075
            goto L_0x008c
        L_0x0075:
            int r10 = r10.intValue()
            if (r10 != r11) goto L_0x008c
            net.safemoon.androidwallet.common.TokenType$a r10 = net.safemoon.androidwallet.common.TokenType.Companion
            int r9 = r9.getChainId()
            net.safemoon.androidwallet.common.TokenType r9 = r10.mo57099b(r9)
            boolean r9 = r9.isPartOfMultiChainTokens()
            if (r9 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r9 = r3
            goto L_0x008f
        L_0x008e:
            r9 = 1
        L_0x008f:
            if (r9 == 0) goto L_0x0042
            r7.add(r8)
            goto L_0x0042
        L_0x0095:
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L_0x009c
        L_0x009b:
            r7 = r4
        L_0x009c:
            net.safemoon.androidwallet.fragments.NotificationFragment r5 = r0.this$0
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r5 = r5.mo57518M()
            java.lang.Integer r5 = r5.mo61421y()
            r6 = -1
            if (r5 != 0) goto L_0x00aa
            goto L_0x00e8
        L_0x00aa:
            int r5 = r5.intValue()
            if (r5 != r6) goto L_0x00e8
            if (r1 == 0) goto L_0x00e7
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = p000.dk0.m43495u(r1, r2)
            r5.<init>(r2)
            java.util.Iterator r1 = r19.iterator()
        L_0x00bf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00df
            java.lang.Object r2 = r1.next()
            r7 = r2
            net.safemoon.androidwallet.model.priceAlert.PAToken r7 = (net.safemoon.androidwallet.model.priceAlert.PAToken) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 127(0x7f, float:1.78E-43)
            r16 = 0
            net.safemoon.androidwallet.model.priceAlert.PAToken r2 = net.safemoon.androidwallet.model.priceAlert.PAToken.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5.add(r2)
            goto L_0x00bf
        L_0x00df:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r4 = r5
        L_0x00e7:
            r7 = r4
        L_0x00e8:
            net.safemoon.androidwallet.fragments.NotificationFragment r1 = r0.this$0
            rj4 r1 = r1.mo57520O()
            r1.submitList(r7)
            net.safemoon.androidwallet.fragments.NotificationFragment r1 = r0.this$0
            net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener r1 = r1.f41989A
            if (r1 == 0) goto L_0x010b
            net.safemoon.androidwallet.fragments.NotificationFragment r2 = r0.this$0
            r1.mo57029q()
            ga2 r2 = r2.f41990k
            if (r2 == 0) goto L_0x010b
            androidx.recyclerview.widget.RecyclerView r2 = r2.f29153h
            if (r2 == 0) goto L_0x010b
            r2.mo9040e1(r1)
        L_0x010b:
            net.safemoon.androidwallet.fragments.NotificationFragment r1 = r0.this$0
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r1 = r1.mo57518M()
            java.lang.Integer r1 = r1.mo61421y()
            if (r1 != 0) goto L_0x0119
            goto L_0x0194
        L_0x0119:
            int r1 = r1.intValue()
            if (r1 != r6) goto L_0x0194
            net.safemoon.androidwallet.fragments.NotificationFragment r1 = r0.this$0
            ga2 r1 = r1.f41990k
            if (r1 == 0) goto L_0x0137
            androidx.recyclerview.widget.RecyclerView r1 = r1.f29153h
            if (r1 == 0) goto L_0x0137
            net.safemoon.androidwallet.fragments.NotificationFragment r2 = r0.this$0
            net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener r2 = r2.f41989A
            p000.vx2.m53588d(r2)
            r1.mo9079k(r2)
        L_0x0137:
            if (r7 == 0) goto L_0x0194
            net.safemoon.androidwallet.fragments.NotificationFragment r1 = r0.this$0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r7.size()
            r5 = r3
        L_0x0145:
            if (r5 >= r4) goto L_0x016f
            java.lang.Object r6 = r7.get(r5)
            net.safemoon.androidwallet.model.priceAlert.PAToken r6 = (net.safemoon.androidwallet.model.priceAlert.PAToken) r6
            int r8 = r6.getChainId()
            net.safemoon.androidwallet.common.TokenType r9 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN
            int r9 = r9.getChainId()
            if (r8 == r9) goto L_0x0165
            int r6 = r6.getChainId()
            net.safemoon.androidwallet.common.TokenType r8 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE
            int r8 = r8.getChainId()
            if (r6 != r8) goto L_0x016c
        L_0x0165:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r2.add(r6)
        L_0x016c:
            int r5 = r5 + 1
            goto L_0x0145
        L_0x016f:
            int r4 = r2.size()
            if (r4 <= 0) goto L_0x0194
            net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener r4 = r1.f41989A
            if (r4 == 0) goto L_0x018d
            java.lang.Integer[] r3 = new java.lang.Integer[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2
            r4.mo57038z(r2)
        L_0x018d:
            rj4 r1 = r1.mo57520O()
            r1.notifyDataSetChanged()
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.NotificationFragment$initPriceAlert$1$1$7.invoke(java.util.List):void");
    }
}
