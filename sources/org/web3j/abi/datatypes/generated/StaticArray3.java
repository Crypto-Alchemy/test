package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray3<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray3(List<T> list) {
        super(3, list);
    }

    @Deprecated
    public StaticArray3(T... tArr) {
        super(3, tArr);
    }

    public StaticArray3(Class<T> cls, List<T> list) {
        super(cls, 3, list);
    }

    public StaticArray3(Class<T> cls, T... tArr) {
        super(cls, 3, tArr);
    }
}
