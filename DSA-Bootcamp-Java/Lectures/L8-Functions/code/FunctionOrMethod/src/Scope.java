public class Scope {

    // Note :
    //      -> Anything initialised outside the block can be used/modified inside the block
    //         but -> Anything initialised inside the block cannot be used/modified outside the block

    //      -> Anything initialised outside the block can be initialised inside again inside the block
    //         but -> Anything initialised inside the block can be initialised outside the block
    public static void main(String[] args) {
        // Scope :
        //      -> Method Scope || Function Scope
        //      -> Block Scope || Function Scope
        //      -> Loop Scope || Function Scope
        int a = 10;

    }
    //      -> Method Scope || Function Scope
    static void MethodScope() {
//      System.out.println(a); // Error ; Here we are trying to access var a which is in main function
    }

    //      -> Block Scope || Function Scope
    static void BlockScope(){
        int a = 20;
        System.out.println(a);
        {
            // int a = 20; // When var a is initialised outside the block scope
                        // it cannot be initialised again
            a = 30; // It can be modified
        }
    }

    static void LoopScope() {
        for (int i=0; i<10; i++){
    //      int i = 10; // it cannot be initialised again
            i = 10; // can be modified
        }
    //  System.out.println(i); // When var a is initialised inside the loop
                               // it cannot be accessed outside the scope
    }
}
