package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray23<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray23(List<T> list) {
        super(23, list);
    }

    @Deprecated
    public StaticArray23(T... tArr) {
        super(23, tArr);
    }

    public StaticArray23(Class<T> cls, List<T> list) {
        super(cls, 23, list);
    }

    public StaticArray23(Class<T> cls, T... tArr) {
        super(cls, 23, tArr);
    }
}
