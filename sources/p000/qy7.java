package p000;

import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* renamed from: qy7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class qy7 extends j08 {

    /* renamed from: a */
    public final WeakReference f33301a;

    public qy7(vy7 vy7) {
        this.f33301a = new WeakReference(vy7);
    }

    /* renamed from: n */
    public final void mo47312n(zak zak) {
        vy7 vy7 = (vy7) this.f33301a.get();
        if (vy7 != null) {
            vy7.f35193a.mo45939l(new py7(this, vy7, vy7, zak));
        }
    }
}
