package p000;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: mm */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class C6254mm {
    /* renamed from: a */
    public static ApiException m48367a(Status status) {
        if (status.mo30527v1()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
