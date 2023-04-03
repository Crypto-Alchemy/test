package p000;

/* renamed from: uy6 */
/* compiled from: Tuple3 */
public final class uy6<T1, T2, T3> implements vy6 {
    private static final int SIZE = 3;
    private final T1 value1;
    private final T2 value2;
    private final T3 value3;

    public uy6(T1 t1, T2 t2, T3 t3) {
        this.value1 = t1;
        this.value2 = t2;
        this.value3 = t3;
    }

    public T1 component1() {
        return this.value1;
    }

    public T2 component2() {
        return this.value2;
    }

    public T3 component3() {
        return this.value3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uy6.class != obj.getClass()) {
            return false;
        }
        uy6 uy6 = (uy6) obj;
        T1 t1 = this.value1;
        if (t1 == null ? uy6.value1 != null : !t1.equals(uy6.value1)) {
            return false;
        }
        T2 t2 = this.value2;
        if (t2 == null ? uy6.value2 != null : !t2.equals(uy6.value2)) {
            return false;
        }
        T3 t3 = this.value3;
        T3 t32 = uy6.value3;
        if (t3 != null) {
            return t3.equals(t32);
        }
        if (t32 == null) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return 3;
    }

    @Deprecated
    public T1 getValue1() {
        return this.value1;
    }

    @Deprecated
    public T2 getValue2() {
        return this.value2;
    }

    @Deprecated
    public T3 getValue3() {
        return this.value3;
    }

    public int hashCode() {
        int i;
        int hashCode = this.value1.hashCode() * 31;
        T2 t2 = this.value2;
        int i2 = 0;
        if (t2 != null) {
            i = t2.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        T3 t3 = this.value3;
        if (t3 != null) {
            i2 = t3.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "Tuple3{value1=" + this.value1 + ", value2=" + this.value2 + ", value3=" + this.value3 + "}";
    }
}
