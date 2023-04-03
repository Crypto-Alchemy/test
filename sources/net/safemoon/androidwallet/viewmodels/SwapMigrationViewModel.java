package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.github.mikephil.charting.utils.Utils;
import com.google.gson.Gson;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.ERC20;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.Gas;
import net.safemoon.androidwallet.model.common.GasPrice;
import net.safemoon.androidwallet.model.common.LoadingState;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0007\u0001\u0001.48B\u0013\u0012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001b\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!J\u0006\u0010$\u001a\u00020\u0005J\u0006\u0010%\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020\u0005J\u0006\u0010(\u001a\u00020\u0005J\u0006\u0010*\u001a\u00020)J\u0006\u0010+\u001a\u00020\u0014R1\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u0003*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010-0-0,8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001f\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,8\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R%\u0010:\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u000107070,8\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R%\u0010>\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010;0;0,8\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b=\u00101R%\u0010A\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010!0!0,8\u0006¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b@\u00101R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0,8\u0006¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bC\u00101R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000e0,8\u0006¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bF\u00101R\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020H0,8\u0006¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101R\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020H0,8\u0006¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\bM\u00101R\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u0002070,8\u0006¢\u0006\f\n\u0004\bO\u0010/\u001a\u0004\bP\u00101R\u001d\u0010T\u001a\b\u0012\u0004\u0012\u0002070,8\u0006¢\u0006\f\n\u0004\bR\u0010/\u001a\u0004\bS\u00101R\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00140,8\u0006¢\u0006\f\n\u0004\bU\u0010/\u001a\u0004\bV\u00101R\u001f\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0,8\u0006¢\u0006\f\n\u0004\bY\u0010/\u001a\u0004\bZ\u00101R%\u0010_\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\\0\\0,8\u0006¢\u0006\f\n\u0004\b]\u0010/\u001a\u0004\b^\u00101R\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020H0,8\u0006¢\u0006\f\n\u0004\b`\u0010/\u001a\u0004\ba\u00101R\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020!0,8\u0006¢\u0006\f\n\u0004\bc\u0010/\u001a\u0004\bd\u00101R%\u0010h\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\\0\\0,8\u0006¢\u0006\f\n\u0004\bf\u0010/\u001a\u0004\bg\u00101R\u0014\u0010l\u001a\u00020i8\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001b\u0010q\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001b\u0010t\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\br\u0010n\u001a\u0004\bs\u0010pR#\u0010y\u001a\n \u0003*\u0004\u0018\u00010u0u8BX\u0002¢\u0006\f\n\u0004\bv\u0010n\u001a\u0004\bw\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0019\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010R\u001e\u0010\u0001\u001a\n \u0003*\u0004\u0018\u00010\u00070\u00078\u0002X\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0001R\u0019\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X.¢\u0006\u0007\n\u0005\b\u001a\u0010\u0001R\u0019\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X.¢\u0006\u0007\n\u0005\b\u0017\u0010\u0001R\u0019\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010R\u001a\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010R\u0019\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010R\u001a\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010R\u0019\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010R\u0019\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010R \u0010\u0001\u001a\b\u0012\u0004\u0012\u0002070,8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010/\u001a\u0005\b\u0001\u00101R\u001f\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002070,8\u0006¢\u0006\r\n\u0004\bw\u0010/\u001a\u0005\b\u0001\u00101R\u001f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020)0,8\u0006¢\u0006\r\n\u0004\b@\u0010/\u001a\u0005\b\u0001\u00101R\u0019\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010R'\u0010\u0001\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\\0\\0,8\u0006¢\u0006\r\n\u0004\bF\u0010/\u001a\u0005\b\u0001\u00101R \u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010,8\u0006¢\u0006\r\n\u0004\bS\u0010/\u001a\u0005\b\u0001\u00101\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel;", "Lwj;", "Lvj7;", "kotlin.jvm.PlatformType", "x0", "Lr37;", "D", "Ljava/math/BigInteger;", "Q", "gasLimit", "Lit0;", "R", "k0", "l0", "Lnet/safemoon/androidwallet/model/swap/Swap;", "swap", "a0", "i0", "j0", "N", "", "transactionHash", "Lks1;", "A", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "trxHash", "z", "u0", "o0", "m0", "Lug3;", "lifecycle", "p0", "", "resId", "b0", "n0", "x", "w0", "y", "v0", "", "h0", "U", "Lk04;", "", "b", "Lk04;", "c0", "()Lk04;", "swapListMap", "Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$a;", "c", "d0", "tilEnterAmount", "", "d", "W", "slipPage", "Lnet/safemoon/androidwallet/model/common/Gas;", "e", "P", "gas", "f", "J", "deadTime", "g", "Y", "sourceLiveData", "h", "L", "destinationLiveData", "Ljava/math/BigDecimal;", "i", "X", "sourceBalance", "j", "K", "destinationBalance", "k", "Z", "sourcePrice", "l", "M", "destinationPrice", "m", "e0", "transactionFee", "Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$c;", "n", "f0", "transactionGasLimit", "Lnet/safemoon/androidwallet/model/common/LoadingState;", "o", "O", "findBestMaxValueProgress", "p", "V", "setBestMaxValue", "q", "G", "approveSwap", "r", "F", "approvaSwapLoading", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "s", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "gasPrice", "t", "Lef3;", "T", "()Ljava/lang/String;", "privateKey", "u", "B", "address", "Lcw0;", "v", "I", "()Lcw0;", "credentails", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/MigrationToV2;", "w", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/MigrationToV2;", "migrationToV2", "Ly23;", "Ly23;", "amountOutJob", "Ljava/math/BigInteger;", "GAS_LIMIT", "Lnet/safemoon/androidwallet/ERC20;", "Lnet/safemoon/androidwallet/ERC20;", "erc20Source", "erc20Destination", "sourceJobBalance", "C", "sourceJobMarket", "destinationJobBalance", "E", "destinationJobMarket", "gasJob", "approveStatus", "H", "amountDestinationMin", "amountSource", "bestTradeLoad", "bestAmountJob", "S", "loadingState", "Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$d;", "g0", "transactionResult", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "ApproveStatus", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationViewModel.kt */
public final class SwapMigrationViewModel extends C3552wj {

    /* renamed from: N */
    public static final C8739b f42838N = new C8739b((DefaultConstructorMarker) null);

    /* renamed from: A */
    public ERC20 f42839A;

    /* renamed from: B */
    public y23 f42840B;

    /* renamed from: C */
    public y23 f42841C;

    /* renamed from: D */
    public y23 f42842D;

    /* renamed from: E */
    public y23 f42843E;

    /* renamed from: F */
    public y23 f42844F;

    /* renamed from: G */
    public y23 f42845G;

    /* renamed from: H */
    public final k04<Double> f42846H;

    /* renamed from: I */
    public final k04<Double> f42847I;

    /* renamed from: J */
    public final k04<Boolean> f42848J;

    /* renamed from: K */
    public y23 f42849K;

    /* renamed from: L */
    public final k04<LoadingState> f42850L;

    /* renamed from: M */
    public final k04<C8741d> f42851M;

    /* renamed from: b */
    public final k04<List<Swap>> f42852b = new k04<>(ck0.m33062j());

    /* renamed from: c */
    public final k04<C8738a> f42853c;

    /* renamed from: d */
    public final k04<Double> f42854d;

    /* renamed from: e */
    public final k04<Gas> f42855e;

    /* renamed from: f */
    public final k04<Integer> f42856f;

    /* renamed from: g */
    public final k04<Swap> f42857g;

    /* renamed from: h */
    public final k04<Swap> f42858h;

    /* renamed from: i */
    public final k04<BigDecimal> f42859i;

    /* renamed from: j */
    public final k04<BigDecimal> f42860j;

    /* renamed from: k */
    public final k04<Double> f42861k;

    /* renamed from: l */
    public final k04<Double> f42862l;

    /* renamed from: m */
    public final k04<String> f42863m;

    /* renamed from: n */
    public final k04<C8740c> f42864n;

    /* renamed from: o */
    public final k04<LoadingState> f42865o;

    /* renamed from: p */
    public final k04<BigDecimal> f42866p;

    /* renamed from: q */
    public final k04<Integer> f42867q;

    /* renamed from: r */
    public final k04<LoadingState> f42868r;

    /* renamed from: s */
    public final GasPrice f42869s;

    /* renamed from: t */
    public final ef3 f42870t;

    /* renamed from: u */
    public final ef3 f42871u;

    /* renamed from: v */
    public final ef3 f42872v;

    /* renamed from: w */
    public MigrationToV2 f42873w;

    /* renamed from: x */
    public y23 f42874x;

    /* renamed from: y */
    public final BigInteger f42875y;

    /* renamed from: z */
    public ERC20 f42876z;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$ApproveStatus;", "", "(Ljava/lang/String;I)V", "ALLOWED", "FAILED", "CONFUSE", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SwapMigrationViewModel.kt */
    public enum ApproveStatus {
        ALLOWED,
        FAILED,
        CONFUSE
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "isSource", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "amount", "<init>", "(ZLjava/math/BigDecimal;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$a */
    /* compiled from: SwapMigrationViewModel.kt */
    public static final class C8738a {

        /* renamed from: a */
        public final boolean f42878a;

        /* renamed from: b */
        public final BigDecimal f42879b;

        public C8738a(boolean z, BigDecimal bigDecimal) {
            vx2.m53591g(bigDecimal, "amount");
            this.f42878a = z;
            this.f42879b = bigDecimal;
        }

        /* renamed from: a */
        public final BigDecimal mo61484a() {
            return this.f42879b;
        }

        /* renamed from: b */
        public final boolean mo61485b() {
            return this.f42878a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8738a)) {
                return false;
            }
            C8738a aVar = (C8738a) obj;
            return this.f42878a == aVar.f42878a && vx2.m53586b(this.f42879b, aVar.f42879b);
        }

        public int hashCode() {
            boolean z = this.f42878a;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f42879b.hashCode();
        }

        public String toString() {
            boolean z = this.f42878a;
            BigDecimal bigDecimal = this.f42879b;
            return "AMOUNT(isSource=" + z + ", amount=" + bigDecimal + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$b;", "", "", "FUNCTION_ERROR", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$b */
    /* compiled from: SwapMigrationViewModel.kt */
    public static final class C8739b {
        public C8739b() {
        }

        public /* synthetic */ C8739b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/math/BigInteger;", "a", "Ljava/math/BigInteger;", "getAmount", "()Ljava/math/BigInteger;", "amount", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "method", "<init>", "(Ljava/math/BigInteger;Ljava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$c */
    /* compiled from: SwapMigrationViewModel.kt */
    public static final class C8740c {

        /* renamed from: a */
        public final BigInteger f42880a;

        /* renamed from: b */
        public final String f42881b;

        public C8740c(BigInteger bigInteger, String str) {
            vx2.m53591g(bigInteger, "amount");
            vx2.m53591g(str, "method");
            this.f42880a = bigInteger;
            this.f42881b = str;
        }

        /* renamed from: a */
        public final String mo61489a() {
            return this.f42881b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8740c)) {
                return false;
            }
            C8740c cVar = (C8740c) obj;
            return vx2.m53586b(this.f42880a, cVar.f42880a) && vx2.m53586b(this.f42881b, cVar.f42881b);
        }

        public int hashCode() {
            return (this.f42880a.hashCode() * 31) + this.f42881b.hashCode();
        }

        public String toString() {
            BigInteger bigInteger = this.f42880a;
            String str = this.f42881b;
            return "GasLimit(amount=" + bigInteger + ", method=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "isSuccess", "Ljava/lang/String;", "()Ljava/lang/String;", "message", "<init>", "(ZLjava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$d */
    /* compiled from: SwapMigrationViewModel.kt */
    public static final class C8741d {

        /* renamed from: a */
        public final boolean f42882a;

        /* renamed from: b */
        public final String f42883b;

        public C8741d(boolean z, String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f42882a = z;
            this.f42883b = str;
        }

        /* renamed from: a */
        public final String mo61493a() {
            return this.f42883b;
        }

        /* renamed from: b */
        public final boolean mo61494b() {
            return this.f42882a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8741d)) {
                return false;
            }
            C8741d dVar = (C8741d) obj;
            return this.f42882a == dVar.f42882a && vx2.m53586b(this.f42883b, dVar.f42883b);
        }

        public int hashCode() {
            boolean z = this.f42882a;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f42883b.hashCode();
        }

        public String toString() {
            boolean z = this.f42882a;
            String str = this.f42883b;
            return "TransactionResult(isSuccess=" + z + ", message=" + str + ")";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        mo61473m0();
        this.f42853c = new k04<>();
        this.f42854d = new k04<>(Double.valueOf(12.0d));
        this.f42855e = new k04<>(Gas.Standard);
        this.f42856f = new k04<>(20);
        this.f42857g = new k04<>();
        this.f42858h = new k04<>();
        this.f42859i = new k04<>();
        this.f42860j = new k04<>();
        this.f42861k = new k04<>();
        this.f42862l = new k04<>();
        this.f42863m = new k04<>("");
        this.f42864n = new k04<>();
        LoadingState loadingState = LoadingState.Normal;
        this.f42865o = new k04<>(loadingState);
        this.f42866p = new k04<>();
        this.f42867q = new k04<>(0);
        this.f42868r = new k04<>(loadingState);
        this.f42869s = new GasPrice();
        this.f42870t = C6169a.m47232a(new SwapMigrationViewModel$privateKey$2(application));
        this.f42871u = C6169a.m47232a(new SwapMigrationViewModel$address$2(application));
        this.f42872v = C6169a.m47232a(new SwapMigrationViewModel$credentails$2(this));
        this.f42875y = BigInteger.valueOf(9000000);
        Double valueOf = Double.valueOf(Utils.DOUBLE_EPSILON);
        this.f42846H = new k04<>(valueOf);
        this.f42847I = new k04<>(valueOf);
        this.f42848J = new k04<>(Boolean.FALSE);
        this.f42850L = new k04<>(loadingState);
        this.f42851M = new k04<>();
    }

    /* renamed from: q0 */
    public static final void m68877q0(SwapMigrationViewModel swapMigrationViewModel, Swap swap) {
        vx2.m53591g(swapMigrationViewModel, "this$0");
        if (swap != null) {
            swapMigrationViewModel.mo61471k0();
            swapMigrationViewModel.mo61474n0();
        }
    }

    /* renamed from: r0 */
    public static final void m68879r0(SwapMigrationViewModel swapMigrationViewModel, Swap swap) {
        vx2.m53591g(swapMigrationViewModel, "this$0");
        if (swap != null) {
            swapMigrationViewModel.mo61469i0();
            swapMigrationViewModel.mo61474n0();
        }
    }

    /* renamed from: s0 */
    public static final void m68881s0(SwapMigrationViewModel swapMigrationViewModel, Double d) {
        vx2.m53591g(swapMigrationViewModel, "this$0");
        swapMigrationViewModel.mo61474n0();
    }

    /* renamed from: t0 */
    public static final void m68883t0(SwapMigrationViewModel swapMigrationViewModel, Gas gas) {
        vx2.m53591g(swapMigrationViewModel, "this$0");
        swapMigrationViewModel.mo61474n0();
    }

    /* renamed from: A */
    public final Object mo61435A(String str, ns0<? super ks1> ns0) {
        ks1 send = mo61481x0().ethGetTransactionReceipt(str).send();
        vx2.m53590f(send, "web3().ethGetTransaction…t(transactionHash).send()");
        return send;
    }

    /* renamed from: B */
    public final String mo61436B() {
        return (String) this.f42871u.getValue();
    }

    /* renamed from: C */
    public final k04<Double> mo61437C() {
        return this.f42846H;
    }

    /* renamed from: D */
    public final void mo61438D() {
        this.f42874x = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapMigrationViewModel$getAmountOut$1(this, (ns0<? super SwapMigrationViewModel$getAmountOut$1>) null), 3, (Object) null);
    }

    /* renamed from: E */
    public final k04<Double> mo61439E() {
        return this.f42847I;
    }

    /* renamed from: F */
    public final k04<LoadingState> mo61440F() {
        return this.f42868r;
    }

    /* renamed from: G */
    public final k04<Integer> mo61441G() {
        return this.f42867q;
    }

    /* renamed from: H */
    public final k04<Boolean> mo61442H() {
        return this.f42848J;
    }

    /* renamed from: I */
    public final cw0 mo61443I() {
        return (cw0) this.f42872v.getValue();
    }

    /* renamed from: J */
    public final k04<Integer> mo61444J() {
        return this.f42856f;
    }

    /* renamed from: K */
    public final k04<BigDecimal> mo61445K() {
        return this.f42860j;
    }

    /* renamed from: L */
    public final k04<Swap> mo61446L() {
        return this.f42858h;
    }

    /* renamed from: M */
    public final k04<Double> mo61447M() {
        return this.f42862l;
    }

    /* renamed from: N */
    public final void mo61448N(Swap swap) {
        y23 y23 = this.f42843E;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42843E = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapMigrationViewModel$getDestinationPriceFromCMC$1(swap, this, (ns0<? super SwapMigrationViewModel$getDestinationPriceFromCMC$1>) null), 3, (Object) null);
    }

    /* renamed from: O */
    public final k04<LoadingState> mo61449O() {
        return this.f42865o;
    }

    /* renamed from: P */
    public final k04<Gas> mo61450P() {
        return this.f42855e;
    }

    /* renamed from: Q */
    public final BigInteger mo61451Q() {
        Swap value = this.f42857g.getValue();
        if (value == null) {
            return BigInteger.ZERO;
        }
        if (mo61468h0()) {
            GasPrice gasPrice = this.f42869s;
            Gas value2 = this.f42855e.getValue();
            vx2.m53588d(value2);
            Integer num = value.chainId;
            vx2.m53590f(num, "it.chainId");
            return new BigDecimal(gasPrice.getPrice(value2, num.intValue())).multiply(BigDecimal.TEN.pow(9)).toBigInteger();
        }
        GasPrice gasPrice2 = this.f42869s;
        Gas value3 = this.f42855e.getValue();
        vx2.m53588d(value3);
        Integer num2 = value.chainId;
        vx2.m53590f(num2, "it.chainId");
        return new BigDecimal(gasPrice2.getPrice(value3, num2.intValue())).multiply(BigDecimal.TEN.pow(9)).toBigInteger();
    }

    /* renamed from: R */
    public final it0 mo61452R(BigInteger bigInteger) {
        return new h96(mo61451Q(), bigInteger);
    }

    /* renamed from: S */
    public final k04<LoadingState> mo61453S() {
        return this.f42850L;
    }

    /* renamed from: T */
    public final String mo61454T() {
        return (String) this.f42870t.getValue();
    }

    /* renamed from: U */
    public final String mo61455U() {
        Integer num;
        String z;
        Swap value = this.f42857g.getValue();
        if (value == null || (num = value.chainId) == null || (z = ol0.m70384z(num.intValue())) == null) {
            return "https://noRPC";
        }
        return z;
    }

    /* renamed from: V */
    public final k04<BigDecimal> mo61456V() {
        return this.f42866p;
    }

    /* renamed from: W */
    public final k04<Double> mo61457W() {
        return this.f42854d;
    }

    /* renamed from: X */
    public final k04<BigDecimal> mo61458X() {
        return this.f42859i;
    }

    /* renamed from: Y */
    public final k04<Swap> mo61459Y() {
        return this.f42857g;
    }

    /* renamed from: Z */
    public final k04<Double> mo61460Z() {
        return this.f42861k;
    }

    /* renamed from: a0 */
    public final void mo61461a0(Swap swap) {
        y23 y23 = this.f42841C;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42841C = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapMigrationViewModel$getSourcePriceFromCMC$1(swap, this, (ns0<? super SwapMigrationViewModel$getSourcePriceFromCMC$1>) null), 3, (Object) null);
    }

    /* renamed from: b0 */
    public final String mo61462b0(int i) {
        String string = mo27549b().getString(i);
        vx2.m53590f(string, "getApplication<Application>().getString(resId)");
        return string;
    }

    /* renamed from: c0 */
    public final k04<List<Swap>> mo61463c0() {
        return this.f42852b;
    }

    /* renamed from: d0 */
    public final k04<C8738a> mo61464d0() {
        return this.f42853c;
    }

    /* renamed from: e0 */
    public final k04<String> mo61465e0() {
        return this.f42863m;
    }

    /* renamed from: f0 */
    public final k04<C8740c> mo61466f0() {
        return this.f42864n;
    }

    /* renamed from: g0 */
    public final k04<C8741d> mo61467g0() {
        return this.f42851M;
    }

    /* renamed from: h0 */
    public final boolean mo61468h0() {
        Integer num;
        Swap value = this.f42857g.getValue();
        if (value != null) {
            num = value.chainId;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            return true;
        }
        if (num != null && num.intValue() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public final void mo61469i0() {
        this.f42860j.postValue(BigDecimal.ZERO);
        Swap value = this.f42858h.getValue();
        vx2.m53588d(value);
        String D = ol0.m70324D(value);
        vj7 x0 = mo61481x0();
        cw0 I = mo61443I();
        BigInteger bigInteger = this.f42875y;
        vx2.m53590f(bigInteger, "GAS_LIMIT");
        ERC20 r = ERC20.m64654r(D, x0, I, mo61452R(bigInteger));
        vx2.m53590f(r, "load(swap.getWrapAddress…etGasProvider(GAS_LIMIT))");
        this.f42839A = r;
        mo61470j0();
    }

    /* renamed from: j0 */
    public final void mo61470j0() {
        Swap value = this.f42858h.getValue();
        vx2.m53588d(value);
        Swap swap = value;
        y23 y23 = this.f42842D;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42842D = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapMigrationViewModel$loadDestinationBalance$1(swap, this, (ns0<? super SwapMigrationViewModel$loadDestinationBalance$1>) null), 3, (Object) null);
        y23 y232 = this.f42843E;
        if (y232 != null) {
            y23.C9621a.m74226a(y232, (CancellationException) null, 1, (Object) null);
        }
        this.f42843E = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapMigrationViewModel$loadDestinationBalance$2(swap, this, (ns0<? super SwapMigrationViewModel$loadDestinationBalance$2>) null), 3, (Object) null);
    }

    /* renamed from: k0 */
    public final void mo61471k0() {
        this.f42859i.postValue(BigDecimal.ZERO);
        Swap value = this.f42857g.getValue();
        vx2.m53588d(value);
        String D = ol0.m70324D(value);
        vj7 x0 = mo61481x0();
        cw0 I = mo61443I();
        BigInteger bigInteger = this.f42875y;
        vx2.m53590f(bigInteger, "GAS_LIMIT");
        ERC20 r = ERC20.m64654r(D, x0, I, mo61452R(bigInteger));
        vx2.m53590f(r, "load(swap.getWrapAddress…etGasProvider(GAS_LIMIT))");
        this.f42876z = r;
        mo61472l0();
    }

    /* renamed from: l0 */
    public final void mo61472l0() {
        Swap value = this.f42857g.getValue();
        vx2.m53588d(value);
        Swap swap = value;
        y23 y23 = this.f42840B;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42840B = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapMigrationViewModel$loadSourceBalance$1(swap, this, (ns0<? super SwapMigrationViewModel$loadSourceBalance$1>) null), 3, (Object) null);
        y23 y232 = this.f42841C;
        if (y232 != null) {
            y23.C9621a.m74226a(y232, (CancellationException) null, 1, (Object) null);
        }
        this.f42841C = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapMigrationViewModel$loadSourceBalance$2(swap, this, (ns0<? super SwapMigrationViewModel$loadSourceBalance$2>) null), 3, (Object) null);
    }

    /* renamed from: m0 */
    public final void mo61473m0() {
        k04<List<Swap>> k04 = this.f42852b;
        Gson gson = new Gson();
        MigrationToV2.C8878a aVar = MigrationToV2.f43025o;
        k04.postValue(ck0.m33065m((Swap) gson.fromJson(aVar.mo61833a(), Swap.class), (Swap) new Gson().fromJson(aVar.mo61834b(), Swap.class)));
    }

    /* renamed from: n0 */
    public final void mo61474n0() {
        this.f42864n.postValue(null);
        this.f42863m.setValue("");
        if (this.f42857g.getValue() != null && this.f42858h.getValue() != null) {
            this.f42848J.setValue(Boolean.TRUE);
            Application b = mo27549b();
            vx2.m53590f(b, "getApplication()");
            Swap value = this.f42857g.getValue();
            vx2.m53588d(value);
            Swap value2 = this.f42858h.getValue();
            vx2.m53588d(value2);
            this.f42873w = new MigrationToV2(b, value, value2);
            y23 y23 = this.f42874x;
            if (y23 != null) {
                y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
            }
            mo61438D();
        }
    }

    /* renamed from: o0 */
    public final void mo61475o0(String str) {
        this.f42851M.setValue(new C8741d(true, str));
        k04<C8738a> k04 = this.f42853c;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        vx2.m53590f(bigDecimal, "ZERO");
        k04.setValue(new C8738a(true, bigDecimal));
    }

    /* renamed from: p0 */
    public final void mo61476p0(ug3 ug3) {
        vx2.m53591g(ug3, "lifecycle");
        this.f42864n.postValue(null);
        this.f42863m.setValue("");
        this.f42857g.observe(ug3, new mi6(this));
        this.f42858h.observe(ug3, new ni6(this));
        LiveData<X> a = qw6.m25941a(this.f42854d);
        vx2.m53590f(a, "Transformations.distinctUntilChanged(this)");
        a.observe(ug3, new oi6(this));
        LiveData<X> a2 = qw6.m25941a(this.f42855e);
        vx2.m53590f(a2, "Transformations.distinctUntilChanged(this)");
        a2.observe(ug3, new pi6(this));
    }

    /* renamed from: u0 */
    public final void mo61477u0() {
        String str;
        double d;
        Swap value = this.f42857g.getValue();
        if (value != null) {
            try {
                C8738a value2 = this.f42853c.getValue();
                vx2.m53588d(value2);
                if (value2.mo61485b()) {
                    C8738a value3 = this.f42853c.getValue();
                    vx2.m53588d(value3);
                    d = value3.mo61484a().doubleValue();
                } else {
                    Double value4 = this.f42847I.getValue();
                    vx2.m53588d(value4);
                    vx2.m53590f(value4, "{\n                    am…value!!\n                }");
                    d = value4.doubleValue();
                }
                BigDecimal value5 = this.f42859i.getValue();
                vx2.m53588d(value5);
                if (d > value5.doubleValue()) {
                    this.f42863m.postValue(mo61462b0(R.string.swap_amount_less_available_balance));
                    return;
                }
                throw new Exception("For Throw to show bottom msg");
            } catch (Exception unused) {
                if (mo61468h0()) {
                    str = "ETH";
                } else {
                    str = "BNB";
                }
                if (yb6.m74344y(value.symbol, str, true)) {
                    k04<String> k04 = this.f42863m;
                    String b0 = mo61462b0(R.string.swap_transactionFee_insufficent1);
                    String b02 = mo61462b0(R.string.swap_transactionFee_insufficent2);
                    k04.postValue(b0 + str + b02);
                    return;
                }
                k04<String> k042 = this.f42863m;
                String b03 = mo61462b0(R.string.swap_transactionFee_not_enough1);
                String b04 = mo61462b0(R.string.swap_transactionFee_not_enough2);
                k042.postValue(b03 + str + b04);
            }
        }
    }

    /* renamed from: v0 */
    public final void mo61478v0() {
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapMigrationViewModel$swapTokens$1(this, (ns0<? super SwapMigrationViewModel$swapTokens$1>) null), 3, (Object) null);
    }

    /* renamed from: w0 */
    public final void mo61479w0() {
        k04<BigDecimal> k04 = this.f42859i;
        k04.postValue(k04.getValue());
        k04<BigDecimal> k042 = this.f42860j;
        k042.postValue(k042.getValue());
    }

    /* renamed from: x */
    public final void mo61480x() {
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapMigrationViewModel$approve$1(this, (ns0<? super SwapMigrationViewModel$approve$1>) null), 3, (Object) null);
    }

    /* renamed from: x0 */
    public final vj7 mo61481x0() {
        return uj7.m72805a(new hn2(mo61455U()));
    }

    /* renamed from: y */
    public final void mo61482y() {
        y23 y23 = this.f42841C;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        y23 y232 = this.f42840B;
        if (y232 != null) {
            y23.C9621a.m74226a(y232, (CancellationException) null, 1, (Object) null);
        }
        y23 y233 = this.f42843E;
        if (y233 != null) {
            y23.C9621a.m74226a(y233, (CancellationException) null, 1, (Object) null);
        }
        y23 y234 = this.f42842D;
        if (y234 != null) {
            y23.C9621a.m74226a(y234, (CancellationException) null, 1, (Object) null);
        }
        y23 y235 = this.f42844F;
        if (y235 != null) {
            y23.C9621a.m74226a(y235, (CancellationException) null, 1, (Object) null);
        }
        y23 y236 = this.f42849K;
        if (y236 != null) {
            y23.C9621a.m74226a(y236, (CancellationException) null, 1, (Object) null);
        }
        this.f42853c.postValue(null);
        this.f42859i.postValue(BigDecimal.ZERO);
        this.f42860j.postValue(BigDecimal.ZERO);
        k04<Swap> k04 = this.f42857g;
        k04.postValue(k04.getValue());
        k04<Swap> k042 = this.f42858h;
        k042.postValue(k042.getValue());
        this.f42868r.postValue(LoadingState.Normal);
        this.f42867q.postValue(0);
    }

    /* renamed from: z */
    public final void mo61483z(String str) {
        y23 y23 = this.f42845G;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42845G = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapMigrationViewModel$checkApproveStatus$1(this, str, (ns0<? super SwapMigrationViewModel$checkApproveStatus$1>) null), 3, (Object) null);
    }
}
