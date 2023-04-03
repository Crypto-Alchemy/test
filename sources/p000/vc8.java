package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: vc8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public abstract class vc8 extends oc8 implements zc8 {
    /* renamed from: q1 */
    public static zc8 m53338q1(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof zc8) {
            return (zc8) queryLocalInterface;
        }
        return new sc8(iBinder);
    }
}
