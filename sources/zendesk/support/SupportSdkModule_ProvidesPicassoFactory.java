package zendesk.support;

import android.content.Context;
import com.squareup.picasso.Picasso;
import java.util.concurrent.ExecutorService;

public final class SupportSdkModule_ProvidesPicassoFactory implements ry1<Picasso> {
    private final ky4<Context> contextProvider;
    private final ky4<ExecutorService> executorServiceProvider;
    private final SupportSdkModule module;
    private final ky4<ig4> okHttp3DownloaderProvider;

    public SupportSdkModule_ProvidesPicassoFactory(SupportSdkModule supportSdkModule, ky4<Context> ky4, ky4<ig4> ky42, ky4<ExecutorService> ky43) {
        this.module = supportSdkModule;
        this.contextProvider = ky4;
        this.okHttp3DownloaderProvider = ky42;
        this.executorServiceProvider = ky43;
    }

    public static SupportSdkModule_ProvidesPicassoFactory create(SupportSdkModule supportSdkModule, ky4<Context> ky4, ky4<ig4> ky42, ky4<ExecutorService> ky43) {
        return new SupportSdkModule_ProvidesPicassoFactory(supportSdkModule, ky4, ky42, ky43);
    }

    public static Picasso providesPicasso(SupportSdkModule supportSdkModule, Context context, ig4 ig4, ExecutorService executorService) {
        return (Picasso) fu4.m44415f(supportSdkModule.providesPicasso(context, ig4, executorService));
    }

    public Picasso get() {
        return providesPicasso(this.module, this.contextProvider.get(), this.okHttp3DownloaderProvider.get(), this.executorServiceProvider.get());
    }
}
