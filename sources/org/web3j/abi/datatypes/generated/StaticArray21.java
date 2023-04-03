package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray21<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray21(List<T> list) {
        super(21, list);
    }

    @Deprecated
    public StaticArray21(T... tArr) {
        super(21, tArr);
    }

    public StaticArray21(Class<T> cls, List<T> list) {
        super(cls, 21, list);
    }

    public StaticArray21(Class<T> cls, T... tArr) {
        super(cls, 21, tArr);
    }
}
