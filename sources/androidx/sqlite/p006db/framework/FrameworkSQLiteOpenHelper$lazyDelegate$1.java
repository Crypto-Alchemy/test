package androidx.sqlite.p006db.framework;

import androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1 */
/* compiled from: FrameworkSQLiteOpenHelper.kt */
public final class FrameworkSQLiteOpenHelper$lazyDelegate$1 extends Lambda implements pc2<FrameworkSQLiteOpenHelper.OpenHelper> {
    public final /* synthetic */ FrameworkSQLiteOpenHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$lazyDelegate$1(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        super(0);
        this.this$0 = frameworkSQLiteOpenHelper;
    }

    public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        if (this.this$0.f6996d == null || !this.this$0.f6998g) {
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.this$0.f6995a, this.this$0.f6996d, new FrameworkSQLiteOpenHelper.C1397b((FrameworkSQLiteDatabase) null), this.this$0.f6997e, this.this$0.f6999k);
        } else {
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.this$0.f6995a, new File(de6.m15039a(this.this$0.f6995a), this.this$0.f6996d).getAbsolutePath(), new FrameworkSQLiteOpenHelper.C1397b((FrameworkSQLiteDatabase) null), this.this$0.f6997e, this.this$0.f6999k);
        }
        be6.m11301f(openHelper, this.this$0.f7001s);
        return openHelper;
    }
}
