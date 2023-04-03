package androidx.paging;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo44877d2 = {"Landroidx/paging/FlattenedPageController;", "", "T", "Lwt2;", "Lvk4;", "event", "Lr37;", "b", "(Lwt2;Lns0;)Ljava/lang/Object;", "Landroidx/paging/TemporaryDownstream;", "a", "(Lns0;)Ljava/lang/Object;", "Ld42;", "Ld42;", "list", "", "Ljava/util/List;", "snapshots", "Ly04;", "c", "Ly04;", "lock", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: CachedPageEventFlow.kt */
public final class FlattenedPageController<T> {

    /* renamed from: a */
    public final d42<T> f6128a = new d42<>();

    /* renamed from: b */
    public List<TemporaryDownstream<T>> f6129b = ck0.m33062j();

    /* renamed from: c */
    public final y04 f6130c = z04.m74724b(false, 1, (Object) null);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086 A[Catch:{ all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo8652a(p000.ns0<? super androidx.paging.TemporaryDownstream<T>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof androidx.paging.FlattenedPageController$createTemporaryDownstream$1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x0013
            r0 = r13
            androidx.paging.FlattenedPageController$createTemporaryDownstream$1 r0 = (androidx.paging.FlattenedPageController$createTemporaryDownstream$1) r0
            int r2 = r0.label
            r3 = r2 & r1
            if (r3 == 0) goto L_0x0013
            int r2 = r2 - r1
            r0.label = r2
            goto L_0x0018
        L_0x0013:
            androidx.paging.FlattenedPageController$createTemporaryDownstream$1 r0 = new androidx.paging.FlattenedPageController$createTemporaryDownstream$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r2 = p000.wx2.m54101d()
            int r3 = r0.label
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0058
            if (r3 == r6) goto L_0x004b
            if (r3 != r4) goto L_0x0043
            int r3 = r0.I$0
            java.lang.Object r6 = r0.L$3
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$2
            androidx.paging.TemporaryDownstream r7 = (androidx.paging.TemporaryDownstream) r7
            java.lang.Object r8 = r0.L$1
            androidx.paging.TemporaryDownstream r8 = (androidx.paging.TemporaryDownstream) r8
            java.lang.Object r9 = r0.L$0
            y04 r9 = (p000.y04) r9
            p000.hg5.m45199b(r13)     // Catch:{ all -> 0x0040 }
            r13 = r3
            goto L_0x0080
        L_0x0040:
            r13 = move-exception
            goto L_0x00ba
        L_0x0043:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x004b:
            java.lang.Object r3 = r0.L$1
            y04 r3 = (p000.y04) r3
            java.lang.Object r6 = r0.L$0
            androidx.paging.FlattenedPageController r6 = (androidx.paging.FlattenedPageController) r6
            p000.hg5.m45199b(r13)
            r9 = r3
            goto L_0x006c
        L_0x0058:
            p000.hg5.m45199b(r13)
            y04 r13 = r12.f6130c
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r6
            java.lang.Object r3 = r13.mo55746a(r5, r0)
            if (r3 != r2) goto L_0x006a
            return r2
        L_0x006a:
            r6 = r12
            r9 = r13
        L_0x006c:
            androidx.paging.TemporaryDownstream r13 = new androidx.paging.TemporaryDownstream     // Catch:{ all -> 0x0040 }
            r13.<init>()     // Catch:{ all -> 0x0040 }
            d42<T> r3 = r6.f6128a     // Catch:{ all -> 0x0040 }
            java.util.List r3 = r3.mo18491b()     // Catch:{ all -> 0x0040 }
            r6 = 0
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0040 }
            r7 = r13
            r8 = r7
            r13 = r6
            r6 = r3
        L_0x0080:
            boolean r3 = r6.hasNext()     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x00b6
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x0040 }
            int r10 = r13 + 1
            if (r13 >= 0) goto L_0x0091
            p000.ck0.m33072t()     // Catch:{ all -> 0x0040 }
        L_0x0091:
            java.lang.Integer r13 = p000.a40.m31673d(r13)     // Catch:{ all -> 0x0040 }
            vk4 r3 = (p000.vk4) r3     // Catch:{ all -> 0x0040 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0040 }
            wt2 r11 = new wt2     // Catch:{ all -> 0x0040 }
            int r13 = r13 + r1
            r11.<init>(r13, r3)     // Catch:{ all -> 0x0040 }
            r0.L$0 = r9     // Catch:{ all -> 0x0040 }
            r0.L$1 = r8     // Catch:{ all -> 0x0040 }
            r0.L$2 = r7     // Catch:{ all -> 0x0040 }
            r0.L$3 = r6     // Catch:{ all -> 0x0040 }
            r0.I$0 = r10     // Catch:{ all -> 0x0040 }
            r0.label = r4     // Catch:{ all -> 0x0040 }
            java.lang.Object r13 = r7.mo8762c(r11, r0)     // Catch:{ all -> 0x0040 }
            if (r13 != r2) goto L_0x00b4
            return r2
        L_0x00b4:
            r13 = r10
            goto L_0x0080
        L_0x00b6:
            r9.mo55747b(r5)
            return r8
        L_0x00ba:
            r9.mo55747b(r5)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.mo8652a(ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3 A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7 A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo8653b(p000.wt2<? extends p000.vk4<T>> r10, p000.ns0<? super p000.r37> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.paging.FlattenedPageController$record$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.paging.FlattenedPageController$record$1 r0 = (androidx.paging.FlattenedPageController$record$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.FlattenedPageController$record$1 r0 = new androidx.paging.FlattenedPageController$record$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0061
            if (r2 == r4) goto L_0x004f
            if (r2 != r3) goto L_0x0047
            java.lang.Object r10 = r0.L$5
            java.lang.Object r2 = r0.L$4
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$3
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r6 = r0.L$2
            androidx.paging.FlattenedPageController r6 = (androidx.paging.FlattenedPageController) r6
            java.lang.Object r7 = r0.L$1
            y04 r7 = (p000.y04) r7
            java.lang.Object r8 = r0.L$0
            wt2 r8 = (p000.wt2) r8
            p000.hg5.m45199b(r11)     // Catch:{ all -> 0x0044 }
            goto L_0x00b3
        L_0x0044:
            r10 = move-exception
            goto L_0x00d3
        L_0x0047:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004f:
            java.lang.Object r10 = r0.L$2
            y04 r10 = (p000.y04) r10
            java.lang.Object r2 = r0.L$1
            wt2 r2 = (p000.wt2) r2
            java.lang.Object r4 = r0.L$0
            androidx.paging.FlattenedPageController r4 = (androidx.paging.FlattenedPageController) r4
            p000.hg5.m45199b(r11)
            r7 = r10
            r10 = r2
            goto L_0x0077
        L_0x0061:
            p000.hg5.m45199b(r11)
            y04 r11 = r9.f6130c
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r2 = r11.mo55746a(r5, r0)
            if (r2 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r4 = r9
            r7 = r11
        L_0x0077:
            d42<T> r11 = r4.f6128a     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r10.mo49266d()     // Catch:{ all -> 0x0044 }
            vk4 r2 = (p000.vk4) r2     // Catch:{ all -> 0x0044 }
            r11.mo18490a(r2)     // Catch:{ all -> 0x0044 }
            java.util.List<androidx.paging.TemporaryDownstream<T>> r11 = r4.f6129b     // Catch:{ all -> 0x0044 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0044 }
            r2.<init>()     // Catch:{ all -> 0x0044 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0044 }
            r8 = r10
            r6 = r4
            r4 = r2
            r2 = r11
        L_0x0091:
            boolean r10 = r2.hasNext()     // Catch:{ all -> 0x0044 }
            if (r10 == 0) goto L_0x00c7
            java.lang.Object r10 = r2.next()     // Catch:{ all -> 0x0044 }
            r11 = r10
            androidx.paging.TemporaryDownstream r11 = (androidx.paging.TemporaryDownstream) r11     // Catch:{ all -> 0x0044 }
            r0.L$0 = r8     // Catch:{ all -> 0x0044 }
            r0.L$1 = r7     // Catch:{ all -> 0x0044 }
            r0.L$2 = r6     // Catch:{ all -> 0x0044 }
            r0.L$3 = r4     // Catch:{ all -> 0x0044 }
            r0.L$4 = r2     // Catch:{ all -> 0x0044 }
            r0.L$5 = r10     // Catch:{ all -> 0x0044 }
            r0.label = r3     // Catch:{ all -> 0x0044 }
            java.lang.Object r11 = r11.mo8762c(r8, r0)     // Catch:{ all -> 0x0044 }
            if (r11 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0044 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r11 = p000.a40.m31670a(r11)     // Catch:{ all -> 0x0044 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r11 == 0) goto L_0x0091
            r4.add(r10)     // Catch:{ all -> 0x0044 }
            goto L_0x0091
        L_0x00c7:
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0044 }
            r6.f6129b = r4     // Catch:{ all -> 0x0044 }
            r37 r10 = p000.r37.f33317a     // Catch:{ all -> 0x0044 }
            r7.mo55747b(r5)
            r37 r10 = p000.r37.f33317a
            return r10
        L_0x00d3:
            r7.mo55747b(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.mo8653b(wt2, ns0):java.lang.Object");
    }
}
