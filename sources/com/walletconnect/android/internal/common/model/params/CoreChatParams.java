package com.walletconnect.android.internal.common.model.params;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/CoreChatParams;", "Lrg0;", "<init>", "()V", "AcceptanceParams", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CoreChatParams.kt */
public class CoreChatParams implements rg0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/CoreChatParams$AcceptanceParams;", "Lcom/walletconnect/android/internal/common/model/params/CoreChatParams;", "", "publicKey", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: CoreChatParams.kt */
    public static final class AcceptanceParams extends CoreChatParams {

        /* renamed from: a */
        public final String f27150a;

        public AcceptanceParams(@y33(name = "publicKey") String str) {
            vx2.m53591g(str, "publicKey");
            this.f27150a = str;
        }

        /* renamed from: a */
        public final String mo40358a() {
            return this.f27150a;
        }

        public final AcceptanceParams copy(@y33(name = "publicKey") String str) {
            vx2.m53591g(str, "publicKey");
            return new AcceptanceParams(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AcceptanceParams) && vx2.m53586b(this.f27150a, ((AcceptanceParams) obj).f27150a);
        }

        public int hashCode() {
            return this.f27150a.hashCode();
        }

        public String toString() {
            String str = this.f27150a;
            return "AcceptanceParams(publicKey=" + str + ")";
        }
    }
}
