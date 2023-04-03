package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Key", "Value", "Lhu0;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", mo48632f = "PageFetcherSnapshot.kt", mo48633l = {212}, mo48634m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$startConsumingHints$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ PageFetcherSnapshot this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"", "Key", "Value", "Lgf7;", "it", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
    @v21(mo48631c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$2", mo48632f = "PageFetcherSnapshot.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$2 */
    /* compiled from: PageFetcherSnapshot.kt */
    public static final class C11792 extends SuspendLambda implements fd2<gf7, ns0<? super r37>, Object> {
        public int label;
        public final /* synthetic */ PageFetcherSnapshot$startConsumingHints$1 this$0;

        {
            this.this$0 = r1;
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            vx2.m53591g(ns0, "completion");
            return new C11792(this.this$0, ns0);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C11792) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                this.this$0.this$0.f6177o.invoke();
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1(PageFetcherSnapshot pageFetcherSnapshot, ns0 ns0) {
        super(2, ns0);
        this.this$0 = pageFetcherSnapshot;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new PageFetcherSnapshot$startConsumingHints$1(this.this$0, ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$startConsumingHints$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            C1172x9fc5dc78 pageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 = new C1172x9fc5dc78(this.this$0.f6163a, this);
            C11792 r5 = new C11792(this, (ns0) null);
            this.label = 1;
            if (e52.m57217i(pageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1, r5, this) == d) {
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
