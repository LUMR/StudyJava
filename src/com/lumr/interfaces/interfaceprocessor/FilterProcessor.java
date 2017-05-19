package com.lumr.interfaces.interfaceprocessor;

import com.lumr.interfaces.filters.BandPass;
import com.lumr.interfaces.filters.HighPass;
import com.lumr.interfaces.filters.LowPass;
import com.lumr.interfaces.filters.Waveform;

/**
 * Created by lumr on 2017/5/19.
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),waveform);
        Apply.process(new FilterAdapter(new HighPass(2.0)),waveform);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),waveform);
    }
}
