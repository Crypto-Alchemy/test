package p000;

import android.p001os.LocaleList;
import java.util.Locale;

/* renamed from: xj3 */
/* compiled from: LocaleListPlatformWrapper */
public final class xj3 implements wj3 {

    /* renamed from: a */
    public final LocaleList f19859a;

    public xj3(Object obj) {
        this.f19859a = (LocaleList) obj;
    }

    /* renamed from: a */
    public Object mo26805a() {
        return this.f19859a;
    }

    public boolean equals(Object obj) {
        return this.f19859a.equals(((wj3) obj).mo26805a());
    }

    public Locale get(int i) {
        return this.f19859a.get(i);
    }

    public int hashCode() {
        return this.f19859a.hashCode();
    }

    public String toString() {
        return this.f19859a.toString();
    }
}
