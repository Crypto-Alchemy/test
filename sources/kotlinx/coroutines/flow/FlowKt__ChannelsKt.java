package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo44877d2 = {"T", "La52;", "Lz75;", "channel", "Lr37;", "c", "(La52;Lz75;Lns0;)Ljava/lang/Object;", "", "consume", "d", "(La52;Lz75;ZLns0;)Ljava/lang/Object;", "Lz42;", "b", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Channels.kt */
public final /* synthetic */ class FlowKt__ChannelsKt {
    /* renamed from: b */
    public static final <T> z42<T> m63335b(z75<? extends T> z75) {
        return new gd0(z75, true, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final <T> Object m63336c(a52<? super T> a52, z75<? extends T> z75, ns0<? super r37> ns0) {
        Object d = m63337d(a52, z75, true, ns0);
        if (d == wx2.m54101d()) {
            return d;
        }
        return r37.f33317a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[SYNTHETIC, Splitter:B:36:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m63337d(p000.a52<? super T> r7, p000.z75<? extends T> r8, boolean r9, p000.ns0<? super p000.r37> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            z75 r8 = (p000.z75) r8
            java.lang.Object r9 = r0.L$0
            a52 r9 = (p000.a52) r9
            p000.hg5.m45199b(r10)     // Catch:{ all -> 0x0055 }
        L_0x0035:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x005d
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            z75 r8 = (p000.z75) r8
            java.lang.Object r9 = r0.L$0
            a52 r9 = (p000.a52) r9
            p000.hg5.m45199b(r10)     // Catch:{ all -> 0x0055 }
            qd0 r10 = (p000.qd0) r10     // Catch:{ all -> 0x0055 }
            java.lang.Object r10 = r10.mo65445l()     // Catch:{ all -> 0x0055 }
            goto L_0x006f
        L_0x0055:
            r9 = move-exception
            goto L_0x009c
        L_0x0057:
            p000.hg5.m45199b(r10)
            p000.e52.m57225q(r7)
        L_0x005d:
            r0.L$0 = r7     // Catch:{ all -> 0x0098 }
            r0.L$1 = r8     // Catch:{ all -> 0x0098 }
            r0.Z$0 = r9     // Catch:{ all -> 0x0098 }
            r0.label = r4     // Catch:{ all -> 0x0098 }
            java.lang.Object r10 = r8.mo52175D(r0)     // Catch:{ all -> 0x0098 }
            if (r10 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x006f:
            r2 = 0
            boolean r5 = p000.qd0.m71230i(r10)     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x0085
            java.lang.Throwable r9 = p000.qd0.m71226e(r10)     // Catch:{ all -> 0x0055 }
            if (r9 != 0) goto L_0x0084
            if (r7 == 0) goto L_0x0081
            p000.rd0.m71508a(r8, r2)
        L_0x0081:
            r37 r7 = p000.r37.f33317a
            return r7
        L_0x0084:
            throw r9     // Catch:{ all -> 0x0055 }
        L_0x0085:
            java.lang.Object r10 = p000.qd0.m71228g(r10)     // Catch:{ all -> 0x0055 }
            r0.L$0 = r9     // Catch:{ all -> 0x0055 }
            r0.L$1 = r8     // Catch:{ all -> 0x0055 }
            r0.Z$0 = r7     // Catch:{ all -> 0x0055 }
            r0.label = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch:{ all -> 0x0055 }
            if (r10 != r1) goto L_0x0035
            return r1
        L_0x0098:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x009c:
            throw r9     // Catch:{ all -> 0x009d }
        L_0x009d:
            r10 = move-exception
            if (r7 == 0) goto L_0x00a3
            p000.rd0.m71508a(r8, r9)
        L_0x00a3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.m63337d(a52, z75, boolean, ns0):java.lang.Object");
    }
}
