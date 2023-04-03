package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray15<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray15(List<T> list) {
        super(15, list);
    }

    @Deprecated
    public StaticArray15(T... tArr) {
        super(15, tArr);
    }

    public StaticArray15(Class<T> cls, List<T> list) {
        super(cls, 15, list);
    }

    public StaticArray15(Class<T> cls, T... tArr) {
        super(cls, 15, tArr);
    }
}
