package p000;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.IOException;

/* renamed from: nx2 */
/* compiled from: InternalNodeMapper */
public final class nx2 {

    /* renamed from: a */
    public static final JsonMapper f15709a;

    /* renamed from: b */
    public static final ObjectWriter f15710b;

    /* renamed from: c */
    public static final ObjectWriter f15711c;

    /* renamed from: d */
    public static final ObjectReader f15712d;

    static {
        JsonMapper jsonMapper = new JsonMapper();
        f15709a = jsonMapper;
        f15710b = jsonMapper.writer();
        f15711c = jsonMapper.writer().withDefaultPrettyPrinter();
        f15712d = jsonMapper.readerFor((Class<?>) g53.class);
    }

    /* renamed from: a */
    public static g53 m23496a(byte[] bArr) throws IOException {
        return (g53) f15712d.readValue(bArr);
    }

    /* renamed from: b */
    public static String m23497b(g53 g53) {
        try {
            return f15711c.writeValueAsString(g53);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m23498c(g53 g53) {
        try {
            return f15710b.writeValueAsString(g53);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static byte[] m23499d(Object obj) throws IOException {
        return f15709a.writeValueAsBytes(obj);
    }
}
