package org.web3j.abi.datatypes.primitive;

import java.lang.Comparable;
import java.lang.Number;
import org.web3j.abi.datatypes.NumericType;

public abstract class Number<T extends Number & Comparable<T>> extends PrimitiveType<T> {
    public Number(T t) {
        super(t);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public abstract NumericType toSolidityType();
}
