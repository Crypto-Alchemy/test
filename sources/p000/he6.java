package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, mo44877d2 = {"Lhe6;", "", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", "", "Landroid/net/Uri;", "uris", "Lr37;", "b", "a", "<init>", "()V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: he6 */
/* compiled from: SupportSQLiteCompat.kt */
public final class he6 {

    /* renamed from: a */
    public static final he6 f12834a = new he6();

    /* renamed from: a */
    public static final List<Uri> m18801a(Cursor cursor) {
        vx2.m53591g(cursor, "cursor");
        List<Uri> a = cursor.getNotificationUris();
        vx2.m53588d(a);
        return a;
    }

    /* renamed from: b */
    public static final void m18802b(Cursor cursor, ContentResolver contentResolver, List<? extends Uri> list) {
        vx2.m53591g(cursor, "cursor");
        vx2.m53591g(contentResolver, "cr");
        vx2.m53591g(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
