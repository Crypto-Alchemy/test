package p000;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.BalanceByBlock;
import net.safemoon.androidwallet.model.EthBasGasPrice;
import net.safemoon.androidwallet.model.EthGasPrice;
import net.safemoon.androidwallet.model.ReceiptStatus;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BlockChainTransactionList;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BtcTxDetails;
import net.safemoon.androidwallet.model.rpc2.doge.details.DogeTxDetails;
import net.safemoon.androidwallet.model.rpc2.doge.transaction.DogeTxList;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaTokenMeta;
import net.safemoon.androidwallet.model.transaction.history.SolNativeModel;
import net.safemoon.androidwallet.model.transaction.history.SolSplModel;
import net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel;
import net.safemoon.androidwallet.model.transaction.solana.SolStatus;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'Je\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH'¢\u0006\u0004\b\u0011\u0010\u0012Jo\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH'¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u001bJ&\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J&\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010\u00042\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0003\u0010\u0018\u001a\u00020\u0002H'J.\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J8\u0010'\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\"\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00042\b\b\u0001\u0010)\u001a\u00020\u00022\b\b\u0003\u0010\u0018\u001a\u00020\u0002H'J6\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\u0017\u001a\u00020\n2\b\b\u0003\u0010,\u001a\u00020\u0002H'J\"\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u0018\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00042\b\b\u0001\u00101\u001a\u00020\u0002H'J\u0018\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00042\b\b\u0001\u00101\u001a\u00020\u0002H'¨\u00066"}, mo44877d2 = {"Li30;", "", "", "apikey", "Lk90;", "Lnet/safemoon/androidwallet/model/EthGasPrice;", "b", "Lnet/safemoon/androidwallet/model/EthBasGasPrice;", "getGasPrice", "address", "", "page", "offset", "sort", "startblock", "endblock", "Lnet/safemoon/androidwallet/model/transaction/history/TransactionHistoryModel;", "h", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;II)Lk90;", "contractaddress", "g", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lk90;", "account", "limit", "token", "Lnet/safemoon/androidwallet/model/transaction/history/SolNativeModel;", "k", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lk90;", "Lnet/safemoon/androidwallet/model/transaction/history/SolSplModel;", "i", "txhash", "Lnet/safemoon/androidwallet/model/ReceiptStatus;", "a", "signature", "Lnet/safemoon/androidwallet/model/transaction/solana/SolStatus;", "f", "blockno", "Lnet/safemoon/androidwallet/model/BalanceByBlock;", "n", "d", "o", "tokenAddress", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaTokenMeta;", "e", "format", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BlockChainTransactionList;", "j", "Lnet/safemoon/androidwallet/model/rpc2/doge/transaction/DogeTxList;", "c", "txHash", "Lnet/safemoon/androidwallet/model/rpc2/doge/details/DogeTxDetails;", "m", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BtcTxDetails;", "l", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: i30 */
/* compiled from: BlockChainInterface.kt */
public interface i30 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: i30$a */
    /* compiled from: BlockChainInterface.kt */
    public static final class C7204a {
        /* renamed from: a */
        public static /* synthetic */ k90 m58792a(i30 i30, String str, int i, int i2, String str2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 2) != 0) {
                    i = 0;
                }
                if ((i3 & 4) != 0) {
                    i2 = 50;
                }
                if ((i3 & 8) != 0) {
                    str2 = "json";
                }
                return i30.mo52388j(str, i, i2, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBlockchainTransactionList");
        }

        /* renamed from: b */
        public static /* synthetic */ k90 m58793b(i30 i30, String str, Integer num, Integer num2, String str2, String str3, int i, int i2, int i3, Object obj) {
            Integer num3;
            Integer num4;
            String str4;
            int i4;
            int i5;
            if (obj == null) {
                if ((i3 & 2) != 0) {
                    num3 = 1;
                } else {
                    num3 = num;
                }
                if ((i3 & 4) != 0) {
                    num4 = 100;
                } else {
                    num4 = num2;
                }
                if ((i3 & 16) != 0) {
                    str4 = "desc";
                } else {
                    str4 = str3;
                }
                if ((i3 & 32) != 0) {
                    i4 = 0;
                } else {
                    i4 = i;
                }
                if ((i3 & 64) != 0) {
                    i5 = 999999999;
                } else {
                    i5 = i2;
                }
                return i30.mo52386h(str, num3, num4, str2, str4, i4, i5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNativeTransactionData");
        }

        /* renamed from: c */
        public static /* synthetic */ k90 m58794c(i30 i30, String str, Integer num, Integer num2, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    num = 10;
                }
                if ((i & 4) != 0) {
                    num2 = 0;
                }
                if ((i & 8) != 0) {
                    str2 = C9384u3.f44868j;
                    vx2.m53590f(str2, "API_KEY_SOLANA_EXPLORER");
                }
                return i30.mo52389k(str, num, num2, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSolNativeTransactionData");
        }

        /* renamed from: d */
        public static /* synthetic */ k90 m58795d(i30 i30, String str, Integer num, Integer num2, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    num = 10;
                }
                if ((i & 4) != 0) {
                    num2 = 0;
                }
                if ((i & 8) != 0) {
                    str2 = C9384u3.f44868j;
                    vx2.m53590f(str2, "API_KEY_SOLANA_EXPLORER");
                }
                return i30.mo52387i(str, num, num2, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSolTransactionData");
        }

        /* renamed from: e */
        public static /* synthetic */ k90 m58796e(i30 i30, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = C9384u3.f44868j;
                    vx2.m53590f(str2, "API_KEY_SOLANA_EXPLORER");
                }
                return i30.mo52383f(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSolTransactionStatus");
        }

        /* renamed from: f */
        public static /* synthetic */ k90 m58797f(i30 i30, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = C9384u3.f44868j;
                    vx2.m53590f(str2, "API_KEY_SOLANA_EXPLORER");
                }
                return i30.mo52382e(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSolanaTokenInfo");
        }

        /* renamed from: g */
        public static /* synthetic */ k90 m58798g(i30 i30, String str, Integer num, Integer num2, String str2, String str3, String str4, int i, int i2, int i3, Object obj) {
            Integer num3;
            Integer num4;
            String str5;
            int i4;
            int i5;
            int i6 = i3;
            if (obj == null) {
                if ((i6 & 2) != 0) {
                    num3 = 1;
                } else {
                    num3 = num;
                }
                if ((i6 & 4) != 0) {
                    num4 = 100;
                } else {
                    num4 = num2;
                }
                if ((i6 & 32) != 0) {
                    str5 = "desc";
                } else {
                    str5 = str4;
                }
                if ((i6 & 64) != 0) {
                    i4 = 0;
                } else {
                    i4 = i;
                }
                if ((i6 & 128) != 0) {
                    i5 = 999999999;
                } else {
                    i5 = i2;
                }
                return i30.mo52384g(str, num3, num4, str2, str3, str5, i4, i5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransactionData");
        }
    }

    @le2("/api?module=transaction&action=gettxreceiptstatus")
    /* renamed from: a */
    k90<ReceiptStatus> mo52378a(@sz4("txhash") String str, @sz4("apikey") String str2);

    @le2("/api?module=gastracker&action=gasoracle")
    @rl2({"Cache-Control: no-cache"})
    /* renamed from: b */
    k90<EthGasPrice> mo52379b(@sz4("apikey") String str);

    @le2("/api/v1/address/transactions/{address}/{page}")
    /* renamed from: c */
    k90<DogeTxList> mo52380c(@sm4("address") String str, @sm4("page") int i);

    @le2("/api?module=account&action=tokenbalancehistory")
    /* renamed from: d */
    k90<BalanceByBlock> mo52381d(@sz4("contractaddress") String str, @sz4("address") String str2, @sz4("blockno") String str3, @sz4("apikey") String str4);

    @le2("/token/meta")
    /* renamed from: e */
    k90<SolanaTokenMeta> mo52382e(@sz4("tokenAddress") String str, @nl2("token") String str2);

    @le2("/transaction/{signature}")
    /* renamed from: f */
    k90<SolStatus> mo52383f(@sm4("signature") String str, @nl2("token") String str2);

    @le2("/api?module=account&action=tokentx")
    /* renamed from: g */
    k90<TransactionHistoryModel> mo52384g(@sz4("address") String str, @sz4("page") Integer num, @sz4("offset") Integer num2, @sz4("apikey") String str2, @sz4("contractaddress") String str3, @sz4("sort") String str4, @sz4("startblock") int i, @sz4("endblock") int i2);

    @le2("/api?module=proxy&action=eth_gasPrice")
    @rl2({"Cache-Control: no-cache"})
    k90<EthBasGasPrice> getGasPrice(@sz4("apikey") String str);

    @le2("/api?module=account&action=txlist&startblock=0&endblock=99999999")
    /* renamed from: h */
    k90<TransactionHistoryModel> mo52386h(@sz4("address") String str, @sz4("page") Integer num, @sz4("offset") Integer num2, @sz4("apikey") String str2, @sz4("sort") String str3, @sz4("startblock") int i, @sz4("endblock") int i2);

    @le2("/account/splTransfers")
    /* renamed from: i */
    k90<SolSplModel> mo52387i(@sz4("account") String str, @sz4("limit") Integer num, @sz4("offset") Integer num2, @nl2("token") String str2);

    @le2("/address/{address}")
    /* renamed from: j */
    k90<BlockChainTransactionList> mo52388j(@sm4("address") String str, @sz4("offset") int i, @sz4("limit") int i2, @sz4("format") String str2);

    @le2("/account/solTransfers")
    /* renamed from: k */
    k90<SolNativeModel> mo52389k(@sz4("account") String str, @sz4("limit") Integer num, @sz4("offset") Integer num2, @nl2("token") String str2);

    @le2("/rawtx/{txHash}")
    /* renamed from: l */
    k90<BtcTxDetails> mo52390l(@sm4("txHash") String str);

    @le2("/api/v1/transaction/{txHash}")
    /* renamed from: m */
    k90<DogeTxDetails> mo52391m(@sm4("txHash") String str);

    @le2("/api?module=account&action=balancehistory")
    /* renamed from: n */
    k90<BalanceByBlock> mo52392n(@sz4("address") String str, @sz4("blockno") String str2, @sz4("apikey") String str3);

    @le2("/api?module=account&action=tokentx&page=1&offset=20")
    /* renamed from: o */
    k90<TransactionHistoryModel> mo52393o(@sz4("contractaddress") String str, @sz4("apikey") String str2);
}
