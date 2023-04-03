package com.walletconnect.android.internal.common.model.params;

import com.walletconnect.android.internal.common.model.RelayProtocolOptions;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/CoreSignParams;", "Lrg0;", "<init>", "()V", "ApprovalParams", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CoreSignParams.kt */
public class CoreSignParams implements rg0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/CoreSignParams$ApprovalParams;", "Lcom/walletconnect/android/internal/common/model/params/CoreSignParams;", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "relay", "", "responderPublicKey", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "()Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: CoreSignParams.kt */
    public static final class ApprovalParams extends CoreSignParams {

        /* renamed from: a */
        public final RelayProtocolOptions f27153a;

        /* renamed from: b */
        public final String f27154b;

        public ApprovalParams(@y33(name = "relay") RelayProtocolOptions relayProtocolOptions, @y33(name = "responderPublicKey") String str) {
            vx2.m53591g(relayProtocolOptions, "relay");
            vx2.m53591g(str, "responderPublicKey");
            this.f27153a = relayProtocolOptions;
            this.f27154b = str;
        }

        /* renamed from: a */
        public final RelayProtocolOptions mo40366a() {
            return this.f27153a;
        }

        /* renamed from: b */
        public final String mo40367b() {
            return this.f27154b;
        }

        public final ApprovalParams copy(@y33(name = "relay") RelayProtocolOptions relayProtocolOptions, @y33(name = "responderPublicKey") String str) {
            vx2.m53591g(relayProtocolOptions, "relay");
            vx2.m53591g(str, "responderPublicKey");
            return new ApprovalParams(relayProtocolOptions, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApprovalParams)) {
                return false;
            }
            ApprovalParams approvalParams = (ApprovalParams) obj;
            return vx2.m53586b(this.f27153a, approvalParams.f27153a) && vx2.m53586b(this.f27154b, approvalParams.f27154b);
        }

        public int hashCode() {
            return (this.f27153a.hashCode() * 31) + this.f27154b.hashCode();
        }

        public String toString() {
            RelayProtocolOptions relayProtocolOptions = this.f27153a;
            String str = this.f27154b;
            return "ApprovalParams(relay=" + relayProtocolOptions + ", responderPublicKey=" + str + ")";
        }
    }
}
