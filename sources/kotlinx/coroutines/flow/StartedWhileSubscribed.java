package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Li06;", "Lt86;", "", "subscriptionCount", "Lz42;", "Lkotlinx/coroutines/flow/SharingCommand;", "a", "", "toString", "", "other", "", "equals", "hashCode", "", "b", "J", "stopTimeout", "c", "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: SharingStarted.kt */
public final class StartedWhileSubscribed implements i06 {

    /* renamed from: b */
    public final long f40447b;

    /* renamed from: c */
    public final long f40448c;

    public StartedWhileSubscribed(long j, long j2) {
        boolean z;
        this.f40447b = j;
        this.f40448c = j2;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(j2 < 0 ? false : z2)) {
                throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    /* renamed from: a */
    public z42<SharingCommand> mo52356a(t86<Integer> t86) {
        return e52.m57221m(e52.m57223o(e52.m57207H(t86, new StartedWhileSubscribed$command$1(this, (ns0<? super StartedWhileSubscribed$command$1>) null)), new StartedWhileSubscribed$command$2((ns0<? super StartedWhileSubscribed$command$2>) null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.f40447b == startedWhileSubscribed.f40447b && this.f40448c == startedWhileSubscribed.f40448c) {
                return true;
            }
            return false;
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (au0.m10781a(this.f40447b) * 31) + au0.m10781a(this.f40448c);
    }

    public String toString() {
        List d = bk0.m32597d(2);
        if (this.f40447b > 0) {
            d.add("stopTimeout=" + this.f40447b + "ms");
        }
        if (this.f40448c < Long.MAX_VALUE) {
            d.add("replayExpiration=" + this.f40448c + "ms");
        }
        List a = bk0.m32594a(d);
        return "SharingStarted.WhileSubscribed(" + CollectionsKt___CollectionsKt.m47338i0(a, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 63, (Object) null) + ')';
    }
}
