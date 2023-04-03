package androidx.paging;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.iu5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00040\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bR&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00040\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"Landroidx/paging/TemporaryDownstream;", "", "T", "Lz42;", "Lwt2;", "Lvk4;", "b", "event", "", "c", "(Lwt2;Lns0;)Ljava/lang/Object;", "Lr37;", "a", "Lfd0;", "Lfd0;", "historyChannel", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: CachedPageEventFlow.kt */
public final class TemporaryDownstream<T> {

    /* renamed from: a */
    public final fd0<wt2<vk4<T>>> f6245a = od0.m70236b(Integer.MAX_VALUE, (BufferOverflow) null, (rc2) null, 6, (Object) null);

    /* renamed from: a */
    public final void mo8760a() {
        iu5.C7226a.m59120a(this.f6245a, (Throwable) null, 1, (Object) null);
    }

    /* renamed from: b */
    public final z42<wt2<vk4<T>>> mo8761b() {
        return e52.m57220l(this.f6245a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo8762c(p000.wt2<? extends p000.vk4<T>> r5, p000.ns0<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.TemporaryDownstream$send$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.paging.TemporaryDownstream$send$1 r0 = (androidx.paging.TemporaryDownstream$send$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.TemporaryDownstream$send$1 r0 = new androidx.paging.TemporaryDownstream$send$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p000.hg5.m45199b(r6)     // Catch:{ ClosedSendChannelException -> 0x003f }
            goto L_0x0040
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p000.hg5.m45199b(r6)
            fd0<wt2<vk4<T>>> r6 = r4.f6245a     // Catch:{ ClosedSendChannelException -> 0x003f }
            r0.label = r3     // Catch:{ ClosedSendChannelException -> 0x003f }
            java.lang.Object r5 = r6.mo26027u(r5, r0)     // Catch:{ ClosedSendChannelException -> 0x003f }
            if (r5 != r1) goto L_0x0040
            return r1
        L_0x003f:
            r3 = 0
        L_0x0040:
            java.lang.Boolean r5 = p000.a40.m31670a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.TemporaryDownstream.mo8762c(wt2, ns0):java.lang.Object");
    }
}
