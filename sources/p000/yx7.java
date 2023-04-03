package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p000.fn4;

/* renamed from: yx7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class yx7 implements fn4.C5843a {

    /* renamed from: a */
    public final /* synthetic */ BasePendingResult f35939a;

    /* renamed from: b */
    public final /* synthetic */ cy7 f35940b;

    public yx7(cy7 cy7, BasePendingResult basePendingResult) {
        this.f35940b = cy7;
        this.f35939a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo42613a(Status status) {
        this.f35940b.f27993a.remove(this.f35939a);
    }
}
