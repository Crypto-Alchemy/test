package net.safemoon.androidwallet.fragments.collectibles;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendToNftFragment.kt */
public final class SendToNftFragment$observe$2 extends Lambda implements rc2<List<? extends IContact>, r37> {
    public final /* synthetic */ SendToNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendToNftFragment$observe$2(SendToNftFragment sendToNftFragment) {
        super(1);
        this.this$0 = sendToNftFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends IContact>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<? extends IContact> list) {
        ContactViewModel F = this.this$0.f42337k;
        vx2.m53588d(F);
        F.mo61106p(this.this$0.mo58016V());
    }
}
