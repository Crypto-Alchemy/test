package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", mo48632f = "RepeatOnLifecycle.kt", mo48633l = {111}, mo48634m = "invokeSuspend")
/* compiled from: RepeatOnLifecycle.kt */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ fd2<hu0, ns0<? super r37>, Object> $block;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(fd2<? super hu0, ? super ns0<? super r37>, ? extends Object> fd2, ns0<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1> ns0) {
        super(2, ns0);
        this.$block = fd2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(this.$block, ns0);
        repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1;
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            fd2<hu0, ns0<? super r37>, Object> fd2 = this.$block;
            this.label = 1;
            if (fd2.invoke((hu0) this.L$0, this) == d) {
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
