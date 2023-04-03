package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.model.MyTokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR%\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SelectedChainViewModel;", "Lwj;", "Lk04;", "", "Lnet/safemoon/androidwallet/model/MyTokenType;", "b", "Lk04;", "i", "()Lk04;", "allChains", "", "kotlin.jvm.PlatformType", "c", "k", "search", "Lls3;", "", "d", "Lls3;", "j", "()Lls3;", "chainListForAdapter", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SelectedChainViewModel.kt */
public final class SelectedChainViewModel extends C3552wj {

    /* renamed from: b */
    public final k04<List<MyTokenType>> f42818b;

    /* renamed from: c */
    public final k04<String> f42819c;

    /* renamed from: d */
    public final ls3<List<MyTokenType>> f42820d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectedChainViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        k04<List<MyTokenType>> k04 = new k04<>();
        this.f42818b = k04;
        k04<String> k042 = new k04<>("");
        this.f42819c = k042;
        ls3<List<MyTokenType>> ls3 = new ls3<>();
        ls3.mo22951a(k042, new rt5(new SelectedChainViewModel$chainListForAdapter$1$1(ls3, this)));
        ls3.mo22951a(k04, new st5(new SelectedChainViewModel$chainListForAdapter$1$2(ls3, this)));
        m68814h(ls3, this);
        this.f42820d = ls3;
    }

    /* renamed from: f */
    public static final void m68812f(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: g */
    public static final void m68813g(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: h */
    public static final void m68814h(ls3<List<MyTokenType>> ls3, SelectedChainViewModel selectedChainViewModel) {
        boolean z;
        List value = selectedChainViewModel.f42818b.getValue();
        ArrayList arrayList = null;
        if (value != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : value) {
                MyTokenType myTokenType = (MyTokenType) next;
                String value2 = selectedChainViewModel.f42819c.getValue();
                String str = "";
                if (value2 == null) {
                    value2 = str;
                }
                vx2.m53590f(value2, "search.value?:\"\"");
                boolean z2 = true;
                if (value2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String chainTitle = myTokenType.getTokenType().getChainTitle();
                    Locale locale = Locale.ROOT;
                    String lowerCase = chainTitle.toLowerCase(locale);
                    vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String value3 = selectedChainViewModel.f42819c.getValue();
                    if (value3 == null) {
                        value3 = str;
                    }
                    vx2.m53590f(value3, "search.value ?: \"\"");
                    if (!StringsKt__StringsKt.m63081R(lowerCase, value3, false, 2, (Object) null)) {
                        String lowerCase2 = myTokenType.getTokenType().getDisplayName().toLowerCase(locale);
                        vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String value4 = selectedChainViewModel.f42819c.getValue();
                        if (value4 != null) {
                            str = value4;
                        }
                        vx2.m53590f(str, "search.value ?: \"\"");
                        if (!StringsKt__StringsKt.m63081R(lowerCase2, str, false, 2, (Object) null)) {
                            z2 = false;
                        }
                    }
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        }
        ls3.postValue(arrayList);
    }

    /* renamed from: i */
    public final k04<List<MyTokenType>> mo61392i() {
        return this.f42818b;
    }

    /* renamed from: j */
    public final ls3<List<MyTokenType>> mo61393j() {
        return this.f42820d;
    }

    /* renamed from: k */
    public final k04<String> mo61394k() {
        return this.f42819c;
    }
}
