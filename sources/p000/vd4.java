package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, mo44877d2 = {"Lvd4;", "", "Lwd4;", "b", "c", "Lxd4;", "a", "Ltd4;", "Ltd4;", "outcomeEventsCache", "Lwd4;", "repository", "Lld4;", "Lld4;", "logger", "Lyh4;", "d", "Lyh4;", "apiClient", "Ldi4;", "dbHelper", "Lje4;", "preferences", "<init>", "(Lld4;Lyh4;Ldi4;Lje4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: vd4 */
/* compiled from: OSOutcomeEventsFactory.kt */
public final class vd4 {

    /* renamed from: a */
    public final td4 f34922a;

    /* renamed from: b */
    public wd4 f34923b;

    /* renamed from: c */
    public final ld4 f34924c;

    /* renamed from: d */
    public final yh4 f34925d;

    public vd4(ld4 ld4, yh4 yh4, di4 di4, je4 je4) {
        vx2.m53591g(ld4, "logger");
        vx2.m53591g(yh4, "apiClient");
        this.f34924c = ld4;
        this.f34925d = yh4;
        vx2.m53588d(di4);
        vx2.m53588d(je4);
        this.f34922a = new td4(ld4, di4, je4);
    }

    /* renamed from: a */
    public final xd4 mo48732a() {
        if (this.f34922a.mo48075j()) {
            return new be4(this.f34924c, this.f34922a, new ce4(this.f34925d));
        }
        return new zd4(this.f34924c, this.f34922a, new ae4(this.f34925d));
    }

    /* renamed from: b */
    public final wd4 mo48733b() {
        if (this.f34923b != null) {
            return mo48734c();
        }
        return mo48732a();
    }

    /* renamed from: c */
    public final wd4 mo48734c() {
        if (!this.f34922a.mo48075j()) {
            wd4 wd4 = this.f34923b;
            if (wd4 instanceof zd4) {
                vx2.m53588d(wd4);
                return wd4;
            }
        }
        if (this.f34922a.mo48075j()) {
            wd4 wd42 = this.f34923b;
            if (wd42 instanceof be4) {
                vx2.m53588d(wd42);
                return wd42;
            }
        }
        return mo48732a();
    }
}
