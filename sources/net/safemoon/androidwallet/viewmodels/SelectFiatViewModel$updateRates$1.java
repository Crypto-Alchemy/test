package net.safemoon.androidwallet.viewmodels;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.model.fiat.gson.FiatInfor;
import retrofit2.KotlinExtensions;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$updateRates$1", mo48632f = "SelectFiatViewModel.kt", mo48633l = {78}, mo48634m = "invokeSuspend")
/* compiled from: SelectFiatViewModel.kt */
public final class SelectFiatViewModel$updateRates$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ SelectFiatViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$updateRates$1$1", mo48632f = "SelectFiatViewModel.kt", mo48633l = {81, 83}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$updateRates$1$1 */
    /* compiled from: SelectFiatViewModel.kt */
    public static final class C87351 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87351(selectFiatViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87351) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            List<Fiat> list;
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                k90<FiatInfor> f = C9384u3.m72571l().mo52277f("ALLDATA");
                this.label = 1;
                obj = KotlinExtensions.m71521c(f, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                hg5.m45199b(obj);
            } else if (i == 2) {
                try {
                    hg5.m45199b(obj);
                } catch (Exception unused) {
                }
                return r37.f33317a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FiatInfor fiatInfor = (FiatInfor) ((bg5) obj).mo50578a();
            if (fiatInfor != null) {
                list = fiatInfor.allFiatDetail();
            } else {
                list = null;
            }
            if (list != null) {
                xn2 e = selectFiatViewModel.f42815b;
                Fiat[] fiatArr = (Fiat[]) list.toArray(new Fiat[0]);
                this.label = 2;
                if (e.mo50429b((Fiat[]) Arrays.copyOf(fiatArr, fiatArr.length), this) == d) {
                    return d;
                }
            }
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectFiatViewModel$updateRates$1(SelectFiatViewModel selectFiatViewModel, ns0<? super SelectFiatViewModel$updateRates$1> ns0) {
        super(2, ns0);
        this.this$0 = selectFiatViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SelectFiatViewModel$updateRates$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((SelectFiatViewModel$updateRates$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final SelectFiatViewModel selectFiatViewModel = this.this$0;
            C87351 r1 = new C87351((ns0<? super C87351>) null);
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
