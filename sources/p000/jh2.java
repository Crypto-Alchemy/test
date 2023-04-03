package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: jh2 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class jh2<T extends IInterface> extends C6462ry<T> implements C4013a.C4021f, j28 {

    /* renamed from: s1 */
    public final sg0 f30497s1;

    /* renamed from: t1 */
    public final Set f30498t1;

    /* renamed from: u1 */
    public final Account f30499u1;

    @Deprecated
    public jh2(Context context, Looper looper, int i, sg0 sg0, GoogleApiClient.C4011b bVar, GoogleApiClient.C4012c cVar) {
        this(context, looper, i, sg0, (np0) bVar, (dh4) cVar);
    }

    /* renamed from: B */
    public final Executor mo44463B() {
        return null;
    }

    /* renamed from: H */
    public final Set<Scope> mo44464H() {
        return this.f30498t1;
    }

    /* renamed from: l */
    public Set<Scope> mo30552l() {
        if (mo30551j()) {
            return this.f30498t1;
        }
        return Collections.emptySet();
    }

    /* renamed from: o0 */
    public Set<Scope> mo44465o0(Set<Scope> set) {
        return set;
    }

    /* renamed from: p0 */
    public final Set mo44466p0(Set set) {
        Set<Scope> o0 = mo44465o0(set);
        for (Scope contains : o0) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return o0;
    }

    /* renamed from: z */
    public final Account mo44467z() {
        return this.f30499u1;
    }

    public jh2(Context context, Looper looper, int i, sg0 sg0, np0 np0, dh4 dh4) {
        this(context, looper, kh2.m47093b(context), yh2.m54754p(), i, sg0, (np0) cu4.m43221k(np0), (dh4) cu4.m43221k(dh4));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jh2(android.content.Context r11, android.os.Looper r12, p000.kh2 r13, p000.yh2 r14, int r15, p000.sg0 r16, p000.np0 r17, p000.dh4 r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            d28 r3 = new d28
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            g28 r0 = new g28
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo47780h()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f30497s1 = r0
            android.accounts.Account r1 = r16.mo47773a()
            r9.f30499u1 = r1
            java.util.Set r0 = r16.mo47775c()
            java.util.Set r0 = r10.mo44466p0(r0)
            r9.f30498t1 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jh2.<init>(android.content.Context, android.os.Looper, kh2, yh2, int, sg0, np0, dh4):void");
    }
}
