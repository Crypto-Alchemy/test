package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel$loadTokens$1", mo48632f = "AddNewTokensViewModel.kt", mo48633l = {43}, mo48634m = "invokeSuspend")
/* compiled from: AddNewTokensViewModel.kt */
public final class AddNewTokensViewModel$loadTokens$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ AddNewTokensViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel$loadTokens$1$1", mo48632f = "AddNewTokensViewModel.kt", mo48633l = {45, 52, 66}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel$loadTokens$1$1 */
    /* compiled from: AddNewTokensViewModel.kt */
    public static final class C86391 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86391(addNewTokensViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86391) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x0129 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x015d A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x01de A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4 A[Catch:{ Exception -> 0x0150 }] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0126 A[Catch:{ Exception -> 0x0150 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0139 A[Catch:{ Exception -> 0x0150 }, LOOP:2: B:56:0x0133->B:58:0x0139, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0163  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01e4  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x022d  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0244  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x025d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x025e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r6 = 0
                r7 = 1
                java.lang.String r8 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                if (r2 == 0) goto L_0x003e
                if (r2 == r7) goto L_0x0034
                if (r2 == r4) goto L_0x0029
                if (r2 != r3) goto L_0x0021
                java.lang.Object r1 = r0.L$0
                k04 r1 = (p000.k04) r1
                p000.hg5.m45199b(r18)
                r3 = r18
                goto L_0x025f
            L_0x0021:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0029:
                java.lang.Object r2 = r0.L$0
                java.util.List r2 = (java.util.List) r2
                p000.hg5.m45199b(r18)     // Catch:{ Exception -> 0x0151 }
                r9 = r2
                r2 = r18
                goto L_0x009d
            L_0x0034:
                java.lang.Object r2 = r0.L$0
                androidx.lifecycle.LiveData r2 = (androidx.lifecycle.LiveData) r2
                p000.hg5.m45199b(r18)
                r9 = r18
                goto L_0x006a
            L_0x003e:
                p000.hg5.m45199b(r18)
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r2 = r3
                on2 r2 = r2.f42608a
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r9 = r3
                net.safemoon.androidwallet.common.TokenType r9 = r9.f42614g
                java.lang.String r10 = ""
                androidx.lifecycle.LiveData r2 = r2.mo51656b(r9, r10)
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r9 = r3
                xy0 r9 = r9.f42611d
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r10 = r3
                net.safemoon.androidwallet.common.TokenType r10 = r10.f42614g
                r0.L$0 = r2
                r0.label = r7
                java.lang.Object r9 = r9.mo66976b(r10, r0)
                if (r9 != r1) goto L_0x006a
                return r1
            L_0x006a:
                java.util.List r9 = (java.util.List) r9
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r10 = r3
                java.util.List r10 = r10.f42616i
                r10.clear()
                java.lang.Object r2 = r2.getValue()
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L_0x008a
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r10 = r3
                java.util.List r10 = r10.f42616i
                boolean r2 = r10.addAll(r2)
                p000.a40.m31670a(r2)
            L_0x008a:
                ho3 r2 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x0150 }
                k90 r2 = r2.mo52289r()     // Catch:{ Exception -> 0x0150 }
                r0.L$0 = r9     // Catch:{ Exception -> 0x0150 }
                r0.label = r4     // Catch:{ Exception -> 0x0150 }
                java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r0)     // Catch:{ Exception -> 0x0150 }
                if (r2 != r1) goto L_0x009d
                return r1
            L_0x009d:
                bg5 r2 = (p000.bg5) r2     // Catch:{ Exception -> 0x0150 }
                java.lang.Object r2 = r2.mo50578a()     // Catch:{ Exception -> 0x0150 }
                net.safemoon.androidwallet.model.swap.AllSwapTokens r2 = (net.safemoon.androidwallet.model.swap.AllSwapTokens) r2     // Catch:{ Exception -> 0x0150 }
                if (r2 == 0) goto L_0x0152
                net.safemoon.androidwallet.model.swap.Data r2 = r2.getData()     // Catch:{ Exception -> 0x0150 }
                if (r2 == 0) goto L_0x0152
                java.util.List r2 = r2.getTokens()     // Catch:{ Exception -> 0x0150 }
                if (r2 == 0) goto L_0x0152
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r10 = r3     // Catch:{ Exception -> 0x0150 }
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x0150 }
                r11.<init>()     // Catch:{ Exception -> 0x0150 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0150 }
            L_0x00be:
                boolean r12 = r2.hasNext()     // Catch:{ Exception -> 0x0150 }
                if (r12 == 0) goto L_0x012d
                java.lang.Object r12 = r2.next()     // Catch:{ Exception -> 0x0150 }
                r13 = r12
                net.safemoon.androidwallet.model.swap.Swap r13 = (net.safemoon.androidwallet.model.swap.Swap) r13     // Catch:{ Exception -> 0x0150 }
                net.safemoon.androidwallet.common.TokenType r14 = r10.f42614g     // Catch:{ Exception -> 0x0150 }
                int r14 = r14.getChainId()     // Catch:{ Exception -> 0x0150 }
                java.lang.Integer r15 = r13.chainId     // Catch:{ Exception -> 0x0150 }
                if (r15 != 0) goto L_0x00d8
                goto L_0x0123
            L_0x00d8:
                int r15 = r15.intValue()     // Catch:{ Exception -> 0x0150 }
                if (r14 != r15) goto L_0x0123
                java.util.List r14 = r10.f42616i     // Catch:{ Exception -> 0x0150 }
                java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x0150 }
            L_0x00e6:
                boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x0150 }
                if (r15 == 0) goto L_0x011e
                java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x0150 }
                r16 = r15
                net.safemoon.androidwallet.model.token.abstraction.IToken r16 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r16     // Catch:{ Exception -> 0x0150 }
                java.lang.String r7 = r16.getContractAddress()     // Catch:{ Exception -> 0x0150 }
                java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x0150 }
                java.lang.String r7 = r7.toLowerCase(r3)     // Catch:{ Exception -> 0x0150 }
                p000.vx2.m53590f(r7, r8)     // Catch:{ Exception -> 0x0150 }
                java.lang.String r4 = r13.address     // Catch:{ Exception -> 0x0150 }
                if (r4 == 0) goto L_0x0112
                java.lang.String r5 = "address"
                p000.vx2.m53590f(r4, r5)     // Catch:{ Exception -> 0x0150 }
                java.lang.String r3 = r4.toLowerCase(r3)     // Catch:{ Exception -> 0x0150 }
                p000.vx2.m53590f(r3, r8)     // Catch:{ Exception -> 0x0150 }
                goto L_0x0113
            L_0x0112:
                r3 = 0
            L_0x0113:
                boolean r3 = p000.vx2.m53586b(r7, r3)     // Catch:{ Exception -> 0x0150 }
                if (r3 == 0) goto L_0x011a
                goto L_0x011f
            L_0x011a:
                r3 = 3
                r4 = 2
                r7 = 1
                goto L_0x00e6
            L_0x011e:
                r15 = 0
            L_0x011f:
                if (r15 != 0) goto L_0x0123
                r3 = 1
                goto L_0x0124
            L_0x0123:
                r3 = r6
            L_0x0124:
                if (r3 == 0) goto L_0x0129
                r11.add(r12)     // Catch:{ Exception -> 0x0150 }
            L_0x0129:
                r3 = 3
                r4 = 2
                r7 = 1
                goto L_0x00be
            L_0x012d:
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r2 = r3     // Catch:{ Exception -> 0x0150 }
                java.util.Iterator r3 = r11.iterator()     // Catch:{ Exception -> 0x0150 }
            L_0x0133:
                boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0150 }
                if (r4 == 0) goto L_0x0152
                java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0150 }
                net.safemoon.androidwallet.model.swap.Swap r4 = (net.safemoon.androidwallet.model.swap.Swap) r4     // Catch:{ Exception -> 0x0150 }
                java.util.List r5 = r2.f42616i     // Catch:{ Exception -> 0x0150 }
                net.safemoon.androidwallet.model.token.abstraction.IToken r4 = r4.toIToken()     // Catch:{ Exception -> 0x0150 }
                java.lang.String r7 = "it.toIToken()"
                p000.vx2.m53590f(r4, r7)     // Catch:{ Exception -> 0x0150 }
                r5.add(r4)     // Catch:{ Exception -> 0x0150 }
                goto L_0x0133
            L_0x0150:
                r2 = r9
            L_0x0151:
                r9 = r2
            L_0x0152:
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r2 = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r4 = r9.iterator()
            L_0x015d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x01b8
                java.lang.Object r5 = r4.next()
                r7 = r5
                net.safemoon.androidwallet.model.token.room.RoomCustomToken r7 = (net.safemoon.androidwallet.model.token.room.RoomCustomToken) r7
                net.safemoon.androidwallet.common.TokenType r9 = r2.f42614g
                int r9 = r9.getChainId()
                int r10 = r7.getChainId()
                if (r9 != r10) goto L_0x01b1
                java.util.List r9 = r2.f42616i
                java.util.Iterator r9 = r9.iterator()
            L_0x0180:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x01ac
                java.lang.Object r10 = r9.next()
                r11 = r10
                net.safemoon.androidwallet.model.token.abstraction.IToken r11 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r11
                java.lang.String r11 = r11.getContractAddress()
                java.util.Locale r12 = java.util.Locale.ROOT
                java.lang.String r11 = r11.toLowerCase(r12)
                p000.vx2.m53590f(r11, r8)
                java.lang.String r13 = r7.getContractAddress()
                java.lang.String r12 = r13.toLowerCase(r12)
                p000.vx2.m53590f(r12, r8)
                boolean r11 = p000.vx2.m53586b(r11, r12)
                if (r11 == 0) goto L_0x0180
                goto L_0x01ad
            L_0x01ac:
                r10 = 0
            L_0x01ad:
                if (r10 != 0) goto L_0x01b1
                r7 = 1
                goto L_0x01b2
            L_0x01b1:
                r7 = r6
            L_0x01b2:
                if (r7 == 0) goto L_0x015d
                r3.add(r5)
                goto L_0x015d
            L_0x01b8:
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r2 = r3
                java.util.List r2 = r2.f42616i
                r2.addAll(r3)
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r2 = r3
                k04 r2 = r2.mo60964k()
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r3 = r3
                yo2 r3 = r3.f42609b
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r4 = r3
                java.util.List r4 = r4.f42616i
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r5 = r3
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x01de:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x0231
                java.lang.Object r9 = r4.next()
                r10 = r9
                net.safemoon.androidwallet.model.token.abstraction.IToken r10 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r10
                java.lang.String r11 = r10.getSymbol()
                java.util.Locale r12 = java.util.Locale.ROOT
                java.lang.String r11 = r11.toLowerCase(r12)
                p000.vx2.m53590f(r11, r8)
                java.lang.String r13 = r5.f42613f
                java.lang.String r13 = r13.toLowerCase(r12)
                p000.vx2.m53590f(r13, r8)
                r14 = 2
                r15 = 0
                boolean r11 = kotlin.text.StringsKt__StringsKt.m63081R(r11, r13, r6, r14, r15)
                if (r11 != 0) goto L_0x022a
                java.lang.String r10 = r10.getName()
                java.lang.String r10 = r10.toLowerCase(r12)
                p000.vx2.m53590f(r10, r8)
                java.lang.String r11 = r5.f42613f
                java.lang.String r11 = r11.toLowerCase(r12)
                p000.vx2.m53590f(r11, r8)
                boolean r10 = kotlin.text.StringsKt__StringsKt.m63081R(r10, r11, r6, r14, r15)
                if (r10 == 0) goto L_0x0228
                goto L_0x022a
            L_0x0228:
                r10 = r6
                goto L_0x022b
            L_0x022a:
                r10 = 1
            L_0x022b:
                if (r10 == 0) goto L_0x01de
                r7.add(r9)
                goto L_0x01de
            L_0x0231:
                java.util.List r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47311K0(r7)
                k04 r5 = new k04
                r5.<init>(r4)
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r4 = r3
                java.lang.Object r6 = r5.getValue()
                java.util.List r6 = (java.util.List) r6
                if (r6 != 0) goto L_0x0249
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
            L_0x0249:
                r4.f42615h = r6
                net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r4 = r3
                net.safemoon.androidwallet.common.TokenType r4 = r4.f42614g
                r0.L$0 = r2
                r6 = 3
                r0.label = r6
                java.lang.Object r3 = r3.mo58178a(r5, r4, r0)
                if (r3 != r1) goto L_0x025e
                return r1
            L_0x025e:
                r1 = r2
            L_0x025f:
                androidx.lifecycle.LiveData r3 = (androidx.lifecycle.LiveData) r3
                java.lang.Object r2 = r3.getValue()
                r1.postValue(r2)
                r37 r1 = p000.r37.f33317a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel$loadTokens$1.C86391.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddNewTokensViewModel$loadTokens$1(AddNewTokensViewModel addNewTokensViewModel, ns0<? super AddNewTokensViewModel$loadTokens$1> ns0) {
        super(2, ns0);
        this.this$0 = addNewTokensViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AddNewTokensViewModel$loadTokens$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((AddNewTokensViewModel$loadTokens$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final AddNewTokensViewModel addNewTokensViewModel = this.this$0;
            C86391 r1 = new C86391((ns0<? super C86391>) null);
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
