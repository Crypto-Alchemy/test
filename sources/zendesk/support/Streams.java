package zendesk.support;

import com.google.gson.Gson;
import com.zendesk.logger.Logger;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;

public class Streams {

    public interface Use<R, P extends Closeable> {
        R use(P p) throws Exception;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static <T> T fromJson(final Gson gson, z56 z56, final Type type) {
        return use(toReader(z56), new Use<T, Reader>() {
            public T use(Reader reader) throws Exception {
                return Gson.this.fromJson(reader, type);
            }
        });
    }

    public static void toJson(final Gson gson, s36 s36, final Object obj) {
        use(toWriter(s36), new Use<Void, Writer>() {
            public Void use(Writer writer) throws Exception {
                Gson.this.toJson(obj, (Appendable) writer);
                return null;
            }
        });
    }

    public static Reader toReader(z56 z56) {
        if (z56 instanceof w40) {
            return new InputStreamReader(((w40) z56).mo56078p1());
        }
        return new InputStreamReader(sg4.m71929d(z56).mo56078p1());
    }

    public static Writer toWriter(s36 s36) {
        if (s36 instanceof v40) {
            return new OutputStreamWriter(((v40) s36).mo56073n1());
        }
        return new OutputStreamWriter(sg4.m71928c(s36).mo56073n1());
    }

    public static <R, P extends Closeable> R use(P p, Use<R, P> use) {
        if (p == null) {
            return null;
        }
        try {
            return use.use(p);
        } catch (Exception e) {
            Logger.m43082f("Streams", "Error using stream", e, new Object[0]);
            return null;
        } finally {
            closeQuietly(p);
        }
    }
}
