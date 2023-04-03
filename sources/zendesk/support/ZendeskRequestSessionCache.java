package zendesk.support;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class ZendeskRequestSessionCache implements RequestSessionCache {
    private final Map<Long, TicketForm> cachedTicketForms = new HashMap();

    public boolean containsAllTicketForms(List<Long> list) {
        boolean z;
        List<TypeT> e = kj0.m47114e(list);
        synchronized (this.cachedTicketForms) {
            Iterator<TypeT> it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!this.cachedTicketForms.containsKey((Long) it.next())) {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    public synchronized List<TicketForm> getTicketFormsById(List<Long> list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<TypeT> e = kj0.m47114e(list);
        synchronized (this.cachedTicketForms) {
            for (TypeT typet : e) {
                arrayList.add(this.cachedTicketForms.get(typet));
            }
        }
        return arrayList;
    }

    public void updateTicketFormCache(List<TicketForm> list) {
        List<TypeT> e = kj0.m47114e(list);
        HashMap hashMap = new HashMap();
        for (TypeT typet : e) {
            hashMap.put(Long.valueOf(typet.getId()), typet);
        }
        synchronized (this.cachedTicketForms) {
            this.cachedTicketForms.putAll(hashMap);
        }
    }
}
