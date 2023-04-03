package net.safemoon.androidwallet.repository;

import android.app.Application;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.swap.Swap;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0012\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR#\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b \u0010!R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010#\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/TokenListDataSource;", "", "", "chainId", "", "Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "g", "(Ljava/lang/Integer;Lns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/swap/Swap;", "f", "(Lns0;)Ljava/lang/Object;", "Landroid/app/Application;", "a", "Landroid/app/Application;", "c", "()Landroid/app/Application;", "application", "Lz57;", "b", "Lef3;", "h", "()Lz57;", "userTokenDAO", "Lon2;", "()Lon2;", "allTokenRepo", "Lxy0;", "d", "()Lxy0;", "customTokenDataSource", "Lho3;", "kotlin.jvm.PlatformType", "e", "()Lho3;", "marketClient", "Ljava/util/List;", "cacheSwapList", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TokenListDataSource.kt */
public final class TokenListDataSource {

    /* renamed from: a */
    public final Application f42524a;

    /* renamed from: b */
    public final ef3 f42525b = C6169a.m47232a(new TokenListDataSource$userTokenDAO$2(this));

    /* renamed from: c */
    public final ef3 f42526c = C6169a.m47232a(new TokenListDataSource$allTokenRepo$2(this));

    /* renamed from: d */
    public final ef3 f42527d = C6169a.m47232a(new TokenListDataSource$customTokenDataSource$2(this));

    /* renamed from: e */
    public final ef3 f42528e = C6169a.m47232a(TokenListDataSource$marketClient$2.INSTANCE);

    /* renamed from: f */
    public List<? extends Swap> f42529f;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.repository.TokenListDataSource$1", mo48632f = "TokenListDataSource.kt", mo48633l = {36}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.repository.TokenListDataSource$1 */
    /* compiled from: TokenListDataSource.kt */
    public static final class C86111 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;
        public final /* synthetic */ TokenListDataSource this$0;

        {
            this.this$0 = r1;
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86111(this.this$0, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86111) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                CoroutineDispatcher b = qh1.m71265b();
                final TokenListDataSource tokenListDataSource = this.this$0;
                C86121 r1 = new fd2<hu0, ns0<? super r37>, Object>((ns0<? super C86121>) null) {
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        return 

                        public TokenListDataSource(Application application) {
                            vx2.m53591g(application, "application");
                            this.f42524a = application;
                            y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new C86111(this, (ns0<? super C86111>) null), 3, (Object) null);
                        }

                        /* renamed from: b */
                        public final on2 mo60758b() {
                            return (on2) this.f42526c.getValue();
                        }

                        /* renamed from: c */
                        public final Application mo60759c() {
                            return this.f42524a;
                        }

                        /* renamed from: d */
                        public final xy0 mo60760d() {
                            return (xy0) this.f42527d.getValue();
                        }

                        /* renamed from: e */
                        public final ho3 mo60761e() {
                            return (ho3) this.f42528e.getValue();
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                        /* renamed from: f */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo60762f(p000.ns0<? super java.util.List<? extends net.safemoon.androidwallet.model.swap.Swap>> r5) {
                            /*
                                r4 = this;
                                boolean r0 = r5 instanceof net.safemoon.androidwallet.repository.TokenListDataSource$getSwapTokens$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r5
                                net.safemoon.androidwallet.repository.TokenListDataSource$getSwapTokens$1 r0 = (net.safemoon.androidwallet.repository.TokenListDataSource$getSwapTokens$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                net.safemoon.androidwallet.repository.TokenListDataSource$getSwapTokens$1 r0 = new net.safemoon.androidwallet.repository.TokenListDataSource$getSwapTokens$1
                                r0.<init>(r4, r5)
                            L_0x0018:
                                java.lang.Object r5 = r0.result
                                java.lang.Object r1 = p000.wx2.m54101d()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x0039
                                if (r2 != r3) goto L_0x0031
                                java.lang.Object r1 = r0.L$1
                                net.safemoon.androidwallet.repository.TokenListDataSource r1 = (net.safemoon.androidwallet.repository.TokenListDataSource) r1
                                java.lang.Object r0 = r0.L$0
                                net.safemoon.androidwallet.repository.TokenListDataSource r0 = (net.safemoon.androidwallet.repository.TokenListDataSource) r0
                                p000.hg5.m45199b(r5)     // Catch:{ Exception -> 0x0082 }
                                goto L_0x0061
                            L_0x0031:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r0)
                                throw r5
                            L_0x0039:
                                p000.hg5.m45199b(r5)
                                java.util.List<? extends net.safemoon.androidwallet.model.swap.Swap> r5 = r4.f42529f     // Catch:{ Exception -> 0x0082 }
                                r2 = 0
                                if (r5 == 0) goto L_0x0048
                                boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x0082 }
                                if (r5 != 0) goto L_0x0048
                                r2 = r3
                            L_0x0048:
                                if (r2 != 0) goto L_0x007e
                                ho3 r5 = r4.mo60761e()     // Catch:{ Exception -> 0x0082 }
                                k90 r5 = r5.mo52289r()     // Catch:{ Exception -> 0x0082 }
                                r0.L$0 = r4     // Catch:{ Exception -> 0x0082 }
                                r0.L$1 = r4     // Catch:{ Exception -> 0x0082 }
                                r0.label = r3     // Catch:{ Exception -> 0x0082 }
                                java.lang.Object r5 = retrofit2.KotlinExtensions.m71521c(r5, r0)     // Catch:{ Exception -> 0x0082 }
                                if (r5 != r1) goto L_0x005f
                                return r1
                            L_0x005f:
                                r0 = r4
                                r1 = r0
                            L_0x0061:
                                bg5 r5 = (p000.bg5) r5     // Catch:{ Exception -> 0x0082 }
                                java.lang.Object r5 = r5.mo50578a()     // Catch:{ Exception -> 0x0082 }
                                net.safemoon.androidwallet.model.swap.AllSwapTokens r5 = (net.safemoon.androidwallet.model.swap.AllSwapTokens) r5     // Catch:{ Exception -> 0x0082 }
                                if (r5 == 0) goto L_0x0077
                                net.safemoon.androidwallet.model.swap.Data r5 = r5.getData()     // Catch:{ Exception -> 0x0082 }
                                if (r5 == 0) goto L_0x0077
                                java.util.List r5 = r5.getTokens()     // Catch:{ Exception -> 0x0082 }
                                if (r5 != 0) goto L_0x007b
                            L_0x0077:
                                java.util.List r5 = p000.ck0.m33062j()     // Catch:{ Exception -> 0x0082 }
                            L_0x007b:
                                r1.f42529f = r5     // Catch:{ Exception -> 0x0082 }
                                goto L_0x007f
                            L_0x007e:
                                r0 = r4
                            L_0x007f:
                                java.util.List<? extends net.safemoon.androidwallet.model.swap.Swap> r5 = r0.f42529f     // Catch:{ Exception -> 0x0082 }
                                goto L_0x0086
                            L_0x0082:
                                java.util.List r5 = p000.ck0.m33062j()
                            L_0x0086:
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.TokenListDataSource.mo60762f(ns0):java.lang.Object");
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.Integer} */
                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: java.lang.Integer} */
                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: java.lang.Integer} */
                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.String} */
                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.lang.String} */
                        /* JADX WARNING: Multi-variable type inference failed */
                        /* JADX WARNING: Removed duplicated region for block: B:101:0x02da  */
                        /* JADX WARNING: Removed duplicated region for block: B:102:0x02dc  */
                        /* JADX WARNING: Removed duplicated region for block: B:108:0x02f8  */
                        /* JADX WARNING: Removed duplicated region for block: B:123:0x0347  */
                        /* JADX WARNING: Removed duplicated region for block: B:135:0x03cf  */
                        /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
                        /* JADX WARNING: Removed duplicated region for block: B:26:0x00b8  */
                        /* JADX WARNING: Removed duplicated region for block: B:54:0x0154  */
                        /* JADX WARNING: Removed duplicated region for block: B:55:0x0163  */
                        /* JADX WARNING: Removed duplicated region for block: B:58:0x016b  */
                        /* JADX WARNING: Removed duplicated region for block: B:80:0x0211  */
                        /* JADX WARNING: Removed duplicated region for block: B:81:0x0222  */
                        /* JADX WARNING: Removed duplicated region for block: B:84:0x0232  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
                        /* JADX WARNING: Removed duplicated region for block: B:91:0x025d  */
                        /* renamed from: g */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo60763g(java.lang.Integer r29, p000.ns0<? super java.util.List<net.safemoon.androidwallet.model.priceAlert.PAToken>> r30) {
                            /*
                                r28 = this;
                                r0 = r28
                                r1 = r30
                                boolean r2 = r1 instanceof net.safemoon.androidwallet.repository.TokenListDataSource$getTokenListOfApp$1
                                if (r2 == 0) goto L_0x0017
                                r2 = r1
                                net.safemoon.androidwallet.repository.TokenListDataSource$getTokenListOfApp$1 r2 = (net.safemoon.androidwallet.repository.TokenListDataSource$getTokenListOfApp$1) r2
                                int r3 = r2.label
                                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                r5 = r3 & r4
                                if (r5 == 0) goto L_0x0017
                                int r3 = r3 - r4
                                r2.label = r3
                                goto L_0x001c
                            L_0x0017:
                                net.safemoon.androidwallet.repository.TokenListDataSource$getTokenListOfApp$1 r2 = new net.safemoon.androidwallet.repository.TokenListDataSource$getTokenListOfApp$1
                                r2.<init>(r0, r1)
                            L_0x001c:
                                java.lang.Object r1 = r2.result
                                java.lang.Object r3 = p000.wx2.m54101d()
                                int r4 = r2.label
                                r5 = 5
                                r6 = 4
                                r7 = 3
                                java.lang.String r8 = "drawable"
                                r9 = 2
                                r10 = 1
                                r11 = 0
                                if (r4 == 0) goto L_0x009a
                                if (r4 == r10) goto L_0x0085
                                if (r4 == r9) goto L_0x0068
                                if (r4 == r7) goto L_0x005b
                                if (r4 == r6) goto L_0x004e
                                if (r4 != r5) goto L_0x0046
                                java.lang.Object r3 = r2.L$1
                                java.util.List r3 = (java.util.List) r3
                                java.lang.Object r2 = r2.L$0
                                net.safemoon.androidwallet.repository.TokenListDataSource r2 = (net.safemoon.androidwallet.repository.TokenListDataSource) r2
                                p000.hg5.m45199b(r1)
                                r6 = 0
                                goto L_0x033b
                            L_0x0046:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r1
                            L_0x004e:
                                java.lang.Object r3 = r2.L$1
                                java.util.List r3 = (java.util.List) r3
                                java.lang.Object r2 = r2.L$0
                                net.safemoon.androidwallet.repository.TokenListDataSource r2 = (net.safemoon.androidwallet.repository.TokenListDataSource) r2
                                p000.hg5.m45199b(r1)
                                goto L_0x031c
                            L_0x005b:
                                java.lang.Object r3 = r2.L$1
                                java.util.List r3 = (java.util.List) r3
                                java.lang.Object r2 = r2.L$0
                                net.safemoon.androidwallet.repository.TokenListDataSource r2 = (net.safemoon.androidwallet.repository.TokenListDataSource) r2
                                p000.hg5.m45199b(r1)
                                goto L_0x02f4
                            L_0x0068:
                                int r4 = r2.I$1
                                int r13 = r2.I$0
                                java.lang.Object r14 = r2.L$3
                                net.safemoon.androidwallet.common.TokenType[] r14 = (net.safemoon.androidwallet.common.TokenType[]) r14
                                java.lang.Object r15 = r2.L$2
                                java.util.List r15 = (java.util.List) r15
                                java.lang.Object r5 = r2.L$1
                                java.lang.Integer r5 = (java.lang.Integer) r5
                                java.lang.Object r6 = r2.L$0
                                net.safemoon.androidwallet.repository.TokenListDataSource r6 = (net.safemoon.androidwallet.repository.TokenListDataSource) r6
                                p000.hg5.m45199b(r1)
                                r0 = r2
                                r2 = r6
                                r10 = r9
                                r7 = r11
                                goto L_0x0251
                            L_0x0085:
                                java.lang.Object r4 = r2.L$2
                                java.util.List r4 = (java.util.List) r4
                                java.lang.Object r5 = r2.L$1
                                java.lang.Integer r5 = (java.lang.Integer) r5
                                java.lang.Object r6 = r2.L$0
                                net.safemoon.androidwallet.repository.TokenListDataSource r6 = (net.safemoon.androidwallet.repository.TokenListDataSource) r6
                                p000.hg5.m45199b(r1)
                                r27 = r5
                                r5 = r1
                                r1 = r27
                                goto L_0x00b4
                            L_0x009a:
                                p000.hg5.m45199b(r1)
                                java.util.ArrayList r4 = new java.util.ArrayList
                                r4.<init>()
                                r2.L$0 = r0
                                r1 = r29
                                r2.L$1 = r1
                                r2.L$2 = r4
                                r2.label = r10
                                java.lang.Object r5 = r0.mo60762f(r2)
                                if (r5 != r3) goto L_0x00b3
                                return r3
                            L_0x00b3:
                                r6 = r0
                            L_0x00b4:
                                java.util.List r5 = (java.util.List) r5
                                if (r5 == 0) goto L_0x0152
                                java.util.ArrayList r13 = new java.util.ArrayList
                                r13.<init>()
                                java.util.Iterator r5 = r5.iterator()
                            L_0x00c1:
                                boolean r14 = r5.hasNext()
                                if (r14 == 0) goto L_0x00e2
                                java.lang.Object r14 = r5.next()
                                r15 = r14
                                net.safemoon.androidwallet.model.swap.Swap r15 = (net.safemoon.androidwallet.model.swap.Swap) r15
                                if (r1 == 0) goto L_0x00db
                                java.lang.Integer r15 = r15.chainId
                                boolean r15 = p000.vx2.m53586b(r15, r1)
                                if (r15 == 0) goto L_0x00d9
                                goto L_0x00db
                            L_0x00d9:
                                r15 = r11
                                goto L_0x00dc
                            L_0x00db:
                                r15 = r10
                            L_0x00dc:
                                if (r15 == 0) goto L_0x00c1
                                r13.add(r14)
                                goto L_0x00c1
                            L_0x00e2:
                                java.util.Iterator r5 = r13.iterator()
                            L_0x00e6:
                                boolean r13 = r5.hasNext()
                                if (r13 == 0) goto L_0x0152
                                java.lang.Object r13 = r5.next()
                                net.safemoon.androidwallet.model.swap.Swap r13 = (net.safemoon.androidwallet.model.swap.Swap) r13
                                java.lang.String r14 = r13.cmcId
                                java.lang.String r15 = "cmcId"
                                if (r14 == 0) goto L_0x0100
                                p000.vx2.m53590f(r14, r15)
                                java.lang.Integer r14 = p000.xb6.m73916n(r14)
                                goto L_0x0101
                            L_0x0100:
                                r14 = 0
                            L_0x0101:
                                java.lang.String r7 = r13.logoURI
                                android.app.Application r9 = r6.f42524a
                                java.lang.String r12 = r13.symbol
                                if (r14 == 0) goto L_0x010e
                                java.lang.String r14 = r14.toString()
                                goto L_0x010f
                            L_0x010e:
                                r14 = 0
                            L_0x010f:
                                java.lang.Object r22 = p000.ol0.m70381w(r9, r11, r7, r12, r14)
                                java.lang.Integer r7 = r13.chainId
                                java.lang.String r9 = r13.name
                                java.lang.String r12 = r13.address
                                java.lang.String r14 = r13.cmcId
                                if (r14 == 0) goto L_0x0127
                                p000.vx2.m53590f(r14, r15)
                                java.lang.Integer r14 = p000.xb6.m73916n(r14)
                                r21 = r14
                                goto L_0x0129
                            L_0x0127:
                                r21 = 0
                            L_0x0129:
                                java.lang.String r13 = r13.symbol
                                net.safemoon.androidwallet.model.priceAlert.PAToken r14 = new net.safemoon.androidwallet.model.priceAlert.PAToken
                                java.lang.String r15 = "chainId"
                                p000.vx2.m53590f(r7, r15)
                                int r17 = r7.intValue()
                                java.lang.String r7 = "name"
                                p000.vx2.m53590f(r9, r7)
                                r23 = 0
                                r24 = 64
                                r25 = 0
                                r16 = r14
                                r18 = r9
                                r19 = r13
                                r20 = r12
                                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
                                r4.add(r14)
                                r7 = 3
                                r9 = 2
                                goto L_0x00e6
                            L_0x0152:
                                if (r1 == 0) goto L_0x0163
                                net.safemoon.androidwallet.common.TokenType[] r5 = new net.safemoon.androidwallet.common.TokenType[r10]
                                net.safemoon.androidwallet.common.TokenType$a r7 = net.safemoon.androidwallet.common.TokenType.Companion
                                int r9 = r1.intValue()
                                net.safemoon.androidwallet.common.TokenType r7 = r7.mo57099b(r9)
                                r5[r11] = r7
                                goto L_0x0167
                            L_0x0163:
                                net.safemoon.androidwallet.common.TokenType[] r5 = net.safemoon.androidwallet.common.TokenType.values()
                            L_0x0167:
                                int r7 = r5.length
                                r9 = r11
                            L_0x0169:
                                if (r9 >= r7) goto L_0x020f
                                r12 = r5[r9]
                                on2 r13 = r6.mo60758b()
                                java.util.List r12 = r13.mo51655a(r12)
                                java.util.ArrayList r13 = new java.util.ArrayList
                                r13.<init>()
                                java.util.Iterator r12 = r12.iterator()
                            L_0x017e:
                                boolean r14 = r12.hasNext()
                                if (r14 == 0) goto L_0x01a2
                                java.lang.Object r14 = r12.next()
                                r15 = r14
                                net.safemoon.androidwallet.model.token.abstraction.IToken r15 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r15
                                int r15 = r15.getChainId()
                                if (r1 != 0) goto L_0x0192
                                goto L_0x019a
                            L_0x0192:
                                int r11 = r1.intValue()
                                if (r15 != r11) goto L_0x019a
                                r11 = r10
                                goto L_0x019b
                            L_0x019a:
                                r11 = 0
                            L_0x019b:
                                if (r11 == 0) goto L_0x01a0
                                r13.add(r14)
                            L_0x01a0:
                                r11 = 0
                                goto L_0x017e
                            L_0x01a2:
                                java.util.Iterator r11 = r13.iterator()
                            L_0x01a6:
                                boolean r12 = r11.hasNext()
                                if (r12 == 0) goto L_0x0207
                                java.lang.Object r12 = r11.next()
                                net.safemoon.androidwallet.model.token.abstraction.IToken r12 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r12
                                android.app.Application r13 = r6.f42524a
                                android.content.res.Resources r13 = r13.getResources()
                                java.lang.String r14 = r12.getIconResName()
                                android.app.Application r15 = r6.f42524a
                                java.lang.String r15 = r15.getPackageName()
                                int r13 = r13.getIdentifier(r14, r8, r15)
                                int r18 = r12.getChainId()
                                java.lang.String r19 = r12.getName()
                                java.lang.String r21 = r12.getContractAddress()
                                java.lang.String r14 = r12.getContractAddress()
                                java.lang.String r15 = r12.getSymbol()
                                r0 = 0
                                r10 = 2
                                java.lang.String r14 = p000.q70.m71187c(r14, r15, r0, r10, r0)
                                if (r14 == 0) goto L_0x01e9
                                java.lang.Integer r0 = p000.xb6.m73916n(r14)
                                r22 = r0
                                goto L_0x01eb
                            L_0x01e9:
                                r22 = 0
                            L_0x01eb:
                                java.lang.String r20 = r12.getSymbol()
                                net.safemoon.androidwallet.model.priceAlert.PAToken r0 = new net.safemoon.androidwallet.model.priceAlert.PAToken
                                java.lang.Integer r23 = p000.a40.m31673d(r13)
                                r24 = 0
                                r25 = 64
                                r26 = 0
                                r17 = r0
                                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
                                r4.add(r0)
                                r0 = r28
                                r10 = 1
                                goto L_0x01a6
                            L_0x0207:
                                int r9 = r9 + 1
                                r0 = r28
                                r10 = 1
                                r11 = 0
                                goto L_0x0169
                            L_0x020f:
                                if (r1 == 0) goto L_0x0222
                                r0 = 1
                                net.safemoon.androidwallet.common.TokenType[] r5 = new net.safemoon.androidwallet.common.TokenType[r0]
                                net.safemoon.androidwallet.common.TokenType$a r0 = net.safemoon.androidwallet.common.TokenType.Companion
                                int r7 = r1.intValue()
                                net.safemoon.androidwallet.common.TokenType r0 = r0.mo57099b(r7)
                                r7 = 0
                                r5[r7] = r0
                                goto L_0x0227
                            L_0x0222:
                                r7 = 0
                                net.safemoon.androidwallet.common.TokenType[] r5 = net.safemoon.androidwallet.common.TokenType.values()
                            L_0x0227:
                                int r0 = r5.length
                                r14 = r5
                                r13 = r7
                                r5 = r1
                                r1 = r3
                                r3 = r4
                                r4 = r0
                                r0 = r2
                                r2 = r6
                            L_0x0230:
                                if (r13 >= r4) goto L_0x02da
                                r6 = r14[r13]
                                xy0 r9 = r2.mo60760d()
                                r0.L$0 = r2
                                r0.L$1 = r5
                                r0.L$2 = r3
                                r0.L$3 = r14
                                r0.I$0 = r13
                                r0.I$1 = r4
                                r10 = 2
                                r0.label = r10
                                java.lang.Object r6 = r9.mo66976b(r6, r0)
                                if (r6 != r1) goto L_0x024e
                                return r1
                            L_0x024e:
                                r15 = r3
                                r3 = r1
                                r1 = r6
                            L_0x0251:
                                java.lang.Iterable r1 = (java.lang.Iterable) r1
                                java.util.Iterator r1 = r1.iterator()
                            L_0x0257:
                                boolean r6 = r1.hasNext()
                                if (r6 == 0) goto L_0x02d3
                                java.lang.Object r6 = r1.next()
                                net.safemoon.androidwallet.model.token.room.RoomCustomToken r6 = (net.safemoon.androidwallet.model.token.room.RoomCustomToken) r6
                                java.lang.String r9 = r6.getContractAddress()
                                java.lang.String r11 = r6.getSymbol()
                                java.lang.String r12 = r6.getIconResName()
                                java.lang.Integer r12 = p000.xb6.m73916n(r12)
                                java.lang.String r9 = p000.q70.m71186b(r9, r11, r12)
                                java.lang.String r11 = r6.getIconResName()
                                java.lang.Integer r11 = p000.xb6.m73916n(r11)
                                if (r11 != 0) goto L_0x0296
                                android.app.Application r11 = r2.f42524a
                                android.content.res.Resources r11 = r11.getResources()
                                java.lang.String r12 = r6.getIconResName()
                                android.app.Application r7 = r2.f42524a
                                java.lang.String r7 = r7.getPackageName()
                                int r7 = r11.getIdentifier(r12, r8, r7)
                                goto L_0x0297
                            L_0x0296:
                                r7 = 0
                            L_0x0297:
                                java.lang.String r11 = r6.getIconResName()
                                android.app.Application r12 = r2.f42524a
                                java.lang.String r10 = r6.getSymbol()
                                java.lang.Object r23 = p000.ol0.m70381w(r12, r7, r11, r10, r9)
                                int r18 = r6.getChainId()
                                java.lang.String r19 = r6.getName()
                                java.lang.String r21 = r6.getContractAddress()
                                if (r9 == 0) goto L_0x02ba
                                java.lang.Integer r7 = p000.xb6.m73916n(r9)
                                r22 = r7
                                goto L_0x02bc
                            L_0x02ba:
                                r22 = 0
                            L_0x02bc:
                                java.lang.String r20 = r6.getSymbol()
                                net.safemoon.androidwallet.model.priceAlert.PAToken r6 = new net.safemoon.androidwallet.model.priceAlert.PAToken
                                r24 = 0
                                r25 = 64
                                r26 = 0
                                r17 = r6
                                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
                                r15.add(r6)
                                r7 = 0
                                r10 = 2
                                goto L_0x0257
                            L_0x02d3:
                                r6 = 1
                                int r13 = r13 + r6
                                r1 = r3
                                r3 = r15
                                r7 = 0
                                goto L_0x0230
                            L_0x02da:
                                if (r5 != 0) goto L_0x02f8
                                z57 r4 = r2.mo60764h()
                                r0.L$0 = r2
                                r0.L$1 = r3
                                r5 = 0
                                r0.L$2 = r5
                                r0.L$3 = r5
                                r5 = 3
                                r0.label = r5
                                java.lang.Object r0 = r4.mo50089p(r0)
                                if (r0 != r1) goto L_0x02f3
                                return r1
                            L_0x02f3:
                                r1 = r0
                            L_0x02f4:
                                java.util.List r1 = (java.util.List) r1
                            L_0x02f6:
                                r6 = 0
                                goto L_0x033d
                            L_0x02f8:
                                net.safemoon.androidwallet.common.TokenType r4 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN
                                int r4 = r4.getChainId()
                                int r6 = r5.intValue()
                                if (r6 != r4) goto L_0x031f
                                z57 r4 = r2.mo60764h()
                                r0.L$0 = r2
                                r0.L$1 = r3
                                r5 = 0
                                r0.L$2 = r5
                                r0.L$3 = r5
                                r5 = 4
                                r0.label = r5
                                java.lang.Object r0 = r4.mo50084k(r0)
                                if (r0 != r1) goto L_0x031b
                                return r1
                            L_0x031b:
                                r1 = r0
                            L_0x031c:
                                java.util.List r1 = (java.util.List) r1
                                goto L_0x02f6
                            L_0x031f:
                                z57 r4 = r2.mo60764h()
                                int r5 = r5.intValue()
                                r0.L$0 = r2
                                r0.L$1 = r3
                                r6 = 0
                                r0.L$2 = r6
                                r0.L$3 = r6
                                r7 = 5
                                r0.label = r7
                                java.lang.Object r0 = r4.mo50080g(r5, r0)
                                if (r0 != r1) goto L_0x033a
                                return r1
                            L_0x033a:
                                r1 = r0
                            L_0x033b:
                                java.util.List r1 = (java.util.List) r1
                            L_0x033d:
                                java.util.Iterator r0 = r1.iterator()
                            L_0x0341:
                                boolean r1 = r0.hasNext()
                                if (r1 == 0) goto L_0x03bb
                                java.lang.Object r1 = r0.next()
                                net.safemoon.androidwallet.model.token.room.RoomToken r1 = (net.safemoon.androidwallet.model.token.room.RoomToken) r1
                                java.lang.String r4 = r1.getContractAddress()
                                java.lang.String r5 = r1.getSymbol()
                                java.lang.String r7 = r1.getIconResName()
                                java.lang.Integer r7 = p000.xb6.m73916n(r7)
                                java.lang.String r4 = p000.q70.m71186b(r4, r5, r7)
                                java.lang.String r5 = r1.getIconResName()
                                java.lang.Integer r5 = p000.xb6.m73916n(r5)
                                if (r5 != 0) goto L_0x0380
                                android.app.Application r5 = r2.f42524a
                                android.content.res.Resources r5 = r5.getResources()
                                java.lang.String r7 = r1.getIconResName()
                                android.app.Application r9 = r2.f42524a
                                java.lang.String r9 = r9.getPackageName()
                                int r5 = r5.getIdentifier(r7, r8, r9)
                                goto L_0x0381
                            L_0x0380:
                                r5 = 0
                            L_0x0381:
                                java.lang.String r7 = r1.getIconResName()
                                android.app.Application r9 = r2.f42524a
                                java.lang.String r10 = r1.getSymbol()
                                java.lang.Object r23 = p000.ol0.m70381w(r9, r5, r7, r10, r4)
                                int r18 = r1.getChainId()
                                java.lang.String r19 = r1.getName()
                                java.lang.String r21 = r1.getContractAddress()
                                if (r4 == 0) goto L_0x03a4
                                java.lang.Integer r4 = p000.xb6.m73916n(r4)
                                r22 = r4
                                goto L_0x03a6
                            L_0x03a4:
                                r22 = r6
                            L_0x03a6:
                                java.lang.String r20 = r1.getSymbol()
                                net.safemoon.androidwallet.model.priceAlert.PAToken r1 = new net.safemoon.androidwallet.model.priceAlert.PAToken
                                r24 = 0
                                r25 = 64
                                r26 = 0
                                r17 = r1
                                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
                                r3.add(r1)
                                goto L_0x0341
                            L_0x03bb:
                                java.util.HashSet r0 = new java.util.HashSet
                                r0.<init>()
                                java.util.ArrayList r1 = new java.util.ArrayList
                                r1.<init>()
                                java.util.Iterator r2 = r3.iterator()
                            L_0x03c9:
                                boolean r3 = r2.hasNext()
                                if (r3 == 0) goto L_0x0409
                                java.lang.Object r3 = r2.next()
                                r4 = r3
                                net.safemoon.androidwallet.model.priceAlert.PAToken r4 = (net.safemoon.androidwallet.model.priceAlert.PAToken) r4
                                kotlin.Pair r5 = new kotlin.Pair
                                java.lang.String r7 = r4.getContractAddress()
                                java.lang.String r8 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                                if (r7 == 0) goto L_0x03ea
                                java.util.Locale r9 = java.util.Locale.ROOT
                                java.lang.String r7 = r7.toLowerCase(r9)
                                p000.vx2.m53590f(r7, r8)
                                goto L_0x03eb
                            L_0x03ea:
                                r7 = r6
                            L_0x03eb:
                                java.lang.String r4 = r4.getSymbol()
                                if (r4 == 0) goto L_0x03fb
                                java.util.Locale r9 = java.util.Locale.ROOT
                                java.lang.String r4 = r4.toLowerCase(r9)
                                p000.vx2.m53590f(r4, r8)
                                goto L_0x03fc
                            L_0x03fb:
                                r4 = r6
                            L_0x03fc:
                                r5.<init>(r7, r4)
                                boolean r4 = r0.add(r5)
                                if (r4 == 0) goto L_0x03c9
                                r1.add(r3)
                                goto L_0x03c9
                            L_0x0409:
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.TokenListDataSource.mo60763g(java.lang.Integer, ns0):java.lang.Object");
                        }

                        /* renamed from: h */
                        public final z57 mo60764h() {
                            return (z57) this.f42525b.getValue();
                        }
                    }
