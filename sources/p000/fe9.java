package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: fe9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class fe9 {

    /* renamed from: a */
    public final om6 f28848a;

    /* renamed from: b */
    public final AtomicLong f28849b = new AtomicLong(-1);

    public fe9(Context context, String str) {
        this.f28848a = nm6.m48838b(context, pm6.m50008a().mo46786b("mlkit:vision").mo46785a());
    }

    /* renamed from: a */
    public static fe9 m44307a(Context context) {
        return new fe9(context, "mlkit:vision");
    }
}
