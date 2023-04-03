package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p000.ch1;

class ZendeskDiskLruCache implements BaseStorage {
    private static final int CACHE_INDEX = 0;
    private static final int ITEMS_PER_KEY = 1;
    private static final String LOG_TAG = "DiskLruStorage";
    private static final int VERSION_ONE = 1;
    private final File directory;
    private final long maxSize;
    private final Serializer serializer;
    private ch1 storage;

    public ZendeskDiskLruCache(File file, Serializer serializer2, int i) {
        this.directory = file;
        long j = (long) i;
        this.maxSize = j;
        this.storage = openCache(file, j);
        this.serializer = serializer2;
    }

    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private String getString(String str, int i) {
        w40 w40;
        z56 z56;
        String str2;
        z56 z562 = null;
        try {
            ch1.C3943e q = this.storage.mo29986q(key(str));
            if (q != null) {
                z56 = sg4.m71937l(q.mo30006a(i));
                try {
                    w40 = sg4.m71929d(z56);
                } catch (IOException e) {
                    e = e;
                    w40 = null;
                    try {
                        Logger.m43086j(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                        close(z56);
                        close(w40);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        close(z56);
                        close(w40);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    w40 = null;
                    close(z56);
                    close(w40);
                    throw th;
                }
                try {
                    z562 = z56;
                    str2 = w40.mo56048b1();
                } catch (IOException e2) {
                    e = e2;
                    Logger.m43086j(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                    close(z56);
                    close(w40);
                    return null;
                }
            } else {
                str2 = null;
                w40 = null;
            }
            close(z562);
            close(w40);
            return str2;
        } catch (IOException e3) {
            e = e3;
            z56 = null;
            w40 = null;
            Logger.m43086j(LOG_TAG, "Unable to read from cache", e, new Object[0]);
            close(z56);
            close(w40);
            return null;
        } catch (Throwable th3) {
            w40 = null;
            th = th3;
            z56 = null;
            close(z56);
            close(w40);
            throw th;
        }
    }

    private String key(String str) {
        return ng1.m48766c(str);
    }

    private String keyMediaType(String str) {
        return key(String.format(Locale.US, "%s_content_type", new Object[]{str}));
    }

    private ch1 openCache(File file, long j) {
        try {
            return ch1.m33002x(file, 1, 1, j);
        } catch (IOException unused) {
            Logger.m43087k(LOG_TAG, "Unable to open cache", new Object[0]);
            return null;
        }
    }

    private void putString(String str, int i, String str2) {
        try {
            write(str, i, sg4.m71937l(new ByteArrayInputStream(str2.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException e) {
            Logger.m43086j(LOG_TAG, "Unable to encode string", e, new Object[0]);
        }
    }

    private void write(String str, int i, z56 z56) {
        s36 s36;
        ch1.C3940c n;
        v40 v40 = null;
        try {
            synchronized (this.directory) {
                n = this.storage.mo29984n(key(str));
            }
            if (n != null) {
                s36 = sg4.m71933h(n.mo29996f(i));
                try {
                    v40 = sg4.m71928c(s36);
                    v40.mo56029L0(z56);
                    v40.flush();
                    n.mo29995e();
                } catch (IOException e) {
                    e = e;
                }
            } else {
                s36 = null;
            }
        } catch (IOException e2) {
            e = e2;
            s36 = null;
        } catch (Throwable th) {
            th = th;
            s36 = null;
            close(v40);
            close(s36);
            close(z56);
            throw th;
        }
        close(v40);
        close(s36);
        close(z56);
        try {
            Logger.m43086j(LOG_TAG, "Unable to cache data", e, new Object[0]);
            close(v40);
            close(s36);
            close(z56);
        } catch (Throwable th2) {
            th = th2;
            close(v40);
            close(s36);
            close(z56);
            throw th;
        }
    }

    public void clear() {
        ch1 ch1 = this.storage;
        if (ch1 != null) {
            try {
                if (ch1.mo29987s() == null || !this.storage.mo29987s().exists() || !kj0.m47119j(this.storage.mo29987s().listFiles())) {
                    this.storage.close();
                } else {
                    this.storage.mo29983l();
                }
            } catch (IOException e) {
                Logger.m43078b(LOG_TAG, "Error clearing cache. Error: %s", e.getMessage());
            } catch (Throwable th) {
                this.storage = openCache(this.directory, this.maxSize);
                throw th;
            }
            this.storage = openCache(this.directory, this.maxSize);
        }
    }

    public String get(String str) {
        if (this.storage == null) {
            return null;
        }
        return getString(str, 0);
    }

    public void put(String str, String str2) {
        if (this.storage != null && !kb6.m46951d(str2)) {
            putString(str, 0, str2);
        }
    }

    public void remove(String str) {
    }

    public <E> E get(String str, Class<E> cls) {
        if (this.storage == null) {
            return null;
        }
        if (cls.equals(ResponseBody.class)) {
            try {
                ch1.C3943e q = this.storage.mo29986q(key(str));
                if (q == null) {
                    return null;
                }
                z56 l = sg4.m71937l(q.mo30006a(0));
                long b = q.mo30007b(0);
                String string = getString(keyMediaType(str), 0);
                return ResponseBody.create(kb6.m46949b(string) ? MediaType.parse(string) : null, b, sg4.m71929d(l));
            } catch (IOException e) {
                Logger.m43086j(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                return null;
            }
        } else {
            return this.serializer.deserialize(getString(str, 0), cls);
        }
    }

    public void put(String str, Object obj) {
        if (this.storage != null) {
            if (obj instanceof ResponseBody) {
                ResponseBody responseBody = (ResponseBody) obj;
                write(str, 0, responseBody.source());
                putString(keyMediaType(str), 0, responseBody.contentType().toString());
                return;
            }
            String str2 = null;
            if (obj != null) {
                str2 = this.serializer.serialize(obj);
            }
            put(str, str2);
        }
    }

    public ZendeskDiskLruCache(File file, long j, ch1 ch1, Serializer serializer2) {
        this.directory = file;
        this.maxSize = j;
        this.storage = ch1;
        this.serializer = serializer2;
    }
}
