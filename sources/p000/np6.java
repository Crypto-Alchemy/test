package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo44877d2 = {"Lnp6;", "", "Ldp6;", "element", "value", "Lr37;", "a", "Lkotlin/coroutines/CoroutineContext;", "context", "b", "Lkotlin/coroutines/CoroutineContext;", "", "[Ljava/lang/Object;", "values", "c", "[Ldp6;", "elements", "", "d", "I", "i", "n", "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: np6 */
/* compiled from: ThreadContext.kt */
public final class np6 {

    /* renamed from: a */
    public final CoroutineContext f43531a;

    /* renamed from: b */
    public final Object[] f43532b;

    /* renamed from: c */
    public final dp6<Object>[] f43533c;

    /* renamed from: d */
    public int f43534d;

    public np6(CoroutineContext coroutineContext, int i) {
        this.f43531a = coroutineContext;
        this.f43532b = new Object[i];
        this.f43533c = new dp6[i];
    }

    /* renamed from: a */
    public final void mo62778a(dp6<?> dp6, Object obj) {
        Object[] objArr = this.f43532b;
        int i = this.f43534d;
        objArr[i] = obj;
        dp6<Object>[] dp6Arr = this.f43533c;
        this.f43534d = i + 1;
        dp6Arr[i] = dp6;
    }

    /* renamed from: b */
    public final void mo62779b(CoroutineContext coroutineContext) {
        int length = this.f43533c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                dp6<Object> dp6 = this.f43533c[length];
                vx2.m53588d(dp6);
                dp6.mo51248k(coroutineContext, this.f43532b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
