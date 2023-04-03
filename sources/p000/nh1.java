package p000;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutinesInternalError;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198 X \u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, mo44877d2 = {"Lnh1;", "T", "Lvl6;", "Lkotlinx/coroutines/SchedulerTask;", "", "g", "()Ljava/lang/Object;", "takenState", "", "cause", "Lr37;", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "e", "", "I", "resumeMode", "Lns0;", "b", "()Lns0;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: nh1 */
/* compiled from: DispatchedTask.kt */
public abstract class nh1<T> extends vl6 {

    /* renamed from: e */
    public int f43474e;

    public nh1(int i) {
        this.f43474e = i;
    }

    /* renamed from: a */
    public void mo55894a(Object obj, Throwable th) {
    }

    /* renamed from: b */
    public abstract ns0<T> mo55895b();

    /* renamed from: c */
    public Throwable mo56411c(Object obj) {
        lm0 lm0;
        if (obj instanceof lm0) {
            lm0 = (lm0) obj;
        } else {
            lm0 = null;
        }
        if (lm0 != null) {
            return lm0.f40642a;
        }
        return null;
    }

    /* renamed from: d */
    public <T> T mo56412d(Object obj) {
        return obj;
    }

    /* renamed from: e */
    public final void mo62687e(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                ru1.m51326a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            vx2.m53588d(th);
            gu0.m58254a(mo55895b().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: g */
    public abstract Object mo55896g();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r4.mo62831U0() != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r4.mo62831U0() != false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            zl6 r0 = r10.f45328d
            ns0 r1 = r10.mo55895b()     // Catch:{ all -> 0x00b0 }
            lh1 r1 = (p000.lh1) r1     // Catch:{ all -> 0x00b0 }
            ns0<T> r2 = r1.f40620k     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = r1.f40622s     // Catch:{ all -> 0x00b0 }
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.m63497c(r3, r1)     // Catch:{ all -> 0x00b0 }
            xj6 r4 = kotlinx.coroutines.internal.ThreadContextKt.f40474a     // Catch:{ all -> 0x00b0 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            o37 r4 = kotlinx.coroutines.CoroutineContextKt.m63136g(r2, r3, r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r7 = r10.mo55896g()     // Catch:{ all -> 0x00a3 }
            java.lang.Throwable r8 = r10.mo56411c(r7)     // Catch:{ all -> 0x00a3 }
            if (r8 != 0) goto L_0x003e
            int r9 = r10.f43474e     // Catch:{ all -> 0x00a3 }
            boolean r9 = p000.oh1.m70282b(r9)     // Catch:{ all -> 0x00a3 }
            if (r9 == 0) goto L_0x003e
            y23$b r9 = p000.y23.f46117l     // Catch:{ all -> 0x00a3 }
            kotlin.coroutines.CoroutineContext$a r6 = r6.get(r9)     // Catch:{ all -> 0x00a3 }
            y23 r6 = (p000.y23) r6     // Catch:{ all -> 0x00a3 }
            goto L_0x003f
        L_0x003e:
            r6 = r5
        L_0x003f:
            if (r6 == 0) goto L_0x005c
            boolean r9 = r6.mo55502a()     // Catch:{ all -> 0x00a3 }
            if (r9 != 0) goto L_0x005c
            java.util.concurrent.CancellationException r6 = r6.mo55510h()     // Catch:{ all -> 0x00a3 }
            r10.mo55894a(r7, r6)     // Catch:{ all -> 0x00a3 }
            kotlin.Result$a r7 = kotlin.Result.Companion     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = p000.hg5.m45198a(r6)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = kotlin.Result.m75635constructorimpl(r6)     // Catch:{ all -> 0x00a3 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x0079
        L_0x005c:
            if (r8 == 0) goto L_0x006c
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = p000.hg5.m45198a(r8)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = kotlin.Result.m75635constructorimpl(r6)     // Catch:{ all -> 0x00a3 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x0079
        L_0x006c:
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = r10.mo56412d(r7)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = kotlin.Result.m75635constructorimpl(r6)     // Catch:{ all -> 0x00a3 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a3 }
        L_0x0079:
            r37 r2 = p000.r37.f33317a     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x0083
            boolean r2 = r4.mo62831U0()     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0086
        L_0x0083:
            kotlinx.coroutines.internal.ThreadContextKt.m63495a(r3, r1)     // Catch:{ all -> 0x00b0 }
        L_0x0086:
            r0.mo50256a()     // Catch:{ all -> 0x0090 }
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = kotlin.Result.m75635constructorimpl(r0)     // Catch:{ all -> 0x0090 }
            goto L_0x009b
        L_0x0090:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = p000.hg5.m45198a(r0)
            java.lang.Object r0 = kotlin.Result.m75635constructorimpl(r0)
        L_0x009b:
            java.lang.Throwable r0 = kotlin.Result.m75638exceptionOrNullimpl(r0)
            r10.mo62687e(r5, r0)
            goto L_0x00cf
        L_0x00a3:
            r2 = move-exception
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r4.mo62831U0()     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x00af
        L_0x00ac:
            kotlinx.coroutines.internal.ThreadContextKt.m63495a(r3, r1)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r2     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion     // Catch:{ all -> 0x00bd }
            r0.mo50256a()     // Catch:{ all -> 0x00bd }
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = kotlin.Result.m75635constructorimpl(r0)     // Catch:{ all -> 0x00bd }
            goto L_0x00c8
        L_0x00bd:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r0 = p000.hg5.m45198a(r0)
            java.lang.Object r0 = kotlin.Result.m75635constructorimpl(r0)
        L_0x00c8:
            java.lang.Throwable r0 = kotlin.Result.m75638exceptionOrNullimpl(r0)
            r10.mo62687e(r1, r0)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nh1.run():void");
    }
}
