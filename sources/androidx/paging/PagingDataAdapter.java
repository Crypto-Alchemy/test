package androidx.paging;

import androidx.recyclerview.widget.C1271b;
import androidx.recyclerview.widget.C1294g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1231a0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import p000.xi3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B+\b\u0007\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010-\u001a\u00020+¢\u0006\u0004\b.\u0010/J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eJ!\u0010\u0013\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\bJ\u001b\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\nH\u0016J\u001a\u0010\u001c\u001a\u00020\b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0019J\u001a\u0010\u001d\u001a\u00020\b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0019R\u0016\u0010 \u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0$8\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u00060"}, mo44877d2 = {"Landroidx/paging/PagingDataAdapter;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$a0;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;", "strategy", "Lr37;", "setStateRestorationPolicy", "", "position", "", "getItemId", "", "hasStableIds", "setHasStableIds", "Lcl4;", "pagingData", "e", "(Lcl4;Lns0;)Ljava/lang/Object;", "c", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "Lkotlin/Function1;", "Lil0;", "listener", "b", "d", "a", "Z", "userSetRestorationPolicy", "Landroidx/paging/AsyncPagingDataDiffer;", "Landroidx/paging/AsyncPagingDataDiffer;", "differ", "Lz42;", "Lz42;", "getLoadStateFlow", "()Lz42;", "loadStateFlow", "Landroidx/recyclerview/widget/g$f;", "diffCallback", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "workerDispatcher", "<init>", "(Landroidx/recyclerview/widget/g$f;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: PagingDataAdapter.kt */
public abstract class PagingDataAdapter<T, VH extends RecyclerView.C1231a0> extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    public boolean f6214a;

    /* renamed from: d */
    public final AsyncPagingDataDiffer<T> f6215d;

    /* renamed from: e */
    public final z42<il0> f6216e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo44877d2 = {"androidx/paging/PagingDataAdapter$a", "Landroidx/recyclerview/widget/RecyclerView$i;", "", "positionStart", "itemCount", "Lr37;", "onItemRangeInserted", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.PagingDataAdapter$a */
    /* compiled from: PagingDataAdapter.kt */
    public static final class C1184a extends RecyclerView.C1239i {

        /* renamed from: a */
        public final /* synthetic */ PagingDataAdapter f6217a;

        /* renamed from: b */
        public final /* synthetic */ C11831 f6218b;

        public C1184a(PagingDataAdapter pagingDataAdapter, C11831 r2) {
            this.f6217a = pagingDataAdapter;
            this.f6218b = r2;
        }

        public void onItemRangeInserted(int i, int i2) {
            this.f6218b.invoke();
            this.f6217a.unregisterAdapterDataObserver(this);
            super.onItemRangeInserted(i, i2);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0002R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, mo44877d2 = {"androidx/paging/PagingDataAdapter$b", "Lkotlin/Function1;", "Lil0;", "Lr37;", "loadStates", "a", "", "Z", "ignoreNextEvent", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.PagingDataAdapter$b */
    /* compiled from: PagingDataAdapter.kt */
    public static final class C1185b implements rc2<il0, r37> {

        /* renamed from: a */
        public boolean f6219a = true;

        /* renamed from: d */
        public final /* synthetic */ PagingDataAdapter f6220d;

        /* renamed from: e */
        public final /* synthetic */ C11831 f6221e;

        public C1185b(PagingDataAdapter pagingDataAdapter, C11831 r2) {
            this.f6220d = pagingDataAdapter;
            this.f6221e = r2;
        }

        /* renamed from: a */
        public void mo8744a(il0 il0) {
            vx2.m53591g(il0, "loadStates");
            if (this.f6219a) {
                this.f6219a = false;
            } else if (il0.mo21565f().mo28084g() instanceof xi3.C3605c) {
                this.f6221e.invoke();
                this.f6220d.mo8738d(this);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo8744a((il0) obj);
            return r37.f33317a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagingDataAdapter(C1294g.C1300f fVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i & 2) != 0 ? qh1.m71266c() : coroutineDispatcher, (i & 4) != 0 ? qh1.m71264a() : coroutineDispatcher2);
    }

    /* renamed from: b */
    public final void mo8736b(rc2<? super il0, r37> rc2) {
        vx2.m53591g(rc2, "listener");
        this.f6215d.mo8627d(rc2);
    }

    /* renamed from: c */
    public final void mo8737c() {
        this.f6215d.mo8633j();
    }

    /* renamed from: d */
    public final void mo8738d(rc2<? super il0, r37> rc2) {
        vx2.m53591g(rc2, "listener");
        this.f6215d.mo8634k(rc2);
    }

    /* renamed from: e */
    public final Object mo8739e(cl4<T> cl4, ns0<? super r37> ns0) {
        Object l = this.f6215d.mo8635l(cl4, ns0);
        if (l == wx2.m54101d()) {
            return l;
        }
        return r37.f33317a;
    }

    public final T getItem(int i) {
        return this.f6215d.mo8630g(i);
    }

    public int getItemCount() {
        return this.f6215d.mo8631h();
    }

    public final long getItemId(int i) {
        return super.getItemId(i);
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    public void setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        vx2.m53591g(stateRestorationPolicy, "strategy");
        this.f6214a = true;
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    public PagingDataAdapter(C1294g.C1300f<T> fVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        vx2.m53591g(fVar, "diffCallback");
        vx2.m53591g(coroutineDispatcher, "mainDispatcher");
        vx2.m53591g(coroutineDispatcher2, "workerDispatcher");
        AsyncPagingDataDiffer<T> asyncPagingDataDiffer = new AsyncPagingDataDiffer<>(fVar, new C1271b(this), coroutineDispatcher, coroutineDispatcher2);
        this.f6215d = asyncPagingDataDiffer;
        super.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        C11831 r3 = new pc2<r37>(this) {
            public final /* synthetic */ PagingDataAdapter this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                if (this.this$0.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT && !this.this$0.f6214a) {
                    this.this$0.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
                }
            }
        };
        registerAdapterDataObserver(new C1184a(this, r3));
        mo8736b(new C1185b(this, r3));
        this.f6216e = asyncPagingDataDiffer.mo8632i();
    }
}
