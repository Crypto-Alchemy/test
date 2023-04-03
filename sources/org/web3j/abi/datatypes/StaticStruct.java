package org.web3j.abi.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticStruct extends StaticArray<fz6> implements ac6 {
    private final List<Class<fz6>> itemTypes;

    public StaticStruct(List<fz6> list) {
        super(fz6.class, list.size(), list);
        this.itemTypes = new ArrayList();
        for (fz6 fz6 : list) {
            this.itemTypes.add(fz6.getClass());
        }
    }

    public String getTypeAsString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < this.itemTypes.size(); i++) {
            Class cls = this.itemTypes.get(i);
            if (ac6.class.isAssignableFrom(cls)) {
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

    public StaticStruct(fz6... fz6Arr) {
        this((List<fz6>) Arrays.asList(fz6Arr));
    }
}
