package com.walletconnect.android.internal.common.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0005\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/Redirect;", "", "", "native", "universal", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "getUniversal", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Redirect.kt */
public final class Redirect {

    /* renamed from: a */
    public final String f27129a;

    /* renamed from: b */
    public final String f27130b;

    public Redirect() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public Redirect(@y33(name = "native") String str, @y33(name = "universal") String str2) {
        this.f27129a = str;
        this.f27130b = str2;
    }

    /* renamed from: a */
    public final String mo40322a() {
        return this.f27129a;
    }

    public final Redirect copy(@y33(name = "native") String str, @y33(name = "universal") String str2) {
        return new Redirect(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Redirect)) {
            return false;
        }
        Redirect redirect = (Redirect) obj;
        return vx2.m53586b(this.f27129a, redirect.f27129a) && vx2.m53586b(this.f27130b, redirect.f27130b);
    }

    public int hashCode() {
        String str = this.f27129a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27130b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f27129a;
        String str2 = this.f27130b;
        return "Redirect(native=" + str + ", universal=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Redirect(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
