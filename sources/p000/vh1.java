package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lvh1;", "Lnc5;", "Lr37;", "a", "c", "b", "Lkotlin/Function1;", "Lxh1;", "Lwh1;", "Lrc2;", "effect", "Lwh1;", "onDispose", "<init>", "(Lrc2;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vh1 */
/* compiled from: Effects.kt */
public final class vh1 implements nc5 {

    /* renamed from: a */
    public final rc2<xh1, wh1> f18790a;

    /* renamed from: b */
    public wh1 f18791b;

    public vh1(rc2<? super xh1, ? extends wh1> rc2) {
        vx2.m53591g(rc2, "effect");
        this.f18790a = rc2;
    }

    /* renamed from: a */
    public void mo2988a() {
        this.f18791b = this.f18790a.invoke(vn1.f18856a);
    }

    /* renamed from: b */
    public void mo2989b() {
    }

    /* renamed from: c */
    public void mo2990c() {
        wh1 wh1 = this.f18791b;
        if (wh1 != null) {
            wh1.dispose();
        }
        this.f18791b = null;
    }
}
