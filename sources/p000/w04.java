package p000;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a \u0010\u0007\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¨\u0006\b"}, mo44877d2 = {"", "", "index", "Lr37;", "c", "fromIndex", "toIndex", "d", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: w04 */
/* compiled from: MutableVector.kt */
public final class w04 {
    /* renamed from: c */
    public static final void m29209c(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* renamed from: d */
    public static final void m29210d(List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        } else if (i2 > size) {
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }
}
