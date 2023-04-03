package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo44877d2 = {"", "Ly23;", "jobs", "Lr37;", "a", "([Ly23;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: Await.kt */
public final class AwaitKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m63129a(p000.y23[] r6, p000.ns0<? super p000.r37> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.AwaitKt$joinAll$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = (kotlinx.coroutines.AwaitKt$joinAll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = new kotlinx.coroutines.AwaitKt$joinAll$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            int r6 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            y23[] r4 = (p000.y23[]) r4
            p000.hg5.m45199b(r7)
            r7 = r4
            goto L_0x0056
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            p000.hg5.m45199b(r7)
            r7 = 0
            int r2 = r6.length
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L_0x0043:
            if (r2 >= r6) goto L_0x0058
            r4 = r7[r2]
            r0.L$0 = r7
            r0.I$0 = r2
            r0.I$1 = r6
            r0.label = r3
            java.lang.Object r4 = r4.mo55508g(r0)
            if (r4 != r1) goto L_0x0056
            return r1
        L_0x0056:
            int r2 = r2 + r3
            goto L_0x0043
        L_0x0058:
            r37 r6 = p000.r37.f33317a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AwaitKt.m63129a(y23[], ns0):java.lang.Object");
    }
}
