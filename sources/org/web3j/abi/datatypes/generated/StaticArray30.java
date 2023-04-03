package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray30<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray30(List<T> list) {
        super(30, list);
    }

    @Deprecated
    public StaticArray30(T... tArr) {
        super(30, tArr);
    }

    public StaticArray30(Class<T> cls, List<T> list) {
        super(cls, 30, list);
    }

    public StaticArray30(Class<T> cls, T... tArr) {
        super(cls, 30, tArr);
    }
}
