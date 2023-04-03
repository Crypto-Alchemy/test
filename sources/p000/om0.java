package p000;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\u000b\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"T", "Lkotlin/Result;", "Lkotlin/Function1;", "", "Lr37;", "onCancellation", "", "c", "(Ljava/lang/Object;Lrc2;)Ljava/lang/Object;", "Lma0;", "caller", "b", "(Ljava/lang/Object;Lma0;)Ljava/lang/Object;", "state", "Lns0;", "uCont", "a", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: om0 */
/* compiled from: CompletionState.kt */
public final class om0 {
    /* renamed from: a */
    public static final <T> Object m70399a(Object obj, ns0<? super T> ns0) {
        if (!(obj instanceof lm0)) {
            return Result.m75635constructorimpl(obj);
        }
        Result.C6167a aVar = Result.Companion;
        return Result.m75635constructorimpl(hg5.m45198a(((lm0) obj).f40642a));
    }

    /* renamed from: b */
    public static final <T> Object m70400b(Object obj, ma0<?> ma0) {
        Throwable r4 = Result.m75638exceptionOrNullimpl(obj);
        if (r4 == null) {
            return obj;
        }
        return new lm0(r4, false, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final <T> Object m70401c(Object obj, rc2<? super Throwable, r37> rc2) {
        Throwable r0 = Result.m75638exceptionOrNullimpl(obj);
        if (r0 != null) {
            return new lm0(r0, false, 2, (DefaultConstructorMarker) null);
        }
        if (rc2 != null) {
            return new mm0(obj, rc2);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m70402d(Object obj, rc2 rc2, int i, Object obj2) {
        if ((i & 1) != 0) {
            rc2 = null;
        }
        return m70401c(obj, rc2);
    }
}
