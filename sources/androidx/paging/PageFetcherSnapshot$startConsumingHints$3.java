package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Key", "Value", "Lhu0;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", mo48632f = "PageFetcherSnapshot.kt", mo48633l = {595, 223}, mo48634m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$startConsumingHints$3 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$3(PageFetcherSnapshot pageFetcherSnapshot, ns0 ns0) {
        super(2, ns0);
        this.this$0 = pageFetcherSnapshot;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new PageFetcherSnapshot$startConsumingHints$3(this.this$0, ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$startConsumingHints$3) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        PageFetcherSnapshotState.C1180a aVar;
        y04 y04;
        PageFetcherSnapshot pageFetcherSnapshot;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            pageFetcherSnapshot = this.this$0;
            aVar = pageFetcherSnapshot.f6167e;
            y04 a = aVar.f6204a;
            this.L$0 = aVar;
            this.L$1 = a;
            this.L$2 = pageFetcherSnapshot;
            this.label = 1;
            if (a.mo55746a((Object) null, this) == d) {
                return d;
            }
            y04 = a;
        } else if (i == 1) {
            pageFetcherSnapshot = (PageFetcherSnapshot) this.L$2;
            y04 = (y04) this.L$1;
            aVar = (PageFetcherSnapshotState.C1180a) this.L$0;
            hg5.m45199b(obj);
        } else if (i == 2) {
            hg5.m45199b(obj);
            return r37.f33317a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            z42<Integer> e = aVar.f6205b.mo8693e();
            y04.mo55747b((Object) null);
            LoadType loadType = LoadType.APPEND;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (pageFetcherSnapshot.mo8679n(e, loadType, this) == d) {
                return d;
            }
            return r37.f33317a;
        } catch (Throwable th) {
            y04.mo55747b((Object) null);
            throw th;
        }
    }
}
