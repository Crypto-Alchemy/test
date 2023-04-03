package p000;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C6175a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: nq */
/* compiled from: ArrayMap.kt */
public final class C9003nq<T> extends C7913mq<T> {

    /* renamed from: e */
    public static final C9004a f43537e = new C9004a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public Object[] f43538a;

    /* renamed from: d */
    public int f43539d;

    /* renamed from: nq$a */
    /* compiled from: ArrayMap.kt */
    public static final class C9004a {
        public C9004a() {
        }

        public /* synthetic */ C9004a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: nq$b */
    /* compiled from: ArrayMap.kt */
    public static final class C9005b extends C6175a<T> {

        /* renamed from: e */
        public int f43540e = -1;

        /* renamed from: g */
        public final /* synthetic */ C9003nq<T> f43541g;

        public C9005b(C9003nq<T> nqVar) {
            this.f43541g = nqVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo29842a() {
            /*
                r2 = this;
            L_0x0000:
                int r0 = r2.f43540e
                int r0 = r0 + 1
                r2.f43540e = r0
                nq<T> r1 = r2.f43541g
                java.lang.Object[] r1 = r1.f43538a
                int r1 = r1.length
                if (r0 >= r1) goto L_0x001b
                nq<T> r0 = r2.f43541g
                java.lang.Object[] r0 = r0.f43538a
                int r1 = r2.f43540e
                r0 = r0[r1]
                if (r0 == 0) goto L_0x0000
            L_0x001b:
                int r0 = r2.f43540e
                nq<T> r1 = r2.f43541g
                java.lang.Object[] r1 = r1.f43538a
                int r1 = r1.length
                if (r0 < r1) goto L_0x002a
                r2.mo45012b()
                goto L_0x003c
            L_0x002a:
                nq<T> r0 = r2.f43541g
                java.lang.Object[] r0 = r0.f43538a
                int r1 = r2.f43540e
                r0 = r0[r1]
                java.lang.String r1 = "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"
                p000.vx2.m53589e(r0, r1)
                r2.mo45013c(r0)
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C9003nq.C9005b.mo29842a():void");
        }
    }

    public C9003nq(Object[] objArr, int i) {
        super((DefaultConstructorMarker) null);
        this.f43538a = objArr;
        this.f43539d = i;
    }

    /* renamed from: e */
    public int mo56310e() {
        return this.f43539d;
    }

    public T get(int i) {
        return ArraysKt___ArraysKt.m47263O(this.f43538a, i);
    }

    public Iterator<T> iterator() {
        return new C9005b(this);
    }

    /* renamed from: j */
    public void mo56313j(int i, T t) {
        vx2.m53591g(t, "value");
        mo62780n(i);
        if (this.f43538a[i] == null) {
            this.f43539d = mo56310e() + 1;
        }
        this.f43538a[i] = t;
    }

    /* renamed from: n */
    public final void mo62780n(int i) {
        Object[] objArr = this.f43538a;
        if (objArr.length <= i) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            vx2.m53590f(copyOf, "copyOf(this, newSize)");
            this.f43538a = copyOf;
        }
    }

    public C9003nq() {
        this(new Object[20], 0);
    }
}
