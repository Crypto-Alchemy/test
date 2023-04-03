package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray2<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray2(List<T> list) {
        super(2, list);
    }

    @Deprecated
    public StaticArray2(T... tArr) {
        super(2, tArr);
    }

    public StaticArray2(Class<T> cls, List<T> list) {
        super(cls, 2, list);
    }

    public StaticArray2(Class<T> cls, T... tArr) {
        super(cls, 2, tArr);
    }
}
