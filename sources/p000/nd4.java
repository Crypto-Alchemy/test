package p000;

import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lnd4;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lorg/json/JSONArray;", "a", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "setDataArray", "(Lorg/json/JSONArray;)V", "dataArray", "Lorg/json/JSONObject;", "b", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "setJsonData", "(Lorg/json/JSONObject;)V", "jsonData", "<init>", "(Lorg/json/JSONArray;Lorg/json/JSONObject;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: nd4 */
/* compiled from: OSNotificationIntentExtras.kt */
public final class nd4 {

    /* renamed from: a */
    public JSONArray f32096a;

    /* renamed from: b */
    public JSONObject f32097b;

    public nd4(JSONArray jSONArray, JSONObject jSONObject) {
        this.f32096a = jSONArray;
        this.f32097b = jSONObject;
    }

    /* renamed from: a */
    public final JSONArray mo46056a() {
        return this.f32096a;
    }

    /* renamed from: b */
    public final JSONObject mo46057b() {
        return this.f32097b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd4)) {
            return false;
        }
        nd4 nd4 = (nd4) obj;
        return vx2.m53586b(this.f32096a, nd4.f32096a) && vx2.m53586b(this.f32097b, nd4.f32097b);
    }

    public int hashCode() {
        JSONArray jSONArray = this.f32096a;
        int i = 0;
        int hashCode = (jSONArray != null ? jSONArray.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f32097b;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "OSNotificationIntentExtras(dataArray=" + this.f32096a + ", jsonData=" + this.f32097b + ")";
    }
}
