package net.safemoon.androidwallet.repository.dataSource.collection;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$fetchAttributes$1", mo48632f = "AttributeDataSource.kt", mo48633l = {22}, mo48634m = "invokeSuspend")
/* compiled from: AttributeDataSource.kt */
public final class AttributeDataSource$fetchAttributes$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ AttributeDataSource this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$fetchAttributes$1$1", mo48632f = "AttributeDataSource.kt", mo48633l = {25, 29, 32, 33}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$fetchAttributes$1$1 */
    /* compiled from: AttributeDataSource.kt */
    public static final class C86151 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86151(attributeDataSource, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86151) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc A[Catch:{ Exception -> 0x002f }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd A[Catch:{ Exception -> 0x002f }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00ca A[RETURN] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r11.label
                r2 = 4
                r3 = 3
                r4 = 1
                r5 = 2
                r6 = 0
                if (r1 == 0) goto L_0x0046
                if (r1 == r4) goto L_0x003e
                if (r1 == r5) goto L_0x0032
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                p000.hg5.m45199b(r12)     // Catch:{ Exception -> 0x002f }
                goto L_0x00dc
            L_0x001a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0022:
                java.lang.Object r1 = r11.L$1
                net.safemoon.androidwallet.model.collectible.RoomNFT r1 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r1
                java.lang.Object r3 = r11.L$0
                net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r3 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r3
                p000.hg5.m45199b(r12)     // Catch:{ Exception -> 0x002f }
                goto L_0x00be
            L_0x002f:
                r12 = move-exception
                goto L_0x00cb
            L_0x0032:
                java.lang.Object r1 = r11.L$1
                net.safemoon.androidwallet.model.collectible.RoomNFT r1 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r1
                java.lang.Object r4 = r11.L$0
                net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r4 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r4
                p000.hg5.m45199b(r12)     // Catch:{ Exception -> 0x00dc }
                goto L_0x0097
            L_0x003e:
                java.lang.Object r1 = r11.L$0
                net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r1 = (net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource) r1
                p000.hg5.m45199b(r12)
                goto L_0x0070
            L_0x0046:
                p000.hg5.m45199b(r12)
                net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$m r12 = net.safemoon.androidwallet.database.room.ApplicationRoomDatabase.f41664p
                net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource r1 = r3
                android.content.Context r1 = r1.mo60786b()
                net.safemoon.androidwallet.database.room.ApplicationRoomDatabase r12 = net.safemoon.androidwallet.database.room.ApplicationRoomDatabase.C8270m.m65847c(r12, r1, r6, r5, r6)
                net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource r1 = r3
                net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r7 = new net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource
                o64 r12 = r12.mo57115W()
                r7.<init>(r12)
                long r8 = r1.mo60787c()
                r11.L$0 = r7
                r11.label = r4
                java.lang.Object r12 = r7.mo60806g(r8, r11)
                if (r12 != r0) goto L_0x006f
                return r0
            L_0x006f:
                r1 = r7
            L_0x0070:
                net.safemoon.androidwallet.model.collectible.RoomNFT r12 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r12
                java.lang.String r4 = r12.getToken_uri()
                if (r4 == 0) goto L_0x00dc
                java.lang.String r4 = p000.db6.m56794c(r4)
                if (r4 == 0) goto L_0x00dc
                jl1 r7 = p000.C9384u3.m72570k()     // Catch:{ Exception -> 0x00dc }
                k90 r4 = r7.mo52740c(r4)     // Catch:{ Exception -> 0x00dc }
                r11.L$0 = r1     // Catch:{ Exception -> 0x00dc }
                r11.L$1 = r12     // Catch:{ Exception -> 0x00dc }
                r11.label = r5     // Catch:{ Exception -> 0x00dc }
                java.lang.Object r4 = retrofit2.KotlinExtensions.m71521c(r4, r11)     // Catch:{ Exception -> 0x00dc }
                if (r4 != r0) goto L_0x0093
                return r0
            L_0x0093:
                r10 = r1
                r1 = r12
                r12 = r4
                r4 = r10
            L_0x0097:
                bg5 r12 = (p000.bg5) r12     // Catch:{ Exception -> 0x00dc }
                boolean r5 = r12.mo50581e()     // Catch:{ Exception -> 0x00dc }
                if (r5 == 0) goto L_0x00dc
                java.lang.Object r5 = r12.mo50578a()     // Catch:{ Exception -> 0x00dc }
                if (r5 == 0) goto L_0x00dc
                net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$Companion r5 = net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource.f42537c     // Catch:{ Exception -> 0x002f }
                java.lang.Object r12 = r12.mo50578a()     // Catch:{ Exception -> 0x002f }
                p000.vx2.m53588d(r12)     // Catch:{ Exception -> 0x002f }
                java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x002f }
                r11.L$0 = r4     // Catch:{ Exception -> 0x002f }
                r11.L$1 = r1     // Catch:{ Exception -> 0x002f }
                r11.label = r3     // Catch:{ Exception -> 0x002f }
                java.lang.Object r12 = r5.mo60789b(r1, r12, r11)     // Catch:{ Exception -> 0x002f }
                if (r12 != r0) goto L_0x00bd
                return r0
            L_0x00bd:
                r3 = r4
            L_0x00be:
                r11.L$0 = r6     // Catch:{ Exception -> 0x002f }
                r11.L$1 = r6     // Catch:{ Exception -> 0x002f }
                r11.label = r2     // Catch:{ Exception -> 0x002f }
                java.lang.Object r12 = r3.mo60810k(r1, r11)     // Catch:{ Exception -> 0x002f }
                if (r12 != r0) goto L_0x00dc
                return r0
            L_0x00cb:
                java.lang.String r0 = r12.getLocalizedMessage()     // Catch:{ Exception -> 0x00dc }
                if (r0 != 0) goto L_0x00d2
                goto L_0x00d3
            L_0x00d2:
                r12 = r0
            L_0x00d3:
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x00dc }
                java.lang.String r0 = "fetchAttributes()"
                p000.ol0.m70350b0(r12, r0)     // Catch:{ Exception -> 0x00dc }
            L_0x00dc:
                r37 r12 = p000.r37.f33317a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$fetchAttributes$1.C86151.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttributeDataSource$fetchAttributes$1(AttributeDataSource attributeDataSource, ns0<? super AttributeDataSource$fetchAttributes$1> ns0) {
        super(2, ns0);
        this.this$0 = attributeDataSource;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AttributeDataSource$fetchAttributes$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((AttributeDataSource$fetchAttributes$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final AttributeDataSource attributeDataSource = this.this$0;
            C86151 r1 = new C86151((ns0<? super C86151>) null);
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
