package net.safemoon.androidwallet.model.rpc2.solana;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaResponse;", "()V", "result", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Result;", "getResult", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Result;", "setResult", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Result;)V", "Account", "Context", "Data", "Info", "Parsed", "Result", "TokenAmount", "Value", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaBalanceTokenResponse.kt */
public final class SolanaBalanceTokenResponse extends SolanaResponse {
    @SerializedName("result")
    @Expose
    private Result result = new Result((Context) null, (ArrayList) null, 3, (DefaultConstructorMarker) null);

    public final Result getResult() {
        return this.result;
    }

    public final void setResult(Result result2) {
        this.result = result2;
    }

    @Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Context;", "", "apiVersion", "", "slot", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getApiVersion", "()Ljava/lang/String;", "setApiVersion", "(Ljava/lang/String;)V", "getSlot", "()Ljava/lang/Integer;", "setSlot", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Context;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaBalanceTokenResponse.kt */
    public static final class Context {
        @SerializedName("apiVersion")
        @Expose
        private String apiVersion;
        @SerializedName("slot")
        @Expose
        private Integer slot;

        public Context() {
            this((String) null, (Integer) null, 3, (DefaultConstructorMarker) null);
        }

        public Context(String str, Integer num) {
            this.apiVersion = str;
            this.slot = num;
        }

        public static /* synthetic */ Context copy$default(Context context, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = context.apiVersion;
            }
            if ((i & 2) != 0) {
                num = context.slot;
            }
            return context.copy(str, num);
        }

        public final String component1() {
            return this.apiVersion;
        }

        public final Integer component2() {
            return this.slot;
        }

        public final Context copy(String str, Integer num) {
            return new Context(str, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Context)) {
                return false;
            }
            Context context = (Context) obj;
            return vx2.m53586b(this.apiVersion, context.apiVersion) && vx2.m53586b(this.slot, context.slot);
        }

        public final String getApiVersion() {
            return this.apiVersion;
        }

        public final Integer getSlot() {
            return this.slot;
        }

        public int hashCode() {
            String str = this.apiVersion;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.slot;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode + i;
        }

        public final void setApiVersion(String str) {
            this.apiVersion = str;
        }

        public final void setSlot(Integer num) {
            this.slot = num;
        }

        public String toString() {
            String str = this.apiVersion;
            Integer num = this.slot;
            return "Context(apiVersion=" + str + ", slot=" + num + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Context(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
        }
    }

    @Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Parsed;", "", "info", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Info;", "type", "", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Info;Ljava/lang/String;)V", "getInfo", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Info;", "setInfo", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Info;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaBalanceTokenResponse.kt */
    public static final class Parsed {
        @SerializedName("info")
        @Expose

        /* renamed from: info  reason: collision with root package name */
        private Info f46904info;
        @SerializedName("type")
        @Expose
        private String type;

        public Parsed() {
            this((Info) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public Parsed(Info info2, String str) {
            this.f46904info = info2;
            this.type = str;
        }

        public static /* synthetic */ Parsed copy$default(Parsed parsed, Info info2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                info2 = parsed.f46904info;
            }
            if ((i & 2) != 0) {
                str = parsed.type;
            }
            return parsed.copy(info2, str);
        }

        public final Info component1() {
            return this.f46904info;
        }

        public final String component2() {
            return this.type;
        }

        public final Parsed copy(Info info2, String str) {
            return new Parsed(info2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Parsed)) {
                return false;
            }
            Parsed parsed = (Parsed) obj;
            return vx2.m53586b(this.f46904info, parsed.f46904info) && vx2.m53586b(this.type, parsed.type);
        }

        public final Info getInfo() {
            return this.f46904info;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            Info info2 = this.f46904info;
            int i = 0;
            int hashCode = (info2 == null ? 0 : info2.hashCode()) * 31;
            String str = this.type;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final void setInfo(Info info2) {
            this.f46904info = info2;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public String toString() {
            Info info2 = this.f46904info;
            String str = this.type;
            return "Parsed(info=" + info2 + ", type=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Parsed(Info info2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Info((Boolean) null, (String) null, (String) null, (String) null, (TokenAmount) null, 31, (DefaultConstructorMarker) null) : info2, (i & 2) != 0 ? null : str);
        }
    }

    @Metadata(mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Result;", "", "context", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Context;", "value", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Value;", "Lkotlin/collections/ArrayList;", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Context;Ljava/util/ArrayList;)V", "getContext", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Context;", "setContext", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Context;)V", "getValue", "()Ljava/util/ArrayList;", "setValue", "(Ljava/util/ArrayList;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaBalanceTokenResponse.kt */
    public static final class Result {
        @SerializedName("context")
        @Expose
        private Context context;
        @SerializedName("value")
        @Expose
        private ArrayList<Value> value;

        public Result() {
            this((Context) null, (ArrayList) null, 3, (DefaultConstructorMarker) null);
        }

        public Result(Context context2, ArrayList<Value> arrayList) {
            vx2.m53591g(arrayList, "value");
            this.context = context2;
            this.value = arrayList;
        }

        public static /* synthetic */ Result copy$default(Result result, Context context2, ArrayList<Value> arrayList, int i, Object obj) {
            if ((i & 1) != 0) {
                context2 = result.context;
            }
            if ((i & 2) != 0) {
                arrayList = result.value;
            }
            return result.copy(context2, arrayList);
        }

        public final Context component1() {
            return this.context;
        }

        public final ArrayList<Value> component2() {
            return this.value;
        }

        public final Result copy(Context context2, ArrayList<Value> arrayList) {
            vx2.m53591g(arrayList, "value");
            return new Result(context2, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return vx2.m53586b(this.context, result.context) && vx2.m53586b(this.value, result.value);
        }

        public final Context getContext() {
            return this.context;
        }

        public final ArrayList<Value> getValue() {
            return this.value;
        }

        public int hashCode() {
            Context context2 = this.context;
            return ((context2 == null ? 0 : context2.hashCode()) * 31) + this.value.hashCode();
        }

        public final void setContext(Context context2) {
            this.context = context2;
        }

        public final void setValue(ArrayList<Value> arrayList) {
            vx2.m53591g(arrayList, "<set-?>");
            this.value = arrayList;
        }

        public String toString() {
            Context context2 = this.context;
            ArrayList<Value> arrayList = this.value;
            return "Result(context=" + context2 + ", value=" + arrayList + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Result(Context context2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Context((String) null, (Integer) null, 3, (DefaultConstructorMarker) null) : context2, (i & 2) != 0 ? new ArrayList() : arrayList);
        }
    }

    @Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Value;", "", "account", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Account;", "pubkey", "", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Account;Ljava/lang/String;)V", "getAccount", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Account;", "setAccount", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Account;)V", "getPubkey", "()Ljava/lang/String;", "setPubkey", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaBalanceTokenResponse.kt */
    public static final class Value {
        @SerializedName("account")
        @Expose
        private Account account;
        @SerializedName("pubkey")
        @Expose
        private String pubkey;

        public Value() {
            this((Account) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public Value(Account account2, String str) {
            this.account = account2;
            this.pubkey = str;
        }

        public static /* synthetic */ Value copy$default(Value value, Account account2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                account2 = value.account;
            }
            if ((i & 2) != 0) {
                str = value.pubkey;
            }
            return value.copy(account2, str);
        }

        public final Account component1() {
            return this.account;
        }

        public final String component2() {
            return this.pubkey;
        }

        public final Value copy(Account account2, String str) {
            return new Value(account2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return vx2.m53586b(this.account, value.account) && vx2.m53586b(this.pubkey, value.pubkey);
        }

        public final Account getAccount() {
            return this.account;
        }

        public final String getPubkey() {
            return this.pubkey;
        }

        public int hashCode() {
            Account account2 = this.account;
            int i = 0;
            int hashCode = (account2 == null ? 0 : account2.hashCode()) * 31;
            String str = this.pubkey;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final void setAccount(Account account2) {
            this.account = account2;
        }

        public final void setPubkey(String str) {
            this.pubkey = str;
        }

        public String toString() {
            Account account2 = this.account;
            String str = this.pubkey;
            return "Value(account=" + account2 + ", pubkey=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Value(Account account2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Account((Data) null, (Boolean) null, (Integer) null, (String) null, (Integer) null, 31, (DefaultConstructorMarker) null) : account2, (i & 2) != 0 ? null : str);
        }
    }

    @Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Data;", "", "parsed", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Parsed;", "program", "", "space", "", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Parsed;Ljava/lang/String;Ljava/lang/Integer;)V", "getParsed", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Parsed;", "setParsed", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Parsed;)V", "getProgram", "()Ljava/lang/String;", "setProgram", "(Ljava/lang/String;)V", "getSpace", "()Ljava/lang/Integer;", "setSpace", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Parsed;Ljava/lang/String;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Data;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaBalanceTokenResponse.kt */
    public static final class Data {
        @SerializedName("parsed")
        @Expose
        private Parsed parsed;
        @SerializedName("program")
        @Expose
        private String program;
        @SerializedName("space")
        @Expose
        private Integer space;

        public Data() {
            this((Parsed) null, (String) null, (Integer) null, 7, (DefaultConstructorMarker) null);
        }

        public Data(Parsed parsed2, String str, Integer num) {
            this.parsed = parsed2;
            this.program = str;
            this.space = num;
        }

        public static /* synthetic */ Data copy$default(Data data, Parsed parsed2, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                parsed2 = data.parsed;
            }
            if ((i & 2) != 0) {
                str = data.program;
            }
            if ((i & 4) != 0) {
                num = data.space;
            }
            return data.copy(parsed2, str, num);
        }

        public final Parsed component1() {
            return this.parsed;
        }

        public final String component2() {
            return this.program;
        }

        public final Integer component3() {
            return this.space;
        }

        public final Data copy(Parsed parsed2, String str, Integer num) {
            return new Data(parsed2, str, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return vx2.m53586b(this.parsed, data.parsed) && vx2.m53586b(this.program, data.program) && vx2.m53586b(this.space, data.space);
        }

        public final Parsed getParsed() {
            return this.parsed;
        }

        public final String getProgram() {
            return this.program;
        }

        public final Integer getSpace() {
            return this.space;
        }

        public int hashCode() {
            Parsed parsed2 = this.parsed;
            int i = 0;
            int hashCode = (parsed2 == null ? 0 : parsed2.hashCode()) * 31;
            String str = this.program;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.space;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode2 + i;
        }

        public final void setParsed(Parsed parsed2) {
            this.parsed = parsed2;
        }

        public final void setProgram(String str) {
            this.program = str;
        }

        public final void setSpace(Integer num) {
            this.space = num;
        }

        public String toString() {
            Parsed parsed2 = this.parsed;
            String str = this.program;
            Integer num = this.space;
            return "Data(parsed=" + parsed2 + ", program=" + str + ", space=" + num + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(Parsed parsed2, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Parsed((Info) null, (String) null, 3, (DefaultConstructorMarker) null) : parsed2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
        }
    }

    @Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\r¨\u0006%"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$TokenAmount;", "", "amount", "", "decimals", "", "uiAmount", "", "uiAmountString", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getDecimals", "()Ljava/lang/Integer;", "setDecimals", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUiAmount", "()Ljava/lang/Double;", "setUiAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getUiAmountString", "setUiAmountString", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$TokenAmount;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaBalanceTokenResponse.kt */
    public static final class TokenAmount {
        @SerializedName("amount")
        @Expose
        private String amount;
        @SerializedName("decimals")
        @Expose
        private Integer decimals;
        @SerializedName("uiAmount")
        @Expose
        private Double uiAmount;
        @SerializedName("uiAmountString")
        @Expose
        private String uiAmountString;

        public TokenAmount() {
            this((String) null, (Integer) null, (Double) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public TokenAmount(String str, Integer num, Double d, String str2) {
            this.amount = str;
            this.decimals = num;
            this.uiAmount = d;
            this.uiAmountString = str2;
        }

        public static /* synthetic */ TokenAmount copy$default(TokenAmount tokenAmount, String str, Integer num, Double d, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tokenAmount.amount;
            }
            if ((i & 2) != 0) {
                num = tokenAmount.decimals;
            }
            if ((i & 4) != 0) {
                d = tokenAmount.uiAmount;
            }
            if ((i & 8) != 0) {
                str2 = tokenAmount.uiAmountString;
            }
            return tokenAmount.copy(str, num, d, str2);
        }

        public final String component1() {
            return this.amount;
        }

        public final Integer component2() {
            return this.decimals;
        }

        public final Double component3() {
            return this.uiAmount;
        }

        public final String component4() {
            return this.uiAmountString;
        }

        public final TokenAmount copy(String str, Integer num, Double d, String str2) {
            return new TokenAmount(str, num, d, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenAmount)) {
                return false;
            }
            TokenAmount tokenAmount = (TokenAmount) obj;
            return vx2.m53586b(this.amount, tokenAmount.amount) && vx2.m53586b(this.decimals, tokenAmount.decimals) && vx2.m53586b(this.uiAmount, tokenAmount.uiAmount) && vx2.m53586b(this.uiAmountString, tokenAmount.uiAmountString);
        }

        public final String getAmount() {
            return this.amount;
        }

        public final Integer getDecimals() {
            return this.decimals;
        }

        public final Double getUiAmount() {
            return this.uiAmount;
        }

        public final String getUiAmountString() {
            return this.uiAmountString;
        }

        public int hashCode() {
            String str = this.amount;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.decimals;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Double d = this.uiAmount;
            int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            String str2 = this.uiAmountString;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode3 + i;
        }

        public final void setAmount(String str) {
            this.amount = str;
        }

        public final void setDecimals(Integer num) {
            this.decimals = num;
        }

        public final void setUiAmount(Double d) {
            this.uiAmount = d;
        }

        public final void setUiAmountString(String str) {
            this.uiAmountString = str;
        }

        public String toString() {
            String str = this.amount;
            Integer num = this.decimals;
            Double d = this.uiAmount;
            String str2 = this.uiAmountString;
            return "TokenAmount(amount=" + str + ", decimals=" + num + ", uiAmount=" + d + ", uiAmountString=" + str2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TokenAmount(String str, Integer num, Double d, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : str2);
        }
    }

    @Metadata(mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016JJ\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020\tHÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018¨\u0006+"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Account;", "", "data", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Data;", "executable", "", "lamports", "", "owner", "", "rentEpoch", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Data;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getData", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Data;", "setData", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Data;)V", "getExecutable", "()Ljava/lang/Boolean;", "setExecutable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLamports", "()Ljava/lang/Integer;", "setLamports", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOwner", "()Ljava/lang/String;", "setOwner", "(Ljava/lang/String;)V", "getRentEpoch", "setRentEpoch", "component1", "component2", "component3", "component4", "component5", "copy", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Data;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Account;", "equals", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaBalanceTokenResponse.kt */
    public static final class Account {
        @SerializedName("data")
        @Expose
        private Data data;
        @SerializedName("executable")
        @Expose
        private Boolean executable;
        @SerializedName("lamports")
        @Expose
        private Integer lamports;
        @SerializedName("owner")
        @Expose
        private String owner;
        @SerializedName("rentEpoch")
        @Expose
        private Integer rentEpoch;

        public Account() {
            this((Data) null, (Boolean) null, (Integer) null, (String) null, (Integer) null, 31, (DefaultConstructorMarker) null);
        }

        public Account(Data data2, Boolean bool, Integer num, String str, Integer num2) {
            this.data = data2;
            this.executable = bool;
            this.lamports = num;
            this.owner = str;
            this.rentEpoch = num2;
        }

        public static /* synthetic */ Account copy$default(Account account, Data data2, Boolean bool, Integer num, String str, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                data2 = account.data;
            }
            if ((i & 2) != 0) {
                bool = account.executable;
            }
            Boolean bool2 = bool;
            if ((i & 4) != 0) {
                num = account.lamports;
            }
            Integer num3 = num;
            if ((i & 8) != 0) {
                str = account.owner;
            }
            String str2 = str;
            if ((i & 16) != 0) {
                num2 = account.rentEpoch;
            }
            return account.copy(data2, bool2, num3, str2, num2);
        }

        public final Data component1() {
            return this.data;
        }

        public final Boolean component2() {
            return this.executable;
        }

        public final Integer component3() {
            return this.lamports;
        }

        public final String component4() {
            return this.owner;
        }

        public final Integer component5() {
            return this.rentEpoch;
        }

        public final Account copy(Data data2, Boolean bool, Integer num, String str, Integer num2) {
            return new Account(data2, bool, num, str, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Account)) {
                return false;
            }
            Account account = (Account) obj;
            return vx2.m53586b(this.data, account.data) && vx2.m53586b(this.executable, account.executable) && vx2.m53586b(this.lamports, account.lamports) && vx2.m53586b(this.owner, account.owner) && vx2.m53586b(this.rentEpoch, account.rentEpoch);
        }

        public final Data getData() {
            return this.data;
        }

        public final Boolean getExecutable() {
            return this.executable;
        }

        public final Integer getLamports() {
            return this.lamports;
        }

        public final String getOwner() {
            return this.owner;
        }

        public final Integer getRentEpoch() {
            return this.rentEpoch;
        }

        public int hashCode() {
            Data data2 = this.data;
            int i = 0;
            int hashCode = (data2 == null ? 0 : data2.hashCode()) * 31;
            Boolean bool = this.executable;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.lamports;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.owner;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.rentEpoch;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return hashCode4 + i;
        }

        public final void setData(Data data2) {
            this.data = data2;
        }

        public final void setExecutable(Boolean bool) {
            this.executable = bool;
        }

        public final void setLamports(Integer num) {
            this.lamports = num;
        }

        public final void setOwner(String str) {
            this.owner = str;
        }

        public final void setRentEpoch(Integer num) {
            this.rentEpoch = num;
        }

        public String toString() {
            Data data2 = this.data;
            Boolean bool = this.executable;
            Integer num = this.lamports;
            String str = this.owner;
            Integer num2 = this.rentEpoch;
            return "Account(data=" + data2 + ", executable=" + bool + ", lamports=" + num + ", owner=" + str + ", rentEpoch=" + num2 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Account(net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse.Data r7, java.lang.Boolean r8, java.lang.Integer r9, java.lang.String r10, java.lang.Integer r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r6 = this;
                r13 = r12 & 1
                if (r13 == 0) goto L_0x000f
                net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$Data r7 = new net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$Data
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 7
                r5 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5)
            L_0x000f:
                r13 = r12 & 2
                r0 = 0
                if (r13 == 0) goto L_0x0016
                r13 = r0
                goto L_0x0017
            L_0x0016:
                r13 = r8
            L_0x0017:
                r8 = r12 & 4
                if (r8 == 0) goto L_0x001d
                r1 = r0
                goto L_0x001e
            L_0x001d:
                r1 = r9
            L_0x001e:
                r8 = r12 & 8
                if (r8 == 0) goto L_0x0024
                r2 = r0
                goto L_0x0025
            L_0x0024:
                r2 = r10
            L_0x0025:
                r8 = r12 & 16
                if (r8 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r0 = r11
            L_0x002b:
                r8 = r6
                r9 = r7
                r10 = r13
                r11 = r1
                r12 = r2
                r13 = r0
                r8.<init>(r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse.Account.<init>(net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$Data, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006'"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Info;", "", "isNative", "", "mint", "", "owner", "state", "tokenAmount", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$TokenAmount;", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$TokenAmount;)V", "()Ljava/lang/Boolean;", "setNative", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMint", "()Ljava/lang/String;", "setMint", "(Ljava/lang/String;)V", "getOwner", "setOwner", "getState", "setState", "getTokenAmount", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$TokenAmount;", "setTokenAmount", "(Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$TokenAmount;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$TokenAmount;)Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse$Info;", "equals", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SolanaBalanceTokenResponse.kt */
    public static final class Info {
        @SerializedName("isNative")
        @Expose
        private Boolean isNative;
        @SerializedName("mint")
        @Expose
        private String mint;
        @SerializedName("owner")
        @Expose
        private String owner;
        @SerializedName("state")
        @Expose
        private String state;
        @SerializedName("tokenAmount")
        @Expose
        private TokenAmount tokenAmount;

        public Info() {
            this((Boolean) null, (String) null, (String) null, (String) null, (TokenAmount) null, 31, (DefaultConstructorMarker) null);
        }

        public Info(Boolean bool, String str, String str2, String str3, TokenAmount tokenAmount2) {
            this.isNative = bool;
            this.mint = str;
            this.owner = str2;
            this.state = str3;
            this.tokenAmount = tokenAmount2;
        }

        public static /* synthetic */ Info copy$default(Info info2, Boolean bool, String str, String str2, String str3, TokenAmount tokenAmount2, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = info2.isNative;
            }
            if ((i & 2) != 0) {
                str = info2.mint;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                str2 = info2.owner;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = info2.state;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                tokenAmount2 = info2.tokenAmount;
            }
            return info2.copy(bool, str4, str5, str6, tokenAmount2);
        }

        public final Boolean component1() {
            return this.isNative;
        }

        public final String component2() {
            return this.mint;
        }

        public final String component3() {
            return this.owner;
        }

        public final String component4() {
            return this.state;
        }

        public final TokenAmount component5() {
            return this.tokenAmount;
        }

        public final Info copy(Boolean bool, String str, String str2, String str3, TokenAmount tokenAmount2) {
            return new Info(bool, str, str2, str3, tokenAmount2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info2 = (Info) obj;
            return vx2.m53586b(this.isNative, info2.isNative) && vx2.m53586b(this.mint, info2.mint) && vx2.m53586b(this.owner, info2.owner) && vx2.m53586b(this.state, info2.state) && vx2.m53586b(this.tokenAmount, info2.tokenAmount);
        }

        public final String getMint() {
            return this.mint;
        }

        public final String getOwner() {
            return this.owner;
        }

        public final String getState() {
            return this.state;
        }

        public final TokenAmount getTokenAmount() {
            return this.tokenAmount;
        }

        public int hashCode() {
            Boolean bool = this.isNative;
            int i = 0;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.mint;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.owner;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.state;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TokenAmount tokenAmount2 = this.tokenAmount;
            if (tokenAmount2 != null) {
                i = tokenAmount2.hashCode();
            }
            return hashCode4 + i;
        }

        public final Boolean isNative() {
            return this.isNative;
        }

        public final void setMint(String str) {
            this.mint = str;
        }

        public final void setNative(Boolean bool) {
            this.isNative = bool;
        }

        public final void setOwner(String str) {
            this.owner = str;
        }

        public final void setState(String str) {
            this.state = str;
        }

        public final void setTokenAmount(TokenAmount tokenAmount2) {
            this.tokenAmount = tokenAmount2;
        }

        public String toString() {
            Boolean bool = this.isNative;
            String str = this.mint;
            String str2 = this.owner;
            String str3 = this.state;
            TokenAmount tokenAmount2 = this.tokenAmount;
            return "Info(isNative=" + bool + ", mint=" + str + ", owner=" + str2 + ", state=" + str3 + ", tokenAmount=" + tokenAmount2 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Info(java.lang.Boolean r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse.TokenAmount r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
            /*
                r11 = this;
                r0 = r17 & 1
                r1 = 0
                if (r0 == 0) goto L_0x0007
                r0 = r1
                goto L_0x0008
            L_0x0007:
                r0 = r12
            L_0x0008:
                r2 = r17 & 2
                if (r2 == 0) goto L_0x000e
                r2 = r1
                goto L_0x000f
            L_0x000e:
                r2 = r13
            L_0x000f:
                r3 = r17 & 4
                if (r3 == 0) goto L_0x0015
                r3 = r1
                goto L_0x0016
            L_0x0015:
                r3 = r14
            L_0x0016:
                r4 = r17 & 8
                if (r4 == 0) goto L_0x001b
                goto L_0x001c
            L_0x001b:
                r1 = r15
            L_0x001c:
                r4 = r17 & 16
                if (r4 == 0) goto L_0x0037
                net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$TokenAmount r4 = new net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$TokenAmount
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 15
                r10 = 0
                r12 = r4
                r13 = r5
                r14 = r6
                r15 = r7
                r16 = r8
                r17 = r9
                r18 = r10
                r12.<init>(r13, r14, r15, r16, r17, r18)
                goto L_0x0039
            L_0x0037:
                r4 = r16
            L_0x0039:
                r12 = r11
                r13 = r0
                r14 = r2
                r15 = r3
                r16 = r1
                r17 = r4
                r12.<init>(r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse.Info.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$TokenAmount, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
