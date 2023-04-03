package com.walletconnect.android.internal.common.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/AppMetaData;", "", "", "name", "description", "url", "", "icons", "Lcom/walletconnect/android/internal/common/model/Redirect;", "redirect", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "e", "d", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/walletconnect/android/internal/common/model/Redirect;", "()Lcom/walletconnect/android/internal/common/model/Redirect;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/walletconnect/android/internal/common/model/Redirect;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: AppMetaData.kt */
public final class AppMetaData {

    /* renamed from: a */
    public final String f27118a;

    /* renamed from: b */
    public final String f27119b;

    /* renamed from: c */
    public final String f27120c;

    /* renamed from: d */
    public final List<String> f27121d;

    /* renamed from: e */
    public final Redirect f27122e;

    public AppMetaData(@y33(name = "name") String str, @y33(name = "description") String str2, @y33(name = "url") String str3, @y33(name = "icons") List<String> list, @y33(name = "redirect") Redirect redirect) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "description");
        vx2.m53591g(str3, "url");
        vx2.m53591g(list, "icons");
        this.f27118a = str;
        this.f27119b = str2;
        this.f27120c = str3;
        this.f27121d = list;
        this.f27122e = redirect;
    }

    /* renamed from: a */
    public final String mo40309a() {
        return this.f27119b;
    }

    /* renamed from: b */
    public final List<String> mo40310b() {
        return this.f27121d;
    }

    /* renamed from: c */
    public final String mo40311c() {
        return this.f27118a;
    }

    public final AppMetaData copy(@y33(name = "name") String str, @y33(name = "description") String str2, @y33(name = "url") String str3, @y33(name = "icons") List<String> list, @y33(name = "redirect") Redirect redirect) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "description");
        vx2.m53591g(str3, "url");
        vx2.m53591g(list, "icons");
        return new AppMetaData(str, str2, str3, list, redirect);
    }

    /* renamed from: d */
    public final Redirect mo40313d() {
        return this.f27122e;
    }

    /* renamed from: e */
    public final String mo40314e() {
        return this.f27120c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMetaData)) {
            return false;
        }
        AppMetaData appMetaData = (AppMetaData) obj;
        return vx2.m53586b(this.f27118a, appMetaData.f27118a) && vx2.m53586b(this.f27119b, appMetaData.f27119b) && vx2.m53586b(this.f27120c, appMetaData.f27120c) && vx2.m53586b(this.f27121d, appMetaData.f27121d) && vx2.m53586b(this.f27122e, appMetaData.f27122e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f27118a.hashCode() * 31) + this.f27119b.hashCode()) * 31) + this.f27120c.hashCode()) * 31) + this.f27121d.hashCode()) * 31;
        Redirect redirect = this.f27122e;
        return hashCode + (redirect == null ? 0 : redirect.hashCode());
    }

    public String toString() {
        String str = this.f27118a;
        String str2 = this.f27119b;
        String str3 = this.f27120c;
        List<String> list = this.f27121d;
        Redirect redirect = this.f27122e;
        return "AppMetaData(name=" + str + ", description=" + str2 + ", url=" + str3 + ", icons=" + list + ", redirect=" + redirect + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppMetaData(String str, String str2, String str3, List list, Redirect redirect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i & 16) != 0 ? null : redirect);
    }
}
