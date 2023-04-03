package p000;

import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: wc5 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class wc5 {

    /* renamed from: d */
    public static final Map f35296d;

    /* renamed from: e */
    public static final Map f35297e;

    /* renamed from: a */
    public final String f35298a;

    /* renamed from: b */
    public final BaseModel f35299b;

    /* renamed from: c */
    public final ModelType f35300c;

    static {
        Class<BaseModel> cls = BaseModel.class;
        f35296d = new EnumMap(cls);
        f35297e = new EnumMap(cls);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wc5)) {
            return false;
        }
        wc5 wc5 = (wc5) obj;
        if (!if4.m45709a(this.f35298a, wc5.f35298a) || !if4.m45709a(this.f35299b, wc5.f35299b) || !if4.m45709a(this.f35300c, wc5.f35300c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return if4.m45710b(this.f35298a, this.f35299b, this.f35300c);
    }

    public String toString() {
        rj9 a = ak9.m31866a("RemoteModel");
        a.mo47420a("modelName", this.f35298a);
        a.mo47420a("baseModel", this.f35299b);
        a.mo47420a("modelType", this.f35300c);
        return a.toString();
    }
}
