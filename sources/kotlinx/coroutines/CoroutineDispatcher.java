package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.ps0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001b"}, mo44877d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lz5;", "Lps0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "z", "", "parallelism", "A", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lr37;", "m", "y", "T", "Lns0;", "continuation", "x", "s", "", "toString", "<init>", "()V", "d", "Key", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: CoroutineDispatcher.kt */
public abstract class CoroutineDispatcher extends C6754z5 implements ps0 {

    /* renamed from: d */
    public static final Key f40343d = new Key((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "La6;", "Lps0;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: CoroutineDispatcher.kt */
    public static final class Key extends C3800a6<ps0, CoroutineDispatcher> {
        public Key() {
            super(ps0.f32794h, C77491.INSTANCE);
        }

        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CoroutineDispatcher() {
        super(ps0.f32794h);
    }

    /* renamed from: A */
    public CoroutineDispatcher mo55461A(int i) {
        eh3.m57341a(i);
        return new dh3(this, i);
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        return ps0.C6370a.m50087a(this, bVar);
    }

    /* renamed from: m */
    public abstract void mo3894m(CoroutineContext coroutineContext, Runnable runnable);

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        return ps0.C6370a.m50088b(this, bVar);
    }

    /* renamed from: s */
    public final void mo46863s(ns0<?> ns0) {
        ((lh1) ns0).mo55903p();
    }

    public String toString() {
        return b31.m55722a(this) + '@' + b31.m55723b(this);
    }

    /* renamed from: x */
    public final <T> ns0<T> mo46864x(ns0<? super T> ns0) {
        return new lh1(this, ns0);
    }

    /* renamed from: y */
    public void mo50471y(CoroutineContext coroutineContext, Runnable runnable) {
        mo3894m(coroutineContext, runnable);
    }

    /* renamed from: z */
    public boolean mo28541z(CoroutineContext coroutineContext) {
        return true;
    }
}
