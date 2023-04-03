package p000;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* renamed from: l87 */
/* compiled from: ValueInstantiators */
public interface l87 {

    /* renamed from: l87$a */
    /* compiled from: ValueInstantiators */
    public static class C2749a implements l87 {
        public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, n00 n00, ValueInstantiator valueInstantiator) {
            return valueInstantiator;
        }
    }

    ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, n00 n00, ValueInstantiator valueInstantiator);
}
