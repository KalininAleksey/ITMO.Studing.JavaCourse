package LAB3;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;
    public Tree(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public Tree(int age,boolean isAlive,String name)
    {
        this.age=age;
        this.isAlive=isAlive;
        this.name=name;
    }
    public Tree()
    {
        System.out.println("Empty constructor without parameters is worked out");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }
}
class TreeMain {
    public static void main(String[] args) {
        Tree tree1=new Tree(50,"Fir");
        Tree tree2=new Tree(250, false ,"Оак");
        Tree tree3=new Tree();
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}
