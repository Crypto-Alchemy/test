package androidx.paging;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a`\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022.\u0010\u000e\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000b\"\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo44877d2 = {"T", "R", "Lz42;", "initial", "Lkotlin/Function3;", "Lns0;", "", "operation", "c", "(Lz42;Ljava/lang/Object;Lid2;)Lz42;", "b", "(Lz42;Lid2;)Lz42;", "La52;", "Lr37;", "transform", "d", "a", "Ljava/lang/Object;", "NULL", "paging-common"}, mo44878k = 2, mo44879mv = {1, 4, 2})
/* compiled from: FlowExt.kt */
public final class FlowExtKt {

    /* renamed from: a */
    public static final Object f6131a = new Object();

    /* renamed from: b */
    public static final <T> z42<T> m8410b(z42<? extends T> z42, id2<? super T, ? super T, ? super ns0<? super T>, ? extends Object> id2) {
        vx2.m53591g(z42, "$this$simpleRunningReduce");
        vx2.m53591g(id2, "operation");
        return e52.m57228t(new FlowExtKt$simpleRunningReduce$1(z42, id2, (ns0) null));
    }

    /* renamed from: c */
    public static final <T, R> z42<R> m8411c(z42<? extends T> z42, R r, id2<? super R, ? super T, ? super ns0<? super R>, ? extends Object> id2) {
        vx2.m53591g(z42, "$this$simpleScan");
        vx2.m53591g(id2, "operation");
        return e52.m57228t(new FlowExtKt$simpleScan$1(z42, r, id2, (ns0) null));
    }

    /* renamed from: d */
    public static final <T, R> z42<R> m8412d(z42<? extends T> z42, id2<? super a52<? super R>, ? super T, ? super ns0<? super r37>, ? extends Object> id2) {
        vx2.m53591g(z42, "$this$simpleTransformLatest");
        vx2.m53591g(id2, "transform");
        return SimpleChannelFlowKt.m8542a(new FlowExtKt$simpleTransformLatest$1(z42, id2, (ns0) null));
    }
}
