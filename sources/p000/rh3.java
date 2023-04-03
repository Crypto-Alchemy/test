package p000;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p000.C9667z6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, mo44877d2 = {"Lrh3;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "element", "", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lou2;", "Lgu5;", "list", "Lsh0;", "closed", "Lr37;", "N", "(Ljava/lang/Object;Lsh0;)V", "", "J", "()Z", "isBufferAlwaysEmpty", "K", "isBufferEmpty", "q", "isBufferAlwaysFull", "s", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: rh3 */
/* compiled from: LinkedListChannel.kt */
public class rh3<E> extends AbstractChannel<E> {
    public rh3(rc2<? super E, r37> rc2) {
        super(rc2);
    }

    /* renamed from: J */
    public final boolean mo51251J() {
        return true;
    }

    /* renamed from: K */
    public final boolean mo51252K() {
        return true;
    }

    /* renamed from: N */
    public void mo55576N(Object obj, sh0<?> sh0) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                gu5 gu5 = (gu5) obj;
                if (gu5 instanceof C9667z6.C9668a) {
                    rc2<E, r37> rc2 = this.f46334a;
                    if (rc2 != null) {
                        undeliveredElementException = OnUndeliveredElementKt.m63493c(rc2, ((C9667z6.C9668a) gu5).f46336g, (UndeliveredElementException) null);
                    }
                } else {
                    gu5.mo52017C(sh0);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementException2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    gu5 gu52 = (gu5) arrayList.get(size);
                    if (gu52 instanceof C9667z6.C9668a) {
                        rc2<E, r37> rc22 = this.f46334a;
                        if (rc22 != null) {
                            undeliveredElementException2 = OnUndeliveredElementKt.m63493c(rc22, ((C9667z6.C9668a) gu52).f46336g, undeliveredElementException2);
                        } else {
                            undeliveredElementException2 = null;
                        }
                    } else {
                        gu52.mo52017C(sh0);
                    }
                }
                undeliveredElementException = undeliveredElementException2;
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    /* renamed from: q */
    public final boolean mo51261q() {
        return false;
    }

    /* renamed from: s */
    public final boolean mo51262s() {
        return false;
    }

    /* renamed from: v */
    public Object mo51263v(E e) {
        g85<?> x;
        do {
            Object v = super.mo51263v(e);
            xj6 xj6 = C9327t5.f44639b;
            if (v == xj6) {
                return xj6;
            }
            if (v == C9327t5.f44640c) {
                x = mo67232x(e);
                if (x == null) {
                    return xj6;
                }
            } else if (v instanceof sh0) {
                return v;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + v).toString());
            }
        } while (!(x instanceof sh0));
        return x;
    }
}
