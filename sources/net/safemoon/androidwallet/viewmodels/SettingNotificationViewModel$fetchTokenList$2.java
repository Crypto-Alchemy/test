package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$fetchTokenList$2", mo48632f = "SettingNotificationViewModel.kt", mo48633l = {137, 147, 149, 152, 154}, mo48634m = "invokeSuspend")
/* compiled from: SettingNotificationViewModel.kt */
public final class SettingNotificationViewModel$fetchTokenList$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ int $chainId;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ SettingNotificationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingNotificationViewModel$fetchTokenList$2(SettingNotificationViewModel settingNotificationViewModel, int i, ns0<? super SettingNotificationViewModel$fetchTokenList$2> ns0) {
        super(2, ns0);
        this.this$0 = settingNotificationViewModel;
        this.$chainId = i;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SettingNotificationViewModel$fetchTokenList$2(this.this$0, this.$chainId, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((SettingNotificationViewModel$fetchTokenList$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0200 A[LOOP:5: B:74:0x01fa->B:76:0x0200, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 10
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x0072
            if (r2 == r9) goto L_0x006c
            if (r2 == r7) goto L_0x0054
            if (r2 == r6) goto L_0x0048
            if (r2 == r5) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            java.lang.Object r1 = r0.L$0
            java.util.List r1 = (java.util.List) r1
            p000.hg5.m45199b(r25)
            r4 = r25
            r12 = r0
            goto L_0x01e9
        L_0x0028:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0030:
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r6 = r0.L$1
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r6 = (net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel) r6
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            p000.hg5.m45199b(r25)
            r12 = r0
            r23 = r2
            r2 = r1
            r1 = r7
            r7 = r23
            goto L_0x01b5
        L_0x0048:
            java.lang.Object r2 = r0.L$0
            java.util.List r2 = (java.util.List) r2
            p000.hg5.m45199b(r25)
            r6 = r25
            r12 = r0
            goto L_0x015f
        L_0x0054:
            java.lang.Object r2 = r0.L$3
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r10 = r0.L$2
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r0.L$1
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r11 = (net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel) r11
            java.lang.Object r12 = r0.L$0
            java.util.List r12 = (java.util.List) r12
            p000.hg5.m45199b(r25)
            r13 = r25
            r14 = r0
            goto L_0x0140
        L_0x006c:
            p000.hg5.m45199b(r25)
            r2 = r25
            goto L_0x00bc
        L_0x0072:
            p000.hg5.m45199b(r25)
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r2 = r0.this$0
            java.util.List r2 = r2.f42837r
            int r10 = r0.$chainId
            boolean r11 = r2 instanceof java.util.Collection
            r12 = 0
            if (r11 == 0) goto L_0x0089
            boolean r11 = r2.isEmpty()
            if (r11 == 0) goto L_0x0089
            goto L_0x00a5
        L_0x0089:
            java.util.Iterator r2 = r2.iterator()
        L_0x008d:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x00a5
            java.lang.Object r11 = r2.next()
            net.safemoon.androidwallet.common.TokenType r11 = (net.safemoon.androidwallet.common.TokenType) r11
            int r11 = r11.getChainId()
            if (r10 != r11) goto L_0x00a1
            r11 = r9
            goto L_0x00a2
        L_0x00a1:
            r11 = r12
        L_0x00a2:
            if (r11 == 0) goto L_0x008d
            r12 = r9
        L_0x00a5:
            if (r12 == 0) goto L_0x00d9
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r2 = r0.this$0
            net.safemoon.androidwallet.repository.TokenListDataSource r2 = r2.mo61403G()
            int r3 = r0.$chainId
            java.lang.Integer r3 = p000.a40.m31673d(r3)
            r0.label = r9
            java.lang.Object r2 = r2.mo60763g(r3, r0)
            if (r2 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            java.util.List r2 = (java.util.List) r2
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ r9
            if (r1 == 0) goto L_0x00ce
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r1 = r0.this$0
            k04 r1 = r1.mo61398B()
            r1.postValue(r8)
        L_0x00ce:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r1 = r0.this$0
            k04 r1 = r1.mo61398B()
            r1.postValue(r2)
            goto L_0x0256
        L_0x00d9:
            int r2 = r0.$chainId
            r10 = -1
            if (r2 != r10) goto L_0x0256
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            net.safemoon.androidwallet.utils.Common r10 = net.safemoon.androidwallet.utils.Common.f42577a
            java.util.List r10 = r10.mo60896a(r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00f2:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0109
            java.lang.Object r12 = r10.next()
            r13 = r12
            net.safemoon.androidwallet.common.TokenType r13 = (net.safemoon.androidwallet.common.TokenType) r13
            boolean r13 = r13.isPartOfMultiChainTokens()
            if (r13 == 0) goto L_0x00f2
            r11.add(r12)
            goto L_0x00f2
        L_0x0109:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r10 = r0.this$0
            java.util.Iterator r11 = r11.iterator()
            r12 = r0
            r23 = r11
            r11 = r10
            r10 = r23
        L_0x0115:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0148
            java.lang.Object r13 = r10.next()
            net.safemoon.androidwallet.common.TokenType r13 = (net.safemoon.androidwallet.common.TokenType) r13
            net.safemoon.androidwallet.repository.TokenListDataSource r14 = r11.mo61403G()
            int r13 = r13.getChainId()
            java.lang.Integer r13 = p000.a40.m31673d(r13)
            r12.L$0 = r2
            r12.L$1 = r11
            r12.L$2 = r10
            r12.L$3 = r2
            r12.label = r7
            java.lang.Object r13 = r14.mo60763g(r13, r12)
            if (r13 != r1) goto L_0x013e
            return r1
        L_0x013e:
            r14 = r12
            r12 = r2
        L_0x0140:
            java.util.Collection r13 = (java.util.Collection) r13
            r2.addAll(r13)
            r2 = r12
            r12 = r14
            goto L_0x0115
        L_0x0148:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r7 = r12.this$0
            ei0 r7 = r7.mo61418v()
            r12.L$0 = r2
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.label = r6
            java.lang.Object r6 = r7.mo51478c(r12)
            if (r6 != r1) goto L_0x015f
            return r1
        L_0x015f:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x016a:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x01aa
            java.lang.Object r10 = r6.next()
            r11 = r10
            net.safemoon.androidwallet.model.RoomCoinPriceAlert r11 = (net.safemoon.androidwallet.model.RoomCoinPriceAlert) r11
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = p000.dk0.m43495u(r2, r3)
            r13.<init>(r14)
            java.util.Iterator r14 = r2.iterator()
        L_0x0184:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0198
            java.lang.Object r15 = r14.next()
            net.safemoon.androidwallet.model.priceAlert.PAToken r15 = (net.safemoon.androidwallet.model.priceAlert.PAToken) r15
            java.lang.Integer r15 = r15.getCmcId()
            r13.add(r15)
            goto L_0x0184
        L_0x0198:
            int r11 = r11.getCmcId()
            java.lang.Integer r11 = p000.a40.m31673d(r11)
            boolean r11 = r13.contains(r11)
            if (r11 == 0) goto L_0x016a
            r7.add(r10)
            goto L_0x016a
        L_0x01aa:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r6 = r12.this$0
            java.util.Iterator r7 = r7.iterator()
            r23 = r2
            r2 = r1
            r1 = r23
        L_0x01b5:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x01d4
            java.lang.Object r10 = r7.next()
            net.safemoon.androidwallet.model.RoomCoinPriceAlert r10 = (net.safemoon.androidwallet.model.RoomCoinPriceAlert) r10
            ei0 r11 = r6.mo61418v()
            r12.L$0 = r1
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r5
            java.lang.Object r10 = r11.mo51477b(r10, r12)
            if (r10 != r2) goto L_0x01b5
            return r2
        L_0x01d4:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r5 = r12.this$0
            ei0 r5 = r5.mo61418v()
            r12.L$0 = r1
            r12.L$1 = r8
            r12.L$2 = r8
            r12.label = r4
            java.lang.Object r4 = r5.mo51478c(r12)
            if (r4 != r2) goto L_0x01e9
            return r2
        L_0x01e9:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            int r2 = r12.$chainId
            java.util.ArrayList r5 = new java.util.ArrayList
            int r3 = p000.dk0.m43495u(r4, r3)
            r5.<init>(r3)
            java.util.Iterator r3 = r4.iterator()
        L_0x01fa:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x023d
            java.lang.Object r4 = r3.next()
            net.safemoon.androidwallet.model.RoomCoinPriceAlert r4 = (net.safemoon.androidwallet.model.RoomCoinPriceAlert) r4
            int r6 = r4.getCmcId()
            java.lang.String r7 = r4.getSymbol()
            java.lang.Object r19 = p000.C9384u3.m72567h(r6, r7)
            java.lang.String r15 = r4.getName()
            java.lang.String r16 = r4.getSymbol()
            int r4 = r4.getCmcId()
            net.safemoon.androidwallet.model.priceAlert.PAToken r6 = new net.safemoon.androidwallet.model.priceAlert.PAToken
            r17 = 0
            java.lang.Integer r18 = p000.a40.m31673d(r4)
            r20 = 0
            r21 = 64
            r22 = 0
            r13 = r6
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r4 = r1.add(r6)
            java.lang.Boolean r4 = p000.a40.m31670a(r4)
            r5.add(r4)
            goto L_0x01fa
        L_0x023d:
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ r9
            if (r2 == 0) goto L_0x024d
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r2 = r12.this$0
            k04 r2 = r2.mo61398B()
            r2.postValue(r8)
        L_0x024d:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r2 = r12.this$0
            k04 r2 = r2.mo61398B()
            r2.postValue(r1)
        L_0x0256:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$fetchTokenList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
