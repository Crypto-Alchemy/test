package net.safemoon.androidwallet.fragments.collectibles;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$1$onResourceReady$2$1", mo48632f = "NftDetailFragment.kt", mo48633l = {239}, mo48634m = "invokeSuspend")
/* compiled from: NftDetailFragment.kt */
public final class NftDetailFragment$onViewCreated$1$onResourceReady$2$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ NftDetailFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$1$onResourceReady$2$1$1", mo48632f = "NftDetailFragment.kt", mo48633l = {241, 250}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$1$onResourceReady$2$1$1 */
    /* compiled from: NftDetailFragment.kt */
    public static final class C85431 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C85431(nftDetailFragment, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C85431) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00c9 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ca  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r11.label
                java.lang.String r2 = "requireActivity()"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 == r4) goto L_0x0027
                if (r1 != r3) goto L_0x001f
                java.lang.Object r0 = r11.L$1
                java.io.File r0 = (java.io.File) r0
                java.lang.Object r1 = r11.L$0
                java.lang.String r1 = (java.lang.String) r1
                p000.hg5.m45199b(r12)
                r3 = r0
            L_0x001c:
                r4 = r1
                goto L_0x00cd
            L_0x001f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0027:
                p000.hg5.m45199b(r12)
                goto L_0x004a
            L_0x002b:
                p000.hg5.m45199b(r12)
                net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r12 = r3
                androidx.fragment.app.FragmentActivity r12 = r12.requireActivity()
                p000.vx2.m53590f(r12, r2)
                net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r1 = r3
                net.safemoon.androidwallet.model.nft.NFTData r1 = r1.mo57996J()
                java.lang.String r1 = r1.getImageUrl()
                r11.label = r4
                java.lang.Object r12 = p000.C7258ja.m59315a(r12, r1, r11)
                if (r12 != r0) goto L_0x004a
                return r0
            L_0x004a:
                java.net.URLConnection r12 = (java.net.URLConnection) r12
                if (r12 == 0) goto L_0x0055
                java.lang.String r1 = "Content-Type"
                java.lang.String r12 = r12.getHeaderField(r1)
                goto L_0x0056
            L_0x0055:
                r12 = 0
            L_0x0056:
                r1 = r12
                android.webkit.MimeTypeMap r12 = android.webkit.MimeTypeMap.getSingleton()
                java.lang.String r12 = r12.getExtensionFromMimeType(r1)
                if (r12 != 0) goto L_0x0063
                java.lang.String r12 = ""
            L_0x0063:
                net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r4 = r3
                android.content.Context r4 = r4.requireContext()
                me5 r4 = com.bumptech.glide.C1710a.m12224t(r4)
                be5 r4 = r4.mo23154p()
                net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r5 = r3
                net.safemoon.androidwallet.model.nft.NFTData r5 = r5.mo57996J()
                java.lang.String r5 = r5.getImageUrl()
                be5 r4 = r4.mo11561S0(r5)
                he2 r4 = r4.mo11565W0()
                java.lang.Object r4 = r4.get()
                java.io.File r4 = (java.io.File) r4
                net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r5 = r3
                androidx.fragment.app.FragmentActivity r5 = r5.requireActivity()
                p000.vx2.m53590f(r5, r2)
                java.lang.String r2 = "originalFile"
                p000.vx2.m53590f(r4, r2)
                net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r2 = r3
                net.safemoon.androidwallet.model.nft.NFTData r2 = r2.mo57996J()
                java.lang.String r2 = r2.getImageUrl()
                if (r2 == 0) goto L_0x00a8
                int r2 = r2.hashCode()
                goto L_0x00a9
            L_0x00a8:
                r2 = 0
            L_0x00a9:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r2)
                java.lang.String r2 = "."
                r6.append(r2)
                r6.append(r12)
                java.lang.String r12 = r6.toString()
                r11.L$0 = r1
                r11.L$1 = r4
                r11.label = r3
                java.lang.Object r12 = p000.C7258ja.m59318d(r5, r4, r12, r11)
                if (r12 != r0) goto L_0x00ca
                return r0
            L_0x00ca:
                r3 = r4
                goto L_0x001c
            L_0x00cd:
                r2 = r12
                java.io.File r2 = (java.io.File) r2
                net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r12 = r3
                androidx.lifecycle.LifecycleCoroutineScope r12 = p000.vg3.m28804a(r12)
                r6 = 0
                r7 = 0
                net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$1$onResourceReady$2$1$1$1 r8 = new net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$1$onResourceReady$2$1$1$1
                net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r1 = r3
                r5 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r9 = 3
                r10 = 0
                r5 = r12
                p000.y23 unused = p000.d50.m56748b(r5, r6, r7, r8, r9, r10)
                r37 r12 = p000.r37.f33317a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$onViewCreated$1$onResourceReady$2$1.C85431.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NftDetailFragment$onViewCreated$1$onResourceReady$2$1(NftDetailFragment nftDetailFragment, ns0<? super NftDetailFragment$onViewCreated$1$onResourceReady$2$1> ns0) {
        super(2, ns0);
        this.this$0 = nftDetailFragment;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new NftDetailFragment$onViewCreated$1$onResourceReady$2$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((NftDetailFragment$onViewCreated$1$onResourceReady$2$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final NftDetailFragment nftDetailFragment = this.this$0;
            C85431 r1 = new C85431((ns0<? super C85431>) null);
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
