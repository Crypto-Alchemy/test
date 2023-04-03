package p000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005\u001aS\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007\u001a2\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007\u001a2\u0010\u0012\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\b\u001a\u00020\u00112\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007\u001a2\u0010\u0014\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007\u001a5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a9\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00028\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a&\u0010\u001f\u001a\u00020\u001c*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u001a.\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010!\u001a\u0015\u0010\"\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0006H\u0002\u001a\u0015\u0010$\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002\u001a\u0015\u0010%\u001a\u00020\u0005*\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0002\u001a\u001f\u0010&\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b&\u0010'\u001a;\u0010+\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010*\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000(j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`)¢\u0006\u0004\b+\u0010,\u001aO\u0010-\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010*\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000(j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`)2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.¨\u0006/"}, mo44877d2 = {"T", "", "", "d", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "c", "destination", "destinationOffset", "startIndex", "endIndex", "i", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "e", "g", "", "h", "", "f", "fromIndex", "toIndex", "o", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "n", "([BII)[B", "element", "Lr37;", "q", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "p", "w", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "u", "elements", "t", "v", "x", "([Ljava/lang/Object;)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "y", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "z", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/ArraysKt")
/* renamed from: xq */
/* compiled from: _ArraysJvm.kt */
public class C6706xq extends C6672wq {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo44877d2 = {"xq$a", "Li6;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "element", "j", "index", "k", "(I)Ljava/lang/Integer;", "n", "q", "e", "()I", "size", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: xq$a */
    /* compiled from: _ArraysJvm.kt */
    public static final class C6707a extends C5946i6<Integer> implements RandomAccess {

        /* renamed from: d */
        public final /* synthetic */ int[] f35673d;

        public C6707a(int[] iArr) {
            this.f35673d = iArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return mo49536j(((Number) obj).intValue());
        }

        /* renamed from: e */
        public int mo11067e() {
            return this.f35673d.length;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return mo49538n(((Number) obj).intValue());
        }

        public boolean isEmpty() {
            if (this.f35673d.length == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public boolean mo49536j(int i) {
            return ArraysKt___ArraysKt.m47247C(this.f35673d, i);
        }

        /* renamed from: k */
        public Integer get(int i) {
            return Integer.valueOf(this.f35673d[i]);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return mo49539q(((Number) obj).intValue());
        }

        /* renamed from: n */
        public int mo49538n(int i) {
            return ArraysKt___ArraysKt.m47264P(this.f35673d, i);
        }

        /* renamed from: q */
        public int mo49539q(int i) {
            return ArraysKt___ArraysKt.m47271W(this.f35673d, i);
        }
    }

    /* renamed from: c */
    public static final List<Integer> m54489c(int[] iArr) {
        vx2.m53591g(iArr, "<this>");
        return new C6707a(iArr);
    }

    /* renamed from: d */
    public static final <T> List<T> m54490d(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        List<T> a = C6747yq.m54845a(tArr);
        vx2.m53590f(a, "asList(this)");
        return a;
    }

    /* renamed from: e */
    public static final byte[] m54491e(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        vx2.m53591g(bArr, "<this>");
        vx2.m53591g(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: f */
    public static final float[] m54492f(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        vx2.m53591g(fArr, "<this>");
        vx2.m53591g(fArr2, "destination");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    /* renamed from: g */
    public static final int[] m54493g(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        vx2.m53591g(iArr, "<this>");
        vx2.m53591g(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    /* renamed from: h */
    public static final long[] m54494h(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        vx2.m53591g(jArr, "<this>");
        vx2.m53591g(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    /* renamed from: i */
    public static final <T> T[] m54495i(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: j */
    public static /* synthetic */ byte[] m54496j(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return m54491e(bArr, bArr2, i, i2, i3);
    }

    /* renamed from: k */
    public static /* synthetic */ float[] m54497k(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return m54492f(fArr, fArr2, i, i2, i3);
    }

    /* renamed from: l */
    public static /* synthetic */ int[] m54498l(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return m54493g(iArr, iArr2, i, i2, i3);
    }

    /* renamed from: m */
    public static /* synthetic */ Object[] m54499m(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m54495i(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: n */
    public static final byte[] m54500n(byte[] bArr, int i, int i2) {
        vx2.m53591g(bArr, "<this>");
        C6605vq.m53453b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        vx2.m53590f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: o */
    public static final <T> T[] m54501o(T[] tArr, int i, int i2) {
        vx2.m53591g(tArr, "<this>");
        C6605vq.m53453b(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        vx2.m53590f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: p */
    public static final void m54502p(int[] iArr, int i, int i2, int i3) {
        vx2.m53591g(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: q */
    public static final <T> void m54503q(T[] tArr, T t, int i, int i2) {
        vx2.m53591g(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: r */
    public static /* synthetic */ void m54504r(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        m54502p(iArr, i, i2, i3);
    }

    /* renamed from: s */
    public static /* synthetic */ void m54505s(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m54503q(objArr, obj, i, i2);
    }

    /* renamed from: t */
    public static final byte[] m54506t(byte[] bArr, byte[] bArr2) {
        vx2.m53591g(bArr, "<this>");
        vx2.m53591g(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        vx2.m53590f(copyOf, "result");
        return copyOf;
    }

    /* renamed from: u */
    public static final int[] m54507u(int[] iArr, int i) {
        vx2.m53591g(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        vx2.m53590f(copyOf, "result");
        return copyOf;
    }

    /* renamed from: v */
    public static final int[] m54508v(int[] iArr, int[] iArr2) {
        vx2.m53591g(iArr, "<this>");
        vx2.m53591g(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        vx2.m53590f(copyOf, "result");
        return copyOf;
    }

    /* renamed from: w */
    public static final <T> T[] m54509w(T[] tArr, T t) {
        vx2.m53591g(tArr, "<this>");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t;
        vx2.m53590f(copyOf, "result");
        return copyOf;
    }

    /* renamed from: x */
    public static final <T> void m54510x(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* renamed from: y */
    public static final <T> void m54511y(T[] tArr, Comparator<? super T> comparator) {
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: z */
    public static final <T> void m54512z(T[] tArr, Comparator<? super T> comparator, int i, int i2) {
        vx2.m53591g(tArr, "<this>");
        vx2.m53591g(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }
}
