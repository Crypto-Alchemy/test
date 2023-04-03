package org.web3j.abi.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicStruct extends DynamicArray<fz6> implements ac6 {
    private final List<Class<fz6>> itemTypes;

    public DynamicStruct(List<fz6> list) {
        this((Class<fz6>) fz6.class, list);
    }

    public int bytes32PaddedLength() {
        return super.bytes32PaddedLength() + 32;
    }

    public String getTypeAsString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < this.itemTypes.size(); i++) {
            Class cls = this.itemTypes.get(i);
            if (ac6.class.isAssignableFrom(cls) || DynamicArray.class.isAssignableFrom(cls)) {
                sb.append(((fz6) getValue().get(i)).getTypeAsString());
            } else if (Array.class.isAssignableFrom(cls)) {
                sb.append(((fz6) getValue().get(i)).getTypeAsString());
            } else {
                sb.append(C7927n5.getTypeAString(cls));
            }
            if (i < this.itemTypes.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    private DynamicStruct(Class<fz6> cls, List<fz6> list) {
        super(cls, list);
        this.itemTypes = new ArrayList();
        for (fz6 fz6 : list) {
            this.itemTypes.add(fz6.getClass());
        }
    }

    public DynamicStruct(fz6... fz6Arr) {
        this((List<fz6>) Arrays.asList(fz6Arr));
    }

    public DynamicStruct(Class<fz6> cls, fz6... fz6Arr) {
        this(cls, (List<fz6>) Arrays.asList(fz6Arr));
    }
}
