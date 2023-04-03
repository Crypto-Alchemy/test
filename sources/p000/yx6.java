package p000;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aG\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aO\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, mo44877d2 = {"", "index", "shift", "f", "K", "V", "", "", "keyIndex", "key", "value", "g", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "nodeIndex", "Lux6;", "newNode", "j", "([Ljava/lang/Object;IILux6;)[Ljava/lang/Object;", "k", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "h", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "i", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: yx6 */
/* compiled from: TrieNode.kt */
public final class yx6 {
    /* renamed from: f */
    public static final int m30861f(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* renamed from: g */
    public static final <K, V> Object[] m30862g(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        C6706xq.m54499m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C6706xq.m54495i(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    /* renamed from: h */
    public static final Object[] m30863h(Object[] objArr, int i) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        C6706xq.m54499m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C6706xq.m54495i(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* renamed from: i */
    public static final Object[] m30864i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        C6706xq.m54499m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C6706xq.m54495i(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* renamed from: j */
    public static final Object[] m30865j(Object[] objArr, int i, int i2, ux6<?, ?> ux6) {
        int i3 = i2 - 2;
        Object[] objArr2 = new Object[((objArr.length - 2) + 1)];
        C6706xq.m54499m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C6706xq.m54495i(objArr, objArr2, i, i + 2, i2);
        objArr2[i3] = ux6;
        C6706xq.m54495i(objArr, objArr2, i3 + 1, i2, objArr.length);
        return objArr2;
    }

    /* renamed from: k */
    public static final <K, V> Object[] m30866k(Object[] objArr, int i, int i2, K k, V v) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        vx2.m53590f(copyOf, "copyOf(this, newSize)");
        C6706xq.m54495i(copyOf, copyOf, i + 2, i + 1, objArr.length);
        C6706xq.m54495i(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = k;
        copyOf[i2 + 1] = v;
        return copyOf;
    }
}
