package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.web3j.ens.contracts.generated.PublicResolver;
import zendesk.belvedere.C9833i;
import zendesk.belvedere.MediaResult;

/* renamed from: aa6 */
/* compiled from: Storage */
public class aa6 {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        r4 = r5.getLastPathSegment();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m75255c(android.content.Context r4, android.net.Uri r5, boolean r6) {
        /*
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r5.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            r3 = 1
            if (r2 == 0) goto L_0x001e
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r4 = r4.getType(r5)
            java.lang.String r4 = r0.getExtensionFromMimeType(r4)
            goto L_0x003f
        L_0x001e:
            java.lang.String r4 = "file"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x003d
            java.lang.String r4 = r5.getLastPathSegment()
            java.lang.String r5 = "."
            int r5 = r4.lastIndexOf(r5)
            r0 = -1
            if (r5 == r0) goto L_0x003d
            int r5 = r5 + r3
            int r0 = r4.length()
            java.lang.String r4 = r4.substring(r5, r0)
            goto L_0x003f
        L_0x003d:
            java.lang.String r4 = "tmp"
        L_0x003f:
            if (r6 == 0) goto L_0x004e
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r0 = 0
            r6[r0] = r4
            java.lang.String r4 = ".%s"
            java.lang.String r4 = java.lang.String.format(r5, r4, r6)
        L_0x004e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.aa6.m75255c(android.content.Context, android.net.Uri, boolean):java.lang.String");
    }

    /* renamed from: g */
    public static String m75256g(Context context, Uri uri) {
        String scheme = uri.getScheme();
        String str = "";
        if (PublicResolver.FUNC_CONTENT.equals(scheme)) {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return str;
            }
            try {
                if (query.moveToFirst()) {
                    str = query.getString(0);
                }
                return str;
            } finally {
                query.close();
            }
        } else if ("file".equals(scheme)) {
            return uri.getLastPathSegment();
        } else {
            return str;
        }
    }

    /* renamed from: j */
    public static MediaResult m75257j(Context context, Uri uri) {
        long j;
        String str;
        String str2;
        String str3 = "";
        long j2 = -1;
        if (PublicResolver.FUNC_CONTENT.equals(uri.getScheme())) {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri2 = uri;
            Cursor query = contentResolver.query(uri2, new String[]{"_size", "_display_name"}, (String) null, (String[]) null, (String) null);
            String type = contentResolver.getType(uri2);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        long j3 = query.getLong(query.getColumnIndex("_size"));
                        str3 = query.getString(query.getColumnIndex("_display_name"));
                        j2 = j3;
                    }
                } finally {
                    query.close();
                }
            }
            str2 = str3;
            j = j2;
            str = type;
        } else {
            Uri uri3 = uri;
            str2 = str3;
            str = str2;
            j = -1;
        }
        return new MediaResult((File) null, uri, uri, str2, str, j, -1, -1);
    }

    /* renamed from: a */
    public final File mo67407a(File file, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        return new File(file, sb.toString());
    }

    /* renamed from: b */
    public final File mo67408b(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = str + File.separator;
        } else {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo67414k(context));
        String str3 = File.separator;
        sb.append(str3);
        sb.append("belvedere-data-v2");
        sb.append(str3);
        sb.append(str2);
        File file = new File(sb.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return file;
        }
        return null;
    }

    /* renamed from: d */
    public File mo67409d(Context context, String str, String str2) {
        String str3 = "user";
        if (!TextUtils.isEmpty(str)) {
            str3 = str3 + File.separator + str;
        }
        File b = mo67408b(context, str3);
        if (b != null) {
            return mo67407a(b, str2, (String) null);
        }
        C9833i.m75555e("Belvedere", "Error creating cache directory");
        return null;
    }

    /* renamed from: e */
    public File mo67410e(Context context) {
        File b = mo67408b(context, "media");
        if (b == null) {
            C9833i.m75555e("Belvedere", "Error creating cache directory");
            return null;
        }
        Locale locale = Locale.US;
        return mo67407a(b, String.format(locale, "camera_image_%s", new Object[]{new SimpleDateFormat("yyyyMMddHHmmssSSS", locale).format(new Date(System.currentTimeMillis()))}), ".jpg");
    }

    /* renamed from: f */
    public File mo67411f(Context context, Uri uri, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = "user" + File.separator + str;
        } else {
            str2 = "media";
        }
        File b = mo67408b(context, str2);
        String str3 = null;
        if (b == null) {
            C9833i.m75555e("Belvedere", "Error creating cache directory");
            return null;
        }
        String g = m75256g(context, uri);
        if (TextUtils.isEmpty(g)) {
            Locale locale = Locale.US;
            g = String.format(locale, "attachment_%s", new Object[]{new SimpleDateFormat("yyyyMMddHHmmssSSS", locale).format(new Date(System.currentTimeMillis()))});
            str3 = m75255c(context, uri, true);
        }
        return mo67407a(b, g, str3);
    }

    /* renamed from: h */
    public String mo67412h(Context context) {
        String string = context.getString(p45.belvedere_sdk_fpa_suffix_v2);
        return String.format(Locale.US, "%s%s", new Object[]{context.getPackageName(), string});
    }

    /* renamed from: i */
    public Uri mo67413i(Context context, File file) {
        String h = mo67412h(context);
        try {
            return FileProvider.m4306f(context, h, file);
        } catch (IllegalArgumentException unused) {
            C9833i.m75552b("Belvedere", String.format(Locale.US, "The selected file can't be shared %s", new Object[]{file.toString()}));
            return null;
        } catch (NullPointerException e) {
            C9833i.m75553c("Belvedere", String.format(Locale.US, "=====================\nFileProvider failed to retrieve file uri. There might be an issue with the FileProvider \nPlease make sure that manifest-merger is working, and that you have defined the applicationId (package name) in the build.gradle\nManifest merger: http://tools.android.com/tech-docs/new-build-system/user-guide/manifest-merger\nIf your are not able to use gradle or the manifest merger, please add the following to your AndroidManifest.xml:\n        <provider\n            android:name=\"com.zendesk.belvedere.BelvedereFileProvider\"\n            android:authorities=\"${applicationId}%s\"\n            android:exported=\"false\"\n            android:grantUriPermissions=\"true\">\n            <meta-data\n                android:name=\"android.support.FILE_PROVIDER_PATHS\"\n                android:resource=\"@xml/belvedere_attachment_storage_v2\" />\n        </provider>\n=====================", new Object[]{h}), e);
            throw new RuntimeException("Please specify your application id");
        }
    }

    /* renamed from: k */
    public final String mo67414k(Context context) {
        return context.getCacheDir().getAbsolutePath();
    }

    /* renamed from: l */
    public void mo67415l(Context context, Intent intent, Uri uri, int i) {
        intent.addFlags(i);
    }

    /* renamed from: m */
    public void mo67416m(Context context, Uri uri, int i) {
        context.revokeUriPermission(uri, i);
    }
}
