package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: a19 */
public final class a19 extends jh2<kb9> {
    public a19(Context context, Looper looper, sg0 sg0, GoogleApiClient.C4011b bVar, GoogleApiClient.C4012c cVar) {
        super(context, looper, 40, sg0, bVar, cVar);
    }

    /* renamed from: J */
    public final String mo28792J() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* renamed from: K */
    public final String mo28793K() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* renamed from: p */
    public final int mo28794p() {
        return 11925000;
    }

    /* renamed from: x */
    public final /* synthetic */ IInterface mo28795x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof kb9 ? (kb9) queryLocalInterface : new wc9(iBinder);
    }
}
