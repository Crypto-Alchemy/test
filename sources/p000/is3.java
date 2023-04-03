package p000;

import android.net.Uri;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: is3 */
/* compiled from: MediaStoreUtil */
public final class is3 {
    /* renamed from: a */
    public static boolean m19813a(Uri uri) {
        if (!m19814b(uri) || m19817e(uri)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m19814b(Uri uri) {
        if (uri == null || !PublicResolver.FUNC_CONTENT.equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m19815c(Uri uri) {
        if (!m19814b(uri) || !m19817e(uri)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m19816d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    public static boolean m19817e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
