package p000;

import com.google.gson.Gson;
import net.safemoon.androidwallet.model.Error;
import org.json.JSONObject;

/* renamed from: m54 */
/* compiled from: NetUtils */
public class m54 {
    /* renamed from: a */
    public static Error m64173a(bg5<?> bg5) {
        try {
            return (Error) new Gson().fromJson(new JSONObject(eo6.m44001c(bg5.mo50580d().charStream())).toString(), Error.class);
        } catch (Exception e) {
            Error error = new Error();
            error.code = "400";
            error.message = e.getMessage();
            return error;
        }
    }
}
