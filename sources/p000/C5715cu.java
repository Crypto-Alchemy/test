package p000;

import java.util.List;

/* renamed from: cu */
/* compiled from: AutoValue_BatchedLogRequest */
public final class C5715cu extends e00 {

    /* renamed from: a */
    public final List<mk3> f27951a;

    public C5715cu(List<mk3> list) {
        if (list != null) {
            this.f27951a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    /* renamed from: c */
    public List<mk3> mo41717c() {
        return this.f27951a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e00) {
            return this.f27951a.equals(((e00) obj).mo41717c());
        }
        return false;
    }

    public int hashCode() {
        return this.f27951a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f27951a + "}";
    }
}
