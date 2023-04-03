package net.safemoon.androidwallet.model.fiat.abstraction;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/fiat/abstraction/IFiat;", "Ljava/io/Serializable;", "name", "", "getName", "()Ljava/lang/String;", "rate", "", "getRate", "()Ljava/lang/Double;", "symbol", "getSymbol", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: IFiat.kt */
public interface IFiat extends Serializable {
    String getName();

    Double getRate();

    String getSymbol();
}
