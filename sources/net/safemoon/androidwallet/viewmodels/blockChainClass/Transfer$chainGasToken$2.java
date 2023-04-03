package net.safemoon.androidwallet.viewmodels.blockChainClass;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.token.gson.GsonToken;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/model/token/gson/GsonToken;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Transfer.kt */
public final class Transfer$chainGasToken$2 extends Lambda implements pc2<GsonToken> {
    public static final Transfer$chainGasToken$2 INSTANCE = new Transfer$chainGasToken$2();

    public Transfer$chainGasToken$2() {
        super(0);
    }

    public final GsonToken invoke() {
        return new GsonToken("", "", "iconResName", "", 0, 18, false, "", 0, (String) null, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 768, (DefaultConstructorMarker) null);
    }
}
