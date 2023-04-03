package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: z38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class z38 extends RemoteCreator {

    /* renamed from: c */
    public static final z38 f35986c = new z38();

    public z38() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: c */
    public static View m54981c(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        z38 z38 = f35986c;
        try {
            zax zax = new zax(1, i, i2, (Scope[]) null);
            return (View) gf4.m44715r1(((r28) z38.mo30742b(context)).mo47324t1(gf4.m44716s1(context), zax));
        } catch (Exception e) {
            throw new RemoteCreator.RemoteCreatorException("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30741a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof r28) {
            return (r28) queryLocalInterface;
        }
        return new r28(iBinder);
    }
}
