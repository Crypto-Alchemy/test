package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ro2 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface ro2 extends IInterface {

    /* renamed from: ro2$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class C6440a extends ba8 implements ro2 {
        public C6440a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: q1 */
        public static ro2 m51194q1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof ro2) {
                return (ro2) queryLocalInterface;
            }
            return new xa8(iBinder);
        }
    }
}
