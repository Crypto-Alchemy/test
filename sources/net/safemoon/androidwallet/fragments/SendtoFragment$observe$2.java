package net.safemoon.androidwallet.fragments;

import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;
import net.safemoon.androidwallet.views.carousel.ContactCarouselView;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ldr0;", "data", "Lr37;", "invoke", "(Ldr0;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendtoFragment.kt */
public final class SendtoFragment$observe$2 extends Lambda implements rc2<dr0, r37> {
    public final /* synthetic */ SendtoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendtoFragment$observe$2(SendtoFragment sendtoFragment) {
        super(1);
        this.this$0 = sendtoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dr0) obj);
        return r37.f33317a;
    }

    public final void invoke(dr0 dr0) {
        ta2 G = this.this$0.f42125y;
        ContactCarouselView contactCarouselView = null;
        AppCompatImageView appCompatImageView = G != null ? G.f34190m : null;
        int i = 8;
        boolean z = true;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(dr0 != null && !dr0.mo51269a().isEmpty() ? 0 : 8);
        }
        ta2 G2 = this.this$0.f42125y;
        if (G2 != null) {
            contactCarouselView = G2.f34186i;
        }
        if (contactCarouselView != null) {
            if (dr0 == null || dr0.mo51269a().isEmpty()) {
                z = false;
            }
            if (z) {
                i = 0;
            }
            contactCarouselView.setVisibility(i);
        }
        if (dr0 != null && !dr0.mo51269a().isEmpty()) {
            this.this$0.f42115L.clear();
            List J = this.this$0.f42115L;
            List<IContact> a = dr0.mo51269a();
            if (a == null) {
                a = ck0.m33062j();
            }
            J.addAll(a);
            ta2 G3 = this.this$0.f42125y;
            vx2.m53588d(G3);
            ContactCarouselView contactCarouselView2 = G3.f34186i;
            List<IContact> a2 = dr0.mo51269a();
            if (a2 == null) {
                a2 = ck0.m33062j();
            }
            contactCarouselView2.setItems(a2, dr0.mo51270b());
            ContactViewModel H = this.this$0.f42113H;
            vx2.m53588d(H);
            if (H.mo61104n().getValue() != null) {
                ta2 G4 = this.this$0.f42125y;
                vx2.m53588d(G4);
                ContactCarouselView contactCarouselView3 = G4.f34186i;
                ContactViewModel H2 = this.this$0.f42113H;
                vx2.m53588d(H2);
                IContact value = H2.mo61104n().getValue();
                vx2.m53588d(value);
                contactCarouselView3.setSelectedItem(value);
            }
            ta2 G5 = this.this$0.f42125y;
            vx2.m53588d(G5);
            G5.f34186i.mo38312p();
        }
    }
}
