package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: l18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class l18 {

    /* renamed from: c */
    public static final Status f31153c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a */
    public final Set f31154a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    public final k18 f31155b = new k18(this);

    /* renamed from: a */
    public final void mo45331a(BasePendingResult basePendingResult) {
        this.f31154a.add(basePendingResult);
        basePendingResult.mo30585n(this.f31155b);
    }

    /* renamed from: b */
    public final void mo45332b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f31154a.toArray(new BasePendingResult[0])) {
            basePendingResult.mo30585n((k18) null);
            if (basePendingResult.mo30584m()) {
                this.f31154a.remove(basePendingResult);
            }
        }
    }
}
