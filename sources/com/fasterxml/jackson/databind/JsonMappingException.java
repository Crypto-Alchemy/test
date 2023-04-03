package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import okhttp3.HttpUrl;

public class JsonMappingException extends DatabindException {
    public static final int MAX_REFS_TO_LIST = 1000;
    private static final long serialVersionUID = 3;
    public LinkedList<Reference> _path;
    public transient Closeable _processor;

    @Deprecated
    public JsonMappingException(String str) {
        super(str);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str) {
        return new JsonMappingException((Closeable) jsonParser, str);
    }

    public static JsonMappingException fromUnexpectedIOE(IOException iOException) {
        return new JsonMappingException((Closeable) null, String.format("Unexpected IOException (of type %s): %s", new Object[]{iOException.getClass().getName(), wf0.m29528o(iOException)}));
    }

    public static JsonMappingException wrapWithPath(Throwable th, Object obj, String str) {
        return wrapWithPath(th, new Reference(obj, str));
    }

    public void _appendPathDesc(StringBuilder sb) {
        LinkedList<Reference> linkedList = this._path;
        if (linkedList != null) {
            Iterator<Reference> it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                if (it.hasNext()) {
                    sb.append("->");
                }
            }
        }
    }

    public String _buildMessage() {
        StringBuilder sb;
        String message = super.getMessage();
        if (this._path == null) {
            return message;
        }
        if (message == null) {
            sb = new StringBuilder();
        } else {
            sb = new StringBuilder(message);
        }
        sb.append(" (through reference chain: ");
        StringBuilder pathReference = getPathReference(sb);
        pathReference.append(')');
        return pathReference.toString();
    }

    public String getLocalizedMessage() {
        return _buildMessage();
    }

    public String getMessage() {
        return _buildMessage();
    }

    public List<Reference> getPath() {
        LinkedList<Reference> linkedList = this._path;
        if (linkedList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(linkedList);
    }

    public String getPathReference() {
        return getPathReference(new StringBuilder()).toString();
    }

    @y43
    public Object getProcessor() {
        return this._processor;
    }

    public void prependPath(Object obj, String str) {
        prependPath(new Reference(obj, str));
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonMappingException withCause(Throwable th) {
        initCause(th);
        return this;
    }

    public static class Reference implements Serializable {
        private static final long serialVersionUID = 2;
        public String _desc;
        public String _fieldName;
        public transient Object _from;
        public int _index;

        public Reference() {
            this._index = -1;
        }

        public String getDescription() {
            Class<?> cls;
            if (this._desc == null) {
                StringBuilder sb = new StringBuilder();
                Object obj = this._from;
                if (obj != null) {
                    if (obj instanceof Class) {
                        cls = (Class) obj;
                    } else {
                        cls = obj.getClass();
                    }
                    int i = 0;
                    while (cls.isArray()) {
                        cls = cls.getComponentType();
                        i++;
                    }
                    sb.append(cls.getName());
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    }
                } else {
                    sb.append("UNKNOWN");
                }
                sb.append('[');
                if (this._fieldName != null) {
                    sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    sb.append(this._fieldName);
                    sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                } else {
                    int i2 = this._index;
                    if (i2 >= 0) {
                        sb.append(i2);
                    } else {
                        sb.append('?');
                    }
                }
                sb.append(']');
                this._desc = sb.toString();
            }
            return this._desc;
        }

        public String getFieldName() {
            return this._fieldName;
        }

        @y43
        public Object getFrom() {
            return this._from;
        }

        public int getIndex() {
            return this._index;
        }

        public void setDescription(String str) {
            this._desc = str;
        }

        public void setFieldName(String str) {
            this._fieldName = str;
        }

        public void setIndex(int i) {
            this._index = i;
        }

        public String toString() {
            return getDescription();
        }

        public Object writeReplace() {
            getDescription();
            return this;
        }

        public Reference(Object obj) {
            this._index = -1;
            this._from = obj;
        }

        public Reference(Object obj, String str) {
            this._index = -1;
            this._from = obj;
            if (str != null) {
                this._fieldName = str;
                return;
            }
            throw new NullPointerException("Cannot pass null fieldName");
        }

        public Reference(Object obj, int i) {
            this._from = obj;
            this._index = i;
        }
    }

    @Deprecated
    public JsonMappingException(String str, Throwable th) {
        super(str, th);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str, Throwable th) {
        return new JsonMappingException((Closeable) jsonParser, str, th);
    }

    public static JsonMappingException wrapWithPath(Throwable th, Object obj, int i) {
        return wrapWithPath(th, new Reference(obj, i));
    }

    public StringBuilder getPathReference(StringBuilder sb) {
        _appendPathDesc(sb);
        return sb;
    }

    public void prependPath(Object obj, int i) {
        prependPath(new Reference(obj, i));
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str) {
        return new JsonMappingException((Closeable) jsonGenerator, str, (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.Closeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fasterxml.jackson.databind.JsonMappingException wrapWithPath(java.lang.Throwable r4, com.fasterxml.jackson.databind.JsonMappingException.Reference r5) {
        /*
            boolean r0 = r4 instanceof com.fasterxml.jackson.databind.JsonMappingException
            if (r0 == 0) goto L_0x0007
            com.fasterxml.jackson.databind.JsonMappingException r4 = (com.fasterxml.jackson.databind.JsonMappingException) r4
            goto L_0x004a
        L_0x0007:
            java.lang.String r0 = p000.wf0.m29528o(r4)
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0031
        L_0x0013:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(was "
            r0.append(r1)
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0031:
            r1 = 0
            boolean r2 = r4 instanceof com.fasterxml.jackson.core.JacksonException
            if (r2 == 0) goto L_0x0044
            r2 = r4
            com.fasterxml.jackson.core.JacksonException r2 = (com.fasterxml.jackson.core.JacksonException) r2
            java.lang.Object r2 = r2.getProcessor()
            boolean r3 = r2 instanceof java.io.Closeable
            if (r3 == 0) goto L_0x0044
            r1 = r2
            java.io.Closeable r1 = (java.io.Closeable) r1
        L_0x0044:
            com.fasterxml.jackson.databind.JsonMappingException r2 = new com.fasterxml.jackson.databind.JsonMappingException
            r2.<init>((java.io.Closeable) r1, (java.lang.String) r0, (java.lang.Throwable) r4)
            r4 = r2
        L_0x004a:
            r4.prependPath(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(java.lang.Throwable, com.fasterxml.jackson.databind.JsonMappingException$Reference):com.fasterxml.jackson.databind.JsonMappingException");
    }

    public void prependPath(Reference reference) {
        if (this._path == null) {
            this._path = new LinkedList<>();
        }
        if (this._path.size() < 1000) {
            this._path.addFirst(reference);
        }
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str, Throwable th) {
        return new JsonMappingException((Closeable) jsonGenerator, str, th);
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this._processor = closeable;
        if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).mo13958c0();
        }
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str) {
        return new JsonMappingException((Closeable) deserializationContext.getParser(), str);
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str, Throwable th) {
        return new JsonMappingException((Closeable) deserializationContext.getParser(), str, th);
    }

    public static JsonMappingException from(zw5 zw5, String str) {
        return new JsonMappingException((Closeable) zw5.getGenerator(), str);
    }

    public static JsonMappingException from(zw5 zw5, String str, Throwable th) {
        return new JsonMappingException((Closeable) zw5.getGenerator(), str, th);
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this._processor = closeable;
        if (th instanceof JacksonException) {
            this._location = ((JacksonException) th).getLocation();
        } else if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).mo13958c0();
        }
    }

    public JsonMappingException(Closeable closeable, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
        this._processor = closeable;
    }
}
