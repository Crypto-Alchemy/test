package net.safemoon.androidwallet.fragments.collectibles;

import java.io.Serializable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransferNftFragment.kt */
public final class TransferNftFragment$iContact$2 extends Lambda implements pc2<IContact> {
    public final /* synthetic */ TransferNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferNftFragment$iContact$2(TransferNftFragment transferNftFragment) {
        super(0);
        this.this$0 = transferNftFragment;
    }

    public final IContact invoke() {
        String str;
        Serializable serializable = this.this$0.requireArguments().getSerializable("iContact");
        if (serializable == null) {
            return null;
        }
        IContact iContact = (IContact) serializable;
        String H = this.this$0.mo58039M();
        if (H != null) {
            str = H.toLowerCase(Locale.ROOT);
            vx2.m53590f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str = null;
        }
        String lowerCase = iContact.getAddress().toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (vx2.m53586b(str, lowerCase)) {
            return iContact;
        }
        return null;
    }
}
