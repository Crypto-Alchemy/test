package net.safemoon.androidwallet.fragments.contact;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.contact.EditContactFragment$onCreate$1$1$1$3", mo48632f = "EditContactFragment.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: EditContactFragment.kt */
public final class EditContactFragment$onCreate$1$1$1$3 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ EditContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditContactFragment$onCreate$1$1$1$3(EditContactFragment editContactFragment, ns0<? super EditContactFragment$onCreate$1$1$1$3> ns0) {
        super(2, ns0);
        this.this$0 = editContactFragment;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new EditContactFragment$onCreate$1$1$1$3(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((EditContactFragment$onCreate$1$1$1$3) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            this.this$0.mo58089u0();
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
