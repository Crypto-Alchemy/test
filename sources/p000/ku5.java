package p000;

import kotlin.Metadata;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0001\u001a\u00020\u0005H\u0016R*\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0010"}, mo44877d2 = {"Lku5;", "E", "Lju5;", "", "v", "Lr37;", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "r", "Lrc2;", "onUndeliveredElement", "pollResult", "Lma0;", "cont", "<init>", "(Ljava/lang/Object;Lma0;Lrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ku5 */
/* compiled from: AbstractChannel.kt */
public final class ku5<E> extends ju5<E> {

    /* renamed from: r */
    public final rc2<E, r37> f40534r;

    public ku5(E e, ma0<? super r37> ma0, rc2<? super E, r37> rc2) {
        super(e, ma0);
        this.f40534r = rc2;
    }

    /* renamed from: E */
    public void mo52019E() {
        OnUndeliveredElementKt.m63492b(this.f40534r, mo52016B(), this.f38798k.getContext());
    }

    /* renamed from: v */
    public boolean mo50615v() {
        if (!super.mo50615v()) {
            return false;
        }
        mo52019E();
        return true;
    }
}
