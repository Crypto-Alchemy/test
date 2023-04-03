package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.model.collectible.RoomCollection;
import net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft;
import net.safemoon.androidwallet.model.collectible.RoomNFT;
import net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT;
import net.safemoon.androidwallet.model.common.LoadingState;
import net.safemoon.androidwallet.model.nft.NFTBalance;
import net.safemoon.androidwallet.model.nft.NFTTransferResponse;
import net.safemoon.androidwallet.model.nft.NFTType;
import net.safemoon.androidwallet.model.nft.NFTTypeKt;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource;
import net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource;
import net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155;
import net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721;
import net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010 \u0001J>\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002JH\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J@\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J+\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\"\u001a\u00020!J\u000e\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#J\u0006\u0010&\u001a\u00020\fJ\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'J*\u0010-\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010*2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\bJB\u0010.\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010*2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ \u0010/\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*J7\u00104\u001a\u0004\u0018\u00010*2\b\u00101\u001a\u0004\u0018\u0001002\b\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b4\u00105J\"\u00106\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0016J.\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0'092\u0006\u00108\u001a\u0002072\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0016J\"\u0010>\u001a\u00020\f2\u001a\u0010=\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00160<0'J\"\u0010?\u001a\u00020\f2\u001a\u0010=\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00160<0'J\u0016\u0010B\u001a\u00020\f2\u0006\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u00020#J\u000e\u0010C\u001a\u00020\f2\u0006\u0010@\u001a\u00020(J\u001b\u0010D\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020F8BX\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010O\u001a\u0004\u0018\u0001008BX\u0002¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0002¢\u0006\f\n\u0004\bQ\u0010H\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0002¢\u0006\f\n\u0004\bV\u0010H\u001a\u0004\bW\u0010XR#\u0010_\u001a\n [*\u0004\u0018\u00010Z0Z8BX\u0002¢\u0006\f\n\u0004\b\\\u0010H\u001a\u0004\b]\u0010^R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020!0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR'\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0c8FX\u0002¢\u0006\f\n\u0004\bd\u0010H\u001a\u0004\be\u0010fR%\u0010l\u001a\u0010\u0012\f\u0012\n [*\u0004\u0018\u00010!0!0\b8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR.\u0010o\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( [*\n\u0012\u0004\u0012\u00020(\u0018\u00010'0'098\u0002X\u0004¢\u0006\u0006\n\u0004\bm\u0010nR%\u0010r\u001a\u0010\u0012\f\u0012\n [*\u0004\u0018\u00010#0#0\b8\u0006¢\u0006\f\n\u0004\bp\u0010i\u001a\u0004\bq\u0010kR%\u0010v\u001a\u0010\u0012\f\u0012\n [*\u0004\u0018\u00010s0s0\b8\u0006¢\u0006\f\n\u0004\bt\u0010i\u001a\u0004\bu\u0010kR#\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0w8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R#\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0w8\u0006¢\u0006\f\n\u0004\b}\u0010y\u001a\u0004\b~\u0010{R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010H\u001a\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u0012\u0012\u000e\u0012\f [*\u0005\u0018\u00010\u00010\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010i\u001a\u0005\b\u0001\u0010kR \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010i\u001a\u0005\b\u0001\u0010kR \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010i\u001a\u0005\b\u0001\u0010kR+\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b-\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b/\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R.\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\b8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0004\b\u001a\u0010i\u001a\u0005\b\u0001\u0010k\"\u0006\b\u0001\u0010\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006¡\u0001"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CollectibleViewModel;", "Lwj;", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/NFT721;", "nft721", "", "toAddress", "Ljava/math/BigInteger;", "tokenId", "Lk04;", "Lnet/safemoon/androidwallet/model/nft/NFTTransferResponse;", "callBack", "Lkotlin/Function0;", "Lr37;", "errorCallBack", "m0", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/NFT1155;", "nft1155", "amount", "k0", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/NFTSolana;", "nftSolana", "n0", "", "chainId", "limit", "offset", "u", "(IIILns0;)Ljava/lang/Object;", "", "collectionId", "slug", "v", "(IJLjava/lang/String;IILns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/common/TokenType;", "B", "", "hasHideIcon", "i0", "h0", "", "Lnet/safemoon/androidwallet/model/collectible/RoomCollectionAndNft;", "H", "Lno2;", "iNFTWeb", "Lnet/safemoon/androidwallet/model/nft/NFTBalance;", "s", "j0", "t", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "contractAddress", "schemaName", "U", "(Lnet/safemoon/androidwallet/model/wallets/Wallet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lno2;", "V", "Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "collection", "Landroidx/lifecycle/LiveData;", "Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "w", "Lkotlin/Pair;", "mapIndexed", "p0", "q0", "roomCollectionAndNft", "isHide", "R", "S", "g0", "(ILns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase;", "b", "Lef3;", "D", "()Lnet/safemoon/androidwallet/database/room/ApplicationRoomDatabase;", "db", "c", "y", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "activeWallet", "Lnet/safemoon/androidwallet/repository/dataSource/collection/CollectionDataSource;", "d", "C", "()Lnet/safemoon/androidwallet/repository/dataSource/collection/CollectionDataSource;", "collectionDataSource", "Lnet/safemoon/androidwallet/repository/dataSource/collection/NftDataSource;", "e", "M", "()Lnet/safemoon/androidwallet/repository/dataSource/collection/NftDataSource;", "nftDataSource", "Lho3;", "kotlin.jvm.PlatformType", "f", "K", "()Lho3;", "marketDataApiInterface", "g", "Ljava/util/List;", "excludeCollectible", "", "h", "A", "()Ljava/util/Map;", "collectibleCoins", "i", "Lk04;", "N", "()Lk04;", "selectChain", "j", "Landroidx/lifecycle/LiveData;", "loadCollectionsFromChain", "k", "O", "showHideIcon", "Lnet/safemoon/androidwallet/model/collectible/TYPE_DELETE_NFT;", "l", "P", "showNfts", "Lls3;", "m", "Lls3;", "I", "()Lls3;", "loadCollections", "n", "J", "loadOnlyHideCollection", "Lz57;", "o", "Q", "()Lz57;", "userTokenListDao", "Lnet/safemoon/androidwallet/model/common/LoadingState;", "p", "F", "eventLoadingStatus", "q", "E", "estimateGasLiveData", "r", "L", "maxTotalLiveData", "", "Ljava/lang/Double;", "G", "()Ljava/lang/Double;", "f0", "(Ljava/lang/Double;)V", "gasFeeNative", "z", "e0", "balanceNative", "T", "setLoading", "(Lk04;)V", "isLoading", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel extends C3552wj {

    /* renamed from: b */
    public final ef3 f42641b;

    /* renamed from: c */
    public final ef3 f42642c;

    /* renamed from: d */
    public final ef3 f42643d = C6169a.m47232a(new CollectibleViewModel$collectionDataSource$2(this));

    /* renamed from: e */
    public final ef3 f42644e = C6169a.m47232a(new CollectibleViewModel$nftDataSource$2(this));

    /* renamed from: f */
    public final ef3 f42645f = C6169a.m47232a(CollectibleViewModel$marketDataApiInterface$2.INSTANCE);

    /* renamed from: g */
    public final List<TokenType> f42646g = bk0.m32598e(TokenType.MULTI_COIN);

    /* renamed from: h */
    public final ef3 f42647h = C6169a.m47232a(new CollectibleViewModel$collectibleCoins$2(this));

    /* renamed from: i */
    public final k04<TokenType> f42648i;

    /* renamed from: j */
    public final LiveData<List<RoomCollectionAndNft>> f42649j;

    /* renamed from: k */
    public final k04<Boolean> f42650k;

    /* renamed from: l */
    public final k04<TYPE_DELETE_NFT> f42651l;

    /* renamed from: m */
    public final ls3<List<RoomCollectionAndNft>> f42652m;

    /* renamed from: n */
    public final ls3<List<RoomCollectionAndNft>> f42653n;

    /* renamed from: o */
    public final ef3 f42654o;

    /* renamed from: p */
    public final k04<LoadingState> f42655p;

    /* renamed from: q */
    public final k04<String> f42656q;

    /* renamed from: r */
    public final k04<String> f42657r;

    /* renamed from: s */
    public Double f42658s;

    /* renamed from: t */
    public Double f42659t;

    /* renamed from: u */
    public k04<Boolean> f42660u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        this.f42641b = C6169a.m47232a(new CollectibleViewModel$db$2(application));
        this.f42642c = C6169a.m47232a(new CollectibleViewModel$activeWallet$2(application));
        k04<TokenType> k04 = new k04<>(mo61033B());
        this.f42648i = k04;
        LiveData<List<RoomCollectionAndNft>> c = qw6.m25943c(k04, new zi0(this));
        vx2.m53590f(c, "switchMap(selectChain) {…ections(it.chainId)\n    }");
        this.f42649j = c;
        k04<Boolean> k042 = new k04<>(Boolean.FALSE);
        this.f42650k = k042;
        k04<TYPE_DELETE_NFT> k043 = new k04<>(TYPE_DELETE_NFT.VISIBLE);
        this.f42651l = k043;
        ls3<List<RoomCollectionAndNft>> ls3 = new ls3<>();
        ls3.mo22951a(c, new aj0(new CollectibleViewModel$loadCollections$1$1(ls3, this)));
        ls3.mo22951a(k042, new bj0(new CollectibleViewModel$loadCollections$1$2(ls3, this)));
        ls3.mo22951a(k043, new cj0(new CollectibleViewModel$loadCollections$1$3(ls3, this)));
        this.f42652m = ls3;
        ls3<List<RoomCollectionAndNft>> ls32 = new ls3<>();
        ls32.mo22951a(c, new dj0(new CollectibleViewModel$loadOnlyHideCollection$1$1(ls32, this)));
        this.f42653n = ls32;
        this.f42654o = C6169a.m47232a(new CollectibleViewModel$userTokenListDao$2(application));
        this.f42655p = new k04<>(LoadingState.Normal);
        this.f42656q = new k04<>();
        this.f42657r = new k04<>();
        this.f42660u = new k04<>();
    }

    /* renamed from: W */
    public static /* synthetic */ void m68440W(CollectibleViewModel collectibleViewModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 100;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        collectibleViewModel.mo61053V(i, i2, i3);
    }

    /* renamed from: X */
    public static final void m68441X(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m68442Y(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m68443Z(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m68444a0(ls3<List<RoomCollectionAndNft>> ls3, CollectibleViewModel collectibleViewModel) {
        boolean z;
        List value = collectibleViewModel.f42649j.getValue();
        ArrayList arrayList = null;
        if (value != null) {
            ArrayList<RoomCollectionAndNft> arrayList2 = new ArrayList<>();
            Iterator it = value.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                RoomCollectionAndNft roomCollectionAndNft = (RoomCollectionAndNft) next;
                TYPE_DELETE_NFT value2 = collectibleViewModel.f42651l.getValue();
                if (value2 != null && roomCollectionAndNft.getCollection().getTypeDeleteNft() == value2.getValue()) {
                    z2 = true;
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(dk0.m43495u(arrayList2, 10));
            for (RoomCollectionAndNft copy$default : arrayList2) {
                RoomCollectionAndNft copy$default2 = RoomCollectionAndNft.copy$default(copy$default, (RoomCollection) null, (List) null, 3, (Object) null);
                Boolean value3 = collectibleViewModel.f42650k.getValue();
                if (value3 == null) {
                    z = false;
                } else {
                    vx2.m53590f(value3, "this@CollectibleViewMode…owHideIcon.value ?: false");
                    z = value3.booleanValue();
                }
                copy$default2.setShowHideIcon(z);
                arrayList3.add(copy$default2);
            }
            arrayList = arrayList3;
        }
        ls3.postValue(arrayList);
    }

    /* renamed from: b0 */
    public static final LiveData m68445b0(CollectibleViewModel collectibleViewModel, TokenType tokenType) {
        vx2.m53591g(collectibleViewModel, "this$0");
        return collectibleViewModel.mo61034C().mo60796e(tokenType.getChainId());
    }

    /* renamed from: c0 */
    public static final void m68447c0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m68449d0(ls3<List<RoomCollectionAndNft>> ls3, CollectibleViewModel collectibleViewModel) {
        ls3.postValue(collectibleViewModel.mo61039H());
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m68458l0(CollectibleViewModel collectibleViewModel, NFT1155 nft1155, String str, BigInteger bigInteger, BigInteger bigInteger2, k04 k04, pc2 pc2, int i, Object obj) {
        if ((i & 8) != 0) {
            bigInteger2 = BigInteger.ONE;
            vx2.m53590f(bigInteger2, "ONE");
        }
        collectibleViewModel.mo61060k0(nft1155, str, bigInteger, bigInteger2, k04, pc2);
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m68462o0(CollectibleViewModel collectibleViewModel, NFTSolana nFTSolana, String str, BigInteger bigInteger, k04 k04, pc2 pc2, int i, Object obj) {
        if ((i & 4) != 0) {
            bigInteger = BigInteger.ONE;
            vx2.m53590f(bigInteger, "ONE");
        }
        collectibleViewModel.mo61062n0(nFTSolana, str, bigInteger, k04, pc2);
    }

    /* renamed from: x */
    public static /* synthetic */ LiveData m68466x(CollectibleViewModel collectibleViewModel, RoomCollection roomCollection, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 100;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return collectibleViewModel.mo61069w(roomCollection, i, i2);
    }

    /* renamed from: A */
    public final Map<String, TokenType> mo61032A() {
        return (Map) this.f42647h.getValue();
    }

    /* renamed from: B */
    public final TokenType mo61033B() {
        boolean z;
        Map<String, TokenType> A = mo61032A();
        boolean z2 = true;
        if (!A.isEmpty()) {
            Iterator<Map.Entry<String, TokenType>> it = A.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object value = it.next().getValue();
                Application b = mo27549b();
                vx2.m53590f(b, "getApplication<Application>()");
                if (value == ol0.m70357f(b)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = false;
        if (!z2) {
            return TokenType.Companion.mo57098a("BNB");
        }
        Application b2 = mo27549b();
        vx2.m53590f(b2, "getApplication<Application>()");
        return ol0.m70357f(b2);
    }

    /* renamed from: C */
    public final CollectionDataSource mo61034C() {
        return (CollectionDataSource) this.f42643d.getValue();
    }

    /* renamed from: D */
    public final ApplicationRoomDatabase mo61035D() {
        return (ApplicationRoomDatabase) this.f42641b.getValue();
    }

    /* renamed from: E */
    public final k04<String> mo61036E() {
        return this.f42656q;
    }

    /* renamed from: F */
    public final k04<LoadingState> mo61037F() {
        return this.f42655p;
    }

    /* renamed from: G */
    public final Double mo61038G() {
        return this.f42658s;
    }

    /* renamed from: H */
    public final List<RoomCollectionAndNft> mo61039H() {
        boolean z;
        List value = this.f42649j.getValue();
        if (value == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : value) {
            if (((RoomCollectionAndNft) next).getCollection().getTypeDeleteNft() == TYPE_DELETE_NFT.HIDE.getValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    public final ls3<List<RoomCollectionAndNft>> mo61040I() {
        return this.f42652m;
    }

    /* renamed from: J */
    public final ls3<List<RoomCollectionAndNft>> mo61041J() {
        return this.f42653n;
    }

    /* renamed from: K */
    public final ho3 mo61042K() {
        return (ho3) this.f42645f.getValue();
    }

    /* renamed from: L */
    public final k04<String> mo61043L() {
        return this.f42657r;
    }

    /* renamed from: M */
    public final NftDataSource mo61044M() {
        return (NftDataSource) this.f42644e.getValue();
    }

    /* renamed from: N */
    public final k04<TokenType> mo61045N() {
        return this.f42648i;
    }

    /* renamed from: O */
    public final k04<Boolean> mo61046O() {
        return this.f42650k;
    }

    /* renamed from: P */
    public final k04<TYPE_DELETE_NFT> mo61047P() {
        return this.f42651l;
    }

    /* renamed from: Q */
    public final z57 mo61048Q() {
        return (z57) this.f42654o.getValue();
    }

    /* renamed from: R */
    public final void mo61049R(RoomCollectionAndNft roomCollectionAndNft, boolean z) {
        vx2.m53591g(roomCollectionAndNft, "roomCollectionAndNft");
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CollectibleViewModel$hideCollections$1(this, roomCollectionAndNft, z, (ns0<? super CollectibleViewModel$hideCollections$1>) null), 2, (Object) null);
    }

    /* renamed from: S */
    public final void mo61050S(RoomCollectionAndNft roomCollectionAndNft) {
        vx2.m53591g(roomCollectionAndNft, "roomCollectionAndNft");
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CollectibleViewModel$hideCollectionsForever$1(this, roomCollectionAndNft, (ns0<? super CollectibleViewModel$hideCollectionsForever$1>) null), 2, (Object) null);
    }

    /* renamed from: T */
    public final k04<Boolean> mo61051T() {
        return this.f42660u;
    }

    /* renamed from: U */
    public final no2 mo61052U(Wallet wallet2, String str, String str2, Integer num) {
        NFTType nFTType;
        NFTType nFTType2;
        no2 nft721;
        if (num == null) {
            return null;
        }
        try {
            if (num.intValue() == TokenType.SOLANA.getChainId()) {
                vx2.m53588d(str);
                vx2.m53588d(wallet2);
                nft721 = new NFTSolana(str, wallet2);
            } else {
                if (str2 != null) {
                    nFTType = NFTTypeKt.toNFTType(str2);
                } else {
                    nFTType = null;
                }
                if (nFTType == NFTType.ERC1155) {
                    vx2.m53588d(str);
                    int intValue = num.intValue();
                    vx2.m53588d(wallet2);
                    nft721 = new NFT1155(str, intValue, wallet2);
                } else {
                    if (str2 != null) {
                        nFTType2 = NFTTypeKt.toNFTType(str2);
                    } else {
                        nFTType2 = null;
                    }
                    if (nFTType2 != NFTType.ERC721) {
                        return null;
                    }
                    vx2.m53588d(str);
                    int intValue2 = num.intValue();
                    vx2.m53588d(wallet2);
                    nft721 = new NFT721(str, intValue2, wallet2);
                }
            }
            return nft721;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: V */
    public final void mo61053V(int i, int i2, int i3) {
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CollectibleViewModel$loadCollections$2(this, i, i2, i3, (ns0<? super CollectibleViewModel$loadCollections$2>) null), 2, (Object) null);
    }

    /* renamed from: e0 */
    public final void mo61054e0(Double d) {
        this.f42659t = d;
    }

    /* renamed from: f0 */
    public final void mo61055f0(Double d) {
        this.f42658s = d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9 A[Catch:{ Exception -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0204 A[ADDED_TO_REGION, Catch:{ Exception -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x027c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0 A[Catch:{ Exception -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5 A[Catch:{ Exception -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8 A[Catch:{ Exception -> 0x027d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9 A[Catch:{ Exception -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9 A[Catch:{ Exception -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012e A[Catch:{ Exception -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0149 A[ADDED_TO_REGION, Catch:{ Exception -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61056g0(int r14, p000.ns0<? super p000.r37> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof net.safemoon.androidwallet.viewmodels.CollectibleViewModel$setHiddenCollections$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel$setHiddenCollections$1 r0 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel$setHiddenCollections$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel$setHiddenCollections$1 r0 = new net.safemoon.androidwallet.viewmodels.CollectibleViewModel$setHiddenCollections$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r6) goto L_0x004a
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x027d }
            goto L_0x027d
        L_0x0031:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0039:
            java.lang.Object r14 = r0.L$2
            net.safemoon.androidwallet.model.nft.DeleteNftIdList r14 = (net.safemoon.androidwallet.model.nft.DeleteNftIdList) r14
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r4 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r4
            p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x027d }
            goto L_0x00bd
        L_0x004a:
            int r14 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r7 = r0.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r7 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r7
            p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x027d }
            goto L_0x0096
        L_0x0058:
            p000.hg5.m45199b(r15)
            net.safemoon.androidwallet.model.wallets.Wallet r15 = r13.mo61070y()
            if (r15 == 0) goto L_0x027d
            java.util.List r2 = p000.ck0.m33062j()     // Catch:{ Exception -> 0x027d }
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m47313M0(r2)     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.common.TokenType$a r7 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.common.TokenType r7 = r7.mo57099b(r14)     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.common.MyCoinType r7 = r7.getCoinType()     // Catch:{ Exception -> 0x027d }
            int r7 = r7.getValue()     // Catch:{ Exception -> 0x027d }
            java.lang.String r15 = r15.getAddress(r7)     // Catch:{ Exception -> 0x027d }
            ho3 r7 = r13.mo61042K()     // Catch:{ Exception -> 0x027d }
            p000.vx2.m53588d(r15)     // Catch:{ Exception -> 0x027d }
            k90 r15 = r7.mo52272a(r15)     // Catch:{ Exception -> 0x027d }
            r0.L$0 = r13     // Catch:{ Exception -> 0x027d }
            r0.L$1 = r2     // Catch:{ Exception -> 0x027d }
            r0.I$0 = r14     // Catch:{ Exception -> 0x027d }
            r0.label = r6     // Catch:{ Exception -> 0x027d }
            java.lang.Object r15 = retrofit2.KotlinExtensions.m71521c(r15, r0)     // Catch:{ Exception -> 0x027d }
            if (r15 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r7 = r13
        L_0x0096:
            bg5 r15 = (p000.bg5) r15     // Catch:{ Exception -> 0x027d }
            java.lang.Object r15 = r15.mo50578a()     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.model.nft.DeleteNfts r15 = (net.safemoon.androidwallet.model.nft.DeleteNfts) r15     // Catch:{ Exception -> 0x027d }
            if (r15 == 0) goto L_0x00a5
            net.safemoon.androidwallet.model.nft.DeleteNftIdList r15 = r15.getData()     // Catch:{ Exception -> 0x027d }
            goto L_0x00a6
        L_0x00a5:
            r15 = r5
        L_0x00a6:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r8 = r7.mo61034C()     // Catch:{ Exception -> 0x027d }
            r0.L$0 = r7     // Catch:{ Exception -> 0x027d }
            r0.L$1 = r2     // Catch:{ Exception -> 0x027d }
            r0.L$2 = r15     // Catch:{ Exception -> 0x027d }
            r0.label = r4     // Catch:{ Exception -> 0x027d }
            java.lang.Object r14 = r8.mo60795d(r14, r0)     // Catch:{ Exception -> 0x027d }
            if (r14 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r4 = r7
            r12 = r15
            r15 = r14
            r14 = r12
        L_0x00bd:
            java.lang.Iterable r15 = (java.lang.Iterable) r15     // Catch:{ Exception -> 0x027d }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ Exception -> 0x027d }
        L_0x00c3:
            boolean r7 = r15.hasNext()     // Catch:{ Exception -> 0x027d }
            if (r7 == 0) goto L_0x026a
            java.lang.Object r7 = r15.next()     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.model.collectible.RoomCollection r7 = (net.safemoon.androidwallet.model.collectible.RoomCollection) r7     // Catch:{ Exception -> 0x027d }
            java.lang.String r8 = r7.getMarketPlace()     // Catch:{ Exception -> 0x027d }
            if (r8 == 0) goto L_0x00c3
            int r9 = r8.hashCode()     // Catch:{ Exception -> 0x027d }
            r10 = 279271610(0x10a558ba, float:6.521773E-29)
            r11 = 0
            if (r9 == r10) goto L_0x01af
            r10 = 1957750149(0x74b0e585, float:1.1212152E32)
            if (r9 == r10) goto L_0x00f3
            r10 = 2113850942(0x7dfece3e, float:4.2336848E37)
            if (r9 == r10) goto L_0x00ea
            goto L_0x00c3
        L_0x00ea:
            java.lang.String r9 = "MORALIS_SOLANA"
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x027d }
            if (r8 != 0) goto L_0x00fc
            goto L_0x00c3
        L_0x00f3:
            java.lang.String r9 = "MORALIS"
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x027d }
            if (r8 != 0) goto L_0x00fc
            goto L_0x00c3
        L_0x00fc:
            if (r14 == 0) goto L_0x012b
            java.util.ArrayList r8 = r14.getOwnerIds()     // Catch:{ Exception -> 0x027d }
            if (r8 == 0) goto L_0x012b
            boolean r9 = r8.isEmpty()     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x010c
        L_0x010a:
            r8 = r11
            goto L_0x0127
        L_0x010c:
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x027d }
        L_0x0110:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x010a
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x027d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x027d }
            java.lang.String r10 = r7.getContractAddress()     // Catch:{ Exception -> 0x027d }
            boolean r9 = p000.vx2.m53586b(r9, r10)     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x0110
            r8 = r6
        L_0x0127:
            if (r8 != r6) goto L_0x012b
            r8 = r6
            goto L_0x012c
        L_0x012b:
            r8 = r11
        L_0x012c:
            if (r8 == 0) goto L_0x0149
            kotlin.Pair r8 = new kotlin.Pair     // Catch:{ Exception -> 0x027d }
            java.lang.Long r7 = r7.getId()     // Catch:{ Exception -> 0x027d }
            p000.vx2.m53588d(r7)     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r9 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.HIDE     // Catch:{ Exception -> 0x027d }
            int r9 = r9.getValue()     // Catch:{ Exception -> 0x027d }
            java.lang.Integer r9 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x027d }
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x027d }
            r2.add(r8)     // Catch:{ Exception -> 0x027d }
            goto L_0x00c3
        L_0x0149:
            if (r14 == 0) goto L_0x0177
            java.util.ArrayList r8 = r14.getOwnerIdsForever()     // Catch:{ Exception -> 0x027d }
            if (r8 == 0) goto L_0x0177
            boolean r9 = r8.isEmpty()     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x0159
        L_0x0157:
            r8 = r11
            goto L_0x0174
        L_0x0159:
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x027d }
        L_0x015d:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x0157
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x027d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x027d }
            java.lang.String r10 = r7.getContractAddress()     // Catch:{ Exception -> 0x027d }
            boolean r9 = p000.vx2.m53586b(r9, r10)     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x015d
            r8 = r6
        L_0x0174:
            if (r8 != r6) goto L_0x0177
            r11 = r6
        L_0x0177:
            if (r11 == 0) goto L_0x0194
            kotlin.Pair r8 = new kotlin.Pair     // Catch:{ Exception -> 0x027d }
            java.lang.Long r7 = r7.getId()     // Catch:{ Exception -> 0x027d }
            p000.vx2.m53588d(r7)     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r9 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.DELETE_FOREVER     // Catch:{ Exception -> 0x027d }
            int r9 = r9.getValue()     // Catch:{ Exception -> 0x027d }
            java.lang.Integer r9 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x027d }
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x027d }
            r2.add(r8)     // Catch:{ Exception -> 0x027d }
            goto L_0x00c3
        L_0x0194:
            kotlin.Pair r8 = new kotlin.Pair     // Catch:{ Exception -> 0x027d }
            java.lang.Long r7 = r7.getId()     // Catch:{ Exception -> 0x027d }
            p000.vx2.m53588d(r7)     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r9 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.VISIBLE     // Catch:{ Exception -> 0x027d }
            int r9 = r9.getValue()     // Catch:{ Exception -> 0x027d }
            java.lang.Integer r9 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x027d }
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x027d }
            r2.add(r8)     // Catch:{ Exception -> 0x027d }
            goto L_0x00c3
        L_0x01af:
            java.lang.String r9 = "OPEN_SEA"
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x027d }
            if (r8 == 0) goto L_0x00c3
            if (r14 == 0) goto L_0x01e6
            java.util.ArrayList r8 = r14.getOwnerIds()     // Catch:{ Exception -> 0x027d }
            if (r8 == 0) goto L_0x01e6
            boolean r9 = r8.isEmpty()     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x01c7
        L_0x01c5:
            r8 = r11
            goto L_0x01e2
        L_0x01c7:
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x027d }
        L_0x01cb:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x01c5
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x027d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x027d }
            java.lang.String r10 = r7.getSlug()     // Catch:{ Exception -> 0x027d }
            boolean r9 = p000.vx2.m53586b(r9, r10)     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x01cb
            r8 = r6
        L_0x01e2:
            if (r8 != r6) goto L_0x01e6
            r8 = r6
            goto L_0x01e7
        L_0x01e6:
            r8 = r11
        L_0x01e7:
            if (r8 == 0) goto L_0x0204
            kotlin.Pair r8 = new kotlin.Pair     // Catch:{ Exception -> 0x027d }
            java.lang.Long r7 = r7.getId()     // Catch:{ Exception -> 0x027d }
            p000.vx2.m53588d(r7)     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r9 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.HIDE     // Catch:{ Exception -> 0x027d }
            int r9 = r9.getValue()     // Catch:{ Exception -> 0x027d }
            java.lang.Integer r9 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x027d }
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x027d }
            r2.add(r8)     // Catch:{ Exception -> 0x027d }
            goto L_0x00c3
        L_0x0204:
            if (r14 == 0) goto L_0x0232
            java.util.ArrayList r8 = r14.getOwnerIdsForever()     // Catch:{ Exception -> 0x027d }
            if (r8 == 0) goto L_0x0232
            boolean r9 = r8.isEmpty()     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x0214
        L_0x0212:
            r8 = r11
            goto L_0x022f
        L_0x0214:
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x027d }
        L_0x0218:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x0212
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x027d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x027d }
            java.lang.String r10 = r7.getSlug()     // Catch:{ Exception -> 0x027d }
            boolean r9 = p000.vx2.m53586b(r9, r10)     // Catch:{ Exception -> 0x027d }
            if (r9 == 0) goto L_0x0218
            r8 = r6
        L_0x022f:
            if (r8 != r6) goto L_0x0232
            r11 = r6
        L_0x0232:
            if (r11 == 0) goto L_0x024f
            kotlin.Pair r8 = new kotlin.Pair     // Catch:{ Exception -> 0x027d }
            java.lang.Long r7 = r7.getId()     // Catch:{ Exception -> 0x027d }
            p000.vx2.m53588d(r7)     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r9 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.DELETE_FOREVER     // Catch:{ Exception -> 0x027d }
            int r9 = r9.getValue()     // Catch:{ Exception -> 0x027d }
            java.lang.Integer r9 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x027d }
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x027d }
            r2.add(r8)     // Catch:{ Exception -> 0x027d }
            goto L_0x00c3
        L_0x024f:
            kotlin.Pair r8 = new kotlin.Pair     // Catch:{ Exception -> 0x027d }
            java.lang.Long r7 = r7.getId()     // Catch:{ Exception -> 0x027d }
            p000.vx2.m53588d(r7)     // Catch:{ Exception -> 0x027d }
            net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT r9 = net.safemoon.androidwallet.model.collectible.TYPE_DELETE_NFT.VISIBLE     // Catch:{ Exception -> 0x027d }
            int r9 = r9.getValue()     // Catch:{ Exception -> 0x027d }
            java.lang.Integer r9 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x027d }
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x027d }
            r2.add(r8)     // Catch:{ Exception -> 0x027d }
            goto L_0x00c3
        L_0x026a:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r14 = r4.mo61034C()     // Catch:{ Exception -> 0x027d }
            r0.L$0 = r5     // Catch:{ Exception -> 0x027d }
            r0.L$1 = r5     // Catch:{ Exception -> 0x027d }
            r0.L$2 = r5     // Catch:{ Exception -> 0x027d }
            r0.label = r3     // Catch:{ Exception -> 0x027d }
            java.lang.Object r14 = r14.mo60798g(r2, r0)     // Catch:{ Exception -> 0x027d }
            if (r14 != r1) goto L_0x027d
            return r1
        L_0x027d:
            r37 r14 = p000.r37.f33317a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CollectibleViewModel.mo61056g0(int, ns0):java.lang.Object");
    }

    /* renamed from: h0 */
    public final void mo61057h0() {
        this.f42651l.postValue(TYPE_DELETE_NFT.HIDE);
        this.f42650k.postValue(Boolean.FALSE);
    }

    /* renamed from: i0 */
    public final void mo61058i0(boolean z) {
        this.f42651l.postValue(TYPE_DELETE_NFT.VISIBLE);
        this.f42650k.postValue(Boolean.valueOf(z));
    }

    /* renamed from: j0 */
    public final void mo61059j0(String str, String str2, no2 no2, k04<NFTTransferResponse> k04, pc2<r37> pc2) {
        vx2.m53591g(k04, "callBack");
        vx2.m53591g(pc2, "errorCallBack");
        try {
            if (no2 instanceof NFT721) {
                vx2.m53589e(no2, "null cannot be cast to non-null type net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721");
                vx2.m53588d(str);
                vx2.m53588d(str2);
                mo61061m0((NFT721) no2, str, new BigInteger(str2), k04, pc2);
            } else if (no2 instanceof NFT1155) {
                vx2.m53589e(no2, "null cannot be cast to non-null type net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155");
                vx2.m53588d(str);
                vx2.m53588d(str2);
                m68458l0(this, (NFT1155) no2, str, new BigInteger(str2), (BigInteger) null, k04, pc2, 8, (Object) null);
            } else if (no2 instanceof NFTSolana) {
                vx2.m53588d(str);
                m68462o0(this, (NFTSolana) no2, str, (BigInteger) null, k04, pc2, 4, (Object) null);
            } else {
                new Exception("Unknown NFT Type");
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Error";
            }
            k04.postValue(new NFTTransferResponse((NFTType) null, (String) null, message));
        }
    }

    /* renamed from: k0 */
    public final void mo61060k0(NFT1155 nft1155, String str, BigInteger bigInteger, BigInteger bigInteger2, k04<NFTTransferResponse> k04, pc2<r37> pc2) {
        this.f42655p.postValue(LoadingState.Loading);
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CollectibleViewModel$transfer1155From$1(nft1155, bigInteger, bigInteger2, str, k04, this, pc2, (ns0<? super CollectibleViewModel$transfer1155From$1>) null), 3, (Object) null);
    }

    /* renamed from: m0 */
    public final void mo61061m0(NFT721 nft721, String str, BigInteger bigInteger, k04<NFTTransferResponse> k04, pc2<r37> pc2) {
        this.f42655p.postValue(LoadingState.Loading);
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CollectibleViewModel$transfer711From$1(nft721, bigInteger, str, k04, this, pc2, (ns0<? super CollectibleViewModel$transfer711From$1>) null), 3, (Object) null);
    }

    /* renamed from: n0 */
    public final void mo61062n0(NFTSolana nFTSolana, String str, BigInteger bigInteger, k04<NFTTransferResponse> k04, pc2<r37> pc2) {
        this.f42655p.postValue(LoadingState.Loading);
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CollectibleViewModel$transferSolanaFrom$1(nFTSolana, bigInteger, str, k04, this, pc2, (ns0<? super CollectibleViewModel$transferSolanaFrom$1>) null), 3, (Object) null);
    }

    /* renamed from: p0 */
    public final void mo61063p0(List<Pair<Long, Integer>> list) {
        vx2.m53591g(list, "mapIndexed");
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CollectibleViewModel$updateCollectionOrders$1(this, list, (ns0<? super CollectibleViewModel$updateCollectionOrders$1>) null), 2, (Object) null);
    }

    /* renamed from: q0 */
    public final void mo61064q0(List<Pair<Long, Integer>> list) {
        vx2.m53591g(list, "mapIndexed");
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CollectibleViewModel$updateNftOrders$1(this, list, (ns0<? super CollectibleViewModel$updateNftOrders$1>) null), 2, (Object) null);
    }

    /* renamed from: s */
    public final void mo61065s(String str, no2 no2, k04<NFTBalance> k04) {
        vx2.m53591g(k04, "callBack");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CollectibleViewModel$balance$1(no2, str, k04, (ns0<? super CollectibleViewModel$balance$1>) null), 3, (Object) null);
    }

    /* renamed from: t */
    public final void mo61066t(String str, String str2, no2 no2) {
        vx2.m53591g(str, "toAddress");
        vx2.m53591g(str2, "tokenId");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CollectibleViewModel$estimateGas$1(no2, str, str2, this, (ns0<? super CollectibleViewModel$estimateGas$1>) null), 3, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v45, resolved type: net.safemoon.androidwallet.model.collectible.RoomNFT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: net.safemoon.androidwallet.model.collectible.MoralisNft} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: java.util.Iterator<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: net.safemoon.androidwallet.model.collectible.MoralisNFTs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: net.safemoon.androidwallet.viewmodels.CollectibleViewModel} */
    /* JADX WARNING: type inference failed for: r2v30, types: [java.lang.String] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0539 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05fb  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0290  */
    /* renamed from: u */
    public final java.lang.Object mo61067u(int r38, int r39, int r40, p000.ns0<? super p000.r37> r41) {
        /*
            r37 = this;
            r1 = r37
            r0 = r38
            r2 = r41
            boolean r3 = r2 instanceof net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchCollections$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchCollections$1 r3 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchCollections$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchCollections$1 r3 = new net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchCollections$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p000.wx2.m54101d()
            int r5 = r3.label
            java.lang.String r6 = "getApplication()"
            java.lang.String r7 = ""
            r8 = 0
            switch(r5) {
                case 0: goto L_0x0159;
                case 1: goto L_0x014f;
                case 2: goto L_0x013c;
                case 3: goto L_0x0120;
                case 4: goto L_0x0115;
                case 5: goto L_0x0106;
                case 6: goto L_0x00fb;
                case 7: goto L_0x00df;
                case 8: goto L_0x00ba;
                case 9: goto L_0x0099;
                case 10: goto L_0x0086;
                case 11: goto L_0x006f;
                case 12: goto L_0x0058;
                case 13: goto L_0x0046;
                case 14: goto L_0x0115;
                case 15: goto L_0x003b;
                case 16: goto L_0x0036;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0036:
            p000.hg5.m45199b(r2)
            goto L_0x06a6
        L_0x003b:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r5 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r5
            p000.hg5.m45199b(r2)     // Catch:{ Exception -> 0x0664 }
            goto L_0x065f
        L_0x0046:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$1
            net.safemoon.androidwallet.model.collectible.MoralisNFTs r5 = (net.safemoon.androidwallet.model.collectible.MoralisNFTs) r5
            java.lang.Object r6 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r6 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r6
            p000.hg5.m45199b(r2)
            r2 = r5
            r5 = r6
            r7 = r8
            goto L_0x0615
        L_0x0058:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$3
            net.safemoon.androidwallet.model.collectible.RoomNFT r5 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r5
            java.lang.Object r9 = r3.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r3.L$1
            net.safemoon.androidwallet.model.collectible.MoralisNFTs r10 = (net.safemoon.androidwallet.model.collectible.MoralisNFTs) r10
            java.lang.Object r11 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r11 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r11
            p000.hg5.m45199b(r2)
            goto L_0x05d7
        L_0x006f:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$3
            net.safemoon.androidwallet.model.collectible.RoomNFT r5 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r5
            java.lang.Object r9 = r3.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r3.L$1
            net.safemoon.androidwallet.model.collectible.MoralisNFTs r10 = (net.safemoon.androidwallet.model.collectible.MoralisNFTs) r10
            java.lang.Object r11 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r11 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r11
            p000.hg5.m45199b(r2)
            goto L_0x05a6
        L_0x0086:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r9 = r3.L$1
            net.safemoon.androidwallet.model.collectible.MoralisNFTs r9 = (net.safemoon.androidwallet.model.collectible.MoralisNFTs) r9
            java.lang.Object r10 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r10 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r10
            p000.hg5.m45199b(r2)
            goto L_0x0565
        L_0x0099:
            long r9 = r3.J$0
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$4
            net.safemoon.androidwallet.model.collectible.RoomNFT r5 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r5
            java.lang.Object r11 = r3.L$3
            net.safemoon.androidwallet.model.collectible.MoralisNft r11 = (net.safemoon.androidwallet.model.collectible.MoralisNft) r11
            java.lang.Object r12 = r3.L$2
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r3.L$1
            net.safemoon.androidwallet.model.collectible.MoralisNFTs r13 = (net.safemoon.androidwallet.model.collectible.MoralisNFTs) r13
            java.lang.Object r14 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r14 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r14
            p000.hg5.m45199b(r2)
            r8 = r5
            r5 = r12
            r12 = r11
            r11 = r13
            goto L_0x053f
        L_0x00ba:
            long r9 = r3.J$0
            int r5 = r3.I$0
            java.lang.Object r0 = r3.L$4
            r11 = r0
            net.safemoon.androidwallet.model.collectible.RoomNFT r11 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r11
            java.lang.Object r0 = r3.L$3
            r12 = r0
            net.safemoon.androidwallet.model.collectible.MoralisNft r12 = (net.safemoon.androidwallet.model.collectible.MoralisNft) r12
            java.lang.Object r0 = r3.L$2
            r13 = r0
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r0 = r3.L$1
            r14 = r0
            net.safemoon.androidwallet.model.collectible.MoralisNFTs r14 = (net.safemoon.androidwallet.model.collectible.MoralisNFTs) r14
            java.lang.Object r0 = r3.L$0
            r15 = r0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r15 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r15
            p000.hg5.m45199b(r2)     // Catch:{ Exception -> 0x00dc }
            goto L_0x04c1
        L_0x00dc:
            r0 = move-exception
            goto L_0x050a
        L_0x00df:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$3
            net.safemoon.androidwallet.model.collectible.MoralisNft r5 = (net.safemoon.androidwallet.model.collectible.MoralisNft) r5
            java.lang.Object r9 = r3.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r3.L$1
            net.safemoon.androidwallet.model.collectible.MoralisNFTs r10 = (net.safemoon.androidwallet.model.collectible.MoralisNFTs) r10
            java.lang.Object r11 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r11 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r11
            p000.hg5.m45199b(r2)
            r14 = r5
            r13 = r9
            r12 = r11
            r5 = r0
            r11 = r10
            goto L_0x0432
        L_0x00fb:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r5 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r5
            p000.hg5.m45199b(r2)     // Catch:{ Exception -> 0x0393 }
            goto L_0x038f
        L_0x0106:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$1
            net.safemoon.androidwallet.model.wallets.Wallet r5 = (net.safemoon.androidwallet.model.wallets.Wallet) r5
            java.lang.Object r9 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r9 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r9
            p000.hg5.m45199b(r2)
            goto L_0x0340
        L_0x0115:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r5 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r5
            p000.hg5.m45199b(r2)
            goto L_0x0691
        L_0x0120:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$4
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r3.L$3
            net.safemoon.androidwallet.model.collectible.Collectible r6 = (net.safemoon.androidwallet.model.collectible.Collectible) r6
            java.lang.Object r9 = r3.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r3.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r11 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r11
            p000.hg5.m45199b(r2)
            r2 = r11
            goto L_0x02e8
        L_0x013c:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r3.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r9 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r9 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r9
            p000.hg5.m45199b(r2)
            goto L_0x0245
        L_0x014f:
            int r0 = r3.I$0
            java.lang.Object r5 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r5 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r5
            p000.hg5.m45199b(r2)     // Catch:{ Exception -> 0x01a1 }
            goto L_0x019d
        L_0x0159:
            p000.hg5.m45199b(r2)
            net.safemoon.androidwallet.model.wallets.Wallet r5 = r37.mo61070y()
            if (r5 == 0) goto L_0x0695
            r2 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            if (r0 != r2) goto L_0x0310
            net.safemoon.androidwallet.common.TokenType$a r2 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x01a0 }
            net.safemoon.androidwallet.common.TokenType r2 = r2.mo57099b(r0)     // Catch:{ Exception -> 0x01a0 }
            net.safemoon.androidwallet.common.MyCoinType r2 = r2.getCoinType()     // Catch:{ Exception -> 0x01a0 }
            int r2 = r2.getValue()     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r2 = r5.getAddress(r2)     // Catch:{ Exception -> 0x01a0 }
            li0 r5 = p000.C9384u3.m72569j()     // Catch:{ Exception -> 0x01a0 }
            java.lang.Integer r6 = p000.a40.m31673d(r39)     // Catch:{ Exception -> 0x01a0 }
            java.lang.Integer r10 = p000.a40.m31673d(r40)     // Catch:{ Exception -> 0x01a0 }
            k90 r2 = r5.mo55908b(r6, r10, r2)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r5 = "getCollectibleClient().g…s(limit, offset, address)"
            p000.vx2.m53590f(r2, r5)     // Catch:{ Exception -> 0x01a0 }
            r3.L$0 = r1     // Catch:{ Exception -> 0x01a0 }
            r3.I$0 = r0     // Catch:{ Exception -> 0x01a0 }
            r3.label = r9     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r3)     // Catch:{ Exception -> 0x01a0 }
            if (r2 != r4) goto L_0x019c
            return r4
        L_0x019c:
            r5 = r1
        L_0x019d:
            bg5 r2 = (p000.bg5) r2     // Catch:{ Exception -> 0x01a1 }
            goto L_0x01a2
        L_0x01a0:
            r5 = r1
        L_0x01a1:
            r2 = r8
        L_0x01a2:
            if (r2 == 0) goto L_0x0691
            boolean r6 = r2.mo50581e()
            if (r6 == 0) goto L_0x0691
            java.lang.Object r6 = r2.mo50578a()
            if (r6 == 0) goto L_0x0691
            java.lang.Object r2 = r2.mo50578a()
            p000.vx2.m53588d(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r6 = r2.iterator()
            r35 = r6
            r6 = r2
            r2 = r5
            r5 = r35
        L_0x01c3:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x02f2
            java.lang.Object r9 = r5.next()
            net.safemoon.androidwallet.model.collectible.Collectible r9 = (net.safemoon.androidwallet.model.collectible.Collectible) r9
            java.util.List r10 = r9.getPrimary_asset_contracts()
            if (r10 != 0) goto L_0x01d9
            java.util.List r10 = p000.ck0.m33062j()
        L_0x01d9:
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0248
            net.safemoon.androidwallet.model.collectible.RoomCollection r15 = new net.safemoon.androidwallet.model.collectible.RoomCollection
            r10 = 0
            java.lang.String r11 = r9.getName()
            if (r11 != 0) goto L_0x01ea
            r14 = r7
            goto L_0x01eb
        L_0x01ea:
            r14 = r11
        L_0x01eb:
            java.lang.String r11 = r9.getDescription()
            if (r11 != 0) goto L_0x01f4
            r16 = r7
            goto L_0x01f6
        L_0x01f4:
            r16 = r11
        L_0x01f6:
            java.lang.String r11 = r9.getImage_url()
            if (r11 != 0) goto L_0x01ff
            r27 = r7
            goto L_0x0201
        L_0x01ff:
            r27 = r11
        L_0x0201:
            java.lang.String r19 = r9.getSlug()
            long r20 = java.lang.System.currentTimeMillis()
            r22 = 0
            r23 = 0
            java.lang.String r24 = r9.toString()
            r25 = 6145(0x1801, float:8.611E-42)
            r26 = 0
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            java.lang.String r17 = ""
            java.lang.String r18 = "OPEN_SEA"
            r9 = r15
            r11 = r0
            r28 = r15
            r15 = r16
            r16 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26)
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r9 = r2.mo61034C()
            r3.L$0 = r2
            r3.L$1 = r6
            r3.L$2 = r5
            r3.L$3 = r8
            r3.L$4 = r8
            r3.I$0 = r0
            r10 = 2
            r3.label = r10
            r10 = r28
            java.lang.Object r9 = r9.mo60797f(r10, r3)
            if (r9 != r4) goto L_0x0244
            return r4
        L_0x0244:
            r9 = r2
        L_0x0245:
            r2 = r9
            goto L_0x02ef
        L_0x0248:
            java.util.List r10 = r9.getPrimary_asset_contracts()
            if (r10 == 0) goto L_0x02ef
            java.util.Iterator r10 = r10.iterator()
            r35 = r9
            r9 = r5
            r5 = r10
            r10 = r6
            r6 = r35
        L_0x0259:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x02eb
            java.lang.Object r11 = r5.next()
            net.safemoon.androidwallet.model.collectible.PrimaryAssetContract r11 = (net.safemoon.androidwallet.model.collectible.PrimaryAssetContract) r11
            net.safemoon.androidwallet.model.collectible.RoomCollection r15 = new net.safemoon.androidwallet.model.collectible.RoomCollection
            r12 = 0
            java.lang.String r13 = r11.getAddress()
            if (r13 != 0) goto L_0x0270
            r14 = r7
            goto L_0x0271
        L_0x0270:
            r14 = r13
        L_0x0271:
            java.lang.String r13 = r11.getSchema_name()
            if (r13 != 0) goto L_0x027a
            r16 = r7
            goto L_0x027c
        L_0x027a:
            r16 = r13
        L_0x027c:
            java.lang.String r13 = r11.getName()
            if (r13 != 0) goto L_0x0285
            r17 = r7
            goto L_0x0287
        L_0x0285:
            r17 = r13
        L_0x0287:
            java.lang.String r13 = r11.getDescription()
            if (r13 != 0) goto L_0x0290
            r18 = r7
            goto L_0x0292
        L_0x0290:
            r18 = r13
        L_0x0292:
            java.lang.String r13 = r11.getImage_url()
            if (r13 != 0) goto L_0x029b
            r19 = r7
            goto L_0x029d
        L_0x029b:
            r19 = r13
        L_0x029d:
            java.lang.String r11 = r11.getSymbol()
            if (r11 != 0) goto L_0x02a6
            r29 = r7
            goto L_0x02a8
        L_0x02a6:
            r29 = r11
        L_0x02a8:
            java.lang.String r21 = r6.getSlug()
            long r22 = java.lang.System.currentTimeMillis()
            r24 = 0
            r25 = 0
            java.lang.String r26 = r6.toString()
            r27 = 6145(0x1801, float:8.611E-42)
            r28 = 0
            java.lang.String r20 = "OPEN_SEA"
            r11 = r15
            r13 = r0
            r8 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r29
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28)
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r11 = r2.mo61034C()
            r3.L$0 = r2
            r3.L$1 = r10
            r3.L$2 = r9
            r3.L$3 = r6
            r3.L$4 = r5
            r3.I$0 = r0
            r12 = 3
            r3.label = r12
            java.lang.Object r8 = r11.mo60797f(r8, r3)
            if (r8 != r4) goto L_0x02e8
            return r4
        L_0x02e8:
            r8 = 0
            goto L_0x0259
        L_0x02eb:
            r37 r5 = p000.r37.f33317a
            r5 = r9
            r6 = r10
        L_0x02ef:
            r8 = 0
            goto L_0x01c3
        L_0x02f2:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r5 = r2.mo61034C()
            r3.L$0 = r2
            r7 = 0
            r3.L$1 = r7
            r3.L$2 = r7
            r3.L$3 = r7
            r3.L$4 = r7
            r3.I$0 = r0
            r7 = 4
            r3.label = r7
            java.lang.Object r5 = r5.mo60794c(r6, r0, r3)
            if (r5 != r4) goto L_0x030d
            return r4
        L_0x030d:
            r5 = r2
            goto L_0x0691
        L_0x0310:
            if (r0 == r9) goto L_0x0322
            r2 = 56
            if (r0 == r2) goto L_0x0322
            r2 = 137(0x89, float:1.92E-43)
            if (r0 == r2) goto L_0x0322
            r2 = 43114(0xa86a, float:6.0416E-41)
            if (r0 != r2) goto L_0x0320
            goto L_0x0322
        L_0x0320:
            r2 = 0
            goto L_0x0323
        L_0x0322:
            r2 = r9
        L_0x0323:
            if (r2 == 0) goto L_0x062a
            if (r9 != r0) goto L_0x033f
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r2 = r37.mo61034C()
            java.util.List r8 = p000.ck0.m33062j()
            r3.L$0 = r1
            r3.L$1 = r5
            r3.I$0 = r0
            r9 = 5
            r3.label = r9
            java.lang.Object r2 = r2.mo60794c(r8, r0, r3)
            if (r2 != r4) goto L_0x033f
            return r4
        L_0x033f:
            r9 = r1
        L_0x0340:
            net.safemoon.androidwallet.common.TokenType$a r2 = net.safemoon.androidwallet.common.TokenType.Companion
            net.safemoon.androidwallet.common.TokenType r2 = r2.mo57099b(r0)
            net.safemoon.androidwallet.common.MyCoinType r2 = r2.getCoinType()
            int r2 = r2.getValue()
            java.lang.String r11 = r5.getAddress(r2)
            p000.vx2.m53588d(r11)
            cy3 r10 = p000.C9384u3.m72572m()     // Catch:{ Exception -> 0x0392 }
            java.lang.String r2 = "getMoralisClient()"
            p000.vx2.m53590f(r10, r2)     // Catch:{ Exception -> 0x0392 }
            java.lang.String r2 = okhttp3.internal.Util.toHexString((int) r0)     // Catch:{ Exception -> 0x0392 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0392 }
            r5.<init>()     // Catch:{ Exception -> 0x0392 }
            java.lang.String r8 = "0x"
            r5.append(r8)     // Catch:{ Exception -> 0x0392 }
            r5.append(r2)     // Catch:{ Exception -> 0x0392 }
            java.lang.String r12 = r5.toString()     // Catch:{ Exception -> 0x0392 }
            r13 = 0
            r14 = 100
            r15 = 4
            r16 = 0
            k90 r2 = p000.cy3.C6955a.m56595a(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0392 }
            r3.L$0 = r9     // Catch:{ Exception -> 0x0392 }
            r5 = 0
            r3.L$1 = r5     // Catch:{ Exception -> 0x0392 }
            r3.I$0 = r0     // Catch:{ Exception -> 0x0392 }
            r5 = 6
            r3.label = r5     // Catch:{ Exception -> 0x0392 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r3)     // Catch:{ Exception -> 0x0392 }
            if (r2 != r4) goto L_0x038e
            return r4
        L_0x038e:
            r5 = r9
        L_0x038f:
            bg5 r2 = (p000.bg5) r2     // Catch:{ Exception -> 0x0393 }
            goto L_0x0394
        L_0x0392:
            r5 = r9
        L_0x0393:
            r2 = 0
        L_0x0394:
            if (r2 == 0) goto L_0x0691
            boolean r8 = r2.mo50581e()
            if (r8 == 0) goto L_0x0691
            java.lang.Object r8 = r2.mo50578a()
            if (r8 == 0) goto L_0x0691
            java.lang.Object r2 = r2.mo50578a()
            p000.vx2.m53588d(r2)
            net.safemoon.androidwallet.model.collectible.MoralisNFTs r2 = (net.safemoon.androidwallet.model.collectible.MoralisNFTs) r2
            java.util.ArrayList r8 = r2.getResult()
            java.util.Iterator r8 = r8.iterator()
        L_0x03b3:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x05fb
            java.lang.Object r9 = r8.next()
            r14 = r9
            net.safemoon.androidwallet.model.collectible.MoralisNft r14 = (net.safemoon.androidwallet.model.collectible.MoralisNft) r14
            java.lang.String r9 = r14.getTokenAddress()
            if (r9 != 0) goto L_0x03c8
            r12 = r7
            goto L_0x03c9
        L_0x03c8:
            r12 = r9
        L_0x03c9:
            java.lang.String r9 = r14.getContractType()
            if (r9 != 0) goto L_0x03d1
            r13 = r7
            goto L_0x03d2
        L_0x03d1:
            r13 = r9
        L_0x03d2:
            java.lang.String r9 = r14.getName()
            if (r9 != 0) goto L_0x03db
            r17 = r7
            goto L_0x03dd
        L_0x03db:
            r17 = r9
        L_0x03dd:
            java.lang.String r9 = r14.getSymbol()
            if (r9 != 0) goto L_0x03e6
            r27 = r7
            goto L_0x03e8
        L_0x03e6:
            r27 = r9
        L_0x03e8:
            java.lang.String r24 = r14.toString()
            long r20 = java.lang.System.currentTimeMillis()
            net.safemoon.androidwallet.model.collectible.RoomCollection r11 = new net.safemoon.androidwallet.model.collectible.RoomCollection
            r9 = r11
            r10 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r25 = 6145(0x1801, float:8.611E-42)
            r26 = 0
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            java.lang.String r18 = "MORALIS"
            r30 = r11
            r11 = r0
            r31 = r14
            r14 = r17
            r17 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26)
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r9 = r5.mo61034C()
            r3.L$0 = r5
            r3.L$1 = r2
            r3.L$2 = r8
            r10 = r31
            r3.L$3 = r10
            r3.I$0 = r0
            r11 = 7
            r3.label = r11
            r11 = r30
            java.lang.Object r9 = r9.mo60797f(r11, r3)
            if (r9 != r4) goto L_0x042c
            return r4
        L_0x042c:
            r11 = r2
            r12 = r5
            r13 = r8
            r2 = r9
            r14 = r10
            r5 = r0
        L_0x0432:
            java.lang.Number r2 = (java.lang.Number) r2
            long r9 = r2.longValue()
            r15 = 0
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x05f2
            net.safemoon.androidwallet.model.collectible.RoomNFT r2 = new net.safemoon.androidwallet.model.collectible.RoomNFT
            r0 = 0
            java.lang.String r8 = r14.getTokenId()
            if (r8 != 0) goto L_0x044a
            r29 = r7
            goto L_0x044c
        L_0x044a:
            r29 = r8
        L_0x044c:
            java.lang.String r8 = r14.getName()
            if (r8 != 0) goto L_0x0455
            r30 = r7
            goto L_0x0457
        L_0x0455:
            r30 = r8
        L_0x0457:
            r18 = 0
            java.lang.String r19 = r14.getTokenUri()
            r20 = 0
            java.lang.String r21 = r14.toString()
            r22 = 0
            r23 = 0
            long r24 = java.lang.System.currentTimeMillis()
            r26 = 0
            r27 = 46337(0xb501, float:6.4932E-41)
            r28 = 0
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            r8 = r2
            r38 = r9
            r9 = r0
            r10 = r5
            r32 = r11
            r33 = r12
            r11 = r38
            r34 = r13
            r13 = r29
            r40 = r14
            r14 = r30
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28)
            java.lang.String r0 = r40.getMetadata()     // Catch:{ Exception -> 0x04f7 }
            if (r0 == 0) goto L_0x04e2
            net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$Companion r8 = net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource.f42537c     // Catch:{ Exception -> 0x04f7 }
            r11 = r33
            r3.L$0 = r11     // Catch:{ Exception -> 0x04da }
            r10 = r32
            r3.L$1 = r10     // Catch:{ Exception -> 0x04d4 }
            r9 = r34
            r3.L$2 = r9     // Catch:{ Exception -> 0x04ce }
            r12 = r40
            r3.L$3 = r12     // Catch:{ Exception -> 0x04ca }
            r3.L$4 = r2     // Catch:{ Exception -> 0x04ca }
            r3.I$0 = r5     // Catch:{ Exception -> 0x04ca }
            r13 = r38
            r3.J$0 = r13     // Catch:{ Exception -> 0x04c8 }
            r15 = 8
            r3.label = r15     // Catch:{ Exception -> 0x04c8 }
            java.lang.Object r0 = r8.mo60789b(r2, r0, r3)     // Catch:{ Exception -> 0x04c8 }
            if (r0 != r4) goto L_0x04b9
            return r4
        L_0x04b9:
            r15 = r11
            r11 = r2
            r35 = r13
            r13 = r9
            r14 = r10
            r9 = r35
        L_0x04c1:
            r37 r0 = p000.r37.f33317a     // Catch:{ Exception -> 0x00dc }
            r2 = r11
            r11 = r14
            r14 = r12
            r12 = r15
            goto L_0x04f4
        L_0x04c8:
            r0 = move-exception
            goto L_0x0502
        L_0x04ca:
            r0 = move-exception
            r13 = r38
            goto L_0x0502
        L_0x04ce:
            r0 = move-exception
            r13 = r38
            r12 = r40
            goto L_0x0502
        L_0x04d4:
            r0 = move-exception
            r13 = r38
            r12 = r40
            goto L_0x0500
        L_0x04da:
            r0 = move-exception
            r13 = r38
            r12 = r40
            r10 = r32
            goto L_0x0500
        L_0x04e2:
            r13 = r38
            r12 = r40
            r10 = r32
            r11 = r33
            r9 = r34
            r35 = r13
            r13 = r9
            r14 = r12
            r12 = r11
            r11 = r10
            r9 = r35
        L_0x04f4:
            r15 = r12
            r12 = r14
            goto L_0x051d
        L_0x04f7:
            r0 = move-exception
            r13 = r38
            r12 = r40
            r10 = r32
            r11 = r33
        L_0x0500:
            r9 = r34
        L_0x0502:
            r15 = r11
            r11 = r2
            r35 = r13
            r13 = r9
            r14 = r10
            r9 = r35
        L_0x050a:
            java.lang.String r2 = r0.getLocalizedMessage()
            if (r2 != 0) goto L_0x0511
            goto L_0x0512
        L_0x0511:
            r0 = r2
        L_0x0512:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "fetchAttributes()"
            p000.ol0.m70350b0(r0, r2)
            r2 = r11
            r11 = r14
        L_0x051d:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r0 = r15.mo61044M()
            r3.L$0 = r15
            r3.L$1 = r11
            r3.L$2 = r13
            r3.L$3 = r12
            r3.L$4 = r2
            r3.I$0 = r5
            r3.J$0 = r9
            r8 = 9
            r3.label = r8
            java.lang.Object r0 = r0.mo60808i(r2, r3)
            if (r0 != r4) goto L_0x053a
            return r4
        L_0x053a:
            r8 = r2
            r14 = r15
            r2 = r0
            r0 = r5
            r5 = r13
        L_0x053f:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x057f
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r2 = r14.mo61044M()
            r3.L$0 = r14
            r3.L$1 = r11
            r3.L$2 = r5
            r9 = 0
            r3.L$3 = r9
            r3.L$4 = r9
            r3.I$0 = r0
            r9 = 10
            r3.label = r9
            java.lang.Object r2 = r2.mo60810k(r8, r3)
            if (r2 != r4) goto L_0x0563
            return r4
        L_0x0563:
            r9 = r11
            r10 = r14
        L_0x0565:
            java.lang.Number r2 = (java.lang.Number) r2
            long r11 = r2.longValue()
            net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource r2 = new net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource
            android.app.Application r8 = r10.mo27549b()
            p000.vx2.m53590f(r8, r6)
            r2.<init>(r8, r11)
            r2.mo60785a()
            r8 = r5
            r2 = r9
            r5 = r10
            goto L_0x03b3
        L_0x057f:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r2 = r14.mo61044M()
            java.lang.String r12 = r12.getTokenId()
            p000.vx2.m53588d(r12)
            r3.L$0 = r14
            r3.L$1 = r11
            r3.L$2 = r5
            r3.L$3 = r8
            r13 = 0
            r3.L$4 = r13
            r3.I$0 = r0
            r13 = 11
            r3.label = r13
            java.lang.Object r2 = r2.mo60807h(r12, r9, r3)
            if (r2 != r4) goto L_0x05a2
            return r4
        L_0x05a2:
            r9 = r5
            r5 = r8
            r10 = r11
            r11 = r14
        L_0x05a6:
            net.safemoon.androidwallet.model.collectible.RoomNFT r2 = (net.safemoon.androidwallet.model.collectible.RoomNFT) r2
            long r12 = r2.getUpdatedTime()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.HOURS
            r14 = 1
            long r14 = r8.toMillis(r14)
            long r12 = r12 + r14
            long r14 = java.lang.System.currentTimeMillis()
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x05f6
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r8 = r11.mo61044M()
            r3.L$0 = r11
            r3.L$1 = r10
            r3.L$2 = r9
            r3.L$3 = r2
            r3.I$0 = r0
            r12 = 12
            r3.label = r12
            java.lang.Object r5 = r8.mo60811l(r5, r3)
            if (r5 != r4) goto L_0x05d6
            return r4
        L_0x05d6:
            r5 = r2
        L_0x05d7:
            net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource r2 = new net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource
            android.app.Application r8 = r11.mo27549b()
            p000.vx2.m53590f(r8, r6)
            java.lang.Long r5 = r5.getId()
            p000.vx2.m53588d(r5)
            long r12 = r5.longValue()
            r2.<init>(r8, r12)
            r2.mo60785a()
            goto L_0x05f6
        L_0x05f2:
            r10 = r11
            r11 = r12
            r9 = r13
            r0 = r5
        L_0x05f6:
            r8 = r9
            r2 = r10
            r5 = r11
            goto L_0x03b3
        L_0x05fb:
            net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource r6 = r5.mo61034C()
            r3.L$0 = r5
            r3.L$1 = r2
            r7 = 0
            r3.L$2 = r7
            r3.L$3 = r7
            r3.I$0 = r0
            r8 = 13
            r3.label = r8
            java.lang.Object r6 = r6.mo60793b(r2, r0, r3)
            if (r6 != r4) goto L_0x0615
            return r4
        L_0x0615:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r6 = r5.mo61044M()
            r3.L$0 = r5
            r3.L$1 = r7
            r3.I$0 = r0
            r7 = 14
            r3.label = r7
            java.lang.Object r2 = r6.mo60801b(r2, r0, r3)
            if (r2 != r4) goto L_0x0691
            return r4
        L_0x062a:
            net.safemoon.androidwallet.common.TokenType r2 = net.safemoon.androidwallet.common.TokenType.SOLANA
            int r2 = r2.getChainId()
            if (r0 != r2) goto L_0x0690
            net.safemoon.androidwallet.common.TokenType$a r2 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x0663 }
            net.safemoon.androidwallet.common.TokenType r2 = r2.mo57099b(r0)     // Catch:{ Exception -> 0x0663 }
            net.safemoon.androidwallet.common.MyCoinType r2 = r2.getCoinType()     // Catch:{ Exception -> 0x0663 }
            int r2 = r2.getValue()     // Catch:{ Exception -> 0x0663 }
            java.lang.String r2 = r5.getAddress(r2)     // Catch:{ Exception -> 0x0663 }
            p000.vx2.m53588d(r2)     // Catch:{ Exception -> 0x0663 }
            v56 r5 = p000.C9384u3.m72576q()     // Catch:{ Exception -> 0x0663 }
            k90 r2 = r5.mo66422b(r2)     // Catch:{ Exception -> 0x0663 }
            r3.L$0 = r1     // Catch:{ Exception -> 0x0663 }
            r3.I$0 = r0     // Catch:{ Exception -> 0x0663 }
            r5 = 15
            r3.label = r5     // Catch:{ Exception -> 0x0663 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r3)     // Catch:{ Exception -> 0x0663 }
            if (r2 != r4) goto L_0x065e
            return r4
        L_0x065e:
            r5 = r1
        L_0x065f:
            r7 = r2
            bg5 r7 = (p000.bg5) r7     // Catch:{ Exception -> 0x0664 }
            goto L_0x0665
        L_0x0663:
            r5 = r1
        L_0x0664:
            r7 = 0
        L_0x0665:
            if (r7 == 0) goto L_0x0691
            boolean r2 = r7.mo50581e()
            if (r2 == 0) goto L_0x0691
            java.lang.Object r2 = r7.mo50578a()
            if (r2 == 0) goto L_0x0691
            net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker$a r2 = net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker.f43460H
            java.lang.Object r6 = r7.mo50578a()
            p000.vx2.m53588d(r6)
            java.lang.String r6 = r6.toString()
            androidx.work.c r2 = r2.mo62357a(r6)
            android.app.Application r6 = r5.mo27549b()
            mm7 r6 = p000.mm7.m22389f(r6)
            r6.mo23236b(r2)
            goto L_0x0691
        L_0x0690:
            r5 = r1
        L_0x0691:
            r37 r2 = p000.r37.f33317a
            r2 = 0
            goto L_0x0697
        L_0x0695:
            r5 = r1
            r2 = r8
        L_0x0697:
            r3.L$0 = r2
            r3.L$1 = r2
            r2 = 16
            r3.label = r2
            java.lang.Object r0 = r5.mo61056g0(r0, r3)
            if (r0 != r4) goto L_0x06a6
            return r4
        L_0x06a6:
            r37 r0 = p000.r37.f33317a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CollectibleViewModel.mo61067u(int, int, int, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0179 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61068v(int r35, long r36, java.lang.String r38, int r39, int r40, p000.ns0<? super p000.r37> r41) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r41
            boolean r3 = r2 instanceof net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchNFTsBySlug$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchNFTsBySlug$1 r3 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchNFTsBySlug$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchNFTsBySlug$1 r3 = new net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchNFTsBySlug$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p000.wx2.m54101d()
            int r5 = r3.label
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0060
            if (r5 == r8) goto L_0x0054
            if (r5 == r7) goto L_0x003f
            if (r5 != r6) goto L_0x0037
            p000.hg5.m45199b(r2)
            goto L_0x017a
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            long r10 = r3.J$0
            int r1 = r3.I$0
            java.lang.Object r5 = r3.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r8 = r3.L$1
            bg5 r8 = (p000.bg5) r8
            java.lang.Object r12 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r12 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r12
            p000.hg5.m45199b(r2)
            goto L_0x0153
        L_0x0054:
            long r10 = r3.J$0
            int r1 = r3.I$0
            java.lang.Object r5 = r3.L$0
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r5 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r5
            p000.hg5.m45199b(r2)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00a4
        L_0x0060:
            p000.hg5.m45199b(r2)
            net.safemoon.androidwallet.model.wallets.Wallet r2 = r34.mo61070y()
            if (r2 == 0) goto L_0x017a
            net.safemoon.androidwallet.common.TokenType$a r5 = net.safemoon.androidwallet.common.TokenType.Companion
            net.safemoon.androidwallet.common.TokenType r5 = r5.mo57099b(r1)
            net.safemoon.androidwallet.common.MyCoinType r5 = r5.getCoinType()
            int r5 = r5.getValue()
            java.lang.String r2 = r2.getAddress(r5)
            li0 r5 = p000.C9384u3.m72569j()     // Catch:{ Exception -> 0x00a7 }
            java.lang.Integer r10 = p000.a40.m31673d(r39)     // Catch:{ Exception -> 0x00a7 }
            java.lang.Integer r11 = p000.a40.m31673d(r40)     // Catch:{ Exception -> 0x00a7 }
            r12 = r38
            k90 r2 = r5.mo55907a(r10, r11, r12, r2)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = "getCollectibleClient().g…t, offset, slug, address)"
            p000.vx2.m53590f(r2, r5)     // Catch:{ Exception -> 0x00a7 }
            r3.L$0 = r0     // Catch:{ Exception -> 0x00a7 }
            r3.I$0 = r1     // Catch:{ Exception -> 0x00a7 }
            r10 = r36
            r3.J$0 = r10     // Catch:{ Exception -> 0x00a9 }
            r3.label = r8     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r3)     // Catch:{ Exception -> 0x00a9 }
            if (r2 != r4) goto L_0x00a3
            return r4
        L_0x00a3:
            r5 = r0
        L_0x00a4:
            bg5 r2 = (p000.bg5) r2     // Catch:{ Exception -> 0x00aa }
            goto L_0x00ab
        L_0x00a7:
            r10 = r36
        L_0x00a9:
            r5 = r0
        L_0x00aa:
            r2 = r9
        L_0x00ab:
            if (r2 == 0) goto L_0x017a
            boolean r8 = r2.mo50581e()
            if (r8 == 0) goto L_0x017a
            java.lang.Object r8 = r2.mo50578a()
            net.safemoon.androidwallet.model.collectible.Assets r8 = (net.safemoon.androidwallet.model.collectible.Assets) r8
            if (r8 == 0) goto L_0x0159
            java.util.List r8 = r8.getAssets()
            if (r8 == 0) goto L_0x0159
            java.util.Iterator r8 = r8.iterator()
            r33 = r8
            r8 = r2
            r2 = r5
            r5 = r33
        L_0x00cb:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x0157
            java.lang.Object r12 = r5.next()
            net.safemoon.androidwallet.model.collectible.Asset r12 = (net.safemoon.androidwallet.model.collectible.Asset) r12
            if (r12 == 0) goto L_0x0154
            net.safemoon.androidwallet.model.collectible.RoomNFT r15 = new net.safemoon.androidwallet.model.collectible.RoomNFT
            r13 = 0
            java.lang.String r14 = r12.getToken_id()
            java.lang.String r16 = ""
            if (r14 != 0) goto L_0x00e7
            r17 = r16
            goto L_0x00e9
        L_0x00e7:
            r17 = r14
        L_0x00e9:
            java.lang.String r14 = r12.getName()
            if (r14 != 0) goto L_0x00f2
            r18 = r16
            goto L_0x00f4
        L_0x00f2:
            r18 = r14
        L_0x00f4:
            java.lang.String r14 = r12.getDescription()
            if (r14 != 0) goto L_0x00fd
            r19 = r16
            goto L_0x00ff
        L_0x00fd:
            r19 = r14
        L_0x00ff:
            java.lang.String r14 = r12.getImage_original_url()
            if (r14 != 0) goto L_0x0108
            r20 = r16
            goto L_0x010a
        L_0x0108:
            r20 = r14
        L_0x010a:
            java.lang.String r14 = r12.getImage_preview_url()
            if (r14 != 0) goto L_0x0113
            r21 = r16
            goto L_0x0115
        L_0x0113:
            r21 = r14
        L_0x0115:
            r22 = 0
            java.lang.String r23 = r12.getExternal_link()
            java.lang.String r24 = r12.traitsInString()
            java.lang.String r25 = r12.toString()
            r26 = 0
            java.lang.String r27 = r12.getPermalink()
            long r28 = java.lang.System.currentTimeMillis()
            r30 = 0
            r31 = 37121(0x9101, float:5.2018E-41)
            r32 = 0
            r12 = r15
            r14 = r1
            r6 = r15
            r15 = r10
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32)
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r12 = r2.mo61044M()
            r3.L$0 = r2
            r3.L$1 = r8
            r3.L$2 = r5
            r3.I$0 = r1
            r3.J$0 = r10
            r3.label = r7
            java.lang.Object r6 = r12.mo60810k(r6, r3)
            if (r6 != r4) goto L_0x0152
            return r4
        L_0x0152:
            r12 = r2
        L_0x0153:
            r2 = r12
        L_0x0154:
            r6 = 3
            goto L_0x00cb
        L_0x0157:
            r5 = r2
            r2 = r8
        L_0x0159:
            net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource r1 = r5.mo61044M()
            java.lang.Object r2 = r2.mo50578a()
            net.safemoon.androidwallet.model.collectible.Assets r2 = (net.safemoon.androidwallet.model.collectible.Assets) r2
            if (r2 != 0) goto L_0x016a
            net.safemoon.androidwallet.model.collectible.Assets r2 = new net.safemoon.androidwallet.model.collectible.Assets
            r2.<init>()
        L_0x016a:
            r3.L$0 = r9
            r3.L$1 = r9
            r3.L$2 = r9
            r5 = 3
            r3.label = r5
            java.lang.Object r1 = r1.mo60802c(r2, r10, r3)
            if (r1 != r4) goto L_0x017a
            return r4
        L_0x017a:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CollectibleViewModel.mo61068v(int, long, java.lang.String, int, int, ns0):java.lang.Object");
    }

    /* renamed from: w */
    public final LiveData<List<RoomNFT>> mo61069w(RoomCollection roomCollection, int i, int i2) {
        long j;
        vx2.m53591g(roomCollection, "collection");
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new CollectibleViewModel$fetchNfts$1(this, roomCollection, (ns0<? super CollectibleViewModel$fetchNfts$1>) null), 2, (Object) null);
        NftDataSource M = mo61044M();
        Long id = roomCollection.getId();
        if (id != null) {
            j = id.longValue();
        } else {
            j = 0;
        }
        return M.mo60809j(j);
    }

    /* renamed from: y */
    public final Wallet mo61070y() {
        return (Wallet) this.f42642c.getValue();
    }

    /* renamed from: z */
    public final Double mo61071z() {
        return this.f42659t;
    }
}
