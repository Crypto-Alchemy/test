package net.safemoon.androidwallet.model.transaction.solana;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/solana/InnerInstruction;", "", "index", "", "parsedInstructions", "", "Lnet/safemoon/androidwallet/model/transaction/solana/ParsedInstruction;", "(ILjava/util/List;)V", "getIndex", "()I", "getParsedInstructions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: InnerInstruction.kt */
public final class InnerInstruction {
    private final int index;
    private final List<ParsedInstruction> parsedInstructions;

    public InnerInstruction(int i, List<ParsedInstruction> list) {
        vx2.m53591g(list, "parsedInstructions");
        this.index = i;
        this.parsedInstructions = list;
    }

    public static /* synthetic */ InnerInstruction copy$default(InnerInstruction innerInstruction, int i, List<ParsedInstruction> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = innerInstruction.index;
        }
        if ((i2 & 2) != 0) {
            list = innerInstruction.parsedInstructions;
        }
        return innerInstruction.copy(i, list);
    }

    public final int component1() {
        return this.index;
    }

    public final List<ParsedInstruction> component2() {
        return this.parsedInstructions;
    }

    public final InnerInstruction copy(int i, List<ParsedInstruction> list) {
        vx2.m53591g(list, "parsedInstructions");
        return new InnerInstruction(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerInstruction)) {
            return false;
        }
        InnerInstruction innerInstruction = (InnerInstruction) obj;
        return this.index == innerInstruction.index && vx2.m53586b(this.parsedInstructions, innerInstruction.parsedInstructions);
    }

    public final int getIndex() {
        return this.index;
    }

    public final List<ParsedInstruction> getParsedInstructions() {
        return this.parsedInstructions;
    }

    public int hashCode() {
        return (this.index * 31) + this.parsedInstructions.hashCode();
    }

    public String toString() {
        int i = this.index;
        List<ParsedInstruction> list = this.parsedInstructions;
        return "InnerInstruction(index=" + i + ", parsedInstructions=" + list + ")";
    }
}
