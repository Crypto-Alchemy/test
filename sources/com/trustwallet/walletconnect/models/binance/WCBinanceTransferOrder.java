package com.trustwallet.walletconnect.models.binance;

import java.util.List;
import kotlin.Metadata;
import org.web3j.abi.datatypes.Address;

@Metadata(mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eBG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0002\u0010\f¨\u0006\u000f"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceOrder;", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder$Message;", "account_number", "", "chain_id", "data", "memo", "sequence", "source", "msgs", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Message", "MessageKey", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCBinanceTransferOrder.kt */
public final class WCBinanceTransferOrder extends WCBinanceOrder<Message> {

    @Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder$Message;", "", "inputs", "", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder$Message$Item;", "outputs", "(Ljava/util/List;Ljava/util/List;)V", "getInputs", "()Ljava/util/List;", "getOutputs", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Item", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCBinanceTransferOrder.kt */
    public static final class Message {
        private final List<Item> inputs;
        private final List<Item> outputs;

        @Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder$Message$Item;", "", "address", "", "coins", "", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder$Message$Item$Coin;", "(Ljava/lang/String;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "getCoins", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Coin", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* compiled from: WCBinanceTransferOrder.kt */
        public static final class Item {
            private final String address;
            private final List<Coin> coins;

            @Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder$Message$Item$Coin;", "", "amount", "", "denom", "", "(JLjava/lang/String;)V", "getAmount", "()J", "getDenom", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
            /* compiled from: WCBinanceTransferOrder.kt */
            public static final class Coin {
                private final long amount;
                private final String denom;

                public Coin(long j, String str) {
                    vx2.m53591g(str, "denom");
                    this.amount = j;
                    this.denom = str;
                }

                public static /* synthetic */ Coin copy$default(Coin coin, long j, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = coin.amount;
                    }
                    if ((i & 2) != 0) {
                        str = coin.denom;
                    }
                    return coin.copy(j, str);
                }

                public final long component1() {
                    return this.amount;
                }

                public final String component2() {
                    return this.denom;
                }

                public final Coin copy(long j, String str) {
                    vx2.m53591g(str, "denom");
                    return new Coin(j, str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Coin)) {
                        return false;
                    }
                    Coin coin = (Coin) obj;
                    return this.amount == coin.amount && vx2.m53586b(this.denom, coin.denom);
                }

                public final long getAmount() {
                    return this.amount;
                }

                public final String getDenom() {
                    return this.denom;
                }

                public int hashCode() {
                    return (au0.m10781a(this.amount) * 31) + this.denom.hashCode();
                }

                public String toString() {
                    return "Coin(amount=" + this.amount + ", denom=" + this.denom + ')';
                }
            }

            public Item(String str, List<Coin> list) {
                vx2.m53591g(str, Address.TYPE_NAME);
                vx2.m53591g(list, "coins");
                this.address = str;
                this.coins = list;
            }

            public static /* synthetic */ Item copy$default(Item item, String str, List<Coin> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = item.address;
                }
                if ((i & 2) != 0) {
                    list = item.coins;
                }
                return item.copy(str, list);
            }

            public final String component1() {
                return this.address;
            }

            public final List<Coin> component2() {
                return this.coins;
            }

            public final Item copy(String str, List<Coin> list) {
                vx2.m53591g(str, Address.TYPE_NAME);
                vx2.m53591g(list, "coins");
                return new Item(str, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Item)) {
                    return false;
                }
                Item item = (Item) obj;
                return vx2.m53586b(this.address, item.address) && vx2.m53586b(this.coins, item.coins);
            }

            public final String getAddress() {
                return this.address;
            }

            public final List<Coin> getCoins() {
                return this.coins;
            }

            public int hashCode() {
                return (this.address.hashCode() * 31) + this.coins.hashCode();
            }

            public String toString() {
                return "Item(address=" + this.address + ", coins=" + this.coins + ')';
            }
        }

        public Message(List<Item> list, List<Item> list2) {
            vx2.m53591g(list, "inputs");
            vx2.m53591g(list2, "outputs");
            this.inputs = list;
            this.outputs = list2;
        }

        public static /* synthetic */ Message copy$default(Message message, List<Item> list, List<Item> list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = message.inputs;
            }
            if ((i & 2) != 0) {
                list2 = message.outputs;
            }
            return message.copy(list, list2);
        }

        public final List<Item> component1() {
            return this.inputs;
        }

        public final List<Item> component2() {
            return this.outputs;
        }

        public final Message copy(List<Item> list, List<Item> list2) {
            vx2.m53591g(list, "inputs");
            vx2.m53591g(list2, "outputs");
            return new Message(list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return vx2.m53586b(this.inputs, message.inputs) && vx2.m53586b(this.outputs, message.outputs);
        }

        public final List<Item> getInputs() {
            return this.inputs;
        }

        public final List<Item> getOutputs() {
            return this.outputs;
        }

        public int hashCode() {
            return (this.inputs.hashCode() * 31) + this.outputs.hashCode();
        }

        public String toString() {
            return "Message(inputs=" + this.inputs + ", outputs=" + this.outputs + ')';
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTransferOrder$MessageKey;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "INPUTS", "OUTPUTS", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCBinanceTransferOrder.kt */
    public enum MessageKey {
        INPUTS("inputs"),
        OUTPUTS("outputs");
        
        private final String key;

        private MessageKey(String str) {
            this.key = str;
        }

        public final String getKey() {
            return this.key;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WCBinanceTransferOrder(String str, String str2, String str3, String str4, String str5, String str6, List<Message> list) {
        super(str, str2, str3, str4, str5, str6, list);
        vx2.m53591g(str, "account_number");
        vx2.m53591g(str2, "chain_id");
        vx2.m53591g(str5, "sequence");
        vx2.m53591g(str6, "source");
        vx2.m53591g(list, "msgs");
    }
}
