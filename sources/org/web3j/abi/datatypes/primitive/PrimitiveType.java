package org.web3j.abi.datatypes.primitive;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Objects;

public abstract class PrimitiveType<T extends Serializable & Comparable<T>> implements fz6<T> {
    private final String type = getClass().getSimpleName().toLowerCase();
    private final T value;

    public PrimitiveType(T t) {
        this.value = t;
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrimitiveType primitiveType = (PrimitiveType) obj;
        if (!this.type.equals(primitiveType.type) || !this.value.equals(primitiveType.value)) {
            return false;
        }
        return true;
    }

    public String getTypeAsString() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.type, this.value});
    }

    public abstract fz6 toSolidityType();

    public T getValue() {
        return this.value;
    }
}
