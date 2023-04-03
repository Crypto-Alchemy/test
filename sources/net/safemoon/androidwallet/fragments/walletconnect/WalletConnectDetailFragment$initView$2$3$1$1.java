package net.safemoon.androidwallet.fragments.walletconnect;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.walletconnect.WalletConnectDetailFragment$initView$2$3$1$1", mo48632f = "WalletConnectDetailFragment.kt", mo48633l = {109}, mo48634m = "invokeSuspend")
/* compiled from: WalletConnectDetailFragment.kt */
public final class WalletConnectDetailFragment$initView$2$3$1$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ RoomConnectedInfo $rc;
    public final /* synthetic */ mb2 $this_run;
    public final /* synthetic */ long $walletId;
    public int label;
    public final /* synthetic */ WalletConnectDetailFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.fragments.walletconnect.WalletConnectDetailFragment$initView$2$3$1$1$1", mo48632f = "WalletConnectDetailFragment.kt", mo48633l = {116}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.fragments.walletconnect.WalletConnectDetailFragment$initView$2$3$1$1$1 */
    /* compiled from: WalletConnectDetailFragment.kt */
    public static final class C85841 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/wallets/Wallet;", "it", "Lr37;", "a", "(Lnet/safemoon/androidwallet/model/wallets/Wallet;Lns0;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1})
        /* renamed from: net.safemoon.androidwallet.fragments.walletconnect.WalletConnectDetailFragment$initView$2$3$1$1$1$a */
        /* compiled from: WalletConnectDetailFragment.kt */
        public static final class C8587a<T> implements a52 {

            /* renamed from: a */
            public final /* synthetic */ mb2 f42422a;

            /* renamed from: d */
            public final /* synthetic */ RoomConnectedInfo f42423d;

            public C8587a(mb2 mb2, RoomConnectedInfo roomConnectedInfo) {
                this.f42422a = mb2;
                this.f42423d = roomConnectedInfo;
            }

            /* renamed from: a */
            public final Object emit(Wallet wallet2, ns0<? super r37> ns0) {
                this.f42422a.f31643u.setText(wallet2.displayName());
                this.f42422a.f31642t.setText(wallet2.getAddress(TokenType.Companion.mo57099b(this.f42423d.getChainId()).getCoinType().getValue()));
                return r37.f33317a;
            }
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C85841(walletConnectDetailFragment, j, mb2, roomConnectedInfo, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C85841) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final WalletConnectDetailFragment walletConnectDetailFragment = walletConnectDetailFragment;
                final long j = j;
                z42 f = e52.m57214f(e52.m57228t(new fd2<a52<? super Wallet>, ns0<? super r37>, Object>((ns0<? super C85851>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        C85851 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public WalletConnectDetailFragment$initView$2$3$1$1(WalletConnectDetailFragment walletConnectDetailFragment, long j, mb2 mb2, RoomConnectedInfo roomConnectedInfo, ns0<? super WalletConnectDetailFragment$initView$2$3$1$1> ns0) {
                            super(2, ns0);
                            this.this$0 = walletConnectDetailFragment;
                            this.$walletId = j;
                            this.$this_run = mb2;
                            this.$rc = roomConnectedInfo;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new WalletConnectDetailFragment$initView$2$3$1$1(this.this$0, this.$walletId, this.$this_run, this.$rc, ns0);
                        }

                        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                            return ((WalletConnectDetailFragment$initView$2$3$1$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                CoroutineDispatcher b = qh1.m71265b();
                                final WalletConnectDetailFragment walletConnectDetailFragment = this.this$0;
                                final long j = this.$walletId;
                                final mb2 mb2 = this.$this_run;
                                final RoomConnectedInfo roomConnectedInfo = this.$rc;
                                C85841 r3 = new C85841((ns0<? super C85841>) null);
                                this.label = 1;
                                if (b50.m55768e(b, r3, this) == d) {
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
