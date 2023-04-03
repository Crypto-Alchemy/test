package p000;

import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.google.gson.Gson;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.SafeswapPair;
import net.safemoon.androidwallet.SafeswapRouter;
import net.safemoon.androidwallet.model.swap.PairsData;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.model.swap.Token;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00109\u001a\u000207\u0012\u0006\u0010=\u001a\u00020\u000e¢\u0006\u0004\bG\u0010HJ \u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J \u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007J\u001c\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0013\u001a\u00020\u00042\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0014j\b\u0012\u0004\u0012\u00020\u0004`\u0015J\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0014j\b\u0012\u0004\u0012\u00020\u0004`\u00152\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007J:\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001d0\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001dJ\u0010\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u0004H&J\u0001\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\"0\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0018\b\u0002\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\"0\u0014j\b\u0012\u0004\u0012\u00020\"`\u00152\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00042\u0018\b\u0002\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u0015H\u0002J\u0001\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\"0\u00102\b\b\u0002\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0018\b\u0002\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\"0\u0014j\b\u0012\u0004\u0012\u00020\"`\u00152\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00042\u0018\b\u0002\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u0015H\u0002JD\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u00152\u0018\b\u0002\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u00152\u0006\u0010-\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020#H\u0002J\u0018\u00100\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0002J\u0018\u00101\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0002J\u0010\u00102\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J \u00105\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0002H\u0002J \u00106\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0002H\u0002R\u0014\u00109\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0017\u0010=\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\"0\u00178\u0006¢\u0006\f\n\u0004\b,\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020#8\u0002XD¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020#8\u0002XD¢\u0006\u0006\n\u0004\b2\u0010CR\u0014\u0010F\u001a\u00020#8\u0002XD¢\u0006\u0006\n\u0004\b\u001a\u0010C¨\u0006I"}, mo44877d2 = {"Lue6;", "", "Ljava/math/BigInteger;", "amountIn", "", "tokenIn", "tokenOut", "Lkt6;", "l", "amountOut", "m", "a", "Ljava/math/BigDecimal;", "q", "Lnet/safemoon/androidwallet/model/swap/Swap;", "sourceSwap", "", "arrayList", "o", "inputToken", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "pairs", "", "g", "p", "f", "Lnet/safemoon/androidwallet/model/swap/Token;", "basePairs", "Lkotlin/Pair;", "pair", "h", "Lnet/safemoon/androidwallet/SafeswapPair;", "n", "Lnet/safemoon/androidwallet/model/swap/PairsData;", "", "maxHops", "maxResults", "currentPair", "originalAmountIn", "originalTokenIn", "bestTrades", "originalAmountOut", "originalTokenOut", "c", "newTrade", "s", "b", "t", "r", "e", "reserveIn", "reserveOut", "k", "j", "Lnet/safemoon/androidwallet/SafeswapRouter;", "Lnet/safemoon/androidwallet/SafeswapRouter;", "mainRouter", "Lnet/safemoon/androidwallet/model/swap/Swap;", "getSwap", "()Lnet/safemoon/androidwallet/model/swap/Swap;", "swap", "Ljava/util/List;", "i", "()Ljava/util/List;", "allPairsAndReserve", "d", "I", "oneHundredPercent", "pairFee", "inputFractionAfterFee", "<init>", "(Lnet/safemoon/androidwallet/SafeswapRouter;Lnet/safemoon/androidwallet/model/swap/Swap;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ue6 */
/* compiled from: SwapBestTrade.kt */
public abstract class ue6 {

    /* renamed from: a */
    public final SafeswapRouter f45031a;

    /* renamed from: b */
    public final Swap f45032b;

    /* renamed from: c */
    public final List<PairsData> f45033c = new ArrayList();

    /* renamed from: d */
    public final int f45034d = 10000;

    /* renamed from: e */
    public final int f45035e = 25;

    /* renamed from: f */
    public final int f45036f = (10000 - 25);

    public ue6(SafeswapRouter safeswapRouter, Swap swap) {
        vx2.m53591g(safeswapRouter, "mainRouter");
        vx2.m53591g(swap, "swap");
        this.f45031a = safeswapRouter;
        this.f45032b = swap;
    }

    /* renamed from: b */
    public static /* synthetic */ ArrayList m72748b(ue6 ue6, List list, BigInteger bigInteger, String str, String str2, int i, int i2, ArrayList arrayList, BigInteger bigInteger2, String str3, ArrayList arrayList2, int i3, Object obj) {
        ArrayList arrayList3;
        BigInteger bigInteger3;
        ArrayList arrayList4;
        BigInteger bigInteger4;
        String str4;
        ArrayList arrayList5;
        int i4 = i3;
        if (obj == null) {
            if ((i4 & 1) != 0) {
                arrayList3 = new ArrayList();
            } else {
                arrayList3 = list;
            }
            if ((i4 & 2) != 0) {
                BigInteger bigInteger5 = BigInteger.ZERO;
                vx2.m53590f(bigInteger5, "ZERO");
                bigInteger3 = bigInteger5;
            } else {
                bigInteger3 = bigInteger;
            }
            if ((i4 & 64) != 0) {
                arrayList4 = new ArrayList();
            } else {
                arrayList4 = arrayList;
            }
            if ((i4 & 128) != 0) {
                bigInteger4 = bigInteger3;
            } else {
                bigInteger4 = bigInteger2;
            }
            if ((i4 & 256) != 0) {
                str4 = str;
            } else {
                str4 = str3;
            }
            if ((i4 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0) {
                arrayList5 = new ArrayList();
            } else {
                arrayList5 = arrayList2;
            }
            return ue6.mo66249a(arrayList3, bigInteger3, str, str2, i, i2, arrayList4, bigInteger4, str4, arrayList5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bestTradeExactIn");
    }

    /* renamed from: d */
    public static /* synthetic */ ArrayList m72749d(ue6 ue6, List list, BigInteger bigInteger, String str, String str2, int i, int i2, ArrayList arrayList, BigInteger bigInteger2, String str3, ArrayList arrayList2, int i3, Object obj) {
        ArrayList arrayList3;
        BigInteger bigInteger3;
        ArrayList arrayList4;
        BigInteger bigInteger4;
        String str4;
        ArrayList arrayList5;
        int i4 = i3;
        if (obj == null) {
            if ((i4 & 1) != 0) {
                arrayList3 = new ArrayList();
            } else {
                arrayList3 = list;
            }
            if ((i4 & 2) != 0) {
                BigInteger bigInteger5 = BigInteger.ZERO;
                vx2.m53590f(bigInteger5, "ZERO");
                bigInteger3 = bigInteger5;
            } else {
                bigInteger3 = bigInteger;
            }
            if ((i4 & 64) != 0) {
                arrayList4 = new ArrayList();
            } else {
                arrayList4 = arrayList;
            }
            if ((i4 & 128) != 0) {
                bigInteger4 = bigInteger3;
            } else {
                bigInteger4 = bigInteger2;
            }
            if ((i4 & 256) != 0) {
                str4 = str2;
            } else {
                str4 = str3;
            }
            if ((i4 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0) {
                arrayList5 = new ArrayList();
            } else {
                arrayList5 = arrayList2;
            }
            return ue6.mo66250c(arrayList3, bigInteger3, str, str2, i, i2, arrayList4, bigInteger4, str4, arrayList5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bestTradeExactOut");
    }

    /* renamed from: a */
    public final ArrayList<kt6> mo66249a(List<PairsData> list, BigInteger bigInteger, String str, String str2, int i, int i2, ArrayList<PairsData> arrayList, BigInteger bigInteger2, String str3, ArrayList<kt6> arrayList2) {
        String str4;
        String str5;
        String str6;
        Pair pair;
        BigInteger bigInteger3;
        ArrayList<kt6> arrayList3;
        String str7;
        String str8;
        String str9;
        String str10;
        T t;
        String str11;
        String str12;
        T t2;
        String str13;
        String reserve1;
        String str14;
        String str15;
        String contractAddress;
        String contractAddress2;
        BigInteger bigInteger4 = bigInteger;
        String str16 = str;
        String str17 = str2;
        int i3 = i;
        ArrayList<PairsData> arrayList4 = arrayList;
        ArrayList<kt6> arrayList5 = arrayList2;
        if (list.isEmpty() || i3 == 0) {
            return arrayList5;
        }
        if (!vx2.m53586b(bigInteger2, bigInteger4) && arrayList.size() <= 0) {
            return arrayList5;
        }
        int size = list.size();
        StringBuilder sb = new StringBuilder();
        String str18 = "MaxHops=";
        sb.append(str18);
        sb.append(i3);
        String str19 = ", PairSize=";
        sb.append(str19);
        sb.append(size);
        sb.append(", tokenIn=");
        sb.append(str16);
        sb.append(", tokenOut=");
        sb.append(str17);
        ol0.m70350b0(sb.toString(), "BestTrade-BeforeLoopStart");
        for (PairsData next : list) {
            Token token0 = next.getToken0();
            if (token0 == null || (contractAddress2 = token0.getContractAddress()) == null) {
                str4 = null;
            } else {
                str4 = contractAddress2.toLowerCase(Locale.ROOT);
                vx2.m53590f(str4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            Token token1 = next.getToken1();
            if (token1 == null || (contractAddress = token1.getContractAddress()) == null) {
                str5 = null;
            } else {
                str5 = contractAddress.toLowerCase(Locale.ROOT);
                vx2.m53590f(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            if (vx2.m53586b(str16, str4) || vx2.m53586b(str16, str5)) {
                if (next.getReserve0() == null || next.getReserve1() == null) {
                    str6 = str5;
                    String pairAddress = next.getPairAddress();
                    vx2.m53588d(pairAddress);
                    uy6 send = mo61656n(pairAddress).mo56498o().send();
                    BigInteger bigInteger5 = (BigInteger) send.component1();
                    BigInteger bigInteger6 = (BigInteger) send.component2();
                    Iterator<T> it = this.f45033c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        Iterator<T> it2 = it;
                        String pairAddress2 = ((PairsData) t).getPairAddress();
                        if (pairAddress2 != null) {
                            str11 = pairAddress2.toLowerCase(Locale.ROOT);
                            vx2.m53590f(str11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        } else {
                            str11 = null;
                        }
                        String pairAddress3 = next.getPairAddress();
                        if (pairAddress3 != null) {
                            str12 = pairAddress3.toLowerCase(Locale.ROOT);
                            vx2.m53590f(str12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        } else {
                            str12 = null;
                        }
                        if (vx2.m53586b(str11, str12)) {
                            break;
                        }
                        BigInteger bigInteger7 = bigInteger2;
                        ArrayList<kt6> arrayList6 = arrayList2;
                        it = it2;
                    }
                    PairsData pairsData = (PairsData) t;
                    if (pairsData != null) {
                        pairsData.setReserve0(bigInteger5 != null ? bigInteger5.toString() : null);
                        pairsData.setReserve1(bigInteger6 != null ? bigInteger6.toString() : null);
                    }
                    pair = new Pair(bigInteger5, bigInteger6);
                } else {
                    Iterator<T> it3 = this.f45033c.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            str6 = str5;
                            t2 = null;
                            break;
                        }
                        t2 = it3.next();
                        String pairAddress4 = ((PairsData) t2).getPairAddress();
                        str6 = str5;
                        if (pairAddress4 != null) {
                            str14 = pairAddress4.toLowerCase(Locale.ROOT);
                            vx2.m53590f(str14, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        } else {
                            str14 = null;
                        }
                        String pairAddress5 = next.getPairAddress();
                        Iterator<T> it4 = it3;
                        if (pairAddress5 != null) {
                            str15 = pairAddress5.toLowerCase(Locale.ROOT);
                            vx2.m53590f(str15, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        } else {
                            str15 = null;
                        }
                        if (vx2.m53586b(str14, str15)) {
                            break;
                        }
                        str5 = str6;
                        it3 = it4;
                    }
                    PairsData pairsData2 = (PairsData) t2;
                    String str20 = "0";
                    if (pairsData2 == null || (str13 = pairsData2.getReserve0()) == null) {
                        str13 = str20;
                    }
                    BigInteger bigInteger8 = new BigInteger(str13);
                    if (!(pairsData2 == null || (reserve1 = pairsData2.getReserve1()) == null)) {
                        str20 = reserve1;
                    }
                    pair = new Pair(bigInteger8, new BigInteger(str20));
                }
                BigInteger bigInteger9 = (BigInteger) pair.component1();
                BigInteger bigInteger10 = (BigInteger) pair.component2();
                BigInteger bigInteger11 = BigInteger.ZERO;
                if (vx2.m53586b(bigInteger9, bigInteger11)) {
                    bigInteger4 = bigInteger;
                    str16 = str;
                    arrayList4 = arrayList;
                } else if (!vx2.m53586b(bigInteger10, bigInteger11)) {
                    String str21 = vx2.m53586b(str4, str16) ? str6 : str4;
                    try {
                        if (vx2.m53586b(str4, str16)) {
                            vx2.m53590f(bigInteger9, "reserve0");
                            vx2.m53590f(bigInteger10, "reserve1");
                            bigInteger3 = mo66257k(bigInteger4, bigInteger9, bigInteger10);
                        } else {
                            vx2.m53590f(bigInteger10, "reserve1");
                            vx2.m53590f(bigInteger9, "reserve0");
                            bigInteger3 = mo66257k(bigInteger4, bigInteger10, bigInteger9);
                        }
                    } catch (Exception unused) {
                        bigInteger3 = BigInteger.ZERO;
                    }
                    BigInteger bigInteger12 = bigInteger3;
                    if (!vx2.m53586b(bigInteger12, BigInteger.ZERO)) {
                        if (vx2.m53586b(str21, str17)) {
                            int size2 = list.size();
                            int size3 = arrayList2.size();
                            ol0.m70350b0(str18 + i3 + str19 + size2 + ", bestTrades=" + size3, "BestTrade-BeforeSort");
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            arrayList7.add(next);
                            r37 r37 = r37.f33317a;
                            vx2.m53590f(bigInteger12, "amountOut");
                            kt6 kt6 = r0;
                            arrayList3 = arrayList2;
                            kt6 kt62 = new kt6(arrayList7, str3, str2, bigInteger2, bigInteger12, Utils.DOUBLE_EPSILON, 32, (DefaultConstructorMarker) null);
                            mo66264s(arrayList3, kt6, i2);
                            int size4 = list.size();
                            int size5 = arrayList2.size();
                            StringBuilder sb2 = new StringBuilder();
                            str7 = str18;
                            sb2.append(str7);
                            sb2.append(i3);
                            str8 = str19;
                            sb2.append(str8);
                            sb2.append(size4);
                            sb2.append(", bestTrades=");
                            sb2.append(size5);
                            ol0.m70350b0(sb2.toString(), "BestTrade-AfterSort");
                            str16 = str;
                        } else {
                            int i4 = i2;
                            arrayList3 = arrayList2;
                            String str22 = str19;
                            str7 = str18;
                            str8 = str22;
                            if (i3 <= 1 || list.size() <= 1) {
                                str16 = str;
                                arrayList4 = arrayList;
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                for (T next2 : list) {
                                    String str23 = str8;
                                    String pairAddress6 = ((PairsData) next2).getPairAddress();
                                    String str24 = str7;
                                    if (pairAddress6 != null) {
                                        str9 = pairAddress6.toLowerCase(Locale.ROOT);
                                        vx2.m53590f(str9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    } else {
                                        str9 = null;
                                    }
                                    String pairAddress7 = next.getPairAddress();
                                    if (pairAddress7 != null) {
                                        str10 = pairAddress7.toLowerCase(Locale.ROOT);
                                        vx2.m53590f(str10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    } else {
                                        str10 = null;
                                    }
                                    if (!yb6.m74344y(str9, str10, true)) {
                                        arrayList8.add(next2);
                                    }
                                    str7 = str24;
                                    str8 = str23;
                                    int i5 = i2;
                                }
                                String str25 = str7;
                                vx2.m53590f(bigInteger12, "amountOut");
                                vx2.m53588d(str21);
                                ArrayList arrayList9 = new ArrayList();
                                arrayList9.addAll(arrayList4);
                                arrayList9.add(next);
                                r37 r372 = r37.f33317a;
                                mo66249a(arrayList8, bigInteger12, str21, str2, i3 - 1, i2, arrayList9, bigInteger2, str3, arrayList2);
                                arrayList4 = arrayList;
                                arrayList5 = arrayList3;
                                str19 = str8;
                                str18 = str25;
                                bigInteger4 = bigInteger;
                                str16 = str;
                            }
                        }
                        BigInteger bigInteger13 = bigInteger2;
                        arrayList5 = arrayList3;
                        bigInteger4 = bigInteger;
                        String str26 = str7;
                        str19 = str8;
                        str18 = str26;
                    }
                }
                BigInteger bigInteger14 = bigInteger2;
                arrayList5 = arrayList2;
            }
        }
        return arrayList5;
    }

    /* renamed from: c */
    public final ArrayList<kt6> mo66250c(List<PairsData> list, BigInteger bigInteger, String str, String str2, int i, int i2, ArrayList<PairsData> arrayList, BigInteger bigInteger2, String str3, ArrayList<kt6> arrayList2) {
        String str4;
        String str5;
        String str6;
        Pair pair;
        BigInteger bigInteger3;
        String str7;
        String str8;
        T t;
        String str9;
        String str10;
        T t2;
        String str11;
        String reserve1;
        String str12;
        String str13;
        String contractAddress;
        String contractAddress2;
        BigInteger bigInteger4 = bigInteger;
        String str14 = str2;
        int i3 = i;
        ArrayList<PairsData> arrayList3 = arrayList;
        ArrayList<kt6> arrayList4 = arrayList2;
        if (list.isEmpty() || i3 == 0) {
            return arrayList4;
        }
        if (!vx2.m53586b(bigInteger2, bigInteger4) && arrayList.size() <= 0) {
            return arrayList4;
        }
        for (PairsData next : list) {
            Token token0 = next.getToken0();
            if (token0 == null || (contractAddress2 = token0.getContractAddress()) == null) {
                str4 = null;
            } else {
                str4 = contractAddress2.toLowerCase(Locale.ROOT);
                vx2.m53590f(str4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            Token token1 = next.getToken1();
            if (token1 == null || (contractAddress = token1.getContractAddress()) == null) {
                str5 = null;
            } else {
                str5 = contractAddress.toLowerCase(Locale.ROOT);
                vx2.m53590f(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            if (vx2.m53586b(str14, str4) || vx2.m53586b(str14, str5)) {
                if (next.getReserve0() == null || next.getReserve1() == null) {
                    String pairAddress = next.getPairAddress();
                    vx2.m53588d(pairAddress);
                    uy6 send = mo61656n(pairAddress).mo56498o().send();
                    BigInteger bigInteger5 = (BigInteger) send.component1();
                    BigInteger bigInteger6 = (BigInteger) send.component2();
                    Iterator<T> it = this.f45033c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str6 = str5;
                            t = null;
                            break;
                        }
                        t = it.next();
                        String pairAddress2 = ((PairsData) t).getPairAddress();
                        str6 = str5;
                        if (pairAddress2 != null) {
                            str9 = pairAddress2.toLowerCase(Locale.ROOT);
                            vx2.m53590f(str9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        } else {
                            str9 = null;
                        }
                        String pairAddress3 = next.getPairAddress();
                        Iterator<T> it2 = it;
                        if (pairAddress3 != null) {
                            str10 = pairAddress3.toLowerCase(Locale.ROOT);
                            vx2.m53590f(str10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        } else {
                            str10 = null;
                        }
                        if (vx2.m53586b(str9, str10)) {
                            break;
                        }
                        str5 = str6;
                        it = it2;
                    }
                    PairsData pairsData = (PairsData) t;
                    if (pairsData != null) {
                        pairsData.setReserve0(bigInteger5 != null ? bigInteger5.toString() : null);
                        pairsData.setReserve1(bigInteger6 != null ? bigInteger6.toString() : null);
                    }
                    pair = new Pair(bigInteger5, bigInteger6);
                } else {
                    Iterator<T> it3 = this.f45033c.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it3.next();
                        String pairAddress4 = ((PairsData) t2).getPairAddress();
                        if (pairAddress4 != null) {
                            str12 = pairAddress4.toLowerCase(Locale.ROOT);
                            vx2.m53590f(str12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        } else {
                            str12 = null;
                        }
                        String pairAddress5 = next.getPairAddress();
                        if (pairAddress5 != null) {
                            str13 = pairAddress5.toLowerCase(Locale.ROOT);
                            vx2.m53590f(str13, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        } else {
                            str13 = null;
                        }
                        if (vx2.m53586b(str12, str13)) {
                            break;
                        }
                    }
                    PairsData pairsData2 = (PairsData) t2;
                    String str15 = "0";
                    if (pairsData2 == null || (str11 = pairsData2.getReserve0()) == null) {
                        str11 = str15;
                    }
                    BigInteger bigInteger7 = new BigInteger(str11);
                    if (!(pairsData2 == null || (reserve1 = pairsData2.getReserve1()) == null)) {
                        str15 = reserve1;
                    }
                    pair = new Pair(bigInteger7, new BigInteger(str15));
                    str6 = str5;
                }
                BigInteger bigInteger8 = (BigInteger) pair.component1();
                BigInteger bigInteger9 = (BigInteger) pair.component2();
                BigInteger bigInteger10 = BigInteger.ZERO;
                if (!vx2.m53586b(bigInteger8, bigInteger10)) {
                    if (!vx2.m53586b(bigInteger9, bigInteger10)) {
                        String str16 = vx2.m53586b(str4, str14) ? str6 : str4;
                        try {
                            if (vx2.m53586b(str4, str14)) {
                                vx2.m53590f(bigInteger8, "reserve0");
                                vx2.m53590f(bigInteger9, "reserve1");
                                bigInteger3 = mo66256j(bigInteger4, bigInteger8, bigInteger9);
                            } else {
                                vx2.m53590f(bigInteger9, "reserve1");
                                vx2.m53590f(bigInteger8, "reserve0");
                                bigInteger3 = mo66256j(bigInteger4, bigInteger9, bigInteger8);
                            }
                        } catch (Exception unused) {
                            bigInteger3 = BigInteger.ZERO;
                        }
                        BigInteger bigInteger11 = bigInteger3;
                        if (!vx2.m53586b(bigInteger11, BigInteger.ZERO)) {
                            if (vx2.m53586b(str16, str)) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add(next);
                                arrayList5.addAll(arrayList3);
                                r37 r37 = r37.f33317a;
                                vx2.m53590f(bigInteger11, "amountIn");
                                mo66264s(arrayList4, new kt6(arrayList5, str, str3, bigInteger11, bigInteger2, Utils.DOUBLE_EPSILON, 32, (DefaultConstructorMarker) null), i2);
                            } else {
                                int i4 = i2;
                                if (i3 > 1 && list.size() > 1) {
                                    ArrayList arrayList6 = new ArrayList();
                                    for (T next2 : list) {
                                        String pairAddress6 = ((PairsData) next2).getPairAddress();
                                        if (pairAddress6 != null) {
                                            str7 = pairAddress6.toLowerCase(Locale.ROOT);
                                            vx2.m53590f(str7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        } else {
                                            str7 = null;
                                        }
                                        String pairAddress7 = next.getPairAddress();
                                        if (pairAddress7 != null) {
                                            str8 = pairAddress7.toLowerCase(Locale.ROOT);
                                            vx2.m53590f(str8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        } else {
                                            str8 = null;
                                        }
                                        if (!yb6.m74344y(str7, str8, true)) {
                                            arrayList6.add(next2);
                                        }
                                        String str17 = str;
                                        int i5 = i2;
                                        BigInteger bigInteger12 = bigInteger2;
                                    }
                                    vx2.m53590f(bigInteger11, "amountIn");
                                    vx2.m53588d(str16);
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.add(next);
                                    arrayList7.addAll(arrayList3);
                                    r37 r372 = r37.f33317a;
                                    arrayList4 = arrayList2;
                                    mo66250c(arrayList6, bigInteger11, str, str16, i3 - 1, i2, arrayList7, bigInteger2, str3, arrayList4);
                                    BigInteger bigInteger13 = bigInteger2;
                                }
                            }
                        }
                    }
                }
                BigInteger bigInteger14 = bigInteger2;
                arrayList4 = arrayList2;
            }
        }
        return arrayList2;
    }

    /* renamed from: e */
    public final BigDecimal mo66251e(kt6 kt6) {
        BigDecimal multiply = mo66260o(this.f45032b, mo66261p(kt6)).multiply(new BigDecimal(kt6.mo55776a()));
        BigDecimal subtract = multiply.subtract(new BigDecimal(kt6.mo55777b()));
        vx2.m53590f(subtract, "quote.subtract(a.amountOut.toBigDecimal())");
        vx2.m53590f(multiply, "quote");
        BigDecimal divide = subtract.divide(multiply, RoundingMode.HALF_EVEN);
        vx2.m53590f(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }

    /* renamed from: f */
    public final BigDecimal mo66252f(BigDecimal bigDecimal, kt6 kt6) {
        Number number;
        vx2.m53591g(bigDecimal, "amountIn");
        vx2.m53591g(kt6, "a");
        int size = kt6.mo55779d().size();
        if (size == 0) {
            number = 0;
        } else {
            number = Double.valueOf(((double) 1) - ((((double) this.f45034d) * Math.pow((double) this.f45036f, (double) size)) / Math.pow((double) this.f45034d, (double) (size + 1))));
        }
        BigDecimal multiply = bigDecimal.multiply(new BigDecimal(String.valueOf(number.doubleValue())));
        vx2.m53590f(multiply, "this.multiply(other)");
        return multiply;
    }

    /* renamed from: g */
    public final List<String> mo66253g(String str, ArrayList<String> arrayList) {
        T t;
        String str2;
        String str3;
        Token token1;
        String contractAddress;
        Token token0;
        String contractAddress2;
        String str4;
        vx2.m53591g(str, "inputToken");
        vx2.m53591g(arrayList, "pairs");
        ArrayList arrayList2 = new ArrayList();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Iterator<T> it2 = this.f45033c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t = null;
                    break;
                }
                t = it2.next();
                String pairAddress = ((PairsData) t).getPairAddress();
                if (pairAddress != null) {
                    str4 = pairAddress.toLowerCase(Locale.ROOT);
                    vx2.m53590f(str4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                } else {
                    str4 = null;
                }
                vx2.m53590f(next, "pair");
                String lowerCase2 = next.toLowerCase(Locale.ROOT);
                vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (vx2.m53586b(str4, lowerCase2)) {
                    break;
                }
            }
            PairsData pairsData = (PairsData) t;
            if (pairsData == null || (token0 = pairsData.getToken0()) == null || (contractAddress2 = token0.getContractAddress()) == null) {
                str2 = null;
            } else {
                str2 = contractAddress2.toLowerCase(Locale.ROOT);
                vx2.m53590f(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            if (pairsData == null || (token1 = pairsData.getToken1()) == null || (contractAddress = token1.getContractAddress()) == null) {
                str3 = null;
            } else {
                str3 = contractAddress.toLowerCase(Locale.ROOT);
                vx2.m53590f(str3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            if (yb6.m74344y(str2, lowerCase, true)) {
                if (str2 != null) {
                    arrayList2.add(str2);
                }
                if (str3 != null) {
                    lowerCase = str3;
                }
            } else {
                if (str3 != null) {
                    arrayList2.add(str3);
                }
                if (str2 != null) {
                    lowerCase = str2;
                }
            }
        }
        if (arrayList2.size() > 0 && !yb6.m74344y(lowerCase, (String) arrayList2.get(0), true)) {
            arrayList2.add(lowerCase);
        }
        return arrayList2;
    }

    /* renamed from: h */
    public final List<Pair<Token, Token>> mo66254h(List<Token> list, Pair<String, String> pair) {
        vx2.m53591g(list, "basePairs");
        vx2.m53591g(pair, "pair");
        ArrayList arrayList = new ArrayList();
        Token token = new Token();
        token.setContractAddress(pair.getFirst());
        Token token2 = new Token();
        token2.setContractAddress(pair.getSecond());
        r37 r37 = r37.f33317a;
        arrayList.add(wy6.m54142a(token, token2));
        for (Token a : list) {
            Token token3 = new Token();
            token3.setContractAddress(pair.getFirst());
            r37 r372 = r37.f33317a;
            arrayList.add(wy6.m54142a(a, token3));
        }
        for (Token a2 : list) {
            Token token4 = new Token();
            token4.setContractAddress(pair.getSecond());
            r37 r373 = r37.f33317a;
            arrayList.add(wy6.m54142a(a2, token4));
        }
        Iterator it = ck0.m33063k(list).iterator();
        while (it.hasNext()) {
            int nextInt = ((lw2) it).nextInt();
            for (Number intValue : CollectionsKt___CollectionsKt.m47346q0(ck0.m33063k(list), new rw2(0, nextInt))) {
                arrayList.add(wy6.m54142a(list.get(nextInt), list.get(intValue.intValue())));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public final List<PairsData> mo66255i() {
        return this.f45033c;
    }

    /* renamed from: j */
    public final BigInteger mo66256j(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        BigInteger bigInteger4 = BigInteger.ZERO;
        if (vx2.m53586b(bigInteger3, bigInteger4) || vx2.m53586b(bigInteger2, bigInteger4) || bigInteger.compareTo(bigInteger2) >= 0) {
            throw new Exception("insufficient liquidity error");
        }
        BigInteger multiply = bigInteger3.multiply(bigInteger);
        vx2.m53590f(multiply, "this.multiply(other)");
        BigInteger valueOf = BigInteger.valueOf((long) 10000);
        vx2.m53590f(valueOf, "valueOf(this.toLong())");
        BigInteger multiply2 = multiply.multiply(valueOf);
        vx2.m53590f(multiply2, "this.multiply(other)");
        BigInteger subtract = bigInteger2.subtract(bigInteger);
        vx2.m53590f(subtract, "this.subtract(other)");
        BigInteger valueOf2 = BigInteger.valueOf((long) 9975);
        vx2.m53590f(valueOf2, "valueOf(this.toLong())");
        BigInteger multiply3 = subtract.multiply(valueOf2);
        vx2.m53590f(multiply3, "this.multiply(other)");
        BigInteger divide = multiply2.divide(multiply3);
        vx2.m53590f(divide, "this.divide(other)");
        BigInteger valueOf3 = BigInteger.valueOf(1);
        vx2.m53590f(valueOf3, "valueOf(this.toLong())");
        BigInteger add = divide.add(valueOf3);
        vx2.m53590f(add, "this.add(other)");
        return add;
    }

    /* renamed from: k */
    public final BigInteger mo66257k(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        BigInteger bigInteger4 = BigInteger.ZERO;
        if (vx2.m53586b(bigInteger2, bigInteger4) || vx2.m53586b(bigInteger3, bigInteger4)) {
            throw new Exception("insufficient liquidity error");
        }
        BigInteger valueOf = BigInteger.valueOf((long) 9975);
        vx2.m53590f(valueOf, "valueOf(this.toLong())");
        BigInteger multiply = bigInteger.multiply(valueOf);
        vx2.m53590f(multiply, "this.multiply(other)");
        BigInteger multiply2 = multiply.multiply(bigInteger3);
        vx2.m53590f(multiply2, "this.multiply(other)");
        BigInteger valueOf2 = BigInteger.valueOf((long) 10000);
        vx2.m53590f(valueOf2, "valueOf(this.toLong())");
        BigInteger multiply3 = bigInteger2.multiply(valueOf2);
        vx2.m53590f(multiply3, "this.multiply(other)");
        BigInteger add = multiply3.add(multiply);
        vx2.m53590f(add, "this.add(other)");
        BigInteger divide = multiply2.divide(add);
        vx2.m53590f(divide, "this.divide(other)");
        if (!vx2.m53586b(divide, bigInteger4)) {
            return divide;
        }
        throw new Exception("insufficient liquidity error");
    }

    /* renamed from: l */
    public final kt6 mo66258l(BigInteger bigInteger, String str, String str2) {
        double d;
        vx2.m53591g(bigInteger, "amountIn");
        String str3 = str;
        vx2.m53591g(str3, "tokenIn");
        String str4 = str2;
        vx2.m53591g(str4, "tokenOut");
        ArrayList<kt6> b = m72748b(this, this.f45033c, bigInteger, str3, str4, 3, 50, (ArrayList) null, (BigInteger) null, (String) null, (ArrayList) null, 960, (Object) null);
        for (kt6 kt6 : b) {
            try {
                d = mo66262q(kt6).doubleValue();
            } catch (Exception unused) {
                d = 100.0d;
            }
            kt6.mo55780e(d);
        }
        return (kt6) b.get(0);
    }

    /* renamed from: m */
    public final kt6 mo66259m(BigInteger bigInteger, String str, String str2) {
        double d;
        vx2.m53591g(bigInteger, "amountOut");
        String str3 = str;
        vx2.m53591g(str3, "tokenIn");
        String str4 = str2;
        vx2.m53591g(str4, "tokenOut");
        ArrayList<kt6> d2 = m72749d(this, this.f45033c, bigInteger, str3, str4, 3, 50, (ArrayList) null, (BigInteger) null, (String) null, (ArrayList) null, 960, (Object) null);
        for (kt6 kt6 : d2) {
            try {
                d = mo66262q(kt6).doubleValue();
            } catch (Exception unused) {
                d = 100.0d;
            }
            kt6.mo55780e(d);
        }
        return (kt6) d2.get(0);
    }

    /* renamed from: n */
    public abstract SafeswapPair mo61656n(String str);

    /* renamed from: o */
    public final BigDecimal mo66260o(Swap swap, List<String> list) {
        String str;
        T t;
        String str2;
        String str3;
        BigDecimal bigDecimal;
        String reserve1;
        Token token1;
        String contractAddress;
        Token token0;
        String contractAddress2;
        String str4;
        vx2.m53591g(swap, "sourceSwap");
        vx2.m53591g(list, "arrayList");
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        String lowerCase = ol0.m70324D(swap).toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        for (String lowerCase2 : list) {
            String lowerCase3 = lowerCase2.toLowerCase(Locale.ROOT);
            vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            Iterator<T> it = this.f45033c.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                String pairAddress = ((PairsData) t).getPairAddress();
                if (pairAddress != null) {
                    str4 = pairAddress.toLowerCase(Locale.ROOT);
                    vx2.m53590f(str4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                } else {
                    str4 = null;
                }
                if (vx2.m53586b(str4, lowerCase3)) {
                    break;
                }
            }
            PairsData pairsData = (PairsData) t;
            if (pairsData == null || (token0 = pairsData.getToken0()) == null || (contractAddress2 = token0.getContractAddress()) == null) {
                str2 = null;
            } else {
                str2 = contractAddress2.toLowerCase(Locale.ROOT);
                vx2.m53590f(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            if (!(pairsData == null || (token1 = pairsData.getToken1()) == null || (contractAddress = token1.getContractAddress()) == null)) {
                str = contractAddress.toLowerCase(Locale.ROOT);
                vx2.m53590f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            String str5 = "0";
            if (pairsData == null || (str3 = pairsData.getReserve0()) == null) {
                str3 = str5;
            }
            BigInteger bigInteger = new BigInteger(str3);
            if (!(pairsData == null || (reserve1 = pairsData.getReserve1()) == null)) {
                str5 = reserve1;
            }
            BigInteger bigInteger2 = new BigInteger(str5);
            if (yb6.m74344y(lowerCase, str2, true)) {
                if (str != null) {
                    lowerCase = str;
                }
                BigDecimal scale = new BigDecimal(bigInteger2).setScale(50);
                vx2.m53590f(scale, "reserve1.toBigDecimal().setScale(50)");
                BigDecimal scale2 = new BigDecimal(bigInteger).setScale(50);
                vx2.m53590f(scale2, "reserve0.toBigDecimal().setScale(50)");
                bigDecimal = scale.divide(scale2, RoundingMode.HALF_EVEN);
                vx2.m53590f(bigDecimal, "this.divide(other, RoundingMode.HALF_EVEN)");
            } else {
                if (str2 != null) {
                    lowerCase = str2;
                }
                BigDecimal scale3 = new BigDecimal(bigInteger).setScale(50);
                vx2.m53590f(scale3, "reserve0.toBigDecimal().setScale(50)");
                BigDecimal scale4 = new BigDecimal(bigInteger2).setScale(50);
                vx2.m53590f(scale4, "reserve1.toBigDecimal().setScale(50)");
                bigDecimal = scale3.divide(scale4, RoundingMode.HALF_EVEN);
                vx2.m53590f(bigDecimal, "this.divide(other, RoundingMode.HALF_EVEN)");
            }
            bigDecimal2 = bigDecimal2.multiply(bigDecimal);
        }
        vx2.m53590f(bigDecimal2, "midPrice");
        return bigDecimal2;
    }

    /* renamed from: p */
    public final ArrayList<String> mo66261p(kt6 kt6) {
        vx2.m53591g(kt6, "a");
        ArrayList<String> arrayList = new ArrayList<>();
        for (PairsData pairAddress : kt6.mo55779d()) {
            String pairAddress2 = pairAddress.getPairAddress();
            if (pairAddress2 != null) {
                arrayList.add(pairAddress2);
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public final BigDecimal mo66262q(kt6 kt6) {
        vx2.m53591g(kt6, "a");
        BigDecimal abs = mo66251e(kt6).abs();
        vx2.m53590f(abs, "priceImpact.abs()");
        BigDecimal subtract = abs.subtract(new BigDecimal(String.valueOf(1.0d - Math.pow(0.9975d, (double) mo66261p(kt6).size()))));
        vx2.m53590f(subtract, "this.subtract(other)");
        BigDecimal multiply = subtract.multiply(new BigDecimal(String.valueOf(100.0d)));
        vx2.m53590f(multiply, "this.multiply(other)");
        return multiply;
    }

    /* renamed from: r */
    public final int mo66263r(kt6 kt6, kt6 kt62) {
        if (vx2.m53586b(kt6.mo55777b(), kt62.mo55777b())) {
            if (vx2.m53586b(kt6.mo55776a(), kt62.mo55776a())) {
                return 0;
            }
            if (kt6.mo55776a().compareTo(kt62.mo55776a()) < 0) {
                return -1;
            }
            return 1;
        } else if (kt6.mo55777b().compareTo(kt62.mo55777b()) < 0) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: s */
    public final ArrayList<kt6> mo66264s(ArrayList<kt6> arrayList, kt6 kt6, int i) {
        boolean z;
        ol0.m70350b0("maxResults = " + i, "SortedInsert-Start");
        if (arrayList.size() == 0) {
            arrayList.add(kt6);
            ol0.m70350b0("newTrade Added", "SortedInsert-bestTrades.size == 0");
            return arrayList;
        }
        if (arrayList.size() == i) {
            z = true;
        } else {
            z = false;
        }
        kt6 kt62 = arrayList.get(arrayList.size() - 1);
        vx2.m53590f(kt62, "bestTrades[bestTrades.size - 1]");
        kt6 kt63 = kt62;
        if (z && mo66265t(kt63, kt6) <= 0) {
            return arrayList;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) >> 1;
            kt6 kt64 = arrayList.get(i3);
            vx2.m53590f(kt64, "bestTrades[mid]");
            if (mo66265t(kt64, kt6) <= 0) {
                i2 = i3 + 1;
            } else {
                size = i3;
            }
        }
        ol0.m70350b0("Lo = " + i2 + " & Hi= " + size, "SortedInsert-After While");
        ArrayList arrayList2 = new ArrayList();
        Object[] a = o23.m70123a(arrayList.toArray(), i2, 0, kt6);
        vx2.m53590f(a, "splice(bestTrades.toArray(), lo, 0, newTrade)");
        for (Object obj : a) {
            vx2.m53589e(obj, "null cannot be cast to non-null type net.safemoon.androidwallet.viewmodels.swap.TradeStructure");
            arrayList2.add((kt6) obj);
        }
        if (z) {
            hk0.m45272G(arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        ol0.m70350b0("bestTrades = " + new Gson().toJson((Object) arrayList), "SortedInsert-AfterSplice");
        return arrayList;
    }

    /* renamed from: t */
    public final int mo66265t(kt6 kt6, kt6 kt62) {
        int r = mo66263r(kt6, kt62);
        if (r != 0) {
            return r;
        }
        BigDecimal e = mo66251e(kt6);
        BigDecimal e2 = mo66251e(kt62);
        if (e.compareTo(e2) < 0) {
            return -1;
        }
        if (e.compareTo(e2) > 0) {
            return 1;
        }
        return kt6.mo55779d().size() - kt62.mo55779d().size();
    }
}
