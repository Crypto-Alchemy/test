package net.safemoon.androidwallet.viewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.room.RoomToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$loadOnSwapTokenList$1", mo48632f = "MyTokensListViewModel.kt", mo48633l = {265}, mo48634m = "invokeSuspend")
/* compiled from: MyTokensListViewModel.kt */
public final class MyTokensListViewModel$loadOnSwapTokenList$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ TokenType $tokenType;
    public int label;
    public final /* synthetic */ MyTokensListViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$loadOnSwapTokenList$1$1", mo48632f = "MyTokensListViewModel.kt", mo48633l = {272}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$loadOnSwapTokenList$1$1 */
    /* compiled from: MyTokensListViewModel.kt */
    public static final class C87151 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87151(myTokensListViewModel, tokenType, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87151) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final MyTokensListViewModel myTokensListViewModel = myTokensListViewModel;
                final TokenType tokenType = tokenType;
                z42 f = e52.m57214f(e52.m57228t(new fd2<a52<? super List<? extends RoomToken>>, ns0<? super r37>, Object>((ns0<? super C87161>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        C87161 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public MyTokensListViewModel$loadOnSwapTokenList$1(MyTokensListViewModel myTokensListViewModel, TokenType tokenType, ns0<? super MyTokensListViewModel$loadOnSwapTokenList$1> ns0) {
                            super(2, ns0);
                            this.this$0 = myTokensListViewModel;
                            this.$tokenType = tokenType;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new MyTokensListViewModel$loadOnSwapTokenList$1(this.this$0, this.$tokenType, ns0);
                        }

                        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                            return ((MyTokensListViewModel$loadOnSwapTokenList$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                CoroutineDispatcher b = qh1.m71265b();
                                final MyTokensListViewModel myTokensListViewModel = this.this$0;
                                final TokenType tokenType = this.$tokenType;
                                C87151 r1 = new C87151((ns0<? super C87151>) null);
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
