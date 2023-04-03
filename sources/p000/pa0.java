package p000;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a\u0018\u0010\t\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\f\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\r"}, mo44877d2 = {"T", "Lns0;", "delegate", "Lna0;", "b", "Lma0;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "node", "Lr37;", "c", "Lzh1;", "handle", "a", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: pa0 */
/* compiled from: CancellableContinuation.kt */
public final class pa0 {
    /* renamed from: a */
    public static final void m70973a(ma0<?> ma0, zh1 zh1) {
        ma0.mo56166t(new ci1(zh1));
    }

    /* renamed from: b */
    public static final <T> na0<T> m70974b(ns0<? super T> ns0) {
        if (!(ns0 instanceof lh1)) {
            return new na0<>(ns0, 1);
        }
        na0<T> j = ((lh1) ns0).mo55898j();
        if (j != null) {
            if (!j.mo56405J()) {
                j = null;
            }
            if (j != null) {
                return j;
            }
        }
        return new na0<>(ns0, 2);
    }

    /* renamed from: c */
    public static final void m70975c(ma0<?> ma0, LockFreeLinkedListNode lockFreeLinkedListNode) {
        ma0.mo56166t(new yc5(lockFreeLinkedListNode));
    }
}
