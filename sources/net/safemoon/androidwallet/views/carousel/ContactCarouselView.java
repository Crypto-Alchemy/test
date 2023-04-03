package net.safemoon.androidwallet.views.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C1710a;
import com.google.android.material.card.MaterialCardView;
import com.jama.carouselview.CarouselView;
import com.jama.carouselview.enums.OffsetType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.sqlcipher.database.SQLiteDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u00012\u00020\u0002:\u0002\u00132B\u0017\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u001c\u0010\u000f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u000e\u001a\u00020\u0003J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0016\u0010\u0014\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\tH\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0002XD¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001b\u0010'\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u00063"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/carousel/ContactCarouselView;", "Lcom/jama/carouselview/CarouselView;", "Lzb0;", "", "getContactItemPosition", "Lnet/safemoon/androidwallet/views/carousel/ContactCarouselView$b;", "listener", "Lr37;", "setOnItemSelectedChangedListener", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "item", "setSelectedItem", "", "items", "defaultItemPosition", "setItems", "Landroid/view/View;", "view", "position", "a", "w", "defaultPosition", "s", "v", "contact", "", "t", "", "e0", "Ljava/util/List;", "k0", "I", "DEFAULT_SIZE", "v0", "selectedContactId", "b1", "Lef3;", "getItemWidth", "()I", "itemWidth", "e1", "Lnet/safemoon/androidwallet/views/carousel/ContactCarouselView$b;", "onCarouselItemSelectChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "o1", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ContactCarouselView.kt */
public final class ContactCarouselView extends CarouselView implements zb0 {

    /* renamed from: o1 */
    public static final C8946a f43268o1 = new C8946a((DefaultConstructorMarker) null);

    /* renamed from: b1 */
    public final ef3 f43269b1;

    /* renamed from: e0 */
    public final List<IContact> f43270e0 = new ArrayList();

    /* renamed from: e1 */
    public C8947b f43271e1;

    /* renamed from: k0 */
    public final int f43272k0 = SQLiteDatabase.MAX_SQL_CACHE_SIZE;

    /* renamed from: v0 */
    public int f43273v0 = -1;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/carousel/ContactCarouselView$a;", "", "", "DEFAULT_CONTACT_ID", "I", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.carousel.ContactCarouselView$a */
    /* compiled from: ContactCarouselView.kt */
    public static final class C8946a {
        public C8946a() {
        }

        public /* synthetic */ C8946a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/carousel/ContactCarouselView$b;", "", "", "isSelected", "", "position", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "contact", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.carousel.ContactCarouselView$b */
    /* compiled from: ContactCarouselView.kt */
    public interface C8947b {
        /* renamed from: a */
        void mo57685a(boolean z, int i, IContact iContact);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vx2.m53591g(context, "context");
        vx2.m53591g(attributeSet, "attributeSet");
        this.f43269b1 = C6169a.m47232a(new ContactCarouselView$itemWidth$2(context));
    }

    private final int getContactItemPosition() throws NullPointerException {
        int i = 0;
        for (IContact id : this.f43270e0) {
            int i2 = i + 1;
            if (id.getId() == this.f43273v0) {
                return i;
            }
            i = i2;
        }
        int i3 = this.f43273v0;
        throw new NullPointerException("Contact id[" + i3 + "] not in the item list");
    }

    private final int getItemWidth() {
        return ((Number) this.f43269b1.getValue()).intValue();
    }

    /* renamed from: u */
    public static final void m69575u(ContactCarouselView contactCarouselView, IContact iContact, int i, View view) {
        int i2;
        vx2.m53591g(contactCarouselView, "this$0");
        vx2.m53591g(iContact, "$model");
        if (contactCarouselView.mo62144t(iContact)) {
            i2 = -1;
        } else {
            i2 = iContact.getId();
        }
        contactCarouselView.f43273v0 = i2;
        C8947b bVar = contactCarouselView.f43271e1;
        if (bVar != null) {
            bVar.mo57685a(contactCarouselView.mo62144t(iContact), i, iContact);
        }
        contactCarouselView.mo62145v();
    }

    /* renamed from: a */
    public void mo49816a(View view, int i) {
        vx2.m53591g(view, "view");
        IContact iContact = this.f43270e0.get(i);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.llItemContactCarouselContainer);
        viewGroup.setVisibility(0);
        viewGroup.getLayoutParams().width = getItemWidth();
        viewGroup.setOnClickListener(new cr0(this, iContact, i));
        View findViewById = view.findViewById(R.id.tvContactText);
        vx2.m53590f(findViewById, "view.findViewById(R.id.tvContactText)");
        ((TextView) findViewById).setText(iContact.getName());
        View findViewById2 = view.findViewById(R.id.ivContactIcon);
        vx2.m53590f(findViewById2, "view.findViewById(R.id.ivContactIcon)");
        ImageView imageView = (ImageView) findViewById2;
        be5 x0 = ((be5) ((be5) C1710a.m12225u(imageView).mo23164y(iContact.getProfilePath()).mo22582h0(R.drawable.contact_no_icon)).mo22591m(R.drawable.contact_no_icon)).mo11567a(qe5.m25623x0());
        int i2 = this.f43272k0;
        ((be5) x0.mo22581g0(i2, i2)).mo11553K0(imageView);
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.ivContactIconContainer);
        if (mo62144t(iContact)) {
            materialCardView.setStrokeWidth((int) ho0.m58584a(2));
        } else {
            materialCardView.setStrokeWidth(0);
        }
    }

    /* renamed from: s */
    public final void mo62140s(int i) {
        setSize(this.f43270e0.size());
        setResource(R.layout.item_contact_carousel);
        setAutoPlay(false);
        mo38305i(true);
        setCurrentItem(i);
        setCarouselOffset(OffsetType.CENTER);
        setScaleOnScroll(true);
        setScrollBarSize(5);
        setCarouselViewListener(this);
    }

    public final void setItems(List<? extends IContact> list, int i) {
        vx2.m53591g(list, "items");
        if (!vx2.m53586b(this.f43270e0, list)) {
            mo62146w(list);
            mo62140s(i);
        }
    }

    public final void setOnItemSelectedChangedListener(C8947b bVar) {
        vx2.m53591g(bVar, "listener");
        this.f43271e1 = bVar;
    }

    public final void setSelectedItem(IContact iContact) {
        vx2.m53591g(iContact, "item");
        this.f43273v0 = iContact.getId();
        mo62145v();
    }

    /* renamed from: t */
    public final boolean mo62144t(IContact iContact) {
        if (iContact.getId() == this.f43273v0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final void mo62145v() {
        try {
            mo38308m();
            int currentItem = getCurrentItem();
            setCurrentItem(getContactItemPosition());
            if (currentItem != getCurrentItem()) {
                mo38285d();
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                String simpleName = ContactCarouselView.class.getSimpleName();
                vx2.m53590f(simpleName, "this::class.java.simpleName");
                ol0.m70350b0(message, simpleName);
            }
        }
    }

    /* renamed from: w */
    public final void mo62146w(List<? extends IContact> list) {
        this.f43270e0.clear();
        this.f43270e0.addAll(list);
    }
}
