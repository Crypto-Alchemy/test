package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray26<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray26(List<T> list) {
        super(26, list);
    }

    @Deprecated
    public StaticArray26(T... tArr) {
        super(26, tArr);
    }

    public StaticArray26(Class<T> cls, List<T> list) {
        super(cls, 26, list);
    }

    public StaticArray26(Class<T> cls, T... tArr) {
        super(cls, 26, tArr);
    }
}
