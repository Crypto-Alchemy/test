package net.safemoon.androidwallet.fragments;

import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatEditText;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.fragments.SelectCurrencyFragment;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.utils.PreFetchData;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/swap/Swap;", "kotlin.jvm.PlatformType", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SelectCurrencyFragment.kt */
public final class SelectCurrencyFragment$observeViewModel$1 extends Lambda implements rc2<List<? extends Swap>, r37> {
    public final /* synthetic */ SelectCurrencyFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SelectCurrencyFragment$observeViewModel$1$a */
    /* compiled from: Comparisons.kt */
    public static final class C8444a<T> implements Comparator {
        public final int compare(T t, T t2) {
            String str = ((Swap) t).name;
            vx2.m53590f(str, "it.name");
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String str2 = ((Swap) t2).name;
            vx2.m53590f(str2, "it.name");
            String lowerCase2 = str2.toLowerCase(locale);
            vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return xl0.m54426a(lowerCase, lowerCase2);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SelectCurrencyFragment$observeViewModel$1$b */
    /* compiled from: Comparisons.kt */
    public static final class C8445b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(((Swap) t2).nativeBalance, ((Swap) t).nativeBalance);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.SelectCurrencyFragment$observeViewModel$1$c */
    /* compiled from: Comparisons.kt */
    public static final class C8446c<T> implements Comparator {
        public final int compare(T t, T t2) {
            Object[] b0 = ArraysKt___ArraysKt.m47276b0(new String[]{"BNB", "SFM", "ETH", "PSAFEMOON"});
            String str = ((Swap) t2).symbol;
            vx2.m53590f(str, "it.symbol");
            Locale locale = Locale.ROOT;
            String upperCase = str.toUpperCase(locale);
            vx2.m53590f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Boolean valueOf = Boolean.valueOf(ArraysKt___ArraysKt.m47249D(b0, upperCase));
            Object[] b02 = ArraysKt___ArraysKt.m47276b0(new String[]{"BNB", "SFM", "ETH", "PSAFEMOON"});
            String str2 = ((Swap) t).symbol;
            vx2.m53590f(str2, "it.symbol");
            String upperCase2 = str2.toUpperCase(locale);
            vx2.m53590f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return xl0.m54426a(valueOf, Boolean.valueOf(ArraysKt___ArraysKt.m47249D(b02, upperCase2)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectCurrencyFragment$observeViewModel$1(SelectCurrencyFragment selectCurrencyFragment) {
        super(1);
        this.this$0 = selectCurrencyFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends Swap>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<? extends Swap> list) {
        AppCompatEditText appCompatEditText;
        T t;
        Double d;
        boolean z;
        boolean z2;
        ProgressLoading w = this.this$0.f42084x;
        if (w != null) {
            w.mo22266k();
        }
        if (list != null) {
            SelectCurrencyFragment selectCurrencyFragment = this.this$0;
            pa2 v = selectCurrencyFragment.mo57640B();
            ProgressBar progressBar = v != null ? v.f32620c : null;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            bj6 x = selectCurrencyFragment.mo57641C();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean z3 = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                Swap swap = (Swap) next;
                Swap value = selectCurrencyFragment.mo57642D().mo61553B0().getValue();
                Swap value2 = selectCurrencyFragment.mo57642D().mo61604c0().getValue();
                if ((value == null || !vx2.m53586b(value.address, swap.address)) && (value2 == null || !vx2.m53586b(value2.address, swap.address))) {
                    z3 = true;
                }
                if (z3) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : arrayList) {
                Swap swap2 = (Swap) next2;
                Swap value3 = selectCurrencyFragment.mo57642D().mo61553B0().getValue();
                Swap value4 = selectCurrencyFragment.mo57642D().mo61604c0().getValue();
                if (selectCurrencyFragment.mo57643E() != SelectCurrencyFragment.SWAPPATH.Source || value4 == null) {
                    z2 = value3 != null ? selectCurrencyFragment.mo57645K(swap2, value3) : false;
                } else {
                    z2 = selectCurrencyFragment.mo57645K(swap2, value4);
                }
                if (!z2) {
                    arrayList2.add(next2);
                }
            }
            ArrayList<Swap> arrayList3 = new ArrayList<>();
            for (Object next3 : arrayList2) {
                if (selectCurrencyFragment.mo57643E() != SelectCurrencyFragment.SWAPPATH.Destination || !vx2.m53586b(((Swap) next3).symbol, "SAFEMOON")) {
                    arrayList3.add(next3);
                }
            }
            for (Swap swap3 : arrayList3) {
                Iterator<T> it2 = PreFetchData.f42593a.mo60932a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it2.next();
                    w70 w70 = (w70) t;
                    int b = w70.mo66643b();
                    Integer num = swap3.chainId;
                    if (num != null && b == num.intValue() && vx2.m53586b(w70.mo66642a(), swap3.address)) {
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
                w70 w702 = (w70) t;
                if (w702 != null) {
                    d = Double.valueOf(w702.mo66649g());
                } else {
                    d = Double.valueOf(Utils.DOUBLE_EPSILON);
                }
                swap3.nativeBalance = d;
            }
            x.mo50605g(CollectionsKt___CollectionsKt.m47304D0(CollectionsKt___CollectionsKt.m47304D0(CollectionsKt___CollectionsKt.m47304D0(arrayList3, new C8444a()), new C8445b()), new C8446c()));
            pa2 v2 = selectCurrencyFragment.mo57640B();
            if (v2 != null && (appCompatEditText = v2.f32619b) != null) {
                appCompatEditText.setText(appCompatEditText.getText());
            }
        }
    }
}
