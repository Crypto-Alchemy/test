package net.safemoon.androidwallet.model.transaction.solana;

import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/solana/ParsedInstructionX;", "", "data", "", "dataEncode", "name", "params", "Lnet/safemoon/androidwallet/model/transaction/solana/ParamsX;", "programId", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/transaction/solana/ParamsX;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getDataEncode", "getName", "getParams", "()Lnet/safemoon/androidwallet/model/transaction/solana/ParamsX;", "getProgramId", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: ParsedInstructionX.kt */
public final class ParsedInstructionX {
    private final String data;
    private final String dataEncode;
    private final String name;
    private final ParamsX params;
    private final String programId;
    private final String type;

    public ParsedInstructionX(String str, String str2, String str3, ParamsX paramsX, String str4, String str5) {
        vx2.m53591g(str, "data");
        vx2.m53591g(str2, "dataEncode");
        vx2.m53591g(str3, PublicResolver.FUNC_NAME);
        vx2.m53591g(paramsX, "params");
        vx2.m53591g(str4, "programId");
        vx2.m53591g(str5, "type");
        this.data = str;
        this.dataEncode = str2;
        this.name = str3;
        this.params = paramsX;
        this.programId = str4;
        this.type = str5;
    }

    public static /* synthetic */ ParsedInstructionX copy$default(ParsedInstructionX parsedInstructionX, String str, String str2, String str3, ParamsX paramsX, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parsedInstructionX.data;
        }
        if ((i & 2) != 0) {
            str2 = parsedInstructionX.dataEncode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = parsedInstructionX.name;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            paramsX = parsedInstructionX.params;
        }
        ParamsX paramsX2 = paramsX;
        if ((i & 16) != 0) {
            str4 = parsedInstructionX.programId;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = parsedInstructionX.type;
        }
        return parsedInstructionX.copy(str, str6, str7, paramsX2, str8, str5);
    }

    public final String component1() {
        return this.data;
    }

    public final String component2() {
        return this.dataEncode;
    }

    public final String component3() {
        return this.name;
    }

    public final ParamsX component4() {
        return this.params;
    }

    public final String component5() {
        return this.programId;
    }

    public final String component6() {
        return this.type;
    }

    public final ParsedInstructionX copy(String str, String str2, String str3, ParamsX paramsX, String str4, String str5) {
        vx2.m53591g(str, "data");
        vx2.m53591g(str2, "dataEncode");
        vx2.m53591g(str3, PublicResolver.FUNC_NAME);
        vx2.m53591g(paramsX, "params");
        vx2.m53591g(str4, "programId");
        vx2.m53591g(str5, "type");
        return new ParsedInstructionX(str, str2, str3, paramsX, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParsedInstructionX)) {
            return false;
        }
        ParsedInstructionX parsedInstructionX = (ParsedInstructionX) obj;
        return vx2.m53586b(this.data, parsedInstructionX.data) && vx2.m53586b(this.dataEncode, parsedInstructionX.dataEncode) && vx2.m53586b(this.name, parsedInstructionX.name) && vx2.m53586b(this.params, parsedInstructionX.params) && vx2.m53586b(this.programId, parsedInstructionX.programId) && vx2.m53586b(this.type, parsedInstructionX.type);
    }

    public final String getData() {
        return this.data;
    }

    public final String getDataEncode() {
        return this.dataEncode;
    }

    public final String getName() {
        return this.name;
    }

    public final ParamsX getParams() {
        return this.params;
    }

    public final String getProgramId() {
        return this.programId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.data.hashCode() * 31) + this.dataEncode.hashCode()) * 31) + this.name.hashCode()) * 31) + this.params.hashCode()) * 31) + this.programId.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        String str = this.data;
        String str2 = this.dataEncode;
        String str3 = this.name;
        ParamsX paramsX = this.params;
        String str4 = this.programId;
        String str5 = this.type;
        return "ParsedInstructionX(data=" + str + ", dataEncode=" + str2 + ", name=" + str3 + ", params=" + paramsX + ", programId=" + str4 + ", type=" + str5 + ")";
    }
}
