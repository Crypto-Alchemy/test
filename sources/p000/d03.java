package p000;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.ext.NioPathSerializer;
import java.nio.file.Path;

/* renamed from: d03 */
/* compiled from: Java7HandlersImpl */
public class d03 extends c03 {

    /* renamed from: b */
    public final Class<?> f10415b = Path.class;

    /* renamed from: a */
    public o43<?> mo11952a(Class<?> cls) {
        if (cls == this.f10415b) {
            return new NioPathDeserializer();
        }
        return null;
    }

    /* renamed from: b */
    public y63<?> mo11953b(Class<?> cls) {
        if (this.f10415b.isAssignableFrom(cls)) {
            return new NioPathSerializer();
        }
        return null;
    }
}
