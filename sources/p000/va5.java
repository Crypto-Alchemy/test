package p000;

import android.content.Context;
import kotlin.Metadata;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.repository.ReflectionDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lva5;", "", "Landroid/content/Context;", "context", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "a", "Lr37;", "b", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "instance", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: va5 */
/* compiled from: ReflectionDataSourceProvider.kt */
public final class va5 {

    /* renamed from: a */
    public static final va5 f45251a = new va5();

    /* renamed from: b */
    public static ReflectionDataSource f45252b;

    /* renamed from: a */
    public final ReflectionDataSource mo66465a(Context context) {
        vx2.m53591g(context, "context");
        if (f45252b == null) {
            synchronized (this) {
                if (f45252b == null) {
                    f45252b = new ReflectionDataSource(ApplicationRoomDatabase.C8270m.m65847c(ApplicationRoomDatabase.f41664p, context, (String) null, 2, (Object) null).mo57116X());
                }
                r37 r37 = r37.f33317a;
            }
        }
        ReflectionDataSource reflectionDataSource = f45252b;
        vx2.m53588d(reflectionDataSource);
        return reflectionDataSource;
    }

    /* renamed from: b */
    public final void mo66466b() {
        f45252b = null;
    }
}
