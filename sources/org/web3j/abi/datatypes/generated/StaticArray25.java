package org.web3j.abi.datatypes.generated;

import java.util.List;
import org.web3j.abi.datatypes.StaticArray;
import p000.fz6;

public class StaticArray25<T extends fz6> extends StaticArray<T> {
    @Deprecated
    public StaticArray25(List<T> list) {
        super(25, list);
    }

    @Deprecated
    public StaticArray25(T... tArr) {
        super(25, tArr);
    }

    public StaticArray25(Class<T> cls, List<T> list) {
        super(cls, 25, list);
    }

    public StaticArray25(Class<T> cls, T... tArr) {
        super(cls, 25, tArr);
    }
}
