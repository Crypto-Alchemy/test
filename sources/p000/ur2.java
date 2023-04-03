package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.MediaResult;

/* renamed from: ur2 */
/* compiled from: ImageStreamService */
public class ur2 {

    /* renamed from: a */
    public final Context f46538a;

    /* renamed from: b */
    public final sr2 f46539b;

    public ur2(Context context) {
        this.f46538a = context.getApplicationContext();
        this.f46539b = new sr2(context, Build.VERSION.SDK_INT);
    }

    /* renamed from: a */
    public boolean mo67458a(String str) {
        return n77.m75286c(str, this.f46538a);
    }

    /* renamed from: b */
    public List<MediaResult> mo67459b(int i) {
        int lastIndexOf;
        ArrayList arrayList = new ArrayList();
        Cursor a = this.f46539b.mo67444a(i);
        if (a != null) {
            while (a.moveToNext()) {
                try {
                    Uri contentUri = MediaStore.Files.getContentUri("external", a.getLong(a.getColumnIndex("_id")));
                    long j = a.getLong(a.getColumnIndex("_size"));
                    long j2 = a.getLong(a.getColumnIndex("width"));
                    long j3 = a.getLong(a.getColumnIndex("height"));
                    String string = a.getString(a.getColumnIndex("_display_name"));
                    String str = "image/jpeg";
                    if (!TextUtils.isEmpty(string) && (lastIndexOf = string.lastIndexOf(".")) != -1) {
                        str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(string.substring(lastIndexOf + 1));
                    }
                    arrayList.add(new MediaResult((File) null, contentUri, contentUri, string, str, j, j2, j3));
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
        }
        if (a != null) {
            a.close();
        }
        return arrayList;
    }
}
