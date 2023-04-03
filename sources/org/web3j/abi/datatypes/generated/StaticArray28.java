package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray28<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray28(List<T> list) {
        super(28, list);
    }

    @Deprecated
    public StaticArray28(T... tArr) {
        super(28, tArr);
    }

    public StaticArray28(Class<T> cls, List<T> list) {
        super(cls, 28, list);
    }

    public StaticArray28(Class<T> cls, T... tArr) {
        super(cls, 28, tArr);
    }
}
