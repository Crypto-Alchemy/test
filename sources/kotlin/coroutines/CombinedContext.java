package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001$B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\b\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0000H\u0002R\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!¨\u0006%"}, mo44877d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "Lkotlin/coroutines/CoroutineContext$a;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$a;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lfd2;)Ljava/lang/Object;", "minusKey", "other", "", "equals", "", "hashCode", "", "toString", "m", "element", "f", "context", "i", "left", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext$a;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)V", "Serialized", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CoroutineContextImpl.kt */
public final class CombinedContext implements CoroutineContext, Serializable {
    private final CoroutineContext.C6188a element;
    private final CoroutineContext left;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo44877d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "Lkotlin/coroutines/CoroutineContext;", "elements", "[Lkotlin/coroutines/CoroutineContext;", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "Companion", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: CoroutineContextImpl.kt */
    public static final class Serialized implements Serializable {
        public static final C6187a Companion = new C6187a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 0;
        private final CoroutineContext[] elements;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: kotlin.coroutines.CombinedContext$Serialized$a */
        /* compiled from: CoroutineContextImpl.kt */
        public static final class C6187a {
            public C6187a() {
            }

            public /* synthetic */ C6187a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Serialized(CoroutineContext[] coroutineContextArr) {
            vx2.m53591g(coroutineContextArr, "elements");
            this.elements = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            CoroutineContext coroutineContext = EmptyCoroutineContext.INSTANCE;
            for (CoroutineContext plus : coroutineContextArr) {
                coroutineContext = coroutineContext.plus(plus);
            }
            return coroutineContext;
        }

        public final CoroutineContext[] getElements() {
            return this.elements;
        }
    }

    public CombinedContext(CoroutineContext coroutineContext, CoroutineContext.C6188a aVar) {
        vx2.m53591g(coroutineContext, "left");
        vx2.m53591g(aVar, "element");
        this.left = coroutineContext;
        this.element = aVar;
    }

    private final Object writeReplace() {
        boolean z;
        int m = mo45145m();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[m];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(r37.f33317a, new CombinedContext$writeReplace$1(coroutineContextArr, ref$IntRef));
        if (ref$IntRef.element == m) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.mo45145m() != mo45145m() || !combinedContext.mo45144i(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo45142f(CoroutineContext.C6188a aVar) {
        return vx2.m53586b(get(aVar.getKey()), aVar);
    }

    public <R> R fold(R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
        vx2.m53591g(fd2, "operation");
        return fd2.invoke(this.left.fold(r, fd2), this.element);
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        vx2.m53591g(bVar, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e = combinedContext.element.get(bVar);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.get(bVar);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    /* renamed from: i */
    public final boolean mo45144i(CombinedContext combinedContext) {
        while (mo45142f(combinedContext.element)) {
            CoroutineContext coroutineContext = combinedContext.left;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else {
                vx2.m53589e(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return mo45142f((CoroutineContext.C6188a) coroutineContext);
            }
        }
        return false;
    }

    /* renamed from: m */
    public final int mo45145m() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.left;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else {
                combinedContext = null;
            }
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        vx2.m53591g(bVar, "key");
        if (this.element.get(bVar) != null) {
            return this.left;
        }
        CoroutineContext minusKey = this.left.minusKey(bVar);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == EmptyCoroutineContext.INSTANCE) {
            return this.element;
        }
        return new CombinedContext(minusKey, this.element);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.m47417a(this, coroutineContext);
    }

    public String toString() {
        return '[' + ((String) fold("", CombinedContext$toString$1.INSTANCE)) + ']';
    }
}
