package p000;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: u84 */
/* compiled from: Notification */
public class u84<T> {
    private String jsonrpc;
    private String method;
    private rb4<T> params;

    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public String getMethod() {
        return this.method;
    }

    public rb4<T> getParams() {
        return this.params;
    }
}
