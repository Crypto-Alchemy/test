package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray22<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray22(List<T> list) {
        super(22, list);
    }

    @Deprecated
    public StaticArray22(T... tArr) {
        super(22, tArr);
    }

    public StaticArray22(Class<T> cls, List<T> list) {
        super(cls, 22, list);
    }

    public StaticArray22(Class<T> cls, T... tArr) {
        super(cls, 22, tArr);
    }
}
