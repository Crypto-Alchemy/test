package p000;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\b\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lad5;", "", "", "toString", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "a", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "ref", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ad5 */
/* compiled from: LockFreeLinkedList.kt */
public final class ad5 {

    /* renamed from: a */
    public final LockFreeLinkedListNode f36433a;

    public ad5(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f36433a = lockFreeLinkedListNode;
    }

    public String toString() {
        return "Removed[" + this.f36433a + ']';
    }
}
