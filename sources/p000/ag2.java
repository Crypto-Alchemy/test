package p000;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import net.safemoon.androidwallet.model.notificationHistory.NotificationHistory;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo44877d2 = {"Lag2;", "", "", "address", "lang", "Lnet/safemoon/androidwallet/model/notificationHistory/NotificationHistory;", "a", "(Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Ltk5;", "Ltk5;", "api", "<init>", "(Ltk5;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ag2 */
/* compiled from: GetSafeMoonNotificationHistoryUseCase.kt */
public final class ag2 {

    /* renamed from: a */
    public final tk5 f36452a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"ag2$a", "Lp90;", "Lnet/safemoon/androidwallet/model/notificationHistory/NotificationHistory;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ag2$a */
    /* compiled from: GetSafeMoonNotificationHistoryUseCase.kt */
    public static final class C6826a implements p90<NotificationHistory> {

        /* renamed from: a */
        public final /* synthetic */ ns0<NotificationHistory> f36453a;

        public C6826a(ns0<? super NotificationHistory> ns0) {
            this.f36453a = ns0;
        }

        /* renamed from: a */
        public void mo47103a(k90<NotificationHistory> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            ns0<NotificationHistory> ns0 = this.f36453a;
            Result.C6167a aVar = Result.Companion;
            ns0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(th)));
        }

        /* renamed from: b */
        public void mo47104b(k90<NotificationHistory> k90, bg5<NotificationHistory> bg5) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e()) {
                ns0<NotificationHistory> ns0 = this.f36453a;
                Result.C6167a aVar = Result.Companion;
                ns0.resumeWith(Result.m75635constructorimpl(bg5.mo50578a()));
                return;
            }
            this.f36453a.resumeWith(Result.m75635constructorimpl((Object) null));
        }
    }

    public ag2(tk5 tk5) {
        vx2.m53591g(tk5, "api");
        this.f36452a = tk5;
    }

    /* renamed from: a */
    public Object mo50161a(String str, String str2, ns0<? super NotificationHistory> ns0) {
        mk5 mk5 = new mk5(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0));
        this.f36452a.mo66082a(str2, str, a40.m31673d(100), a40.m31673d(0)).mo50512X(new C6826a(mk5));
        Object a = mk5.mo45814a();
        if (a == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return a;
    }
}
