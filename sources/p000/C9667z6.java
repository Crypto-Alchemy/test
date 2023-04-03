package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p000.iu5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00015B)\u0012 \u00107\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u000103j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`4¢\u0006\u0004\bO\u0010PJ\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\r\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J$\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0$2\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010\u0019J\u0019\u0010'\u001a\u0004\u0018\u00010\u00172\u0006\u0010&\u001a\u00020\u001aH\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020!2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R.\u00107\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u000103j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`48\u0004X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010=\u001a\u0002088\u0004X\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020!8BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u0002008BX\u0004¢\u0006\u0006\u001a\u0004\bA\u00102R\u0014\u0010D\u001a\u00020!8$X¤\u0004¢\u0006\u0006\u001a\u0004\bC\u0010?R\u0014\u0010F\u001a\u00020!8$X¤\u0004¢\u0006\u0006\u001a\u0004\bE\u0010?R\u001a\u0010I\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0011\u0010L\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\u0001\u0010?R\u0014\u0010N\u001a\u0002008TX\u0004¢\u0006\u0006\u001a\u0004\bM\u00102\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006Q"}, mo44877d2 = {"Lz6;", "E", "Liu5;", "Lsh0;", "closed", "", "m", "(Lsh0;)Ljava/lang/Throwable;", "element", "Lr37;", "y", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "Lns0;", "n", "(Lns0;Ljava/lang/Object;Lsh0;)V", "cause", "p", "(Ljava/lang/Throwable;)V", "l", "(Lsh0;)V", "", "e", "()I", "", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lgu5;", "B", "()Lgu5;", "Lg85;", "x", "(Ljava/lang/Object;)Lg85;", "u", "", "offer", "(Ljava/lang/Object;)Z", "Lqd0;", "o", "send", "f", "(Lgu5;)Ljava/lang/Object;", "z", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "w", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "A", "()Lg85;", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "a", "Lrc2;", "onUndeliveredElement", "Lbk3;", "d", "Lbk3;", "j", "()Lbk3;", "queue", "t", "()Z", "isFullImpl", "k", "queueDebugStateString", "q", "isBufferAlwaysFull", "s", "isBufferFull", "i", "()Lsh0;", "closedForSend", "h", "closedForReceive", "isClosedForSend", "g", "bufferDebugString", "<init>", "(Lrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: z6 */
/* compiled from: AbstractChannel.kt */
public abstract class C9667z6<E> implements iu5<E> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f46333e = AtomicReferenceFieldUpdater.newUpdater(C9667z6.class, Object.class, "onCloseHandler");

    /* renamed from: a */
    public final rc2<E, r37> f46334a;

    /* renamed from: d */
    public final bk3 f46335d = new bk3();
    private volatile /* synthetic */ Object onCloseHandler = null;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lz6$a;", "E", "Lgu5;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "otherOp", "Lxj6;", "D", "Lr37;", "A", "Lsh0;", "closed", "C", "", "toString", "g", "Ljava/lang/Object;", "element", "", "B", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: z6$a */
    /* compiled from: AbstractChannel.kt */
    public static final class C9668a<E> extends gu5 {

        /* renamed from: g */
        public final E f46336g;

        public C9668a(E e) {
            this.f46336g = e;
        }

        /* renamed from: A */
        public void mo52015A() {
        }

        /* renamed from: B */
        public Object mo52016B() {
            return this.f46336g;
        }

        /* renamed from: C */
        public void mo52017C(sh0<?> sh0) {
        }

        /* renamed from: D */
        public xj6 mo52018D(LockFreeLinkedListNode.C7797b bVar) {
            return oa0.f43593a;
        }

        public String toString() {
            return "SendBuffered@" + b31.m55723b(this) + '(' + this.f46336g + ')';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, mo44877d2 = {"z6$b", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "i", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: z6$b */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C9669b extends LockFreeLinkedListNode.C7796a {

        /* renamed from: d */
        public final /* synthetic */ C9667z6 f46337d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9669b(LockFreeLinkedListNode lockFreeLinkedListNode, C9667z6 z6Var) {
            super(lockFreeLinkedListNode);
            this.f46337d = z6Var;
        }

        /* renamed from: i */
        public Object mo52783g(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f46337d.mo51262s()) {
                return null;
            }
            return ck3.m56454a();
        }
    }

    public C9667z6(rc2<? super E, r37> rc2) {
        this.f46334a = rc2;
    }

    /* renamed from: A */
    public g85<E> mo55573A() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode x;
        bk3 bk3 = this.f46335d;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) bk3.mo55691n();
            if (lockFreeLinkedListNode != bk3 && (lockFreeLinkedListNode instanceof g85)) {
                if (((((g85) lockFreeLinkedListNode) instanceof sh0) && !lockFreeLinkedListNode.mo50614t()) || (x = lockFreeLinkedListNode.mo55697x()) == null) {
                    break;
                }
                x.mo55695s();
            }
        }
        lockFreeLinkedListNode = null;
        return (g85) lockFreeLinkedListNode;
    }

    /* renamed from: B */
    public final gu5 mo67220B() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode x;
        bk3 bk3 = this.f46335d;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) bk3.mo55691n();
            if (lockFreeLinkedListNode != bk3 && (lockFreeLinkedListNode instanceof gu5)) {
                if (((((gu5) lockFreeLinkedListNode) instanceof sh0) && !lockFreeLinkedListNode.mo50614t()) || (x = lockFreeLinkedListNode.mo55697x()) == null) {
                    break;
                }
                x.mo55695s();
            }
        }
        lockFreeLinkedListNode = null;
        return (gu5) lockFreeLinkedListNode;
    }

    /* renamed from: E */
    public final boolean mo52176E() {
        if (mo67223i() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo67221e() {
        bk3 bk3 = this.f46335d;
        int i = 0;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) bk3.mo55691n(); !vx2.m53586b(lockFreeLinkedListNode, bk3); lockFreeLinkedListNode = lockFreeLinkedListNode.mo55692o()) {
            if (lockFreeLinkedListNode instanceof LockFreeLinkedListNode) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public Object mo51259f(gu5 gu5) {
        boolean z;
        LockFreeLinkedListNode p;
        if (mo51261q()) {
            bk3 bk3 = this.f46335d;
            do {
                p = bk3.mo55693p();
                if (p instanceof g85) {
                    return p;
                }
            } while (!p.mo55686i(gu5, bk3));
            return null;
        }
        bk3 bk32 = this.f46335d;
        C9669b bVar = new C9669b(gu5, this);
        while (true) {
            LockFreeLinkedListNode p2 = bk32.mo55693p();
            if (!(p2 instanceof g85)) {
                int z2 = p2.mo55699z(gu5, bk32, bVar);
                z = true;
                if (z2 != 1) {
                    if (z2 == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return p2;
            }
        }
        if (!z) {
            return C9327t5.f44642e;
        }
        return null;
    }

    /* renamed from: g */
    public String mo51260g() {
        return "";
    }

    /* renamed from: h */
    public final sh0<?> mo67222h() {
        sh0<?> sh0;
        LockFreeLinkedListNode o = this.f46335d.mo55692o();
        if (o instanceof sh0) {
            sh0 = (sh0) o;
        } else {
            sh0 = null;
        }
        if (sh0 == null) {
            return null;
        }
        mo67226l(sh0);
        return sh0;
    }

    /* renamed from: i */
    public final sh0<?> mo67223i() {
        sh0<?> sh0;
        LockFreeLinkedListNode p = this.f46335d.mo55693p();
        if (p instanceof sh0) {
            sh0 = (sh0) p;
        } else {
            sh0 = null;
        }
        if (sh0 == null) {
            return null;
        }
        mo67226l(sh0);
        return sh0;
    }

    /* renamed from: j */
    public final bk3 mo67224j() {
        return this.f46335d;
    }

    /* renamed from: k */
    public final String mo67225k() {
        String str;
        LockFreeLinkedListNode o = this.f46335d.mo55692o();
        if (o == this.f46335d) {
            return "EmptyQueue";
        }
        if (o instanceof sh0) {
            str = o.toString();
        } else if (o instanceof x75) {
            str = "ReceiveQueued";
        } else if (o instanceof gu5) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + o;
        }
        LockFreeLinkedListNode p = this.f46335d.mo55693p();
        if (p == o) {
            return str;
        }
        String str2 = str + ",queueSize=" + mo67221e();
        if (!(p instanceof sh0)) {
            return str2;
        }
        return str2 + ",closedForSend=" + p;
    }

    /* renamed from: l */
    public final void mo67226l(sh0<?> sh0) {
        x75 x75;
        Object b = ou2.m70789b((Object) null, 1, (DefaultConstructorMarker) null);
        while (true) {
            LockFreeLinkedListNode p = sh0.mo55693p();
            if (p instanceof x75) {
                x75 = (x75) p;
            } else {
                x75 = null;
            }
            if (x75 == null) {
                break;
            } else if (!x75.mo50615v()) {
                x75.mo55694q();
            } else {
                b = ou2.m70790c(b, x75);
            }
        }
        if (b != null) {
            if (!(b instanceof ArrayList)) {
                ((x75) b).mo55586C(sh0);
            } else {
                ArrayList arrayList = (ArrayList) b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((x75) arrayList.get(size)).mo55586C(sh0);
                }
            }
        }
        mo65441w(sh0);
    }

    /* renamed from: m */
    public final Throwable mo67227m(sh0<?> sh0) {
        mo67226l(sh0);
        return sh0.mo65853I();
    }

    /* renamed from: n */
    public final void mo67228n(ns0<?> ns0, E e, sh0<?> sh0) {
        UndeliveredElementException d;
        mo67226l(sh0);
        Throwable I = sh0.mo65853I();
        rc2<E, r37> rc2 = this.f46334a;
        if (rc2 == null || (d = OnUndeliveredElementKt.m63494d(rc2, e, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            Result.C6167a aVar = Result.Companion;
            ns0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(I)));
            return;
        }
        ru1.m51326a(d, I);
        Result.C6167a aVar2 = Result.Companion;
        ns0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(d)));
    }

    /* renamed from: o */
    public final Object mo52181o(E e) {
        Object v = mo51263v(e);
        if (v == C9327t5.f44639b) {
            return qd0.f44172b.mo65452c(r37.f33317a);
        }
        if (v == C9327t5.f44640c) {
            sh0<?> i = mo67223i();
            if (i == null) {
                return qd0.f44172b.mo65451b();
            }
            return qd0.f44172b.mo65450a(mo67227m(i));
        } else if (v instanceof sh0) {
            return qd0.f44172b.mo65450a(mo67227m((sh0) v));
        } else {
            throw new IllegalStateException(("trySend returned " + v).toString());
        }
    }

    public boolean offer(E e) {
        UndeliveredElementException d;
        try {
            return iu5.C7226a.m59121b(this, e);
        } catch (Throwable th) {
            rc2<E, r37> rc2 = this.f46334a;
            if (rc2 == null || (d = OnUndeliveredElementKt.m63494d(rc2, e, (UndeliveredElementException) null, 2, (Object) null)) == null) {
                throw th;
            }
            ru1.m51326a(d, th);
            throw d;
        }
    }

    /* renamed from: p */
    public final void mo67229p(Throwable th) {
        xj6 xj6;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (xj6 = C9327t5.f44643f) && C2265f6.m16607a(f46333e, this, obj, xj6)) {
            ((rc2) t07.m52027f(obj, 1)).invoke(th);
        }
    }

    /* renamed from: q */
    public abstract boolean mo51261q();

    /* renamed from: s */
    public abstract boolean mo51262s();

    /* renamed from: t */
    public final boolean mo67230t() {
        if ((this.f46335d.mo55692o() instanceof g85) || !mo51262s()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return b31.m55722a(this) + '@' + b31.m55723b(this) + '{' + mo67225k() + '}' + mo51260g();
    }

    /* renamed from: u */
    public final Object mo26027u(E e, ns0<? super r37> ns0) {
        if (mo51263v(e) == C9327t5.f44639b) {
            return r37.f33317a;
        }
        Object y = mo67233y(e, ns0);
        if (y == wx2.m54101d()) {
            return y;
        }
        return r37.f33317a;
    }

    /* renamed from: v */
    public Object mo51263v(E e) {
        g85 A;
        do {
            A = mo55573A();
            if (A == null) {
                return C9327t5.f44640c;
            }
        } while (A.mo51884f(e, (LockFreeLinkedListNode.C7797b) null) == null);
        A.mo51883e(e);
        return A.mo51882b();
    }

    /* renamed from: w */
    public void mo65441w(LockFreeLinkedListNode lockFreeLinkedListNode) {
    }

    /* renamed from: x */
    public final g85<?> mo67232x(E e) {
        LockFreeLinkedListNode p;
        bk3 bk3 = this.f46335d;
        C9668a aVar = new C9668a(e);
        do {
            p = bk3.mo55693p();
            if (p instanceof g85) {
                return (g85) p;
            }
        } while (!p.mo55686i(aVar, bk3));
        return null;
    }

    /* renamed from: y */
    public final Object mo67233y(E e, ns0<? super r37> ns0) {
        gu5 gu5;
        na0<? super r37> b = pa0.m70974b(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0));
        while (true) {
            if (mo67230t()) {
                if (this.f46334a == null) {
                    gu5 = new ju5(e, b);
                } else {
                    gu5 = new ku5(e, b, this.f46334a);
                }
                Object f = mo51259f(gu5);
                if (f == null) {
                    pa0.m70975c(b, gu5);
                    break;
                } else if (f instanceof sh0) {
                    mo67228n(b, e, (sh0) f);
                    break;
                } else if (f != C9327t5.f44642e && !(f instanceof x75)) {
                    throw new IllegalStateException(("enqueueSend returned " + f).toString());
                }
            }
            Object v = mo51263v(e);
            if (v == C9327t5.f44639b) {
                Result.C6167a aVar = Result.Companion;
                b.resumeWith(Result.m75635constructorimpl(r37.f33317a));
                break;
            } else if (v != C9327t5.f44640c) {
                if (v instanceof sh0) {
                    mo67228n(b, e, (sh0) v);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + v).toString());
                }
            }
        }
        Object s = b.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        if (s == wx2.m54101d()) {
            return s;
        }
        return r37.f33317a;
    }

    /* renamed from: z */
    public boolean mo26028z(Throwable th) {
        boolean z;
        sh0 sh0 = new sh0(th);
        bk3 bk3 = this.f46335d;
        while (true) {
            LockFreeLinkedListNode p = bk3.mo55693p();
            z = true;
            if (!(p instanceof sh0)) {
                if (p.mo55686i(sh0, bk3)) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            sh0 = (sh0) this.f46335d.mo55693p();
        }
        mo67226l(sh0);
        if (z) {
            mo67229p(th);
        }
        return z;
    }
}
