package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray4<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray4(List<T> list) {
        super(4, list);
    }

    @Deprecated
    public StaticArray4(T... tArr) {
        super(4, tArr);
    }

    public StaticArray4(Class<T> cls, List<T> list) {
        super(cls, 4, list);
    }

    public StaticArray4(Class<T> cls, T... tArr) {
        super(cls, 4, tArr);
    }
}
