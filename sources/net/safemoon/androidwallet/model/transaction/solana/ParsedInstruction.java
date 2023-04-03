package net.safemoon.androidwallet.model.transaction.solana;

import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/solana/ParsedInstruction;", "", "name", "", "params", "Lnet/safemoon/androidwallet/model/transaction/solana/Params;", "program", "programId", "type", "(Ljava/lang/String;Lnet/safemoon/androidwallet/model/transaction/solana/Params;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getParams", "()Lnet/safemoon/androidwallet/model/transaction/solana/Params;", "getProgram", "getProgramId", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: ParsedInstruction.kt */
public final class ParsedInstruction {
    private final String name;
    private final Params params;
    private final String program;
    private final String programId;
    private final String type;

    public ParsedInstruction(String str, Params params2, String str2, String str3, String str4) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(params2, "params");
        vx2.m53591g(str2, "program");
        vx2.m53591g(str3, "programId");
        vx2.m53591g(str4, "type");
        this.name = str;
        this.params = params2;
        this.program = str2;
        this.programId = str3;
        this.type = str4;
    }

    public static /* synthetic */ ParsedInstruction copy$default(ParsedInstruction parsedInstruction, String str, Params params2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parsedInstruction.name;
        }
        if ((i & 2) != 0) {
            params2 = parsedInstruction.params;
        }
        Params params3 = params2;
        if ((i & 4) != 0) {
            str2 = parsedInstruction.program;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = parsedInstruction.programId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = parsedInstruction.type;
        }
        return parsedInstruction.copy(str, params3, str5, str6, str4);
    }

    public final String component1() {
        return this.name;
    }

    public final Params component2() {
        return this.params;
    }

    public final String component3() {
        return this.program;
    }

    public final String component4() {
        return this.programId;
    }

    public final String component5() {
        return this.type;
    }

    public final ParsedInstruction copy(String str, Params params2, String str2, String str3, String str4) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(params2, "params");
        vx2.m53591g(str2, "program");
        vx2.m53591g(str3, "programId");
        vx2.m53591g(str4, "type");
        return new ParsedInstruction(str, params2, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParsedInstruction)) {
            return false;
        }
        ParsedInstruction parsedInstruction = (ParsedInstruction) obj;
        return vx2.m53586b(this.name, parsedInstruction.name) && vx2.m53586b(this.params, parsedInstruction.params) && vx2.m53586b(this.program, parsedInstruction.program) && vx2.m53586b(this.programId, parsedInstruction.programId) && vx2.m53586b(this.type, parsedInstruction.type);
    }

    public final String getName() {
        return this.name;
    }

    public final Params getParams() {
        return this.params;
    }

    public final String getProgram() {
        return this.program;
    }

    public final String getProgramId() {
        return this.programId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.params.hashCode()) * 31) + this.program.hashCode()) * 31) + this.programId.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        String str = this.name;
        Params params2 = this.params;
        String str2 = this.program;
        String str3 = this.programId;
        String str4 = this.type;
        return "ParsedInstruction(name=" + str + ", params=" + params2 + ", program=" + str2 + ", programId=" + str3 + ", type=" + str4 + ")";
    }
}
