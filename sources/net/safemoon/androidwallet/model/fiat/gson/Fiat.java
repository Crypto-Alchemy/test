package net.safemoon.androidwallet.model.fiat.gson;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.model.fiat.abstraction.IFiat;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "Lnet/safemoon/androidwallet/model/fiat/abstraction/IFiat;", "symbol", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "rate", "", "(Ljava/lang/String;D)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getName", "()Ljava/lang/String;", "getRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSymbol", "toString", "Companion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Fiat.kt */
public final class Fiat implements IFiat {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Fiat DEFAULT_CURRENCY;
    /* access modifiers changed from: private */
    public static final String DEFAULT_CURRENCY_STRING;
    private final String name;
    private final Double rate;
    private final String symbol;

    @Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/fiat/gson/Fiat$Companion;", "", "()V", "DEFAULT_CURRENCY", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "getDEFAULT_CURRENCY", "()Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "DEFAULT_CURRENCY_STRING", "", "getDEFAULT_CURRENCY_STRING", "()Ljava/lang/String;", "to", "string", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: Fiat.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fiat getDEFAULT_CURRENCY() {
            return Fiat.DEFAULT_CURRENCY;
        }

        public final String getDEFAULT_CURRENCY_STRING() {
            return Fiat.DEFAULT_CURRENCY_STRING;
        }

        /* renamed from: to */
        public final Fiat mo58938to(String str) {
            vx2.m53591g(str, Utf8String.TYPE_NAME);
            try {
                Object fromJson = new Gson().fromJson(str, Fiat.class);
                vx2.m53590f(fromJson, "{\n            Gson().fro…at::class.java)\n        }");
                return (Fiat) fromJson;
            } catch (Exception unused) {
                return getDEFAULT_CURRENCY();
            }
        }
    }

    static {
        Fiat fiat = new Fiat("USD", "United States Dollar", Double.valueOf(1.0d));
        DEFAULT_CURRENCY = fiat;
        DEFAULT_CURRENCY_STRING = fiat.toString();
    }

    public Fiat(String str, String str2, Double d) {
        vx2.m53591g(str, "symbol");
        this.symbol = str;
        this.name = str2;
        this.rate = d;
    }

    public String getName() {
        return this.name;
    }

    public Double getRate() {
        return this.rate;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Fiat(String str, String str2) {
        this(str, str2, (Double) null);
        vx2.m53591g(str, "symbol");
        vx2.m53591g(str2, PublicResolver.FUNC_NAME);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Fiat(String str, double d) {
        this(str, (String) null, Double.valueOf(d));
        vx2.m53591g(str, "symbol");
    }
}
