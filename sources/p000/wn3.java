package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: wn3 */
/* compiled from: MappingIterator */
public class wn3<T> implements Iterator<T>, Closeable {

    /* renamed from: y */
    public static final wn3<?> f19183y = new wn3((JavaType) null, (JsonParser) null, (DeserializationContext) null, (o43<?>) null, false, (Object) null);

    /* renamed from: a */
    public final JavaType f19184a;

    /* renamed from: d */
    public final DeserializationContext f19185d;

    /* renamed from: e */
    public final o43<T> f19186e;

    /* renamed from: g */
    public final JsonParser f19187g;

    /* renamed from: k */
    public final z63 f19188k;

    /* renamed from: r */
    public final T f19189r;

    /* renamed from: s */
    public final boolean f19190s;

    /* renamed from: x */
    public int f19191x;

    public wn3(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, o43<?> o43, boolean z, Object obj) {
        this.f19184a = javaType;
        this.f19187g = jsonParser;
        this.f19185d = deserializationContext;
        this.f19186e = o43;
        this.f19190s = z;
        if (obj == null) {
            this.f19189r = null;
        } else {
            this.f19189r = obj;
        }
        if (jsonParser == null) {
            this.f19188k = null;
            this.f19191x = 0;
            return;
        }
        z63 P = jsonParser.mo13941P();
        if (!z || !jsonParser.mo13926B0()) {
            JsonToken g = jsonParser.mo13965g();
            if (g == JsonToken.START_OBJECT || g == JsonToken.START_ARRAY) {
                P = P.mo11443e();
            }
        } else {
            jsonParser.mo13962e();
        }
        this.f19188k = P;
        this.f19191x = 2;
    }

    /* renamed from: a */
    public <R> R mo27565a(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }

    /* renamed from: b */
    public <R> R mo27566b(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    /* renamed from: c */
    public void mo27567c() throws IOException {
        JsonParser jsonParser = this.f19187g;
        if (jsonParser.mo13941P() != this.f19188k) {
            while (true) {
                JsonToken N0 = jsonParser.mo13938N0();
                if (N0 == JsonToken.END_ARRAY || N0 == JsonToken.END_OBJECT) {
                    if (jsonParser.mo13941P() == this.f19188k) {
                        jsonParser.mo13962e();
                        return;
                    }
                } else if (N0 == JsonToken.START_ARRAY || N0 == JsonToken.START_OBJECT) {
                    jsonParser.mo13959c1();
                } else if (N0 == null) {
                    return;
                }
            }
        }
    }

    public void close() throws IOException {
        if (this.f19191x != 0) {
            this.f19191x = 0;
            JsonParser jsonParser = this.f19187g;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    /* renamed from: d */
    public <R> R mo27569d() {
        throw new NoSuchElementException();
    }

    /* renamed from: f */
    public boolean mo27570f() throws IOException {
        JsonToken N0;
        int i = this.f19191x;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            mo27567c();
        } else if (i != 2) {
            return true;
        }
        JsonParser jsonParser = this.f19187g;
        if (jsonParser == null) {
            return false;
        }
        if (jsonParser.mo13965g() == null && ((N0 = this.f19187g.mo13938N0()) == null || N0 == JsonToken.END_ARRAY)) {
            this.f19191x = 0;
            if (this.f19190s) {
                this.f19187g.close();
            }
            return false;
        }
        this.f19191x = 3;
        return true;
    }

    /* renamed from: g */
    public T mo27571g() throws IOException {
        T t;
        int i = this.f19191x;
        if (i == 0) {
            return mo27569d();
        }
        int i2 = 2;
        i2 = 1;
        if ((i == i2 || i == i2) && !mo27570f()) {
            return mo27569d();
        }
        try {
            T t2 = this.f19189r;
            if (t2 == null) {
                t = this.f19186e.deserialize(this.f19187g, this.f19185d);
            } else {
                this.f19186e.deserialize(this.f19187g, this.f19185d, t2);
                t = this.f19189r;
            }
            return t;
        } finally {
            this.f19191x = i2;
            this.f19187g.mo13962e();
        }
    }

    public boolean hasNext() {
        try {
            return mo27570f();
        } catch (JsonMappingException e) {
            return ((Boolean) mo27566b(e)).booleanValue();
        } catch (IOException e2) {
            return ((Boolean) mo27565a(e2)).booleanValue();
        }
    }

    public T next() {
        try {
            return mo27571g();
        } catch (JsonMappingException e) {
            return mo27566b(e);
        } catch (IOException e2) {
            return mo27565a(e2);
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
