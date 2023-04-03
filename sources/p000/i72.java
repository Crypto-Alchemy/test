package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.s72;

/* renamed from: i72 */
/* compiled from: FontProvider */
public class i72 {

    /* renamed from: a */
    public static final Comparator<byte[]> f13173a = new h72();

    /* renamed from: i72$a */
    /* compiled from: FontProvider */
    public static class C2529a {
        /* renamed from: a */
        public static Cursor m19446a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    public static List<byte[]> m19439b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m19440c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static List<List<byte[]>> m19441d(j72 j72, Resources resources) {
        if (j72.mo21781b() != null) {
            return j72.mo21781b();
        }
        return m72.m22041c(resources, j72.mo21782c());
    }

    /* renamed from: e */
    public static s72.C3249a m19442e(Context context, j72 j72, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f = m19443f(context.getPackageManager(), j72, context.getResources());
        if (f == null) {
            return s72.C3249a.m26706a(1, (s72.C3250b[]) null);
        }
        return s72.C3249a.m26706a(0, m19445h(context, j72, f.authority, cancellationSignal));
    }

    /* renamed from: f */
    public static ProviderInfo m19443f(PackageManager packageManager, j72 j72, Resources resources) throws PackageManager.NameNotFoundException {
        String e = j72.mo21784e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (resolveContentProvider.packageName.equals(j72.mo21785f())) {
            List<byte[]> b = m19439b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b, f13173a);
            List<List<byte[]>> d = m19441d(j72, resources);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList(d.get(i));
                Collections.sort(arrayList, f13173a);
                if (m19440c(b, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + j72.mo21785f());
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m19444g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* renamed from: h */
    public static s72.C3250b[] m19445h(Context context, j72 j72, String str, CancellationSignal cancellationSignal) {
        int i;
        int i2;
        int i3;
        Uri uri;
        int i4;
        boolean z;
        int i5;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme(PublicResolver.FUNC_CONTENT).authority(str2).build();
        Uri build2 = new Uri.Builder().scheme(PublicResolver.FUNC_CONTENT).authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i6 = 0;
            cursor = C2529a.m19446a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{j72.mo21786g()}, (String) null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor.getInt(columnIndex);
                    } else {
                        i = i6;
                    }
                    if (columnIndex4 != -1) {
                        i2 = cursor.getInt(columnIndex4);
                    } else {
                        i2 = i6;
                    }
                    if (columnIndex3 == -1) {
                        i3 = i;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i3 = i;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    if (columnIndex5 != -1) {
                        i4 = cursor.getInt(columnIndex5);
                    } else {
                        i4 = 400;
                    }
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i5 = i3;
                        z = false;
                    } else {
                        i5 = i3;
                        z = true;
                    }
                    arrayList2.add(s72.C3250b.m26709a(uri, i2, i4, z, i5));
                    i6 = 0;
                }
                arrayList = arrayList2;
            }
            return (s72.C3250b[]) arrayList.toArray(new s72.C3250b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
