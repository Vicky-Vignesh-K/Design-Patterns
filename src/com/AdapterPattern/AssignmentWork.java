package com.AdapterPattern;

public class AssignmentWork {

    private IPen pen;

    public IPen getPen() {
        return pen;
    }

    public void setPen(IPen pen) {
        this.pen = pen;
    }

    public void writeAssignment(String content){
        pen.write(content);
    }

}
