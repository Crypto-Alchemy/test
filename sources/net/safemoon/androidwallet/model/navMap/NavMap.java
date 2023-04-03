package net.safemoon.androidwallet.model.navMap;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0005j\b\u0012\u0004\u0012\u00020\u0000`\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0005j\b\u0012\u0004\u0012\u00020\u0000`\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0005j\b\u0012\u0004\u0012\u00020\u0000`\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0005j\b\u0012\u0004\u0012\u00020\u0000`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/navMap/NavMap;", "", "id", "", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(ILjava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NavMap.kt */
public final class NavMap {
    private ArrayList<NavMap> data;

    /* renamed from: id */
    private final int f42458id;

    public NavMap(int i, ArrayList<NavMap> arrayList) {
        vx2.m53591g(arrayList, "data");
        this.f42458id = i;
        this.data = arrayList;
    }

    public static /* synthetic */ NavMap copy$default(NavMap navMap, int i, ArrayList<NavMap> arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = navMap.f42458id;
        }
        if ((i2 & 2) != 0) {
            arrayList = navMap.data;
        }
        return navMap.copy(i, arrayList);
    }

    public final int component1() {
        return this.f42458id;
    }

    public final ArrayList<NavMap> component2() {
        return this.data;
    }

    public final NavMap copy(int i, ArrayList<NavMap> arrayList) {
        vx2.m53591g(arrayList, "data");
        return new NavMap(i, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavMap)) {
            return false;
        }
        NavMap navMap = (NavMap) obj;
        return this.f42458id == navMap.f42458id && vx2.m53586b(this.data, navMap.data);
    }

    public final ArrayList<NavMap> getData() {
        return this.data;
    }

    public final int getId() {
        return this.f42458id;
    }

    public int hashCode() {
        return (this.f42458id * 31) + this.data.hashCode();
    }

    public final void setData(ArrayList<NavMap> arrayList) {
        vx2.m53591g(arrayList, "<set-?>");
        this.data = arrayList;
    }

    public String toString() {
        int i = this.f42458id;
        ArrayList<NavMap> arrayList = this.data;
        return "NavMap(id=" + i + ", data=" + arrayList + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavMap(int i, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
