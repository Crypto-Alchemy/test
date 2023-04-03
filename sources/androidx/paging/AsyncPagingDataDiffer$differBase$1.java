package androidx.paging;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JO\u0010\f\u001a\u0004\u0018\u00010\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo44877d2 = {"androidx/paging/AsyncPagingDataDiffer$differBase$1", "Landroidx/paging/PagingDataDiffer;", "Lvb4;", "previousList", "newList", "Lil0;", "newCombinedLoadStates", "", "lastAccessedIndex", "Lkotlin/Function0;", "Lr37;", "onListPresentable", "w", "(Lvb4;Lvb4;Lil0;ILpc2;Lns0;)Ljava/lang/Object;", "", "v", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: AsyncPagingDataDiffer.kt */
public final class AsyncPagingDataDiffer$differBase$1 extends PagingDataDiffer<T> {

    /* renamed from: l */
    public final /* synthetic */ AsyncPagingDataDiffer f6108l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$differBase$1(AsyncPagingDataDiffer asyncPagingDataDiffer, hg1 hg1, CoroutineDispatcher coroutineDispatcher) {
        super(hg1, coroutineDispatcher);
        this.f6108l = asyncPagingDataDiffer;
    }

    /* renamed from: v */
    public boolean mo8639v() {
        return this.f6108l.mo8629f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: pc2<r37>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: vb4<T>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo8640w(p000.vb4<T> r5, p000.vb4<T> r6, p000.il0 r7, int r8, p000.pc2<p000.r37> r9, p000.ns0<? super java.lang.Integer> r10) {
        /*
            r4 = this;
            boolean r7 = r10 instanceof androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1
            if (r7 == 0) goto L_0x0013
            r7 = r10
            androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1 r7 = (androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r7.label = r0
            goto L_0x0018
        L_0x0013:
            androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1 r7 = new androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$1
            r7.<init>(r4, r10)
        L_0x0018:
            java.lang.Object r10 = r7.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r7.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0046
            if (r1 != r2) goto L_0x003e
            int r8 = r7.I$0
            java.lang.Object r5 = r7.L$3
            r9 = r5
            pc2 r9 = (p000.pc2) r9
            java.lang.Object r5 = r7.L$2
            r6 = r5
            vb4 r6 = (p000.vb4) r6
            java.lang.Object r5 = r7.L$1
            vb4 r5 = (p000.vb4) r5
            java.lang.Object r7 = r7.L$0
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r7 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r7
            p000.hg5.m45199b(r10)
            goto L_0x0097
        L_0x003e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0046:
            p000.hg5.m45199b(r10)
            int r10 = r5.getSize()
            r1 = 0
            if (r10 != 0) goto L_0x0061
            r9.invoke()
            androidx.paging.AsyncPagingDataDiffer r5 = r4.f6108l
            hg1 r5 = r5.mo8628e()
            int r6 = r6.getSize()
            r5.onInserted(r1, r6)
            goto L_0x00ad
        L_0x0061:
            int r10 = r6.getSize()
            if (r10 != 0) goto L_0x0078
            r9.invoke()
            androidx.paging.AsyncPagingDataDiffer r6 = r4.f6108l
            hg1 r6 = r6.mo8628e()
            int r5 = r5.getSize()
            r6.onRemoved(r1, r5)
            goto L_0x00ad
        L_0x0078:
            androidx.paging.AsyncPagingDataDiffer r10 = r4.f6108l
            kotlinx.coroutines.CoroutineDispatcher r10 = r10.f6106i
            androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 r1 = new androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1
            r1.<init>(r4, r5, r6, r3)
            r7.L$0 = r4
            r7.L$1 = r5
            r7.L$2 = r6
            r7.L$3 = r9
            r7.I$0 = r8
            r7.label = r2
            java.lang.Object r10 = p000.b50.m55768e(r10, r1, r7)
            if (r10 != r0) goto L_0x0096
            return r0
        L_0x0096:
            r7 = r4
        L_0x0097:
            ub4 r10 = (p000.ub4) r10
            r9.invoke()
            androidx.paging.AsyncPagingDataDiffer r7 = r7.f6108l
            di3 r7 = r7.f6104g
            p000.wb4.m29436b(r5, r7, r6, r10)
            int r5 = p000.wb4.m29437c(r5, r10, r6, r8)
            java.lang.Integer r3 = p000.a40.m31673d(r5)
        L_0x00ad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$differBase$1.mo8640w(vb4, vb4, il0, int, pc2, ns0):java.lang.Object");
    }
}
