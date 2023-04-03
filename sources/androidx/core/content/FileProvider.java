package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.web3j.ens.contracts.generated.PublicResolver;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {

    /* renamed from: e */
    public static final String[] f3402e = {"_display_name", "_size"};

    /* renamed from: g */
    public static final File f3403g = new File("/");

    /* renamed from: k */
    public static final HashMap<String, C0561b> f3404k = new HashMap<>();

    /* renamed from: a */
    public C0561b f3405a;

    /* renamed from: d */
    public int f3406d = 0;

    /* renamed from: androidx.core.content.FileProvider$a */
    public static class C0560a {
        /* renamed from: a */
        public static File[] m4309a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    public interface C0561b {
        /* renamed from: a */
        Uri mo5353a(File file);

        /* renamed from: b */
        File mo5354b(Uri uri);
    }

    /* renamed from: androidx.core.content.FileProvider$c */
    public static class C0562c implements C0561b {

        /* renamed from: a */
        public final String f3407a;

        /* renamed from: b */
        public final HashMap<String, File> f3408b = new HashMap<>();

        public C0562c(String str) {
            this.f3407a = str;
        }

        /* renamed from: a */
        public Uri mo5353a(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry next : this.f3408b.entrySet()) {
                    String path = ((File) next.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = next;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    if (path2.endsWith("/")) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme(PublicResolver.FUNC_CONTENT).authority(this.f3407a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* renamed from: b */
        public File mo5354b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f3408b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        /* renamed from: c */
        public void mo5355c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f3408b.put(str, file.getCanonicalFile());
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    /* renamed from: a */
    public static File m4301a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    public static Object[] m4302b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: c */
    public static String[] m4303c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: d */
    public static XmlResourceParser m4304d(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    /* renamed from: e */
    public static C0561b m4305e(Context context, String str, int i) {
        C0561b bVar;
        HashMap<String, C0561b> hashMap = f3404k;
        synchronized (hashMap) {
            bVar = hashMap.get(str);
            if (bVar == null) {
                try {
                    bVar = m4308h(context, str, i);
                    hashMap.put(str, bVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return bVar;
    }

    /* renamed from: f */
    public static Uri m4306f(Context context, String str, File file) {
        return m4305e(context, str, 0).mo5353a(file);
    }

    /* renamed from: g */
    public static int m4307g(String str) {
        if ("r".equals(str)) {
            return SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: h */
    public static C0561b m4308h(Context context, String str, int i) throws IOException, XmlPullParserException {
        C0562c cVar = new C0562c(str);
        XmlResourceParser d = m4304d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = d.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = d.getName();
                File file = null;
                String attributeValue = d.getAttributeValue((String) null, PublicResolver.FUNC_NAME);
                String attributeValue2 = d.getAttributeValue((String) null, "path");
                if ("root-path".equals(name)) {
                    file = f3403g;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] g = zr0.m31444g(context, (String) null);
                    if (g.length > 0) {
                        file = g[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] f = zr0.m31443f(context);
                    if (f.length > 0) {
                        file = f[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a = C0560a.m4309a(context);
                    if (a.length > 0) {
                        file = a[0];
                    }
                }
                if (file != null) {
                    cVar.mo5355c(attributeValue, m4301a(file, attributeValue2));
                }
            }
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            HashMap<String, C0561b> hashMap = f3404k;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
            this.f3405a = m4305e(context, str, this.f3406d);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f3405a.mo5354b(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        File b = this.f3405a.mo5354b(uri);
        int lastIndexOf = b.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b.getName().substring(lastIndexOf + 1))) == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f3405a.mo5354b(uri), m4307g(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String str3;
        File b = this.f3405a.mo5354b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f3402e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    str3 = b.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(b.length());
            }
            i2 = i;
        }
        String[] c = m4303c(strArr3, i2);
        Object[] b2 = m4302b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(c, 1);
        matrixCursor.addRow(b2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
