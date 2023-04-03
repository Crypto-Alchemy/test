package p000;

import kotlin.Metadata;
import kotlin.Result;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, mo44877d2 = {"", "exception", "", "a", "Lkotlin/Result;", "Lr37;", "b", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: hg5 */
/* compiled from: Result.kt */
public final class hg5 {
    /* renamed from: a */
    public static final Object m45198a(Throwable th) {
        vx2.m53591g(th, "exception");
        return new Result.Failure(th);
    }

    /* renamed from: b */
    public static final void m45199b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
