package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u001a\u0010\u000f\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lk96;", "T", "Lr86;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: k96 */
/* compiled from: ValueHolders.kt */
public final class k96<T> implements r86<T> {

    /* renamed from: a */
    public final T f14019a;

    public k96(T t) {
        this.f14019a = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k96) && vx2.m53586b(getValue(), ((k96) obj).getValue());
    }

    public T getValue() {
        return this.f14019a;
    }

    public int hashCode() {
        if (getValue() == null) {
            return 0;
        }
        return getValue().hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + getValue() + ')';
    }
}
