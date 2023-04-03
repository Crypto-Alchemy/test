package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray9<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray9(List<T> list) {
        super(9, list);
    }

    @Deprecated
    public StaticArray9(T... tArr) {
        super(9, tArr);
    }

    public StaticArray9(Class<T> cls, List<T> list) {
        super(cls, 9, list);
    }

    public StaticArray9(Class<T> cls, T... tArr) {
        super(cls, 9, tArr);
    }
}
