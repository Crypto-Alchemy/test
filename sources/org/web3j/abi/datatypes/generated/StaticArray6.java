package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray6<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray6(List<T> list) {
        super(6, list);
    }

    @Deprecated
    public StaticArray6(T... tArr) {
        super(6, tArr);
    }

    public StaticArray6(Class<T> cls, List<T> list) {
        super(cls, 6, list);
    }

    public StaticArray6(Class<T> cls, T... tArr) {
        super(cls, 6, tArr);
    }
}
