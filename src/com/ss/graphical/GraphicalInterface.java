package com.ss.graphical;

import com.ss.one.Triangle;
import com.ss.two.RegionArthropods;

public class GraphicalInterface {
    private final FrameMain fr;
    public GraphicalInterface(){
        fr = new FrameMain();
        fr.setVisible(true);
    }
    public GraphicalInterface(Triangle triangle){
        fr = new FrameMain(triangle);
        fr.setVisible(true);
    }
    public GraphicalInterface(RegionArthropods regionArthropods){
        fr = new FrameMain(regionArthropods);
        fr.setVisible(true);
    }
    public GraphicalInterface(Triangle triangle, RegionArthropods regionArthropods){
        fr = new FrameMain(triangle, regionArthropods);
        fr.setVisible(true);
    }
}
