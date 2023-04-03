package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1", mo48632f = "CustomContractTokenViewModel.kt", mo48633l = {170}, mo48634m = "invokeSuspend")
/* compiled from: CustomContractTokenViewModel.kt */
public final class CustomContractTokenViewModel$save$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ rc2<CustomContractTokenViewModel.SaveReturnCode, r37> $callBack;
    public final /* synthetic */ String $contractAddress;
    public final /* synthetic */ String $contractDecimal;
    public final /* synthetic */ String $contractName;
    public final /* synthetic */ String $contractSymbol;
    public int label;
    public final /* synthetic */ CustomContractTokenViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1", mo48632f = "CustomContractTokenViewModel.kt", mo48633l = {171, 181, 208, 209, 210}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1 */
    /* compiled from: CustomContractTokenViewModel.kt */
    public static final class C86721 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86721(customContractTokenViewModel, str, rc2, str2, str3, str4, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86721) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0108  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0127  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x017e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x017f  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0198 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0199  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x01a4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r2 == 0) goto L_0x0067
                if (r2 == r7) goto L_0x0061
                if (r2 == r6) goto L_0x005a
                if (r2 == r5) goto L_0x0045
                if (r2 == r4) goto L_0x002b
                if (r2 != r3) goto L_0x0023
                java.lang.Object r1 = r0.L$0
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$iToken$1 r1 = (net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$iToken$1) r1
                p000.hg5.m45199b(r19)
                goto L_0x01d4
            L_0x0023:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002b:
                java.lang.Object r2 = r0.L$3
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$iToken$1 r2 = (net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$iToken$1) r2
                java.lang.Object r4 = r0.L$2
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r5 = r0.L$1
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r0.L$0
                java.lang.Integer r6 = (java.lang.Integer) r6
                p000.hg5.m45199b(r19)
                r3 = r19
                r11 = r4
                r13 = r5
                r14 = r6
                goto L_0x019c
            L_0x0045:
                java.lang.Object r2 = r0.L$3
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$iToken$1 r2 = (net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$iToken$1) r2
                java.lang.Object r5 = r0.L$2
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r0.L$1
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r0.L$0
                java.lang.Integer r7 = (java.lang.Integer) r7
                p000.hg5.m45199b(r19)
                goto L_0x0182
            L_0x005a:
                p000.hg5.m45199b(r19)
                r2 = r19
                goto L_0x00e3
            L_0x0061:
                p000.hg5.m45199b(r19)
                r2 = r19
                goto L_0x0077
            L_0x0067:
                p000.hg5.m45199b(r19)
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r2 = r4
                java.lang.String r9 = r5
                r0.label = r7
                java.lang.Object r2 = r2.mo61150B(r9, r0)
                if (r2 != r1) goto L_0x0077
                return r1
            L_0x0077:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0096
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r1 = r4
                hu0 r2 = p000.cd7.m11843a(r1)
                r3 = 0
                r4 = 0
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$1 r5 = new net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$1
                rc2<net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$SaveReturnCode, r37> r1 = r6
                r5.<init>(r1, r8)
                r6 = 3
                r7 = 0
                p000.y23 unused = p000.d50.m56748b(r2, r3, r4, r5, r6, r7)
                r37 r1 = p000.r37.f33317a
                return r1
            L_0x0096:
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r2 = r4
                k04 r2 = r2.mo61167z()
                java.lang.Object r2 = r2.getValue()
                if (r2 == 0) goto L_0x00b8
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r2 = r4
                k04 r2 = r2.mo61167z()
                java.lang.Object r2 = r2.getValue()
                p000.vx2.m53588d(r2)
                net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail r2 = (net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail) r2
                java.lang.Integer r2 = r2.f42452id
                java.lang.String r2 = java.lang.String.valueOf(r2)
                goto L_0x00e9
            L_0x00b8:
                net.safemoon.androidwallet.utils.ImageUtility r2 = new net.safemoon.androidwallet.utils.ImageUtility
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r7 = r4
                android.app.Application r7 = r7.mo27549b()
                java.lang.String r9 = "getApplication()"
                p000.vx2.m53590f(r7, r9)
                r2.<init>(r7)
                bq2 r10 = p000.bq2.f36932a
                r11 = 0
                r12 = 0
                java.lang.String r7 = r5
                int r13 = r7.hashCode()
                r14 = 3
                r15 = 0
                android.graphics.Bitmap r7 = p000.bq2.m56115b(r10, r11, r12, r13, r14, r15)
                r0.label = r6
                java.lang.String r6 = "Token"
                java.lang.Object r2 = r2.mo60920a(r7, r6, r0)
                if (r2 != r1) goto L_0x00e3
                return r1
            L_0x00e3:
                java.io.File r2 = (java.io.File) r2
                java.lang.String r2 = r2.getAbsolutePath()
            L_0x00e9:
                r13 = r2
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r2 = r4
                k04 r2 = r2.mo61167z()
                java.lang.Object r2 = r2.getValue()
                if (r2 == 0) goto L_0x0108
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r2 = r4
                k04 r2 = r2.mo61167z()
                java.lang.Object r2 = r2.getValue()
                p000.vx2.m53588d(r2)
                net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail r2 = (net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail) r2
                java.lang.Integer r2 = r2.f42452id
                goto L_0x0109
            L_0x0108:
                r2 = r8
            L_0x0109:
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r6 = r4
                k04 r6 = r6.mo61167z()
                java.lang.Object r6 = r6.getValue()
                if (r6 == 0) goto L_0x0127
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r6 = r4
                k04 r6 = r6.mo61167z()
                java.lang.Object r6 = r6.getValue()
                p000.vx2.m53588d(r6)
                net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail r6 = (net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail) r6
                java.lang.String r6 = r6.slug
                goto L_0x0128
            L_0x0127:
                r6 = r8
            L_0x0128:
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r7 = r4
                net.safemoon.androidwallet.common.TokenType r7 = r7.mo61165x()
                p000.vx2.m53588d(r7)
                int r7 = r7.getChainId()
                java.lang.String r9 = r5
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "CUSTOM_"
                r10.append(r11)
                r10.append(r7)
                java.lang.String r7 = "_"
                r10.append(r7)
                r10.append(r9)
                java.lang.String r7 = r10.toString()
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$iToken$1 r15 = new net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$iToken$1
                java.lang.String r11 = r7
                java.lang.String r12 = r8
                java.lang.String r14 = r5
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r10 = r4
                java.lang.String r9 = r9
                r16 = r9
                r9 = r15
                r17 = r10
                r10 = r7
                r3 = r15
                r15 = r17
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r9 = r4
                xy0 r9 = r9.mo61160s()
                r0.L$0 = r2
                r0.L$1 = r6
                r0.L$2 = r7
                r0.L$3 = r3
                r0.label = r5
                java.lang.Object r5 = r9.mo66979e(r3, r0)
                if (r5 != r1) goto L_0x017f
                return r1
            L_0x017f:
                r5 = r7
                r7 = r2
                r2 = r3
            L_0x0182:
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r3 = r4
                ir6 r3 = r3.mo61149A()
                r0.L$0 = r7
                r0.L$1 = r6
                r0.L$2 = r5
                r0.L$3 = r2
                r0.label = r4
                java.lang.Object r3 = r3.mo52533c(r5, r0)
                if (r3 != r1) goto L_0x0199
                return r1
            L_0x0199:
                r11 = r5
                r13 = r6
                r14 = r7
            L_0x019c:
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L_0x01d5
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r3 = r4
                ir6 r3 = r3.mo61149A()
                net.safemoon.androidwallet.model.RoomTokenInfo r4 = new net.safemoon.androidwallet.model.RoomTokenInfo
                r10 = 0
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r5 = r4
                net.safemoon.androidwallet.common.TokenType r5 = r5.mo61165x()
                p000.vx2.m53588d(r5)
                int r12 = r5.getChainId()
                r15 = 1
                r16 = 0
                r9 = r4
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                r0.L$0 = r2
                r0.L$1 = r8
                r0.L$2 = r8
                r0.L$3 = r8
                r5 = 5
                r0.label = r5
                java.lang.Object r3 = r3.mo52531a(r4, r0)
                if (r3 != r1) goto L_0x01d3
                return r1
            L_0x01d3:
                r1 = r2
            L_0x01d4:
                r2 = r1
            L_0x01d5:
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r1 = r4
                ip2 r1 = r1.mo61162u()
                r1.mo50495g(r2)
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r1 = r4
                hu0 r2 = p000.cd7.m11843a(r1)
                r3 = 0
                r4 = 0
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$2 r5 = new net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1$1$2
                rc2<net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$SaveReturnCode, r37> r1 = r6
                r5.<init>(r1, r8)
                r6 = 3
                r7 = 0
                p000.y23 unused = p000.d50.m56748b(r2, r3, r4, r5, r6, r7)
                r37 r1 = p000.r37.f33317a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$save$1.C86721.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomContractTokenViewModel$save$1(CustomContractTokenViewModel customContractTokenViewModel, String str, rc2<? super CustomContractTokenViewModel.SaveReturnCode, r37> rc2, String str2, String str3, String str4, ns0<? super CustomContractTokenViewModel$save$1> ns0) {
        super(2, ns0);
        this.this$0 = customContractTokenViewModel;
        this.$contractAddress = str;
        this.$callBack = rc2;
        this.$contractName = str2;
        this.$contractSymbol = str3;
        this.$contractDecimal = str4;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CustomContractTokenViewModel$save$1(this.this$0, this.$contractAddress, this.$callBack, this.$contractName, this.$contractSymbol, this.$contractDecimal, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CustomContractTokenViewModel$save$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final CustomContractTokenViewModel customContractTokenViewModel = this.this$0;
            final String str = this.$contractAddress;
            final rc2<CustomContractTokenViewModel.SaveReturnCode, r37> rc2 = this.$callBack;
            final String str2 = this.$contractName;
            final String str3 = this.$contractSymbol;
            final String str4 = this.$contractDecimal;
            C86721 r3 = new C86721((ns0<? super C86721>) null);
            this.label = 1;
            if (b50.m55768e(b, r3, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
