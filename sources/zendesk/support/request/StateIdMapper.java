package zendesk.support.request;

import android.annotation.SuppressLint;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class StateIdMapper implements Serializable {
    private final Map<Long, Long> localToRemote;
    private final Map<Long, Long> remoteToLocal;

    private StateIdMapper(Map<Long, Long> map, Map<Long, Long> map2) {
        this.remoteToLocal = map;
        this.localToRemote = map2;
    }

    public StateIdMapper addIdMapping(Long l, Long l2) {
        this.remoteToLocal.put(l, l2);
        this.localToRemote.put(l2, l);
        return copy();
    }

    public StateIdMapper copy() {
        return new StateIdMapper(kj0.m47113d(this.remoteToLocal), kj0.m47113d(this.localToRemote));
    }

    public Long getLocalId(Long l) {
        return this.remoteToLocal.get(l);
    }

    public Long getRemoteId(Long l) {
        return this.localToRemote.get(l);
    }

    public Set<Long> getRemoteIds() {
        return this.remoteToLocal.keySet();
    }

    public boolean hasLocalId(Long l) {
        if (!this.remoteToLocal.containsKey(l) || !this.localToRemote.containsValue(l)) {
            return false;
        }
        return true;
    }

    public boolean hasRemoteId(Long l) {
        if (!this.localToRemote.containsKey(l) || !this.remoteToLocal.containsValue(l)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "IdMapper{ remoteToLocal=" + this.remoteToLocal + " localToRemote=" + this.localToRemote + '}';
    }

    @SuppressLint({"UseSparseArrays"})
    public StateIdMapper() {
        this.localToRemote = new HashMap();
        this.remoteToLocal = new HashMap();
    }
}
