package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray20<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray20(List<T> list) {
        super(20, list);
    }

    @Deprecated
    public StaticArray20(T... tArr) {
        super(20, tArr);
    }

    public StaticArray20(Class<T> cls, List<T> list) {
        super(cls, 20, list);
    }

    public StaticArray20(Class<T> cls, T... tArr) {
        super(cls, 20, tArr);
    }
}
