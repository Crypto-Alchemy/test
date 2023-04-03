package net.safemoon.androidwallet.model.rpc2.bitcoin;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinUTXOResponse;", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinUTXOResponseItem;", "Lkotlin/collections/ArrayList;", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: BitcoinUTXOResponse.kt */
public final class BitcoinUTXOResponse extends ArrayList<BitcoinUTXOResponseItem> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof BitcoinUTXOResponseItem)) {
            return false;
        }
        return contains((BitcoinUTXOResponseItem) obj);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof BitcoinUTXOResponseItem)) {
            return -1;
        }
        return indexOf((BitcoinUTXOResponseItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof BitcoinUTXOResponseItem)) {
            return -1;
        }
        return lastIndexOf((BitcoinUTXOResponseItem) obj);
    }

    public final /* bridge */ BitcoinUTXOResponseItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ BitcoinUTXOResponseItem removeAt(int i) {
        return (BitcoinUTXOResponseItem) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(BitcoinUTXOResponseItem bitcoinUTXOResponseItem) {
        return super.contains(bitcoinUTXOResponseItem);
    }

    public /* bridge */ int indexOf(BitcoinUTXOResponseItem bitcoinUTXOResponseItem) {
        return super.indexOf(bitcoinUTXOResponseItem);
    }

    public /* bridge */ int lastIndexOf(BitcoinUTXOResponseItem bitcoinUTXOResponseItem) {
        return super.lastIndexOf(bitcoinUTXOResponseItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof BitcoinUTXOResponseItem)) {
            return false;
        }
        return remove((BitcoinUTXOResponseItem) obj);
    }

    public /* bridge */ boolean remove(BitcoinUTXOResponseItem bitcoinUTXOResponseItem) {
        return super.remove(bitcoinUTXOResponseItem);
    }
}
