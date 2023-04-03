package zendesk.core;

import android.content.Context;
import java.io.IOException;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

class AcceptLanguageHeaderInterceptor implements Interceptor {
    private Context context;

    public AcceptLanguageHeaderInterceptor(Context context2) {
        this.context = context2;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Locale currentLocale = DeviceInfo.getCurrentLocale(this.context);
        if (!kb6.m46951d(request.header(Constants.ACCEPT_LANGUAGE)) || currentLocale == null) {
            return chain.proceed(request);
        }
        return chain.proceed(request.newBuilder().addHeader(Constants.ACCEPT_LANGUAGE, zj3.m55133d(currentLocale)).build());
    }
}
