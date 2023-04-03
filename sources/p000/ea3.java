package p000;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Lea3;", "Lbb3;", "", "tag", "Lba3;", "key", "Lr37;", "b", "a", "key1", "key2", "d", "Lkotlin/Pair;", "c", "f", "", "e", "keyA", "keyB", "g", "concatKeys", "h", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ea3 */
/* compiled from: KeyChain.kt */
public final class ea3 implements bb3 {

    /* renamed from: a */
    public final SharedPreferences f28516a;

    public ea3(SharedPreferences sharedPreferences) {
        vx2.m53591g(sharedPreferences, "sharedPreferences");
        this.f28516a = sharedPreferences;
    }

    /* renamed from: a */
    public String mo29518a(String str) {
        vx2.m53591g(str, "tag");
        return this.f28516a.getString(str, (String) null);
    }

    /* renamed from: b */
    public void mo29519b(String str, ba3 ba3) {
        vx2.m53591g(str, "tag");
        vx2.m53591g(ba3, "key");
        this.f28516a.edit().putString(str, ba3.mo29510a()).apply();
    }

    /* renamed from: c */
    public Pair<String, String> mo29520c(String str) {
        vx2.m53591g(str, "tag");
        String string = this.f28516a.getString(str, (String) null);
        if (string == null) {
            return null;
        }
        return mo42189h(string);
    }

    /* renamed from: d */
    public void mo29521d(String str, ba3 ba3, ba3 ba32) {
        vx2.m53591g(str, "tag");
        vx2.m53591g(ba3, "key1");
        vx2.m53591g(ba32, "key2");
        this.f28516a.edit().putString(str, mo42188g(ba3, ba32)).apply();
    }

    /* renamed from: e */
    public boolean mo29522e(String str) {
        vx2.m53591g(str, "tag");
        return this.f28516a.contains(str);
    }

    /* renamed from: f */
    public void mo29523f(String str) {
        vx2.m53591g(str, "tag");
        if (mo29522e(str)) {
            this.f28516a.edit().remove(str).apply();
        }
    }

    /* renamed from: g */
    public final String mo42188g(ba3 ba3, ba3 ba32) {
        return x67.m54245a(C6706xq.m54506t(x67.m54247c(ba3.mo29510a()), x67.m54247c(ba32.mo29510a())));
    }

    /* renamed from: h */
    public final Pair<String, String> mo42189h(String str) {
        byte[] c = x67.m54247c(str);
        return wy6.m54142a(x67.m54245a(ArraysKt___ArraysKt.m47280f0(c, d75.m43395q(0, c.length / 2))), x67.m54245a(ArraysKt___ArraysKt.m47280f0(c, d75.m43395q(c.length / 2, c.length))));
    }
}
