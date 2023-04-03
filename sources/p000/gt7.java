package p000;

/* renamed from: gt7 */
public final class gt7 extends at7 {

    /* renamed from: a */
    public final et7 f29352a = new et7();

    /* renamed from: a */
    public final void mo29053a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f29352a.mo42412a(th).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
