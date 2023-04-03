package p000;

/* renamed from: oz */
/* compiled from: BaseUrl */
public final class C3018oz {

    /* renamed from: a */
    public final String f16254a;

    /* renamed from: b */
    public final String f16255b;

    /* renamed from: c */
    public final int f16256c;

    /* renamed from: d */
    public final int f16257d;

    public C3018oz(String str, String str2, int i, int i2) {
        this.f16254a = str;
        this.f16255b = str2;
        this.f16256c = i;
        this.f16257d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3018oz)) {
            return false;
        }
        C3018oz ozVar = (C3018oz) obj;
        if (this.f16256c != ozVar.f16256c || this.f16257d != ozVar.f16257d || !jf4.m46496a(this.f16254a, ozVar.f16254a) || !jf4.m46496a(this.f16255b, ozVar.f16255b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return jf4.m46497b(this.f16254a, this.f16255b, Integer.valueOf(this.f16256c), Integer.valueOf(this.f16257d));
    }
}
