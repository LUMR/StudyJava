package com.lumr.interfaces.interfaceprocessor;

import com.lumr.interfaces.filters.Filter;
import com.lumr.interfaces.filters.Waveform;

/**
 * Created by lumr on 2017/5/19.
 */
public class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
