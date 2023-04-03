package zendesk.support;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

class HelpCenterCachingInterceptor implements Interceptor {
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        if (kb6.m46949b(proceed.headers().get("X-ZD-Cache-Control"))) {
            return proceed.newBuilder().header("Cache-Control", proceed.header("X-ZD-Cache-Control")).build();
        }
        return proceed;
    }
}
