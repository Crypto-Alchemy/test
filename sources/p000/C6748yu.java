package p000;

import p000.av0;

/* renamed from: yu */
/* compiled from: AutoValue_CrashlyticsReport_Session_User */
public final class C6748yu extends av0.C3834e.C3863f {

    /* renamed from: a */
    public final String f35925a;

    /* renamed from: yu$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_User */
    public static final class C6750b extends av0.C3834e.C3863f.C3864a {

        /* renamed from: a */
        public String f35926a;

        /* renamed from: a */
        public av0.C3834e.C3863f mo29364a() {
            String str = "";
            if (this.f35926a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new C6748yu(this.f35926a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3863f.C3864a mo29365b(String str) {
            if (str != null) {
                this.f35926a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    /* renamed from: b */
    public String mo29363b() {
        return this.f35925a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof av0.C3834e.C3863f) {
            return this.f35925a.equals(((av0.C3834e.C3863f) obj).mo29363b());
        }
        return false;
    }

    public int hashCode() {
        return this.f35925a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f35925a + "}";
    }

    public C6748yu(String str) {
        this.f35925a = str;
    }
}
