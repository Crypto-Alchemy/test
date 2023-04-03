package net.safemoon.androidwallet.fragments.contact;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: EditContactFragment.kt */
public final class EditContactFragment$showRemoveContactConfirmationDialog$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ EditContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditContactFragment$showRemoveContactConfirmationDialog$1(EditContactFragment editContactFragment) {
        super(0);
        this.this$0 = editContactFragment;
    }

    public final void invoke() {
        ContactViewModel L = this.this$0.mo58071L();
        IContact q0 = this.this$0.mo58090w0();
        final EditContactFragment editContactFragment = this.this$0;
        L.mo61096f(q0, new pc2<r37>() {
            public final void invoke() {
                editContactFragment.mo50752i();
            }
        });
    }
}
