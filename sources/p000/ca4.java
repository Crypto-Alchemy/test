package p000;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import p000.f94;

/* renamed from: ca4 */
/* compiled from: NotificationCompatJellybean */
public class ca4 {

    /* renamed from: a */
    public static final Object f8400a = new Object();

    /* renamed from: b */
    public static final Object f8401b = new Object();

    /* renamed from: a */
    public static Bundle m11816a(f94.C2270a aVar) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat d = aVar.mo19768d();
        if (d != null) {
            i = d.mo5360j();
        } else {
            i = 0;
        }
        bundle2.putInt("icon", i);
        bundle2.putCharSequence("title", aVar.mo19772h());
        bundle2.putParcelable("actionIntent", aVar.mo19765a());
        if (aVar.mo19767c() != null) {
            bundle = new Bundle(aVar.mo19767c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo19766b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m11818c(aVar.mo19769e()));
        bundle2.putBoolean("showsUserInterface", aVar.mo19771g());
        bundle2.putInt("semanticAction", aVar.mo19770f());
        return bundle2;
    }

    /* renamed from: b */
    public static Bundle m11817b(sc5 sc5) {
        new Bundle();
        throw null;
    }

    /* renamed from: c */
    public static Bundle[] m11818c(sc5[] sc5Arr) {
        if (sc5Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[sc5Arr.length];
        for (int i = 0; i < sc5Arr.length; i++) {
            sc5 sc5 = sc5Arr[i];
            bundleArr[i] = m11817b((sc5) null);
        }
        return bundleArr;
    }
}
