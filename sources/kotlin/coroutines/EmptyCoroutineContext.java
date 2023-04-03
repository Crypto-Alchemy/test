package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002J\u0014\u0010\u0014\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001a\u001a\u00020\u00198\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo44877d2 = {"Lkotlin/coroutines/EmptyCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "Lkotlin/coroutines/CoroutineContext$a;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$a;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lfd2;)Ljava/lang/Object;", "context", "plus", "minusKey", "", "hashCode", "", "toString", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CoroutineContextImpl.kt */
public final class EmptyCoroutineContext implements CoroutineContext, Serializable {
    public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public <R> R fold(R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
        vx2.m53591g(fd2, "operation");
        return r;
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        vx2.m53591g(bVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        vx2.m53591g(bVar, "key");
        return this;
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        vx2.m53591g(coroutineContext, "context");
        return coroutineContext;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
