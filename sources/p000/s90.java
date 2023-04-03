package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012$\b\u0002\u0010\u0010\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003R3\u0010\u0010\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Ls90;", "T", "", "", "toString", "", "hashCode", "other", "", "equals", "Lkotlin/Function1;", "Lr37;", "Lorg/koin/core/definition/OnCloseCallback;", "a", "Lrc2;", "()Lrc2;", "onClose", "<init>", "(Lrc2;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: s90 */
/* compiled from: Callbacks.kt */
public final class s90<T> {

    /* renamed from: a */
    public final rc2<T, r37> f44544a;

    public s90() {
        this((rc2) null, 1, (DefaultConstructorMarker) null);
    }

    public s90(rc2<? super T, r37> rc2) {
        this.f44544a = rc2;
    }

    /* renamed from: a */
    public final rc2<T, r37> mo65835a() {
        return this.f44544a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s90) && vx2.m53586b(this.f44544a, ((s90) obj).f44544a);
    }

    public int hashCode() {
        rc2<T, r37> rc2 = this.f44544a;
        if (rc2 == null) {
            return 0;
        }
        return rc2.hashCode();
    }

    public String toString() {
        return "Callbacks(onClose=" + this.f44544a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s90(rc2 rc2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rc2);
    }
}
