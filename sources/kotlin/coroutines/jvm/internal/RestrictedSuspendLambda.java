package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, mo44877d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Ltd2;", "", "", "toString", "", "arity", "I", "getArity", "()I", "Lns0;", "completion", "<init>", "(ILns0;)V", "(I)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ContinuationImpl.kt */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements td2<Object> {
    private final int arity;

    public RestrictedSuspendLambda(int i, ns0<Object> ns0) {
        super(ns0);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h = ua5.m52733h(this);
        vx2.m53590f(h, "renderLambdaToString(this)");
        return h;
    }

    public RestrictedSuspendLambda(int i) {
        this(i, (ns0<Object>) null);
    }
}
