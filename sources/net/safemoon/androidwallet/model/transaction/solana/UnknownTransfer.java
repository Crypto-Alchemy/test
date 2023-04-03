package net.safemoon.androidwallet.model.transaction.solana;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/solana/UnknownTransfer;", "", "event", "", "Lnet/safemoon/androidwallet/model/transaction/solana/Event;", "programId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getEvent", "()Ljava/util/List;", "getProgramId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: UnknownTransfer.kt */
public final class UnknownTransfer {
    private final List<Event> event;
    private final String programId;

    public UnknownTransfer(List<Event> list, String str) {
        vx2.m53591g(list, "event");
        vx2.m53591g(str, "programId");
        this.event = list;
        this.programId = str;
    }

    public static /* synthetic */ UnknownTransfer copy$default(UnknownTransfer unknownTransfer, List<Event> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = unknownTransfer.event;
        }
        if ((i & 2) != 0) {
            str = unknownTransfer.programId;
        }
        return unknownTransfer.copy(list, str);
    }

    public final List<Event> component1() {
        return this.event;
    }

    public final String component2() {
        return this.programId;
    }

    public final UnknownTransfer copy(List<Event> list, String str) {
        vx2.m53591g(list, "event");
        vx2.m53591g(str, "programId");
        return new UnknownTransfer(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownTransfer)) {
            return false;
        }
        UnknownTransfer unknownTransfer = (UnknownTransfer) obj;
        return vx2.m53586b(this.event, unknownTransfer.event) && vx2.m53586b(this.programId, unknownTransfer.programId);
    }

    public final List<Event> getEvent() {
        return this.event;
    }

    public final String getProgramId() {
        return this.programId;
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.programId.hashCode();
    }

    public String toString() {
        List<Event> list = this.event;
        String str = this.programId;
        return "UnknownTransfer(event=" + list + ", programId=" + str + ")";
    }
}
