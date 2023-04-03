package p000;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fx0 */
/* compiled from: CueEncoder */
public final class fx0 {
    /* renamed from: a */
    public byte[] mo20264a(List<dx0> list) {
        ArrayList<Bundle> d = b60.m11131d(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", d);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
