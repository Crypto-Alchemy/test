package androidx.paging;

import androidx.paging.PagePresenter;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00018\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0019\u0012\u0006\u0010C\u001a\u00020@\u0012\b\b\u0002\u0010G\u001a\u00020D¢\u0006\u0004\bO\u0010PJO\u0010\r\u001a\u0004\u0018\u00010\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J!\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u000bJ\u001a\u0010\u001b\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0019J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u00190+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00028\u0000088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0011\u0010J\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060K8F¢\u0006\u0006\u001a\u0004\bL\u0010M\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, mo44877d2 = {"Landroidx/paging/PagingDataDiffer;", "", "T", "Lvb4;", "previousList", "newList", "Lil0;", "newCombinedLoadStates", "", "lastAccessedIndex", "Lkotlin/Function0;", "Lr37;", "onListPresentable", "w", "(Lvb4;Lvb4;Lil0;ILpc2;Lns0;)Ljava/lang/Object;", "", "v", "Lcl4;", "pagingData", "q", "(Lcl4;Lns0;)Ljava/lang/Object;", "index", "s", "(I)Ljava/lang/Object;", "x", "Lkotlin/Function1;", "listener", "p", "y", "states", "r", "Landroidx/paging/PagePresenter;", "a", "Landroidx/paging/PagePresenter;", "presenter", "Li37;", "b", "Li37;", "receiver", "Ll04;", "c", "Ll04;", "combinedLoadStates", "Ljava/util/concurrent/CopyOnWriteArrayList;", "d", "Ljava/util/concurrent/CopyOnWriteArrayList;", "loadStateListeners", "Landroidx/paging/SingleRunner;", "e", "Landroidx/paging/SingleRunner;", "collectFromRunner", "f", "Z", "lastAccessedIndexUnfulfilled", "g", "I", "androidx/paging/PagingDataDiffer$a", "h", "Landroidx/paging/PagingDataDiffer$a;", "processPageEventCallback", "Lu04;", "i", "Lu04;", "_combinedLoadState", "Lhg1;", "j", "Lhg1;", "differCallback", "Lkotlinx/coroutines/CoroutineDispatcher;", "k", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "u", "()I", "size", "Lz42;", "t", "()Lz42;", "loadStateFlow", "<init>", "(Lhg1;Lkotlinx/coroutines/CoroutineDispatcher;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: PagingDataDiffer.kt */
public abstract class PagingDataDiffer<T> {

    /* renamed from: a */
    public PagePresenter<T> f6222a = PagePresenter.f6208f.mo8728a();

    /* renamed from: b */
    public i37 f6223b;

    /* renamed from: c */
    public final l04 f6224c;

    /* renamed from: d */
    public final CopyOnWriteArrayList<rc2<il0, r37>> f6225d;

    /* renamed from: e */
    public final SingleRunner f6226e;

    /* renamed from: f */
    public volatile boolean f6227f;

    /* renamed from: g */
    public volatile int f6228g;

    /* renamed from: h */
    public final C1187a f6229h;

    /* renamed from: i */
    public final u04<il0> f6230i;

    /* renamed from: j */
    public final hg1 f6231j;

    /* renamed from: k */
    public final CoroutineDispatcher f6232k;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0010"}, mo44877d2 = {"androidx/paging/PagingDataDiffer$a", "Landroidx/paging/PagePresenter$b;", "", "position", "count", "Lr37;", "a", "onInserted", "onRemoved", "Landroidx/paging/LoadType;", "loadType", "", "fromMediator", "Lxi3;", "loadState", "b", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.PagingDataDiffer$a */
    /* compiled from: PagingDataDiffer.kt */
    public static final class C1187a implements PagePresenter.C1182b {

        /* renamed from: a */
        public final /* synthetic */ PagingDataDiffer f6233a;

        public C1187a(PagingDataDiffer pagingDataDiffer) {
            this.f6233a = pagingDataDiffer;
        }

        /* renamed from: a */
        public void mo8729a(int i, int i2) {
            this.f6233a.f6231j.mo8636a(i, i2);
        }

        /* renamed from: b */
        public void mo8730b(LoadType loadType, boolean z, xi3 xi3) {
            vx2.m53591g(loadType, "loadType");
            vx2.m53591g(xi3, "loadState");
            if (!vx2.m53586b(this.f6233a.f6224c.mo22614d(loadType, z), xi3)) {
                this.f6233a.f6224c.mo22617g(loadType, z, xi3);
                il0 h = this.f6233a.f6224c.mo22618h();
                for (rc2 invoke : this.f6233a.f6225d) {
                    invoke.invoke(h);
                }
            }
        }

        public void onInserted(int i, int i2) {
            this.f6233a.f6231j.onInserted(i, i2);
        }

        public void onRemoved(int i, int i2) {
            this.f6233a.f6231j.onRemoved(i, i2);
        }
    }

    public PagingDataDiffer(hg1 hg1, CoroutineDispatcher coroutineDispatcher) {
        vx2.m53591g(hg1, "differCallback");
        vx2.m53591g(coroutineDispatcher, "mainDispatcher");
        this.f6231j = hg1;
        this.f6232k = coroutineDispatcher;
        l04 l04 = new l04();
        this.f6224c = l04;
        this.f6225d = new CopyOnWriteArrayList<>();
        this.f6226e = new SingleRunner(false, 1, (DefaultConstructorMarker) null);
        this.f6229h = new C1187a(this);
        this.f6230i = u86.m72658a(l04.mo22618h());
        mo8745p(new rc2<il0, r37>(this) {
            public final /* synthetic */ PagingDataDiffer this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((il0) obj);
                return r37.f33317a;
            }

            public final void invoke(il0 il0) {
                vx2.m53591g(il0, "it");
                this.this$0.f6230i.setValue(il0);
            }
        });
    }

    /* renamed from: p */
    public final void mo8745p(rc2<? super il0, r37> rc2) {
        vx2.m53591g(rc2, "listener");
        this.f6225d.add(rc2);
        rc2.invoke(this.f6224c.mo22618h());
    }

    /* renamed from: q */
    public final Object mo8746q(cl4<T> cl4, ns0<? super r37> ns0) {
        Object c = SingleRunner.m8544c(this.f6226e, 0, new PagingDataDiffer$collectFrom$2(this, cl4, (ns0) null), ns0, 1, (Object) null);
        if (c == wx2.m54101d()) {
            return c;
        }
        return r37.f33317a;
    }

    /* renamed from: r */
    public final void mo8747r(il0 il0) {
        if (!vx2.m53586b(this.f6224c.mo22618h(), il0)) {
            this.f6224c.mo22615e(il0);
            for (rc2 invoke : this.f6225d) {
                invoke.invoke(il0);
            }
        }
    }

    /* renamed from: s */
    public final T mo8748s(int i) {
        this.f6227f = true;
        this.f6228g = i;
        i37 i37 = this.f6223b;
        if (i37 != null) {
            i37.mo8672b(this.f6222a.mo8715f(i));
        }
        return this.f6222a.mo8721k(i);
    }

    /* renamed from: t */
    public final z42<il0> mo8749t() {
        return this.f6230i;
    }

    /* renamed from: u */
    public final int mo8750u() {
        return this.f6222a.getSize();
    }

    /* renamed from: v */
    public abstract boolean mo8639v();

    /* renamed from: w */
    public abstract Object mo8640w(vb4<T> vb4, vb4<T> vb42, il0 il0, int i, pc2<r37> pc2, ns0<? super Integer> ns0);

    /* renamed from: x */
    public final void mo8751x() {
        i37 i37 = this.f6223b;
        if (i37 != null) {
            i37.mo8671a();
        }
    }

    /* renamed from: y */
    public final void mo8752y(rc2<? super il0, r37> rc2) {
        vx2.m53591g(rc2, "listener");
        this.f6225d.remove(rc2);
    }
}
