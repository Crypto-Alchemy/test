package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: tr8 */
public final class tr8 implements Cloneable {

    /* renamed from: a */
    public Object f34321a;

    /* renamed from: d */
    public List<Object> f34322d = new ArrayList();

    /* renamed from: a */
    public final byte[] mo48162a() throws IOException {
        byte[] bArr = new byte[mo48165d()];
        mo48163b(gr8.m44868q(bArr));
        return bArr;
    }

    /* renamed from: b */
    public final void mo48163b(gr8 gr8) throws IOException {
        if (this.f34321a == null) {
            Iterator<Object> it = this.f34322d.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: d */
    public final int mo48165d() {
        if (this.f34321a == null) {
            Iterator<Object> it = this.f34322d.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tr8)) {
            return false;
        }
        tr8 tr8 = (tr8) obj;
        if (this.f34321a == null || tr8.f34321a == null) {
            List<Object> list2 = this.f34322d;
            if (list2 != null && (list = tr8.f34322d) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(mo48162a(), tr8.mo48162a());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw null;
        }
    }

    /* renamed from: f */
    public final tr8 clone() {
        Object clone;
        tr8 tr8 = new tr8();
        try {
            List<Object> list = this.f34322d;
            if (list == null) {
                tr8.f34322d = null;
            } else {
                tr8.f34322d.addAll(list);
            }
            Object obj = this.f34321a;
            if (obj != null) {
                if (obj instanceof as8) {
                    clone = (as8) ((as8) obj).clone();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        tr8.f34321a = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        clone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        clone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        clone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        clone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        clone = ((double[]) obj).clone();
                    } else if (obj instanceof as8[]) {
                        as8[] as8Arr = (as8[]) obj;
                        as8[] as8Arr2 = new as8[as8Arr.length];
                        tr8.f34321a = as8Arr2;
                        while (i < as8Arr.length) {
                            as8Arr2[i] = (as8) as8Arr[i].clone();
                            i++;
                        }
                    }
                }
                tr8.f34321a = clone;
            }
            return tr8;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(mo48162a()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
