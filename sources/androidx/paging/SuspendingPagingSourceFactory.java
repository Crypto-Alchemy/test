package androidx.paging;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004J\u001f\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo44877d2 = {"Landroidx/paging/SuspendingPagingSourceFactory;", "", "Key", "Value", "Lkotlin/Function0;", "Ldl4;", "b", "(Lns0;)Ljava/lang/Object;", "c", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "d", "Lpc2;", "delegate", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: SuspendingPagingSourceFactory.kt */
public final class SuspendingPagingSourceFactory<Key, Value> implements pc2<dl4<Key, Value>> {

    /* renamed from: a */
    public final CoroutineDispatcher f6243a;

    /* renamed from: d */
    public final pc2<dl4<Key, Value>> f6244d;

    /* renamed from: b */
    public final Object mo8758b(ns0<? super dl4<Key, Value>> ns0) {
        return b50.m55768e(this.f6243a, new SuspendingPagingSourceFactory$create$2(this, (ns0) null), ns0);
    }

    /* renamed from: c */
    public dl4<Key, Value> invoke() {
        return this.f6244d.invoke();
    }
}
