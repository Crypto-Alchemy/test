package com.trustwallet.walletconnect.models.ethereum;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage;", "", "raw", "", "", "type", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage$WCSignType;", "(Ljava/util/List;Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage$WCSignType;)V", "data", "getData", "()Ljava/lang/String;", "getRaw", "()Ljava/util/List;", "getType", "()Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage$WCSignType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "WCSignType", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCEthereumSignMessage.kt */
public final class WCEthereumSignMessage {
    private final List<String> raw;
    private final WCSignType type;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumSignMessage$WCSignType;", "", "(Ljava/lang/String;I)V", "MESSAGE", "PERSONAL_MESSAGE", "TYPED_MESSAGE", "ETH_SIGN_TYPE_DATA_V4", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCEthereumSignMessage.kt */
    public enum WCSignType {
        MESSAGE,
        PERSONAL_MESSAGE,
        TYPED_MESSAGE,
        ETH_SIGN_TYPE_DATA_V4
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCEthereumSignMessage.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage$WCSignType[] r0 = com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage.WCSignType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage$WCSignType r1 = com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage.WCSignType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage$WCSignType r1 = com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage.WCSignType.TYPED_MESSAGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage$WCSignType r1 = com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage.WCSignType.ETH_SIGN_TYPE_DATA_V4     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage$WCSignType r1 = com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage.WCSignType.PERSONAL_MESSAGE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.trustwallet.walletconnect.models.ethereum.WCEthereumSignMessage.WhenMappings.<clinit>():void");
        }
    }

    public WCEthereumSignMessage(List<String> list, WCSignType wCSignType) {
        vx2.m53591g(list, "raw");
        vx2.m53591g(wCSignType, "type");
        this.raw = list;
        this.type = wCSignType;
    }

    public static /* synthetic */ WCEthereumSignMessage copy$default(WCEthereumSignMessage wCEthereumSignMessage, List<String> list, WCSignType wCSignType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wCEthereumSignMessage.raw;
        }
        if ((i & 2) != 0) {
            wCSignType = wCEthereumSignMessage.type;
        }
        return wCEthereumSignMessage.copy(list, wCSignType);
    }

    public final List<String> component1() {
        return this.raw;
    }

    public final WCSignType component2() {
        return this.type;
    }

    public final WCEthereumSignMessage copy(List<String> list, WCSignType wCSignType) {
        vx2.m53591g(list, "raw");
        vx2.m53591g(wCSignType, "type");
        return new WCEthereumSignMessage(list, wCSignType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCEthereumSignMessage)) {
            return false;
        }
        WCEthereumSignMessage wCEthereumSignMessage = (WCEthereumSignMessage) obj;
        return vx2.m53586b(this.raw, wCEthereumSignMessage.raw) && this.type == wCEthereumSignMessage.type;
    }

    public final String getData() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            return this.raw.get(1);
        }
        if (i == 2) {
            return this.raw.get(1);
        }
        if (i == 3) {
            return this.raw.get(1);
        }
        if (i == 4) {
            return this.raw.get(0);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<String> getRaw() {
        return this.raw;
    }

    public final WCSignType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.raw.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "WCEthereumSignMessage(raw=" + this.raw + ", type=" + this.type + ')';
    }
}
