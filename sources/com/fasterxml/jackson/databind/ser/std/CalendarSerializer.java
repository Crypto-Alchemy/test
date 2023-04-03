package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;

@zz2
public class CalendarSerializer extends DateTimeSerializerBase<Calendar> {
    public static final CalendarSerializer instance = new CalendarSerializer();

    public CalendarSerializer() {
        this((Boolean) null, (DateFormat) null);
    }

    public CalendarSerializer(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    public long _timestamp(Calendar calendar) {
        if (calendar == null) {
            return 0;
        }
        return calendar.getTimeInMillis();
    }

    public void serialize(Calendar calendar, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (_asTimestamp(zw5)) {
            jsonGenerator.mo13882i0(_timestamp(calendar));
        } else {
            _serializeAsString(calendar.getTime(), jsonGenerator, zw5);
        }
    }

    public CalendarSerializer withFormat(Boolean bool, DateFormat dateFormat) {
        return new CalendarSerializer(bool, dateFormat);
    }
}
