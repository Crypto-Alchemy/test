package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray7<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray7(List<T> list) {
        super(7, list);
    }

    @Deprecated
    public StaticArray7(T... tArr) {
        super(7, tArr);
    }

    public StaticArray7(Class<T> cls, List<T> list) {
        super(cls, 7, list);
    }

    public StaticArray7(Class<T> cls, T... tArr) {
        super(cls, 7, tArr);
    }
}
