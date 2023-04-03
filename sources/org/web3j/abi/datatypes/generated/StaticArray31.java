package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray31<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray31(List<T> list) {
        super(31, list);
    }

    @Deprecated
    public StaticArray31(T... tArr) {
        super(31, tArr);
    }

    public StaticArray31(Class<T> cls, List<T> list) {
        super(cls, 31, list);
    }

    public StaticArray31(Class<T> cls, T... tArr) {
        super(cls, 31, tArr);
    }
}
