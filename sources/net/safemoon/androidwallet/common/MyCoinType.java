package net.safemoon.androidwallet.common;

import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.oned.Code39Reader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.abi.datatypes.Address;
import wallet.core.jni.Blockchain;
import wallet.core.jni.CoinType;
import wallet.core.jni.Curve;
import wallet.core.jni.HDVersion;
import wallet.core.jni.HRP;
import wallet.core.jni.PrivateKey;
import wallet.core.jni.PublicKey;
import wallet.core.jni.Purpose;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001,B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3¨\u00064"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/MyCoinType;", "", "", "value", "Lwallet/core/jni/CoinType;", "getCoinType", "Lwallet/core/jni/Blockchain;", "blockchain", "Lwallet/core/jni/Purpose;", "purpose", "Lwallet/core/jni/Curve;", "curve", "Lwallet/core/jni/HDVersion;", "xpubVersion", "xprvVersion", "Lwallet/core/jni/HRP;", "hrp", "", "p2pkhPrefix", "p2shPrefix", "staticPrefix", "slip44Id", "", "address", "", "validate", "derivationPath", "Lwallet/core/jni/PrivateKey;", "privateKey", "deriveAddress", "Lwallet/core/jni/PublicKey;", "publicKey", "deriveAddressFromPublicKey", "I", "getValue", "()I", "Lnet/safemoon/androidwallet/common/SimilarTypeGroup;", "similarTypeGroup", "Lnet/safemoon/androidwallet/common/SimilarTypeGroup;", "getSimilarTypeGroup", "()Lnet/safemoon/androidwallet/common/SimilarTypeGroup;", "<init>", "(Ljava/lang/String;IILnet/safemoon/androidwallet/common/SimilarTypeGroup;)V", "Companion", "a", "BITCOIN", "DOGECOIN", "SOLANA", "ETHEREUM", "SMARTCHAIN", "POLYGON", "MY_AVALANCHE", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MyCoinType.kt */
public enum MyCoinType {
    BITCOIN(0, r1),
    DOGECOIN(3, r1),
    SOLANA(501, r1),
    ETHEREUM(60, r1),
    SMARTCHAIN(20000714, r1),
    POLYGON(966, r1),
    MY_AVALANCHE(60, r1);
    
    public static final C8245a Companion = null;
    private final SimilarTypeGroup similarTypeGroup;
    private final int value;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/MyCoinType$a;", "", "", "value", "Lnet/safemoon/androidwallet/common/MyCoinType;", "b", "Lwallet/core/jni/CoinType;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.common.MyCoinType$a */
    /* compiled from: MyCoinType.kt */
    public static final class C8245a {
        public C8245a() {
        }

        public /* synthetic */ C8245a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CoinType mo57077a(int i) {
            switch (i) {
                case 0:
                    return CoinType.BITCOIN;
                case 2:
                    return CoinType.LITECOIN;
                case 3:
                    return CoinType.DOGECOIN;
                case 5:
                    return CoinType.DASH;
                case 14:
                    return CoinType.VIACOIN;
                case 17:
                    return CoinType.GROESTLCOIN;
                case 20:
                    return CoinType.DIGIBYTE;
                case 22:
                    return CoinType.MONACOIN;
                case 42:
                    return CoinType.DECRED;
                case 60:
                    return CoinType.ETHEREUM;
                case 61:
                    return CoinType.ETHEREUMCLASSIC;
                case 74:
                    return CoinType.ICON;
                case 118:
                    return CoinType.COSMOS;
                case 133:
                    return CoinType.ZCASH;
                case 144:
                    return CoinType.XRP;
                case 145:
                    return CoinType.BITCOINCASH;
                case Code39Reader.ASTERISK_ENCODING:
                    return CoinType.STELLAR;
                case 156:
                    return CoinType.BITCOINGOLD;
                case 165:
                    return CoinType.NANO;
                case 175:
                    return CoinType.RAVENCOIN;
                case 178:
                    return CoinType.POANETWORK;
                case 194:
                    return CoinType.EOS;
                case 195:
                    return CoinType.TRON;
                case 235:
                    return CoinType.FIO;
                case 242:
                    return CoinType.NIMIQ;
                case 283:
                    return CoinType.ALGORAND;
                case 304:
                    return CoinType.IOTEX;
                case 313:
                    return CoinType.ZILLIQA;
                case 330:
                    return CoinType.TERRA;
                case 354:
                    return CoinType.POLKADOT;
                case 397:
                    return CoinType.NEAR;
                case 425:
                    return CoinType.AION;
                case 434:
                    return CoinType.KUSAMA;
                case 457:
                    return CoinType.AETERNITY;
                case 459:
                    return CoinType.KAVA;
                case 461:
                    return CoinType.FILECOIN;
                case 474:
                    return CoinType.OASIS;
                case 494:
                    return CoinType.BANDCHAIN;
                case 500:
                    return CoinType.THETA;
                case 501:
                    return CoinType.SOLANA;
                case 508:
                    return CoinType.ELROND;
                case 714:
                    return CoinType.BINANCE;
                case 818:
                    return CoinType.VECHAIN;
                case 820:
                    return CoinType.CALLISTO;
                case 888:
                    return CoinType.NEO;
                case 889:
                    return CoinType.TOMOCHAIN;
                case 966:
                    return CoinType.POLYGON;
                case 1001:
                    return CoinType.THUNDERTOKEN;
                case 1023:
                    return CoinType.HARMONY;
                case RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE:
                    return CoinType.ONTOLOGY;
                case 1729:
                    return CoinType.TEZOS;
                case 1815:
                    return CoinType.CARDANO;
                case 2017:
                    return CoinType.KIN;
                case 2301:
                    return CoinType.QTUM;
                case 2718:
                    return CoinType.NEBULAS;
                case 6060:
                    return CoinType.GOCHAIN;
                case 8964:
                    return CoinType.NULS;
                case 19167:
                    return CoinType.ZELCASH;
                case 5718350:
                    return CoinType.WANCHAIN;
                case 5741564:
                    return CoinType.WAVES;
                case 10000714:
                    return CoinType.SMARTCHAINLEGACY;
                case 20000714:
                    return CoinType.SMARTCHAIN;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public final MyCoinType mo57078b(int i) {
            boolean z;
            for (MyCoinType myCoinType : MyCoinType.values()) {
                if (myCoinType.getValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return myCoinType;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C8245a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    MyCoinType(int i, SimilarTypeGroup similarTypeGroup2) {
        this.value = i;
        this.similarTypeGroup = similarTypeGroup2;
    }

    public final Blockchain blockchain() {
        Blockchain blockchain = getCoinType().blockchain();
        vx2.m53590f(blockchain, "getCoinType().blockchain()");
        return blockchain;
    }

    public final Curve curve() {
        Curve curve = getCoinType().curve();
        vx2.m53590f(curve, "getCoinType().curve()");
        return curve;
    }

    public final String derivationPath() {
        String derivationPath = getCoinType().derivationPath();
        vx2.m53590f(derivationPath, "getCoinType().derivationPath()");
        return derivationPath;
    }

    public final String deriveAddress(PrivateKey privateKey) {
        vx2.m53591g(privateKey, "privateKey");
        String deriveAddress = getCoinType().deriveAddress(privateKey);
        vx2.m53590f(deriveAddress, "getCoinType().deriveAddress(privateKey)");
        return deriveAddress;
    }

    public final String deriveAddressFromPublicKey(PublicKey publicKey) {
        vx2.m53591g(publicKey, "publicKey");
        String deriveAddressFromPublicKey = getCoinType().deriveAddressFromPublicKey(publicKey);
        vx2.m53590f(deriveAddressFromPublicKey, "getCoinType().deriveAddr…sFromPublicKey(publicKey)");
        return deriveAddressFromPublicKey;
    }

    public final CoinType getCoinType() {
        CoinType createFromValue = CoinType.createFromValue(this.value);
        vx2.m53590f(createFromValue, "createFromValue(value)");
        return createFromValue;
    }

    public final SimilarTypeGroup getSimilarTypeGroup() {
        return this.similarTypeGroup;
    }

    public final int getValue() {
        return this.value;
    }

    public final HRP hrp() {
        HRP hrp = getCoinType().hrp();
        vx2.m53590f(hrp, "getCoinType().hrp()");
        return hrp;
    }

    public final byte p2pkhPrefix() {
        return getCoinType().p2pkhPrefix();
    }

    public final byte p2shPrefix() {
        return getCoinType().p2shPrefix();
    }

    public final Purpose purpose() {
        Purpose purpose = getCoinType().purpose();
        vx2.m53590f(purpose, "getCoinType().purpose()");
        return purpose;
    }

    public final int slip44Id() {
        return getCoinType().slip44Id();
    }

    public final byte staticPrefix() {
        return getCoinType().staticPrefix();
    }

    public final boolean validate(String str) {
        vx2.m53591g(str, Address.TYPE_NAME);
        return getCoinType().validate(str);
    }

    public int value() {
        return this.value;
    }

    public final HDVersion xprvVersion() {
        HDVersion xprvVersion = getCoinType().xprvVersion();
        vx2.m53590f(xprvVersion, "getCoinType().xprvVersion()");
        return xprvVersion;
    }

    public final HDVersion xpubVersion() {
        HDVersion xpubVersion = getCoinType().xpubVersion();
        vx2.m53590f(xpubVersion, "getCoinType().xpubVersion()");
        return xpubVersion;
    }
}
