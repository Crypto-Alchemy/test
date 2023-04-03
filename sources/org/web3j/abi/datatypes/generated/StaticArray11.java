package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray11<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray11(List<T> list) {
        super(11, list);
    }

    @Deprecated
    public StaticArray11(T... tArr) {
        super(11, tArr);
    }

    public StaticArray11(Class<T> cls, List<T> list) {
        super(cls, 11, list);
    }

    public StaticArray11(Class<T> cls, T... tArr) {
        super(cls, 11, tArr);
    }
}
