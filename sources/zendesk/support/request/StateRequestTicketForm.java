package zendesk.support.request;

import android.annotation.SuppressLint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.support.CustomField;

class StateRequestTicketForm implements Serializable {
    public static final long NO_ID = -1;

    /* renamed from: id */
    private final long f46882id;
    private final Map<Long, String> ticketFields;

    public StateRequestTicketForm(long j, List<CustomField> list) {
        this.f46882id = j;
        this.ticketFields = fieldsToMap(list);
    }

    @SuppressLint({"UseSparseArrays"})
    private static Map<Long, String> fieldsToMap(List<CustomField> list) {
        HashMap hashMap = new HashMap(list.size());
        for (CustomField next : list) {
            if (next != null && kb6.m46949b(next.getValueString())) {
                hashMap.put(next.getId(), next.getValueString());
            }
        }
        return hashMap;
    }

    private static List<CustomField> mapToFields(Map<Long, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new CustomField((Long) next.getKey(), next.getValue()));
        }
        return arrayList;
    }

    public long getId() {
        return this.f46882id;
    }

    public Map<Long, String> getTicketFields() {
        return this.ticketFields;
    }

    public List<CustomField> getTicketFieldsForApi() {
        return mapToFields(this.ticketFields);
    }

    public StateRequestTicketForm(List<CustomField> list) {
        this(-1, list);
    }
}
