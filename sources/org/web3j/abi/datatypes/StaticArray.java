package org.web3j.abi.datatypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.fz6;

public abstract class StaticArray<T extends fz6> extends Array<T> {
    public static final int MAX_SIZE_OF_STATIC_ARRAY = 32;

    @Deprecated
    public StaticArray(T... tArr) {
        this(tArr.length, tArr);
    }

    private void checkValid(int i) {
        if (this.value.size() > 32) {
            throw new UnsupportedOperationException("Static arrays with a length greater than 32 are not supported.");
        } else if (this.value.size() != i) {
            throw new UnsupportedOperationException("Expected array of type [" + getClass().getSimpleName() + "] to have [" + i + "] elements.");
        }
    }

    public String getTypeAsString() {
        String str;
        if (this.value.isEmpty() || !ac6.class.isAssignableFrom(((fz6) this.value.get(0)).getClass())) {
            str = C7927n5.getTypeAString(getComponentType());
        } else {
            str = ((fz6) this.value.get(0)).getTypeAsString();
        }
        return str + "[" + this.value.size() + "]";
    }

    @Deprecated
    public StaticArray(int i, T... tArr) {
        this(i, Arrays.asList(tArr));
    }

    public List<T> getValue() {
        return Collections.unmodifiableList(this.value);
    }

    @Deprecated
    public StaticArray(List<T> list) {
        this(list.size(), list);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StaticArray(int r4, java.util.List<T> r5) {
        /*
            r3 = this;
            java.lang.Class<ac6> r0 = p000.ac6.class
            r1 = 0
            java.lang.Object r2 = r5.get(r1)
            fz6 r2 = (p000.fz6) r2
            java.lang.Class r2 = r2.getClass()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r5.get(r1)
            fz6 r0 = (p000.fz6) r0
            java.lang.Class r0 = r0.getClass()
            goto L_0x002c
        L_0x001e:
            java.lang.Object r0 = r5.get(r1)
            fz6 r0 = (p000.fz6) r0
            java.lang.String r0 = r0.getTypeAsString()
            java.lang.Class r0 = p000.C7927n5.getType(r0)
        L_0x002c:
            r3.<init>(r0, r5)
            r3.checkValid(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.web3j.abi.datatypes.StaticArray.<init>(int, java.util.List):void");
    }

    public StaticArray(Class<T> cls, T... tArr) {
        this(cls, Arrays.asList(tArr));
    }

    public StaticArray(Class<T> cls, int i, T... tArr) {
        this(cls, i, Arrays.asList(tArr));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StaticArray(Class<T> cls, List<T> list) {
        this(cls, list == null ? 0 : list.size(), list);
    }

    public StaticArray(Class<T> cls, int i, List<T> list) {
        super(cls, list);
        checkValid(i);
    }
}
