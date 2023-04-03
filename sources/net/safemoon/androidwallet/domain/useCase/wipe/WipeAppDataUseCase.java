package net.safemoon.androidwallet.domain.useCase.wipe;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/domain/useCase/wipe/WipeAppDataUseCase;", "Llp2;", "Lr37;", "execute", "b", "d", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "", "Lxo2;", "Ljava/util/List;", "providerList", "Ltk5;", "kotlin.jvm.PlatformType", "c", "Lef3;", "getSafemoonAPIInterface", "()Ltk5;", "safemoonAPIInterface", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WipeAppDataUseCase.kt */
public final class WipeAppDataUseCase implements lp2 {

    /* renamed from: a */
    public final Context f41856a;

    /* renamed from: b */
    public final List<xo2> f41857b;

    /* renamed from: c */
    public final ef3 f41858c = C6169a.m47232a(WipeAppDataUseCase$safemoonAPIInterface$2.INSTANCE);

    public WipeAppDataUseCase(Context context, List<? extends xo2> list) {
        vx2.m53591g(context, "context");
        vx2.m53591g(list, "providerList");
        this.f41856a = context;
        this.f41857b = list;
    }

    /* renamed from: c */
    public static final void m66343c(tl6 tl6) {
        vx2.m53591g(tl6, "it");
    }

    /* renamed from: b */
    public final void mo57376b() {
        MainRoomDatabase.f41647p.mo57109a(this.f41856a);
        ApplicationRoomDatabase.f41664p.mo57119a(this.f41856a);
        f06.m57510a(this.f41856a);
        FirebaseMessaging.m38582g().mo36210d().mo48131b(new ql7());
    }

    /* renamed from: d */
    public final void mo57377d() {
        for (xo2 a : this.f41857b) {
            a.mo50768a();
        }
    }

    public void execute() {
        mo57376b();
        mo57377d();
    }
}
