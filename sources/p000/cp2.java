package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: cp2 */
/* compiled from: ITrustedWebActivityCallback */
public interface cp2 extends IInterface {

    /* renamed from: cp2$a */
    /* compiled from: ITrustedWebActivityCallback */
    public static abstract class C2101a extends Binder implements cp2 {

        /* renamed from: cp2$a$a */
        /* compiled from: ITrustedWebActivityCallback */
        public static class C2102a implements cp2 {

            /* renamed from: a */
            public IBinder f10201a;

            public C2102a(IBinder iBinder) {
                this.f10201a = iBinder;
            }

            public IBinder asBinder() {
                return this.f10201a;
            }
        }

        /* renamed from: E0 */
        public static cp2 m14351E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof cp2)) {
                return new C2102a(iBinder);
            }
            return (cp2) queryLocalInterface;
        }
    }
}
