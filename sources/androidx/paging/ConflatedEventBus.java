package androidx.paging;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Landroidx/paging/ConflatedEventBus;", "", "T", "data", "Lr37;", "b", "(Ljava/lang/Object;)V", "Lu04;", "Lkotlin/Pair;", "", "a", "Lu04;", "state", "Lz42;", "Lz42;", "()Lz42;", "flow", "initialValue", "<init>", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: ConflatedEventBus.kt */
public final class ConflatedEventBus<T> {

    /* renamed from: a */
    public final u04<Pair<Integer, T>> f6122a;

    /* renamed from: b */
    public final z42<T> f6123b;

    public ConflatedEventBus(T t) {
        u04<Pair<Integer, T>> a = u86.m72658a(new Pair(Integer.MIN_VALUE, t));
        this.f6122a = a;
        this.f6123b = new ConflatedEventBus$$special$$inlined$mapNotNull$1(a);
    }

    /* renamed from: a */
    public final z42<T> mo8650a() {
        return this.f6123b;
    }

    /* renamed from: b */
    public final void mo8651b(T t) {
        vx2.m53591g(t, "data");
        u04<Pair<Integer, T>> u04 = this.f6122a;
        u04.setValue(new Pair(Integer.valueOf(((Number) u04.getValue().getFirst()).intValue() + 1), t));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConflatedEventBus(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }
}
