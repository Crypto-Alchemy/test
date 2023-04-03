package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u00118\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R%\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u0012\u0010\u001f¨\u0006%"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/WalletConnectViewModel;", "Lwj;", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "rci", "Lr37;", "i", "Llp0;", "b", "Lef3;", "g", "()Llp0;", "WalletConnectDao", "Lnet/safemoon/androidwallet/common/TokenType;", "c", "e", "()Lnet/safemoon/androidwallet/common/TokenType;", "defaultGateWay", "Lk04;", "d", "Lk04;", "f", "()Lk04;", "selectedWallet", "", "kotlin.jvm.PlatformType", "h", "isAutoDisconnect", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfoAndWallet;", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "connectedDApp", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectViewModel.kt */
public final class WalletConnectViewModel extends C3552wj {

    /* renamed from: b */
    public final ef3 f43013b;

    /* renamed from: c */
    public final ef3 f43014c = C6169a.m47232a(new WalletConnectViewModel$defaultGateWay$2(this));

    /* renamed from: d */
    public final k04<TokenType> f43015d;

    /* renamed from: e */
    public final k04<Boolean> f43016e;

    /* renamed from: f */
    public final LiveData<List<RoomConnectedInfoAndWallet>> f43017f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        this.f43013b = C6169a.m47232a(new WalletConnectViewModel$WalletConnectDao$2(application));
        k04<TokenType> k04 = new k04<>();
        this.f43015d = k04;
        this.f43016e = new k04<>(Boolean.TRUE);
        k04.postValue(mo61793e());
        this.f43017f = mo61795g().mo55947b();
    }

    /* renamed from: d */
    public final LiveData<List<RoomConnectedInfoAndWallet>> mo61792d() {
        return this.f43017f;
    }

    /* renamed from: e */
    public final TokenType mo61793e() {
        return (TokenType) this.f43014c.getValue();
    }

    /* renamed from: f */
    public final k04<TokenType> mo61794f() {
        return this.f43015d;
    }

    /* renamed from: g */
    public final lp0 mo61795g() {
        return (lp0) this.f43013b.getValue();
    }

    /* renamed from: h */
    public final k04<Boolean> mo61796h() {
        return this.f43016e;
    }

    /* renamed from: i */
    public final void mo61797i(RoomConnectedInfo roomConnectedInfo) {
        vx2.m53591g(roomConnectedInfo, "rci");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new WalletConnectViewModel$saveConnectedInfo$1(this, roomConnectedInfo, (ns0<? super WalletConnectViewModel$saveConnectedInfo$1>) null), 3, (Object) null);
    }
}
