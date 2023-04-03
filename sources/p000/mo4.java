package p000;

import android.net.Uri;
import com.google.android.gms.common.api.C4013a;

/* renamed from: mo4 */
public final class mo4 {

    /* renamed from: a */
    public static final C4013a.C4022g<yk8> f31749a;

    /* renamed from: b */
    public static final C4013a.C4014a<yk8, Object> f31750b;
    @Deprecated

    /* renamed from: c */
    public static final C4013a<Object> f31751c;
    @Deprecated

    /* renamed from: d */
    public static final j99 f31752d = new mh8();

    /* JADX WARNING: type inference failed for: r0v1, types: [j99, mh8] */
    static {
        C4013a.C4022g<yk8> gVar = new C4013a.C4022g<>();
        f31749a = gVar;
        z69 z69 = new z69();
        f31750b = z69;
        f31751c = new C4013a<>("Phenotype.API", z69, gVar);
    }

    /* renamed from: a */
    public static Uri m48389a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
