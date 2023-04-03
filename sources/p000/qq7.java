package p000;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C4468a;

/* renamed from: qq7 */
public final class qq7 extends oq7<ParcelFileDescriptor> {
    public qq7(C4468a aVar, nv7<ParcelFileDescriptor> nv7) {
        super(aVar, nv7);
    }

    /* renamed from: f1 */
    public final void mo43032f1(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo43032f1(bundle, bundle2);
        this.f32423a.mo46239e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
