package net.safemoon.androidwallet.fragments;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.ReflectionsFragment$onViewCreated$9", mo48632f = "ReflectionsFragment.kt", mo48633l = {219}, mo48634m = "invokeSuspend")
/* compiled from: ReflectionsFragment.kt */
public final class ReflectionsFragment$onViewCreated$9 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ RecyclerTouchListener $touchListener;
    public int label;
    public final /* synthetic */ ReflectionsFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "it", "Lr37;", "a", "(Ljava/util/List;Lns0;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ReflectionsFragment$onViewCreated$9$a */
    /* compiled from: ReflectionsFragment.kt */
    public static final class C8429a<T> implements a52 {

        /* renamed from: a */
        public final /* synthetic */ ReflectionsFragment f42047a;

        /* renamed from: d */
        public final /* synthetic */ RecyclerTouchListener f42048d;

        public C8429a(ReflectionsFragment reflectionsFragment, RecyclerTouchListener recyclerTouchListener) {
            this.f42047a = reflectionsFragment;
            this.f42048d = recyclerTouchListener;
        }

        /* renamed from: a */
        public final Object emit(List<RoomReflectionsToken> list, ns0<? super r37> ns0) {
            if (list != null) {
                this.f42047a.mo57596I(this.f42048d, list);
            }
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionsFragment$onViewCreated$9(ReflectionsFragment reflectionsFragment, RecyclerTouchListener recyclerTouchListener, ns0<? super ReflectionsFragment$onViewCreated$9> ns0) {
        super(2, ns0);
        this.this$0 = reflectionsFragment;
        this.$touchListener = recyclerTouchListener;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ReflectionsFragment$onViewCreated$9(this.this$0, this.$touchListener, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ReflectionsFragment$onViewCreated$9) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            this.this$0.mo57595H().mo61337H();
            z42<List<RoomReflectionsToken>> l = this.this$0.mo57595H().mo61340l(this.this$0.mo57595H().mo61349u());
            C8429a aVar = new C8429a(this.this$0, this.$touchListener);
            this.label = 1;
            if (l.mo8646a(aVar, this) == d) {
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
