package p000;

/* renamed from: eu */
/* compiled from: AutoValue_CrashlyticsReportWithSessionId */
public final class C5818eu extends qv0 {

    /* renamed from: a */
    public final av0 f28670a;

    /* renamed from: b */
    public final String f28671b;

    public C5818eu(av0 av0, String str) {
        if (av0 != null) {
            this.f28670a = av0;
            if (str != null) {
                this.f28671b = str;
                return;
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    /* renamed from: b */
    public av0 mo42418b() {
        return this.f28670a;
    }

    /* renamed from: c */
    public String mo42419c() {
        return this.f28671b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qv0)) {
            return false;
        }
        qv0 qv0 = (qv0) obj;
        if (!this.f28670a.equals(qv0.mo42418b()) || !this.f28671b.equals(qv0.mo42419c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f28670a.hashCode() ^ 1000003) * 1000003) ^ this.f28671b.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f28670a + ", sessionId=" + this.f28671b + "}";
    }
}
