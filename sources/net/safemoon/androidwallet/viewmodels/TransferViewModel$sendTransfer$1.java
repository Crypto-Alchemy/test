package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransferViewModel$sendTransfer$1", mo48632f = "TransferViewModel.kt", mo48633l = {316}, mo48634m = "invokeSuspend")
/* compiled from: TransferViewModel.kt */
public final class TransferViewModel$sendTransfer$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ rc2<Double, r37> $errorCallBack;
    public final /* synthetic */ IToken $iToken;
    public int label;
    public final /* synthetic */ TransferViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransferViewModel$sendTransfer$1$1", mo48632f = "TransferViewModel.kt", mo48633l = {320, 324, 325, 329}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$sendTransfer$1$1 */
    /* compiled from: TransferViewModel.kt */
    public static final class C88761 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88761(transferViewModel, rc2, iToken, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88761) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:47:0x00c0 A[Catch:{ Exception -> 0x010c }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1 A[Catch:{ Exception -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00cd A[Catch:{ Exception -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00d3 A[Catch:{ Exception -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea A[Catch:{ Exception -> 0x010c }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00eb A[Catch:{ Exception -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5 A[Catch:{ Exception -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00f6 A[Catch:{ Exception -> 0x010c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r14.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L_0x0049
                if (r1 == r5) goto L_0x0041
                if (r1 == r4) goto L_0x003d
                if (r1 == r3) goto L_0x002a
                if (r1 != r2) goto L_0x0022
                java.lang.Object r0 = r14.L$1
                net.safemoon.androidwallet.viewmodels.TransferViewModel$b r0 = (net.safemoon.androidwallet.viewmodels.TransferViewModel.C8863b) r0
                java.lang.Object r1 = r14.L$0
                net.safemoon.androidwallet.viewmodels.TransferViewModel r1 = (net.safemoon.androidwallet.viewmodels.TransferViewModel) r1
                p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x010c }
                goto L_0x00ed
            L_0x0022:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x002a:
                java.lang.Object r1 = r14.L$2
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r14.L$1
                net.safemoon.androidwallet.model.token.abstraction.IToken r3 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r3
                java.lang.Object r4 = r14.L$0
                net.safemoon.androidwallet.viewmodels.TransferViewModel r4 = (net.safemoon.androidwallet.viewmodels.TransferViewModel) r4
                p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x010c }
                r9 = r1
                r1 = r4
                goto L_0x00c4
            L_0x003d:
                p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x010c }
                goto L_0x00a4
            L_0x0041:
                java.lang.Object r1 = r14.L$0
                java.lang.Double r1 = (java.lang.Double) r1
                p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x010c }
                goto L_0x006e
            L_0x0049:
                p000.hg5.m45199b(r15)
                net.safemoon.androidwallet.viewmodels.TransferViewModel r15 = r3     // Catch:{ Exception -> 0x010c }
                net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer r15 = r15.mo61766o()     // Catch:{ Exception -> 0x010c }
                if (r15 == 0) goto L_0x005a
                java.lang.Double r15 = r15.mo61864l()     // Catch:{ Exception -> 0x010c }
                r1 = r15
                goto L_0x005b
            L_0x005a:
                r1 = r6
            L_0x005b:
                net.safemoon.androidwallet.viewmodels.TransferViewModel r15 = r3     // Catch:{ Exception -> 0x010c }
                net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer r15 = r15.mo61766o()     // Catch:{ Exception -> 0x010c }
                if (r15 == 0) goto L_0x0071
                r14.L$0 = r1     // Catch:{ Exception -> 0x010c }
                r14.label = r5     // Catch:{ Exception -> 0x010c }
                java.lang.Object r15 = r15.mo61855b(r14)     // Catch:{ Exception -> 0x010c }
                if (r15 != r0) goto L_0x006e
                return r0
            L_0x006e:
                java.lang.Double r15 = (java.lang.Double) r15     // Catch:{ Exception -> 0x010c }
                goto L_0x0072
            L_0x0071:
                r15 = r6
            L_0x0072:
                if (r1 == 0) goto L_0x0106
                if (r15 == 0) goto L_0x0106
                double r7 = r1.doubleValue()     // Catch:{ Exception -> 0x010c }
                double r9 = r15.doubleValue()     // Catch:{ Exception -> 0x010c }
                int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r1 < 0) goto L_0x0106
                net.safemoon.androidwallet.viewmodels.TransferViewModel r1 = r3     // Catch:{ Exception -> 0x010c }
                net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer r1 = r1.mo61766o()     // Catch:{ Exception -> 0x010c }
                if (r1 == 0) goto L_0x0091
                double r7 = r15.doubleValue()     // Catch:{ Exception -> 0x010c }
                r1.mo61854a(r7)     // Catch:{ Exception -> 0x010c }
            L_0x0091:
                net.safemoon.androidwallet.viewmodels.TransferViewModel r15 = r3     // Catch:{ Exception -> 0x010c }
                net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer r15 = r15.mo61766o()     // Catch:{ Exception -> 0x010c }
                if (r15 == 0) goto L_0x00a8
                r14.L$0 = r6     // Catch:{ Exception -> 0x010c }
                r14.label = r4     // Catch:{ Exception -> 0x010c }
                java.lang.Object r15 = r15.mo61872t(r14)     // Catch:{ Exception -> 0x010c }
                if (r15 != r0) goto L_0x00a4
                return r0
            L_0x00a4:
                java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x010c }
                r1 = r15
                goto L_0x00a9
            L_0x00a8:
                r1 = r6
            L_0x00a9:
                p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x010c }
                net.safemoon.androidwallet.viewmodels.TransferViewModel r15 = r3     // Catch:{ Exception -> 0x010c }
                net.safemoon.androidwallet.model.token.abstraction.IToken r4 = r5     // Catch:{ Exception -> 0x010c }
                r7 = 20000(0x4e20, double:9.8813E-320)
                r14.L$0 = r15     // Catch:{ Exception -> 0x010c }
                r14.L$1 = r4     // Catch:{ Exception -> 0x010c }
                r14.L$2 = r1     // Catch:{ Exception -> 0x010c }
                r14.label = r3     // Catch:{ Exception -> 0x010c }
                java.lang.Object r3 = p000.jb1.m59336a(r7, r14)     // Catch:{ Exception -> 0x010c }
                if (r3 != r0) goto L_0x00c1
                return r0
            L_0x00c1:
                r9 = r1
                r3 = r4
                r1 = r15
            L_0x00c4:
                net.safemoon.androidwallet.viewmodels.TransferViewModel$b r15 = new net.safemoon.androidwallet.viewmodels.TransferViewModel$b     // Catch:{ Exception -> 0x010c }
                r8 = 1
                net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer r4 = r1.mo61766o()     // Catch:{ Exception -> 0x010c }
                if (r4 == 0) goto L_0x00d3
                java.lang.Double r4 = r4.mo61862i()     // Catch:{ Exception -> 0x010c }
                r10 = r4
                goto L_0x00d4
            L_0x00d3:
                r10 = r6
            L_0x00d4:
                r11 = 0
                r12 = 8
                r13 = 0
                r7 = r15
                r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x010c }
                r14.L$0 = r1     // Catch:{ Exception -> 0x010c }
                r14.L$1 = r15     // Catch:{ Exception -> 0x010c }
                r14.L$2 = r6     // Catch:{ Exception -> 0x010c }
                r14.label = r2     // Catch:{ Exception -> 0x010c }
                java.lang.Object r2 = r1.mo61770s(r3, r15, r14)     // Catch:{ Exception -> 0x010c }
                if (r2 != r0) goto L_0x00eb
                return r0
            L_0x00eb:
                r0 = r15
                r15 = r2
            L_0x00ed:
                java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ Exception -> 0x010c }
                boolean r15 = r15.booleanValue()     // Catch:{ Exception -> 0x010c }
                if (r15 == 0) goto L_0x00f6
                goto L_0x00f7
            L_0x00f6:
                r5 = 0
            L_0x00f7:
                java.lang.Boolean r15 = p000.a40.m31670a(r5)     // Catch:{ Exception -> 0x010c }
                r0.mo61779d(r15)     // Catch:{ Exception -> 0x010c }
                k04 r15 = r1.mo61767p()     // Catch:{ Exception -> 0x010c }
                r15.postValue(r0)     // Catch:{ Exception -> 0x010c }
                goto L_0x0122
            L_0x0106:
                rc2<java.lang.Double, r37> r0 = r4     // Catch:{ Exception -> 0x010c }
                r0.invoke(r15)     // Catch:{ Exception -> 0x010c }
                goto L_0x0122
            L_0x010c:
                net.safemoon.androidwallet.viewmodels.TransferViewModel r15 = r3
                k04 r15 = r15.mo61767p()
                net.safemoon.androidwallet.viewmodels.TransferViewModel$b r7 = new net.safemoon.androidwallet.viewmodels.TransferViewModel$b
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 12
                r6 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r15.postValue(r7)
            L_0x0122:
                r37 r15 = p000.r37.f33317a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.TransferViewModel$sendTransfer$1.C88761.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferViewModel$sendTransfer$1(TransferViewModel transferViewModel, rc2<? super Double, r37> rc2, IToken iToken, ns0<? super TransferViewModel$sendTransfer$1> ns0) {
        super(2, ns0);
        this.this$0 = transferViewModel;
        this.$errorCallBack = rc2;
        this.$iToken = iToken;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TransferViewModel$sendTransfer$1(this.this$0, this.$errorCallBack, this.$iToken, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TransferViewModel$sendTransfer$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final TransferViewModel transferViewModel = this.this$0;
            final rc2<Double, r37> rc2 = this.$errorCallBack;
            final IToken iToken = this.$iToken;
            C88761 r1 = new C88761((ns0<? super C88761>) null);
            this.label = 1;
            if (b50.m55768e(b, r1, this) == d) {
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
