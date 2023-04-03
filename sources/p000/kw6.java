package p000;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.gf7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0010\b\b\u0018\u0000 &*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0012B5\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017¢\u0006\u0004\b\"\u0010#B\u001f\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\"\u0010%J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b \u0010\u001a¨\u0006'"}, mo44877d2 = {"Lkw6;", "", "T", "", "index", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "Lgf7$a;", "d", "other", "", "equals", "hashCode", "", "toString", "", "a", "[I", "c", "()[I", "originalPageOffsets", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "data", "I", "getHintOriginalPageOffset", "()I", "hintOriginalPageOffset", "getHintOriginalIndices", "hintOriginalIndices", "<init>", "([ILjava/util/List;ILjava/util/List;)V", "originalPageOffset", "(ILjava/util/List;)V", "f", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: kw6 */
/* compiled from: TransformablePage.kt */
public final class kw6<T> {

    /* renamed from: e */
    public static final kw6<Object> f14345e = new kw6<>(0, ck0.m33062j());

    /* renamed from: f */
    public static final C2733a f14346f = new C2733a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int[] f14347a;

    /* renamed from: b */
    public final List<T> f14348b;

    /* renamed from: c */
    public final int f14349c;

    /* renamed from: d */
    public final List<Integer> f14350d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lkw6$a;", "", "Lkw6;", "EMPTY_INITIAL_PAGE", "Lkw6;", "a", "()Lkw6;", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: kw6$a */
    /* compiled from: TransformablePage.kt */
    public static final class C2733a {
        public C2733a() {
        }

        public /* synthetic */ C2733a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final kw6<Object> mo22545a() {
            return kw6.f14345e;
        }
    }

    public kw6(int[] iArr, List<? extends T> list, int i, List<Integer> list2) {
        vx2.m53591g(iArr, "originalPageOffsets");
        vx2.m53591g(list, "data");
        this.f14347a = iArr;
        this.f14348b = list;
        this.f14349c = i;
        this.f14350d = list2;
        boolean z = false;
        if (!(iArr.length == 0)) {
            if (!((list2 == null || list2.size() == list.size()) ? true : z)) {
                StringBuilder sb = new StringBuilder();
                sb.append("If originalIndices (size = ");
                vx2.m53588d(list2);
                sb.append(list2.size());
                sb.append(") is provided,");
                sb.append(" it must be same length as data (size = ");
                sb.append(list.size());
                sb.append(')');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            return;
        }
        throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
    }

    /* renamed from: b */
    public final List<T> mo22539b() {
        return this.f14348b;
    }

    /* renamed from: c */
    public final int[] mo22540c() {
        return this.f14347a;
    }

    /* renamed from: d */
    public final gf7.C2383a mo22541d(int i, int i2, int i3, int i4, int i5) {
        rw2 k;
        int i6 = this.f14349c;
        List<Integer> list = this.f14350d;
        if (!(list == null || (k = ck0.m33063k(list)) == null || !k.mo47514u(i))) {
            i = this.f14350d.get(i).intValue();
        }
        return new gf7.C2383a(i6, i, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<kw6> cls2 = kw6.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!vx2.m53586b(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            kw6 kw6 = (kw6) obj;
            if (Arrays.equals(this.f14347a, kw6.f14347a) && !(!vx2.m53586b(this.f14348b, kw6.f14348b)) && this.f14349c == kw6.f14349c && !(!vx2.m53586b(this.f14350d, kw6.f14350d))) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
    }

    public int hashCode() {
        int i;
        int hashCode = ((((Arrays.hashCode(this.f14347a) * 31) + this.f14348b.hashCode()) * 31) + this.f14349c) * 31;
        List<Integer> list = this.f14350d;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f14347a) + ", data=" + this.f14348b + ", hintOriginalPageOffset=" + this.f14349c + ", hintOriginalIndices=" + this.f14350d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public kw6(int i, List<? extends T> list) {
        this(new int[]{i}, list, i, (List<Integer>) null);
        vx2.m53591g(list, "data");
    }
}
