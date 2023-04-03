package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$deleteSymbolWithType$1", mo48632f = "CustomContractTokenViewModel.kt", mo48633l = {241}, mo48634m = "invokeSuspend")
/* compiled from: CustomContractTokenViewModel.kt */
public final class CustomContractTokenViewModel$deleteSymbolWithType$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ String $symbolWithType;
    public int label;
    public final /* synthetic */ CustomContractTokenViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$deleteSymbolWithType$1$1", mo48632f = "CustomContractTokenViewModel.kt", mo48633l = {242}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel$deleteSymbolWithType$1$1 */
    /* compiled from: CustomContractTokenViewModel.kt */
    public static final class C86691 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86691(customContractTokenViewModel, str, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86691) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                xy0 c = customContractTokenViewModel.mo61160s();
                String str = str;
                this.label = 1;
                if (c.mo66975a(str, this) == d) {
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
    public CustomContractTokenViewModel$deleteSymbolWithType$1(CustomContractTokenViewModel customContractTokenViewModel, String str, ns0<? super CustomContractTokenViewModel$deleteSymbolWithType$1> ns0) {
        super(2, ns0);
        this.this$0 = customContractTokenViewModel;
        this.$symbolWithType = str;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CustomContractTokenViewModel$deleteSymbolWithType$1(this.this$0, this.$symbolWithType, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CustomContractTokenViewModel$deleteSymbolWithType$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final CustomContractTokenViewModel customContractTokenViewModel = this.this$0;
            final String str = this.$symbolWithType;
            C86691 r1 = new C86691((ns0<? super C86691>) null);
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
