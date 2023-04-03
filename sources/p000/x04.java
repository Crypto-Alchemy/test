package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0004\u001a\u00020\u0003J\u001d\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Lx04;", "T", "", "Lr37;", "b", "", "index", "element", "a", "(ILjava/lang/Object;)V", "f", "(I)Ljava/lang/Object;", "c", "Lv04;", "Lv04;", "e", "()Lv04;", "vector", "Lkotlin/Function0;", "Lpc2;", "getOnVectorMutated", "()Lpc2;", "onVectorMutated", "d", "()I", "size", "<init>", "(Lv04;Lpc2;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: x04 */
/* compiled from: MutableVectorWithMutationTracking.kt */
public final class x04<T> {

    /* renamed from: a */
    public final v04<T> f19267a;

    /* renamed from: b */
    public final pc2<r37> f19268b;

    public x04(v04<T> v04, pc2<r37> pc2) {
        vx2.m53591g(v04, "vector");
        vx2.m53591g(pc2, "onVectorMutated");
        this.f19267a = v04;
        this.f19268b = pc2;
    }

    /* renamed from: a */
    public final void mo27634a(int i, T t) {
        this.f19267a.mo26952b(i, t);
        this.f19268b.invoke();
    }

    /* renamed from: b */
    public final void mo27635b() {
        this.f19267a.mo26958i();
        this.f19268b.invoke();
    }

    /* renamed from: c */
    public final T mo27636c(int i) {
        return this.f19267a.mo26962m()[i];
    }

    /* renamed from: d */
    public final int mo27637d() {
        return this.f19267a.mo26963n();
    }

    /* renamed from: e */
    public final v04<T> mo27638e() {
        return this.f19267a;
    }

    /* renamed from: f */
    public final T mo27639f(int i) {
        T x = this.f19267a.mo26971x(i);
        this.f19268b.invoke();
        return x;
    }
}
