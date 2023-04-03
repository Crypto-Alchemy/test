package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import zendesk.core.ActionHandler;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.SessionStorage;
import zendesk.support.requestlist.RequestInfoDataSource;

class SupportSdkModule {
    private static final int MAX_DISK_CACHE_SIZE = 20971520;

    public ro0 configurationHelper() {
        return new ro0();
    }

    public Executor mainThreadExecutor() {
        return new Executor() {
            public Handler handler = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.handler.post(runnable);
            }
        };
    }

    public ig4 okHttp3Downloader(OkHttpClient okHttpClient) {
        return new ig4(okHttpClient);
    }

    public Gson provides() {
        return new Gson();
    }

    public List<ActionHandler> providesActionHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DeepLinkToRequestActionHandler());
        return arrayList;
    }

    public Picasso providesPicasso(Context context, ig4 ig4, ExecutorService executorService) {
        return new Picasso.C5422b(context).mo39477c(ig4).mo39478d(executorService).mo39476b(Bitmap.Config.RGB_565).mo39475a();
    }

    public ch1 providesRequestDiskLruCache(SessionStorage sessionStorage) {
        try {
            return ch1.m33002x(new File(sessionStorage.getZendeskDataDir(), "request"), 1, 1, 20971520);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public String providesZendeskUrl(ApplicationConfiguration applicationConfiguration) {
        return applicationConfiguration.getZendeskUrl();
    }

    public RequestInfoDataSource.LocalDataSource requestInfoDataSource(SupportUiStorage supportUiStorage, Executor executor, ExecutorService executorService) {
        return new RequestInfoDataSource.LocalDataSource(new RequestInfoDataSource.Disk(executor, executorService, supportUiStorage, RequestInfoDataSource.LOCAL));
    }

    public SupportUiStorage supportUiStorage(ch1 ch1, Gson gson) {
        return new SupportUiStorage(ch1, gson);
    }
}
