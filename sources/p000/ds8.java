package p000;

/* renamed from: ds8 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class ds8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ yu8 f28291a;

    public ds8(yu8 yu8) {
        this.f28291a = yu8;
    }

    public final void run() {
        synchronized (this.f28291a.f35929b) {
            yu8 yu8 = this.f28291a;
            if (yu8.f35930c != null) {
                yu8.f35930c.mo28978c();
            }
        }
    }
}
