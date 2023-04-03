package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;
import net.safemoon.androidwallet.repository.FcmDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0001*B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J*\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006+"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "Lwj;", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "item", "", "updateToServer", "Lkotlin/Function0;", "Lr37;", "callBack", "n", "", "searchField", "", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "l", "Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "k", "h", "m", "p", "Lxn2;", "b", "Lxn2;", "iFiatTokenDataSource", "Lnet/safemoon/androidwallet/repository/FcmDataSource;", "c", "Lef3;", "j", "()Lnet/safemoon/androidwallet/repository/FcmDataSource;", "fcmDataSource", "Landroidx/lifecycle/LiveData;", "", "d", "Landroidx/lifecycle/LiveData;", "i", "()Landroidx/lifecycle/LiveData;", "allFiat", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Lxn2;)V", "e", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SelectFiatViewModel.kt */
public final class SelectFiatViewModel extends C3552wj {

    /* renamed from: e */
    public static final C8730a f42813e = new C8730a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final List<String> f42814f = ck0.m33065m("AUD", "EUR", "GBP", "USD");

    /* renamed from: b */
    public final xn2 f42815b;

    /* renamed from: c */
    public final ef3 f42816c;

    /* renamed from: d */
    public final LiveData<List<RoomFiat>> f42817d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel$a;", "", "", "", "popularCurrency", "Ljava/util/List;", "a", "()Ljava/util/List;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$a */
    /* compiled from: SelectFiatViewModel.kt */
    public static final class C8730a {
        public C8730a() {
        }

        public /* synthetic */ C8730a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<String> mo61382a() {
            return SelectFiatViewModel.f42814f;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$b */
    /* compiled from: Comparisons.kt */
    public static final class C8731b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(((RoomFiat) t).getSymbol(), ((RoomFiat) t2).getSymbol());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$c */
    /* compiled from: Comparisons.kt */
    public static final class C8732c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(((RoomFiat) t).getSymbol(), ((RoomFiat) t2).getSymbol());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$d */
    /* compiled from: Comparisons.kt */
    public static final class C8733d<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(((RoomFiat) t).getSymbol(), ((RoomFiat) t2).getSymbol());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectFiatViewModel(Application application, xn2 xn2) {
        super(application);
        vx2.m53591g(application, "application");
        vx2.m53591g(xn2, "iFiatTokenDataSource");
        this.f42815b = xn2;
        this.f42816c = C6169a.m47232a(new SelectFiatViewModel$fcmDataSource$2(application));
        LiveData<List<RoomFiat>> a = qw6.m25941a(xn2.mo50428a());
        vx2.m53590f(a, "Transformations.distinctUntilChanged(this)");
        this.f42817d = a;
        mo61380p();
        a.observeForever(new qt5(new rc2<List<? extends RoomFiat>, r37>(this) {
            public final /* synthetic */ SelectFiatViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<RoomFiat>) (List) obj);
                return r37.f33317a;
            }

            public final void invoke(List<RoomFiat> list) {
                this.this$0.mo61378m();
            }
        }));
    }

    /* renamed from: d */
    public static final void m68795d(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: o */
    public static /* synthetic */ void m68799o(SelectFiatViewModel selectFiatViewModel, Fiat fiat, boolean z, pc2 pc2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            pc2 = null;
        }
        selectFiatViewModel.mo61379n(fiat, z, pc2);
    }

    /* renamed from: h */
    public final Fiat mo61373h() {
        Fiat.Companion companion = Fiat.Companion;
        String j = f06.m57519j(mo27549b(), "DEFAULT_FIAT", companion.getDEFAULT_CURRENCY_STRING());
        vx2.m53590f(j, "getString(\n            g…CURRENCY_STRING\n        )");
        return companion.mo58938to(j);
    }

    /* renamed from: i */
    public final LiveData<List<RoomFiat>> mo61374i() {
        return this.f42817d;
    }

    /* renamed from: j */
    public final FcmDataSource mo61375j() {
        return (FcmDataSource) this.f42816c.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: net.safemoon.androidwallet.model.fiat.room.RoomFiat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: net.safemoon.androidwallet.model.fiat.room.RoomFiat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: net.safemoon.androidwallet.model.fiat.room.RoomFiat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: net.safemoon.androidwallet.model.fiat.room.RoomFiat} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final net.safemoon.androidwallet.model.fiat.room.RoomFiat mo61376k() {
        /*
            r10 = this;
            androidx.lifecycle.LiveData<java.util.List<net.safemoon.androidwallet.model.fiat.room.RoomFiat>> r0 = r10.f42817d
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x007b
            net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$b r2 = new net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$b
            r2.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47304D0(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x0054
            java.lang.Object r3 = r0.next()
            r5 = r3
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r5 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r5
            java.util.List<java.lang.String> r6 = f42814f
            java.util.Iterator r6 = r6.iterator()
        L_0x0031:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0049
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r5.getSymbol()
            boolean r8 = p000.yb6.m74344y(r8, r9, r4)
            if (r8 == 0) goto L_0x0031
            goto L_0x004a
        L_0x0049:
            r7 = r1
        L_0x004a:
            if (r7 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 == 0) goto L_0x001d
            r2.add(r3)
            goto L_0x001d
        L_0x0054:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x007b
            java.util.Iterator r0 = r2.iterator()
        L_0x005f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0079
            java.lang.Object r2 = r0.next()
            r3 = r2
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r3 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r3
            java.lang.String r3 = r3.getSymbol()
            java.lang.String r4 = "EUR"
            boolean r3 = p000.vx2.m53586b(r3, r4)
            if (r3 == 0) goto L_0x005f
            r1 = r2
        L_0x0079:
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r1 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r1
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.SelectFiatViewModel.mo61376k():net.safemoon.androidwallet.model.fiat.room.RoomFiat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r4 == false) goto L_0x008f;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<net.safemoon.androidwallet.model.common.HistoryListItem> mo61377l(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "searchField"
            p000.vx2.m53591g(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.lifecycle.LiveData<java.util.List<net.safemoon.androidwallet.model.fiat.room.RoomFiat>> r1 = r13.f42817d
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x01a9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r3 = r1.hasNext()
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r1.next()
            r7 = r3
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r7 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r7
            java.lang.CharSequence r8 = kotlin.text.StringsKt__StringsKt.m63090V0(r14)
            java.lang.String r8 = r8.toString()
            int r8 = r8.length()
            if (r8 != 0) goto L_0x003d
            r8 = r6
            goto L_0x003e
        L_0x003d:
            r8 = r5
        L_0x003e:
            if (r8 != 0) goto L_0x008e
            java.lang.String r8 = r7.getSymbol()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r9)
            java.lang.String r10 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p000.vx2.m53590f(r8, r10)
            java.lang.String r11 = r14.toLowerCase(r9)
            p000.vx2.m53590f(r11, r10)
            java.lang.CharSequence r11 = kotlin.text.StringsKt__StringsKt.m63090V0(r11)
            java.lang.String r11 = r11.toString()
            r12 = 2
            boolean r8 = kotlin.text.StringsKt__StringsKt.m63081R(r8, r11, r5, r12, r4)
            if (r8 != 0) goto L_0x008e
            java.lang.String r7 = r7.getName()
            if (r7 == 0) goto L_0x008b
            java.lang.String r7 = r7.toLowerCase(r9)
            p000.vx2.m53590f(r7, r10)
            if (r7 == 0) goto L_0x008b
            java.lang.String r8 = r14.toLowerCase(r9)
            p000.vx2.m53590f(r8, r10)
            java.lang.CharSequence r8 = kotlin.text.StringsKt__StringsKt.m63090V0(r8)
            java.lang.String r8 = r8.toString()
            boolean r4 = kotlin.text.StringsKt__StringsKt.m63081R(r7, r8, r5, r12, r4)
            if (r4 != r6) goto L_0x008b
            r4 = r6
            goto L_0x008c
        L_0x008b:
            r4 = r5
        L_0x008c:
            if (r4 == 0) goto L_0x008f
        L_0x008e:
            r5 = r6
        L_0x008f:
            if (r5 == 0) goto L_0x001d
            r2.add(r3)
            goto L_0x001d
        L_0x0095:
            net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$c r14 = new net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$c
            r14.<init>()
            java.util.List r14 = kotlin.collections.CollectionsKt___CollectionsKt.m47304D0(r2, r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x00a7:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x00de
            java.lang.Object r3 = r14.next()
            r7 = r3
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r7 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r7
            java.util.List<java.lang.String> r8 = f42814f
            java.util.Iterator r8 = r8.iterator()
        L_0x00ba:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00d2
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = r7.getSymbol()
            boolean r10 = p000.yb6.m74344y(r10, r11, r6)
            if (r10 == 0) goto L_0x00ba
            goto L_0x00d3
        L_0x00d2:
            r9 = r4
        L_0x00d3:
            if (r9 == 0) goto L_0x00d7
            r7 = r6
            goto L_0x00d8
        L_0x00d7:
            r7 = r5
        L_0x00d8:
            if (r7 == 0) goto L_0x00a7
            r1.add(r3)
            goto L_0x00a7
        L_0x00de:
            net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$d r14 = new net.safemoon.androidwallet.viewmodels.SelectFiatViewModel$d
            r14.<init>()
            java.util.List r14 = kotlin.collections.CollectionsKt___CollectionsKt.m47304D0(r2, r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x00f0:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0127
            java.lang.Object r3 = r14.next()
            r7 = r3
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r7 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r7
            java.util.List<java.lang.String> r8 = f42814f
            java.util.Iterator r8 = r8.iterator()
        L_0x0103:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x011b
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = r7.getSymbol()
            boolean r10 = p000.yb6.m74344y(r10, r11, r6)
            if (r10 == 0) goto L_0x0103
            goto L_0x011c
        L_0x011b:
            r9 = r4
        L_0x011c:
            if (r9 != 0) goto L_0x0120
            r7 = r6
            goto L_0x0121
        L_0x0120:
            r7 = r5
        L_0x0121:
            if (r7 == 0) goto L_0x00f0
            r2.add(r3)
            goto L_0x00f0
        L_0x0127:
            boolean r14 = r1.isEmpty()
            r14 = r14 ^ r6
            if (r14 == 0) goto L_0x0168
            net.safemoon.androidwallet.model.common.HeaderItemHistory r14 = new net.safemoon.androidwallet.model.common.HeaderItemHistory
            r14.<init>()
            android.app.Application r3 = r13.mo27549b()
            r4 = 2131952543(0x7f13039f, float:1.9541532E38)
            java.lang.String r3 = r3.getString(r4)
            r14.setTitle(r3)
            r0.add(r14)
            java.util.Iterator r14 = r1.iterator()
        L_0x0148:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0160
            java.lang.Object r1 = r14.next()
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r1 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r1
            net.safemoon.androidwallet.model.fiat.ResultItemFiat r3 = new net.safemoon.androidwallet.model.fiat.ResultItemFiat
            r3.<init>()
            r3.setResult(r1)
            r0.add(r3)
            goto L_0x0148
        L_0x0160:
            net.safemoon.androidwallet.model.common.FooterHistoryItem r14 = new net.safemoon.androidwallet.model.common.FooterHistoryItem
            r14.<init>()
            r0.add(r14)
        L_0x0168:
            boolean r14 = r2.isEmpty()
            r14 = r14 ^ r6
            if (r14 == 0) goto L_0x01a9
            net.safemoon.androidwallet.model.common.HeaderItemHistory r14 = new net.safemoon.androidwallet.model.common.HeaderItemHistory
            r14.<init>()
            android.app.Application r1 = r13.mo27549b()
            r3 = 2131952542(0x7f13039e, float:1.954153E38)
            java.lang.String r1 = r1.getString(r3)
            r14.setTitle(r1)
            r0.add(r14)
            java.util.Iterator r14 = r2.iterator()
        L_0x0189:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x01a1
            java.lang.Object r1 = r14.next()
            net.safemoon.androidwallet.model.fiat.room.RoomFiat r1 = (net.safemoon.androidwallet.model.fiat.room.RoomFiat) r1
            net.safemoon.androidwallet.model.fiat.ResultItemFiat r2 = new net.safemoon.androidwallet.model.fiat.ResultItemFiat
            r2.<init>()
            r2.setResult(r1)
            r0.add(r2)
            goto L_0x0189
        L_0x01a1:
            net.safemoon.androidwallet.model.common.FooterHistoryItem r14 = new net.safemoon.androidwallet.model.common.FooterHistoryItem
            r14.<init>()
            r0.add(r14)
        L_0x01a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.SelectFiatViewModel.mo61377l(java.lang.String):java.util.List");
    }

    /* renamed from: m */
    public final void mo61378m() {
        Object obj;
        Fiat h = mo61373h();
        rz1.f44501a.mo65775e(h);
        List value = this.f42817d.getValue();
        if (value != null) {
            ListIterator listIterator = value.listIterator(value.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (vx2.m53586b(((RoomFiat) obj).getSymbol(), h.getSymbol())) {
                    break;
                }
            }
            RoomFiat roomFiat = (RoomFiat) obj;
            if (roomFiat != null) {
                f06.m57524o(mo27549b(), "DEFAULT_FIAT", new Fiat(roomFiat.getSymbol(), roomFiat.getName(), roomFiat.getRate()).toString());
            }
        }
    }

    /* renamed from: n */
    public final void mo61379n(Fiat fiat, boolean z, pc2<r37> pc2) {
        vx2.m53591g(fiat, "item");
        if (z) {
            FcmDataSource.m68151g(mo61375j(), (String) null, fiat.getSymbol(), false, new SelectFiatViewModel$setDefault$1(this, fiat, pc2), 5, (Object) null);
            return;
        }
        f06.m57524o(mo27549b(), "DEFAULT_FIAT", fiat.toString());
        mo61378m();
    }

    /* renamed from: p */
    public final void mo61380p() {
        ih2 ih2 = ih2.f38385a;
        y23 unused = d50.m56748b(ih2, (CoroutineContext) null, (CoroutineStart) null, new SelectFiatViewModel$updateRates$1(this, (ns0<? super SelectFiatViewModel$updateRates$1>) null), 3, (Object) null);
        y23 unused2 = d50.m56748b(ih2, (CoroutineContext) null, (CoroutineStart) null, new SelectFiatViewModel$updateRates$2(this, (ns0<? super SelectFiatViewModel$updateRates$2>) null), 3, (Object) null);
    }
}
