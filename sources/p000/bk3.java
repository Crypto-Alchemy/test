package p000;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, mo44877d2 = {"Lbk3;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "B", "", "A", "()Z", "isEmpty", "t", "isRemoved", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: bk3 */
/* compiled from: LockFreeLinkedList.kt */
public class bk3 extends LockFreeLinkedListNode {
    /* renamed from: A */
    public final boolean mo50612A() {
        if (mo55691n() == this) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final Void mo50613B() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    /* renamed from: t */
    public boolean mo50614t() {
        return false;
    }

    /* renamed from: v */
    public /* bridge */ /* synthetic */ boolean mo50615v() {
        return ((Boolean) mo50613B()).booleanValue();
    }
}
