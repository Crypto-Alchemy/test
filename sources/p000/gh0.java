package p000;

import android.database.Cursor;

/* renamed from: gh0 */
/* compiled from: CloseHelper */
public class gh0 {
    /* renamed from: a */
    public static void m44724a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
