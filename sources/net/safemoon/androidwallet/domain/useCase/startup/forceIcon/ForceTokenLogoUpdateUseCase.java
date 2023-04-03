package net.safemoon.androidwallet.domain.useCase.startup.forceIcon;

import kotlin.Metadata;
import net.safemoon.androidwallet.extension.ThreadExtension;
import net.safemoon.androidwallet.repository.ReflectionDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0004\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo44877d2 = {"Lnet/safemoon/androidwallet/domain/useCase/startup/forceIcon/ForceTokenLogoUpdateUseCase;", "Lzn2;", "Lr37;", "a", "e", "(Lns0;)Ljava/lang/Object;", "d", "Lip2;", "Lip2;", "userTokenListRepository", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "b", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "reflectionDataSource", "Lhu0;", "c", "Lhu0;", "coroutineScope", "", "Ljava/lang/String;", "tokenSymbol", "newIconResName", "<init>", "(Lip2;Lnet/safemoon/androidwallet/repository/ReflectionDataSource;Lhu0;Ljava/lang/String;Ljava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ForceTokenLogoUpdateUseCase.kt */
public final class ForceTokenLogoUpdateUseCase implements zn2 {

    /* renamed from: a */
    public final ip2 f41850a;

    /* renamed from: b */
    public final ReflectionDataSource f41851b;

    /* renamed from: c */
    public final hu0 f41852c;

    /* renamed from: d */
    public final String f41853d;

    /* renamed from: e */
    public final String f41854e;

    public ForceTokenLogoUpdateUseCase(ip2 ip2, ReflectionDataSource reflectionDataSource, hu0 hu0, String str, String str2) {
        vx2.m53591g(ip2, "userTokenListRepository");
        vx2.m53591g(reflectionDataSource, "reflectionDataSource");
        vx2.m53591g(hu0, "coroutineScope");
        vx2.m53591g(str, "tokenSymbol");
        vx2.m53591g(str2, "newIconResName");
        this.f41850a = ip2;
        this.f41851b = reflectionDataSource;
        this.f41852c = hu0;
        this.f41853d = str;
        this.f41854e = str2;
    }

    /* renamed from: a */
    public void mo57370a() {
        ThreadExtension.f41859a.mo57378a(this.f41852c, new ForceTokenLogoUpdateUseCase$update$1(this, (ns0<? super ForceTokenLogoUpdateUseCase$update$1>) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af A[Catch:{ RuntimeException -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0 A[Catch:{ RuntimeException -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo57371d(p000.ns0<? super p000.r37> r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            boolean r2 = r0 instanceof net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$updateInReflectionRepo$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$updateInReflectionRepo$1 r2 = (net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$updateInReflectionRepo$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$updateInReflectionRepo$1 r2 = new net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$updateInReflectionRepo$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x004c
            if (r4 == r6) goto L_0x0040
            if (r4 != r5) goto L_0x0038
            java.lang.Object r2 = r2.L$0
            net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase r2 = (net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase) r2
            p000.hg5.m45199b(r0)     // Catch:{ RuntimeException -> 0x0035 }
            goto L_0x00de
        L_0x0035:
            r0 = move-exception
            goto L_0x00c4
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            java.lang.Object r4 = r2.L$0
            net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase r4 = (net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase) r4
            p000.hg5.m45199b(r0)     // Catch:{ RuntimeException -> 0x0048 }
            goto L_0x005f
        L_0x0048:
            r0 = move-exception
            r2 = r4
            goto L_0x00c4
        L_0x004c:
            p000.hg5.m45199b(r0)
            net.safemoon.androidwallet.repository.ReflectionDataSource r0 = r1.f41851b     // Catch:{ RuntimeException -> 0x00c2 }
            java.lang.String r4 = r1.f41853d     // Catch:{ RuntimeException -> 0x00c2 }
            r2.L$0 = r1     // Catch:{ RuntimeException -> 0x00c2 }
            r2.label = r6     // Catch:{ RuntimeException -> 0x00c2 }
            java.lang.Object r0 = r0.mo60742c(r4, r2)     // Catch:{ RuntimeException -> 0x00c2 }
            if (r0 != r3) goto L_0x005e
            return r3
        L_0x005e:
            r4 = r1
        L_0x005f:
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r0 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r0     // Catch:{ RuntimeException -> 0x0048 }
            if (r0 == 0) goto L_0x00de
            java.lang.String r7 = r0.getIconResName()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.String r8 = r4.f41854e     // Catch:{ RuntimeException -> 0x0048 }
            boolean r7 = p000.vx2.m53586b(r7, r8)     // Catch:{ RuntimeException -> 0x0048 }
            if (r7 != 0) goto L_0x00de
            net.safemoon.androidwallet.repository.ReflectionDataSource r7 = r4.f41851b     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.String r13 = r4.f41854e     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.Long r9 = r0.getId()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.String r10 = r0.getSymbolWithType()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.String r11 = r0.getSymbol()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.String r12 = r0.getName()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.String r14 = r0.getContractAddress()     // Catch:{ RuntimeException -> 0x0048 }
            int r15 = r0.getChainId()     // Catch:{ RuntimeException -> 0x0048 }
            int r16 = r0.getDecimals()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.String r17 = r0.getNativeBalance()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.Long r18 = r0.getFirstTimeStamp()     // Catch:{ RuntimeException -> 0x0048 }
            boolean r8 = r0.getEnableAdvanceMode()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.Long r20 = r0.getLatestBalance()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.Long r21 = r0.getLatestTimeStamp()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.Long r22 = r0.getCmcId()     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.Double r23 = r0.getPriceUsd()     // Catch:{ RuntimeException -> 0x0048 }
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r0 = new net.safemoon.androidwallet.model.reflections.RoomReflectionsToken     // Catch:{ RuntimeException -> 0x0048 }
            if (r8 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r6 = 0
        L_0x00b1:
            r19 = r6
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x0048 }
            r2.L$0 = r4     // Catch:{ RuntimeException -> 0x0048 }
            r2.label = r5     // Catch:{ RuntimeException -> 0x0048 }
            java.lang.Object r0 = r7.mo60752m(r0, r2)     // Catch:{ RuntimeException -> 0x0048 }
            if (r0 != r3) goto L_0x00de
            return r3
        L_0x00c2:
            r0 = move-exception
            r2 = r1
        L_0x00c4:
            java.lang.String r0 = r0.getLocalizedMessage()
            if (r0 != 0) goto L_0x00de
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r2 = "this::class.java.simpleName"
            p000.vx2.m53590f(r0, r2)
            java.lang.String r2 = ""
            p000.ol0.m70350b0(r2, r0)
            r37 r0 = p000.r37.f33317a
        L_0x00de:
            r37 r0 = p000.r37.f33317a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase.mo57371d(ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo57372e(p000.ns0<? super p000.r37> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$updateInTokenRepo$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$updateInTokenRepo$1 r0 = (net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$updateInTokenRepo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$updateInTokenRepo$1 r0 = new net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase$updateInTokenRepo$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.L$0
            net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase r0 = (net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase) r0
            p000.hg5.m45199b(r6)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0067
        L_0x002d:
            r6 = move-exception
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            p000.hg5.m45199b(r6)
            ip2 r6 = r5.f41850a     // Catch:{ RuntimeException -> 0x004b }
            java.lang.String r2 = r5.f41853d     // Catch:{ RuntimeException -> 0x004b }
            java.lang.String r4 = r5.f41854e     // Catch:{ RuntimeException -> 0x004b }
            r0.L$0 = r5     // Catch:{ RuntimeException -> 0x004b }
            r0.label = r3     // Catch:{ RuntimeException -> 0x004b }
            java.lang.Object r6 = r6.mo50493e(r2, r4, r0)     // Catch:{ RuntimeException -> 0x004b }
            if (r6 != r1) goto L_0x0067
            return r1
        L_0x004b:
            r6 = move-exception
            r0 = r5
        L_0x004d:
            java.lang.String r6 = r6.getLocalizedMessage()
            if (r6 != 0) goto L_0x0067
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r0 = "this::class.java.simpleName"
            p000.vx2.m53590f(r6, r0)
            java.lang.String r0 = ""
            p000.ol0.m70350b0(r0, r6)
            r37 r6 = p000.r37.f33317a
        L_0x0067:
            r37 r6 = p000.r37.f33317a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.domain.useCase.startup.forceIcon.ForceTokenLogoUpdateUseCase.mo57372e(ns0):java.lang.Object");
    }
}
