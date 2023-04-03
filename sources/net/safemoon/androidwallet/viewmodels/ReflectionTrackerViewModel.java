package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsData;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsTokenAndData;
import net.safemoon.androidwallet.repository.ReflectionDataSource;
import net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.utils.ReflectionCustomContract;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003Z[\\B\u000f\u0012\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012J\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016J\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00162\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aJ\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u001f\u001a\u00020\u0004J\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b0 J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007J\u0006\u0010$\u001a\u00020\u001bJ\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*R\u001f\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001f\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u001a8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u001b\u0010;\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0002¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010DR%\u0010J\u001a\u0010\u0012\f\u0012\n G*\u0004\u0018\u00010F0F0\u001a8\u0006¢\u0006\f\n\u0004\bH\u0010.\u001a\u0004\bI\u00100R.\u0010N\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0018 G*\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010K0K0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0002¢\u0006\f\n\u0004\bP\u00108\u001a\u0004\bQ\u0010RR$\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010T\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel;", "Lwj;", "Lhu0;", "j", "Lr37;", "D", "C", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "rt", "B", "(Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;Lns0;)Ljava/lang/Object;", "", "timeWait", "Ldg5;", "blockOfDate", "Ljava/math/BigInteger;", "A", "(JLnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;Ldg5;Lns0;)Ljava/lang/Object;", "", "symbolWithType", "Landroidx/lifecycle/LiveData;", "n", "Lz42;", "", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsDataAndToken;", "m", "Lk04;", "Lnet/safemoon/androidwallet/common/TokenType;", "chainTokenType", "l", "z", "H", "", "v", "rrt", "k", "t", "x", "E", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeSpan;", "timeSpan", "G", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeMode;", "timeMode", "F", "b", "Lk04;", "u", "()Lk04;", "selectedNetwork", "Ljava/util/Date;", "c", "q", "loadingReflectionLiveData", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "d", "Lef3;", "s", "()Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "reflectionDataSource", "Lnet/safemoon/androidwallet/repository/dataSource/token/user/LocalUserTokenDataSource;", "e", "w", "()Lnet/safemoon/androidwallet/repository/dataSource/token/user/LocalUserTokenDataSource;", "userDataSource", "Lnet/safemoon/androidwallet/utils/ReflectionCustomContract;", "f", "r", "()Lnet/safemoon/androidwallet/utils/ReflectionCustomContract;", "reflectionCustomContract", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$a;", "kotlin.jvm.PlatformType", "g", "o", "filterReflectionDataParam", "", "h", "Landroidx/lifecycle/LiveData;", "reflectionData", "Ldo2;", "i", "p", "()Ldo2;", "getTokenTypeMapUseCase", "Ljava/util/Map;", "tokenTypeListValues", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "TimeMode", "TimeSpan", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionTrackerViewModel.kt */
public final class ReflectionTrackerViewModel extends C3552wj {

    /* renamed from: b */
    public final k04<TokenType> f42794b = new k04<>(mo61348t());

    /* renamed from: c */
    public final k04<Date> f42795c = new k04<>();

    /* renamed from: d */
    public final ef3 f42796d;

    /* renamed from: e */
    public final ef3 f42797e;

    /* renamed from: f */
    public final ef3 f42798f;

    /* renamed from: g */
    public final k04<C8722a> f42799g;

    /* renamed from: h */
    public final LiveData<List<RoomReflectionsDataAndToken>> f42800h;

    /* renamed from: i */
    public final ef3 f42801i;

    /* renamed from: j */
    public Map<String, ? extends TokenType> f42802j;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeMode;", "", "(Ljava/lang/String;I)V", "DAILY", "WEEKLY", "MONTHLY", "YEARLY", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: ReflectionTrackerViewModel.kt */
    public enum TimeMode {
        DAILY,
        WEEKLY,
        MONTHLY,
        YEARLY
    }

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeSpan;", "", "(Ljava/lang/String;I)V", "LOW", "MEDIUM", "HIGH", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: ReflectionTrackerViewModel.kt */
    public enum TimeSpan {
        LOW,
        MEDIUM,
        HIGH
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$b */
    /* compiled from: ReflectionTrackerViewModel.kt */
    public /* synthetic */ class C8723b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42808a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode[] r0 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.WEEKLY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.MONTHLY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r1 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.TimeMode.YEARLY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f42808a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.C8723b.<clinit>():void");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$c */
    /* compiled from: Transformations.kt */
    public static final class C8724c<I, O> implements sd2<List<? extends RoomReflectionsTokenAndData>, List<RoomReflectionsToken>> {

        /* renamed from: a */
        public final /* synthetic */ ReflectionTrackerViewModel f42809a;

        public C8724c(ReflectionTrackerViewModel reflectionTrackerViewModel) {
            this.f42809a = reflectionTrackerViewModel;
        }

        public final List<RoomReflectionsToken> apply(List<? extends RoomReflectionsTokenAndData> list) {
            int i;
            String str;
            String packageName = this.f42809a.mo27549b().getPackageName();
            ArrayList arrayList = new ArrayList();
            for (RoomReflectionsTokenAndData roomReflectionsTokenAndData : list) {
                RoomReflectionsToken token = roomReflectionsTokenAndData.getToken();
                if (token != null) {
                    if (xb6.m73916n(token.getIconResName()) == null) {
                        i = Integer.valueOf(this.f42809a.mo27549b().getResources().getIdentifier(token.getIconResName(), "drawable", packageName));
                    } else {
                        i = 0;
                    }
                    token.setIconResId(i);
                    Long firstTimeStamp = token.getFirstTimeStamp();
                    if (firstTimeStamp != null) {
                        long longValue = firstTimeStamp.longValue();
                        Common common = Common.f42577a;
                        Date date = new Date(longValue * 1000);
                        Application b = this.f42809a.mo27549b();
                        vx2.m53590f(b, "getApplication()");
                        str = common.mo60900f(date, b);
                    } else {
                        str = null;
                    }
                    token.setDisplayDate(str);
                    BigInteger bigInteger = BigInteger.ZERO;
                    List<T> x0 = CollectionsKt___CollectionsKt.m47353x0(roomReflectionsTokenAndData.getData());
                    HashSet hashSet = new HashSet();
                    ArrayList<RoomReflectionsData> arrayList2 = new ArrayList<>();
                    for (T next : x0) {
                        if (hashSet.add(Long.valueOf(((RoomReflectionsData) next).getTimeStamp()))) {
                            arrayList2.add(next);
                        }
                    }
                    for (RoomReflectionsData roomReflectionsData : arrayList2) {
                        try {
                            BigInteger j = wb6.m73528j(roomReflectionsData.getNativeBalance());
                            vx2.m53588d(j);
                            BigInteger j2 = wb6.m73528j(roomReflectionsData.getBlockBalance());
                            vx2.m53588d(j2);
                            BigInteger subtract = j.subtract(j2);
                            vx2.m53590f(subtract, "this.subtract(other)");
                            if (subtract.compareTo(BigInteger.ZERO) > 0) {
                                vx2.m53590f(bigInteger, "total");
                                BigInteger add = bigInteger.add(subtract);
                                vx2.m53590f(add, "this.add(other)");
                                bigInteger = add;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    vx2.m53590f(bigInteger, "total");
                    BigDecimal r = ol0.m70376r(bigInteger, token.getDecimals());
                    vx2.m53590f(r, "total.fromWEI(it.decimals)");
                    token.setDifferenceBalance(r);
                }
                arrayList.add(roomReflectionsTokenAndData.getToken());
            }
            return arrayList;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00018\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "Landroidx/lifecycle/LiveData;", "a", "(Ljava/lang/Object;)Landroidx/lifecycle/LiveData;"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$d */
    /* compiled from: Transformations.kt */
    public static final class C8725d<I, O> implements sd2<TokenType, LiveData<List<? extends RoomReflectionsTokenAndData>>> {

        /* renamed from: a */
        public final /* synthetic */ ReflectionTrackerViewModel f42810a;

        public C8725d(ReflectionTrackerViewModel reflectionTrackerViewModel) {
            this.f42810a = reflectionTrackerViewModel;
        }

        /* renamed from: a */
        public final LiveData<List<? extends RoomReflectionsTokenAndData>> apply(TokenType tokenType) {
            return this.f42810a.mo61347s().mo60744e(tokenType);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$e */
    /* compiled from: Transformations.kt */
    public static final class C8726e<I, O> implements sd2<List<? extends RoomReflectionsDataAndToken>, List<RoomReflectionsDataAndToken>> {

        /* renamed from: a */
        public final /* synthetic */ ReflectionTrackerViewModel f42811a;

        public C8726e(ReflectionTrackerViewModel reflectionTrackerViewModel) {
            this.f42811a = reflectionTrackerViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken} */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
            r5 = r5.getData();
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken> apply(java.util.List<? extends net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken> r23) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                java.util.List r1 = (java.util.List) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.lang.String r3 = "_list"
                p000.vx2.m53590f(r1, r3)
                java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47353x0(r1)
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0022:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0045
                java.lang.Object r5 = r1.next()
                r6 = r5
                net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken r6 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken) r6
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r6 = r6.getData()
                long r6 = r6.getTimeStamp()
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                boolean r6 = r3.add(r6)
                if (r6 == 0) goto L_0x0022
                r4.add(r5)
                goto L_0x0022
            L_0x0045:
                java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47353x0(r4)
                r2.addAll(r1)
                r1 = 0
                java.util.Iterator r3 = r2.iterator()
            L_0x0051:
                boolean r4 = r3.hasNext()
                r5 = 0
                if (r4 == 0) goto L_0x0090
                java.lang.Object r4 = r3.next()
                int r6 = r1 + 1
                if (r1 >= 0) goto L_0x0063
                p000.ck0.m33072t()
            L_0x0063:
                net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken r4 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken) r4
                int r1 = r2.size()
                if (r6 >= r1) goto L_0x0072
                java.lang.Object r1 = r2.get(r6)
                r5 = r1
                net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken r5 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken) r5
            L_0x0072:
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r1 = r4.getData()
                if (r5 == 0) goto L_0x0083
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r5 = r5.getData()
                if (r5 == 0) goto L_0x0083
                long r4 = r5.getTimeStamp()
                goto L_0x008b
            L_0x0083:
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r4 = r4.getData()
                long r4 = r4.getTimeStamp()
            L_0x008b:
                r1.setStartTime(r4)
                r1 = r6
                goto L_0x0051
            L_0x0090:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.m47342m0(r2)
                net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken r3 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken) r3
                java.lang.String r4 = "calendar.time"
                r6 = 1000(0x3e8, float:1.401E-42)
                r9 = -1
                r10 = 1
                if (r3 == 0) goto L_0x0149
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r11 = r3.getData()
                net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r12 = r3.getToken()
                java.util.Calendar r13 = java.util.Calendar.getInstance()
                java.util.Date r14 = new java.util.Date
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r3 = r3.getData()
                long r15 = r3.getTimeStamp()
                long r7 = (long) r6
                long r7 = r7 * r15
                r14.<init>(r7)
                r13.setTime(r14)
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r7 = r0.f42811a
                k04 r7 = r7.mo61343o()
                java.lang.Object r7 = r7.getValue()
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$a r7 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.C8722a) r7
                if (r7 == 0) goto L_0x00d4
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r7 = r7.mo61355b()
                goto L_0x00d5
            L_0x00d4:
                r7 = r5
            L_0x00d5:
                if (r7 != 0) goto L_0x00d9
                r7 = r9
                goto L_0x00e1
            L_0x00d9:
                int[] r8 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.C8723b.f42808a
                int r7 = r7.ordinal()
                r7 = r8[r7]
            L_0x00e1:
                if (r7 == r10) goto L_0x00f7
                r3 = 2
                if (r7 == r3) goto L_0x00f2
                r8 = 3
                if (r7 == r8) goto L_0x00ee
                r7 = 5
                r13.add(r7, r9)
                goto L_0x00fb
            L_0x00ee:
                r13.add(r10, r9)
                goto L_0x00fb
            L_0x00f2:
                r8 = 3
                r13.add(r3, r9)
                goto L_0x00fb
            L_0x00f7:
                r8 = 3
                r13.add(r8, r9)
            L_0x00fb:
                java.lang.Long r7 = r12.getFirstTimeStamp()
                if (r7 == 0) goto L_0x0149
                net.safemoon.androidwallet.utils.Common r7 = net.safemoon.androidwallet.utils.Common.f42577a
                java.util.Date r8 = r13.getTime()
                p000.vx2.m53590f(r8, r4)
                long r14 = r7.mo60893C(r8)
                java.lang.Long r8 = r12.getFirstTimeStamp()
                p000.vx2.m53588d(r8)
                long r16 = r8.longValue()
                int r8 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r8 >= 0) goto L_0x0149
                java.lang.String r16 = r11.getSymbolWithType()
                java.util.Date r8 = r13.getTime()
                p000.vx2.m53590f(r8, r4)
                long r20 = r7.mo60893C(r8)
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r7 = new net.safemoon.androidwallet.model.reflections.RoomReflectionsData
                r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.Long r15 = java.lang.Long.valueOf(r13)
                java.lang.String r17 = "0"
                java.lang.String r18 = "0"
                java.lang.String r19 = "-9223372036854775808"
                r14 = r7
                r14.<init>(r15, r16, r17, r18, r19, r20)
                net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken r8 = new net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken
                r8.<init>(r7, r12)
                r2.add(r8)
            L_0x0149:
                java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                r7.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x0152:
                boolean r8 = r2.hasNext()
                java.lang.String r11 = " "
                java.lang.String r12 = "getApplication()"
                if (r8 == 0) goto L_0x021f
                java.lang.Object r8 = r2.next()
                r13 = r8
                net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken r13 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken) r13
                java.util.Calendar r14 = java.util.Calendar.getInstance()
                java.util.Date r15 = new java.util.Date
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r13 = r13.getData()
                long r16 = r13.getTimeStamp()
                r13 = r4
                long r3 = (long) r6
                long r3 = r3 * r16
                r15.<init>(r3)
                r14.setTime(r15)
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r3 = r0.f42811a
                k04 r3 = r3.mo61343o()
                java.lang.Object r3 = r3.getValue()
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$a r3 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.C8722a) r3
                if (r3 == 0) goto L_0x018e
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$TimeMode r3 = r3.mo61355b()
                goto L_0x018f
            L_0x018e:
                r3 = r5
            L_0x018f:
                if (r3 != 0) goto L_0x0193
                r4 = r9
                goto L_0x019c
            L_0x0193:
                int[] r4 = net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.C8723b.f42808a
                int r3 = r3.ordinal()
                r3 = r4[r3]
                r4 = r3
            L_0x019c:
                if (r4 == r10) goto L_0x01e8
                r3 = 2
                if (r4 == r3) goto L_0x01c8
                r15 = 3
                if (r4 == r15) goto L_0x01bf
                net.safemoon.androidwallet.utils.Common r4 = net.safemoon.androidwallet.utils.Common.f42577a
                java.util.Date r11 = r14.getTime()
                p000.vx2.m53590f(r11, r13)
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r14 = r0.f42811a
                android.app.Application r14 = r14.mo27549b()
                p000.vx2.m53590f(r14, r12)
                java.lang.String r4 = r4.mo60900f(r11, r14)
                java.lang.String r4 = java.lang.String.valueOf(r4)
                goto L_0x01e5
            L_0x01bf:
                int r4 = r14.get(r10)
                java.lang.String r4 = java.lang.String.valueOf(r4)
                goto L_0x01e5
            L_0x01c8:
                java.util.Locale r4 = java.util.Locale.ENGLISH
                r3 = 2
                java.lang.String r4 = r14.getDisplayName(r3, r3, r4)
                int r12 = r14.get(r10)
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r4)
                r14.append(r11)
                r14.append(r12)
                java.lang.String r4 = r14.toString()
            L_0x01e5:
                r3 = r4
                r4 = 3
                goto L_0x0209
            L_0x01e8:
                r3 = 2
                r4 = 3
                int r12 = r14.get(r4)
                int r14 = r14.get(r10)
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r3 = "Week "
                r15.append(r3)
                r15.append(r12)
                r15.append(r11)
                r15.append(r14)
                java.lang.String r3 = r15.toString()
            L_0x0209:
                java.lang.Object r11 = r7.get(r3)
                if (r11 != 0) goto L_0x0217
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r7.put(r3, r11)
            L_0x0217:
                java.util.List r11 = (java.util.List) r11
                r11.add(r8)
                r4 = r13
                goto L_0x0152
            L_0x021f:
                java.util.Set r2 = r7.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x0227:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x032f
                java.lang.Object r3 = r2.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getValue()
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47329Z(r4)
                net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken r4 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken) r4
                java.lang.Object r5 = r3.getValue()
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m47340k0(r5)
                net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken r5 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken) r5
                java.lang.Object r3 = r3.getValue()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Iterator r3 = r3.iterator()
                r7 = 0
                r8 = r7
            L_0x0257:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L_0x02ab
                java.lang.Object r9 = r3.next()
                net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken r9 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken) r9
                java.math.BigInteger r10 = new java.math.BigInteger
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r13 = r9.getData()
                java.lang.String r13 = r13.getNativeBalance()
                r10.<init>(r13)
                net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r13 = r9.getToken()
                int r13 = r13.getDecimals()
                java.math.BigDecimal r10 = p000.ol0.m70376r(r10, r13)
                float r10 = r10.floatValue()
                java.math.BigInteger r13 = new java.math.BigInteger
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r14 = r9.getData()
                java.lang.String r14 = r14.getBlockBalance()
                r13.<init>(r14)
                net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r9 = r9.getToken()
                int r9 = r9.getDecimals()
                java.math.BigDecimal r9 = p000.ol0.m70376r(r13, r9)
                float r9 = r9.floatValue()
                float r10 = r10 - r9
                int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r9 <= 0) goto L_0x02a3
                float r8 = r8 + r10
            L_0x02a3:
                java.lang.Float r9 = java.lang.Float.valueOf(r8)
                r4.setDiffBalance(r9)
                goto L_0x0257
            L_0x02ab:
                java.util.Date r3 = new java.util.Date
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r7 = r4.getData()
                long r7 = r7.getTimeStamp()
                long r9 = (long) r6
                long r7 = r7 * r9
                r3.<init>(r7)
                java.util.Date r7 = new java.util.Date
                net.safemoon.androidwallet.model.reflections.RoomReflectionsData r5 = r5.getData()
                long r13 = r5.getStartTime()
                long r13 = r13 * r9
                r7.<init>(r13)
                boolean r5 = p000.vx2.m53586b(r3, r7)
                if (r5 == 0) goto L_0x02de
                net.safemoon.androidwallet.utils.Common r5 = net.safemoon.androidwallet.utils.Common.f42577a
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r8 = r0.f42811a
                android.app.Application r8 = r8.mo27549b()
                p000.vx2.m53590f(r8, r12)
                java.lang.String r5 = r5.mo60899e(r3, r8)
                goto L_0x0321
            L_0x02de:
                net.safemoon.androidwallet.utils.Common r5 = net.safemoon.androidwallet.utils.Common.f42577a
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r8 = r0.f42811a
                android.app.Application r8 = r8.mo27549b()
                p000.vx2.m53590f(r8, r12)
                java.lang.String r8 = r5.mo60899e(r3, r8)
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r9 = r0.f42811a
                android.app.Application r9 = r9.mo27549b()
                r10 = 2131952466(0x7f130352, float:1.9541376E38)
                java.lang.String r9 = r9.getString(r10)
                net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r10 = r0.f42811a
                android.app.Application r10 = r10.mo27549b()
                p000.vx2.m53590f(r10, r12)
                java.lang.String r5 = r5.mo60899e(r7, r10)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                r10.append(r11)
                r10.append(r9)
                java.lang.String r8 = "\n"
                r10.append(r8)
                r10.append(r5)
                java.lang.String r5 = r10.toString()
            L_0x0321:
                r4.setDisplayDate(r5)
                boolean r3 = p000.vx2.m53586b(r3, r7)
                if (r3 != 0) goto L_0x0227
                r1.add(r4)
                goto L_0x0227
            L_0x032f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.C8726e.apply(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$f */
    /* compiled from: Transformations.kt */
    public static final class C8727f<I, O> implements sd2<RoomReflectionsTokenAndData, RoomReflectionsToken> {

        /* renamed from: a */
        public final /* synthetic */ ReflectionTrackerViewModel f42812a;

        public C8727f(ReflectionTrackerViewModel reflectionTrackerViewModel) {
            this.f42812a = reflectionTrackerViewModel;
        }

        public final RoomReflectionsToken apply(RoomReflectionsTokenAndData roomReflectionsTokenAndData) {
            int i;
            String str;
            RoomReflectionsTokenAndData roomReflectionsTokenAndData2 = roomReflectionsTokenAndData;
            RoomReflectionsToken token = roomReflectionsTokenAndData2.getToken();
            String packageName = this.f42812a.mo27549b().getPackageName();
            if (xb6.m73916n(token.getIconResName()) == null) {
                i = Integer.valueOf(this.f42812a.mo27549b().getResources().getIdentifier(token.getIconResName(), "drawable", packageName));
            } else {
                i = 0;
            }
            token.setIconResId(i);
            Long firstTimeStamp = token.getFirstTimeStamp();
            if (firstTimeStamp != null) {
                long longValue = firstTimeStamp.longValue();
                Common common = Common.f42577a;
                Date date = new Date(longValue * 1000);
                Application b = this.f42812a.mo27549b();
                vx2.m53590f(b, "getApplication()");
                str = common.mo60900f(date, b);
            } else {
                str = null;
            }
            token.setDisplayDate(str);
            BigInteger bigInteger = BigInteger.ZERO;
            List<T> x0 = CollectionsKt___CollectionsKt.m47353x0(roomReflectionsTokenAndData2.getData());
            HashSet hashSet = new HashSet();
            ArrayList<RoomReflectionsData> arrayList = new ArrayList<>();
            for (T next : x0) {
                if (hashSet.add(Long.valueOf(((RoomReflectionsData) next).getTimeStamp()))) {
                    arrayList.add(next);
                }
            }
            for (RoomReflectionsData roomReflectionsData : arrayList) {
                try {
                    BigInteger j = wb6.m73528j(roomReflectionsData.getNativeBalance());
                    vx2.m53588d(j);
                    BigInteger j2 = wb6.m73528j(roomReflectionsData.getBlockBalance());
                    vx2.m53588d(j2);
                    BigInteger subtract = j.subtract(j2);
                    vx2.m53590f(subtract, "this.subtract(other)");
                    if (subtract.compareTo(BigInteger.ZERO) > 0) {
                        vx2.m53590f(bigInteger, "total");
                        BigInteger add = bigInteger.add(subtract);
                        vx2.m53590f(add, "this.add(other)");
                        bigInteger = add;
                    }
                } catch (Exception unused) {
                }
            }
            vx2.m53590f(bigInteger, "total");
            BigDecimal r = ol0.m70376r(bigInteger, token.getDecimals());
            vx2.m53590f(r, "total.fromWEI(it.decimals)");
            token.setDifferenceBalance(r);
            return roomReflectionsTokenAndData2.getToken();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTrackerViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        this.f42796d = C6169a.m47232a(new ReflectionTrackerViewModel$reflectionDataSource$2(application));
        this.f42797e = C6169a.m47232a(new ReflectionTrackerViewModel$userDataSource$2(application));
        this.f42798f = C6169a.m47232a(new ReflectionTrackerViewModel$reflectionCustomContract$2(this));
        k04<C8722a> k04 = new k04<>(new C8722a("", (TimeMode) null, (TimeSpan) null, 6, (DefaultConstructorMarker) null));
        this.f42799g = k04;
        LiveData<List<RoomReflectionsDataAndToken>> c = qw6.m25943c(k04, new cb5(this));
        vx2.m53590f(c, "switchMap(filterReflecti…ReflectionsData(param)  }");
        this.f42800h = c;
        mo61333D();
        mo61332C();
        this.f42801i = C6169a.m47232a(new ReflectionTrackerViewModel$getTokenTypeMapUseCase$2(application));
    }

    /* renamed from: y */
    public static final LiveData m68760y(ReflectionTrackerViewModel reflectionTrackerViewModel, C8722a aVar) {
        vx2.m53591g(reflectionTrackerViewModel, "this$0");
        ReflectionDataSource s = reflectionTrackerViewModel.mo61347s();
        vx2.m53590f(aVar, "param");
        return s.mo60745f(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61330A(long r5, net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r7, p000.dg5 r8, p000.ns0<? super java.math.BigInteger> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$retryGetBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$retryGetBalance$1 r0 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$retryGetBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$retryGetBalance$1 r0 = new net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$retryGetBalance$1
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p000.hg5.m45199b(r9)
            goto L_0x005f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p000.hg5.m45199b(r9)
            java.lang.Thread.sleep(r5)
            net.safemoon.androidwallet.utils.ReflectionCustomContract r5 = r4.mo61346r()
            net.safemoon.androidwallet.common.TokenType$a r6 = net.safemoon.androidwallet.common.TokenType.Companion
            int r9 = r7.getChainId()
            net.safemoon.androidwallet.common.TokenType r6 = r6.mo57099b(r9)
            java.math.BigInteger r8 = r8.mo51187a()
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "blockOfDate.block.toString()"
            p000.vx2.m53590f(r8, r9)
            java.lang.String r7 = r7.getContractAddress()
            r0.label = r3
            java.lang.Object r9 = r5.mo60940e(r6, r8, r7, r0)
            if (r9 != r1) goto L_0x005f
            return r1
        L_0x005f:
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.mo61330A(long, net.safemoon.androidwallet.model.reflections.RoomReflectionsToken, dg5, ns0):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:88|89|90|91|92|93|(1:95)(1:96)|95) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02dc, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02dd, code lost:
        r15 = r6;
        r6 = r11;
        r14 = r12;
        r12 = r13;
        r13 = r10;
        r31 = r1;
        r1 = r0;
        r0 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r1 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsData) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02e9, code lost:
        if (r1 == null) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02eb, code lost:
        r17 = java.lang.Integer.parseInt(r1.getBlock()) + 1;
        r18 = r0.mo51187a().intValue();
        r10 = r15.mo61346r();
        r19 = r14.getContractAddress();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0308, code lost:
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r11 = net.safemoon.androidwallet.common.TokenType.Companion.mo57099b(r14.getChainId());
        r4.L$0 = r12;
        r4.L$1 = r14;
        r4.L$2 = r6;
        r4.L$3 = r13;
        r4.L$4 = r15;
        r4.L$5 = r0;
        r4.L$6 = r1;
        r4.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0323, code lost:
        r3 = r12;
        r12 = r19;
        r19 = r13;
        r13 = r17;
        r17 = r14;
        r14 = r18;
        r18 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r10 = r10.mo60941f(r11, r12, r13, r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0335, code lost:
        if (r10 != r5) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0337, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0338, code lost:
        r15 = r3;
        r13 = r6;
        r12 = r17;
        r11 = r18;
        r6 = r1;
        r1 = r10;
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r1 = (java.util.List) r1;
        r0 = new java.math.BigInteger(r6.getNativeBalance());
        r3 = new kotlin.jvm.internal.Ref$ObjectRef();
        r6 = java.math.BigInteger.ZERO;
        r3.element = r6;
        r14 = new kotlin.jvm.internal.Ref$ObjectRef();
        r14.element = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x035c, code lost:
        if (r1 == null) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0366, code lost:
        if (r1.hasNext() == false) goto L_0x0444;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0368, code lost:
        r6 = (net.safemoon.androidwallet.model.transaction.history.Result) r1.next();
        r33 = r1;
        r1 = r11.mo27549b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0374, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        p000.vx2.m53590f(r1, "getApplication<Application>()");
        r1 = p000.ol0.m70351c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x037f, code lost:
        if (r1 == null) goto L_0x039a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0381, code lost:
        r18 = r0;
        r0 = r1.getAddress(net.safemoon.androidwallet.common.TokenType.Companion.mo57099b(r19.getChainId()).getCoinType().getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x039a, code lost:
        r18 = r0;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x039d, code lost:
        r1 = r6.f42485to;
        p000.vx2.m53590f(r1, "result.to");
        r5 = java.util.Locale.ROOT;
        r1 = r1.toLowerCase(r5);
        p000.vx2.m53590f(r1, r2);
        r1 = kotlin.text.StringsKt__StringsKt.m63090V0(r1).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03b5, code lost:
        if (r0 == null) goto L_0x03c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03b7, code lost:
        r0 = r0.toLowerCase(r5);
        p000.vx2.m53590f(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03be, code lost:
        if (r0 == null) goto L_0x03c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03c0, code lost:
        r0 = kotlin.text.StringsKt__StringsKt.m63090V0(r0).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03c9, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03d1, code lost:
        if (p000.yb6.m74344y(r1, r0, true) == false) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r0 = r3.element;
        p000.vx2.m53590f(r0, "totalBuyBalance");
        r6 = r6.value;
        p000.vx2.m53590f(r6, "result.value");
        r0 = ((java.math.BigInteger) r0).add(new java.math.BigInteger(r6));
        p000.vx2.m53590f(r0, "this.add(other)");
        r3.element = r0;
        java.lang.System.out.println("totalBuyBalance: " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0404, code lost:
        r0 = r14.element;
        p000.vx2.m53590f(r0, "totalSellBalance");
        r6 = r6.value;
        p000.vx2.m53590f(r6, "result.value");
        r0 = ((java.math.BigInteger) r0).add(new java.math.BigInteger(r6));
        p000.vx2.m53590f(r0, "this.add(other)");
        r14.element = r0;
        java.lang.System.out.println("totalSellBalance : " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0434, code lost:
        r1 = r33;
        r5 = r17;
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x043c, code lost:
        r19 = r2;
        r6 = r13;
        r13 = r15;
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0444, code lost:
        r18 = r0;
        r17 = r5;
        r0 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x044c, code lost:
        r19 = r2;
        r6 = r13;
        r13 = r15;
        r5 = r17;
        r14 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0457, code lost:
        r17 = r5;
        r19 = r2;
        r6 = r13;
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x045f, code lost:
        r18 = r0;
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r0 = r11.mo61346r();
        r1 = net.safemoon.androidwallet.common.TokenType.Companion.mo57099b(r12.getChainId());
        r6 = r10.mo51187a().toString();
        p000.vx2.m53590f(r6, "blockOfDate.block.toString()");
        r5 = r12.getContractAddress();
        r4.L$0 = r15;
        r4.L$1 = r12;
        r4.L$2 = r13;
        r4.L$3 = r11;
        r4.L$4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x048d, code lost:
        r19 = r2;
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r4.L$5 = r2;
        r4.L$6 = r3;
        r4.L$7 = r14;
        r18 = r2;
        r4.label = 5;
        r1 = r0.mo60940e(r1, r6, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04a0, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04a2, code lost:
        if (r1 != r5) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04a4, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04a5, code lost:
        r6 = r13;
        r0 = r14;
        r2 = r18;
        r14 = r10;
        r13 = r11;
        r11 = r15;
        r15 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r1 = (java.math.BigInteger) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04af, code lost:
        if (r1 != null) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04b1, code lost:
        java.lang.System.out.println("RETRY_1");
        r4.L$0 = r11;
        r4.L$1 = r15;
        r4.L$2 = r6;
        r4.L$3 = r13;
        r4.L$4 = r14;
        r4.L$5 = r2;
        r4.L$6 = r3;
        r4.L$7 = r0;
        r4.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04cd, code lost:
        r21 = r11;
        r17 = r13;
        r18 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r1 = r13.mo61330A(10000, r15, r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04de, code lost:
        if (r1 != r5) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04e0, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04e1, code lost:
        r11 = r2;
        r10 = r3;
        r13 = r17;
        r12 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r1 = (java.math.BigInteger) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04e9, code lost:
        r3 = r10;
        r2 = r11;
        r15 = r12;
        r14 = r18;
        r11 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04f1, code lost:
        r14 = r20;
        r13 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04f7, code lost:
        r21 = r11;
        r17 = r13;
        r18 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04ff, code lost:
        if (r1 != null) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        java.lang.System.out.println("RETRY_2");
        r4.L$0 = r11;
        r4.L$1 = r15;
        r4.L$2 = r6;
        r4.L$3 = r13;
        r4.L$4 = r14;
        r4.L$5 = r2;
        r4.L$6 = r3;
        r4.L$7 = r0;
        r4.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x051d, code lost:
        r21 = r11;
        r17 = r13;
        r18 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r1 = r13.mo61330A(30000, r15, r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x052e, code lost:
        if (r1 != r5) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0530, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0531, code lost:
        r11 = r2;
        r10 = r3;
        r13 = r17;
        r12 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r1 = (java.math.BigInteger) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0539, code lost:
        r3 = r10;
        r2 = r11;
        r15 = r12;
        r14 = r18;
        r11 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0541, code lost:
        r21 = r11;
        r17 = r13;
        r18 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0549, code lost:
        if (r1 != null) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        java.lang.System.out.println("RETRY_3");
        r4.L$0 = r11;
        r4.L$1 = r15;
        r4.L$2 = r6;
        r4.L$3 = r13;
        r4.L$4 = r14;
        r4.L$5 = r2;
        r4.L$6 = r3;
        r4.L$7 = r0;
        r4.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0569, code lost:
        r21 = r11;
        r17 = r13;
        r18 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r1 = r13.mo61330A(60000, r15, r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x057a, code lost:
        if (r1 != r5) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x057c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x057d, code lost:
        r11 = r2;
        r10 = r3;
        r13 = r17;
        r12 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        r1 = (java.math.BigInteger) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0585, code lost:
        r3 = r10;
        r14 = r11;
        r2 = r12;
        r11 = r13;
        r13 = r18;
        r15 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x058e, code lost:
        r21 = r11;
        r18 = r14;
        r22 = r15;
        r14 = r2;
        r11 = r13;
        r13 = r18;
        r15 = r21;
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x059f, code lost:
        if (r1 != null) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        java.lang.System.out.println("RETRY_4");
        r4.L$0 = r15;
        r4.L$1 = r2;
        r4.L$2 = r6;
        r4.L$3 = r11;
        r4.L$4 = r13;
        r4.L$5 = r14;
        r4.L$6 = r3;
        r4.L$7 = r0;
        r4.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05bf, code lost:
        r21 = r11;
        r18 = r13;
        r17 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        r1 = r11.mo61330A(120000, r2, r18, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05d2, code lost:
        if (r1 != r5) goto L_0x05d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05d4, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05d5, code lost:
        r12 = r2;
        r14 = r18;
        r15 = r21;
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        r1 = (java.math.BigInteger) r1;
        r11 = r15;
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05e2, code lost:
        r14 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05e6, code lost:
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05e8, code lost:
        r12 = r2;
        r14 = r20;
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05ef, code lost:
        r21 = r11;
        r12 = r2;
        r2 = r14;
        r14 = r13;
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05fe, code lost:
        java.lang.System.out.println("balanceResult_last: " + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0614, code lost:
        if (r1 != null) goto L_0x061d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0616, code lost:
        java.lang.System.out.println("RETRY_FAILED_balance");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x061d, code lost:
        if (r1 == null) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x061f, code lost:
        if (r2 == null) goto L_0x06a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0627, code lost:
        if (r1.compareTo(java.math.BigInteger.ZERO) <= 0) goto L_0x06a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0629, code lost:
        r23 = r12.getSymbolWithType();
        r1 = r1.toString();
        r10 = r14.mo51187a().toString();
        r3 = r3.element;
        p000.vx2.m53590f(r3, "totalBuyBalance");
        r2 = r2.add((java.math.BigInteger) r3);
        p000.vx2.m53590f(r2, "this.add(other)");
        r0 = r0.element;
        p000.vx2.m53590f(r0, "totalSellBalance");
        r0 = r2.subtract((java.math.BigInteger) r0);
        p000.vx2.m53590f(r0, "this.subtract(other)");
        r0 = r0.toString();
        r27 = net.safemoon.androidwallet.utils.Common.f42577a.mo60893C(r14.mo51188b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0667, code lost:
        r14 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        p000.vx2.m53590f(r1, r14);
        p000.vx2.m53590f(r0, r14);
        p000.vx2.m53590f(r10, r14);
        r21 = new net.safemoon.androidwallet.model.reflections.RoomReflectionsData((java.lang.Long) null, r23, r1, r0, r10, r27, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r0 = r11.mo61347s();
        r4.L$0 = r13;
        r4.L$1 = r12;
        r4.L$2 = r6;
        r4.L$3 = null;
        r4.L$4 = null;
        r4.L$5 = null;
        r4.L$6 = null;
        r4.L$7 = null;
        r4.label = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x06a0, code lost:
        if (r0.mo60751l(r21, r4) != r5) goto L_0x06a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06a2, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06a3, code lost:
        r14 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06a5, code lost:
        r0 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06a8, code lost:
        r21 = r11;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x06ac, code lost:
        r14 = r20;
        r13 = r21;
        r12 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x06b3, code lost:
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06b5, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x06b8, code lost:
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x06ba, code lost:
        r14 = r20;
        r6 = r13;
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x06bf, code lost:
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06c2, code lost:
        r19 = r2;
        r3 = r12;
        r17 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06c7, code lost:
        r14 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x06d6, code lost:
        r19 = r2;
        r14 = r3;
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06dc, code lost:
        r19 = r2;
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r1 = (p000.dg5) r1;
        r0 = r6.mo61347s();
        r14 = r12.getSymbolWithType();
        r4.L$0 = r13;
        r4.L$1 = r12;
        r4.L$2 = r11;
        r4.L$3 = r10;
        r4.L$4 = r6;
        r4.L$5 = r1;
        r4.label = 3;
        r0 = r0.mo60748i(r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02da, code lost:
        if (r0 != r5) goto L_0x02dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x06ea  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61331B(net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r33, p000.ns0<? super p000.r37> r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r34
            java.lang.String r2 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            java.lang.String r3 = "toString()"
            boolean r4 = r1 instanceof net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$1
            if (r4 == 0) goto L_0x001b
            r4 = r1
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$1 r4 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$1 r4 = new net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$1
            r4.<init>(r0, r1)
        L_0x0020:
            java.lang.Object r1 = r4.result
            java.lang.Object r5 = p000.wx2.m54101d()
            int r6 = r4.label
            java.lang.String r7 = "totalSellBalance"
            java.lang.String r8 = "totalBuyBalance"
            java.lang.String r9 = "this.add(other)"
            switch(r6) {
                case 0: goto L_0x01db;
                case 1: goto L_0x01cf;
                case 2: goto L_0x01b0;
                case 3: goto L_0x0184;
                case 4: goto L_0x0158;
                case 5: goto L_0x0120;
                case 6: goto L_0x00ed;
                case 7: goto L_0x00ba;
                case 8: goto L_0x0087;
                case 9: goto L_0x004d;
                case 10: goto L_0x0039;
                default: goto L_0x0031;
            }
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            java.lang.Object r6 = r4.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r12 = r4.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r12 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r12
            java.lang.Object r13 = r4.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r13 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r13
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x06e1 }
            r19 = r2
            r14 = r3
            goto L_0x06a5
        L_0x004d:
            java.lang.Object r6 = r4.L$7
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r12 = r4.L$6
            kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref$ObjectRef) r12
            java.lang.Object r13 = r4.L$5
            java.math.BigInteger r13 = (java.math.BigInteger) r13
            java.lang.Object r14 = r4.L$4
            dg5 r14 = (p000.dg5) r14
            java.lang.Object r15 = r4.L$3
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r15 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r15
            java.lang.Object r11 = r4.L$2
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r10 = r4.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r10 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r10
            r33 = r6
            java.lang.Object r6 = r4.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r6 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r6
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0080 }
            r0 = r33
            r19 = r2
            r20 = r3
            r3 = r12
            r17 = r13
            r13 = r6
            r12 = r10
            r6 = r11
            goto L_0x05dc
        L_0x0080:
            r19 = r2
            r14 = r3
            r13 = r6
            r12 = r10
            goto L_0x01cc
        L_0x0087:
            java.lang.Object r6 = r4.L$7
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r10 = r4.L$6
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r4.L$5
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            java.lang.Object r12 = r4.L$4
            dg5 r12 = (p000.dg5) r12
            java.lang.Object r13 = r4.L$3
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r13 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r13
            java.lang.Object r14 = r4.L$2
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r4.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r15 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r15
            r33 = r6
            java.lang.Object r6 = r4.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r6 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r6
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0152 }
            r0 = r33
            r19 = r2
            r20 = r3
            r21 = r6
            r18 = r12
            r6 = r14
            r12 = r15
            goto L_0x0583
        L_0x00ba:
            java.lang.Object r6 = r4.L$7
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r10 = r4.L$6
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r4.L$5
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            java.lang.Object r12 = r4.L$4
            dg5 r12 = (p000.dg5) r12
            java.lang.Object r13 = r4.L$3
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r13 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r13
            java.lang.Object r14 = r4.L$2
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r4.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r15 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r15
            r33 = r6
            java.lang.Object r6 = r4.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r6 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r6
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0152 }
            r0 = r33
            r19 = r2
            r20 = r3
            r21 = r6
            r18 = r12
            r6 = r14
            r12 = r15
            goto L_0x0537
        L_0x00ed:
            java.lang.Object r6 = r4.L$7
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r10 = r4.L$6
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r4.L$5
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            java.lang.Object r12 = r4.L$4
            dg5 r12 = (p000.dg5) r12
            java.lang.Object r13 = r4.L$3
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r13 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r13
            java.lang.Object r14 = r4.L$2
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r4.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r15 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r15
            r33 = r6
            java.lang.Object r6 = r4.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r6 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r6
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0152 }
            r0 = r33
            r19 = r2
            r20 = r3
            r21 = r6
            r18 = r12
            r6 = r14
            r12 = r15
            goto L_0x04e7
        L_0x0120:
            java.lang.Object r6 = r4.L$7
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r10 = r4.L$6
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r4.L$5
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            java.lang.Object r12 = r4.L$4
            dg5 r12 = (p000.dg5) r12
            java.lang.Object r13 = r4.L$3
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r13 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r13
            java.lang.Object r14 = r4.L$2
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r4.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r15 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r15
            r33 = r6
            java.lang.Object r6 = r4.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r6 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r6
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0152 }
            r0 = r33
            r19 = r2
            r20 = r3
            r3 = r10
            r2 = r11
            r11 = r6
            r6 = r14
            r14 = r12
            goto L_0x04ad
        L_0x0152:
            r19 = r2
            r13 = r6
            r6 = r14
            r12 = r15
            goto L_0x01ac
        L_0x0158:
            java.lang.Object r6 = r4.L$6
            net.safemoon.androidwallet.model.reflections.RoomReflectionsData r6 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsData) r6
            java.lang.Object r10 = r4.L$5
            dg5 r10 = (p000.dg5) r10
            java.lang.Object r11 = r4.L$4
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r11 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r11
            java.lang.Object r12 = r4.L$3
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$2$1$iToken$1 r12 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$2$1$iToken$1) r12
            java.lang.Object r13 = r4.L$2
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r14 = r4.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r14 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r14
            java.lang.Object r15 = r4.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r15 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r15
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x017e }
            r20 = r3
            r19 = r12
            r12 = r14
            goto L_0x0341
        L_0x017e:
            r19 = r2
            r6 = r13
            r12 = r14
            r13 = r15
            goto L_0x01ac
        L_0x0184:
            java.lang.Object r6 = r4.L$5
            dg5 r6 = (p000.dg5) r6
            java.lang.Object r10 = r4.L$4
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r10 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r10
            java.lang.Object r11 = r4.L$3
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$2$1$iToken$1 r11 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$2$1$iToken$1) r11
            java.lang.Object r12 = r4.L$2
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r4.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r13 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r13
            java.lang.Object r14 = r4.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r14 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r14
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x01a7 }
            r0 = r6
            r15 = r10
            r6 = r12
            r12 = r14
            r14 = r13
            r13 = r11
            goto L_0x02e7
        L_0x01a7:
            r19 = r2
            r6 = r12
            r12 = r13
            r13 = r14
        L_0x01ac:
            r0 = 1
            r14 = r3
            goto L_0x06e5
        L_0x01b0:
            java.lang.Object r6 = r4.L$4
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r6 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r6
            java.lang.Object r10 = r4.L$3
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$2$1$iToken$1 r10 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$2$1$iToken$1) r10
            java.lang.Object r11 = r4.L$2
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r4.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r12 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r12
            java.lang.Object r13 = r4.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r13 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r13
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x01c9 }
            goto L_0x02bd
        L_0x01c9:
            r19 = r2
            r14 = r3
        L_0x01cc:
            r6 = r11
            goto L_0x06e4
        L_0x01cf:
            java.lang.Object r6 = r4.L$1
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r6 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r6
            java.lang.Object r10 = r4.L$0
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel r10 = (net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel) r10
            p000.hg5.m45199b(r1)
            goto L_0x01fe
        L_0x01db:
            p000.hg5.m45199b(r1)
            boolean r1 = r33.getEnableAdvanceMode()
            if (r1 == 0) goto L_0x06f9
            net.safemoon.androidwallet.repository.ReflectionDataSource r1 = r32.mo61347s()
            java.lang.String r6 = r33.getSymbolWithType()
            r4.L$0 = r0
            r10 = r33
            r4.L$1 = r10
            r11 = 1
            r4.label = r11
            java.lang.Object r1 = r1.mo60748i(r6, r4)
            if (r1 != r5) goto L_0x01fc
            return r5
        L_0x01fc:
            r6 = r10
            r10 = r0
        L_0x01fe:
            net.safemoon.androidwallet.model.reflections.RoomReflectionsData r1 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsData) r1
            if (r1 == 0) goto L_0x06f9
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            java.util.Date r12 = new java.util.Date
            long r13 = r1.getTimeStamp()
            r17 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r17
            r12.<init>(r13)
            net.safemoon.androidwallet.utils.Common r1 = net.safemoon.androidwallet.utils.Common.f42577a
            java.util.List r1 = r1.mo60904k(r12, r11)
            int r11 = r1.size()
            int r12 = r1.size()
            int r12 = r12 / 12
            r13 = 1
            int r12 = p000.d75.m43382d(r13, r12)
            int r11 = p000.d75.m43385g(r11, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r1.iterator()
            r15 = 0
        L_0x0237:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x026e
            java.lang.Object r14 = r13.next()
            int r17 = r15 + 1
            if (r15 >= 0) goto L_0x0248
            p000.ck0.m33072t()
        L_0x0248:
            r18 = r14
            java.util.Date r18 = (java.util.Date) r18
            int r0 = r1.size()
            if (r0 == r11) goto L_0x0263
            int r0 = r15 % r11
            if (r0 == 0) goto L_0x0263
            int r0 = r1.size()
            r16 = 1
            int r0 = r0 + -1
            if (r15 != r0) goto L_0x0261
            goto L_0x0263
        L_0x0261:
            r0 = 0
            goto L_0x0264
        L_0x0263:
            r0 = 1
        L_0x0264:
            if (r0 == 0) goto L_0x0269
            r12.add(r14)
        L_0x0269:
            r0 = r32
            r15 = r17
            goto L_0x0237
        L_0x026e:
            java.util.Iterator r0 = r12.iterator()
            r12 = r6
            r13 = r10
            r6 = r0
        L_0x0275:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x06ea
            java.lang.Object r0 = r6.next()
            java.util.Date r0 = (java.util.Date) r0
            boolean r1 = r12.getEnableAdvanceMode()
            if (r1 == 0) goto L_0x06e1
            net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$2$1$iToken$1 r10 = new net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$seedData$2$1$iToken$1
            r10.<init>(r12)
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r1 = new net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime
            android.app.Application r11 = r13.mo27549b()
            java.lang.String r14 = "getApplication()"
            p000.vx2.m53590f(r11, r14)
            r1.<init>(r11, r10)
            k04<java.util.Date> r11 = r13.f42795c     // Catch:{ Exception -> 0x06e1 }
            r11.postValue(r0)     // Catch:{ Exception -> 0x06e1 }
            r4.L$0 = r13     // Catch:{ Exception -> 0x06e1 }
            r4.L$1 = r12     // Catch:{ Exception -> 0x06e1 }
            r4.L$2 = r6     // Catch:{ Exception -> 0x06e1 }
            r4.L$3 = r10     // Catch:{ Exception -> 0x06e1 }
            r4.L$4 = r13     // Catch:{ Exception -> 0x06e1 }
            r11 = 0
            r4.L$5 = r11     // Catch:{ Exception -> 0x06e1 }
            r4.L$6 = r11     // Catch:{ Exception -> 0x06e1 }
            r4.L$7 = r11     // Catch:{ Exception -> 0x06e1 }
            r11 = 2
            r4.label = r11     // Catch:{ Exception -> 0x06e1 }
            r11 = 1
            java.lang.Object r1 = r1.mo61807m(r0, r11, r4)     // Catch:{ Exception -> 0x06dc }
            if (r1 != r5) goto L_0x02bb
            return r5
        L_0x02bb:
            r11 = r6
            r6 = r13
        L_0x02bd:
            dg5 r1 = (p000.dg5) r1     // Catch:{ Exception -> 0x06d6 }
            net.safemoon.androidwallet.repository.ReflectionDataSource r0 = r6.mo61347s()     // Catch:{ Exception -> 0x06d6 }
            java.lang.String r14 = r12.getSymbolWithType()     // Catch:{ Exception -> 0x06d6 }
            r4.L$0 = r13     // Catch:{ Exception -> 0x06d6 }
            r4.L$1 = r12     // Catch:{ Exception -> 0x06d6 }
            r4.L$2 = r11     // Catch:{ Exception -> 0x06d6 }
            r4.L$3 = r10     // Catch:{ Exception -> 0x06d6 }
            r4.L$4 = r6     // Catch:{ Exception -> 0x06d6 }
            r4.L$5 = r1     // Catch:{ Exception -> 0x06d6 }
            r15 = 3
            r4.label = r15     // Catch:{ Exception -> 0x06d6 }
            java.lang.Object r0 = r0.mo60748i(r14, r4)     // Catch:{ Exception -> 0x06d6 }
            if (r0 != r5) goto L_0x02dd
            return r5
        L_0x02dd:
            r15 = r6
            r6 = r11
            r14 = r12
            r12 = r13
            r13 = r10
            r31 = r1
            r1 = r0
            r0 = r31
        L_0x02e7:
            net.safemoon.androidwallet.model.reflections.RoomReflectionsData r1 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsData) r1     // Catch:{ Exception -> 0x06cb }
            if (r1 == 0) goto L_0x06cb
            java.lang.String r10 = r1.getBlock()     // Catch:{ Exception -> 0x06cb }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x06cb }
            r11 = 1
            int r17 = r10 + 1
            java.math.BigInteger r10 = r0.mo51187a()     // Catch:{ Exception -> 0x06cb }
            int r18 = r10.intValue()     // Catch:{ Exception -> 0x06cb }
            net.safemoon.androidwallet.utils.ReflectionCustomContract r10 = r15.mo61346r()     // Catch:{ Exception -> 0x06cb }
            java.lang.String r19 = r14.getContractAddress()     // Catch:{ Exception -> 0x06cb }
            net.safemoon.androidwallet.common.TokenType$a r11 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x06cb }
            r20 = r3
            int r3 = r14.getChainId()     // Catch:{ Exception -> 0x06c2 }
            net.safemoon.androidwallet.common.TokenType r11 = r11.mo57099b(r3)     // Catch:{ Exception -> 0x06c2 }
            r4.L$0 = r12     // Catch:{ Exception -> 0x06c2 }
            r4.L$1 = r14     // Catch:{ Exception -> 0x06c2 }
            r4.L$2 = r6     // Catch:{ Exception -> 0x06c2 }
            r4.L$3 = r13     // Catch:{ Exception -> 0x06c2 }
            r4.L$4 = r15     // Catch:{ Exception -> 0x06c2 }
            r4.L$5 = r0     // Catch:{ Exception -> 0x06c2 }
            r4.L$6 = r1     // Catch:{ Exception -> 0x06c2 }
            r3 = 4
            r4.label = r3     // Catch:{ Exception -> 0x06c2 }
            r3 = r12
            r12 = r19
            r19 = r13
            r13 = r17
            r17 = r14
            r14 = r18
            r18 = r15
            r15 = r4
            java.lang.Object r10 = r10.mo60941f(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x06bf }
            if (r10 != r5) goto L_0x0338
            return r5
        L_0x0338:
            r15 = r3
            r13 = r6
            r12 = r17
            r11 = r18
            r6 = r1
            r1 = r10
            r10 = r0
        L_0x0341:
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x06b8 }
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ Exception -> 0x06b8 }
            java.lang.String r3 = r6.getNativeBalance()     // Catch:{ Exception -> 0x06b8 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x06b8 }
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ Exception -> 0x06b8 }
            r3.<init>()     // Catch:{ Exception -> 0x06b8 }
            java.math.BigInteger r6 = java.math.BigInteger.ZERO     // Catch:{ Exception -> 0x06b8 }
            r3.element = r6     // Catch:{ Exception -> 0x06b8 }
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ Exception -> 0x06b8 }
            r14.<init>()     // Catch:{ Exception -> 0x06b8 }
            r14.element = r6     // Catch:{ Exception -> 0x06b8 }
            if (r1 == 0) goto L_0x045f
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0457 }
        L_0x0362:
            boolean r6 = r1.hasNext()     // Catch:{ Exception -> 0x0457 }
            if (r6 == 0) goto L_0x0444
            java.lang.Object r6 = r1.next()     // Catch:{ Exception -> 0x0457 }
            net.safemoon.androidwallet.model.transaction.history.Result r6 = (net.safemoon.androidwallet.model.transaction.history.Result) r6     // Catch:{ Exception -> 0x0457 }
            r33 = r1
            android.app.Application r1 = r11.mo27549b()     // Catch:{ Exception -> 0x0457 }
            r17 = r5
            java.lang.String r5 = "getApplication<Application>()"
            p000.vx2.m53590f(r1, r5)     // Catch:{ Exception -> 0x043c }
            net.safemoon.androidwallet.model.wallets.Wallet r1 = p000.ol0.m70351c(r1)     // Catch:{ Exception -> 0x043c }
            if (r1 == 0) goto L_0x039a
            net.safemoon.androidwallet.common.TokenType$a r5 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x043c }
            r18 = r0
            int r0 = r19.getChainId()     // Catch:{ Exception -> 0x043c }
            net.safemoon.androidwallet.common.TokenType r0 = r5.mo57099b(r0)     // Catch:{ Exception -> 0x043c }
            net.safemoon.androidwallet.common.MyCoinType r0 = r0.getCoinType()     // Catch:{ Exception -> 0x043c }
            int r0 = r0.getValue()     // Catch:{ Exception -> 0x043c }
            java.lang.String r0 = r1.getAddress(r0)     // Catch:{ Exception -> 0x043c }
            goto L_0x039d
        L_0x039a:
            r18 = r0
            r0 = 0
        L_0x039d:
            java.lang.String r1 = r6.f42485to     // Catch:{ Exception -> 0x043c }
            java.lang.String r5 = "result.to"
            p000.vx2.m53590f(r1, r5)     // Catch:{ Exception -> 0x043c }
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x043c }
            java.lang.String r1 = r1.toLowerCase(r5)     // Catch:{ Exception -> 0x043c }
            p000.vx2.m53590f(r1, r2)     // Catch:{ Exception -> 0x043c }
            java.lang.CharSequence r1 = kotlin.text.StringsKt__StringsKt.m63090V0(r1)     // Catch:{ Exception -> 0x043c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x043c }
            if (r0 == 0) goto L_0x03c9
            java.lang.String r0 = r0.toLowerCase(r5)     // Catch:{ Exception -> 0x043c }
            p000.vx2.m53590f(r0, r2)     // Catch:{ Exception -> 0x043c }
            if (r0 == 0) goto L_0x03c9
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.m63090V0(r0)     // Catch:{ Exception -> 0x043c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x043c }
            goto L_0x03ca
        L_0x03c9:
            r0 = 0
        L_0x03ca:
            r5 = 1
            boolean r0 = p000.yb6.m74344y(r1, r0, r5)     // Catch:{ Exception -> 0x044c }
            java.lang.String r1 = "result.value"
            if (r0 == 0) goto L_0x0404
            T r0 = r3.element     // Catch:{ Exception -> 0x044c }
            p000.vx2.m53590f(r0, r8)     // Catch:{ Exception -> 0x044c }
            java.math.BigInteger r0 = (java.math.BigInteger) r0     // Catch:{ Exception -> 0x044c }
            java.lang.String r6 = r6.value     // Catch:{ Exception -> 0x044c }
            p000.vx2.m53590f(r6, r1)     // Catch:{ Exception -> 0x044c }
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ Exception -> 0x044c }
            r1.<init>(r6)     // Catch:{ Exception -> 0x044c }
            java.math.BigInteger r0 = r0.add(r1)     // Catch:{ Exception -> 0x044c }
            p000.vx2.m53590f(r0, r9)     // Catch:{ Exception -> 0x044c }
            r3.element = r0     // Catch:{ Exception -> 0x044c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x044c }
            r1.<init>()     // Catch:{ Exception -> 0x044c }
            java.lang.String r6 = "totalBuyBalance: "
            r1.append(r6)     // Catch:{ Exception -> 0x044c }
            r1.append(r0)     // Catch:{ Exception -> 0x044c }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x044c }
            java.io.PrintStream r1 = java.lang.System.out     // Catch:{ Exception -> 0x044c }
            r1.println(r0)     // Catch:{ Exception -> 0x044c }
            goto L_0x0434
        L_0x0404:
            T r0 = r14.element     // Catch:{ Exception -> 0x044c }
            p000.vx2.m53590f(r0, r7)     // Catch:{ Exception -> 0x044c }
            java.math.BigInteger r0 = (java.math.BigInteger) r0     // Catch:{ Exception -> 0x044c }
            java.lang.String r6 = r6.value     // Catch:{ Exception -> 0x044c }
            p000.vx2.m53590f(r6, r1)     // Catch:{ Exception -> 0x044c }
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ Exception -> 0x044c }
            r1.<init>(r6)     // Catch:{ Exception -> 0x044c }
            java.math.BigInteger r0 = r0.add(r1)     // Catch:{ Exception -> 0x044c }
            p000.vx2.m53590f(r0, r9)     // Catch:{ Exception -> 0x044c }
            r14.element = r0     // Catch:{ Exception -> 0x044c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x044c }
            r1.<init>()     // Catch:{ Exception -> 0x044c }
            java.lang.String r6 = "totalSellBalance : "
            r1.append(r6)     // Catch:{ Exception -> 0x044c }
            r1.append(r0)     // Catch:{ Exception -> 0x044c }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x044c }
            java.io.PrintStream r1 = java.lang.System.out     // Catch:{ Exception -> 0x044c }
            r1.println(r0)     // Catch:{ Exception -> 0x044c }
        L_0x0434:
            r1 = r33
            r5 = r17
            r0 = r18
            goto L_0x0362
        L_0x043c:
            r19 = r2
            r6 = r13
            r13 = r15
            r5 = r17
            goto L_0x05e2
        L_0x0444:
            r18 = r0
            r17 = r5
            r5 = 1
            r37 r0 = p000.r37.f33317a     // Catch:{ Exception -> 0x044c }
            goto L_0x0464
        L_0x044c:
            r19 = r2
            r0 = r5
            r6 = r13
            r13 = r15
            r5 = r17
            r14 = r20
            goto L_0x06e5
        L_0x0457:
            r17 = r5
            r19 = r2
            r6 = r13
            r13 = r15
            goto L_0x05e2
        L_0x045f:
            r18 = r0
            r17 = r5
            r5 = 1
        L_0x0464:
            net.safemoon.androidwallet.utils.ReflectionCustomContract r0 = r11.mo61346r()     // Catch:{ Exception -> 0x06b3 }
            net.safemoon.androidwallet.common.TokenType$a r1 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x06b3 }
            int r6 = r12.getChainId()     // Catch:{ Exception -> 0x06b3 }
            net.safemoon.androidwallet.common.TokenType r1 = r1.mo57099b(r6)     // Catch:{ Exception -> 0x06b3 }
            java.math.BigInteger r6 = r10.mo51187a()     // Catch:{ Exception -> 0x06b3 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x06b3 }
            java.lang.String r5 = "blockOfDate.block.toString()"
            p000.vx2.m53590f(r6, r5)     // Catch:{ Exception -> 0x06b3 }
            java.lang.String r5 = r12.getContractAddress()     // Catch:{ Exception -> 0x06b3 }
            r4.L$0 = r15     // Catch:{ Exception -> 0x06b3 }
            r4.L$1 = r12     // Catch:{ Exception -> 0x06b3 }
            r4.L$2 = r13     // Catch:{ Exception -> 0x06b3 }
            r4.L$3 = r11     // Catch:{ Exception -> 0x06b3 }
            r4.L$4 = r10     // Catch:{ Exception -> 0x06b3 }
            r19 = r2
            r2 = r18
            r4.L$5 = r2     // Catch:{ Exception -> 0x06b5 }
            r4.L$6 = r3     // Catch:{ Exception -> 0x06b5 }
            r4.L$7 = r14     // Catch:{ Exception -> 0x06b5 }
            r18 = r2
            r2 = 5
            r4.label = r2     // Catch:{ Exception -> 0x06b5 }
            java.lang.Object r1 = r0.mo60940e(r1, r6, r5, r4)     // Catch:{ Exception -> 0x06b5 }
            r5 = r17
            if (r1 != r5) goto L_0x04a5
            return r5
        L_0x04a5:
            r6 = r13
            r0 = r14
            r2 = r18
            r14 = r10
            r13 = r11
            r11 = r15
            r15 = r12
        L_0x04ad:
            java.math.BigInteger r1 = (java.math.BigInteger) r1     // Catch:{ Exception -> 0x06a8 }
            if (r1 != 0) goto L_0x04f7
            java.lang.String r1 = "RETRY_1"
            java.io.PrintStream r10 = java.lang.System.out     // Catch:{ Exception -> 0x06a8 }
            r10.println(r1)     // Catch:{ Exception -> 0x06a8 }
            r17 = 10000(0x2710, double:4.9407E-320)
            r4.L$0 = r11     // Catch:{ Exception -> 0x06a8 }
            r4.L$1 = r15     // Catch:{ Exception -> 0x06a8 }
            r4.L$2 = r6     // Catch:{ Exception -> 0x06a8 }
            r4.L$3 = r13     // Catch:{ Exception -> 0x06a8 }
            r4.L$4 = r14     // Catch:{ Exception -> 0x06a8 }
            r4.L$5 = r2     // Catch:{ Exception -> 0x06a8 }
            r4.L$6 = r3     // Catch:{ Exception -> 0x06a8 }
            r4.L$7 = r0     // Catch:{ Exception -> 0x06a8 }
            r1 = 6
            r4.label = r1     // Catch:{ Exception -> 0x06a8 }
            r10 = r13
            r21 = r11
            r11 = r17
            r17 = r13
            r13 = r15
            r18 = r14
            r22 = r15
            r15 = r4
            java.lang.Object r1 = r10.mo61330A(r11, r13, r14, r15)     // Catch:{ Exception -> 0x06ac }
            if (r1 != r5) goto L_0x04e1
            return r5
        L_0x04e1:
            r11 = r2
            r10 = r3
            r13 = r17
            r12 = r22
        L_0x04e7:
            java.math.BigInteger r1 = (java.math.BigInteger) r1     // Catch:{ Exception -> 0x04f1 }
            r3 = r10
            r2 = r11
            r15 = r12
            r14 = r18
            r11 = r21
            goto L_0x04ff
        L_0x04f1:
            r14 = r20
            r13 = r21
            goto L_0x06e4
        L_0x04f7:
            r21 = r11
            r17 = r13
            r18 = r14
            r22 = r15
        L_0x04ff:
            if (r1 != 0) goto L_0x0541
            java.lang.String r1 = "RETRY_2"
            java.io.PrintStream r10 = java.lang.System.out     // Catch:{ Exception -> 0x06a8 }
            r10.println(r1)     // Catch:{ Exception -> 0x06a8 }
            r17 = 30000(0x7530, double:1.4822E-319)
            r4.L$0 = r11     // Catch:{ Exception -> 0x06a8 }
            r4.L$1 = r15     // Catch:{ Exception -> 0x06a8 }
            r4.L$2 = r6     // Catch:{ Exception -> 0x06a8 }
            r4.L$3 = r13     // Catch:{ Exception -> 0x06a8 }
            r4.L$4 = r14     // Catch:{ Exception -> 0x06a8 }
            r4.L$5 = r2     // Catch:{ Exception -> 0x06a8 }
            r4.L$6 = r3     // Catch:{ Exception -> 0x06a8 }
            r4.L$7 = r0     // Catch:{ Exception -> 0x06a8 }
            r1 = 7
            r4.label = r1     // Catch:{ Exception -> 0x06a8 }
            r10 = r13
            r21 = r11
            r11 = r17
            r17 = r13
            r13 = r15
            r18 = r14
            r22 = r15
            r15 = r4
            java.lang.Object r1 = r10.mo61330A(r11, r13, r14, r15)     // Catch:{ Exception -> 0x06ac }
            if (r1 != r5) goto L_0x0531
            return r5
        L_0x0531:
            r11 = r2
            r10 = r3
            r13 = r17
            r12 = r22
        L_0x0537:
            java.math.BigInteger r1 = (java.math.BigInteger) r1     // Catch:{ Exception -> 0x04f1 }
            r3 = r10
            r2 = r11
            r15 = r12
            r14 = r18
            r11 = r21
            goto L_0x0549
        L_0x0541:
            r21 = r11
            r17 = r13
            r18 = r14
            r22 = r15
        L_0x0549:
            if (r1 != 0) goto L_0x058e
            java.lang.String r1 = "RETRY_3"
            java.io.PrintStream r10 = java.lang.System.out     // Catch:{ Exception -> 0x06a8 }
            r10.println(r1)     // Catch:{ Exception -> 0x06a8 }
            r17 = 60000(0xea60, double:2.9644E-319)
            r4.L$0 = r11     // Catch:{ Exception -> 0x06a8 }
            r4.L$1 = r15     // Catch:{ Exception -> 0x06a8 }
            r4.L$2 = r6     // Catch:{ Exception -> 0x06a8 }
            r4.L$3 = r13     // Catch:{ Exception -> 0x06a8 }
            r4.L$4 = r14     // Catch:{ Exception -> 0x06a8 }
            r4.L$5 = r2     // Catch:{ Exception -> 0x06a8 }
            r4.L$6 = r3     // Catch:{ Exception -> 0x06a8 }
            r4.L$7 = r0     // Catch:{ Exception -> 0x06a8 }
            r1 = 8
            r4.label = r1     // Catch:{ Exception -> 0x06a8 }
            r10 = r13
            r21 = r11
            r11 = r17
            r17 = r13
            r13 = r15
            r18 = r14
            r22 = r15
            r15 = r4
            java.lang.Object r1 = r10.mo61330A(r11, r13, r14, r15)     // Catch:{ Exception -> 0x06ac }
            if (r1 != r5) goto L_0x057d
            return r5
        L_0x057d:
            r11 = r2
            r10 = r3
            r13 = r17
            r12 = r22
        L_0x0583:
            java.math.BigInteger r1 = (java.math.BigInteger) r1     // Catch:{ Exception -> 0x04f1 }
            r3 = r10
            r14 = r11
            r2 = r12
            r11 = r13
            r13 = r18
            r15 = r21
            goto L_0x059f
        L_0x058e:
            r21 = r11
            r17 = r13
            r18 = r14
            r22 = r15
            r14 = r2
            r11 = r17
            r13 = r18
            r15 = r21
            r2 = r22
        L_0x059f:
            if (r1 != 0) goto L_0x05ef
            java.lang.String r1 = "RETRY_4"
            java.io.PrintStream r10 = java.lang.System.out     // Catch:{ Exception -> 0x05e6 }
            r10.println(r1)     // Catch:{ Exception -> 0x05e6 }
            r17 = 120000(0x1d4c0, double:5.9288E-319)
            r4.L$0 = r15     // Catch:{ Exception -> 0x05e6 }
            r4.L$1 = r2     // Catch:{ Exception -> 0x05e6 }
            r4.L$2 = r6     // Catch:{ Exception -> 0x05e6 }
            r4.L$3 = r11     // Catch:{ Exception -> 0x05e6 }
            r4.L$4 = r13     // Catch:{ Exception -> 0x05e6 }
            r4.L$5 = r14     // Catch:{ Exception -> 0x05e6 }
            r4.L$6 = r3     // Catch:{ Exception -> 0x05e6 }
            r4.L$7 = r0     // Catch:{ Exception -> 0x05e6 }
            r1 = 9
            r4.label = r1     // Catch:{ Exception -> 0x05e6 }
            r10 = r11
            r21 = r11
            r11 = r17
            r18 = r13
            r13 = r2
            r17 = r14
            r14 = r18
            r22 = r15
            r15 = r4
            java.lang.Object r1 = r10.mo61330A(r11, r13, r14, r15)     // Catch:{ Exception -> 0x05e8 }
            if (r1 != r5) goto L_0x05d5
            return r5
        L_0x05d5:
            r12 = r2
            r14 = r18
            r15 = r21
            r13 = r22
        L_0x05dc:
            java.math.BigInteger r1 = (java.math.BigInteger) r1     // Catch:{ Exception -> 0x05e2 }
            r11 = r15
            r2 = r17
            goto L_0x05fe
        L_0x05e2:
            r14 = r20
            goto L_0x06e4
        L_0x05e6:
            r22 = r15
        L_0x05e8:
            r12 = r2
            r14 = r20
            r13 = r22
            goto L_0x06e4
        L_0x05ef:
            r21 = r11
            r18 = r13
            r17 = r14
            r22 = r15
            r12 = r2
            r2 = r17
            r14 = r18
            r13 = r22
        L_0x05fe:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05e2 }
            r10.<init>()     // Catch:{ Exception -> 0x05e2 }
            java.lang.String r15 = "balanceResult_last: "
            r10.append(r15)     // Catch:{ Exception -> 0x05e2 }
            r10.append(r1)     // Catch:{ Exception -> 0x05e2 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x05e2 }
            java.io.PrintStream r15 = java.lang.System.out     // Catch:{ Exception -> 0x05e2 }
            r15.println(r10)     // Catch:{ Exception -> 0x05e2 }
            if (r1 != 0) goto L_0x061d
            java.lang.String r10 = "RETRY_FAILED_balance"
            java.io.PrintStream r15 = java.lang.System.out     // Catch:{ Exception -> 0x05e2 }
            r15.println(r10)     // Catch:{ Exception -> 0x05e2 }
        L_0x061d:
            if (r1 == 0) goto L_0x05e2
            if (r2 == 0) goto L_0x06a3
            java.math.BigInteger r10 = java.math.BigInteger.ZERO     // Catch:{ Exception -> 0x05e2 }
            int r10 = r1.compareTo(r10)     // Catch:{ Exception -> 0x05e2 }
            if (r10 <= 0) goto L_0x06a3
            java.lang.String r23 = r12.getSymbolWithType()     // Catch:{ Exception -> 0x05e2 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x05e2 }
            java.math.BigInteger r10 = r14.mo51187a()     // Catch:{ Exception -> 0x05e2 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x05e2 }
            T r3 = r3.element     // Catch:{ Exception -> 0x05e2 }
            p000.vx2.m53590f(r3, r8)     // Catch:{ Exception -> 0x05e2 }
            java.math.BigInteger r3 = (java.math.BigInteger) r3     // Catch:{ Exception -> 0x05e2 }
            java.math.BigInteger r2 = r2.add(r3)     // Catch:{ Exception -> 0x05e2 }
            p000.vx2.m53590f(r2, r9)     // Catch:{ Exception -> 0x05e2 }
            T r0 = r0.element     // Catch:{ Exception -> 0x05e2 }
            p000.vx2.m53590f(r0, r7)     // Catch:{ Exception -> 0x05e2 }
            java.math.BigInteger r0 = (java.math.BigInteger) r0     // Catch:{ Exception -> 0x05e2 }
            java.math.BigInteger r0 = r2.subtract(r0)     // Catch:{ Exception -> 0x05e2 }
            java.lang.String r2 = "this.subtract(other)"
            p000.vx2.m53590f(r0, r2)     // Catch:{ Exception -> 0x05e2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x05e2 }
            net.safemoon.androidwallet.utils.Common r2 = net.safemoon.androidwallet.utils.Common.f42577a     // Catch:{ Exception -> 0x05e2 }
            java.util.Date r3 = r14.mo51188b()     // Catch:{ Exception -> 0x05e2 }
            long r27 = r2.mo60893C(r3)     // Catch:{ Exception -> 0x05e2 }
            net.safemoon.androidwallet.model.reflections.RoomReflectionsData r2 = new net.safemoon.androidwallet.model.reflections.RoomReflectionsData     // Catch:{ Exception -> 0x05e2 }
            r22 = 0
            r14 = r20
            p000.vx2.m53590f(r1, r14)     // Catch:{ Exception -> 0x06e4 }
            p000.vx2.m53590f(r0, r14)     // Catch:{ Exception -> 0x06e4 }
            p000.vx2.m53590f(r10, r14)     // Catch:{ Exception -> 0x06e4 }
            r29 = 1
            r30 = 0
            r21 = r2
            r24 = r1
            r25 = r0
            r26 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r30)     // Catch:{ Exception -> 0x06e4 }
            net.safemoon.androidwallet.repository.ReflectionDataSource r0 = r11.mo61347s()     // Catch:{ Exception -> 0x06e4 }
            r4.L$0 = r13     // Catch:{ Exception -> 0x06e4 }
            r4.L$1 = r12     // Catch:{ Exception -> 0x06e4 }
            r4.L$2 = r6     // Catch:{ Exception -> 0x06e4 }
            r1 = 0
            r4.L$3 = r1     // Catch:{ Exception -> 0x06e4 }
            r4.L$4 = r1     // Catch:{ Exception -> 0x06e4 }
            r4.L$5 = r1     // Catch:{ Exception -> 0x06e4 }
            r4.L$6 = r1     // Catch:{ Exception -> 0x06e4 }
            r4.L$7 = r1     // Catch:{ Exception -> 0x06e4 }
            r1 = 10
            r4.label = r1     // Catch:{ Exception -> 0x06e4 }
            java.lang.Object r0 = r0.mo60751l(r2, r4)     // Catch:{ Exception -> 0x06e4 }
            if (r0 != r5) goto L_0x06a5
            return r5
        L_0x06a3:
            r14 = r20
        L_0x06a5:
            r37 r0 = p000.r37.f33317a     // Catch:{ Exception -> 0x06e4 }
            goto L_0x06e4
        L_0x06a8:
            r21 = r11
            r22 = r15
        L_0x06ac:
            r14 = r20
            r13 = r21
            r12 = r22
            goto L_0x06e4
        L_0x06b3:
            r19 = r2
        L_0x06b5:
            r5 = r17
            goto L_0x06ba
        L_0x06b8:
            r19 = r2
        L_0x06ba:
            r14 = r20
            r6 = r13
            r13 = r15
            goto L_0x06e4
        L_0x06bf:
            r19 = r2
            goto L_0x06c7
        L_0x06c2:
            r19 = r2
            r3 = r12
            r17 = r14
        L_0x06c7:
            r14 = r20
            r0 = 1
            goto L_0x06d2
        L_0x06cb:
            r19 = r2
            r17 = r14
            r0 = 1
            r14 = r3
            r3 = r12
        L_0x06d2:
            r13 = r3
            r12 = r17
            goto L_0x06e5
        L_0x06d6:
            r19 = r2
            r14 = r3
            r0 = 1
            r6 = r11
            goto L_0x06e5
        L_0x06dc:
            r19 = r2
            r14 = r3
            r0 = r11
            goto L_0x06e5
        L_0x06e1:
            r19 = r2
            r14 = r3
        L_0x06e4:
            r0 = 1
        L_0x06e5:
            r3 = r14
            r2 = r19
            goto L_0x0275
        L_0x06ea:
            k04<java.util.Date> r0 = r13.f42795c
            r1 = 0
            r0.postValue(r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "DONE----------------"
            r0.println(r1)
            r37 r0 = p000.r37.f33317a
        L_0x06f9:
            r37 r0 = p000.r37.f33317a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel.mo61331B(net.safemoon.androidwallet.model.reflections.RoomReflectionsToken, ns0):java.lang.Object");
    }

    /* renamed from: C */
    public final void mo61332C() {
        y23 unused = d50.m56748b(mo61338j(), (CoroutineContext) null, (CoroutineStart) null, new ReflectionTrackerViewModel$setDailyData$1(this, (ns0<? super ReflectionTrackerViewModel$setDailyData$1>) null), 3, (Object) null);
    }

    /* renamed from: D */
    public final void mo61333D() {
        y23 unused = d50.m56748b(mo61338j(), (CoroutineContext) null, (CoroutineStart) null, new ReflectionTrackerViewModel$setDefaultReflectionToken$1(this, (ns0<? super ReflectionTrackerViewModel$setDefaultReflectionToken$1>) null), 3, (Object) null);
    }

    /* renamed from: E */
    public final void mo61334E(String str) {
        vx2.m53591g(str, "symbolWithType");
        k04<C8722a> k04 = this.f42799g;
        C8722a value = k04.getValue();
        C8722a aVar = value;
        if (aVar != null) {
            aVar.mo61357d(str);
        }
        k04.postValue(value);
    }

    /* renamed from: F */
    public final void mo61335F(TimeMode timeMode) {
        vx2.m53591g(timeMode, "timeMode");
        k04<C8722a> k04 = this.f42799g;
        C8722a value = k04.getValue();
        C8722a aVar = value;
        if (aVar != null) {
            aVar.mo61358e(timeMode);
        }
        k04.postValue(value);
    }

    /* renamed from: G */
    public final void mo61336G(TimeSpan timeSpan) {
        vx2.m53591g(timeSpan, "timeSpan");
        k04<C8722a> k04 = this.f42799g;
        C8722a value = k04.getValue();
        C8722a aVar = value;
        if (aVar != null) {
            aVar.mo61360f(timeSpan);
        }
        k04.postValue(value);
    }

    /* renamed from: H */
    public final void mo61337H() {
        y23 unused = d50.m56748b(mo61338j(), (CoroutineContext) null, (CoroutineStart) null, new ReflectionTrackerViewModel$updatePrice$1(this, (ns0<? super ReflectionTrackerViewModel$updatePrice$1>) null), 3, (Object) null);
    }

    /* renamed from: j */
    public final hu0 mo61338j() {
        return iu0.m59111a(qh1.m71265b());
    }

    /* renamed from: k */
    public final void mo61339k(RoomReflectionsToken roomReflectionsToken) {
        vx2.m53591g(roomReflectionsToken, "rrt");
        y23 unused = d50.m56748b(mo61338j(), (CoroutineContext) null, (CoroutineStart) null, new ReflectionTrackerViewModel$deleteSymbolWithType$1(roomReflectionsToken, this, (ns0<? super ReflectionTrackerViewModel$deleteSymbolWithType$1>) null), 3, (Object) null);
    }

    /* renamed from: l */
    public final z42<List<RoomReflectionsToken>> mo61340l(k04<TokenType> k04) {
        vx2.m53591g(k04, "chainTokenType");
        LiveData<Y> c = qw6.m25943c(k04, new C8725d(this));
        vx2.m53590f(c, "Transformations.switchMap(this) { transform(it) }");
        LiveData<Y> b = qw6.m25942b(c, new C8724c(this));
        vx2.m53590f(b, "Transformations.map(this) { transform(it) }");
        return e52.m57214f(e52.m57221m(FlowLiveDataConversions.m5023a(b)), new ReflectionTrackerViewModel$fetchReflectionCached$3(this, (ns0<? super ReflectionTrackerViewModel$fetchReflectionCached$3>) null));
    }

    /* renamed from: m */
    public final z42<List<RoomReflectionsDataAndToken>> mo61341m() {
        z42<Y> a;
        z42<Y> m;
        LiveData<List<RoomReflectionsDataAndToken>> liveData = this.f42800h;
        if (liveData == null) {
            return null;
        }
        LiveData<Y> b = qw6.m25942b(liveData, new C8726e(this));
        vx2.m53590f(b, "Transformations.map(this) { transform(it) }");
        if (b == null || (a = FlowLiveDataConversions.m5023a(b)) == null || (m = e52.m57221m(a)) == null) {
            return null;
        }
        return e52.m57214f(m, new ReflectionTrackerViewModel$fetchReflectionData$2(this, (ns0<? super ReflectionTrackerViewModel$fetchReflectionData$2>) null));
    }

    /* renamed from: n */
    public final LiveData<RoomReflectionsToken> mo61342n(String str) {
        vx2.m53591g(str, "symbolWithType");
        LiveData<RoomReflectionsTokenAndData> b = mo61347s().mo60741b(str);
        if (b != null) {
            LiveData<X> a = qw6.m25941a(b);
            vx2.m53590f(a, "Transformations.distinctUntilChanged(this)");
            if (a != null) {
                LiveData<RoomReflectionsToken> b2 = qw6.m25942b(a, new C8727f(this));
                vx2.m53590f(b2, "Transformations.map(this) { transform(it) }");
                return b2;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final k04<C8722a> mo61343o() {
        return this.f42799g;
    }

    /* renamed from: p */
    public final do2 mo61344p() {
        return (do2) this.f42801i.getValue();
    }

    /* renamed from: q */
    public final k04<Date> mo61345q() {
        return this.f42795c;
    }

    /* renamed from: r */
    public final ReflectionCustomContract mo61346r() {
        return (ReflectionCustomContract) this.f42798f.getValue();
    }

    /* renamed from: s */
    public final ReflectionDataSource mo61347s() {
        return (ReflectionDataSource) this.f42796d.getValue();
    }

    /* renamed from: t */
    public final TokenType mo61348t() {
        Application b = mo27549b();
        vx2.m53590f(b, "getApplication<Application>()");
        return ol0.m70355e(b);
    }

    /* renamed from: u */
    public final k04<TokenType> mo61349u() {
        return this.f42794b;
    }

    /* renamed from: v */
    public final Map<String, TokenType> mo61350v() {
        if (this.f42802j == null) {
            this.f42802j = mo61344p().get();
        }
        Map<String, ? extends TokenType> map = this.f42802j;
        vx2.m53588d(map);
        return map;
    }

    /* renamed from: w */
    public final LocalUserTokenDataSource mo61351w() {
        return (LocalUserTokenDataSource) this.f42797e.getValue();
    }

    /* renamed from: x */
    public final void mo61352x(RoomReflectionsToken roomReflectionsToken) {
        vx2.m53591g(roomReflectionsToken, "rrt");
        y23 unused = d50.m56748b(mo61338j(), (CoroutineContext) null, (CoroutineStart) null, new ReflectionTrackerViewModel$onChangeReflectionEnable$1(this, roomReflectionsToken, (ns0<? super ReflectionTrackerViewModel$onChangeReflectionEnable$1>) null), 3, (Object) null);
    }

    /* renamed from: z */
    public final void mo61353z(String str) {
        vx2.m53591g(str, "symbolWithType");
        y23 unused = d50.m56748b(mo61338j(), (CoroutineContext) null, (CoroutineStart) null, new ReflectionTrackerViewModel$removeAndSeed$1(this, str, (ns0<? super ReflectionTrackerViewModel$removeAndSeed$1>) null), 3, (Object) null);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "symbolWithType", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeMode;", "b", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeMode;", "()Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeMode;", "e", "(Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeMode;)V", "timeMode", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeSpan;", "c", "Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeSpan;", "()Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeSpan;", "f", "(Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeSpan;)V", "timeSpan", "<init>", "(Ljava/lang/String;Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeMode;Lnet/safemoon/androidwallet/viewmodels/ReflectionTrackerViewModel$TimeSpan;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.ReflectionTrackerViewModel$a */
    /* compiled from: ReflectionTrackerViewModel.kt */
    public static final class C8722a {

        /* renamed from: a */
        public String f42805a;

        /* renamed from: b */
        public TimeMode f42806b;

        /* renamed from: c */
        public TimeSpan f42807c;

        public C8722a(String str, TimeMode timeMode, TimeSpan timeSpan) {
            vx2.m53591g(str, "symbolWithType");
            vx2.m53591g(timeMode, "timeMode");
            vx2.m53591g(timeSpan, "timeSpan");
            this.f42805a = str;
            this.f42806b = timeMode;
            this.f42807c = timeSpan;
        }

        /* renamed from: a */
        public final String mo61354a() {
            return this.f42805a;
        }

        /* renamed from: b */
        public final TimeMode mo61355b() {
            return this.f42806b;
        }

        /* renamed from: c */
        public final TimeSpan mo61356c() {
            return this.f42807c;
        }

        /* renamed from: d */
        public final void mo61357d(String str) {
            vx2.m53591g(str, "<set-?>");
            this.f42805a = str;
        }

        /* renamed from: e */
        public final void mo61358e(TimeMode timeMode) {
            vx2.m53591g(timeMode, "<set-?>");
            this.f42806b = timeMode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8722a)) {
                return false;
            }
            C8722a aVar = (C8722a) obj;
            return vx2.m53586b(this.f42805a, aVar.f42805a) && this.f42806b == aVar.f42806b && this.f42807c == aVar.f42807c;
        }

        /* renamed from: f */
        public final void mo61360f(TimeSpan timeSpan) {
            vx2.m53591g(timeSpan, "<set-?>");
            this.f42807c = timeSpan;
        }

        public int hashCode() {
            return (((this.f42805a.hashCode() * 31) + this.f42806b.hashCode()) * 31) + this.f42807c.hashCode();
        }

        public String toString() {
            String str = this.f42805a;
            TimeMode timeMode = this.f42806b;
            TimeSpan timeSpan = this.f42807c;
            return "ReflectionParam(symbolWithType=" + str + ", timeMode=" + timeMode + ", timeSpan=" + timeSpan + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C8722a(String str, TimeMode timeMode, TimeSpan timeSpan, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? TimeMode.DAILY : timeMode, (i & 4) != 0 ? TimeSpan.LOW : timeSpan);
        }
    }
}
