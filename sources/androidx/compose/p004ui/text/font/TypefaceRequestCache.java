package androidx.compose.p004ui.text.font;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00050\u0004R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "Ls27;", "typefaceRequest", "Lkotlin/Function1;", "Lt27;", "Lr37;", "resolveTypeface", "Lr86;", "c", "Lck6;", "a", "Lck6;", "b", "()Lck6;", "lock", "Lcm3;", "Lcm3;", "resultCache", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.font.TypefaceRequestCache */
/* compiled from: FontFamilyResolver.kt */
public final class TypefaceRequestCache {

    /* renamed from: a */
    public final ck6 f2206a = bk6.m11432a();

    /* renamed from: b */
    public final cm3<s27, t27> f2207b = new cm3<>(16);

    /* renamed from: b */
    public final ck6 mo4115b() {
        return this.f2206a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r5 = (p000.t27) r5.invoke(new androidx.compose.p004ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0 = r3.f2206a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r3.f2207b.mo12115d(r4) != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r5.mo26029b() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r3.f2207b.mo12116e(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r4 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        throw new java.lang.IllegalStateException("Could not load font", r4);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.r86<java.lang.Object> mo4116c(p000.s27 r4, p000.rc2<? super p000.rc2<? super p000.t27, p000.r37>, ? extends p000.t27> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "typefaceRequest"
            p000.vx2.m53591g(r4, r0)
            java.lang.String r0 = "resolveTypeface"
            p000.vx2.m53591g(r5, r0)
            ck6 r0 = r3.f2206a
            monitor-enter(r0)
            cm3<s27, t27> r1 = r3.f2207b     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r1.mo12115d(r4)     // Catch:{ all -> 0x0059 }
            t27 r1 = (p000.t27) r1     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0027
            boolean r2 = r1.mo26029b()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r0)
            return r1
        L_0x001f:
            cm3<s27, t27> r1 = r3.f2207b     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r1.mo12117f(r4)     // Catch:{ all -> 0x0059 }
            t27 r1 = (p000.t27) r1     // Catch:{ all -> 0x0059 }
        L_0x0027:
            monitor-exit(r0)
            androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 r0 = new androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1     // Catch:{ Exception -> 0x0050 }
            r0.<init>(r3, r4)     // Catch:{ Exception -> 0x0050 }
            java.lang.Object r5 = r5.invoke(r0)     // Catch:{ Exception -> 0x0050 }
            t27 r5 = (p000.t27) r5     // Catch:{ Exception -> 0x0050 }
            ck6 r0 = r3.f2206a
            monitor-enter(r0)
            cm3<s27, t27> r1 = r3.f2207b     // Catch:{ all -> 0x004d }
            java.lang.Object r1 = r1.mo12115d(r4)     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0049
            boolean r1 = r5.mo26029b()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0049
            cm3<s27, t27> r1 = r3.f2207b     // Catch:{ all -> 0x004d }
            r1.mo12116e(r4, r5)     // Catch:{ all -> 0x004d }
        L_0x0049:
            r37 r4 = p000.r37.f33317a     // Catch:{ all -> 0x004d }
            monitor-exit(r0)
            return r5
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x0050:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r5.<init>(r0, r4)
            throw r5
        L_0x0059:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.TypefaceRequestCache.mo4116c(s27, rc2):r86");
    }
}
