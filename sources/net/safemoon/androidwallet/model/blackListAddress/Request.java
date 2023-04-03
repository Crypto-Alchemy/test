package net.safemoon.androidwallet.model.blackListAddress;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/blackListAddress/Request;", "", "list", "", "", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Request.kt */
public final class Request {
    @SerializedName("addresses")
    private final List<String> list;

    public Request(List<String> list2) {
        vx2.m53591g(list2, "list");
        this.list = list2;
    }

    public static /* synthetic */ Request copy$default(Request request, List<String> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list2 = request.list;
        }
        return request.copy(list2);
    }

    public final List<String> component1() {
        return this.list;
    }

    public final Request copy(List<String> list2) {
        vx2.m53591g(list2, "list");
        return new Request(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Request) && vx2.m53586b(this.list, ((Request) obj).list);
    }

    public final List<String> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        List<String> list2 = this.list;
        return "Request(list=" + list2 + ")";
    }
}
