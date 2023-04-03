package p000;

import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.web3j.abi.datatypes.Address;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\f\u0010\r\u001a\u00020\u0004*\u00020\u0004H\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0014"}, mo44877d2 = {"Lwm1;", "", "Lr16;", "signature", "", "originalMessage", "address", "projectId", "", "d", "", "id", "b", "c", "to", "data", "Lokhttp3/RequestBody;", "a", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wm1 */
/* compiled from: EIP1271Verifier.kt */
public final class wm1 {

    /* renamed from: a */
    public static final wm1 f35387a = new wm1();

    /* renamed from: a */
    public final RequestBody mo49238a(String str, String str2, long j) {
        MediaType mediaType = MediaType.Companion.get("application/json; charset=utf-8");
        return RequestBody.Companion.create(StringsKt__IndentKt.m63059h("{\n                |\"method\" : \"eth_call\",\n                |\"params\" : [{\"to\":\"" + str + "\", \"data\":\"" + str2 + "\"}, \"latest\"],\n                |\"id\":" + j + ", \"jsonrpc\":\"2.0\"\n                |}", (String) null, 1, (Object) null), mediaType);
    }

    /* renamed from: b */
    public final String mo49239b(long j) {
        return "{\"jsonrpc\":\"2.0\",\"id\":" + j + ",\"result\":\"0x1626ba7e00000000000000000000000000000000000000000000000000000000\"}";
    }

    /* renamed from: c */
    public final String mo49240c(String str) {
        return "https://rpc.walletconnect.com/v1/?chainId=eip155:1&projectId=" + str;
    }

    /* renamed from: d */
    public final boolean mo49241d(r16 r16, String str, String str2, String str3) {
        String str4;
        vx2.m53591g(r16, "signature");
        vx2.m53591g(str, "originalMessage");
        vx2.m53591g(str2, Address.TYPE_NAME);
        vx2.m53591g(str3, "projectId");
        try {
            byte[] bytes = str.getBytes(ae0.f36435b);
            vx2.m53590f(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] ethereumMessageHash = c16.getEthereumMessageHash(bytes);
            vx2.m53590f(ethereumMessageHash, "getEthereumMessageHash(o…nalMessage.toByteArray())");
            long b = x67.m54246b();
            ResponseBody body = new OkHttpClient().newCall(new Request.Builder().url(mo49240c(str3)).post(mo49238a(str2, "0x1626ba7e" + x67.m54245a(ethereumMessageHash) + "00000000000000000000000000000000000000000000000000000000000000400000000000000000000000000000000000000000000000000000000000000041" + StringsKt__StringsKt.m63114s0(t16.m52042a(r16), "0x"), b)).build()).execute().body();
            if (body != null) {
                str4 = body.string();
            } else {
                str4 = null;
            }
            System.out.println(str4);
            return vx2.m53586b(str4, mo49239b(b));
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
