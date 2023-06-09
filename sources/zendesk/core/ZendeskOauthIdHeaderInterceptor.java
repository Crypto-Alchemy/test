package zendesk.core;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

class ZendeskOauthIdHeaderInterceptor implements Interceptor {
    private final String oauthId;

    public ZendeskOauthIdHeaderInterceptor(String str) {
        this.oauthId = str;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder newBuilder = chain.request().newBuilder();
        if (kb6.m46949b(this.oauthId)) {
            newBuilder.addHeader(Constants.CLIENT_IDENTIFIER_HEADER, this.oauthId);
        }
        return chain.proceed(newBuilder.build());
    }
}
