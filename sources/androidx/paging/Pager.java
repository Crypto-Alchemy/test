package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u0000\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013B7\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u0000\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0014R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u0015"}, mo44877d2 = {"Landroidx/paging/Pager;", "", "Key", "Value", "Lz42;", "Lcl4;", "a", "Lz42;", "()Lz42;", "flow", "Lbl4;", "config", "initialKey", "Landroidx/paging/RemoteMediator;", "remoteMediator", "Lkotlin/Function0;", "Ldl4;", "pagingSourceFactory", "<init>", "(Lbl4;Ljava/lang/Object;Landroidx/paging/RemoteMediator;Lpc2;)V", "(Lbl4;Ljava/lang/Object;Lpc2;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: Pager.kt */
public final class Pager<Key, Value> {

    /* renamed from: a */
    public final z42<cl4<Value>> f6213a;

    public Pager(bl4 bl4, Key key, RemoteMediator<Key, Value> remoteMediator, pc2<? extends dl4<Key, Value>> pc2) {
        rc2 rc2;
        vx2.m53591g(bl4, "config");
        vx2.m53591g(pc2, "pagingSourceFactory");
        if (pc2 instanceof SuspendingPagingSourceFactory) {
            rc2 = new Pager$flow$1(pc2);
        } else {
            rc2 = new Pager$flow$2(pc2, (ns0) null);
        }
        this.f6213a = new PageFetcher(rc2, key, bl4, remoteMediator).mo8665i();
    }

    /* renamed from: a */
    public final z42<cl4<Value>> mo8734a() {
        return this.f6213a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Pager(bl4 bl4, Object obj, pc2 pc2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bl4, (i & 2) != 0 ? null : obj, pc2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Pager(bl4 bl4, Key key, pc2<? extends dl4<Key, Value>> pc2) {
        this(bl4, key, (RemoteMediator) null, pc2);
        vx2.m53591g(bl4, "config");
        vx2.m53591g(pc2, "pagingSourceFactory");
    }
}
