package p000;

import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!B#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b \u0010\"J\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, mo44877d2 = {"Lid4;", "", "a", "", "g", "toString", "o", "", "equals", "", "hashCode", "Lcom/onesignal/influence/domain/OSInfluenceType;", "Lcom/onesignal/influence/domain/OSInfluenceType;", "d", "()Lcom/onesignal/influence/domain/OSInfluenceType;", "f", "(Lcom/onesignal/influence/domain/OSInfluenceType;)V", "influenceType", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "<set-?>", "b", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "c", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "influenceChannel", "Lorg/json/JSONArray;", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "e", "(Lorg/json/JSONArray;)V", "ids", "jsonString", "<init>", "(Ljava/lang/String;)V", "(Lcom/onesignal/influence/domain/OSInfluenceChannel;Lcom/onesignal/influence/domain/OSInfluenceType;Lorg/json/JSONArray;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: id4 */
/* compiled from: OSInfluence.kt */
public final class id4 {

    /* renamed from: a */
    public OSInfluenceType f29890a;

    /* renamed from: b */
    public OSInfluenceChannel f29891b;

    /* renamed from: c */
    public JSONArray f29892c;

    public id4(String str) throws JSONException {
        vx2.m53591g(str, "jsonString");
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("influence_channel");
        String string2 = jSONObject.getString("influence_type");
        String string3 = jSONObject.getString("influence_ids");
        this.f29891b = OSInfluenceChannel.Companion.mo38913a(string);
        this.f29890a = OSInfluenceType.Companion.mo38919a(string2);
        vx2.m53590f(string3, "ids");
        this.f29892c = string3.length() == 0 ? null : new JSONArray(string3);
    }

    /* renamed from: a */
    public final id4 mo43563a() {
        return new id4(this.f29891b, this.f29890a, this.f29892c);
    }

    /* renamed from: b */
    public final JSONArray mo43564b() {
        return this.f29892c;
    }

    /* renamed from: c */
    public final OSInfluenceChannel mo43565c() {
        return this.f29891b;
    }

    /* renamed from: d */
    public final OSInfluenceType mo43566d() {
        return this.f29890a;
    }

    /* renamed from: e */
    public final void mo43567e(JSONArray jSONArray) {
        this.f29892c = jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!vx2.m53586b(id4.class, obj.getClass()))) {
            return false;
        }
        id4 id4 = (id4) obj;
        if (this.f29891b == id4.f29891b && this.f29890a == id4.f29890a) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo43569f(OSInfluenceType oSInfluenceType) {
        vx2.m53591g(oSInfluenceType, "<set-?>");
        this.f29890a = oSInfluenceType;
    }

    /* renamed from: g */
    public final String mo43570g() throws JSONException {
        String str;
        JSONObject put = new JSONObject().put("influence_channel", this.f29891b.toString()).put("influence_type", this.f29890a.toString());
        JSONArray jSONArray = this.f29892c;
        if (jSONArray != null) {
            str = String.valueOf(jSONArray);
        } else {
            str = "";
        }
        String jSONObject = put.put("influence_ids", str).toString();
        vx2.m53590f(jSONObject, "JSONObject()\n        .pu…e \"\")\n        .toString()");
        return jSONObject;
    }

    public int hashCode() {
        return (this.f29891b.hashCode() * 31) + this.f29890a.hashCode();
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.f29891b + ", influenceType=" + this.f29890a + ", ids=" + this.f29892c + '}';
    }

    public id4(OSInfluenceChannel oSInfluenceChannel, OSInfluenceType oSInfluenceType, JSONArray jSONArray) {
        vx2.m53591g(oSInfluenceChannel, "influenceChannel");
        vx2.m53591g(oSInfluenceType, "influenceType");
        this.f29891b = oSInfluenceChannel;
        this.f29890a = oSInfluenceType;
        this.f29892c = jSONArray;
    }
}
