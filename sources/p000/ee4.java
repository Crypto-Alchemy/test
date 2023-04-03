package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Lee4;", "", "Lorg/json/JSONObject;", "e", "", "toString", "Lorg/json/JSONArray;", "a", "Lorg/json/JSONArray;", "b", "()Lorg/json/JSONArray;", "d", "(Lorg/json/JSONArray;)V", "notificationIds", "c", "inAppMessagesIds", "<init>", "(Lorg/json/JSONArray;Lorg/json/JSONArray;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: ee4 */
/* compiled from: OSOutcomeSourceBody.kt */
public final class ee4 {

    /* renamed from: a */
    public JSONArray f28609a;

    /* renamed from: b */
    public JSONArray f28610b;

    public ee4() {
        this((JSONArray) null, (JSONArray) null, 3, (DefaultConstructorMarker) null);
    }

    public ee4(JSONArray jSONArray, JSONArray jSONArray2) {
        this.f28609a = jSONArray;
        this.f28610b = jSONArray2;
    }

    /* renamed from: a */
    public final JSONArray mo42303a() {
        return this.f28610b;
    }

    /* renamed from: b */
    public final JSONArray mo42304b() {
        return this.f28609a;
    }

    /* renamed from: c */
    public final void mo42305c(JSONArray jSONArray) {
        this.f28610b = jSONArray;
    }

    /* renamed from: d */
    public final void mo42306d(JSONArray jSONArray) {
        this.f28609a = jSONArray;
    }

    /* renamed from: e */
    public final JSONObject mo42307e() throws JSONException {
        JSONObject put = new JSONObject().put("notification_ids", this.f28609a).put("in_app_message_ids", this.f28610b);
        vx2.m53590f(put, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
        return put;
    }

    public String toString() {
        return "OSOutcomeSourceBody{notificationIds=" + this.f28609a + ", inAppMessagesIds=" + this.f28610b + '}';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee4(JSONArray jSONArray, JSONArray jSONArray2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new JSONArray() : jSONArray, (i & 2) != 0 ? new JSONArray() : jSONArray2);
    }
}
