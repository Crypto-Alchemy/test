package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w46 */
/* compiled from: SmartSet.kt */
public final class w46<T> extends AbstractSet<T> {

    /* renamed from: e */
    public static final C9484b f45438e = new C9484b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public Object f45439a;

    /* renamed from: d */
    public int f45440d;

    /* renamed from: w46$a */
    /* compiled from: SmartSet.kt */
    public static final class C9483a<T> implements Iterator<T>, a93 {

        /* renamed from: a */
        public final Iterator<T> f45441a;

        public C9483a(T[] tArr) {
            vx2.m53591g(tArr, "array");
            this.f45441a = C6118jq.m46703a(tArr);
        }

        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f45441a.hasNext();
        }

        public T next() {
            return this.f45441a.next();
        }
    }

    /* renamed from: w46$b */
    /* compiled from: SmartSet.kt */
    public static final class C9484b {
        public C9484b() {
        }

        public /* synthetic */ C9484b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T> w46<T> mo66631a() {
            return new w46<>((DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final <T> w46<T> mo66632b(Collection<? extends T> collection) {
            vx2.m53591g(collection, "set");
            w46<T> w46 = new w46<>((DefaultConstructorMarker) null);
            w46.addAll(collection);
            return w46;
        }
    }

    /* renamed from: w46$c */
    /* compiled from: SmartSet.kt */
    public static final class C9485c<T> implements Iterator<T>, a93 {

        /* renamed from: a */
        public final T f45442a;

        /* renamed from: d */
        public boolean f45443d = true;

        public C9485c(T t) {
            this.f45442a = t;
        }

        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f45443d;
        }

        public T next() {
            if (this.f45443d) {
                this.f45443d = false;
                return this.f45442a;
            }
            throw new NoSuchElementException();
        }
    }

    public w46() {
    }

    public /* synthetic */ w46(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: e */
    public static final <T> w46<T> m73463e() {
        return f45438e.mo66631a();
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(T r5) {
        /*
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r4.f45439a = r5
            goto L_0x0078
        L_0x000a:
            int r0 = r4.size()
            r2 = 0
            if (r0 != r1) goto L_0x0026
            java.lang.Object r0 = r4.f45439a
            boolean r0 = p000.vx2.m53586b(r0, r5)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r4.f45439a
            r0[r2] = r3
            r0[r1] = r5
            r4.f45439a = r0
            goto L_0x0078
        L_0x0026:
            int r0 = r4.size()
            r3 = 5
            if (r0 >= r3) goto L_0x0066
            java.lang.Object r0 = r4.f45439a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            p000.vx2.m53589e(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = kotlin.collections.ArraysKt___ArraysKt.m47249D(r0, r5)
            if (r3 == 0) goto L_0x003d
            return r2
        L_0x003d:
            int r2 = r4.size()
            r3 = 4
            if (r2 != r3) goto L_0x0051
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.util.LinkedHashSet r0 = p000.ny5.m49096f(r0)
            r0.add(r5)
            goto L_0x0063
        L_0x0051:
            int r2 = r4.size()
            int r2 = r2 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(this, newSize)"
            p000.vx2.m53590f(r0, r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r5
        L_0x0063:
            r4.f45439a = r0
            goto L_0x0078
        L_0x0066:
            java.lang.Object r0 = r4.f45439a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            p000.vx2.m53589e(r0, r3)
            java.util.Set r0 = p000.t07.m52026e(r0)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L_0x0078
            return r2
        L_0x0078:
            int r5 = r4.size()
            int r5 = r5 + r1
            r4.mo66625k(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w46.add(java.lang.Object):boolean");
    }

    public void clear() {
        this.f45439a = null;
        mo66625k(0);
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return vx2.m53586b(this.f45439a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f45439a;
            vx2.m53589e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ArraysKt___ArraysKt.m47249D((Object[]) obj2, obj);
        }
        Object obj3 = this.f45439a;
        vx2.m53589e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new C9485c(this.f45439a);
        }
        if (size() < 5) {
            Object obj = this.f45439a;
            vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new C9483a((Object[]) obj);
        }
        Object obj2 = this.f45439a;
        vx2.m53589e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return t07.m52026e(obj2).iterator();
    }

    /* renamed from: j */
    public int mo66624j() {
        return this.f45440d;
    }

    /* renamed from: k */
    public void mo66625k(int i) {
        this.f45440d = i;
    }

    public final /* bridge */ int size() {
        return mo66624j();
    }
}
