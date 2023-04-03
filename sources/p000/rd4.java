package p000;

import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo44877d2 = {"Lrd4;", "", "Lorg/json/JSONObject;", "g", "", "e", "", "toString", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "outcomeId", "Lde4;", "b", "Lde4;", "()Lde4;", "outcomeSource", "", "c", "F", "d", "()F", "setWeight", "(F)V", "weight", "", "J", "()J", "f", "(J)V", "timestamp", "<init>", "(Ljava/lang/String;Lde4;FJ)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: rd4 */
/* compiled from: OSOutcomeEventParams.kt */
public final class rd4 {

    /* renamed from: a */
    public final String f33401a;

    /* renamed from: b */
    public final de4 f33402b;

    /* renamed from: c */
    public float f33403c;

    /* renamed from: d */
    public long f33404d;

    public rd4(String str, de4 de4, float f, long j) {
        vx2.m53591g(str, "outcomeId");
        this.f33401a = str;
        this.f33402b = de4;
        this.f33403c = f;
        this.f33404d = j;
    }

    /* renamed from: a */
    public final String mo47382a() {
        return this.f33401a;
    }

    /* renamed from: b */
    public final de4 mo47383b() {
        return this.f33402b;
    }

    /* renamed from: c */
    public final long mo47384c() {
        return this.f33404d;
    }

    /* renamed from: d */
    public final float mo47385d() {
        return this.f33403c;
    }

    /* renamed from: e */
    public final boolean mo47386e() {
        de4 de4 = this.f33402b;
        if (de4 == null || (de4.mo41912a() == null && this.f33402b.mo41913b() == null)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo47387f(long j) {
        this.f33404d = j;
    }

    /* renamed from: g */
    public final JSONObject mo47388g() throws JSONException {
        JSONObject put = new JSONObject().put("id", this.f33401a);
        de4 de4 = this.f33402b;
        if (de4 != null) {
            put.put("sources", de4.mo41916e());
        }
        float f = this.f33403c;
        if (f > ((float) 0)) {
            put.put("weight", Float.valueOf(f));
        }
        long j = this.f33404d;
        if (j > 0) {
            put.put("timestamp", j);
        }
        vx2.m53590f(put, "json");
        return put;
    }

    public String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.f33401a + '\'' + ", outcomeSource=" + this.f33402b + ", weight=" + this.f33403c + ", timestamp=" + this.f33404d + '}';
    }
}
