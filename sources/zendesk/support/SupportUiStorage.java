package zendesk.support;

import com.google.gson.Gson;
import com.zendesk.logger.Logger;
import java.io.IOException;
import java.lang.reflect.Type;
import p000.ch1;
import zendesk.support.Streams;

public class SupportUiStorage {
    private static final int CACHE_INDEX = 0;
    private static final String LOG_TAG = "SupportUiStorage";
    public static final String REQUEST_MAPPER = "request_id_mapper";
    /* access modifiers changed from: private */
    public final Gson gson;
    private final ch1 storage;

    public SupportUiStorage(ch1 ch1, Gson gson2) {
        this.storage = ch1;
        this.gson = gson2;
    }

    private static void abortEdit(ch1.C3940c cVar) {
        Logger.m43087k(LOG_TAG, "Unable to cache data", new Object[0]);
        if (cVar != null) {
            try {
                cVar.mo29994a();
            } catch (IOException e) {
                Logger.m43086j(LOG_TAG, "Unable to abort write", e, new Object[0]);
            }
        }
    }

    private static String key(String str) {
        return ng1.m48766c(str);
    }

    public <E> E read(String str, final Type type) {
        E use;
        try {
            synchronized (this.storage) {
                use = Streams.use(this.storage.mo29986q(key(str)), new Streams.Use<E, ch1.C3943e>() {
                    public E use(ch1.C3943e eVar) throws Exception {
                        return SupportUiStorage.this.gson.fromJson(Streams.toReader(sg4.m71937l(eVar.mo30006a(0))), type);
                    }
                });
            }
            return use;
        } catch (IOException unused) {
            Logger.m43087k(LOG_TAG, "Unable to read from cache", new Object[0]);
            return null;
        }
    }

    public void write(String str, Object obj) {
        ch1.C3940c cVar = null;
        try {
            synchronized (this.storage) {
                cVar = this.storage.mo29984n(key(str));
            }
            if (cVar != null) {
                Streams.toJson(this.gson, sg4.m71933h(cVar.mo29996f(0)), obj);
                cVar.mo29995e();
            }
        } catch (IOException unused) {
            abortEdit(cVar);
        }
    }
}
