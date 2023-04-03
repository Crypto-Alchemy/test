package p000;

import android.os.Binder;

/* renamed from: tv8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final /* synthetic */ class tv8 {
    /* renamed from: a */
    public static <V> V m52529a(wv8<V> wv8) {
        long clearCallingIdentity;
        try {
            return wv8.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = wv8.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
