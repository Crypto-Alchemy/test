package org.web3j.abi.datatypes;

import java.util.List;
import okhttp3.HttpUrl;
import org.web3j.abi.Utils;
import p000.fz6;

public class DynamicArray<T extends fz6> extends Array<T> {
    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DynamicArray(T... r4) {
        /*
            r3 = this;
            java.lang.Class<ac6> r0 = p000.ac6.class
            r1 = 0
            r2 = r4[r1]
            java.lang.Class r2 = r2.getClass()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L_0x0016
            r0 = r4[r1]
            java.lang.Class r0 = r0.getClass()
            goto L_0x0020
        L_0x0016:
            r0 = r4[r1]
            java.lang.String r0 = r0.getTypeAsString()
            java.lang.Class r0 = p000.C7927n5.getType(r0)
        L_0x0020:
            r3.<init>(r0, (T[]) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.web3j.abi.datatypes.DynamicArray.<init>(fz6[]):void");
    }

    @Deprecated
    public static DynamicArray empty(String str) {
        return new DynamicArray(str);
    }

    public int bytes32PaddedLength() {
        return super.bytes32PaddedLength() + 32;
    }

    public String getTypeAsString() {
        String str;
        Class<ac6> cls = ac6.class;
        if (this.value.isEmpty()) {
            if (cls.isAssignableFrom(getComponentType())) {
                str = Utils.getStructType(getComponentType());
            } else {
                str = C7927n5.getTypeAString(getComponentType());
            }
        } else if (cls.isAssignableFrom(((fz6) this.value.get(0)).getClass())) {
            str = ((fz6) this.value.get(0)).getTypeAsString();
        } else {
            str = C7927n5.getTypeAString(getComponentType());
        }
        return str + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DynamicArray(java.util.List<T> r4) {
        /*
            r3 = this;
            java.lang.Class<ac6> r0 = p000.ac6.class
            r1 = 0
            java.lang.Object r2 = r4.get(r1)
            fz6 r2 = (p000.fz6) r2
            java.lang.Class r2 = r2.getClass()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r4.get(r1)
            fz6 r0 = (p000.fz6) r0
            java.lang.Class r0 = r0.getClass()
            goto L_0x002c
        L_0x001e:
            java.lang.Object r0 = r4.get(r1)
            fz6 r0 = (p000.fz6) r0
            java.lang.String r0 = r0.getTypeAsString()
            java.lang.Class r0 = p000.C7927n5.getType(r0)
        L_0x002c:
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.web3j.abi.datatypes.DynamicArray.<init>(java.util.List):void");
    }

    @Deprecated
    private DynamicArray(String str) {
        super(C7927n5.getType(str), (T[]) new fz6[0]);
    }

    public DynamicArray(Class<T> cls, List<T> list) {
        super(cls, list);
    }

    public DynamicArray(Class<T> cls, T... tArr) {
        super(cls, tArr);
    }
}
