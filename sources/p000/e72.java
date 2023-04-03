package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0003¨\u0006\r"}, mo44877d2 = {"", "Ly62;", "Ls27;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lfp4;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/Pair;", "b", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: e72 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class e72 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: androidx.compose.ui.text.font.AsyncTypefaceCache$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: androidx.compose.ui.text.font.AsyncTypefaceCache$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Pair<java.util.List<p000.y62>, java.lang.Object> m15967b(java.util.List<? extends p000.y62> r16, p000.s27 r17, androidx.compose.p004ui.text.font.AsyncTypefaceCache r18, p000.fp4 r19, p000.rc2<? super p000.s27, ? extends java.lang.Object> r20) {
        /*
            r8 = r19
            int r9 = r16.size()
            r10 = 0
            r11 = 0
            r12 = r10
            r13 = r11
        L_0x000a:
            if (r12 >= r9) goto L_0x0198
            r14 = r16
            java.lang.Object r0 = r14.get(r12)
            r15 = r0
            y62 r15 = (p000.y62) r15
            int r0 = r15.mo21856a()
            f72$a r1 = p000.f72.f11555a
            int r2 = r1.mo19710b()
            boolean r2 = p000.f72.m16637e(r0, r2)
            if (r2 == 0) goto L_0x00b0
            ck6 r1 = r18.f2191d
            monitor-enter(r1)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b     // Catch:{ all -> 0x00ad }
            java.lang.Object r2 = r19.mo4086b()     // Catch:{ all -> 0x00ad }
            r0.<init>(r15, r2)     // Catch:{ all -> 0x00ad }
            cm3 r2 = r18.f2189b     // Catch:{ all -> 0x00ad }
            java.lang.Object r2 = r2.mo12115d(r0)     // Catch:{ all -> 0x00ad }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a) r2     // Catch:{ all -> 0x00ad }
            if (r2 != 0) goto L_0x004a
            x16 r2 = r18.f2190c     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r2.mo27649b(r0)     // Catch:{ all -> 0x00ad }
            r2 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a) r2     // Catch:{ all -> 0x00ad }
        L_0x004a:
            if (r2 == 0) goto L_0x0052
            java.lang.Object r0 = r2.mo4101g()     // Catch:{ all -> 0x00ad }
            monitor-exit(r1)
            goto L_0x0066
        L_0x0052:
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x00ad }
            monitor-exit(r1)
            java.lang.Object r0 = r8.mo4087c(r15)     // Catch:{ Exception -> 0x0094 }
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r18
            r2 = r15
            r3 = r19
            r4 = r0
            androidx.compose.p004ui.text.font.AsyncTypefaceCache.m3260f(r1, r2, r3, r4, r5, r6, r7)
        L_0x0066:
            if (r0 == 0) goto L_0x007d
            int r1 = r17.mo25617e()
            r72 r2 = r17.mo25619f()
            int r3 = r17.mo25616d()
            java.lang.Object r0 = p000.p72.m24703a(r1, r0, r15, r2, r3)
            kotlin.Pair r0 = p000.wy6.m54142a(r13, r0)
            return r0
        L_0x007d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load font "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0094:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to load font "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r1)
            throw r0
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00b0:
            int r2 = r1.mo19711c()
            boolean r2 = p000.f72.m16637e(r0, r2)
            if (r2 == 0) goto L_0x0131
            ck6 r1 = r18.f2191d
            monitor-enter(r1)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b     // Catch:{ all -> 0x012e }
            java.lang.Object r2 = r19.mo4086b()     // Catch:{ all -> 0x012e }
            r0.<init>(r15, r2)     // Catch:{ all -> 0x012e }
            cm3 r2 = r18.f2189b     // Catch:{ all -> 0x012e }
            java.lang.Object r2 = r2.mo12115d(r0)     // Catch:{ all -> 0x012e }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a) r2     // Catch:{ all -> 0x012e }
            if (r2 != 0) goto L_0x00df
            x16 r2 = r18.f2190c     // Catch:{ all -> 0x012e }
            java.lang.Object r0 = r2.mo27649b(r0)     // Catch:{ all -> 0x012e }
            r2 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a) r2     // Catch:{ all -> 0x012e }
        L_0x00df:
            if (r2 == 0) goto L_0x00e7
            java.lang.Object r0 = r2.mo4101g()     // Catch:{ all -> 0x012e }
            monitor-exit(r1)
            goto L_0x0114
        L_0x00e7:
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x012e }
            monitor-exit(r1)
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = r8.mo4087c(r15)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = kotlin.Result.m75635constructorimpl(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x0100
        L_0x00f5:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = p000.hg5.m45198a(r0)
            java.lang.Object r0 = kotlin.Result.m75635constructorimpl(r0)
        L_0x0100:
            boolean r1 = kotlin.Result.m75640isFailureimpl(r0)
            if (r1 == 0) goto L_0x0107
            r0 = r11
        L_0x0107:
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r18
            r2 = r15
            r3 = r19
            r4 = r0
            androidx.compose.p004ui.text.font.AsyncTypefaceCache.m3260f(r1, r2, r3, r4, r5, r6, r7)
        L_0x0114:
            if (r0 == 0) goto L_0x012b
            int r1 = r17.mo25617e()
            r72 r2 = r17.mo25619f()
            int r3 = r17.mo25616d()
            java.lang.Object r0 = p000.p72.m24703a(r1, r0, r15, r2, r3)
            kotlin.Pair r0 = p000.wy6.m54142a(r13, r0)
            return r0
        L_0x012b:
            r1 = r18
            goto L_0x017d
        L_0x012e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0131:
            int r1 = r1.mo19709a()
            boolean r0 = p000.f72.m16637e(r0, r1)
            if (r0 == 0) goto L_0x0181
            r1 = r18
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r0 = r1.mo4097d(r15, r8)
            if (r0 != 0) goto L_0x0153
            if (r13 != 0) goto L_0x014f
            r0 = 1
            y62[] r0 = new p000.y62[r0]
            r0[r10] = r15
            java.util.List r13 = p000.ck0.m33068p(r0)
            goto L_0x017d
        L_0x014f:
            r13.add(r15)
            goto L_0x017d
        L_0x0153:
            java.lang.Object r2 = r0.mo4101g()
            boolean r2 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C0457a.m3268e(r2)
            if (r2 == 0) goto L_0x015e
            goto L_0x017d
        L_0x015e:
            java.lang.Object r2 = r0.mo4101g()
            if (r2 == 0) goto L_0x017d
            int r1 = r17.mo25617e()
            java.lang.Object r0 = r0.mo4101g()
            r72 r2 = r17.mo25619f()
            int r3 = r17.mo25616d()
            java.lang.Object r0 = p000.p72.m24703a(r1, r0, r15, r2, r3)
            kotlin.Pair r0 = p000.wy6.m54142a(r13, r0)
            return r0
        L_0x017d:
            int r12 = r12 + 1
            goto L_0x000a
        L_0x0181:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown font type "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0198:
            r1 = r17
            r2 = r20
            java.lang.Object r0 = r2.invoke(r1)
            kotlin.Pair r0 = p000.wy6.m54142a(r13, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e72.m15967b(java.util.List, s27, androidx.compose.ui.text.font.AsyncTypefaceCache, fp4, rc2):kotlin.Pair");
    }
}
