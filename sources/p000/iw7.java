package p000;

import java.util.Set;

/* renamed from: iw7 */
public final class iw7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Set f30142a;

    /* renamed from: d */
    public final /* synthetic */ w66 f30143d;

    public iw7(w66 w66, Set set) {
        this.f30143d = w66;
        this.f30142a = set;
    }

    public final void run() {
        try {
            for (String n : this.f30142a) {
                this.f30143d.f35239a.mo46531n(n);
            }
        } catch (Exception unused) {
        }
    }
}
