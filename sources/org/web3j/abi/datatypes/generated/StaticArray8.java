package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray8<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray8(List<T> list) {
        super(8, list);
    }

    @Deprecated
    public StaticArray8(T... tArr) {
        super(8, tArr);
    }

    public StaticArray8(Class<T> cls, List<T> list) {
        super(cls, 8, list);
    }

    public StaticArray8(Class<T> cls, T... tArr) {
        super(cls, 8, tArr);
    }
}
