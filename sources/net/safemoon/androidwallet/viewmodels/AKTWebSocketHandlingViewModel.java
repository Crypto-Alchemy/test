package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002R&\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "Lwj;", "", "request", "Lr37;", "l", "m", "g", "k", "message", "h", "Lkotlin/Function1;", "Lbx5;", "b", "Lrc2;", "callBack", "net/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel$myWebInterface$1", "c", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel$myWebInterface$1;", "myWebInterface", "Ldk7;", "d", "Lef3;", "j", "()Ldk7;", "webSocket", "Lk04;", "e", "Lk04;", "i", "()Lk04;", "response", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTWebSocketHandlingViewModel.kt */
public final class AKTWebSocketHandlingViewModel extends C3552wj {

    /* renamed from: b */
    public rc2<? super bx5, r37> f42603b;

    /* renamed from: c */
    public final AKTWebSocketHandlingViewModel$myWebInterface$1 f42604c = new AKTWebSocketHandlingViewModel$myWebInterface$1(this);

    /* renamed from: d */
    public final ef3 f42605d = C6169a.m47232a(new AKTWebSocketHandlingViewModel$webSocket$2(this));

    /* renamed from: e */
    public final k04<String> f42606e = new k04<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTWebSocketHandlingViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
    }

    /* renamed from: g */
    public final void mo60951g() {
        mo60954j().mo51220a();
    }

    /* renamed from: h */
    public final void mo60952h(String str) {
        this.f42606e.postValue(str);
    }

    /* renamed from: i */
    public final k04<String> mo60953i() {
        return this.f42606e;
    }

    /* renamed from: j */
    public final dk7 mo60954j() {
        return (dk7) this.f42605d.getValue();
    }

    /* renamed from: k */
    public final void mo60955k() {
        mo60954j().mo51223d();
    }

    /* renamed from: l */
    public final void mo60956l(String str) {
        vx2.m53591g(str, "request");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new AKTWebSocketHandlingViewModel$sendMessage$1(mo60954j().mo51221b(), AKTServerFunctions.m12041l0(mo27549b(), str), this, (ns0<? super AKTWebSocketHandlingViewModel$sendMessage$1>) null), 3, (Object) null);
    }

    /* renamed from: m */
    public final void mo60957m() {
    }
}
