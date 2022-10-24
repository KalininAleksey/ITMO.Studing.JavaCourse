package LAB3;


class Study {

    private String course;

    //TODO

    public String printCourse() {

        String course1 = this.course;
        System.out.println(course1);
        return course1;
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
        study.printCourse();
    }
}
