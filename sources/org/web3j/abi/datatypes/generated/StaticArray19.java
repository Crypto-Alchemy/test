package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray19<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray19(List<T> list) {
        super(19, list);
    }

    @Deprecated
    public StaticArray19(T... tArr) {
        super(19, tArr);
    }

    public StaticArray19(Class<T> cls, List<T> list) {
        super(cls, 19, list);
    }

    public StaticArray19(Class<T> cls, T... tArr) {
        super(cls, 19, tArr);
    }
}
