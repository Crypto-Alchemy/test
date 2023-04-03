package p000;

import com.google.gson.Gson;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u0001¨\u0006\u0004"}, mo44877d2 = {"Ldn4;", "", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: en4 */
/* compiled from: PeerUI.kt */
public final class en4 {
    /* renamed from: a */
    public static final String m57409a(dn4 dn4) {
        String json = new Gson().toJson((Object) dn4);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }

    /* renamed from: b */
    public static final dn4 m57410b(String str) {
        vx2.m53591g(str, "<this>");
        return (dn4) new Gson().fromJson(str, dn4.class);
    }
}
