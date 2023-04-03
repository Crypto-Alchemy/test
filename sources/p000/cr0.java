package p000;

import android.view.View;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.views.carousel.ContactCarouselView;

/* renamed from: cr0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class cr0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ContactCarouselView f37190a;

    /* renamed from: d */
    public final /* synthetic */ IContact f37191d;

    /* renamed from: e */
    public final /* synthetic */ int f37192e;

    public /* synthetic */ cr0(ContactCarouselView contactCarouselView, IContact iContact, int i) {
        this.f37190a = contactCarouselView;
        this.f37191d = iContact;
        this.f37192e = i;
    }

    public final void onClick(View view) {
        ContactCarouselView.m69575u(this.f37190a, this.f37191d, this.f37192e, view);
    }
}
