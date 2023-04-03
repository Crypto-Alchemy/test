package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\f"}, mo44877d2 = {"Lhy4;", "T", "Ldo0;", "value", "Ljy4;", "c", "(Ljava/lang/Object;)Ljy4;", "d", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lpc2;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: hy4 */
/* compiled from: CompositionLocal.kt */
public abstract class hy4<T> extends do0<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hy4(pc2<? extends T> pc2) {
        super(pc2, (DefaultConstructorMarker) null);
        vx2.m53591g(pc2, "defaultFactory");
    }

    /* renamed from: c */
    public final jy4<T> mo21417c(T t) {
        return new jy4<>(this, t, true);
    }

    /* renamed from: d */
    public final jy4<T> mo21418d(T t) {
        return new jy4<>(this, t, false);
    }
}
