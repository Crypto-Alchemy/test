package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray13<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray13(List<T> list) {
        super(13, list);
    }

    @Deprecated
    public StaticArray13(T... tArr) {
        super(13, tArr);
    }

    public StaticArray13(Class<T> cls, List<T> list) {
        super(cls, 13, list);
    }

    public StaticArray13(Class<T> cls, T... tArr) {
        super(cls, 13, tArr);
    }
}
