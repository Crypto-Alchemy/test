package p000;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J$\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u001e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo44877d2 = {"Lyv3;", "Lvm3;", "Lib1;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "z", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lzh1;", "i", "", "N", "Lma0;", "Lr37;", "continuation", "P", "", "toString", "O", "", "e", "Ljava/lang/Throwable;", "cause", "g", "Ljava/lang/String;", "errorHint", "K", "()Lvm3;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: yv3 */
/* compiled from: MainDispatchers.kt */
public final class yv3 extends vm3 implements ib1 {

    /* renamed from: e */
    public final Throwable f46275e;

    /* renamed from: g */
    public final String f46276g;

    public yv3(Throwable th, String str) {
        this.f46275e = th;
        this.f46276g = str;
    }

    /* renamed from: K */
    public vm3 mo55551K() {
        return this;
    }

    /* renamed from: N */
    public Void mo3894m(CoroutineContext coroutineContext, Runnable runnable) {
        mo67176O();
        throw new KotlinNothingValueException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void mo67176O() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f46275e
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f46276g
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f46275e
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            p000.ym3.m74473d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yv3.mo67176O():java.lang.Void");
    }

    /* renamed from: P */
    public Void mo51194f(long j, ma0<? super r37> ma0) {
        mo67176O();
        throw new KotlinNothingValueException();
    }

    /* renamed from: i */
    public zh1 mo51195i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        mo67176O();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f46275e != null) {
            str = ", cause=" + this.f46275e;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: z */
    public boolean mo28541z(CoroutineContext coroutineContext) {
        mo67176O();
        throw new KotlinNothingValueException();
    }
}
