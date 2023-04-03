package p000;

import java.util.List;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\t\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Ldr0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "setPreScrolledDefaultPosition", "(I)V", "preScrolledDefaultPosition", "", "Lnet/safemoon/androidwallet/model/contact/abstraction/IContact;", "Ljava/util/List;", "()Ljava/util/List;", "setContactList", "(Ljava/util/List;)V", "contactList", "<init>", "(ILjava/util/List;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dr0 */
/* compiled from: ContactCarouselViewData.kt */
public final class dr0 {

    /* renamed from: a */
    public int f37379a;

    /* renamed from: b */
    public List<? extends IContact> f37380b;

    public dr0(int i, List<? extends IContact> list) {
        vx2.m53591g(list, "contactList");
        this.f37379a = i;
        this.f37380b = list;
    }

    /* renamed from: a */
    public final List<IContact> mo51269a() {
        return this.f37380b;
    }

    /* renamed from: b */
    public final int mo51270b() {
        return this.f37379a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr0)) {
            return false;
        }
        dr0 dr0 = (dr0) obj;
        return this.f37379a == dr0.f37379a && vx2.m53586b(this.f37380b, dr0.f37380b);
    }

    public int hashCode() {
        return (this.f37379a * 31) + this.f37380b.hashCode();
    }

    public String toString() {
        int i = this.f37379a;
        List<? extends IContact> list = this.f37380b;
        return "ContactCarouselViewData(preScrolledDefaultPosition=" + i + ", contactList=" + list + ")";
    }
}
