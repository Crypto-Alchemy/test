package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.transaction.history.Result;

/* renamed from: net.safemoon.androidwallet.fragments.e */
/* compiled from: SendingFragmentDirections */
public class C8567e {

    /* renamed from: net.safemoon.androidwallet.fragments.e$a */
    /* compiled from: SendingFragmentDirections */
    public static class C8568a implements j44 {

        /* renamed from: a */
        public final HashMap f42391a;

        public C8568a(Result result, int i, boolean z) {
            HashMap hashMap = new HashMap();
            this.f42391a = hashMap;
            if (result != null) {
                hashMap.put("result", result);
                hashMap.put("tokenChainId", Integer.valueOf(i));
                hashMap.put("isNewTransaction", Boolean.valueOf(z));
                return;
            }
            throw new IllegalArgumentException("Argument \"result\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_sendingFragment_to_transferDetailsFragmentStatus;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f42391a.containsKey("result")) {
                Result result = (Result) this.f42391a.get("result");
                if (Parcelable.class.isAssignableFrom(Result.class) || result == null) {
                    bundle.putParcelable("result", Parcelable.class.cast(result));
                } else if (Serializable.class.isAssignableFrom(Result.class)) {
                    bundle.putSerializable("result", Serializable.class.cast(result));
                } else {
                    throw new UnsupportedOperationException(Result.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            if (this.f42391a.containsKey("tokenChainId")) {
                bundle.putInt("tokenChainId", ((Integer) this.f42391a.get("tokenChainId")).intValue());
            }
            if (this.f42391a.containsKey("isNewTransaction")) {
                bundle.putBoolean("isNewTransaction", ((Boolean) this.f42391a.get("isNewTransaction")).booleanValue());
            }
            return bundle;
        }

        /* renamed from: c */
        public boolean mo58104c() {
            return ((Boolean) this.f42391a.get("isNewTransaction")).booleanValue();
        }

        /* renamed from: d */
        public Result mo58105d() {
            return (Result) this.f42391a.get("result");
        }

        /* renamed from: e */
        public int mo58106e() {
            return ((Integer) this.f42391a.get("tokenChainId")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C8568a aVar = (C8568a) obj;
            if (this.f42391a.containsKey("result") != aVar.f42391a.containsKey("result")) {
                return false;
            }
            if (mo58105d() == null ? aVar.mo58105d() != null : !mo58105d().equals(aVar.mo58105d())) {
                return false;
            }
            if (this.f42391a.containsKey("tokenChainId") == aVar.f42391a.containsKey("tokenChainId") && mo58106e() == aVar.mo58106e() && this.f42391a.containsKey("isNewTransaction") == aVar.f42391a.containsKey("isNewTransaction") && mo58104c() == aVar.mo58104c() && mo21068a() == aVar.mo21068a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            if (mo58105d() != null) {
                i = mo58105d().hashCode();
            } else {
                i = 0;
            }
            return ((((((i + 31) * 31) + mo58106e()) * 31) + (mo58104c() ? 1 : 0)) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionSendingFragmentToTransferDetailsFragmentStatus(actionId=" + mo21068a() + "){result=" + mo58105d() + ", tokenChainId=" + mo58106e() + ", isNewTransaction=" + mo58104c() + "}";
        }
    }

    /* renamed from: a */
    public static C8568a m68004a(Result result, int i, boolean z) {
        return new C8568a(result, i, z);
    }
}
