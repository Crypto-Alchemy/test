package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.priceAlert.PAToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$deletePriceAlertCoin$1", mo48632f = "SettingNotificationViewModel.kt", mo48633l = {215, 217, 219, 219, 219}, mo48634m = "invokeSuspend")
/* compiled from: SettingNotificationViewModel.kt */
public final class SettingNotificationViewModel$deletePriceAlertCoin$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ PAToken $paToken;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ SettingNotificationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingNotificationViewModel$deletePriceAlertCoin$1(SettingNotificationViewModel settingNotificationViewModel, PAToken pAToken, ns0<? super SettingNotificationViewModel$deletePriceAlertCoin$1> ns0) {
        super(2, ns0);
        this.this$0 = settingNotificationViewModel;
        this.$paToken = pAToken;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SettingNotificationViewModel$deletePriceAlertCoin$1(this.this$0, this.$paToken, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((SettingNotificationViewModel$deletePriceAlertCoin$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0132 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0163 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            r34 = this;
            r1 = r34
            java.lang.Object r2 = p000.wx2.m54101d()
            int r0 = r1.label
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r0 == 0) goto L_0x006a
            if (r0 == r7) goto L_0x0042
            if (r0 == r6) goto L_0x0030
            if (r0 == r5) goto L_0x002b
            if (r0 == r4) goto L_0x002b
            if (r0 == r3) goto L_0x0022
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0022:
            java.lang.Object r0 = r1.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p000.hg5.m45199b(r35)
            goto L_0x0164
        L_0x002b:
            p000.hg5.m45199b(r35)
            goto L_0x017d
        L_0x0030:
            int r6 = r1.I$0
            java.lang.Object r0 = r1.L$0
            r7 = r0
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r7 = (net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel) r7
            p000.hg5.m45199b(r35)     // Catch:{ Exception -> 0x0167, all -> 0x003f }
            r4 = r6
            r6 = r35
            goto L_0x0122
        L_0x003f:
            r0 = move-exception
            goto L_0x014f
        L_0x0042:
            int r7 = r1.I$0
            java.lang.Object r0 = r1.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r9 = r1.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.L$0
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r11 = (net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel) r11
            p000.hg5.m45199b(r35)     // Catch:{ Exception -> 0x0066, all -> 0x0061 }
            r16 = r0
            r14 = r7
            r0 = r9
            r17 = r10
            r12 = r11
            r7 = r35
            goto L_0x00b6
        L_0x0061:
            r0 = move-exception
            r6 = r7
            r7 = r11
            goto L_0x014f
        L_0x0066:
            r6 = r7
            r7 = r11
            goto L_0x0167
        L_0x006a:
            p000.hg5.m45199b(r35)
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r0 = r1.this$0
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r0.mo61415s()
            if (r0 != 0) goto L_0x0078
            r37 r0 = p000.r37.f33317a
            return r0
        L_0x0078:
            net.safemoon.androidwallet.model.priceAlert.PAToken r0 = r1.$paToken
            java.lang.Integer r0 = r0.getCmcId()
            if (r0 == 0) goto L_0x017d
            net.safemoon.androidwallet.model.priceAlert.PAToken r9 = r1.$paToken
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r10 = r1.this$0
            int r11 = r0.intValue()
            java.lang.String r0 = r9.getContractAddress()     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            java.lang.String r12 = r9.getSymbol()     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            java.lang.Integer r9 = r9.getCmcId()     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            net.safemoon.androidwallet.repository.FcmDataSource r13 = r10.mo61422z()     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            r1.L$0 = r10     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            r1.L$1 = r0     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            r1.L$2 = r12     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            r1.L$3 = r9     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            r1.I$0 = r11     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            r1.label = r7     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            java.lang.Object r7 = r13.mo60724c(r1)     // Catch:{ Exception -> 0x0165, all -> 0x014c }
            if (r7 != r2) goto L_0x00af
            return r2
        L_0x00af:
            r17 = r0
            r16 = r9
            r14 = r11
            r0 = r12
            r12 = r10
        L_0x00b6:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0147, all -> 0x0141 }
            net.safemoon.androidwallet.model.wallets.Wallet r9 = r12.mo61415s()     // Catch:{ Exception -> 0x0147, all -> 0x0141 }
            p000.vx2.m53588d(r9)     // Catch:{ Exception -> 0x0147, all -> 0x0141 }
            net.safemoon.androidwallet.common.MyCoinType r10 = net.safemoon.androidwallet.common.MyCoinType.ETHEREUM     // Catch:{ Exception -> 0x0147, all -> 0x0141 }
            int r10 = r10.getValue()     // Catch:{ Exception -> 0x0147, all -> 0x0141 }
            java.lang.String r11 = r9.getAddress(r10)     // Catch:{ Exception -> 0x0147, all -> 0x0141 }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r9 = new net.safemoon.androidwallet.model.priceAlert.PriceAlertToken     // Catch:{ Exception -> 0x0147, all -> 0x0141 }
            r10 = 0
            r13 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 2096937(0x1fff29, float:2.938435E-39)
            r32 = 0
            r35 = r9
            r33 = r12
            r12 = r0
            r4 = r14
            r14 = r17
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x013e, all -> 0x013a }
            tk5 r7 = r33.mo61397A()     // Catch:{ Exception -> 0x013e, all -> 0x013a }
            r9 = r35
            r9.setId(r8)     // Catch:{ Exception -> 0x013e, all -> 0x013a }
            k90 r7 = r7.mo66093l(r9)     // Catch:{ Exception -> 0x013e, all -> 0x013a }
            java.lang.String r9 = "mainNetApiInterface.dele…(pat.apply { id = null })"
            p000.vx2.m53590f(r7, r9)     // Catch:{ Exception -> 0x013e, all -> 0x013a }
            r10 = r33
            r1.L$0 = r10     // Catch:{ Exception -> 0x0149, all -> 0x0138 }
            r1.L$1 = r8     // Catch:{ Exception -> 0x0149, all -> 0x0138 }
            r1.L$2 = r8     // Catch:{ Exception -> 0x0149, all -> 0x0138 }
            r1.L$3 = r8     // Catch:{ Exception -> 0x0149, all -> 0x0138 }
            r1.I$0 = r4     // Catch:{ Exception -> 0x0149, all -> 0x0138 }
            r1.label = r6     // Catch:{ Exception -> 0x0149, all -> 0x0138 }
            java.lang.Object r6 = retrofit2.KotlinExtensions.m71521c(r7, r1)     // Catch:{ Exception -> 0x0149, all -> 0x0138 }
            if (r6 != r2) goto L_0x0121
            return r2
        L_0x0121:
            r7 = r10
        L_0x0122:
            bg5 r6 = (p000.bg5) r6     // Catch:{ Exception -> 0x0136, all -> 0x0133 }
            ei0 r0 = r7.mo61418v()
            r1.L$0 = r8
            r1.label = r5
            java.lang.Object r0 = r0.mo51476a(r4, r1)
            if (r0 != r2) goto L_0x017d
            return r2
        L_0x0133:
            r0 = move-exception
            r6 = r4
            goto L_0x014f
        L_0x0136:
            r6 = r4
            goto L_0x0167
        L_0x0138:
            r0 = move-exception
            goto L_0x0144
        L_0x013a:
            r0 = move-exception
            r10 = r33
            goto L_0x0144
        L_0x013e:
            r10 = r33
            goto L_0x0149
        L_0x0141:
            r0 = move-exception
            r10 = r12
            r4 = r14
        L_0x0144:
            r6 = r4
            r7 = r10
            goto L_0x014f
        L_0x0147:
            r10 = r12
            r4 = r14
        L_0x0149:
            r6 = r4
            r7 = r10
            goto L_0x0167
        L_0x014c:
            r0 = move-exception
            r7 = r10
            r6 = r11
        L_0x014f:
            ei0 r4 = r7.mo61418v()
            r1.L$0 = r0
            r1.L$1 = r8
            r1.L$2 = r8
            r1.L$3 = r8
            r1.label = r3
            java.lang.Object r3 = r4.mo51476a(r6, r1)
            if (r3 != r2) goto L_0x0164
            return r2
        L_0x0164:
            throw r0
        L_0x0165:
            r7 = r10
            r6 = r11
        L_0x0167:
            ei0 r3 = r7.mo61418v()
            r1.L$0 = r8
            r1.L$1 = r8
            r1.L$2 = r8
            r1.L$3 = r8
            r0 = 4
            r1.label = r0
            java.lang.Object r0 = r3.mo51476a(r6, r1)
            if (r0 != r2) goto L_0x017d
            return r2
        L_0x017d:
            r37 r0 = p000.r37.f33317a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$deletePriceAlertCoin$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
