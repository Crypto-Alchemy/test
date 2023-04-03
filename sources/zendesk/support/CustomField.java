package zendesk.support;

import com.zendesk.logger.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomField implements Serializable {
    private static final String LOG_TAG = "CustomField";

    /* renamed from: id */
    private Long f46826id;
    private Object value;

    public CustomField(Long l, Object obj) {
        this.f46826id = l;
        this.value = obj;
    }

    public Long getId() {
        return this.f46826id;
    }

    @Deprecated
    public String getValue() {
        Object obj = this.value;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        Logger.m43087k(LOG_TAG, "Custom Field Value is of a type other than String or Boolean. Is this a multi-select field?", new Object[0]);
        return null;
    }

    public Boolean getValueBoolean() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        Logger.m43087k(LOG_TAG, "Custom field value is not a boolean", new Object[0]);
        return null;
    }

    public List<String> getValueList() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List<Object> list = (List) obj;
            if (kj0.m47118i(list)) {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object valueOf : list) {
                    arrayList.add(String.valueOf(valueOf));
                }
                return arrayList;
            }
        }
        Logger.m43087k(LOG_TAG, "Custom field value is not a list.", new Object[0]);
        return null;
    }

    public Object getValueObject() {
        return this.value;
    }

    public String getValueString() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        Logger.m43087k(LOG_TAG, "Custom field value is not a string", new Object[0]);
        return null;
    }
}
