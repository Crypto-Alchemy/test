package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ep2 */
/* compiled from: IUnusedAppRestrictionsBackportCallback */
public interface ep2 extends IInterface {

    /* renamed from: ep2$a */
    /* compiled from: IUnusedAppRestrictionsBackportCallback */
    public static abstract class C2244a extends Binder implements ep2 {

        /* renamed from: ep2$a$a */
        /* compiled from: IUnusedAppRestrictionsBackportCallback */
        public static class C2245a implements ep2 {

            /* renamed from: a */
            public IBinder f11299a;

            public C2245a(IBinder iBinder) {
                this.f11299a = iBinder;
            }

            public IBinder asBinder() {
                return this.f11299a;
            }
        }

        /* renamed from: E0 */
        public static ep2 m16272E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ep2)) {
                return new C2245a(iBinder);
            }
            return (ep2) queryLocalInterface;
        }
    }
}
