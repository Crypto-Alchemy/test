package net.safemoon.androidwallet.viewmodels.p021wc;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$1", mo48632f = "MultipleWalletConnect.kt", mo48633l = {166}, mo48634m = "invokeSuspend")
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$1 */
/* compiled from: MultipleWalletConnect.kt */
public final class MultipleWalletConnect$observeWithWalletConnectV2$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ MultipleWalletConnect this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$1$1", mo48632f = "MultipleWalletConnect.kt", mo48633l = {173}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$1$1 */
    /* compiled from: MultipleWalletConnect.kt */
    public static final class C89041 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Ltp0;", "it", "Lr37;", "a", "(Ljava/util/List;Lns0;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1})
        /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$1$1$a */
        /* compiled from: MultipleWalletConnect.kt */
        public static final class C8907a<T> implements a52 {

            /* renamed from: a */
            public final /* synthetic */ MultipleWalletConnect f43149a;

            public C8907a(MultipleWalletConnect multipleWalletConnect) {
                this.f43149a = multipleWalletConnect;
            }

            /* renamed from: a */
            public final Object emit(List<tp0> list, ns0<? super r37> ns0) {
                this.f43149a.f43109m = list;
                MultipleWalletConnect multipleWalletConnect = this.f43149a;
                multipleWalletConnect.mo61929w(multipleWalletConnect.f43109m);
                return r37.f33317a;
            }
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C89041(multipleWalletConnect, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C89041) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final MultipleWalletConnect multipleWalletConnect = multipleWalletConnect;
                z42 f = e52.m57214f(e52.m57228t(new fd2<a52<? super List<? extends tp0>>, ns0<? super r37>, Object>((ns0<? super C89051>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        C89051 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public MultipleWalletConnect$observeWithWalletConnectV2$1(MultipleWalletConnect multipleWalletConnect, ns0<? super MultipleWalletConnect$observeWithWalletConnectV2$1> ns0) {
                            super(2, ns0);
                            this.this$0 = multipleWalletConnect;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new MultipleWalletConnect$observeWithWalletConnectV2$1(this.this$0, ns0);
                        }

                        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                            return ((MultipleWalletConnect$observeWithWalletConnectV2$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                CoroutineDispatcher b = qh1.m71265b();
                                final MultipleWalletConnect multipleWalletConnect = this.this$0;
                                C89041 r1 = new C89041((ns0<? super C89041>) null);
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
