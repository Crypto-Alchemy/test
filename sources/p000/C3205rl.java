package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005BU\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00100\u000f\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00100\u000f\u0012\u0016\b\u0002\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00100\u000f¢\u0006\u0004\b-\u0010.B=\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00100\u000f\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00100\u000f¢\u0006\u0004\b-\u0010/J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001b\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00100\u000f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00100\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b!\u0010$R(\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00100\u000f8\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b(\u0010$R\u0014\u0010,\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, mo44877d2 = {"Lrl;", "", "", "index", "", "a", "startIndex", "endIndex", "i", "Lao6;", "range", "j", "(J)Lrl;", "start", "end", "", "Lrl$a;", "Lry6;", "g", "Ll57;", "h", "", "other", "", "equals", "hashCode", "", "toString", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "text", "Lc66;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "spanStyles", "Lpl4;", "paragraphStyles", "b", "annotations", "c", "()I", "length", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rl */
/* compiled from: AnnotatedString.kt */
public final class C3205rl implements CharSequence {

    /* renamed from: a */
    public final String f17280a;

    /* renamed from: d */
    public final List<C3206a<c66>> f17281d;

    /* renamed from: e */
    public final List<C3206a<pl4>> f17282e;

    /* renamed from: g */
    public final List<C3206a<? extends Object>> f17283g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lrl$a;", "T", "", "a", "()Ljava/lang/Object;", "", "b", "c", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "e", "item", "I", "f", "()I", "start", "d", "end", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: rl$a */
    /* compiled from: AnnotatedString.kt */
    public static final class C3206a<T> {

        /* renamed from: a */
        public final T f17284a;

        /* renamed from: b */
        public final int f17285b;

        /* renamed from: c */
        public final int f17286c;

        /* renamed from: d */
        public final String f17287d;

        public C3206a(T t, int i, int i2, String str) {
            boolean z;
            vx2.m53591g(str, "tag");
            this.f17284a = t;
            this.f17285b = i;
            this.f17286c = i2;
            this.f17287d = str;
            if (i <= i2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        /* renamed from: a */
        public final T mo25440a() {
            return this.f17284a;
        }

        /* renamed from: b */
        public final int mo25441b() {
            return this.f17285b;
        }

        /* renamed from: c */
        public final int mo25442c() {
            return this.f17286c;
        }

        /* renamed from: d */
        public final int mo25443d() {
            return this.f17286c;
        }

        /* renamed from: e */
        public final T mo25444e() {
            return this.f17284a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3206a)) {
                return false;
            }
            C3206a aVar = (C3206a) obj;
            return vx2.m53586b(this.f17284a, aVar.f17284a) && this.f17285b == aVar.f17285b && this.f17286c == aVar.f17286c && vx2.m53586b(this.f17287d, aVar.f17287d);
        }

        /* renamed from: f */
        public final int mo25446f() {
            return this.f17285b;
        }

        /* renamed from: g */
        public final String mo25447g() {
            return this.f17287d;
        }

        public int hashCode() {
            T t = this.f17284a;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + this.f17285b) * 31) + this.f17286c) * 31) + this.f17287d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f17284a + ", start=" + this.f17285b + ", end=" + this.f17286c + ", tag=" + this.f17287d + ')';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: rl$b */
    /* compiled from: Comparisons.kt */
    public static final class C3207b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(Integer.valueOf(((C3206a) t).mo25446f()), Integer.valueOf(((C3206a) t2).mo25446f()));
        }
    }

    public C3205rl(String str, List<C3206a<c66>> list, List<C3206a<pl4>> list2, List<? extends C3206a<? extends Object>> list3) {
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        vx2.m53591g(list, "spanStyles");
        vx2.m53591g(list2, "paragraphStyles");
        vx2.m53591g(list3, "annotations");
        this.f17280a = str;
        this.f17281d = list;
        this.f17282e = list2;
        this.f17283g = list3;
        List<T> D0 = CollectionsKt___CollectionsKt.m47304D0(list2, new C3207b());
        int size = D0.size();
        int i = -1;
        int i2 = 0;
        while (i2 < size) {
            C3206a aVar = (C3206a) D0.get(i2);
            boolean z = true;
            if (aVar.mo25446f() >= i) {
                if (aVar.mo25443d() > this.f17280a.length() ? false : z) {
                    i = aVar.mo25443d();
                    i2++;
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + aVar.mo25446f() + ", " + aVar.mo25443d() + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    /* renamed from: a */
    public char mo25424a(int i) {
        return this.f17280a.charAt(i);
    }

    /* renamed from: b */
    public final List<C3206a<? extends Object>> mo25425b() {
        return this.f17283g;
    }

    /* renamed from: c */
    public int mo25426c() {
        return this.f17280a.length();
    }

    public final /* bridge */ char charAt(int i) {
        return mo25424a(i);
    }

    /* renamed from: d */
    public final List<C3206a<pl4>> mo25428d() {
        return this.f17282e;
    }

    /* renamed from: e */
    public final List<C3206a<c66>> mo25429e() {
        return this.f17281d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3205rl)) {
            return false;
        }
        C3205rl rlVar = (C3205rl) obj;
        if (vx2.m53586b(this.f17280a, rlVar.f17280a) && vx2.m53586b(this.f17281d, rlVar.f17281d) && vx2.m53586b(this.f17282e, rlVar.f17282e) && vx2.m53586b(this.f17283g, rlVar.f17283g)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo25431f() {
        return this.f17280a;
    }

    /* renamed from: g */
    public final List<C3206a<ry6>> mo25432g(int i, int i2) {
        boolean z;
        List<C3206a<? extends Object>> list = this.f17283g;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C3206a<? extends Object> aVar = list.get(i3);
            C3206a aVar2 = aVar;
            if (!(aVar2.mo25444e() instanceof ry6) || !C3278sl.m26952d(i, i2, aVar2.mo25446f(), aVar2.mo25443d())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<C3206a<l57>> mo25433h(int i, int i2) {
        boolean z;
        List<C3206a<? extends Object>> list = this.f17283g;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C3206a<? extends Object> aVar = list.get(i3);
            C3206a aVar2 = aVar;
            if (!(aVar2.mo25444e() instanceof l57) || !C3278sl.m26952d(i, i2, aVar2.mo25446f(), aVar2.mo25443d())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return (((((this.f17280a.hashCode() * 31) + this.f17281d.hashCode()) * 31) + this.f17282e.hashCode()) * 31) + this.f17283g.hashCode();
    }

    /* renamed from: i */
    public C3205rl subSequence(int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        } else if (i == 0 && i2 == this.f17280a.length()) {
            return this;
        } else {
            String substring = this.f17280a.substring(i, i2);
            vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C3205rl(substring, C3278sl.m26951c(this.f17281d, i, i2), C3278sl.m26951c(this.f17282e, i, i2), C3278sl.m26951c(this.f17283g, i, i2));
        }
    }

    /* renamed from: j */
    public final C3205rl mo25436j(long j) {
        return subSequence(ao6.m10682i(j), ao6.m10681h(j));
    }

    public final /* bridge */ int length() {
        return mo25426c();
    }

    public String toString() {
        return this.f17280a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3205rl(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? ck0.m33062j() : list, (i & 4) != 0 ? ck0.m33062j() : list2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3205rl(String str, List<C3206a<c66>> list, List<C3206a<pl4>> list2) {
        this(str, list, list2, ck0.m33062j());
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        vx2.m53591g(list, "spanStyles");
        vx2.m53591g(list2, "paragraphStyles");
    }
}
