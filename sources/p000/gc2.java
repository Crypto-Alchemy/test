package p000;

import android.database.sqlite.SQLiteProgram;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lgc2;", "Lje6;", "", "index", "Lr37;", "bindNull", "", "value", "bindLong", "", "bindDouble", "", "bindString", "", "bindBlob", "close", "Landroid/database/sqlite/SQLiteProgram;", "a", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gc2 */
/* compiled from: FrameworkSQLiteProgram.kt */
public class gc2 implements je6 {

    /* renamed from: a */
    public final SQLiteProgram f12278a;

    public gc2(SQLiteProgram sQLiteProgram) {
        vx2.m53591g(sQLiteProgram, "delegate");
        this.f12278a = sQLiteProgram;
    }

    public void bindBlob(int i, byte[] bArr) {
        vx2.m53591g(bArr, "value");
        this.f12278a.bindBlob(i, bArr);
    }

    public void bindDouble(int i, double d) {
        this.f12278a.bindDouble(i, d);
    }

    public void bindLong(int i, long j) {
        this.f12278a.bindLong(i, j);
    }

    public void bindNull(int i) {
        this.f12278a.bindNull(i);
    }

    public void bindString(int i, String str) {
        vx2.m53591g(str, "value");
        this.f12278a.bindString(i, str);
    }

    public void close() {
        this.f12278a.close();
    }
}
