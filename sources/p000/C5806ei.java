package p000;

import android.database.Cursor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lei;", "Ll76;", "", "next", "", "index", "", "getString", "", "getLong", "(I)Ljava/lang/Long;", "Lr37;", "close", "Landroid/database/Cursor;", "a", "Landroid/database/Cursor;", "cursor", "<init>", "(Landroid/database/Cursor;)V", "sqldelight-android-driver_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: ei */
/* compiled from: AndroidSqliteDriver.kt */
public final class C5806ei implements l76 {

    /* renamed from: a */
    public final Cursor f28624a;

    public C5806ei(Cursor cursor) {
        vx2.m53591g(cursor, "cursor");
        this.f28624a = cursor;
    }

    public void close() {
        this.f28624a.close();
    }

    public Long getLong(int i) {
        if (this.f28624a.isNull(i)) {
            return null;
        }
        return Long.valueOf(this.f28624a.getLong(i));
    }

    public String getString(int i) {
        if (this.f28624a.isNull(i)) {
            return null;
        }
        return this.f28624a.getString(i);
    }

    public boolean next() {
        return this.f28624a.moveToNext();
    }
}
