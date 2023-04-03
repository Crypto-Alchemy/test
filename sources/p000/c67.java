package p000;

import android.content.Context;
import kotlin.Metadata;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, mo44877d2 = {"Lc67;", "Lxo2;", "Landroid/content/Context;", "context", "Lip2;", "b", "Lr37;", "a", "Lip2;", "instance", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: c67 */
/* compiled from: UserTokenListRepositoryProvider.kt */
public final class c67 implements xo2 {

    /* renamed from: a */
    public static final c67 f37071a = new c67();

    /* renamed from: b */
    public static ip2 f37072b;

    /* renamed from: a */
    public void mo50768a() {
        f37072b = null;
    }

    /* renamed from: b */
    public final ip2 mo50813b(Context context) {
        vx2.m53591g(context, "context");
        if (f37072b == null) {
            synchronized (this) {
                if (f37072b == null) {
                    f37072b = new b67(new LocalUserTokenDataSource(ApplicationRoomDatabase.C8270m.m65847c(ApplicationRoomDatabase.f41664p, context, (String) null, 2, (Object) null).mo57118Z()));
                }
                r37 r37 = r37.f33317a;
            }
        }
        ip2 ip2 = f37072b;
        vx2.m53588d(ip2);
        return ip2;
    }
}
