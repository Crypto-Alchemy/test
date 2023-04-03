package net.safemoon.androidwallet.model.wallets;

import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.MyCoinType;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import org.web3j.abi.datatypes.Address;
import org.web3j.ens.contracts.generated.PublicResolver;
import wallet.core.jni.CoinType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b@\b\b\u0018\u0000 T2\u00020\u0001:\u0001TB\u0001\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010&\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0007\u0012\u0006\u0010(\u001a\u00020\u0007\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0004\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fJ\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0007J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0002HÆ\u0003J\t\u0010 \u001a\u00020\u0002HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\t\u00102\u001a\u00020\u0002HÖ\u0001J\u0013\u00104\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010$\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u00105\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u00108R\"\u0010%\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010&\u001a\u00020\u00078\u0006X\u0004¢\u0006\f\n\u0004\b&\u00109\u001a\u0004\b>\u0010;R\u001a\u0010'\u001a\u00020\u00078\u0006X\u0004¢\u0006\f\n\u0004\b'\u00109\u001a\u0004\b\b\u0010;R(\u0010(\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b(\u00109\u0012\u0004\b@\u0010A\u001a\u0004\b\u000b\u0010;\"\u0004\b?\u0010=R\u001c\u0010)\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\bB\u0010;R\u001c\u0010*\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\bC\u0010;R\u001c\u0010+\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\bD\u0010;R\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010E\u001a\u0004\bJ\u0010G\"\u0004\bK\u0010IR\"\u0010.\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010L\u001a\u0004\b.\u0010M\"\u0004\bN\u0010OR\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b/\u0010P\u001a\u0004\bQ\u0010#¨\u0006U"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/wallets/Wallet;", "", "", "coinTypeValue", "", "isEvmCapacity", "_myCoinTypeValue", "", "getPrivateKey", "", "getPrivateKeyAsBytes", "getAddress", "", "getAllAddressOfWallet", "hasPassphrase", "toString", "isLinked", "value", "Lr37;", "updateLinkedState", "displayName", "", "component1", "()Ljava/lang/Long;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Integer;", "id", "name", "prefix", "privateKey", "address", "passPhrase", "KA", "U5B64", "linkedState", "order", "isPrimaryWallet", "myCoinType", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/Integer;)Lnet/safemoon/androidwallet/model/wallets/Wallet;", "hashCode", "other", "equals", "Ljava/lang/Long;", "getId", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPrefix", "setAddress", "getAddress$annotations", "()V", "getPassPhrase", "getKA", "getU5B64", "I", "getLinkedState", "()I", "setLinkedState", "(I)V", "getOrder", "setOrder", "Z", "()Z", "setPrimaryWallet", "(Z)V", "Ljava/lang/Integer;", "getMyCoinType", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/Integer;)V", "Companion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Wallet.kt */
public final class Wallet {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final CoinType[] EXCLUDE_FOR_PRIVATE_KEY = {CoinType.SOLANA, CoinType.BITCOIN, CoinType.DOGECOIN};

    /* renamed from: KA */
    private final String f42489KA;
    private final String U5B64;
    private String address;

    /* renamed from: id */
    private Long f42490id;
    private boolean isPrimaryWallet;
    private int linkedState;
    private final Integer myCoinType;
    private String name;
    private int order;
    private final String passPhrase;
    private final String prefix;
    private final String privateKey;

    @Metadata(mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/wallets/Wallet$Companion;", "", "()V", "EXCLUDE_FOR_PRIVATE_KEY", "", "Lwallet/core/jni/CoinType;", "getEXCLUDE_FOR_PRIVATE_KEY", "()[Lwallet/core/jni/CoinType;", "[Lwallet/core/jni/CoinType;", "toWallet", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "walletJson", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: Wallet.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoinType[] getEXCLUDE_FOR_PRIVATE_KEY() {
            return Wallet.EXCLUDE_FOR_PRIVATE_KEY;
        }

        public final Wallet toWallet(String str) {
            vx2.m53591g(str, "walletJson");
            try {
                return (Wallet) new Gson().fromJson(str, Wallet.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public Wallet(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, boolean z, Integer num) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "prefix");
        vx2.m53591g(str3, "privateKey");
        vx2.m53591g(str4, Address.TYPE_NAME);
        this.f42490id = l;
        this.name = str;
        this.prefix = str2;
        this.privateKey = str3;
        this.address = str4;
        this.passPhrase = str5;
        this.f42489KA = str6;
        this.U5B64 = str7;
        this.linkedState = i;
        this.order = i2;
        this.isPrimaryWallet = z;
        this.myCoinType = num;
    }

    public static /* synthetic */ Wallet copy$default(Wallet wallet2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, boolean z, Integer num, int i3, Object obj) {
        Wallet wallet3 = wallet2;
        int i4 = i3;
        return wallet2.copy((i4 & 1) != 0 ? wallet3.f42490id : l, (i4 & 2) != 0 ? wallet3.name : str, (i4 & 4) != 0 ? wallet3.prefix : str2, (i4 & 8) != 0 ? wallet3.privateKey : str3, (i4 & 16) != 0 ? wallet3.address : str4, (i4 & 32) != 0 ? wallet3.passPhrase : str5, (i4 & 64) != 0 ? wallet3.f42489KA : str6, (i4 & 128) != 0 ? wallet3.U5B64 : str7, (i4 & 256) != 0 ? wallet3.linkedState : i, (i4 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? wallet3.order : i2, (i4 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? wallet3.isPrimaryWallet : z, (i4 & 2048) != 0 ? wallet3.myCoinType : num);
    }

    public static /* synthetic */ void getAddress$annotations() {
    }

    public static /* synthetic */ String getAddress$default(Wallet wallet2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = MyCoinType.ETHEREUM.getValue();
        }
        return wallet2.getAddress(i);
    }

    public static /* synthetic */ String getPrivateKey$default(Wallet wallet2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = MyCoinType.ETHEREUM.getValue();
        }
        return wallet2.getPrivateKey(i);
    }

    private final boolean isEvmCapacity(int i) {
        SimilarTypeGroup similarTypeGroup;
        MyCoinType b = MyCoinType.Companion.mo57078b(i);
        if (b != null) {
            similarTypeGroup = b.getSimilarTypeGroup();
        } else {
            similarTypeGroup = null;
        }
        if (similarTypeGroup == SimilarTypeGroup.EVM_CAPABILITY) {
            return true;
        }
        return false;
    }

    public final Long component1() {
        return this.f42490id;
    }

    public final int component10() {
        return this.order;
    }

    public final boolean component11() {
        return this.isPrimaryWallet;
    }

    public final Integer component12() {
        return this.myCoinType;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.prefix;
    }

    public final String component4() {
        return this.privateKey;
    }

    public final String component5() {
        return this.address;
    }

    public final String component6() {
        return this.passPhrase;
    }

    public final String component7() {
        return this.f42489KA;
    }

    public final String component8() {
        return this.U5B64;
    }

    public final int component9() {
        return this.linkedState;
    }

    public final Wallet copy(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, boolean z, Integer num) {
        String str8 = str;
        vx2.m53591g(str8, PublicResolver.FUNC_NAME);
        String str9 = str2;
        vx2.m53591g(str9, "prefix");
        String str10 = str3;
        vx2.m53591g(str10, "privateKey");
        String str11 = str4;
        vx2.m53591g(str11, Address.TYPE_NAME);
        return new Wallet(l, str8, str9, str10, str11, str5, str6, str7, i, i2, z, num);
    }

    public final String displayName() {
        if (!this.isPrimaryWallet) {
            return this.name;
        }
        String string = MyApplicationClass.m64669c().getString(R.string.primary_wallet_name);
        vx2.m53590f(string, "get().getString(R.string.primary_wallet_name)");
        return string;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wallet)) {
            return false;
        }
        Wallet wallet2 = (Wallet) obj;
        return vx2.m53586b(this.f42490id, wallet2.f42490id) && vx2.m53586b(this.name, wallet2.name) && vx2.m53586b(this.prefix, wallet2.prefix) && vx2.m53586b(this.privateKey, wallet2.privateKey) && vx2.m53586b(this.address, wallet2.address) && vx2.m53586b(this.passPhrase, wallet2.passPhrase) && vx2.m53586b(this.f42489KA, wallet2.f42489KA) && vx2.m53586b(this.U5B64, wallet2.U5B64) && this.linkedState == wallet2.linkedState && this.order == wallet2.order && this.isPrimaryWallet == wallet2.isPrimaryWallet && vx2.m53586b(this.myCoinType, wallet2.myCoinType);
    }

    public final String getAddress() {
        return this.address;
    }

    public final List<String> getAllAddressOfWallet() {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (TokenType coinType : TokenType.values()) {
            int value = coinType.getCoinType().getValue();
            if (this.passPhrase == null) {
                CoinType[] coinTypeArr = EXCLUDE_FOR_PRIVATE_KEY;
                int length = coinTypeArr.length;
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (value == coinTypeArr[i].value()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    i++;
                }
                if (z) {
                }
            }
            String address2 = getAddress(value);
            if (address2 != null) {
                arrayList.add(address2);
            }
        }
        return CollectionsKt___CollectionsKt.m47322S(arrayList);
    }

    public final Long getId() {
        return this.f42490id;
    }

    public final String getKA() {
        return this.f42489KA;
    }

    public final int getLinkedState() {
        return this.linkedState;
    }

    public final Integer getMyCoinType() {
        return this.myCoinType;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getPassPhrase() {
        return this.passPhrase;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final String getPrivateKey() {
        return this.privateKey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        if (r4 == true) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] getPrivateKeyAsBytes(int r12) {
        /*
            r11 = this;
            java.lang.Integer r0 = r11.myCoinType
            r1 = 0
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = r11.f42489KA
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0018
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0013
            r0 = r2
            goto L_0x0014
        L_0x0013:
            r0 = r3
        L_0x0014:
            if (r0 != r2) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r3
        L_0x0019:
            if (r0 == 0) goto L_0x006d
            net.safemoon.androidwallet.MyApplicationClass r0 = net.safemoon.androidwallet.MyApplicationClass.m64669c()
            java.lang.String r4 = r11.f42489KA
            java.lang.String r5 = p000.C9377u.m72500e(r0, r4)
            if (r5 == 0) goto L_0x003d
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r6 = "|"
            java.lang.String r7 = " "
            java.lang.String r0 = p000.yb6.m74332I(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x003d
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.m63090V0(r0)
            java.lang.String r0 = r0.toString()
            goto L_0x003e
        L_0x003d:
            r0 = r1
        L_0x003e:
            if (r0 == 0) goto L_0x004c
            int r4 = r0.length()
            if (r4 <= 0) goto L_0x0048
            r4 = r2
            goto L_0x0049
        L_0x0048:
            r4 = r3
        L_0x0049:
            if (r4 != r2) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r2 = r3
        L_0x004d:
            if (r2 == 0) goto L_0x006d
            boolean r2 = wallet.core.jni.Mnemonic.isValid(r0)
            if (r2 == 0) goto L_0x006d
            net.safemoon.androidwallet.common.MyCoinType$a r2 = net.safemoon.androidwallet.common.MyCoinType.Companion
            wallet.core.jni.CoinType r12 = r2.mo57077a(r12)
            wallet.core.jni.HDWallet r2 = new wallet.core.jni.HDWallet
            java.lang.String r3 = ""
            r2.<init>((java.lang.String) r0, (java.lang.String) r3)
            if (r12 == 0) goto L_0x006d
            wallet.core.jni.PrivateKey r12 = r2.getKeyForCoin(r12)
            byte[] r12 = r12.data()
            return r12
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.wallets.Wallet.getPrivateKeyAsBytes(int):byte[]");
    }

    public final String getU5B64() {
        return this.U5B64;
    }

    public final boolean hasPassphrase() {
        boolean z;
        String str = this.f42489KA;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Long l = this.f42490id;
        int i = 0;
        int hashCode = (((((((((l == null ? 0 : l.hashCode()) * 31) + this.name.hashCode()) * 31) + this.prefix.hashCode()) * 31) + this.privateKey.hashCode()) * 31) + this.address.hashCode()) * 31;
        String str = this.passPhrase;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42489KA;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.U5B64;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.linkedState) * 31) + this.order) * 31;
        boolean z = this.isPrimaryWallet;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        Integer num = this.myCoinType;
        if (num != null) {
            i = num.hashCode();
        }
        return i2 + i;
    }

    public final boolean isLinked() {
        if (this.linkedState == 1) {
            return true;
        }
        return false;
    }

    public final boolean isPrimaryWallet() {
        return this.isPrimaryWallet;
    }

    public final void setAddress(String str) {
        vx2.m53591g(str, "<set-?>");
        this.address = str;
    }

    public final void setId(Long l) {
        this.f42490id = l;
    }

    public final void setLinkedState(int i) {
        this.linkedState = i;
    }

    public final void setName(String str) {
        vx2.m53591g(str, "<set-?>");
        this.name = str;
    }

    public final void setOrder(int i) {
        this.order = i;
    }

    public final void setPrimaryWallet(boolean z) {
        this.isPrimaryWallet = z;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this, (Type) Wallet.class);
        vx2.m53590f(json, "Gson().toJson(this, Wallet::class.java)");
        return json;
    }

    public final void updateLinkedState(boolean z) {
        this.linkedState = z ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        if ((r0.length() > 0) == true) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getAddress(int r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEvmCapacity(r12)
            if (r0 == 0) goto L_0x0009
            java.lang.String r12 = r11.address
            return r12
        L_0x0009:
            java.lang.Integer r0 = r11.myCoinType
            r1 = 0
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = r11.f42489KA
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x001c
            r0 = r2
            goto L_0x001d
        L_0x001c:
            r0 = r3
        L_0x001d:
            if (r0 != r2) goto L_0x0021
            r0 = r2
            goto L_0x0022
        L_0x0021:
            r0 = r3
        L_0x0022:
            if (r0 == 0) goto L_0x00ca
            net.safemoon.androidwallet.MyApplicationClass r0 = net.safemoon.androidwallet.MyApplicationClass.m64669c()
            java.lang.String r4 = r11.f42489KA
            java.lang.String r5 = p000.C9377u.m72500e(r0, r4)
            if (r5 == 0) goto L_0x0046
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r6 = "|"
            java.lang.String r7 = " "
            java.lang.String r0 = p000.yb6.m74332I(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x0046
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.m63090V0(r0)
            java.lang.String r0 = r0.toString()
            goto L_0x0047
        L_0x0046:
            r0 = r1
        L_0x0047:
            net.safemoon.androidwallet.common.MyCoinType$a r4 = net.safemoon.androidwallet.common.MyCoinType.Companion
            wallet.core.jni.CoinType r4 = r4.mo57077a(r12)
            if (r0 == 0) goto L_0x005b
            int r5 = r0.length()
            if (r5 <= 0) goto L_0x0057
            r5 = r2
            goto L_0x0058
        L_0x0057:
            r5 = r3
        L_0x0058:
            if (r5 != r2) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            if (r2 == 0) goto L_0x00b5
            boolean r2 = wallet.core.jni.Mnemonic.isValid(r0)
            if (r2 == 0) goto L_0x00b5
            net.safemoon.androidwallet.utils.Common r2 = net.safemoon.androidwallet.utils.Common.f42577a
            java.util.Map r3 = r2.mo60901g()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            java.lang.Object r3 = r3.get(r5)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x0084
            java.lang.Long r5 = r11.f42490id
            p000.vx2.m53588d(r5)
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0084
            return r5
        L_0x0084:
            wallet.core.jni.HDWallet r5 = new wallet.core.jni.HDWallet
            java.lang.String r6 = ""
            r5.<init>((java.lang.String) r0, (java.lang.String) r6)
            if (r4 == 0) goto L_0x00e1
            if (r3 != 0) goto L_0x0094
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
        L_0x0094:
            java.lang.Long r0 = r11.f42490id
            p000.vx2.m53588d(r0)
            java.lang.String r1 = r5.getAddressForCoin(r4)
            java.lang.String r6 = "hdWallet.getAddressForCoin(coinType)"
            p000.vx2.m53590f(r1, r6)
            r3.put(r0, r1)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.util.Map r0 = r2.mo60901g()
            r0.put(r12, r3)
            java.lang.String r12 = r5.getAddressForCoin(r4)
            return r12
        L_0x00b5:
            if (r4 == 0) goto L_0x00e1
            net.safemoon.androidwallet.MyApplicationClass r12 = net.safemoon.androidwallet.MyApplicationClass.m64669c()
            java.lang.String r0 = r11.privateKey
            java.lang.String r12 = p000.C9377u.m72499d(r12, r0)
            cw0 r12 = p000.cw0.create((java.lang.String) r12)
            java.lang.String r12 = r12.getAddress()
            return r12
        L_0x00ca:
            java.lang.Integer r12 = r11.myCoinType
            if (r12 == 0) goto L_0x00e1
            net.safemoon.androidwallet.MyApplicationClass r12 = net.safemoon.androidwallet.MyApplicationClass.m64669c()
            java.lang.String r0 = r11.privateKey
            java.lang.String r12 = p000.C9377u.m72499d(r12, r0)
            cw0 r12 = p000.cw0.create((java.lang.String) r12)
            java.lang.String r12 = r12.getAddress()
            return r12
        L_0x00e1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.wallets.Wallet.getAddress(int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        if ((r3.length() > 0) == true) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getPrivateKey(int r13) {
        /*
            r12 = this;
            net.safemoon.androidwallet.utils.Common r0 = net.safemoon.androidwallet.utils.Common.f42577a
            java.util.Map r1 = r0.mo60909p()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r1.get(r2)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0020
            java.lang.Long r2 = r12.f42490id
            p000.vx2.m53588d(r2)
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0020
            return r2
        L_0x0020:
            if (r1 != 0) goto L_0x0027
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L_0x0027:
            boolean r2 = r12.isEvmCapacity(r13)
            java.lang.String r3 = "privateKeyDecrypted"
            if (r2 == 0) goto L_0x0050
            net.safemoon.androidwallet.MyApplicationClass r2 = net.safemoon.androidwallet.MyApplicationClass.m64669c()
            java.lang.String r4 = r12.privateKey
            java.lang.String r2 = p000.C9377u.m72499d(r2, r4)
            java.lang.Long r4 = r12.f42490id
            p000.vx2.m53588d(r4)
            p000.vx2.m53590f(r2, r3)
            r1.put(r4, r2)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.Map r0 = r0.mo60909p()
            r0.put(r13, r1)
            return r2
        L_0x0050:
            java.lang.Integer r2 = r12.myCoinType
            if (r2 != 0) goto L_0x00d9
            java.lang.String r2 = r12.f42489KA
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0067
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0062
            r2 = r4
            goto L_0x0063
        L_0x0062:
            r2 = r5
        L_0x0063:
            if (r2 != r4) goto L_0x0067
            r2 = r4
            goto L_0x0068
        L_0x0067:
            r2 = r5
        L_0x0068:
            if (r2 == 0) goto L_0x00d9
            net.safemoon.androidwallet.MyApplicationClass r2 = net.safemoon.androidwallet.MyApplicationClass.m64669c()
            java.lang.String r3 = r12.f42489KA
            java.lang.String r6 = p000.C9377u.m72500e(r2, r3)
            r2 = 0
            if (r6 == 0) goto L_0x008d
            r9 = 0
            r10 = 4
            r11 = 0
            java.lang.String r7 = "|"
            java.lang.String r8 = " "
            java.lang.String r3 = p000.yb6.m74332I(r6, r7, r8, r9, r10, r11)
            if (r3 == 0) goto L_0x008d
            java.lang.CharSequence r3 = kotlin.text.StringsKt__StringsKt.m63090V0(r3)
            java.lang.String r3 = r3.toString()
            goto L_0x008e
        L_0x008d:
            r3 = r2
        L_0x008e:
            if (r3 == 0) goto L_0x009c
            int r6 = r3.length()
            if (r6 <= 0) goto L_0x0098
            r6 = r4
            goto L_0x0099
        L_0x0098:
            r6 = r5
        L_0x0099:
            if (r6 != r4) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r4 = r5
        L_0x009d:
            if (r4 == 0) goto L_0x00d8
            boolean r4 = wallet.core.jni.Mnemonic.isValid(r3)
            if (r4 == 0) goto L_0x00d8
            net.safemoon.androidwallet.common.MyCoinType$a r4 = net.safemoon.androidwallet.common.MyCoinType.Companion
            wallet.core.jni.CoinType r4 = r4.mo57077a(r13)
            wallet.core.jni.HDWallet r6 = new wallet.core.jni.HDWallet
            java.lang.String r7 = ""
            r6.<init>((java.lang.String) r3, (java.lang.String) r7)
            if (r4 == 0) goto L_0x00d8
            wallet.core.jni.PrivateKey r2 = r6.getKeyForCoin(r4)
            byte[] r2 = r2.data()
            java.lang.String r3 = "hdWallet.getKeyForCoin(coinType).data()"
            p000.vx2.m53590f(r2, r3)
            java.lang.String r2 = p000.ol0.m70356e0(r2, r5)
            java.lang.Long r3 = r12.f42490id
            p000.vx2.m53588d(r3)
            r1.put(r3, r2)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.Map r0 = r0.mo60909p()
            r0.put(r13, r1)
        L_0x00d8:
            return r2
        L_0x00d9:
            net.safemoon.androidwallet.MyApplicationClass r2 = net.safemoon.androidwallet.MyApplicationClass.m64669c()
            java.lang.String r4 = r12.privateKey
            java.lang.String r2 = p000.C9377u.m72499d(r2, r4)
            java.lang.Long r4 = r12.f42490id
            p000.vx2.m53588d(r4)
            p000.vx2.m53590f(r2, r3)
            r1.put(r4, r2)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.Map r0 = r0.mo60909p()
            r0.put(r13, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.wallets.Wallet.getPrivateKey(int):java.lang.String");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Wallet(java.lang.Long r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, int r26, boolean r27, java.lang.Integer r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r17
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r22
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r10 = r2
            goto L_0x001b
        L_0x0019:
            r10 = r23
        L_0x001b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0021
            r11 = r2
            goto L_0x0023
        L_0x0021:
            r11 = r24
        L_0x0023:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r3 = 0
            if (r1 == 0) goto L_0x002a
            r12 = r3
            goto L_0x002c
        L_0x002a:
            r12 = r25
        L_0x002c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0032
            r13 = r3
            goto L_0x0034
        L_0x0032:
            r13 = r26
        L_0x0034:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x003a
            r14 = r3
            goto L_0x003c
        L_0x003a:
            r14 = r27
        L_0x003c:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0042
            r15 = r2
            goto L_0x0044
        L_0x0042:
            r15 = r28
        L_0x0044:
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.wallets.Wallet.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
