package p000;

import com.google.gson.JsonObject;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.AllCryptoList;
import net.safemoon.androidwallet.model.MoonPaySignURL;
import net.safemoon.androidwallet.model.blackListAddress.BlackListAddress;
import net.safemoon.androidwallet.model.blackListTokens.BlackListTokens;
import net.safemoon.androidwallet.model.fiat.gson.FiatInfor;
import net.safemoon.androidwallet.model.fiat.gson.FiatLatest;
import net.safemoon.androidwallet.model.nft.DeleteNftIdList;
import net.safemoon.androidwallet.model.nft.DeleteNfts;
import net.safemoon.androidwallet.model.swap.AllSwapTokens;
import net.safemoon.androidwallet.model.swap.BaseTokens;
import net.safemoon.androidwallet.model.swap.Pairs;
import net.safemoon.androidwallet.model.swap.RequestTransferFee;
import net.safemoon.androidwallet.model.swap.TransferFee;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfoResult;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokensInfoResult;
import net.safemoon.androidwallet.model.tokensInfo.Request;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'J9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJS\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013JS\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0014\u0010\u0013JS\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0015\u0010\u0013J\u001a\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'J\u001a\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0002H'J\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u001dH'J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\b\u0001\u0010\u001e\u001a\u00020!H'J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0004H'J\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\b\b\u0001\u0010'\u001a\u00020&H'J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\b\b\u0001\u0010*\u001a\u00020\tH'J\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010*\u001a\u00020\tH'J&\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00042\b\b\u0001\u0010/\u001a\u00020\u00022\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0002H'J\u001a\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00042\b\b\u0001\u0010\u001e\u001a\u000203H'J\u0018\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\b\b\u0001\u00106\u001a\u00020\u0002H'J\u0018\u0010;\u001a\b\u0012\u0004\u0012\u0002070\u00042\b\b\u0001\u0010:\u001a\u000209H'J\u0018\u0010<\u001a\b\u0012\u0004\u0012\u0002070\u00042\b\b\u0001\u0010:\u001a\u000209H'¨\u0006="}, mo44877d2 = {"Lho3;", "", "", "ids", "Lk90;", "Lcom/google/gson/JsonObject;", "b", "symbols", "c", "", "start", "limit", "convert", "Lnet/safemoon/androidwallet/model/AllCryptoList;", "g", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lk90;", "sort", "sort_dir", "p", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lk90;", "k", "d", "Lnet/safemoon/androidwallet/model/fiat/gson/FiatInfor;", "f", "Lnet/safemoon/androidwallet/model/fiat/gson/FiatLatest;", "m", "originalUrl", "Lnet/safemoon/androidwallet/model/MoonPaySignURL;", "n", "Lnet/safemoon/androidwallet/model/blackListTokens/Request;", "listOfAddress", "Lnet/safemoon/androidwallet/model/blackListTokens/BlackListTokens;", "q", "Lnet/safemoon/androidwallet/model/blackListAddress/Request;", "Lnet/safemoon/androidwallet/model/blackListAddress/BlackListAddress;", "h", "Lnet/safemoon/androidwallet/model/swap/AllSwapTokens;", "r", "Lnet/safemoon/androidwallet/model/swap/RequestTransferFee;", "request", "Lnet/safemoon/androidwallet/model/swap/TransferFee;", "s", "chainId", "Lnet/safemoon/androidwallet/model/swap/Pairs;", "j", "Lnet/safemoon/androidwallet/model/swap/BaseTokens;", "t", "tokenAddress", "pairAddress", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfoResult;", "i", "Lnet/safemoon/androidwallet/model/tokensInfo/Request;", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokensInfoResult;", "e", "walletAddress", "Lnet/safemoon/androidwallet/model/nft/DeleteNfts;", "a", "Lnet/safemoon/androidwallet/model/nft/DeleteNftIdList;", "deleteNftIdList", "l", "o", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ho3 */
/* compiled from: MarketDataAPIInterface.kt */
public interface ho3 {
    @le2("/api/nft/delete-nfts")
    /* renamed from: a */
    k90<DeleteNfts> mo52272a(@sz4("walletAddress") String str);

    @le2("/api/cryptocurrency/v7/quotes/latest?")
    /* renamed from: b */
    k90<JsonObject> mo52273b(@sz4("ids") String str);

    @le2("/api/cryptocurrency/v3/quotes/latest?")
    /* renamed from: c */
    k90<JsonObject> mo52274c(@sz4("symbols") String str);

    @le2("/api/cryptocurrency/listings/looser?")
    /* renamed from: d */
    k90<AllCryptoList> mo52275d(@sz4("start") Integer num, @sz4("limit") Integer num2, @sz4("convert") String str, @sz4("sortType") String str2, @sz4("sort_dir") String str3);

    @ak4("/api/cryptocurrency/tokens-info?")
    /* renamed from: e */
    k90<CurrencyTokensInfoResult> mo52276e(@p30 Request request);

    @le2("/api/exchange/infor?")
    /* renamed from: f */
    k90<FiatInfor> mo52277f(@sz4("symbols") String str);

    @le2("/api/cryptocurrency/listings/latest?")
    /* renamed from: g */
    k90<AllCryptoList> mo52278g(@sz4("start") Integer num, @sz4("limit") Integer num2, @sz4("convert") String str);

    @ak4("/api/swap/check-walletaddress-blacklist")
    /* renamed from: h */
    k90<BlackListAddress> mo52279h(@p30 net.safemoon.androidwallet.model.blackListAddress.Request request);

    @le2("/api/cryptocurrency/token-info?")
    /* renamed from: i */
    k90<CurrencyTokenInfoResult> mo52280i(@sz4("tokenAddress") String str, @sz4("pairAddress") String str2);

    @le2("/api/pair/v5/list")
    /* renamed from: j */
    k90<Pairs> mo52281j(@sz4("chainId") int i);

    @le2("/api/cryptocurrency/listings/gainer?")
    /* renamed from: k */
    k90<AllCryptoList> mo52282k(@sz4("start") Integer num, @sz4("limit") Integer num2, @sz4("convert") String str, @sz4("sortType") String str2, @sz4("sort_dir") String str3);

    @ak4("/api/nft/delete-nfts")
    /* renamed from: l */
    k90<DeleteNfts> mo52283l(@p30 DeleteNftIdList deleteNftIdList);

    @le2("/api/exchange/latest?")
    /* renamed from: m */
    k90<FiatLatest> mo52284m(@sz4("symbols") String str);

    @z72
    @ak4("/api/moonpay/sign-moonpay")
    /* renamed from: n */
    k90<MoonPaySignURL> mo52285n(@e02("originalUrl") String str);

    @ak4("/api/nft/putback-nfts")
    /* renamed from: o */
    k90<DeleteNfts> mo52286o(@p30 DeleteNftIdList deleteNftIdList);

    @le2("/api/cryptocurrency/listings/recent?")
    /* renamed from: p */
    k90<AllCryptoList> mo52287p(@sz4("start") Integer num, @sz4("limit") Integer num2, @sz4("convert") String str, @sz4("sort") String str2, @sz4("sort_dir") String str3);

    @ak4("/api/swap/check-token-blacklist")
    /* renamed from: q */
    k90<BlackListTokens> mo52288q(@p30 net.safemoon.androidwallet.model.blackListTokens.Request request);

    @le2("/api/swap/v7/tokens")
    /* renamed from: r */
    k90<AllSwapTokens> mo52289r();

    @ak4("/api/swap/transfer-fee")
    /* renamed from: s */
    k90<TransferFee> mo52290s(@p30 RequestTransferFee requestTransferFee);

    @le2("/api/cryptocurrency/v2/base-token")
    /* renamed from: t */
    k90<BaseTokens> mo52291t(@sz4("chainId") int i);
}
