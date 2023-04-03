package p000;

/* renamed from: pg9 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class pg9 extends lb9 {

    /* renamed from: a */
    public final we9 f32705a = new we9();

    /* renamed from: a */
    public final void mo42899a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f32705a.mo49189a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
