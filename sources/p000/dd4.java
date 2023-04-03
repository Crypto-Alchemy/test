package p000;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007¨\u0006\u0011"}, mo44877d2 = {"Ldd4;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "pageId", "b", "getPageIndex", "setPageIndex", "pageIndex", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: dd4 */
/* compiled from: OSInAppMessagePage.kt */
public class dd4 {

    /* renamed from: a */
    public String f28158a;

    /* renamed from: b */
    public String f28159b;

    public dd4(JSONObject jSONObject) {
        vx2.m53591g(jSONObject, "jsonObject");
        this.f28158a = jSONObject.optString("pageId", (String) null);
        this.f28159b = jSONObject.optString("pageIndex", (String) null);
    }

    /* renamed from: a */
    public final String mo41905a() {
        return this.f28158a;
    }
}
