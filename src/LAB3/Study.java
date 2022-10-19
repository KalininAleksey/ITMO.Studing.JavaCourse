package LAB3;


class Study {

    private String course;

    //TODO

    public String printCourse() {
        return this.course;
    }
    public Study (String Course)
    {
        this.course=Course;
    }


}

class JavaProgram {
    public static void main(String[] args) {
        //TODO
        Study study=new Study("Изучение Java - это просто");
        System.out.println(study.printCourse());
    }
}
