package p000;

/* renamed from: hz8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class hz8 extends az8 {

    /* renamed from: a */
    public final fz8 f29778a = new fz8();

    /* renamed from: a */
    public final void mo29406a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f29778a.mo42703a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
