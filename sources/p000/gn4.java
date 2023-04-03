package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* renamed from: gn4 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class gn4 {
    /* renamed from: a */
    public static fn4<Status> m44790a(Status status, GoogleApiClient googleApiClient) {
        cu4.m43222l(status, "Result must not be null");
        r96 r96 = new r96(googleApiClient);
        r96.mo30580g(status);
        return r96;
    }
}
