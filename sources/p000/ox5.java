package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lox5;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lyj7;", "a", "Lyj7;", "()Lyj7;", "webSocket", "Lth1;", "b", "Lth1;", "getWebSocketDisposable", "()Lth1;", "webSocketDisposable", "<init>", "(Lyj7;Lth1;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: ox5 */
/* compiled from: Session.kt */
public final class ox5 {

    /* renamed from: a */
    public final yj7 f32490a;

    /* renamed from: b */
    public final th1 f32491b;

    public ox5(yj7 yj7, th1 th1) {
        vx2.m53591g(yj7, "webSocket");
        vx2.m53591g(th1, "webSocketDisposable");
        this.f32490a = yj7;
        this.f32491b = th1;
    }

    /* renamed from: a */
    public final yj7 mo46557a() {
        return this.f32490a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox5)) {
            return false;
        }
        ox5 ox5 = (ox5) obj;
        return vx2.m53586b(this.f32490a, ox5.f32490a) && vx2.m53586b(this.f32491b, ox5.f32491b);
    }

    public int hashCode() {
        return (this.f32490a.hashCode() * 31) + this.f32491b.hashCode();
    }

    public String toString() {
        return "Session(webSocket=" + this.f32490a + ", webSocketDisposable=" + this.f32491b + ')';
    }
}
