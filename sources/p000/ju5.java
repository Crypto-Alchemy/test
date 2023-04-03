package p000;

import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lju5;", "E", "Lgu5;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "otherOp", "Lxj6;", "D", "Lr37;", "A", "Lsh0;", "closed", "C", "", "toString", "g", "Ljava/lang/Object;", "B", "()Ljava/lang/Object;", "pollResult", "Lma0;", "k", "Lma0;", "cont", "<init>", "(Ljava/lang/Object;Lma0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ju5 */
/* compiled from: AbstractChannel.kt */
public class ju5<E> extends gu5 {

    /* renamed from: g */
    public final E f38797g;

    /* renamed from: k */
    public final ma0<r37> f38798k;

    public ju5(E e, ma0<? super r37> ma0) {
        this.f38797g = e;
        this.f38798k = ma0;
    }

    /* renamed from: A */
    public void mo52015A() {
        this.f38798k.mo56162F(oa0.f43593a);
    }

    /* renamed from: B */
    public E mo52016B() {
        return this.f38797g;
    }

    /* renamed from: C */
    public void mo52017C(sh0<?> sh0) {
        ma0<r37> ma0 = this.f38798k;
        Result.C6167a aVar = Result.Companion;
        ma0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(sh0.mo65853I())));
    }

    /* renamed from: D */
    public xj6 mo52018D(LockFreeLinkedListNode.C7797b bVar) {
        if (this.f38798k.mo56163f(r37.f33317a, (Object) null) == null) {
            return null;
        }
        return oa0.f43593a;
    }

    public String toString() {
        return b31.m55722a(this) + '@' + b31.m55723b(this) + '(' + mo52016B() + ')';
    }
}
