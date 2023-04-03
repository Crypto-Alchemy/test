package p000;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: ag5 */
/* compiled from: Response */
public class ag5<T> {
    private C6827a error;

    /* renamed from: id */
    private long f36454id;
    private String jsonrpc;
    private String rawResponse;
    private T result;

    /* renamed from: ag5$a */
    /* compiled from: Response */
    public static class C6827a {
        private int code;
        @n43(using = v93.class)
        private String data;
        private String message;

        public C6827a() {
        }

        public C6827a(int i, String str) {
            this.code = i;
            this.message = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6827a)) {
                return false;
            }
            C6827a aVar = (C6827a) obj;
            if (getCode() != aVar.getCode()) {
                return false;
            }
            if (getMessage() == null ? aVar.getMessage() != null : !getMessage().equals(aVar.getMessage())) {
                return false;
            }
            if (getData() != null) {
                return getData().equals(aVar.getData());
            }
            if (aVar.getData() == null) {
                return true;
            }
            return false;
        }

        public int getCode() {
            return this.code;
        }

        public String getData() {
            return this.data;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int i;
            int code2 = getCode() * 31;
            int i2 = 0;
            if (getMessage() != null) {
                i = getMessage().hashCode();
            } else {
                i = 0;
            }
            int i3 = (code2 + i) * 31;
            if (getData() != null) {
                i2 = getData().hashCode();
            }
            return i3 + i2;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setData(String str) {
            this.data = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }
    }

    public C6827a getError() {
        return this.error;
    }

    public long getId() {
        return this.f36454id;
    }

    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public String getRawResponse() {
        return this.rawResponse;
    }

    public T getResult() {
        return this.result;
    }

    public boolean hasError() {
        if (this.error != null) {
            return true;
        }
        return false;
    }

    public void setError(C6827a aVar) {
        this.error = aVar;
    }

    public void setId(long j) {
        this.f36454id = j;
    }

    public void setJsonrpc(String str) {
        this.jsonrpc = str;
    }

    public void setRawResponse(String str) {
        this.rawResponse = str;
    }

    public void setResult(T t) {
        this.result = t;
    }
}
