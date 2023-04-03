package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: p68 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class p68 extends ba8 implements w68 {
    /* renamed from: q1 */
    public static w68 m49811q1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof w68) {
            return (w68) queryLocalInterface;
        }
        return new h68(iBinder);
    }
}
