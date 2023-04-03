package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray0<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray0(List<T> list) {
        super(0, (T[]) new fz6[0]);
    }

    @Deprecated
    public StaticArray0(T... tArr) {
        super(0, tArr);
    }

    public StaticArray0(Class<T> cls, List<T> list) {
        super(cls, 0, list);
    }

    public StaticArray0(Class<T> cls, T... tArr) {
        super(cls, 0, tArr);
    }
}
