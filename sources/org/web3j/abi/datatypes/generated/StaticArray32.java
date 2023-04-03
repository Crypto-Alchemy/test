package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray32<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray32(List<T> list) {
        super(32, list);
    }

    @Deprecated
    public StaticArray32(T... tArr) {
        super(32, tArr);
    }

    public StaticArray32(Class<T> cls, List<T> list) {
        super(cls, 32, list);
    }

    public StaticArray32(Class<T> cls, T... tArr) {
        super(cls, 32, tArr);
    }
}
