package androidx.compose.p004ui.text.font;

import java.util.List;
import kotlin.Metadata;
import p000.t27;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b.\u0010/J\u0013\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR+\u0010%\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028V@RX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010,\u001a\u00020&8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b\u0012\u0010)\"\u0004\b*\u0010+\u0002\u0004\n\u0002\b\u0019¨\u00060"}, mo44877d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Lr86;", "", "Lr37;", "f", "(Lns0;)Ljava/lang/Object;", "Ly62;", "h", "(Ly62;Lns0;)Ljava/lang/Object;", "", "a", "Ljava/util/List;", "fontList", "Ls27;", "d", "Ls27;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "e", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/Function1;", "Lt27$b;", "g", "Lrc2;", "onCompletion", "Lfp4;", "k", "Lfp4;", "platformFontLoader", "<set-?>", "r", "Lt04;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "s", "Z", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "initialType", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ls27;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lrc2;Lfp4;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class AsyncFontListLoader implements r86<Object> {

    /* renamed from: a */
    public final List<y62> f2181a;

    /* renamed from: d */
    public final s27 f2182d;

    /* renamed from: e */
    public final AsyncTypefaceCache f2183e;

    /* renamed from: g */
    public final rc2<t27.C3322b, r37> f2184g;

    /* renamed from: k */
    public final fp4 f2185k;

    /* renamed from: r */
    public final t04 f2186r;

    /* renamed from: s */
    public boolean f2187s = true;

    public AsyncFontListLoader(List<? extends y62> list, Object obj, s27 s27, AsyncTypefaceCache asyncTypefaceCache, rc2<? super t27.C3322b, r37> rc2, fp4 fp4) {
        vx2.m53591g(list, "fontList");
        vx2.m53591g(obj, "initialType");
        vx2.m53591g(s27, "typefaceRequest");
        vx2.m53591g(asyncTypefaceCache, "asyncTypefaceCache");
        vx2.m53591g(rc2, "onCompletion");
        vx2.m53591g(fp4, "platformFontLoader");
        this.f2181a = list;
        this.f2182d = s27;
        this.f2183e = asyncTypefaceCache;
        this.f2184g = rc2;
        this.f2185k = fp4;
        this.f2186r = l56.m21292b(obj, (h56) null, 2, (Object) null);
    }

    /* renamed from: e */
    public final boolean mo4090e() {
        return this.f2187s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A[SYNTHETIC, Splitter:B:27:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef A[SYNTHETIC, Splitter:B:38:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4091f(p000.ns0<? super p000.r37> r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof androidx.compose.p004ui.text.font.AsyncFontListLoader$load$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = (androidx.compose.p004ui.text.font.AsyncFontListLoader$load$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0068
            if (r4 == r7) goto L_0x004a
            if (r4 != r6) goto L_0x0042
            int r4 = r2.I$1
            int r9 = r2.I$0
            java.lang.Object r10 = r2.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.L$0
            androidx.compose.ui.text.font.AsyncFontListLoader r11 = (androidx.compose.p004ui.text.font.AsyncFontListLoader) r11
            p000.hg5.m45199b(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0103
        L_0x003f:
            r0 = move-exception
            goto L_0x012c
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            int r4 = r2.I$1
            int r9 = r2.I$0
            java.lang.Object r10 = r2.L$2
            y62 r10 = (p000.y62) r10
            java.lang.Object r11 = r2.L$1
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.L$0
            androidx.compose.ui.text.font.AsyncFontListLoader r12 = (androidx.compose.p004ui.text.font.AsyncFontListLoader) r12
            p000.hg5.m45199b(r0)     // Catch:{ all -> 0x0064 }
            r15 = r12
            r18 = r11
            r11 = r10
            r10 = r18
            goto L_0x00b9
        L_0x0064:
            r0 = move-exception
            r11 = r12
            goto L_0x012c
        L_0x0068:
            p000.hg5.m45199b(r0)
            java.util.List<y62> r0 = r1.f2181a     // Catch:{ all -> 0x012a }
            int r4 = r0.size()     // Catch:{ all -> 0x012a }
            r15 = r1
            r14 = r8
        L_0x0073:
            if (r14 >= r4) goto L_0x010f
            java.lang.Object r9 = r0.get(r14)     // Catch:{ all -> 0x0107 }
            r13 = r9
            y62 r13 = (p000.y62) r13     // Catch:{ all -> 0x0107 }
            int r9 = r13.mo21856a()     // Catch:{ all -> 0x0107 }
            f72$a r10 = p000.f72.f11555a     // Catch:{ all -> 0x0107 }
            int r10 = r10.mo19709a()     // Catch:{ all -> 0x0107 }
            boolean r9 = p000.f72.m16637e(r9, r10)     // Catch:{ all -> 0x0107 }
            if (r9 == 0) goto L_0x010a
            androidx.compose.ui.text.font.AsyncTypefaceCache r9 = r15.f2183e     // Catch:{ all -> 0x0107 }
            fp4 r11 = r15.f2185k     // Catch:{ all -> 0x0107 }
            r12 = 0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1 r10 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1     // Catch:{ all -> 0x0107 }
            r10.<init>(r15, r13, r5)     // Catch:{ all -> 0x0107 }
            r2.L$0 = r15     // Catch:{ all -> 0x0107 }
            r2.L$1 = r0     // Catch:{ all -> 0x0107 }
            r2.L$2 = r13     // Catch:{ all -> 0x0107 }
            r2.I$0 = r14     // Catch:{ all -> 0x0107 }
            r2.I$1 = r4     // Catch:{ all -> 0x0107 }
            r2.label = r7     // Catch:{ all -> 0x0107 }
            r16 = r10
            r10 = r13
            r17 = r13
            r13 = r16
            r16 = r14
            r14 = r2
            java.lang.Object r9 = r9.mo4099g(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0107 }
            if (r9 != r3) goto L_0x00b3
            return r3
        L_0x00b3:
            r10 = r0
            r0 = r9
            r9 = r16
            r11 = r17
        L_0x00b9:
            if (r0 == 0) goto L_0x00ef
            s27 r3 = r15.f2182d     // Catch:{ all -> 0x0107 }
            int r3 = r3.mo25617e()     // Catch:{ all -> 0x0107 }
            s27 r4 = r15.f2182d     // Catch:{ all -> 0x0107 }
            r72 r4 = r4.mo25619f()     // Catch:{ all -> 0x0107 }
            s27 r5 = r15.f2182d     // Catch:{ all -> 0x0107 }
            int r5 = r5.mo25616d()     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = p000.p72.m24703a(r3, r0, r11, r4, r5)     // Catch:{ all -> 0x0107 }
            r15.setValue(r0)     // Catch:{ all -> 0x0107 }
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x0107 }
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            boolean r2 = p000.g33.m58016m(r2)
            r15.f2187s = r8
            rc2<t27$b, r37> r3 = r15.f2184g
            t27$b r4 = new t27$b
            java.lang.Object r5 = r15.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            return r0
        L_0x00ef:
            r2.L$0 = r15     // Catch:{ all -> 0x0107 }
            r2.L$1 = r10     // Catch:{ all -> 0x0107 }
            r2.L$2 = r5     // Catch:{ all -> 0x0107 }
            r2.I$0 = r9     // Catch:{ all -> 0x0107 }
            r2.I$1 = r4     // Catch:{ all -> 0x0107 }
            r2.label = r6     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = p000.kp7.m63580a(r2)     // Catch:{ all -> 0x0107 }
            if (r0 != r3) goto L_0x0102
            return r3
        L_0x0102:
            r11 = r15
        L_0x0103:
            r14 = r9
            r0 = r10
            r15 = r11
            goto L_0x010c
        L_0x0107:
            r0 = move-exception
            r11 = r15
            goto L_0x012c
        L_0x010a:
            r16 = r14
        L_0x010c:
            int r14 = r14 + r7
            goto L_0x0073
        L_0x010f:
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            boolean r0 = p000.g33.m58016m(r0)
            r15.f2187s = r8
            rc2<t27$b, r37> r2 = r15.f2184g
            t27$b r3 = new t27$b
            java.lang.Object r4 = r15.getValue()
            r3.<init>(r4, r0)
            r2.invoke(r3)
            r37 r0 = p000.r37.f33317a
            return r0
        L_0x012a:
            r0 = move-exception
            r11 = r1
        L_0x012c:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            boolean r2 = p000.g33.m58016m(r2)
            r11.f2187s = r8
            rc2<t27$b, r37> r3 = r11.f2184g
            t27$b r4 = new t27$b
            java.lang.Object r5 = r11.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.AsyncFontListLoader.mo4091f(ns0):java.lang.Object");
    }

    public Object getValue() {
        return this.f2186r.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4092h(p000.y62 r8, p000.ns0<java.lang.Object> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.p004ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.p004ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r8 = r0.L$0
            y62 r8 = (p000.y62) r8
            p000.hg5.m45199b(r9)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            goto L_0x004b
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            p000.hg5.m45199b(r9)
            r5 = 15000(0x3a98, double:7.411E-320)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r9 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r9.<init>(r7, r8, r4)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r0.L$0 = r8     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r0.label = r3     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            java.lang.Object r9 = kotlinx.coroutines.TimeoutKt.m63233d(r5, r9, r0)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r4 = r9
            goto L_0x0085
        L_0x004d:
            r9 = move-exception
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            fu0$a r2 = p000.fu0.f37916i
            kotlin.coroutines.CoroutineContext$a r1 = r1.get(r2)
            fu0 r1 = (p000.fu0) r1
            if (r1 == 0) goto L_0x0085
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r2.<init>(r8, r9)
            r1.mo4113q(r0, r2)
            goto L_0x0085
        L_0x007a:
            r8 = move-exception
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            boolean r9 = p000.g33.m58016m(r9)
            if (r9 == 0) goto L_0x0086
        L_0x0085:
            return r4
        L_0x0086:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.AsyncFontListLoader.mo4092h(y62, ns0):java.lang.Object");
    }

    public final void setValue(Object obj) {
        this.f2186r.setValue(obj);
    }
}
