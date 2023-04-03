package p000;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: ex0 */
/* compiled from: CueDecoder */
public final class ex0 {
    /* renamed from: a */
    public ImmutableList<dx0> mo19500a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return b60.m11129b(dx0.f10934U, (ArrayList) C2725kr.m20985e(readBundle.getParcelableArrayList("c")));
    }
}
