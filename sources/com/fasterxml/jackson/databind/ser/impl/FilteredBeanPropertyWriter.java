package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

public abstract class FilteredBeanPropertyWriter {

    public static final class MultiView extends BeanPropertyWriter {
        private static final long serialVersionUID = 1;
        public final BeanPropertyWriter _delegate;
        public final Class<?>[] _views;

        public MultiView(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._views = clsArr;
        }

        /* renamed from: a */
        public final boolean mo16590a(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            for (Class<?> isAssignableFrom : this._views) {
                if (isAssignableFrom.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        public void assignNullSerializer(y63<Object> y63) {
            this._delegate.assignNullSerializer(y63);
        }

        public void assignSerializer(y63<Object> y63) {
            this._delegate.assignSerializer(y63);
        }

        public void depositSchemaProperty(j53 j53, zw5 zw5) throws JsonMappingException {
            if (mo16590a(zw5.getActiveView())) {
                super.depositSchemaProperty(j53, zw5);
            }
        }

        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
            if (mo16590a(zw5.getActiveView())) {
                this._delegate.serializeAsElement(obj, jsonGenerator, zw5);
            } else {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, zw5);
            }
        }

        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
            if (mo16590a(zw5.getActiveView())) {
                this._delegate.serializeAsField(obj, jsonGenerator, zw5);
            } else {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, zw5);
            }
        }

        public MultiView rename(NameTransformer nameTransformer) {
            return new MultiView(this._delegate.rename(nameTransformer), this._views);
        }
    }

    public static final class SingleView extends BeanPropertyWriter {
        private static final long serialVersionUID = 1;
        public final BeanPropertyWriter _delegate;
        public final Class<?> _view;

        public SingleView(BeanPropertyWriter beanPropertyWriter, Class<?> cls) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._view = cls;
        }

        public void assignNullSerializer(y63<Object> y63) {
            this._delegate.assignNullSerializer(y63);
        }

        public void assignSerializer(y63<Object> y63) {
            this._delegate.assignSerializer(y63);
        }

        public void depositSchemaProperty(j53 j53, zw5 zw5) throws JsonMappingException {
            Class<?> activeView = zw5.getActiveView();
            if (activeView == null || this._view.isAssignableFrom(activeView)) {
                super.depositSchemaProperty(j53, zw5);
            }
        }

        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
            Class<?> activeView = zw5.getActiveView();
            if (activeView == null || this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsElement(obj, jsonGenerator, zw5);
            } else {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, zw5);
            }
        }

        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
            Class<?> activeView = zw5.getActiveView();
            if (activeView == null || this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsField(obj, jsonGenerator, zw5);
            } else {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, zw5);
            }
        }

        public SingleView rename(NameTransformer nameTransformer) {
            return new SingleView(this._delegate.rename(nameTransformer), this._view);
        }
    }

    /* renamed from: a */
    public static BeanPropertyWriter m14281a(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        if (clsArr.length == 1) {
            return new SingleView(beanPropertyWriter, clsArr[0]);
        }
        return new MultiView(beanPropertyWriter, clsArr);
    }
}
