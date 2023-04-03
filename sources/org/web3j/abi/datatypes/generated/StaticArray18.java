package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray18<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray18(List<T> list) {
        super(18, list);
    }

    @Deprecated
    public StaticArray18(T... tArr) {
        super(18, tArr);
    }

    public StaticArray18(Class<T> cls, List<T> list) {
        super(cls, 18, list);
    }

    public StaticArray18(Class<T> cls, T... tArr) {
        super(cls, 18, tArr);
    }
}
