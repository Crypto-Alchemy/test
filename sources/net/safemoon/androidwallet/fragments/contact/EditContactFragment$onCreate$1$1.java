package net.safemoon.androidwallet.fragments.contact;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.contact.RequestContact;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.model.contact.room.RoomContact;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.contact.EditContactFragment$onCreate$1$1", mo48632f = "EditContactFragment.kt", mo48633l = {53}, mo48634m = "invokeSuspend")
/* compiled from: EditContactFragment.kt */
public final class EditContactFragment$onCreate$1$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ IContact $ic;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ EditContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditContactFragment$onCreate$1$1(EditContactFragment editContactFragment, IContact iContact, ns0<? super EditContactFragment$onCreate$1$1> ns0) {
        super(2, ns0);
        this.this$0 = editContactFragment;
        this.$ic = iContact;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new EditContactFragment$onCreate$1$1(this.this$0, this.$ic, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((EditContactFragment$onCreate$1$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        EditContactFragment editContactFragment;
        RequestContact requestContact;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            RequestContact requestContact2 = (RequestContact) this.this$0.f42387I.getValue();
            if (requestContact2 != null) {
                IContact iContact = this.$ic;
                EditContactFragment editContactFragment2 = this.this$0;
                requestContact2.setId(iContact.getId());
                requestContact2.setOldProfilePath(iContact.getProfilePath());
                requestContact2.setName(iContact.getName());
                requestContact2.setContactCreate(iContact.getContactCreate());
                requestContact2.setLastSent(iContact.getLastSent());
                requestContact2.setLinkId(iContact.getLinkId());
                gr0 i2 = editContactFragment2.mo58071L().mo61099i();
                String linkId = iContact.getLinkId();
                this.L$0 = requestContact2;
                this.L$1 = editContactFragment2;
                this.L$2 = requestContact2;
                this.label = 1;
                Object c = i2.mo51974c(linkId, this);
                if (c == d) {
                    return d;
                }
                requestContact = requestContact2;
                obj = c;
                editContactFragment = editContactFragment2;
            }
            return r37.f33317a;
        } else if (i == 1) {
            requestContact = (RequestContact) this.L$2;
            editContactFragment = (EditContactFragment) this.L$1;
            RequestContact requestContact3 = (RequestContact) this.L$0;
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<RoomContact> list = (List) obj;
        for (RoomContact roomContact : list) {
            requestContact.getNetworks().put(a40.m31673d(roomContact.getChainAddress()), roomContact.getAddress());
        }
        k04<List<TokenType>> m = editContactFragment.mo58071L().mo61103m();
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (RoomContact chainAddress : list) {
            arrayList.add(TokenType.Companion.mo57099b(chainAddress.getChainAddress()));
        }
        m.postValue(arrayList);
        y23 unused = d50.m56748b(vg3.m28804a(editContactFragment), (CoroutineContext) null, (CoroutineStart) null, new EditContactFragment$onCreate$1$1$1$3(editContactFragment, (ns0<? super EditContactFragment$onCreate$1$1$1$3>) null), 3, (Object) null);
        return r37.f33317a;
    }
}
