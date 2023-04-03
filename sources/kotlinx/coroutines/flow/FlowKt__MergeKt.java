package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\u001a9\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0004\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a`\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u000220\b\u0001\u0010\u000e\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aT\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00022$\b\u0001\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\" \u0010\u001a\u001a\u00020\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001c\u001a\u00020\u001b8\u0006XT¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, mo44877d2 = {"T", "", "Lz42;", "b", "", "flows", "c", "([Lz42;)Lz42;", "R", "Lkotlin/Function3;", "La52;", "Lns0;", "Lr37;", "", "transform", "d", "(Lz42;Lid2;)Lz42;", "Lkotlin/Function2;", "a", "(Lz42;Lfd2;)Lz42;", "", "I", "getDEFAULT_CONCURRENCY", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Merge.kt */
public final /* synthetic */ class FlowKt__MergeKt {

    /* renamed from: a */
    public static final int f40415a = dl6.m56897b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* renamed from: a */
    public static final <T, R> z42<R> m63359a(z42<? extends T> z42, fd2<? super T, ? super ns0<? super R>, ? extends Object> fd2) {
        return e52.m57207H(z42, new FlowKt__MergeKt$mapLatest$1(fd2, (ns0<? super FlowKt__MergeKt$mapLatest$1>) null));
    }

    /* renamed from: b */
    public static final <T> z42<T> m63360b(Iterable<? extends z42<? extends T>> iterable) {
        return new ChannelLimitedFlowMerge(iterable, (CoroutineContext) null, 0, (BufferOverflow) null, 14, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final <T> z42<T> m63361c(z42<? extends T>... z42Arr) {
        return e52.m57234z(ArraysKt___ArraysKt.m47243A(z42Arr));
    }

    /* renamed from: d */
    public static final <T, R> z42<R> m63362d(z42<? extends T> z42, id2<? super a52<? super R>, ? super T, ? super ns0<? super r37>, ? extends Object> id2) {
        return new ChannelFlowTransformLatest(id2, z42, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }
}
