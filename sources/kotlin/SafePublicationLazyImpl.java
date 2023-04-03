package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000 \u0016*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0017B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8\b@\bX\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, mo44877d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lef3;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "isInitialized", "", "toString", "Lkotlin/Function0;", "initializer", "Lpc2;", "_value", "Ljava/lang/Object;", "final", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lpc2;)V", "Companion", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: LazyJVM.kt */
final class SafePublicationLazyImpl<T> implements ef3<T>, Serializable {
    public static final C6168a Companion = new C6168a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f30959a = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    private final Object f46888final;
    private volatile pc2<? extends T> initializer;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bRd\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lkotlin/SafePublicationLazyImpl$a;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/SafePublicationLazyImpl;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.SafePublicationLazyImpl$a */
    /* compiled from: LazyJVM.kt */
    public static final class C6168a {
        public C6168a() {
        }

        public /* synthetic */ C6168a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SafePublicationLazyImpl(pc2<? extends T> pc2) {
        vx2.m53591g(pc2, "initializer");
        this.initializer = pc2;
        z27 z27 = z27.f35985a;
        this._value = z27;
        this.f46888final = z27;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public T getValue() {
        T t = this._value;
        T t2 = z27.f35985a;
        if (t != t2) {
            return t;
        }
        pc2<? extends T> pc2 = this.initializer;
        if (pc2 != null) {
            T invoke = pc2.invoke();
            if (C2265f6.m16607a(f30959a, this, t2, invoke)) {
                this.initializer = null;
                return invoke;
            }
        }
        return this._value;
    }

    public boolean isInitialized() {
        if (this._value != z27.f35985a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
