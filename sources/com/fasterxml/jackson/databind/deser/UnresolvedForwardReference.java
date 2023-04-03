package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.C2001a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UnresolvedForwardReference extends JsonMappingException {
    private static final long serialVersionUID = 1;
    private C2001a _roid;
    private List<m47> _unresolvedIds;

    public UnresolvedForwardReference(JsonParser jsonParser, String str, JsonLocation jsonLocation, C2001a aVar) {
        super((Closeable) jsonParser, str, jsonLocation);
        this._roid = aVar;
    }

    public void addUnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this._unresolvedIds.add(new m47(obj, cls, jsonLocation));
    }

    public String getMessage() {
        String message = super.getMessage();
        if (this._unresolvedIds == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(message);
        Iterator<m47> it = this._unresolvedIds.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('.');
        return sb.toString();
    }

    public C2001a getRoid() {
        return this._roid;
    }

    public Object getUnresolvedId() {
        return this._roid.mo15611c().key;
    }

    public List<m47> getUnresolvedIds() {
        return this._unresolvedIds;
    }

    public UnresolvedForwardReference withStackTrace() {
        super.fillInStackTrace();
        return this;
    }

    public synchronized UnresolvedForwardReference fillInStackTrace() {
        return this;
    }

    public UnresolvedForwardReference(JsonParser jsonParser, String str) {
        super((Closeable) jsonParser, str);
        this._unresolvedIds = new ArrayList();
    }

    @Deprecated
    public UnresolvedForwardReference(String str, JsonLocation jsonLocation, C2001a aVar) {
        super(str, jsonLocation);
        this._roid = aVar;
    }

    @Deprecated
    public UnresolvedForwardReference(String str) {
        super(str);
        this._unresolvedIds = new ArrayList();
    }
}
