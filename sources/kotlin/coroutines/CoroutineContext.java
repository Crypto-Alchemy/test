package kotlin.coroutines;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¨\u0006\u0013"}, mo44877d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/coroutines/CoroutineContext$a;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$a;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lfd2;)Ljava/lang/Object;", "context", "plus", "minusKey", "a", "b", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CoroutineContext.kt */
public interface CoroutineContext {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CoroutineContext.kt */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static CoroutineContext m47417a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            vx2.m53591g(coroutineContext2, "context");
            if (coroutineContext2 == EmptyCoroutineContext.INSTANCE) {
                return coroutineContext;
            }
            return (CoroutineContext) coroutineContext2.fold(coroutineContext, CoroutineContext$plus$1.INSTANCE);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo44877d2 = {"Lkotlin/coroutines/CoroutineContext$a;", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$a;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.CoroutineContext$a */
    /* compiled from: CoroutineContext.kt */
    public interface C6188a extends CoroutineContext {

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: kotlin.coroutines.CoroutineContext$a$a */
        /* compiled from: CoroutineContext.kt */
        public static final class C6189a {
            /* renamed from: a */
            public static <R> R m47418a(C6188a aVar, R r, fd2<? super R, ? super C6188a, ? extends R> fd2) {
                vx2.m53591g(fd2, "operation");
                return fd2.invoke(r, aVar);
            }

            /* renamed from: b */
            public static <E extends C6188a> E m47419b(C6188a aVar, C6190b<E> bVar) {
                vx2.m53591g(bVar, "key");
                if (!vx2.m53586b(aVar.getKey(), bVar)) {
                    return null;
                }
                vx2.m53589e(aVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return aVar;
            }

            /* renamed from: c */
            public static CoroutineContext m47420c(C6188a aVar, C6190b<?> bVar) {
                vx2.m53591g(bVar, "key");
                if (vx2.m53586b(aVar.getKey(), bVar)) {
                    return EmptyCoroutineContext.INSTANCE;
                }
                return aVar;
            }

            /* renamed from: d */
            public static CoroutineContext m47421d(C6188a aVar, CoroutineContext coroutineContext) {
                vx2.m53591g(coroutineContext, "context");
                return DefaultImpls.m47417a(aVar, coroutineContext);
            }
        }

        <E extends C6188a> E get(C6190b<E> bVar);

        C6190b<?> getKey();
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo44877d2 = {"Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/CoroutineContext$a;", "E", "", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.CoroutineContext$b */
    /* compiled from: CoroutineContext.kt */
    public interface C6190b<E extends C6188a> {
    }

    <R> R fold(R r, fd2<? super R, ? super C6188a, ? extends R> fd2);

    <E extends C6188a> E get(C6190b<E> bVar);

    CoroutineContext minusKey(C6190b<?> bVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
