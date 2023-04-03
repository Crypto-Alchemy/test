package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: v47 */
/* compiled from: UnwrappedPropertyHandler */
public class v47 {

    /* renamed from: a */
    public final List<SettableBeanProperty> f18673a;

    public v47() {
        this.f18673a = new ArrayList();
    }

    /* renamed from: a */
    public void mo27059a(SettableBeanProperty settableBeanProperty) {
        this.f18673a.add(settableBeanProperty);
    }

    /* renamed from: b */
    public Object mo27060b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, fr6 fr6) throws IOException {
        int size = this.f18673a.size();
        for (int i = 0; i < size; i++) {
            JsonParser x1 = fr6.mo20092x1();
            x1.mo13938N0();
            this.f18673a.get(i).deserializeAndSet(x1, deserializationContext, obj);
        }
        return obj;
    }

    /* renamed from: c */
    public v47 mo27061c(NameTransformer nameTransformer) {
        o43<Object> unwrappingDeserializer;
        ArrayList arrayList = new ArrayList(this.f18673a.size());
        for (SettableBeanProperty next : this.f18673a) {
            SettableBeanProperty withSimpleName = next.withSimpleName(nameTransformer.transform(next.getName()));
            o43<Object> valueDeserializer = withSimpleName.getValueDeserializer();
            if (!(valueDeserializer == null || (unwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer)) {
                withSimpleName = withSimpleName.withValueDeserializer(unwrappingDeserializer);
            }
            arrayList.add(withSimpleName);
        }
        return new v47(arrayList);
    }

    public v47(List<SettableBeanProperty> list) {
        this.f18673a = list;
    }
}
