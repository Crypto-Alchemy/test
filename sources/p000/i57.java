package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: i57 */
/* compiled from: UriUtil */
public class i57 {

    /* renamed from: a */
    public static final Uri f13170a = Uri.withAppendedPath((Uri) C2568ir.m19784a(ContactsContract.AUTHORITY_URI), "display_photo");

    /* renamed from: a */
    public static AssetFileDescriptor m19418a(ContentResolver contentResolver, Uri uri) {
        if (m19426i(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m19419b(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            boolean r0 = m19426i(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0031 }
            if (r8 == 0) goto L_0x002b
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0028 }
            if (r9 == 0) goto L_0x002b
            java.lang.String r9 = "_data"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0028 }
            r0 = -1
            if (r9 == r0) goto L_0x002b
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0028 }
            r1 = r9
            goto L_0x002b
        L_0x0028:
            r9 = move-exception
            r1 = r8
            goto L_0x0032
        L_0x002b:
            if (r8 == 0) goto L_0x0042
            r8.close()
            goto L_0x0042
        L_0x0031:
            r9 = move-exception
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            r1.close()
        L_0x0037:
            throw r9
        L_0x0038:
            boolean r8 = m19427j(r9)
            if (r8 == 0) goto L_0x0042
            java.lang.String r1 = r9.getPath()
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i57.m19419b(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public static String m19420c(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* renamed from: d */
    public static Uri m19421d(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    /* renamed from: e */
    public static boolean m19422e(Uri uri) {
        return "data".equals(m19420c(uri));
    }

    /* renamed from: f */
    public static boolean m19423f(Uri uri) {
        return "asset".equals(m19420c(uri));
    }

    /* renamed from: g */
    public static boolean m19424g(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m19425h(Uri uri) {
        if (uri.getPath() != null && m19426i(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) C2568ir.m19784a(f13170a.getPath()))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m19426i(Uri uri) {
        return PublicResolver.FUNC_CONTENT.equals(m19420c(uri));
    }

    /* renamed from: j */
    public static boolean m19427j(Uri uri) {
        return "file".equals(m19420c(uri));
    }

    /* renamed from: k */
    public static boolean m19428k(Uri uri) {
        return "res".equals(m19420c(uri));
    }

    /* renamed from: l */
    public static boolean m19429l(Uri uri) {
        String c = m19420c(uri);
        if ("https".equals(c) || "http".equals(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m19430m(Uri uri) {
        return "android.resource".equals(m19420c(uri));
    }

    /* renamed from: n */
    public static URL m19431n(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
