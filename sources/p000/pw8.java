package p000;

import android.net.Uri;

/* renamed from: pw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class pw8 {

    /* renamed from: a */
    public static final C2781lq<String, Uri> f32859a = new C2781lq<>();

    /* renamed from: a */
    public static synchronized Uri m50175a(String str) {
        Uri uri;
        String str2;
        synchronized (pw8.class) {
            C2781lq<String, Uri> lqVar = f32859a;
            uri = lqVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                if (valueOf.length() != 0) {
                    str2 = "content://com.google.android.gms.phenotype/".concat(valueOf);
                } else {
                    str2 = new String("content://com.google.android.gms.phenotype/");
                }
                uri = Uri.parse(str2);
                lqVar.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
