package net.safemoon.androidwallet.fragments.contact;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: EditContactFragment.kt */
public final class EditContactFragment$editContact$2 extends Lambda implements pc2<IContact> {
    public final /* synthetic */ EditContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditContactFragment$editContact$2(EditContactFragment editContactFragment) {
        super(0);
        this.this$0 = editContactFragment;
    }

    public final IContact invoke() {
        Bundle arguments = this.this$0.getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("contact") : null;
        vx2.m53589e(serializable, "null cannot be cast to non-null type net.safemoon.androidwallet.model.contact.abstraction.IContact");
        return (IContact) serializable;
    }
}
