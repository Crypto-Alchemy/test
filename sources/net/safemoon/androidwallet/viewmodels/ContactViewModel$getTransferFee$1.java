package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.swap.RequestTransferFee;
import net.safemoon.androidwallet.model.swap.TransferFee;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import retrofit2.KotlinExtensions;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ContactViewModel$getTransferFee$1", mo48632f = "ContactViewModel.kt", mo48633l = {102}, mo48634m = "invokeSuspend")
/* compiled from: ContactViewModel.kt */
public final class ContactViewModel$getTransferFee$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ k04<TransferFee> $callBack;
    public final /* synthetic */ UserTokenItemDisplayModel $displayToken;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.ContactViewModel$getTransferFee$1$1", mo48632f = "ContactViewModel.kt", mo48633l = {108}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.ContactViewModel$getTransferFee$1$1 */
    /* compiled from: ContactViewModel.kt */
    public static final class C86591 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86591(userTokenItemDisplayModel, k04, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86591) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                k90<TransferFee> s = C9384u3.m72571l().mo52290s(new RequestTransferFee(userTokenItemDisplayModel.getContractAddress(), a40.m31673d(1), a40.m31673d(userTokenItemDisplayModel.getChainId())));
                this.label = 1;
                obj = KotlinExtensions.m71521c(s, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                try {
                    hg5.m45199b(obj);
                } catch (Exception unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bg5 bg5 = (bg5) obj;
            if (bg5.mo50581e()) {
                k04<TransferFee> k04 = k04;
                Object a = bg5.mo50578a();
                vx2.m53588d(a);
                k04.postValue(a);
            }
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactViewModel$getTransferFee$1(UserTokenItemDisplayModel userTokenItemDisplayModel, k04<TransferFee> k04, ns0<? super ContactViewModel$getTransferFee$1> ns0) {
        super(2, ns0);
        this.$displayToken = userTokenItemDisplayModel;
        this.$callBack = k04;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ContactViewModel$getTransferFee$1(this.$displayToken, this.$callBack, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ContactViewModel$getTransferFee$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final UserTokenItemDisplayModel userTokenItemDisplayModel = this.$displayToken;
            final k04<TransferFee> k04 = this.$callBack;
            C86591 r1 = new C86591((ns0<? super C86591>) null);
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
