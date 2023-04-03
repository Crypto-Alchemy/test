package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray1<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray1(List<T> list) {
        super(1, list);
    }

    @Deprecated
    public StaticArray1(T... tArr) {
        super(1, tArr);
    }

    public StaticArray1(Class<T> cls, List<T> list) {
        super(cls, 1, list);
    }

    public StaticArray1(Class<T> cls, T... tArr) {
        super(cls, 1, tArr);
    }
}
