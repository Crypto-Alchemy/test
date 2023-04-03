package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, mo44877d2 = {"Lv33;", "", "", "hashCode", "", "toString", "other", "", "equals", "value", "a", "Ljava/lang/Object;", "getLeft", "()Ljava/lang/Object;", "left", "b", "getRight", "right", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: v33 */
/* compiled from: JoinedKey.kt */
public final class v33 {

    /* renamed from: a */
    public final Object f18649a;

    /* renamed from: b */
    public final Object f18650b;

    public v33(Object obj, Object obj2) {
        this.f18649a = obj;
        this.f18650b = obj2;
    }

    /* renamed from: a */
    public final int mo27038a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v33)) {
            return false;
        }
        v33 v33 = (v33) obj;
        return vx2.m53586b(this.f18649a, v33.f18649a) && vx2.m53586b(this.f18650b, v33.f18650b);
    }

    public int hashCode() {
        return (mo27038a(this.f18649a) * 31) + mo27038a(this.f18650b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f18649a + ", right=" + this.f18650b + ')';
    }
}
