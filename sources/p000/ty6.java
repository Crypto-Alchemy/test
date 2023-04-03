package p000;

/* renamed from: ty6 */
/* compiled from: Tuple2 */
public final class ty6<T1, T2> implements vy6 {
    private static final int SIZE = 2;
    private final T1 value1;
    private final T2 value2;

    public ty6(T1 t1, T2 t2) {
        this.value1 = t1;
        this.value2 = t2;
    }

    public T1 component1() {
        return this.value1;
    }

    public T2 component2() {
        return this.value2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ty6.class != obj.getClass()) {
            return false;
        }
        ty6 ty6 = (ty6) obj;
        T1 t1 = this.value1;
        if (t1 == null ? ty6.value1 != null : !t1.equals(ty6.value1)) {
            return false;
        }
        T2 t2 = this.value2;
        T2 t22 = ty6.value2;
        if (t2 != null) {
            return t2.equals(t22);
        }
        if (t22 == null) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return 2;
    }

    @Deprecated
    public T1 getValue1() {
        return this.value1;
    }

    @Deprecated
    public T2 getValue2() {
        return this.value2;
    }

    public int hashCode() {
        int i;
        int hashCode = this.value1.hashCode() * 31;
        T2 t2 = this.value2;
        if (t2 != null) {
            i = t2.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "Tuple2{value1=" + this.value1 + ", value2=" + this.value2 + "}";
    }
}
