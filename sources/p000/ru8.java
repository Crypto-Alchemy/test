package p000;

/* renamed from: ru8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final /* synthetic */ class ru8 implements Runnable {

    /* renamed from: a */
    public final sx8 f33603a;

    public ru8(sx8 sx8) {
        this.f33603a = sx8;
    }

    public final void run() {
        sx8 sx8 = this.f33603a;
        sx8.mo29006e();
        if (!sx8.f34342a.mo45275z().f31369r.mo41988a()) {
            long a = sx8.f34342a.mo45275z().f31370s.mo43882a();
            sx8.f34342a.mo45275z().f31370s.mo43883b(1 + a);
            sx8.f34342a.mo45274y();
            if (a >= 5) {
                sx8.f34342a.mo45237A().mo29673o().mo48769a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                sx8.f34342a.mo45275z().f31369r.mo41989b(true);
                return;
            }
            sx8.f34342a.mo45269o();
            return;
        }
        sx8.f34342a.mo45237A().mo29677u().mo48769a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
