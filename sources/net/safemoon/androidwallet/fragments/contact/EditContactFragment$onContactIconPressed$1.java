package net.safemoon.androidwallet.fragments.contact;

import android.content.Intent;
import android.net.Uri;
import com.bumptech.glide.C1710a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.contact.RequestContact;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: EditContactFragment.kt */
public final class EditContactFragment$onContactIconPressed$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ EditContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditContactFragment$onContactIconPressed$1(EditContactFragment editContactFragment) {
        super(0);
        this.this$0 = editContactFragment;
    }

    public final void invoke() {
        ji4 t0 = this.this$0.mo58055o();
        if (t0 != null) {
            final EditContactFragment editContactFragment = this.this$0;
            C3529wa<Intent> b = t0.mo52724b(new rc2<Intent, r37>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Intent) obj);
                    return r37.f33317a;
                }

                public final void invoke(Intent intent) {
                    Uri data;
                    a77.m55424b(editContactFragment.requireActivity(), Boolean.FALSE);
                    if (intent != null && (data = intent.getData()) != null) {
                        EditContactFragment editContactFragment = editContactFragment;
                        RequestContact requestContact = (RequestContact) editContactFragment.f42387I.getValue();
                        if (requestContact != null) {
                            requestContact.setProfilePath(data);
                            requestContact.setOldProfilePath((String) null);
                        }
                        ((be5) ((be5) ((be5) C1710a.m12225u(editContactFragment.mo58070K().f21180f).mo23160u(data).mo22582h0(R.drawable.contact_no_icon)).mo22591m(R.drawable.contact_no_icon)).mo22581g0(editContactFragment.f42383A, editContactFragment.f42383A)).mo11567a(qe5.m25623x0()).mo11553K0(editContactFragment.mo58070K().f21180f);
                    }
                }
            });
            if (b != null) {
                Intent intent = new Intent();
                EditContactFragment editContactFragment2 = this.this$0;
                a77.m55424b(editContactFragment2.requireActivity(), Boolean.TRUE);
                intent.setType(editContactFragment2.f42384B);
                intent.setAction("android.intent.action.GET_CONTENT");
                b.mo27473a(intent);
            }
        }
    }
}
