package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.WalletConnectViewModel$saveConnectedInfo$1", mo48632f = "WalletConnectViewModel.kt", mo48633l = {37}, mo48634m = "invokeSuspend")
/* compiled from: WalletConnectViewModel.kt */
public final class WalletConnectViewModel$saveConnectedInfo$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ RoomConnectedInfo $rci;
    public int label;
    public final /* synthetic */ WalletConnectViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.WalletConnectViewModel$saveConnectedInfo$1$1", mo48632f = "WalletConnectViewModel.kt", mo48633l = {38}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.WalletConnectViewModel$saveConnectedInfo$1$1 */
    /* compiled from: WalletConnectViewModel.kt */
    public static final class C88771 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88771(walletConnectViewModel, roomConnectedInfo, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88771) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                lp0 c = walletConnectViewModel.mo61795g();
                RoomConnectedInfo roomConnectedInfo = roomConnectedInfo;
                this.label = 1;
                if (c.mo55948c(roomConnectedInfo, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                hg5.m45199b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectViewModel$saveConnectedInfo$1(WalletConnectViewModel walletConnectViewModel, RoomConnectedInfo roomConnectedInfo, ns0<? super WalletConnectViewModel$saveConnectedInfo$1> ns0) {
        super(2, ns0);
        this.this$0 = walletConnectViewModel;
        this.$rci = roomConnectedInfo;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new WalletConnectViewModel$saveConnectedInfo$1(this.this$0, this.$rci, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((WalletConnectViewModel$saveConnectedInfo$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final WalletConnectViewModel walletConnectViewModel = this.this$0;
            final RoomConnectedInfo roomConnectedInfo = this.$rci;
            C88771 r1 = new C88771((ns0<? super C88771>) null);
            this.label = 1;
            if (b50.m55768e(b, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
