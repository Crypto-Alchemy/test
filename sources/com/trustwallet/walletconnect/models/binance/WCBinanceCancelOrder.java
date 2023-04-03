package com.trustwallet.walletconnect.models.binance;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eBG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0002\u0010\f¨\u0006\u000f"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceCancelOrder;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceOrder;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceCancelOrder$Message;", "account_number", "", "chain_id", "data", "memo", "sequence", "source", "msgs", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Message", "MessageKey", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCBinanceCancelOrder.kt */
public final class WCBinanceCancelOrder extends WCBinanceOrder<Message> {

    @Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceCancelOrder$Message;", "", "refid", "", "sender", "symbol", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRefid", "()Ljava/lang/String;", "getSender", "getSymbol", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCBinanceCancelOrder.kt */
    public static final class Message {
        private final String refid;
        private final String sender;
        private final String symbol;

        public Message(String str, String str2, String str3) {
            vx2.m53591g(str, "refid");
            vx2.m53591g(str2, "sender");
            vx2.m53591g(str3, "symbol");
            this.refid = str;
            this.sender = str2;
            this.symbol = str3;
        }

        public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = message.refid;
            }
            if ((i & 2) != 0) {
                str2 = message.sender;
            }
            if ((i & 4) != 0) {
                str3 = message.symbol;
            }
            return message.copy(str, str2, str3);
        }

        public final String component1() {
            return this.refid;
        }

        public final String component2() {
            return this.sender;
        }

        public final String component3() {
            return this.symbol;
        }

        public final Message copy(String str, String str2, String str3) {
            vx2.m53591g(str, "refid");
            vx2.m53591g(str2, "sender");
            vx2.m53591g(str3, "symbol");
            return new Message(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return vx2.m53586b(this.refid, message.refid) && vx2.m53586b(this.sender, message.sender) && vx2.m53586b(this.symbol, message.symbol);
        }

        public final String getRefid() {
            return this.refid;
        }

        public final String getSender() {
            return this.sender;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            return (((this.refid.hashCode() * 31) + this.sender.hashCode()) * 31) + this.symbol.hashCode();
        }

        public String toString() {
            return "Message(refid=" + this.refid + ", sender=" + this.sender + ", symbol=" + this.symbol + ')';
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceCancelOrder$MessageKey;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "REFID", "SENDER", "SYMBOL", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCBinanceCancelOrder.kt */
    public enum MessageKey {
        REFID("refid"),
        SENDER("sender"),
        SYMBOL("symbol");
        
        private final String key;

        private MessageKey(String str) {
            this.key = str;
        }

        public final String getKey() {
            return this.key;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WCBinanceCancelOrder(String str, String str2, String str3, String str4, String str5, String str6, List<Message> list) {
        super(str, str2, str3, str4, str5, str6, list);
        vx2.m53591g(str, "account_number");
        vx2.m53591g(str2, "chain_id");
        vx2.m53591g(str5, "sequence");
        vx2.m53591g(str6, "source");
        vx2.m53591g(list, "msgs");
    }
}
