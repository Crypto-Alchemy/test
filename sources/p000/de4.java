package p000;

import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\b\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, mo44877d2 = {"Lde4;", "", "Lorg/json/JSONObject;", "e", "Lee4;", "directBody", "c", "indirectBody", "d", "", "toString", "a", "Lee4;", "()Lee4;", "setDirectBody", "(Lee4;)V", "b", "setIndirectBody", "<init>", "(Lee4;Lee4;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: de4 */
/* compiled from: OSOutcomeSource.kt */
public final class de4 {

    /* renamed from: a */
    public ee4 f28165a;

    /* renamed from: b */
    public ee4 f28166b;

    public de4(ee4 ee4, ee4 ee42) {
        this.f28165a = ee4;
        this.f28166b = ee42;
    }

    /* renamed from: a */
    public final ee4 mo41912a() {
        return this.f28165a;
    }

    /* renamed from: b */
    public final ee4 mo41913b() {
        return this.f28166b;
    }

    /* renamed from: c */
    public final de4 mo41914c(ee4 ee4) {
        this.f28165a = ee4;
        return this;
    }

    /* renamed from: d */
    public final de4 mo41915d(ee4 ee4) {
        this.f28166b = ee4;
        return this;
    }

    /* renamed from: e */
    public final JSONObject mo41916e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ee4 ee4 = this.f28165a;
        if (ee4 != null) {
            jSONObject.put("direct", ee4.mo42307e());
        }
        ee4 ee42 = this.f28166b;
        if (ee42 != null) {
            jSONObject.put("indirect", ee42.mo42307e());
        }
        return jSONObject;
    }

    public String toString() {
        return "OSOutcomeSource{directBody=" + this.f28165a + ", indirectBody=" + this.f28166b + '}';
    }
}
