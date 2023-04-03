package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray10<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray10(List<T> list) {
        super(10, list);
    }

    @Deprecated
    public StaticArray10(T... tArr) {
        super(10, tArr);
    }

    public StaticArray10(Class<T> cls, List<T> list) {
        super(cls, 10, list);
    }

    public StaticArray10(Class<T> cls, T... tArr) {
        super(cls, 10, tArr);
    }
}
