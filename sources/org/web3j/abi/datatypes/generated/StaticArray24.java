package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray24<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray24(List<T> list) {
        super(24, list);
    }

    @Deprecated
    public StaticArray24(T... tArr) {
        super(24, tArr);
    }

    public StaticArray24(Class<T> cls, List<T> list) {
        super(cls, 24, list);
    }

    public StaticArray24(Class<T> cls, T... tArr) {
        super(cls, 24, tArr);
    }
}
