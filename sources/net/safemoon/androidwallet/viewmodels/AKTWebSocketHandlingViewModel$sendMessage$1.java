package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel$sendMessage$1", mo48632f = "AKTWebSocketHandlingViewModel.kt", mo48633l = {49}, mo48634m = "invokeSuspend")
/* compiled from: AKTWebSocketHandlingViewModel.kt */
public final class AKTWebSocketHandlingViewModel$sendMessage$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ String $LSON;
    public final /* synthetic */ ak7 $webClient;
    public int label;
    public final /* synthetic */ AKTWebSocketHandlingViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel$sendMessage$1$1", mo48632f = "AKTWebSocketHandlingViewModel.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel$sendMessage$1$1 */
    /* compiled from: AKTWebSocketHandlingViewModel.kt */
    public static final class C86381 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86381(ak7, str, aKTWebSocketHandlingViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86381) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                ak7 ak7 = ak7;
                String str = str;
                AKTWebSocketHandlingViewModel aKTWebSocketHandlingViewModel = aKTWebSocketHandlingViewModel;
                if (ak7.mo50229L()) {
                    ak7.mo50239V(str);
                } else {
                    aKTWebSocketHandlingViewModel.mo60955k();
                    aKTWebSocketHandlingViewModel.f42603b = new AKTWebSocketHandlingViewModel$sendMessage$1$1$1$1(aKTWebSocketHandlingViewModel, ak7, str);
                }
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTWebSocketHandlingViewModel$sendMessage$1(ak7 ak7, String str, AKTWebSocketHandlingViewModel aKTWebSocketHandlingViewModel, ns0<? super AKTWebSocketHandlingViewModel$sendMessage$1> ns0) {
        super(2, ns0);
        this.$webClient = ak7;
        this.$LSON = str;
        this.this$0 = aKTWebSocketHandlingViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AKTWebSocketHandlingViewModel$sendMessage$1(this.$webClient, this.$LSON, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((AKTWebSocketHandlingViewModel$sendMessage$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final ak7 ak7 = this.$webClient;
            final String str = this.$LSON;
            final AKTWebSocketHandlingViewModel aKTWebSocketHandlingViewModel = this.this$0;
            C86381 r1 = new C86381((ns0<? super C86381>) null);
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
