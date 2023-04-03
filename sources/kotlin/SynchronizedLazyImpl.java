package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8\b@\bX\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lef3;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "isInitialized", "", "toString", "Lkotlin/Function0;", "initializer", "Lpc2;", "_value", "Ljava/lang/Object;", "lock", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lpc2;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: LazyJVM.kt */
final class SynchronizedLazyImpl<T> implements ef3<T>, Serializable {
    private volatile Object _value;
    private pc2<? extends T> initializer;
    private final Object lock;

    public SynchronizedLazyImpl(pc2<? extends T> pc2, Object obj) {
        vx2.m53591g(pc2, "initializer");
        this.initializer = pc2;
        this._value = z27.f35985a;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public T getValue() {
        T t;
        T t2 = this._value;
        T t3 = z27.f35985a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.lock) {
            t = this._value;
            if (t == t3) {
                pc2 pc2 = this.initializer;
                vx2.m53588d(pc2);
                t = pc2.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SynchronizedLazyImpl(pc2 pc2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pc2, (i & 2) != 0 ? null : obj);
    }
}
