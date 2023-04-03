package androidx.paging;

import androidx.recyclerview.widget.C1294g;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001#\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0007\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000/\u0012\u0006\u00104\u001a\u000202\u0012\b\b\u0002\u00108\u001a\u000205\u0012\b\b\u0002\u00109\u001a\u000205¢\u0006\u0004\b<\u0010=J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\u0005J\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\rJ\u001a\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\rR \u0010\u0019\u001a\u00020\u00128\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R(\u0010\"\u001a\u00020\u001a8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\u0018\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0*8\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u00107R\u0011\u0010;\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b6\u0010:\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, mo44877d2 = {"Landroidx/paging/AsyncPagingDataDiffer;", "", "T", "Lcl4;", "pagingData", "Lr37;", "l", "(Lcl4;Lns0;)Ljava/lang/Object;", "j", "", "index", "g", "(I)Ljava/lang/Object;", "Lkotlin/Function1;", "Lil0;", "listener", "d", "k", "Lhg1;", "a", "Lhg1;", "e", "()Lhg1;", "getDifferCallback$paging_runtime_release$annotations", "()V", "differCallback", "", "b", "Z", "f", "()Z", "setInGetItem$paging_runtime_release", "(Z)V", "getInGetItem$paging_runtime_release$annotations", "inGetItem", "androidx/paging/AsyncPagingDataDiffer$differBase$1", "c", "Landroidx/paging/AsyncPagingDataDiffer$differBase$1;", "differBase", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "submitDataId", "Lz42;", "Lz42;", "i", "()Lz42;", "loadStateFlow", "Landroidx/recyclerview/widget/g$f;", "Landroidx/recyclerview/widget/g$f;", "diffCallback", "Ldi3;", "Ldi3;", "updateCallback", "Lkotlinx/coroutines/CoroutineDispatcher;", "h", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "workerDispatcher", "()I", "itemCount", "<init>", "(Landroidx/recyclerview/widget/g$f;Ldi3;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: AsyncPagingDataDiffer.kt */
public final class AsyncPagingDataDiffer<T> {

    /* renamed from: a */
    public final hg1 f6098a;

    /* renamed from: b */
    public boolean f6099b;

    /* renamed from: c */
    public final AsyncPagingDataDiffer$differBase$1 f6100c;

    /* renamed from: d */
    public final AtomicInteger f6101d = new AtomicInteger(0);

    /* renamed from: e */
    public final z42<il0> f6102e;

    /* renamed from: f */
    public final C1294g.C1300f<T> f6103f;

    /* renamed from: g */
    public final di3 f6104g;

    /* renamed from: h */
    public final CoroutineDispatcher f6105h;

    /* renamed from: i */
    public final CoroutineDispatcher f6106i;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo44877d2 = {"androidx/paging/AsyncPagingDataDiffer$a", "Lhg1;", "", "position", "count", "Lr37;", "onInserted", "onRemoved", "a", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.AsyncPagingDataDiffer$a */
    /* compiled from: AsyncPagingDataDiffer.kt */
    public static final class C1134a implements hg1 {

        /* renamed from: a */
        public final /* synthetic */ AsyncPagingDataDiffer f6107a;

        public C1134a(AsyncPagingDataDiffer asyncPagingDataDiffer) {
            this.f6107a = asyncPagingDataDiffer;
        }

        /* renamed from: a */
        public void mo8636a(int i, int i2) {
            if (i2 > 0) {
                this.f6107a.f6104g.onChanged(i, i2, (Object) null);
            }
        }

        public void onInserted(int i, int i2) {
            if (i2 > 0) {
                this.f6107a.f6104g.onInserted(i, i2);
            }
        }

        public void onRemoved(int i, int i2) {
            if (i2 > 0) {
                this.f6107a.f6104g.onRemoved(i, i2);
            }
        }
    }

    public AsyncPagingDataDiffer(C1294g.C1300f<T> fVar, di3 di3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        vx2.m53591g(fVar, "diffCallback");
        vx2.m53591g(di3, "updateCallback");
        vx2.m53591g(coroutineDispatcher, "mainDispatcher");
        vx2.m53591g(coroutineDispatcher2, "workerDispatcher");
        this.f6103f = fVar;
        this.f6104g = di3;
        this.f6105h = coroutineDispatcher;
        this.f6106i = coroutineDispatcher2;
        C1134a aVar = new C1134a(this);
        this.f6098a = aVar;
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = new AsyncPagingDataDiffer$differBase$1(this, aVar, coroutineDispatcher);
        this.f6100c = asyncPagingDataDiffer$differBase$1;
        this.f6102e = asyncPagingDataDiffer$differBase$1.mo8749t();
    }

    /* renamed from: d */
    public final void mo8627d(rc2<? super il0, r37> rc2) {
        vx2.m53591g(rc2, "listener");
        this.f6100c.mo8745p(rc2);
    }

    /* renamed from: e */
    public final hg1 mo8628e() {
        return this.f6098a;
    }

    /* renamed from: f */
    public final boolean mo8629f() {
        return this.f6099b;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public final T mo8630g(int i) {
        try {
            this.f6099b = true;
            T s = this.f6100c.mo8748s(i);
            this.f6099b = false;
            return s;
        } catch (Throwable th) {
            this.f6099b = false;
            throw th;
        }
    }

    /* renamed from: h */
    public final int mo8631h() {
        return this.f6100c.mo8750u();
    }

    /* renamed from: i */
    public final z42<il0> mo8632i() {
        return this.f6102e;
    }

    /* renamed from: j */
    public final void mo8633j() {
        this.f6100c.mo8751x();
    }

    /* renamed from: k */
    public final void mo8634k(rc2<? super il0, r37> rc2) {
        vx2.m53591g(rc2, "listener");
        this.f6100c.mo8752y(rc2);
    }

    /* renamed from: l */
    public final Object mo8635l(cl4<T> cl4, ns0<? super r37> ns0) {
        this.f6101d.incrementAndGet();
        Object q = this.f6100c.mo8746q(cl4, ns0);
        if (q == wx2.m54101d()) {
            return q;
        }
        return r37.f33317a;
    }
}
