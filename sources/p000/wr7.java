package p000;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Map;

/* renamed from: wr7 */
public final class wr7 extends C6323or {

    /* renamed from: a */
    public final long f35413a;

    /* renamed from: b */
    public final Map<String, AssetPackState> f35414b;

    public wr7(long j, Map<String, AssetPackState> map) {
        this.f35413a = j;
        this.f35414b = map;
    }

    /* renamed from: e */
    public final Map<String, AssetPackState> mo46453e() {
        return this.f35414b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6323or) {
            C6323or orVar = (C6323or) obj;
            return this.f35413a == orVar.mo46454f() && this.f35414b.equals(orVar.mo46453e());
        }
    }

    /* renamed from: f */
    public final long mo46454f() {
        return this.f35413a;
    }

    public final int hashCode() {
        long j = this.f35413a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f35414b.hashCode();
    }

    public final String toString() {
        long j = this.f35413a;
        String valueOf = String.valueOf(this.f35414b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
