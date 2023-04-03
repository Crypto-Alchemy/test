package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import p000.ma0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0005:;\u001b<=B)\u0012 \u00107\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u000105j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`6¢\u0006\u0004\b8\u00109J!\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J \u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0014J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001b\u001a\u00020\u000e2\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019J\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\nH\u0014J/\u0010&\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0002J\u0010\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010*H\u0014J\b\u0010,\u001a\u00020\u000eH\u0014J\b\u0010-\u001a\u00020\u000eH\u0014R\u0014\u00100\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0014\u00104\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, mo44877d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lz6;", "Lfd0;", "R", "", "receiveMode", "(ILns0;)Ljava/lang/Object;", "Lx75;", "receive", "", "H", "Lma0;", "cont", "Lr37;", "S", "", "Q", "I", "Lqd0;", "D", "(Lns0;)Ljava/lang/Object;", "r", "()Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "c", "", "G", "(Ljava/lang/Throwable;)Z", "wasClosed", "M", "Lou2;", "Lgu5;", "list", "Lsh0;", "closed", "N", "(Ljava/lang/Object;Lsh0;)V", "Lmd0;", "iterator", "Lg85;", "A", "P", "O", "J", "()Z", "isBufferAlwaysEmpty", "K", "isBufferEmpty", "L", "isClosedForReceive", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lrc2;)V", "a", "b", "d", "e", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: AbstractChannel.kt */
public abstract class AbstractChannel<E> extends C9667z6<E> implements fd0<E> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u0003HBø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0013\u0010\u000b\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo44877d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$a;", "E", "Lmd0;", "", "a", "(Lns0;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "", "result", "b", "c", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/AbstractChannel;", "channel", "Ljava/lang/Object;", "getResult", "d", "(Ljava/lang/Object;)V", "<init>", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$a */
    /* compiled from: AbstractChannel.kt */
    public static final class C7760a<E> implements md0<E> {

        /* renamed from: a */
        public final AbstractChannel<E> f40366a;

        /* renamed from: b */
        public Object f40367b = C9327t5.f44641d;

        public C7760a(AbstractChannel<E> abstractChannel) {
            this.f40366a = abstractChannel;
        }

        /* renamed from: a */
        public Object mo55581a(ns0<? super Boolean> ns0) {
            Object obj = this.f40367b;
            xj6 xj6 = C9327t5.f44641d;
            if (obj != xj6) {
                return a40.m31670a(mo55582b(obj));
            }
            Object Q = this.f40366a.mo51255Q();
            this.f40367b = Q;
            if (Q != xj6) {
                return a40.m31670a(mo55582b(Q));
            }
            return mo55583c(ns0);
        }

        /* renamed from: b */
        public final boolean mo55582b(Object obj) {
            if (!(obj instanceof sh0)) {
                return true;
            }
            sh0 sh0 = (sh0) obj;
            if (sh0.f44562g == null) {
                return false;
            }
            throw v76.m73132a(sh0.mo65852H());
        }

        /* renamed from: c */
        public final Object mo55583c(ns0<? super Boolean> ns0) {
            rc2<Throwable, r37> rc2;
            na0<? super Boolean> b = pa0.m70974b(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0));
            C7763d dVar = new C7763d(this, b);
            while (true) {
                if (this.f40366a.mo55575H(dVar)) {
                    this.f40366a.mo55580S(b, dVar);
                    break;
                }
                Object Q = this.f40366a.mo51255Q();
                mo55584d(Q);
                if (Q instanceof sh0) {
                    sh0 sh0 = (sh0) Q;
                    if (sh0.f44562g == null) {
                        Result.C6167a aVar = Result.Companion;
                        b.resumeWith(Result.m75635constructorimpl(a40.m31670a(false)));
                    } else {
                        Result.C6167a aVar2 = Result.Companion;
                        b.resumeWith(Result.m75635constructorimpl(hg5.m45198a(sh0.mo65852H())));
                    }
                } else if (Q != C9327t5.f44641d) {
                    Boolean a = a40.m31670a(true);
                    rc2<E, r37> rc22 = this.f40366a.f46334a;
                    if (rc22 != null) {
                        rc2 = OnUndeliveredElementKt.m63491a(rc22, Q, b.getContext());
                    } else {
                        rc2 = null;
                    }
                    b.mo56167w(a, rc2);
                }
            }
            Object s = b.mo56421s();
            if (s == wx2.m54101d()) {
                a31.m31656c(ns0);
            }
            return s;
        }

        /* renamed from: d */
        public final void mo55584d(Object obj) {
            this.f40367b = obj;
        }

        public E next() {
            E e = this.f40367b;
            if (!(e instanceof sh0)) {
                E e2 = C9327t5.f44641d;
                if (e != e2) {
                    this.f40367b = e2;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw v76.m73132a(((sh0) e).mo65852H());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$b;", "E", "Lx75;", "value", "", "D", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "otherOp", "Lxj6;", "f", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;)Lxj6;", "Lr37;", "e", "(Ljava/lang/Object;)V", "Lsh0;", "closed", "C", "", "toString", "Lma0;", "g", "Lma0;", "cont", "", "k", "I", "receiveMode", "<init>", "(Lma0;I)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$b */
    /* compiled from: AbstractChannel.kt */
    public static class C7761b<E> extends x75<E> {

        /* renamed from: g */
        public final ma0<Object> f40368g;

        /* renamed from: k */
        public final int f40369k;

        public C7761b(ma0<Object> ma0, int i) {
            this.f40368g = ma0;
            this.f40369k = i;
        }

        /* renamed from: C */
        public void mo55586C(sh0<?> sh0) {
            if (this.f40369k == 1) {
                this.f40368g.resumeWith(Result.m75635constructorimpl(qd0.m71223b(qd0.f44172b.mo65450a(sh0.f44562g))));
                return;
            }
            ma0<Object> ma0 = this.f40368g;
            Result.C6167a aVar = Result.Companion;
            ma0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(sh0.mo65852H())));
        }

        /* renamed from: D */
        public final Object mo55587D(E e) {
            if (this.f40369k == 1) {
                return qd0.m71223b(qd0.f44172b.mo65452c(e));
            }
            return e;
        }

        /* renamed from: e */
        public void mo51883e(E e) {
            this.f40368g.mo56162F(oa0.f43593a);
        }

        /* renamed from: f */
        public xj6 mo51884f(E e, LockFreeLinkedListNode.C7797b bVar) {
            if (this.f40368g.mo56161B(mo55587D(e), (Object) null, mo55588B(e)) == null) {
                return null;
            }
            return oa0.f43593a;
        }

        public String toString() {
            return "ReceiveElement@" + b31.m55723b(this) + "[receiveMode=" + this.f40369k + ']';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, mo44877d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$c;", "E", "Lkotlinx/coroutines/channels/AbstractChannel$b;", "value", "Lkotlin/Function1;", "", "Lr37;", "B", "(Ljava/lang/Object;)Lrc2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "r", "Lrc2;", "onUndeliveredElement", "Lma0;", "", "cont", "", "receiveMode", "<init>", "(Lma0;ILrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$c */
    /* compiled from: AbstractChannel.kt */
    public static final class C7762c<E> extends C7761b<E> {

        /* renamed from: r */
        public final rc2<E, r37> f40370r;

        public C7762c(ma0<Object> ma0, int i, rc2<? super E, r37> rc2) {
            super(ma0, i);
            this.f40370r = rc2;
        }

        /* renamed from: B */
        public rc2<Throwable, r37> mo55588B(E e) {
            return OnUndeliveredElementKt.m63491a(this.f40370r, e, this.f40368g.getContext());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo44877d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$d;", "E", "Lx75;", "value", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "otherOp", "Lxj6;", "f", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;)Lxj6;", "Lr37;", "e", "(Ljava/lang/Object;)V", "Lsh0;", "closed", "C", "Lkotlin/Function1;", "", "B", "(Ljava/lang/Object;)Lrc2;", "", "toString", "Lkotlinx/coroutines/channels/AbstractChannel$a;", "g", "Lkotlinx/coroutines/channels/AbstractChannel$a;", "iterator", "Lma0;", "", "k", "Lma0;", "cont", "<init>", "(Lkotlinx/coroutines/channels/AbstractChannel$a;Lma0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$d */
    /* compiled from: AbstractChannel.kt */
    public static class C7763d<E> extends x75<E> {

        /* renamed from: g */
        public final C7760a<E> f40371g;

        /* renamed from: k */
        public final ma0<Boolean> f40372k;

        public C7763d(C7760a<E> aVar, ma0<? super Boolean> ma0) {
            this.f40371g = aVar;
            this.f40372k = ma0;
        }

        /* renamed from: B */
        public rc2<Throwable, r37> mo55588B(E e) {
            rc2<E, r37> rc2 = this.f40371g.f40366a.f46334a;
            if (rc2 != null) {
                return OnUndeliveredElementKt.m63491a(rc2, e, this.f40372k.getContext());
            }
            return null;
        }

        /* renamed from: C */
        public void mo55586C(sh0<?> sh0) {
            Object obj;
            if (sh0.f44562g == null) {
                obj = ma0.C7871a.m64216b(this.f40372k, Boolean.FALSE, (Object) null, 2, (Object) null);
            } else {
                obj = this.f40372k.mo56164i(sh0.mo65852H());
            }
            if (obj != null) {
                this.f40371g.mo55584d(sh0);
                this.f40372k.mo56162F(obj);
            }
        }

        /* renamed from: e */
        public void mo51883e(E e) {
            this.f40371g.mo55584d(e);
            this.f40372k.mo56162F(oa0.f43593a);
        }

        /* renamed from: f */
        public xj6 mo51884f(E e, LockFreeLinkedListNode.C7797b bVar) {
            if (this.f40372k.mo56161B(Boolean.TRUE, (Object) null, mo55588B(e)) == null) {
                return null;
            }
            return oa0.f43593a;
        }

        public String toString() {
            return "ReceiveHasNext@" + b31.m55723b(this);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, mo44877d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$e;", "Lu00;", "", "cause", "Lr37;", "a", "", "toString", "Lx75;", "Lx75;", "receive", "<init>", "(Lkotlinx/coroutines/channels/AbstractChannel;Lx75;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$e */
    /* compiled from: AbstractChannel.kt */
    public final class C7764e extends u00 {

        /* renamed from: a */
        public final x75<?> f40373a;

        public C7764e(x75<?> x75) {
            this.f40373a = x75;
        }

        /* renamed from: a */
        public void mo50904a(Throwable th) {
            if (this.f40373a.mo50615v()) {
                AbstractChannel.this.mo55577O();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50904a((Throwable) obj);
            return r37.f33317a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f40373a + ']';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/channels/AbstractChannel$f", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "i", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$f */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C7765f extends LockFreeLinkedListNode.C7796a {

        /* renamed from: d */
        public final /* synthetic */ AbstractChannel f40375d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7765f(LockFreeLinkedListNode lockFreeLinkedListNode, AbstractChannel abstractChannel) {
            super(lockFreeLinkedListNode);
            this.f40375d = abstractChannel;
        }

        /* renamed from: i */
        public Object mo52783g(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f40375d.mo51252K()) {
                return null;
            }
            return ck3.m56454a();
        }
    }

    public AbstractChannel(rc2<? super E, r37> rc2) {
        super(rc2);
    }

    /* renamed from: A */
    public g85<E> mo55573A() {
        g85<E> A = super.mo55573A();
        if (A != null && !(A instanceof sh0)) {
            mo55577O();
        }
        return A;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo52175D(p000.ns0<? super p000.qd0<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p000.hg5.m45199b(r5)
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p000.hg5.m45199b(r5)
            java.lang.Object r5 = r4.mo51255Q()
            xj6 r2 = p000.C9327t5.f44641d
            if (r5 == r2) goto L_0x0052
            boolean r0 = r5 instanceof p000.sh0
            if (r0 == 0) goto L_0x004b
            qd0$b r0 = p000.qd0.f44172b
            sh0 r5 = (p000.sh0) r5
            java.lang.Throwable r5 = r5.f44562g
            java.lang.Object r5 = r0.mo65450a(r5)
            goto L_0x0051
        L_0x004b:
            qd0$b r0 = p000.qd0.f44172b
            java.lang.Object r5 = r0.mo65452c(r5)
        L_0x0051:
            return r5
        L_0x0052:
            r0.label = r3
            java.lang.Object r5 = r4.mo55579R(r3, r0)
            if (r5 != r1) goto L_0x005b
            return r1
        L_0x005b:
            qd0 r5 = (p000.qd0) r5
            java.lang.Object r5 = r5.mo65445l()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractChannel.mo52175D(ns0):java.lang.Object");
    }

    /* renamed from: G */
    public final boolean mo55574G(Throwable th) {
        boolean z = mo26028z(th);
        mo51254M(z);
        return z;
    }

    /* renamed from: H */
    public final boolean mo55575H(x75<? super E> x75) {
        boolean I = mo51250I(x75);
        if (I) {
            mo55578P();
        }
        return I;
    }

    /* renamed from: I */
    public boolean mo51250I(x75<? super E> x75) {
        int z;
        LockFreeLinkedListNode p;
        if (mo51251J()) {
            bk3 j = mo67224j();
            do {
                p = j.mo55693p();
                if (!(!(p instanceof gu5))) {
                    return false;
                }
            } while (!p.mo55686i(x75, j));
        } else {
            bk3 j2 = mo67224j();
            C7765f fVar = new C7765f(x75, this);
            do {
                LockFreeLinkedListNode p2 = j2.mo55693p();
                if (!(!(p2 instanceof gu5))) {
                    return false;
                }
                z = p2.mo55699z(x75, j2, fVar);
                if (z != 1) {
                }
            } while (z != 2);
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public abstract boolean mo51251J();

    /* renamed from: K */
    public abstract boolean mo51252K();

    /* renamed from: L */
    public boolean mo51253L() {
        if (mo67222h() == null || !mo51252K()) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public void mo51254M(boolean z) {
        sh0<?> i = mo67223i();
        if (i != null) {
            Object b = ou2.m70789b((Object) null, 1, (DefaultConstructorMarker) null);
            while (true) {
                LockFreeLinkedListNode p = i.mo55693p();
                if (p instanceof bk3) {
                    mo55576N(b, i);
                    return;
                } else if (!p.mo50615v()) {
                    p.mo55694q();
                } else {
                    b = ou2.m70790c(b, (gu5) p);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* renamed from: N */
    public void mo55576N(Object obj, sh0<?> sh0) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((gu5) obj).mo52017C(sh0);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                ((gu5) arrayList.get(size)).mo52017C(sh0);
            } else {
                return;
            }
        }
    }

    /* renamed from: O */
    public void mo55577O() {
    }

    /* renamed from: P */
    public void mo55578P() {
    }

    /* renamed from: Q */
    public Object mo51255Q() {
        while (true) {
            gu5 B = mo67220B();
            if (B == null) {
                return C9327t5.f44641d;
            }
            if (B.mo52018D((LockFreeLinkedListNode.C7797b) null) != null) {
                B.mo52015A();
                return B.mo52016B();
            }
            B.mo52019E();
        }
    }

    /* renamed from: R */
    public final <R> Object mo55579R(int i, ns0<? super R> ns0) {
        C7761b bVar;
        na0<? super R> b = pa0.m70974b(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0));
        if (this.f46334a == null) {
            bVar = new C7761b(b, i);
        } else {
            bVar = new C7762c(b, i, this.f46334a);
        }
        while (true) {
            if (!mo55575H(bVar)) {
                Object Q = mo51255Q();
                if (!(Q instanceof sh0)) {
                    if (Q != C9327t5.f44641d) {
                        b.mo56167w(bVar.mo55587D(Q), bVar.mo55588B(Q));
                        break;
                    }
                } else {
                    bVar.mo55586C((sh0) Q);
                    break;
                }
            } else {
                mo55580S(b, bVar);
                break;
            }
        }
        Object s = b.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return s;
    }

    /* renamed from: S */
    public final void mo55580S(ma0<?> ma0, x75<?> x75) {
        ma0.mo56166t(new C7764e(x75));
    }

    /* renamed from: c */
    public final void mo52179c(CancellationException cancellationException) {
        if (!mo51253L()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(b31.m55722a(this) + " was cancelled");
            }
            mo55574G(cancellationException);
        }
    }

    public final md0<E> iterator() {
        return new C7760a(this);
    }

    /* renamed from: r */
    public final Object mo52183r() {
        Object Q = mo51255Q();
        if (Q == C9327t5.f44641d) {
            return qd0.f44172b.mo65451b();
        }
        if (Q instanceof sh0) {
            return qd0.f44172b.mo65450a(((sh0) Q).f44562g);
        }
        return qd0.f44172b.mo65452c(Q);
    }
}
