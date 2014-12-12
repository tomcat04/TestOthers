/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.others.json;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**
 *
 * @author cgx1844568
 * @date 2014-12-11
 * @time 9:07:06
 *
 */
public class JsonValueProcessorImpl implements JsonValueProcessor {

    private final String format = "yyyy-MM-dd";

    @Override
    public Object processArrayValue(Object value, JsonConfig config) {
        return process(value);
    }

    @Override
    public Object processObjectValue(String key, Object value, JsonConfig config) {
        return process(value);
    }

    private Object process(Object value) {

        if (value instanceof Date) {
            SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.UK);
            return sdf.format(value);
        }
        return value == null ? "" : value.toString();
    }
}
