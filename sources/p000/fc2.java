package p000;

import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo44877d2 = {"Lfc2;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "create", "<init>", "()V", "sqlite-framework_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fc2 */
/* compiled from: FrameworkSQLiteOpenHelperFactory.kt */
public final class fc2 implements SupportSQLiteOpenHelper.C1392b {
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        vx2.m53591g(configuration, "configuration");
        return new FrameworkSQLiteOpenHelper(configuration.f6977a, configuration.f6978b, configuration.f6979c, configuration.f6980d, configuration.f6981e);
    }
}
