package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray27<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray27(List<T> list) {
        super(27, list);
    }

    @Deprecated
    public StaticArray27(T... tArr) {
        super(27, tArr);
    }

    public StaticArray27(Class<T> cls, List<T> list) {
        super(cls, 27, list);
    }

    public StaticArray27(Class<T> cls, T... tArr) {
        super(cls, 27, tArr);
    }
}
