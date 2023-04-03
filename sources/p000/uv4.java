package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ab\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042*\b\u0001\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001e\b\u0002\u0010\u0016\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013j\u0004\u0018\u0001`\u00152*\b\u0001\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, mo44877d2 = {"E", "Lhu0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlin/Function2;", "Lcw4;", "Lns0;", "Lr37;", "", "block", "Lz75;", "a", "(Lhu0;Lkotlin/coroutines/CoroutineContext;ILfd2;)Lz75;", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "b", "(Lhu0;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lrc2;Lfd2;)Lz75;", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: uv4 */
/* compiled from: Produce.kt */
public final class uv4 {
    /* renamed from: a */
    public static final <E> z75<E> m72983a(hu0 hu0, CoroutineContext coroutineContext, int i, fd2<? super cw4<? super E>, ? super ns0<? super r37>, ? extends Object> fd2) {
        return m72984b(hu0, coroutineContext, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, (rc2<? super Throwable, r37>) null, fd2);
    }

    /* renamed from: b */
    public static final <E> z75<E> m72984b(hu0 hu0, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, rc2<? super Throwable, r37> rc2, fd2<? super cw4<? super E>, ? super ns0<? super r37>, ? extends Object> fd2) {
        yv4 yv4 = new yv4(CoroutineContextKt.m63133d(hu0, coroutineContext), od0.m70236b(i, bufferOverflow, (rc2) null, 4, (Object) null));
        if (rc2 != null) {
            yv4.mo55519p(rc2);
        }
        yv4.mo67038S0(coroutineStart, yv4, fd2);
        return yv4;
    }

    /* renamed from: c */
    public static /* synthetic */ z75 m72985c(hu0 hu0, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, rc2 rc2, fd2 fd2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i2 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i2 & 16) != 0) {
            rc2 = null;
        }
        return m72984b(hu0, coroutineContext2, i3, bufferOverflow2, coroutineStart2, rc2, fd2);
    }
}
