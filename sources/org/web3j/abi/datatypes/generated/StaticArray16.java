package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray16<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray16(List<T> list) {
        super(16, list);
    }

    @Deprecated
    public StaticArray16(T... tArr) {
        super(16, tArr);
    }

    public StaticArray16(Class<T> cls, List<T> list) {
        super(cls, 16, list);
    }

    public StaticArray16(Class<T> cls, T... tArr) {
        super(cls, 16, tArr);
    }
}
