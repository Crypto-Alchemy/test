package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ww7 */
public abstract class ww7 extends sv7 implements zw7 {
    /* renamed from: q1 */
    public static zw7 m54091q1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof zw7 ? (zw7) queryLocalInterface : new tw7(iBinder);
    }
}
