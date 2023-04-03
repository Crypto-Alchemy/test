package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import java.util.Locale;

/* renamed from: sr2 */
/* compiled from: ImageStreamCursorProvider */
public class sr2 {

    /* renamed from: c */
    public static final String[] f46535c = {"_id", "_display_name", "_size", "width", "height"};

    /* renamed from: a */
    public final Context f46536a;

    /* renamed from: b */
    public final int f46537b;

    public sr2(Context context, int i) {
        this.f46536a = context;
        this.f46537b = i;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public Cursor mo67444a(int i) {
        if (this.f46536a == null) {
            return null;
        }
        String b = mo67445b();
        if (this.f46537b >= 26) {
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-limit", i);
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{b});
            bundle.putInt("android:query-arg-sort-direction", 1);
            return this.f46536a.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, f46535c, bundle, (CancellationSignal) null);
        }
        return this.f46536a.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, f46535c, (String) null, (String[]) null, String.format(Locale.US, "%s DESC LIMIT %s", new Object[]{b, Integer.valueOf(i)}));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: b */
    public String mo67445b() {
        if (this.f46537b >= 29) {
            return "datetaken";
        }
        return "date_modified";
    }
}
