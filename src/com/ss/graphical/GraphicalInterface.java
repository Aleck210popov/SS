package com.ss.graphical;

import com.ss.one.Triangle;
import com.ss.two.Arthropod;

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
    public GraphicalInterface(Arthropod arthropod){
        fr = new FrameMain(arthropod);
        fr.setVisible(true);
    }
    public GraphicalInterface(Triangle triangle, Arthropod arthropod){
        fr = new FrameMain(triangle, arthropod);
        fr.setVisible(true);
    }
}
