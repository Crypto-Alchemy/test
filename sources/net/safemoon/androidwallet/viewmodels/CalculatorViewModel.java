package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.swap.AllSwapTokens;
import net.safemoon.androidwallet.model.swap.Data;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003NOPB\u000f\u0012\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bJ\u001c\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002R\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R%\u0010(\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0\u001e8\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"R#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u001f\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u001e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b1\u0010\"R%\u00103\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u000100000\u001e8\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\f\u0010\"R$\u0010:\u001a\u0004\u0018\u0001048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b\u0012\u00107\"\u0004\b8\u00109R\"\u0010@\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R%\u0010B\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00070\u00070\u001e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\bA\u0010\"R'\u0010I\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\b\u0012\u0004\u0012\u00020D`E8\u0006¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bG\u0010H¨\u0006Q"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel;", "Lwj;", "Lr37;", "z", "f", "h", "j", "", "digit", "D", "E", "Ljava/math/BigDecimal;", "n", "y", "k", "d", "e", "Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Operation;", "s", "A", "i", "Lvc;", "model", "Lkotlin/Function0;", "callBack", "m", "l", "x", "Lnet/safemoon/androidwallet/common/TokenType;", "q", "Lk04;", "b", "Lk04;", "p", "()Lk04;", "result", "", "kotlin.jvm.PlatformType", "c", "w", "undefinedResult", "Lux1;", "", "Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$a;", "Lux1;", "o", "()Lux1;", "equation", "", "u", "selectedTokenSymbolType", "e2Text", "", "g", "Ljava/lang/Double;", "()Ljava/lang/Double;", "C", "(Ljava/lang/Double;)V", "selectedCoinPriceUsd", "Ljava/math/BigDecimal;", "r", "()Ljava/math/BigDecimal;", "B", "(Ljava/math/BigDecimal;)V", "selectedCoinBalance", "t", "selectedMoneyButton", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/swap/Swap;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "v", "()Ljava/util/ArrayList;", "swapListMap", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "Operation", "Type", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CalculatorViewModel.kt */
public final class CalculatorViewModel extends C3552wj {

    /* renamed from: b */
    public final k04<BigDecimal> f42625b = new k04<>();

    /* renamed from: c */
    public final k04<Boolean> f42626c = new k04<>(Boolean.FALSE);

    /* renamed from: d */
    public final ux1<List<C8642a>> f42627d;

    /* renamed from: e */
    public final k04<String> f42628e;

    /* renamed from: f */
    public final k04<String> f42629f;

    /* renamed from: g */
    public Double f42630g;

    /* renamed from: h */
    public BigDecimal f42631h;

    /* renamed from: i */
    public final k04<Integer> f42632i;

    /* renamed from: j */
    public final ArrayList<Swap> f42633j;

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Operation;", "", "equation", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEquation", "()Ljava/lang/String;", "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "PERCENTAGE", "EQUAL_TO", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CalculatorViewModel.kt */
    public enum Operation {
        ADD(" + "),
        SUBTRACT(" - "),
        MULTIPLY(" x "),
        DIVIDE(" / "),
        PERCENTAGE(" % "),
        EQUAL_TO(" = ");
        
        private final String equation;

        /* access modifiers changed from: public */
        Operation(String str) {
            this.equation = str;
        }

        public final String getEquation() {
            return this.equation;
        }
    }

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Type;", "", "(Ljava/lang/String;I)V", "Operation", "Digit", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CalculatorViewModel.kt */
    public enum Type {
        Operation,
        Digit
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$a;", "", "Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Type;", "a", "Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Operation;", "b", "Ljava/math/BigDecimal;", "c", "", "toString", "", "hashCode", "other", "", "equals", "Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Type;", "f", "()Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Type;", "type", "Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Operation;", "e", "()Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Operation;", "operation", "Ljava/math/BigDecimal;", "d", "()Ljava/math/BigDecimal;", "digit", "<init>", "(Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Type;Lnet/safemoon/androidwallet/viewmodels/CalculatorViewModel$Operation;Ljava/math/BigDecimal;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a */
    /* compiled from: CalculatorViewModel.kt */
    public static final class C8642a {

        /* renamed from: a */
        public final Type f42636a;

        /* renamed from: b */
        public final Operation f42637b;

        /* renamed from: c */
        public final BigDecimal f42638c;

        public C8642a(Type type, Operation operation, BigDecimal bigDecimal) {
            vx2.m53591g(type, "type");
            this.f42636a = type;
            this.f42637b = operation;
            this.f42638c = bigDecimal;
        }

        /* renamed from: a */
        public final Type mo61018a() {
            return this.f42636a;
        }

        /* renamed from: b */
        public final Operation mo61019b() {
            return this.f42637b;
        }

        /* renamed from: c */
        public final BigDecimal mo61020c() {
            return this.f42638c;
        }

        /* renamed from: d */
        public final BigDecimal mo61021d() {
            return this.f42638c;
        }

        /* renamed from: e */
        public final Operation mo61022e() {
            return this.f42637b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8642a)) {
                return false;
            }
            C8642a aVar = (C8642a) obj;
            return this.f42636a == aVar.f42636a && this.f42637b == aVar.f42637b && vx2.m53586b(this.f42638c, aVar.f42638c);
        }

        /* renamed from: f */
        public final Type mo61024f() {
            return this.f42636a;
        }

        public int hashCode() {
            int hashCode = this.f42636a.hashCode() * 31;
            Operation operation = this.f42637b;
            int i = 0;
            int hashCode2 = (hashCode + (operation == null ? 0 : operation.hashCode())) * 31;
            BigDecimal bigDecimal = this.f42638c;
            if (bigDecimal != null) {
                i = bigDecimal.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            Type type = this.f42636a;
            Operation operation = this.f42637b;
            BigDecimal bigDecimal = this.f42638c;
            return "Calc(type=" + type + ", operation=" + operation + ", digit=" + bigDecimal + ")";
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.viewmodels.CalculatorViewModel$b */
    /* compiled from: CalculatorViewModel.kt */
    public /* synthetic */ class C8643b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42639a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Operation[] r0 = net.safemoon.androidwallet.viewmodels.CalculatorViewModel.Operation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Operation r1 = net.safemoon.androidwallet.viewmodels.CalculatorViewModel.Operation.ADD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Operation r1 = net.safemoon.androidwallet.viewmodels.CalculatorViewModel.Operation.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Operation r1 = net.safemoon.androidwallet.viewmodels.CalculatorViewModel.Operation.MULTIPLY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Operation r1 = net.safemoon.androidwallet.viewmodels.CalculatorViewModel.Operation.DIVIDE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Operation r1 = net.safemoon.androidwallet.viewmodels.CalculatorViewModel.Operation.PERCENTAGE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f42639a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CalculatorViewModel.C8643b.<clinit>():void");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/CalculatorViewModel$c", "Lp90;", "Lnet/safemoon/androidwallet/model/swap/AllSwapTokens;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.CalculatorViewModel$c */
    /* compiled from: CalculatorViewModel.kt */
    public static final class C8644c implements p90<AllSwapTokens> {

        /* renamed from: a */
        public final /* synthetic */ CalculatorViewModel f42640a;

        public C8644c(CalculatorViewModel calculatorViewModel) {
            this.f42640a = calculatorViewModel;
        }

        /* renamed from: a */
        public void mo47103a(k90<AllSwapTokens> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
        }

        /* renamed from: b */
        public void mo47104b(k90<AllSwapTokens> k90, bg5<AllSwapTokens> bg5) {
            List<Swap> list;
            Data data;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            if (bg5.mo50581e() && bg5.mo50578a() != null) {
                this.f42640a.mo61012v().clear();
                ArrayList<Swap> v = this.f42640a.mo61012v();
                AllSwapTokens a = bg5.mo50578a();
                if (a == null || (data = a.getData()) == null) {
                    list = null;
                } else {
                    list = data.getTokens();
                }
                vx2.m53588d(list);
                v.addAll(list);
                this.f42640a.mo61012v().addAll(Common.f42577a.mo60907n());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        mo61014x();
        ux1<List<C8642a>> ux1 = new ux1<>();
        ux1.setValue(new ArrayList());
        this.f42627d = ux1;
        this.f42628e = new k04<>();
        this.f42629f = new k04<>("");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        vx2.m53590f(bigDecimal, "ZERO");
        this.f42631h = bigDecimal;
        this.f42632i = new k04<>(Integer.valueOf(R.id.btnBag));
        this.f42633j = new ArrayList<>();
    }

    /* renamed from: g */
    public static final void m68402g(CalculatorViewModel calculatorViewModel) {
        vx2.m53591g(calculatorViewModel, "this$0");
        calculatorViewModel.f42627d.mo66365c(CollectionsKt___CollectionsKt.m47313M0(ck0.m33062j()));
    }

    /* renamed from: A */
    public final void mo60990A(Operation operation) {
        BigDecimal bigDecimal;
        C8642a aVar;
        List value;
        Type type;
        vx2.m53591g(operation, "s");
        if (vx2.m53586b(this.f42626c.getValue(), Boolean.TRUE)) {
            mo61000j();
        }
        try {
            String value2 = this.f42629f.getValue();
            if (value2 != null) {
                bigDecimal = ol0.m70331K(value2);
            } else {
                bigDecimal = null;
            }
            if (bigDecimal == null) {
                List value3 = this.f42627d.getValue();
                if (value3 != null) {
                    aVar = (C8642a) CollectionsKt___CollectionsKt.m47342m0(value3);
                } else {
                    aVar = null;
                }
                if (aVar == null || aVar.mo61024f() != (type = Type.Operation)) {
                    List<C8642a> value4 = this.f42627d.getValue();
                    vx2.m53588d(value4);
                    if (value4.size() > 0 && (value = this.f42627d.getValue()) != null) {
                        value.add(new C8642a(Type.Operation, operation, (BigDecimal) null));
                    }
                } else {
                    List value5 = this.f42627d.getValue();
                    if (value5 != null) {
                        C8642a aVar2 = (C8642a) hk0.m45272G(value5);
                    }
                    List value6 = this.f42627d.getValue();
                    if (value6 != null) {
                        value6.add(new C8642a(type, operation, (BigDecimal) null));
                    }
                }
            } else {
                List value7 = this.f42627d.getValue();
                if (value7 != null) {
                    value7.add(new C8642a(Type.Digit, (Operation) null, bigDecimal));
                }
                List value8 = this.f42627d.getValue();
                if (value8 != null) {
                    value8.add(new C8642a(Type.Operation, operation, (BigDecimal) null));
                }
            }
            this.f42629f.setValue("");
            mo60999i();
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: B */
    public final void mo60991B(BigDecimal bigDecimal) {
        vx2.m53591g(bigDecimal, "<set-?>");
        this.f42631h = bigDecimal;
    }

    /* renamed from: C */
    public final void mo60992C(Double d) {
        this.f42630g = d;
    }

    /* renamed from: D */
    public final void mo60993D(int i) {
        if (vx2.m53586b(this.f42626c.getValue(), Boolean.TRUE)) {
            mo61000j();
        }
        k04<String> k04 = this.f42629f;
        String value = k04.getValue();
        k04.setValue(value + i);
    }

    /* renamed from: E */
    public final void mo60994E() {
        boolean z;
        if (vx2.m53586b(this.f42626c.getValue(), Boolean.TRUE)) {
            mo61000j();
        }
        String value = this.f42629f.getValue();
        vx2.m53588d(value);
        String str = value;
        vx2.m53590f(str, "writeDot$lambda$4");
        boolean z2 = true;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Common common = Common.f42577a;
            if (!StringsKt__StringsKt.m63079Q(str, common.mo60892B(), false, 2, (Object) null)) {
                k04<String> k04 = this.f42629f;
                k04.setValue(k04.getValue() + common.mo60892B());
                return;
            }
        }
        if (str.length() != 0) {
            z2 = false;
        }
        if (z2) {
            this.f42629f.setValue("0" + Common.f42577a.mo60892B());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r0 == true) goto L_0x001e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60995d(java.math.BigDecimal r9) {
        /*
            r8 = this;
            java.lang.String r0 = "n"
            p000.vx2.m53591g(r9, r0)
            k04<java.lang.String> r0 = r8.f42629f
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0019
            r0 = r1
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            if (r0 != r1) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            if (r1 == 0) goto L_0x0033
            k04<java.lang.String> r0 = r8.f42629f
            double r1 = r9.doubleValue()
            r3 = 8
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.lang.String r9 = p000.ol0.m70374p(r1, r3, r4, r5, r6, r7)
            r0.setValue(r9)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CalculatorViewModel.mo60995d(java.math.BigDecimal):void");
    }

    /* renamed from: e */
    public final void mo60996e(BigDecimal bigDecimal) {
        vx2.m53591g(bigDecimal, "n");
        this.f42629f.setValue(ol0.m70374p(bigDecimal.doubleValue(), 8, (RoundingMode) null, false, 6, (Object) null));
    }

    /* renamed from: f */
    public final void mo60997f() {
        BigDecimal bigDecimal;
        String g0;
        List value;
        try {
            String value2 = this.f42629f.getValue();
            if (value2 != null) {
                bigDecimal = ol0.m70331K(value2);
            } else {
                bigDecimal = null;
            }
            if (!(bigDecimal == null || (value = this.f42627d.getValue()) == null)) {
                value.add(new C8642a(Type.Digit, (Operation) null, bigDecimal));
            }
            BigDecimal i = mo60999i();
            if (!(i == null || (g0 = ol0.m70360g0(i, 0, 1, (Object) null)) == null)) {
                this.f42629f.postValue(g0);
            }
            List value3 = this.f42627d.getValue();
            if (value3 != null) {
                value3.add(new C8642a(Type.Operation, Operation.EQUAL_TO, (BigDecimal) null));
            }
            new Handler(Looper.getMainLooper()).post(new h90(this));
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public final void mo60998h() {
        BigDecimal bigDecimal;
        String value = this.f42629f.getValue();
        if (value != null) {
            bigDecimal = ol0.m70331K(value);
        } else {
            bigDecimal = null;
        }
        if (bigDecimal != null) {
            k04<String> k04 = this.f42629f;
            BigDecimal divide = bigDecimal.divide(new BigDecimal(100));
            vx2.m53590f(divide, "inputValue.divide(BigDecimal(100))");
            k04.postValue(ol0.m70360g0(divide, 0, 1, (Object) null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        if (kotlin.text.StringsKt__StringsKt.m63081R(r0, "divide by zero", false, 2, (java.lang.Object) null) == true) goto L_0x013e;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.math.BigDecimal mo60999i() {
        /*
            r17 = this;
            r1 = r17
            k04<java.lang.String> r0 = r1.f42629f
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            if (r0 == 0) goto L_0x0012
            java.math.BigDecimal r0 = p000.ol0.m70331K(r0)
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            ux1<java.util.List<net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a>> r3 = r1.f42627d
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0026
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.addAll(r3)
            goto L_0x0027
        L_0x0026:
            r4 = r2
        L_0x0027:
            if (r4 == 0) goto L_0x014a
            int r3 = r4.size()
            r5 = 2
            if (r3 < r5) goto L_0x014a
            if (r0 == 0) goto L_0x003c
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a r3 = new net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Type r6 = net.safemoon.androidwallet.viewmodels.CalculatorViewModel.Type.Digit
            r3.<init>(r6, r2, r0)
            r4.add(r3)
        L_0x003c:
            java.util.Iterator r3 = r4.iterator()
            java.lang.String r0 = "it.iterator()"
            p000.vx2.m53590f(r3, r0)
        L_0x0045:
            r4 = r2
        L_0x0046:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = "this.multiply(other)"
            java.lang.String r6 = "this.subtract(other)"
            java.lang.String r7 = "this.add(other)"
            r8 = 8
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 1
            if (r4 != 0) goto L_0x00c0
            java.lang.Object r13 = r3.next()     // Catch:{ Exception -> 0x0117 }
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a r13 = (net.safemoon.androidwallet.viewmodels.CalculatorViewModel.C8642a) r13     // Catch:{ Exception -> 0x0117 }
            java.math.BigDecimal r13 = r13.mo61021d()     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53588d(r13)     // Catch:{ Exception -> 0x0117 }
            java.lang.Object r14 = r3.next()     // Catch:{ Exception -> 0x0117 }
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a r14 = (net.safemoon.androidwallet.viewmodels.CalculatorViewModel.C8642a) r14     // Catch:{ Exception -> 0x0117 }
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Operation r14 = r14.mo61022e()     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53588d(r14)     // Catch:{ Exception -> 0x0117 }
            boolean r15 = r3.hasNext()     // Catch:{ Exception -> 0x0117 }
            if (r15 == 0) goto L_0x0046
            java.lang.Object r15 = r3.next()     // Catch:{ Exception -> 0x0117 }
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a r15 = (net.safemoon.androidwallet.viewmodels.CalculatorViewModel.C8642a) r15     // Catch:{ Exception -> 0x0117 }
            java.math.BigDecimal r15 = r15.mo61021d()     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53588d(r15)     // Catch:{ Exception -> 0x0117 }
            int[] r16 = net.safemoon.androidwallet.viewmodels.CalculatorViewModel.C8643b.f42639a     // Catch:{ Exception -> 0x0117 }
            int r14 = r14.ordinal()     // Catch:{ Exception -> 0x0117 }
            r14 = r16[r14]     // Catch:{ Exception -> 0x0117 }
            if (r14 == r12) goto L_0x00b8
            if (r14 == r5) goto L_0x00b0
            if (r14 == r11) goto L_0x00a7
            if (r14 == r10) goto L_0x00a0
            if (r14 == r9) goto L_0x009a
        L_0x0099:
            goto L_0x0045
        L_0x009a:
            java.math.BigDecimal r0 = r13.remainder(r15)     // Catch:{ Exception -> 0x0117 }
        L_0x009e:
            r4 = r0
            goto L_0x0046
        L_0x00a0:
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP     // Catch:{ Exception -> 0x0117 }
            java.math.BigDecimal r0 = r13.divide(r15, r8, r0)     // Catch:{ Exception -> 0x0117 }
            goto L_0x009e
        L_0x00a7:
            java.math.BigDecimal r6 = r13.multiply(r15)     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53590f(r6, r0)     // Catch:{ Exception -> 0x0117 }
        L_0x00ae:
            r4 = r6
            goto L_0x0046
        L_0x00b0:
            java.math.BigDecimal r0 = r13.subtract(r15)     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53590f(r0, r6)     // Catch:{ Exception -> 0x0117 }
            goto L_0x009e
        L_0x00b8:
            java.math.BigDecimal r0 = r13.add(r15)     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53590f(r0, r7)     // Catch:{ Exception -> 0x0117 }
            goto L_0x009e
        L_0x00c0:
            java.lang.Object r13 = r3.next()     // Catch:{ Exception -> 0x0117 }
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a r13 = (net.safemoon.androidwallet.viewmodels.CalculatorViewModel.C8642a) r13     // Catch:{ Exception -> 0x0117 }
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Operation r13 = r13.mo61022e()     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53588d(r13)     // Catch:{ Exception -> 0x0117 }
            boolean r14 = r3.hasNext()     // Catch:{ Exception -> 0x0117 }
            if (r14 == 0) goto L_0x0046
            java.lang.Object r14 = r3.next()     // Catch:{ Exception -> 0x0117 }
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a r14 = (net.safemoon.androidwallet.viewmodels.CalculatorViewModel.C8642a) r14     // Catch:{ Exception -> 0x0117 }
            java.math.BigDecimal r14 = r14.mo61021d()     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53588d(r14)     // Catch:{ Exception -> 0x0117 }
            int[] r15 = net.safemoon.androidwallet.viewmodels.CalculatorViewModel.C8643b.f42639a     // Catch:{ Exception -> 0x0117 }
            int r13 = r13.ordinal()     // Catch:{ Exception -> 0x0117 }
            r13 = r15[r13]     // Catch:{ Exception -> 0x0117 }
            if (r13 == r12) goto L_0x010f
            if (r13 == r5) goto L_0x0107
            if (r13 == r11) goto L_0x00ff
            if (r13 == r10) goto L_0x00f8
            if (r13 == r9) goto L_0x00f3
            goto L_0x0099
        L_0x00f3:
            java.math.BigDecimal r0 = r4.remainder(r14)     // Catch:{ Exception -> 0x0117 }
            goto L_0x009e
        L_0x00f8:
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP     // Catch:{ Exception -> 0x0117 }
            java.math.BigDecimal r0 = r4.divide(r14, r8, r0)     // Catch:{ Exception -> 0x0117 }
            goto L_0x009e
        L_0x00ff:
            java.math.BigDecimal r6 = r4.multiply(r14)     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53590f(r6, r0)     // Catch:{ Exception -> 0x0117 }
            goto L_0x00ae
        L_0x0107:
            java.math.BigDecimal r0 = r4.subtract(r14)     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53590f(r0, r6)     // Catch:{ Exception -> 0x0117 }
            goto L_0x009e
        L_0x010f:
            java.math.BigDecimal r0 = r4.add(r14)     // Catch:{ Exception -> 0x0117 }
            p000.vx2.m53590f(r0, r7)     // Catch:{ Exception -> 0x0117 }
            goto L_0x009e
        L_0x0117:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = r0.getLocalizedMessage()
            r6 = 0
            if (r0 == 0) goto L_0x013d
            java.lang.String r7 = "localizedMessage"
            p000.vx2.m53590f(r0, r7)
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r7)
            java.lang.String r7 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p000.vx2.m53590f(r0, r7)
            if (r0 == 0) goto L_0x013d
            java.lang.String r7 = "divide by zero"
            boolean r0 = kotlin.text.StringsKt__StringsKt.m63081R(r0, r7, r6, r5, r2)
            if (r0 != r12) goto L_0x013d
            goto L_0x013e
        L_0x013d:
            r12 = r6
        L_0x013e:
            if (r12 == 0) goto L_0x0046
            k04<java.lang.Boolean> r0 = r1.f42626c
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.postValue(r6)
            goto L_0x0046
        L_0x0149:
            r2 = r4
        L_0x014a:
            k04<java.math.BigDecimal> r0 = r1.f42625b
            r0.postValue(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CalculatorViewModel.mo60999i():java.math.BigDecimal");
    }

    /* renamed from: j */
    public final void mo61000j() {
        this.f42626c.postValue(Boolean.FALSE);
        this.f42629f.setValue("");
        List<C8642a> value = this.f42627d.getValue();
        vx2.m53588d(value);
        value.clear();
        this.f42625b.postValue(null);
        mo61016z();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[Catch:{ NumberFormatException -> 0x00b4 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61001k() {
        /*
            r5 = this;
            k04<java.lang.Boolean> r0 = r5.f42626c
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.vx2.m53586b(r0, r1)
            if (r0 == 0) goto L_0x0011
            r5.mo61000j()
        L_0x0011:
            k04<java.lang.String> r0 = r5.f42629f     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x00b4 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002a
            int r0 = r0.length()     // Catch:{ NumberFormatException -> 0x00b4 }
            if (r0 != 0) goto L_0x0025
            r0 = r1
            goto L_0x0026
        L_0x0025:
            r0 = r2
        L_0x0026:
            if (r0 != r1) goto L_0x002a
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            if (r0 == 0) goto L_0x00a2
            ux1<java.util.List<net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a>> r0 = r5.f42627d     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ NumberFormatException -> 0x00b4 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ NumberFormatException -> 0x00b4 }
            if (r0 == 0) goto L_0x003b
            int r2 = r0.size()     // Catch:{ NumberFormatException -> 0x00b4 }
        L_0x003b:
            if (r2 <= 0) goto L_0x00a2
            k04<java.lang.String> r0 = r5.f42629f     // Catch:{ NumberFormatException -> 0x00b4 }
            ux1<java.util.List<net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a>> r2 = r5.f42627d     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ NumberFormatException -> 0x00b4 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ NumberFormatException -> 0x00b4 }
            if (r2 == 0) goto L_0x009e
            java.lang.Object r2 = p000.hk0.m45272G(r2)     // Catch:{ NumberFormatException -> 0x00b4 }
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$a r2 = (net.safemoon.androidwallet.viewmodels.CalculatorViewModel.C8642a) r2     // Catch:{ NumberFormatException -> 0x00b4 }
            if (r2 == 0) goto L_0x009e
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Type r3 = r2.mo61024f()     // Catch:{ NumberFormatException -> 0x00b4 }
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Type r4 = net.safemoon.androidwallet.viewmodels.CalculatorViewModel.Type.Operation     // Catch:{ NumberFormatException -> 0x00b4 }
            if (r3 != r4) goto L_0x006d
            net.safemoon.androidwallet.viewmodels.CalculatorViewModel$Operation r2 = r2.mo61022e()     // Catch:{ NumberFormatException -> 0x00b4 }
            p000.vx2.m53588d(r2)     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.String r2 = r2.getEquation()     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.CharSequence r2 = kotlin.text.StringsKt__StringsKt.m63090V0(r2)     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x00b4 }
            goto L_0x009f
        L_0x006d:
            net.safemoon.androidwallet.utils.Common r3 = net.safemoon.androidwallet.utils.Common.f42577a     // Catch:{ NumberFormatException -> 0x00b4 }
            java.math.BigDecimal r4 = r2.mo61021d()     // Catch:{ NumberFormatException -> 0x00b4 }
            p000.vx2.m53588d(r4)     // Catch:{ NumberFormatException -> 0x00b4 }
            java.math.BigDecimal r3 = r3.mo60906m(r4)     // Catch:{ NumberFormatException -> 0x00b4 }
            java.math.BigDecimal r4 = java.math.BigDecimal.ZERO     // Catch:{ NumberFormatException -> 0x00b4 }
            int r3 = r3.compareTo(r4)     // Catch:{ NumberFormatException -> 0x00b4 }
            if (r3 <= 0) goto L_0x008e
            java.math.BigDecimal r2 = r2.mo61021d()     // Catch:{ NumberFormatException -> 0x00b4 }
            p000.vx2.m53588d(r2)     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.String r2 = r2.toPlainString()     // Catch:{ NumberFormatException -> 0x00b4 }
            goto L_0x009f
        L_0x008e:
            java.math.BigDecimal r2 = r2.mo61021d()     // Catch:{ NumberFormatException -> 0x00b4 }
            p000.vx2.m53588d(r2)     // Catch:{ NumberFormatException -> 0x00b4 }
            long r2 = r2.longValueExact()     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ NumberFormatException -> 0x00b4 }
            goto L_0x009f
        L_0x009e:
            r2 = 0
        L_0x009f:
            r0.setValue(r2)     // Catch:{ NumberFormatException -> 0x00b4 }
        L_0x00a2:
            k04<java.lang.String> r0 = r5.f42629f     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ NumberFormatException -> 0x00b4 }
            p000.vx2.m53588d(r2)     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.String r1 = kotlin.text.StringsKt___StringsKt.m63124Z0(r2, r1)     // Catch:{ NumberFormatException -> 0x00b4 }
            r0.setValue(r1)     // Catch:{ NumberFormatException -> 0x00b4 }
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CalculatorViewModel.mo61001k():void");
    }

    /* renamed from: l */
    public final void mo61002l(C9449vc vcVar) {
        vx2.m53591g(vcVar, "model");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CalculatorViewModel$fetchTokenBalance$1$1(this, vcVar, (ns0<? super CalculatorViewModel$fetchTokenBalance$1$1>) null), 3, (Object) null);
    }

    /* renamed from: m */
    public final void mo61003m(C9449vc vcVar, pc2<r37> pc2) {
        boolean z;
        vx2.m53591g(vcVar, "model");
        vx2.m53591g(pc2, "callBack");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T a = vcVar.mo66468a();
        ref$ObjectRef.element = a;
        if (((CharSequence) a).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ref$ObjectRef.element = mo61007q().getWrapAddress();
        }
        String b = q70.m71186b(vcVar.mo66468a(), vcVar.mo66475g(), xb6.m73916n(vcVar.mo66471d()));
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new CalculatorViewModel$fetchTokenPrice$1(this, ref$ObjectRef, b, pc2, (ns0<? super CalculatorViewModel$fetchTokenPrice$1>) null), 3, (Object) null);
    }

    /* renamed from: n */
    public final k04<String> mo61004n() {
        return this.f42629f;
    }

    /* renamed from: o */
    public final ux1<List<C8642a>> mo61005o() {
        return this.f42627d;
    }

    /* renamed from: p */
    public final k04<BigDecimal> mo61006p() {
        return this.f42625b;
    }

    /* renamed from: q */
    public final TokenType mo61007q() {
        Application b = mo27549b();
        vx2.m53590f(b, "getApplication<Application>()");
        return ol0.m70355e(b);
    }

    /* renamed from: r */
    public final BigDecimal mo61008r() {
        return this.f42631h;
    }

    /* renamed from: s */
    public final Double mo61009s() {
        return this.f42630g;
    }

    /* renamed from: t */
    public final k04<Integer> mo61010t() {
        return this.f42632i;
    }

    /* renamed from: u */
    public final k04<String> mo61011u() {
        return this.f42628e;
    }

    /* renamed from: v */
    public final ArrayList<Swap> mo61012v() {
        return this.f42633j;
    }

    /* renamed from: w */
    public final k04<Boolean> mo61013w() {
        return this.f42626c;
    }

    /* renamed from: x */
    public final void mo61014x() {
        C9384u3.m72571l().mo52289r().mo50512X(new C8644c(this));
    }

    /* renamed from: y */
    public final void mo61015y(BigDecimal bigDecimal) {
        boolean z;
        vx2.m53591g(bigDecimal, "n");
        if (vx2.m53586b(this.f42626c.getValue(), Boolean.TRUE)) {
            mo61000j();
        }
        try {
            String value = this.f42629f.getValue();
            vx2.m53588d(value);
            if (value.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String value2 = this.f42629f.getValue();
                vx2.m53588d(value2);
                BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(ol0.m70330J(value2)));
                k04<String> k04 = this.f42629f;
                BigDecimal multiply = bigDecimal2.multiply(bigDecimal);
                vx2.m53590f(multiply, "this.multiply(other)");
                k04.setValue(ol0.m70360g0(multiply, 0, 1, (Object) null));
                return;
            }
            this.f42629f.setValue(ol0.m70360g0(bigDecimal, 0, 1, (Object) null));
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: z */
    public final void mo61016z() {
        List value = this.f42627d.getValue();
        if (value != null) {
            this.f42627d.setValue(value);
        }
    }
}
