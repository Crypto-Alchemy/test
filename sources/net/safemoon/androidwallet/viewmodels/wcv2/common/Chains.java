package net.safemoon.androidwallet.viewmodels.wcv2.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.MyCoinType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0013\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dBY\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/common/Chains;", "", "", "chainName", "Ljava/lang/String;", "getChainName", "()Ljava/lang/String;", "chainNamespace", "getChainNamespace", "chainReference", "getChainReference", "", "icon", "I", "getIcon", "()I", "", "methods", "Ljava/util/List;", "getMethods", "()Ljava/util/List;", "events", "getEvents", "chainWcId", "getChainWcId", "chainId", "getChainId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;I)V", "a", "ETHEREUM_MAIN", "POLYGON_MATIC", "BSC_MAIN", "AVALANCHE_C", "SOLANA", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Chains.kt */
public enum Chains {
    ETHEREUM_MAIN("Ethereum", r14.mo62049a(), "1", R.drawable.ethereum, r14.mo62051c(), r14.mo62050b(), (List) null, 1, 64, (int) null),
    POLYGON_MATIC("Polygon Matic", r14.mo62049a(), "137", R.drawable.polygon_matic_chain, r14.mo62051c(), r14.mo62050b(), (List) null, 137, 64, (int) null),
    BSC_MAIN("BNB Smart Chain", r14.mo62049a(), "56", R.drawable.wrapped_bnb, r14.mo62051c(), r14.mo62050b(), (List) null, 56, 64, (int) null),
    AVALANCHE_C("Avalanche", r14.mo62049a(), "43114", R.drawable.polygon_matic_chain, r14.mo62051c(), r14.mo62050b(), (List) null, 43114, 64, (int) null),
    SOLANA("SOLANA", r1.mo62052a(), "4sGjMW1sUnHzSxGspuhpqLDx6wiyjNtZ", R.drawable.solana, r1.mo62054c(), r1.mo62053b(), (List) null, MyCoinType.SOLANA.getValue() * -1, 64, (int) null);
    
    private final int chainId;
    private final String chainName;
    private final String chainNamespace;
    private final String chainReference;
    private final String chainWcId;
    private final List<String> events;
    private final int icon;
    private final List<String> methods;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/common/Chains$a;", "", "<init>", "()V", "a", "b", "Lnet/safemoon/androidwallet/viewmodels/wcv2/common/Chains$a$a;", "Lnet/safemoon/androidwallet/viewmodels/wcv2/common/Chains$a$b;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wcv2.common.Chains$a */
    /* compiled from: Chains.kt */
    public static abstract class C8928a {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/common/Chains$a$a;", "Lnet/safemoon/androidwallet/viewmodels/wcv2/common/Chains$a;", "", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "chain", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "defaultEvents", "d", "defaultMethods", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: net.safemoon.androidwallet.viewmodels.wcv2.common.Chains$a$a */
        /* compiled from: Chains.kt */
        public static final class C8929a extends C8928a {

            /* renamed from: a */
            public static final C8929a f43189a = null;

            /* renamed from: b */
            public static final String f43190b = null;

            /* renamed from: c */
            public static final List<String> f43191c = null;

            /* renamed from: d */
            public static final List<String> f43192d = null;

            static {
                f43189a = new C8929a();
                f43190b = "eip155";
                f43191c = ck0.m33065m("chainChanged", "accountChanged");
                f43192d = ck0.m33065m("eth_sendTransaction", "personal_sign", "eth_sign", "eth_signTypedData");
            }

            public C8929a() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public String mo62049a() {
                return f43190b;
            }

            /* renamed from: b */
            public List<String> mo62050b() {
                return f43191c;
            }

            /* renamed from: c */
            public List<String> mo62051c() {
                return f43192d;
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/common/Chains$a$b;", "Lnet/safemoon/androidwallet/viewmodels/wcv2/common/Chains$a;", "", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "chain", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "defaultEvents", "d", "defaultMethods", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: net.safemoon.androidwallet.viewmodels.wcv2.common.Chains$a$b */
        /* compiled from: Chains.kt */
        public static final class C8930b extends C8928a {

            /* renamed from: a */
            public static final C8930b f43193a = null;

            /* renamed from: b */
            public static final String f43194b = null;

            /* renamed from: c */
            public static final List<String> f43195c = null;

            /* renamed from: d */
            public static final List<String> f43196d = null;

            static {
                f43193a = new C8930b();
                f43194b = "solana";
                f43195c = ck0.m33062j();
                f43196d = ck0.m33065m("solana_signTransaction", "solana_signMessage");
            }

            public C8930b() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public String mo62052a() {
                return f43194b;
            }

            /* renamed from: b */
            public List<String> mo62053b() {
                return f43195c;
            }

            /* renamed from: c */
            public List<String> mo62054c() {
                return f43196d;
            }
        }

        public C8928a() {
        }

        public /* synthetic */ C8928a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: public */
    Chains(String str, String str2, String str3, int i, List<String> list, List<String> list2, String str4, int i2) {
        this.chainName = str;
        this.chainNamespace = str2;
        this.chainReference = str3;
        this.icon = i;
        this.methods = list;
        this.events = list2;
        this.chainWcId = str4;
        this.chainId = i2;
    }

    public final int getChainId() {
        return this.chainId;
    }

    public final String getChainName() {
        return this.chainName;
    }

    public final String getChainNamespace() {
        return this.chainNamespace;
    }

    public final String getChainReference() {
        return this.chainReference;
    }

    public final String getChainWcId() {
        return this.chainWcId;
    }

    public final List<String> getEvents() {
        return this.events;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final List<String> getMethods() {
        return this.methods;
    }
}
