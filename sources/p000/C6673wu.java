package p000;

import p000.av0;

/* renamed from: wu */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log */
public final class C6673wu extends av0.C3834e.C3841d.C3859d {

    /* renamed from: a */
    public final String f35433a;

    /* renamed from: wu$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log */
    public static final class C6675b extends av0.C3834e.C3841d.C3859d.C3860a {

        /* renamed from: a */
        public String f35434a;

        /* renamed from: a */
        public av0.C3834e.C3841d.C3859d mo29352a() {
            String str = "";
            if (this.f35434a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new C6673wu(this.f35434a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3841d.C3859d.C3860a mo29353b(String str) {
            if (str != null) {
                this.f35434a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    /* renamed from: b */
    public String mo29351b() {
        return this.f35433a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof av0.C3834e.C3841d.C3859d) {
            return this.f35433a.equals(((av0.C3834e.C3841d.C3859d) obj).mo29351b());
        }
        return false;
    }

    public int hashCode() {
        return this.f35433a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f35433a + "}";
    }

    public C6673wu(String str) {
        this.f35433a = str;
    }
}
