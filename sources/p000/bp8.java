package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: bp8 */
public abstract class bp8 extends y98 implements kl8 {
    /* renamed from: E0 */
    public static kl8 m32682E0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof kl8 ? (kl8) queryLocalInterface : new ls8(iBinder);
    }
}
