package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b0\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0015\u0010\fJ'\u0010\u0016\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0001¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b$\u0010 J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0015\u0010-\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0015\u0010/\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010 ¨\u00063"}, mo44877d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "Lad5;", "y", "()Lad5;", "Lkotlinx/coroutines/internal/Node;", "current", "l", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "Lr37;", "m", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lgi4;", "op", "k", "(Lgi4;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "node", "", "j", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "h", "i", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "condAdd", "", "z", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;)I", "v", "()Z", "x", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "q", "()V", "s", "w", "", "toString", "()Ljava/lang/String;", "t", "isRemoved", "n", "()Ljava/lang/Object;", "o", "nextNode", "p", "prevNode", "<init>", "a", "b", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: LockFreeLinkedList.kt */
public class LockFreeLinkedListNode {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40469a;

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40470d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40471e;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, mo44877d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Ljs;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "Lr37;", "h", "b", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "newNode", "c", "oldNext", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$a */
    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class C7796a extends C7311js<LockFreeLinkedListNode> {

        /* renamed from: b */
        public final LockFreeLinkedListNode f40472b;

        /* renamed from: c */
        public LockFreeLinkedListNode f40473c;

        public C7796a(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f40472b = lockFreeLinkedListNode;
        }

        /* renamed from: h */
        public void mo52780d(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            boolean z;
            LockFreeLinkedListNode lockFreeLinkedListNode2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                lockFreeLinkedListNode2 = this.f40472b;
            } else {
                lockFreeLinkedListNode2 = this.f40473c;
            }
            if (lockFreeLinkedListNode2 != null && C2265f6.m16607a(LockFreeLinkedListNode.f40469a, lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f40472b;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f40473c;
                vx2.m53588d(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.mo55690m(lockFreeLinkedListNode4);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo44877d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "Lgi4;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$b */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C7797b extends gi4 {
    }

    static {
        Class<Object> cls = Object.class;
        Class<LockFreeLinkedListNode> cls2 = LockFreeLinkedListNode.class;
        f40469a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f40470d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f40471e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: h */
    public final void mo55685h(LockFreeLinkedListNode lockFreeLinkedListNode) {
        do {
        } while (!mo55693p().mo55686i(lockFreeLinkedListNode, this));
    }

    /* renamed from: i */
    public final boolean mo55686i(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
        f40470d.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40469a;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        if (!C2265f6.m16607a(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
            return false;
        }
        lockFreeLinkedListNode.mo55690m(lockFreeLinkedListNode2);
        return true;
    }

    /* renamed from: j */
    public final boolean mo55687j(LockFreeLinkedListNode lockFreeLinkedListNode) {
        f40470d.lazySet(lockFreeLinkedListNode, this);
        f40469a.lazySet(lockFreeLinkedListNode, this);
        while (mo55691n() == this) {
            if (C2265f6.m16607a(f40469a, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.mo55690m(this);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: gi4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.LockFreeLinkedListNode} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (p000.C2265f6.m16607a(f40469a, r3, r2, ((p000.ad5) r4).f36433a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode mo55688k(p000.gi4 r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f40470d
            boolean r0 = p000.C2265f6.m16607a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo50614t()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof p000.gi4
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            gi4 r0 = (p000.gi4) r0
            boolean r0 = r8.mo51928b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            gi4 r4 = (p000.gi4) r4
            r4.mo51929c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof p000.ad5
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f40469a
            ad5 r4 = (p000.ad5) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.f36433a
            boolean r2 = p000.C2265f6.m16607a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.mo55688k(gi4):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    /* renamed from: l */
    public final LockFreeLinkedListNode mo55689l(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo50614t()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
        }
        return lockFreeLinkedListNode;
    }

    /* renamed from: m */
    public final void mo55690m(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
            if (mo55691n() != lockFreeLinkedListNode) {
                return;
            }
        } while (!C2265f6.m16607a(f40470d, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (mo50614t()) {
            lockFreeLinkedListNode.mo55688k((gi4) null);
        }
    }

    /* renamed from: n */
    public final Object mo55691n() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof gi4)) {
                return obj;
            }
            ((gi4) obj).mo51929c(this);
        }
    }

    /* renamed from: o */
    public final LockFreeLinkedListNode mo55692o() {
        return ck3.m56455b(mo55691n());
    }

    /* renamed from: p */
    public final LockFreeLinkedListNode mo55693p() {
        LockFreeLinkedListNode k = mo55688k((gi4) null);
        if (k == null) {
            return mo55689l((LockFreeLinkedListNode) this._prev);
        }
        return k;
    }

    /* renamed from: q */
    public final void mo55694q() {
        ((ad5) mo55691n()).f36433a.mo55695s();
    }

    /* renamed from: s */
    public final void mo55695s() {
        LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (true) {
            Object n = lockFreeLinkedListNode.mo55691n();
            if (n instanceof ad5) {
                lockFreeLinkedListNode = ((ad5) n).f36433a;
            } else {
                lockFreeLinkedListNode.mo55688k((gi4) null);
                return;
            }
        }
    }

    /* renamed from: t */
    public boolean mo50614t() {
        return mo55691n() instanceof ad5;
    }

    public String toString() {
        return new LockFreeLinkedListNode$toString$1(this) + '@' + b31.m55723b(this);
    }

    /* renamed from: v */
    public boolean mo50615v() {
        if (mo55697x() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final LockFreeLinkedListNode mo55696w() {
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) mo55691n();
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.mo50615v()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.mo55694q();
        }
    }

    /* renamed from: x */
    public final LockFreeLinkedListNode mo55697x() {
        Object n;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            n = mo55691n();
            if (n instanceof ad5) {
                return ((ad5) n).f36433a;
            }
            if (n == this) {
                return (LockFreeLinkedListNode) n;
            }
            lockFreeLinkedListNode = (LockFreeLinkedListNode) n;
        } while (!C2265f6.m16607a(f40469a, this, n, lockFreeLinkedListNode.mo55698y()));
        lockFreeLinkedListNode.mo55688k((gi4) null);
        return null;
    }

    /* renamed from: y */
    public final ad5 mo55698y() {
        ad5 ad5 = (ad5) this._removedRef;
        if (ad5 != null) {
            return ad5;
        }
        ad5 ad52 = new ad5(this);
        f40471e.lazySet(this, ad52);
        return ad52;
    }

    /* renamed from: z */
    public final int mo55699z(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, C7796a aVar) {
        f40470d.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40469a;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        aVar.f40473c = lockFreeLinkedListNode2;
        if (!C2265f6.m16607a(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode2, aVar)) {
            return 0;
        }
        if (aVar.mo51929c(this) == null) {
            return 1;
        }
        return 2;
    }
}
