package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray17<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray17(List<T> list) {
        super(17, list);
    }

    @Deprecated
    public StaticArray17(T... tArr) {
        super(17, tArr);
    }

    public StaticArray17(Class<T> cls, List<T> list) {
        super(cls, 17, list);
    }

    public StaticArray17(Class<T> cls, T... tArr) {
        super(cls, 17, tArr);
    }
}
