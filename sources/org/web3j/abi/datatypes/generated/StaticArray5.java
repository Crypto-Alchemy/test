package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray5<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray5(List<T> list) {
        super(5, list);
    }

    @Deprecated
    public StaticArray5(T... tArr) {
        super(5, tArr);
    }

    public StaticArray5(Class<T> cls, List<T> list) {
        super(cls, 5, list);
    }

    public StaticArray5(Class<T> cls, T... tArr) {
        super(cls, 5, tArr);
    }
}
