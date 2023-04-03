package net.safemoon.androidwallet.fragments.collectibles;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;
import net.safemoon.androidwallet.views.carousel.ContactCarouselView;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ldr0;", "data", "Lr37;", "invoke", "(Ldr0;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendToNftFragment.kt */
public final class SendToNftFragment$observe$1 extends Lambda implements rc2<dr0, r37> {
    public final /* synthetic */ SendToNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendToNftFragment$observe$1(SendToNftFragment sendToNftFragment) {
        super(1);
        this.this$0 = sendToNftFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dr0) obj);
        return r37.f33317a;
    }

    public final void invoke(dr0 dr0) {
        if (dr0 != null && !dr0.mo51269a().isEmpty()) {
            ra2 E = this.this$0.f42336A;
            vx2.m53588d(E);
            E.f33375e.setItems(dr0.mo51269a(), dr0.mo51270b());
            ContactViewModel F = this.this$0.f42337k;
            vx2.m53588d(F);
            if (F.mo61104n().getValue() != null) {
                ra2 E2 = this.this$0.f42336A;
                vx2.m53588d(E2);
                ContactCarouselView contactCarouselView = E2.f33375e;
                ContactViewModel F2 = this.this$0.f42337k;
                vx2.m53588d(F2);
                IContact value = F2.mo61104n().getValue();
                vx2.m53588d(value);
                contactCarouselView.setSelectedItem(value);
            }
            ra2 E3 = this.this$0.f42336A;
            vx2.m53588d(E3);
            E3.f33375e.mo38312p();
        }
    }
}
