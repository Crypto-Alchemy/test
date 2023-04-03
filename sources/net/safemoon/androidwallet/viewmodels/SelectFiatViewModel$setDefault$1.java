package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lr37;", "invoke", "(Z)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SelectFiatViewModel.kt */
public final class SelectFiatViewModel$setDefault$1 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ pc2<r37> $callBack;
    public final /* synthetic */ Fiat $item;
    public final /* synthetic */ SelectFiatViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$setDefault$1$1", mo48632f = "SelectFiatViewModel.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$setDefault$1$1 */
    /* compiled from: SelectFiatViewModel.kt */
    public static final class C87341 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87341(selectFiatViewModel, pc2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87341) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                selectFiatViewModel.mo61378m();
                pc2<r37> pc2 = pc2;
                if (pc2 != null) {
                    pc2.invoke();
                }
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectFiatViewModel$setDefault$1(SelectFiatViewModel selectFiatViewModel, Fiat fiat, pc2<r37> pc2) {
        super(1);
        this.this$0 = selectFiatViewModel;
        this.$item = fiat;
        this.$callBack = pc2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return r37.f33317a;
    }

    public final void invoke(boolean z) {
        if (z) {
            f06.m57511b(this.this$0.mo27549b(), "DEFAULT_FIAT", this.$item.toString());
            hu0 a = cd7.m11843a(this.this$0);
            final SelectFiatViewModel selectFiatViewModel = this.this$0;
            final pc2<r37> pc2 = this.$callBack;
            y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new C87341((ns0<? super C87341>) null), 3, (Object) null);
        }
    }
}
