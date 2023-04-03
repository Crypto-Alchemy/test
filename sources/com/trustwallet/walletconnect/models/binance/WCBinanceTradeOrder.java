package com.trustwallet.walletconnect.models.binance;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eBG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0002\u0010\f¨\u0006\u000f"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTradeOrder;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceOrder;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTradeOrder$Message;", "account_number", "", "chain_id", "data", "memo", "sequence", "source", "msgs", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Message", "MessageKey", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCBinanceTradeOrder.kt */
public final class WCBinanceTradeOrder extends WCBinanceOrder<Message> {

    @Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006'"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTradeOrder$Message;", "", "id", "", "orderType", "", "price", "", "quantity", "sender", "side", "symbol", "timeInforce", "(Ljava/lang/String;IJJLjava/lang/String;ILjava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getOrderType", "()I", "getPrice", "()J", "getQuantity", "getSender", "getSide", "getSymbol", "getTimeInforce", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCBinanceTradeOrder.kt */
    public static final class Message {

        /* renamed from: id */
        private final String f27003id;
        private final int orderType;
        private final long price;
        private final long quantity;
        private final String sender;
        private final int side;
        private final String symbol;
        private final int timeInforce;

        public Message(String str, int i, long j, long j2, String str2, int i2, String str3, int i3) {
            vx2.m53591g(str, "id");
            vx2.m53591g(str2, "sender");
            vx2.m53591g(str3, "symbol");
            this.f27003id = str;
            this.orderType = i;
            this.price = j;
            this.quantity = j2;
            this.sender = str2;
            this.side = i2;
            this.symbol = str3;
            this.timeInforce = i3;
        }

        public static /* synthetic */ Message copy$default(Message message, String str, int i, long j, long j2, String str2, int i2, String str3, int i3, int i4, Object obj) {
            Message message2 = message;
            int i5 = i4;
            return message.copy((i5 & 1) != 0 ? message2.f27003id : str, (i5 & 2) != 0 ? message2.orderType : i, (i5 & 4) != 0 ? message2.price : j, (i5 & 8) != 0 ? message2.quantity : j2, (i5 & 16) != 0 ? message2.sender : str2, (i5 & 32) != 0 ? message2.side : i2, (i5 & 64) != 0 ? message2.symbol : str3, (i5 & 128) != 0 ? message2.timeInforce : i3);
        }

        public final String component1() {
            return this.f27003id;
        }

        public final int component2() {
            return this.orderType;
        }

        public final long component3() {
            return this.price;
        }

        public final long component4() {
            return this.quantity;
        }

        public final String component5() {
            return this.sender;
        }

        public final int component6() {
            return this.side;
        }

        public final String component7() {
            return this.symbol;
        }

        public final int component8() {
            return this.timeInforce;
        }

        public final Message copy(String str, int i, long j, long j2, String str2, int i2, String str3, int i3) {
            vx2.m53591g(str, "id");
            String str4 = str2;
            vx2.m53591g(str4, "sender");
            String str5 = str3;
            vx2.m53591g(str5, "symbol");
            return new Message(str, i, j, j2, str4, i2, str5, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return vx2.m53586b(this.f27003id, message.f27003id) && this.orderType == message.orderType && this.price == message.price && this.quantity == message.quantity && vx2.m53586b(this.sender, message.sender) && this.side == message.side && vx2.m53586b(this.symbol, message.symbol) && this.timeInforce == message.timeInforce;
        }

        public final String getId() {
            return this.f27003id;
        }

        public final int getOrderType() {
            return this.orderType;
        }

        public final long getPrice() {
            return this.price;
        }

        public final long getQuantity() {
            return this.quantity;
        }

        public final String getSender() {
            return this.sender;
        }

        public final int getSide() {
            return this.side;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final int getTimeInforce() {
            return this.timeInforce;
        }

        public int hashCode() {
            return (((((((((((((this.f27003id.hashCode() * 31) + this.orderType) * 31) + au0.m10781a(this.price)) * 31) + au0.m10781a(this.quantity)) * 31) + this.sender.hashCode()) * 31) + this.side) * 31) + this.symbol.hashCode()) * 31) + this.timeInforce;
        }

        public String toString() {
            return "Message(id=" + this.f27003id + ", orderType=" + this.orderType + ", price=" + this.price + ", quantity=" + this.quantity + ", sender=" + this.sender + ", side=" + this.side + ", symbol=" + this.symbol + ", timeInforce=" + this.timeInforce + ')';
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTradeOrder$MessageKey;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "ID", "ORDER_TYPE", "PRICE", "QUANTITY", "SENDER", "SIDE", "SYMBOL", "TIME_INFORCE", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCBinanceTradeOrder.kt */
    public enum MessageKey {
        ID("id"),
        ORDER_TYPE("ordertype"),
        PRICE("price"),
        QUANTITY("quantity"),
        SENDER("sender"),
        SIDE("side"),
        SYMBOL("symbol"),
        TIME_INFORCE("timeinforce");
        
        private final String key;

        private MessageKey(String str) {
            this.key = str;
        }

        public final String getKey() {
            return this.key;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WCBinanceTradeOrder(String str, String str2, String str3, String str4, String str5, String str6, List<Message> list) {
        super(str, str2, str3, str4, str5, str6, list);
        vx2.m53591g(str, "account_number");
        vx2.m53591g(str2, "chain_id");
        vx2.m53591g(str5, "sequence");
        vx2.m53591g(str6, "source");
        vx2.m53591g(list, "msgs");
    }
}
