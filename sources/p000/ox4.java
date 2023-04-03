package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.util.BitSet;
import p000.nx4;

/* renamed from: ox4 */
/* compiled from: PropertyValueBuffer */
public class ox4 {

    /* renamed from: a */
    public final JsonParser f16216a;

    /* renamed from: b */
    public final DeserializationContext f16217b;

    /* renamed from: c */
    public final ObjectIdReader f16218c;

    /* renamed from: d */
    public final Object[] f16219d;

    /* renamed from: e */
    public int f16220e;

    /* renamed from: f */
    public int f16221f;

    /* renamed from: g */
    public final BitSet f16222g;

    /* renamed from: h */
    public nx4 f16223h;

    /* renamed from: i */
    public Object f16224i;

    public ox4(JsonParser jsonParser, DeserializationContext deserializationContext, int i, ObjectIdReader objectIdReader) {
        this.f16216a = jsonParser;
        this.f16217b = deserializationContext;
        this.f16220e = i;
        this.f16218c = objectIdReader;
        this.f16219d = new Object[i];
        if (i < 32) {
            this.f16222g = null;
        } else {
            this.f16222g = new BitSet();
        }
    }

    /* renamed from: a */
    public Object mo24270a(SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        if (settableBeanProperty.getInjectableValueId() != null) {
            return this.f16217b.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, (Object) null);
        }
        if (settableBeanProperty.isRequired()) {
            this.f16217b.reportInputMismatch((BeanProperty) settableBeanProperty, "Missing required creator property '%s' (index %d)", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        if (this.f16217b.isEnabled(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            this.f16217b.reportInputMismatch((BeanProperty) settableBeanProperty, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        try {
            Object absentValue = settableBeanProperty.getNullValueProvider().getAbsentValue(this.f16217b);
            if (absentValue != null) {
                return absentValue;
            }
            return settableBeanProperty.getValueDeserializer().getAbsentValue(this.f16217b);
        } catch (DatabindException e) {
            AnnotatedMember member = settableBeanProperty.getMember();
            if (member != null) {
                e.prependPath((Object) member.getDeclaringClass(), settableBeanProperty.getName());
            }
            throw e;
        }
    }

    /* renamed from: b */
    public boolean mo24271b(SettableBeanProperty settableBeanProperty, Object obj) {
        int creatorIndex = settableBeanProperty.getCreatorIndex();
        this.f16219d[creatorIndex] = obj;
        BitSet bitSet = this.f16222g;
        if (bitSet == null) {
            int i = this.f16221f;
            int i2 = (1 << creatorIndex) | i;
            if (i != i2) {
                this.f16221f = i2;
                int i3 = this.f16220e - 1;
                this.f16220e = i3;
                if (i3 <= 0) {
                    if (this.f16218c == null || this.f16224i != null) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (!bitSet.get(creatorIndex)) {
            this.f16222g.set(creatorIndex);
            this.f16220e--;
        }
        return false;
    }

    /* renamed from: c */
    public void mo24272c(SettableAnyProperty settableAnyProperty, String str, Object obj) {
        this.f16223h = new nx4.C2928a(this.f16223h, obj, settableAnyProperty, str);
    }

    /* renamed from: d */
    public void mo24273d(Object obj, Object obj2) {
        this.f16223h = new nx4.C2929b(this.f16223h, obj2, obj);
    }

    /* renamed from: e */
    public void mo24274e(SettableBeanProperty settableBeanProperty, Object obj) {
        this.f16223h = new nx4.C2930c(this.f16223h, obj, settableBeanProperty);
    }

    /* renamed from: f */
    public nx4 mo24275f() {
        return this.f16223h;
    }

    /* renamed from: g */
    public Object[] mo24276g(SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (this.f16220e > 0) {
            if (this.f16222g != null) {
                int length = this.f16219d.length;
                int i = 0;
                while (true) {
                    int nextClearBit = this.f16222g.nextClearBit(i);
                    if (nextClearBit >= length) {
                        break;
                    }
                    this.f16219d[nextClearBit] = mo24270a(settableBeanPropertyArr[nextClearBit]);
                    i = nextClearBit + 1;
                }
            } else {
                int i2 = this.f16221f;
                int length2 = this.f16219d.length;
                int i3 = 0;
                while (i3 < length2) {
                    if ((i2 & 1) == 0) {
                        this.f16219d[i3] = mo24270a(settableBeanPropertyArr[i3]);
                    }
                    i3++;
                    i2 >>= 1;
                }
            }
        }
        if (this.f16217b.isEnabled(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i4 = 0; i4 < settableBeanPropertyArr.length; i4++) {
                if (this.f16219d[i4] == null) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i4];
                    this.f16217b.reportInputMismatch((BeanProperty) settableBeanProperty, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", settableBeanProperty.getName(), Integer.valueOf(settableBeanPropertyArr[i4].getCreatorIndex()));
                }
            }
        }
        return this.f16219d;
    }

    /* renamed from: h */
    public Object mo24277h(DeserializationContext deserializationContext, Object obj) throws IOException {
        ObjectIdReader objectIdReader = this.f16218c;
        if (objectIdReader != null) {
            Object obj2 = this.f16224i;
            if (obj2 != null) {
                deserializationContext.findObjectId(obj2, objectIdReader.generator, objectIdReader.resolver).mo15610b(obj);
                SettableBeanProperty settableBeanProperty = this.f16218c.idProperty;
                if (settableBeanProperty != null) {
                    return settableBeanProperty.setAndReturn(obj, this.f16224i);
                }
            } else {
                deserializationContext.reportUnresolvedObjectId(objectIdReader, obj);
            }
        }
        return obj;
    }

    /* renamed from: i */
    public boolean mo24278i(String str) throws IOException {
        ObjectIdReader objectIdReader = this.f16218c;
        if (objectIdReader == null || !str.equals(objectIdReader.propertyName.getSimpleName())) {
            return false;
        }
        this.f16224i = this.f16218c.readObjectReference(this.f16216a, this.f16217b);
        return true;
    }
}
