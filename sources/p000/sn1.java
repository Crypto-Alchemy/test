package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.arguments.TokenTypes;

/* renamed from: sn1 */
/* compiled from: EditContactFragmentDirections */
public class sn1 {

    /* renamed from: sn1$a */
    /* compiled from: EditContactFragmentDirections */
    public static class C9310a implements j44 {

        /* renamed from: a */
        public final HashMap f44582a;

        public C9310a(TokenTypes tokenTypes) {
            HashMap hashMap = new HashMap();
            this.f44582a = hashMap;
            if (tokenTypes != null) {
                hashMap.put("selectedChain", tokenTypes);
                return;
            }
            throw new IllegalArgumentException("Argument \"selectedChain\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_editContactFragment_to_selectChainForContact;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f44582a.containsKey("selectedChain")) {
                TokenTypes tokenTypes = (TokenTypes) this.f44582a.get("selectedChain");
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
        public TokenTypes mo65875c() {
            return (TokenTypes) this.f44582a.get("selectedChain");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9310a aVar = (C9310a) obj;
            if (this.f44582a.containsKey("selectedChain") != aVar.f44582a.containsKey("selectedChain")) {
                return false;
            }
            if (mo65875c() == null ? aVar.mo65875c() != null : !mo65875c().equals(aVar.mo65875c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo65875c() != null) {
                i = mo65875c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionEditContactFragmentToSelectChainForContact(actionId=" + mo21068a() + "){selectedChain=" + mo65875c() + "}";
        }
    }

    /* renamed from: a */
    public static C9310a m71980a(TokenTypes tokenTypes) {
        return new C9310a(tokenTypes);
    }
}
