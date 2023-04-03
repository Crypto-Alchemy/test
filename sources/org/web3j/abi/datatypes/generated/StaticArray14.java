package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray14<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray14(List<T> list) {
        super(14, list);
    }

    @Deprecated
    public StaticArray14(T... tArr) {
        super(14, tArr);
    }

    public StaticArray14(Class<T> cls, List<T> list) {
        super(cls, 14, list);
    }

    public StaticArray14(Class<T> cls, T... tArr) {
        super(cls, 14, tArr);
    }
}
