import com.sun.prism.j2d.J2DPipeline;

class Fun {
    public static void main(String[] args) {
        System.out.println("Monday's are the best!!!!!!!");
        sayHi("JEFF");
    }

    //access
        //-can be public, private, or protected
    //static
        //-optional, can be static or dynamic (if not static, write nothing)
    //returntype
        //-type of variable returned
        //-special keyword void means no return type
    //query functions
        //-returns something
    //command function
        //-no return
    //name  -> camelCase description of its job
    //optional list of parameters
        //-always follow format: type name
    public static void sayHi(String name){
        System.out.println("HI! " + name);
    }
}