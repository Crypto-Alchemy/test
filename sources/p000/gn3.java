package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;

/* renamed from: gn3 */
/* compiled from: ManageContactsFragmentDirections */
public class gn3 {

    /* renamed from: gn3$a */
    /* compiled from: ManageContactsFragmentDirections */
    public static class C7139a implements j44 {

        /* renamed from: a */
        public final HashMap f38047a;

        public C7139a(IContact iContact) {
            HashMap hashMap = new HashMap();
            this.f38047a = hashMap;
            if (iContact != null) {
                hashMap.put("contact", iContact);
                return;
            }
            throw new IllegalArgumentException("Argument \"contact\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_manageContactsFragment_to_editContactFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f38047a.containsKey("contact")) {
                IContact iContact = (IContact) this.f38047a.get("contact");
                if (Parcelable.class.isAssignableFrom(IContact.class) || iContact == null) {
                    bundle.putParcelable("contact", Parcelable.class.cast(iContact));
                } else if (Serializable.class.isAssignableFrom(IContact.class)) {
                    bundle.putSerializable("contact", Serializable.class.cast(iContact));
                } else {
                    throw new UnsupportedOperationException(IContact.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            return bundle;
        }

        /* renamed from: c */
        public IContact mo51946c() {
            return (IContact) this.f38047a.get("contact");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7139a aVar = (C7139a) obj;
            if (this.f38047a.containsKey("contact") != aVar.f38047a.containsKey("contact")) {
                return false;
            }
            if (mo51946c() == null ? aVar.mo51946c() != null : !mo51946c().equals(aVar.mo51946c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo51946c() != null) {
                i = mo51946c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionManageContactsFragmentToEditContactFragment(actionId=" + mo21068a() + "){contact=" + mo51946c() + "}";
        }
    }

    /* renamed from: a */
    public static j44 m58157a() {
        return new C2456h9(R.id.action_manageContactsFragment_to_addContactFragment);
    }

    /* renamed from: b */
    public static C7139a m58158b(IContact iContact) {
        return new C7139a(iContact);
    }
}
