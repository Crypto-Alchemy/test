package p000;

import java.util.List;

/* renamed from: fq8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class fq8 extends sp8 {

    /* renamed from: b */
    public final cq8 f28948b = new cq8();

    /* renamed from: a */
    public final void mo42649a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f28948b.mo41634a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }
}
