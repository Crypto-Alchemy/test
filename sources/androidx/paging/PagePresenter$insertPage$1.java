package androidx.paging;

import androidx.paging.PagePresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, mo44877d2 = {"", "T", "Landroidx/paging/LoadType;", "type", "", "fromMediator", "Lxi3;", "state", "Lr37;", "invoke", "(Landroidx/paging/LoadType;ZLxi3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
/* compiled from: PagePresenter.kt */
public final class PagePresenter$insertPage$1 extends Lambda implements id2<LoadType, Boolean, xi3, r37> {
    public final /* synthetic */ PagePresenter.C1182b $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagePresenter$insertPage$1(PagePresenter.C1182b bVar) {
        super(3);
        this.$callback = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((LoadType) obj, ((Boolean) obj2).booleanValue(), (xi3) obj3);
        return r37.f33317a;
    }

    public final void invoke(LoadType loadType, boolean z, xi3 xi3) {
        vx2.m53591g(loadType, "type");
        vx2.m53591g(xi3, "state");
        this.$callback.mo8730b(loadType, z, xi3);
    }
}
