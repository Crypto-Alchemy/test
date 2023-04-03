package p000;

import androidx.sqlite.p006db.SupportSQLiteStatement;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lfj;", "Lkj;", "", "index", "", "value", "Lr37;", "b", "(ILjava/lang/Long;)V", "", "bindString", "", "c", "execute", "close", "Landroidx/sqlite/db/SupportSQLiteStatement;", "a", "Landroidx/sqlite/db/SupportSQLiteStatement;", "statement", "<init>", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", "sqldelight-android-driver_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: fj */
/* compiled from: AndroidSqliteDriver.kt */
public final class C5842fj implements C6155kj {

    /* renamed from: a */
    public final SupportSQLiteStatement f28886a;

    public C5842fj(SupportSQLiteStatement supportSQLiteStatement) {
        vx2.m53591g(supportSQLiteStatement, "statement");
        this.f28886a = supportSQLiteStatement;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ l76 mo39607a() {
        return (l76) mo42600c();
    }

    /* renamed from: b */
    public void mo39608b(int i, Long l) {
        if (l == null) {
            this.f28886a.bindNull(i);
        } else {
            this.f28886a.bindLong(i, l.longValue());
        }
    }

    public void bindString(int i, String str) {
        if (str == null) {
            this.f28886a.bindNull(i);
        } else {
            this.f28886a.bindString(i, str);
        }
    }

    /* renamed from: c */
    public Void mo42600c() {
        throw new UnsupportedOperationException();
    }

    public void close() {
        this.f28886a.close();
    }

    public void execute() {
        this.f28886a.execute();
    }
}
