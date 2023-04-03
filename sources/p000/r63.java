package p000;

import com.walletconnect.android.internal.common.JsonRpcResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0004H\u0000\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000¨\u0006\u0010"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "b", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$b;", "c", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$JsonRpcError;", "e", "a", "Lq63;", "result", "Lrg0;", "params", "Lsf7;", "f", "Lny2;", "Lec5$c;", "d", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: r63 */
/* compiled from: JsonRpcMapper.kt */
public final /* synthetic */ class r63 {
    /* renamed from: b */
    public static final /* synthetic */ JsonRpcResponse m50949b(JsonRpcResponse jsonRpcResponse) {
        vx2.m53591g(jsonRpcResponse, "<this>");
        if (jsonRpcResponse instanceof JsonRpcResponse.C5515b) {
            return vx2.m53591g((JsonRpcResponse.C5515b) jsonRpcResponse, "<this>");
        }
        if (jsonRpcResponse instanceof JsonRpcResponse.JsonRpcError) {
            return vx2.m53591g((JsonRpcResponse.JsonRpcError) jsonRpcResponse, "<this>");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: f */
    public static final /* synthetic */ sf7 m50953f(q63 q63, JsonRpcResponse jsonRpcResponse, rg0 rg0) {
        vx2.m53591g(q63, "<this>");
        vx2.m53591g(jsonRpcResponse, "result");
        vx2.m53591g(rg0, "params");
        return new sf7(new es6(q63.mo46981d()), q63.mo46979b(), jsonRpcResponse, rg0);
    }
}
