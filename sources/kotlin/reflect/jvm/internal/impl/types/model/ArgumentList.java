package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;

/* compiled from: TypeSystemContext.kt */
public final class ArgumentList extends ArrayList<nz6> implements mz6 {
    public ArgumentList(int i) {
        super(i);
    }

    public /* bridge */ boolean contains(nz6 nz6) {
        return super.contains(nz6);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(nz6 nz6) {
        return super.indexOf(nz6);
    }

    public /* bridge */ int lastIndexOf(nz6 nz6) {
        return super.lastIndexOf(nz6);
    }

    public /* bridge */ boolean remove(nz6 nz6) {
        return super.remove(nz6);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof nz6)) {
            return false;
        }
        return contains((nz6) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof nz6)) {
            return -1;
        }
        return indexOf((nz6) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof nz6)) {
            return -1;
        }
        return lastIndexOf((nz6) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof nz6)) {
            return false;
        }
        return remove((nz6) obj);
    }
}
