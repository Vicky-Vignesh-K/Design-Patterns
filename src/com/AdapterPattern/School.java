package com.AdapterPattern;

public class School {

    public static void main(String[] args) {
        IPen pen = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(pen);
        assignmentWork.writeAssignment("Write an Essay on Your Vacation");
    }

}
