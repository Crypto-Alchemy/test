package net.safemoon.androidwallet.provider;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.provider.TokenInfoExistProvider$getTokenInfoForSlug$1", mo48632f = "TokenInfoExistProvider.kt", mo48633l = {23}, mo48634m = "invokeSuspend")
/* compiled from: TokenInfoExistProvider.kt */
public final class TokenInfoExistProvider$getTokenInfoForSlug$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Integer $cmcId;
    public final /* synthetic */ k04<String> $slugLiveData;
    public int label;
    public final /* synthetic */ TokenInfoExistProvider this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.provider.TokenInfoExistProvider$getTokenInfoForSlug$1$1", mo48632f = "TokenInfoExistProvider.kt", mo48633l = {25, 27, 29, 33}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.provider.TokenInfoExistProvider$getTokenInfoForSlug$1$1 */
    /* compiled from: TokenInfoExistProvider.kt */
    public static final class C86071 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86071(tokenInfoExistProvider, num, k04, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86071) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[Catch:{ Exception -> 0x00e2 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[Catch:{ Exception -> 0x00e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ab A[Catch:{ Exception -> 0x00e2 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r14.label
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x0032
                if (r1 == r6) goto L_0x002e
                if (r1 == r5) goto L_0x002a
                if (r1 == r4) goto L_0x0022
                if (r1 != r3) goto L_0x001a
                p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x00e2 }
                goto L_0x00cf
            L_0x001a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0022:
                java.lang.Object r1 = r14.L$0
                net.safemoon.androidwallet.model.token.room.RoomCustomToken r1 = (net.safemoon.androidwallet.model.token.room.RoomCustomToken) r1
                p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x00e2 }
                goto L_0x0083
            L_0x002a:
                p000.hg5.m45199b(r15)
                goto L_0x0063
            L_0x002e:
                p000.hg5.m45199b(r15)
                goto L_0x004a
            L_0x0032:
                p000.hg5.m45199b(r15)
                net.safemoon.androidwallet.provider.TokenInfoExistProvider r15 = r3
                ir6 r15 = r15.mo60711d()
                java.lang.Integer r1 = r4
                int r1 = r1.intValue()
                r14.label = r6
                java.lang.Object r15 = r15.mo52532b(r1, r14)
                if (r15 != r0) goto L_0x004a
                return r0
            L_0x004a:
                net.safemoon.androidwallet.model.RoomTokenInfo r15 = (net.safemoon.androidwallet.model.RoomTokenInfo) r15
                if (r15 != 0) goto L_0x00d9
                net.safemoon.androidwallet.provider.TokenInfoExistProvider r15 = r3
                xy0 r15 = r15.mo60710c()
                java.lang.Integer r1 = r4
                java.lang.String r1 = r1.toString()
                r14.label = r5
                java.lang.Object r15 = r15.mo66978d(r1, r14)
                if (r15 != r0) goto L_0x0063
                return r0
            L_0x0063:
                r1 = r15
                net.safemoon.androidwallet.model.token.room.RoomCustomToken r1 = (net.safemoon.androidwallet.model.token.room.RoomCustomToken) r1
                p70 r15 = p000.C9384u3.m72566g()     // Catch:{ Exception -> 0x00e2 }
                if (r15 == 0) goto L_0x008e
                java.lang.Integer r5 = r4     // Catch:{ Exception -> 0x00e2 }
                int r5 = r5.intValue()     // Catch:{ Exception -> 0x00e2 }
                k90 r15 = r15.mo65254f(r5)     // Catch:{ Exception -> 0x00e2 }
                if (r15 == 0) goto L_0x008e
                r14.L$0 = r1     // Catch:{ Exception -> 0x00e2 }
                r14.label = r4     // Catch:{ Exception -> 0x00e2 }
                java.lang.Object r15 = retrofit2.KotlinExtensions.m71521c(r15, r14)     // Catch:{ Exception -> 0x00e2 }
                if (r15 != r0) goto L_0x0083
                return r0
            L_0x0083:
                bg5 r15 = (p000.bg5) r15     // Catch:{ Exception -> 0x00e2 }
                if (r15 == 0) goto L_0x008e
                java.lang.Object r15 = r15.mo50578a()     // Catch:{ Exception -> 0x00e2 }
                net.safemoon.androidwallet.model.cmcTokenInfo.CmcTokenInfo r15 = (net.safemoon.androidwallet.model.cmcTokenInfo.CmcTokenInfo) r15     // Catch:{ Exception -> 0x00e2 }
                goto L_0x008f
            L_0x008e:
                r15 = r2
            L_0x008f:
                if (r15 == 0) goto L_0x00e2
                java.util.List r15 = r15.getTokenDetails()     // Catch:{ Exception -> 0x00e2 }
                if (r15 == 0) goto L_0x00e2
                r4 = 0
                java.lang.Object r15 = r15.get(r4)     // Catch:{ Exception -> 0x00e2 }
                net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail r15 = (net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail) r15     // Catch:{ Exception -> 0x00e2 }
                if (r15 == 0) goto L_0x00e2
                k04<java.lang.String> r4 = r5     // Catch:{ Exception -> 0x00e2 }
                net.safemoon.androidwallet.provider.TokenInfoExistProvider r5 = r3     // Catch:{ Exception -> 0x00e2 }
                java.lang.String r6 = r15.slug     // Catch:{ Exception -> 0x00e2 }
                r4.postValue(r6)     // Catch:{ Exception -> 0x00e2 }
                if (r1 == 0) goto L_0x00e2
                ir6 r4 = r5.mo60711d()     // Catch:{ Exception -> 0x00e2 }
                net.safemoon.androidwallet.model.RoomTokenInfo r13 = new net.safemoon.androidwallet.model.RoomTokenInfo     // Catch:{ Exception -> 0x00e2 }
                r6 = 0
                java.lang.String r7 = r1.getSymbolWithType()     // Catch:{ Exception -> 0x00e2 }
                int r8 = r1.getChainId()     // Catch:{ Exception -> 0x00e2 }
                java.lang.String r9 = r15.slug     // Catch:{ Exception -> 0x00e2 }
                java.lang.Integer r10 = r15.f42452id     // Catch:{ Exception -> 0x00e2 }
                r11 = 1
                r12 = 0
                r5 = r13
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00e2 }
                r14.L$0 = r2     // Catch:{ Exception -> 0x00e2 }
                r14.label = r3     // Catch:{ Exception -> 0x00e2 }
                java.lang.Object r15 = r4.mo52531a(r13, r14)     // Catch:{ Exception -> 0x00e2 }
                if (r15 != r0) goto L_0x00cf
                return r0
            L_0x00cf:
                java.lang.Number r15 = (java.lang.Number) r15     // Catch:{ Exception -> 0x00e2 }
                long r0 = r15.longValue()     // Catch:{ Exception -> 0x00e2 }
                p000.a40.m31674e(r0)     // Catch:{ Exception -> 0x00e2 }
                goto L_0x00e2
            L_0x00d9:
                k04<java.lang.String> r0 = r5
                java.lang.String r15 = r15.getSlug()
                r0.postValue(r15)
            L_0x00e2:
                r37 r15 = p000.r37.f33317a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.provider.TokenInfoExistProvider$getTokenInfoForSlug$1.C86071.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenInfoExistProvider$getTokenInfoForSlug$1(TokenInfoExistProvider tokenInfoExistProvider, Integer num, k04<String> k04, ns0<? super TokenInfoExistProvider$getTokenInfoForSlug$1> ns0) {
        super(2, ns0);
        this.this$0 = tokenInfoExistProvider;
        this.$cmcId = num;
        this.$slugLiveData = k04;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TokenInfoExistProvider$getTokenInfoForSlug$1(this.this$0, this.$cmcId, this.$slugLiveData, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TokenInfoExistProvider$getTokenInfoForSlug$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final TokenInfoExistProvider tokenInfoExistProvider = this.this$0;
            final Integer num = this.$cmcId;
            final k04<String> k04 = this.$slugLiveData;
            C86071 r1 = new C86071((ns0<? super C86071>) null);
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
