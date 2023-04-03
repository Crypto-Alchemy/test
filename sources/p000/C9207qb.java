package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.arguments.TokenTypes;

/* renamed from: qb */
/* compiled from: AddContactFragmentDirections */
public class C9207qb {

    /* renamed from: qb$a */
    /* compiled from: AddContactFragmentDirections */
    public static class C9208a implements j44 {

        /* renamed from: a */
        public final HashMap f44162a;

        public C9208a(TokenTypes tokenTypes) {
            HashMap hashMap = new HashMap();
            this.f44162a = hashMap;
            if (tokenTypes != null) {
                hashMap.put("selectedChain", tokenTypes);
                return;
            }
            throw new IllegalArgumentException("Argument \"selectedChain\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_addContactFragment_to_selectChainForContact;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f44162a.containsKey("selectedChain")) {
                TokenTypes tokenTypes = (TokenTypes) this.f44162a.get("selectedChain");
                if (Parcelable.class.isAssignableFrom(TokenTypes.class) || tokenTypes == null) {
                    bundle.putParcelable("selectedChain", Parcelable.class.cast(tokenTypes));
                } else if (Serializable.class.isAssignableFrom(TokenTypes.class)) {
                    bundle.putSerializable("selectedChain", Serializable.class.cast(tokenTypes));
                } else {
                    throw new UnsupportedOperationException(TokenTypes.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            return bundle;
        }

        /* renamed from: c */
        public TokenTypes mo65433c() {
            return (TokenTypes) this.f44162a.get("selectedChain");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9208a aVar = (C9208a) obj;
            if (this.f44162a.containsKey("selectedChain") != aVar.f44162a.containsKey("selectedChain")) {
                return false;
            }
            if (mo65433c() == null ? aVar.mo65433c() != null : !mo65433c().equals(aVar.mo65433c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo65433c() != null) {
                i = mo65433c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionAddContactFragmentToSelectChainForContact(actionId=" + mo21068a() + "){selectedChain=" + mo65433c() + "}";
        }
    }

    /* renamed from: a */
    public static C9208a m71208a(TokenTypes tokenTypes) {
        return new C9208a(tokenTypes);
    }
}
