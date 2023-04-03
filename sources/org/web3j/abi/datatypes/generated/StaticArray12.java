package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray12<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray12(List<T> list) {
        super(12, list);
    }

    @Deprecated
    public StaticArray12(T... tArr) {
        super(12, tArr);
    }

    public StaticArray12(Class<T> cls, List<T> list) {
        super(cls, 12, list);
    }

    public StaticArray12(Class<T> cls, T... tArr) {
        super(cls, 12, tArr);
    }
}
