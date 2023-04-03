package p000;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B+\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\n\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R+\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lj16;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "getArrayOfArgs", "()Ljava/util/ArrayList;", "arrayOfArgs", "b", "I", "getNumOfArgs", "()I", "numOfArgs", "<init>", "(Ljava/util/ArrayList;I)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: j16 */
/* compiled from: Web3WalletEvent.kt */
public final class j16 implements tj7 {

    /* renamed from: a */
    public final ArrayList<String> f38569a;

    /* renamed from: b */
    public final int f38570b;

    public j16(ArrayList<String> arrayList, int i) {
        vx2.m53591g(arrayList, "arrayOfArgs");
        this.f38569a = arrayList;
        this.f38570b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j16)) {
            return false;
        }
        j16 j16 = (j16) obj;
        return vx2.m53586b(this.f38569a, j16.f38569a) && this.f38570b == j16.f38570b;
    }

    public int hashCode() {
        return (this.f38569a.hashCode() * 31) + this.f38570b;
    }

    public String toString() {
        ArrayList<String> arrayList = this.f38569a;
        int i = this.f38570b;
        return "SessionRequest(arrayOfArgs=" + arrayList + ", numOfArgs=" + i + ")";
    }
}
