package org.web3j.abi.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p000.fz6;

public abstract class Array<T extends fz6> implements fz6<List<T>> {
    private final Class<T> type;
    public final List<T> value;

    @Deprecated
    public Array(String str, T... tArr) {
        this(str, Arrays.asList(tArr));
    }

    private void checkValid(Class<T> cls, List<T> list) {
        Objects.requireNonNull(cls);
        Objects.requireNonNull(list);
    }

    public int bytes32PaddedLength() {
        int i = 0;
        for (T bytes32PaddedLength : this.value) {
            i += bytes32PaddedLength.bytes32PaddedLength();
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Array array = (Array) obj;
        if (!this.type.equals(array.type)) {
            return false;
        }
        return Objects.equals(this.value, array.value);
    }

    public Class<T> getComponentType() {
        return this.type;
    }

    public List<Object> getNativeValueCopy() {
        ArrayList arrayList = new ArrayList(this.value.size());
        for (T value2 : this.value) {
            arrayList.add(value2.getValue());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract String getTypeAsString();

    public int hashCode() {
        int i;
        int hashCode = this.type.hashCode() * 31;
        List<T> list = this.value;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Deprecated
    public Array(String str, List<T> list) {
        this(C7927n5.getType(str), list);
    }

    public List<T> getValue() {
        return this.value;
    }

    @Deprecated
    public Array(String str) {
        this(str, new ArrayList());
    }

    public Array(Class<T> cls, T... tArr) {
        this(cls, Arrays.asList(tArr));
    }

    public Array(Class<T> cls, List<T> list) {
        checkValid(cls, list);
        this.type = cls;
        this.value = list;
    }
}
