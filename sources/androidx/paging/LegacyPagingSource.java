package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;
import p000.dl4;
import p000.y11;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\"J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J-\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006#"}, mo44877d2 = {"Landroidx/paging/LegacyPagingSource;", "", "Key", "Value", "Ldl4;", "", "pageSize", "Lr37;", "k", "Ldl4$a;", "params", "Ldl4$b;", "f", "(Ldl4$a;Lns0;)Ljava/lang/Object;", "Lfl4;", "state", "d", "(Lfl4;)Ljava/lang/Object;", "j", "c", "I", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetchDispatcher", "", "b", "()Z", "jumpingSupported", "Ly11;", "dataSource", "Ly11;", "i", "()Ly11;", "e", "a", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: LegacyPagingSource.kt */
public final class LegacyPagingSource<Key, Value> extends dl4<Key, Value> {

    /* renamed from: e */
    public static final C1150a f6138e = new C1150a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public int f6139c;

    /* renamed from: d */
    public final CoroutineDispatcher f6140d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Landroidx/paging/LegacyPagingSource$a;", "", "", "PAGE_SIZE_NOT_SET", "I", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.LegacyPagingSource$a */
    /* compiled from: LegacyPagingSource.kt */
    public static final class C1150a {
        public C1150a() {
        }

        public /* synthetic */ C1150a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public boolean mo8654b() {
        throw null;
    }

    /* renamed from: d */
    public Key mo8655d(fl4<Key, Value> fl4) {
        vx2.m53591g(fl4, "state");
        throw null;
    }

    /* renamed from: f */
    public Object mo8656f(dl4.C2171a<Key> aVar, ns0<? super dl4.C2176b<Key, Value>> ns0) {
        LoadType loadType;
        if (aVar instanceof dl4.C2171a.C2175d) {
            loadType = LoadType.REFRESH;
        } else if (aVar instanceof dl4.C2171a.C2172a) {
            loadType = LoadType.APPEND;
        } else if (aVar instanceof dl4.C2171a.C2174c) {
            loadType = LoadType.PREPEND;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        LoadType loadType2 = loadType;
        if (this.f6139c == Integer.MIN_VALUE) {
            System.out.println("WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.f6139c = mo8658j(aVar);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new y11.C3652b(loadType2, aVar.mo18814a(), aVar.mo18815b(), aVar.mo18816c(), this.f6139c);
        return b50.m55768e(this.f6140d, new LegacyPagingSource$load$2(this, ref$ObjectRef, aVar, (ns0) null), ns0);
    }

    /* renamed from: i */
    public final y11<Key, Value> mo8657i() {
        return null;
    }

    /* renamed from: j */
    public final int mo8658j(dl4.C2171a<Key> aVar) {
        if (!(aVar instanceof dl4.C2171a.C2175d) || aVar.mo18815b() % 3 != 0) {
            return aVar.mo18815b();
        }
        return aVar.mo18815b() / 3;
    }

    /* renamed from: k */
    public final void mo8659k(int i) {
        boolean z;
        int i2 = this.f6139c;
        if (i2 == Integer.MIN_VALUE || i == i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f6139c = i;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.f6139c + '.').toString());
    }
}
