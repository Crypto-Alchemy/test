package p000;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin;
import net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Dogecoin;
import net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM;
import net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana;
import org.web3j.abi.datatypes.Address;
import p000.mo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo44877d2 = {"La14;", "", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "", "contractAddress", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Ljava/math/BigInteger;", "a", "(Lnet/safemoon/androidwallet/common/TokenType;Ljava/lang/String;Lnet/safemoon/androidwallet/model/wallets/Wallet;Lns0;)Ljava/lang/Object;", "address", "", "b", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: a14 */
/* compiled from: MyBlockChainMethods.kt */
public final class a14 {

    /* renamed from: a */
    public static final a14 f36348a = new a14();

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: a14$a */
    /* compiled from: MyBlockChainMethods.kt */
    public /* synthetic */ class C6790a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36349a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f36350b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                net.safemoon.androidwallet.common.TokenType[] r0 = net.safemoon.androidwallet.common.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                net.safemoon.androidwallet.common.TokenType r2 = net.safemoon.androidwallet.common.TokenType.SOLANA     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                net.safemoon.androidwallet.common.TokenType r3 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_BITCOIN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.common.TokenType r3 = net.safemoon.androidwallet.common.TokenType.MULTI_COIN_DOGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f36349a = r0
                net.safemoon.androidwallet.common.SimilarTypeGroup[] r0 = net.safemoon.androidwallet.common.SimilarTypeGroup.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.common.SimilarTypeGroup r3 = net.safemoon.androidwallet.common.SimilarTypeGroup.EVM_CAPABILITY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                net.safemoon.androidwallet.common.SimilarTypeGroup r1 = net.safemoon.androidwallet.common.SimilarTypeGroup.NON_EVM_CAPABILITY     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f36350b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.a14.C6790a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final Object mo50041a(TokenType tokenType, String str, Wallet wallet2, ns0<? super BigInteger> ns0) throws Exception {
        int i = C6790a.f36350b[tokenType.getCoinType().getSimilarTypeGroup().ordinal()];
        if (i == 1) {
            return new EVM(tokenType, wallet2).mo56295f(str, ns0);
        }
        if (i == 2) {
            int i2 = C6790a.f36349a[tokenType.ordinal()];
            if (i2 == 1) {
                return new Solana(tokenType, wallet2).mo56295f(str, ns0);
            }
            if (i2 == 2) {
                return mo2.C7906a.m64365b(new Bitcoin(tokenType, wallet2), (String) null, ns0, 1, (Object) null);
            }
            if (i2 == 3) {
                return mo2.C7906a.m64365b(new Dogecoin(tokenType, wallet2), (String) null, ns0, 1, (Object) null);
            }
            throw new Exception("Seems like invalid request");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final boolean mo50042b(TokenType tokenType, String str) {
        vx2.m53591g(tokenType, "tokenType");
        vx2.m53591g(str, Address.TYPE_NAME);
        return tokenType.getCoinType().validate(str);
    }
}
