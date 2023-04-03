package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import p000.gn3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lan3;", "invoke", "()Lan3;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ManageContactsFragment.kt */
public final class ManageContactsFragment$adapter$2 extends Lambda implements pc2<an3> {
    public final /* synthetic */ ManageContactsFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/ManageContactsFragment$adapter$2$a", "Lrn2;", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "item", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ManageContactsFragment$adapter$2$a */
    /* compiled from: ManageContactsFragment.kt */
    public static final class C8393a implements rn2 {

        /* renamed from: a */
        public final /* synthetic */ ManageContactsFragment f41975a;

        public C8393a(ManageContactsFragment manageContactsFragment) {
            this.f41975a = manageContactsFragment;
        }

        /* renamed from: a */
        public void mo57499a(IContact iContact) {
            vx2.m53591g(iContact, "item");
            ManageContactsFragment manageContactsFragment = this.f41975a;
            gn3.C7139a b = gn3.m58158b(iContact);
            vx2.m53590f(b, "actionManageContactsFrag…                        )");
            manageContactsFragment.mo50753j(b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ManageContactsFragment$adapter$2(ManageContactsFragment manageContactsFragment) {
        super(0);
        this.this$0 = manageContactsFragment;
    }

    public final an3 invoke() {
        return new an3(new C8393a(this.this$0));
    }
}
