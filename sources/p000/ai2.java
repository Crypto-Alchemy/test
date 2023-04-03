package p000;

import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: ai2 */
/* compiled from: GoogleApiClientCompatProxy */
public class ai2 {

    /* renamed from: a */
    public final GoogleApiClient f20955a;

    /* renamed from: b */
    public final Class f20956b;

    public ai2(GoogleApiClient googleApiClient) {
        this.f20955a = googleApiClient;
        this.f20956b = googleApiClient.getClass();
    }

    /* renamed from: a */
    public void mo28982a() {
        try {
            this.f20956b.getMethod("connect", new Class[0]).invoke(this.f20955a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo28983b() {
        try {
            this.f20956b.getMethod("disconnect", new Class[0]).invoke(this.f20955a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public GoogleApiClient mo28984c() {
        return this.f20955a;
    }
}
