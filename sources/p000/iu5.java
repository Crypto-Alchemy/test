package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0001\u0010\u0010\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, mo44877d2 = {"Liu5;", "E", "", "element", "Lr37;", "u", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "Lqd0;", "o", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "z", "offer", "(Ljava/lang/Object;)Z", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: iu5 */
/* compiled from: Channel.kt */
public interface iu5<E> {

    @Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: iu5$a */
    /* compiled from: Channel.kt */
    public static final class C7226a {
        /* renamed from: a */
        public static /* synthetic */ boolean m59120a(iu5 iu5, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return iu5.mo26028z(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        /* renamed from: b */
        public static <E> boolean m59121b(iu5<? super E> iu5, E e) {
            Object o = iu5.mo52181o(e);
            if (qd0.m71231j(o)) {
                return true;
            }
            Throwable e2 = qd0.m71226e(o);
            if (e2 == null) {
                return false;
            }
            throw v76.m73132a(e2);
        }
    }

    /* renamed from: E */
    boolean mo52176E();

    /* renamed from: o */
    Object mo52181o(E e);

    boolean offer(E e);

    /* renamed from: u */
    Object mo26027u(E e, ns0<? super r37> ns0);

    /* renamed from: z */
    boolean mo26028z(Throwable th);
}
