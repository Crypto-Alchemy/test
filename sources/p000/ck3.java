package p000;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001\" \u0010\t\u001a\u00020\u00008\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006\" \u0010\f\u001a\u00020\u00008\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0005\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006*\n\u0010\r\"\u00020\u00002\u00020\u0000*\u001c\u0010\u000f\u001a\u0004\b\u0000\u0010\u000e\"\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0000*\f\b\u0002\u0010\u0010\"\u00020\u00012\u00020\u0001*\n\u0010\u0012\"\u00020\u00112\u00020\u0011*\u001c\u0010\u0013\u001a\u0004\b\u0000\u0010\u000e\"\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0000¨\u0006\u0014"}, mo44877d2 = {"", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "b", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "getCONDITION_FALSE$annotations", "()V", "CONDITION_FALSE", "getLIST_EMPTY", "getLIST_EMPTY$annotations", "LIST_EMPTY", "AbstractAtomicDesc", "T", "AddLastDesc", "Node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "PrepareOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: ck3 */
/* compiled from: LockFreeLinkedList.kt */
public final class ck3 {

    /* renamed from: a */
    public static final Object f37162a = new xj6("CONDITION_FALSE");

    /* renamed from: b */
    public static final Object f37163b = new xj6("LIST_EMPTY");

    /* renamed from: a */
    public static final Object m56454a() {
        return f37162a;
    }

    /* renamed from: b */
    public static final LockFreeLinkedListNode m56455b(Object obj) {
        ad5 ad5;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        if (obj instanceof ad5) {
            ad5 = (ad5) obj;
        } else {
            ad5 = null;
        }
        if (ad5 == null || (lockFreeLinkedListNode = ad5.f36433a) == null) {
            return (LockFreeLinkedListNode) obj;
        }
        return lockFreeLinkedListNode;
    }
}
