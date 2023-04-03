package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0011\u0010\u000fJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo44877d2 = {"Lbx;", "Lxw3;", "T", "Luw3;", "key", "b", "(Luw3;)Ljava/lang/Object;", "", "a", "(Luw3;)Z", "Lax3;", "Lax3;", "getElement", "()Lax3;", "c", "(Lax3;)V", "element", "<init>", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bx */
/* compiled from: ModifierLocalNode.kt */
public final class C1658bx extends xw3 {

    /* renamed from: a */
    public ax3<?> f8285a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1658bx(ax3<?> ax3) {
        super((DefaultConstructorMarker) null);
        vx2.m53591g(ax3, "element");
        this.f8285a = ax3;
    }

    /* renamed from: a */
    public boolean mo11920a(uw3<?> uw3) {
        vx2.m53591g(uw3, "key");
        if (uw3 == this.f8285a.getKey()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public <T> T mo11921b(uw3<T> uw3) {
        boolean z;
        vx2.m53591g(uw3, "key");
        if (uw3 == this.f8285a.getKey()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f8285a.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public final void mo11922c(ax3<?> ax3) {
        vx2.m53591g(ax3, "<set-?>");
        this.f8285a = ax3;
    }
}
