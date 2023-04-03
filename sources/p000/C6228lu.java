package p000;

import p000.av0;

/* renamed from: lu */
/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization */
public final class C6228lu extends av0.C3834e.C3835a.C3837b {

    /* renamed from: a */
    public final String f31398a;

    /* renamed from: a */
    public String mo29223a() {
        return this.f31398a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof av0.C3834e.C3835a.C3837b) {
            return this.f31398a.equals(((av0.C3834e.C3835a.C3837b) obj).mo29223a());
        }
        return false;
    }

    public int hashCode() {
        return this.f31398a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f31398a + "}";
    }
}
